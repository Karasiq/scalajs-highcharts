/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.4 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class SeriesSolidgauge extends js.Object {
  
  /**
   * <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>
   * <dl>
   *   <dt>duration</dt>
   *   <dd>The duration of the animation in milliseconds.</dd>
   * <dt>easing</dt>
   * <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>
   * </dl>
   * <p>
   * Due to poor performance, animation is disabled in old IE browsers for column charts and polar charts.</p>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-animation-disabled/" target="_blank">Animation disabled</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-animation-slower/" target="_blank">slower animation</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-animation-easing/" target="_blank">easing "easeOutBounce" through jQuery UI</a>.
   */
  val animation: Boolean = true
  
  /**
   * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
   * @example Pointer cursor <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-cursor-line/" target="_blank">on line graph</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-cursor-column/" target="_blank">on columns</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-cursor-scatter/" target="_blank">on scatter markers</a>
   */
  val cursor: UndefOr[String] = js.undefined
  
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
<li><a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/reflow-true/" target="_blank">Numerical values</a></li>
<li><a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-array-of-arrays/" target="_blank">Arrays of numeric x and y</a></li>
<li><a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-array-of-arrays-datetime/" target="_blank">Arrays of datetime x and y</a></li>
<li><a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-array-of-name-value/" target="_blank">Arrays of point.name and y</a></li>
<li><a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-array-of-objects/" target="_blank"> Config objects</a></li>
</ul>
   */
  val data: js.Any = js.Array()
  
  /**
   * Data labels for the gauge. For gauges, the data labels are enabled by default and shown in a bordered box below the point.
   * @since 2.3.0
   */
  val dataLabels: js.Object = new js.Object
  
  /**
   * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-enablemousetracking-false/" target="_blank">No mouse tracking</a>
   */
  val enableMouseTracking: Boolean = true
  
  val events: SeriesSolidgaugeEvents = new SeriesSolidgaugeEvents
  
  /**
   * Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
   * @since 4.1.6
   */
  val getExtremesFromAll: Boolean = false
  
  /**
   * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-id/" target="_blank">Get series by id</a>
   * @since 1.2.0
   */
  val id: String = ""
  
  /**
   * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
   * @since 2.3.0
   */
  val index: UndefOr[Double] = js.undefined
  
  /**
   * An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-keys/" target="_blank">An extended data array with keys</a>
   * @since 4.1.6
   */
  val keys: UndefOr[js.Array[String]] = js.undefined
  
  /**
   * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
   */
  val legendIndex: UndefOr[Double] = js.undefined
  
  /**
   * The name of the series as shown in the legend, tooltip etc.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/name/" target="_blank">Series name</a>
   */
  val name: UndefOr[String] = js.undefined
  
  /**
   * Allow the dial to overshoot the end of the perimeter axis by this many degrees. Say if the gauge axis goes from 0 to 60, a value of 100, or 1000, will show 5 degrees beyond the end of the axis.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-overshoot/" target="_blank">Allow 5 degrees overshoot</a>
   * @since 3.0.10
   */
  val overshoot: Double = 0
  
  /**
   * Properties for each single point
   */
  val point: SeriesSolidgaugePoint = new SeriesSolidgaugePoint
  
  /**
   * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-selected/" target="_blank">One out of two series selected</a>
   * @since 1.2.0
   */
  val selected: Boolean = false
  
  /**
   * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-showcheckbox-true/" target="_blank">Show select box</a>
   * @since 1.2.0
   */
  val showCheckbox: Boolean = false
  
  /**
   * Whether to display this particular series or series type in the legend. Defaults to false for gauge series.
   * @since 2.3.0
   */
  val showInLegend: UndefOr[Boolean] = js.undefined
  
  /**
   * A wrapper object for all the series options in specific states.
   */
  val states: PlotOptionsSeriesStates = new PlotOptionsSeriesStates
  
  /**
   * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event
   *  on a series isn't triggered until the mouse moves over another series, or out
   *  of the plot area. When false, the <code>mouseOut</code> event on a series is
   *  triggered when the mouse leaves the area around the series' graph or markers.
   *  This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the 
   *  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-stickytracking-true/" target="_blank">True by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-stickytracking-false/" target="_blank">false</a>
   * @since 2.0
   */
  val stickyTracking: Boolean = true
  
  /**
   * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
   * @since 2.3
   */
  val tooltip: js.Object = new js.Object
  
  /**
   * The type of series. Can be one of <code>area</code>, <code>areaspline</code>,
   *  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,
   *  <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/type/" target="_blank">Line and column in the same chart</a>
   */
  val `type`: UndefOr[String] = js.undefined
  
  /**
   * Set the initial visibility of the series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-visible/" target="_blank">Two series, one hidden and one visible</a>
   */
  val visible: Boolean = true
  
  /**
   * When this option is <code>true</code>, the dial will wrap around the axes. For instance, in a full-range gauge going from 0 to 360, a value of 400 will point to 40. When <code>wrap</code> is <code>false</code>, the dial stops at 360.
   * @since 3.0
   */
  val wrap: Boolean = true
  
  /**
   * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
   */
  val xAxis: js.Any = "0"
  
  /**
   * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/yaxis/" target="_blank">Apply the column series to the secondary Y axis</a>
   */
  val yAxis: js.Any = "0"
  
  /**
   * Define the visual z index of the series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-zindex-default/" target="_blank">With no z index, the series defined last are on top</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-zindex/" target="_blank">with a z index, the series with the highest z index is on top</a>.
   */
  val zIndex: UndefOr[Double] = js.undefined
  
  /**
   * Defines the Axis on which the zones are applied.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/" target="_blank">Zones on the X-Axis</a>
   * @since 4.1.0
   */
  val zoneAxis: String = "y"
  
  /**
   * An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/color-zones-simple/" target="_blank">Color zones</a>
   * @since 4.1.0
   */
  val zones: js.Array[SeriesSolidgaugeZones] = new js.Array[SeriesSolidgaugeZones]
}
