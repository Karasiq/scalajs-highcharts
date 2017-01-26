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
  * @note JavaScript name: <code>HighchartsConfig</code>
  */
@js.annotation.ScalaJSDefined
class HighchartsConfig extends js.Object {

  /**
    * The actual series to append to the chart. In addition to 
    * 	the members listed below, any member of the <code>plotOptions</code> for that specific
    * 	type of plot can be added to a series individually. For example, even though a general
    * 	<code>lineWidth</code> is specified in <code>plotOptions.series</code>, an individual
    * 	<code>lineWidth</code> can be specified for each series.
    */
  val series: js.UndefOr[js.Array[CleanJsObject[SeriesArea | SeriesArearange | SeriesAreaspline | SeriesAreasplinerange | SeriesBar | SeriesBoxplot | SeriesBubble | SeriesColumn | SeriesColumnrange | SeriesErrorbar | SeriesFunnel | SeriesGauge | SeriesHeatmap | SeriesLine | SeriesPie | SeriesPolygon | SeriesPyramid | SeriesScatter | SeriesSolidgauge | SeriesSpline | SeriesTreemap | SeriesWaterfall]]] = js.undefined

  /**
    * <p>Options for configuring accessibility for the chart. Requires the <a href="//code.highcharts.com/modules/accessibility.js">accessibility module</a> to be loaded. For a description of the module and information on its features, see <a href="http://www.highcharts.com/docs/chart-concepts/accessibility">Highcharts Accessibility</a>.</p>
    * @since 5.0.0
    */
  val accessibility: js.UndefOr[CleanJsObject[Accessibility]] = js.undefined

  /**
    * Options regarding the chart area and plot area as well as general chart options.
    */
  val chart: js.UndefOr[CleanJsObject[Chart]] = js.undefined

  /**
    * <p>An array containing the default colors for the chart's series. When all colors are used, new colors are pulled from the start again. Defaults to:
    * <pre>colors: ['#7cb5ec', '#434348', '#90ed7d', '#f7a35c', '#8085e9', 
    *    '#f15c80', '#e4d354', '#2b908f', '#f45b5b', '#91e8e1']</pre>
    * 
    * Default colors can also be set on a series or series.type basis, see <a href="#plotOptions.column.colors">column.colors</a>, <a href="#plotOptions.pie.colors">pie.colors</a>.
    * </p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the colors option doesn't exist. Instead, colors are defined in CSS and applied either through series or point class names, or through the <a href="#chart.colorCount">chart.colorCount</a> option.</p>
    * 
    * <h3>Legacy</h3>
    * <p>In Highcharts 3.x, the default colors were:
    * <pre>colors: ['#2f7ed8', '#0d233a', '#8bbc21', '#910000', '#1aadce', 
    *    '#492970', '#f28f43', '#77a1e5', '#c42525', '#a6c96a']</pre>
    * </p>
    * 
    * <p>In Highcharts 2.x, the default colors were:
    * <pre>colors: ['#4572A7', '#AA4643', '#89A54E', '#80699B', '#3D96AE', 
    *    '#DB843D', '#92A8CD', '#A47D7C', '#B5CA92']</pre></p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/chart/colors/" target="_blank">Assign a global color theme</a>
    */
  val colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined

  /**
    * Highchart by default puts a credits label in the lower right corner of the chart.
    * 		This can be changed using these options.
    */
  val credits: js.UndefOr[CleanJsObject[Credits]] = js.undefined

  /**
    * <p>The Data module provides a simplified interface for adding data to a chart from sources like CVS, HTML tables or grid views. See also the <a href="http://www.highcharts.com/docs/working-with-data/data-module">tutorial article on the Data module</a>.</p>
    * 
    * <p>It requires the <code>modules/data.js</code> file to be loaded.</p>
    * 
    * <p>Please note that the default way of adding data in Highcharts, without the need of a module, is through the <a href="#series.data">series.data</a> option.</p>
    * @example Data from a <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/demo/column-parsed/" target="_blank">HTML table</a>, <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/data/csv/" target="_blank">CSV</a>.
    * @since 4.0
    */
  val data: js.UndefOr[CleanJsObject[Data]] = js.undefined

  /**
    * <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">Styled mode</a> only. Configuration object for adding SVG definitions for reusable elements. See <a href="http://www.highcharts.com/docs/chart-design-and-style/gradients-shadows-and-patterns">gradients, shadows and patterns</a> for more information and code examples.
    * @since 5.0.0
    */
  val defs: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Options for drill down, the concept of inspecting increasingly high resolution data through clicking on chart items like columns or pie slices.</p>
    * 
    * <p>The drilldown feature requires the <code>drilldown.js</code> file to be loaded, found in the <code>modules</code> directory of the download package, or online at <a href="http://code.highcharts.com/modules/drilldown.js">code.highcharts.com/modules/drilldown.js</a>.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/drilldown/basic/" target="_blank">Basic drilldown</a>, <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/drilldown/multi-series/" target="_blank">multi series drilldown</a>, <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/demo/column-drilldown/" target="_blank">generated column drilldown</a>, <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-drilldown/" target="_blank">pie drilldown</a>, <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/drilldown/across-types/" target="_blank">drilldown across series types</a>.
    * @since 3.0.8
    */
  val drilldown: js.UndefOr[CleanJsObject[Drilldown]] = js.undefined

  /**
    * Options for the exporting module. For an overview on the matter, see <a href="http://www.highcharts.com/docs/export-module/export-module-overview">the docs</a>.
    */
  val exporting: js.UndefOr[CleanJsObject[Exporting]] = js.undefined

  /**
    * Global options that don't apply to each chart. These options, like the <code>lang</code>
    * 		options, must be set using the <code>Highcharts.setOptions</code> method.
    * <pre>Highcharts.setOptions({
    * 	global: {
    * 		useUTC: false
    * 	}
    * });</pre>
    */
  val global: js.UndefOr[CleanJsObject[Global]] = js.undefined

  /**
    * HTML labels that can be positioned anywhere in the chart area.
    */
  val labels: js.UndefOr[CleanJsObject[Labels]] = js.undefined

  /**
    * Language object. The language object is global and it can't
    * 		be set on each chart initiation. Instead, use <code>Highcharts.setOptions</code> to
    * 		set it before any chart is initiated. 
    * <pre>Highcharts.setOptions({
    * 	lang: {
    * 		months: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin',  'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
    * 		weekdays: ['Dimanche', 'Lundi', 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi']
    * 	}
    * });</pre>
    */
  val lang: js.UndefOr[CleanJsObject[Lang]] = js.undefined

  /**
    * <p>The legend is a box containing a symbol and name for each series item or point item in the chart. Each series (or points in case of pie charts) is represented by a symbol and its name in the legend.</p>
    * 
    * <p>It is also possible to override the symbol creator function and create <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/studies/legend-custom-symbol/">custom legend symbols</a>.</p>
    */
  val legend: js.UndefOr[CleanJsObject[Legend]] = js.undefined

  /**
    * The loading options control the appearance of the loading screen that covers the 
    * 	plot area on chart operations. This screen only appears after an explicit call
    * 	to <code>chart.showLoading()</code>. It is a utility for developers to communicate
    * 	to the end user that something is going on, for example while retrieving new data
    * 	via an XHR connection. The "Loading..." text itself is not part of this configuration
    * 	object, but part of the <code>lang</code> object.
    */
  val loading: js.UndefOr[CleanJsObject[Loading]] = js.undefined

  /**
    * A collection of options for buttons and menus appearing in the exporting module.
    */
  val navigation: js.UndefOr[CleanJsObject[Navigation]] = js.undefined

  /**
    * Options for displaying a message like "No data to display". This feature requires the file <code>no-data-to-display.js</code> to be loaded in the page. The actual text to display is set in the <a href="#lang.noData">lang.noData</a> option.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-line/" target="_blank">Line series</a>, <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-pie/" target="_blank">pie series</a>.
    * @since 3.0.8
    */
  val noData: js.UndefOr[CleanJsObject[NoData]] = js.undefined

  /**
    * Applies only to polar charts and angular gauges. This configuration object holds general options for the combined X and Y axes set. Each xAxis or yAxis can reference the pane by index.
    * @since 2.3.0
    */
  val pane: js.UndefOr[CleanJsObject[Pane]] = js.undefined

  /**
    * <p>The plotOptions is a wrapper object for config objects for each series type.
    * 		The config objects for each series can also be overridden for each series 
    * 		item as given in the series array.</p>
    * 		<p>Configuration options for the series are given in three levels. Options
    * 		for all series in a chart are given in the <a class="internal" href="#plotOptions.series">plotOptions.series</a> object. Then options for all series
    * 		of a specific type are given in the plotOptions of that type, for example plotOptions.line.
    * 		Next, options for one single series are given in <a class="internal" href="#series">the 
    * 		series array</a>.</p>
    */
  val plotOptions: js.UndefOr[CleanJsObject[PlotOptions]] = js.undefined

  /**
    * Allows setting a set of rules to apply for different screen or chart sizes. Each rule specifies additional chart options.
    * @example Responsive <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/" target="_blank">axis</a>, <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/responsive/legend/" target="_blank">legend</a> and <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/responsive/classname/" target="_blank">class name</a>.
    * @since 5.0.0
    */
  val responsive: js.UndefOr[CleanJsObject[Responsive]] = js.undefined

  /**
    * The chart's subtitle
    */
  val subtitle: js.UndefOr[CleanJsObject[Subtitle]] = js.undefined

  /**
    * The chart's main title.
    */
  val title: js.UndefOr[CleanJsObject[Title]] = js.undefined

  /**
    * Options for the tooltip that appears when the user hovers over a series or point.
    */
  val tooltip: js.UndefOr[CleanJsObject[Tooltip]] = js.undefined

  /**
    * <p>The X axis or category axis. Normally this is the horizontal axis, though if the 
    * 	chart is inverted this is the vertical axis. In case of multiple axes, the xAxis
    * 	node is an array of configuration objects.</p>
    * 	<p>See <a class="internal" href="#Axis">the Axis object</a> for programmatic
    * 	access to the axis.</p>
    */
  val xAxis: js.UndefOr[js.Array[CleanJsObject[XAxis]]] = js.undefined

  /**
    * <p>The Y axis or value axis. Normally this is the vertical axis, though if the 
    * 	chart is inverted this is the horizontal axis. In case of multiple axes, the yAxis
    * 	node is an array of configuration objects.</p>
    * 	<p>See <a class="internal" href="#Axis">the Axis object</a> for programmatic
    * 	access to the axis.</p>
    */
  val yAxis: js.UndefOr[js.Array[CleanJsObject[YAxis]]] = js.undefined

  /**
    * <p>The Z axis or depth axis for 3D plots.</p>
    * 	<p>See <a class="internal" href="#Axis">the Axis object</a> for programmatic
    * 	access to the axis.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter-zaxis-categories/" target="_blank">Z-Axis with Categories</a>, <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter-zaxis-grid/" target="_blank">Z-Axis with styling</a>
    * @since 5.0.0
    */
  val zAxis: js.UndefOr[CleanJsObject[ZAxis]] = js.undefined
}

object HighchartsConfig {
  /**
    * @param series The actual series to append to the chart. In addition to . 	the members listed below, any member of the <code>plotOptions</code> for that specific. 	type of plot can be added to a series individually. For example, even though a general. 	<code>lineWidth</code> is specified in <code>plotOptions.series</code>, an individual. 	<code>lineWidth</code> can be specified for each series.
    * @param accessibility <p>Options for configuring accessibility for the chart. Requires the <a href="//code.highcharts.com/modules/accessibility.js">accessibility module</a> to be loaded. For a description of the module and information on its features, see <a href="http://www.highcharts.com/docs/chart-concepts/accessibility">Highcharts Accessibility</a>.</p>
    * @param chart Options regarding the chart area and plot area as well as general chart options.
    * @param colors <p>An array containing the default colors for the chart's series. When all colors are used, new colors are pulled from the start again. Defaults to:. <pre>colors: ['#7cb5ec', '#434348', '#90ed7d', '#f7a35c', '#8085e9', .    '#f15c80', '#e4d354', '#2b908f', '#f45b5b', '#91e8e1']</pre>. . Default colors can also be set on a series or series.type basis, see <a href="#plotOptions.column.colors">column.colors</a>, <a href="#plotOptions.pie.colors">pie.colors</a>.. </p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the colors option doesn't exist. Instead, colors are defined in CSS and applied either through series or point class names, or through the <a href="#chart.colorCount">chart.colorCount</a> option.</p>. . <h3>Legacy</h3>. <p>In Highcharts 3.x, the default colors were:. <pre>colors: ['#2f7ed8', '#0d233a', '#8bbc21', '#910000', '#1aadce', .    '#492970', '#f28f43', '#77a1e5', '#c42525', '#a6c96a']</pre>. </p>. . <p>In Highcharts 2.x, the default colors were:. <pre>colors: ['#4572A7', '#AA4643', '#89A54E', '#80699B', '#3D96AE', .    '#DB843D', '#92A8CD', '#A47D7C', '#B5CA92']</pre></p>
    * @param credits Highchart by default puts a credits label in the lower right corner of the chart.. 		This can be changed using these options.
    * @param data <p>The Data module provides a simplified interface for adding data to a chart from sources like CVS, HTML tables or grid views. See also the <a href="http://www.highcharts.com/docs/working-with-data/data-module">tutorial article on the Data module</a>.</p>. . <p>It requires the <code>modules/data.js</code> file to be loaded.</p>. . <p>Please note that the default way of adding data in Highcharts, without the need of a module, is through the <a href="#series.data">series.data</a> option.</p>
    * @param defs <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">Styled mode</a> only. Configuration object for adding SVG definitions for reusable elements. See <a href="http://www.highcharts.com/docs/chart-design-and-style/gradients-shadows-and-patterns">gradients, shadows and patterns</a> for more information and code examples.
    * @param drilldown <p>Options for drill down, the concept of inspecting increasingly high resolution data through clicking on chart items like columns or pie slices.</p>. . <p>The drilldown feature requires the <code>drilldown.js</code> file to be loaded, found in the <code>modules</code> directory of the download package, or online at <a href="http://code.highcharts.com/modules/drilldown.js">code.highcharts.com/modules/drilldown.js</a>.</p>
    * @param exporting Options for the exporting module. For an overview on the matter, see <a href="http://www.highcharts.com/docs/export-module/export-module-overview">the docs</a>.
    * @param global Global options that don't apply to each chart. These options, like the <code>lang</code>. 		options, must be set using the <code>Highcharts.setOptions</code> method.. <pre>Highcharts.setOptions({. 	global: {. 		useUTC: false. 	}. });</pre>
    * @param labels HTML labels that can be positioned anywhere in the chart area.
    * @param lang Language object. The language object is global and it can't. 		be set on each chart initiation. Instead, use <code>Highcharts.setOptions</code> to. 		set it before any chart is initiated. . <pre>Highcharts.setOptions({. 	lang: {. 		months: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin',  'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],. 		weekdays: ['Dimanche', 'Lundi', 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi']. 	}. });</pre>
    * @param legend <p>The legend is a box containing a symbol and name for each series item or point item in the chart. Each series (or points in case of pie charts) is represented by a symbol and its name in the legend.</p>. . <p>It is also possible to override the symbol creator function and create <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/studies/legend-custom-symbol/">custom legend symbols</a>.</p>
    * @param loading The loading options control the appearance of the loading screen that covers the . 	plot area on chart operations. This screen only appears after an explicit call. 	to <code>chart.showLoading()</code>. It is a utility for developers to communicate. 	to the end user that something is going on, for example while retrieving new data. 	via an XHR connection. The "Loading..." text itself is not part of this configuration. 	object, but part of the <code>lang</code> object.
    * @param navigation A collection of options for buttons and menus appearing in the exporting module.
    * @param noData Options for displaying a message like "No data to display". This feature requires the file <code>no-data-to-display.js</code> to be loaded in the page. The actual text to display is set in the <a href="#lang.noData">lang.noData</a> option.
    * @param pane Applies only to polar charts and angular gauges. This configuration object holds general options for the combined X and Y axes set. Each xAxis or yAxis can reference the pane by index.
    * @param plotOptions <p>The plotOptions is a wrapper object for config objects for each series type.. 		The config objects for each series can also be overridden for each series . 		item as given in the series array.</p>. 		<p>Configuration options for the series are given in three levels. Options. 		for all series in a chart are given in the <a class="internal" href="#plotOptions.series">plotOptions.series</a> object. Then options for all series. 		of a specific type are given in the plotOptions of that type, for example plotOptions.line.. 		Next, options for one single series are given in <a class="internal" href="#series">the . 		series array</a>.</p>
    * @param responsive Allows setting a set of rules to apply for different screen or chart sizes. Each rule specifies additional chart options.
    * @param subtitle The chart's subtitle
    * @param title The chart's main title.
    * @param tooltip Options for the tooltip that appears when the user hovers over a series or point.
    * @param xAxis <p>The X axis or category axis. Normally this is the horizontal axis, though if the . 	chart is inverted this is the vertical axis. In case of multiple axes, the xAxis. 	node is an array of configuration objects.</p>. 	<p>See <a class="internal" href="#Axis">the Axis object</a> for programmatic. 	access to the axis.</p>
    * @param yAxis <p>The Y axis or value axis. Normally this is the vertical axis, though if the . 	chart is inverted this is the horizontal axis. In case of multiple axes, the yAxis. 	node is an array of configuration objects.</p>. 	<p>See <a class="internal" href="#Axis">the Axis object</a> for programmatic. 	access to the axis.</p>
    * @param zAxis <p>The Z axis or depth axis for 3D plots.</p>. 	<p>See <a class="internal" href="#Axis">the Axis object</a> for programmatic. 	access to the axis.</p>
    */
  def apply(series: js.UndefOr[js.Array[CleanJsObject[SeriesArea | SeriesArearange | SeriesAreaspline | SeriesAreasplinerange | SeriesBar | SeriesBoxplot | SeriesBubble | SeriesColumn | SeriesColumnrange | SeriesErrorbar | SeriesFunnel | SeriesGauge | SeriesHeatmap | SeriesLine | SeriesPie | SeriesPolygon | SeriesPyramid | SeriesScatter | SeriesSolidgauge | SeriesSpline | SeriesTreemap | SeriesWaterfall]]] = js.undefined, accessibility: js.UndefOr[CleanJsObject[Accessibility]] = js.undefined, chart: js.UndefOr[CleanJsObject[Chart]] = js.undefined, colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined, credits: js.UndefOr[CleanJsObject[Credits]] = js.undefined, data: js.UndefOr[CleanJsObject[Data]] = js.undefined, defs: js.UndefOr[js.Object] = js.undefined, drilldown: js.UndefOr[CleanJsObject[Drilldown]] = js.undefined, exporting: js.UndefOr[CleanJsObject[Exporting]] = js.undefined, global: js.UndefOr[CleanJsObject[Global]] = js.undefined, labels: js.UndefOr[CleanJsObject[Labels]] = js.undefined, lang: js.UndefOr[CleanJsObject[Lang]] = js.undefined, legend: js.UndefOr[CleanJsObject[Legend]] = js.undefined, loading: js.UndefOr[CleanJsObject[Loading]] = js.undefined, navigation: js.UndefOr[CleanJsObject[Navigation]] = js.undefined, noData: js.UndefOr[CleanJsObject[NoData]] = js.undefined, pane: js.UndefOr[CleanJsObject[Pane]] = js.undefined, plotOptions: js.UndefOr[CleanJsObject[PlotOptions]] = js.undefined, responsive: js.UndefOr[CleanJsObject[Responsive]] = js.undefined, subtitle: js.UndefOr[CleanJsObject[Subtitle]] = js.undefined, title: js.UndefOr[CleanJsObject[Title]] = js.undefined, tooltip: js.UndefOr[CleanJsObject[Tooltip]] = js.undefined, xAxis: js.UndefOr[js.Array[CleanJsObject[XAxis]]] = js.undefined, yAxis: js.UndefOr[js.Array[CleanJsObject[YAxis]]] = js.undefined, zAxis: js.UndefOr[CleanJsObject[ZAxis]] = js.undefined): HighchartsConfig = {
    val seriesOuter: js.UndefOr[js.Array[CleanJsObject[SeriesArea | SeriesArearange | SeriesAreaspline | SeriesAreasplinerange | SeriesBar | SeriesBoxplot | SeriesBubble | SeriesColumn | SeriesColumnrange | SeriesErrorbar | SeriesFunnel | SeriesGauge | SeriesHeatmap | SeriesLine | SeriesPie | SeriesPolygon | SeriesPyramid | SeriesScatter | SeriesSolidgauge | SeriesSpline | SeriesTreemap | SeriesWaterfall]]] = series
    val accessibilityOuter: js.UndefOr[CleanJsObject[Accessibility]] = accessibility
    val chartOuter: js.UndefOr[CleanJsObject[Chart]] = chart
    val colorsOuter: js.UndefOr[js.Array[String | js.Object]] = colors
    val creditsOuter: js.UndefOr[CleanJsObject[Credits]] = credits
    val dataOuter: js.UndefOr[CleanJsObject[Data]] = data
    val defsOuter: js.UndefOr[js.Object] = defs
    val drilldownOuter: js.UndefOr[CleanJsObject[Drilldown]] = drilldown
    val exportingOuter: js.UndefOr[CleanJsObject[Exporting]] = exporting
    val globalOuter: js.UndefOr[CleanJsObject[Global]] = global
    val labelsOuter: js.UndefOr[CleanJsObject[Labels]] = labels
    val langOuter: js.UndefOr[CleanJsObject[Lang]] = lang
    val legendOuter: js.UndefOr[CleanJsObject[Legend]] = legend
    val loadingOuter: js.UndefOr[CleanJsObject[Loading]] = loading
    val navigationOuter: js.UndefOr[CleanJsObject[Navigation]] = navigation
    val noDataOuter: js.UndefOr[CleanJsObject[NoData]] = noData
    val paneOuter: js.UndefOr[CleanJsObject[Pane]] = pane
    val plotOptionsOuter: js.UndefOr[CleanJsObject[PlotOptions]] = plotOptions
    val responsiveOuter: js.UndefOr[CleanJsObject[Responsive]] = responsive
    val subtitleOuter: js.UndefOr[CleanJsObject[Subtitle]] = subtitle
    val titleOuter: js.UndefOr[CleanJsObject[Title]] = title
    val tooltipOuter: js.UndefOr[CleanJsObject[Tooltip]] = tooltip
    val xAxisOuter: js.UndefOr[js.Array[CleanJsObject[XAxis]]] = xAxis
    val yAxisOuter: js.UndefOr[js.Array[CleanJsObject[YAxis]]] = yAxis
    val zAxisOuter: js.UndefOr[CleanJsObject[ZAxis]] = zAxis
    new HighchartsConfig {
      override val series: js.UndefOr[js.Array[CleanJsObject[SeriesArea | SeriesArearange | SeriesAreaspline | SeriesAreasplinerange | SeriesBar | SeriesBoxplot | SeriesBubble | SeriesColumn | SeriesColumnrange | SeriesErrorbar | SeriesFunnel | SeriesGauge | SeriesHeatmap | SeriesLine | SeriesPie | SeriesPolygon | SeriesPyramid | SeriesScatter | SeriesSolidgauge | SeriesSpline | SeriesTreemap | SeriesWaterfall]]] = seriesOuter
      override val accessibility: js.UndefOr[CleanJsObject[Accessibility]] = accessibilityOuter
      override val chart: js.UndefOr[CleanJsObject[Chart]] = chartOuter
      override val colors: js.UndefOr[js.Array[String | js.Object]] = colorsOuter
      override val credits: js.UndefOr[CleanJsObject[Credits]] = creditsOuter
      override val data: js.UndefOr[CleanJsObject[Data]] = dataOuter
      override val defs: js.UndefOr[js.Object] = defsOuter
      override val drilldown: js.UndefOr[CleanJsObject[Drilldown]] = drilldownOuter
      override val exporting: js.UndefOr[CleanJsObject[Exporting]] = exportingOuter
      override val global: js.UndefOr[CleanJsObject[Global]] = globalOuter
      override val labels: js.UndefOr[CleanJsObject[Labels]] = labelsOuter
      override val lang: js.UndefOr[CleanJsObject[Lang]] = langOuter
      override val legend: js.UndefOr[CleanJsObject[Legend]] = legendOuter
      override val loading: js.UndefOr[CleanJsObject[Loading]] = loadingOuter
      override val navigation: js.UndefOr[CleanJsObject[Navigation]] = navigationOuter
      override val noData: js.UndefOr[CleanJsObject[NoData]] = noDataOuter
      override val pane: js.UndefOr[CleanJsObject[Pane]] = paneOuter
      override val plotOptions: js.UndefOr[CleanJsObject[PlotOptions]] = plotOptionsOuter
      override val responsive: js.UndefOr[CleanJsObject[Responsive]] = responsiveOuter
      override val subtitle: js.UndefOr[CleanJsObject[Subtitle]] = subtitleOuter
      override val title: js.UndefOr[CleanJsObject[Title]] = titleOuter
      override val tooltip: js.UndefOr[CleanJsObject[Tooltip]] = tooltipOuter
      override val xAxis: js.UndefOr[js.Array[CleanJsObject[XAxis]]] = xAxisOuter
      override val yAxis: js.UndefOr[js.Array[CleanJsObject[YAxis]]] = yAxisOuter
      override val zAxis: js.UndefOr[CleanJsObject[ZAxis]] = zAxisOuter
    }
  }
}
