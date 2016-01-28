package com.highcharts

import com.highcharts.config._
import org.scalajs.jquery.JQuery

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.{UndefOr, `|`}
import scala.util.Try

object HighchartsUtils extends HighchartsImplicits {
  /**
    * Allows calling `$("#container").highcharts({...})` function from ScalaJS
    *
    * @example {{{
    *   import org.scalajs.jquery.jQuery
    *   import com.highcharts.HighchartsUtils._
    *
    *   jQuery("#container").highcharts(...)
    * }}}
    */
  implicit class HighchartsJQuery(val jq: JQuery) extends AnyVal {
    def highcharts[T <: js.Object](chartType: String, config: CleanJsObject[T]): JQuery = {
      jq.asInstanceOf[js.Dynamic].highcharts(chartType, config).asInstanceOf[JQuery]
    }

    def highcharts[T <: js.Object](config: CleanJsObject[T]): JQuery = {
      jq.asInstanceOf[js.Dynamic].highcharts(config).asInstanceOf[JQuery]
    }

    def highcharts(): UndefOr[com.highcharts.api.Chart] = {
      jq.asInstanceOf[js.Dynamic].highcharts().asInstanceOf[UndefOr[com.highcharts.api.Chart]]
    }

    def highstock[T <: js.Object](config: CleanJsObject[T]): JQuery = {
      this.highcharts("StockChart", config)
    }

    def highmaps[T <: js.Object](config: CleanJsObject[T]): JQuery = {
      this.highcharts("Map", config)
    }
  }

  def HighchartsDefaults: HighchartsConfig = js.Dynamic.global.Highcharts.getOptions().asInstanceOf[HighchartsConfig]

  def mkColor(color: String): js.Dynamic = js.Dynamic.global.Highcharts.Color(color)

  def defaultColor(index: Int): String = HighchartsDefaults.colors.get(index).asInstanceOf[String]

  /**
    * @see [[http://www.highcharts.com/docs/chart-design-and-style/themes]]
    */
  def fromHighchartsTheme[T](default: ⇒ T)(f: js.Dynamic ⇒ T | js.Dynamic): T = {
    Try(f(js.Dynamic.global.Highcharts.theme))
      .filter(v ⇒ !js.isUndefined(v))
      .getOrElse(default).asInstanceOf[T]
  }
}
