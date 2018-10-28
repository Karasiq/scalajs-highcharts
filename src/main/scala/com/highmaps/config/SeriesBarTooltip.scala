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
  * @note JavaScript name: <code>series&lt;bar&gt;-tooltip</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBarTooltip extends com.highcharts.HighchartsGenericObject {

  val distance: js.UndefOr[Double] = js.undefined

  /**
    * <p>For series on a datetime axes, the date format in the tooltip&#39;s
    * header will by default be guessed based on the closest data points.
    * This member gives the default string representations used for
    * each unit. For an overview of the replacement codes, see
    * <a href="/class-reference/Highcharts#dateFormat">dateFormat</a>.</p>
    * @since 2.3
    */
  val dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>A string to append to the tooltip format.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">A table for value alignment</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/format/">Format demo</a>
    * @since 2.2
    */
  val footerFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Padding inside the tooltip, in pixels.</p>
    * @since 5.0.0
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The HTML of the tooltip header line. Variables are enclosed by
    * curly brackets. Available variables are <code>point.key</code>, <code>series.name</code>,
    * <code>series.color</code> and other members from the <code>point</code> and <code>series</code>
    * objects. The <code>point.key</code> variable contains the category name, x
    * value or datetime string depending on the type of axis. For datetime
    * axes, the <code>point.key</code> date format can be set using
    * <code>tooltip.xDateFormat</code>. To access the original point use
    * <code>point.point</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">An HTML table in the tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">An HTML table in the tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/format/">Format demo</a>
    * @since 2.3
    */
  val headerFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>The HTML of the point&#39;s line in the tooltip. Variables are enclosed
    * by curly brackets. Available variables are point.x, point.y, series.
    * name and series.color and other properties on the same form.
    * Furthermore, <code>point.y</code> can be extended by the <code>tooltip.valuePrefix</code>
    * and <code>tooltip.valueSuffix</code> variables. This can also be overridden for
    * each series, which makes it a good hook for displaying units.</p>
    * <p>In styled mode, the dot is colored by a class name rather
    * than the point color.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/pointformat/">A different point format with value suffix</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/format/">Format demo</a>
    * @since 2.2
    */
  val pointFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether the tooltip should follow the mouse as it moves across
    * columns, pie slices and other point types with an extent. By default
    * it behaves this way for scatter, bubble and pie series by override
    * in the <code>plotOptions</code> for those series types.</p>
    * <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @since 3.0
    */
  val followPointer: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether the tooltip should update as the finger moves on a touch
    * device. If this is <code>true</code> and <a href="#chart.panning">chart.panning</a> is
    * set,<code>followTouchMove</code> will take over one-finger touches, so the user
    * needs to use two fingers for zooming and panning.</p>
    * <p>Note the difference to <a href="#tooltip.followPointer">followPointer</a> that
    * only defines the <em>position</em> of the tooltip. If <code>followPointer</code> is
    * false in for example a column series, the tooltip will show above or
    * below the column, but as <code>followTouchMove</code> is true, the tooltip will
    * jump from column to column as the user swipes across the plot area.</p>
    * @since 3.0.1
    */
  val followTouchMove: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The number of milliseconds to wait until the tooltip is hidden when
    * mouse out from a point or chart.</p>
    * @since 3.0
    */
  val hideDelay: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to allow the tooltip to render outside the chart&#39;s SVG
    * element box. By default (<code>false</code>), the tooltip is rendered within the
    * chart&#39;s SVG element, which results in the tooltip being aligned
    * inside the chart area. For small charts, this may result in clipping
    * or overlapping. When <code>true</code>, a separate SVG element is created and
    * overlaid on the page, allowing the tooltip to be aligned inside the
    * page itself.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/outside">Small charts with tooltips outside</a>
    * @since 6.1.1
    */
  val outside: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A callback function for formatting the HTML output for a single point
    * in the tooltip. Like the <code>pointFormat</code> string, but with more
    * flexibility.</p>
    * @since 4.1.0
    */
  val pointFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Split the tooltip into one label per series, with the header close
    * to the axis. This is recommended over <a href="#tooltip.shared">shared</a>
    * tooltips for charts with multiple line series, generally making them
    * easier to read. This option takes precedence over <code>tooltip.shared</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/split/">Split tooltip</a>
    * @since 5.0.0
    */
  val split: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>How many decimals to show in each series&#39; y value. This is
    * overridable in each series&#39; tooltip options object. The default is to
    * preserve all decimals.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
    * @since 2.2
    */
  val valueDecimals: js.UndefOr[Double] = js.undefined

  /**
    * <p>A string to prepend to each series&#39; y value. Overridable in each
    * series&#39; tooltip options object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
    * @since 2.2
    */
  val valuePrefix: js.UndefOr[String] = js.undefined

  /**
    * <p>A string to append to each series&#39; y value. Overridable in each
    * series&#39; tooltip options object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
    * @since 2.2
    */
  val valueSuffix: js.UndefOr[String] = js.undefined

  /**
    * <p>The format for the date in the tooltip header if the X axis is a
    * datetime axis. The default is a best guess based on the smallest
    * distance between points in the chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/xdateformat/">A different format</a>
    * @since 2.3
    */
  val xDateFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>How many decimals to show for the <code>point.change</code> value when the
    * <code>series.compare</code> option is set. This is overridable in each series&#39;
    * tooltip options object. The default is to preserve all decimals.</p>
    * @since 1.0.1
    */
  val changeDecimals: js.UndefOr[Double] = js.undefined
}

object SeriesBarTooltip {
  /**
    * @param dateTimeLabelFormats <p>For series on a datetime axes, the date format in the tooltip&#39;s. header will by default be guessed based on the closest data points.. This member gives the default string representations used for. each unit. For an overview of the replacement codes, see. <a href="/class-reference/Highcharts#dateFormat">dateFormat</a>.</p>
    * @param footerFormat <p>A string to append to the tooltip format.</p>
    * @param padding <p>Padding inside the tooltip, in pixels.</p>
    * @param headerFormat <p>The HTML of the tooltip header line. Variables are enclosed by. curly brackets. Available variables are <code>point.key</code>, <code>series.name</code>,. <code>series.color</code> and other members from the <code>point</code> and <code>series</code>. objects. The <code>point.key</code> variable contains the category name, x. value or datetime string depending on the type of axis. For datetime. axes, the <code>point.key</code> date format can be set using. <code>tooltip.xDateFormat</code>. To access the original point use. <code>point.point</code>.</p>
    * @param pointFormat <p>The HTML of the point&#39;s line in the tooltip. Variables are enclosed. by curly brackets. Available variables are point.x, point.y, series.. name and series.color and other properties on the same form.. Furthermore, <code>point.y</code> can be extended by the <code>tooltip.valuePrefix</code>. and <code>tooltip.valueSuffix</code> variables. This can also be overridden for. each series, which makes it a good hook for displaying units.</p>. <p>In styled mode, the dot is colored by a class name rather. than the point color.</p>
    * @param followPointer <p>Whether the tooltip should follow the mouse as it moves across. columns, pie slices and other point types with an extent. By default. it behaves this way for scatter, bubble and pie series by override. in the <code>plotOptions</code> for those series types.</p>. <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @param followTouchMove <p>Whether the tooltip should update as the finger moves on a touch. device. If this is <code>true</code> and <a href="#chart.panning">chart.panning</a> is. set,<code>followTouchMove</code> will take over one-finger touches, so the user. needs to use two fingers for zooming and panning.</p>. <p>Note the difference to <a href="#tooltip.followPointer">followPointer</a> that. only defines the <em>position</em> of the tooltip. If <code>followPointer</code> is. false in for example a column series, the tooltip will show above or. below the column, but as <code>followTouchMove</code> is true, the tooltip will. jump from column to column as the user swipes across the plot area.</p>
    * @param hideDelay <p>The number of milliseconds to wait until the tooltip is hidden when. mouse out from a point or chart.</p>
    * @param outside <p>Whether to allow the tooltip to render outside the chart&#39;s SVG. element box. By default (<code>false</code>), the tooltip is rendered within the. chart&#39;s SVG element, which results in the tooltip being aligned. inside the chart area. For small charts, this may result in clipping. or overlapping. When <code>true</code>, a separate SVG element is created and. overlaid on the page, allowing the tooltip to be aligned inside the. page itself.</p>
    * @param pointFormatter <p>A callback function for formatting the HTML output for a single point. in the tooltip. Like the <code>pointFormat</code> string, but with more. flexibility.</p>
    * @param split <p>Split the tooltip into one label per series, with the header close. to the axis. This is recommended over <a href="#tooltip.shared">shared</a>. tooltips for charts with multiple line series, generally making them. easier to read. This option takes precedence over <code>tooltip.shared</code>.</p>
    * @param valueDecimals <p>How many decimals to show in each series&#39; y value. This is. overridable in each series&#39; tooltip options object. The default is to. preserve all decimals.</p>
    * @param valuePrefix <p>A string to prepend to each series&#39; y value. Overridable in each. series&#39; tooltip options object.</p>
    * @param valueSuffix <p>A string to append to each series&#39; y value. Overridable in each. series&#39; tooltip options object.</p>
    * @param xDateFormat <p>The format for the date in the tooltip header if the X axis is a. datetime axis. The default is a best guess based on the smallest. distance between points in the chart.</p>
    * @param changeDecimals <p>How many decimals to show for the <code>point.change</code> value when the. <code>series.compare</code> option is set. This is overridable in each series&#39;. tooltip options object. The default is to preserve all decimals.</p>
    */
  def apply(distance: js.UndefOr[Double] = js.undefined, dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined, footerFormat: js.UndefOr[String] = js.undefined, padding: js.UndefOr[Double] = js.undefined, headerFormat: js.UndefOr[String] = js.undefined, pointFormat: js.UndefOr[String] = js.undefined, followPointer: js.UndefOr[Boolean] = js.undefined, followTouchMove: js.UndefOr[Boolean] = js.undefined, hideDelay: js.UndefOr[Double] = js.undefined, outside: js.UndefOr[Boolean] = js.undefined, pointFormatter: js.UndefOr[js.Function] = js.undefined, split: js.UndefOr[Boolean] = js.undefined, valueDecimals: js.UndefOr[Double] = js.undefined, valuePrefix: js.UndefOr[String] = js.undefined, valueSuffix: js.UndefOr[String] = js.undefined, xDateFormat: js.UndefOr[String] = js.undefined, changeDecimals: js.UndefOr[Double] = js.undefined): SeriesBarTooltip = {
    val distanceOuter: js.UndefOr[Double] = distance
    val dateTimeLabelFormatsOuter: js.UndefOr[js.Object] = dateTimeLabelFormats
    val footerFormatOuter: js.UndefOr[String] = footerFormat
    val paddingOuter: js.UndefOr[Double] = padding
    val headerFormatOuter: js.UndefOr[String] = headerFormat
    val pointFormatOuter: js.UndefOr[String] = pointFormat
    val followPointerOuter: js.UndefOr[Boolean] = followPointer
    val followTouchMoveOuter: js.UndefOr[Boolean] = followTouchMove
    val hideDelayOuter: js.UndefOr[Double] = hideDelay
    val outsideOuter: js.UndefOr[Boolean] = outside
    val pointFormatterOuter: js.UndefOr[js.Function] = pointFormatter
    val splitOuter: js.UndefOr[Boolean] = split
    val valueDecimalsOuter: js.UndefOr[Double] = valueDecimals
    val valuePrefixOuter: js.UndefOr[String] = valuePrefix
    val valueSuffixOuter: js.UndefOr[String] = valueSuffix
    val xDateFormatOuter: js.UndefOr[String] = xDateFormat
    val changeDecimalsOuter: js.UndefOr[Double] = changeDecimals
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBarTooltip {
      override val distance: js.UndefOr[Double] = distanceOuter
      override val dateTimeLabelFormats: js.UndefOr[js.Object] = dateTimeLabelFormatsOuter
      override val footerFormat: js.UndefOr[String] = footerFormatOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val headerFormat: js.UndefOr[String] = headerFormatOuter
      override val pointFormat: js.UndefOr[String] = pointFormatOuter
      override val followPointer: js.UndefOr[Boolean] = followPointerOuter
      override val followTouchMove: js.UndefOr[Boolean] = followTouchMoveOuter
      override val hideDelay: js.UndefOr[Double] = hideDelayOuter
      override val outside: js.UndefOr[Boolean] = outsideOuter
      override val pointFormatter: js.UndefOr[js.Function] = pointFormatterOuter
      override val split: js.UndefOr[Boolean] = splitOuter
      override val valueDecimals: js.UndefOr[Double] = valueDecimalsOuter
      override val valuePrefix: js.UndefOr[String] = valuePrefixOuter
      override val valueSuffix: js.UndefOr[String] = valueSuffixOuter
      override val xDateFormat: js.UndefOr[String] = xDateFormatOuter
      override val changeDecimals: js.UndefOr[Double] = changeDecimalsOuter
    })
  }
}
