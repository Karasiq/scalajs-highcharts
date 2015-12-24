package com.highcharts

import org.scalajs.jquery.JQuery

import scala.scalajs.js

/**
  * Allows calling `$("#container").highcharts({...})` function from ScalaJS
  * @example {{{
  *   import org.scalajs.jquery.jQuery
  *   import com.highcharts.HighchartsJQuery._
  *
  *   jQuery("#container").highcharts(...)
  * }}}
  */
object HighchartsJQuery {
  /**
    * JQuery extension class
    * @param jq JQuery object
    */
  implicit class HighchartsJqueryOps(val jq: JQuery) extends AnyVal {
    def highcharts(config: js.Object): Unit = {
      jq.asInstanceOf[js.Dynamic].highcharts(config)
    }
  }
}
