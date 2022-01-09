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
  * @note JavaScript name: <code>plotOptions-supertrend-changeTrendLine-styles</code>
  */
class PlotOptionsSupertrendChangeTrendLineStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The dash or dot style of the grid lines. For possible
    * values, see
    * <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinedashstyle/">Long dashes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/gridlinedashstyle/">Long dashes</a>
    * @since 7.0.0
    */
  var dashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Color of the line.</p>
    * @since 7.0.0
    */
  var lineColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Pixel width of the line.</p>
    * @since 7.0.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object PlotOptionsSupertrendChangeTrendLineStyles {
  /**
    * @param dashStyle <p>The dash or dot style of the grid lines. For possible. values, see. <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.</p>
    * @param lineColor <p>Color of the line.</p>
    * @param lineWidth <p>Pixel width of the line.</p>
    */
  def apply(dashStyle: js.UndefOr[String] = js.undefined, lineColor: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined): PlotOptionsSupertrendChangeTrendLineStyles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSupertrendChangeTrendLineStyles {
      this.dashStyle = dashStyle
      this.lineColor = lineColor
      this.lineWidth = lineWidth
    })
  }
}
