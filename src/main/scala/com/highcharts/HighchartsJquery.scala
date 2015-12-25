package com.highcharts

import org.scalajs.jquery.JQuery

import scala.language.implicitConversions
import scala.scalajs.js

@js.native
trait HighchartsJQuery extends js.Object {
  def highcharts(config: js.Object): Unit = js.native
}

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
  implicit def highchartsJQuery(jq: JQuery): HighchartsJQuery = {
    jq.asInstanceOf[HighchartsJQuery]
  }
}
