/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.7 by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-bar-tooltip</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsBarTooltip extends js.Object {

  /**
    * <p>For series on a datetime axes, the date format in the tooltip's header will by default be guessed based on the closest data points. This member gives the default string representations used for each unit. For an overview of the replacement codes, see <a href="#Highcharts.dateFormat">dateFormat</a>.</p>
    * 
    * <p>Defaults to:
    * <pre>{
    *     millisecond:"%A, %b %e, %H:%M:%S.%L",
    *     second:"%A, %b %e, %H:%M:%S",
    *     minute:"%A, %b %e, %H:%M",
    *     hour:"%A, %b %e, %H:%M",
    *     day:"%A, %b %e, %Y",
    *     week:"Week from %A, %b %e, %Y",
    *     month:"%B %Y",
    *     year:"%Y"
    * }</pre>
    * </p>
    */
  val dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Whether the tooltip should follow the mouse as it moves across columns, pie slices and other point types with an extent. By default it behaves this way for scatter, bubble and pie series by override in the <code>plotOptions</code> for those series types. </p>
    * <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @since 3.0
    */
  val followPointer: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether the tooltip should follow the finger as it moves on a touch device. If <a href="#chart.zoomType">chart.zoomType</a> is set, it will override <code>followTouchMove</code>.
    * @since 3.0.1
    */
  val followTouchMove: js.UndefOr[Boolean] = js.undefined

  /**
    * A string to append to the tooltip format.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/footerformat/" target="_blank">A table for value alignment</a>
    * @since 2.2
    */
  val footerFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables			are <code>point.key</code>, <code>series.name</code>, <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects. The <code>point.key</code> variable contains the category name, x value or datetime string depending on the type of axis. For datetime axes, the <code>point.key</code> date format can be set using tooltip.xDateFormat.</p>
    *  
    * <p>Defaults to <code>&lt;span style="font-size: 10px"&gt;{point.key}&lt;/span&gt;&lt;br/&gt;</code></p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/footerformat/" target="_blank">A HTML table in the tooltip</a>
    */
  val headerFormat: js.UndefOr[String] = js.undefined

  /**
    * The number of milliseconds to wait until the tooltip is hidden when mouse out from a point or chart. 
    * @since 3.0
    */
  val hideDelay: js.UndefOr[Double] = js.undefined

  /**
    * <p>The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are point.x, point.y, series.name and series.color and other properties on the same form. Furthermore,  point.y can be extended by the <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can also be overridden for each series, which makes it a good hook for displaying units.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/pointformat/" target="_blank">A different point format with value suffix</a>
    * @since 2.2
    */
  val pointFormat: js.UndefOr[String] = js.undefined

  /**
    * A callback function for formatting the HTML output for a single point in the tooltip. Like the <code>pointFormat</code> string, but with more flexibility.
    * @since 4.1.0
    */
  val pointFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * How many decimals to show in each series' y value. This is overridable in each series' tooltip options object. The default is to preserve all decimals.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    * @since 2.2
    */
  val valueDecimals: js.UndefOr[Double] = js.undefined

  /**
    * A string to prepend to each series' y value. Overridable in each series' tooltip options object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    * @since 2.2
    */
  val valuePrefix: js.UndefOr[String] = js.undefined

  /**
    * A string to append to each series' y value. Overridable in each series' tooltip options object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    * @since 2.2
    */
  val valueSuffix: js.UndefOr[String] = js.undefined

  /**
    * The format for the date in the tooltip header if the X axis is a datetime axis. The default is a best guess based on the smallest distance between points in the chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/xdateformat/" target="_blank">A different format</a>
    */
  val xDateFormat: js.UndefOr[String] = js.undefined
}
