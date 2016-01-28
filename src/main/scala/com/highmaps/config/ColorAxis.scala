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
  * @note JavaScript name: <code>colorAxis</code>
  */
@js.annotation.ScalaJSDefined
class ColorAxis extends js.Object {

  /**
    * Determines how to set each data class' color if no individual color is set. The default value, <code>tween</code>, computes intermediate colors between <code>minColor</code> and <code>maxColor</code>. The other possible value, <code>category</code>, pulls colors from the global or chart specific <a href="#colors">colors</a> array.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/coloraxis/dataclasscolor/" target="_blank">Category colors</a>
    */
  val dataClassColor: js.UndefOr[String] = js.undefined

  /**
    * An array of data classes or ranges for the choropleth map. If none given, the color axis is scalar and values are distributed as a gradient between the minimum and maximum colors.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/data-class-ranges/" target="_blank">Multiple ranges</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/data-class-two-ranges/" target="_blank">two ranges</a>.
    */
  val dataClasses: js.UndefOr[js.Array[CleanJsObject[ColorAxisDataClasses]]] = js.undefined

  /**
    * Whether to force the axis to end on a tick. Use this option with the <a href="#colorAxis.maxPadding">maxPadding</a> option to control the axis end.
    */
  val endOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * Event handlers for the axis.
    */
  val events: js.UndefOr[CleanJsObject[ColorAxisEvents]] = js.undefined

  /**
    * Color of the grid lines extending from the axis across the gradient. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/coloraxis/gridlines/" target="_blank">Grid lines demonstrated</a>
    */
  val gridLineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The dash or dot style of the grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    */
  val gridLineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * The width of the grid lines extending from the axis across the gradient of a scalar color axis.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/coloraxis/gridlines/" target="_blank">Grid lines demonstrated</a>
    */
  val gridLineWidth: js.UndefOr[Double] = js.undefined

  /**
    * An id for the axis. This can be used after render time to get a pointer to the axis object through <code>chart.get()</code>.
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * <p>The axis labels show the number for each tick.</p>
    * <p>For more live examples on label options, see <a href="/highcharts#xAxis.labels">xAxis.labels in the Highcharts API.</p>
    */
  val labels: js.UndefOr[CleanJsObject[ColorAxisLabels]] = js.undefined

  /**
    * The color of the line marking the axis itself.
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The width of the line marking the axis itself.
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The triangular marker on a scalar color axis that points to the value of the hovered area. To disable the marker, set <code>marker: null</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/coloraxis/marker/" target="_blank">Black marker</a>
    */
  val marker: js.UndefOr[CleanJsObject[ColorAxisMarker]] = js.undefined

  /**
    * The maximum value of the axis in terms of map point values. If <code>null</code>, the max value is automatically calculated. If the <code>endOnTick</code> option is true, the max value might be rounded up.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/coloraxis/gridlines/" target="_blank">Explicit min and max to reduce the effect of outliers</a>
    */
  val max: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color to represent the maximum of the color axis. Unless <a href="#colorAxis.dataClasses">dataClasses</a> or <a href="#colorAxis.stops">stops</a> are set, the gradient ends at this value.</p>
    * 
    * <p>If dataClasses are set, the color is based on minColor and maxColor unless a color is set for each data class, or the <a href="#colorAxis.dataClassColor">dataClassColor</a> is set.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/coloraxis/mincolor-maxcolor/" target="_blank">Min and max colors on scalar (gradient) axis</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/coloraxis/mincolor-maxcolor-dataclasses/" target="_blank">on data classes</a>.
    */
  val maxColor: js.Any = js.undefined

  /**
    * Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
    */
  val maxPadding: js.UndefOr[Double] = js.undefined

  /**
    * The minimum value of the axis in terms of map point values. If <code>null</code>, the min value is automatically calculated. If the <code>startOnTick</code> option is true, the min value might be rounded down.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/coloraxis/gridlines/" target="_blank">Explicit min and max to reduce the effect of outliers</a>
    */
  val min: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color to represent the minimum of the color axis. Unless <a href="#colorAxis.dataClasses">dataClasses</a> or <a href="#colorAxis.stops">stops</a> are set, the gradient starts at this value.</p>
    * 
    * <p>If dataClasses are set, the color is based on minColor and maxColor unless a color is set for each data class, or the <a href="#colorAxis.dataClassColor">dataClassColor</a> is set.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/coloraxis/mincolor-maxcolor/" target="_blank">Min and max colors on scalar (gradient) axis</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/coloraxis/mincolor-maxcolor-dataclasses/" target="_blank">on data classes</a>.
    */
  val minColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
    */
  val minPadding: js.UndefOr[Double] = js.undefined

  /**
    * Color of the minor, secondary grid lines.
    */
  val minorGridLineColor: js.UndefOr[String | js.Object] = js.undefined

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
    * Whether to reverse the axis so that the highest number is closest to the origin. Defaults to <code>false</code> in a horizontal legend and <code>true</code> in a vertical legend, where the smallest value starts on top.
    */
  val reversed: js.UndefOr[Boolean] = js.undefined

  /**
    * If labels are enabled, whether to show the first tick label.
    */
  val showFirstLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * If labels are enabled, whether to show the last tick label.
    */
  val showLastLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to force the axis to start on a tick. Use this option with the <code>maxPadding</code> option to control the axis start. 
    */
  val startOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * Color stops for the gradient of a scalar color axis. Use this in cases where a linear gradient between a <code>minColor</code> and <code>maxColor</code> is not sufficient. The stops is an array of tuples, where the first item is a float between 0 and 1 assigning the relative position in the gradient, and the second item is the color. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/heatmap/" target="_blank">Heatmap with three color stops</a>
    */
  val stops: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined

  /**
    * Color for the main tick marks.
    */
  val tickColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The interval of the tick marks in axis units. When <code>null</code>, the tick interval is computed to approximately follow the <code>tickPixelInterval</code>.
    */
  val tickInterval: js.UndefOr[Double] = js.undefined

  /**
    * The pixel length of the main tick marks.
    */
  val tickLength: js.UndefOr[Double] = js.undefined

  /**
    * If <a href="#colorAxis.tickInterval">tickInterval</a> is <code>null</code> this option sets the approximate pixel interval of the tick marks.
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
    * The type of interpolation to use for the color axis. Can be <code>linear</code> or <code>logarithmic</code>.
    */
  val `type`: js.UndefOr[String] = js.undefined
}
