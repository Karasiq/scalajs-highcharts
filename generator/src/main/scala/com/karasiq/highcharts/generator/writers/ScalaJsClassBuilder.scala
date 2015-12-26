package com.karasiq.highcharts.generator.writers

import com.karasiq.highcharts.generator.ConfigurationObject
import com.karasiq.highcharts.generator.ast.{ScalaJsClass, ScalaJsDefinition, ScalaJsMethod, ScalaJsValue}
import org.apache.commons.lang3.StringEscapeUtils

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
    val array = """Array<(.+)>""".r

    val selfTypeObject: PartialFunction[String, String] = {
      case "" | "Object" if selfClass.nonEmpty ⇒
//        println(selfClass)
        s"CleanJsObject[${selfClass.get}]"
    }

    def stdTypes: PartialFunction[String, String] = selfTypeObject.orElse {
      case "String" | "Color" ⇒
        "String"

      case "Function" ⇒
        "js.Function"

      case "CSSObject" | "Object" ⇒
        "js.Object"

      case "Number" ⇒
        "Double"

      case "Boolean" ⇒
        "Boolean"

      case array(t) ⇒
        val tpe: String = if (stdTypes.isDefinedAt(t)) {
          stdTypes(t)
        } else if (selfClass.nonEmpty) {
          selfClass.get
        } else {
          "js.Any"
        }
        s"js.Array[$tpe]"

      case "Array" ⇒
        "js.Array[js.Any]"

      case t if t.contains("|") ⇒ // Union type
        val tokens: Array[String] = t.split("\\|")
          .map(_.trim)
          .filter(_.nonEmpty)
          .collect(stdTypes)
        ScalaJsClassBuilder.unionType(tokens.toList)

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
      } else if (cfg.returnType.exists(_.contains("String")) || scalaType == "String") {
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
    val defaultValue = if (cfg.title.contains("type") && cfg.returnType.contains("String") && cfg.defaults.isEmpty) {
      val compoundValueName = "(\\w+)<(\\w+)>".r
      cfg.parent.collect {
        case compoundValueName(baseName, typeArg) ⇒
          wrapString(typeArg)
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