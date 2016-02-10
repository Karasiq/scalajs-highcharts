/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.api

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>Chart</code>
  */
@js.native
trait Chart extends js.Object {

  /**
    * Add a series to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the same time as the chart is initiated, add the series as a configuration option instead. In a StockChart with the navigator enabled, the base series can't be added dynamically.
    * @param options The series options, as documented under <a class="internal" href="#plotOptions.series">plotOptions.series</a> and under the plotOptions for each series type.
    * @param animation Defaults to true. When true, the series' updating will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/members/chart-addseries/" target="_blank">Add series from a button</a>
    */
  def addSeries(options: js.Object = ???, redraw: Boolean = ???, animation: js.Any = ???): CleanJsObject[Series] = js.native

  /**
    * Exporting module required. Submit an SVG version of the chart to a server along with some parameters for conversion.
    * @param options Exporting options. Out of the <a class="internal" href="#exporting">exporting</a> options, the following options can be given as parameters to the exportChart method. All options default to the values given in the exporting config options. 
<code>filename</code>: the filename for the export without extension, 
<code>url</code>: the URL for the server module to do the conversion, 
<code>width</code>: the width of the PNG or JPEG image generated on the server, 
<code>type</code>: the MIME type of the converted image, 
<code>sourceWidth</code>: the width of the source (in-page) chart, 
<code>sourceHeight</code>: the height of the source chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/members/chart-exportchart/" target="_blank">Export chart</a>
    */
  def exportChart(options: js.Object = ???, chartOptions: js.Object = ???): Unit = js.native

  /**
    * Get an axis, series or point by its <code>id</code> as given in the configuration options.
    * @param id The id of the axis, series or point to get.
    */
  def get(id: String = ???): CleanJsObject[Axis] | CleanJsObject[Series] | CleanJsObject[Point] = js.native

  /**
    * Exporting module required. Get an SVG string representing the chart.
    * @param additionalOptions Chart options to add to the exported chart in addition to the options given for the original chart. For example if series.lineWidth should be greater in the exported chart than in the original, or the chart should have a different background color, this is added here.
    */
  def getSVG(additionalOptions: js.Object = ???): String = js.native

  /**
    * Resize the chart to a given width and height.
    * @param width The new pixel width of the chart.
    * @param height The new pixel height of the chart.
    * @param animation Defaults to true. When true, the resize will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/members/chart-setsize/" target="_blank">Set the size from a jQuery UI resizable</a>
    */
  def setSize(width: Double = ???, height: Double = ???, animation: js.Any = ???): Unit = js.native

  /**
    * Removes the chart and purges memory. This method should be called before writing a new chart into the same container. It is called internally on window unload to prevent leaks.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/members/chart-destroy/" target="_blank">Destroy the chart from a button</a>
    */
  def destroy(): Unit = js.native

  /**
    * An array of the chart's x axes. If only one x axis, it is referenced by <code>chart.xAxis[0]</code>.
    */
  val xAxis: js.Array[CleanJsObject[Axis]] = js.native

  /**
    * An array of the chart's y axes. If only one y axis, it is referenced by <code>chart.yAxis[0]</code>.
    */
  val yAxis: js.Array[CleanJsObject[Axis]] = js.native

  /**
    * A reference to the containing HTML element, dynamically inserted into the element given in <code>chart.renderTo</code>.
    */
  val container: js.Object = js.native

  /**
    * Returns an array of all currently selected points in the chart. Points can be selected either programmatically by the <code>point.select()</code> method or by clicking.
    */
  def getSelectedPoints(): js.Array[CleanJsObject[Point]] = js.native

  /**
    * Set a new title or subtitle for the chart
    * @param title A configuration object for the new title as defined at <a class="internal" href="#title">#title</a>.
    */
  def setTitle(title: js.Object = ???, subtitle: js.Any = ???, redraw: Boolean = ???): Unit = js.native

  /**
    * Exporting module required. Clears away other elements in the page and prints the chart as it is displayed. By default, when the exporting module is enabled, a button at the upper right calls this method.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-print/" target="_blank">Print from a HTML button</a>
    */
  def print(): Unit = js.native

  /**
    * Dim the chart's plot area and show a loading label text. Options for the loading screen are defined at <a class="internal" href="#loading">options.loading</a>. A custom text can be given as a parameter for loading.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/members/chart-show-hide-loading/" target="_blank">Show and hide loading from a button</a>
    */
  def showLoading(str: String = ???): Unit = js.native

  /**
    * The options structure for the chart.
    */
  val options: js.Object = js.native

  /**
    * Returns an array of all currently selected series in the chart. Series can be selected either programmatically by the <code>series.select()</code> method or by checking the checkbox next to the legend item if <code>series.showCheckBox</code> is true.
    */
  def getSelectedSeries(): js.Array[CleanJsObject[Series]] = js.native

  /**
    * Hide the loading screen. Options for the loading screen are defined at <a class="internal" href="#loading">options.loading</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/members/chart-show-hide-loading/" target="_blank">Show and hide loading from a button</a>
    */
  def hideLoading(): Unit = js.native

  /**
    * An array of all the chart's series.
    */
  val series: js.Array[CleanJsObject[Series]] = js.native

  /**
    * Reflows the chart to its container. By default, the chart reflows automatically to its container following a <code>window.resize</code> event, as per the <a href="#chart.reflow">chart.reflow</a> option. However, there are no reliable events for div resize, so if the container is resized without a window resize event, this must be called explicitly. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-reflow/" target="_blank">Resize div and reflow</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/events-container/" target="_blank">pop up and reflow</a>
    */
  def reflow(): Unit = js.native

  /**
    * Redraw the chart after changes have been done to the data or axis extremes. All methods for updating axes, series or points have a parameter for redrawing the chart. This is <code>true</code> by default. But in many cases you want to do more than one operation on the chart before redrawing, for example add a number of points. In those cases it is a waste of resources to redraw the chart for each new point added. So you add the points and call <code>chart.redraw()</code> after.
    * @param animation Defaults to true. When true, the update will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    */
  def redraw(animation: js.Any = ???): Unit = js.native

  /**
    * Export the chart to a PNG or SVG without sending it to a server. Requires <code>modules/exporting.js</code> and <code>modules/offline-exporting.js</code>.
    */
  def exportChartLocal(options: js.Object = ???, chartOptions: js.Object = ???): Unit = js.native
}
