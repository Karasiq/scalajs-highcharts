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
    * The scrollbar is a means of panning over the X axis of a chart.
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
  val xAxis: js.UndefOr[CleanJsObject[XAxis]] = js.undefined

  /**
    * <p>The Y axis or value axis. In case of multiple axes, the yAxis
    * 	node is an array of configuration objects.</p>
    * 	<p>See <a class="internal" href="#axis.object">the Axis object</a> for programmatic
    * 	access to the axis.</p>
    */
  val yAxis: js.UndefOr[CleanJsObject[YAxis]] = js.undefined
}
