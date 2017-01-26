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
  * @note JavaScript name: <code>tooltip</code>
  */
@js.annotation.ScalaJSDefined
class Tooltip extends js.Object {

  /**
    * Enable or disable animation of the tooltip. In slow legacy IE browsers the animation is disabled by default.
    */
  val animation: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The background color or gradient for the tooltip.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is set in the <code>.highcharts-tooltip-box</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/tooltip/background-border/" target="_blank">Background and border demo</a>.


<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/" target="_blank">Tooltip in styled mode</a>.
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The color of the tooltip border. When <code>null</code>, the border takes the color of the corresponding series or point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/tooltip/background-border/" target="_blank">Background and border demo</a>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The radius of the rounded border corners.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/tooltip/background-border/" target="_blank">Background and border demo</a>
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel width of the tooltip border.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is set in the <code>.highcharts-tooltip-box</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/tooltip/background-border/" target="_blank">Background and border demo</a>.	

<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/" target="_blank">Tooltip in styled mode</a>.
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * Since 1.1, the crosshair definitions are moved to the Axis object in order for a better separation from the tooltip. See <a href="#xAxis.crosshair">xAxis.crosshair<a>.
    */
  val crosshairs: js.Any = js.undefined

  /**
    * Enable or disable the tooltip.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

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
    * <p>Callback function to format the text of the tooltip. Return false to disable tooltip for a specific point on series.</p> 
    * 
    * <p>A subset of HTML is supported. Unless useHTML is true, the HTML of the tooltip is parsed and converted to SVG,  therefore this isn't a complete HTML renderer. The following tags are supported:  <code>&lt;b&gt;</code>, <code>&lt;strong&gt;</code>, <code>&lt;i&gt;</code>, <code>&lt;em&gt;</code>, <code>&lt;br/&gt;</code>, <code>&lt;span&gt;</code>. Spans can be styled with a <code>style</code> attribute, but only text-related CSS that is  shared with SVG is handled. </p> 
    * 
    * <p>Available data are:</p> <dl> 	
    * 
    * <dt>this.point</dt>
    * <dd>The point object. The point name, if defined, is available  through <code>this.point.name</code>, and the value through <code>this.point.value</code>.</dd> 	 	
    *  	
    * <dt>this.series</dt> 	
    * <dd>The series object. The series name is available  through <code>this.series.name</code>.</dd>
    * 
    * 
    * </dl>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/tooltip/formatter/" target="_blank">String formatting</a>
    */
  val formatter: js.UndefOr[js.Function] = js.undefined

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
    * <p>A callback function to place the tooltip in a default position. The callback receives three parameters: <code>labelWidth</code>, <code>labelHeight</code> and <code>point</code>, where point contains values for <code>plotX</code> and <code>plotY</code> telling where the reference point is in the plot area. Add <code>chart.plotLeft</code> and <code>chart.plotTop</code> to get the full coordinates.</p>
    * 
    * <p>The return should be an object containing x and y values, for example <code>{ x: 100, y: 100 }</code>.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/tooltip/positioner/" target="_blank">
				A fixed tooltip position</a>
    */
  val positioner: js.UndefOr[js.Function] = js.undefined

  /**
    * Whether to apply a drop shadow to the tooltip.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/tooltip/positioner/" target="_blank">Fixed tooltip position, border and shadow disabled</a>
    */
  val shadow: js.UndefOr[Boolean] = js.undefined

  /**
    * Split the tooltip into one label per series, with the header close to the axis. This is recommended over <a href="#tooltip.shared">shared</a> tooltips for charts with multiple line series, generally making them easier to read.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/tooltip/split/" target="_blank">Split tooltip</a>
    * @since 5.0.0
    */
  val split: js.UndefOr[Boolean] = js.undefined

  /**
    * CSS styles for the tooltip. The tooltip can also be styled through the CSS
    *  class <code>.highcharts-tooltip</code>.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * Use HTML to render the contents of the tooltip instead of SVG. Using HTML allows advanced formatting like tables and images in the tooltip. It is also recommended for rtl languages as it works around rtl bugs in early Firefox.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/tooltip/usehtml/" target="_blank">Pure HTML tooltip</a>
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

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

object Tooltip {
  /**
    * @param animation Enable or disable animation of the tooltip. In slow legacy IE browsers the animation is disabled by default.
    * @param backgroundColor <p>The background color or gradient for the tooltip.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is set in the <code>.highcharts-tooltip-box</code> class.</p>
    * @param borderColor The color of the tooltip border. When <code>null</code>, the border takes the color of the corresponding series or point.
    * @param borderRadius The radius of the rounded border corners.
    * @param borderWidth <p>The pixel width of the tooltip border.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is set in the <code>.highcharts-tooltip-box</code> class.</p>
    * @param crosshairs Since 1.1, the crosshair definitions are moved to the Axis object in order for a better separation from the tooltip. See <a href="#xAxis.crosshair">xAxis.crosshair<a>.
    * @param enabled Enable or disable the tooltip.
    * @param followPointer <p>Whether the tooltip should follow the mouse as it moves across columns, pie slices and other point types with an extent. By default it behaves this way for scatter, bubble and pie series by override in the <code>plotOptions</code> for those series types. </p>. <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @param followTouchMove Whether the tooltip should follow the finger as it moves on a touch device. If this is <code>true</code> and <a href="#chart.panning">chart.panning</a> is set,<code>followTouchMove</code> will take over one-finger touches, so the user needs to use two fingers for zooming and panning.
    * @param footerFormat A string to append to the tooltip format.
    * @param formatter <p>Callback function to format the text of the tooltip. Return false to disable tooltip for a specific point on series.</p> . . <p>A subset of HTML is supported. Unless useHTML is true, the HTML of the tooltip is parsed and converted to SVG,  therefore this isn't a complete HTML renderer. The following tags are supported:  <code>&lt;b&gt;</code>, <code>&lt;strong&gt;</code>, <code>&lt;i&gt;</code>, <code>&lt;em&gt;</code>, <code>&lt;br/&gt;</code>, <code>&lt;span&gt;</code>. Spans can be styled with a <code>style</code> attribute, but only text-related CSS that is  shared with SVG is handled. </p> . . <p>Available data are:</p> <dl> 	. . <dt>this.point</dt>. <dd>The point object. The point name, if defined, is available  through <code>this.point.name</code>, and the value through <code>this.point.value</code>.</dd> 	 	.  	. <dt>this.series</dt> 	. <dd>The series object. The series name is available  through <code>this.series.name</code>.</dd>. . . </dl>
    * @param headerFormat <p>The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables			are <code>point.name</code>, <code>series.name</code>, <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects.</p>.  . <p>Defaults to <code>&lt;span style="font-size: 10px"&gt;{point.key}&lt;/span&gt;&lt;br/&gt;</code></p>
    * @param hideDelay The number of milliseconds to wait until the tooltip is hidden when mouse out from a point or chart. 
    * @param padding Padding inside the tooltip, in pixels.
    * @param pointFormat <p>The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are point.value, series.name and series.color and other properties on the same form. Furthermore,  point.value can be extended by the <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can also be overridden for each series, which makes it a good hook for displaying units.</p>.  <p>For maps it defaults to <code>'{point.name}: {point.value}&lt;br/&gt;'</code></p>
    * @param pointFormatter A callback function for formatting the HTML output for a single point in the tooltip. Like the <code>pointFormat</code> string, but with more flexibility.
    * @param positioner <p>A callback function to place the tooltip in a default position. The callback receives three parameters: <code>labelWidth</code>, <code>labelHeight</code> and <code>point</code>, where point contains values for <code>plotX</code> and <code>plotY</code> telling where the reference point is in the plot area. Add <code>chart.plotLeft</code> and <code>chart.plotTop</code> to get the full coordinates.</p>. . <p>The return should be an object containing x and y values, for example <code>{ x: 100, y: 100 }</code>.</p>
    * @param shadow Whether to apply a drop shadow to the tooltip.
    * @param split Split the tooltip into one label per series, with the header close to the axis. This is recommended over <a href="#tooltip.shared">shared</a> tooltips for charts with multiple line series, generally making them easier to read.
    * @param style CSS styles for the tooltip. The tooltip can also be styled through the CSS.  class <code>.highcharts-tooltip</code>.
    * @param useHTML Use HTML to render the contents of the tooltip instead of SVG. Using HTML allows advanced formatting like tables and images in the tooltip. It is also recommended for rtl languages as it works around rtl bugs in early Firefox.
    * @param valueDecimals How many decimals to show in each series'  value. This is overridable in each series' tooltip options object. The default is to preserve all decimals.
    * @param valuePrefix A string to prepend to each series' value. Overridable in each series' tooltip options object.
    * @param valueSuffix A string to append to each series' value. Overridable in each series' tooltip options object.
    */
  def apply(animation: js.UndefOr[Boolean] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, crosshairs: js.UndefOr[js.Any] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, followPointer: js.UndefOr[Boolean] = js.undefined, followTouchMove: js.UndefOr[Boolean] = js.undefined, footerFormat: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Function] = js.undefined, headerFormat: js.UndefOr[String] = js.undefined, hideDelay: js.UndefOr[Double] = js.undefined, padding: js.UndefOr[Double] = js.undefined, pointFormat: js.UndefOr[String] = js.undefined, pointFormatter: js.UndefOr[js.Function] = js.undefined, positioner: js.UndefOr[js.Function] = js.undefined, shadow: js.UndefOr[Boolean] = js.undefined, split: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, valueDecimals: js.UndefOr[Double] = js.undefined, valuePrefix: js.UndefOr[String] = js.undefined, valueSuffix: js.UndefOr[String] = js.undefined): Tooltip = {
    val animationOuter: js.UndefOr[Boolean] = animation
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderRadiusOuter: js.UndefOr[Double] = borderRadius
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val crosshairsOuter: js.Any = crosshairs
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val followPointerOuter: js.UndefOr[Boolean] = followPointer
    val followTouchMoveOuter: js.UndefOr[Boolean] = followTouchMove
    val footerFormatOuter: js.UndefOr[String] = footerFormat
    val formatterOuter: js.UndefOr[js.Function] = formatter
    val headerFormatOuter: js.UndefOr[String] = headerFormat
    val hideDelayOuter: js.UndefOr[Double] = hideDelay
    val paddingOuter: js.UndefOr[Double] = padding
    val pointFormatOuter: js.UndefOr[String] = pointFormat
    val pointFormatterOuter: js.UndefOr[js.Function] = pointFormatter
    val positionerOuter: js.UndefOr[js.Function] = positioner
    val shadowOuter: js.UndefOr[Boolean] = shadow
    val splitOuter: js.UndefOr[Boolean] = split
    val styleOuter: js.UndefOr[js.Object] = style
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val valueDecimalsOuter: js.UndefOr[Double] = valueDecimals
    val valuePrefixOuter: js.UndefOr[String] = valuePrefix
    val valueSuffixOuter: js.UndefOr[String] = valueSuffix
    new Tooltip {
      override val animation: js.UndefOr[Boolean] = animationOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderRadius: js.UndefOr[Double] = borderRadiusOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val crosshairs: js.Any = crosshairsOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val followPointer: js.UndefOr[Boolean] = followPointerOuter
      override val followTouchMove: js.UndefOr[Boolean] = followTouchMoveOuter
      override val footerFormat: js.UndefOr[String] = footerFormatOuter
      override val formatter: js.UndefOr[js.Function] = formatterOuter
      override val headerFormat: js.UndefOr[String] = headerFormatOuter
      override val hideDelay: js.UndefOr[Double] = hideDelayOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val pointFormat: js.UndefOr[String] = pointFormatOuter
      override val pointFormatter: js.UndefOr[js.Function] = pointFormatterOuter
      override val positioner: js.UndefOr[js.Function] = positionerOuter
      override val shadow: js.UndefOr[Boolean] = shadowOuter
      override val split: js.UndefOr[Boolean] = splitOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val valueDecimals: js.UndefOr[Double] = valueDecimalsOuter
      override val valuePrefix: js.UndefOr[String] = valuePrefixOuter
      override val valueSuffix: js.UndefOr[String] = valueSuffixOuter
    }
  }
}
