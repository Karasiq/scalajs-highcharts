/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;solidgauge&gt;</code>
  */
@js.annotation.ScalaJSDefined
class SeriesSolidgauge extends js.Object {

  /**
    * <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>
    * <dl>
    *   <dt>duration</dt>
    *   <dd>The duration of the animation in milliseconds.</dd>
    * <dt>easing</dt>
    * <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>
    * </dl>
    * <p>
    * Due to poor performance, animation is disabled in old IE browsers for column charts and polar charts.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-disabled/" target="_blank">Animation disabled</a>,
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-slower/" target="_blank">slower animation</a>,
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/" target="_blank">custom easing function</a>.
    */
  val animation: js.UndefOr[Boolean] = js.undefined

  /**
    * For some series, there is a limit that shuts down initial animation by default when the total number of points in the chart is too high. For example, for a column chart and its derivatives, animation doesn't run if there is more than 250 points totally. To disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
    */
  val animationLimit: js.UndefOr[Double] = js.undefined

  /**
    * A class name to apply to the series' graphical elements.
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">Styled mode</a> only. A specific color index to use for the series, so its graphic representations are given the class name <code>highcharts-color-{n}</code>.
    * @since 5.0.0
    */
  val colorIndex: js.UndefOr[Double] = js.undefined

  /**
    * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @example Pointer cursor <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-cursor-line/" target="_blank">on line graph</a>,
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-cursor-column/" target="_blank">on columns</a>,
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-cursor-scatter/" target="_blank">on scatter markers</a>
    */
  val cursor: js.UndefOr[String] = js.undefined

  /**
    * An array of data points for the series. For the <code>solidgauge</code> series type, points can be given in the following ways:
    *  <ol>
    *  	<li>An array of numerical values. In this case, the numerical values will 
    *  	be interpreted as <code>y</code> options.  Example:
    * <pre>data: [0, 5, 3, 5]</pre>
    *  	</li>
    *  <li><p>An array of objects with named values. The objects are
    *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<solidgauge>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
    * 
    * <pre>data: [{
    *     y: 5,
    *     name: "Point2",
    *     color: "#00FF00"
    * }, {
    *     y: 7,
    *     name: "Point1",
    *     color: "#FF00FF"
    * }]</pre></li>
    *  </ol><p>The typical gauge only contains a single data value.</p>
    * @example <p>The demos use a line series, but the principle is the same for all types.</p>
<ul>
<li><a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/" target="_blank">Numerical values</a></li>
<li><a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-arrays/" target="_blank">Arrays of numeric x and y</a></li>
<li><a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-arrays-datetime/" target="_blank">Arrays of datetime x and y</a></li>
<li><a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-name-value/" target="_blank">Arrays of point.name and y</a></li>
<li><a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-objects/" target="_blank"> Config objects</a></li>
</ul>
    */
  val data: js.UndefOr[js.Array[CleanJsObject[SeriesSolidgaugeData] | Double]] = js.undefined

  /**
    * Data labels for the gauge. For gauges, the data labels are enabled by default and shown in a bordered box below the point.
    * @since 2.3.0
    */
  val dataLabels: js.UndefOr[CleanJsObject[SeriesSolidgaugeDataLabels]] = js.undefined

  /**
    * <p><i>Requires Accessibility module</i></p>
    * <p>A description of the series to add to the screen reader information about the series.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/accessibility/accessible-stock/">Accessible stock chart</a>
    * @since 5.0.0
    */
  val description: js.UndefOr[String] = js.undefined

  /**
    * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-enablemousetracking-false/" target="_blank">No mouse tracking</a>
    */
  val enableMouseTracking: js.UndefOr[Boolean] = js.undefined

  val events: js.UndefOr[CleanJsObject[SeriesSolidgaugeEvents]] = js.undefined

  /**
    * <p>By default, series are exposed to screen readers as regions. By enabling this option, the series element itself will be exposed in the same way as the data points. This is useful if the series is not used as a grouping entity in the chart, but you still want to attach a description to the series.</p>
    * <p>Requires the Accessibility module.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highslide-software/highcharts.com/tree/master/samples/highcharts/accessibility/art-grants/" target="_blank">Accessible data visualization</a>
    * @since 5.0.12
    */
  val exposeElementToA11y: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Determines whether the series should look for the nearest point in both dimensions or just the x-dimension when hovering the series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most other series. If the data has duplicate x-values, it is recommended to set this to <code>'xy'</code> to allow hovering over all points.</p>
    * <p>Applies only to series types using nearest neighbor search (not direct hover) for tooltip.</p> 
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highslide-software/highcharts.com/tree/master/samples/highcharts/series/findnearestpointby/" target="_blank">Different hover behaviors</a>
    * @since 5.0.10
    */
  val findNearestPointBy: js.UndefOr[String] = js.undefined

  /**
    * Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
    * @since 4.1.6
    */
  val getExtremesFromAll: js.UndefOr[Boolean] = js.undefined

  /**
    * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-id/" target="_blank">Get series by id</a>
    * @since 1.2.0
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    * @since 2.3.0
    */
  val index: js.UndefOr[Double] = js.undefined

  /**
    * An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-keys/" target="_blank">An extended data array with keys</a>
    * @since 4.1.6
    */
  val keys: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
    */
  val legendIndex: js.UndefOr[Double] = js.undefined

  /**
    * Whether the strokes of the solid gauge should be <code>round</code> or <code>square</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-activity/" target="_blank">Rounded gauge</a>
    * @since 4.2.2
    */
  val linecap: js.UndefOr[String] = js.undefined

  /**
    * The name of the series as shown in the legend, tooltip etc.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/name/" target="_blank">Series name</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * Allow the dial to overshoot the end of the perimeter axis by this many degrees. Say if the gauge axis goes from 0 to 60, a value of 100, or 1000, will show 5 degrees beyond the end of the axis.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-overshoot/" target="_blank">Allow 5 degrees overshoot</a>
    * @since 3.0.10
    */
  val overshoot: js.UndefOr[Double] = js.undefined

  /**
    * Properties for each single point
    */
  val point: js.UndefOr[CleanJsObject[SeriesSolidgaugePoint]] = js.undefined

  /**
    * Same as <a href="#accessibility.pointDescriptionFormatter">accessibility.pointDescriptionFormatter</a>, but for an individual series. Overrides the chart wide configuration.
    * @since 5.0.12
    */
  val pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * Wether to draw rounded edges on the gauge.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-activity/" target="_blank">Activity Gauge</a>, 
    * @since 5.0.11
    */
  val rounded: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-selected/" target="_blank">One out of two series selected</a>
    * @since 1.2.0
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-showcheckbox-true/" target="_blank">Show select box</a>
    * @since 1.2.0
    */
  val showCheckbox: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to display this particular series or series type in the legend. Defaults to false for gauge series.
    * @since 2.3.0
    */
  val showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * If set to <code>True</code>, the accessibility module will skip past the points in this series for keyboard navigation.
    * @since 5.0.12
    */
  val skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined

  /**
    * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event
    *  on a series isn't triggered until the mouse moves over another series, or out
    *  of the plot area. When false, the <code>mouseOut</code> event on a series is
    *  triggered when the mouse leaves the area around the series' graph or markers.
    *  This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the 
    *  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stickytracking-true/" target="_blank">True by default</a>,
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stickytracking-false/" target="_blank">false</a>
    * @since 2.0
    */
  val stickyTracking: js.UndefOr[Boolean] = js.undefined

  /**
    * The threshold or base level for the gauge. 
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/solidgauge-threshold/" target="_blank">Zero threshold with negative and positive values</a>
    * @since 5.0.3
    */
  val threshold: js.UndefOr[Double] = js.undefined

  /**
    * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
    * @since 2.3
    */
  val tooltip: js.UndefOr[CleanJsObject[SeriesSolidgaugeTooltip]] = js.undefined

  /**
    * The type of series. Can be one of <code>area</code>, <code>areaspline</code>,
    *  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,
    *  <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/type/" target="_blank">Line and column in the same chart</a>
    */
  val `type`: String = "solidgauge"

  /**
    * Set the initial visibility of the series.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-visible/" target="_blank">Two series, one hidden and one visible</a>
    */
  val visible: js.UndefOr[Boolean] = js.undefined

  /**
    * When this option is <code>true</code>, the dial will wrap around the axes. For instance, in a full-range gauge going from 0 to 360, a value of 400 will point to 40. When <code>wrap</code> is <code>false</code>, the dial stops at 360.
    * @since 3.0
    */
  val wrap: js.UndefOr[Boolean] = js.undefined

  /**
    * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
    */
  val xAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/yaxis/" target="_blank">Apply the column series to the secondary Y axis</a>
    */
  val yAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * Define the visual z index of the series.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex-default/" target="_blank">With no z index, the series defined last are on top</a>,
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex/" target="_blank">with a z index, the series with the highest z index is on top</a>.
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object SeriesSolidgauge {
  /**
    * @param animation <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>. <dl>.   <dt>duration</dt>.   <dd>The duration of the animation in milliseconds.</dd>. <dt>easing</dt>. <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>. </dl>. <p>. Due to poor performance, animation is disabled in old IE browsers for column charts and polar charts.</p>
    * @param animationLimit For some series, there is a limit that shuts down initial animation by default when the total number of points in the chart is too high. For example, for a column chart and its derivatives, animation doesn't run if there is more than 250 points totally. To disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
    * @param className A class name to apply to the series' graphical elements.
    * @param colorIndex <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">Styled mode</a> only. A specific color index to use for the series, so its graphic representations are given the class name <code>highcharts-color-{n}</code>.
    * @param cursor You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @param data An array of data points for the series. For the <code>solidgauge</code> series type, points can be given in the following ways:.  <ol>.  	<li>An array of numerical values. In this case, the numerical values will .  	be interpreted as <code>y</code> options.  Example:. <pre>data: [0, 5, 3, 5]</pre>.  	</li>.  <li><p>An array of objects with named values. The objects are.  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<solidgauge>.turboThreshold'>turboThreshold</a>, this option is not available.</p>. . <pre>data: [{.     y: 5,.     name: "Point2",.     color: "#00FF00". }, {.     y: 7,.     name: "Point1",.     color: "#FF00FF". }]</pre></li>.  </ol><p>The typical gauge only contains a single data value.</p>
    * @param dataLabels Data labels for the gauge. For gauges, the data labels are enabled by default and shown in a bordered box below the point.
    * @param description <p><i>Requires Accessibility module</i></p>. <p>A description of the series to add to the screen reader information about the series.</p>
    * @param enableMouseTracking Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
    * @param exposeElementToA11y <p>By default, series are exposed to screen readers as regions. By enabling this option, the series element itself will be exposed in the same way as the data points. This is useful if the series is not used as a grouping entity in the chart, but you still want to attach a description to the series.</p>. <p>Requires the Accessibility module.</p>
    * @param findNearestPointBy <p>Determines whether the series should look for the nearest point in both dimensions or just the x-dimension when hovering the series. Defaults to <code>'xy'</code> for scatter series and <code>'x'</code> for most other series. If the data has duplicate x-values, it is recommended to set this to <code>'xy'</code> to allow hovering over all points.</p>. <p>Applies only to series types using nearest neighbor search (not direct hover) for tooltip.</p> 
    * @param getExtremesFromAll Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
    * @param id An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    * @param index The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    * @param keys An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
    * @param legendIndex The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
    * @param linecap Whether the strokes of the solid gauge should be <code>round</code> or <code>square</code>.
    * @param name The name of the series as shown in the legend, tooltip etc.
    * @param overshoot Allow the dial to overshoot the end of the perimeter axis by this many degrees. Say if the gauge axis goes from 0 to 60, a value of 100, or 1000, will show 5 degrees beyond the end of the axis.
    * @param point Properties for each single point
    * @param pointDescriptionFormatter Same as <a href="#accessibility.pointDescriptionFormatter">accessibility.pointDescriptionFormatter</a>, but for an individual series. Overrides the chart wide configuration.
    * @param rounded Wether to draw rounded edges on the gauge.
    * @param selected Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
    * @param showCheckbox If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
    * @param showInLegend Whether to display this particular series or series type in the legend. Defaults to false for gauge series.
    * @param skipKeyboardNavigation If set to <code>True</code>, the accessibility module will skip past the points in this series for keyboard navigation.
    * @param stickyTracking Sticky tracking of mouse events. When true, the <code>mouseOut</code> event.  on a series isn't triggered until the mouse moves over another series, or out.  of the plot area. When false, the <code>mouseOut</code> event on a series is.  triggered when the mouse leaves the area around the series' graph or markers..  This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the .  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
    * @param threshold The threshold or base level for the gauge. 
    * @param tooltip A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
    * @param `type` The type of series. Can be one of <code>area</code>, <code>areaspline</code>,.  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,.  <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    * @param visible Set the initial visibility of the series.
    * @param wrap When this option is <code>true</code>, the dial will wrap around the axes. For instance, in a full-range gauge going from 0 to 360, a value of 400 will point to 40. When <code>wrap</code> is <code>false</code>, the dial stops at 360.
    * @param xAxis When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
    * @param yAxis When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
    * @param zIndex Define the visual z index of the series.
    */
  def apply(animation: js.UndefOr[Boolean] = js.undefined, animationLimit: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, cursor: js.UndefOr[String] = js.undefined, data: js.UndefOr[js.Array[CleanJsObject[SeriesSolidgaugeData] | Double]] = js.undefined, dataLabels: js.UndefOr[CleanJsObject[SeriesSolidgaugeDataLabels]] = js.undefined, description: js.UndefOr[String] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesSolidgaugeEvents]] = js.undefined, exposeElementToA11y: js.UndefOr[Boolean] = js.undefined, findNearestPointBy: js.UndefOr[String] = js.undefined, getExtremesFromAll: js.UndefOr[Boolean] = js.undefined, id: js.UndefOr[String] = js.undefined, index: js.UndefOr[Double] = js.undefined, keys: js.UndefOr[js.Array[String]] = js.undefined, legendIndex: js.UndefOr[Double] = js.undefined, linecap: js.UndefOr[String] = js.undefined, name: js.UndefOr[String] = js.undefined, overshoot: js.UndefOr[Double] = js.undefined, point: js.UndefOr[CleanJsObject[SeriesSolidgaugePoint]] = js.undefined, pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined, rounded: js.UndefOr[Boolean] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, showCheckbox: js.UndefOr[Boolean] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, threshold: js.UndefOr[Double] = js.undefined, tooltip: js.UndefOr[CleanJsObject[SeriesSolidgaugeTooltip]] = js.undefined, `type`: String = "solidgauge", visible: js.UndefOr[Boolean] = js.undefined, wrap: js.UndefOr[Boolean] = js.undefined, xAxis: js.UndefOr[Double | String] = js.undefined, yAxis: js.UndefOr[Double | String] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): SeriesSolidgauge = {
    val animationOuter: js.UndefOr[Boolean] = animation
    val animationLimitOuter: js.UndefOr[Double] = animationLimit
    val classNameOuter: js.UndefOr[String] = className
    val colorIndexOuter: js.UndefOr[Double] = colorIndex
    val cursorOuter: js.UndefOr[String] = cursor
    val dataOuter: js.UndefOr[js.Array[CleanJsObject[SeriesSolidgaugeData] | Double]] = data
    val dataLabelsOuter: js.UndefOr[CleanJsObject[SeriesSolidgaugeDataLabels]] = dataLabels
    val descriptionOuter: js.UndefOr[String] = description
    val enableMouseTrackingOuter: js.UndefOr[Boolean] = enableMouseTracking
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesSolidgaugeEvents]] = events
    val exposeElementToA11yOuter: js.UndefOr[Boolean] = exposeElementToA11y
    val findNearestPointByOuter: js.UndefOr[String] = findNearestPointBy
    val getExtremesFromAllOuter: js.UndefOr[Boolean] = getExtremesFromAll
    val idOuter: js.UndefOr[String] = id
    val indexOuter: js.UndefOr[Double] = index
    val keysOuter: js.UndefOr[js.Array[String]] = keys
    val legendIndexOuter: js.UndefOr[Double] = legendIndex
    val linecapOuter: js.UndefOr[String] = linecap
    val nameOuter: js.UndefOr[String] = name
    val overshootOuter: js.UndefOr[Double] = overshoot
    val pointOuter: js.UndefOr[CleanJsObject[SeriesSolidgaugePoint]] = point
    val pointDescriptionFormatterOuter: js.UndefOr[js.Function] = pointDescriptionFormatter
    val roundedOuter: js.UndefOr[Boolean] = rounded
    val selectedOuter: js.UndefOr[Boolean] = selected
    val showCheckboxOuter: js.UndefOr[Boolean] = showCheckbox
    val showInLegendOuter: js.UndefOr[Boolean] = showInLegend
    val skipKeyboardNavigationOuter: js.UndefOr[Boolean] = skipKeyboardNavigation
    val stickyTrackingOuter: js.UndefOr[Boolean] = stickyTracking
    val thresholdOuter: js.UndefOr[Double] = threshold
    val tooltipOuter: js.UndefOr[CleanJsObject[SeriesSolidgaugeTooltip]] = tooltip
    val typeOuter: String = `type`
    val visibleOuter: js.UndefOr[Boolean] = visible
    val wrapOuter: js.UndefOr[Boolean] = wrap
    val xAxisOuter: js.UndefOr[Double | String] = xAxis
    val yAxisOuter: js.UndefOr[Double | String] = yAxis
    val zIndexOuter: js.UndefOr[Double] = zIndex
    new SeriesSolidgauge {
      override val animation: js.UndefOr[Boolean] = animationOuter
      override val animationLimit: js.UndefOr[Double] = animationLimitOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val colorIndex: js.UndefOr[Double] = colorIndexOuter
      override val cursor: js.UndefOr[String] = cursorOuter
      override val data: js.UndefOr[js.Array[CleanJsObject[SeriesSolidgaugeData] | Double]] = dataOuter
      override val dataLabels: js.UndefOr[CleanJsObject[SeriesSolidgaugeDataLabels]] = dataLabelsOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val enableMouseTracking: js.UndefOr[Boolean] = enableMouseTrackingOuter
      override val events: js.UndefOr[CleanJsObject[SeriesSolidgaugeEvents]] = eventsOuter
      override val exposeElementToA11y: js.UndefOr[Boolean] = exposeElementToA11yOuter
      override val findNearestPointBy: js.UndefOr[String] = findNearestPointByOuter
      override val getExtremesFromAll: js.UndefOr[Boolean] = getExtremesFromAllOuter
      override val id: js.UndefOr[String] = idOuter
      override val index: js.UndefOr[Double] = indexOuter
      override val keys: js.UndefOr[js.Array[String]] = keysOuter
      override val legendIndex: js.UndefOr[Double] = legendIndexOuter
      override val linecap: js.UndefOr[String] = linecapOuter
      override val name: js.UndefOr[String] = nameOuter
      override val overshoot: js.UndefOr[Double] = overshootOuter
      override val point: js.UndefOr[CleanJsObject[SeriesSolidgaugePoint]] = pointOuter
      override val pointDescriptionFormatter: js.UndefOr[js.Function] = pointDescriptionFormatterOuter
      override val rounded: js.UndefOr[Boolean] = roundedOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val showCheckbox: js.UndefOr[Boolean] = showCheckboxOuter
      override val showInLegend: js.UndefOr[Boolean] = showInLegendOuter
      override val skipKeyboardNavigation: js.UndefOr[Boolean] = skipKeyboardNavigationOuter
      override val stickyTracking: js.UndefOr[Boolean] = stickyTrackingOuter
      override val threshold: js.UndefOr[Double] = thresholdOuter
      override val tooltip: js.UndefOr[CleanJsObject[SeriesSolidgaugeTooltip]] = tooltipOuter
      override val `type`: String = typeOuter
      override val visible: js.UndefOr[Boolean] = visibleOuter
      override val wrap: js.UndefOr[Boolean] = wrapOuter
      override val xAxis: js.UndefOr[Double | String] = xAxisOuter
      override val yAxis: js.UndefOr[Double | String] = yAxisOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    }
  }
}
