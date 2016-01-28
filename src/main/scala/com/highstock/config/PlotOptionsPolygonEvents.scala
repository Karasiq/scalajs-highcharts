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
  * @note JavaScript name: <code>plotOptions-polygon-events</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsPolygonEvents extends js.Object {

  /**
    * Fires after the series has finished its initial animation, or in case animation is disabled, immediately as the series is displayed.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-events-afteranimate/" target="_blank">Show label after animate</a>
    * @since 2.0
    */
  val afterAnimate: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the checkbox next to the series' name in the legend is clicked. One parameter, <code>event</code>, is passed to the function. The state of the checkbox is found by <code>event.checked</code>. The checked item is found by <code>event.item</code>. Return <code>false</code> to prevent the default action which is to toggle the select state of the series.
    */
  val checkboxClick: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the series is clicked. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. Additionally, <code>event.point</code> holds a pointer to the nearest point on the graph.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/series-events-click/" target="_blank">Alert click info</a>
    */
  val click: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the series is hidden after chart generation time, either by clicking the legend item or by calling <code>.hide()</code>.
    */
  val hide: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the legend item belonging to the series is clicked. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. The default action is to toggle the visibility of the series. This can be prevented by returning <code>false</code> or calling <code>event.preventDefault()</code>.
    */
  val legendItemClick: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the mouse leaves the graph. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. If the  <a class="internal" href="#plotOptions.series">stickyTracking</a> option is true, <code>mouseOut</code> doesn't happen before the mouse enters another graph or leaves the plot area.
    */
  val mouseOut: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the mouse enters the graph. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    */
  val mouseOver: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the series is shown after chart generation time, either by clicking the legend item or by calling <code>.show()</code>.
    */
  val show: js.UndefOr[js.Function] = js.undefined
}
