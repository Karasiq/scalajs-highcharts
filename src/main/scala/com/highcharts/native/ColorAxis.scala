/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>colorAxis</code>
  */
class ColorAxis extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Determines how to set each data class&#39; color if no individual
    * color is set. The default value, <code>tween</code>, computes intermediate
    * colors between <code>minColor</code> and <code>maxColor</code>. The other possible
    * value, <code>category</code>, pulls colors from the global or chart specific
    * <a href="#colors">colors</a> array.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/dataclasscolor/">Category colors</a>
    */
  var dataClassColor: js.UndefOr[String] = js.undefined

  /**
    * <p>An array of data classes or ranges for the choropleth map. If
    * none given, the color axis is scalar and values are distributed
    * as a gradient between the minimum and maximum colors.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/data-class-ranges/">Multiple ranges</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/data-class-two-ranges/">Two ranges</a>
    */
  var dataClasses: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>Whether to force the axis to end on a tick. Use this option with
    * the <a href="#colorAxis.maxPadding">maxPadding</a> option to control the
    * axis end.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/endontick/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/endontick-false/">False</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/basic-line/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/endontick/">False</a>
    * @since 1.2.0
    */
  var endOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Event handlers for the axis.</p>
    */
  var events: js.Any = js.undefined

  /**
    * <p>Color of the grid lines extending from the axis across the
    * gradient.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/gridlines/">Grid lines demonstrated</a>
    */
  var gridLineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the grid lines extending from the axis across the
    * gradient of a scalar color axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/gridlines/">Grid lines demonstrated</a>
    */
  var gridLineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The axis labels show the number for each tick.</p>
    * <p>For more live examples on label options, see <a href="/highcharts#xAxis.labels">xAxis.labels in the
    * Highcharts API.</a></p>
    */
  var labels: js.Any = js.undefined

  /**
    * <p>The layout of the color axis. Can be <code>&#39;horizontal&#39;</code> or <code>&#39;vertical&#39;</code>.
    * If none given, the color axis has the same layout as the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/horizontal-layout/">Horizontal color axis layout with vertical legend</a>
    * @since 7.2.0
    */
  var layout: js.UndefOr[js.UndefOr[String]] = js.undefined

  /**
    * <p>The triangular marker on a scalar color axis that points to the
    * value of the hovered area. To disable the marker, set
    * <code>marker: null</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/marker/">Black marker</a>
    */
  var marker: js.Any = js.undefined

  /**
    * <p>The maximum value of the axis in terms of map point values. If
    * <code>null</code>, the max value is automatically calculated. If the
    * <code>endOnTick</code> option is true, the max value might be rounded up.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/gridlines/">Explicit min and max to reduce the effect of outliers</a>
    */
  var max: js.UndefOr[Double] = js.undefined

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
  var maxColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Padding of the max value relative to the length of the axis. A
    * padding of 0.05 will make a 100px axis 5px longer.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/maxpadding/">Max padding of 0.25 on y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minpadding-maxpadding/">Greater min- and maxPadding</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotbackgroundcolor-gradient/">Add some padding</a>
    * @since 1.2.0
    */
  var maxPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimum value of the axis in terms of map point values. If
    * <code>null</code>, the min value is automatically calculated. If the
    * <code>startOnTick</code> option is true, the min value might be rounded
    * down.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/gridlines/">Explicit min and max to reduce the effect of outliers</a>
    */
  var min: js.UndefOr[Double] = js.undefined

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
  var minColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Padding of the min value relative to the length of the axis. A
    * padding of 0.05 will make a 100px axis 5px longer.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minpadding/">Min padding of 0.2</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minpadding-maxpadding/">Greater min- and maxPadding</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotbackgroundcolor-gradient/">Add some padding</a>
    * @since 1.2.0
    */
  var minPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to reverse the axis so that the highest number is closest
    * to the origin. Defaults to <code>false</code> in a horizontal legend and
    * <code>true</code> in a vertical legend, where the smallest value starts on
    * top.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/reversed/">Reversed Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/reversed/">Reversed Y axis</a>
    */
  var reversed: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to display the colorAxis in the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/hidden-coloraxis-with-3d-chart/">Hidden color axis with 3d chart</a>
    * @since 4.2.7
    */
  var showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to force the axis to start on a tick. Use this option
    * with the <code>maxPadding</code> option to control the axis start.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-false/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-true/">True</a>
    * @since 1.2.0
    */
  var startOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Color stops for the gradient of a scalar color axis. Use this in
    * cases where a linear gradient between a <code>minColor</code> and <code>maxColor</code>
    * is not sufficient. The stops is an array of tuples, where the
    * first item is a float between 0 and 1 assigning the relative
    * position in the gradient, and the second item is the color.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/heatmap/">Heatmap with three color stops</a>
    */
  var stops: js.UndefOr[js.Array[js.Array[js.Array[js.Any]]]] = js.undefined

  /**
    * <p>The interval of the tick marks in axis units. When <code>null</code>, the
    * tick interval is computed to approximately follow the
    * <code>tickPixelInterval</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickinterval-5/">Tick interval of 5 on a linear axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/tickinterval/">Tick interval of 0.01 on Y axis</a>
    */
  var tickInterval: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel length of the main tick marks on the color axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/ticklength/">20 px tick length on the X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/">Formatted ticks on X axis</a>
    */
  var tickLength: js.UndefOr[Double] = js.undefined

  /**
    * <p>If <a href="#colorAxis.tickInterval">tickInterval</a> is <code>null</code> this option
    * sets the approximate pixel interval of the tick marks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpixelinterval-50/">50 px on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/tickpixelinterval/">200 px on X axis</a>
    */
  var tickPixelInterval: js.UndefOr[Double] = js.undefined

  /**
    * <p>The type of interpolation to use for the color axis. Can be
    * <code>linear</code> or <code>logarithmic</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/logarithmic-with-emulate-negative-values/">Logarithmic color axis with extension to emulate negative values</a>
    */
  var `type`: js.UndefOr[String] = js.undefined

  /**
    * <p>Accessibility options for an axis. Requires the accessibility module.</p>
    * @since 7.1.0
    */
  var accessibility: js.Any = js.undefined

  /**
    * <p>In a polar chart, this is the angle of the Y axis in degrees, where
    * 0 is up and 90 is right. The angle determines the position of the
    * axis line and the labels, though the coordinate system is unaffected.
    * Since v8.0.0 this option is also applicable for X axis (inverted
    * polar).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/angle/">Custom X axis' angle on inverted polar chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/angle/">Dual axis polar chart</a>
    * @since 4.2.7
    */
  var angle: js.UndefOr[Double] = js.undefined

  /**
    * <p>The highest allowed value for automatically computed axis extremes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/floor-ceiling/">Floor and ceiling</a>
    * @since 4.0.0
    */
  var ceiling: js.UndefOr[Double] = js.undefined

  /**
    * <p>A class name that opens for styling the axis by CSS, especially in
    * Highcharts styled mode. The class name is applied to group elements
    * for the grid, axis elements and labels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/">Multiple axes with separate styling</a>
    * @since 5.0.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>Show an indicator on the axis for the current date and time. Can be a
    * boolean or a configuration object similar to
    * <a href="#xAxis.plotLines">xAxis.plotLines</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/current-date-indicator/demo">Current date indicator enabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/current-date-indicator/object-config">Current date indicator with custom options</a>
    */
  var currentDateIndicator: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>The lowest allowed value for automatically computed axis extremes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/floor-ceiling/">Floor and ceiling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/lazy-loading/">Prevent negative stock price on Y axis</a>
    * @since 4.0.0
    */
  var floor: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set grid options for the axis labels. Requires Highcharts Gantt.</p>
    * @since 6.2.0
    */
  var grid: js.Any = js.undefined

  /**
    * <p>The dash or dot style of the grid lines. For possible values, see
    * <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinedashstyle/">Long dashes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/gridlinedashstyle/">Long dashes</a>
    * @since 1.2.0
    */
  var gridLineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Polar charts only. Whether the grid lines should draw as a polygon
    * with straight lines between categories, or as circles. Can be either
    * <code>circle</code> or <code>polygon</code>. Since v8.0.0 this option is also applicable
    * for X axis (inverted polar).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polar-spider/">Polygon grid lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/gridlineinterpolation/">Circle and polygon on inverted polar</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlineinterpolation/">Circle and polygon</a>
    */
  var gridLineInterpolation: js.UndefOr[String] = js.undefined

  /**
    * <p>The Z index of the grid lines.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/gridzindex/">A Z index of 4 renders the grid above the graph</a>
    */
  var gridZIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>An id for the axis. This can be used after render time to get
    * a pointer to the axis object through <code>chart.get()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/id/">Get the object</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/id/">Get the object</a>
    * @since 1.2.0
    */
  var id: js.UndefOr[String] = js.undefined

  /**
    * <p>The color of the line marking the axis itself.</p>
    * <p>In styled mode, the line stroke is given in the
    * <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/linecolor/">A red line on Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/">Axes in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/linecolor/">A red line on X axis</a>
    */
  var lineColor: js.Any = js.undefined

  /**
    * <p>If there are multiple axes on the same side of the chart, the pixel
    * margin between the axes. Defaults to 0 on vertical axes, 15 on
    * horizontal axes.</p>
    * @since 7.0.3
    */
  var margin: js.UndefOr[Double] = js.undefined

  /**
    * <p>Maximum range which can be set using the navigator&#39;s handles.
    * Opposite of <a href="#xAxis.minRange">xAxis.minRange</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/maxrange/">Defined max and min range</a>
    * @since 6.0.0
    */
  var maxRange: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color of the minor, secondary grid lines.</p>
    * <p>In styled mode, the stroke width is given in the
    * <code>.highcharts-minor-grid-line</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorgridlinecolor/">Bright grey lines from Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorgridlinecolor/">Bright grey lines from Y axis</a>
    */
  var minorGridLineColor: js.Any = js.undefined

  /**
    * <p>The dash or dot style of the minor grid lines. For possible values,
    * see <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorgridlinedashstyle/">Long dashes on minor grid lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorgridlinedashstyle/">Long dashes on minor grid lines</a>
    * @since 1.2.0
    */
  var minorGridLineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Width of the minor, secondary grid lines.</p>
    * <p>In styled mode, the stroke width is given in the
    * <code>.highcharts-grid-line</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorgridlinewidth/">2px lines from Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorgridlinewidth/">2px lines from Y axis</a>
    */
  var minorGridLineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color for the minor tick marks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickcolor/">Black tick marks on Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">Black tick marks on Y axis</a>
    */
  var minorTickColor: js.Any = js.undefined

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
  var minorTickInterval: js.UndefOr[Double | String | Null] = js.undefined

  /**
    * <p>The pixel length of the minor tick marks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorticklength/">10px on Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">10px on Y axis</a>
    */
  var minorTickLength: js.UndefOr[Double] = js.undefined

  /**
    * <p>The position of the minor tick marks relative to the axis line.
    *  Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickposition-outside/">Outside by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickposition-inside/">Inside</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">Inside</a>
    */
  var minorTickPosition: js.UndefOr[String] = js.undefined

  /**
    * <p>The pixel width of the minor tick mark.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickwidth/">3px width</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">1px width</a>
    */
  var minorTickWidth: js.UndefOr[Double] = js.undefined

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
  var minorTicks: js.UndefOr[Boolean] = js.undefined

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
    * <p>For an ordinal axis, <code>minPadding</code> and <code>maxPadding</code> are ignored. Use
    * <a href="#xAxis.overscroll">overscroll</a> instead.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ordinal-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ordinal-false/">False</a>
    * @since 1.1.0
    */
  var ordinal: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Additional range on the right side of the xAxis. Works similar to
    * <code>xAxis.maxPadding</code>, but value is set in milliseconds. Can be set for
    * both main <code>xAxis</code> and the navigator&#39;s <code>xAxis</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/overscroll/">One minute overscroll with live data</a>
    * @since 6.0.0
    */
  var overscroll: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to pan axis. If <code>chart.panning</code> is enabled, the option
    * allows to disable panning on an individual axis.</p>
    */
  var panningEnabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The zoomed range to display when only defining one or none of <code>min</code>
    * or <code>max</code>. For example, to show the latest month, a range of one month
    * can be set.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/range/">Setting a zoomed range when the rangeSelector is disabled</a>
    */
  var range: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to show the first tick label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/showfirstlabel-false/">Set to false on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/showfirstlabel/">Labels below plot lines on Y axis</a>
    */
  var showFirstLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to show the last tick label. Defaults to <code>true</code> on cartesian
    * charts, and <code>false</code> on polar charts.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/showlastlabel-true/">Set to true on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/showfirstlabel/">Labels below plot lines on Y axis</a>
    */
  var showLastLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A soft maximum for the axis. If the series data maximum is less than
    * this, the axis will stay at this maximum, but if the series data
    * maximum is higher, the axis will flex to show all data.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/">Soft min and max</a>
    * @since 5.0.1
    */
  var softMax: js.UndefOr[Double] = js.undefined

  /**
    * <p>A soft minimum for the axis. If the series data minimum is greater
    * than this, the axis will stay at this minimum, but if the series
    * data minimum is lower, the axis will flex to show all data.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/">Soft min and max</a>
    * @since 5.0.1
    */
  var softMin: js.UndefOr[Double] = js.undefined

  /**
    * <p>For datetime axes, this decides where to put the tick between weeks.
    *  0 = Sunday, 1 = Monday.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startofweek-monday/">Monday by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startofweek-sunday/">Sunday</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/startofweek-1">Monday by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/startofweek-0">Sunday</a>
    */
  var startOfWeek: js.UndefOr[Double] = js.undefined

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
  var tickAmount: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color for the main tick marks.</p>
    * <p>In styled mode, the stroke is given in the <code>.highcharts-tick</code>
    * class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickcolor/">Red ticks on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/">Formatted ticks on X axis</a>
    */
  var tickColor: js.Any = js.undefined

  /**
    * <p>The position of the major tick marks relative to the axis line.
    * Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickposition-outside/">"outside" by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickposition-inside/">"inside"</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/">Formatted ticks on X axis</a>
    */
  var tickPosition: js.UndefOr[String] = js.undefined

  /**
    * <p>A callback function returning array defining where the ticks are
    * laid out on the axis. This overrides the default behaviour of
    * <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>. The automatic tick positions are accessible
    * through <code>this.tickPositions</code> and can be modified by the callback.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
    */
  var tickPositioner: js.Any = js.undefined

  /**
    * <p>An array defining where the ticks are laid out on the axis. This
    * overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
    */
  var tickPositions: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * <p>The pixel width of the major tick marks. Defaults to 0 on category
    * axes, otherwise 1.</p>
    * <p>In styled mode, the stroke width is given in the <code>.highcharts-tick</code>
    * class, but in order for the element to be generated on category axes,
    * the option must be explicitly set to 1.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickwidth/">10 px width</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/">Formatted ticks on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
    */
  var tickWidth: js.UndefOr[js.UndefOr[Double]] = js.undefined

  /**
    * <p>For categorized axes only. If <code>on</code> the tick mark is placed in the
    * center of the category, if <code>between</code> the tick mark is placed between
    * categories. The default is <code>between</code> if the <code>tickInterval</code> is 1, else
    * <code>on</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickmarkplacement-between/">"between" by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickmarkplacement-on/">"on"</a>
    */
  var tickmarkPlacement: js.UndefOr[String] = js.undefined

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
  var uniqueNames: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Datetime axis only. An array determining what time intervals the
    * ticks are allowed to fall on. Each array item is an array where the
    * first value is the time unit and the second value another array of
    * allowed multiples.</p>
    * <p>Defaults to:</p>
    * <pre><code class="language-js">units: [[
    *     &#39;millisecond&#39;, // unit name
    *     [1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples
    * ], [
    *     &#39;second&#39;,
    *     [1, 2, 5, 10, 15, 30]
    * ], [
    *     &#39;minute&#39;,
    *     [1, 2, 5, 10, 15, 30]
    * ], [
    *     &#39;hour&#39;,
    *     [1, 2, 3, 4, 6, 8, 12]
    * ], [
    *     &#39;day&#39;,
    *     [1, 2]
    * ], [
    *     &#39;week&#39;,
    *     [1, 2]
    * ], [
    *     &#39;month&#39;,
    *     [1, 2, 3, 4, 6]
    * ], [
    *     &#39;year&#39;,
    *     null
    * ]]
    * </code></pre>
    */
  var units: js.UndefOr[js.Array[js.Array[js.Array[js.Any]]]] = js.undefined

  /**
    * <p>Whether axis, including axis title, line, ticks and labels, should
    * be visible.</p>
    * @since 4.1.9
    */
  var visible: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The Z index for the axis group.</p>
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ColorAxis {
  /**
    * @param dataClassColor <p>Determines how to set each data class&#39; color if no individual. color is set. The default value, <code>tween</code>, computes intermediate. colors between <code>minColor</code> and <code>maxColor</code>. The other possible. value, <code>category</code>, pulls colors from the global or chart specific. <a href="#colors">colors</a> array.</p>
    * @param dataClasses <p>An array of data classes or ranges for the choropleth map. If. none given, the color axis is scalar and values are distributed. as a gradient between the minimum and maximum colors.</p>
    * @param endOnTick <p>Whether to force the axis to end on a tick. Use this option with. the <a href="#colorAxis.maxPadding">maxPadding</a> option to control the. axis end.</p>
    * @param events <p>Event handlers for the axis.</p>
    * @param gridLineColor <p>Color of the grid lines extending from the axis across the. gradient.</p>
    * @param gridLineWidth <p>The width of the grid lines extending from the axis across the. gradient of a scalar color axis.</p>
    * @param labels <p>The axis labels show the number for each tick.</p>. <p>For more live examples on label options, see <a href="/highcharts#xAxis.labels">xAxis.labels in the. Highcharts API.</a></p>
    * @param layout <p>The layout of the color axis. Can be <code>&#39;horizontal&#39;</code> or <code>&#39;vertical&#39;</code>.. If none given, the color axis has the same layout as the legend.</p>
    * @param marker <p>The triangular marker on a scalar color axis that points to the. value of the hovered area. To disable the marker, set. <code>marker: null</code>.</p>
    * @param max <p>The maximum value of the axis in terms of map point values. If. <code>null</code>, the max value is automatically calculated. If the. <code>endOnTick</code> option is true, the max value might be rounded up.</p>
    * @param maxColor <p>The color to represent the maximum of the color axis. Unless. <a href="#colorAxis.dataClasses">dataClasses</a> or. <a href="#colorAxis.stops">stops</a> are set, the gradient ends at this. value.</p>. <p>If dataClasses are set, the color is based on minColor and. maxColor unless a color is set for each data class, or the. <a href="#colorAxis.dataClassColor">dataClassColor</a> is set.</p>
    * @param maxPadding <p>Padding of the max value relative to the length of the axis. A. padding of 0.05 will make a 100px axis 5px longer.</p>
    * @param min <p>The minimum value of the axis in terms of map point values. If. <code>null</code>, the min value is automatically calculated. If the. <code>startOnTick</code> option is true, the min value might be rounded. down.</p>
    * @param minColor <p>The color to represent the minimum of the color axis. Unless. <a href="#colorAxis.dataClasses">dataClasses</a> or. <a href="#colorAxis.stops">stops</a> are set, the gradient starts at this. value.</p>. <p>If dataClasses are set, the color is based on minColor and. maxColor unless a color is set for each data class, or the. <a href="#colorAxis.dataClassColor">dataClassColor</a> is set.</p>
    * @param minPadding <p>Padding of the min value relative to the length of the axis. A. padding of 0.05 will make a 100px axis 5px longer.</p>
    * @param reversed <p>Whether to reverse the axis so that the highest number is closest. to the origin. Defaults to <code>false</code> in a horizontal legend and. <code>true</code> in a vertical legend, where the smallest value starts on. top.</p>
    * @param showInLegend <p>Whether to display the colorAxis in the legend.</p>
    * @param startOnTick <p>Whether to force the axis to start on a tick. Use this option. with the <code>maxPadding</code> option to control the axis start.</p>
    * @param stops <p>Color stops for the gradient of a scalar color axis. Use this in. cases where a linear gradient between a <code>minColor</code> and <code>maxColor</code>. is not sufficient. The stops is an array of tuples, where the. first item is a float between 0 and 1 assigning the relative. position in the gradient, and the second item is the color.</p>
    * @param tickInterval <p>The interval of the tick marks in axis units. When <code>null</code>, the. tick interval is computed to approximately follow the. <code>tickPixelInterval</code>.</p>
    * @param tickLength <p>The pixel length of the main tick marks on the color axis.</p>
    * @param tickPixelInterval <p>If <a href="#colorAxis.tickInterval">tickInterval</a> is <code>null</code> this option. sets the approximate pixel interval of the tick marks.</p>
    * @param `type` <p>The type of interpolation to use for the color axis. Can be. <code>linear</code> or <code>logarithmic</code>.</p>
    * @param accessibility <p>Accessibility options for an axis. Requires the accessibility module.</p>
    * @param angle <p>In a polar chart, this is the angle of the Y axis in degrees, where. 0 is up and 90 is right. The angle determines the position of the. axis line and the labels, though the coordinate system is unaffected.. Since v8.0.0 this option is also applicable for X axis (inverted. polar).</p>
    * @param ceiling <p>The highest allowed value for automatically computed axis extremes.</p>
    * @param className <p>A class name that opens for styling the axis by CSS, especially in. Highcharts styled mode. The class name is applied to group elements. for the grid, axis elements and labels.</p>
    * @param currentDateIndicator <p>Show an indicator on the axis for the current date and time. Can be a. boolean or a configuration object similar to. <a href="#xAxis.plotLines">xAxis.plotLines</a>.</p>
    * @param floor <p>The lowest allowed value for automatically computed axis extremes.</p>
    * @param grid <p>Set grid options for the axis labels. Requires Highcharts Gantt.</p>
    * @param gridLineDashStyle <p>The dash or dot style of the grid lines. For possible values, see. <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.</p>
    * @param gridLineInterpolation <p>Polar charts only. Whether the grid lines should draw as a polygon. with straight lines between categories, or as circles. Can be either. <code>circle</code> or <code>polygon</code>. Since v8.0.0 this option is also applicable. for X axis (inverted polar).</p>
    * @param gridZIndex <p>The Z index of the grid lines.</p>
    * @param id <p>An id for the axis. This can be used after render time to get. a pointer to the axis object through <code>chart.get()</code>.</p>
    * @param lineColor <p>The color of the line marking the axis itself.</p>. <p>In styled mode, the line stroke is given in the. <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    * @param margin <p>If there are multiple axes on the same side of the chart, the pixel. margin between the axes. Defaults to 0 on vertical axes, 15 on. horizontal axes.</p>
    * @param maxRange <p>Maximum range which can be set using the navigator&#39;s handles.. Opposite of <a href="#xAxis.minRange">xAxis.minRange</a>.</p>
    * @param minorGridLineColor <p>Color of the minor, secondary grid lines.</p>. <p>In styled mode, the stroke width is given in the. <code>.highcharts-minor-grid-line</code> class.</p>
    * @param minorGridLineDashStyle <p>The dash or dot style of the minor grid lines. For possible values,. see <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.</p>
    * @param minorGridLineWidth <p>Width of the minor, secondary grid lines.</p>. <p>In styled mode, the stroke width is given in the. <code>.highcharts-grid-line</code> class.</p>
    * @param minorTickColor <p>Color for the minor tick marks.</p>
    * @param minorTickInterval <p>Specific tick interval in axis units for the minor ticks. On a linear. axis, if <code>&quot;auto&quot;</code>, the minor tick interval is calculated as a fifth. of the tickInterval. If <code>null</code> or <code>undefined</code>, minor ticks are not. shown.</p>. <p>On logarithmic axes, the unit is the power of the value. For example,. setting the minorTickInterval to 1 puts one tick on each of 0.1, 1,. 10, 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks. between 1 and 10, 10 and 100 etc.</p>. <p>If user settings dictate minor ticks to become too dense, they don&#39;t. make sense, and will be ignored to prevent performance problems.</p>
    * @param minorTickLength <p>The pixel length of the minor tick marks.</p>
    * @param minorTickPosition <p>The position of the minor tick marks relative to the axis line..  Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @param minorTickWidth <p>The pixel width of the minor tick mark.</p>
    * @param minorTicks <p>Enable or disable minor ticks. Unless. <a href="#xAxis.minorTickInterval">minorTickInterval</a> is set, the tick. interval is calculated as a fifth of the <code>tickInterval</code>.</p>. <p>On a logarithmic axis, minor ticks are laid out based on a best. guess, attempting to enter approximately 5 minor ticks between. each major tick.</p>. <p>Prior to v6.0.0, ticks were unabled in auto layout by setting. <code>minorTickInterval</code> to <code>&quot;auto&quot;</code>.</p>
    * @param ordinal <p>In an ordinal axis, the points are equally spaced in the chart. regardless of the actual time or x distance between them. This means. that missing data periods (e.g. nights or weekends for a stock chart). will not take up space in the chart.. Having <code>ordinal: false</code> will show any gaps created by the <code>gapSize</code>. setting proportionate to their duration.</p>. <p>In stock charts the X axis is ordinal by default, unless. the boost module is used and at least one of the series&#39; data length. exceeds the <a href="#series.line.boostThreshold">boostThreshold</a>.</p>. <p>For an ordinal axis, <code>minPadding</code> and <code>maxPadding</code> are ignored. Use. <a href="#xAxis.overscroll">overscroll</a> instead.</p>
    * @param overscroll <p>Additional range on the right side of the xAxis. Works similar to. <code>xAxis.maxPadding</code>, but value is set in milliseconds. Can be set for. both main <code>xAxis</code> and the navigator&#39;s <code>xAxis</code>.</p>
    * @param panningEnabled <p>Whether to pan axis. If <code>chart.panning</code> is enabled, the option. allows to disable panning on an individual axis.</p>
    * @param range <p>The zoomed range to display when only defining one or none of <code>min</code>. or <code>max</code>. For example, to show the latest month, a range of one month. can be set.</p>
    * @param showFirstLabel <p>Whether to show the first tick label.</p>
    * @param showLastLabel <p>Whether to show the last tick label. Defaults to <code>true</code> on cartesian. charts, and <code>false</code> on polar charts.</p>
    * @param softMax <p>A soft maximum for the axis. If the series data maximum is less than. this, the axis will stay at this maximum, but if the series data. maximum is higher, the axis will flex to show all data.</p>
    * @param softMin <p>A soft minimum for the axis. If the series data minimum is greater. than this, the axis will stay at this minimum, but if the series. data minimum is lower, the axis will flex to show all data.</p>
    * @param startOfWeek <p>For datetime axes, this decides where to put the tick between weeks..  0 = Sunday, 1 = Monday.</p>
    * @param tickAmount <p>The amount of ticks to draw on the axis. This opens up for aligning. the ticks of multiple charts or panes within a chart. This option. overrides the <code>tickPixelInterval</code> option.</p>. <p>This option only has an effect on linear axes. Datetime, logarithmic. or category axes are not affected.</p>
    * @param tickColor <p>Color for the main tick marks.</p>. <p>In styled mode, the stroke is given in the <code>.highcharts-tick</code>. class.</p>
    * @param tickPosition <p>The position of the major tick marks relative to the axis line.. Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @param tickPositioner <p>A callback function returning array defining where the ticks are. laid out on the axis. This overrides the default behaviour of. <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>. The automatic tick positions are accessible. through <code>this.tickPositions</code> and can be modified by the callback.</p>
    * @param tickPositions <p>An array defining where the ticks are laid out on the axis. This. overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.</p>
    * @param tickWidth <p>The pixel width of the major tick marks. Defaults to 0 on category. axes, otherwise 1.</p>. <p>In styled mode, the stroke width is given in the <code>.highcharts-tick</code>. class, but in order for the element to be generated on category axes,. the option must be explicitly set to 1.</p>
    * @param tickmarkPlacement <p>For categorized axes only. If <code>on</code> the tick mark is placed in the. center of the category, if <code>between</code> the tick mark is placed between. categories. The default is <code>between</code> if the <code>tickInterval</code> is 1, else. <code>on</code>.</p>
    * @param uniqueNames <p>Applies only when the axis <code>type</code> is <code>category</code>. When <code>uniqueNames</code>. is true, points are placed on the X axis according to their names.. If the same point name is repeated in the same or another series,. the point is placed on the same X position as other points of the. same name. When <code>uniqueNames</code> is false, the points are laid out in. increasing X positions regardless of their names, and the X axis. category will take the name of the last point in each position.</p>
    * @param units <p>Datetime axis only. An array determining what time intervals the. ticks are allowed to fall on. Each array item is an array where the. first value is the time unit and the second value another array of. allowed multiples.</p>. <p>Defaults to:</p>. <pre><code class="language-js">units: [[.     &#39;millisecond&#39;, // unit name.     [1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples. ], [.     &#39;second&#39;,.     [1, 2, 5, 10, 15, 30]. ], [.     &#39;minute&#39;,.     [1, 2, 5, 10, 15, 30]. ], [.     &#39;hour&#39;,.     [1, 2, 3, 4, 6, 8, 12]. ], [.     &#39;day&#39;,.     [1, 2]. ], [.     &#39;week&#39;,.     [1, 2]. ], [.     &#39;month&#39;,.     [1, 2, 3, 4, 6]. ], [.     &#39;year&#39;,.     null. ]]. </code></pre>
    * @param visible <p>Whether axis, including axis title, line, ticks and labels, should. be visible.</p>
    * @param zIndex <p>The Z index for the axis group.</p>
    */
  def apply(dataClassColor: js.UndefOr[String] = js.undefined, dataClasses: js.UndefOr[js.Array[js.Any]] = js.undefined, endOnTick: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, gridLineColor: js.UndefOr[String | js.Object] = js.undefined, gridLineWidth: js.UndefOr[Double] = js.undefined, labels: js.UndefOr[js.Any] = js.undefined, layout: js.UndefOr[js.UndefOr[String]] = js.undefined, marker: js.UndefOr[js.Any] = js.undefined, max: js.UndefOr[Double] = js.undefined, maxColor: js.UndefOr[String | js.Object] = js.undefined, maxPadding: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined, minColor: js.UndefOr[String | js.Object] = js.undefined, minPadding: js.UndefOr[Double] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, startOnTick: js.UndefOr[Boolean] = js.undefined, stops: js.UndefOr[js.Array[js.Array[js.Array[js.Any]]]] = js.undefined, tickInterval: js.UndefOr[Double] = js.undefined, tickLength: js.UndefOr[Double] = js.undefined, tickPixelInterval: js.UndefOr[Double] = js.undefined, `type`: js.UndefOr[String] = js.undefined, accessibility: js.UndefOr[js.Any] = js.undefined, angle: js.UndefOr[Double] = js.undefined, ceiling: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, currentDateIndicator: js.UndefOr[Boolean | js.Object] = js.undefined, floor: js.UndefOr[Double] = js.undefined, grid: js.UndefOr[js.Any] = js.undefined, gridLineDashStyle: js.UndefOr[String] = js.undefined, gridLineInterpolation: js.UndefOr[String] = js.undefined, gridZIndex: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, lineColor: js.UndefOr[js.Any] = js.undefined, margin: js.UndefOr[Double] = js.undefined, maxRange: js.UndefOr[Double] = js.undefined, minorGridLineColor: js.UndefOr[js.Any] = js.undefined, minorGridLineDashStyle: js.UndefOr[String] = js.undefined, minorGridLineWidth: js.UndefOr[Double] = js.undefined, minorTickColor: js.UndefOr[js.Any] = js.undefined, minorTickInterval: js.UndefOr[Double | String | Null] = js.undefined, minorTickLength: js.UndefOr[Double] = js.undefined, minorTickPosition: js.UndefOr[String] = js.undefined, minorTickWidth: js.UndefOr[Double] = js.undefined, minorTicks: js.UndefOr[Boolean] = js.undefined, ordinal: js.UndefOr[Boolean] = js.undefined, overscroll: js.UndefOr[Double] = js.undefined, panningEnabled: js.UndefOr[Boolean] = js.undefined, range: js.UndefOr[Double] = js.undefined, showFirstLabel: js.UndefOr[Boolean] = js.undefined, showLastLabel: js.UndefOr[Boolean] = js.undefined, softMax: js.UndefOr[Double] = js.undefined, softMin: js.UndefOr[Double] = js.undefined, startOfWeek: js.UndefOr[Double] = js.undefined, tickAmount: js.UndefOr[Double] = js.undefined, tickColor: js.UndefOr[js.Any] = js.undefined, tickPosition: js.UndefOr[String] = js.undefined, tickPositioner: js.UndefOr[js.Any] = js.undefined, tickPositions: js.UndefOr[js.Array[Double]] = js.undefined, tickWidth: js.UndefOr[js.UndefOr[Double]] = js.undefined, tickmarkPlacement: js.UndefOr[String] = js.undefined, uniqueNames: js.UndefOr[Boolean] = js.undefined, units: js.UndefOr[js.Array[js.Array[js.Array[js.Any]]]] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): ColorAxis = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ColorAxis {
      this.dataClassColor = dataClassColor
      this.dataClasses = dataClasses
      this.endOnTick = endOnTick
      this.events = events
      this.gridLineColor = gridLineColor
      this.gridLineWidth = gridLineWidth
      this.labels = labels
      this.layout = layout
      this.marker = marker
      this.max = max
      this.maxColor = maxColor
      this.maxPadding = maxPadding
      this.min = min
      this.minColor = minColor
      this.minPadding = minPadding
      this.reversed = reversed
      this.showInLegend = showInLegend
      this.startOnTick = startOnTick
      this.stops = stops
      this.tickInterval = tickInterval
      this.tickLength = tickLength
      this.tickPixelInterval = tickPixelInterval
      this.`type` = `type`
      this.accessibility = accessibility
      this.angle = angle
      this.ceiling = ceiling
      this.className = className
      this.currentDateIndicator = currentDateIndicator
      this.floor = floor
      this.grid = grid
      this.gridLineDashStyle = gridLineDashStyle
      this.gridLineInterpolation = gridLineInterpolation
      this.gridZIndex = gridZIndex
      this.id = id
      this.lineColor = lineColor
      this.margin = margin
      this.maxRange = maxRange
      this.minorGridLineColor = minorGridLineColor
      this.minorGridLineDashStyle = minorGridLineDashStyle
      this.minorGridLineWidth = minorGridLineWidth
      this.minorTickColor = minorTickColor
      this.minorTickInterval = minorTickInterval
      this.minorTickLength = minorTickLength
      this.minorTickPosition = minorTickPosition
      this.minorTickWidth = minorTickWidth
      this.minorTicks = minorTicks
      this.ordinal = ordinal
      this.overscroll = overscroll
      this.panningEnabled = panningEnabled
      this.range = range
      this.showFirstLabel = showFirstLabel
      this.showLastLabel = showLastLabel
      this.softMax = softMax
      this.softMin = softMin
      this.startOfWeek = startOfWeek
      this.tickAmount = tickAmount
      this.tickColor = tickColor
      this.tickPosition = tickPosition
      this.tickPositioner = tickPositioner
      this.tickPositions = tickPositions
      this.tickWidth = tickWidth
      this.tickmarkPlacement = tickmarkPlacement
      this.uniqueNames = uniqueNames
      this.units = units
      this.visible = visible
      this.zIndex = zIndex
    })
  }
}
