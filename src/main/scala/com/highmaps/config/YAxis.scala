/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
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
  val alternateGridColor: js.UndefOr[String] = js.undefined

  /**
    * Configure a crosshair that follows either the mouse pointer or the hovered point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/crosshair-both/" target="_blank">Crosshair on both axes</a>
    * @since 4.1
    */
  val crosshair: js.UndefOr[Boolean | CleanJsObject[YAxisCrosshair]] = js.undefined

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
  val gridLineColor: js.UndefOr[String] = js.undefined

  /**
    * The dash or dot style of the grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
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
  val lineColor: js.UndefOr[String] = js.undefined

  /**
    * The width of the line marking the axis itself.
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The maximum value of the axis in terms of the coordinates of the map shape paths. If <code>null</code>, the max value is automatically calculated. If the <code>endOnTick</code> option is true, the <code>max</code> value might be rounded up.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/axis/min-max/" target="_blank">Pre-zoomed to a specific area</a>
    */
  val max: js.UndefOr[Double] = js.undefined

  /**
    * Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the map shapes to touch the plot border. When the axis' <code>max</code> option is set or a max extreme is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/plotbackgroundcolor-gradient/" target="_blank">Add some padding</a>
    */
  val maxPadding: js.UndefOr[Double] = js.undefined

  /**
    * The minimum value of the axis in terms of the coordinates of the map shape paths. If <code>null</code> the min value is automatically calculated. If the <code>startOnTick</code> option is true, the <code>min</code> value might be rounded down.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/axis/min-max/" target="_blank">Pre-zoomed to a specific area</a>
    */
  val min: js.UndefOr[Double] = js.undefined

  /**
    * Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the map shapes to touch the plot border. When the axis' <code>min</code> option is set or a min extreme is set using <code>axis.setExtremes()</code>, the minPadding will be ignored.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/plotbackgroundcolor-gradient/" target="_blank">Add some padding</a>
    */
  val minPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval than this, in terms of shape path coordinates. Defaults to 5 times the size of the smallest area.</p>
    * 
    * <p>Note that the <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and <code>endOnTick</code> settings also affect how the extremes of the axis are computed.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/axis/minrange/" target="_blank">Minimum range of 1000</a>
    */
  val minRange: js.UndefOr[Double] = js.undefined

  /**
    * The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. In Highmaps, ticks are hidden by default.
    */
  val minTickInterval: js.UndefOr[Double] = js.undefined

  /**
    * Color of the minor, secondary grid lines.
    */
  val minorGridLineColor: js.UndefOr[String] = js.undefined

  /**
    * The dash or dot style of the minor grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    */
  val minorGridLineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * Width of the minor, secondary grid lines.
    */
  val minorGridLineWidth: js.UndefOr[Double] = js.undefined

  /**
    * Color for the minor tick marks.
    */
  val minorTickColor: js.UndefOr[String] = js.undefined

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
    * The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line, labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same side of the plot.
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
    * Whether to force the axis to start on a tick. Use this option with the <code>minPadding</code> option to control the axis start.
    */
  val startOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * Color for the main tick marks.
    */
  val tickColor: js.UndefOr[String] = js.undefined

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
    * If tickInterval is <code>null</code> this option sets the approximate pixel interval of the
    *  tick marks. Defaults to <code>72</code> 
    *  for the Y axis and <code>100</code> for	the X axis.
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
    * The pixel width of the major tick marks.
    */
  val tickWidth: js.UndefOr[Double] = js.undefined

  /**
    * The axis title. In Highmaps, the axis is hidden by default, but adding an axis title is still possible. X axis and Y axis titles will appear at the bottom and left by default.
    */
  val title: js.UndefOr[CleanJsObject[YAxisTitle]] = js.undefined
}
