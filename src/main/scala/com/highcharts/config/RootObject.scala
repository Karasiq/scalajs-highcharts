/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.3 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class RootObject extends js.Object {
  
  /**
   * Options regarding the chart area and plot area as well as general chart options.
   */
  val chart: Chart = new Chart
  
  /**
   * <p>An array containing the default colors for the chart's series. When all colors are used, new colors are pulled from the start again. Defaults to:
   * <pre>colors: ['#7cb5ec', '#434348', '#90ed7d', '#f7a35c', '#8085e9', 
   *    '#f15c80', '#e4d354', '#2b908f', '#f45b5b', '#91e8e1']</pre>
   * 
   * Default colors can also be set on a series or series.type basis, see <a href="#plotOptions.column.colors">column.colors</a>, <a href="#plotOptions.pie.colors">pie.colors</a>.
   * </p>
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
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/colors/" target="_blank">Assign a global color theme</a>
   */
  val colors: js.Array[String] = js.Array( "#7cb5ec" , "#434348" , "#90ed7d" , "#f7a35c" , "#8085e9" , "#f15c80" , "#e4d354" , "#2b908f" , "#f45b5b" , "#91e8e1")
  
  /**
   * Highchart by default puts a credits label in the lower right corner of the chart.
   * 		This can be changed using these options.
   */
  val credits: Credits = new Credits
  
  /**
   * <p>The Data module provides a simplified interface for adding data to a chart from sources like CVS, HTML tables or grid views. See also the <a href="http://www.highcharts.com/docs/working-with-data/data-module">tutorial article on the Data module</a>.</p>
   * 
   * <p>It requires the <code>modules/data.js</code> file to be loaded.</p>
   * 
   * <p>Please note that the default way of adding data in Highcharts, without the need of a module, is through the <a href="#series.data">series.data</a> option.</p>
   * @example Data from a <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/column-parsed/" target="_blank">HTML table</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/csv/" target="_blank">CSV</a>.
   * @since 4.0
   */
  val data: Data = new Data
  
  /**
   * <p>Options for drill down, the concept of inspecting increasingly high resolution data through clicking on chart items like columns or pie slices.</p>
   * 
   * <p>The drilldown feature requires the <code>drilldown.js</code> file to be loaded, found in the <code>modules</code> directory of the download package, or online at <a href="http://code.highcharts.com/modules/drilldown.js">code.highcharts.com/modules/drilldown.js</a>.</p>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/drilldown/basic/" target="_blank">Basic drilldown</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/drilldown/multi-series/" target="_blank">multi series drilldown</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/column-drilldown/" target="_blank">generated column drilldown</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/pie-drilldown/" target="_blank">pie drilldown</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/drilldown/across-types/" target="_blank">drilldown across series types</a>.
   * @since 3.0.8
   */
  val drilldown: Drilldown = new Drilldown
  
  /**
   * Options for the exporting module. For an overview on the matter, see <a href="http://www.highcharts.com/docs/export-module/export-module-overview">the docs</a>.
   */
  val exporting: Exporting = new Exporting
  
  /**
   * Global options that don't apply to each chart. These options, like the <code>lang</code>
   * 		options, must be set using the <code>Highcharts.setOptions</code> method.
   * <pre>Highcharts.setOptions({
   * 	global: {
   * 		useUTC: false
   * 	}
   * });</pre>
   */
  val global: Global = new Global
  
  /**
   * HTML labels that can be positioned anywhere in the chart area.
   */
  val labels: Labels = new Labels
  
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
  val lang: Lang = new Lang
  
  /**
   * The legend is a box containing a symbol and name for each series item
   * 	or point item in the chart.
   */
  val legend: Legend = new Legend
  
  /**
   * The loading options control the appearance of the loading screen that covers the 
   * 	plot area on chart operations. This screen only appears after an explicit call
   * 	to <code>chart.showLoading()</code>. It is a utility for developers to communicate
   * 	to the end user that something is going on, for example while retrieving new data
   * 	via an XHR connection. The "Loading..." text itself is not part of this configuration
   * 	object, but part of the <code>lang</code> object.
   */
  val loading: Loading = new Loading
  
  /**
   * A collection of options for buttons and menus appearing in the exporting module.
   */
  val navigation: Navigation = new Navigation
  
  /**
   * Options for displaying a message like "No data to display". This feature requires the file <code>no-data-to-display.js</code> to be loaded in the page. The actual text to display is set in the <a href="#lang.noData">lang.noData</a> option.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/no-data-to-display/no-data-line/" target="_blank">Line series</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/no-data-to-display/no-data-pie/" target="_blank">pie series</a>.
   * @since 3.0.8
   */
  val noData: NoData = new NoData
  
  /**
   * Applies only to polar charts and angular gauges. This configuration object holds general options for the combined X and Y axes set. Each xAxis or yAxis can reference the pane by index.
   * @since 2.3.0
   */
  val pane: js.Object = new js.Object
  
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
  val plotOptions: PlotOptions = new PlotOptions
  
  /**
   * The actual series to append to the chart. In addition to 
   * 	the members listed below, any member of the <code>plotOptions</code> for that specific
   * 	type of plot can be added to a series individually. For example, even though a general
   * 	<code>lineWidth</code> is specified in <code>plotOptions.series</code>, an individual
   * 	<code>lineWidth</code> can be specified for each series.
   */
  val series: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>area</code> series. If the <a href="#series<area>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.area">plotOptions.area</a>.</p>
   */
  val `series<area>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>arearange</code> series. If the <a href="#series<arearange>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.arearange">plotOptions.arearange</a>.</p>
   */
  val `series<arearange>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>areaspline</code> series. If the <a href="#series<areaspline>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.areaspline">plotOptions.areaspline</a>.</p>
   */
  val `series<areaspline>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>areasplinerange</code> series. If the <a href="#series<areasplinerange>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.areasplinerange">plotOptions.areasplinerange</a>.</p>
   */
  val `series<areasplinerange>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>bar</code> series. If the <a href="#series<bar>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.bar">plotOptions.bar</a>.</p>
   */
  val `series<bar>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>boxplot</code> series. If the <a href="#series<boxplot>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.boxplot">plotOptions.boxplot</a>.</p>
   */
  val `series<boxplot>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>bubble</code> series. If the <a href="#series<bubble>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.bubble">plotOptions.bubble</a>.</p>
   */
  val `series<bubble>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>column</code> series. If the <a href="#series<column>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.column">plotOptions.column</a>.</p>
   */
  val `series<column>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>columnrange</code> series. If the <a href="#series<columnrange>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.columnrange">plotOptions.columnrange</a>.</p>
   */
  val `series<columnrange>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>errorbar</code> series. If the <a href="#series<errorbar>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.errorbar">plotOptions.errorbar</a>.</p>
   */
  val `series<errorbar>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>funnel</code> series. If the <a href="#series<funnel>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.funnel">plotOptions.funnel</a>.</p>
   */
  val `series<funnel>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>gauge</code> series. If the <a href="#series<gauge>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.gauge">plotOptions.gauge</a>.</p>
   */
  val `series<gauge>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>heatmap</code> series. If the <a href="#series<heatmap>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.heatmap">plotOptions.heatmap</a>.</p>
   */
  val `series<heatmap>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>line</code> series. If the <a href="#series<line>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.line">plotOptions.line</a>.</p>
   */
  val `series<line>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>pie</code> series. If the <a href="#series<pie>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.pie">plotOptions.pie</a>.</p>
   */
  val `series<pie>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>polygon</code> series. If the <a href="#series<polygon>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.polygon">plotOptions.polygon</a>.</p>
   */
  val `series<polygon>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>pyramid</code> series. If the <a href="#series<pyramid>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.pyramid">plotOptions.pyramid</a>.</p>
   */
  val `series<pyramid>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>scatter</code> series. If the <a href="#series<scatter>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.scatter">plotOptions.scatter</a>.</p>
   */
  val `series<scatter>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>solidgauge</code> series. If the <a href="#series<solidgauge>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.solidgauge">plotOptions.solidgauge</a>.</p>
   */
  val `series<solidgauge>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>spline</code> series. If the <a href="#series<spline>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.spline">plotOptions.spline</a>.</p>
   */
  val `series<spline>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>treemap</code> series. If the <a href="#series<treemap>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.treemap">plotOptions.treemap</a>.</p>
   */
  val `series<treemap>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * <p>A <code>waterfall</code> series. If the <a href="#series<waterfall>.type">type</a> option is not specified, it is inherited from <a href="#chart.type">chart.type</a>.</p>
   * 
   * <p>For options that apply to multiple series, it is recommended to add them to the <a href="#pointOptions.series">pointOptions.series</a> options structure. To apply to all series of this specific type, apply it to <a href="#plotOptions.waterfall">plotOptions.waterfall</a>.</p>
   */
  val `series<waterfall>`: js.Array[js.Object] = new js.Array[js.Object]
  
  /**
   * The chart's subtitle
   */
  val subtitle: Subtitle = new Subtitle
  
  /**
   * The chart's main title.
   */
  val title: Title = new Title
  
  /**
   * Options for the tooltip that appears when the user hovers over a series or point.
   */
  val tooltip: Tooltip = new Tooltip
  
  /**
   * <p>The X axis or category axis. Normally this is the horizontal axis, though if the 
   * 	chart is inverted this is the vertical axis. In case of multiple axes, the xAxis
   * 	node is an array of configuration objects.</p>
   * 	<p>See <a class="internal" href="#axis.object">the Axis object</a> for programmatic
   * 	access to the axis.</p>
   */
  val xAxis: XAxis = new XAxis
  
  /**
   * <p>The Y axis or value axis. Normally this is the vertical axis, though if the 
   * 	chart is inverted this is the horizontal axis. In case of multiple axes, the yAxis
   * 	node is an array of configuration objects.</p>
   * 	<p>See <a class="internal" href="#axis.object">the Axis object</a> for programmatic
   * 	access to the axis.</p>
   */
  val yAxis: YAxis = new YAxis
}
