package com.karasiq.highcharts.generator.writers

import scala.annotation.tailrec

import org.apache.commons.lang3.StringEscapeUtils

import com.karasiq.highcharts.generator.ConfigurationObject
import com.karasiq.highcharts.generator.ast.{ScalaJsClass, ScalaJsDefinition, ScalaJsMethod, ScalaJsValue}

object ScalaJsClassBuilder {
  def classNameFor(jsName: String): String = {
    jsName.split("[-<>\\.]")
      .filter(_.nonEmpty)
      .map(str ⇒ str.head.toUpper + str.tail)
      .mkString
  }

  def escapeString(str: String): String = {
    "\"" + StringEscapeUtils.escapeJava(str) + "\""
  }

  def unionType(types: List[String]): String = types match {
    case Nil ⇒
      throw new IllegalArgumentException

    case type1 :: Nil ⇒
      type1

    case type1 :: type2 :: Nil ⇒
      //s"js.`|`[$type1, $type2]"
      s"$type1 | $type2"

    case type1 :: ts ⇒
      //s"js.`|`[$type1, ${unionType(ts)}]"
      s"$type1 | ${unionType(ts)}"
  }
}

class ScalaJsClassBuilder {
  private def scalaType(classes: Set[String], tpe: Option[String], selfClass: Option[String] = None): Option[String] = {

    object Prefixed {
      def unapplySeq(s: String): Option[Seq[String]] = {
        Some(s.split('.'))
      }
    }

    object Union {
      def unapplySeq(t: String): Option[Seq[String]] = {
        val t1 = if (t.startsWith("(") && t.endsWith(")")) t.drop(1).dropRight(1) else t
        val tokens: Array[String] = t1.split('|')
          .map(_.trim)
          .filter(_.nonEmpty)

        if (tokens.length > 1) Some(tokens.toSeq) else None
      }
    }
    
    // val array = """^Array\.<(.+?)>$""".r
    object TypedArray {
      def unapply(str: String): Option[String] = {
        @tailrec def parseTypeRec(str: Seq[Char], parentheses: Int = 1, result: StringBuilder = new StringBuilder): Option[String] = str match {
          case Nil ⇒ None
          case _ if parentheses == 0 ⇒ None
          case '>' +: Nil if parentheses == 1 ⇒ Some(result.result())
          case '>' +: rest ⇒ parseTypeRec(rest, parentheses - 1, result += '>')
          case '<' +: rest ⇒ parseTypeRec(rest, parentheses + 1, result += '<')
          case char +: rest ⇒ parseTypeRec(rest, parentheses, result += char)
        }

        val prefix = "Array.<"
        if (!str.startsWith(prefix)) None else parseTypeRec(str.drop(prefix.length))
      }
    }


    val selfTypeObject: PartialFunction[String, String] = {
      case "" | "Object" if selfClass.nonEmpty ⇒
        // println(selfClass)
        s"CleanJsObject[${selfClass.get}]"
    }

    def stdTypes: PartialFunction[String, String] = selfTypeObject.orElse {
      case "Color" | "color" | Prefixed("Highcharts", "ColorString") ⇒
        "String | js.Object"

      case "String" | "string" ⇒
        "String"

      case "Function" | "function" ⇒
        "js.Function"

      case "CSSObject" | "Object" | "object" | Prefixed("Highcharts", "CSSObject" | "SVGAttributes" | "AnimationOptionsObject") ⇒
        "js.Object"

      case Prefixed("Highcharts", "Dictionary") | Prefixed("Highcharts", "Dictionary", _) ⇒
        "js.Object"

      case "Number" | "number" ⇒
        "Double"

      case "Boolean" | "boolean" ⇒
        "Boolean"

      case "Mixed" | "*" ⇒
        "js.Any"

      case "null" ⇒
        "Null"

      case TypedArray(t) ⇒
        // println("Array " + t)
        val tpe: String = if (stdTypes.isDefinedAt(t)) {
          stdTypes(t)
        } else if (selfClass.nonEmpty) {
          selfClass.get
        } else {
          "js.Any"
        }
        s"js.Array[$tpe]"

      case "Array" | "array" ⇒
        "js.Array[js.Any]"

      case Union(tokens @ _*) ⇒ // Union type
        val recognized = tokens.collect(stdTypes)
        // println(t + " " + tokens.toList)
        ScalaJsClassBuilder.unionType(recognized.toList)

      // case Prefixed("Highcharts", t) if classes.contains(ScalaJsClassBuilder.classNameFor(t)) ⇒
      //  s"CleanJsObject[${ScalaJsClassBuilder.classNameFor(t)}]"

      case t if t.nonEmpty && classes.contains(ScalaJsClassBuilder.classNameFor(t)) ⇒
        s"CleanJsObject[${ScalaJsClassBuilder.classNameFor(t)}]"
    }

    val selfTypeArray: PartialFunction[String, String] = {
      case "Array" if selfClass.nonEmpty ⇒
        s"js.Array[CleanJsObject[${selfClass.get}]]"
    }

    tpe.orElse(Some("")).collect(selfTypeArray.orElse(stdTypes))
  }

  private def cfgScalaType(classes: Set[String], cfg: ConfigurationObject): Option[String] = {
    val selfClass: Option[String] = cfg.fullName
      .map(ScalaJsClassBuilder.classNameFor)
      .filter(classes.contains)

    scalaType(classes, cfg.returnType, selfClass)
  }

  private def typeAndValue(classes: Set[String], cfg: ConfigurationObject): (String, Option[String]) = {
    def isMethod: Boolean = cfg.params.exists(_.nonEmpty)

    val scalaType: String = cfgScalaType(classes, cfg).getOrElse {
      if (isMethod) "Unit"
      else "js.Any"
    }

    def wrapString(value: String): String = {
      if (value.trim == "null") {
        // Null value
        s"null.asInstanceOf[$scalaType]"
      } else if (cfg.returnType.exists(_.toLowerCase.contains("string")) || scalaType == "String") {
        // String literal
        ScalaJsClassBuilder.escapeString(value)
      } else {
        // Other
        value
      }
    }

    /* def extractValue(defaults: Option[String]): Option[String] = defaults match {
      case _ if isMethod ⇒
        // Method
        None

      case Some(array) if array.startsWith("[") && array.endsWith("]") ⇒
        // Parse JS array value
        Some(s"js.Array(${array.drop(1).dropRight(1)})")

      case Some(obj) if obj.startsWith("{") && obj.endsWith("}") && scalaType == "js.Object" ⇒
        // Parse object
        Some(s"js.JSON.parse(${ScalaJsClassBuilder.escapeString(obj)}).asInstanceOf[$scalaType]")

      case Some("") if scalaType == "String" ⇒
        // Empty string
        Some("\"\"")

      case Some(default) if default != "undefined" && default.nonEmpty ⇒
        Some(wrapString(default))

      case _ ⇒
        None
    } */

    // Extract `type` field
    def isTypeField =
      cfg.title.contains("type") &&
      cfg.returnType.map(_.toLowerCase).contains("string")

    val defaultValue = if (isTypeField) {
      cfg.defaults
        .map(wrapString)
        .orElse {
          val CompoundValueName = "(\\w+)<(\\w+)>".r
          cfg.parent.collect { case CompoundValueName(_, typeArg) ⇒ wrapString(typeArg) }
        }
    } else {
      None
    }

    scalaType → defaultValue
  }

  private def methodArguments(classes: Set[String], cfg: ConfigurationObject): Seq[ScalaJsValue] = {
    val jsParams: Seq[String] = cfg.params.map(_.replaceAll("[\\(\\)\\[\\]]", ""))
      .toSeq.flatMap(_.split(", "))
      .filter(_.nonEmpty)

    val params: Seq[(String, String)] = for (jsParam <- jsParams) yield {
      val (tpe, name) = jsParam.split(" ", 2) match {
        case Array(jsType, jsName) ⇒
          scalaType(classes, Some(jsType)).getOrElse("js.Any") → jsName

        case Array(jsName) ⇒
          "js.Any" → jsName
      }
      tpe → name
    }

    for ((scalaType, scalaName) <- params) yield
      ScalaJsValue(cfg, scalaName, scalaType, None)
  }

  def parse(configObjects: Seq[ConfigurationObject], rootObject: Option[String] = None): Seq[ScalaJsClass] = {
    // Class -> definitions map
    val byClass = configObjects.groupBy(_.parent.orElse(rootObject).getOrElse(""))

    // Class table
    val classNames = byClass.keys.map(ScalaJsClassBuilder.classNameFor).filter(_.nonEmpty).toSet

    // Classes AST
    for ((jsClassName, parameters) <- byClass.toSeq if jsClassName.nonEmpty) yield {
      // Scala class name
      val className: String = ScalaJsClassBuilder.classNameFor(jsClassName)

      // Scala class definitions
      val definitions: Seq[ScalaJsDefinition] = for (cfg <- parameters; name <- cfg.title) yield {
        val (tpe, value) = this.typeAndValue(classNames, cfg)
        if (cfg.params.exists(_.nonEmpty)) {
          ScalaJsMethod(cfg, name, tpe, methodArguments(classNames, cfg))
        } else {
          ScalaJsValue(cfg, name, tpe, value)
        }
      }

      ScalaJsClass(jsClassName, className, definitions)
    }
  }
}