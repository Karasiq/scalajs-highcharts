/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>responsive-rules</code>
  */
@js.annotation.ScalaJSDefined
class ResponsiveRules extends js.Object {

  /**
    * <p>A full set of chart options to apply as overrides to the general chart options. The chart options are applied when the given rule is active.</p>
    * 
    * <p>A special case is configuration objects that take arrays, for example <a href="#xAxis">xAxis</a>, <a href="#yAxis">yAxis</a> or <a href="#series">series</a>. For these collections, an <code>id</code> option is used to map the new option set to an existing object. If an existing object of the same id is not found, the item of the same indexupdated. So for example, setting <code>chartOptions</code> with two series items without an <code>id</code>, will cause the existing chart's two series to be updated with respective options.</p>
    * @example Chart options overrides for <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/" target="_blank">axis</a>, <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/legend/" target="_blank">legend</a> and <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/classname/" target="_blank">class name</a>.
    * @since 5.0.0
    */
  val chartOptions: js.UndefOr[js.Object] = js.undefined

  /**
    * Under which conditions the rule applies.
    * @since 5.0.0
    */
  val condition: js.UndefOr[CleanJsObject[ResponsiveRulesCondition]] = js.undefined
}

object ResponsiveRules {
  /**
    * @param chartOptions <p>A full set of chart options to apply as overrides to the general chart options. The chart options are applied when the given rule is active.</p>. . <p>A special case is configuration objects that take arrays, for example <a href="#xAxis">xAxis</a>, <a href="#yAxis">yAxis</a> or <a href="#series">series</a>. For these collections, an <code>id</code> option is used to map the new option set to an existing object. If an existing object of the same id is not found, the item of the same indexupdated. So for example, setting <code>chartOptions</code> with two series items without an <code>id</code>, will cause the existing chart's two series to be updated with respective options.</p>
    * @param condition Under which conditions the rule applies.
    */
  def apply(chartOptions: js.UndefOr[js.Object] = js.undefined, condition: js.UndefOr[CleanJsObject[ResponsiveRulesCondition]] = js.undefined): ResponsiveRules = {
    val chartOptionsOuter: js.UndefOr[js.Object] = chartOptions
    val conditionOuter: js.UndefOr[CleanJsObject[ResponsiveRulesCondition]] = condition
    new ResponsiveRules {
      override val chartOptions: js.UndefOr[js.Object] = chartOptionsOuter
      override val condition: js.UndefOr[CleanJsObject[ResponsiveRulesCondition]] = conditionOuter
    }
  }
}
