/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>responsive-rules</code>
  */
class ResponsiveRules extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A full set of chart options to apply as overrides to the general
    * chart options. The chart options are applied when the given rule
    * is active.</p>
    * <p>A special case is configuration objects that take arrays, for example
    * <a href="#xAxis">xAxis</a>, <a href="#yAxis">yAxis</a> or <a href="#series">series</a>. For these
    * collections, an <code>id</code> option is used to map the new option set to
    * an existing object. If an existing object of the same id is not found,
    * the item of the same indexupdated. So for example, setting <code>chartOptions</code>
    * with two series items without an <code>id</code>, will cause the existing chart&#39;s
    * two series to be updated with respective options.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/responsive/">Stock chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/">Axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/legend/">Legend</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/classname/">Class name</a>
    * @since 5.0.0
    */
  var chartOptions: js.Any = js.undefined

  /**
    * <p>Under which conditions the rule applies.</p>
    * @since 5.0.0
    */
  var condition: js.Any = js.undefined
}

object ResponsiveRules {
  /**
    * @param chartOptions <p>A full set of chart options to apply as overrides to the general. chart options. The chart options are applied when the given rule. is active.</p>. <p>A special case is configuration objects that take arrays, for example. <a href="#xAxis">xAxis</a>, <a href="#yAxis">yAxis</a> or <a href="#series">series</a>. For these. collections, an <code>id</code> option is used to map the new option set to. an existing object. If an existing object of the same id is not found,. the item of the same indexupdated. So for example, setting <code>chartOptions</code>. with two series items without an <code>id</code>, will cause the existing chart&#39;s. two series to be updated with respective options.</p>
    * @param condition <p>Under which conditions the rule applies.</p>
    */
  def apply(chartOptions: js.UndefOr[js.Any] = js.undefined, condition: js.UndefOr[js.Any] = js.undefined): ResponsiveRules = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ResponsiveRules {
      this.chartOptions = chartOptions
      this.condition = condition
    })
  }
}
