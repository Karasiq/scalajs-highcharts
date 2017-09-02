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
    * A class name that opens for styling the axis by CSS, especially in Highcharts <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>. The class name is applied to group elements for the grid, axis elements and labels.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/" target="_blank">Multiple axes with separate styling</a>.

    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * Determines how to set each data class' color if no individual color is set. The default value, <code>tween</code>, computes intermediate colors between <code>minColor</code> and <code>maxColor</code>. The other possible value, <code>category</code>, pulls colors from the global or chart specific <a href="#colors">colors</a> array.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/dataclasscolor/" target="_blank">Category colors</a>
    */
  val dataClassColor: js.UndefOr[String] = js.undefined

  /**
    * An array of data classes or ranges for the choropleth map. If none given, the color axis is scalar and values are distributed as a gradient between the minimum and maximum colors.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/data-class-ranges/" target="_blank">Multiple ranges</a>, <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/data-class-two-ranges/" target="_blank">two ranges</a>.
    */
  val dataClasses: js.UndefOr[js.Array[CleanJsObject[ColorAxisDataClasses]]] = js.undefined

  /**
    * <p><i>Requires Accessibility module</i></p>
    * 
    * <p>Description of the axis to screen reader users.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/advanced-accessible/">Accessible complex chart</a>
    * @since 5.0.0
    */
  val description: js.UndefOr[String] = js.undefined

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
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/gridlines/" target="_blank">Grid lines demonstrated</a>
    */
  val gridLineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The dash or dot style of the grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    */
  val gridLineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * The width of the grid lines extending from the axis across the gradient of a scalar color axis.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/gridlines/" target="_blank">Grid lines demonstrated</a>
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
    * <p>The width of the line marking the axis itself.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is given in the <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The triangular marker on a scalar color axis that points to the value of the hovered area. To disable the marker, set <code>marker: null</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/marker/" target="_blank">Black marker</a>
    */
  val marker: js.UndefOr[CleanJsObject[ColorAxisMarker]] = js.undefined

  /**
    * The maximum value of the axis in terms of map point values. If <code>null</code>, the max value is automatically calculated. If the <code>endOnTick</code> option is true, the max value might be rounded up.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/gridlines/" target="_blank">Explicit min and max to reduce the effect of outliers</a>
    */
  val max: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color to represent the maximum of the color axis. Unless <a href="#colorAxis.dataClasses">dataClasses</a> or <a href="#colorAxis.stops">stops</a> are set, the gradient ends at this value.</p>
    * 
    * <p>If dataClasses are set, the color is based on minColor and maxColor unless a color is set for each data class, or the <a href="#colorAxis.dataClassColor">dataClassColor</a> is set.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/mincolor-maxcolor/" target="_blank">Min and max colors on scalar (gradient) axis</a>, <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/mincolor-maxcolor-dataclasses/" target="_blank">on data classes</a>.
    */
  val maxColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
    */
  val maxPadding: js.UndefOr[Double] = js.undefined

  /**
    * The minimum value of the axis in terms of map point values. If <code>null</code>, the min value is automatically calculated. If the <code>startOnTick</code> option is true, the min value might be rounded down.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/gridlines/" target="_blank">Explicit min and max to reduce the effect of outliers</a>
    */
  val min: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color to represent the minimum of the color axis. Unless <a href="#colorAxis.dataClasses">dataClasses</a> or <a href="#colorAxis.stops">stops</a> are set, the gradient starts at this value.</p>
    * 
    * <p>If dataClasses are set, the color is based on minColor and maxColor unless a color is set for each data class, or the <a href="#colorAxis.dataClassColor">dataClassColor</a> is set.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/mincolor-maxcolor/" target="_blank">Min and max colors on scalar (gradient) axis</a>, <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/mincolor-maxcolor-dataclasses/" target="_blank">on data classes</a>.
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
    * The dash or dot style of the minor grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
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
    * Whether to display the colorAxis in the legend.
    * @since 4.2.7
    */
  val showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * If labels are enabled, whether to show the last tick label.
    */
  val showLastLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * A soft minimum for the axis. If the series data minimum is greater than this, the axis will stay at this minimum, but if the series data minimum is lower, the axis will flex to show all data.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/" target="_blank">Soft min and max</a>
    * @since 5.0.1
    */
  val softMin: js.UndefOr[Double] = js.undefined

  /**
    * Whether to force the axis to start on a tick. Use this option with the <code>maxPadding</code> option to control the axis start. 
    */
  val startOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * Color stops for the gradient of a scalar color axis. Use this in cases where a linear gradient between a <code>minColor</code> and <code>maxColor</code> is not sufficient. The stops is an array of tuples, where the first item is a float between 0 and 1 assigning the relative position in the gradient, and the second item is the color. 
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/heatmap/" target="_blank">Heatmap with three color stops</a>
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
    * <p>The pixel width of the major tick marks.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is given in the <code>.highcharts-tick</code> class.</p>
    */
  val tickWidth: js.UndefOr[Double] = js.undefined

  /**
    * The type of interpolation to use for the color axis. Can be <code>linear</code> or <code>logarithmic</code>.
    */
  val `type`: js.UndefOr[String] = js.undefined
}

object ColorAxis {
  /**
    * @param className A class name that opens for styling the axis by CSS, especially in Highcharts <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>. The class name is applied to group elements for the grid, axis elements and labels.
    * @param dataClassColor Determines how to set each data class' color if no individual color is set. The default value, <code>tween</code>, computes intermediate colors between <code>minColor</code> and <code>maxColor</code>. The other possible value, <code>category</code>, pulls colors from the global or chart specific <a href="#colors">colors</a> array.
    * @param dataClasses An array of data classes or ranges for the choropleth map. If none given, the color axis is scalar and values are distributed as a gradient between the minimum and maximum colors.
    * @param description <p><i>Requires Accessibility module</i></p>. . <p>Description of the axis to screen reader users.</p>
    * @param endOnTick Whether to force the axis to end on a tick. Use this option with the <a href="#colorAxis.maxPadding">maxPadding</a> option to control the axis end.
    * @param events Event handlers for the axis.
    * @param gridLineColor Color of the grid lines extending from the axis across the gradient. 
    * @param gridLineDashStyle The dash or dot style of the grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    * @param gridLineWidth The width of the grid lines extending from the axis across the gradient of a scalar color axis.
    * @param id An id for the axis. This can be used after render time to get a pointer to the axis object through <code>chart.get()</code>.
    * @param labels <p>The axis labels show the number for each tick.</p>. <p>For more live examples on label options, see <a href="/highcharts#xAxis.labels">xAxis.labels in the Highcharts API.</p>
    * @param lineColor The color of the line marking the axis itself.
    * @param lineWidth <p>The width of the line marking the axis itself.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is given in the <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    * @param marker The triangular marker on a scalar color axis that points to the value of the hovered area. To disable the marker, set <code>marker: null</code>.
    * @param max The maximum value of the axis in terms of map point values. If <code>null</code>, the max value is automatically calculated. If the <code>endOnTick</code> option is true, the max value might be rounded up.
    * @param maxColor <p>The color to represent the maximum of the color axis. Unless <a href="#colorAxis.dataClasses">dataClasses</a> or <a href="#colorAxis.stops">stops</a> are set, the gradient ends at this value.</p>. . <p>If dataClasses are set, the color is based on minColor and maxColor unless a color is set for each data class, or the <a href="#colorAxis.dataClassColor">dataClassColor</a> is set.</p>
    * @param maxPadding Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
    * @param min The minimum value of the axis in terms of map point values. If <code>null</code>, the min value is automatically calculated. If the <code>startOnTick</code> option is true, the min value might be rounded down.
    * @param minColor <p>The color to represent the minimum of the color axis. Unless <a href="#colorAxis.dataClasses">dataClasses</a> or <a href="#colorAxis.stops">stops</a> are set, the gradient starts at this value.</p>. . <p>If dataClasses are set, the color is based on minColor and maxColor unless a color is set for each data class, or the <a href="#colorAxis.dataClassColor">dataClassColor</a> is set.</p>
    * @param minPadding Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
    * @param minorGridLineColor Color of the minor, secondary grid lines.
    * @param minorGridLineDashStyle The dash or dot style of the minor grid lines. For possible values, see <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.
    * @param minorGridLineWidth Width of the minor, secondary grid lines.
    * @param minorTickColor Color for the minor tick marks.
    * @param minorTickInterval <p>Tick interval in scale units for the minor ticks. On a linear axis, if <code>"auto"</code>, .  the minor tick interval is calculated as a fifth of the tickInterval. If.  <code>null</code>, minor ticks are not shown.</p>.  <p>On logarithmic axes, the unit is the power of the value. For example, setting.  	the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting.  	the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, .  	10 and 100 etc. A minorTickInterval of "auto" on a log axis results in a best guess,.  	attempting to enter approximately 5 minor ticks between each major tick.</p>. . <p>If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems.</a>
    * @param minorTickLength The pixel length of the minor tick marks.
    * @param minorTickPosition The position of the minor tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    * @param minorTickWidth The pixel width of the minor tick mark.
    * @param reversed Whether to reverse the axis so that the highest number is closest to the origin. Defaults to <code>false</code> in a horizontal legend and <code>true</code> in a vertical legend, where the smallest value starts on top.
    * @param showFirstLabel If labels are enabled, whether to show the first tick label.
    * @param showInLegend Whether to display the colorAxis in the legend.
    * @param showLastLabel If labels are enabled, whether to show the last tick label.
    * @param softMin A soft minimum for the axis. If the series data minimum is greater than this, the axis will stay at this minimum, but if the series data minimum is lower, the axis will flex to show all data.
    * @param startOnTick Whether to force the axis to start on a tick. Use this option with the <code>maxPadding</code> option to control the axis start. 
    * @param stops Color stops for the gradient of a scalar color axis. Use this in cases where a linear gradient between a <code>minColor</code> and <code>maxColor</code> is not sufficient. The stops is an array of tuples, where the first item is a float between 0 and 1 assigning the relative position in the gradient, and the second item is the color. 
    * @param tickColor Color for the main tick marks.
    * @param tickInterval The interval of the tick marks in axis units. When <code>null</code>, the tick interval is computed to approximately follow the <code>tickPixelInterval</code>.
    * @param tickLength The pixel length of the main tick marks.
    * @param tickPixelInterval If <a href="#colorAxis.tickInterval">tickInterval</a> is <code>null</code> this option sets the approximate pixel interval of the tick marks.
    * @param tickPosition The position of the major tick marks relative to the axis line. Can be one of <code>inside</code> and <code>outside</code>.
    * @param tickPositioner A callback function returning array defining where the ticks are laid out on the axis. This overrides the default behaviour of <code>tickPixelInterval</code> and <code>tickInterval</code>.
    * @param tickPositions An array defining where the ticks are laid out on the axis. This overrides the default behaviour of <code>tickPixelInterval</code> and <code>tickInterval</code>.
    * @param tickWidth <p>The pixel width of the major tick marks.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is given in the <code>.highcharts-tick</code> class.</p>
    * @param `type` The type of interpolation to use for the color axis. Can be <code>linear</code> or <code>logarithmic</code>.
    */
  def apply(className: js.UndefOr[String] = js.undefined, dataClassColor: js.UndefOr[String] = js.undefined, dataClasses: js.UndefOr[js.Array[CleanJsObject[ColorAxisDataClasses]]] = js.undefined, description: js.UndefOr[String] = js.undefined, endOnTick: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[CleanJsObject[ColorAxisEvents]] = js.undefined, gridLineColor: js.UndefOr[String | js.Object] = js.undefined, gridLineDashStyle: js.UndefOr[String] = js.undefined, gridLineWidth: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, labels: js.UndefOr[CleanJsObject[ColorAxisLabels]] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[CleanJsObject[ColorAxisMarker]] = js.undefined, max: js.UndefOr[Double] = js.undefined, maxColor: js.UndefOr[String | js.Object] = js.undefined, maxPadding: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined, minColor: js.UndefOr[String | js.Object] = js.undefined, minPadding: js.UndefOr[Double] = js.undefined, minorGridLineColor: js.UndefOr[String | js.Object] = js.undefined, minorGridLineDashStyle: js.UndefOr[String] = js.undefined, minorGridLineWidth: js.UndefOr[Double] = js.undefined, minorTickColor: js.UndefOr[String | js.Object] = js.undefined, minorTickInterval: js.UndefOr[String | Double] = js.undefined, minorTickLength: js.UndefOr[Double] = js.undefined, minorTickPosition: js.UndefOr[String] = js.undefined, minorTickWidth: js.UndefOr[Double] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined, showFirstLabel: js.UndefOr[Boolean] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, showLastLabel: js.UndefOr[Boolean] = js.undefined, softMin: js.UndefOr[Double] = js.undefined, startOnTick: js.UndefOr[Boolean] = js.undefined, stops: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined, tickColor: js.UndefOr[String | js.Object] = js.undefined, tickInterval: js.UndefOr[Double] = js.undefined, tickLength: js.UndefOr[Double] = js.undefined, tickPixelInterval: js.UndefOr[Double] = js.undefined, tickPosition: js.UndefOr[String] = js.undefined, tickPositioner: js.UndefOr[js.Function] = js.undefined, tickPositions: js.UndefOr[js.Array[Double]] = js.undefined, tickWidth: js.UndefOr[Double] = js.undefined, `type`: js.UndefOr[String] = js.undefined): ColorAxis = {
    val classNameOuter: js.UndefOr[String] = className
    val dataClassColorOuter: js.UndefOr[String] = dataClassColor
    val dataClassesOuter: js.UndefOr[js.Array[CleanJsObject[ColorAxisDataClasses]]] = dataClasses
    val descriptionOuter: js.UndefOr[String] = description
    val endOnTickOuter: js.UndefOr[Boolean] = endOnTick
    val eventsOuter: js.UndefOr[CleanJsObject[ColorAxisEvents]] = events
    val gridLineColorOuter: js.UndefOr[String | js.Object] = gridLineColor
    val gridLineDashStyleOuter: js.UndefOr[String] = gridLineDashStyle
    val gridLineWidthOuter: js.UndefOr[Double] = gridLineWidth
    val idOuter: js.UndefOr[String] = id
    val labelsOuter: js.UndefOr[CleanJsObject[ColorAxisLabels]] = labels
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val markerOuter: js.UndefOr[CleanJsObject[ColorAxisMarker]] = marker
    val maxOuter: js.UndefOr[Double] = max
    val maxColorOuter: js.UndefOr[String | js.Object] = maxColor
    val maxPaddingOuter: js.UndefOr[Double] = maxPadding
    val minOuter: js.UndefOr[Double] = min
    val minColorOuter: js.UndefOr[String | js.Object] = minColor
    val minPaddingOuter: js.UndefOr[Double] = minPadding
    val minorGridLineColorOuter: js.UndefOr[String | js.Object] = minorGridLineColor
    val minorGridLineDashStyleOuter: js.UndefOr[String] = minorGridLineDashStyle
    val minorGridLineWidthOuter: js.UndefOr[Double] = minorGridLineWidth
    val minorTickColorOuter: js.UndefOr[String | js.Object] = minorTickColor
    val minorTickIntervalOuter: js.UndefOr[String | Double] = minorTickInterval
    val minorTickLengthOuter: js.UndefOr[Double] = minorTickLength
    val minorTickPositionOuter: js.UndefOr[String] = minorTickPosition
    val minorTickWidthOuter: js.UndefOr[Double] = minorTickWidth
    val reversedOuter: js.UndefOr[Boolean] = reversed
    val showFirstLabelOuter: js.UndefOr[Boolean] = showFirstLabel
    val showInLegendOuter: js.UndefOr[Boolean] = showInLegend
    val showLastLabelOuter: js.UndefOr[Boolean] = showLastLabel
    val softMinOuter: js.UndefOr[Double] = softMin
    val startOnTickOuter: js.UndefOr[Boolean] = startOnTick
    val stopsOuter: js.UndefOr[js.Array[js.Array[js.Any]]] = stops
    val tickColorOuter: js.UndefOr[String | js.Object] = tickColor
    val tickIntervalOuter: js.UndefOr[Double] = tickInterval
    val tickLengthOuter: js.UndefOr[Double] = tickLength
    val tickPixelIntervalOuter: js.UndefOr[Double] = tickPixelInterval
    val tickPositionOuter: js.UndefOr[String] = tickPosition
    val tickPositionerOuter: js.UndefOr[js.Function] = tickPositioner
    val tickPositionsOuter: js.UndefOr[js.Array[Double]] = tickPositions
    val tickWidthOuter: js.UndefOr[Double] = tickWidth
    val typeOuter: js.UndefOr[String] = `type`
    new ColorAxis {
      override val className: js.UndefOr[String] = classNameOuter
      override val dataClassColor: js.UndefOr[String] = dataClassColorOuter
      override val dataClasses: js.UndefOr[js.Array[CleanJsObject[ColorAxisDataClasses]]] = dataClassesOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val endOnTick: js.UndefOr[Boolean] = endOnTickOuter
      override val events: js.UndefOr[CleanJsObject[ColorAxisEvents]] = eventsOuter
      override val gridLineColor: js.UndefOr[String | js.Object] = gridLineColorOuter
      override val gridLineDashStyle: js.UndefOr[String] = gridLineDashStyleOuter
      override val gridLineWidth: js.UndefOr[Double] = gridLineWidthOuter
      override val id: js.UndefOr[String] = idOuter
      override val labels: js.UndefOr[CleanJsObject[ColorAxisLabels]] = labelsOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val marker: js.UndefOr[CleanJsObject[ColorAxisMarker]] = markerOuter
      override val max: js.UndefOr[Double] = maxOuter
      override val maxColor: js.UndefOr[String | js.Object] = maxColorOuter
      override val maxPadding: js.UndefOr[Double] = maxPaddingOuter
      override val min: js.UndefOr[Double] = minOuter
      override val minColor: js.UndefOr[String | js.Object] = minColorOuter
      override val minPadding: js.UndefOr[Double] = minPaddingOuter
      override val minorGridLineColor: js.UndefOr[String | js.Object] = minorGridLineColorOuter
      override val minorGridLineDashStyle: js.UndefOr[String] = minorGridLineDashStyleOuter
      override val minorGridLineWidth: js.UndefOr[Double] = minorGridLineWidthOuter
      override val minorTickColor: js.UndefOr[String | js.Object] = minorTickColorOuter
      override val minorTickInterval: js.UndefOr[String | Double] = minorTickIntervalOuter
      override val minorTickLength: js.UndefOr[Double] = minorTickLengthOuter
      override val minorTickPosition: js.UndefOr[String] = minorTickPositionOuter
      override val minorTickWidth: js.UndefOr[Double] = minorTickWidthOuter
      override val reversed: js.UndefOr[Boolean] = reversedOuter
      override val showFirstLabel: js.UndefOr[Boolean] = showFirstLabelOuter
      override val showInLegend: js.UndefOr[Boolean] = showInLegendOuter
      override val showLastLabel: js.UndefOr[Boolean] = showLastLabelOuter
      override val softMin: js.UndefOr[Double] = softMinOuter
      override val startOnTick: js.UndefOr[Boolean] = startOnTickOuter
      override val stops: js.UndefOr[js.Array[js.Array[js.Any]]] = stopsOuter
      override val tickColor: js.UndefOr[String | js.Object] = tickColorOuter
      override val tickInterval: js.UndefOr[Double] = tickIntervalOuter
      override val tickLength: js.UndefOr[Double] = tickLengthOuter
      override val tickPixelInterval: js.UndefOr[Double] = tickPixelIntervalOuter
      override val tickPosition: js.UndefOr[String] = tickPositionOuter
      override val tickPositioner: js.UndefOr[js.Function] = tickPositionerOuter
      override val tickPositions: js.UndefOr[js.Array[Double]] = tickPositionsOuter
      override val tickWidth: js.UndefOr[Double] = tickWidthOuter
      override val `type`: js.UndefOr[String] = typeOuter
    }
  }
}
