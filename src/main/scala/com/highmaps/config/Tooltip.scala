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
class Tooltip extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the tooltip.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/enabled/">Disabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/">Disable tooltip and show values on chart instead</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enable or disable animation of the tooltip.</p>
    * @since 2.3.0
    */
  val animation: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The radius of the rounded border corners.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-default/">5px by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/borderradius-0/">Square borders</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/background-border/">Background and border demo</a>
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>For series on a datetime axes, the date format in the tooltip&#39;s
    * header will by default be guessed based on the closest data points.
    * This member gives the default string representations used for
    * each unit. For an overview of the replacement codes, see
    * <a href="/class-reference/Highcharts#dateFormat">dateFormat</a>.</p>
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
    * <p>Proximity snap for graphs or single points. It defaults to 10 for
    * mouse-powered devices and 25 for touch devices.</p>
    * <p>Note that in most cases the whole plot area captures the mouse
    * movement, and in these cases <code>tooltip.snap</code> doesn&#39;t make sense. This
    * applies when <a href="#plotOptions.series.stickyTracking">stickyTracking</a>
    * is <code>true</code> (default) and when the tooltip is <a href="#tooltip.shared">shared</a>
    * or <a href="#tooltip.split">split</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-default/">10 px by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/snap-50/">50 px on graph</a>
    * @since 1.2.0
    */
  val snap: js.UndefOr[Double] = js.undefined

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
    * <p>The background color or gradient for the tooltip.</p>
    * <p>In styled mode, the stroke width is set in the
    * <code>.highcharts-tooltip-box</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/backgroundcolor-solid/">Yellowish background</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/backgroundcolor-gradient/">Gradient</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/general/">Custom tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/background-border/">Background and border demo</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a>
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The pixel width of the tooltip border.</p>
    * <p>In styled mode, the stroke width is set in the
    * <code>.highcharts-tooltip-box</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-default/">2px by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/borderwidth/">No border (shadow only)</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/general/">Custom tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/background-border/">Background and border demo</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to apply a drop shadow to the tooltip.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-default/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shadow/">False</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/positioner/">Fixed tooltip position, border and shadow disabled</a>
    */
  val shadow: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>CSS styles for the tooltip. The tooltip can also be styled through
    * the CSS class <code>.highcharts-tooltip</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/style/">Greater padding, bold text</a>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The color of the tooltip border. When <code>undefined</code>, the border takes
    * the color of the corresponding series or point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-default/">Follow series by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-black/">Black border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/general/">Styled tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/background-border/">Background and border demo</a>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Since 4.1, the crosshair definitions are moved to the Axis object
    * in order for a better separation from the tooltip. See
    * <a href="#xAxis.crosshair">xAxis.crosshair</a><a>.</a></p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/crosshairs-x/">Enable a crosshair for the x value</a>
    */
  val crosshairs: js.Any = js.undefined

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
    * <p>Callback function to format the text of the tooltip from scratch.
    * Return <code>false</code> to disable tooltip for a specific point on series.</p>
    * <p>A subset of HTML is supported. Unless <code>useHTML</code> is true, the HTML of
    * the tooltip is parsed and converted to SVG, therefore this isn&#39;t a
    * complete HTML renderer. The following tags are supported: <code>&lt;b&gt;</code>,
    * <code>&lt;strong&gt;</code>, <code>&lt;i&gt;</code>, <code>&lt;em&gt;</code>, <code>&lt;br/&gt;</code>, <code>&lt;span&gt;</code>. Spans can be styled
    * with a <code>style</code> attribute, but only text-related CSS that is shared
    * with SVG is handled.</p>
    * <p>Since version 2.1 the tooltip can be shared between multiple series
    * through the <code>shared</code> option. The available data in the formatter
    * differ a bit depending on whether the tooltip is shared or not. In
    * a shared tooltip, all properties except <code>x</code>, which is common for
    * all points, are kept in an array, <code>this.points</code>.</p>
    * <p>Available data are:</p>
    * <dl>
    * 
    * <dt>this.percentage (not shared) / this.points[i].percentage (shared)
    * </dt>
    * 
    * <dd>Stacked series and pies only. The point's percentage of the
    * total.
    * </dd>
    * 
    * <dt>this.point (not shared) / this.points[i].point (shared)</dt>
    * 
    * <dd>The point object. The point name, if defined, is available
    * through `this.point.name`.</dd>
    * 
    * <dt>this.points</dt>
    * 
    * <dd>In a shared tooltip, this is an array containing all other
    * properties for each point.</dd>
    * 
    * <dt>this.series (not shared) / this.points[i].series (shared)</dt>
    * 
    * <dd>The series object. The series name is available through
    * `this.series.name`.</dd>
    * 
    * <dt>this.total (not shared) / this.points[i].total (shared)</dt>
    * 
    * <dd>Stacked series only. The total value at this point's x value.
    * </dd>
    * 
    * <dt>this.x</dt>
    * 
    * <dd>The x value. This property is the same regardless of the tooltip
    * being shared or not.</dd>
    * 
    * <dt>this.y (not shared) / this.points[i].y (shared)</dt>
    * 
    * <dd>The y value.</dd>
    * 
    * </dl>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/formatter-simple/">Simple string formatting</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/formatter-shared/">Formatting with shared tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/formatter/">Formatting with shared tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/formatter/">String formatting</a>
    */
  val formatter: js.UndefOr[js.Function] = js.undefined

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
    * <p>A callback function to place the tooltip in a default position. The
    * callback receives three parameters: <code>labelWidth</code>, <code>labelHeight</code> and
    * <code>point</code>, where point contains values for <code>plotX</code> and <code>plotY</code> telling
    * where the reference point is in the plot area. Add <code>chart.plotLeft</code>
    * and <code>chart.plotTop</code> to get the full coordinates.</p>
    * <p>The return should be an object containing x and y values, for example
    * <code>{ x: 100, y: 100 }</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/positioner/">A fixed tooltip position</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/tooltip/positioner/">A fixed tooltip position on top of the chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/positioner/">A fixed tooltip position</a>
    * @since 2.2.4
    */
  val positioner: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>The name of a symbol to use for the border around the tooltip. Can
    * be one of: <code>&quot;callout&quot;</code>, <code>&quot;circle&quot;</code> or <code>&quot;square&quot;</code>.</p>
    * <p>Custom callbacks for symbol path generation can also be added to
    * <code>Highcharts.SVGRenderer.prototype.symbols</code> the same way as for
    * <a href="plotOptions.line.marker.symbol">series.marker.symbol</a>.</p>
    * @since 4.0
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * <p>When the tooltip is shared, the entire plot area will capture mouse
    * movement or touch events. Tooltip texts for series types with ordered
    * data (not pie, scatter, flags etc) will be shown in a single bubble.
    * This is recommended for single series charts and for tablet/mobile
    * optimized charts.</p>
    * <p>See also <a href="#tooltip.split">tooltip.split</a>, that is better suited for
    * charts with many series, especially line-type series. The
    * <code>tooltip.split</code> option takes precedence over <code>tooltip.shared</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-false/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-true/">True</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-x-crosshair/">True with x axis crosshair</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-true-mixed-types/">True with mixed series types</a>
    * @since 2.1
    */
  val shared: js.UndefOr[Boolean] = js.undefined

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
    * <p>Use HTML to render the contents of the tooltip instead of SVG. Using
    * HTML allows advanced formatting like tables and images in the
    * tooltip. It is also recommended for rtl languages as it works around
    * rtl bugs in early Firefox.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">A table for value alignment</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/fullhtml/">Full HTML tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/usehtml/">Pure HTML tooltip</a>
    * @since 2.2
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

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

object Tooltip {
  /**
    * @param enabled <p>Enable or disable the tooltip.</p>
    * @param animation <p>Enable or disable animation of the tooltip.</p>
    * @param borderRadius <p>The radius of the rounded border corners.</p>
    * @param dateTimeLabelFormats <p>For series on a datetime axes, the date format in the tooltip&#39;s. header will by default be guessed based on the closest data points.. This member gives the default string representations used for. each unit. For an overview of the replacement codes, see. <a href="/class-reference/Highcharts#dateFormat">dateFormat</a>.</p>
    * @param footerFormat <p>A string to append to the tooltip format.</p>
    * @param padding <p>Padding inside the tooltip, in pixels.</p>
    * @param snap <p>Proximity snap for graphs or single points. It defaults to 10 for. mouse-powered devices and 25 for touch devices.</p>. <p>Note that in most cases the whole plot area captures the mouse. movement, and in these cases <code>tooltip.snap</code> doesn&#39;t make sense. This. applies when <a href="#plotOptions.series.stickyTracking">stickyTracking</a>. is <code>true</code> (default) and when the tooltip is <a href="#tooltip.shared">shared</a>. or <a href="#tooltip.split">split</a>.</p>
    * @param headerFormat <p>The HTML of the tooltip header line. Variables are enclosed by. curly brackets. Available variables are <code>point.key</code>, <code>series.name</code>,. <code>series.color</code> and other members from the <code>point</code> and <code>series</code>. objects. The <code>point.key</code> variable contains the category name, x. value or datetime string depending on the type of axis. For datetime. axes, the <code>point.key</code> date format can be set using. <code>tooltip.xDateFormat</code>. To access the original point use. <code>point.point</code>.</p>
    * @param pointFormat <p>The HTML of the point&#39;s line in the tooltip. Variables are enclosed. by curly brackets. Available variables are point.x, point.y, series.. name and series.color and other properties on the same form.. Furthermore, <code>point.y</code> can be extended by the <code>tooltip.valuePrefix</code>. and <code>tooltip.valueSuffix</code> variables. This can also be overridden for. each series, which makes it a good hook for displaying units.</p>. <p>In styled mode, the dot is colored by a class name rather. than the point color.</p>
    * @param backgroundColor <p>The background color or gradient for the tooltip.</p>. <p>In styled mode, the stroke width is set in the. <code>.highcharts-tooltip-box</code> class.</p>
    * @param borderWidth <p>The pixel width of the tooltip border.</p>. <p>In styled mode, the stroke width is set in the. <code>.highcharts-tooltip-box</code> class.</p>
    * @param shadow <p>Whether to apply a drop shadow to the tooltip.</p>
    * @param style <p>CSS styles for the tooltip. The tooltip can also be styled through. the CSS class <code>.highcharts-tooltip</code>.</p>
    * @param borderColor <p>The color of the tooltip border. When <code>undefined</code>, the border takes. the color of the corresponding series or point.</p>
    * @param crosshairs <p>Since 4.1, the crosshair definitions are moved to the Axis object. in order for a better separation from the tooltip. See. <a href="#xAxis.crosshair">xAxis.crosshair</a><a>.</a></p>
    * @param followPointer <p>Whether the tooltip should follow the mouse as it moves across. columns, pie slices and other point types with an extent. By default. it behaves this way for scatter, bubble and pie series by override. in the <code>plotOptions</code> for those series types.</p>. <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @param followTouchMove <p>Whether the tooltip should update as the finger moves on a touch. device. If this is <code>true</code> and <a href="#chart.panning">chart.panning</a> is. set,<code>followTouchMove</code> will take over one-finger touches, so the user. needs to use two fingers for zooming and panning.</p>. <p>Note the difference to <a href="#tooltip.followPointer">followPointer</a> that. only defines the <em>position</em> of the tooltip. If <code>followPointer</code> is. false in for example a column series, the tooltip will show above or. below the column, but as <code>followTouchMove</code> is true, the tooltip will. jump from column to column as the user swipes across the plot area.</p>
    * @param formatter <p>Callback function to format the text of the tooltip from scratch.. Return <code>false</code> to disable tooltip for a specific point on series.</p>. <p>A subset of HTML is supported. Unless <code>useHTML</code> is true, the HTML of. the tooltip is parsed and converted to SVG, therefore this isn&#39;t a. complete HTML renderer. The following tags are supported: <code>&lt;b&gt;</code>,. <code>&lt;strong&gt;</code>, <code>&lt;i&gt;</code>, <code>&lt;em&gt;</code>, <code>&lt;br/&gt;</code>, <code>&lt;span&gt;</code>. Spans can be styled. with a <code>style</code> attribute, but only text-related CSS that is shared. with SVG is handled.</p>. <p>Since version 2.1 the tooltip can be shared between multiple series. through the <code>shared</code> option. The available data in the formatter. differ a bit depending on whether the tooltip is shared or not. In. a shared tooltip, all properties except <code>x</code>, which is common for. all points, are kept in an array, <code>this.points</code>.</p>. <p>Available data are:</p>. <dl>. . <dt>this.percentage (not shared) / this.points[i].percentage (shared). </dt>. . <dd>Stacked series and pies only. The point's percentage of the. total.. </dd>. . <dt>this.point (not shared) / this.points[i].point (shared)</dt>. . <dd>The point object. The point name, if defined, is available. through `this.point.name`.</dd>. . <dt>this.points</dt>. . <dd>In a shared tooltip, this is an array containing all other. properties for each point.</dd>. . <dt>this.series (not shared) / this.points[i].series (shared)</dt>. . <dd>The series object. The series name is available through. `this.series.name`.</dd>. . <dt>this.total (not shared) / this.points[i].total (shared)</dt>. . <dd>Stacked series only. The total value at this point's x value.. </dd>. . <dt>this.x</dt>. . <dd>The x value. This property is the same regardless of the tooltip. being shared or not.</dd>. . <dt>this.y (not shared) / this.points[i].y (shared)</dt>. . <dd>The y value.</dd>. . </dl>
    * @param hideDelay <p>The number of milliseconds to wait until the tooltip is hidden when. mouse out from a point or chart.</p>
    * @param outside <p>Whether to allow the tooltip to render outside the chart&#39;s SVG. element box. By default (<code>false</code>), the tooltip is rendered within the. chart&#39;s SVG element, which results in the tooltip being aligned. inside the chart area. For small charts, this may result in clipping. or overlapping. When <code>true</code>, a separate SVG element is created and. overlaid on the page, allowing the tooltip to be aligned inside the. page itself.</p>
    * @param pointFormatter <p>A callback function for formatting the HTML output for a single point. in the tooltip. Like the <code>pointFormat</code> string, but with more. flexibility.</p>
    * @param positioner <p>A callback function to place the tooltip in a default position. The. callback receives three parameters: <code>labelWidth</code>, <code>labelHeight</code> and. <code>point</code>, where point contains values for <code>plotX</code> and <code>plotY</code> telling. where the reference point is in the plot area. Add <code>chart.plotLeft</code>. and <code>chart.plotTop</code> to get the full coordinates.</p>. <p>The return should be an object containing x and y values, for example. <code>{ x: 100, y: 100 }</code>.</p>
    * @param shape <p>The name of a symbol to use for the border around the tooltip. Can. be one of: <code>&quot;callout&quot;</code>, <code>&quot;circle&quot;</code> or <code>&quot;square&quot;</code>.</p>. <p>Custom callbacks for symbol path generation can also be added to. <code>Highcharts.SVGRenderer.prototype.symbols</code> the same way as for. <a href="plotOptions.line.marker.symbol">series.marker.symbol</a>.</p>
    * @param shared <p>When the tooltip is shared, the entire plot area will capture mouse. movement or touch events. Tooltip texts for series types with ordered. data (not pie, scatter, flags etc) will be shown in a single bubble.. This is recommended for single series charts and for tablet/mobile. optimized charts.</p>. <p>See also <a href="#tooltip.split">tooltip.split</a>, that is better suited for. charts with many series, especially line-type series. The. <code>tooltip.split</code> option takes precedence over <code>tooltip.shared</code>.</p>
    * @param split <p>Split the tooltip into one label per series, with the header close. to the axis. This is recommended over <a href="#tooltip.shared">shared</a>. tooltips for charts with multiple line series, generally making them. easier to read. This option takes precedence over <code>tooltip.shared</code>.</p>
    * @param useHTML <p>Use HTML to render the contents of the tooltip instead of SVG. Using. HTML allows advanced formatting like tables and images in the. tooltip. It is also recommended for rtl languages as it works around. rtl bugs in early Firefox.</p>
    * @param valueDecimals <p>How many decimals to show in each series&#39; y value. This is. overridable in each series&#39; tooltip options object. The default is to. preserve all decimals.</p>
    * @param valuePrefix <p>A string to prepend to each series&#39; y value. Overridable in each. series&#39; tooltip options object.</p>
    * @param valueSuffix <p>A string to append to each series&#39; y value. Overridable in each. series&#39; tooltip options object.</p>
    * @param xDateFormat <p>The format for the date in the tooltip header if the X axis is a. datetime axis. The default is a best guess based on the smallest. distance between points in the chart.</p>
    * @param changeDecimals <p>How many decimals to show for the <code>point.change</code> value when the. <code>series.compare</code> option is set. This is overridable in each series&#39;. tooltip options object. The default is to preserve all decimals.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined, footerFormat: js.UndefOr[String] = js.undefined, padding: js.UndefOr[Double] = js.undefined, snap: js.UndefOr[Double] = js.undefined, headerFormat: js.UndefOr[String] = js.undefined, pointFormat: js.UndefOr[String] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, shadow: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, crosshairs: js.UndefOr[js.Any] = js.undefined, followPointer: js.UndefOr[Boolean] = js.undefined, followTouchMove: js.UndefOr[Boolean] = js.undefined, formatter: js.UndefOr[js.Function] = js.undefined, hideDelay: js.UndefOr[Double] = js.undefined, outside: js.UndefOr[Boolean] = js.undefined, pointFormatter: js.UndefOr[js.Function] = js.undefined, positioner: js.UndefOr[js.Function] = js.undefined, shape: js.UndefOr[String] = js.undefined, shared: js.UndefOr[Boolean] = js.undefined, split: js.UndefOr[Boolean] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, valueDecimals: js.UndefOr[Double] = js.undefined, valuePrefix: js.UndefOr[String] = js.undefined, valueSuffix: js.UndefOr[String] = js.undefined, xDateFormat: js.UndefOr[String] = js.undefined, changeDecimals: js.UndefOr[Double] = js.undefined): Tooltip = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val animationOuter: js.UndefOr[Boolean] = animation
    val borderRadiusOuter: js.UndefOr[Double] = borderRadius
    val dateTimeLabelFormatsOuter: js.UndefOr[js.Object] = dateTimeLabelFormats
    val footerFormatOuter: js.UndefOr[String] = footerFormat
    val paddingOuter: js.UndefOr[Double] = padding
    val snapOuter: js.UndefOr[Double] = snap
    val headerFormatOuter: js.UndefOr[String] = headerFormat
    val pointFormatOuter: js.UndefOr[String] = pointFormat
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val shadowOuter: js.UndefOr[Boolean] = shadow
    val styleOuter: js.UndefOr[js.Object] = style
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val crosshairsOuter: js.Any = crosshairs
    val followPointerOuter: js.UndefOr[Boolean] = followPointer
    val followTouchMoveOuter: js.UndefOr[Boolean] = followTouchMove
    val formatterOuter: js.UndefOr[js.Function] = formatter
    val hideDelayOuter: js.UndefOr[Double] = hideDelay
    val outsideOuter: js.UndefOr[Boolean] = outside
    val pointFormatterOuter: js.UndefOr[js.Function] = pointFormatter
    val positionerOuter: js.UndefOr[js.Function] = positioner
    val shapeOuter: js.UndefOr[String] = shape
    val sharedOuter: js.UndefOr[Boolean] = shared
    val splitOuter: js.UndefOr[Boolean] = split
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val valueDecimalsOuter: js.UndefOr[Double] = valueDecimals
    val valuePrefixOuter: js.UndefOr[String] = valuePrefix
    val valueSuffixOuter: js.UndefOr[String] = valueSuffix
    val xDateFormatOuter: js.UndefOr[String] = xDateFormat
    val changeDecimalsOuter: js.UndefOr[Double] = changeDecimals
    com.highcharts.HighchartsGenericObject.toCleanObject(new Tooltip {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val animation: js.UndefOr[Boolean] = animationOuter
      override val borderRadius: js.UndefOr[Double] = borderRadiusOuter
      override val dateTimeLabelFormats: js.UndefOr[js.Object] = dateTimeLabelFormatsOuter
      override val footerFormat: js.UndefOr[String] = footerFormatOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val snap: js.UndefOr[Double] = snapOuter
      override val headerFormat: js.UndefOr[String] = headerFormatOuter
      override val pointFormat: js.UndefOr[String] = pointFormatOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val shadow: js.UndefOr[Boolean] = shadowOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val crosshairs: js.Any = crosshairsOuter
      override val followPointer: js.UndefOr[Boolean] = followPointerOuter
      override val followTouchMove: js.UndefOr[Boolean] = followTouchMoveOuter
      override val formatter: js.UndefOr[js.Function] = formatterOuter
      override val hideDelay: js.UndefOr[Double] = hideDelayOuter
      override val outside: js.UndefOr[Boolean] = outsideOuter
      override val pointFormatter: js.UndefOr[js.Function] = pointFormatterOuter
      override val positioner: js.UndefOr[js.Function] = positionerOuter
      override val shape: js.UndefOr[String] = shapeOuter
      override val shared: js.UndefOr[Boolean] = sharedOuter
      override val split: js.UndefOr[Boolean] = splitOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val valueDecimals: js.UndefOr[Double] = valueDecimalsOuter
      override val valuePrefix: js.UndefOr[String] = valuePrefixOuter
      override val valueSuffix: js.UndefOr[String] = valueSuffixOuter
      override val xDateFormat: js.UndefOr[String] = xDateFormatOuter
      override val changeDecimals: js.UndefOr[Double] = changeDecimalsOuter
    })
  }
}
