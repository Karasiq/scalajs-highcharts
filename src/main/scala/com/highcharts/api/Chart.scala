/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.6 by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.api

import scalajs.js
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>Chart</code>
  */
@js.native
trait Chart extends js.Object {

  /**
    * Add an axis to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the same time as the chart is initiated, add the axis as a configuration option instead.
    * @param options 
The Axis options, as documented under <a href="#xAxis">xAxis</a> and <a href="#yAxis">yAxis</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-addaxis/" target="_blank">Add and remove axes</a>
    * @since 3.0
    */
  def addAxis(options: js.UndefOr[js.Object] = js.undefined, isX: js.UndefOr[Boolean] = js.undefined, redraw: js.UndefOr[Boolean] = js.undefined, animation: js.Any = js.undefined): Unit = js.native

  /**
    * Add a series to the chart after render time. Note that this method should never be used when adding data synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the same time as the chart is initiated, add the series as a configuration option instead.
    * @param options 
The series options, as documented under <a href="#plotOptions.series">plotOptions.series</a> and under the plotOptions for each series type.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-addseries/" target="_blank">Add a series from a button</a>
    * @since 1.2.0
    */
  def addSeries(options: js.UndefOr[js.Object] = js.undefined, redraw: js.UndefOr[Boolean] = js.undefined, animation: js.Any = js.undefined): CleanJsObject[Series] = js.native

  /**
    * Exporting module required. Submit an SVG version of the chart to a server along with some parameters for conversion.
    * @param options Exporting options. Out of the <a class="internal" href="#exporting">exporting</a> options, the following options can be given as parameters to the exportChart method. All options default to the values given in the exporting config options. 
<code>filename</code>: the filename for the export without extension, 
<code>url</code>: the URL for the server module to do the conversion, 
<code>width</code>: the width of the PNG or JPEG image generated on the server, 
<code>type</code>: the MIME type of the converted image, 
<code>sourceWidth</code>: the width of the source (in-page) chart, 
<code>sourceHeight</code>: the height of the source chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-exportchart/" target="_blank">Export with no options</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-exportchart-filename/" target="_blank">PDF type and custom filename</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-exportchart-custom-background/" target="_blank">different chart background in export</a>
    * @since 2.0
    */
  def exportChart(options: js.UndefOr[js.Object] = js.undefined, chartOptions: js.UndefOr[js.Object] = js.undefined): Unit = js.native

  /**
    * Get an axis, series or point by its <code>id</code> as given in the configuration options.
    * @param id The id of the axis, series or point to get.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-id/" target="_blank">Get series by id</a>
    * @since 1.2.0
    */
  def get(id: js.UndefOr[String] = js.undefined): js.Any = js.native

  /**
    * Exporting module required. Get an SVG string representing the chart.
    * @param additionalOptions Chart options to add to the exported chart in addition to the options given for the original chart. For example if series.lineWidth should be greater in the exported chart than in the original, or the chart should have a different background color, this is added here.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-getsvg/" target="_blank">View the SVG from a button</a>
    * @since 2.0
    */
  def getSVG(additionalOptions: js.UndefOr[js.Object] = js.undefined): String = js.native

  /**
    * Returns an array of all currently selected points in the chart. Points can be selected either programmatically by the <code>point.select()</code> method or by clicking.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-allowpointselect-line/" target="_blank">Get selected points</a>
    * @since 1.2.0
    */
  def getSelectedPoints(): js.Array[CleanJsObject[Point]] = js.native

  /**
    * Removes the chart and purges memory. This method should be called before writing a new chart into the same container. It is called internally on window unload to prevent leaks.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-destroy/" target="_blank">Destroy the chart from a button</a>
    * @since 1.2.2
    */
  def destroy(): Unit = js.native

  /**
    * The options structure for the chart.
    * @since 1.2.0
    */
  val options: js.Object = js.native

  /**
    * An array of the chart's x axes. If only one x axis, it is referenced by <code>chart.xAxis[0]</code>.
    * @since 1.2.0
    */
  val xAxis: js.Array[CleanJsObject[Axis]] = js.native

  /**
    * An array of the chart's y axes. If only one y axis, it is referenced by <code>chart.yAxis[0]</code>.
    * @since 1.2.0
    */
  val yAxis: js.Array[CleanJsObject[Axis]] = js.native

  /**
    * A reference to the containing HTML element, dynamically inserted into the element given in <code>chart.renderTo</code>.
    * @since 1.2.5
    */
  val container: js.Object = js.native

  /**
    * Exporting module required. Clears away other elements in the page and prints the chart as it is displayed. By default, when the exporting module is enabled, a button at the upper left calls this method.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-print/" target="_blank">Print from a HTML button</a>
    * @since 2.0
    */
  def print(): Unit = js.native

  /**
    * Resize the chart to a given width and height.
    * @param width The new pixel width of the chart.
    * @param height The new pixel height of the chart.
    * @param animation Defaults to true. When true, the resize will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.9.1/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-setsize-button/" target="_blank">Test resizing from buttons</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.9.1/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-setsize-jquery-resizable/" target="_blank">add a jQuery UI resizable</a>
    */
  def setSize(width: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, animation: js.Any = js.undefined): Unit = js.native

  /**
    * Dim the chart's plot area and show a loading label text. Options for the loading screen are defined at <a class="internal" href="#loading">options.loading</a>. A custom text can be given as a parameter for loading.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-hideloading/" target="_blank">Show and hide loading from a button</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-showloading/" target="_blank">apply different text labels.</a>
    * @since 2.0.5
    */
  def showLoading(str: js.UndefOr[String] = js.undefined): Unit = js.native

  /**
    * This method is deprecated as of 2.0.1. Updating the chart position after a move operation is no longer necessary.
    * @since 1.2.5
    */
  def updatePosition(): Unit = js.native

  /**
    * Add a series to the chart as drilldown from a specific point in the parent series. This method is used for async drilldown, when clicking a point in a series should result in loading and displaying a more high-resolution series. When <i>not</i> async, the setup is simpler using the <a href="#drilldown.series">drilldown.series</a> options structure.
    * @param point 
The existing Point object from which the drilldown will start.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/drilldown/async/" target="_blank">Async drilldown</a>
    * @since 3.0.8
    */
  def addSeriesAsDrilldown(point: js.UndefOr[js.Object] = js.undefined, seriesOptions: js.UndefOr[js.Object] = js.undefined): Unit = js.native

  /**
    * When the chart is drilled down to a child series, calling <code>chart.drillUp()</code> will drill up to the parent series.
    * @since 3.0.8
    */
  def drillUp(): Unit = js.native

  /**
    * Set a new title or subtitle for the chart
    * @param title A configuration object for the new title as defined at <a class="internal" href="#title">#title</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-settitle/" target="_blank">Set title text and styles</a>
    * @since 2.1.0
    */
  def setTitle(title: js.UndefOr[js.Object] = js.undefined, subtitle: js.Any = js.undefined, redraw: js.UndefOr[Boolean] = js.undefined): Unit = js.native

  /**
    * Returns an array of all currently selected series in the chart. Series can be selected either programmatically by the <code>series.select()</code> method or by checking the checkbox next to the legend item if <code>series.showCheckBox</code> is true.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-getselectedseries/" target="_blank">Get selected series</a>
    * @since 1.2.0
    */
  def getSelectedSeries(): js.Array[CleanJsObject[Series]] = js.native

  /**
    * Hide the loading screen. Options for the loading screen are defined at <a class="internal" href="#loading">options.loading</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-hideloading/" target="_blank">Show and hide loading from a button</a>
    * @since 1.2.0
    */
  def hideLoading(): Unit = js.native

  /**
    * An array of all the chart's series.
    * @since 1.2.0
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
    * @since 1.2.0
    */
  def redraw(animation: js.Any = js.undefined): Unit = js.native
}
