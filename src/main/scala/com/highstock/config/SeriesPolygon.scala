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
  * @note JavaScript name: <code>series&lt;polygon&gt;</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPolygon extends js.Object {

  /**
    * Allow this series' points to be selected by clicking on the markers or bars.
    */
  val allowPointSelect: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>
    * <dl>
    *   <dt>duration</dt>
    *   <dd>The duration of the animation in milliseconds.</dd>
    * <dt>easing</dt>
    * <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>
    * </dl>
    * <p>
    * Due to poor performance, animation is disabled in old IE browsers for column charts and polar charts.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/plotoptions/animation-slower/" target="_blank">Slower animation</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/plotoptions/animation-easing/" target="_blank">custom easing function</a>.
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
    * <p>The main color of the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the series color can be set with the <code>.highcharts-series</code>, <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or <code>.highcharts-series-{n}</code> class, or individual classes given by the <code>className</code> option.</p>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Compare the values of the series against the first non-null, non-zero value in the visible range. The y axis will
    *  show percentage or absolute change depending on whether <code>compare</code> is set to <code>"percent"</code>
    *  or <code>"value"</code>. When this is applied to multiple series, it allows comparing the development
    *  of the series against each other.
    * @example Setting compare to 
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-compare-percent/" target="_blank">
				percent</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-compare-value/" target="_blank">
				value</a>.
    * @since 1.0.1
    */
  val compare: js.UndefOr[String] = js.undefined

  /**
    * When <a href="#plotOptions.series.compare">compare</a> is <code>percent</code>, this option dictates whether to use 0 or 100 as the base of comparison.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/series-comparebase/" target="_blank">Compare base is 100</a>
    * @since 5.0.6
    */
  val compareBase: js.UndefOr[Double] = js.undefined

  /**
    * When the series contains less points than the crop threshold, all points are drawn,  even if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.
    */
  val cropThreshold: js.UndefOr[Double] = js.undefined

  /**
    * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/plotoptions/cursor/" target="_blank">Pointer on a line graph</a>
    */
  val cursor: js.UndefOr[String] = js.undefined

  /**
    * A name for the dash style to use for the graph. Applies only to series type having a graph, like <code>line</code>, <code>spline</code>, <code>area</code> and <code>scatter</code> in  case it has a <code>lineWidth</code>. The value for the <code>dashStyle</code> include:
    * 		    <ul>
    * 		    	<li>Solid</li>
    * 		    	<li>ShortDash</li>
    * 		    	<li>ShortDot</li>
    * 		    	<li>ShortDashDot</li>
    * 		    	<li>ShortDashDotDot</li>
    * 		    	<li>Dot</li>
    * 		    	<li>Dash</li>
    * 		    	<li>LongDash</li>
    * 		    	<li>DashDot</li>
    * 		    	<li>LongDashDot</li>
    * 		    	<li>LongDashDotDot</li>
    * 		    </ul>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/" target="_blank">Possible values demonstrated</a>
    */
  val dashStyle: js.UndefOr[String] = js.undefined

  /**
    * An array of data points for the series. For the <code>polygon</code> series type, points can be given in the following ways:
    *  <ol>
    *  	<li>An array of numerical values. In this case, the numerical values will 
    *  	be interpreted as <code>y</code> options. The <code>x</code> values will be automatically calculated,
    *  	either starting at 0 and incremented by 1, or from <code>pointStart</code> 
    *  	and <code>pointInterval</code> given in the series options. If the axis
    *  	has categories, these will be used.  Example:
    * <pre>data: [0, 5, 3, 5]</pre>
    *  	</li>
    *  	<li><p>An array of arrays with 2 values. In this case, the values correspond to <code>x,y</code>. If the first value is a string, it is
    *  	applied as the name of the point, and the <code>x</code> value is inferred. <pre>data: [
    *     [0, 0], 
    *     [1, 9], 
    *     [2, 2]
    * ]</pre></li>
    * 
    * 
    * <li><p>An array of objects with named values. The objects are
    *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<polygon>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
    * 
    * <pre>data: [{
    *     x: 1,
    *     y: 4,
    *     name: "Point2",
    *     color: "#00FF00"
    * }, {
    *     x: 1,
    *     y: 4,
    *     name: "Point1",
    *     color: "#FF00FF"
    * }]</pre></li>
    *  </ol>
    */
  val data: js.UndefOr[js.Array[CleanJsObject[SeriesPolygonData] | js.Array[js.Any]]] = js.undefined

  /**
    * <p>Data grouping is the concept of sampling the data values into larger blocks in order to ease readability and increase performance of the JavaScript charts. Highstock by default applies data grouping when the points become closer than a certain pixel value, determined by the <code>groupPixelWidth</code> option.</p>
    * 
    * <p>If data grouping is applied, the grouping information of grouped points can be read from the <a href="#Point.dataGroup">Point.dataGroup</a>.</p>
    */
  val dataGrouping: js.UndefOr[CleanJsObject[SeriesPolygonDataGrouping]] = js.undefined

  val dataLabels: js.UndefOr[CleanJsObject[SeriesPolygonDataLabels]] = js.undefined

  /**
    * <p><i>Requires Accessibility module</i></p>
    * <p>A description of the series to add to the screen reader information about the series.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/accessibility/accessible-stock/">Accessible stock chart</a>
    * @since 5.0.0
    */
  val description: js.UndefOr[String] = js.undefined

  /**
    * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. When using shared tooltips  (default in stock charts), mouse tracking is not required. For large datasets it improves performance.
    */
  val enableMouseTracking: js.UndefOr[Boolean] = js.undefined

  val events: js.UndefOr[CleanJsObject[SeriesPolygonEvents]] = js.undefined

  /**
    * Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
    * @since 2.1.6
    */
  val getExtremesFromAll: js.UndefOr[Boolean] = js.undefined

  /**
    * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    * @since 1.2.0
    */
  val index: js.UndefOr[Double] = js.undefined

  /**
    * An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/data-keys/" target="_blank">An extended data array with keys</a>
    * @since 2.1.6
    */
  val keys: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
    */
  val legendIndex: js.UndefOr[Double] = js.undefined

  /**
    * The width of the line connecting the data points.
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/demo/arearange-line/" target="_blank">Linked series</a>
    * @since 1.3
    */
  val linkedTo: js.UndefOr[String] = js.undefined

  /**
    * <p>Options for the point markers of line-type series. Properties like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual appearance of the markers. Other series types, like column series, don't have markers, but have visual options on the series level instead.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the markers can be styled with the <code>.highcharts-point</code>, <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.</p>
    */
  val marker: js.UndefOr[CleanJsObject[SeriesPolygonMarker]] = js.undefined

  /**
    * The name of the series as shown in the legend, tooltip etc.
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * <p>Options for the corresponding navigator series if <code>showInNavigator</code> is <code>true</code> for this series. Available options are the same as any series, documented at <a class="internal" href="#plotOptions.series">plotOptions</a> and <a class="internal" href="#series">series</a>.</p>
    * 
    * <p>These options are merged with options in <a href="#navigator.series">navigator.series</a>, and will take precedence if the same option is defined both places.</p>
    * @since 5.0.0
    */
  val navigatorOptions: js.UndefOr[js.Object] = js.undefined

  /**
    * The color for the parts of the graph or points that are below the <a href="#plotOptions.series.threshold">threshold</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-negative-color/" target="_blank">Spline, area and column</a> - <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-negativecolor/" target="_blank">arearange</a>.
    * @since 3.0
    */
  val negativeColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Properties for each single point
    */
  val point: js.UndefOr[CleanJsObject[SeriesPolygonPoint]] = js.undefined

  /**
    * <p>If no x values are given for the points in a series, pointInterval defines the interval of the x values in milliseconds. For example, if a series contains one value each day, set pointInterval to <code>24 * 3600 * 1000</code>.</p>
    * <p>Since Highstock 2.1, it can be combined with <code>pointIntervalUnit</code> to draw irregular intervals.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/plotoptions/pointinterval-pointstart/" target="_blank">
				Using pointStart and pointInterval</a>
    */
  val pointInterval: js.UndefOr[Double] = js.undefined

  /**
    * On datetime series, this allows for setting the <a href="#plotOptions.series.pointInterval">pointInterval</a> to irregular time units, <code>day</code>, <code>month</code> and <code>year</code>. A day is usually the same as 24 hours, but pointIntervalUnit also takes the DST crossover into consideration when dealing with local time. Combine this option with <code>pointInterval</code> to draw weeks, quarters, 6 months, 10 years etc.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointintervalunit/" target="_blank">One point a month</a>
    * @since 2.1.0
    */
  val pointIntervalUnit: js.UndefOr[String] = js.undefined

  /**
    * <p>Possible values: <code>null</code>, <code>"on"</code>, <code>"between"</code>.</p>
    * <p>In a column chart, when pointPlacement is <code>"on"</code>, the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is <code>"between"</code>, the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>
    * <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>
    * <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is computed, but for line-type series it needs to be set.</p>
    * <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointplacement-between/" target="_blank">Between in a column chart</a>, <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointplacement-numeric/" target="_blank">numeric placement for custom layout</a>.
    * @since 1.2.0
    */
  val pointPlacement: js.UndefOr[String | Double] = js.undefined

  /**
    * The width of each point on the x axis. For example in a column chart with one value each day, the pointRange would be 1 day (= 24 * 3600 * 1000 milliseconds). This is normally computed automatically, but this option can be used to override the automatic value.
    */
  val pointRange: js.UndefOr[Double] = js.undefined

  /**
    * If no x values are given for the points in a series, pointStart defines on what value to start. On a datetime X axis, the number will be given as milliseconds since 1970-01-01, for example <code>Date.UTC(2011, 0, 1)</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/plotoptions/pointinterval-pointstart/" target="_blank">
				Using pointStart and pointInterval</a>
    */
  val pointStart: js.UndefOr[Double] = js.undefined

  /**
    * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name in the legend will be checked for a selected series.
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to apply a drop shadow to the graph line. Since 1.1.7 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
    */
  val showCheckbox: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
    */
  val showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether or not to show the series in the navigator. Takes precedence over <a href="#navigator.baseSeries">navigator.baseSeries</a> if defined.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/navigator/multiple-series/">Multiple navigator series</a>
    * @since 5.0.0
    */
  val showInNavigator: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to stack the values of each series on top of each other. Possible values are null to disable, "normal" to stack by value or "percent". When stacking is enabled, data must be sorted in ascending X order.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/plotoptions/stacking/" target="_blank">Area</a> with "normal" stacking.
    */
  val stacking: js.UndefOr[String] = js.undefined

  /**
    * A wrapper object for all the series options in specific states.
    */
  val states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = js.undefined

  /**
    * Sticky tracking of mouse events. When true, the <code>mouseOut</code> event
    *  on a series isn't triggered until the mouse moves over another series, or out
    *  of the plot area. When false, the <code>mouseOut</code> event on a series is
    *  triggered when the mouse leaves the area around the series' graph or markers.
    *  This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the 
    *  tooltip will be hidden when moving the mouse between series.
    */
  val stickyTracking: js.UndefOr[Boolean] = js.undefined

  /**
    * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a class="internal">#tooltip</a>. Overridable properties are <code>headerFormat</code>, <code>pointFormat</code>, <code>yDecimals</code>, <code>xDateFormat</code>, <code>yPrefix</code> and <code>ySuffix</code>.  Unlike other series, in a scatter plot the series.name by default shows in the headerFormat  and poin.x and point.y in the pointFormat.
    */
  val tooltip: js.UndefOr[js.Object] = js.undefined

  /**
    * When a series contains a data array that is longer than this, only one dimensional arrays of numbers,
    *  or two dimensional arrays with x and y values are allowed. Also, only the first
    *  point is tested, and the rest are assumed to be the same format. This saves expensive
    *  data checking and indexing in long series. Set it to <code>0</code> disable.
    */
  val turboThreshold: js.UndefOr[Double] = js.undefined

  /**
    * The type of series. Can be one of <code>area</code>, <code>areaspline</code>,
    *  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,
    *  <code>scatter</code>, <code>spline</code>, <code>candlestick</code> or <code>ohlc</code>. From version 1.1.7, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    */
  val `type`: String = "polygon"

  /**
    * Set the initial visibility of the series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-visibility/" target="_blank">Hidden series</a>
    */
  val visible: js.UndefOr[Boolean] = js.undefined

  /**
    * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
    */
  val xAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
    */
  val yAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * Define the visual z index of the series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex-default/" target="_blank">With no z index, the series defined last are on top</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex/" target="_blank">with a z index, the series with the highest z index is on top</a>.
    */
  val zIndex: js.UndefOr[Double] = js.undefined

  /**
    * Defines the Axis on which the zones are applied.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/" target="_blank">Zones on the X-Axis</a>
    * @since 2.1.0
    */
  val zoneAxis: js.UndefOr[String] = js.undefined

  /**
    * <p>An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the color zones are styled with the <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code> option (<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">view live demo</a>).</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-simple/" target="_blank">Color zones</a>
    * @since 2.1.0
    */
  val zones: js.UndefOr[js.Array[CleanJsObject[SeriesPolygonZones]]] = js.undefined
}

object SeriesPolygon {
  /**
    * @param allowPointSelect Allow this series' points to be selected by clicking on the markers or bars.
    * @param animation <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>. <dl>.   <dt>duration</dt>.   <dd>The duration of the animation in milliseconds.</dd>. <dt>easing</dt>. <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>. </dl>. <p>. Due to poor performance, animation is disabled in old IE browsers for column charts and polar charts.</p>
    * @param animationLimit For some series, there is a limit that shuts down initial animation by default when the total number of points in the chart is too high. For example, for a column chart and its derivatives, animation doesn't run if there is more than 250 points totally. To disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
    * @param className A class name to apply to the series' graphical elements.
    * @param color <p>The main color of the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the series color can be set with the <code>.highcharts-series</code>, <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or <code>.highcharts-series-{n}</code> class, or individual classes given by the <code>className</code> option.</p>
    * @param compare Compare the values of the series against the first non-null, non-zero value in the visible range. The y axis will.  show percentage or absolute change depending on whether <code>compare</code> is set to <code>"percent"</code>.  or <code>"value"</code>. When this is applied to multiple series, it allows comparing the development.  of the series against each other.
    * @param compareBase When <a href="#plotOptions.series.compare">compare</a> is <code>percent</code>, this option dictates whether to use 0 or 100 as the base of comparison.
    * @param cropThreshold When the series contains less points than the crop threshold, all points are drawn,  even if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.
    * @param cursor You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @param dashStyle A name for the dash style to use for the graph. Applies only to series type having a graph, like <code>line</code>, <code>spline</code>, <code>area</code> and <code>scatter</code> in  case it has a <code>lineWidth</code>. The value for the <code>dashStyle</code> include:. 		    <ul>. 		    	<li>Solid</li>. 		    	<li>ShortDash</li>. 		    	<li>ShortDot</li>. 		    	<li>ShortDashDot</li>. 		    	<li>ShortDashDotDot</li>. 		    	<li>Dot</li>. 		    	<li>Dash</li>. 		    	<li>LongDash</li>. 		    	<li>DashDot</li>. 		    	<li>LongDashDot</li>. 		    	<li>LongDashDotDot</li>. 		    </ul>
    * @param data An array of data points for the series. For the <code>polygon</code> series type, points can be given in the following ways:.  <ol>.  	<li>An array of numerical values. In this case, the numerical values will .  	be interpreted as <code>y</code> options. The <code>x</code> values will be automatically calculated,.  	either starting at 0 and incremented by 1, or from <code>pointStart</code> .  	and <code>pointInterval</code> given in the series options. If the axis.  	has categories, these will be used.  Example:. <pre>data: [0, 5, 3, 5]</pre>.  	</li>.  	<li><p>An array of arrays with 2 values. In this case, the values correspond to <code>x,y</code>. If the first value is a string, it is.  	applied as the name of the point, and the <code>x</code> value is inferred. <pre>data: [.     [0, 0], .     [1, 9], .     [2, 2]. ]</pre></li>. . . <li><p>An array of objects with named values. The objects are.  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<polygon>.turboThreshold'>turboThreshold</a>, this option is not available.</p>. . <pre>data: [{.     x: 1,.     y: 4,.     name: "Point2",.     color: "#00FF00". }, {.     x: 1,.     y: 4,.     name: "Point1",.     color: "#FF00FF". }]</pre></li>.  </ol>
    * @param dataGrouping <p>Data grouping is the concept of sampling the data values into larger blocks in order to ease readability and increase performance of the JavaScript charts. Highstock by default applies data grouping when the points become closer than a certain pixel value, determined by the <code>groupPixelWidth</code> option.</p>. . <p>If data grouping is applied, the grouping information of grouped points can be read from the <a href="#Point.dataGroup">Point.dataGroup</a>.</p>
    * @param description <p><i>Requires Accessibility module</i></p>. <p>A description of the series to add to the screen reader information about the series.</p>
    * @param enableMouseTracking Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. When using shared tooltips  (default in stock charts), mouse tracking is not required. For large datasets it improves performance.
    * @param getExtremesFromAll Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
    * @param id An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    * @param index The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    * @param keys An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
    * @param legendIndex The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
    * @param lineWidth The width of the line connecting the data points.
    * @param linkedTo The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
    * @param marker <p>Options for the point markers of line-type series. Properties like <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual appearance of the markers. Other series types, like column series, don't have markers, but have visual options on the series level instead.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the markers can be styled with the <code>.highcharts-point</code>, <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code> class names.</p>
    * @param name The name of the series as shown in the legend, tooltip etc.
    * @param navigatorOptions <p>Options for the corresponding navigator series if <code>showInNavigator</code> is <code>true</code> for this series. Available options are the same as any series, documented at <a class="internal" href="#plotOptions.series">plotOptions</a> and <a class="internal" href="#series">series</a>.</p>. . <p>These options are merged with options in <a href="#navigator.series">navigator.series</a>, and will take precedence if the same option is defined both places.</p>
    * @param negativeColor The color for the parts of the graph or points that are below the <a href="#plotOptions.series.threshold">threshold</a>.
    * @param point Properties for each single point
    * @param pointInterval <p>If no x values are given for the points in a series, pointInterval defines the interval of the x values in milliseconds. For example, if a series contains one value each day, set pointInterval to <code>24 * 3600 * 1000</code>.</p>. <p>Since Highstock 2.1, it can be combined with <code>pointIntervalUnit</code> to draw irregular intervals.</p>
    * @param pointIntervalUnit On datetime series, this allows for setting the <a href="#plotOptions.series.pointInterval">pointInterval</a> to irregular time units, <code>day</code>, <code>month</code> and <code>year</code>. A day is usually the same as 24 hours, but pointIntervalUnit also takes the DST crossover into consideration when dealing with local time. Combine this option with <code>pointInterval</code> to draw weeks, quarters, 6 months, 10 years etc.
    * @param pointPlacement <p>Possible values: <code>null</code>, <code>"on"</code>, <code>"between"</code>.</p>. <p>In a column chart, when pointPlacement is <code>"on"</code>, the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is <code>"between"</code>, the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>. <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>. <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is computed, but for line-type series it needs to be set.</p>. <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
    * @param pointRange The width of each point on the x axis. For example in a column chart with one value each day, the pointRange would be 1 day (= 24 * 3600 * 1000 milliseconds). This is normally computed automatically, but this option can be used to override the automatic value.
    * @param pointStart If no x values are given for the points in a series, pointStart defines on what value to start. On a datetime X axis, the number will be given as milliseconds since 1970-01-01, for example <code>Date.UTC(2011, 0, 1)</code>.
    * @param selected Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name in the legend will be checked for a selected series.
    * @param shadow Whether to apply a drop shadow to the graph line. Since 1.1.7 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @param showCheckbox If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
    * @param showInLegend Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
    * @param showInNavigator Whether or not to show the series in the navigator. Takes precedence over <a href="#navigator.baseSeries">navigator.baseSeries</a> if defined.
    * @param stacking Whether to stack the values of each series on top of each other. Possible values are null to disable, "normal" to stack by value or "percent". When stacking is enabled, data must be sorted in ascending X order.
    * @param states A wrapper object for all the series options in specific states.
    * @param stickyTracking Sticky tracking of mouse events. When true, the <code>mouseOut</code> event.  on a series isn't triggered until the mouse moves over another series, or out.  of the plot area. When false, the <code>mouseOut</code> event on a series is.  triggered when the mouse leaves the area around the series' graph or markers..  This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the .  tooltip will be hidden when moving the mouse between series.
    * @param tooltip A configuration object for the tooltip rendering of each single series. Properties are inherited from <a class="internal">#tooltip</a>. Overridable properties are <code>headerFormat</code>, <code>pointFormat</code>, <code>yDecimals</code>, <code>xDateFormat</code>, <code>yPrefix</code> and <code>ySuffix</code>.  Unlike other series, in a scatter plot the series.name by default shows in the headerFormat  and poin.x and point.y in the pointFormat.
    * @param turboThreshold When a series contains a data array that is longer than this, only one dimensional arrays of numbers,.  or two dimensional arrays with x and y values are allowed. Also, only the first.  point is tested, and the rest are assumed to be the same format. This saves expensive.  data checking and indexing in long series. Set it to <code>0</code> disable.
    * @param `type` The type of series. Can be one of <code>area</code>, <code>areaspline</code>,.  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,.  <code>scatter</code>, <code>spline</code>, <code>candlestick</code> or <code>ohlc</code>. From version 1.1.7, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    * @param visible Set the initial visibility of the series.
    * @param xAxis When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
    * @param yAxis When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
    * @param zIndex Define the visual z index of the series.
    * @param zoneAxis Defines the Axis on which the zones are applied.
    * @param zones <p>An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the color zones are styled with the <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code> option (<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">view live demo</a>).</p>
    */
  def apply(allowPointSelect: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean] = js.undefined, animationLimit: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, compare: js.UndefOr[String] = js.undefined, compareBase: js.UndefOr[Double] = js.undefined, cropThreshold: js.UndefOr[Double] = js.undefined, cursor: js.UndefOr[String] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, data: js.UndefOr[js.Array[CleanJsObject[SeriesPolygonData] | js.Array[js.Any]]] = js.undefined, dataGrouping: js.UndefOr[CleanJsObject[SeriesPolygonDataGrouping]] = js.undefined, dataLabels: js.UndefOr[CleanJsObject[SeriesPolygonDataLabels]] = js.undefined, description: js.UndefOr[String] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesPolygonEvents]] = js.undefined, getExtremesFromAll: js.UndefOr[Boolean] = js.undefined, id: js.UndefOr[String] = js.undefined, index: js.UndefOr[Double] = js.undefined, keys: js.UndefOr[js.Array[String]] = js.undefined, legendIndex: js.UndefOr[Double] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, linkedTo: js.UndefOr[String] = js.undefined, marker: js.UndefOr[CleanJsObject[SeriesPolygonMarker]] = js.undefined, name: js.UndefOr[String] = js.undefined, navigatorOptions: js.UndefOr[js.Object] = js.undefined, negativeColor: js.UndefOr[String | js.Object] = js.undefined, point: js.UndefOr[CleanJsObject[SeriesPolygonPoint]] = js.undefined, pointInterval: js.UndefOr[Double] = js.undefined, pointIntervalUnit: js.UndefOr[String] = js.undefined, pointPlacement: js.UndefOr[String | Double] = js.undefined, pointRange: js.UndefOr[Double] = js.undefined, pointStart: js.UndefOr[Double] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, showCheckbox: js.UndefOr[Boolean] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, showInNavigator: js.UndefOr[Boolean] = js.undefined, stacking: js.UndefOr[String] = js.undefined, states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, tooltip: js.UndefOr[js.Object] = js.undefined, turboThreshold: js.UndefOr[Double] = js.undefined, `type`: String = "polygon", visible: js.UndefOr[Boolean] = js.undefined, xAxis: js.UndefOr[Double | String] = js.undefined, yAxis: js.UndefOr[Double | String] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, zoneAxis: js.UndefOr[String] = js.undefined, zones: js.UndefOr[js.Array[CleanJsObject[SeriesPolygonZones]]] = js.undefined): SeriesPolygon = {
    val allowPointSelectOuter: js.UndefOr[Boolean] = allowPointSelect
    val animationOuter: js.UndefOr[Boolean] = animation
    val animationLimitOuter: js.UndefOr[Double] = animationLimit
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val compareOuter: js.UndefOr[String] = compare
    val compareBaseOuter: js.UndefOr[Double] = compareBase
    val cropThresholdOuter: js.UndefOr[Double] = cropThreshold
    val cursorOuter: js.UndefOr[String] = cursor
    val dashStyleOuter: js.UndefOr[String] = dashStyle
    val dataOuter: js.UndefOr[js.Array[CleanJsObject[SeriesPolygonData] | js.Array[js.Any]]] = data
    val dataGroupingOuter: js.UndefOr[CleanJsObject[SeriesPolygonDataGrouping]] = dataGrouping
    val dataLabelsOuter: js.UndefOr[CleanJsObject[SeriesPolygonDataLabels]] = dataLabels
    val descriptionOuter: js.UndefOr[String] = description
    val enableMouseTrackingOuter: js.UndefOr[Boolean] = enableMouseTracking
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesPolygonEvents]] = events
    val getExtremesFromAllOuter: js.UndefOr[Boolean] = getExtremesFromAll
    val idOuter: js.UndefOr[String] = id
    val indexOuter: js.UndefOr[Double] = index
    val keysOuter: js.UndefOr[js.Array[String]] = keys
    val legendIndexOuter: js.UndefOr[Double] = legendIndex
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val linkedToOuter: js.UndefOr[String] = linkedTo
    val markerOuter: js.UndefOr[CleanJsObject[SeriesPolygonMarker]] = marker
    val nameOuter: js.UndefOr[String] = name
    val navigatorOptionsOuter: js.UndefOr[js.Object] = navigatorOptions
    val negativeColorOuter: js.UndefOr[String | js.Object] = negativeColor
    val pointOuter: js.UndefOr[CleanJsObject[SeriesPolygonPoint]] = point
    val pointIntervalOuter: js.UndefOr[Double] = pointInterval
    val pointIntervalUnitOuter: js.UndefOr[String] = pointIntervalUnit
    val pointPlacementOuter: js.UndefOr[String | Double] = pointPlacement
    val pointRangeOuter: js.UndefOr[Double] = pointRange
    val pointStartOuter: js.UndefOr[Double] = pointStart
    val selectedOuter: js.UndefOr[Boolean] = selected
    val shadowOuter: js.UndefOr[Boolean | js.Object] = shadow
    val showCheckboxOuter: js.UndefOr[Boolean] = showCheckbox
    val showInLegendOuter: js.UndefOr[Boolean] = showInLegend
    val showInNavigatorOuter: js.UndefOr[Boolean] = showInNavigator
    val stackingOuter: js.UndefOr[String] = stacking
    val statesOuter: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = states
    val stickyTrackingOuter: js.UndefOr[Boolean] = stickyTracking
    val tooltipOuter: js.UndefOr[js.Object] = tooltip
    val turboThresholdOuter: js.UndefOr[Double] = turboThreshold
    val typeOuter: String = `type`
    val visibleOuter: js.UndefOr[Boolean] = visible
    val xAxisOuter: js.UndefOr[Double | String] = xAxis
    val yAxisOuter: js.UndefOr[Double | String] = yAxis
    val zIndexOuter: js.UndefOr[Double] = zIndex
    val zoneAxisOuter: js.UndefOr[String] = zoneAxis
    val zonesOuter: js.UndefOr[js.Array[CleanJsObject[SeriesPolygonZones]]] = zones
    new SeriesPolygon {
      override val allowPointSelect: js.UndefOr[Boolean] = allowPointSelectOuter
      override val animation: js.UndefOr[Boolean] = animationOuter
      override val animationLimit: js.UndefOr[Double] = animationLimitOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val compare: js.UndefOr[String] = compareOuter
      override val compareBase: js.UndefOr[Double] = compareBaseOuter
      override val cropThreshold: js.UndefOr[Double] = cropThresholdOuter
      override val cursor: js.UndefOr[String] = cursorOuter
      override val dashStyle: js.UndefOr[String] = dashStyleOuter
      override val data: js.UndefOr[js.Array[CleanJsObject[SeriesPolygonData] | js.Array[js.Any]]] = dataOuter
      override val dataGrouping: js.UndefOr[CleanJsObject[SeriesPolygonDataGrouping]] = dataGroupingOuter
      override val dataLabels: js.UndefOr[CleanJsObject[SeriesPolygonDataLabels]] = dataLabelsOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val enableMouseTracking: js.UndefOr[Boolean] = enableMouseTrackingOuter
      override val events: js.UndefOr[CleanJsObject[SeriesPolygonEvents]] = eventsOuter
      override val getExtremesFromAll: js.UndefOr[Boolean] = getExtremesFromAllOuter
      override val id: js.UndefOr[String] = idOuter
      override val index: js.UndefOr[Double] = indexOuter
      override val keys: js.UndefOr[js.Array[String]] = keysOuter
      override val legendIndex: js.UndefOr[Double] = legendIndexOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val linkedTo: js.UndefOr[String] = linkedToOuter
      override val marker: js.UndefOr[CleanJsObject[SeriesPolygonMarker]] = markerOuter
      override val name: js.UndefOr[String] = nameOuter
      override val navigatorOptions: js.UndefOr[js.Object] = navigatorOptionsOuter
      override val negativeColor: js.UndefOr[String | js.Object] = negativeColorOuter
      override val point: js.UndefOr[CleanJsObject[SeriesPolygonPoint]] = pointOuter
      override val pointInterval: js.UndefOr[Double] = pointIntervalOuter
      override val pointIntervalUnit: js.UndefOr[String] = pointIntervalUnitOuter
      override val pointPlacement: js.UndefOr[String | Double] = pointPlacementOuter
      override val pointRange: js.UndefOr[Double] = pointRangeOuter
      override val pointStart: js.UndefOr[Double] = pointStartOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val shadow: js.UndefOr[Boolean | js.Object] = shadowOuter
      override val showCheckbox: js.UndefOr[Boolean] = showCheckboxOuter
      override val showInLegend: js.UndefOr[Boolean] = showInLegendOuter
      override val showInNavigator: js.UndefOr[Boolean] = showInNavigatorOuter
      override val stacking: js.UndefOr[String] = stackingOuter
      override val states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = statesOuter
      override val stickyTracking: js.UndefOr[Boolean] = stickyTrackingOuter
      override val tooltip: js.UndefOr[js.Object] = tooltipOuter
      override val turboThreshold: js.UndefOr[Double] = turboThresholdOuter
      override val `type`: String = typeOuter
      override val visible: js.UndefOr[Boolean] = visibleOuter
      override val xAxis: js.UndefOr[Double | String] = xAxisOuter
      override val yAxis: js.UndefOr[Double | String] = yAxisOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
      override val zoneAxis: js.UndefOr[String] = zoneAxisOuter
      override val zones: js.UndefOr[js.Array[CleanJsObject[SeriesPolygonZones]]] = zonesOuter
    }
  }
}
