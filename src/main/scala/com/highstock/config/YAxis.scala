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
  * @note JavaScript name: <code>yAxis</code>
  */
@js.annotation.ScalaJSDefined
class YAxis extends js.Object {

  /**
    * Whether to allow decimals in this axis' ticks. When counting integers, like persons or hits on a web page, decimals should be avoided in the labels.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/yaxis/allowdecimals-true/" target="_blank">True by default</a> (unwanted for this
			type of data), 
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/yaxis/allowdecimals-false/" target="_blank">false</a>
    * @since 2.0
    */
  val allowDecimals: js.UndefOr[Boolean] = js.undefined

  /**
    * When using an alternate grid color, a band is painted across the plot area between every other grid line.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/alternategridcolor/" target="_blank">Alternate grid color on the Y axis</a>
    */
  val alternateGridColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * An array defining breaks in the axis, the sections defined will be left out and all the points shifted closer to each other. Requires that the broken-axis.js module is loaded.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/demo/intraday-breaks/" target="_blank">Break on nights and weekends</a>; <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-visualized/" target="_blank">broken Y axis</a>
    * @since 2.1.0
    */
  val breaks: js.UndefOr[js.Array[CleanJsObject[YAxisBreaks]]] = js.undefined

  /**
    * The highest allowed value for automatically computed axis extremes.
    * @example  <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/yaxis/floor-ceiling/" target="_blank">Floor and ceiling</a>
    * @since 4.0
    */
  val ceiling: js.UndefOr[Double] = js.undefined

  /**
    * A class name that opens for styling the axis by CSS, especially in Highcharts <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>. The class name is applied to group elements for the grid, axis elements and labels.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/axis/" target="_blank">Multiple axes with separate styling</a>.

    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * <p>Configure a crosshair that follows either the mouse pointer or the hovered point. By default, the crosshair is enabled on the X axis and disabled on Y axis.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the crosshairs are styled in the <code>.highcharts-crosshair</code>, <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/crosshairs-xy/" target="_blank">Crosshair on both axes</a>
    * @since 2.1
    */
  val crosshair: js.UndefOr[Boolean | CleanJsObject[YAxisCrosshair]] = js.undefined

  /**
    * For a datetime axis, the scale will automatically adjust to the appropriate unit.  This member gives the default string representations used for each unit. For intermediate values, different units may be used, for example the <code>day</code> unit can be used on midnight and <code>hour</code> unit be used for intermediate values on the same axis. For an overview of the replacement codes, see <a href="#Highcharts.dateFormat">dateFormat</a>.
    * 
    * Defaults to:
    * <pre>{
    * 	millisecond: '%H:%M:%S.%L',
    * 	second: '%H:%M:%S',
    * 	minute: '%H:%M',
    * 	hour: '%H:%M',
    * 	day: '%e. %b',
    * 	week: '%e. %b',
    * 	month: '%b \'%y',
    * 	year: '%Y'
    * }</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/datetimelabelformats/" target="_blank">More information in x axis labels</a>
    */
  val dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined

  /**
    * <p><i>Requires Accessibility module</i></p>
    * 
    * <p>Description of the axis to screen reader users.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/accessibility/advanced-accessible/">Accessible complex chart</a>
    * @since 5.0.0
    */
  val description: js.UndefOr[String] = js.undefined

  /**
    * Whether to force the axis to end on a tick. Use this option with the <code>maxPadding</code> option to control the axis end.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/demo/basic-line/" target="_blank">True by default</a> and
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/endontick/" target="_blank">false</a> for Y axis
    */
  val endOnTick: js.UndefOr[Boolean] = js.undefined

  val events: js.UndefOr[CleanJsObject[YAxisEvents]] = js.undefined

  /**
    * The lowest allowed value for automatically computed axis extremes.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/demo/lazy-loading/" target="_blank">Prevent negative stock price on Y axis</a>
    * @since 4.0
    */
  val floor: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color of the grid lines extending the ticks across the plot area.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke is given in the <code>.highcharts-grid-line</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/gridlinecolor/" target="_blank">Green lines</a>.

<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/" target="_blank">Styled mode</a>.
    */
  val gridLineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The dash or dot style of the grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/gridlinedashstyle/" target="_blank">Long dashes</a>
    */
  val gridLineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * The width of the grid lines extending the ticks across the plot area.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/gridlinewidth/" target="_blank">2px lines</a>
    */
  val gridLineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The Z index of the grid lines.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/gridzindex/" target="_blank">A Z index of 4 renders the grid above the graph</a>
    * @since 1.1
    */
  val gridZIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>The height of the Y axis. If it's a number, it is interpreted as pixels.</p>
    * <p>Since Highstock 2: If it's a percentage string, it is interpreted as percentages of the total plot height.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/demo/candlestick-and-volume/" target="_blank">Percentage height panes</a>
    */
  val height: js.UndefOr[Double | String] = js.undefined

  /**
    * An id for the axis. This can be used after render time to get a pointer to the axis object through <code>chart.get()</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/id/" target="_blank">Get the object</a>
    */
  val id: js.UndefOr[String] = js.undefined

  val labels: js.UndefOr[CleanJsObject[YAxisLabels]] = js.undefined

  /**
    * <p>The color of the line marking the axis itself.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the line stroke is given in the <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/linecolor/" target="_blank">A red line on X axis</a>.

<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/axis/" target="_blank">Axes in styled mode</a>.
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The width of the line marking the axis itself.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/linewidth/" target="_blank">A 2px line on X axis</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * Index of another axis that this axis is linked to. When an axis is linked to a master axis, it will take the same extremes as the master, but as assigned by min or max or by setExtremes. It can be used to show additional info, or to ease reading the chart by duplicating the scales.
    */
  val linkedTo: js.UndefOr[Double] = js.undefined

  /**
    * <p>The maximum value of the axis. If <code>null</code>, the max value is automatically calculated. If the <code>endOnTick</code> option is true, the <code>max</code> value might be rounded up.</p>
    * 
    * <p>If a <a href="#yAxis.tickAmount">tickAmount</a> is set, the axis may be extended beyond the set max in order to reach the given number of ticks. The same may happen in a chart with multiple axes, determined by  <a class="internal" href="#chart">chart.alignTicks</a>, where a <code>tickAmount</code> is applied internally.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/min-max/" target="_blank">Fixed min and max</a>
    */
  val max: js.UndefOr[Double] = js.undefined

  /**
    * Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the highest data value to appear on the edge of the plot area. When the axis' <code>max</code> option is set or a max extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/minpadding-maxpadding/" target="_blank">Greater min- and maxPadding</a>
    */
  val maxPadding: js.UndefOr[Double] = js.undefined

  /**
    * Deprecated. Use <code>minRange</code> instead.
    */
  val maxZoom: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimum value of the axis. If <code>null</code> the min value is automatically calculated.</p>
    * 
    * <p>If the <code>startOnTick</code> option is true (default), the <code>min</code> value might be rounded down.</p>
    * 
    * <p>The automatically calculated minimum value is also affected by <a href="#yAxis.floor">floor</a>, <a href="#yAxis.softMin">softMin</a>, <a href="#yAxis.minPadding">minPadding</a>, <a href="#yAxis.minRange">minRange</a> as well as <a href="#plotOptions.series.threshold">series.threshold</a> and <a href="#plotOptions.series.softThreshold">series.softThreshold</a>.</p>
    * @example Y axis min of <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/yaxis/min-startontick-false/" target="_blank">-50 with startOnTick to false</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/yaxis/min-startontick-true/" target="_blank">-50 with startOnTick true by default</a>
    */
  val min: js.UndefOr[Double] = js.undefined

  /**
    * Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area. When the axis' <code>min</code> option is set or a min extreme is set using <code>axis.setExtremes()</code>, the minPadding will be ignored.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/minpadding-maxpadding/" target="_blank">Greater min- and maxPadding</a>
    */
  val minPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval than this. For example, for a datetime axis the main unit is milliseconds. If minRange is set to 3600000, you can't zoom in more than to one hour.</p> 
    * 
    * <p>The default minRange for the x axis is five times the smallest interval between any of the data points.</p> 
    * 
    * <p>On a logarithmic axis, the unit for the minimum range is the power. So a minRange of 	1 means that the axis can be zoomed to 10-100, 100-1000, 1000-10000 etc.</p>
    * 
    * <p>Note that the <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and <code>endOnTick</code> settings also affect how the extremes of the axis are computed.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/minrange/" target="_blank">Max zoom of 6 months overrides user selections</a>
    */
  val minRange: js.UndefOr[Double] = js.undefined

  /**
    * The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. Defaults to the closest distance between two points on the axis.
    * @since 1.2.0
    */
  val minTickInterval: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color of the minor, secondary grid lines.</p>
    * 
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is given in the <code>.highcharts-minor-grid-line</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/minorgridlinecolor/" target="_blank">Bright grey lines from Y axis</a>.

<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/" target="_blank">Styled mode</a>.
    */
  val minorGridLineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The dash or dot style of the minor grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/minorgridlinedashstyle/" target="_blank">Long dashes on minor grid lines</a>
    */
  val minorGridLineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Width of the minor, secondary grid lines.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is given in the <code>.highcharts-grid-line</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/minorgridlinewidth/" target="_blank">2px lines from Y axis </a>.

<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/" target="_blank">Styled mode</a>.
    */
  val minorGridLineWidth: js.UndefOr[Double] = js.undefined

  /**
    * Color for the minor tick marks.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/" target="_blank">Black tick marks on Y axis</a>
    */
  val minorTickColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Tick interval in scale units for the minor ticks. On a linear axis, if <code>"auto"</code>, 
    *  the minor tick interval is calculated as a fifth of the tickInterval. If
    *  <code>null</code>, minor ticks are not shown.</p>
    *  <p>On logarithmic axes, the unit is the power of the value. For example, setting
    *  	the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting
    *  	the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, 
    *  	10 and 100 etc. A minorTickInterval of "auto" on a log axis results in a best guess,
    *  	attempting to enter approximately 5 minor ticks between each major tick.</p>
    * 
    * <p>If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems.</a>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/demo/basic-line/" target="_blank">Null by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/minortickinterval-auto/" target="_blank">"auto"</a>
    */
  val minorTickInterval: js.UndefOr[String | Double] = js.undefined

  /**
    * The pixel length of the minor tick marks.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/" target="_blank">10px on Y axis</a>
    */
  val minorTickLength: js.UndefOr[Double] = js.undefined

  /**
    * The position of the minor tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/" target="_blank">Inside</a>
    */
  val minorTickPosition: js.UndefOr[String] = js.undefined

  /**
    * The pixel width of the minor tick mark.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/" target="_blank">1px width</a>
    */
  val minorTickWidth: js.UndefOr[Double] = js.undefined

  /**
    * The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line, labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same side of the plot. With multiple axes the offset is dynamically adjusted to avoid collision, this can be overridden by setting offset explicitly.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/offset/" target="_blank">Y axis offset by 70 px</a>
    */
  val offset: js.UndefOr[Double] = js.undefined

  /**
    * Whether to display the axis on the opposite side of the normal. The normal is on the left side for vertical axes and bottom for horizontal, so the opposite sides will be right and top respectively. In Highstock 1.x, the Y axis was placed on the left side by default.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/opposite/" target="_blank">Y axis on left side</a>
    */
  val opposite: js.UndefOr[Boolean] = js.undefined

  /**
    * In an ordinal axis, the points are equally spaced in the chart regardless of the actual time or x distance between them. This means that missing data for nights or weekends will not take  up space in the chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/ordinal-true/" target="_blank">True by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/ordinal-false/" target="_blank">false</a>
    * @since 1.1
    */
  val ordinal: js.UndefOr[Boolean] = js.undefined

  /**
    * An array of objects defining plot bands on the Y axis.
    */
  val plotBands: js.UndefOr[js.Array[CleanJsObject[YAxisPlotBands]]] = js.undefined

  /**
    * <p>An array of lines stretching across the plot area, marking a specific value on one of the axes.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the plot lines are styled by the <code>.highcharts-plot-line</code> class in addition to the <code>className</code> option.</p>
    */
  val plotLines: js.UndefOr[js.Array[CleanJsObject[YAxisPlotLines]]] = js.undefined

  /**
    * The zoomed range to display when only defining one or none of <code>min</code> or <code>max</code>.  For example, to show the latest month, a range of one month can be set.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/range/" target="_blank">Setting a zoomed range when the rangeSelector 
				is disabled</a>
    */
  val range: js.UndefOr[Double] = js.undefined

  /**
    * Whether to reverse the axis so that the highest number is closest to the origin.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/reversed/" target="_blank">Reversed Y axis</a>
    */
  val reversed: js.UndefOr[Boolean] = js.undefined

  /**
    * If <code>true</code>, the first series in a stack will be drawn on top in a positive, non-reversed Y axis. If <code>false</code>, the first series is in the base of the stack.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/yaxis/reversedstacks-false/" target="_blank">Non-reversed stacks</a>.
    * @since 1.3.10
    */
  val reversedStacks: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>An optional scrollbar to display on the Y axis in response to limiting the minimum an maximum of the axis values.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, all the presentational options for the scrollbar are replaced by the classes <code>.highcharts-scrollbar-thumb</code>, <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>, <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/yaxis/scrollbar/" target="_blank">Scrollbar on the Y axis</a>
    * @since 4.2.6
    */
  val scrollbar: js.UndefOr[CleanJsObject[YAxisScrollbar]] = js.undefined

  /**
    * Whether to show the axis line and title when the axis has no data.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/yaxis/showempty/" target="_blank">When clicking the legend to hide series, one axis preserves line and title, the other doesn't</a>
    * @since 1.1
    */
  val showEmpty: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to show the first tick label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/showfirstlabel/" target="_blank">Labels below plot lines on Y axis</a>
    */
  val showFirstLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to show the last tick label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/showfirstlabel/" target="_blank">Labels below plot lines on Y axis</a>
    */
  val showLastLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * A soft maximum for the axis. If the series data maximum is greater than this, the axis will stay at this maximum, but if the series data maximum is higher, the axis will flex to show all data.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/" target="_blank">Soft min and max</a>
    * @since 5.0.1
    */
  val softMax: js.UndefOr[Double] = js.undefined

  /**
    * A soft minimum for the axis. If the series data minimum is greater than this, the axis will stay at this minimum, but if the series data minimum is lower, the axis will flex to show all data.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/" target="_blank">Soft min and max</a>
    * @since 5.0.1
    */
  val softMin: js.UndefOr[Double] = js.undefined

  /**
    * For datetime axes, this decides where to put the tick between weeks. 0 = Sunday, 1 = Monday.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/startofweek-1" target="_blank">Monday by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/startofweek-0" target="_blank">Sunday</a>
    */
  val startOfWeek: js.UndefOr[Double] = js.undefined

  /**
    * Whether to force the axis to start on a tick. Use this option with the <code>maxPadding</code> option to control the axis start.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/endontick/" target="_blank">False for Y axis</a>
    */
  val startOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The amount of ticks to draw on the axis. This opens up for aligning the ticks of multiple charts or panes within a chart. This option overrides the <code>tickPixelInterval</code> option.</p>
    * <p>This option only has an effect on linear axes. Datetime, logarithmic or category axes are not affected.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/yaxis/tickamount/" target="_blank">8 ticks on Y axis</a>
    * @since 2.1.0
    */
  val tickAmount: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color for the main tick marks.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke is given in the <code>.highcharts-tick</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/" target="_blank">Formatted ticks on X axis</a>.

<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/" target="_blank">Styled mode</a>.
    */
  val tickColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The interval of the tick marks in axis units. When <code>null</code>, the tick interval is computed to approximately follow the tickPixelInterval on linear and datetime axes. On categorized axes, a <code>null</code> tickInterval will default to 1, one category.  Note that datetime axes are based on milliseconds, so for  example an interval of one day is expressed as <code>24 * 3600 * 1000</code>.</p>
    * <p>If the tickInterval is too dense for labels to be drawn, Highcharts may remove ticks.</p>
    * 
    * <p>If the chart has multiple axes, the <a href="#chart.alignTicks">alignTicks</a> option may interfere with the <code>tickInterval</code> setting.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/tickinterval/" target="_blank">Tick interval of 0.01 on Y axis</a>
    */
  val tickInterval: js.Any = js.undefined

  /**
    * The pixel length of the main tick marks.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/" target="_blank">Formatted ticks on X axis</a>
    */
  val tickLength: js.UndefOr[Double] = js.undefined

  /**
    * <p>If tickInterval is <code>null</code> this option sets the approximate pixel interval of the tick marks.</p>
    * 
    * <p>The tick interval is also influenced by the <a href="#xAxis.minTickInterval">minTickInterval</a> option, that, by default prevents ticks from being denser than the data points.</p>
    * 
    * <p>Defaults to <code>72</code>  for the Y axis and <code>100</code> for the X axis.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/tickpixelinterval/" target="_blank">200 px on X axis</a>
    */
  val tickPixelInterval: js.UndefOr[Double] = js.undefined

  /**
    * The position of the major tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/" target="_blank">Formatted ticks on X axis</a>
    */
  val tickPosition: js.UndefOr[String] = js.undefined

  /**
    * A callback function to compute on what values the ticks should be placed. Returns an array of numbers. The <code>min</code> and <code>max</code> of the axis are passed in as the first and second parameter. Options like <code>tickInterval</code> can be accessed by  <code>this.options.tickInterval</code>. The automatic tick positions are accessible through <code>this.tickPositions</code> and can be modified by the callback.Note that in stock charts, the last label is hidden by  default by the <code>showLastLabel</code> option.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/" target="_blank">Demo of tickPositions and tickPositioner</a>
    * @since 1.1
    */
  val tickPositioner: js.UndefOr[js.Function] = js.undefined

  /**
    * A collection of hard coded tick value positions. This overrides the auto computed positions based on tickInterval and tickPixelInterval. See also <code>tickPositioner</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/" target="_blank">Demo of tickPositions and tickPositioner</a>
    * @since 1.1
    */
  val tickPositions: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * The pixel width of the major tick marks.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/" target="_blank">Formatted ticks on X axis</a>
    */
  val tickWidth: js.UndefOr[Double] = js.undefined

  val title: js.UndefOr[CleanJsObject[YAxisTitle]] = js.undefined

  /**
    * <p>The top position of the Y axis. If it's a number, it is interpreted as pixel position relative to the chart.</p>
    * <p>Since Highstock 2: If it's a percentage string, it is interpreted as percentages of the plot height, offset from plot area top.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/demo/candlestick-and-volume/" target="_blank">Percentage height panes</a>
    */
  val top: js.UndefOr[Double | String] = js.undefined

  /**
    * Datetime axis only. An array determining what time intervals the ticks are allowed to fall on. Each array item is an array where the first value is the time unit and the  second value another array of allowed multiples. Defaults to:
    * <pre>units: [[
    * 	'millisecond', // unit name
    * 	[1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples
    * ], [
    * 	'second',
    * 	[1, 2, 5, 10, 15, 30]
    * ], [
    * 	'minute',
    * 	[1, 2, 5, 10, 15, 30]
    * ], [
    * 	'hour',
    * 	[1, 2, 3, 4, 6, 8, 12]
    * ], [
    * 	'day',
    * 	[1]
    * ], [
    * 	'week',
    * 	[1]
    * ], [
    * 	'month',
    * 	[1, 3, 6]
    * ], [
    * 	'year',
    * 	null
    * ]]</pre>
    */
  val units: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * Whether axis, including axis title, line, ticks and labels, should be visible.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/visible/">Toggle axis visibility</a>.
    * @since 2.1.9
    */
  val visible: js.UndefOr[Boolean] = js.undefined
}

object YAxis {
  /**
    * @param allowDecimals Whether to allow decimals in this axis' ticks. When counting integers, like persons or hits on a web page, decimals should be avoided in the labels.
    * @param alternateGridColor When using an alternate grid color, a band is painted across the plot area between every other grid line.
    * @param breaks An array defining breaks in the axis, the sections defined will be left out and all the points shifted closer to each other. Requires that the broken-axis.js module is loaded.
    * @param ceiling The highest allowed value for automatically computed axis extremes.
    * @param className A class name that opens for styling the axis by CSS, especially in Highcharts <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>. The class name is applied to group elements for the grid, axis elements and labels.
    * @param crosshair <p>Configure a crosshair that follows either the mouse pointer or the hovered point. By default, the crosshair is enabled on the X axis and disabled on Y axis.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the crosshairs are styled in the <code>.highcharts-crosshair</code>, <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.</p>
    * @param dateTimeLabelFormats For a datetime axis, the scale will automatically adjust to the appropriate unit.  This member gives the default string representations used for each unit. For intermediate values, different units may be used, for example the <code>day</code> unit can be used on midnight and <code>hour</code> unit be used for intermediate values on the same axis. For an overview of the replacement codes, see <a href="#Highcharts.dateFormat">dateFormat</a>.. . Defaults to:. <pre>{. 	millisecond: '%H:%M:%S.%L',. 	second: '%H:%M:%S',. 	minute: '%H:%M',. 	hour: '%H:%M',. 	day: '%e. %b',. 	week: '%e. %b',. 	month: '%b \'%y',. 	year: '%Y'. }</pre>
    * @param description <p><i>Requires Accessibility module</i></p>. . <p>Description of the axis to screen reader users.</p>
    * @param endOnTick Whether to force the axis to end on a tick. Use this option with the <code>maxPadding</code> option to control the axis end.
    * @param floor The lowest allowed value for automatically computed axis extremes.
    * @param gridLineColor <p>Color of the grid lines extending the ticks across the plot area.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke is given in the <code>.highcharts-grid-line</code> class.</p>
    * @param gridLineDashStyle The dash or dot style of the grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    * @param gridLineWidth The width of the grid lines extending the ticks across the plot area.
    * @param gridZIndex The Z index of the grid lines.
    * @param height <p>The height of the Y axis. If it's a number, it is interpreted as pixels.</p>. <p>Since Highstock 2: If it's a percentage string, it is interpreted as percentages of the total plot height.</p>
    * @param id An id for the axis. This can be used after render time to get a pointer to the axis object through <code>chart.get()</code>.
    * @param lineColor <p>The color of the line marking the axis itself.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the line stroke is given in the <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    * @param lineWidth The width of the line marking the axis itself.
    * @param linkedTo Index of another axis that this axis is linked to. When an axis is linked to a master axis, it will take the same extremes as the master, but as assigned by min or max or by setExtremes. It can be used to show additional info, or to ease reading the chart by duplicating the scales.
    * @param max <p>The maximum value of the axis. If <code>null</code>, the max value is automatically calculated. If the <code>endOnTick</code> option is true, the <code>max</code> value might be rounded up.</p>. . <p>If a <a href="#yAxis.tickAmount">tickAmount</a> is set, the axis may be extended beyond the set max in order to reach the given number of ticks. The same may happen in a chart with multiple axes, determined by  <a class="internal" href="#chart">chart.alignTicks</a>, where a <code>tickAmount</code> is applied internally.</p>
    * @param maxPadding Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the highest data value to appear on the edge of the plot area. When the axis' <code>max</code> option is set or a max extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.
    * @param maxZoom Deprecated. Use <code>minRange</code> instead.
    * @param min <p>The minimum value of the axis. If <code>null</code> the min value is automatically calculated.</p>. . <p>If the <code>startOnTick</code> option is true (default), the <code>min</code> value might be rounded down.</p>. . <p>The automatically calculated minimum value is also affected by <a href="#yAxis.floor">floor</a>, <a href="#yAxis.softMin">softMin</a>, <a href="#yAxis.minPadding">minPadding</a>, <a href="#yAxis.minRange">minRange</a> as well as <a href="#plotOptions.series.threshold">series.threshold</a> and <a href="#plotOptions.series.softThreshold">series.softThreshold</a>.</p>
    * @param minPadding Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area. When the axis' <code>min</code> option is set or a min extreme is set using <code>axis.setExtremes()</code>, the minPadding will be ignored.
    * @param minRange <p>The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval than this. For example, for a datetime axis the main unit is milliseconds. If minRange is set to 3600000, you can't zoom in more than to one hour.</p> . . <p>The default minRange for the x axis is five times the smallest interval between any of the data points.</p> . . <p>On a logarithmic axis, the unit for the minimum range is the power. So a minRange of 	1 means that the axis can be zoomed to 10-100, 100-1000, 1000-10000 etc.</p>. . <p>Note that the <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and <code>endOnTick</code> settings also affect how the extremes of the axis are computed.</p>
    * @param minTickInterval The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. Defaults to the closest distance between two points on the axis.
    * @param minorGridLineColor <p>Color of the minor, secondary grid lines.</p>. . . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is given in the <code>.highcharts-minor-grid-line</code> class.</p>
    * @param minorGridLineDashStyle The dash or dot style of the minor grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    * @param minorGridLineWidth <p>Width of the minor, secondary grid lines.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is given in the <code>.highcharts-grid-line</code> class.</p>
    * @param minorTickColor Color for the minor tick marks.
    * @param minorTickInterval <p>Tick interval in scale units for the minor ticks. On a linear axis, if <code>"auto"</code>, .  the minor tick interval is calculated as a fifth of the tickInterval. If.  <code>null</code>, minor ticks are not shown.</p>.  <p>On logarithmic axes, the unit is the power of the value. For example, setting.  	the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting.  	the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, .  	10 and 100 etc. A minorTickInterval of "auto" on a log axis results in a best guess,.  	attempting to enter approximately 5 minor ticks between each major tick.</p>. . <p>If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems.</a>
    * @param minorTickLength The pixel length of the minor tick marks.
    * @param minorTickPosition The position of the minor tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    * @param minorTickWidth The pixel width of the minor tick mark.
    * @param offset The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line, labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same side of the plot. With multiple axes the offset is dynamically adjusted to avoid collision, this can be overridden by setting offset explicitly.
    * @param opposite Whether to display the axis on the opposite side of the normal. The normal is on the left side for vertical axes and bottom for horizontal, so the opposite sides will be right and top respectively. In Highstock 1.x, the Y axis was placed on the left side by default.
    * @param ordinal In an ordinal axis, the points are equally spaced in the chart regardless of the actual time or x distance between them. This means that missing data for nights or weekends will not take  up space in the chart.
    * @param plotBands An array of objects defining plot bands on the Y axis.
    * @param plotLines <p>An array of lines stretching across the plot area, marking a specific value on one of the axes.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the plot lines are styled by the <code>.highcharts-plot-line</code> class in addition to the <code>className</code> option.</p>
    * @param range The zoomed range to display when only defining one or none of <code>min</code> or <code>max</code>.  For example, to show the latest month, a range of one month can be set.
    * @param reversed Whether to reverse the axis so that the highest number is closest to the origin.
    * @param reversedStacks If <code>true</code>, the first series in a stack will be drawn on top in a positive, non-reversed Y axis. If <code>false</code>, the first series is in the base of the stack.
    * @param scrollbar <p>An optional scrollbar to display on the Y axis in response to limiting the minimum an maximum of the axis values.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, all the presentational options for the scrollbar are replaced by the classes <code>.highcharts-scrollbar-thumb</code>, <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>, <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.</p>
    * @param showEmpty Whether to show the axis line and title when the axis has no data.
    * @param showFirstLabel Whether to show the first tick label.
    * @param showLastLabel Whether to show the last tick label.
    * @param softMax A soft maximum for the axis. If the series data maximum is greater than this, the axis will stay at this maximum, but if the series data maximum is higher, the axis will flex to show all data.
    * @param softMin A soft minimum for the axis. If the series data minimum is greater than this, the axis will stay at this minimum, but if the series data minimum is lower, the axis will flex to show all data.
    * @param startOfWeek For datetime axes, this decides where to put the tick between weeks. 0 = Sunday, 1 = Monday.
    * @param startOnTick Whether to force the axis to start on a tick. Use this option with the <code>maxPadding</code> option to control the axis start.
    * @param tickAmount <p>The amount of ticks to draw on the axis. This opens up for aligning the ticks of multiple charts or panes within a chart. This option overrides the <code>tickPixelInterval</code> option.</p>. <p>This option only has an effect on linear axes. Datetime, logarithmic or category axes are not affected.</p>
    * @param tickColor <p>Color for the main tick marks.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke is given in the <code>.highcharts-tick</code> class.</p>
    * @param tickInterval <p>The interval of the tick marks in axis units. When <code>null</code>, the tick interval is computed to approximately follow the tickPixelInterval on linear and datetime axes. On categorized axes, a <code>null</code> tickInterval will default to 1, one category.  Note that datetime axes are based on milliseconds, so for  example an interval of one day is expressed as <code>24 * 3600 * 1000</code>.</p>. <p>If the tickInterval is too dense for labels to be drawn, Highcharts may remove ticks.</p>. . <p>If the chart has multiple axes, the <a href="#chart.alignTicks">alignTicks</a> option may interfere with the <code>tickInterval</code> setting.</p>
    * @param tickLength The pixel length of the main tick marks.
    * @param tickPixelInterval <p>If tickInterval is <code>null</code> this option sets the approximate pixel interval of the tick marks.</p>. . <p>The tick interval is also influenced by the <a href="#xAxis.minTickInterval">minTickInterval</a> option, that, by default prevents ticks from being denser than the data points.</p>. . <p>Defaults to <code>72</code>  for the Y axis and <code>100</code> for the X axis.</p>
    * @param tickPosition The position of the major tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    * @param tickPositioner A callback function to compute on what values the ticks should be placed. Returns an array of numbers. The <code>min</code> and <code>max</code> of the axis are passed in as the first and second parameter. Options like <code>tickInterval</code> can be accessed by  <code>this.options.tickInterval</code>. The automatic tick positions are accessible through <code>this.tickPositions</code> and can be modified by the callback.Note that in stock charts, the last label is hidden by  default by the <code>showLastLabel</code> option.
    * @param tickPositions A collection of hard coded tick value positions. This overrides the auto computed positions based on tickInterval and tickPixelInterval. See also <code>tickPositioner</code>.
    * @param tickWidth The pixel width of the major tick marks.
    * @param top <p>The top position of the Y axis. If it's a number, it is interpreted as pixel position relative to the chart.</p>. <p>Since Highstock 2: If it's a percentage string, it is interpreted as percentages of the plot height, offset from plot area top.</p>
    * @param units Datetime axis only. An array determining what time intervals the ticks are allowed to fall on. Each array item is an array where the first value is the time unit and the  second value another array of allowed multiples. Defaults to:. <pre>units: [[. 	'millisecond', // unit name. 	[1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples. ], [. 	'second',. 	[1, 2, 5, 10, 15, 30]. ], [. 	'minute',. 	[1, 2, 5, 10, 15, 30]. ], [. 	'hour',. 	[1, 2, 3, 4, 6, 8, 12]. ], [. 	'day',. 	[1]. ], [. 	'week',. 	[1]. ], [. 	'month',. 	[1, 3, 6]. ], [. 	'year',. 	null. ]]</pre>
    * @param visible Whether axis, including axis title, line, ticks and labels, should be visible.
    */
  def apply(allowDecimals: js.UndefOr[Boolean] = js.undefined, alternateGridColor: js.UndefOr[String | js.Object] = js.undefined, breaks: js.UndefOr[js.Array[CleanJsObject[YAxisBreaks]]] = js.undefined, ceiling: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, crosshair: js.UndefOr[Boolean | CleanJsObject[YAxisCrosshair]] = js.undefined, dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined, description: js.UndefOr[String] = js.undefined, endOnTick: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[CleanJsObject[YAxisEvents]] = js.undefined, floor: js.UndefOr[Double] = js.undefined, gridLineColor: js.UndefOr[String | js.Object] = js.undefined, gridLineDashStyle: js.UndefOr[String] = js.undefined, gridLineWidth: js.UndefOr[Double] = js.undefined, gridZIndex: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double | String] = js.undefined, id: js.UndefOr[String] = js.undefined, labels: js.UndefOr[CleanJsObject[YAxisLabels]] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, linkedTo: js.UndefOr[Double] = js.undefined, max: js.UndefOr[Double] = js.undefined, maxPadding: js.UndefOr[Double] = js.undefined, maxZoom: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined, minPadding: js.UndefOr[Double] = js.undefined, minRange: js.UndefOr[Double] = js.undefined, minTickInterval: js.UndefOr[Double] = js.undefined, minorGridLineColor: js.UndefOr[String | js.Object] = js.undefined, minorGridLineDashStyle: js.UndefOr[String] = js.undefined, minorGridLineWidth: js.UndefOr[Double] = js.undefined, minorTickColor: js.UndefOr[String | js.Object] = js.undefined, minorTickInterval: js.UndefOr[String | Double] = js.undefined, minorTickLength: js.UndefOr[Double] = js.undefined, minorTickPosition: js.UndefOr[String] = js.undefined, minorTickWidth: js.UndefOr[Double] = js.undefined, offset: js.UndefOr[Double] = js.undefined, opposite: js.UndefOr[Boolean] = js.undefined, ordinal: js.UndefOr[Boolean] = js.undefined, plotBands: js.UndefOr[js.Array[CleanJsObject[YAxisPlotBands]]] = js.undefined, plotLines: js.UndefOr[js.Array[CleanJsObject[YAxisPlotLines]]] = js.undefined, range: js.UndefOr[Double] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined, reversedStacks: js.UndefOr[Boolean] = js.undefined, scrollbar: js.UndefOr[CleanJsObject[YAxisScrollbar]] = js.undefined, showEmpty: js.UndefOr[Boolean] = js.undefined, showFirstLabel: js.UndefOr[Boolean] = js.undefined, showLastLabel: js.UndefOr[Boolean] = js.undefined, softMax: js.UndefOr[Double] = js.undefined, softMin: js.UndefOr[Double] = js.undefined, startOfWeek: js.UndefOr[Double] = js.undefined, startOnTick: js.UndefOr[Boolean] = js.undefined, tickAmount: js.UndefOr[Double] = js.undefined, tickColor: js.UndefOr[String | js.Object] = js.undefined, tickInterval: js.UndefOr[js.Any] = js.undefined, tickLength: js.UndefOr[Double] = js.undefined, tickPixelInterval: js.UndefOr[Double] = js.undefined, tickPosition: js.UndefOr[String] = js.undefined, tickPositioner: js.UndefOr[js.Function] = js.undefined, tickPositions: js.UndefOr[js.Array[Double]] = js.undefined, tickWidth: js.UndefOr[Double] = js.undefined, title: js.UndefOr[CleanJsObject[YAxisTitle]] = js.undefined, top: js.UndefOr[Double | String] = js.undefined, units: js.UndefOr[js.Array[js.Any]] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined): YAxis = {
    val allowDecimalsOuter: js.UndefOr[Boolean] = allowDecimals
    val alternateGridColorOuter: js.UndefOr[String | js.Object] = alternateGridColor
    val breaksOuter: js.UndefOr[js.Array[CleanJsObject[YAxisBreaks]]] = breaks
    val ceilingOuter: js.UndefOr[Double] = ceiling
    val classNameOuter: js.UndefOr[String] = className
    val crosshairOuter: js.UndefOr[Boolean | CleanJsObject[YAxisCrosshair]] = crosshair
    val dateTimeLabelFormatsOuter: js.UndefOr[js.Object] = dateTimeLabelFormats
    val descriptionOuter: js.UndefOr[String] = description
    val endOnTickOuter: js.UndefOr[Boolean] = endOnTick
    val eventsOuter: js.UndefOr[CleanJsObject[YAxisEvents]] = events
    val floorOuter: js.UndefOr[Double] = floor
    val gridLineColorOuter: js.UndefOr[String | js.Object] = gridLineColor
    val gridLineDashStyleOuter: js.UndefOr[String] = gridLineDashStyle
    val gridLineWidthOuter: js.UndefOr[Double] = gridLineWidth
    val gridZIndexOuter: js.UndefOr[Double] = gridZIndex
    val heightOuter: js.UndefOr[Double | String] = height
    val idOuter: js.UndefOr[String] = id
    val labelsOuter: js.UndefOr[CleanJsObject[YAxisLabels]] = labels
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val linkedToOuter: js.UndefOr[Double] = linkedTo
    val maxOuter: js.UndefOr[Double] = max
    val maxPaddingOuter: js.UndefOr[Double] = maxPadding
    val maxZoomOuter: js.UndefOr[Double] = maxZoom
    val minOuter: js.UndefOr[Double] = min
    val minPaddingOuter: js.UndefOr[Double] = minPadding
    val minRangeOuter: js.UndefOr[Double] = minRange
    val minTickIntervalOuter: js.UndefOr[Double] = minTickInterval
    val minorGridLineColorOuter: js.UndefOr[String | js.Object] = minorGridLineColor
    val minorGridLineDashStyleOuter: js.UndefOr[String] = minorGridLineDashStyle
    val minorGridLineWidthOuter: js.UndefOr[Double] = minorGridLineWidth
    val minorTickColorOuter: js.UndefOr[String | js.Object] = minorTickColor
    val minorTickIntervalOuter: js.UndefOr[String | Double] = minorTickInterval
    val minorTickLengthOuter: js.UndefOr[Double] = minorTickLength
    val minorTickPositionOuter: js.UndefOr[String] = minorTickPosition
    val minorTickWidthOuter: js.UndefOr[Double] = minorTickWidth
    val offsetOuter: js.UndefOr[Double] = offset
    val oppositeOuter: js.UndefOr[Boolean] = opposite
    val ordinalOuter: js.UndefOr[Boolean] = ordinal
    val plotBandsOuter: js.UndefOr[js.Array[CleanJsObject[YAxisPlotBands]]] = plotBands
    val plotLinesOuter: js.UndefOr[js.Array[CleanJsObject[YAxisPlotLines]]] = plotLines
    val rangeOuter: js.UndefOr[Double] = range
    val reversedOuter: js.UndefOr[Boolean] = reversed
    val reversedStacksOuter: js.UndefOr[Boolean] = reversedStacks
    val scrollbarOuter: js.UndefOr[CleanJsObject[YAxisScrollbar]] = scrollbar
    val showEmptyOuter: js.UndefOr[Boolean] = showEmpty
    val showFirstLabelOuter: js.UndefOr[Boolean] = showFirstLabel
    val showLastLabelOuter: js.UndefOr[Boolean] = showLastLabel
    val softMaxOuter: js.UndefOr[Double] = softMax
    val softMinOuter: js.UndefOr[Double] = softMin
    val startOfWeekOuter: js.UndefOr[Double] = startOfWeek
    val startOnTickOuter: js.UndefOr[Boolean] = startOnTick
    val tickAmountOuter: js.UndefOr[Double] = tickAmount
    val tickColorOuter: js.UndefOr[String | js.Object] = tickColor
    val tickIntervalOuter: js.Any = tickInterval
    val tickLengthOuter: js.UndefOr[Double] = tickLength
    val tickPixelIntervalOuter: js.UndefOr[Double] = tickPixelInterval
    val tickPositionOuter: js.UndefOr[String] = tickPosition
    val tickPositionerOuter: js.UndefOr[js.Function] = tickPositioner
    val tickPositionsOuter: js.UndefOr[js.Array[Double]] = tickPositions
    val tickWidthOuter: js.UndefOr[Double] = tickWidth
    val titleOuter: js.UndefOr[CleanJsObject[YAxisTitle]] = title
    val topOuter: js.UndefOr[Double | String] = top
    val unitsOuter: js.UndefOr[js.Array[js.Any]] = units
    val visibleOuter: js.UndefOr[Boolean] = visible
    new YAxis {
      override val allowDecimals: js.UndefOr[Boolean] = allowDecimalsOuter
      override val alternateGridColor: js.UndefOr[String | js.Object] = alternateGridColorOuter
      override val breaks: js.UndefOr[js.Array[CleanJsObject[YAxisBreaks]]] = breaksOuter
      override val ceiling: js.UndefOr[Double] = ceilingOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val crosshair: js.UndefOr[Boolean | CleanJsObject[YAxisCrosshair]] = crosshairOuter
      override val dateTimeLabelFormats: js.UndefOr[js.Object] = dateTimeLabelFormatsOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val endOnTick: js.UndefOr[Boolean] = endOnTickOuter
      override val events: js.UndefOr[CleanJsObject[YAxisEvents]] = eventsOuter
      override val floor: js.UndefOr[Double] = floorOuter
      override val gridLineColor: js.UndefOr[String | js.Object] = gridLineColorOuter
      override val gridLineDashStyle: js.UndefOr[String] = gridLineDashStyleOuter
      override val gridLineWidth: js.UndefOr[Double] = gridLineWidthOuter
      override val gridZIndex: js.UndefOr[Double] = gridZIndexOuter
      override val height: js.UndefOr[Double | String] = heightOuter
      override val id: js.UndefOr[String] = idOuter
      override val labels: js.UndefOr[CleanJsObject[YAxisLabels]] = labelsOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val linkedTo: js.UndefOr[Double] = linkedToOuter
      override val max: js.UndefOr[Double] = maxOuter
      override val maxPadding: js.UndefOr[Double] = maxPaddingOuter
      override val maxZoom: js.UndefOr[Double] = maxZoomOuter
      override val min: js.UndefOr[Double] = minOuter
      override val minPadding: js.UndefOr[Double] = minPaddingOuter
      override val minRange: js.UndefOr[Double] = minRangeOuter
      override val minTickInterval: js.UndefOr[Double] = minTickIntervalOuter
      override val minorGridLineColor: js.UndefOr[String | js.Object] = minorGridLineColorOuter
      override val minorGridLineDashStyle: js.UndefOr[String] = minorGridLineDashStyleOuter
      override val minorGridLineWidth: js.UndefOr[Double] = minorGridLineWidthOuter
      override val minorTickColor: js.UndefOr[String | js.Object] = minorTickColorOuter
      override val minorTickInterval: js.UndefOr[String | Double] = minorTickIntervalOuter
      override val minorTickLength: js.UndefOr[Double] = minorTickLengthOuter
      override val minorTickPosition: js.UndefOr[String] = minorTickPositionOuter
      override val minorTickWidth: js.UndefOr[Double] = minorTickWidthOuter
      override val offset: js.UndefOr[Double] = offsetOuter
      override val opposite: js.UndefOr[Boolean] = oppositeOuter
      override val ordinal: js.UndefOr[Boolean] = ordinalOuter
      override val plotBands: js.UndefOr[js.Array[CleanJsObject[YAxisPlotBands]]] = plotBandsOuter
      override val plotLines: js.UndefOr[js.Array[CleanJsObject[YAxisPlotLines]]] = plotLinesOuter
      override val range: js.UndefOr[Double] = rangeOuter
      override val reversed: js.UndefOr[Boolean] = reversedOuter
      override val reversedStacks: js.UndefOr[Boolean] = reversedStacksOuter
      override val scrollbar: js.UndefOr[CleanJsObject[YAxisScrollbar]] = scrollbarOuter
      override val showEmpty: js.UndefOr[Boolean] = showEmptyOuter
      override val showFirstLabel: js.UndefOr[Boolean] = showFirstLabelOuter
      override val showLastLabel: js.UndefOr[Boolean] = showLastLabelOuter
      override val softMax: js.UndefOr[Double] = softMaxOuter
      override val softMin: js.UndefOr[Double] = softMinOuter
      override val startOfWeek: js.UndefOr[Double] = startOfWeekOuter
      override val startOnTick: js.UndefOr[Boolean] = startOnTickOuter
      override val tickAmount: js.UndefOr[Double] = tickAmountOuter
      override val tickColor: js.UndefOr[String | js.Object] = tickColorOuter
      override val tickInterval: js.Any = tickIntervalOuter
      override val tickLength: js.UndefOr[Double] = tickLengthOuter
      override val tickPixelInterval: js.UndefOr[Double] = tickPixelIntervalOuter
      override val tickPosition: js.UndefOr[String] = tickPositionOuter
      override val tickPositioner: js.UndefOr[js.Function] = tickPositionerOuter
      override val tickPositions: js.UndefOr[js.Array[Double]] = tickPositionsOuter
      override val tickWidth: js.UndefOr[Double] = tickWidthOuter
      override val title: js.UndefOr[CleanJsObject[YAxisTitle]] = titleOuter
      override val top: js.UndefOr[Double | String] = topOuter
      override val units: js.UndefOr[js.Array[js.Any]] = unitsOuter
      override val visible: js.UndefOr[Boolean] = visibleOuter
    }
  }
}
