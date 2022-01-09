package com.karasiq.highcharts.generator.writers

import scala.annotation.tailrec

import org.apache.commons.lang3.StringEscapeUtils

import com.karasiq.highcharts.generator.ConfigurationObject
import com.karasiq.highcharts.generator.ast.{ScalaJsClass, ScalaJsDefinition, ScalaJsMethod, ScalaJsValue}

object ScalaJsClassBuilder {
  def classNameFor(jsName: String): String = {
    jsName
      .split("[-<>\\.]")
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
      // s"js.`|`[$type1, $type2]"
      s"$type1 | $type2"

    case type1 :: ts ⇒
      // s"js.`|`[$type1, ${unionType(ts)}]"
      s"$type1 | ${unionType(ts)}"
  }
}

class ScalaJsClassBuilder {
  private def scalaType(classes: Set[String], tpe: Option[String], selfClass: Option[String] = None): Option[String] = {

    object AltType {
      @tailrec def parseTypeRec(
          str: Seq[Char],
          parentheses: Int = 0,
          splitter: Option[Char] = None,
          token: String = "",
          result: Seq[String] = Nil
      ): Option[(Char, Seq[String])] = str match {
        case ('(' | '<') +: rest ⇒
          parseTypeRec(rest, parentheses + 1, splitter, token + '<', result)

        case (')' | '>') +: rest ⇒
          if (parentheses < 1) None
          else parseTypeRec(rest, parentheses - 1, splitter, token + '>', result)

        case (char @ (',' | '|')) +: rest ⇒
          if (splitter.forall(_ == char) && parentheses == 0)
            parseTypeRec(rest, parentheses, Some(char), "", result :+ token)
          else
            parseTypeRec(rest, parentheses, splitter, token + char, result)

        case char +: rest ⇒ parseTypeRec(rest, parentheses, splitter, token + char, result)
        case Nil          ⇒ splitter.map((_, result :+ token))
      }
    }

    object Prefixed {
      def unapplySeq(s: String): Option[Seq[String]] = {
        if (s.contains(".")) Some(s.split('.')) else None
      }
    }

    object Tuple {
      def unapplySeq(t: String): Option[Seq[String]] = {
        val t1 = if (t.startsWith("(") && t.endsWith(")")) t.drop(1).dropRight(1) else t
        if (t1.contains(", ")) {
          val parsed = AltType.parseTypeRec(t1)
          parsed.collect { case (',', tokens) ⇒
            tokens.map(_.trim)
          }
        } else None
      }
    }

    object Union {
      def unapplySeq(t: String): Option[Seq[String]] = {
        val t1     = if (t.startsWith("(") && t.endsWith(")")) t.drop(1).dropRight(1) else t
        val parsed = AltType.parseTypeRec(t1)
        parsed.collect { case ('|', tokens) ⇒
          tokens.map(_.trim)
        }
      }
    }

    object TypedStruct {
      private[this] val prefix = "^([\\w.]+)\\.<".r

      def unapply(str: String): Option[(String, String)] = {
        @tailrec def parseTypeRec(str: Seq[Char], parentheses: Int = 1, result: StringBuilder = new StringBuilder): Option[String] = str match {
          case Nil                            ⇒ None
          case _ if parentheses == 0          ⇒ None
          case '>' +: Nil if parentheses == 1 ⇒ Some(result.result())
          case '>' +: rest                    ⇒ parseTypeRec(rest, parentheses - 1, result += '>')
          case '<' +: rest                    ⇒ parseTypeRec(rest, parentheses + 1, result += '<')
          case char +: rest                   ⇒ parseTypeRec(rest, parentheses, result += char)
        }

        prefix.findFirstMatchIn(str) match {
          case Some(m) ⇒ parseTypeRec(str.drop(m.group(0).length)).map((m.group(1), _))
          case None    ⇒ None
        }
      }
    }

    val selfTypeObject: PartialFunction[String, String] = {
      case "" | "Object" if selfClass.nonEmpty ⇒
        // println(selfClass)
        s"CleanJsObject[${selfClass.get}]"
    }

    val strTypes = Set(
      "DataGroupingApproximationValue",
      "DataGroupingAnchorExtremes",
      "DataGroupingAnchor",
      "SymbolKeyValue",
      "AlignValue",
      "VerticalAlignValue",
      "TooltipShapeValue",
      "CursorValue",
      "DashStyleValue",
      "ColorAxisTypeValue",
      "SymbolKeyValue",
      "ColorString"
    )

    val objTypes = Set(
      "CSSObject",
      "SVGAttributes",
      "AnimationOptionsObject",
      "GradientColorObject",
      "PatternObject",
      "ShadowOptionsObject",
      "SeriesNetworkgraphDataLabelsOptionsObject",
      "SeriesOptionsType",
      "CurrentDateIndicatorOptions",
      "SeriesSunburstDataLabelsOptionsObject",
      "GeoJSON",
      "AnnotationMockPointOptionsObject",
      "SeriesOrganizationDataLabelsOptionsObject",
      "SeriesSankeyDataLabelsOptionsObject",
      "SeriesPackedBubbleDataLabelsOptionsObject"
    )

    def stdTypes: PartialFunction[String, String] = selfTypeObject.orElse {
      case "*" ⇒
        "js.Any"

      case "Color" | "color" ⇒
        "String | js.Object"

      case "String" | "string" ⇒
        "String"

      case quoted if quoted.startsWith("\"") && quoted.endsWith("\"") ⇒
        "String"

      case strType if strTypes.contains(strType) ⇒
        "String"

      case Prefixed("Highcharts", strType) if strTypes.contains(strType) ⇒
        "String"

      case "Function" | "function" | Prefixed("Highcharts", "AnnotationMockPointFunction") ⇒
        "js.Function"

      case "CSSObject" | "Object" | "object" ⇒
        "js.Object"

      case objType if objTypes.contains(objType) ⇒
        "js.Object"

      case Prefixed("Highcharts", objType) if objTypes.contains(objType) ⇒
        "js.Object"

      case Prefixed("Highcharts", "Dictionary") | Prefixed("Highcharts", "Dictionary", _) ⇒
        "js.Object"

      case "HTMLDOMElement" | Prefixed("Highcharts", "HTMLDOMElement") | Prefixed("global", "HTMLElement") ⇒
        "dom.Element"

      case "Number" | "number" ⇒
        "Double"

      case "Boolean" | "boolean" ⇒
        "Boolean"

      case "Mixed" | "*" ⇒
        "js.Any"

      case "null" ⇒
        "Null"

      case TypedStruct("Array", t) ⇒
        // println("Array " + t)
        val tpe: String = if (stdTypes.isDefinedAt(t)) {
          stdTypes(t)
        } else if (selfClass.nonEmpty) {
          selfClass.get
        } else {
          "js.Any"
        }
        s"js.Array[$tpe]"

      case TypedStruct("Partial", t) ⇒
        if (stdTypes.isDefinedAt(t)) {
          stdTypes(t)
        } else if (selfClass.nonEmpty) {
          selfClass.get
        } else {
          "js.Any"
        }

      case TypedStruct(t, _) ⇒
        if (stdTypes.isDefinedAt(t)) {
          stdTypes(t)
        } else {
          "js.Any"
        }

      case "Array" | "array" ⇒
        "js.Array[js.Any]"

      case Tuple(_*) ⇒
        // TODO: Typed array?
        "js.Array[js.Any]"

      case Union(tokens @ _*) ⇒ // Union type
        tokens match {
          case tokens if tokens.contains("undefined") ⇒
            val tokens1    = tokens.filterNot(_ == "undefined")
            val recognized = tokens1.collect(stdTypes)
            if (recognized.length != tokens1.length) println(tokens1)
            s"js.UndefOr[${ScalaJsClassBuilder.unionType(recognized.toList.distinct)}]"

          case tokens ⇒
            val recognized = tokens.collect(stdTypes)
            if (recognized.length != tokens.length) println(tokens)
            ScalaJsClassBuilder.unionType(recognized.toList.distinct)
        }

      case Prefixed("Highcharts", t) if classes.contains(ScalaJsClassBuilder.classNameFor(t)) ⇒
        s"CleanJsObject[${ScalaJsClassBuilder.classNameFor(t)}]"

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
    val jsParams: Seq[String] = cfg.params
      .map(_.replaceAll("[\\(\\)\\[\\]]", ""))
      .toSeq
      .flatMap(_.split(", "))
      .filter(_.nonEmpty)

    val params: Seq[(String, String)] = for (jsParam ← jsParams) yield {
      val (tpe, name) = jsParam.split(" ", 2) match {
        case Array(jsType, jsName) ⇒
          scalaType(classes, Some(jsType)).getOrElse("js.Any") → jsName

        case Array(jsName) ⇒
          "js.Any" → jsName
      }
      tpe → name
    }

    for ((scalaType, scalaName) ← params) yield ScalaJsValue(cfg, scalaName, scalaType, None)
  }

  def parse(configObjects: Seq[ConfigurationObject], rootObject: Option[String] = None): Seq[ScalaJsClass] = {
    // Class -> definitions map
    val byClass = configObjects.groupBy(_.parent.orElse(rootObject).getOrElse(""))

    // Class table
    val classNames = byClass.keys.map(ScalaJsClassBuilder.classNameFor).filter(_.nonEmpty).toSet

    // Classes AST
    for ((jsClassName, parameters) ← byClass.toSeq if jsClassName.nonEmpty) yield {
      // Scala class name
      val className: String = ScalaJsClassBuilder.classNameFor(jsClassName)

      // Scala class definitions
      val definitions: Seq[ScalaJsDefinition] = for (cfg ← parameters; name ← cfg.title) yield {
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
