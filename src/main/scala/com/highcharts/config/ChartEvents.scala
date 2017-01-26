/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart-events</code>
  */
@js.annotation.ScalaJSDefined
class ChartEvents extends js.Object {

  /**
    * Fires when a series is added to the chart after load time, using the <code>addSeries</code> method. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. Through <code>event.options</code> you can access the series options that was passed to the <code>addSeries</code>  method. Returning false prevents the series from being added.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/chart/events-addseries/" target="_blank">Alert on add series</a>
    * @since 1.2.0
    */
  val addSeries: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires after a chart is printed through the context menu item or the <code>Chart.print</code> method. Requires the exporting module.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/chart/events-beforeprint-afterprint/" target="_blank">Rescale the chart to print</a>
    * @since 4.1.0
    */
  val afterPrint: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires before a chart is printed through the context menu item or the <code>Chart.print</code> method. Requires the exporting module.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/chart/events-beforeprint-afterprint/" target="_blank">Rescale the chart to print</a>
    * @since 4.1.0
    */
  val beforePrint: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when clicking on the plot background. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.</p> <p>Information on the clicked spot can be found through <code>event.xAxis</code> and  <code>event.yAxis</code>, which are arrays containing the axes of each dimension and each axis' value at the clicked spot. The primary axes are <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a datetime axis is milliseconds since 1970-01-01 00:00:00.</p>
    * <pre>click: function(e) {
    * 	console.log(
    * 		Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', e.xAxis[0].value), 
    * 		e.yAxis[0].value
    * 	)
    * }</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/chart/events-click/" target="_blank">Alert coordinates on click</a>. <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/chart/events-container/" target="_blank">Alternatively, attach event to container</a>
    * @since 1.2.0
    */
  val click: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when a drilldown point is clicked, before the new series is added. This event is also utilized for async drilldown, where the seriesOptions are not added by option, but rather loaded async. Note that when clicking a category label to trigger multiple series drilldown, one <code>drilldown</code> event is triggered per point in the category.</p>
    * 
    * <p>Event arguments:</p>
    * 
    * <dl>
    * 
    *   <dt><code>category</code></dt>
    *   <dd>If a category label was clicked, which index.</dd>
    * 
    *   <dt><code>point</code></dt>
    *   <dd>The originating point.</dd>
    * 
    *   <dt><code>originalEvent</code></dt>
    *   <dd>The original browser event (usually click) that triggered the drilldown.</dd>
    * 
    *   <dt><code>points</code></dt>
    *   <dd>If a category label was clicked, this array holds all points corresponing to the category.</dd>
    * 
    *   <dt><code>seriesOptions</code></dt>
    *   <dd>Options for the new series</dd>
    * 
    * </dl>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/drilldown/async/" target="_blank">Async drilldown</a>
    * @since 3.0.8
    */
  val drilldown: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when drilling up from a drilldown series.
    * @since 3.0.8
    */
  val drillup: js.UndefOr[js.Function] = js.undefined

  /**
    * In a chart with multiple drilldown series, this event fires after all the series have been drilled up.
    * @since 4.2.4
    */
  val drillupall: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the chart is finished loading. Since v4.2.2, it also waits for images to be loaded, for example from point markers. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.</p>
    * 
    * <p>There is also a second parameter to the chart constructor where a callback function can be passed to be executed on chart.load.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/chart/events-load/" target="_blank">Alert on chart load</a>
    */
  val load: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the chart is redrawn, either after a call to chart.redraw() or after an axis, series or point is modified with the <code>redraw</code> option set to true. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/chart/events-redraw/" target="_blank">Alert on chart redraw</a>
    * @since 1.2.0
    */
  val redraw: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires after initial load of the chart (directly after the <code>load</code> event), and after each redraw (directly after the <code>redraw</code> event).
    * @since 5.0.7
    */
  val render: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when an area of the chart has been selected. Selection is enabled by setting the chart's zoomType. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. The default action for the  selection event is to zoom the  chart to the selected area. It can be prevented by calling  <code>event.preventDefault()</code>.</p> <p>Information on the selected area can be found through <code>event.xAxis</code> and  <code>event.yAxis</code>, which are arrays containing the axes of each dimension and each axis' min and max values. The primary axes are <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a datetime axis is milliseconds since 1970-01-01 00:00:00.</p> 
    * <pre>selection: function(event) {
    * 	// log the min and max of the primary, datetime x-axis
    * 	console.log(
    * 		Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].min),
    * 		Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].max)
    * 	);
    * 	// log the min and max of the y axis
    * 	console.log(event.yAxis[0].min, event.yAxis[0].max);
    * }</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection/" target="_blank">Report on selection and reset</a>, <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection-points/" target="_blank">select a range of points through a drag selection</a>.
    */
  val selection: js.UndefOr[js.Function] = js.undefined
}

object ChartEvents {
  /**
    * @param addSeries Fires when a series is added to the chart after load time, using the <code>addSeries</code> method. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. Through <code>event.options</code> you can access the series options that was passed to the <code>addSeries</code>  method. Returning false prevents the series from being added.
    * @param afterPrint Fires after a chart is printed through the context menu item or the <code>Chart.print</code> method. Requires the exporting module.
    * @param beforePrint Fires before a chart is printed through the context menu item or the <code>Chart.print</code> method. Requires the exporting module.
    * @param click <p>Fires when clicking on the plot background. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.</p> <p>Information on the clicked spot can be found through <code>event.xAxis</code> and  <code>event.yAxis</code>, which are arrays containing the axes of each dimension and each axis' value at the clicked spot. The primary axes are <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a datetime axis is milliseconds since 1970-01-01 00:00:00.</p>. <pre>click: function(e) {. 	console.log(. 		Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', e.xAxis[0].value), . 		e.yAxis[0].value. 	). }</pre>
    * @param drilldown <p>Fires when a drilldown point is clicked, before the new series is added. This event is also utilized for async drilldown, where the seriesOptions are not added by option, but rather loaded async. Note that when clicking a category label to trigger multiple series drilldown, one <code>drilldown</code> event is triggered per point in the category.</p>. . <p>Event arguments:</p>. . <dl>. .   <dt><code>category</code></dt>.   <dd>If a category label was clicked, which index.</dd>. .   <dt><code>point</code></dt>.   <dd>The originating point.</dd>. .   <dt><code>originalEvent</code></dt>.   <dd>The original browser event (usually click) that triggered the drilldown.</dd>. .   <dt><code>points</code></dt>.   <dd>If a category label was clicked, this array holds all points corresponing to the category.</dd>. .   <dt><code>seriesOptions</code></dt>.   <dd>Options for the new series</dd>. . </dl>
    * @param drillup Fires when drilling up from a drilldown series.
    * @param drillupall In a chart with multiple drilldown series, this event fires after all the series have been drilled up.
    * @param load <p>Fires when the chart is finished loading. Since v4.2.2, it also waits for images to be loaded, for example from point markers. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.</p>. . <p>There is also a second parameter to the chart constructor where a callback function can be passed to be executed on chart.load.</p>
    * @param redraw Fires when the chart is redrawn, either after a call to chart.redraw() or after an axis, series or point is modified with the <code>redraw</code> option set to true. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    * @param render Fires after initial load of the chart (directly after the <code>load</code> event), and after each redraw (directly after the <code>redraw</code> event).
    * @param selection <p>Fires when an area of the chart has been selected. Selection is enabled by setting the chart's zoomType. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. The default action for the  selection event is to zoom the  chart to the selected area. It can be prevented by calling  <code>event.preventDefault()</code>.</p> <p>Information on the selected area can be found through <code>event.xAxis</code> and  <code>event.yAxis</code>, which are arrays containing the axes of each dimension and each axis' min and max values. The primary axes are <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a datetime axis is milliseconds since 1970-01-01 00:00:00.</p> . <pre>selection: function(event) {. 	// log the min and max of the primary, datetime x-axis. 	console.log(. 		Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].min),. 		Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].max). 	);. 	// log the min and max of the y axis. 	console.log(event.yAxis[0].min, event.yAxis[0].max);. }</pre>
    */
  def apply(addSeries: js.UndefOr[js.Function] = js.undefined, afterPrint: js.UndefOr[js.Function] = js.undefined, beforePrint: js.UndefOr[js.Function] = js.undefined, click: js.UndefOr[js.Function] = js.undefined, drilldown: js.UndefOr[js.Function] = js.undefined, drillup: js.UndefOr[js.Function] = js.undefined, drillupall: js.UndefOr[js.Function] = js.undefined, load: js.UndefOr[js.Function] = js.undefined, redraw: js.UndefOr[js.Function] = js.undefined, render: js.UndefOr[js.Function] = js.undefined, selection: js.UndefOr[js.Function] = js.undefined): ChartEvents = {
    val addSeriesOuter: js.UndefOr[js.Function] = addSeries
    val afterPrintOuter: js.UndefOr[js.Function] = afterPrint
    val beforePrintOuter: js.UndefOr[js.Function] = beforePrint
    val clickOuter: js.UndefOr[js.Function] = click
    val drilldownOuter: js.UndefOr[js.Function] = drilldown
    val drillupOuter: js.UndefOr[js.Function] = drillup
    val drillupallOuter: js.UndefOr[js.Function] = drillupall
    val loadOuter: js.UndefOr[js.Function] = load
    val redrawOuter: js.UndefOr[js.Function] = redraw
    val renderOuter: js.UndefOr[js.Function] = render
    val selectionOuter: js.UndefOr[js.Function] = selection
    new ChartEvents {
      override val addSeries: js.UndefOr[js.Function] = addSeriesOuter
      override val afterPrint: js.UndefOr[js.Function] = afterPrintOuter
      override val beforePrint: js.UndefOr[js.Function] = beforePrintOuter
      override val click: js.UndefOr[js.Function] = clickOuter
      override val drilldown: js.UndefOr[js.Function] = drilldownOuter
      override val drillup: js.UndefOr[js.Function] = drillupOuter
      override val drillupall: js.UndefOr[js.Function] = drillupallOuter
      override val load: js.UndefOr[js.Function] = loadOuter
      override val redraw: js.UndefOr[js.Function] = redrawOuter
      override val render: js.UndefOr[js.Function] = renderOuter
      override val selection: js.UndefOr[js.Function] = selectionOuter
    }
  }
}
