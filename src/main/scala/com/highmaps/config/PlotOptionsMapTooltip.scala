/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-map-tooltip</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMapTooltip extends js.Object {

  /**
    * <p>Whether the tooltip should follow the mouse as it moves across columns, pie slices and other point types with an extent. By default it behaves this way for scatter, bubble and pie series by override in the <code>plotOptions</code> for those series types. </p>
    * <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    */
  val followPointer: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether the tooltip should follow the finger as it moves on a touch device. If this is <code>true</code> and <a href="#chart.panning">chart.panning</a> is set,<code>followTouchMove</code> will take over one-finger touches, so the user needs to use two fingers for zooming and panning.
    */
  val followTouchMove: js.UndefOr[Boolean] = js.undefined

  /**
    * A string to append to the tooltip format.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/tooltip/format/" target="_blank">Format demo</a>
    */
  val footerFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables			are <code>point.name</code>, <code>series.name</code>, <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects.</p>
    *  
    * <p>Defaults to <code>&lt;span style="font-size: 10px"&gt;{point.key}&lt;/span&gt;&lt;br/&gt;</code></p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/tooltip/format/" target="_blank">Format demo</a>
    */
  val headerFormat: js.UndefOr[String] = js.undefined

  /**
    * The number of milliseconds to wait until the tooltip is hidden when mouse out from a point or chart. 
    */
  val hideDelay: js.UndefOr[Double] = js.undefined

  /**
    * Padding inside the tooltip, in pixels.
    * @since 5.0.0
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are point.value, series.name and series.color and other properties on the same form. Furthermore,  point.value can be extended by the <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can also be overridden for each series, which makes it a good hook for displaying units.</p>
    *  <p>For maps it defaults to <code>'{point.name}: {point.value}&lt;br/&gt;'</code></p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/tooltip/format/" target="_blank">Format demo</a>
    */
  val pointFormat: js.UndefOr[String] = js.undefined

  /**
    * A callback function for formatting the HTML output for a single point in the tooltip. Like the <code>pointFormat</code> string, but with more flexibility.
    * @since 1.1.0
    */
  val pointFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * Split the tooltip into one label per series, with the header close to the axis. This is recommended over <a href="#tooltip.shared">shared</a> tooltips for charts with multiple line series, generally making them easier to read.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/tooltip/split/" target="_blank">Split tooltip</a>
    * @since 5.0.0
    */
  val split: js.UndefOr[Boolean] = js.undefined

  /**
    * How many decimals to show in each series'  value. This is overridable in each series' tooltip options object. The default is to preserve all decimals.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    */
  val valueDecimals: js.UndefOr[Double] = js.undefined

  /**
    * A string to prepend to each series' value. Overridable in each series' tooltip options object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    */
  val valuePrefix: js.UndefOr[String] = js.undefined

  /**
    * A string to append to each series' value. Overridable in each series' tooltip options object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    */
  val valueSuffix: js.UndefOr[String] = js.undefined
}

object PlotOptionsMapTooltip {
  /**
    * @param followPointer <p>Whether the tooltip should follow the mouse as it moves across columns, pie slices and other point types with an extent. By default it behaves this way for scatter, bubble and pie series by override in the <code>plotOptions</code> for those series types. </p>. <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @param followTouchMove Whether the tooltip should follow the finger as it moves on a touch device. If this is <code>true</code> and <a href="#chart.panning">chart.panning</a> is set,<code>followTouchMove</code> will take over one-finger touches, so the user needs to use two fingers for zooming and panning.
    * @param footerFormat A string to append to the tooltip format.
    * @param headerFormat <p>The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables			are <code>point.name</code>, <code>series.name</code>, <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects.</p>.  . <p>Defaults to <code>&lt;span style="font-size: 10px"&gt;{point.key}&lt;/span&gt;&lt;br/&gt;</code></p>
    * @param hideDelay The number of milliseconds to wait until the tooltip is hidden when mouse out from a point or chart. 
    * @param padding Padding inside the tooltip, in pixels.
    * @param pointFormat <p>The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are point.value, series.name and series.color and other properties on the same form. Furthermore,  point.value can be extended by the <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can also be overridden for each series, which makes it a good hook for displaying units.</p>.  <p>For maps it defaults to <code>'{point.name}: {point.value}&lt;br/&gt;'</code></p>
    * @param pointFormatter A callback function for formatting the HTML output for a single point in the tooltip. Like the <code>pointFormat</code> string, but with more flexibility.
    * @param split Split the tooltip into one label per series, with the header close to the axis. This is recommended over <a href="#tooltip.shared">shared</a> tooltips for charts with multiple line series, generally making them easier to read.
    * @param valueDecimals How many decimals to show in each series'  value. This is overridable in each series' tooltip options object. The default is to preserve all decimals.
    * @param valuePrefix A string to prepend to each series' value. Overridable in each series' tooltip options object.
    * @param valueSuffix A string to append to each series' value. Overridable in each series' tooltip options object.
    */
  def apply(followPointer: js.UndefOr[Boolean] = js.undefined, followTouchMove: js.UndefOr[Boolean] = js.undefined, footerFormat: js.UndefOr[String] = js.undefined, headerFormat: js.UndefOr[String] = js.undefined, hideDelay: js.UndefOr[Double] = js.undefined, padding: js.UndefOr[Double] = js.undefined, pointFormat: js.UndefOr[String] = js.undefined, pointFormatter: js.UndefOr[js.Function] = js.undefined, split: js.UndefOr[Boolean] = js.undefined, valueDecimals: js.UndefOr[Double] = js.undefined, valuePrefix: js.UndefOr[String] = js.undefined, valueSuffix: js.UndefOr[String] = js.undefined): PlotOptionsMapTooltip = {
    val followPointerOuter: js.UndefOr[Boolean] = followPointer
    val followTouchMoveOuter: js.UndefOr[Boolean] = followTouchMove
    val footerFormatOuter: js.UndefOr[String] = footerFormat
    val headerFormatOuter: js.UndefOr[String] = headerFormat
    val hideDelayOuter: js.UndefOr[Double] = hideDelay
    val paddingOuter: js.UndefOr[Double] = padding
    val pointFormatOuter: js.UndefOr[String] = pointFormat
    val pointFormatterOuter: js.UndefOr[js.Function] = pointFormatter
    val splitOuter: js.UndefOr[Boolean] = split
    val valueDecimalsOuter: js.UndefOr[Double] = valueDecimals
    val valuePrefixOuter: js.UndefOr[String] = valuePrefix
    val valueSuffixOuter: js.UndefOr[String] = valueSuffix
    new PlotOptionsMapTooltip {
      override val followPointer: js.UndefOr[Boolean] = followPointerOuter
      override val followTouchMove: js.UndefOr[Boolean] = followTouchMoveOuter
      override val footerFormat: js.UndefOr[String] = footerFormatOuter
      override val headerFormat: js.UndefOr[String] = headerFormatOuter
      override val hideDelay: js.UndefOr[Double] = hideDelayOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val pointFormat: js.UndefOr[String] = pointFormatOuter
      override val pointFormatter: js.UndefOr[js.Function] = pointFormatterOuter
      override val split: js.UndefOr[Boolean] = splitOuter
      override val valueDecimals: js.UndefOr[Double] = valueDecimalsOuter
      override val valuePrefix: js.UndefOr[String] = valuePrefixOuter
      override val valueSuffix: js.UndefOr[String] = valueSuffixOuter
    }
  }
}
