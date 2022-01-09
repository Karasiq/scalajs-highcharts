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
  * @note JavaScript name: <code>zAxis</code>
  */
class ZAxis extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Accessibility options for an axis. Requires the accessibility module.</p>
    * @since 7.1.0
    */
  var accessibility: js.Any = js.undefined

  /**
    * <p>When using multiple axis, the ticks of two or more opposite axes
    * will automatically be aligned by adding ticks to the axis or axes
    * with the least ticks, as if <code>tickAmount</code> were specified.</p>
    * <p>This can be prevented by setting <code>alignTicks</code> to false. If the grid
    * lines look messy, it&#39;s a good idea to hide them for the secondary
    * axis by setting <code>gridLineWidth</code> to 0.</p>
    * <p>If <code>startOnTick</code> or <code>endOnTick</code> in an Axis options are set to false,
    * then the <code>alignTicks </code> will be disabled for the Axis.</p>
    * <p>Disabled for logarithmic axes.</p>
    * @since 5.0.0
    */
  var alignTicks: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to allow decimals in this axis&#39; ticks. When counting
    * integers, like persons or hits on a web page, decimals should
    * be avoided in the labels. By default, decimals are allowed on small
    * scale axes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/allowdecimals-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/allowdecimals-false/">False</a>
    * @since 2.0.0
    */
  var allowDecimals: js.UndefOr[js.UndefOr[Boolean]] = js.undefined

  /**
    * <p>When using an alternate grid color, a band is painted across the
    * plot area between every other grid line.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/alternategridcolor/">Alternate grid color on the Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/alternategridcolor/">Alternate grid color on the Y axis</a>
    * @since 5.0.0
    */
  var alternateGridColor: js.Any = js.undefined

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
    * <p>If categories are present for the xAxis, names are used instead of
    * numbers for that axis.</p>
    * <p>Since Highcharts 3.0, categories can also
    * be extracted by giving each point a <a href="#series.data">name</a> and setting
    * axis <a href="#xAxis.type">type</a> to <code>category</code>. However, if you have multiple
    * series, best practice remains defining the <code>categories</code> array.</p>
    * <p>Example: <code>categories: [&#39;Apples&#39;, &#39;Bananas&#39;, &#39;Oranges&#39;]</code></p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/line-labels/">With</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/categories/">Without</a>
    * @since 5.0.0
    */
  var categories: js.UndefOr[js.Array[String]] = js.undefined

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
    * @since 5.0.0
    */
  var currentDateIndicator: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>For a datetime axis, the scale will automatically adjust to the
    * appropriate unit. This member gives the default string
    * representations used for each unit. For intermediate values,
    * different units may be used, for example the <code>day</code> unit can be used
    * on midnight and <code>hour</code> unit be used for intermediate values on the
    * same axis.</p>
    * <p>For an overview of the replacement codes, see
    * <a href="/class-reference/Highcharts.Time#dateFormat">dateFormat</a>.</p>
    * <p>Defaults to:</p>
    * <pre><code class="language-js">{
    *     millisecond: &#39;%H:%M:%S.%L&#39;,
    *     second: &#39;%H:%M:%S&#39;,
    *     minute: &#39;%H:%M&#39;,
    *     hour: &#39;%H:%M&#39;,
    *     day: &#39;%e. %b&#39;,
    *     week: &#39;%e. %b&#39;,
    *     month: &#39;%b \&#39;%y&#39;,
    *     year: &#39;%Y&#39;
    * }
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/grid-axis/date-time-label-formats">Gantt chart with custom axis date format.</a>
    * @since 5.0.0
    */
  var dateTimeLabelFormats: js.Any = js.undefined

  /**
    * <p>Whether to force the axis to end on a tick. Use this option with
    * the <code>maxPadding</code> option to control the axis end.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/endontick/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/endontick-false/">False</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/basic-line/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/endontick/">False</a>
    * @since 1.2.0
    */
  var endOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Event handlers for the axis.</p>
    * @since 5.0.0
    */
  var events: js.Any = js.undefined

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
    * <p>Color of the grid lines extending the ticks across the plot area.</p>
    * <p>In styled mode, the stroke is given in the <code>.highcharts-grid-line</code>
    * class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinecolor/">Green lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/gridlinecolor/">Green lines</a>
    * @since 5.0.0
    */
  var gridLineColor: js.Any = js.undefined

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
    * @since 5.0.0
    */
  var gridLineInterpolation: js.UndefOr[String] = js.undefined

  /**
    * <p>The width of the grid lines extending the ticks across the plot area.
    * Defaults to 1 on the Y axis and 0 on the X axis, except for 3d
    * charts.</p>
    * <p>In styled mode, the stroke width is given in the
    * <code>.highcharts-grid-line</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinewidth/">2px lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/gridlinewidth/">2px lines</a>
    * @since 5.0.0
    */
  var gridLineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The Z index of the grid lines.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/gridzindex/">A Z index of 4 renders the grid above the graph</a>
    * @since 5.0.0
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
    * <p>The axis labels show the number or category for each tick.</p>
    * <p>Since v8.0.0: Labels are animated in categorized x-axis with
    * updating data if <code>tickInterval</code> and <code>step</code> is set to 1.</p>
    * @since 5.0.0
    */
  var labels: js.Any = js.undefined

  /**
    * <p>Index of another axis that this axis is linked to. When an axis is
    * linked to a master axis, it will take the same extremes as
    * the master, but as assigned by min or max or by setExtremes.
    * It can be used to show additional info, or to ease reading the
    * chart by duplicating the scales.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/linkedto/">Different string formats of the same date</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/linkedto/">Y values on both sides</a>
    * @since 2.0.2
    */
  var linkedTo: js.UndefOr[Double] = js.undefined

  /**
    * <p>If there are multiple axes on the same side of the chart, the pixel
    * margin between the axes. Defaults to 0 on vertical axes, 15 on
    * horizontal axes.</p>
    * @since 7.0.3
    */
  var margin: js.UndefOr[Double] = js.undefined

  /**
    * <p>The maximum value of the axis. If <code>null</code>, the max value is
    * automatically calculated.</p>
    * <p>If the <a href="#yAxis.endOnTick">endOnTick</a> option is true, the <code>max</code> value
    * might be rounded up.</p>
    * <p>If a <a href="#yAxis.tickAmount">tickAmount</a> is set, the axis may be extended
    * beyond the set max in order to reach the given number of ticks. The
    * same may happen in a chart with multiple axes, determined by <a href="#chart">chart.
    * alignTicks</a>, where a <code>tickAmount</code> is applied internally.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/max-200/">Y axis max of 200</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/max-logarithmic/">Y axis max on logarithmic axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/min-max/">Fixed min and max on X axis</a>
    * @since 5.0.0
    */
  var max: js.UndefOr[Double | Null] = js.undefined

  /**
    * <p>Padding of the max value relative to the length of the axis. A
    * padding of 0.05 will make a 100px axis 5px longer. This is useful
    * when you don&#39;t want the highest data value to appear on the edge
    * of the plot area. When the axis&#39; <code>max</code> option is set or a max extreme
    * is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/maxpadding/">Max padding of 0.25 on y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minpadding-maxpadding/">Greater min- and maxPadding</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotbackgroundcolor-gradient/">Add some padding</a>
    * @since 1.2.0
    */
  var maxPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Maximum range which can be set using the navigator&#39;s handles.
    * Opposite of <a href="#xAxis.minRange">xAxis.minRange</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/maxrange/">Defined max and min range</a>
    * @since 6.0.0
    */
  var maxRange: js.UndefOr[Double] = js.undefined

  /**
    * <p>Deprecated. Use <code>minRange</code> instead.</p>
    * @since 5.0.0
    */
  var maxZoom: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimum value of the axis. If <code>null</code> the min value is
    * automatically calculated.</p>
    * <p>If the <a href="#yAxis.startOnTick">startOnTick</a> option is true (default),
    * the <code>min</code> value might be rounded down.</p>
    * <p>The automatically calculated minimum value is also affected by
    * <a href="#yAxis.floor">floor</a>, <a href="#yAxis.softMin">softMin</a>,
    * <a href="#yAxis.minPadding">minPadding</a>, <a href="#yAxis.minRange">minRange</a>
    * as well as <a href="#plotOptions.series.threshold">series.threshold</a>
    * and <a href="#plotOptions.series.softThreshold">series.softThreshold</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/min-startontick-false/">-50 with startOnTick to false</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/min-startontick-true/">-50 with startOnTick true by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/min-max/">Set min and max on X axis</a>
    * @since 5.0.0
    */
  var min: js.UndefOr[Double | Null] = js.undefined

  /**
    * <p>Padding of the min value relative to the length of the axis. A
    * padding of 0.05 will make a 100px axis 5px longer. This is useful
    * when you don&#39;t want the lowest data value to appear on the edge
    * of the plot area. When the axis&#39; <code>min</code> option is set or a min extreme
    * is set using <code>axis.setExtremes()</code>, the minPadding will be ignored.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minpadding/">Min padding of 0.2</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minpadding-maxpadding/">Greater min- and maxPadding</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotbackgroundcolor-gradient/">Add some padding</a>
    * @since 1.2.0
    */
  var minPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimum range to display on this axis. The entire axis will not
    * be allowed to span over a smaller interval than this. For example,
    * for a datetime axis the main unit is milliseconds. If minRange is
    * set to 3600000, you can&#39;t zoom in more than to one hour.</p>
    * <p>The default minRange for the x axis is five times the smallest
    * interval between any of the data points.</p>
    * <p>On a logarithmic axis, the unit for the minimum range is the power.
    * So a minRange of 1 means that the axis can be zoomed to 10-100,
    * 100-1000, 1000-10000 etc.</p>
    * <p><strong>Note</strong>: The <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and
    * <code>endOnTick</code> settings also affect how the extremes of the axis
    * are computed.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/minrange/">Minimum range of 5</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minrange/">Max zoom of 6 months overrides user selections</a>
    * @since 5.0.0
    */
  var minRange: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimum tick interval allowed in axis values. For example on
    * zooming in on an axis with daily data, this can be used to prevent
    * the axis from showing hours. Defaults to the closest distance between
    * two points on the axis.</p>
    * @since 2.3.0
    */
  var minTickInterval: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color of the minor, secondary grid lines.</p>
    * <p>In styled mode, the stroke width is given in the
    * <code>.highcharts-minor-grid-line</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorgridlinecolor/">Bright grey lines from Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorgridlinecolor/">Bright grey lines from Y axis</a>
    * @since 5.0.0
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
    * @since 5.0.0
    */
  var minorGridLineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color for the minor tick marks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickcolor/">Black tick marks on Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">Black tick marks on Y axis</a>
    * @since 5.0.0
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
    * @since 5.0.0
    */
  var minorTickInterval: js.UndefOr[Double | String | Null] = js.undefined

  /**
    * <p>The pixel length of the minor tick marks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorticklength/">10px on Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">10px on Y axis</a>
    * @since 5.0.0
    */
  var minorTickLength: js.UndefOr[Double] = js.undefined

  /**
    * <p>The position of the minor tick marks relative to the axis line.
    *  Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickposition-outside/">Outside by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickposition-inside/">Inside</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">Inside</a>
    * @since 5.0.0
    */
  var minorTickPosition: js.UndefOr[String] = js.undefined

  /**
    * <p>The pixel width of the minor tick mark.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickwidth/">3px width</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">1px width</a>
    * @since 5.0.0
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
    * <p>The distance in pixels from the plot area to the axis line.
    * A positive offset moves the axis with it&#39;s line, labels and ticks
    * away from the plot area. This is typically used when two or more
    * axes are displayed on the same side of the plot. With multiple
    * axes the offset is dynamically adjusted to avoid collision, this
    * can be overridden by setting offset explicitly.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/offset/">Y axis offset of 70</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/offset-centered/">Axes positioned in the center of the plot</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/offset/">Y axis offset by 70 px</a>
    * @since 5.0.0
    */
  var offset: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to display the axis on the opposite side of the normal. The
    * normal is on the left side for vertical axes and bottom for
    * horizontal, so the opposite sides will be right and top respectively.
    * This is typically used with dual or multiple axes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/opposite/">Secondary Y axis opposite</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/opposite/">Y axis on left side</a>
    * @since 5.0.0
    */
  var opposite: js.UndefOr[Boolean] = js.undefined

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
    * <p>Refers to the index in the <a href="#panes">panes</a> array. Used for circular
    * gauges and polar charts. When the option is not set then first pane
    * will be used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter">Two gauges with different center</a>
    * @since 5.0.0
    */
  var pane: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to pan axis. If <code>chart.panning</code> is enabled, the option
    * allows to disable panning on an individual axis.</p>
    * @since 5.0.0
    */
  var panningEnabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>An array of colored bands stretching across the plot area marking an
    * interval on the axis.</p>
    * <p>In styled mode, the plot bands are styled by the <code>.highcharts-plot-band</code>
    * class in addition to the <code>className</code> option.</p>
    * @since 5.0.0
    */
  var plotBands: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>An array of lines stretching across the plot area, marking a specific
    * value on one of the axes.</p>
    * <p>In styled mode, the plot lines are styled by the
    * <code>.highcharts-plot-line</code> class in addition to the <code>className</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">Basic plot line</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-solidgauge/labels-auto-aligned/">Solid gauge plot line</a>
    * @since 5.0.0
    */
  var plotLines: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>The zoomed range to display when only defining one or none of <code>min</code>
    * or <code>max</code>. For example, to show the latest month, a range of one month
    * can be set.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/range/">Setting a zoomed range when the rangeSelector is disabled</a>
    * @since 5.0.0
    */
  var range: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to reverse the axis so that the highest number is closest
    * to the origin. If the chart is inverted, the x axis is reversed by
    * default.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/reversed/">Reversed Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/reversed/">Reversed Y axis</a>
    * @since 5.0.0
    */
  var reversed: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>This option determines how stacks should be ordered within a group.
    * For example reversed xAxis also reverses stacks, so first series
    * comes last in a group. To keep order like for non-reversed xAxis
    * enable this option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/reversedstacks/">Reversed stacks comparison</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/reversedstacks/">Reversed stacks comparison</a>
    * @since 6.1.1
    */
  var reversedStacks: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>An optional scrollbar to display on the X axis in response to
    * limiting the minimum and maximum of the axis values.</p>
    * <p>In styled mode, all the presentational options for the scrollbar are
    * replaced by the classes <code>.highcharts-scrollbar-thumb</code>,
    * <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,
    * <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/heatmap-scrollbars/">Heatmap with both scrollbars</a>
    * @since 4.2.6
    */
  var scrollbar: js.UndefOr[CleanJsObject[ZAxisScrollbar]] = js.undefined

  /**
    * <p>Whether to show the first tick label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/showfirstlabel-false/">Set to false on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/showfirstlabel/">Labels below plot lines on Y axis</a>
    * @since 5.0.0
    */
  var showFirstLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to show the last tick label. Defaults to <code>true</code> on cartesian
    * charts, and <code>false</code> on polar charts.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/showlastlabel-true/">Set to true on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/showfirstlabel/">Labels below plot lines on Y axis</a>
    * @since 5.0.0
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
    * @since 5.0.0
    */
  var startOfWeek: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to force the axis to start on a tick. Use this option with
    * the <code>minPadding</code> option to control the axis start.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-false/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-true/">True</a>
    * @since 1.2.0
    */
  var startOnTick: js.UndefOr[Boolean] = js.undefined

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
    * @since 5.0.0
    */
  var tickColor: js.Any = js.undefined

  /**
    * <p>The interval of the tick marks in axis units. When <code>undefined</code>, the
    * tick interval is computed to approximately follow the
    * <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> on linear and datetime
    * axes. On categorized axes, a <code>undefined</code> tickInterval will default to
    * 1, one category. Note that datetime axes are based on milliseconds,
    * so for example an interval of one day is expressed as
    * <code>24 * 3600 * 1000</code>.</p>
    * <p>On logarithmic axes, the tickInterval is based on powers, so a
    * tickInterval of 1 means one tick on each of 0.1, 1, 10, 100 etc. A
    * tickInterval of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval
    * of 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20,
    * 40 etc.</p>
    * <p>If the tickInterval is too dense for labels to be drawn, Highcharts
    * may remove ticks.</p>
    * <p>If the chart has multiple axes, the <a href="#chart.alignTicks">alignTicks</a>
    * option may interfere with the <code>tickInterval</code> setting.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickinterval-5/">Tick interval of 5 on a linear axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/tickinterval/">Tick interval of 0.01 on Y axis</a>
    * @since 5.0.0
    */
  var tickInterval: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel length of the main tick marks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/ticklength/">20 px tick length on the X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/">Formatted ticks on X axis</a>
    * @since 5.0.0
    */
  var tickLength: js.UndefOr[Double] = js.undefined

  /**
    * <p>If tickInterval is <code>null</code> this option sets the approximate pixel
    * interval of the tick marks. Not applicable to categorized axis.</p>
    * <p>The tick interval is also influenced by the <a href="#xAxis.minTickInterval">minTickInterval</a> option, that, by default prevents ticks from
    * being denser than the data points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpixelinterval-50/">50 px on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/tickpixelinterval/">200 px on X axis</a>
    * @since 5.0.0
    */
  var tickPixelInterval: js.UndefOr[Double] = js.undefined

  /**
    * <p>The position of the major tick marks relative to the axis line.
    * Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickposition-outside/">"outside" by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickposition-inside/">"inside"</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/">Formatted ticks on X axis</a>
    * @since 5.0.0
    */
  var tickPosition: js.UndefOr[String] = js.undefined

  /**
    * <p>A callback function returning array defining where the ticks are
    * laid out on the axis. This overrides the default behaviour of
    * <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>. The automatic tick positions are accessible
    * through <code>this.tickPositions</code> and can be modified by the callback.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
    * @since 5.0.0
    */
  var tickPositioner: js.Any = js.undefined

  /**
    * <p>An array defining where the ticks are laid out on the axis. This
    * overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
    * @since 5.0.0
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
    * @since 5.0.0
    */
  var tickWidth: js.UndefOr[js.UndefOr[Double]] = js.undefined

  /**
    * <p>For categorized axes only. If <code>on</code> the tick mark is placed in the
    * center of the category, if <code>between</code> the tick mark is placed between
    * categories. The default is <code>between</code> if the <code>tickInterval</code> is 1, else
    * <code>on</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickmarkplacement-between/">"between" by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickmarkplacement-on/">"on"</a>
    * @since 5.0.0
    */
  var tickmarkPlacement: js.UndefOr[String] = js.undefined

  /**
    * <p>The axis title, showing next to the axis line.</p>
    * @since 5.0.0
    */
  var title: js.Any = js.undefined

  /**
    * <p>The type of axis. Can be one of <code>linear</code>, <code>logarithmic</code>, <code>datetime</code>
    * or <code>category</code>. In a datetime axis, the numbers are given in
    * milliseconds, and tick marks are placed on appropriate values like
    * full hours or days. In a category axis, the
    * <a href="#series.line.data.name">point names</a> of the chart&#39;s series are used
    * for categories, if not a <a href="#xAxis.categories">categories</a> array is
    * defined.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/type-linear/">Linear</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log/">Logarithmic</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log-minorgrid/">Logarithmic with minor grid lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/type-log-both/">Logarithmic on two axes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log-negative/">Logarithmic with extension to emulate negative values</a>
    * @since 5.0.0
    */
  var `type`: js.Any = js.undefined

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
    * @since 5.0.0
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
    * @since 5.0.0
    */
  var zIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to zoom axis. If <code>chart.zoomType</code> is set, the option allows
    * to disable zooming on an individual axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/zoomenabled/">Zoom enabled is false</a>
    * @since 5.0.0
    */
  var zoomEnabled: js.UndefOr[Boolean] = js.undefined
}

object ZAxis {
  /**
    * @param accessibility <p>Accessibility options for an axis. Requires the accessibility module.</p>
    * @param alignTicks <p>When using multiple axis, the ticks of two or more opposite axes. will automatically be aligned by adding ticks to the axis or axes. with the least ticks, as if <code>tickAmount</code> were specified.</p>. <p>This can be prevented by setting <code>alignTicks</code> to false. If the grid. lines look messy, it&#39;s a good idea to hide them for the secondary. axis by setting <code>gridLineWidth</code> to 0.</p>. <p>If <code>startOnTick</code> or <code>endOnTick</code> in an Axis options are set to false,. then the <code>alignTicks </code> will be disabled for the Axis.</p>. <p>Disabled for logarithmic axes.</p>
    * @param allowDecimals <p>Whether to allow decimals in this axis&#39; ticks. When counting. integers, like persons or hits on a web page, decimals should. be avoided in the labels. By default, decimals are allowed on small. scale axes.</p>
    * @param alternateGridColor <p>When using an alternate grid color, a band is painted across the. plot area between every other grid line.</p>
    * @param angle <p>In a polar chart, this is the angle of the Y axis in degrees, where. 0 is up and 90 is right. The angle determines the position of the. axis line and the labels, though the coordinate system is unaffected.. Since v8.0.0 this option is also applicable for X axis (inverted. polar).</p>
    * @param categories <p>If categories are present for the xAxis, names are used instead of. numbers for that axis.</p>. <p>Since Highcharts 3.0, categories can also. be extracted by giving each point a <a href="#series.data">name</a> and setting. axis <a href="#xAxis.type">type</a> to <code>category</code>. However, if you have multiple. series, best practice remains defining the <code>categories</code> array.</p>. <p>Example: <code>categories: [&#39;Apples&#39;, &#39;Bananas&#39;, &#39;Oranges&#39;]</code></p>
    * @param ceiling <p>The highest allowed value for automatically computed axis extremes.</p>
    * @param className <p>A class name that opens for styling the axis by CSS, especially in. Highcharts styled mode. The class name is applied to group elements. for the grid, axis elements and labels.</p>
    * @param currentDateIndicator <p>Show an indicator on the axis for the current date and time. Can be a. boolean or a configuration object similar to. <a href="#xAxis.plotLines">xAxis.plotLines</a>.</p>
    * @param dateTimeLabelFormats <p>For a datetime axis, the scale will automatically adjust to the. appropriate unit. This member gives the default string. representations used for each unit. For intermediate values,. different units may be used, for example the <code>day</code> unit can be used. on midnight and <code>hour</code> unit be used for intermediate values on the. same axis.</p>. <p>For an overview of the replacement codes, see. <a href="/class-reference/Highcharts.Time#dateFormat">dateFormat</a>.</p>. <p>Defaults to:</p>. <pre><code class="language-js">{.     millisecond: &#39;%H:%M:%S.%L&#39;,.     second: &#39;%H:%M:%S&#39;,.     minute: &#39;%H:%M&#39;,.     hour: &#39;%H:%M&#39;,.     day: &#39;%e. %b&#39;,.     week: &#39;%e. %b&#39;,.     month: &#39;%b \&#39;%y&#39;,.     year: &#39;%Y&#39;. }. </code></pre>
    * @param endOnTick <p>Whether to force the axis to end on a tick. Use this option with. the <code>maxPadding</code> option to control the axis end.</p>
    * @param events <p>Event handlers for the axis.</p>
    * @param floor <p>The lowest allowed value for automatically computed axis extremes.</p>
    * @param grid <p>Set grid options for the axis labels. Requires Highcharts Gantt.</p>
    * @param gridLineColor <p>Color of the grid lines extending the ticks across the plot area.</p>. <p>In styled mode, the stroke is given in the <code>.highcharts-grid-line</code>. class.</p>
    * @param gridLineDashStyle <p>The dash or dot style of the grid lines. For possible values, see. <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.</p>
    * @param gridLineInterpolation <p>Polar charts only. Whether the grid lines should draw as a polygon. with straight lines between categories, or as circles. Can be either. <code>circle</code> or <code>polygon</code>. Since v8.0.0 this option is also applicable. for X axis (inverted polar).</p>
    * @param gridLineWidth <p>The width of the grid lines extending the ticks across the plot area.. Defaults to 1 on the Y axis and 0 on the X axis, except for 3d. charts.</p>. <p>In styled mode, the stroke width is given in the. <code>.highcharts-grid-line</code> class.</p>
    * @param gridZIndex <p>The Z index of the grid lines.</p>
    * @param id <p>An id for the axis. This can be used after render time to get. a pointer to the axis object through <code>chart.get()</code>.</p>
    * @param labels <p>The axis labels show the number or category for each tick.</p>. <p>Since v8.0.0: Labels are animated in categorized x-axis with. updating data if <code>tickInterval</code> and <code>step</code> is set to 1.</p>
    * @param linkedTo <p>Index of another axis that this axis is linked to. When an axis is. linked to a master axis, it will take the same extremes as. the master, but as assigned by min or max or by setExtremes.. It can be used to show additional info, or to ease reading the. chart by duplicating the scales.</p>
    * @param margin <p>If there are multiple axes on the same side of the chart, the pixel. margin between the axes. Defaults to 0 on vertical axes, 15 on. horizontal axes.</p>
    * @param max <p>The maximum value of the axis. If <code>null</code>, the max value is. automatically calculated.</p>. <p>If the <a href="#yAxis.endOnTick">endOnTick</a> option is true, the <code>max</code> value. might be rounded up.</p>. <p>If a <a href="#yAxis.tickAmount">tickAmount</a> is set, the axis may be extended. beyond the set max in order to reach the given number of ticks. The. same may happen in a chart with multiple axes, determined by <a href="#chart">chart.. alignTicks</a>, where a <code>tickAmount</code> is applied internally.</p>
    * @param maxPadding <p>Padding of the max value relative to the length of the axis. A. padding of 0.05 will make a 100px axis 5px longer. This is useful. when you don&#39;t want the highest data value to appear on the edge. of the plot area. When the axis&#39; <code>max</code> option is set or a max extreme. is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.</p>
    * @param maxRange <p>Maximum range which can be set using the navigator&#39;s handles.. Opposite of <a href="#xAxis.minRange">xAxis.minRange</a>.</p>
    * @param maxZoom <p>Deprecated. Use <code>minRange</code> instead.</p>
    * @param min <p>The minimum value of the axis. If <code>null</code> the min value is. automatically calculated.</p>. <p>If the <a href="#yAxis.startOnTick">startOnTick</a> option is true (default),. the <code>min</code> value might be rounded down.</p>. <p>The automatically calculated minimum value is also affected by. <a href="#yAxis.floor">floor</a>, <a href="#yAxis.softMin">softMin</a>,. <a href="#yAxis.minPadding">minPadding</a>, <a href="#yAxis.minRange">minRange</a>. as well as <a href="#plotOptions.series.threshold">series.threshold</a>. and <a href="#plotOptions.series.softThreshold">series.softThreshold</a>.</p>
    * @param minPadding <p>Padding of the min value relative to the length of the axis. A. padding of 0.05 will make a 100px axis 5px longer. This is useful. when you don&#39;t want the lowest data value to appear on the edge. of the plot area. When the axis&#39; <code>min</code> option is set or a min extreme. is set using <code>axis.setExtremes()</code>, the minPadding will be ignored.</p>
    * @param minRange <p>The minimum range to display on this axis. The entire axis will not. be allowed to span over a smaller interval than this. For example,. for a datetime axis the main unit is milliseconds. If minRange is. set to 3600000, you can&#39;t zoom in more than to one hour.</p>. <p>The default minRange for the x axis is five times the smallest. interval between any of the data points.</p>. <p>On a logarithmic axis, the unit for the minimum range is the power.. So a minRange of 1 means that the axis can be zoomed to 10-100,. 100-1000, 1000-10000 etc.</p>. <p><strong>Note</strong>: The <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and. <code>endOnTick</code> settings also affect how the extremes of the axis. are computed.</p>
    * @param minTickInterval <p>The minimum tick interval allowed in axis values. For example on. zooming in on an axis with daily data, this can be used to prevent. the axis from showing hours. Defaults to the closest distance between. two points on the axis.</p>
    * @param minorGridLineColor <p>Color of the minor, secondary grid lines.</p>. <p>In styled mode, the stroke width is given in the. <code>.highcharts-minor-grid-line</code> class.</p>
    * @param minorGridLineDashStyle <p>The dash or dot style of the minor grid lines. For possible values,. see <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.</p>
    * @param minorGridLineWidth <p>Width of the minor, secondary grid lines.</p>. <p>In styled mode, the stroke width is given in the. <code>.highcharts-grid-line</code> class.</p>
    * @param minorTickColor <p>Color for the minor tick marks.</p>
    * @param minorTickInterval <p>Specific tick interval in axis units for the minor ticks. On a linear. axis, if <code>&quot;auto&quot;</code>, the minor tick interval is calculated as a fifth. of the tickInterval. If <code>null</code> or <code>undefined</code>, minor ticks are not. shown.</p>. <p>On logarithmic axes, the unit is the power of the value. For example,. setting the minorTickInterval to 1 puts one tick on each of 0.1, 1,. 10, 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks. between 1 and 10, 10 and 100 etc.</p>. <p>If user settings dictate minor ticks to become too dense, they don&#39;t. make sense, and will be ignored to prevent performance problems.</p>
    * @param minorTickLength <p>The pixel length of the minor tick marks.</p>
    * @param minorTickPosition <p>The position of the minor tick marks relative to the axis line..  Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @param minorTickWidth <p>The pixel width of the minor tick mark.</p>
    * @param minorTicks <p>Enable or disable minor ticks. Unless. <a href="#xAxis.minorTickInterval">minorTickInterval</a> is set, the tick. interval is calculated as a fifth of the <code>tickInterval</code>.</p>. <p>On a logarithmic axis, minor ticks are laid out based on a best. guess, attempting to enter approximately 5 minor ticks between. each major tick.</p>. <p>Prior to v6.0.0, ticks were unabled in auto layout by setting. <code>minorTickInterval</code> to <code>&quot;auto&quot;</code>.</p>
    * @param offset <p>The distance in pixels from the plot area to the axis line.. A positive offset moves the axis with it&#39;s line, labels and ticks. away from the plot area. This is typically used when two or more. axes are displayed on the same side of the plot. With multiple. axes the offset is dynamically adjusted to avoid collision, this. can be overridden by setting offset explicitly.</p>
    * @param opposite <p>Whether to display the axis on the opposite side of the normal. The. normal is on the left side for vertical axes and bottom for. horizontal, so the opposite sides will be right and top respectively.. This is typically used with dual or multiple axes.</p>
    * @param ordinal <p>In an ordinal axis, the points are equally spaced in the chart. regardless of the actual time or x distance between them. This means. that missing data periods (e.g. nights or weekends for a stock chart). will not take up space in the chart.. Having <code>ordinal: false</code> will show any gaps created by the <code>gapSize</code>. setting proportionate to their duration.</p>. <p>In stock charts the X axis is ordinal by default, unless. the boost module is used and at least one of the series&#39; data length. exceeds the <a href="#series.line.boostThreshold">boostThreshold</a>.</p>. <p>For an ordinal axis, <code>minPadding</code> and <code>maxPadding</code> are ignored. Use. <a href="#xAxis.overscroll">overscroll</a> instead.</p>
    * @param overscroll <p>Additional range on the right side of the xAxis. Works similar to. <code>xAxis.maxPadding</code>, but value is set in milliseconds. Can be set for. both main <code>xAxis</code> and the navigator&#39;s <code>xAxis</code>.</p>
    * @param pane <p>Refers to the index in the <a href="#panes">panes</a> array. Used for circular. gauges and polar charts. When the option is not set then first pane. will be used.</p>
    * @param panningEnabled <p>Whether to pan axis. If <code>chart.panning</code> is enabled, the option. allows to disable panning on an individual axis.</p>
    * @param plotBands <p>An array of colored bands stretching across the plot area marking an. interval on the axis.</p>. <p>In styled mode, the plot bands are styled by the <code>.highcharts-plot-band</code>. class in addition to the <code>className</code> option.</p>
    * @param plotLines <p>An array of lines stretching across the plot area, marking a specific. value on one of the axes.</p>. <p>In styled mode, the plot lines are styled by the. <code>.highcharts-plot-line</code> class in addition to the <code>className</code> option.</p>
    * @param range <p>The zoomed range to display when only defining one or none of <code>min</code>. or <code>max</code>. For example, to show the latest month, a range of one month. can be set.</p>
    * @param reversed <p>Whether to reverse the axis so that the highest number is closest. to the origin. If the chart is inverted, the x axis is reversed by. default.</p>
    * @param reversedStacks <p>This option determines how stacks should be ordered within a group.. For example reversed xAxis also reverses stacks, so first series. comes last in a group. To keep order like for non-reversed xAxis. enable this option.</p>
    * @param scrollbar <p>An optional scrollbar to display on the X axis in response to. limiting the minimum and maximum of the axis values.</p>. <p>In styled mode, all the presentational options for the scrollbar are. replaced by the classes <code>.highcharts-scrollbar-thumb</code>,. <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,. <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.</p>
    * @param showFirstLabel <p>Whether to show the first tick label.</p>
    * @param showLastLabel <p>Whether to show the last tick label. Defaults to <code>true</code> on cartesian. charts, and <code>false</code> on polar charts.</p>
    * @param softMax <p>A soft maximum for the axis. If the series data maximum is less than. this, the axis will stay at this maximum, but if the series data. maximum is higher, the axis will flex to show all data.</p>
    * @param softMin <p>A soft minimum for the axis. If the series data minimum is greater. than this, the axis will stay at this minimum, but if the series. data minimum is lower, the axis will flex to show all data.</p>
    * @param startOfWeek <p>For datetime axes, this decides where to put the tick between weeks..  0 = Sunday, 1 = Monday.</p>
    * @param startOnTick <p>Whether to force the axis to start on a tick. Use this option with. the <code>minPadding</code> option to control the axis start.</p>
    * @param tickAmount <p>The amount of ticks to draw on the axis. This opens up for aligning. the ticks of multiple charts or panes within a chart. This option. overrides the <code>tickPixelInterval</code> option.</p>. <p>This option only has an effect on linear axes. Datetime, logarithmic. or category axes are not affected.</p>
    * @param tickColor <p>Color for the main tick marks.</p>. <p>In styled mode, the stroke is given in the <code>.highcharts-tick</code>. class.</p>
    * @param tickInterval <p>The interval of the tick marks in axis units. When <code>undefined</code>, the. tick interval is computed to approximately follow the. <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> on linear and datetime. axes. On categorized axes, a <code>undefined</code> tickInterval will default to. 1, one category. Note that datetime axes are based on milliseconds,. so for example an interval of one day is expressed as. <code>24 * 3600 * 1000</code>.</p>. <p>On logarithmic axes, the tickInterval is based on powers, so a. tickInterval of 1 means one tick on each of 0.1, 1, 10, 100 etc. A. tickInterval of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval. of 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20,. 40 etc.</p>. <p>If the tickInterval is too dense for labels to be drawn, Highcharts. may remove ticks.</p>. <p>If the chart has multiple axes, the <a href="#chart.alignTicks">alignTicks</a>. option may interfere with the <code>tickInterval</code> setting.</p>
    * @param tickLength <p>The pixel length of the main tick marks.</p>
    * @param tickPixelInterval <p>If tickInterval is <code>null</code> this option sets the approximate pixel. interval of the tick marks. Not applicable to categorized axis.</p>. <p>The tick interval is also influenced by the <a href="#xAxis.minTickInterval">minTickInterval</a> option, that, by default prevents ticks from. being denser than the data points.</p>
    * @param tickPosition <p>The position of the major tick marks relative to the axis line.. Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @param tickPositioner <p>A callback function returning array defining where the ticks are. laid out on the axis. This overrides the default behaviour of. <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>. The automatic tick positions are accessible. through <code>this.tickPositions</code> and can be modified by the callback.</p>
    * @param tickPositions <p>An array defining where the ticks are laid out on the axis. This. overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.</p>
    * @param tickWidth <p>The pixel width of the major tick marks. Defaults to 0 on category. axes, otherwise 1.</p>. <p>In styled mode, the stroke width is given in the <code>.highcharts-tick</code>. class, but in order for the element to be generated on category axes,. the option must be explicitly set to 1.</p>
    * @param tickmarkPlacement <p>For categorized axes only. If <code>on</code> the tick mark is placed in the. center of the category, if <code>between</code> the tick mark is placed between. categories. The default is <code>between</code> if the <code>tickInterval</code> is 1, else. <code>on</code>.</p>
    * @param title <p>The axis title, showing next to the axis line.</p>
    * @param `type` <p>The type of axis. Can be one of <code>linear</code>, <code>logarithmic</code>, <code>datetime</code>. or <code>category</code>. In a datetime axis, the numbers are given in. milliseconds, and tick marks are placed on appropriate values like. full hours or days. In a category axis, the. <a href="#series.line.data.name">point names</a> of the chart&#39;s series are used. for categories, if not a <a href="#xAxis.categories">categories</a> array is. defined.</p>
    * @param uniqueNames <p>Applies only when the axis <code>type</code> is <code>category</code>. When <code>uniqueNames</code>. is true, points are placed on the X axis according to their names.. If the same point name is repeated in the same or another series,. the point is placed on the same X position as other points of the. same name. When <code>uniqueNames</code> is false, the points are laid out in. increasing X positions regardless of their names, and the X axis. category will take the name of the last point in each position.</p>
    * @param units <p>Datetime axis only. An array determining what time intervals the. ticks are allowed to fall on. Each array item is an array where the. first value is the time unit and the second value another array of. allowed multiples.</p>. <p>Defaults to:</p>. <pre><code class="language-js">units: [[.     &#39;millisecond&#39;, // unit name.     [1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples. ], [.     &#39;second&#39;,.     [1, 2, 5, 10, 15, 30]. ], [.     &#39;minute&#39;,.     [1, 2, 5, 10, 15, 30]. ], [.     &#39;hour&#39;,.     [1, 2, 3, 4, 6, 8, 12]. ], [.     &#39;day&#39;,.     [1, 2]. ], [.     &#39;week&#39;,.     [1, 2]. ], [.     &#39;month&#39;,.     [1, 2, 3, 4, 6]. ], [.     &#39;year&#39;,.     null. ]]. </code></pre>
    * @param visible <p>Whether axis, including axis title, line, ticks and labels, should. be visible.</p>
    * @param zIndex <p>The Z index for the axis group.</p>
    * @param zoomEnabled <p>Whether to zoom axis. If <code>chart.zoomType</code> is set, the option allows. to disable zooming on an individual axis.</p>
    */
  def apply(accessibility: js.UndefOr[js.Any] = js.undefined, alignTicks: js.UndefOr[Boolean] = js.undefined, allowDecimals: js.UndefOr[js.UndefOr[Boolean]] = js.undefined, alternateGridColor: js.UndefOr[js.Any] = js.undefined, angle: js.UndefOr[Double] = js.undefined, categories: js.UndefOr[js.Array[String]] = js.undefined, ceiling: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, currentDateIndicator: js.UndefOr[Boolean | js.Object] = js.undefined, dateTimeLabelFormats: js.UndefOr[js.Any] = js.undefined, endOnTick: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, floor: js.UndefOr[Double] = js.undefined, grid: js.UndefOr[js.Any] = js.undefined, gridLineColor: js.UndefOr[js.Any] = js.undefined, gridLineDashStyle: js.UndefOr[String] = js.undefined, gridLineInterpolation: js.UndefOr[String] = js.undefined, gridLineWidth: js.UndefOr[Double] = js.undefined, gridZIndex: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, labels: js.UndefOr[js.Any] = js.undefined, linkedTo: js.UndefOr[Double] = js.undefined, margin: js.UndefOr[Double] = js.undefined, max: js.UndefOr[Double | Null] = js.undefined, maxPadding: js.UndefOr[Double] = js.undefined, maxRange: js.UndefOr[Double] = js.undefined, maxZoom: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double | Null] = js.undefined, minPadding: js.UndefOr[Double] = js.undefined, minRange: js.UndefOr[Double] = js.undefined, minTickInterval: js.UndefOr[Double] = js.undefined, minorGridLineColor: js.UndefOr[js.Any] = js.undefined, minorGridLineDashStyle: js.UndefOr[String] = js.undefined, minorGridLineWidth: js.UndefOr[Double] = js.undefined, minorTickColor: js.UndefOr[js.Any] = js.undefined, minorTickInterval: js.UndefOr[Double | String | Null] = js.undefined, minorTickLength: js.UndefOr[Double] = js.undefined, minorTickPosition: js.UndefOr[String] = js.undefined, minorTickWidth: js.UndefOr[Double] = js.undefined, minorTicks: js.UndefOr[Boolean] = js.undefined, offset: js.UndefOr[Double] = js.undefined, opposite: js.UndefOr[Boolean] = js.undefined, ordinal: js.UndefOr[Boolean] = js.undefined, overscroll: js.UndefOr[Double] = js.undefined, pane: js.UndefOr[Double] = js.undefined, panningEnabled: js.UndefOr[Boolean] = js.undefined, plotBands: js.UndefOr[js.Array[js.Any]] = js.undefined, plotLines: js.UndefOr[js.Array[js.Any]] = js.undefined, range: js.UndefOr[Double] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined, reversedStacks: js.UndefOr[Boolean] = js.undefined, scrollbar: js.UndefOr[CleanJsObject[ZAxisScrollbar]] = js.undefined, showFirstLabel: js.UndefOr[Boolean] = js.undefined, showLastLabel: js.UndefOr[Boolean] = js.undefined, softMax: js.UndefOr[Double] = js.undefined, softMin: js.UndefOr[Double] = js.undefined, startOfWeek: js.UndefOr[Double] = js.undefined, startOnTick: js.UndefOr[Boolean] = js.undefined, tickAmount: js.UndefOr[Double] = js.undefined, tickColor: js.UndefOr[js.Any] = js.undefined, tickInterval: js.UndefOr[Double] = js.undefined, tickLength: js.UndefOr[Double] = js.undefined, tickPixelInterval: js.UndefOr[Double] = js.undefined, tickPosition: js.UndefOr[String] = js.undefined, tickPositioner: js.UndefOr[js.Any] = js.undefined, tickPositions: js.UndefOr[js.Array[Double]] = js.undefined, tickWidth: js.UndefOr[js.UndefOr[Double]] = js.undefined, tickmarkPlacement: js.UndefOr[String] = js.undefined, title: js.UndefOr[js.Any] = js.undefined, `type`: js.UndefOr[js.Any] = js.undefined, uniqueNames: js.UndefOr[Boolean] = js.undefined, units: js.UndefOr[js.Array[js.Array[js.Array[js.Any]]]] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, zoomEnabled: js.UndefOr[Boolean] = js.undefined): ZAxis = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ZAxis {
      this.accessibility = accessibility
      this.alignTicks = alignTicks
      this.allowDecimals = allowDecimals
      this.alternateGridColor = alternateGridColor
      this.angle = angle
      this.categories = categories
      this.ceiling = ceiling
      this.className = className
      this.currentDateIndicator = currentDateIndicator
      this.dateTimeLabelFormats = dateTimeLabelFormats
      this.endOnTick = endOnTick
      this.events = events
      this.floor = floor
      this.grid = grid
      this.gridLineColor = gridLineColor
      this.gridLineDashStyle = gridLineDashStyle
      this.gridLineInterpolation = gridLineInterpolation
      this.gridLineWidth = gridLineWidth
      this.gridZIndex = gridZIndex
      this.id = id
      this.labels = labels
      this.linkedTo = linkedTo
      this.margin = margin
      this.max = max
      this.maxPadding = maxPadding
      this.maxRange = maxRange
      this.maxZoom = maxZoom
      this.min = min
      this.minPadding = minPadding
      this.minRange = minRange
      this.minTickInterval = minTickInterval
      this.minorGridLineColor = minorGridLineColor
      this.minorGridLineDashStyle = minorGridLineDashStyle
      this.minorGridLineWidth = minorGridLineWidth
      this.minorTickColor = minorTickColor
      this.minorTickInterval = minorTickInterval
      this.minorTickLength = minorTickLength
      this.minorTickPosition = minorTickPosition
      this.minorTickWidth = minorTickWidth
      this.minorTicks = minorTicks
      this.offset = offset
      this.opposite = opposite
      this.ordinal = ordinal
      this.overscroll = overscroll
      this.pane = pane
      this.panningEnabled = panningEnabled
      this.plotBands = plotBands
      this.plotLines = plotLines
      this.range = range
      this.reversed = reversed
      this.reversedStacks = reversedStacks
      this.scrollbar = scrollbar
      this.showFirstLabel = showFirstLabel
      this.showLastLabel = showLastLabel
      this.softMax = softMax
      this.softMin = softMin
      this.startOfWeek = startOfWeek
      this.startOnTick = startOnTick
      this.tickAmount = tickAmount
      this.tickColor = tickColor
      this.tickInterval = tickInterval
      this.tickLength = tickLength
      this.tickPixelInterval = tickPixelInterval
      this.tickPosition = tickPosition
      this.tickPositioner = tickPositioner
      this.tickPositions = tickPositions
      this.tickWidth = tickWidth
      this.tickmarkPlacement = tickmarkPlacement
      this.title = title
      this.`type` = `type`
      this.uniqueNames = uniqueNames
      this.units = units
      this.visible = visible
      this.zIndex = zIndex
      this.zoomEnabled = zoomEnabled
    })
  }
}