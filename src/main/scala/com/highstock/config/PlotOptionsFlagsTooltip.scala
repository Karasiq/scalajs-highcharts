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
  * @note JavaScript name: <code>plotOptions-flags-tooltip</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsFlagsTooltip extends js.Object {

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
    * @since 1.3
    */
  val followPointer: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether the tooltip should follow the finger as it moves on a touch device. If this is <code>true</code> and <a href="#chart.panning">chart.panning</a> is set,<code>followTouchMove</code> will take over one-finger touches, so the user needs to use two fingers for zooming and panning.
    * @since 1.3.1
    */
  val followTouchMove: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables			are <code>point.key</code>, <code>series.name</code>, <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects. The <code>point.key</code> variable contains the category name, x value or datetime string depending on the type of axis. For datetime axes, the <code>point.key</code> date format can be set using tooltip.xDateFormat.</p>
    *  
    * <p>Defaults to <code>&lt;span style="font-size: 10px"&gt;{point.key}&lt;/span&gt;&lt;br/&gt;</code></p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/" target="_blank">A HTML table in the tooltip</a>
    */
  val headerFormat: js.UndefOr[String] = js.undefined

  /**
    * Padding inside the tooltip, in pixels.
    * @since 5.0.0
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are point.x, point.y, point.change, series.name and series.color and other properties on the same form. Furthermore,  point.y can be extended by the tooltip.valuePrefix and tooltip.valueSuffix variables. This can also be overridden for each series, which makes it a good hook for displaying units.</p>
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the dot is colored by a class name rather than the point color.</p>
    */
  val pointFormat: js.UndefOr[String] = js.undefined

  /**
    * A callback function for formatting the HTML output for a single point in the tooltip. Like the <code>pointFormat</code> string, but with more flexibility.
    * @since 2.1.0
    */
  val pointFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * The name of a symbol to use for the border around the tooltip. In Highstock 1.x, the shape was <code>square</code>. 
    * @since 2.0
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * Split the tooltip into one label per series, with the header close to the axis. This is recommended over <a href="#tooltip.shared">shared</a> tooltips for charts with multiple line series, generally making them easier to read.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/tooltip/split/" target="_blank">Split tooltip</a>
    * @since 5.0.0
    */
  val split: js.UndefOr[Boolean] = js.undefined

  /**
    * The format for the date in the tooltip header. If data grouping is used, the default is  a smart guess based on how close the closest points are. It is pulled from the #plotOptions.dataGrouping.dateTimeLabelFormats array.
    */
  val xDateFormat: js.UndefOr[String] = js.undefined
}

object PlotOptionsFlagsTooltip {
  /**
    * @param dateTimeLabelFormats <p>For series on a datetime axes, the date format in the tooltip's header will by default be guessed based on the closest data points. This member gives the default string representations used for each unit. For an overview of the replacement codes, see <a href="#Highcharts.dateFormat">dateFormat</a>.</p>. . <p>Defaults to:. <pre>{.     millisecond:"%A, %b %e, %H:%M:%S.%L",.     second:"%A, %b %e, %H:%M:%S",.     minute:"%A, %b %e, %H:%M",.     hour:"%A, %b %e, %H:%M",.     day:"%A, %b %e, %Y",.     week:"Week from %A, %b %e, %Y",.     month:"%B %Y",.     year:"%Y". }</pre>. </p>
    * @param followPointer <p>Whether the tooltip should follow the mouse as it moves across columns, pie slices and other point types with an extent. By default it behaves this way for scatter, bubble and pie series by override in the <code>plotOptions</code> for those series types. </p>. <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @param followTouchMove Whether the tooltip should follow the finger as it moves on a touch device. If this is <code>true</code> and <a href="#chart.panning">chart.panning</a> is set,<code>followTouchMove</code> will take over one-finger touches, so the user needs to use two fingers for zooming and panning.
    * @param headerFormat <p>The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables			are <code>point.key</code>, <code>series.name</code>, <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects. The <code>point.key</code> variable contains the category name, x value or datetime string depending on the type of axis. For datetime axes, the <code>point.key</code> date format can be set using tooltip.xDateFormat.</p>.  . <p>Defaults to <code>&lt;span style="font-size: 10px"&gt;{point.key}&lt;/span&gt;&lt;br/&gt;</code></p>
    * @param padding Padding inside the tooltip, in pixels.
    * @param pointFormat <p>The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are point.x, point.y, point.change, series.name and series.color and other properties on the same form. Furthermore,  point.y can be extended by the tooltip.valuePrefix and tooltip.valueSuffix variables. This can also be overridden for each series, which makes it a good hook for displaying units.</p>. <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the dot is colored by a class name rather than the point color.</p>
    * @param pointFormatter A callback function for formatting the HTML output for a single point in the tooltip. Like the <code>pointFormat</code> string, but with more flexibility.
    * @param shape The name of a symbol to use for the border around the tooltip. In Highstock 1.x, the shape was <code>square</code>. 
    * @param split Split the tooltip into one label per series, with the header close to the axis. This is recommended over <a href="#tooltip.shared">shared</a> tooltips for charts with multiple line series, generally making them easier to read.
    * @param xDateFormat The format for the date in the tooltip header. If data grouping is used, the default is  a smart guess based on how close the closest points are. It is pulled from the #plotOptions.dataGrouping.dateTimeLabelFormats array.
    */
  def apply(dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined, followPointer: js.UndefOr[Boolean] = js.undefined, followTouchMove: js.UndefOr[Boolean] = js.undefined, headerFormat: js.UndefOr[String] = js.undefined, padding: js.UndefOr[Double] = js.undefined, pointFormat: js.UndefOr[String] = js.undefined, pointFormatter: js.UndefOr[js.Function] = js.undefined, shape: js.UndefOr[String] = js.undefined, split: js.UndefOr[Boolean] = js.undefined, xDateFormat: js.UndefOr[String] = js.undefined): PlotOptionsFlagsTooltip = {
    val dateTimeLabelFormatsOuter: js.UndefOr[js.Object] = dateTimeLabelFormats
    val followPointerOuter: js.UndefOr[Boolean] = followPointer
    val followTouchMoveOuter: js.UndefOr[Boolean] = followTouchMove
    val headerFormatOuter: js.UndefOr[String] = headerFormat
    val paddingOuter: js.UndefOr[Double] = padding
    val pointFormatOuter: js.UndefOr[String] = pointFormat
    val pointFormatterOuter: js.UndefOr[js.Function] = pointFormatter
    val shapeOuter: js.UndefOr[String] = shape
    val splitOuter: js.UndefOr[Boolean] = split
    val xDateFormatOuter: js.UndefOr[String] = xDateFormat
    new PlotOptionsFlagsTooltip {
      override val dateTimeLabelFormats: js.UndefOr[js.Object] = dateTimeLabelFormatsOuter
      override val followPointer: js.UndefOr[Boolean] = followPointerOuter
      override val followTouchMove: js.UndefOr[Boolean] = followTouchMoveOuter
      override val headerFormat: js.UndefOr[String] = headerFormatOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val pointFormat: js.UndefOr[String] = pointFormatOuter
      override val pointFormatter: js.UndefOr[js.Function] = pointFormatterOuter
      override val shape: js.UndefOr[String] = shapeOuter
      override val split: js.UndefOr[Boolean] = splitOuter
      override val xDateFormat: js.UndefOr[String] = xDateFormatOuter
    }
  }
}
