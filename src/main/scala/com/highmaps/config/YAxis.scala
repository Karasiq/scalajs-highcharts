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
  * @note JavaScript name: <code>yAxis</code>
  */
@js.annotation.ScalaJSDefined
class YAxis extends js.Object {

  /**
    * Whether to allow decimals in this axis' ticks. Ticks are hidden by default on a Highmaps axis, though they are inherited from Highcharts and can be enabled.
    */
  val allowDecimals: js.UndefOr[Boolean] = js.undefined

  /**
    * When using an alternate grid color, a band is painted across the plot area between every other grid line.
    */
  val alternateGridColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * A class name that opens for styling the axis by CSS, especially in Highcharts <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>. The class name is applied to group elements for the grid, axis elements and labels.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/axis/" target="_blank">Multiple axes with separate styling</a>.

    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * <p>Configure a crosshair that follows either the mouse pointer or the hovered point.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the crosshairs are styled in the <code>.highcharts-crosshair</code>, <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-both/" target="_blank">Crosshair on both axes</a>
    * @since 4.1
    */
  val crosshair: js.UndefOr[Boolean | CleanJsObject[YAxisCrosshair]] = js.undefined

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
    */
  val endOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * Event handlers for the axis.
    */
  val events: js.UndefOr[CleanJsObject[YAxisEvents]] = js.undefined

  /**
    * Color of the grid lines extending the ticks across the plot area. Highmaps grid lines are hidden by default and can be enabled by setting the gridLineWidth option.
    */
  val gridLineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The dash or dot style of the grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    */
  val gridLineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * The width of the grid lines extending the ticks across the plot area.
    */
  val gridLineWidth: js.UndefOr[Double] = js.undefined

  /**
    * An id for the axis. This can be used after render time to get a pointer to the axis object through <code>chart.get()</code>.
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * <p>The axis labels show the number or category for each tick. X and Y axis labels are by default disabled in Highmaps, but the functionality is inherited from Highcharts and used on colorAxis, and can be enabled on X and Y axes too.</p>
    * <p>For more live examples on label options, see <a href="/highcharts#yAxis.labels">yAxis.labels in the Highcharts API.</p>
    */
  val labels: js.UndefOr[CleanJsObject[YAxisLabels]] = js.undefined

  /**
    * The color of the line marking the axis itself.
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the line marking the axis itself.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is given in the <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The maximum value of the axis. If <code>null</code>, the max value is automatically calculated. If the <code>endOnTick</code> option is true, the <code>max</code> value might be rounded up.</p>
    * 
    * <p>If a <a href="#yAxis.tickAmount">tickAmount</a> is set, the axis may be extended beyond the set max in order to reach the given number of ticks. The same may happen in a chart with multiple axes, determined by  <a class="internal" href="#chart">chart.alignTicks</a>, where a <code>tickAmount</code> is applied internally.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/axis/min-max/" target="_blank">Pre-zoomed to a specific area</a>
    */
  val max: js.UndefOr[Double] = js.undefined

  /**
    * Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the map shapes to touch the plot border. When the axis' <code>max</code> option is set or a max extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/chart/plotbackgroundcolor-gradient/" target="_blank">Add some padding</a>
    */
  val maxPadding: js.UndefOr[Double] = js.undefined

  /**
    * The minimum value of the axis in terms of the coordinates of the map shape paths. If <code>null</code> the min value is automatically calculated. If the <code>startOnTick</code> option is true, the <code>min</code> value might be rounded down.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/axis/min-max/" target="_blank">Pre-zoomed to a specific area</a>
    */
  val min: js.UndefOr[Double] = js.undefined

  /**
    * Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the map shapes to touch the plot border. When the axis' <code>min</code> option is set or a min extreme is set using <code>axis.setExtremes()</code>, the minPadding will be ignored.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/chart/plotbackgroundcolor-gradient/" target="_blank">Add some padding</a>
    */
  val minPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval than this, in terms of shape path coordinates. Defaults to 5 times the size of the smallest area.</p>
    * 
    * <p>Note that the <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and <code>endOnTick</code> settings also affect how the extremes of the axis are computed.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/axis/minrange/" target="_blank">Minimum range of 1000</a>
    */
  val minRange: js.UndefOr[Double] = js.undefined

  /**
    * The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. In Highmaps, ticks are hidden by default.
    */
  val minTickInterval: js.UndefOr[Double] = js.undefined

  /**
    * Color of the minor, secondary grid lines.
    */
  val minorGridLineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The dash or dot style of the minor grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    */
  val minorGridLineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * Width of the minor, secondary grid lines.
    */
  val minorGridLineWidth: js.UndefOr[Double] = js.undefined

  /**
    * Color for the minor tick marks.
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
    */
  val minorTickInterval: js.UndefOr[String | Double] = js.undefined

  /**
    * The pixel length of the minor tick marks.
    */
  val minorTickLength: js.UndefOr[Double] = js.undefined

  /**
    * The position of the minor tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    */
  val minorTickPosition: js.UndefOr[String] = js.undefined

  /**
    * The pixel width of the minor tick mark.
    */
  val minorTickWidth: js.UndefOr[Double] = js.undefined

  /**
    * The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line, labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same side of the plot. With multiple axes the offset is dynamically adjusted to avoid collision, this can be overridden by setting offset explicitly.
    */
  val offset: js.UndefOr[Double] = js.undefined

  /**
    * Whether to display the axis on the opposite side of the normal. The normal is on the left side for vertical axes and bottom for horizontal, so the opposite sides will be right and top respectively.
    */
  val opposite: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to reverse the axis so that the highest number is closest to the origin. 
    */
  val reversed: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to show the axis line and title when the axis has no data. By default Highmaps X and Y axis don't have visible line and title regardless.
    */
  val showEmpty: js.UndefOr[Boolean] = js.undefined

  /**
    * If labels are enabled, whether to show the first tick label.
    */
  val showFirstLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * If labels are enabled, whether to show the last tick label.
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
    * Whether to force the axis to start on a tick. Use this option with the <code>minPadding</code> option to control the axis start.
    */
  val startOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * Color for the main tick marks.
    */
  val tickColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The interval of the tick marks in axis units. When <code>null</code>, the tick interval
    *  is computed to approximately follow the <a href="#xAxis.tickPixelInterval">tickPixelInterval</a>.</p>
    */
  val tickInterval: js.UndefOr[Double] = js.undefined

  /**
    * The pixel length of the main tick marks.
    */
  val tickLength: js.UndefOr[Double] = js.undefined

  /**
    * <p>If tickInterval is <code>null</code> this option sets the approximate pixel interval of the tick marks.</p>
    * 
    * <p>The tick interval is also influenced by the <a href="#xAxis.minTickInterval">minTickInterval</a> option, that, by default prevents ticks from being denser than the data points.</p>
    * 
    * <p>Defaults to <code>72</code>  for the Y axis and <code>100</code> for the X axis.</p>
    */
  val tickPixelInterval: js.UndefOr[Double] = js.undefined

  /**
    * The position of the major tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    */
  val tickPosition: js.UndefOr[String] = js.undefined

  /**
    * A callback function returning array defining where the ticks are laid out on the axis. This overrides the default behaviour of <code>tickPixelInterval</code> and <code>tickInterval</code>.
    */
  val tickPositioner: js.UndefOr[js.Function] = js.undefined

  /**
    * An array defining where the ticks are laid out on the axis. This overrides the default behaviour of <code>tickPixelInterval</code> and <code>tickInterval</code>.
    */
  val tickPositions: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * <p>The pixel width of the major tick marks.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is given in the <code>.highcharts-tick</code> class.</p>
    */
  val tickWidth: js.UndefOr[Double] = js.undefined

  /**
    * The axis title. In Highmaps, the axis is hidden by default, but adding an axis title is still possible. X axis and Y axis titles will appear at the bottom and left by default.
    */
  val title: js.UndefOr[CleanJsObject[YAxisTitle]] = js.undefined
}

object YAxis {
  /**
    * @param allowDecimals Whether to allow decimals in this axis' ticks. Ticks are hidden by default on a Highmaps axis, though they are inherited from Highcharts and can be enabled.
    * @param alternateGridColor When using an alternate grid color, a band is painted across the plot area between every other grid line.
    * @param className A class name that opens for styling the axis by CSS, especially in Highcharts <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>. The class name is applied to group elements for the grid, axis elements and labels.
    * @param crosshair <p>Configure a crosshair that follows either the mouse pointer or the hovered point.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the crosshairs are styled in the <code>.highcharts-crosshair</code>, <code>.highcharts-crosshair-thin</code> or <code>.highcharts-xaxis-category</code> classes.</p>
    * @param description <p><i>Requires Accessibility module</i></p>. . <p>Description of the axis to screen reader users.</p>
    * @param endOnTick Whether to force the axis to end on a tick. Use this option with the <code>maxPadding</code> option to control the axis end. 
    * @param events Event handlers for the axis.
    * @param gridLineColor Color of the grid lines extending the ticks across the plot area. Highmaps grid lines are hidden by default and can be enabled by setting the gridLineWidth option.
    * @param gridLineDashStyle The dash or dot style of the grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    * @param gridLineWidth The width of the grid lines extending the ticks across the plot area.
    * @param id An id for the axis. This can be used after render time to get a pointer to the axis object through <code>chart.get()</code>.
    * @param labels <p>The axis labels show the number or category for each tick. X and Y axis labels are by default disabled in Highmaps, but the functionality is inherited from Highcharts and used on colorAxis, and can be enabled on X and Y axes too.</p>. <p>For more live examples on label options, see <a href="/highcharts#yAxis.labels">yAxis.labels in the Highcharts API.</p>
    * @param lineColor The color of the line marking the axis itself.
    * @param lineWidth <p>The width of the line marking the axis itself.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is given in the <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    * @param max <p>The maximum value of the axis. If <code>null</code>, the max value is automatically calculated. If the <code>endOnTick</code> option is true, the <code>max</code> value might be rounded up.</p>. . <p>If a <a href="#yAxis.tickAmount">tickAmount</a> is set, the axis may be extended beyond the set max in order to reach the given number of ticks. The same may happen in a chart with multiple axes, determined by  <a class="internal" href="#chart">chart.alignTicks</a>, where a <code>tickAmount</code> is applied internally.</p>
    * @param maxPadding Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the map shapes to touch the plot border. When the axis' <code>max</code> option is set or a max extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.
    * @param min The minimum value of the axis in terms of the coordinates of the map shape paths. If <code>null</code> the min value is automatically calculated. If the <code>startOnTick</code> option is true, the <code>min</code> value might be rounded down.
    * @param minPadding Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the map shapes to touch the plot border. When the axis' <code>min</code> option is set or a min extreme is set using <code>axis.setExtremes()</code>, the minPadding will be ignored.
    * @param minRange <p>The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval than this, in terms of shape path coordinates. Defaults to 5 times the size of the smallest area.</p>. . <p>Note that the <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and <code>endOnTick</code> settings also affect how the extremes of the axis are computed.</p>
    * @param minTickInterval The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. In Highmaps, ticks are hidden by default.
    * @param minorGridLineColor Color of the minor, secondary grid lines.
    * @param minorGridLineDashStyle The dash or dot style of the minor grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    * @param minorGridLineWidth Width of the minor, secondary grid lines.
    * @param minorTickColor Color for the minor tick marks.
    * @param minorTickInterval <p>Tick interval in scale units for the minor ticks. On a linear axis, if <code>"auto"</code>, .  the minor tick interval is calculated as a fifth of the tickInterval. If.  <code>null</code>, minor ticks are not shown.</p>.  <p>On logarithmic axes, the unit is the power of the value. For example, setting.  	the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting.  	the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, .  	10 and 100 etc. A minorTickInterval of "auto" on a log axis results in a best guess,.  	attempting to enter approximately 5 minor ticks between each major tick.</p>. . <p>If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems.</a>
    * @param minorTickLength The pixel length of the minor tick marks.
    * @param minorTickPosition The position of the minor tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    * @param minorTickWidth The pixel width of the minor tick mark.
    * @param offset The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line, labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same side of the plot. With multiple axes the offset is dynamically adjusted to avoid collision, this can be overridden by setting offset explicitly.
    * @param opposite Whether to display the axis on the opposite side of the normal. The normal is on the left side for vertical axes and bottom for horizontal, so the opposite sides will be right and top respectively.
    * @param reversed Whether to reverse the axis so that the highest number is closest to the origin. 
    * @param showEmpty Whether to show the axis line and title when the axis has no data. By default Highmaps X and Y axis don't have visible line and title regardless.
    * @param showFirstLabel If labels are enabled, whether to show the first tick label.
    * @param showLastLabel If labels are enabled, whether to show the last tick label.
    * @param softMax A soft maximum for the axis. If the series data maximum is greater than this, the axis will stay at this maximum, but if the series data maximum is higher, the axis will flex to show all data.
    * @param softMin A soft minimum for the axis. If the series data minimum is greater than this, the axis will stay at this minimum, but if the series data minimum is lower, the axis will flex to show all data.
    * @param startOnTick Whether to force the axis to start on a tick. Use this option with the <code>minPadding</code> option to control the axis start.
    * @param tickColor Color for the main tick marks.
    * @param tickInterval <p>The interval of the tick marks in axis units. When <code>null</code>, the tick interval.  is computed to approximately follow the <a href="#xAxis.tickPixelInterval">tickPixelInterval</a>.</p>
    * @param tickLength The pixel length of the main tick marks.
    * @param tickPixelInterval <p>If tickInterval is <code>null</code> this option sets the approximate pixel interval of the tick marks.</p>. . <p>The tick interval is also influenced by the <a href="#xAxis.minTickInterval">minTickInterval</a> option, that, by default prevents ticks from being denser than the data points.</p>. . <p>Defaults to <code>72</code>  for the Y axis and <code>100</code> for the X axis.</p>
    * @param tickPosition The position of the major tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    * @param tickPositioner A callback function returning array defining where the ticks are laid out on the axis. This overrides the default behaviour of <code>tickPixelInterval</code> and <code>tickInterval</code>.
    * @param tickPositions An array defining where the ticks are laid out on the axis. This overrides the default behaviour of <code>tickPixelInterval</code> and <code>tickInterval</code>.
    * @param tickWidth <p>The pixel width of the major tick marks.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is given in the <code>.highcharts-tick</code> class.</p>
    * @param title The axis title. In Highmaps, the axis is hidden by default, but adding an axis title is still possible. X axis and Y axis titles will appear at the bottom and left by default.
    */
  def apply(allowDecimals: js.UndefOr[Boolean] = js.undefined, alternateGridColor: js.UndefOr[String | js.Object] = js.undefined, className: js.UndefOr[String] = js.undefined, crosshair: js.UndefOr[Boolean | CleanJsObject[YAxisCrosshair]] = js.undefined, description: js.UndefOr[String] = js.undefined, endOnTick: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[CleanJsObject[YAxisEvents]] = js.undefined, gridLineColor: js.UndefOr[String | js.Object] = js.undefined, gridLineDashStyle: js.UndefOr[String] = js.undefined, gridLineWidth: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, labels: js.UndefOr[CleanJsObject[YAxisLabels]] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, max: js.UndefOr[Double] = js.undefined, maxPadding: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined, minPadding: js.UndefOr[Double] = js.undefined, minRange: js.UndefOr[Double] = js.undefined, minTickInterval: js.UndefOr[Double] = js.undefined, minorGridLineColor: js.UndefOr[String | js.Object] = js.undefined, minorGridLineDashStyle: js.UndefOr[String] = js.undefined, minorGridLineWidth: js.UndefOr[Double] = js.undefined, minorTickColor: js.UndefOr[String | js.Object] = js.undefined, minorTickInterval: js.UndefOr[String | Double] = js.undefined, minorTickLength: js.UndefOr[Double] = js.undefined, minorTickPosition: js.UndefOr[String] = js.undefined, minorTickWidth: js.UndefOr[Double] = js.undefined, offset: js.UndefOr[Double] = js.undefined, opposite: js.UndefOr[Boolean] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined, showEmpty: js.UndefOr[Boolean] = js.undefined, showFirstLabel: js.UndefOr[Boolean] = js.undefined, showLastLabel: js.UndefOr[Boolean] = js.undefined, softMax: js.UndefOr[Double] = js.undefined, softMin: js.UndefOr[Double] = js.undefined, startOnTick: js.UndefOr[Boolean] = js.undefined, tickColor: js.UndefOr[String | js.Object] = js.undefined, tickInterval: js.UndefOr[Double] = js.undefined, tickLength: js.UndefOr[Double] = js.undefined, tickPixelInterval: js.UndefOr[Double] = js.undefined, tickPosition: js.UndefOr[String] = js.undefined, tickPositioner: js.UndefOr[js.Function] = js.undefined, tickPositions: js.UndefOr[js.Array[Double]] = js.undefined, tickWidth: js.UndefOr[Double] = js.undefined, title: js.UndefOr[CleanJsObject[YAxisTitle]] = js.undefined): YAxis = {
    val allowDecimalsOuter: js.UndefOr[Boolean] = allowDecimals
    val alternateGridColorOuter: js.UndefOr[String | js.Object] = alternateGridColor
    val classNameOuter: js.UndefOr[String] = className
    val crosshairOuter: js.UndefOr[Boolean | CleanJsObject[YAxisCrosshair]] = crosshair
    val descriptionOuter: js.UndefOr[String] = description
    val endOnTickOuter: js.UndefOr[Boolean] = endOnTick
    val eventsOuter: js.UndefOr[CleanJsObject[YAxisEvents]] = events
    val gridLineColorOuter: js.UndefOr[String | js.Object] = gridLineColor
    val gridLineDashStyleOuter: js.UndefOr[String] = gridLineDashStyle
    val gridLineWidthOuter: js.UndefOr[Double] = gridLineWidth
    val idOuter: js.UndefOr[String] = id
    val labelsOuter: js.UndefOr[CleanJsObject[YAxisLabels]] = labels
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val maxOuter: js.UndefOr[Double] = max
    val maxPaddingOuter: js.UndefOr[Double] = maxPadding
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
    val reversedOuter: js.UndefOr[Boolean] = reversed
    val showEmptyOuter: js.UndefOr[Boolean] = showEmpty
    val showFirstLabelOuter: js.UndefOr[Boolean] = showFirstLabel
    val showLastLabelOuter: js.UndefOr[Boolean] = showLastLabel
    val softMaxOuter: js.UndefOr[Double] = softMax
    val softMinOuter: js.UndefOr[Double] = softMin
    val startOnTickOuter: js.UndefOr[Boolean] = startOnTick
    val tickColorOuter: js.UndefOr[String | js.Object] = tickColor
    val tickIntervalOuter: js.UndefOr[Double] = tickInterval
    val tickLengthOuter: js.UndefOr[Double] = tickLength
    val tickPixelIntervalOuter: js.UndefOr[Double] = tickPixelInterval
    val tickPositionOuter: js.UndefOr[String] = tickPosition
    val tickPositionerOuter: js.UndefOr[js.Function] = tickPositioner
    val tickPositionsOuter: js.UndefOr[js.Array[Double]] = tickPositions
    val tickWidthOuter: js.UndefOr[Double] = tickWidth
    val titleOuter: js.UndefOr[CleanJsObject[YAxisTitle]] = title
    new YAxis {
      override val allowDecimals: js.UndefOr[Boolean] = allowDecimalsOuter
      override val alternateGridColor: js.UndefOr[String | js.Object] = alternateGridColorOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val crosshair: js.UndefOr[Boolean | CleanJsObject[YAxisCrosshair]] = crosshairOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val endOnTick: js.UndefOr[Boolean] = endOnTickOuter
      override val events: js.UndefOr[CleanJsObject[YAxisEvents]] = eventsOuter
      override val gridLineColor: js.UndefOr[String | js.Object] = gridLineColorOuter
      override val gridLineDashStyle: js.UndefOr[String] = gridLineDashStyleOuter
      override val gridLineWidth: js.UndefOr[Double] = gridLineWidthOuter
      override val id: js.UndefOr[String] = idOuter
      override val labels: js.UndefOr[CleanJsObject[YAxisLabels]] = labelsOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val max: js.UndefOr[Double] = maxOuter
      override val maxPadding: js.UndefOr[Double] = maxPaddingOuter
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
      override val reversed: js.UndefOr[Boolean] = reversedOuter
      override val showEmpty: js.UndefOr[Boolean] = showEmptyOuter
      override val showFirstLabel: js.UndefOr[Boolean] = showFirstLabelOuter
      override val showLastLabel: js.UndefOr[Boolean] = showLastLabelOuter
      override val softMax: js.UndefOr[Double] = softMaxOuter
      override val softMin: js.UndefOr[Double] = softMinOuter
      override val startOnTick: js.UndefOr[Boolean] = startOnTickOuter
      override val tickColor: js.UndefOr[String | js.Object] = tickColorOuter
      override val tickInterval: js.UndefOr[Double] = tickIntervalOuter
      override val tickLength: js.UndefOr[Double] = tickLengthOuter
      override val tickPixelInterval: js.UndefOr[Double] = tickPixelIntervalOuter
      override val tickPosition: js.UndefOr[String] = tickPositionOuter
      override val tickPositioner: js.UndefOr[js.Function] = tickPositionerOuter
      override val tickPositions: js.UndefOr[js.Array[Double]] = tickPositionsOuter
      override val tickWidth: js.UndefOr[Double] = tickWidthOuter
      override val title: js.UndefOr[CleanJsObject[YAxisTitle]] = titleOuter
    }
  }
}
