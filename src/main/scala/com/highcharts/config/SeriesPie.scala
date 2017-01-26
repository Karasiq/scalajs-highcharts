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
  * @note JavaScript name: <code>series&lt;pie&gt;</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPie extends js.Object {

  /**
    * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-allowpointselect-line/" target="_blank">Line</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-allowpointselect-column/" target="_blank">column</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-allowpointselect-pie/" target="_blank">pie</a>
    * @since 1.2.0
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-disabled/" target="_blank">Animation disabled</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-slower/" target="_blank">slower animation</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/" target="_blank">custom easing function</a>.
    */
  val animation: js.UndefOr[Boolean] = js.undefined

  /**
    * For some series, there is a limit that shuts down initial animation by default when the total number of points in the chart is too high. For example, for a column chart and its derivatives, animation doesn't run if there is more than 250 points totally. To disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
    */
  val animationLimit: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the border surrounding each slice. When <code>null</code>, the border takes the same color as the slice fill. This can be used together with a <code>borderWidth</code> to fill drawing gaps created by antialiazing artefacts in borderless pies.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the border stroke is given in the <code>.highcharts-point</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-bordercolor-black/" target="_blank">Black border</a>. 

<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/pie-point/">Styled mode</a>.


    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the border surrounding each slice.</p>
    * 
    * <p>When setting the border width to 0, there may be small gaps between the slices due to SVG antialiasing artefacts. To work around this, keep the border width at 0.5 or 1, but set the <code>borderColor</code> to <code>null</code> instead.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the border stroke width is given in the <code>.highcharts-point</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-borderwidth/" target="_blank">3px border</a>.


<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/pie-point/">Styled mode</a>.
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * The center of the pie chart relative to the plot area. Can be percentages or pixel values. The default behaviour (as of 3.0) is to center the pie so that all slices and data labels are within the plot area. As a consequence, the pie may actually jump around in a chart with dynamic values, as the data labels move. In that case, the center should be explicitly set, for example to <code>["50%", "50%"]</code>.
    * 		 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-center/" target="_blank">Centered at 100, 100</a>
    */
  val center: js.UndefOr[js.Array[String | Double]] = js.undefined

  /**
    * A class name to apply to the series' graphical elements.
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * A series specific or series type specific color set to use instead of the global <a href="#colors">colors</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-monochrome/" target="_blank">Set default colors for all pies</a>
    * @since 3.0
    */
  val colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined

  /**
    * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @example Pointer cursor <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-cursor-line/" target="_blank">on line graph</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-cursor-column/" target="_blank">on columns</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-cursor-scatter/" target="_blank">on scatter markers</a>
    */
  val cursor: js.UndefOr[String] = js.undefined

  /**
    * An array of data points for the series. For the <code>pie</code> series type, points can be given in the following ways:
    *  <ol>
    *  	<li>An array of numerical values. In this case, the numerical values will 
    *  	be interpreted as <code>y</code> options.  Example:
    * <pre>data: [0, 5, 3, 5]</pre>
    *  	</li>
    *  <li><p>An array of objects with named values. The objects are
    *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<pie>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
    * 
    * <pre>data: [{
    *     y: 1,
    *     name: "Point2",
    *     color: "#00FF00"
    * }, {
    *     y: 7,
    *     name: "Point1",
    *     color: "#FF00FF"
    * }]</pre></li>
    *  </ol>
    * @example <p>The demos use a line series, but the principle is the same for all types.</p>
<ul>
<li><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/" target="_blank">Numerical values</a></li>
<li><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-arrays/" target="_blank">Arrays of numeric x and y</a></li>
<li><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-arrays-datetime/" target="_blank">Arrays of datetime x and y</a></li>
<li><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-name-value/" target="_blank">Arrays of point.name and y</a></li>
<li><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-objects/" target="_blank"> Config objects</a></li>
</ul>
    */
  val data: js.UndefOr[js.Array[CleanJsObject[SeriesPieData] | Double]] = js.undefined

  val dataLabels: js.UndefOr[CleanJsObject[SeriesPieDataLabels]] = js.undefined

  /**
    * The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/demo/3d-pie/">Basic 3D pie chart</a>
    * @since 4.0
    */
  val depth: js.UndefOr[Double] = js.undefined

  /**
    * <p><i>Requires Accessibility module</i></p>
    * <p>A description of the series to add to the screen reader information about the series.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/accessibility/accessible-stock/">Accessible stock chart</a>
    * @since 5.0.0
    */
  val description: js.UndefOr[String] = js.undefined

  /**
    * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-enablemousetracking-false/" target="_blank">No mouse tracking</a>
    */
  val enableMouseTracking: js.UndefOr[Boolean] = js.undefined

  /**
    * The end angle of the pie in degrees where 0 is top and 90 is right. Defaults to <code>startAngle</code> plus 360.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-semi-circle/" target="_blank">Semi-circle donut</a>
    * @since 1.3.6
    */
  val endAngle: js.UndefOr[Double] = js.undefined

  val events: js.UndefOr[CleanJsObject[SeriesPieEvents]] = js.undefined

  /**
    * Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
    * @since 4.1.6
    */
  val getExtremesFromAll: js.UndefOr[Boolean] = js.undefined

  /**
    * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-id/" target="_blank">Get series by id</a>
    * @since 1.2.0
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * <p>Equivalent to <a href="#chart.ignoreHiddenSeries">chart.ignoreHiddenSeries</a>, this option tells whether the series shall be redrawn as if the hidden point were <code>null</code>.</p>
    * <p>The default value changed from <code>false</code> to <code>true</code> with Highcharts 3.0.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-ignorehiddenpoint/" target="_blank">True, the hiddden point is ignored</a>
    * @since 2.3.0
    */
  val ignoreHiddenPoint: js.UndefOr[Boolean] = js.undefined

  /**
    * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    * @since 2.3.0
    */
  val index: js.UndefOr[Double] = js.undefined

  /**
    * <p>The size of the inner diameter for the pie. A size greater than 0 renders a donut chart. Can be a percentage or pixel value. Percentages are relative to the pie size. Pixel values are given as integers.</p>
    * 
    * <p>Note: in Highcharts < 4.1.2, the percentage was relative to the plot area, not the pie size.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-innersize-80px/" target="_blank">80px inner size</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-innersize-50percent/" target="_blank">50% of the plot area</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/demo/3d-pie-donut/" target="_blank">3D donut</a>.
    * @since 2.0
    */
  val innerSize: js.UndefOr[String | Double] = js.undefined

  /**
    * An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/data-keys/" target="_blank">An extended data array with keys</a>
    * @since 4.1.6
    */
  val keys: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
    */
  val legendIndex: js.UndefOr[Double] = js.undefined

  /**
    * The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/demo/arearange-line/" target="_blank">Linked series</a>
    * @since 3.0
    */
  val linkedTo: js.UndefOr[String] = js.undefined

  /**
    * The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels in side the plot area, but only to this size.
    * @since 3.0
    */
  val minSize: js.UndefOr[Double] = js.undefined

  /**
    * The name of the series as shown in the legend, tooltip etc.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/name/" target="_blank">Series name</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * Properties for each single point
    */
  val point: js.UndefOr[CleanJsObject[SeriesPiePoint]] = js.undefined

  /**
    * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-selected/" target="_blank">One out of two series selected</a>
    * @since 1.2.0
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-shadow/" target="_blank">Shadow enabled</a>
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * Whether to display this particular series or series type in the legend. Since 2.1, pies are not shown in the legend by default.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-showinlegend/" target="_blank">One series in the legend, one hidden</a>
    */
  val showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * The diameter of the pie relative to the plot area. Can be a percentage or pixel value. Pixel values are given as integers. The default behaviour (as of 3.0) is to scale to the plot area and give room for data labels within the plot area. As a consequence, the size of the pie may vary when points are updated and data labels more around. In that case it is best to set a fixed value, for example <code>"75%"</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-size/" target="_blank">Smaller pie</a>
    */
  val size: js.UndefOr[String | Double] = js.undefined

  /**
    * If a point is sliced, moved out from the center, how many pixels should  it be moved?.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-slicedoffset-20/" target="_blank">20px offset</a>
    */
  val slicedOffset: js.UndefOr[Double] = js.undefined

  /**
    * The start angle of the pie slices in degrees where 0 is top and 90 right. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-startangle-90/" target="_blank">Start from right</a>
    * @since 2.3.4
    */
  val startAngle: js.UndefOr[Double] = js.undefined

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
    * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
    * @since 2.3
    */
  val tooltip: js.UndefOr[CleanJsObject[SeriesPieTooltip]] = js.undefined

  /**
    * The type of series. Can be one of <code>area</code>, <code>areaspline</code>,
    *  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,
    *  <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/type/" target="_blank">Line and column in the same chart</a>
    */
  val `type`: String = "pie"

  /**
    * Set the initial visibility of the series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-visible/" target="_blank">Two series, one hidden and one visible</a>
    */
  val visible: js.UndefOr[Boolean] = js.undefined

  /**
    * Define the visual z index of the series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex-default/" target="_blank">With no z index, the series defined last are on top</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex/" target="_blank">with a z index, the series with the highest z index is on top</a>.
    */
  val zIndex: js.UndefOr[Double] = js.undefined

  /**
    * Defines the Axis on which the zones are applied.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/" target="_blank">Zones on the X-Axis</a>
    * @since 4.1.0
    */
  val zoneAxis: js.UndefOr[String] = js.undefined

  /**
    * <p>An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the color zones are styled with the <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code> option (<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">view live demo</a>).</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-simple/" target="_blank">Color zones</a>
    * @since 4.1.0
    */
  val zones: js.UndefOr[js.Array[CleanJsObject[SeriesPieZones]]] = js.undefined
}

object SeriesPie {
  /**
    * @param allowPointSelect Allow this series' points to be selected by clicking on the markers, bars or pie slices.
    * @param animation <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>. <dl>.   <dt>duration</dt>.   <dd>The duration of the animation in milliseconds.</dd>. <dt>easing</dt>. <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>. </dl>. <p>. Due to poor performance, animation is disabled in old IE browsers for column charts and polar charts.</p>
    * @param animationLimit For some series, there is a limit that shuts down initial animation by default when the total number of points in the chart is too high. For example, for a column chart and its derivatives, animation doesn't run if there is more than 250 points totally. To disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
    * @param borderColor <p>The color of the border surrounding each slice. When <code>null</code>, the border takes the same color as the slice fill. This can be used together with a <code>borderWidth</code> to fill drawing gaps created by antialiazing artefacts in borderless pies.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the border stroke is given in the <code>.highcharts-point</code> class.</p>
    * @param borderWidth <p>The width of the border surrounding each slice.</p>. . <p>When setting the border width to 0, there may be small gaps between the slices due to SVG antialiasing artefacts. To work around this, keep the border width at 0.5 or 1, but set the <code>borderColor</code> to <code>null</code> instead.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the border stroke width is given in the <code>.highcharts-point</code> class.</p>
    * @param center The center of the pie chart relative to the plot area. Can be percentages or pixel values. The default behaviour (as of 3.0) is to center the pie so that all slices and data labels are within the plot area. As a consequence, the pie may actually jump around in a chart with dynamic values, as the data labels move. In that case, the center should be explicitly set, for example to <code>["50%", "50%"]</code>.. 		 
    * @param className A class name to apply to the series' graphical elements.
    * @param colors A series specific or series type specific color set to use instead of the global <a href="#colors">colors</a>.
    * @param cursor You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @param data An array of data points for the series. For the <code>pie</code> series type, points can be given in the following ways:.  <ol>.  	<li>An array of numerical values. In this case, the numerical values will .  	be interpreted as <code>y</code> options.  Example:. <pre>data: [0, 5, 3, 5]</pre>.  	</li>.  <li><p>An array of objects with named values. The objects are.  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<pie>.turboThreshold'>turboThreshold</a>, this option is not available.</p>. . <pre>data: [{.     y: 1,.     name: "Point2",.     color: "#00FF00". }, {.     y: 7,.     name: "Point1",.     color: "#FF00FF". }]</pre></li>.  </ol>
    * @param depth The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
    * @param description <p><i>Requires Accessibility module</i></p>. <p>A description of the series to add to the screen reader information about the series.</p>
    * @param enableMouseTracking Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
    * @param endAngle The end angle of the pie in degrees where 0 is top and 90 is right. Defaults to <code>startAngle</code> plus 360.
    * @param getExtremesFromAll Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
    * @param id An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    * @param ignoreHiddenPoint <p>Equivalent to <a href="#chart.ignoreHiddenSeries">chart.ignoreHiddenSeries</a>, this option tells whether the series shall be redrawn as if the hidden point were <code>null</code>.</p>. <p>The default value changed from <code>false</code> to <code>true</code> with Highcharts 3.0.</p>
    * @param index The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    * @param innerSize <p>The size of the inner diameter for the pie. A size greater than 0 renders a donut chart. Can be a percentage or pixel value. Percentages are relative to the pie size. Pixel values are given as integers.</p>. . <p>Note: in Highcharts < 4.1.2, the percentage was relative to the plot area, not the pie size.</p>
    * @param keys An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
    * @param legendIndex The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
    * @param linkedTo The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
    * @param minSize The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels in side the plot area, but only to this size.
    * @param name The name of the series as shown in the legend, tooltip etc.
    * @param point Properties for each single point
    * @param selected Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
    * @param shadow Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @param showInLegend Whether to display this particular series or series type in the legend. Since 2.1, pies are not shown in the legend by default.
    * @param size The diameter of the pie relative to the plot area. Can be a percentage or pixel value. Pixel values are given as integers. The default behaviour (as of 3.0) is to scale to the plot area and give room for data labels within the plot area. As a consequence, the size of the pie may vary when points are updated and data labels more around. In that case it is best to set a fixed value, for example <code>"75%"</code>.
    * @param slicedOffset If a point is sliced, moved out from the center, how many pixels should  it be moved?.
    * @param startAngle The start angle of the pie slices in degrees where 0 is top and 90 right. 
    * @param states A wrapper object for all the series options in specific states.
    * @param stickyTracking Sticky tracking of mouse events. When true, the <code>mouseOut</code> event.  on a series isn't triggered until the mouse moves over another series, or out.  of the plot area. When false, the <code>mouseOut</code> event on a series is.  triggered when the mouse leaves the area around the series' graph or markers..  This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the .  tooltip will be hidden when moving the mouse between series.
    * @param tooltip A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
    * @param `type` The type of series. Can be one of <code>area</code>, <code>areaspline</code>,.  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,.  <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    * @param visible Set the initial visibility of the series.
    * @param zIndex Define the visual z index of the series.
    * @param zoneAxis Defines the Axis on which the zones are applied.
    * @param zones <p>An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the color zones are styled with the <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code> option (<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">view live demo</a>).</p>
    */
  def apply(allowPointSelect: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean] = js.undefined, animationLimit: js.UndefOr[Double] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, center: js.UndefOr[js.Array[String | Double]] = js.undefined, className: js.UndefOr[String] = js.undefined, colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined, cursor: js.UndefOr[String] = js.undefined, data: js.UndefOr[js.Array[CleanJsObject[SeriesPieData] | Double]] = js.undefined, dataLabels: js.UndefOr[CleanJsObject[SeriesPieDataLabels]] = js.undefined, depth: js.UndefOr[Double] = js.undefined, description: js.UndefOr[String] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, endAngle: js.UndefOr[Double] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesPieEvents]] = js.undefined, getExtremesFromAll: js.UndefOr[Boolean] = js.undefined, id: js.UndefOr[String] = js.undefined, ignoreHiddenPoint: js.UndefOr[Boolean] = js.undefined, index: js.UndefOr[Double] = js.undefined, innerSize: js.UndefOr[String | Double] = js.undefined, keys: js.UndefOr[js.Array[String]] = js.undefined, legendIndex: js.UndefOr[Double] = js.undefined, linkedTo: js.UndefOr[String] = js.undefined, minSize: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, point: js.UndefOr[CleanJsObject[SeriesPiePoint]] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, size: js.UndefOr[String | Double] = js.undefined, slicedOffset: js.UndefOr[Double] = js.undefined, startAngle: js.UndefOr[Double] = js.undefined, states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, tooltip: js.UndefOr[CleanJsObject[SeriesPieTooltip]] = js.undefined, `type`: String = "pie", visible: js.UndefOr[Boolean] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, zoneAxis: js.UndefOr[String] = js.undefined, zones: js.UndefOr[js.Array[CleanJsObject[SeriesPieZones]]] = js.undefined): SeriesPie = {
    val allowPointSelectOuter: js.UndefOr[Boolean] = allowPointSelect
    val animationOuter: js.UndefOr[Boolean] = animation
    val animationLimitOuter: js.UndefOr[Double] = animationLimit
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val centerOuter: js.UndefOr[js.Array[String | Double]] = center
    val classNameOuter: js.UndefOr[String] = className
    val colorsOuter: js.UndefOr[js.Array[String | js.Object]] = colors
    val cursorOuter: js.UndefOr[String] = cursor
    val dataOuter: js.UndefOr[js.Array[CleanJsObject[SeriesPieData] | Double]] = data
    val dataLabelsOuter: js.UndefOr[CleanJsObject[SeriesPieDataLabels]] = dataLabels
    val depthOuter: js.UndefOr[Double] = depth
    val descriptionOuter: js.UndefOr[String] = description
    val enableMouseTrackingOuter: js.UndefOr[Boolean] = enableMouseTracking
    val endAngleOuter: js.UndefOr[Double] = endAngle
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesPieEvents]] = events
    val getExtremesFromAllOuter: js.UndefOr[Boolean] = getExtremesFromAll
    val idOuter: js.UndefOr[String] = id
    val ignoreHiddenPointOuter: js.UndefOr[Boolean] = ignoreHiddenPoint
    val indexOuter: js.UndefOr[Double] = index
    val innerSizeOuter: js.UndefOr[String | Double] = innerSize
    val keysOuter: js.UndefOr[js.Array[String]] = keys
    val legendIndexOuter: js.UndefOr[Double] = legendIndex
    val linkedToOuter: js.UndefOr[String] = linkedTo
    val minSizeOuter: js.UndefOr[Double] = minSize
    val nameOuter: js.UndefOr[String] = name
    val pointOuter: js.UndefOr[CleanJsObject[SeriesPiePoint]] = point
    val selectedOuter: js.UndefOr[Boolean] = selected
    val shadowOuter: js.UndefOr[Boolean | js.Object] = shadow
    val showInLegendOuter: js.UndefOr[Boolean] = showInLegend
    val sizeOuter: js.UndefOr[String | Double] = size
    val slicedOffsetOuter: js.UndefOr[Double] = slicedOffset
    val startAngleOuter: js.UndefOr[Double] = startAngle
    val statesOuter: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = states
    val stickyTrackingOuter: js.UndefOr[Boolean] = stickyTracking
    val tooltipOuter: js.UndefOr[CleanJsObject[SeriesPieTooltip]] = tooltip
    val typeOuter: String = `type`
    val visibleOuter: js.UndefOr[Boolean] = visible
    val zIndexOuter: js.UndefOr[Double] = zIndex
    val zoneAxisOuter: js.UndefOr[String] = zoneAxis
    val zonesOuter: js.UndefOr[js.Array[CleanJsObject[SeriesPieZones]]] = zones
    new SeriesPie {
      override val allowPointSelect: js.UndefOr[Boolean] = allowPointSelectOuter
      override val animation: js.UndefOr[Boolean] = animationOuter
      override val animationLimit: js.UndefOr[Double] = animationLimitOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val center: js.UndefOr[js.Array[String | Double]] = centerOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val colors: js.UndefOr[js.Array[String | js.Object]] = colorsOuter
      override val cursor: js.UndefOr[String] = cursorOuter
      override val data: js.UndefOr[js.Array[CleanJsObject[SeriesPieData] | Double]] = dataOuter
      override val dataLabels: js.UndefOr[CleanJsObject[SeriesPieDataLabels]] = dataLabelsOuter
      override val depth: js.UndefOr[Double] = depthOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val enableMouseTracking: js.UndefOr[Boolean] = enableMouseTrackingOuter
      override val endAngle: js.UndefOr[Double] = endAngleOuter
      override val events: js.UndefOr[CleanJsObject[SeriesPieEvents]] = eventsOuter
      override val getExtremesFromAll: js.UndefOr[Boolean] = getExtremesFromAllOuter
      override val id: js.UndefOr[String] = idOuter
      override val ignoreHiddenPoint: js.UndefOr[Boolean] = ignoreHiddenPointOuter
      override val index: js.UndefOr[Double] = indexOuter
      override val innerSize: js.UndefOr[String | Double] = innerSizeOuter
      override val keys: js.UndefOr[js.Array[String]] = keysOuter
      override val legendIndex: js.UndefOr[Double] = legendIndexOuter
      override val linkedTo: js.UndefOr[String] = linkedToOuter
      override val minSize: js.UndefOr[Double] = minSizeOuter
      override val name: js.UndefOr[String] = nameOuter
      override val point: js.UndefOr[CleanJsObject[SeriesPiePoint]] = pointOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val shadow: js.UndefOr[Boolean | js.Object] = shadowOuter
      override val showInLegend: js.UndefOr[Boolean] = showInLegendOuter
      override val size: js.UndefOr[String | Double] = sizeOuter
      override val slicedOffset: js.UndefOr[Double] = slicedOffsetOuter
      override val startAngle: js.UndefOr[Double] = startAngleOuter
      override val states: js.UndefOr[CleanJsObject[PlotOptionsSeriesStates]] = statesOuter
      override val stickyTracking: js.UndefOr[Boolean] = stickyTrackingOuter
      override val tooltip: js.UndefOr[CleanJsObject[SeriesPieTooltip]] = tooltipOuter
      override val `type`: String = typeOuter
      override val visible: js.UndefOr[Boolean] = visibleOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
      override val zoneAxis: js.UndefOr[String] = zoneAxisOuter
      override val zones: js.UndefOr[js.Array[CleanJsObject[SeriesPieZones]]] = zonesOuter
    }
  }
}
