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
class ColorAxis extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Padding of the min value relative to the length of the axis. A
    * padding of 0.05 will make a 100px axis 5px longer.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minpadding/">Min padding of 0.2</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minpadding-maxpadding/">Greater min- and maxPadding</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotbackgroundcolor-gradient/">Add some padding</a>
    * @since 1.2.0
    */
  val minPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Padding of the max value relative to the length of the axis. A
    * padding of 0.05 will make a 100px axis 5px longer.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/maxpadding/">Max padding of 0.25 on y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minpadding-maxpadding/">Greater min- and maxPadding</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotbackgroundcolor-gradient/">Add some padding</a>
    * @since 1.2.0
    */
  val maxPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The width of the grid lines extending from the axis across the
    * gradient of a scalar color axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/gridlines/">Grid lines demonstrated</a>
    */
  val gridLineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>If <a href="#colorAxis.tickInterval">tickInterval</a> is <code>null</code> this option
    * sets the approximate pixel interval of the tick marks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpixelinterval-50/">50 px on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/tickpixelinterval/">200 px on X axis</a>
    */
  val tickPixelInterval: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to force the axis to start on a tick. Use this option
    * with the <code>maxPadding</code> option to control the axis start.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-false/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-true/">True</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/endontick/">False for Y axis</a>
    * @since 1.2.0
    */
  val startOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to force the axis to end on a tick. Use this option with
    * the <a href="#colorAxis.maxPadding">maxPadding</a> option to control the
    * axis end.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/endontick/">False</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/basic-line/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/endontick/">False</a>
    * @since 1.2.0
    */
  val endOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The triangular marker on a scalar color axis that points to the
    * value of the hovered area. To disable the marker, set
    * <code>marker: null</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/marker/">Black marker</a>
    */
  val marker: js.UndefOr[CleanJsObject[ColorAxisMarker]] = js.undefined

  /**
    * <p>The axis labels show the number for each tick.</p>
    * <p>For more live examples on label options, see <a href="/highcharts#xAxis.labels">xAxis.labels in the
    * Highcharts API.</a></p>
    */
  val labels: js.UndefOr[CleanJsObject[ColorAxisLabels]] = js.undefined

  /**
    * <p>The color to represent the minimum of the color axis. Unless
    * <a href="#colorAxis.dataClasses">dataClasses</a> or
    * <a href="#colorAxis.stops">stops</a> are set, the gradient starts at this
    * value.</p>
    * <p>If dataClasses are set, the color is based on minColor and
    * maxColor unless a color is set for each data class, or the
    * <a href="#colorAxis.dataClassColor">dataClassColor</a> is set.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/mincolor-maxcolor/">Min and max colors on scalar (gradient) axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/mincolor-maxcolor-dataclasses/">On data classes</a>
    */
  val minColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color to represent the maximum of the color axis. Unless
    * <a href="#colorAxis.dataClasses">dataClasses</a> or
    * <a href="#colorAxis.stops">stops</a> are set, the gradient ends at this
    * value.</p>
    * <p>If dataClasses are set, the color is based on minColor and
    * maxColor unless a color is set for each data class, or the
    * <a href="#colorAxis.dataClassColor">dataClassColor</a> is set.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/mincolor-maxcolor/">Min and max colors on scalar (gradient) axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/mincolor-maxcolor-dataclasses/">On data classes</a>
    */
  val maxColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The pixel length of the main tick marks on the color axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/ticklength/">20 px tick length on the X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/">Formatted ticks on X axis</a>
    */
  val tickLength: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to display the colorAxis in the legend.</p>
    * @since 4.2.7
    */
  val showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Determines how to set each data class&#39; color if no individual
    * color is set. The default value, <code>tween</code>, computes intermediate
    * colors between <code>minColor</code> and <code>maxColor</code>. The other possible
    * value, <code>category</code>, pulls colors from the global or chart specific
    * <a href="#colors">colors</a> array.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/dataclasscolor/">Category colors</a>
    */
  val dataClassColor: js.UndefOr[String] = js.undefined

  /**
    * <p>An array of data classes or ranges for the choropleth map. If
    * none given, the color axis is scalar and values are distributed
    * as a gradient between the minimum and maximum colors.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/data-class-ranges/">Multiple ranges</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/data-class-two-ranges/">Two ranges</a>
    */
  val dataClasses: js.UndefOr[js.Array[CleanJsObject[ColorAxisDataClasses]]] = js.undefined

  /**
    * <p>The maximum value of the axis in terms of map point values. If
    * <code>null</code>, the max value is automatically calculated. If the
    * <code>endOnTick</code> option is true, the max value might be rounded up.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/gridlines/">Explicit min and max to reduce the effect of outliers</a>
    */
  val max: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimum value of the axis in terms of map point values. If
    * <code>null</code>, the min value is automatically calculated. If the
    * <code>startOnTick</code> option is true, the min value might be rounded
    * down.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/gridlines/">Explicit min and max to reduce the effect of outliers</a>
    */
  val min: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color of the grid lines extending from the axis across the
    * gradient.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/gridlines/">Grid lines demonstrated</a>
    */
  val gridLineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The interval of the tick marks in axis units. When <code>null</code>, the
    * tick interval is computed to approximately follow the
    * <code>tickPixelInterval</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickinterval-5/">Tick interval of 5 on a linear axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/tickinterval/">Tick interval of 0.01 on Y axis</a>
    */
  val tickInterval: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color stops for the gradient of a scalar color axis. Use this in
    * cases where a linear gradient between a <code>minColor</code> and <code>maxColor</code>
    * is not sufficient. The stops is an array of tuples, where the
    * first item is a float between 0 and 1 assigning the relative
    * position in the gradient, and the second item is the color.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/heatmap/">Heatmap with three color stops</a>
    */
  val stops: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined

  /**
    * <p>The type of interpolation to use for the color axis. Can be
    * <code>linear</code> or <code>logarithmic</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/type-linear/">Linear</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log/">Logarithmic</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log-minorgrid/">Logarithmic with minor grid lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/type-log-both/">Logarithmic on two axes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log-negative/">Logarithmic with extension to emulate negative values</a>
    */
  val `type`: js.UndefOr[String] = "linear"

  /**
    * <p>Whether to reverse the axis so that the highest number is closest
    * to the origin. Defaults to <code>false</code> in a horizontal legend and
    * <code>true</code> in a vertical legend, where the smallest value starts on
    * top.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/reversed/">Reversed Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/reversed/">Reversed Y axis</a>
    */
  val reversed: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Event handlers for the axis.</p>
    */
  val events: js.Any = js.undefined

  /**
    * <p>The pixel length of the minor tick marks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorticklength/">10px on Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">10px on Y axis</a>
    */
  val minorTickLength: js.UndefOr[Double] = js.undefined

  /**
    * <p>The position of the minor tick marks relative to the axis line.
    *  Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickposition-outside/">Outside by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickposition-inside/">Inside</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">Inside</a>
    */
  val minorTickPosition: js.UndefOr[String] = js.undefined

  /**
    * <p>For datetime axes, this decides where to put the tick between weeks.
    *  0 = Sunday, 1 = Monday.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startofweek-monday/">Monday by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startofweek-sunday/">Sunday</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/startofweek-1">Monday by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/startofweek-0">Sunday</a>
    */
  val startOfWeek: js.UndefOr[Double] = js.undefined

  /**
    * <p>For categorized axes only. If <code>on</code> the tick mark is placed in the
    * center of the category, if <code>between</code> the tick mark is placed between
    * categories. The default is <code>between</code> if the <code>tickInterval</code> is 1,
    *  else <code>on</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickmarkplacement-between/">"between" by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickmarkplacement-on/">"on"</a>
    */
  val tickmarkPlacement: js.UndefOr[String] = js.undefined

  /**
    * <p>The position of the major tick marks relative to the axis line.
    * Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickposition-outside/">"outside" by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickposition-inside/">"inside"</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/">Formatted ticks on X axis</a>
    */
  val tickPosition: js.UndefOr[String] = js.undefined

  /**
    * <p>Color of the minor, secondary grid lines.</p>
    * <p>In styled mode, the stroke width is given in the
    * <code>.highcharts-minor-grid-line</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorgridlinecolor/">Bright grey lines from Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorgridlinecolor/">Bright grey lines from Y axis</a>
    */
  val minorGridLineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Width of the minor, secondary grid lines.</p>
    * <p>In styled mode, the stroke width is given in the
    * <code>.highcharts-grid-line</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorgridlinewidth/">2px lines from Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorgridlinewidth/">2px lines from Y axis</a>
    */
  val minorGridLineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color for the minor tick marks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickcolor/">Black tick marks on Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">Black tick marks on Y axis</a>
    */
  val minorTickColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the line marking the axis itself.</p>
    * <p>In styled mode, the line stroke is given in the
    * <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/linecolor/">A red line on Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/">Axes in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/linecolor/">A red line on X axis</a>
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Color for the main tick marks.</p>
    * <p>In styled mode, the stroke is given in the <code>.highcharts-tick</code>
    * class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickcolor/">Red ticks on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/">Formatted ticks on X axis</a>
    */
  val tickColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>When using multiple axis, the ticks of two or more opposite axes
    * will automatically be aligned by adding ticks to the axis or axes
    * with the least ticks, as if <code>tickAmount</code> were specified.</p>
    * <p>This can be prevented by setting <code>alignTicks</code> to false. If the grid
    * lines look messy, it&#39;s a good idea to hide them for the secondary
    * axis by setting <code>gridLineWidth</code> to 0.</p>
    * <p>If <code>startOnTick</code> or <code>endOnTick</code> in an Axis options are set to false,
    * then the <code>alignTicks</code> will be disabled for the Axis.</p>
    * <p>Disabled for logarithmic axes.</p>
    */
  val alignTicks: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The highest allowed value for automatically computed axis extremes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/floor-ceiling/">Floor and ceiling</a>
    * @since 4.0
    */
  val ceiling: js.UndefOr[Double] = js.undefined

  /**
    * <p>A class name that opens for styling the axis by CSS, especially in
    * Highcharts styled mode. The class name is applied to group elements
    * for the grid, axis elements and labels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/">Multiple axes with separate styling</a>
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * <p><em>Requires Accessibility module</em></p>
    * <p>Description of the axis to screen reader users.</p>
    * @since 5.0.0
    */
  val description: js.UndefOr[String] = js.undefined

  /**
    * <p>The lowest allowed value for automatically computed axis extremes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/floor-ceiling/">Floor and ceiling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/lazy-loading/">Prevent negative stock price on Y axis</a>
    * @since 4.0
    */
  val floor: js.UndefOr[Double] = js.undefined

  /**
    * <p>The dash or dot style of the grid lines. For possible values, see
    * [this demonstration](<a href="https://jsfiddle.net/gh/get/library/pure/">https://jsfiddle.net/gh/get/library/pure/</a>
    * highcharts/highcharts/tree/master/samples/highcharts/plotoptions/
    * series-dashstyle-all/).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinedashstyle/">Long dashes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/gridlinedashstyle/">Long dashes</a>
    * @since 1.2
    */
  val gridLineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>The Z index of the grid lines.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/gridzindex/">A Z index of 4 renders the grid above the graph</a>
    */
  val gridZIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>An id for the axis. This can be used after render time to get
    * a pointer to the axis object through <code>chart.get()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/id/">Get the object</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/id/">Get the object</a>
    * @since 1.2.0
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * <p>The dash or dot style of the minor grid lines. For possible values,
    * see [this demonstration](<a href="https://jsfiddle.net/gh/get/library/pure/">https://jsfiddle.net/gh/get/library/pure/</a>
    * highcharts/highcharts/tree/master/samples/highcharts/plotoptions/
    * series-dashstyle-all/).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorgridlinedashstyle/">Long dashes on minor grid lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorgridlinedashstyle/">Long dashes on minor grid lines</a>
    * @since 1.2
    */
  val minorGridLineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Specific tick interval in axis units for the minor ticks. On a linear
    * axis, if <code>&quot;auto&quot;</code>, the minor tick interval is calculated as a fifth
    * of the tickInterval. If <code>null</code> or <code>undefined</code>, minor ticks are not
    * shown.</p>
    * <p>On logarithmic axes, the unit is the power of the value. For example,
    * setting the minorTickInterval to 1 puts one tick on each of 0.1, 1,
    * 10, 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks
    * between 1 and 10, 10 and 100 etc.</p>
    * <p>If user settings dictate minor ticks to become too dense, they don&#39;t
    * make sense, and will be ignored to prevent performance problems.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickinterval-null/">Null by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickinterval-5/">5 units</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickinterval-log-auto/">"auto"</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickinterval-log/">0.1</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/basic-line/">Null by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minortickinterval-auto/">"auto"</a>
    */
  val minorTickInterval: js.UndefOr[Double | String | Null] = js.undefined

  /**
    * <p>Enable or disable minor ticks. Unless
    * <a href="#xAxis.minorTickInterval">minorTickInterval</a> is set, the tick
    * interval is calculated as a fifth of the <code>tickInterval</code>.</p>
    * <p>On a logarithmic axis, minor ticks are laid out based on a best
    * guess, attempting to enter approximately 5 minor ticks between
    * each major tick.</p>
    * <p>Prior to v6.0.0, ticks were unabled in auto layout by setting
    * <code>minorTickInterval</code> to <code>&quot;auto&quot;</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorticks-true/">Enabled on linear Y axis</a>
    * @since 6.0.0
    */
  val minorTicks: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The pixel width of the minor tick mark.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickwidth/">3px width</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">1px width</a>
    */
  val minorTickWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>In an ordinal axis, the points are equally spaced in the chart
    * regardless of the actual time or x distance between them. This means
    * that missing data periods (e.g. nights or weekends for a stock chart)
    * will not take up space in the chart.
    * Having <code>ordinal: false</code> will show any gaps created by the <code>gapSize</code>
    * setting proportionate to their duration.</p>
    * <p>In stock charts the X axis is ordinal by default, unless
    * the boost module is used and at least one of the series&#39; data length
    * exceeds the <a href="#series.line.boostThreshold">boostThreshold</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ordinal-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ordinal-false/">False</a>
    * @since 1.1
    */
  val ordinal: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Additional range on the right side of the xAxis. Works similar to
    * <code>xAxis.maxPadding</code>, but value is set in milliseconds. Can be set for
    * both main <code>xAxis</code> and the navigator&#39;s <code>xAxis</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/overscroll/">One minute overscroll with live data</a>
    * @since 6.0.0
    */
  val overscroll: js.UndefOr[Double] = js.undefined

  /**
    * <p>Refers to the index in the <a href="#panes">panes</a> array. Used for circular
    * gauges and polar charts. When the option is not set then first pane
    * will be used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter">Two gauges with different center</a>
    */
  val pane: js.UndefOr[Double] = js.undefined

  /**
    * <p>The zoomed range to display when only defining one or none of <code>min</code>
    * or <code>max</code>. For example, to show the latest month, a range of one month
    * can be set.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/range/">Setting a zoomed range when the rangeSelector is disabled</a>
    */
  val range: js.UndefOr[Double] = js.undefined

  /**
    * <p>This option determines how stacks should be ordered within a group.
    * For example reversed xAxis also reverses stacks, so first series
    * comes last in a group. To keep order like for non-reversed xAxis
    * enable this option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/reversedstacks/">Reversed stacks comparison</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/reversedstacks/">Reversed stacks comparison</a>
    * @since 6.1.1
    */
  val reversedStacks: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>An optional scrollbar to display on the X axis in response to
    * limiting the minimum and maximum of the axis values.</p>
    * <p>In styled mode, all the presentational options for the scrollbar
    * are replaced by the classes <code>.highcharts-scrollbar-thumb</code>,
    * <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,
    * <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/heatmap-scrollbars/">Heatmap with both scrollbars</a>
    * @since 4.2.6
    */
  val scrollbar: js.Any = js.undefined

  /**
    * <p>Whether to show the first tick label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/showfirstlabel-false/">Set to false on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/showfirstlabel/">Labels below plot lines on Y axis</a>
    */
  val showFirstLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to show the last tick label. Defaults to <code>true</code> on cartesian
    * charts, and <code>false</code> on polar charts.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/showlastlabel-true/">Set to true on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/showfirstlabel/">Labels below plot lines on Y axis</a>
    */
  val showLastLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A soft maximum for the axis. If the series data maximum is less than
    * this, the axis will stay at this maximum, but if the series data
    * maximum is higher, the axis will flex to show all data.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/">Soft min and max</a>
    * @since 5.0.1
    */
  val softMax: js.UndefOr[Double] = js.undefined

  /**
    * <p>A soft minimum for the axis. If the series data minimum is greater
    * than this, the axis will stay at this minimum, but if the series
    * data minimum is lower, the axis will flex to show all data.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/">Soft min and max</a>
    * @since 5.0.1
    */
  val softMin: js.UndefOr[Double] = js.undefined

  /**
    * <p>The amount of ticks to draw on the axis. This opens up for aligning
    * the ticks of multiple charts or panes within a chart. This option
    * overrides the <code>tickPixelInterval</code> option.</p>
    * <p>This option only has an effect on linear axes. Datetime, logarithmic
    * or category axes are not affected.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/tickamount/">8 ticks on Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/tickamount/">8 ticks on Y axis</a>
    * @since 4.1.0
    */
  val tickAmount: js.UndefOr[Double] = js.undefined

  /**
    * <p>A callback function returning array defining where the ticks are
    * laid out on the axis. This overrides the default behaviour of
    * <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>. The automatic tick positions are accessible
    * through <code>this.tickPositions</code> and can be modified by the callback.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
    */
  val tickPositioner: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>An array defining where the ticks are laid out on the axis. This
    * overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
    */
  val tickPositions: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * <p>The pixel width of the major tick marks.</p>
    * <p>In styled mode, the stroke width is given in the <code>.highcharts-tick</code>
    * class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickwidth/">10 px width</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/">Formatted ticks on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
    */
  val tickWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Applies only when the axis <code>type</code> is <code>category</code>. When <code>uniqueNames</code>
    * is true, points are placed on the X axis according to their names.
    * If the same point name is repeated in the same or another series,
    * the point is placed on the same X position as other points of the
    * same name. When <code>uniqueNames</code> is false, the points are laid out in
    * increasing X positions regardless of their names, and the X axis
    * category will take the name of the last point in each position.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/uniquenames-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/uniquenames-false/">False</a>
    * @since 4.2.7
    */
  val uniqueNames: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Datetime axis only. An array determining what time intervals the
    * ticks are allowed to fall on. Each array item is an array where the
    * first value is the time unit and the second value another array of
    * allowed multiples. Defaults to:</p>
    * <pre>units: [[
    *     'millisecond', // unit name
    *     [1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples
    * ], [
    *     'second',
    *     [1, 2, 5, 10, 15, 30]
    * ], [
    *     'minute',
    *     [1, 2, 5, 10, 15, 30]
    * ], [
    *     'hour',
    *     [1, 2, 3, 4, 6, 8, 12]
    * ], [
    *     'day',
    *     [1]
    * ], [
    *     'week',
    *     [1]
    * ], [
    *     'month',
    *     [1, 3, 6]
    * ], [
    *     'year',
    *     null
    * ]]</pre>
    */
  val units: js.UndefOr[js.Array[js.Array[String | js.Array[Double]]]] = js.undefined

  /**
    * <p>Whether axis, including axis title, line, ticks and labels, should
    * be visible.</p>
    * @since 4.1.9
    */
  val visible: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Maximum range which can be set using the navigator&#39;s handles.
    * Opposite of <a href="#xAxis.minRange">xAxis.minRange</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/maxrange/">Defined max and min range</a>
    * @since 6.0.0
    */
  val maxRange: js.UndefOr[Double] = js.undefined

  /**
    * <p>Show an indicator on the axis for the current date and time. Can be a boolean
    * or a configuration object similar to <a href="#xAxis.plotLines">xAxis.plotLines</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/current-date-indicator/demo">Current date indicator enabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/current-date-indicator/object-config">Current date indicator with custom options</a>
    */
  val currentDateIndicator: js.UndefOr[CleanJsObject[ColorAxisCurrentDateIndicator]] = js.undefined

  /**
    * <p>Set grid options for the axis labels. Requires Highcharts Gantt.</p>
    * @since 6.2.0
    */
  val grid: js.UndefOr[js.Object] = js.undefined
}

object ColorAxis {
  /**
    * @param minPadding <p>Padding of the min value relative to the length of the axis. A. padding of 0.05 will make a 100px axis 5px longer.</p>
    * @param maxPadding <p>Padding of the max value relative to the length of the axis. A. padding of 0.05 will make a 100px axis 5px longer.</p>
    * @param gridLineWidth <p>The width of the grid lines extending from the axis across the. gradient of a scalar color axis.</p>
    * @param tickPixelInterval <p>If <a href="#colorAxis.tickInterval">tickInterval</a> is <code>null</code> this option. sets the approximate pixel interval of the tick marks.</p>
    * @param startOnTick <p>Whether to force the axis to start on a tick. Use this option. with the <code>maxPadding</code> option to control the axis start.</p>
    * @param endOnTick <p>Whether to force the axis to end on a tick. Use this option with. the <a href="#colorAxis.maxPadding">maxPadding</a> option to control the. axis end.</p>
    * @param marker <p>The triangular marker on a scalar color axis that points to the. value of the hovered area. To disable the marker, set. <code>marker: null</code>.</p>
    * @param labels <p>The axis labels show the number for each tick.</p>. <p>For more live examples on label options, see <a href="/highcharts#xAxis.labels">xAxis.labels in the. Highcharts API.</a></p>
    * @param minColor <p>The color to represent the minimum of the color axis. Unless. <a href="#colorAxis.dataClasses">dataClasses</a> or. <a href="#colorAxis.stops">stops</a> are set, the gradient starts at this. value.</p>. <p>If dataClasses are set, the color is based on minColor and. maxColor unless a color is set for each data class, or the. <a href="#colorAxis.dataClassColor">dataClassColor</a> is set.</p>
    * @param maxColor <p>The color to represent the maximum of the color axis. Unless. <a href="#colorAxis.dataClasses">dataClasses</a> or. <a href="#colorAxis.stops">stops</a> are set, the gradient ends at this. value.</p>. <p>If dataClasses are set, the color is based on minColor and. maxColor unless a color is set for each data class, or the. <a href="#colorAxis.dataClassColor">dataClassColor</a> is set.</p>
    * @param tickLength <p>The pixel length of the main tick marks on the color axis.</p>
    * @param showInLegend <p>Whether to display the colorAxis in the legend.</p>
    * @param dataClassColor <p>Determines how to set each data class&#39; color if no individual. color is set. The default value, <code>tween</code>, computes intermediate. colors between <code>minColor</code> and <code>maxColor</code>. The other possible. value, <code>category</code>, pulls colors from the global or chart specific. <a href="#colors">colors</a> array.</p>
    * @param dataClasses <p>An array of data classes or ranges for the choropleth map. If. none given, the color axis is scalar and values are distributed. as a gradient between the minimum and maximum colors.</p>
    * @param max <p>The maximum value of the axis in terms of map point values. If. <code>null</code>, the max value is automatically calculated. If the. <code>endOnTick</code> option is true, the max value might be rounded up.</p>
    * @param min <p>The minimum value of the axis in terms of map point values. If. <code>null</code>, the min value is automatically calculated. If the. <code>startOnTick</code> option is true, the min value might be rounded. down.</p>
    * @param gridLineColor <p>Color of the grid lines extending from the axis across the. gradient.</p>
    * @param tickInterval <p>The interval of the tick marks in axis units. When <code>null</code>, the. tick interval is computed to approximately follow the. <code>tickPixelInterval</code>.</p>
    * @param stops <p>Color stops for the gradient of a scalar color axis. Use this in. cases where a linear gradient between a <code>minColor</code> and <code>maxColor</code>. is not sufficient. The stops is an array of tuples, where the. first item is a float between 0 and 1 assigning the relative. position in the gradient, and the second item is the color.</p>
    * @param `type` <p>The type of interpolation to use for the color axis. Can be. <code>linear</code> or <code>logarithmic</code>.</p>
    * @param reversed <p>Whether to reverse the axis so that the highest number is closest. to the origin. Defaults to <code>false</code> in a horizontal legend and. <code>true</code> in a vertical legend, where the smallest value starts on. top.</p>
    * @param events <p>Event handlers for the axis.</p>
    * @param minorTickLength <p>The pixel length of the minor tick marks.</p>
    * @param minorTickPosition <p>The position of the minor tick marks relative to the axis line..  Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @param startOfWeek <p>For datetime axes, this decides where to put the tick between weeks..  0 = Sunday, 1 = Monday.</p>
    * @param tickmarkPlacement <p>For categorized axes only. If <code>on</code> the tick mark is placed in the. center of the category, if <code>between</code> the tick mark is placed between. categories. The default is <code>between</code> if the <code>tickInterval</code> is 1,.  else <code>on</code>.</p>
    * @param tickPosition <p>The position of the major tick marks relative to the axis line.. Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @param minorGridLineColor <p>Color of the minor, secondary grid lines.</p>. <p>In styled mode, the stroke width is given in the. <code>.highcharts-minor-grid-line</code> class.</p>
    * @param minorGridLineWidth <p>Width of the minor, secondary grid lines.</p>. <p>In styled mode, the stroke width is given in the. <code>.highcharts-grid-line</code> class.</p>
    * @param minorTickColor <p>Color for the minor tick marks.</p>
    * @param lineColor <p>The color of the line marking the axis itself.</p>. <p>In styled mode, the line stroke is given in the. <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    * @param tickColor <p>Color for the main tick marks.</p>. <p>In styled mode, the stroke is given in the <code>.highcharts-tick</code>. class.</p>
    * @param alignTicks <p>When using multiple axis, the ticks of two or more opposite axes. will automatically be aligned by adding ticks to the axis or axes. with the least ticks, as if <code>tickAmount</code> were specified.</p>. <p>This can be prevented by setting <code>alignTicks</code> to false. If the grid. lines look messy, it&#39;s a good idea to hide them for the secondary. axis by setting <code>gridLineWidth</code> to 0.</p>. <p>If <code>startOnTick</code> or <code>endOnTick</code> in an Axis options are set to false,. then the <code>alignTicks</code> will be disabled for the Axis.</p>. <p>Disabled for logarithmic axes.</p>
    * @param ceiling <p>The highest allowed value for automatically computed axis extremes.</p>
    * @param className <p>A class name that opens for styling the axis by CSS, especially in. Highcharts styled mode. The class name is applied to group elements. for the grid, axis elements and labels.</p>
    * @param description <p><em>Requires Accessibility module</em></p>. <p>Description of the axis to screen reader users.</p>
    * @param floor <p>The lowest allowed value for automatically computed axis extremes.</p>
    * @param gridLineDashStyle <p>The dash or dot style of the grid lines. For possible values, see. [this demonstration](<a href="https://jsfiddle.net/gh/get/library/pure/">https://jsfiddle.net/gh/get/library/pure/</a>. highcharts/highcharts/tree/master/samples/highcharts/plotoptions/. series-dashstyle-all/).</p>
    * @param gridZIndex <p>The Z index of the grid lines.</p>
    * @param id <p>An id for the axis. This can be used after render time to get. a pointer to the axis object through <code>chart.get()</code>.</p>
    * @param minorGridLineDashStyle <p>The dash or dot style of the minor grid lines. For possible values,. see [this demonstration](<a href="https://jsfiddle.net/gh/get/library/pure/">https://jsfiddle.net/gh/get/library/pure/</a>. highcharts/highcharts/tree/master/samples/highcharts/plotoptions/. series-dashstyle-all/).</p>
    * @param minorTickInterval <p>Specific tick interval in axis units for the minor ticks. On a linear. axis, if <code>&quot;auto&quot;</code>, the minor tick interval is calculated as a fifth. of the tickInterval. If <code>null</code> or <code>undefined</code>, minor ticks are not. shown.</p>. <p>On logarithmic axes, the unit is the power of the value. For example,. setting the minorTickInterval to 1 puts one tick on each of 0.1, 1,. 10, 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks. between 1 and 10, 10 and 100 etc.</p>. <p>If user settings dictate minor ticks to become too dense, they don&#39;t. make sense, and will be ignored to prevent performance problems.</p>
    * @param minorTicks <p>Enable or disable minor ticks. Unless. <a href="#xAxis.minorTickInterval">minorTickInterval</a> is set, the tick. interval is calculated as a fifth of the <code>tickInterval</code>.</p>. <p>On a logarithmic axis, minor ticks are laid out based on a best. guess, attempting to enter approximately 5 minor ticks between. each major tick.</p>. <p>Prior to v6.0.0, ticks were unabled in auto layout by setting. <code>minorTickInterval</code> to <code>&quot;auto&quot;</code>.</p>
    * @param minorTickWidth <p>The pixel width of the minor tick mark.</p>
    * @param ordinal <p>In an ordinal axis, the points are equally spaced in the chart. regardless of the actual time or x distance between them. This means. that missing data periods (e.g. nights or weekends for a stock chart). will not take up space in the chart.. Having <code>ordinal: false</code> will show any gaps created by the <code>gapSize</code>. setting proportionate to their duration.</p>. <p>In stock charts the X axis is ordinal by default, unless. the boost module is used and at least one of the series&#39; data length. exceeds the <a href="#series.line.boostThreshold">boostThreshold</a>.</p>
    * @param overscroll <p>Additional range on the right side of the xAxis. Works similar to. <code>xAxis.maxPadding</code>, but value is set in milliseconds. Can be set for. both main <code>xAxis</code> and the navigator&#39;s <code>xAxis</code>.</p>
    * @param pane <p>Refers to the index in the <a href="#panes">panes</a> array. Used for circular. gauges and polar charts. When the option is not set then first pane. will be used.</p>
    * @param range <p>The zoomed range to display when only defining one or none of <code>min</code>. or <code>max</code>. For example, to show the latest month, a range of one month. can be set.</p>
    * @param reversedStacks <p>This option determines how stacks should be ordered within a group.. For example reversed xAxis also reverses stacks, so first series. comes last in a group. To keep order like for non-reversed xAxis. enable this option.</p>
    * @param scrollbar <p>An optional scrollbar to display on the X axis in response to. limiting the minimum and maximum of the axis values.</p>. <p>In styled mode, all the presentational options for the scrollbar. are replaced by the classes <code>.highcharts-scrollbar-thumb</code>,. <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,. <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.</p>
    * @param showFirstLabel <p>Whether to show the first tick label.</p>
    * @param showLastLabel <p>Whether to show the last tick label. Defaults to <code>true</code> on cartesian. charts, and <code>false</code> on polar charts.</p>
    * @param softMax <p>A soft maximum for the axis. If the series data maximum is less than. this, the axis will stay at this maximum, but if the series data. maximum is higher, the axis will flex to show all data.</p>
    * @param softMin <p>A soft minimum for the axis. If the series data minimum is greater. than this, the axis will stay at this minimum, but if the series. data minimum is lower, the axis will flex to show all data.</p>
    * @param tickAmount <p>The amount of ticks to draw on the axis. This opens up for aligning. the ticks of multiple charts or panes within a chart. This option. overrides the <code>tickPixelInterval</code> option.</p>. <p>This option only has an effect on linear axes. Datetime, logarithmic. or category axes are not affected.</p>
    * @param tickPositioner <p>A callback function returning array defining where the ticks are. laid out on the axis. This overrides the default behaviour of. <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>. The automatic tick positions are accessible. through <code>this.tickPositions</code> and can be modified by the callback.</p>
    * @param tickPositions <p>An array defining where the ticks are laid out on the axis. This. overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.</p>
    * @param tickWidth <p>The pixel width of the major tick marks.</p>. <p>In styled mode, the stroke width is given in the <code>.highcharts-tick</code>. class.</p>
    * @param uniqueNames <p>Applies only when the axis <code>type</code> is <code>category</code>. When <code>uniqueNames</code>. is true, points are placed on the X axis according to their names.. If the same point name is repeated in the same or another series,. the point is placed on the same X position as other points of the. same name. When <code>uniqueNames</code> is false, the points are laid out in. increasing X positions regardless of their names, and the X axis. category will take the name of the last point in each position.</p>
    * @param units <p>Datetime axis only. An array determining what time intervals the. ticks are allowed to fall on. Each array item is an array where the. first value is the time unit and the second value another array of. allowed multiples. Defaults to:</p>. <pre>units: [[.     'millisecond', // unit name.     [1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples. ], [.     'second',.     [1, 2, 5, 10, 15, 30]. ], [.     'minute',.     [1, 2, 5, 10, 15, 30]. ], [.     'hour',.     [1, 2, 3, 4, 6, 8, 12]. ], [.     'day',.     [1]. ], [.     'week',.     [1]. ], [.     'month',.     [1, 3, 6]. ], [.     'year',.     null. ]]</pre>
    * @param visible <p>Whether axis, including axis title, line, ticks and labels, should. be visible.</p>
    * @param maxRange <p>Maximum range which can be set using the navigator&#39;s handles.. Opposite of <a href="#xAxis.minRange">xAxis.minRange</a>.</p>
    * @param currentDateIndicator <p>Show an indicator on the axis for the current date and time. Can be a boolean. or a configuration object similar to <a href="#xAxis.plotLines">xAxis.plotLines</a>.</p>
    * @param grid <p>Set grid options for the axis labels. Requires Highcharts Gantt.</p>
    */
  def apply(minPadding: js.UndefOr[Double] = js.undefined, maxPadding: js.UndefOr[Double] = js.undefined, gridLineWidth: js.UndefOr[Double] = js.undefined, tickPixelInterval: js.UndefOr[Double] = js.undefined, startOnTick: js.UndefOr[Boolean] = js.undefined, endOnTick: js.UndefOr[Boolean] = js.undefined, marker: js.UndefOr[CleanJsObject[ColorAxisMarker]] = js.undefined, labels: js.UndefOr[CleanJsObject[ColorAxisLabels]] = js.undefined, minColor: js.UndefOr[String | js.Object] = js.undefined, maxColor: js.UndefOr[String | js.Object] = js.undefined, tickLength: js.UndefOr[Double] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, dataClassColor: js.UndefOr[String] = js.undefined, dataClasses: js.UndefOr[js.Array[CleanJsObject[ColorAxisDataClasses]]] = js.undefined, max: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined, gridLineColor: js.UndefOr[String | js.Object] = js.undefined, tickInterval: js.UndefOr[Double] = js.undefined, stops: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined, `type`: js.UndefOr[String] = "linear", reversed: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, minorTickLength: js.UndefOr[Double] = js.undefined, minorTickPosition: js.UndefOr[String] = js.undefined, startOfWeek: js.UndefOr[Double] = js.undefined, tickmarkPlacement: js.UndefOr[String] = js.undefined, tickPosition: js.UndefOr[String] = js.undefined, minorGridLineColor: js.UndefOr[String | js.Object] = js.undefined, minorGridLineWidth: js.UndefOr[Double] = js.undefined, minorTickColor: js.UndefOr[String | js.Object] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, tickColor: js.UndefOr[String | js.Object] = js.undefined, alignTicks: js.UndefOr[Boolean] = js.undefined, ceiling: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, description: js.UndefOr[String] = js.undefined, floor: js.UndefOr[Double] = js.undefined, gridLineDashStyle: js.UndefOr[String] = js.undefined, gridZIndex: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, minorGridLineDashStyle: js.UndefOr[String] = js.undefined, minorTickInterval: js.UndefOr[Double | String | Null] = js.undefined, minorTicks: js.UndefOr[Boolean] = js.undefined, minorTickWidth: js.UndefOr[Double] = js.undefined, ordinal: js.UndefOr[Boolean] = js.undefined, overscroll: js.UndefOr[Double] = js.undefined, pane: js.UndefOr[Double] = js.undefined, range: js.UndefOr[Double] = js.undefined, reversedStacks: js.UndefOr[Boolean] = js.undefined, scrollbar: js.UndefOr[js.Any] = js.undefined, showFirstLabel: js.UndefOr[Boolean] = js.undefined, showLastLabel: js.UndefOr[Boolean] = js.undefined, softMax: js.UndefOr[Double] = js.undefined, softMin: js.UndefOr[Double] = js.undefined, tickAmount: js.UndefOr[Double] = js.undefined, tickPositioner: js.UndefOr[js.Function] = js.undefined, tickPositions: js.UndefOr[js.Array[Double]] = js.undefined, tickWidth: js.UndefOr[Double] = js.undefined, uniqueNames: js.UndefOr[Boolean] = js.undefined, units: js.UndefOr[js.Array[js.Array[String | js.Array[Double]]]] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, maxRange: js.UndefOr[Double] = js.undefined, currentDateIndicator: js.UndefOr[CleanJsObject[ColorAxisCurrentDateIndicator]] = js.undefined, grid: js.UndefOr[js.Object] = js.undefined): ColorAxis = {
    val minPaddingOuter: js.UndefOr[Double] = minPadding
    val maxPaddingOuter: js.UndefOr[Double] = maxPadding
    val gridLineWidthOuter: js.UndefOr[Double] = gridLineWidth
    val tickPixelIntervalOuter: js.UndefOr[Double] = tickPixelInterval
    val startOnTickOuter: js.UndefOr[Boolean] = startOnTick
    val endOnTickOuter: js.UndefOr[Boolean] = endOnTick
    val markerOuter: js.UndefOr[CleanJsObject[ColorAxisMarker]] = marker
    val labelsOuter: js.UndefOr[CleanJsObject[ColorAxisLabels]] = labels
    val minColorOuter: js.UndefOr[String | js.Object] = minColor
    val maxColorOuter: js.UndefOr[String | js.Object] = maxColor
    val tickLengthOuter: js.UndefOr[Double] = tickLength
    val showInLegendOuter: js.UndefOr[Boolean] = showInLegend
    val dataClassColorOuter: js.UndefOr[String] = dataClassColor
    val dataClassesOuter: js.UndefOr[js.Array[CleanJsObject[ColorAxisDataClasses]]] = dataClasses
    val maxOuter: js.UndefOr[Double] = max
    val minOuter: js.UndefOr[Double] = min
    val gridLineColorOuter: js.UndefOr[String | js.Object] = gridLineColor
    val tickIntervalOuter: js.UndefOr[Double] = tickInterval
    val stopsOuter: js.UndefOr[js.Array[js.Array[js.Any]]] = stops
    val typeOuter: js.UndefOr[String] = `type`
    val reversedOuter: js.UndefOr[Boolean] = reversed
    val eventsOuter: js.Any = events
    val minorTickLengthOuter: js.UndefOr[Double] = minorTickLength
    val minorTickPositionOuter: js.UndefOr[String] = minorTickPosition
    val startOfWeekOuter: js.UndefOr[Double] = startOfWeek
    val tickmarkPlacementOuter: js.UndefOr[String] = tickmarkPlacement
    val tickPositionOuter: js.UndefOr[String] = tickPosition
    val minorGridLineColorOuter: js.UndefOr[String | js.Object] = minorGridLineColor
    val minorGridLineWidthOuter: js.UndefOr[Double] = minorGridLineWidth
    val minorTickColorOuter: js.UndefOr[String | js.Object] = minorTickColor
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val tickColorOuter: js.UndefOr[String | js.Object] = tickColor
    val alignTicksOuter: js.UndefOr[Boolean] = alignTicks
    val ceilingOuter: js.UndefOr[Double] = ceiling
    val classNameOuter: js.UndefOr[String] = className
    val descriptionOuter: js.UndefOr[String] = description
    val floorOuter: js.UndefOr[Double] = floor
    val gridLineDashStyleOuter: js.UndefOr[String] = gridLineDashStyle
    val gridZIndexOuter: js.UndefOr[Double] = gridZIndex
    val idOuter: js.UndefOr[String] = id
    val minorGridLineDashStyleOuter: js.UndefOr[String] = minorGridLineDashStyle
    val minorTickIntervalOuter: js.UndefOr[Double | String | Null] = minorTickInterval
    val minorTicksOuter: js.UndefOr[Boolean] = minorTicks
    val minorTickWidthOuter: js.UndefOr[Double] = minorTickWidth
    val ordinalOuter: js.UndefOr[Boolean] = ordinal
    val overscrollOuter: js.UndefOr[Double] = overscroll
    val paneOuter: js.UndefOr[Double] = pane
    val rangeOuter: js.UndefOr[Double] = range
    val reversedStacksOuter: js.UndefOr[Boolean] = reversedStacks
    val scrollbarOuter: js.Any = scrollbar
    val showFirstLabelOuter: js.UndefOr[Boolean] = showFirstLabel
    val showLastLabelOuter: js.UndefOr[Boolean] = showLastLabel
    val softMaxOuter: js.UndefOr[Double] = softMax
    val softMinOuter: js.UndefOr[Double] = softMin
    val tickAmountOuter: js.UndefOr[Double] = tickAmount
    val tickPositionerOuter: js.UndefOr[js.Function] = tickPositioner
    val tickPositionsOuter: js.UndefOr[js.Array[Double]] = tickPositions
    val tickWidthOuter: js.UndefOr[Double] = tickWidth
    val uniqueNamesOuter: js.UndefOr[Boolean] = uniqueNames
    val unitsOuter: js.UndefOr[js.Array[js.Array[String | js.Array[Double]]]] = units
    val visibleOuter: js.UndefOr[Boolean] = visible
    val maxRangeOuter: js.UndefOr[Double] = maxRange
    val currentDateIndicatorOuter: js.UndefOr[CleanJsObject[ColorAxisCurrentDateIndicator]] = currentDateIndicator
    val gridOuter: js.UndefOr[js.Object] = grid
    com.highcharts.HighchartsGenericObject.toCleanObject(new ColorAxis {
      override val minPadding: js.UndefOr[Double] = minPaddingOuter
      override val maxPadding: js.UndefOr[Double] = maxPaddingOuter
      override val gridLineWidth: js.UndefOr[Double] = gridLineWidthOuter
      override val tickPixelInterval: js.UndefOr[Double] = tickPixelIntervalOuter
      override val startOnTick: js.UndefOr[Boolean] = startOnTickOuter
      override val endOnTick: js.UndefOr[Boolean] = endOnTickOuter
      override val marker: js.UndefOr[CleanJsObject[ColorAxisMarker]] = markerOuter
      override val labels: js.UndefOr[CleanJsObject[ColorAxisLabels]] = labelsOuter
      override val minColor: js.UndefOr[String | js.Object] = minColorOuter
      override val maxColor: js.UndefOr[String | js.Object] = maxColorOuter
      override val tickLength: js.UndefOr[Double] = tickLengthOuter
      override val showInLegend: js.UndefOr[Boolean] = showInLegendOuter
      override val dataClassColor: js.UndefOr[String] = dataClassColorOuter
      override val dataClasses: js.UndefOr[js.Array[CleanJsObject[ColorAxisDataClasses]]] = dataClassesOuter
      override val max: js.UndefOr[Double] = maxOuter
      override val min: js.UndefOr[Double] = minOuter
      override val gridLineColor: js.UndefOr[String | js.Object] = gridLineColorOuter
      override val tickInterval: js.UndefOr[Double] = tickIntervalOuter
      override val stops: js.UndefOr[js.Array[js.Array[js.Any]]] = stopsOuter
      override val `type`: js.UndefOr[String] = typeOuter
      override val reversed: js.UndefOr[Boolean] = reversedOuter
      override val events: js.Any = eventsOuter
      override val minorTickLength: js.UndefOr[Double] = minorTickLengthOuter
      override val minorTickPosition: js.UndefOr[String] = minorTickPositionOuter
      override val startOfWeek: js.UndefOr[Double] = startOfWeekOuter
      override val tickmarkPlacement: js.UndefOr[String] = tickmarkPlacementOuter
      override val tickPosition: js.UndefOr[String] = tickPositionOuter
      override val minorGridLineColor: js.UndefOr[String | js.Object] = minorGridLineColorOuter
      override val minorGridLineWidth: js.UndefOr[Double] = minorGridLineWidthOuter
      override val minorTickColor: js.UndefOr[String | js.Object] = minorTickColorOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val tickColor: js.UndefOr[String | js.Object] = tickColorOuter
      override val alignTicks: js.UndefOr[Boolean] = alignTicksOuter
      override val ceiling: js.UndefOr[Double] = ceilingOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val floor: js.UndefOr[Double] = floorOuter
      override val gridLineDashStyle: js.UndefOr[String] = gridLineDashStyleOuter
      override val gridZIndex: js.UndefOr[Double] = gridZIndexOuter
      override val id: js.UndefOr[String] = idOuter
      override val minorGridLineDashStyle: js.UndefOr[String] = minorGridLineDashStyleOuter
      override val minorTickInterval: js.UndefOr[Double | String | Null] = minorTickIntervalOuter
      override val minorTicks: js.UndefOr[Boolean] = minorTicksOuter
      override val minorTickWidth: js.UndefOr[Double] = minorTickWidthOuter
      override val ordinal: js.UndefOr[Boolean] = ordinalOuter
      override val overscroll: js.UndefOr[Double] = overscrollOuter
      override val pane: js.UndefOr[Double] = paneOuter
      override val range: js.UndefOr[Double] = rangeOuter
      override val reversedStacks: js.UndefOr[Boolean] = reversedStacksOuter
      override val scrollbar: js.Any = scrollbarOuter
      override val showFirstLabel: js.UndefOr[Boolean] = showFirstLabelOuter
      override val showLastLabel: js.UndefOr[Boolean] = showLastLabelOuter
      override val softMax: js.UndefOr[Double] = softMaxOuter
      override val softMin: js.UndefOr[Double] = softMinOuter
      override val tickAmount: js.UndefOr[Double] = tickAmountOuter
      override val tickPositioner: js.UndefOr[js.Function] = tickPositionerOuter
      override val tickPositions: js.UndefOr[js.Array[Double]] = tickPositionsOuter
      override val tickWidth: js.UndefOr[Double] = tickWidthOuter
      override val uniqueNames: js.UndefOr[Boolean] = uniqueNamesOuter
      override val units: js.UndefOr[js.Array[js.Array[String | js.Array[Double]]]] = unitsOuter
      override val visible: js.UndefOr[Boolean] = visibleOuter
      override val maxRange: js.UndefOr[Double] = maxRangeOuter
      override val currentDateIndicator: js.UndefOr[CleanJsObject[ColorAxisCurrentDateIndicator]] = currentDateIndicatorOuter
      override val grid: js.UndefOr[js.Object] = gridOuter
    })
  }
}
