/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.api

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>Chart</code>
  */
@js.native
trait Chart extends js.Object {

  /**
    * <p>Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the same time as the chart is initiated, add the axis as a configuration option instead.</p>
    * <p>This method is inherited from Highcharts as a map is a cartesian series with hidden X and Y axes. In Highmaps it is less relevant.</p>
    * @param options 
The Axis options, as documented under <a href="#xAxis">xAxis</a> and <a href="#yAxis">yAxis</a>.
    */
  def addAxis(options: js.Object = ???, isX: Boolean = ???, redraw: Boolean = ???, animation: js.Any = ???): Unit = js.native

  /**
    * Add a series to the chart after render time. Using this method is discouraged when adding data synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the same time as the chart is initiated, add the series as a configuration option instead.
    * @param options 
The series options, as documented under <a href="#plotOptions.series">plotOptions.series</a> and under the plotOptions for each series type.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/members/chart-addseries/" target="_blank">Add a series from a button</a>
    */
  def addSeries(options: js.Object = ???, redraw: Boolean = ???, animation: js.Any = ???): CleanJsObject[Series] = js.native

  /**
    * Removes the chart and purges memory. This method should be called before writing a new chart into the same container. It is called internally on window unload to prevent leaks. It is also called internally before adding another chart to the same container.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/members/chart-destroy/" target="_blank">Destroy the chart from a button</a>
    */
  def destroy(): Unit = js.native

  /**
    * <p>Exporting module required. Submit an SVG version of the chart to a server along with some parameters for conversion.</p>
    * 
    * <p>For live demos, see <a href="http://api.highcharts.com/highcharts#Chart.exportChart()">Highcharts API for exportChart</a>, which shares the same feature set.</p>
    * @param options Exporting options. Out of the <a class="internal" href="#exporting">exporting</a> options, the following options can be given as parameters to the exportChart method. All options default to the values given in the exporting config options. 
<code>filename</code>: the filename for the export without extension, 
<code>url</code>: the URL for the server module to do the conversion, 
<code>width</code>: the width of the PNG or JPEG image generated on the server, 
<code>type</code>: the MIME type of the converted image, 
<code>sourceWidth</code>: the width of the source (in-page) chart, 
<code>sourceHeight</code>: the height of the source chart.
    */
  def exportChart(options: js.Object = ???, chartOptions: js.Object = ???): Unit = js.native

  /**
    * Get an axis, series or point by its <code>id</code> as given in the configuration options.
    * @param id The id of the axis, series or point to get.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/series/data-id/" target="_blank">Highlight a point by id</a>
    */
  def get(id: String = ???): CleanJsObject[Axis] | CleanJsObject[Series] | CleanJsObject[Point] = js.native

  /**
    * Returns an array of all currently selected series in the chart. Series can be selected either programmatically by the <a href="#Series.select()">Series.select()</a> method or by checking the checkbox next to the legend item if <a href="#plotOptions.series.showCheckbox">series.showCheckBox</a> is true.
    */
  def getSelectedSeries(): js.Array[CleanJsObject[Series]] = js.native

  /**
    * Zoom in or out of the map. See also <a href="#Point.zoomTo">Point.zoomTo</a>.
    * @param howMuch 
How much to zoom the map. Values less than 1 zooms in. 0.5 zooms in to half the current view. 2 zooms to twice the current view.
    */
  def mapZoom(howMuch: Double = ???, centerX: Double = ???, centerY: Double = ???, mouseX: Double = ???, mouseY: Double = ???): Unit = js.native

  /**
    * Resize the chart to a given width and height.
    * @param width The new pixel width of the chart.
    * @param height The new pixel height of the chart.
    * @param animation Defaults to true. When true, the resize will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.9.1/highslide-software/highcharts.com/tree/master/samples/maps/members/chart-setsize-jquery-resizable/" target="_blank">Resize by jQuery UI resizable</a>
    */
  def setSize(width: Double = ???, height: Double = ???, animation: js.Any = ???): Unit = js.native

  /**
    * Returns an array of all currently selected points in the chart. Points can be selected either programmatically by the <a href="#Point.select()">Point.select()</a> method or by clicking when <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> is enabled.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-allowpointselect/" target="_blank">Get selected points</a>
    */
  def getSelectedPoints(): js.Array[CleanJsObject[Point]] = js.native

  /**
    * Exporting module required. Clears away other elements in the page and prints the chart as it is displayed. By default, when the exporting module is enabled, a button at the upper left calls this method. See demo at <a href="http://api.highcharts.com/highcharts#Chart.print()">the Highcharts API</a>.
    */
  def print(): Unit = js.native

  /**
    * An array of the chart's x axes. A map has hidden X and Y axes by default. If only one x axis, it is referenced by <code>chart.xAxis[0]</code>.
    */
  val xAxis: js.Array[CleanJsObject[Axis]] = js.native

  /**
    * An array of the chart's y axes. A map has hidden X and Y axes by default. If only one y axis, it is referenced by <code>chart.yAxis[0]</code>.
    */
  val yAxis: js.Array[CleanJsObject[Axis]] = js.native

  /**
    * Calculate latitude/longitude values for a point. Returns an object with the numeric properties <code>lat</code> and <code>lon</code>.
    * @param point 
A <a href="#Point">point</a> object, or any object containing the properties <code>x</code> and <code>y</code> with numeric values.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/latlon-advanced/" target="_blank">Advanced lat/lon demo</a>
    * @since 1.1.0
    */
  def fromPointToLatLon(point: js.Object = ???): js.Object = js.native

  /**
    * Export the chart to a PNG or SVG without sending it to a server. Requires <code>modules/exporting.js</code> and <code>modules/offline-exporting.js</code>.
    */
  def exportChartLocal(options: js.Object = ???, chartOptions: js.Object = ???): Unit = js.native

  /**
    * When the chart is drilled down to a child series, calling <code>chart.drillUp()</code> will drill up to the parent series.
    */
  def drillUp(): Unit = js.native

  /**
    * Add a series to the chart as drilldown from a specific point in the parent series. This method is used for async drilldown, when clicking a point in a series should result in loading and displaying a more high-resolution series, for instance when zooming in from a world map to countries with regions. When <i>not</i> async, the setup is simpler using the <a href="#drilldown.series">drilldown.series</a> options structure.
    * @param point 
The existing Point object from which the drilldown will start.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/map-drilldown/" target="_blank">Map drilldown</a>
    */
  def addSeriesAsDrilldown(point: js.Object = ???, seriesOptions: js.Object = ???): Unit = js.native

  /**
    * Set a new title or subtitle for the chart
    * @param title A configuration object for the new title as defined at <a class="internal" href="#title">#title</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/members/axis-getextremes/" target="_blank">Use setTitle to write dynamic information in the subtitle</a>
    */
  def setTitle(title: js.Object = ???, subtitle: js.Any = ???, redraw: Boolean = ???): Unit = js.native

  /**
    * Dim the chart's plot area and show a loading label text. Options for the loading screen are defined at <a class="internal" href="#loading">options.loading</a>. A custom text can be given as a parameter for loading.
    */
  def showLoading(str: String = ???): Unit = js.native

  /**
    * Exporting module required. Get an SVG string representing the chart. For live demo, see the <a href="http://api.highcharts.com/highcharts#Chart.getSVG()">same option in Highcharts</a>, which shares this feature set.
    * @param additionalOptions Chart options to add to the exported chart in addition to the options given for the original chart. For example if series.lineWidth should be greater in the exported chart than in the original, or the chart should have a different background color, this is added here.
    */
  def getSVG(additionalOptions: js.Object = ???): String = js.native

  /**
    * The options structure for the chart.
    */
  val options: js.Object = js.native

  /**
    * Hide the loading screen. Options for the loading screen are defined at <a class="internal" href="#loading">options.loading</a>.
    */
  def hideLoading(): Unit = js.native

  /**
    * An array of all the chart's series.
    */
  val series: js.Array[CleanJsObject[Series]] = js.native

  /**
    * A reference to the containing HTML element, dynamically inserted into the element given in <code>chart.renderTo</code>.
    */
  val container: js.Object = js.native

  /**
    * Reflows the chart to its container. By default, the chart reflows automatically to its container following a <code>window.resize</code> event, as per the <a href="#chart.reflow">chart.reflow</a> option. However, there are no reliable events for div resize, so if the container is resized without a window resize event, this must be called explicitly. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-reflow/" target="_blank">Resize div and reflow</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/events-container/" target="_blank">pop up and reflow</a>
    */
  def reflow(): Unit = js.native

  /**
    * Get point from latLon using specified transform definition.
    * @param latLon 
An object containing the properties <code>lat</code> and <code>lon</code> with numeric values.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/series/latlon-transform/" target="_blank">Use specific transformation for lat/lon</a>
    * @since 1.1.0
    */
  def transformFromLatLon(latLon: js.Object = ???, transform: js.Object = ???): CleanJsObject[Point] = js.native

  /**
    * Get latLon from point using specified transform definition. The method returns an object with the numeric properties <code>lat</code> and <code>lon</code>.
    * @param point 
A <a href="#Point">point</a> object, or any object containing the properties <code>x</code> and <code>y</code> with numeric values.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/series/latlon-transform/" target="_blank">Use specific transformation for lat/lon</a>
    * @since 1.1.0
    */
  def transformToLatLon(point: js.Object = ???, transform: js.Object = ???): js.Object = js.native

  /**
    * Get chart values from latitude/longitude. Returns an object with <code>x</code> and <code>y</code> values.
    * @param latLon 
An object containing the properties <code>lat</code> and <code>lon</code> with numeric values.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/series/latlon-to-point/" target="_blank">Find point from lat/lon</a>
    * @since 1.1.0
    */
  def fromLatLonToPoint(latLon: js.Object = ???): CleanJsObject[Point] = js.native

  /**
    * Redraw the chart after changes have been done to the data or axis extremes. All methods for updating axes, series or points have a parameter for redrawing the chart. This is <code>true</code> by default. But in many cases you want to do more than one operation on the chart before redrawing, for example add a number of points. In those cases it is a waste of resources to redraw the chart for each new point added. So you add the points and call <code>chart.redraw()</code> after.
    * @param animation Defaults to true. When true, the update will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    */
  def redraw(animation: js.Any = ???): Unit = js.native
}
