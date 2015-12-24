/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.0 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class PlotOptionsSplineEvents extends js.Object {
  
  /**
   * Fires after the series has finished its initial animation, or in case animation is disabled, immediately as the series is displayed.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-events-afteranimate/" target="_blank">Show label after animate</a>
   * @since 4.0
   */
  var afterAnimate: UndefOr[js.Function] = js.undefined
  
  /**
   * Fires when the checkbox next to the series' name in the legend is clicked. One parameter, <code>event</code>, is passed to the function. The state of the checkbox is found by <code>event.checked</code>. The checked item is found by <code>event.item</code>. Return <code>false</code> to prevent the default action which is to toggle the select state of the series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-events-checkboxclick/" target="_blank">Alert checkbox status</a>
   * @since 1.2.0
   */
  var checkboxClick: UndefOr[js.Function] = js.undefined
  
  /**
   * Fires when the series is clicked. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. Additionally, <code>event.point</code> holds a pointer to the nearest point on the graph.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-events-click/" target="_blank">Alert click info</a>
   */
  var click: UndefOr[js.Function] = js.undefined
  
  /**
   * Fires when the series is hidden after chart generation time, either by clicking the legend item or by calling <code>.hide()</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-events-hide/" target="_blank">Alert when the series is hidden by clicking 
			the legend item</a>
   * @since 1.2.0
   */
  var hide: UndefOr[js.Function] = js.undefined
  
  /**
   * Fires when the legend item belonging to the series is clicked. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. The default action is to toggle the visibility of the series. This can be prevented by returning <code>false</code> or calling <code>event.preventDefault()</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-events-legenditemclick/" target="_blank">Confirm hiding and showing</a>
   */
  var legendItemClick: UndefOr[js.Function] = js.undefined
  
  /**
   * Fires when the mouse leaves the graph. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. If the  <a class="internal" href="#plotOptions.series">stickyTracking</a> option is true, <code>mouseOut</code> doesn't happen before the mouse enters another graph or leaves the plot area.
   * @example Log mouse over and out <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-events-mouseover-sticky/" target="_blank">with sticky tracking
			by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-events-mouseover-no-sticky/" target="_blank">without sticky tracking</a>
   */
  var mouseOut: UndefOr[js.Function] = js.undefined
  
  /**
   * Fires when the mouse enters the graph. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
   * @example Log mouse over and out <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-events-mouseover-sticky/" target="_blank">with sticky tracking
			by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-events-mouseover-no-sticky/" target="_blank">without sticky tracking</a>
   */
  var mouseOver: UndefOr[js.Function] = js.undefined
  
  /**
   * Fires when the series is shown after chart generation time, either by clicking the legend item or by calling <code>.show()</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-events-show/" target="_blank">Alert when the series is shown by clicking 
			the legend item.</a>
   * @since 1.2.0
   */
  var show: UndefOr[js.Function] = js.undefined
}
