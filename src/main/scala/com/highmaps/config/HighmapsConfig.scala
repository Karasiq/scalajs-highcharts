/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>HighmapsConfig</code>
  */
@js.annotation.ScalaJSDefined
class HighmapsConfig extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Series options for specific data and the data itself. In TypeScript you
    * have to cast the series options to specific series types, to get all
    * possible options for a series.</p>
    */
  val series: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>The plotOptions is a wrapper object for config objects for each series
    * type. The config objects for each series can also be overridden for
    * each series item as given in the series array.</p>
    * <p>Configuration options for the series are given in three levels. Options
    * for all series in a chart are given in the <a href="#plotOptions.series">plotOptions.series</a> object. Then options for all series of a specific
    * type are given in the plotOptions of that type, for example
    * <code>plotOptions.line</code>. Next, options for one single series are given in
    * <a href="#series">the series array</a>.</p>
    */
  val plotOptions: js.Any = js.undefined

  /**
    * <p>Language object. The language object is global and it can&#39;t be set
    * on each chart initiation. Instead, use <code>Highcharts.setOptions</code> to
    * set it before any chart is initialized.</p>
    * <pre>Highcharts.setOptions({
    *     lang: {
    *         months: [
    *             'Janvier', 'Février', 'Mars', 'Avril',
    *             'Mai', 'Juin', 'Juillet', 'Août',
    *             'Septembre', 'Octobre', 'Novembre', 'Décembre'
    *         ],
    *         weekdays: [
    *             'Dimanche', 'Lundi', 'Mardi', 'Mercredi',
    *             'Jeudi', 'Vendredi', 'Samedi'
    *         ]
    *     }
    * });</pre>
    */
  val lang: js.Any = js.undefined

  /**
    * <p>Styled mode only. Configuration object for adding SVG definitions for
    * reusable elements. See <a href="https://www.highcharts.com/docs/chart-design-and-style/gradients-shadows-and-patterns">gradients, shadows and
    * patterns</a>
    * for more information and code examples.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/custom-markers/">Define a custom marker for annotations</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/annotations-markers/">Define markers in a styled mode</a>
    * @since 5.0.0
    */
  val defs: js.Any = js.undefined

  /**
    * <p>Options for configuring annotations, for example labels, arrows or
    * shapes. Annotations can be tied to points, axis coordinates or chart
    * pixel coordinates.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/basic/">Basic annotations</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/annotations/">Advanced annotations</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/annotations">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/annotations/fibonacci-retracements">Custom annotation, Fibonacci retracement</a>
    * @since 6.0.0
    */
  val annotations: js.UndefOr[js.Array[CleanJsObject[Annotations]]] = js.undefined

  /**
    * <p>Options for the Boost module. The Boost module allows certain series types
    * to be rendered by WebGL instead of the default SVG. This allows hundreds of
    * thousands of data points to be rendered in milliseconds. In addition to the
    * WebGL rendering it saves time by skipping processing and inspection of the
    * data wherever possible. This introduces some limitations to what features are
    * available in Boost mode. See <a href="https://www.highcharts.com/docs/advanced-chart-features/boost-module">the docs</a> for
    * details.</p>
    * <p>In addition to the global <code>boost</code> option, each series has a
    * <a href="#plotOptions.series.boostThreshold">boostThreshold</a> that defines when the
    * boost should kick in.</p>
    * <p>Requires the <code>modules/boost.js</code> module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/line-series-heavy-stock">Stock chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/line-series-heavy-dynamic">Dynamic stock chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/line">Line chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/line-series-heavy">Line chart with hundreds of series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/scatter">Scatter chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/area">Area chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/arearange">Area range chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/column">Column chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/columnrange">Column range chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/bubble">Bubble chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/heatmap">Heat map</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/treemap">Tree map</a>
    */
  val boost: js.UndefOr[CleanJsObject[Boost]] = js.undefined

  /**
    * <p>The Data module provides a simplified interface for adding data to
    * a chart from sources like CVS, HTML tables or grid views. See also
    * the [tutorial article on the Data module](<a href="https://www.highcharts.com/docs/working-">https://www.highcharts.com/docs/working-</a>
    * with-data/data-module).</p>
    * <p>It requires the <code>modules/data.js</code> file to be loaded.</p>
    * <p>Please note that the default way of adding data in Highcharts, without
    * the need of a module, is through the <a href="#series.data">series.data</a>
    * option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/column-parsed/">HTML table</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/csv/">CSV</a>
    * @since 4.0
    */
  val data: js.Any = js.undefined

  /**
    * <p>The Y axis or value axis. Normally this is the vertical axis,
    * though if the chart is inverted this is the horizontal axis.
    * In case of multiple axes, the yAxis node is an array of
    * configuration objects.</p>
    * <p>See <a href="/class-reference/Highcharts.Axis">the Axis object</a> for programmatic
    * access to the axis.</p>
    */
  val yAxis: js.Any = js.undefined

  /**
    * <p>General options for the chart.</p>
    */
  val chart: js.Any = js.undefined

  /**
    * <p>Options for drill down, the concept of inspecting increasingly high
    * resolution data through clicking on chart items like columns or pie slices.</p>
    * <p>The drilldown feature requires the drilldown.js file to be loaded,
    * found in the modules directory of the download package, or online at
    * <a href="code.highcharts.com/modules/drilldown.js">code.highcharts.com/modules/drilldown.js
    * </a>.</p>
    */
  val drilldown: js.UndefOr[CleanJsObject[Drilldown]] = js.undefined

  /**
    * <p>Options for the exporting module. For an overview on the matter, see
    * <a href="https://www.highcharts.com/docs/export-module/export-module-overview">the docs</a>.</p>
    */
  val exporting: js.UndefOr[CleanJsObject[Exporting]] = js.undefined

  /**
    * <p>A collection of options for buttons and menus appearing in the exporting
    * module.</p>
    */
  val navigation: js.UndefOr[CleanJsObject[Navigation]] = js.undefined

  /**
    * <p>Options for configuring accessibility for the chart. Requires the
    * [accessibility module](//code.highcharts.com/modules/accessibility.
    * js) to be loaded. For a description of the module and information
    * on its features, see [Highcharts Accessibility](<a href="http://www.highcharts">http://www.highcharts</a>.
    * com/docs/chart-concepts/accessibility).</p>
    * @since 5.0.0
    */
  val accessibility: js.UndefOr[CleanJsObject[Accessibility]] = js.undefined

  /**
    * <p>The legend is a box containing a symbol and name for each series
    * item or point item in the chart. Each series (or points in case
    * of pie charts) is represented by a symbol and its name in the legend.</p>
    * <p>It is possible to override the symbol creator function and create
    * <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/studies/legend-custom-symbol/">custom legend symbols</a>.</p>
    */
  val legend: js.Any = js.undefined

  /**
    * <p>Options for displaying a message like &quot;No data to display&quot;.
    * This feature requires the file no-data-to-display.js to be loaded in the
    * page. The actual text to display is set in the lang.noData option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-line">Line chart with no-data module</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-pie">Pie chart with no-data module</a>
    */
  val noData: js.UndefOr[CleanJsObject[NoData]] = js.undefined

  val global: js.Any = js.undefined

  /**
    * <p>The X axis or category axis. Normally this is the horizontal axis,
    * though if the chart is inverted this is the vertical axis. In case of
    * multiple axes, the xAxis node is an array of configuration objects.</p>
    * <p>See <a href="/class-reference/Highcharts.Axis">the Axis object</a> for
    * programmatic access to the axis.</p>
    */
  val xAxis: js.Any = js.undefined

  /**
    * <p>The Z axis or depth axis for 3D plots.</p>
    * <p>See <a href="/class-reference/Highcharts.Axis">the Axis object</a> for programmatic
    * access to the axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter-zaxis-categories/">Z-Axis with Categories</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter-zaxis-grid/">Z-Axis with styling</a>
    * @since 5.0.0
    */
  val zAxis: js.UndefOr[CleanJsObject[ZAxis]] = js.undefined

  /**
    * <p>The navigator is a small series below the main series, displaying
    * a view of the entire data set. It provides tools to zoom in and
    * out on parts of the data as well as panning across the dataset.</p>
    */
  val navigator: js.Any = js.undefined

  /**
    * <p>An array containing the default colors for the chart&#39;s series. When
    * all colors are used, new colors are pulled from the start again.</p>
    * <p>Default colors can also be set on a series or series.type basis,
    * see <a href="#plotOptions.column.colors">column.colors</a>,
    * <a href="#plotOptions.pie.colors">pie.colors</a>.</p>
    * <p>In styled mode, the colors option doesn&#39;t exist. Instead, colors
    * are defined in CSS and applied either through series or point class
    * names, or through the <a href="#chart.colorCount">chart.colorCount</a> option.</p>
    * <h3 id="legacy">Legacy</h3>
    * <p>In Highcharts 3.x, the default colors were:</p>
    * <pre>colors: ['#2f7ed8', '#0d233a', '#8bbc21', '#910000', '#1aadce',
    *     '#492970', '#f28f43', '#77a1e5', '#c42525', '#a6c96a']</pre>
    * 
    * <p>In Highcharts 2.x, the default colors were:</p>
    * <pre>colors: ['#4572A7', '#AA4643', '#89A54E', '#80699B', '#3D96AE',
    *    '#DB843D', '#92A8CD', '#A47D7C', '#B5CA92']</pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/colors/">Assign a global color theme</a>
    */
  val colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined

  /**
    * <p>Time options that can apply globally or to individual charts. These
    * settings affect how <code>datetime</code> axes are laid out, how tooltips are
    * formatted, how series
    * <a href="#plotOptions.series.pointIntervalUnit">pointIntervalUnit</a> works and how
    * the Highstock range selector handles time.</p>
    * <p>The common use case is that all charts in the same Highcharts object
    * share the same time settings, in which case the global settings are set
    * using <code>setOptions</code>.</p>
    * <pre><code class="language-js">// Apply time settings globally
    * Highcharts.setOptions({
    *     time: {
    *         timezone: &#39;Europe/London&#39;
    *     }
    * });
    * // Apply time settings by instance
    * var chart = Highcharts.chart(&#39;container&#39;, {
    *     time: {
    *         timezone: &#39;America/New_York&#39;
    *     },
    *     series: [{
    *         data: [1, 4, 3, 5]
    *     }]
    * });
    * 
    * // Use the Time object
    * console.log(
    *        &#39;Current time in New York&#39;,
    *        chart.time.dateFormat(&#39;%Y-%m-%d %H:%M:%S&#39;, Date.now())
    * );</code></pre>
    * <p>Since v6.0.5, the time options were moved from the <code>global</code> obect to the
    * <code>time</code> object, and time options can be set on each individual chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/timezone/">Set the timezone globally</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/individual/">Set the timezone per chart instance</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/time/individual/">Set the timezone per chart instance</a>
    * @since 6.0.5
    */
  val time: js.Any = js.undefined

  /**
    * <p>The chart&#39;s main title.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/title/title/">Title options demonstrated</a>
    */
  val title: js.Any = js.undefined

  /**
    * <p>The chart&#39;s subtitle. This can be used both to display a subtitle below
    * the main title, and to display random text anywhere in the chart. The
    * subtitle can be updated after chart initialization through the
    * <code>Chart.setTitle</code> method.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/title/subtitle/">Subtitle options demonstrated</a>
    */
  val subtitle: js.Any = js.undefined

  /**
    * <p>HTML labels that can be positioned anywhere in the chart area.</p>
    */
  val labels: js.Any = js.undefined

  /**
    * <p>The loading options control the appearance of the loading screen
    * that covers the plot area on chart operations. This screen only
    * appears after an explicit call to <code>chart.showLoading()</code>. It is a
    * utility for developers to communicate to the end user that something
    * is going on, for example while retrieving new data via an XHR connection.
    * The &quot;Loading...&quot; text itself is not part of this configuration
    * object, but part of the <code>lang</code> object.</p>
    */
  val loading: js.Any = js.undefined

  /**
    * <p>Options for the tooltip that appears when the user hovers over a
    * series or point.</p>
    */
  val tooltip: js.Any = js.undefined

  /**
    * <p>Highchart by default puts a credits label in the lower right corner
    * of the chart. This can be changed using these options.</p>
    */
  val credits: js.Any = js.undefined

  /**
    * <p>The range selector is a tool for selecting ranges to display within
    * the chart. It provides buttons to select preconfigured ranges in
    * the chart, like 1 day, 1 week, 1 month etc. It also provides input
    * boxes where min and max dates can be manually input.</p>
    */
  val rangeSelector: js.Any = js.undefined

  /**
    * <p>Allows setting a set of rules to apply for different screen or chart
    * sizes. Each rule specifies additional chart options.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/responsive/">Stock chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/">Axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/legend/">Legend</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/classname/">Class name</a>
    * @since 5.0.0
    */
  val responsive: js.Any = js.undefined

  /**
    * <p>The scrollbar is a means of panning over the X axis of a stock chart.
    * Scrollbars can  also be applied to other types of axes.</p>
    * <p>Another approach to scrollable charts is the <a href="https://api.highcharts.com/highcharts/chart.scrollablePlotArea">chart.scrollablePlotArea</a> option that
    * is especially suitable for simpler cartesian charts on mobile.</p>
    * <p>In styled mode, all the presentational options for the
    * scrollbar are replaced by the classes <code>.highcharts-scrollbar-thumb</code>,
    * <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,
    * <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/inverted-bar-scrollbar/">A scrollbar on a simple bar chart</a>
    */
  val scrollbar: js.Any = js.undefined

  /**
    * <p>The pane serves as a container for axes and backgrounds for circular
    * gauges and polar charts.</p>
    * @since 2.3.0
    */
  val pane: js.Any = js.undefined

  /**
    * <p>A color axis for choropleth maps and heat maps. Visually, the color
    * axis will appear as a gradient or as separate items inside the
    * legend, depending on whether the axis is scalar or based on data
    * classes.</p>
    * <p>For supported color formats, see the
    * <a href="https://www.highcharts.com/docs/chart-design-and-style/colors">docs article about colors</a>.</p>
    * <p>A scalar color axis is represented by a gradient. The colors either
    * range between the <a href="#colorAxis.minColor">minColor</a> and the
    * <a href="#colorAxis.maxColor">maxColor</a>, or for more fine grained control the
    * colors can be defined in <a href="#colorAxis.stops">stops</a>. Often times, the
    * color axis needs to be adjusted to get the right color spread for the
    * data. In addition to stops, consider using a logarithmic
    * <a href="#colorAxis.type">axis type</a>, or setting <a href="#colorAxis.min">min</a> and
    * <a href="#colorAxis.max">max</a> to avoid the colors being determined by
    * outliers.</p>
    * <p>When <a href="#colorAxis.dataClasses">dataClasses</a> are used, the ranges are
    * subdivided into separate classes like categories based on their
    * values. This can be used for ranges between two values, but also for
    * a true category. However, when your data is categorized, it may be as
    * convenient to add each category to a separate series.</p>
    * <p>See <a href="/class-reference/Highcharts.Axis">the Axis object</a> for
    * programmatic access to the axis.</p>
    */
  val colorAxis: js.Any = js.undefined

  val mapNavigation: js.Any = js.undefined

  /**
    * <p>The Pathfinder allows you to define connections between any two points,
    * represented as lines - optionally with markers for the start and/or end
    * points. Multiple algorithms are available for calculating how the
    * connecting lines are drawn.</p>
    * <p>Pathfinder functionality requires Highcharts Gantt to be loaded. In Gantt
    * charts, the Pathfinder is used to draw dependencies between tasks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/pathfinder/demo">Pathfinder connections</a>
    */
  val pathfinder: js.Any = js.undefined
}

object HighmapsConfig {
  /**
    * @param series <p>Series options for specific data and the data itself. In TypeScript you. have to cast the series options to specific series types, to get all. possible options for a series.</p>
    * @param plotOptions <p>The plotOptions is a wrapper object for config objects for each series. type. The config objects for each series can also be overridden for. each series item as given in the series array.</p>. <p>Configuration options for the series are given in three levels. Options. for all series in a chart are given in the <a href="#plotOptions.series">plotOptions.series</a> object. Then options for all series of a specific. type are given in the plotOptions of that type, for example. <code>plotOptions.line</code>. Next, options for one single series are given in. <a href="#series">the series array</a>.</p>
    * @param lang <p>Language object. The language object is global and it can&#39;t be set. on each chart initiation. Instead, use <code>Highcharts.setOptions</code> to. set it before any chart is initialized.</p>. <pre>Highcharts.setOptions({.     lang: {.         months: [.             'Janvier', 'Février', 'Mars', 'Avril',.             'Mai', 'Juin', 'Juillet', 'Août',.             'Septembre', 'Octobre', 'Novembre', 'Décembre'.         ],.         weekdays: [.             'Dimanche', 'Lundi', 'Mardi', 'Mercredi',.             'Jeudi', 'Vendredi', 'Samedi'.         ].     }. });</pre>
    * @param defs <p>Styled mode only. Configuration object for adding SVG definitions for. reusable elements. See <a href="https://www.highcharts.com/docs/chart-design-and-style/gradients-shadows-and-patterns">gradients, shadows and. patterns</a>. for more information and code examples.</p>
    * @param annotations <p>Options for configuring annotations, for example labels, arrows or. shapes. Annotations can be tied to points, axis coordinates or chart. pixel coordinates.</p>
    * @param boost <p>Options for the Boost module. The Boost module allows certain series types. to be rendered by WebGL instead of the default SVG. This allows hundreds of. thousands of data points to be rendered in milliseconds. In addition to the. WebGL rendering it saves time by skipping processing and inspection of the. data wherever possible. This introduces some limitations to what features are. available in Boost mode. See <a href="https://www.highcharts.com/docs/advanced-chart-features/boost-module">the docs</a> for. details.</p>. <p>In addition to the global <code>boost</code> option, each series has a. <a href="#plotOptions.series.boostThreshold">boostThreshold</a> that defines when the. boost should kick in.</p>. <p>Requires the <code>modules/boost.js</code> module.</p>
    * @param data <p>The Data module provides a simplified interface for adding data to. a chart from sources like CVS, HTML tables or grid views. See also. the [tutorial article on the Data module](<a href="https://www.highcharts.com/docs/working-">https://www.highcharts.com/docs/working-</a>. with-data/data-module).</p>. <p>It requires the <code>modules/data.js</code> file to be loaded.</p>. <p>Please note that the default way of adding data in Highcharts, without. the need of a module, is through the <a href="#series.data">series.data</a>. option.</p>
    * @param yAxis <p>The Y axis or value axis. Normally this is the vertical axis,. though if the chart is inverted this is the horizontal axis.. In case of multiple axes, the yAxis node is an array of. configuration objects.</p>. <p>See <a href="/class-reference/Highcharts.Axis">the Axis object</a> for programmatic. access to the axis.</p>
    * @param chart <p>General options for the chart.</p>
    * @param drilldown <p>Options for drill down, the concept of inspecting increasingly high. resolution data through clicking on chart items like columns or pie slices.</p>. <p>The drilldown feature requires the drilldown.js file to be loaded,. found in the modules directory of the download package, or online at. <a href="code.highcharts.com/modules/drilldown.js">code.highcharts.com/modules/drilldown.js. </a>.</p>
    * @param exporting <p>Options for the exporting module. For an overview on the matter, see. <a href="https://www.highcharts.com/docs/export-module/export-module-overview">the docs</a>.</p>
    * @param navigation <p>A collection of options for buttons and menus appearing in the exporting. module.</p>
    * @param accessibility <p>Options for configuring accessibility for the chart. Requires the. [accessibility module](//code.highcharts.com/modules/accessibility.. js) to be loaded. For a description of the module and information. on its features, see [Highcharts Accessibility](<a href="http://www.highcharts">http://www.highcharts</a>.. com/docs/chart-concepts/accessibility).</p>
    * @param legend <p>The legend is a box containing a symbol and name for each series. item or point item in the chart. Each series (or points in case. of pie charts) is represented by a symbol and its name in the legend.</p>. <p>It is possible to override the symbol creator function and create. <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/studies/legend-custom-symbol/">custom legend symbols</a>.</p>
    * @param noData <p>Options for displaying a message like &quot;No data to display&quot;.. This feature requires the file no-data-to-display.js to be loaded in the. page. The actual text to display is set in the lang.noData option.</p>
    * @param xAxis <p>The X axis or category axis. Normally this is the horizontal axis,. though if the chart is inverted this is the vertical axis. In case of. multiple axes, the xAxis node is an array of configuration objects.</p>. <p>See <a href="/class-reference/Highcharts.Axis">the Axis object</a> for. programmatic access to the axis.</p>
    * @param zAxis <p>The Z axis or depth axis for 3D plots.</p>. <p>See <a href="/class-reference/Highcharts.Axis">the Axis object</a> for programmatic. access to the axis.</p>
    * @param navigator <p>The navigator is a small series below the main series, displaying. a view of the entire data set. It provides tools to zoom in and. out on parts of the data as well as panning across the dataset.</p>
    * @param colors <p>An array containing the default colors for the chart&#39;s series. When. all colors are used, new colors are pulled from the start again.</p>. <p>Default colors can also be set on a series or series.type basis,. see <a href="#plotOptions.column.colors">column.colors</a>,. <a href="#plotOptions.pie.colors">pie.colors</a>.</p>. <p>In styled mode, the colors option doesn&#39;t exist. Instead, colors. are defined in CSS and applied either through series or point class. names, or through the <a href="#chart.colorCount">chart.colorCount</a> option.</p>. <h3 id="legacy">Legacy</h3>. <p>In Highcharts 3.x, the default colors were:</p>. <pre>colors: ['#2f7ed8', '#0d233a', '#8bbc21', '#910000', '#1aadce',.     '#492970', '#f28f43', '#77a1e5', '#c42525', '#a6c96a']</pre>. . <p>In Highcharts 2.x, the default colors were:</p>. <pre>colors: ['#4572A7', '#AA4643', '#89A54E', '#80699B', '#3D96AE',.    '#DB843D', '#92A8CD', '#A47D7C', '#B5CA92']</pre>
    * @param time <p>Time options that can apply globally or to individual charts. These. settings affect how <code>datetime</code> axes are laid out, how tooltips are. formatted, how series. <a href="#plotOptions.series.pointIntervalUnit">pointIntervalUnit</a> works and how. the Highstock range selector handles time.</p>. <p>The common use case is that all charts in the same Highcharts object. share the same time settings, in which case the global settings are set. using <code>setOptions</code>.</p>. <pre><code class="language-js">// Apply time settings globally. Highcharts.setOptions({.     time: {.         timezone: &#39;Europe/London&#39;.     }. });. // Apply time settings by instance. var chart = Highcharts.chart(&#39;container&#39;, {.     time: {.         timezone: &#39;America/New_York&#39;.     },.     series: [{.         data: [1, 4, 3, 5].     }]. });. . // Use the Time object. console.log(.        &#39;Current time in New York&#39;,.        chart.time.dateFormat(&#39;%Y-%m-%d %H:%M:%S&#39;, Date.now()). );</code></pre>. <p>Since v6.0.5, the time options were moved from the <code>global</code> obect to the. <code>time</code> object, and time options can be set on each individual chart.</p>
    * @param title <p>The chart&#39;s main title.</p>
    * @param subtitle <p>The chart&#39;s subtitle. This can be used both to display a subtitle below. the main title, and to display random text anywhere in the chart. The. subtitle can be updated after chart initialization through the. <code>Chart.setTitle</code> method.</p>
    * @param labels <p>HTML labels that can be positioned anywhere in the chart area.</p>
    * @param loading <p>The loading options control the appearance of the loading screen. that covers the plot area on chart operations. This screen only. appears after an explicit call to <code>chart.showLoading()</code>. It is a. utility for developers to communicate to the end user that something. is going on, for example while retrieving new data via an XHR connection.. The &quot;Loading...&quot; text itself is not part of this configuration. object, but part of the <code>lang</code> object.</p>
    * @param tooltip <p>Options for the tooltip that appears when the user hovers over a. series or point.</p>
    * @param credits <p>Highchart by default puts a credits label in the lower right corner. of the chart. This can be changed using these options.</p>
    * @param rangeSelector <p>The range selector is a tool for selecting ranges to display within. the chart. It provides buttons to select preconfigured ranges in. the chart, like 1 day, 1 week, 1 month etc. It also provides input. boxes where min and max dates can be manually input.</p>
    * @param responsive <p>Allows setting a set of rules to apply for different screen or chart. sizes. Each rule specifies additional chart options.</p>
    * @param scrollbar <p>The scrollbar is a means of panning over the X axis of a stock chart.. Scrollbars can  also be applied to other types of axes.</p>. <p>Another approach to scrollable charts is the <a href="https://api.highcharts.com/highcharts/chart.scrollablePlotArea">chart.scrollablePlotArea</a> option that. is especially suitable for simpler cartesian charts on mobile.</p>. <p>In styled mode, all the presentational options for the. scrollbar are replaced by the classes <code>.highcharts-scrollbar-thumb</code>,. <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,. <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.</p>
    * @param pane <p>The pane serves as a container for axes and backgrounds for circular. gauges and polar charts.</p>
    * @param colorAxis <p>A color axis for choropleth maps and heat maps. Visually, the color. axis will appear as a gradient or as separate items inside the. legend, depending on whether the axis is scalar or based on data. classes.</p>. <p>For supported color formats, see the. <a href="https://www.highcharts.com/docs/chart-design-and-style/colors">docs article about colors</a>.</p>. <p>A scalar color axis is represented by a gradient. The colors either. range between the <a href="#colorAxis.minColor">minColor</a> and the. <a href="#colorAxis.maxColor">maxColor</a>, or for more fine grained control the. colors can be defined in <a href="#colorAxis.stops">stops</a>. Often times, the. color axis needs to be adjusted to get the right color spread for the. data. In addition to stops, consider using a logarithmic. <a href="#colorAxis.type">axis type</a>, or setting <a href="#colorAxis.min">min</a> and. <a href="#colorAxis.max">max</a> to avoid the colors being determined by. outliers.</p>. <p>When <a href="#colorAxis.dataClasses">dataClasses</a> are used, the ranges are. subdivided into separate classes like categories based on their. values. This can be used for ranges between two values, but also for. a true category. However, when your data is categorized, it may be as. convenient to add each category to a separate series.</p>. <p>See <a href="/class-reference/Highcharts.Axis">the Axis object</a> for. programmatic access to the axis.</p>
    * @param pathfinder <p>The Pathfinder allows you to define connections between any two points,. represented as lines - optionally with markers for the start and/or end. points. Multiple algorithms are available for calculating how the. connecting lines are drawn.</p>. <p>Pathfinder functionality requires Highcharts Gantt to be loaded. In Gantt. charts, the Pathfinder is used to draw dependencies between tasks.</p>
    */
  def apply(series: js.UndefOr[js.Array[js.Any]] = js.undefined, plotOptions: js.UndefOr[js.Any] = js.undefined, lang: js.UndefOr[js.Any] = js.undefined, defs: js.UndefOr[js.Any] = js.undefined, annotations: js.UndefOr[js.Array[CleanJsObject[Annotations]]] = js.undefined, boost: js.UndefOr[CleanJsObject[Boost]] = js.undefined, data: js.UndefOr[js.Any] = js.undefined, yAxis: js.UndefOr[js.Any] = js.undefined, chart: js.UndefOr[js.Any] = js.undefined, drilldown: js.UndefOr[CleanJsObject[Drilldown]] = js.undefined, exporting: js.UndefOr[CleanJsObject[Exporting]] = js.undefined, navigation: js.UndefOr[CleanJsObject[Navigation]] = js.undefined, accessibility: js.UndefOr[CleanJsObject[Accessibility]] = js.undefined, legend: js.UndefOr[js.Any] = js.undefined, noData: js.UndefOr[CleanJsObject[NoData]] = js.undefined, global: js.UndefOr[js.Any] = js.undefined, xAxis: js.UndefOr[js.Any] = js.undefined, zAxis: js.UndefOr[CleanJsObject[ZAxis]] = js.undefined, navigator: js.UndefOr[js.Any] = js.undefined, colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined, time: js.UndefOr[js.Any] = js.undefined, title: js.UndefOr[js.Any] = js.undefined, subtitle: js.UndefOr[js.Any] = js.undefined, labels: js.UndefOr[js.Any] = js.undefined, loading: js.UndefOr[js.Any] = js.undefined, tooltip: js.UndefOr[js.Any] = js.undefined, credits: js.UndefOr[js.Any] = js.undefined, rangeSelector: js.UndefOr[js.Any] = js.undefined, responsive: js.UndefOr[js.Any] = js.undefined, scrollbar: js.UndefOr[js.Any] = js.undefined, pane: js.UndefOr[js.Any] = js.undefined, colorAxis: js.UndefOr[js.Any] = js.undefined, mapNavigation: js.UndefOr[js.Any] = js.undefined, pathfinder: js.UndefOr[js.Any] = js.undefined): HighmapsConfig = {
    val seriesOuter: js.UndefOr[js.Array[js.Any]] = series
    val plotOptionsOuter: js.Any = plotOptions
    val langOuter: js.Any = lang
    val defsOuter: js.Any = defs
    val annotationsOuter: js.UndefOr[js.Array[CleanJsObject[Annotations]]] = annotations
    val boostOuter: js.UndefOr[CleanJsObject[Boost]] = boost
    val dataOuter: js.Any = data
    val yAxisOuter: js.Any = yAxis
    val chartOuter: js.Any = chart
    val drilldownOuter: js.UndefOr[CleanJsObject[Drilldown]] = drilldown
    val exportingOuter: js.UndefOr[CleanJsObject[Exporting]] = exporting
    val navigationOuter: js.UndefOr[CleanJsObject[Navigation]] = navigation
    val accessibilityOuter: js.UndefOr[CleanJsObject[Accessibility]] = accessibility
    val legendOuter: js.Any = legend
    val noDataOuter: js.UndefOr[CleanJsObject[NoData]] = noData
    val globalOuter: js.Any = global
    val xAxisOuter: js.Any = xAxis
    val zAxisOuter: js.UndefOr[CleanJsObject[ZAxis]] = zAxis
    val navigatorOuter: js.Any = navigator
    val colorsOuter: js.UndefOr[js.Array[String | js.Object]] = colors
    val timeOuter: js.Any = time
    val titleOuter: js.Any = title
    val subtitleOuter: js.Any = subtitle
    val labelsOuter: js.Any = labels
    val loadingOuter: js.Any = loading
    val tooltipOuter: js.Any = tooltip
    val creditsOuter: js.Any = credits
    val rangeSelectorOuter: js.Any = rangeSelector
    val responsiveOuter: js.Any = responsive
    val scrollbarOuter: js.Any = scrollbar
    val paneOuter: js.Any = pane
    val colorAxisOuter: js.Any = colorAxis
    val mapNavigationOuter: js.Any = mapNavigation
    val pathfinderOuter: js.Any = pathfinder
    com.highcharts.HighchartsGenericObject.toCleanObject(new HighmapsConfig {
      override val series: js.UndefOr[js.Array[js.Any]] = seriesOuter
      override val plotOptions: js.Any = plotOptionsOuter
      override val lang: js.Any = langOuter
      override val defs: js.Any = defsOuter
      override val annotations: js.UndefOr[js.Array[CleanJsObject[Annotations]]] = annotationsOuter
      override val boost: js.UndefOr[CleanJsObject[Boost]] = boostOuter
      override val data: js.Any = dataOuter
      override val yAxis: js.Any = yAxisOuter
      override val chart: js.Any = chartOuter
      override val drilldown: js.UndefOr[CleanJsObject[Drilldown]] = drilldownOuter
      override val exporting: js.UndefOr[CleanJsObject[Exporting]] = exportingOuter
      override val navigation: js.UndefOr[CleanJsObject[Navigation]] = navigationOuter
      override val accessibility: js.UndefOr[CleanJsObject[Accessibility]] = accessibilityOuter
      override val legend: js.Any = legendOuter
      override val noData: js.UndefOr[CleanJsObject[NoData]] = noDataOuter
      override val global: js.Any = globalOuter
      override val xAxis: js.Any = xAxisOuter
      override val zAxis: js.UndefOr[CleanJsObject[ZAxis]] = zAxisOuter
      override val navigator: js.Any = navigatorOuter
      override val colors: js.UndefOr[js.Array[String | js.Object]] = colorsOuter
      override val time: js.Any = timeOuter
      override val title: js.Any = titleOuter
      override val subtitle: js.Any = subtitleOuter
      override val labels: js.Any = labelsOuter
      override val loading: js.Any = loadingOuter
      override val tooltip: js.Any = tooltipOuter
      override val credits: js.Any = creditsOuter
      override val rangeSelector: js.Any = rangeSelectorOuter
      override val responsive: js.Any = responsiveOuter
      override val scrollbar: js.Any = scrollbarOuter
      override val pane: js.Any = paneOuter
      override val colorAxis: js.Any = colorAxisOuter
      override val mapNavigation: js.Any = mapNavigationOuter
      override val pathfinder: js.Any = pathfinderOuter
    })
  }
}
