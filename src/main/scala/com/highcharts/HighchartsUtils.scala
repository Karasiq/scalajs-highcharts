package com.highcharts

import org.scalajs.jquery.JQuery

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.{UndefOr, `|`}

object HighchartsUtils extends HighchartsImplicits {
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

    def highcharts(): UndefOr[com.highcharts.api.Chart] = {
      jq.asInstanceOf[js.Dynamic].highcharts().asInstanceOf[UndefOr[com.highcharts.api.Chart]]
    }
  }

  def mkSeries[T <: js.Object](obj: js.Object*): UndefOr[js.Array[T]] = {
    import js.JSConverters._
    UndefOr.any2undefOrA(obj.map(CleanJsObject.apply).toJSArray.asInstanceOf[js.Array[T]])
  }

  type Cfg[T <: js.Object] = UndefOr[CleanJsObject[T]]
  type SeriesCfg = js.UndefOr[js.Array[com.highcharts.config.Series]]
  type SeriesCfgData[T <: js.Object] = js.UndefOr[js.Array[CleanJsObject[T] | js.Array[js.Any] | Double]]
  type CategoriesCfg = js.UndefOr[js.Array[String]]
}
