/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

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
    * @since 1.2.0
    */
  val animation: js.UndefOr[Boolean] = js.undefined

  /**
    * The background color or gradient for the tooltip.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/tooltip/general/" target="_blank">Styled tooltip</a>
    */
  val backgroundColor: js.UndefOr[String] = js.undefined

  /**
    * The color of the tooltip border. When <code>null</code>, the border takes the color of the corresponding series or point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/tooltip/general/" target="_blank">Styled tooltip</a>
    */
  val borderColor: js.UndefOr[String] = js.undefined

  /**
    * The radius of the rounded border corners.
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The pixel width of the tooltip border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/tooltip/general/" target="_blank">Styled tooltip</a>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * How many decimals to show for the <code>point.change</code> value when the <code>series.compare</code> option is set. This is overridable in each series' tooltip options object. The default is to preserve all decimals.
    * @since 1.0.1
    */
  val changeDecimals: js.UndefOr[Double] = js.undefined

  /**
    * Since 2.1, the crosshair definitions are moved to the Axis object in order for a better separation from the tooltip. See <a href="#xAxis.crosshair">xAxis.crosshair<a>.
    */
  val crosshairs: js.Any = js.undefined

  /**
    * <p>For series on a datetime axes, the date format in the tooltip's header will by default be guessed based on the closest data points. This member gives the default string representations used for each unit.<p>
    * 
    * <p>Note that when data grouping applies, the date time label formats are pulled from <a href="#plotOptions.series.dataGrouping.dateTimeLabelFormats">dataGrouping.dateTimeLabelFormats</a> instead, because it also allows formatting of time spans.</p>
    * 
    * <p>For an overview of the replacement codes, see <a href="#Highcharts.dateFormat">dateFormat</a>.</p>
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
    * Enable or disable the tooltip.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether the tooltip should follow the mouse as it moves across columns, pie slices and other point types with an extent. By default it behaves this way for scatter, bubble and pie series by override in the <code>plotOptions</code> for those series types. </p>
    * <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @since 1.3
    */
  val followPointer: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether the tooltip should follow the finger as it moves on a touch device. In order to take effect, <a href="#chart.zoomType">chart.zoomType</a> and <a href="#chart.pinchType">chart.pinchType</a> must be disabled.
    * @since 1.3.1
    */
  val followTouchMove: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Callback function to format the text of the tooltip from scratch. Return false to disable tooltip for a specific point on series.</p> <p>A subset of HTML is supported. The HTML of the tooltip is parsed and converted to SVG,  therefore this isn't a complete HTML renderer. The following tabs are supported:  <code>&lt;b&gt;</code>, <code>&lt;strong&gt;</code>, <code>&lt;i&gt;</code>, <code>&lt;em&gt;</code>, <code>&lt;br/&gt;</code>, <code>&lt;span&gt;</code>. Spans can be styled with a <code>style</code> attribute, but only text-related CSS that is  shared with SVG is handled. </p> <p>Since version 2.1 the tooltip can be shared between multiple series through  the <code>shared</code> option. The available data in the formatter differ a bit depending on whether the tooltip is shared or not. In a shared tooltip, all  properties except <code>x</code>, which is common for all points, are kept in  an array, <code>this.points</code>.</p>  <p>Available data are:</p> <dl> 	<dt>this.percentage (not shared) / this.points[i].percentage (shared)</dt> 	<dd>Stacked series and pies only. The point's percentage of the total.</dd> 	 	<dt>this.point (not shared) / this.points[i].point (shared)</dt> 	<dd>The point object. The point name, if defined, is available  through <code>this.point.name</code>.</dd> 	 	<dt>this.points</dt> 	<dd>In a shared tooltip, this is an array containing all other properties for each point.</dd> 	 	<dt>this.series (not shared) / this.points[i].series (shared)</dt> 	<dd>The series object. The series name is available  through <code>this.series.name</code>.</dd>  	<dt>this.total (not shared) / this.points[i].total (shared)</dt> 	<dd>Stacked series only. The total value at this point's x value.</dd> 	 	<dt>this.x</dt> 	<dd>The x value. This property is the same regardless of the tooltip being shared or not.</dd> 	 	<dt>this.y (not shared) / this.points[i].y (shared)</dt> 	<dd>The y value.</dd>  </dl>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/tooltip/formatter/" target="_blank">formatting with shared tooltip</a>
    */
  val formatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables			are <code>point.key</code>, <code>series.name</code>, <code>series.color</code> and other members from the <code>point</code> and <code>series</code> objects. The <code>point.key</code> variable contains the category name, x value or datetime string depending on the type of axis. For datetime axes, the <code>point.key</code> date format can be set using tooltip.xDateFormat.</p>
    *  
    * <p>Defaults to <code>&lt;span style="font-size: 10px"&gt;{point.key}&lt;/span&gt;&lt;br/&gt;</code></p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/footerformat/" target="_blank">A HTML table in the tooltip</a>
    */
  val headerFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are point.x, point.y, point.change, series.name and series.color and other properties on the same form. Furthermore,  point.y can be extended by the tooltip.valuePrefix and tooltip.valueSuffix variables. This can also be overridden for each series, which makes it a good hook for displaying units.</p>
    */
  val pointFormat: js.UndefOr[String] = js.undefined

  /**
    * A callback function for formatting the HTML output for a single point in the tooltip. Like the <code>pointFormat</code> string, but with more flexibility.
    * @since 2.1.0
    */
  val pointFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>A callback function to place the tooltip in a default position. The callback receives three parameters: <code>labelWidth</code>, <code>labelHeight</code> and <code>point</code>, where point contains values for <code>plotX</code> and <code>plotY</code> telling where the reference point is in the plot area. Add <code>chart.plotLeft</code> and <code>chart.plotTop</code> to get the full coordinates.</p>
    * 
    * <p>The return should be an object containing x and y values, for example <code>{ x: 100, y: 100 }</code>.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/tooltip/positioner/" target="_blank">
				A fixed tooltip position on top of the chart</a>
    * @since 1.1.5
    */
  val positioner: js.UndefOr[js.Function] = js.undefined

  /**
    * Whether to apply a drop shadow to the tooltip.
    */
  val shadow: js.UndefOr[Boolean] = js.undefined

  /**
    * The name of a symbol to use for the border around the tooltip. In Highstock 1.x, the shape was <code>square</code>. 
    * @since 2.0
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * When the tooltip is shared, the entire plot area will capture mouse movement or touch events. Tooltip texts for series types with ordered data (not pie, scatter, flags etc) will be shown in a single bubble. This is recommended for single series charts and for tablet/mobile optimized charts.
    */
  val shared: js.UndefOr[Boolean] = js.undefined

  /**
    * Proximity snap for graphs or single points. Does not apply to bars, columns and pie slices. It defaults to 10 for mouse-powered devices and 25 for touch  devices. Note that since Highstock 2.1 the whole plot area by default captures pointer events in order to show the tooltip, so for tooltip.snap to make sense, <a href="#plotOptions.series.stickyTracking">stickyTracking</a> must be <code>false</code>.
    */
  val snap: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for the tooltip. The tooltip can also be styled through the CSS
    *  class <code>.highcharts-tooltip</code>.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * Use HTML to render the contents of the tooltip instead of SVG. Using HTML allows advanced formatting like tables and images in the tooltip. It is also recommended for rtl languages as it works around rtl bugs in early Firefox.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/footerformat/" target="_blank">A table for value alignment</a>.  <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/fullhtml/" target="_blank">Full HTML tooltip</a>.
    * @since 2.2
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * How many decimals to show in each series' y value. This is overridable in each series' tooltip options object.
    *  The default is to preserve all decimals.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    * @since 1.2
    */
  val valueDecimals: js.UndefOr[Double] = js.undefined

  /**
    * A string to prepend to each series' y value. Overridable in each series' tooltip options object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    * @since 1.2
    */
  val valuePrefix: js.UndefOr[String] = js.undefined

  /**
    * A string to append to each series' y value. Overridable in each series' tooltip options object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/tooltip/valuedecimals/" target="_blank">Set decimals, prefix and suffix for the value</a>
    * @since 1.2
    */
  val valueSuffix: js.UndefOr[String] = js.undefined

  /**
    * The format for the date in the tooltip header. If data grouping is used, the default is  a smart guess based on how close the closest points are. It is pulled from the #plotOptions.dataGrouping.dateTimeLabelFormats array.
    */
  val xDateFormat: js.UndefOr[String] = js.undefined
}
