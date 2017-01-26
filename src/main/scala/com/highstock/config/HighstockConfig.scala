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
  * @note JavaScript name: <code>HighstockConfig</code>
  */
@js.annotation.ScalaJSDefined
class HighstockConfig extends js.Object {

  /**
    * The actual series to append to the chart. In addition to 
    * 	the members listed below, any member of the <code>plotOptions</code> for that specific
    * 	type of plot can be added to a series individually. For example, even though a general
    * 	<code>lineWidth</code> is specified in <code>plotOptions.series</code>, an individual
    * 	<code>lineWidth</code> can be specified for each series.
    */
  val series: js.UndefOr[js.Array[CleanJsObject[SeriesArea | SeriesArearange | SeriesAreaspline | SeriesAreasplinerange | SeriesCandlestick | SeriesColumn | SeriesColumnrange | SeriesFlags | SeriesLine | SeriesOhlc | SeriesPolygon | SeriesScatter | SeriesSpline]]] = js.undefined

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
    *    '#f15c80', '#e4d354', '#8085e8', '#8d4653', '#91e8e1']</pre>
    * 
    * Default colors can also be set on a series or series.type basis, see <a href="#plotOptions.column.colors">column.colors</a>.
    * </p>
    * 
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the colors option doesn't exist. Instead, colors are defined in CSS and applied either through series or point class names, or through the <a href="#chart.colorCount">chart.colorCount</a> option.</p>
    * 
    * <h3>Legacy</h3>
    * <p>In Highstock 1.3.x, the default colors were:
    * <pre>colors: ['#2f7ed8', '#0d233a', '#8bbc21', '#910000', '#1aadce', 
    *    '#492970', '#f28f43', '#77a1e5', '#c42525', '#a6c96a']</pre>
    * </p>
    * 
    * <p>Prior to 1.3, the default colors were:
    * <pre>colors: ['#4572A7', '#AA4643', '#89A54E', '#80699B', '#3D96AE', 
    *    '#DB843D', '#92A8CD', '#A47D7C', '#B5CA92']</pre></p>
    */
  val colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined

  /**
    * Highchart by default puts a credits label in the lower right corner of the chart.
    * 		This can be changed using these options.
    */
  val credits: js.UndefOr[CleanJsObject[Credits]] = js.undefined

  /**
    * <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">Styled mode</a> only. Configuration object for adding SVG definitions for reusable elements. See <a href="http://www.highcharts.com/docs/chart-design-and-style/gradients-shadows-and-patterns">gradients, shadows and patterns</a> for more information and code examples.
    * @since 5.0.0
    */
  val defs: js.UndefOr[js.Object] = js.undefined

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
    * The legend is a box containing a symbol and name for each series item
    * 	or point item in the chart.
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
    * The navigator is a small series below the main series, displaying a view of 
    * 		the entire data set. It provides tools to zoom in and out on parts of the
    * 		data as well as panning across the dataset.
    */
  val navigator: js.UndefOr[CleanJsObject[Navigator]] = js.undefined

  /**
    * Options for displaying a message like "No data to display". This feature requires the file <code>no-data-to-display.js</code> to be loaded in the page. The actual text to display is set in the <a href="#lang.noData">lang.noData</a> option.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-line/" target="_blank">Line series</a>, <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-pie/" target="_blank">pie series</a>.
    * @since 3.0.8
    */
  val noData: js.UndefOr[CleanJsObject[NoData]] = js.undefined

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
    * The range selector is a tool for selecting ranges to display within the chart. It provides
    * 		buttons to select preconfigured ranges in the chart, like 1 day, 1 week, 1 month etc. It
    * 		also provides input boxes where min and max dates can be manually input.
    */
  val rangeSelector: js.UndefOr[CleanJsObject[RangeSelector]] = js.undefined

  /**
    * Allows setting a set of rules to apply for different screen or chart sizes. Each rule specifies additional chart options.
    * @example Responsive <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/demo/responsive/" target="_blank">stock chart</a>. Basic responsive <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/" target="_blank">axis</a>, <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/responsive/legend/" target="_blank">legend</a> and <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/responsive/classname/" target="_blank">class name</a>.
    * @since 5.0.0
    */
  val responsive: js.UndefOr[CleanJsObject[Responsive]] = js.undefined

  /**
    * <p>The scrollbar is a means of panning over the X axis of a chart.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, all the presentational options for the scrollbar are replaced by the classes <code>.highcharts-scrollbar-thumb</code>, <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>, <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.</p>
    */
  val scrollbar: js.UndefOr[CleanJsObject[Scrollbar]] = js.undefined

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
    * <p>The Y axis or value axis. In case of multiple axes, the yAxis
    * 	node is an array of configuration objects.</p>
    * 	<p>See <a class="internal" href="#axis.object">the Axis object</a> for programmatic
    * 	access to the axis.</p>
    */
  val yAxis: js.UndefOr[js.Array[CleanJsObject[YAxis]]] = js.undefined
}

object HighstockConfig {
  /**
    * @param series The actual series to append to the chart. In addition to . 	the members listed below, any member of the <code>plotOptions</code> for that specific. 	type of plot can be added to a series individually. For example, even though a general. 	<code>lineWidth</code> is specified in <code>plotOptions.series</code>, an individual. 	<code>lineWidth</code> can be specified for each series.
    * @param accessibility <p>Options for configuring accessibility for the chart. Requires the <a href="//code.highcharts.com/modules/accessibility.js">accessibility module</a> to be loaded. For a description of the module and information on its features, see <a href="http://www.highcharts.com/docs/chart-concepts/accessibility">Highcharts Accessibility</a>.</p>
    * @param chart Options regarding the chart area and plot area as well as general chart options.
    * @param colors <p>An array containing the default colors for the chart's series. When all colors are used, new colors are pulled from the start again. Defaults to:. <pre>colors: ['#7cb5ec', '#434348', '#90ed7d', '#f7a35c', '#8085e9', .    '#f15c80', '#e4d354', '#8085e8', '#8d4653', '#91e8e1']</pre>. . Default colors can also be set on a series or series.type basis, see <a href="#plotOptions.column.colors">column.colors</a>.. </p>. . . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the colors option doesn't exist. Instead, colors are defined in CSS and applied either through series or point class names, or through the <a href="#chart.colorCount">chart.colorCount</a> option.</p>. . <h3>Legacy</h3>. <p>In Highstock 1.3.x, the default colors were:. <pre>colors: ['#2f7ed8', '#0d233a', '#8bbc21', '#910000', '#1aadce', .    '#492970', '#f28f43', '#77a1e5', '#c42525', '#a6c96a']</pre>. </p>. . <p>Prior to 1.3, the default colors were:. <pre>colors: ['#4572A7', '#AA4643', '#89A54E', '#80699B', '#3D96AE', .    '#DB843D', '#92A8CD', '#A47D7C', '#B5CA92']</pre></p>
    * @param credits Highchart by default puts a credits label in the lower right corner of the chart.. 		This can be changed using these options.
    * @param defs <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">Styled mode</a> only. Configuration object for adding SVG definitions for reusable elements. See <a href="http://www.highcharts.com/docs/chart-design-and-style/gradients-shadows-and-patterns">gradients, shadows and patterns</a> for more information and code examples.
    * @param exporting Options for the exporting module. For an overview on the matter, see <a href="http://www.highcharts.com/docs/export-module/export-module-overview">the docs</a>.
    * @param global Global options that don't apply to each chart. These options, like the <code>lang</code>. 		options, must be set using the <code>Highcharts.setOptions</code> method.. <pre>Highcharts.setOptions({. 	global: {. 		useUTC: false. 	}. });</pre>
    * @param labels HTML labels that can be positioned anywhere in the chart area.
    * @param lang Language object. The language object is global and it can't. 		be set on each chart initiation. Instead, use <code>Highcharts.setOptions</code> to. 		set it before any chart is initiated. . <pre>Highcharts.setOptions({. 	lang: {. 		months: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin',  'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],. 		weekdays: ['Dimanche', 'Lundi', 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi']. 	}. });</pre>
    * @param legend The legend is a box containing a symbol and name for each series item. 	or point item in the chart.
    * @param loading The loading options control the appearance of the loading screen that covers the . 	plot area on chart operations. This screen only appears after an explicit call. 	to <code>chart.showLoading()</code>. It is a utility for developers to communicate. 	to the end user that something is going on, for example while retrieving new data. 	via an XHR connection. The "Loading..." text itself is not part of this configuration. 	object, but part of the <code>lang</code> object.
    * @param navigation A collection of options for buttons and menus appearing in the exporting module.
    * @param navigator The navigator is a small series below the main series, displaying a view of . 		the entire data set. It provides tools to zoom in and out on parts of the. 		data as well as panning across the dataset.
    * @param noData Options for displaying a message like "No data to display". This feature requires the file <code>no-data-to-display.js</code> to be loaded in the page. The actual text to display is set in the <a href="#lang.noData">lang.noData</a> option.
    * @param plotOptions <p>The plotOptions is a wrapper object for config objects for each series type.. 		The config objects for each series can also be overridden for each series . 		item as given in the series array.</p>. 		<p>Configuration options for the series are given in three levels. Options. 		for all series in a chart are given in the <a class="internal" href="#plotOptions.series">plotOptions.series</a> object. Then options for all series. 		of a specific type are given in the plotOptions of that type, for example plotOptions.line.. 		Next, options for one single series are given in <a class="internal" href="#series">the . 		series array</a>.</p>
    * @param rangeSelector The range selector is a tool for selecting ranges to display within the chart. It provides. 		buttons to select preconfigured ranges in the chart, like 1 day, 1 week, 1 month etc. It. 		also provides input boxes where min and max dates can be manually input.
    * @param responsive Allows setting a set of rules to apply for different screen or chart sizes. Each rule specifies additional chart options.
    * @param scrollbar <p>The scrollbar is a means of panning over the X axis of a chart.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, all the presentational options for the scrollbar are replaced by the classes <code>.highcharts-scrollbar-thumb</code>, <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>, <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.</p>
    * @param subtitle The chart's subtitle
    * @param title The chart's main title.
    * @param tooltip Options for the tooltip that appears when the user hovers over a series or point.
    * @param xAxis <p>The X axis or category axis. Normally this is the horizontal axis, though if the . 	chart is inverted this is the vertical axis. In case of multiple axes, the xAxis. 	node is an array of configuration objects.</p>. 	<p>See <a class="internal" href="#Axis">the Axis object</a> for programmatic. 	access to the axis.</p>
    * @param yAxis <p>The Y axis or value axis. In case of multiple axes, the yAxis. 	node is an array of configuration objects.</p>. 	<p>See <a class="internal" href="#axis.object">the Axis object</a> for programmatic. 	access to the axis.</p>
    */
  def apply(series: js.UndefOr[js.Array[CleanJsObject[SeriesArea | SeriesArearange | SeriesAreaspline | SeriesAreasplinerange | SeriesCandlestick | SeriesColumn | SeriesColumnrange | SeriesFlags | SeriesLine | SeriesOhlc | SeriesPolygon | SeriesScatter | SeriesSpline]]] = js.undefined, accessibility: js.UndefOr[CleanJsObject[Accessibility]] = js.undefined, chart: js.UndefOr[CleanJsObject[Chart]] = js.undefined, colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined, credits: js.UndefOr[CleanJsObject[Credits]] = js.undefined, defs: js.UndefOr[js.Object] = js.undefined, exporting: js.UndefOr[CleanJsObject[Exporting]] = js.undefined, global: js.UndefOr[CleanJsObject[Global]] = js.undefined, labels: js.UndefOr[CleanJsObject[Labels]] = js.undefined, lang: js.UndefOr[CleanJsObject[Lang]] = js.undefined, legend: js.UndefOr[CleanJsObject[Legend]] = js.undefined, loading: js.UndefOr[CleanJsObject[Loading]] = js.undefined, navigation: js.UndefOr[CleanJsObject[Navigation]] = js.undefined, navigator: js.UndefOr[CleanJsObject[Navigator]] = js.undefined, noData: js.UndefOr[CleanJsObject[NoData]] = js.undefined, plotOptions: js.UndefOr[CleanJsObject[PlotOptions]] = js.undefined, rangeSelector: js.UndefOr[CleanJsObject[RangeSelector]] = js.undefined, responsive: js.UndefOr[CleanJsObject[Responsive]] = js.undefined, scrollbar: js.UndefOr[CleanJsObject[Scrollbar]] = js.undefined, subtitle: js.UndefOr[CleanJsObject[Subtitle]] = js.undefined, title: js.UndefOr[CleanJsObject[Title]] = js.undefined, tooltip: js.UndefOr[CleanJsObject[Tooltip]] = js.undefined, xAxis: js.UndefOr[js.Array[CleanJsObject[XAxis]]] = js.undefined, yAxis: js.UndefOr[js.Array[CleanJsObject[YAxis]]] = js.undefined): HighstockConfig = {
    val seriesOuter: js.UndefOr[js.Array[CleanJsObject[SeriesArea | SeriesArearange | SeriesAreaspline | SeriesAreasplinerange | SeriesCandlestick | SeriesColumn | SeriesColumnrange | SeriesFlags | SeriesLine | SeriesOhlc | SeriesPolygon | SeriesScatter | SeriesSpline]]] = series
    val accessibilityOuter: js.UndefOr[CleanJsObject[Accessibility]] = accessibility
    val chartOuter: js.UndefOr[CleanJsObject[Chart]] = chart
    val colorsOuter: js.UndefOr[js.Array[String | js.Object]] = colors
    val creditsOuter: js.UndefOr[CleanJsObject[Credits]] = credits
    val defsOuter: js.UndefOr[js.Object] = defs
    val exportingOuter: js.UndefOr[CleanJsObject[Exporting]] = exporting
    val globalOuter: js.UndefOr[CleanJsObject[Global]] = global
    val labelsOuter: js.UndefOr[CleanJsObject[Labels]] = labels
    val langOuter: js.UndefOr[CleanJsObject[Lang]] = lang
    val legendOuter: js.UndefOr[CleanJsObject[Legend]] = legend
    val loadingOuter: js.UndefOr[CleanJsObject[Loading]] = loading
    val navigationOuter: js.UndefOr[CleanJsObject[Navigation]] = navigation
    val navigatorOuter: js.UndefOr[CleanJsObject[Navigator]] = navigator
    val noDataOuter: js.UndefOr[CleanJsObject[NoData]] = noData
    val plotOptionsOuter: js.UndefOr[CleanJsObject[PlotOptions]] = plotOptions
    val rangeSelectorOuter: js.UndefOr[CleanJsObject[RangeSelector]] = rangeSelector
    val responsiveOuter: js.UndefOr[CleanJsObject[Responsive]] = responsive
    val scrollbarOuter: js.UndefOr[CleanJsObject[Scrollbar]] = scrollbar
    val subtitleOuter: js.UndefOr[CleanJsObject[Subtitle]] = subtitle
    val titleOuter: js.UndefOr[CleanJsObject[Title]] = title
    val tooltipOuter: js.UndefOr[CleanJsObject[Tooltip]] = tooltip
    val xAxisOuter: js.UndefOr[js.Array[CleanJsObject[XAxis]]] = xAxis
    val yAxisOuter: js.UndefOr[js.Array[CleanJsObject[YAxis]]] = yAxis
    new HighstockConfig {
      override val series: js.UndefOr[js.Array[CleanJsObject[SeriesArea | SeriesArearange | SeriesAreaspline | SeriesAreasplinerange | SeriesCandlestick | SeriesColumn | SeriesColumnrange | SeriesFlags | SeriesLine | SeriesOhlc | SeriesPolygon | SeriesScatter | SeriesSpline]]] = seriesOuter
      override val accessibility: js.UndefOr[CleanJsObject[Accessibility]] = accessibilityOuter
      override val chart: js.UndefOr[CleanJsObject[Chart]] = chartOuter
      override val colors: js.UndefOr[js.Array[String | js.Object]] = colorsOuter
      override val credits: js.UndefOr[CleanJsObject[Credits]] = creditsOuter
      override val defs: js.UndefOr[js.Object] = defsOuter
      override val exporting: js.UndefOr[CleanJsObject[Exporting]] = exportingOuter
      override val global: js.UndefOr[CleanJsObject[Global]] = globalOuter
      override val labels: js.UndefOr[CleanJsObject[Labels]] = labelsOuter
      override val lang: js.UndefOr[CleanJsObject[Lang]] = langOuter
      override val legend: js.UndefOr[CleanJsObject[Legend]] = legendOuter
      override val loading: js.UndefOr[CleanJsObject[Loading]] = loadingOuter
      override val navigation: js.UndefOr[CleanJsObject[Navigation]] = navigationOuter
      override val navigator: js.UndefOr[CleanJsObject[Navigator]] = navigatorOuter
      override val noData: js.UndefOr[CleanJsObject[NoData]] = noDataOuter
      override val plotOptions: js.UndefOr[CleanJsObject[PlotOptions]] = plotOptionsOuter
      override val rangeSelector: js.UndefOr[CleanJsObject[RangeSelector]] = rangeSelectorOuter
      override val responsive: js.UndefOr[CleanJsObject[Responsive]] = responsiveOuter
      override val scrollbar: js.UndefOr[CleanJsObject[Scrollbar]] = scrollbarOuter
      override val subtitle: js.UndefOr[CleanJsObject[Subtitle]] = subtitleOuter
      override val title: js.UndefOr[CleanJsObject[Title]] = titleOuter
      override val tooltip: js.UndefOr[CleanJsObject[Tooltip]] = tooltipOuter
      override val xAxis: js.UndefOr[js.Array[CleanJsObject[XAxis]]] = xAxisOuter
      override val yAxis: js.UndefOr[js.Array[CleanJsObject[YAxis]]] = yAxisOuter
    }
  }
}
