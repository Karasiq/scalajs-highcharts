/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
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
class HighmapsConfig extends js.Object {

  /**
    * The actual series to append to the chart. In addition to 
    * 	the members listed below, any member of the <code>plotOptions</code> for that specific
    * 	type of plot can be added to a series individually. 
    */
  val series: js.UndefOr[js.Array[CleanJsObject[SeriesHeatmap | SeriesMap | SeriesMapbubble | SeriesMapline | SeriesMappoint]]] = js.undefined

  /**
    * Options regarding the chart area and plot area as well as general chart options.
    */
  val chart: js.UndefOr[CleanJsObject[Chart]] = js.undefined

  /**
    * <p>A color axis for choropleth mapping. Visually, the color axis will appear as a gradient or as separate items inside the legend, depending on whether the axis is scalar or based on data classes.</p>
    * 
    * <p>For supported color formats, see the <a href="http://www.highcharts.com/docs/chart-design-and-style/colors">docs article about colors</a>.</p>
    * 
    * <p>A scalar color axis is represented by a gradient. The colors either range between the <a href="#colorAxis.minColor">minColor</a> and the <a href="#colorAxis.maxColor">maxColor</a>, or for more fine grained control the colors can be defined in <a href="#colorAxis.stops">stops</a>. Often times, the color axis needs to be adjusted to get the right color spread for the data. In addition to stops, consider using a logarithmic <a href="#colorAxis.type">axis type</a>, or setting <a href="#colorAxis.min">min</a> and <a href="#colorAxis.max">max</a> to avoid the colors being determined by outliers.</p>
    * 
    * <p>When <a href="#colorAxis.dataClasses">dataClasses</a> are used, the ranges are subdivided into separate classes like categories based on their values. This can be used for ranges between two values, but also for a true category. However, when your data is categorized, it may be as convenient to add each category to a separate series.</p>
    * 	
    * <p>See <a href="#Axis">the Axis object</a> for programmatic access to the axis.</p>
    */
  val colorAxis: js.UndefOr[CleanJsObject[ColorAxis]] = js.undefined

  /**
    * <p>An array containing the default colors for the chart's series. When all colors are used, new colors are pulled from the start again. Defaults to:
    * <pre>colors: ['#7cb5ec', '#434348', '#90ed7d', '#f7a35c', '#8085e9', 
    *    '#f15c80', '#e4d354', '#8085e8', '#8d4653', '#91e8e1']</pre>
    * </p>
    */
  val colors: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * Highchart by default puts a credits label in the lower right corner of the chart.
    * 		This can be changed using these options.
    */
  val credits: js.UndefOr[CleanJsObject[Credits]] = js.undefined

  /**
    * <p>Options for drill down, the concept of inspecting increasingly high resolution data through clicking on chart items like columns or pie slices.</p>
    * 
    * <p>The drilldown feature requires the <code>drilldown.js</code> file to be loaded, found in the <code>modules</code> directory of the download package, or online at <a href="http://code.highcharts.com/modules/drilldown.js">code.highcharts.com/modules/drilldown.js</a>.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/map-drilldown/" target="_blank">Map drilldown</a>
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
    * The legend is a box containing explanations for the different elements of a chart. A Highmaps legend by default contains one legend item per series, but if a colorAxis is defined, the axis will be displayed in the legen. Either as a gradient, or as multiple legend items for dataClasses.
    */
  val legend: js.UndefOr[CleanJsObject[Legend]] = js.undefined

  /**
    * <p>The loading options control the appearance of the loading screen that covers the 
    * 	plot area on chart operations. This screen only appears after an explicit call
    * 	to <code>chart.showLoading()</code>. It is a utility for developers to communicate
    * 	to the end user that something is going on, for example while retrieving new data
    * 	via an XHR connection. The "Loading..." text itself is not part of this configuration
    * 	object, but part of the <code>lang</code> object.</p>
    * 
    * <p>For demo cases, see the <a href="/highcharts/#loading">loading configuration object for basic Highcharts</a>.</p>
    */
  val loading: js.UndefOr[CleanJsObject[Loading]] = js.undefined

  /**
    * <p>A collection of options for zooming and panning in a map.</p>
    */
  val mapNavigation: js.UndefOr[CleanJsObject[MapNavigation]] = js.undefined

  /**
    * <p>A collection of options for buttons and menus appearing in the exporting module.</p>
    * 
    * <p>The examples below point to basic Highcharts demos, but the syntax for Highmaps are the exact same.</p>
    */
  val navigation: js.UndefOr[CleanJsObject[Navigation]] = js.undefined

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
    * The chart's subtitle. This can be used both to display a subtitle below the main title, and to display random text anywhere in the chart. The subtitle can be updated after chart initialization through the <code>Chart.setTitle()</code> method.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/title/subtitle/" target="_blank">Subtitle options demonstrated</a>
    */
  val subtitle: js.UndefOr[CleanJsObject[Subtitle]] = js.undefined

  /**
    * The chart's main title.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/title/title/" target="_blank">Title options demonstrated</a>
    */
  val title: js.UndefOr[CleanJsObject[Title]] = js.undefined

  /**
    * Options for the tooltip that appears when the user hovers over a series or point.
    */
  val tooltip: js.UndefOr[CleanJsObject[Tooltip]] = js.undefined

  /**
    * <p>The X axis. A Highcharts map has hidden X and Y axes to control layout of the shapes and features like zooming and panning. Zooming is in effect the same as setting the extremes of one of the axes, and Highmaps is set up to make the other axis zoom the same amount.</p>
    * 
    * <p>Highmaps uses the coordinate system of the map points' path configurations.</p>
    * 	
    * <p>See <a class="internal" href="#Axis">the Axis object</a> for programmatic access to the axis.</p>
    */
  val xAxis: js.UndefOr[CleanJsObject[XAxis]] = js.undefined

  /**
    * <p>The Y axis. A Highcharts map has hidden X and Y axes to control layout of the shapes and features like zooming and panning. Zooming is in effect the same as setting the extremes of one of the axes, and Highmaps is set up to make the other axis zoom the same amount.</p>
    * 
    * <p>Highmaps uses the coordinate system of the map points' path configurations.</p>
    * 	
    * <p>See <a class="internal" href="#Axis">the Axis object</a> for programmatic access to the axis.</p>
    */
  val yAxis: js.UndefOr[CleanJsObject[YAxis]] = js.undefined
}
