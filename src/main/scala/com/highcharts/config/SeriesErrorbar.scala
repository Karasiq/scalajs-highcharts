/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.3 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class SeriesErrorbar extends js.Object {
  
  /**
   * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-allowpointselect-line/" target="_blank">Line</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-allowpointselect-column/" target="_blank">column</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-allowpointselect-pie/" target="_blank">pie</a>
   * @since 1.2.0
   */
  val allowPointSelect: Boolean = false
  
  /**
   * The main color of the bars. This can be overridden by <a href="#plotOptions.errorbar.stemColor">stemColor</a> and <a href="#plotOptions.errorbar.whiskerColor">whiskerColor</a> individually. 
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/error-bar-styling/" target="_blank">Error bar styling</a>
   * @since 3.0
   */
  val color: String = "#000000"
  
  /**
   * When using automatic point colors pulled from the <code>options.colors</code>
   *  collection, this option determines whether the chart should receive 
   *  one color per series or one color per point.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/column-colorbypoint-false/" target="_blank">False by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/column-colorbypoint-true/" target="_blank">true</a>
   * @since 2.0
   */
  val colorByPoint: Boolean = false
  
  /**
   * A series specific or series type specific color set to apply instead of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.
   * @since 3.0
   */
  val colors: UndefOr[js.Array[String]] = js.undefined
  
  /**
   * You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
   * @example Pointer cursor <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-cursor-line/" target="_blank">on line graph</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-cursor-column/" target="_blank">on columns</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-cursor-scatter/" target="_blank">on scatter markers</a>
   */
  val cursor: UndefOr[String] = js.undefined
  
  /**
   * An array of data points for the series. For the <code>errorbar</code> series type, points can be given in the following ways:
   *  <ol>
   *  	<li><p>An array of arrays with 3 or 2 values. In this case, the values correspond to <code>x,low,high</code>. If the first value is a string, it is
   *  	applied as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted, in which case the inner arrays should be of length 2. Then the <code>x</code> value is automatically calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code> 
   *  	and <code>pointInterval</code> given in the series options.</p>
   * <pre>data: [
   *     [0, 10, 2], 
   *     [1, 1, 8], 
   *     [2, 4, 5]
   * ]</pre></li>
   * 
   * 
   * <li><p>An array of objects with named values. The objects are
   *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<errorbar>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
   * 
   * <pre>data: [{
   *     x: 1,
   *     low: 0,
   *     high: 0,
   *     name: "Point2",
   *     color: "#00FF00"
   * }, {
   *     x: 1,
   *     low: 5,
   *     high: 5,
   *     name: "Point1",
   *     color: "#FF00FF"
   * }]</pre></li>
   *  </ol>
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
   * Depth of the columns in a 3D column chart. Requires <code>highcharts-3d.js</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/3d/column/">Basic 3D column chart</a>
   * @since 4.0
   */
  val depth: Double = 25
  
  /**
   * 3D columns only. The color of the edges. Similar to <code>borderColor</code>, except it defaults to the same color as the column.
   */
  val edgeColor: String = ""
  
  /**
   * 3D columns only. The width of the colored edges.
   */
  val edgeWidth: Double = 1
  
  /**
   * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-enablemousetracking-false/" target="_blank">No mouse tracking</a>
   */
  val enableMouseTracking: Boolean = true
  
  val events: SeriesErrorbarEvents = new SeriesErrorbarEvents
  
  /**
   * Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
   * @since 4.1.6
   */
  val getExtremesFromAll: Boolean = false
  
  /**
   * The spacing between columns on the Z Axis in a 3D chart. Requires <code>highcharts-3d.js</code>.
   * @since 4.0
   */
  val groupZPadding: Double = 1
  
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
   * The width of the line surrounding the box. If any of <a href="#plotOptions.boxplot.stemWidth">stemWidth</a>, <a href="#plotOptions.boxplot.medianWidth">medianWidth</a> or <a href="#plotOptions.boxplot.whiskerWidth">whiskerWidth</a> are <code>null</code>, the lineWidth also applies to these lines.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/box-plot-styling/" target="_blank">Box plot styling</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/error-bar-styling/" target="_blank">error bar styling</a>
   * @since 3.0
   */
  val lineWidth: Double = 1
  
  /**
   * The parent series of the error bar. The default value links it to the previous series. Otherwise, use the id of the parent series.
   * @since 3.0
   */
  val linkedTo: String = ":previous"
  
  /**
   * The maximum allowed pixel width for a column, translated to the height of a bar in a bar chart. This prevents the columns from becoming too wide when there is a small number of points in the chart.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/column-maxpointwidth-20/" target="_blank">Limited to 50</a>
   * @since 4.1.8
   */
  val maxPointWidth: Double = null.asInstanceOf[Double]
  
  /**
   * The name of the series as shown in the legend, tooltip etc.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/name/" target="_blank">Series name</a>
   */
  val name: UndefOr[String] = js.undefined
  
  /**
   * The color for the parts of the graph or points that are below the <a href="#plotOptions.series.threshold">threshold</a>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-negative-color/" target="_blank">Spline, area and column</a> - <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/arearange-negativecolor/" target="_blank">arearange</a>.
   * @since 3.0
   */
  val negativeColor: String = null.asInstanceOf[String]
  
  /**
   * Properties for each single point
   */
  val point: SeriesErrorbarPoint = new SeriesErrorbarPoint
  
  /**
   * <p>If no x values are given for the points in a series, pointInterval defines
   *  the interval of the x values. For example, if a series contains one value
   *  every decade starting from year 0, set pointInterval to 10.</p>
   * <p>Since Highcharts 4.1, it can be combined with <code>pointIntervalUnit</code> to draw irregular intervals.</p>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointstart-datetime/" target="_blank">Datetime X axis</a>
   */
  val pointInterval: Double = 1
  
  /**
   * On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to the two irregular time units, <code>month</code> and <code>year</code>. Combine it with <code>pointInterval</code> to draw quarters, 6 months, 10 years etc.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointintervalunit/" target="_blank">One point a month</a>
   * @since 4.1.0
   */
  val pointIntervalUnit: UndefOr[String] = js.undefined
  
  /**
   * Padding between each column or bar, in x axis units.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/column-pointpadding-default/" target="_blank">0.1 by default</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/column-pointpadding-025/" target="_blank">0.25</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/column-pointpadding-none/" target="_blank">0 for tightly packed columns</a>,
   */
  val pointPadding: Double = 0.1
  
  /**
   * <p>Possible values: <code>null</code>, <code>"on"</code>, <code>"between"</code>.</p>
   * <p>In a column chart, when pointPlacement is <code>"on"</code>, the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is <code>"between"</code>, the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>
   * <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>
   * <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is computed, but for line-type series it needs to be set.</p>
   * <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointplacement-between/" target="_blank">Between in a column chart</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointplacement-numeric/" target="_blank">numeric placement for custom layout</a>.
   * @since 2.3.0
   */
  val pointPlacement: UndefOr[js.Any] = js.undefined
  
  /**
   * The X axis range that each point is valid for. This determines the width of the column. On a categorized axis, the range will be 1 by default (one category unit). On linear and datetime axes, the range will be computed as the distance between the two closest data points.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/column-pointrange/" target="_blank">Set the point range to one day on a data set with one week between the points</a>
   * @since 2.3
   */
  val pointRange: UndefOr[Double] = js.undefined
  
  /**
   * If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a series contains one yearly value starting from 1945, set pointStart to 1945.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointstart-linear/" target="_blank">Linear</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-pointstart-datetime/" target="_blank">datetime</a> X axis
   */
  val pointStart: Double = 0
  
  /**
   * A pixel value specifying a fixed width for each column or bar. When <code>null</code>, the width is calculated from the <code>pointPadding</code> and <code>groupPadding</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/column-pointwidth-20/" target="_blank">20px wide columns regardless of chart width
			or the amount of data points</a>
   * @since 1.2.5
   */
  val pointWidth: UndefOr[Double] = js.undefined
  
  /**
   * Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-selected/" target="_blank">One out of two series selected</a>
   * @since 1.2.0
   */
  val selected: Boolean = false
  
  /**
   * A wrapper object for all the series options in specific states.
   */
  val states: PlotOptionsSeriesStates = new PlotOptionsSeriesStates
  
  /**
   * The color of the stem, the vertical line extending from the box to the whiskers. If <code>null</code>, the series color is used.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/box-plot-styling/" target="_blank">Box plot styling</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/error-bar-styling/" target="_blank">error bar styling</a>
   * @since 3.0
   */
  val stemColor: String = null.asInstanceOf[String]
  
  /**
   * The dash style of the stem, the vertical line extending from the box to the whiskers.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/box-plot-styling/" target="_blank">Box plot styling</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/error-bar-styling/" target="_blank">error bar styling</a>
   * @since 3.0
   */
  val stemDashStyle: String = "Solid"
  
  /**
   * The width of the stem, the vertical line extending from the box to the whiskers. If <code>null</code>, the width is inherited from the <a href="#plotOptions.boxplot.lineWidth">lineWidth</a> option.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/box-plot-styling/" target="_blank">Box plot styling</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/error-bar-styling/" target="_blank">error bar styling</a>
   * @since 3.0
   */
  val stemWidth: Double = null.asInstanceOf[Double]
  
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
   * When a series contains a data array that is longer than this, only one dimensional arrays of numbers,
   *  or two dimensional arrays with x and y values are allowed. Also, only the first
   *  point is tested, and the rest are assumed to be the same format. This saves expensive
   *  data checking and indexing in long series. Set it to <code>0</code> disable.
   * @since 2.2
   */
  val turboThreshold: Double = 1000
  
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
   * The color of the whiskers, the horizontal lines marking low and high values. When <code>null</code>, the general series color is used.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/box-plot-styling/" target="_blank">Box plot styling</a>
   * @since 3.0
   */
  val whiskerColor: String = null.asInstanceOf[String]
  
  /**
   * The length of the whiskers, the horizontal lines marking low and high values. It can be a numerical pixel value, or a percentage value of the box width. Set <code>0</code> to disable whiskers.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/box-plot-styling/" target="_blank">True by default</a>
   * @since 3.0
   */
  val whiskerLength: js.Any = "50%"
  
  /**
   * The line width of the whiskers, the horizontal lines marking low and high values. When <code>null</code>, the general <a href="#plotOptions.errorbar.lineWidth">lineWidth</a> applies.
   * @example  <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/error-bar-styling/" target="_blank">Error bar styling</a>
   * @since 3.0
   */
  val whiskerWidth: Double = null.asInstanceOf[Double]
  
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
  val zones: js.Array[SeriesErrorbarZones] = new js.Array[SeriesErrorbarZones]
}
