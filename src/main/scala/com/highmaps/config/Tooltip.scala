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
    * The background color or gradient for the tooltip.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/tooltip/background-border/" target="_blank">Background and border demo</a>
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The color of the tooltip border. When <code>null</code>, the border takes the color of the corresponding series or point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/tooltip/background-border/" target="_blank">Background and border demo</a>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The radius of the rounded border corners.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/tooltip/background-border/" target="_blank">Background and border demo</a>
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The pixel width of the tooltip border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/tooltip/background-border/" target="_blank">Background and border demo</a>
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
    * Whether the tooltip should follow the finger as it moves on a touch device. If <a href="#chart.zoomType">chart.zoomType</a> is set, it will override <code>followTouchMove</code>.
    */
  val followTouchMove: js.UndefOr[Boolean] = js.undefined

  /**
    * A string to append to the tooltip format.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/tooltip/format/" target="_blank">Format demo</a>
    */
  val footerFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Callback function to format the text of the tooltip. Return false to disable tooltip for a specific point on series.</p> 
    * 
    * <p>A subset of HTML is supported. Unless useHTML is true, the HTML of the tooltip is parsed and converted to SVG,  therefore this isn't a complete HTML renderer. The following tabs are supported:  <code>&lt;b&gt;</code>, <code>&lt;strong&gt;</code>, <code>&lt;i&gt;</code>, <code>&lt;em&gt;</code>, <code>&lt;br/&gt;</code>, <code>&lt;span&gt;</code>. Spans can be styled with a <code>style</code> attribute, but only text-related CSS that is  shared with SVG is handled. </p> 
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/tooltip/formatter/" target="_blank">String formatting</a>
    */
  val formatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables			are <code>point.name</code>, <code>series.name</code>, <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects.</p>
    *  
    * <p>Defaults to <code>&lt;span style="font-size: 10px"&gt;{point.key}&lt;/span&gt;&lt;br/&gt;</code></p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/tooltip/format/" target="_blank">Format demo</a>
    */
  val headerFormat: js.UndefOr[String] = js.undefined

  /**
    * The number of milliseconds to wait until the tooltip is hidden when mouse out from a point or chart. 
    */
  val hideDelay: js.UndefOr[Double] = js.undefined

  /**
    * <p>The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are point.value, series.name and series.color and other properties on the same form. Furthermore,  point.value can be extended by the <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can also be overridden for each series, which makes it a good hook for displaying units.</p>
    *  <p>For maps it defaults to <code>'{point.name}: {point.value}&lt;br/&gt;'</code></p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/tooltip/format/" target="_blank">Format demo</a>
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/tooltip/positioner/" target="_blank">
				A fixed tooltip position</a>
    */
  val positioner: js.UndefOr[js.Function] = js.undefined

  /**
    * Whether to apply a drop shadow to the tooltip.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/tooltip/positioner/" target="_blank">Fixed tooltip position, border and shadow disabled</a>
    */
  val shadow: js.UndefOr[Boolean] = js.undefined

  /**
    * CSS styles for the tooltip. The tooltip can also be styled through the CSS
    *  class <code>.highcharts-tooltip</code>.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * Use HTML to render the contents of the tooltip instead of SVG. Using HTML allows advanced formatting like tables and images in the tooltip. It is also recommended for rtl languages as it works around rtl bugs in early Firefox.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/tooltip/usehtml/" target="_blank">Pure HTML tooltip</a>
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * How many decimals to show in each series'  value. This is overridable in each series' tooltip options object. The default is to preserve all decimals.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    */
  val valueDecimals: js.UndefOr[Double] = js.undefined

  /**
    * A string to prepend to each series' value. Overridable in each series' tooltip options object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    */
  val valuePrefix: js.UndefOr[String] = js.undefined

  /**
    * A string to append to each series' value. Overridable in each series' tooltip options object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    */
  val valueSuffix: js.UndefOr[String] = js.undefined
}
