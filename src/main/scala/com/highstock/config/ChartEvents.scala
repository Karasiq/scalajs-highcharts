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
  * @note JavaScript name: <code>chart-events</code>
  */
@js.annotation.ScalaJSDefined
class ChartEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Fires when a drilldown point is clicked, before the new series is
    * added. This event is also utilized for async drilldown, where the
    * seriesOptions are not added by option, but rather loaded async. Note
    * that when clicking a category label to trigger multiple series drilldown,
    * one <code>drilldown</code> event is triggered per point in the category.</p>
    * <p>Event arguments:</p>
    * <dl>
    * 
    * <dt>`category`</dt>
    * 
    * <dd>If a category label was clicked, which index.</dd>
    * 
    * <dt>`point`</dt>
    * 
    * <dd>The originating point.</dd>
    * 
    * <dt>`originalEvent`</dt>
    * 
    * <dd>The original browser event (usually click) that triggered the
    * drilldown.</dd>
    * 
    * <dt>`points`</dt>
    * 
    * <dd>If a category label was clicked, this array holds all points
    * corresponing to the category.</dd>
    * 
    * <dt>`seriesOptions`</dt>
    * 
    * <dd>Options for the new series</dd>
    * 
    * </dl>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/async/">Async drilldown</a>
    * @since 3.0.8
    */
  val drilldown: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when drilling up from a drilldown series.</p>
    * @since 3.0.8
    */
  val drillup: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>In a chart with multiple drilldown series, this event fires after
    * all the series have been drilled up.</p>
    * @since 4.2.4
    */
  val drillupall: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires after a chart is printed through the context menu item or the
    * <code>Chart.print</code> method. Requires the exporting module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-beforeprint-afterprint/">Rescale the chart to print</a>
    * @since 4.1.0
    */
  val afterPrint: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires before a chart is printed through the context menu item or
    * the <code>Chart.print</code> method. Requires the exporting module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-beforeprint-afterprint/">Rescale the chart to print</a>
    * @since 4.1.0
    */
  val beforePrint: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when a series is added to the chart after load time, using
    * the <code>addSeries</code> method. One parameter, <code>event</code>, is passed to the
    * function, containing common event information.
    * Through <code>event.options</code> you can access the series options that was
    * passed to the <code>addSeries</code> method. Returning false prevents the series
    * from being added.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-addseries/">Alert on add series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/events-addseries/">Alert on add series</a>
    * @since 1.2.0
    */
  val addSeries: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when clicking on the plot background. One parameter, <code>event</code>,
    * is passed to the function, containing common event information.</p>
    * <p>Information on the clicked spot can be found through <code>event.xAxis</code>
    * and <code>event.yAxis</code>, which are arrays containing the axes of each
    * dimension and each axis&#39; value at the clicked spot. The primary axes
    * are <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a
    * datetime axis is milliseconds since 1970-01-01 00:00:00.</p>
    * <pre>click: function(e) {
    *     console.log(
    *         Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', e.xAxis[0].value),
    *         e.yAxis[0].value
    *     )
    * }</pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-click/">Alert coordinates on click</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-container/">Alternatively, attach event to container</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/events-click/">Alert coordinates on click</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-container/">Alternatively, attach event to container</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/events-click/">Record coordinates on click</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-container/">Alternatively, attach event to container</a>
    * @since 1.2.0
    */
  val click: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the chart is finished loading. Since v4.2.2, it also waits
    * for images to be loaded, for example from point markers. One
    * parameter, <code>event</code>, is passed to the function, containing common
    * event information.</p>
    * <p>There is also a second parameter to the chart constructor where a
    * callback function can be passed to be executed on chart.load.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-load/">Alert on chart load</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/events-load/">Alert on chart load</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/events-load/">Add series on chart load</a>
    */
  val load: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the chart is redrawn, either after a call to
    * <code>chart.redraw()</code> or after an axis, series or point is modified with
    * the <code>redraw</code> option set to true. One parameter, <code>event</code>, is passed to
    * the function, containing common event information.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-redraw/">Alert on chart redraw</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/events-redraw/">Alert on chart redraw when adding a series or moving the zoomed range</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/events-redraw/">Set subtitle on chart redraw</a>
    * @since 1.2.0
    */
  val redraw: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires after initial load of the chart (directly after the <code>load</code>
    * event), and after each redraw (directly after the <code>redraw</code> event).</p>
    * @since 5.0.7
    */
  val render: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when an area of the chart has been selected. Selection is
    * enabled by setting the chart&#39;s zoomType. One parameter, <code>event</code>, is
    * passed to the function, containing common event information. The
    * default action for the selection event is to zoom the chart to the
    * selected area. It can be prevented by calling
    * <code>event.preventDefault()</code>.</p>
    * <p>Information on the selected area can be found through <code>event.xAxis</code>
    * and <code>event.yAxis</code>, which are arrays containing the axes of each
    * dimension and each axis&#39; min and max values. The primary axes are
    * <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a
    * datetime axis is milliseconds since 1970-01-01 00:00:00.</p>
    * <pre>selection: function(event) {
    *     // log the min and max of the primary, datetime x-axis
    *     console.log(
    *         Highcharts.dateFormat(
    *             '%Y-%m-%d %H:%M:%S',
    *             event.xAxis[0].min
    *         ),
    *         Highcharts.dateFormat(
    *             '%Y-%m-%d %H:%M:%S',
    *             event.xAxis[0].max
    *         )
    *     );
    *     // log the min and max of the y axis
    *     console.log(event.yAxis[0].min, event.yAxis[0].max);
    * }</pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection/">Report on selection and reset</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection-points/">Select a range of points through a drag selection</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/events-selection/">Report on selection and reset</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection-points/">Select a range of points through a drag selection (Highcharts)</a>
    */
  val selection: js.UndefOr[js.Function] = js.undefined
}

object ChartEvents {
  /**
    * @param drilldown <p>Fires when a drilldown point is clicked, before the new series is. added. This event is also utilized for async drilldown, where the. seriesOptions are not added by option, but rather loaded async. Note. that when clicking a category label to trigger multiple series drilldown,. one <code>drilldown</code> event is triggered per point in the category.</p>. <p>Event arguments:</p>. <dl>. . <dt>`category`</dt>. . <dd>If a category label was clicked, which index.</dd>. . <dt>`point`</dt>. . <dd>The originating point.</dd>. . <dt>`originalEvent`</dt>. . <dd>The original browser event (usually click) that triggered the. drilldown.</dd>. . <dt>`points`</dt>. . <dd>If a category label was clicked, this array holds all points. corresponing to the category.</dd>. . <dt>`seriesOptions`</dt>. . <dd>Options for the new series</dd>. . </dl>
    * @param drillup <p>Fires when drilling up from a drilldown series.</p>
    * @param drillupall <p>In a chart with multiple drilldown series, this event fires after. all the series have been drilled up.</p>
    * @param afterPrint <p>Fires after a chart is printed through the context menu item or the. <code>Chart.print</code> method. Requires the exporting module.</p>
    * @param beforePrint <p>Fires before a chart is printed through the context menu item or. the <code>Chart.print</code> method. Requires the exporting module.</p>
    * @param addSeries <p>Fires when a series is added to the chart after load time, using. the <code>addSeries</code> method. One parameter, <code>event</code>, is passed to the. function, containing common event information.. Through <code>event.options</code> you can access the series options that was. passed to the <code>addSeries</code> method. Returning false prevents the series. from being added.</p>
    * @param click <p>Fires when clicking on the plot background. One parameter, <code>event</code>,. is passed to the function, containing common event information.</p>. <p>Information on the clicked spot can be found through <code>event.xAxis</code>. and <code>event.yAxis</code>, which are arrays containing the axes of each. dimension and each axis&#39; value at the clicked spot. The primary axes. are <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a. datetime axis is milliseconds since 1970-01-01 00:00:00.</p>. <pre>click: function(e) {.     console.log(.         Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', e.xAxis[0].value),.         e.yAxis[0].value.     ). }</pre>
    * @param load <p>Fires when the chart is finished loading. Since v4.2.2, it also waits. for images to be loaded, for example from point markers. One. parameter, <code>event</code>, is passed to the function, containing common. event information.</p>. <p>There is also a second parameter to the chart constructor where a. callback function can be passed to be executed on chart.load.</p>
    * @param redraw <p>Fires when the chart is redrawn, either after a call to. <code>chart.redraw()</code> or after an axis, series or point is modified with. the <code>redraw</code> option set to true. One parameter, <code>event</code>, is passed to. the function, containing common event information.</p>
    * @param render <p>Fires after initial load of the chart (directly after the <code>load</code>. event), and after each redraw (directly after the <code>redraw</code> event).</p>
    * @param selection <p>Fires when an area of the chart has been selected. Selection is. enabled by setting the chart&#39;s zoomType. One parameter, <code>event</code>, is. passed to the function, containing common event information. The. default action for the selection event is to zoom the chart to the. selected area. It can be prevented by calling. <code>event.preventDefault()</code>.</p>. <p>Information on the selected area can be found through <code>event.xAxis</code>. and <code>event.yAxis</code>, which are arrays containing the axes of each. dimension and each axis&#39; min and max values. The primary axes are. <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a. datetime axis is milliseconds since 1970-01-01 00:00:00.</p>. <pre>selection: function(event) {.     // log the min and max of the primary, datetime x-axis.     console.log(.         Highcharts.dateFormat(.             '%Y-%m-%d %H:%M:%S',.             event.xAxis[0].min.         ),.         Highcharts.dateFormat(.             '%Y-%m-%d %H:%M:%S',.             event.xAxis[0].max.         ).     );.     // log the min and max of the y axis.     console.log(event.yAxis[0].min, event.yAxis[0].max);. }</pre>
    */
  def apply(drilldown: js.UndefOr[js.Function] = js.undefined, drillup: js.UndefOr[js.Function] = js.undefined, drillupall: js.UndefOr[js.Function] = js.undefined, afterPrint: js.UndefOr[js.Function] = js.undefined, beforePrint: js.UndefOr[js.Function] = js.undefined, addSeries: js.UndefOr[js.Function] = js.undefined, click: js.UndefOr[js.Function] = js.undefined, load: js.UndefOr[js.Function] = js.undefined, redraw: js.UndefOr[js.Function] = js.undefined, render: js.UndefOr[js.Function] = js.undefined, selection: js.UndefOr[js.Function] = js.undefined): ChartEvents = {
    val drilldownOuter: js.UndefOr[js.Function] = drilldown
    val drillupOuter: js.UndefOr[js.Function] = drillup
    val drillupallOuter: js.UndefOr[js.Function] = drillupall
    val afterPrintOuter: js.UndefOr[js.Function] = afterPrint
    val beforePrintOuter: js.UndefOr[js.Function] = beforePrint
    val addSeriesOuter: js.UndefOr[js.Function] = addSeries
    val clickOuter: js.UndefOr[js.Function] = click
    val loadOuter: js.UndefOr[js.Function] = load
    val redrawOuter: js.UndefOr[js.Function] = redraw
    val renderOuter: js.UndefOr[js.Function] = render
    val selectionOuter: js.UndefOr[js.Function] = selection
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartEvents {
      override val drilldown: js.UndefOr[js.Function] = drilldownOuter
      override val drillup: js.UndefOr[js.Function] = drillupOuter
      override val drillupall: js.UndefOr[js.Function] = drillupallOuter
      override val afterPrint: js.UndefOr[js.Function] = afterPrintOuter
      override val beforePrint: js.UndefOr[js.Function] = beforePrintOuter
      override val addSeries: js.UndefOr[js.Function] = addSeriesOuter
      override val click: js.UndefOr[js.Function] = clickOuter
      override val load: js.UndefOr[js.Function] = loadOuter
      override val redraw: js.UndefOr[js.Function] = redrawOuter
      override val render: js.UndefOr[js.Function] = renderOuter
      override val selection: js.UndefOr[js.Function] = selectionOuter
    })
  }
}
