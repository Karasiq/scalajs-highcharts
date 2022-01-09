/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>HighchartsConfig</code>
  */
class HighchartsConfig extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Options for configuring accessibility for the chart. Requires the
    * <a href="https://code.highcharts.com/modules/accessibility.js">accessibility module</a>
    * to be loaded. For a description of the module and information
    * on its features, see
    * <a href="https://www.highcharts.com/docs/accessibility/accessibility-module">Highcharts Accessibility</a>.</p>
    * @since 5.0.0
    */
  var accessibility: js.Any = js.undefined

  /**
    * <p>A basic type of an annotation. It allows to add custom labels
    * or shapes. The items  can be tied to points, axis coordinates
    * or chart pixel coordinates.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/basic/">Basic annotations</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/annotations/">Advanced annotations</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/annotations">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations-advanced/controllable">Controllable items</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/annotations/fibonacci-retracements">Custom annotation, Fibonacci retracement</a>
    * @since 6.0.0
    */
  var annotations: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>Options for the Boost module. The Boost module allows certain series types
    * to be rendered by WebGL instead of the default SVG. This allows hundreds of
    * thousands of data points to be rendered in milliseconds. In addition to the
    * WebGL rendering it saves time by skipping processing and inspection of the
    * data wherever possible. This introduces some limitations to what features are
    * available in boost mode. See <a href="https://www.highcharts.com/docs/advanced-chart-features/boost-module">the docs</a> for
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
  var boost: js.Any = js.undefined

  /**
    * <p>The chart&#39;s caption, which will render below the chart and will be part
    * of exported charts. The caption can be updated after chart initialization
    * through the <code>Chart.update</code> or <code>Chart.caption.update</code> methods.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/caption/text/">A chart with a caption</a>
    * @since 7.2.0
    */
  var caption: js.Any = js.undefined

  /**
    * <p>General options for the chart.</p>
    */
  var chart: js.Any = js.undefined

  /**
    * <p>A color axis for series. Visually, the color
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
    * <p>Color axis does not work with: <code>sankey</code>, <code>sunburst</code>, <code>dependencywheel</code>,
    * <code>networkgraph</code>, <code>wordcloud</code>, <code>venn</code>, <code>gauge</code> and <code>solidgauge</code> series
    * types.</p>
    * <p>Since v7.2.0 <code>colorAxis</code> can also be an array of options objects.</p>
    * <p>See <a href="/class-reference/Highcharts.Axis">the Axis object</a> for
    * programmatic access to the axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/custom-color-key">Column chart with color axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/horizontal-layout">Horizontal layout</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/dataclasscolor">With data classes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/mincolor-maxcolor">Min color and max color</a>
    */
  var colorAxis: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined

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
    * <pre><code class="language-js">colors: [&#39;#2f7ed8&#39;, &#39;#0d233a&#39;, &#39;#8bbc21&#39;, &#39;#910000&#39;, &#39;#1aadce&#39;,
    *         &#39;#492970&#39;, &#39;#f28f43&#39;, &#39;#77a1e5&#39;, &#39;#c42525&#39;, &#39;#a6c96a&#39;]
    * </code></pre>
    * <p>In Highcharts 2.x, the default colors were:</p>
    * <pre><code class="language-js">colors: [&#39;#4572A7&#39;, &#39;#AA4643&#39;, &#39;#89A54E&#39;, &#39;#80699B&#39;, &#39;#3D96AE&#39;,
    *         &#39;#DB843D&#39;, &#39;#92A8CD&#39;, &#39;#A47D7C&#39;, &#39;#B5CA92&#39;]
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/colors/">Assign a global color theme</a>
    */
  var colors: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>The Pathfinder module allows you to define connections between any two
    * points, represented as lines - optionally with markers for the start
    * and/or end points. Multiple algorithms are available for calculating how
    * the connecting lines are drawn.</p>
    * <p>Connector functionality requires Highcharts Gantt to be loaded. In Gantt
    * charts, the connectors are used to draw dependencies between tasks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/pathfinder/demo">Pathfinder connections</a>
    */
  var connectors: js.Any = js.undefined

  /**
    * <p>Highchart by default puts a credits label in the lower right corner
    * of the chart. This can be changed using these options.</p>
    */
  var credits: js.Any = js.undefined

  /**
    * <p>The Data module provides a simplified interface for adding data to
    * a chart from sources like CVS, HTML tables or grid views. See also
    * the <a href="https://www.highcharts.com/docs/working-with-data/data-module">tutorial article on the Data module</a>.</p>
    * <p>It requires the <code>modules/data.js</code> file to be loaded.</p>
    * <p>Please note that the default way of adding data in Highcharts, without
    * the need of a module, is through the <a href="#series.line.data">series.<em>type</em>.data</a>
    * option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/column-parsed/">HTML table</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/csv/">CSV</a>
    * @since 4.0.0
    */
  var data: js.Any = js.undefined

  /**
    * <p>Options for configuring markers for annotations.</p>
    * <p>An example of the arrow marker:</p>
    * <pre>
    * {
    *   arrow: {
    *     id: 'arrow',
    *     tagName: 'marker',
    *     refY: 5,
    *     refX: 5,
    *     markerWidth: 10,
    *     markerHeight: 10,
    *     children: [{
    *       tagName: 'path',
    *       attrs: {
    *         d: 'M 0 0 L 10 5 L 0 10 Z',
    *         'stroke-width': 0
    *       }
    *     }]
    *   }
    * }
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/custom-markers/">Define a custom marker for annotations</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/annotations-markers/">Define markers in a styled mode</a>
    * @since 6.0.0
    */
  var defs: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Options for drill down, the concept of inspecting increasingly high
    * resolution data through clicking on chart items like columns or pie slices.</p>
    * <p>The drilldown feature requires the drilldown.js file to be loaded,
    * found in the modules directory of the download package, or online at
    * <a href="https://code.highcharts.com/modules/drilldown.js">code.highcharts.com/modules/drilldown.js</a>.</p>
    */
  var drilldown: js.Any = js.undefined

  /**
    * <p>Options for the exporting module. For an overview on the matter, see
    * <a href="https://www.highcharts.com/docs/export-module/export-module-overview">the docs</a>.</p>
    */
  var exporting: js.Any = js.undefined

  var global: js.Any = js.undefined

  /**
    * <p>HTML labels that can be positioned anywhere in the chart area.</p>
    * <p>This option is deprecated since v7.1.2. Instead, use
    * <a href="#annotations">annotations</a> that support labels.</p>
    */
  var labels: js.Any = js.undefined

  /**
    * <p>Language object. The language object is global and it can&#39;t be set
    * on each chart initialization. Instead, use <code>Highcharts.setOptions</code> to
    * set it before any chart is initialized.</p>
    * <pre><code class="language-js">Highcharts.setOptions({
    *     lang: {
    *         months: [
    *             &#39;Janvier&#39;, &#39;Février&#39;, &#39;Mars&#39;, &#39;Avril&#39;,
    *             &#39;Mai&#39;, &#39;Juin&#39;, &#39;Juillet&#39;, &#39;Août&#39;,
    *             &#39;Septembre&#39;, &#39;Octobre&#39;, &#39;Novembre&#39;, &#39;Décembre&#39;
    *         ],
    *         weekdays: [
    *             &#39;Dimanche&#39;, &#39;Lundi&#39;, &#39;Mardi&#39;, &#39;Mercredi&#39;,
    *             &#39;Jeudi&#39;, &#39;Vendredi&#39;, &#39;Samedi&#39;
    *         ]
    *     }
    * });
    * </code></pre>
    */
  var lang: js.Any = js.undefined

  /**
    * <p>The legend is a box containing a symbol and name for each series
    * item or point item in the chart. Each series (or points in case
    * of pie charts) is represented by a symbol and its name in the legend.</p>
    * <p>It is possible to override the symbol creator function and create
    * <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/studies/legend-custom-symbol/">custom legend symbols</a>.</p>
    */
  var legend: js.Any = js.undefined

  /**
    * <p>The loading options control the appearance of the loading screen
    * that covers the plot area on chart operations. This screen only
    * appears after an explicit call to <code>chart.showLoading()</code>. It is a
    * utility for developers to communicate to the end user that something
    * is going on, for example while retrieving new data via an XHR connection.
    * The &quot;Loading...&quot; text itself is not part of this configuration
    * object, but part of the <code>lang</code> object.</p>
    */
  var loading: js.Any = js.undefined

  /**
    * <p>The <code>mapNavigation</code> option handles buttons for navigation in addition to
    * mousewheel and doubleclick handlers for map zooming.</p>
    */
  var mapNavigation: js.Any = js.undefined

  /**
    * <p>The <code>mapView</code> options control the initial view of the chart, and how
    * projection is set up for raw geoJSON maps (beta as of v9.3).</p>
    * <p>To set the view dynamically after chart generation, see
    * <a href="/class-reference/Highcharts.MapView#setView">mapView.setView</a>.</p>
    * @since 9.3.0
    */
  var mapView: js.Any = js.undefined

  /**
    * <p>A collection of options for buttons and menus appearing in the exporting
    * module or in Stock Tools.</p>
    */
  var navigation: js.Any = js.undefined

  /**
    * <p>The navigator is a small series below the main series, displaying
    * a view of the entire data set. It provides tools to zoom in and
    * out on parts of the data as well as panning across the dataset.</p>
    */
  var navigator: js.Any = js.undefined

  /**
    * <p>Options for displaying a message like &quot;No data to display&quot;.
    * This feature requires the file no-data-to-display.js to be loaded in the
    * page. The actual text to display is set in the lang.noData option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-line">Line chart with no-data module</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-pie">Pie chart with no-data module</a>
    */
  var noData: js.Any = js.undefined

  /**
    * <p>The pane serves as a container for axes and backgrounds for circular
    * gauges and polar charts.</p>
    * @since 2.3.0
    */
  var pane: js.Any = js.undefined

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
  var plotOptions: js.Any = js.undefined

  /**
    * <p>The range selector is a tool for selecting ranges to display within
    * the chart. It provides buttons to select preconfigured ranges in
    * the chart, like 1 day, 1 week, 1 month etc. It also provides input
    * boxes where min and max dates can be manually input.</p>
    */
  var rangeSelector: js.Any = js.undefined

  /**
    * <p>Allows setting a set of rules to apply for different screen or chart
    * sizes. Each rule specifies additional chart options.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/responsive/">Stock chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/">Axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/legend/">Legend</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/classname/">Class name</a>
    * @since 5.0.0
    */
  var responsive: js.Any = js.undefined

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
  var scrollbar: js.Any = js.undefined

  /**
    * <p>Series options for specific data and the data itself. In TypeScript you
    * have to cast the series options to specific series types, to get all
    * possible options for a series.</p>
    */
  var series: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>Configure the stockTools gui strings in the chart. Requires the
    * <a href="">stockTools module</a> to be loaded. For a description of the module
    * and information on its features, see <a href="">Highcharts StockTools</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/stock-tools-gui">Stock Tools GUI</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/stock-tools-custom-gui">Stock Tools customized GUI</a>
    * @since 7.0.0
    */
  var stockTools: js.Any = js.undefined

  /**
    * <p>The chart&#39;s subtitle. This can be used both to display a subtitle below
    * the main title, and to display random text anywhere in the chart. The
    * subtitle can be updated after chart initialization through the
    * <code>Chart.setTitle</code> method.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/title/subtitle/">Subtitle options demonstrated</a>
    */
  var subtitle: js.Any = js.undefined

  /**
    * <p>Time options that can apply globally or to individual charts. These
    * settings affect how <code>datetime</code> axes are laid out, how tooltips are
    * formatted, how series
    * <a href="#plotOptions.series.pointIntervalUnit">pointIntervalUnit</a> works and how
    * the Highcharts Stock range selector handles time.</p>
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
    * let chart = Highcharts.chart(&#39;container&#39;, {
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
    * );
    * </code></pre>
    * <p>Since v6.0.5, the time options were moved from the <code>global</code> obect to the
    * <code>time</code> object, and time options can be set on each individual chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/timezone/">Set the timezone globally</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/individual/">Set the timezone per chart instance</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/time/individual/">Set the timezone per chart instance</a>
    * @since 6.0.5
    */
  var time: js.Any = js.undefined

  /**
    * <p>The chart&#39;s main title.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/title/title/">Title options demonstrated</a>
    */
  var title: js.Any = js.undefined

  /**
    * <p>Options for the tooltip that appears when the user hovers over a
    * series or point.</p>
    */
  var tooltip: js.Any = js.undefined

  /**
    * <p>The X axis or category axis. Normally this is the horizontal axis,
    * though if the chart is inverted this is the vertical axis. In case of
    * multiple axes, the xAxis node is an array of configuration objects.</p>
    * <p>See the <a href="/class-reference/Highcharts.Axis">Axis class</a> for programmatic
    * access to the axis.</p>
    */
  var xAxis: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined

  /**
    * <p>The Y axis or value axis. Normally this is the vertical axis,
    * though if the chart is inverted this is the horizontal axis.
    * In case of multiple axes, the yAxis node is an array of
    * configuration objects.</p>
    * <p>See <a href="/class-reference/Highcharts.Axis">the Axis object</a> for programmatic
    * access to the axis.</p>
    */
  var yAxis: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined

  /**
    * <p>The Z axis or depth axis for 3D plots.</p>
    * <p>See the <a href="/class-reference/Highcharts.Axis">Axis class</a> for programmatic
    * access to the axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter-zaxis-categories/">Z-Axis with Categories</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter-zaxis-grid/">Z-Axis with styling</a>
    * @since 5.0.0
    */
  var zAxis: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined
}

object HighchartsConfig {
  /**
    * @param accessibility <p>Options for configuring accessibility for the chart. Requires the. <a href="https://code.highcharts.com/modules/accessibility.js">accessibility module</a>. to be loaded. For a description of the module and information. on its features, see. <a href="https://www.highcharts.com/docs/accessibility/accessibility-module">Highcharts Accessibility</a>.</p>
    * @param annotations <p>A basic type of an annotation. It allows to add custom labels. or shapes. The items  can be tied to points, axis coordinates. or chart pixel coordinates.</p>
    * @param boost <p>Options for the Boost module. The Boost module allows certain series types. to be rendered by WebGL instead of the default SVG. This allows hundreds of. thousands of data points to be rendered in milliseconds. In addition to the. WebGL rendering it saves time by skipping processing and inspection of the. data wherever possible. This introduces some limitations to what features are. available in boost mode. See <a href="https://www.highcharts.com/docs/advanced-chart-features/boost-module">the docs</a> for. details.</p>. <p>In addition to the global <code>boost</code> option, each series has a. <a href="#plotOptions.series.boostThreshold">boostThreshold</a> that defines when the. boost should kick in.</p>. <p>Requires the <code>modules/boost.js</code> module.</p>
    * @param caption <p>The chart&#39;s caption, which will render below the chart and will be part. of exported charts. The caption can be updated after chart initialization. through the <code>Chart.update</code> or <code>Chart.caption.update</code> methods.</p>
    * @param chart <p>General options for the chart.</p>
    * @param colorAxis <p>A color axis for series. Visually, the color. axis will appear as a gradient or as separate items inside the. legend, depending on whether the axis is scalar or based on data. classes.</p>. <p>For supported color formats, see the. <a href="https://www.highcharts.com/docs/chart-design-and-style/colors">docs article about colors</a>.</p>. <p>A scalar color axis is represented by a gradient. The colors either. range between the <a href="#colorAxis.minColor">minColor</a> and the. <a href="#colorAxis.maxColor">maxColor</a>, or for more fine grained control the. colors can be defined in <a href="#colorAxis.stops">stops</a>. Often times, the. color axis needs to be adjusted to get the right color spread for the. data. In addition to stops, consider using a logarithmic. <a href="#colorAxis.type">axis type</a>, or setting <a href="#colorAxis.min">min</a> and. <a href="#colorAxis.max">max</a> to avoid the colors being determined by. outliers.</p>. <p>When <a href="#colorAxis.dataClasses">dataClasses</a> are used, the ranges are. subdivided into separate classes like categories based on their. values. This can be used for ranges between two values, but also for. a true category. However, when your data is categorized, it may be as. convenient to add each category to a separate series.</p>. <p>Color axis does not work with: <code>sankey</code>, <code>sunburst</code>, <code>dependencywheel</code>,. <code>networkgraph</code>, <code>wordcloud</code>, <code>venn</code>, <code>gauge</code> and <code>solidgauge</code> series. types.</p>. <p>Since v7.2.0 <code>colorAxis</code> can also be an array of options objects.</p>. <p>See <a href="/class-reference/Highcharts.Axis">the Axis object</a> for. programmatic access to the axis.</p>
    * @param colors <p>An array containing the default colors for the chart&#39;s series. When. all colors are used, new colors are pulled from the start again.</p>. <p>Default colors can also be set on a series or series.type basis,. see <a href="#plotOptions.column.colors">column.colors</a>,. <a href="#plotOptions.pie.colors">pie.colors</a>.</p>. <p>In styled mode, the colors option doesn&#39;t exist. Instead, colors. are defined in CSS and applied either through series or point class. names, or through the <a href="#chart.colorCount">chart.colorCount</a> option.</p>. <h3 id="legacy">Legacy</h3>. <p>In Highcharts 3.x, the default colors were:</p>. <pre><code class="language-js">colors: [&#39;#2f7ed8&#39;, &#39;#0d233a&#39;, &#39;#8bbc21&#39;, &#39;#910000&#39;, &#39;#1aadce&#39;,.         &#39;#492970&#39;, &#39;#f28f43&#39;, &#39;#77a1e5&#39;, &#39;#c42525&#39;, &#39;#a6c96a&#39;]. </code></pre>. <p>In Highcharts 2.x, the default colors were:</p>. <pre><code class="language-js">colors: [&#39;#4572A7&#39;, &#39;#AA4643&#39;, &#39;#89A54E&#39;, &#39;#80699B&#39;, &#39;#3D96AE&#39;,.         &#39;#DB843D&#39;, &#39;#92A8CD&#39;, &#39;#A47D7C&#39;, &#39;#B5CA92&#39;]. </code></pre>
    * @param connectors <p>The Pathfinder module allows you to define connections between any two. points, represented as lines - optionally with markers for the start. and/or end points. Multiple algorithms are available for calculating how. the connecting lines are drawn.</p>. <p>Connector functionality requires Highcharts Gantt to be loaded. In Gantt. charts, the connectors are used to draw dependencies between tasks.</p>
    * @param credits <p>Highchart by default puts a credits label in the lower right corner. of the chart. This can be changed using these options.</p>
    * @param data <p>The Data module provides a simplified interface for adding data to. a chart from sources like CVS, HTML tables or grid views. See also. the <a href="https://www.highcharts.com/docs/working-with-data/data-module">tutorial article on the Data module</a>.</p>. <p>It requires the <code>modules/data.js</code> file to be loaded.</p>. <p>Please note that the default way of adding data in Highcharts, without. the need of a module, is through the <a href="#series.line.data">series.<em>type</em>.data</a>. option.</p>
    * @param defs <p>Options for configuring markers for annotations.</p>. <p>An example of the arrow marker:</p>. <pre>. {.   arrow: {.     id: 'arrow',.     tagName: 'marker',.     refY: 5,.     refX: 5,.     markerWidth: 10,.     markerHeight: 10,.     children: [{.       tagName: 'path',.       attrs: {.         d: 'M 0 0 L 10 5 L 0 10 Z',.         'stroke-width': 0.       }.     }].   }. }. </pre>
    * @param drilldown <p>Options for drill down, the concept of inspecting increasingly high. resolution data through clicking on chart items like columns or pie slices.</p>. <p>The drilldown feature requires the drilldown.js file to be loaded,. found in the modules directory of the download package, or online at. <a href="https://code.highcharts.com/modules/drilldown.js">code.highcharts.com/modules/drilldown.js</a>.</p>
    * @param exporting <p>Options for the exporting module. For an overview on the matter, see. <a href="https://www.highcharts.com/docs/export-module/export-module-overview">the docs</a>.</p>
    * @param labels <p>HTML labels that can be positioned anywhere in the chart area.</p>. <p>This option is deprecated since v7.1.2. Instead, use. <a href="#annotations">annotations</a> that support labels.</p>
    * @param lang <p>Language object. The language object is global and it can&#39;t be set. on each chart initialization. Instead, use <code>Highcharts.setOptions</code> to. set it before any chart is initialized.</p>. <pre><code class="language-js">Highcharts.setOptions({.     lang: {.         months: [.             &#39;Janvier&#39;, &#39;Février&#39;, &#39;Mars&#39;, &#39;Avril&#39;,.             &#39;Mai&#39;, &#39;Juin&#39;, &#39;Juillet&#39;, &#39;Août&#39;,.             &#39;Septembre&#39;, &#39;Octobre&#39;, &#39;Novembre&#39;, &#39;Décembre&#39;.         ],.         weekdays: [.             &#39;Dimanche&#39;, &#39;Lundi&#39;, &#39;Mardi&#39;, &#39;Mercredi&#39;,.             &#39;Jeudi&#39;, &#39;Vendredi&#39;, &#39;Samedi&#39;.         ].     }. });. </code></pre>
    * @param legend <p>The legend is a box containing a symbol and name for each series. item or point item in the chart. Each series (or points in case. of pie charts) is represented by a symbol and its name in the legend.</p>. <p>It is possible to override the symbol creator function and create. <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/studies/legend-custom-symbol/">custom legend symbols</a>.</p>
    * @param loading <p>The loading options control the appearance of the loading screen. that covers the plot area on chart operations. This screen only. appears after an explicit call to <code>chart.showLoading()</code>. It is a. utility for developers to communicate to the end user that something. is going on, for example while retrieving new data via an XHR connection.. The &quot;Loading...&quot; text itself is not part of this configuration. object, but part of the <code>lang</code> object.</p>
    * @param mapNavigation <p>The <code>mapNavigation</code> option handles buttons for navigation in addition to. mousewheel and doubleclick handlers for map zooming.</p>
    * @param mapView <p>The <code>mapView</code> options control the initial view of the chart, and how. projection is set up for raw geoJSON maps (beta as of v9.3).</p>. <p>To set the view dynamically after chart generation, see. <a href="/class-reference/Highcharts.MapView#setView">mapView.setView</a>.</p>
    * @param navigation <p>A collection of options for buttons and menus appearing in the exporting. module or in Stock Tools.</p>
    * @param navigator <p>The navigator is a small series below the main series, displaying. a view of the entire data set. It provides tools to zoom in and. out on parts of the data as well as panning across the dataset.</p>
    * @param noData <p>Options for displaying a message like &quot;No data to display&quot;.. This feature requires the file no-data-to-display.js to be loaded in the. page. The actual text to display is set in the lang.noData option.</p>
    * @param pane <p>The pane serves as a container for axes and backgrounds for circular. gauges and polar charts.</p>
    * @param plotOptions <p>The plotOptions is a wrapper object for config objects for each series. type. The config objects for each series can also be overridden for. each series item as given in the series array.</p>. <p>Configuration options for the series are given in three levels. Options. for all series in a chart are given in the <a href="#plotOptions.series">plotOptions.series</a> object. Then options for all series of a specific. type are given in the plotOptions of that type, for example. <code>plotOptions.line</code>. Next, options for one single series are given in. <a href="#series">the series array</a>.</p>
    * @param rangeSelector <p>The range selector is a tool for selecting ranges to display within. the chart. It provides buttons to select preconfigured ranges in. the chart, like 1 day, 1 week, 1 month etc. It also provides input. boxes where min and max dates can be manually input.</p>
    * @param responsive <p>Allows setting a set of rules to apply for different screen or chart. sizes. Each rule specifies additional chart options.</p>
    * @param scrollbar <p>The scrollbar is a means of panning over the X axis of a stock chart.. Scrollbars can  also be applied to other types of axes.</p>. <p>Another approach to scrollable charts is the <a href="https://api.highcharts.com/highcharts/chart.scrollablePlotArea">chart.scrollablePlotArea</a> option that. is especially suitable for simpler cartesian charts on mobile.</p>. <p>In styled mode, all the presentational options for the. scrollbar are replaced by the classes <code>.highcharts-scrollbar-thumb</code>,. <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,. <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.</p>
    * @param series <p>Series options for specific data and the data itself. In TypeScript you. have to cast the series options to specific series types, to get all. possible options for a series.</p>
    * @param stockTools <p>Configure the stockTools gui strings in the chart. Requires the. <a href="">stockTools module</a> to be loaded. For a description of the module. and information on its features, see <a href="">Highcharts StockTools</a>.</p>
    * @param subtitle <p>The chart&#39;s subtitle. This can be used both to display a subtitle below. the main title, and to display random text anywhere in the chart. The. subtitle can be updated after chart initialization through the. <code>Chart.setTitle</code> method.</p>
    * @param time <p>Time options that can apply globally or to individual charts. These. settings affect how <code>datetime</code> axes are laid out, how tooltips are. formatted, how series. <a href="#plotOptions.series.pointIntervalUnit">pointIntervalUnit</a> works and how. the Highcharts Stock range selector handles time.</p>. <p>The common use case is that all charts in the same Highcharts object. share the same time settings, in which case the global settings are set. using <code>setOptions</code>.</p>. <pre><code class="language-js">// Apply time settings globally. Highcharts.setOptions({.     time: {.         timezone: &#39;Europe/London&#39;.     }. });. // Apply time settings by instance. let chart = Highcharts.chart(&#39;container&#39;, {.     time: {.         timezone: &#39;America/New_York&#39;.     },.     series: [{.         data: [1, 4, 3, 5].     }]. });. . // Use the Time object. console.log(.        &#39;Current time in New York&#39;,.        chart.time.dateFormat(&#39;%Y-%m-%d %H:%M:%S&#39;, Date.now()). );. </code></pre>. <p>Since v6.0.5, the time options were moved from the <code>global</code> obect to the. <code>time</code> object, and time options can be set on each individual chart.</p>
    * @param title <p>The chart&#39;s main title.</p>
    * @param tooltip <p>Options for the tooltip that appears when the user hovers over a. series or point.</p>
    * @param xAxis <p>The X axis or category axis. Normally this is the horizontal axis,. though if the chart is inverted this is the vertical axis. In case of. multiple axes, the xAxis node is an array of configuration objects.</p>. <p>See the <a href="/class-reference/Highcharts.Axis">Axis class</a> for programmatic. access to the axis.</p>
    * @param yAxis <p>The Y axis or value axis. Normally this is the vertical axis,. though if the chart is inverted this is the horizontal axis.. In case of multiple axes, the yAxis node is an array of. configuration objects.</p>. <p>See <a href="/class-reference/Highcharts.Axis">the Axis object</a> for programmatic. access to the axis.</p>
    * @param zAxis <p>The Z axis or depth axis for 3D plots.</p>. <p>See the <a href="/class-reference/Highcharts.Axis">Axis class</a> for programmatic. access to the axis.</p>
    */
  def apply(accessibility: js.UndefOr[js.Any] = js.undefined, annotations: js.UndefOr[js.Array[js.Any]] = js.undefined, boost: js.UndefOr[js.Any] = js.undefined, caption: js.UndefOr[js.Any] = js.undefined, chart: js.UndefOr[js.Any] = js.undefined, colorAxis: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined, colors: js.UndefOr[js.Array[String]] = js.undefined, connectors: js.UndefOr[js.Any] = js.undefined, credits: js.UndefOr[js.Any] = js.undefined, data: js.UndefOr[js.Any] = js.undefined, defs: js.UndefOr[js.Object] = js.undefined, drilldown: js.UndefOr[js.Any] = js.undefined, exporting: js.UndefOr[js.Any] = js.undefined, global: js.UndefOr[js.Any] = js.undefined, labels: js.UndefOr[js.Any] = js.undefined, lang: js.UndefOr[js.Any] = js.undefined, legend: js.UndefOr[js.Any] = js.undefined, loading: js.UndefOr[js.Any] = js.undefined, mapNavigation: js.UndefOr[js.Any] = js.undefined, mapView: js.UndefOr[js.Any] = js.undefined, navigation: js.UndefOr[js.Any] = js.undefined, navigator: js.UndefOr[js.Any] = js.undefined, noData: js.UndefOr[js.Any] = js.undefined, pane: js.UndefOr[js.Any] = js.undefined, plotOptions: js.UndefOr[js.Any] = js.undefined, rangeSelector: js.UndefOr[js.Any] = js.undefined, responsive: js.UndefOr[js.Any] = js.undefined, scrollbar: js.UndefOr[js.Any] = js.undefined, series: js.UndefOr[js.Array[js.Any]] = js.undefined, stockTools: js.UndefOr[js.Any] = js.undefined, subtitle: js.UndefOr[js.Any] = js.undefined, time: js.UndefOr[js.Any] = js.undefined, title: js.UndefOr[js.Any] = js.undefined, tooltip: js.UndefOr[js.Any] = js.undefined, xAxis: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined, yAxis: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined, zAxis: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined): HighchartsConfig = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new HighchartsConfig {
      this.accessibility = accessibility
      this.annotations = annotations
      this.boost = boost
      this.caption = caption
      this.chart = chart
      this.colorAxis = colorAxis
      this.colors = colors
      this.connectors = connectors
      this.credits = credits
      this.data = data
      this.defs = defs
      this.drilldown = drilldown
      this.exporting = exporting
      this.global = global
      this.labels = labels
      this.lang = lang
      this.legend = legend
      this.loading = loading
      this.mapNavigation = mapNavigation
      this.mapView = mapView
      this.navigation = navigation
      this.navigator = navigator
      this.noData = noData
      this.pane = pane
      this.plotOptions = plotOptions
      this.rangeSelector = rangeSelector
      this.responsive = responsive
      this.scrollbar = scrollbar
      this.series = series
      this.stockTools = stockTools
      this.subtitle = subtitle
      this.time = time
      this.title = title
      this.tooltip = tooltip
      this.xAxis = xAxis
      this.yAxis = yAxis
      this.zAxis = zAxis
    })
  }
}
