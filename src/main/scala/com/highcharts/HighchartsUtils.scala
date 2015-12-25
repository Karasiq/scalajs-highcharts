package com.highcharts

import org.scalajs.jquery.JQuery

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSExport

@js.native
trait CleanJsObject[T <: js.Object] extends js.Object

@JSExport
object HighchartsUtils {
  /**
    * Allows calling `$("#container").highcharts({...})` function from ScalaJS
    * @example {{{
    *   import org.scalajs.jquery.jQuery
    *   import com.highcharts.HighchartsUtils._
    *
    *   jQuery("#container").highcharts(...)
    * }}}
    */
  implicit class HighchartsJQuery(val jq: JQuery) extends AnyVal {
    def highcharts[T <: js.Object](config: CleanJsObject[T]): Unit = {
      jq.asInstanceOf[js.Dynamic].highcharts(config)
    }
  }

  @JSExport
  def cleanObject(v: js.Object): js.Object = v match {
    case null ⇒
      null

    case und if js.isUndefined(und) ⇒
      js.undefined.asInstanceOf[js.Object]

    case obj ⇒
      val newObj: js.Object = new js.Object()

      def cleanProperty(p: js.Any): js.Any = p match {
        case array if js.Array.isArray(array) ⇒
          array.asInstanceOf[js.Array[js.Any]]
            .filterNot(js.isUndefined)
            .map(cleanProperty)

//        case subObj if js.typeOf(subObj) == "object" ⇒
//          cleanObject(subObj.asInstanceOf[js.Object])

        case newValue ⇒
          newValue
      }


      val properties = js.Object.keys(obj)
        .filterNot(key ⇒ js.isUndefined(obj.asInstanceOf[js.Dynamic].selectDynamic(key)))
        .map(key ⇒ key → cleanProperty(obj.asInstanceOf[js.Dynamic].selectDynamic(key)))

      properties.foreach { case (key, value) ⇒
        newObj.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      }
      newObj
  }

  implicit def highchartsUndefOrCleanObject[T <: js.Object](obj: T): UndefOr[CleanJsObject[T]] = {
    cleanObject(obj).asInstanceOf[CleanJsObject[T]]
  }

  implicit def highchartsCleanObject[T <: js.Object](obj: T): CleanJsObject[T] = {
    cleanObject(obj).asInstanceOf[CleanJsObject[T]]
  }

  implicit def highchartsPlainObject[T <: js.Object](obj: CleanJsObject[T]): T = {
    obj.asInstanceOf[T]
  }

  def mkSeries[T <: js.Object](obj: T*): js.Array[T] = {
    import js.JSConverters._
    obj.map(cleanObject).toJSArray.asInstanceOf[js.Array[T]]
  }

  type Cfg[T <: js.Object] = UndefOr[CleanJsObject[T]]
  type SeriesCfg = js.UndefOr[js.Array[js.Object]]
  type CategoriesCfg = js.UndefOr[js.Array[String]]
}
