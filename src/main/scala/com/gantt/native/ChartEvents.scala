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
  * @note JavaScript name: <code>chart-events</code>
  */
class ChartEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Fires when a series is added to the chart after load time, using the
    * <code>addSeries</code> method. One parameter, <code>event</code>, is passed to the
    * function, containing common event information. Through
    * <code>event.options</code> you can access the series options that were passed to
    * the <code>addSeries</code> method. Returning false prevents the series from
    * being added.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-addseries/">Alert on add series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/events-addseries/">Alert on add series</a>
    * @since 1.2.0
    */
  var addSeries: js.Any = js.undefined

  /**
    * <p>Fires after a chart is printed through the context menu item or the
    * <code>Chart.print</code> method.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-beforeprint-afterprint/">Rescale the chart to print</a>
    * @since 4.1.0
    */
  var afterPrint: js.Any = js.undefined

  /**
    * <p>Fires before a chart is printed through the context menu item or
    * the <code>Chart.print</code> method.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-beforeprint-afterprint/">Rescale the chart to print</a>
    * @since 4.1.0
    */
  var beforePrint: js.Any = js.undefined

  /**
    * <p>Fires when clicking on the plot background. One parameter, <code>event</code>,
    * is passed to the function, containing common event information.</p>
    * <p>Information on the clicked spot can be found through <code>event.xAxis</code>
    * and <code>event.yAxis</code>, which are arrays containing the axes of each
    * dimension and each axis&#39; value at the clicked spot. The primary axes
    * are <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a
    * datetime axis is milliseconds since 1970-01-01 00:00:00.</p>
    * <pre><code class="language-js">click: function(e) {
    *     console.log(
    *         Highcharts.dateFormat(&#39;%Y-%m-%d %H:%M:%S&#39;, e.xAxis[0].value),
    *         e.yAxis[0].value
    *     )
    * }
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-click/">Alert coordinates on click</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-container/">Alternatively, attach event to container</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/events-click/">Alert coordinates on click</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-container/">Alternatively, attach event to container</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/events-click/">Record coordinates on click</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-container/">Alternatively, attach event to container</a>
    * @since 1.2.0
    */
  var click: js.Any = js.undefined

  /**
    * <p>Fires when a drilldown point is clicked, before the new series is added. This
    * event is also utilized for async drilldown, where the seriesOptions are not
    * added by option, but rather loaded async. Note that when clicking a category
    * label to trigger multiple series drilldown, one <code>drilldown</code> event is
    * triggered per point in the category.</p>
    * <p>Event arguments:</p>
    * <ul>
    * <li><p><code>category</code>: If a category label was clicked, which index.</p>
    * </li>
    * <li><p><code>originalEvent</code>: The original browser event (usually click) that triggered
    * the drilldown.</p>
    * </li>
    * <li><p><code>point</code>: The originating point.</p>
    * </li>
    * <li><p><code>points</code>: If a category label was clicked, this array holds all points
    * corresponding to the category.</p>
    * </li>
    * <li><p><code>seriesOptions</code>: Options for the new series.</p>
    * </li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/async/">Async drilldown</a>
    * @since 3.0.8
    */
  var drilldown: js.Any = js.undefined

  /**
    * <p>Fires when drilling up from a drilldown series.</p>
    * @since 3.0.8
    */
  var drillup: js.Any = js.undefined

  /**
    * <p>In a chart with multiple drilldown series, this event fires after all the
    * series have been drilled up.</p>
    * @since 4.2.4
    */
  var drillupall: js.Any = js.undefined

  /**
    * <p>Callback that fires while exporting data. This allows the modification of
    * data rows before processed into the final format.</p>
    */
  var exportData: js.Any = js.undefined

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
  var load: js.Any = js.undefined

  /**
    * <p>Fires when the chart is redrawn, either after a call to
    * <code>chart.redraw()</code> or after an axis, series or point is modified with
    * the <code>redraw</code> option set to <code>true</code>. One parameter, <code>event</code>, is passed
    * to the function, containing common event information.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-redraw/">Alert on chart redraw</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/events-redraw/">Alert on chart redraw when adding a series or moving the zoomed range</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/events-redraw/">Set subtitle on chart redraw</a>
    * @since 1.2.0
    */
  var redraw: js.Any = js.undefined

  /**
    * <p>Fires after initial load of the chart (directly after the <code>load</code>
    * event), and after each redraw (directly after the <code>redraw</code> event).</p>
    * @since 5.0.7
    */
  var render: js.Any = js.undefined

  /**
    * <p>Fires when an area of the chart has been selected. Selection is
    * enabled by setting the chart&#39;s zoomType. One parameter, <code>event</code>, is
    * passed to the function, containing common event information. The
    * default action for the selection event is to zoom the chart to the
    * selected area. It can be prevented by calling
    * <code>event.preventDefault()</code> or return false.</p>
    * <p>Information on the selected area can be found through <code>event.xAxis</code>
    * and <code>event.yAxis</code>, which are arrays containing the axes of each
    * dimension and each axis&#39; min and max values. The primary axes are
    * <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a
    * datetime axis is milliseconds since 1970-01-01 00:00:00.</p>
    * <pre><code class="language-js">selection: function(event) {
    *     // log the min and max of the primary, datetime x-axis
    *     console.log(
    *         Highcharts.dateFormat(
    *             &#39;%Y-%m-%d %H:%M:%S&#39;,
    *             event.xAxis[0].min
    *         ),
    *         Highcharts.dateFormat(
    *             &#39;%Y-%m-%d %H:%M:%S&#39;,
    *             event.xAxis[0].max
    *         )
    *     );
    *     // log the min and max of the y axis
    *     console.log(event.yAxis[0].min, event.yAxis[0].max);
    * }
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection/">Report on selection and reset</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection-points/">Select a range of points through a drag selection</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/events-selection/">Report on selection and reset</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection-points/">Select a range of points through a drag selection (Highcharts)</a>
    */
  var selection: js.Any = js.undefined
}

object ChartEvents {
  /**
    * @param addSeries <p>Fires when a series is added to the chart after load time, using the. <code>addSeries</code> method. One parameter, <code>event</code>, is passed to the. function, containing common event information. Through. <code>event.options</code> you can access the series options that were passed to. the <code>addSeries</code> method. Returning false prevents the series from. being added.</p>
    * @param afterPrint <p>Fires after a chart is printed through the context menu item or the. <code>Chart.print</code> method.</p>
    * @param beforePrint <p>Fires before a chart is printed through the context menu item or. the <code>Chart.print</code> method.</p>
    * @param click <p>Fires when clicking on the plot background. One parameter, <code>event</code>,. is passed to the function, containing common event information.</p>. <p>Information on the clicked spot can be found through <code>event.xAxis</code>. and <code>event.yAxis</code>, which are arrays containing the axes of each. dimension and each axis&#39; value at the clicked spot. The primary axes. are <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a. datetime axis is milliseconds since 1970-01-01 00:00:00.</p>. <pre><code class="language-js">click: function(e) {.     console.log(.         Highcharts.dateFormat(&#39;%Y-%m-%d %H:%M:%S&#39;, e.xAxis[0].value),.         e.yAxis[0].value.     ). }. </code></pre>
    * @param drilldown <p>Fires when a drilldown point is clicked, before the new series is added. This. event is also utilized for async drilldown, where the seriesOptions are not. added by option, but rather loaded async. Note that when clicking a category. label to trigger multiple series drilldown, one <code>drilldown</code> event is. triggered per point in the category.</p>. <p>Event arguments:</p>. <ul>. <li><p><code>category</code>: If a category label was clicked, which index.</p>. </li>. <li><p><code>originalEvent</code>: The original browser event (usually click) that triggered. the drilldown.</p>. </li>. <li><p><code>point</code>: The originating point.</p>. </li>. <li><p><code>points</code>: If a category label was clicked, this array holds all points. corresponding to the category.</p>. </li>. <li><p><code>seriesOptions</code>: Options for the new series.</p>. </li>. </ul>
    * @param drillup <p>Fires when drilling up from a drilldown series.</p>
    * @param drillupall <p>In a chart with multiple drilldown series, this event fires after all the. series have been drilled up.</p>
    * @param exportData <p>Callback that fires while exporting data. This allows the modification of. data rows before processed into the final format.</p>
    * @param load <p>Fires when the chart is finished loading. Since v4.2.2, it also waits. for images to be loaded, for example from point markers. One. parameter, <code>event</code>, is passed to the function, containing common. event information.</p>. <p>There is also a second parameter to the chart constructor where a. callback function can be passed to be executed on chart.load.</p>
    * @param redraw <p>Fires when the chart is redrawn, either after a call to. <code>chart.redraw()</code> or after an axis, series or point is modified with. the <code>redraw</code> option set to <code>true</code>. One parameter, <code>event</code>, is passed. to the function, containing common event information.</p>
    * @param render <p>Fires after initial load of the chart (directly after the <code>load</code>. event), and after each redraw (directly after the <code>redraw</code> event).</p>
    * @param selection <p>Fires when an area of the chart has been selected. Selection is. enabled by setting the chart&#39;s zoomType. One parameter, <code>event</code>, is. passed to the function, containing common event information. The. default action for the selection event is to zoom the chart to the. selected area. It can be prevented by calling. <code>event.preventDefault()</code> or return false.</p>. <p>Information on the selected area can be found through <code>event.xAxis</code>. and <code>event.yAxis</code>, which are arrays containing the axes of each. dimension and each axis&#39; min and max values. The primary axes are. <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a. datetime axis is milliseconds since 1970-01-01 00:00:00.</p>. <pre><code class="language-js">selection: function(event) {.     // log the min and max of the primary, datetime x-axis.     console.log(.         Highcharts.dateFormat(.             &#39;%Y-%m-%d %H:%M:%S&#39;,.             event.xAxis[0].min.         ),.         Highcharts.dateFormat(.             &#39;%Y-%m-%d %H:%M:%S&#39;,.             event.xAxis[0].max.         ).     );.     // log the min and max of the y axis.     console.log(event.yAxis[0].min, event.yAxis[0].max);. }. </code></pre>
    */
  def apply(addSeries: js.UndefOr[js.Any] = js.undefined, afterPrint: js.UndefOr[js.Any] = js.undefined, beforePrint: js.UndefOr[js.Any] = js.undefined, click: js.UndefOr[js.Any] = js.undefined, drilldown: js.UndefOr[js.Any] = js.undefined, drillup: js.UndefOr[js.Any] = js.undefined, drillupall: js.UndefOr[js.Any] = js.undefined, exportData: js.UndefOr[js.Any] = js.undefined, load: js.UndefOr[js.Any] = js.undefined, redraw: js.UndefOr[js.Any] = js.undefined, render: js.UndefOr[js.Any] = js.undefined, selection: js.UndefOr[js.Any] = js.undefined): ChartEvents = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartEvents {
      this.addSeries = addSeries
      this.afterPrint = afterPrint
      this.beforePrint = beforePrint
      this.click = click
      this.drilldown = drilldown
      this.drillup = drillup
      this.drillupall = drillupall
      this.exportData = exportData
      this.load = load
      this.redraw = redraw
      this.render = render
      this.selection = selection
    })
  }
}
