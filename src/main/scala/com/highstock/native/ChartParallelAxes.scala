/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart-parallelAxes</code>
  */
class ChartParallelAxes extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The axis labels show the number or category for each tick.</p>
    * <p>Since v8.0.0: Labels are animated in categorized x-axis with
    * updating data if <code>tickInterval</code> and <code>step</code> is set to 1.</p>
    * @since 6.0.0
    */
  var labels: js.Any = js.undefined

  /**
    * <p>The width of the line marking the axis itself.</p>
    * <p>In styled mode, the stroke width is given in the
    * <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/linecolor/">A 1px line on Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/">Axes in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/linewidth/">A 2px line on X axis</a>
    * @since 6.0.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined

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
    * @since 6.0.0
    */
  var offset: js.UndefOr[Double] = js.undefined

  /**
    * <p>Titles for yAxes are taken from
    * <a href="#xAxis.categories">xAxis.categories</a>. All options for <code>xAxis.labels</code>
    * applies to parallel coordinates titles. For example, to style
    * categories, use <a href="#xAxis.labels.style">xAxis.labels.style</a>.</p>
    * @since 6.0.0
    */
  var title: js.Any = js.undefined

  /**
    * <p>Whether to force the axis to end on a tick. Use this option with
    * the <code>maxPadding</code> option to control the axis end.</p>
    * <p>This option is always disabled, when panning type is
    * either <code>y</code> or <code>xy</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/endontick/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/endontick-false/">False</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/basic-line/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/endontick/">False for Y axis</a>
    * @since 1.2.0
    */
  var endOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The height of the Y axis. If it&#39;s a number, it is interpreted as
    * pixels.</p>
    * <p>Since Highcharts 2: If it&#39;s a percentage string, it is interpreted as
    * percentages of the total plot height.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/candlestick-and-volume/">Percentage height panes</a>
    * @since 6.0.0
    */
  var height: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The color of the line marking the axis itself.</p>
    * <p>In styled mode, the line stroke is given in the
    * <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/linecolor/">A red line on Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/">Axes in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/linecolor/">A red line on X axis</a>
    * @since 6.0.0
    */
  var lineColor: js.Any = js.undefined

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
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/min-max/">Fixed min and max on Y axis</a>
    * @since 6.0.0
    */
  var max: js.UndefOr[Double | Null] = js.undefined

  /**
    * <p>Maximal size of a resizable axis. Could be set as a percent
    * of plot area or pixel size.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/resize-min-max-length">minLength and maxLength</a>
    * @since 6.0.0
    */
  var maxLength: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>Padding of the max value relative to the length of the axis. A
    * padding of 0.05 will make a 100px axis 5px longer. This is useful
    * when you don&#39;t want the highest data value to appear on the edge
    * of the plot area. When the axis&#39; <code>max</code> option is set or a max extreme
    * is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.</p>
    * <p>Also the <code>softThreshold</code> option takes precedence over <code>maxPadding</code>,
    * so if the data is tangent to the threshold, <code>maxPadding</code> may not
    * apply unless <code>softThreshold</code> is set to false.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/maxpadding-02/">Max padding of 0.2</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minpadding-maxpadding/">Greater min- and maxPadding</a>
    * @since 1.2.0
    */
  var maxPadding: js.UndefOr[Double] = js.undefined

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
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/min-max/">Fixed min and max on Y axis</a>
    * @since 6.0.0
    */
  var min: js.UndefOr[Double | Null] = js.undefined

  /**
    * <p>Minimal size of a resizable axis. Could be set as a percent
    * of plot area or pixel size.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/resize-min-max-length">minLength and maxLength</a>
    * @since 6.0.0
    */
  var minLength: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>Padding of the min value relative to the length of the axis. A
    * padding of 0.05 will make a 100px axis 5px longer. This is useful
    * when you don&#39;t want the lowest data value to appear on the edge
    * of the plot area. When the axis&#39; <code>min</code> option is set or a max extreme
    * is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.</p>
    * <p>Also the <code>softThreshold</code> option takes precedence over <code>minPadding</code>,
    * so if the data is tangent to the threshold, <code>minPadding</code> may not
    * apply unless <code>softThreshold</code> is set to false.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minpadding/">Min padding of 0.2</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minpadding-maxpadding/">Greater min- and maxPadding</a>
    * @since 1.2.0
    */
  var minPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to display the axis on the opposite side of the normal. The
    * normal is on the left side for vertical axes and bottom for
    * horizontal, so the opposite sides will be right and top respectively.
    * This is typically used with dual or multiple axes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/opposite/">Secondary Y axis opposite</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/opposite/">Y axis on left side</a>
    * @since 6.0.0
    */
  var opposite: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Options for axis resizing. It adds a thick line between panes which
    * the user can drag in order to resize the panes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/candlestick-and-volume">Axis resizing enabled</a>
    * @since 6.0.0
    */
  var resize: js.Any = js.undefined

  /**
    * <p>Whether to reverse the axis so that the highest number is closest
    * to the origin.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/reversed/">Reversed Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/reversed/">Reversed Y axis</a>
    * @since 6.0.0
    */
  var reversed: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>If <code>true</code>, the first series in a stack will be drawn on top in a
    * positive, non-reversed Y axis. If <code>false</code>, the first series is in
    * the base of the stack.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/reversedstacks-false/">Non-reversed stacks</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/reversedstacks-false/">Non-reversed stacks</a>
    * @since 3.0.10
    */
  var reversedStacks: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to show the last tick label. Defaults to <code>true</code> on cartesian
    * charts, and <code>false</code> on polar charts.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/showlastlabel-true/">Set to true on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/showfirstlabel/">Labels below plot lines on Y axis</a>
    * @since 6.0.0
    */
  var showLastLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A soft maximum for the axis. If the series data maximum is less
    * than this, the axis will stay at this maximum, but if the series
    * data maximum is higher, the axis will flex to show all data.</p>
    * <p><strong>Note</strong>: The <a href="#plotOptions.series.softThreshold">series.softThreshold</a> option takes precedence over this
    * option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/">Soft min and max</a>
    * @since 5.0.1
    */
  var softMax: js.UndefOr[Double] = js.undefined

  /**
    * <p>A soft minimum for the axis. If the series data minimum is greater
    * than this, the axis will stay at this minimum, but if the series
    * data minimum is lower, the axis will flex to show all data.</p>
    * <p><strong>Note</strong>: The <a href="#plotOptions.series.softThreshold">series.softThreshold</a> option takes precedence over this
    * option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/">Soft min and max</a>
    * @since 5.0.1
    */
  var softMin: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to force the axis to start on a tick. Use this option with
    * the <code>maxPadding</code> option to control the axis start.</p>
    * <p>This option is always disabled, when panning type is
    * either <code>y</code> or <code>xy</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-false/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-true/">True</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/endontick/">False for Y axis</a>
    * @since 1.2.0
    */
  var startOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>For vertical axes only. Setting the static scale ensures that each tick unit
    * is translated into a fixed pixel height. For example, setting the static
    * scale to 24 results in each Y axis category taking up 24 pixels, and the
    * height of the chart adjusts. Adding or removing items will make the chart
    * resize.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/xrange-series/demo/">X-range series with static scale</a>
    * @since 6.2.0
    */
  var staticScale: js.UndefOr[Double] = js.undefined

  /**
    * <p>If tickInterval is <code>null</code> this option sets the approximate pixel
    * interval of the tick marks. Not applicable to categorized axis.</p>
    * <p>The tick interval is also influenced by the <a href="#xAxis.minTickInterval">minTickInterval</a> option, that, by default prevents ticks from
    * being denser than the data points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpixelinterval-50/">50 px on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/tickpixelinterval/">200 px on X axis</a>
    * @since 6.0.0
    */
  var tickPixelInterval: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel width of the major tick marks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickwidth/">10 px width</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/">Formatted ticks on X axis</a>
    * @since 6.0.0
    */
  var tickWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Parallel coordinates only. Format that will be used for point.y
    * and available in <a href="#tooltip.pointFormat">tooltip.pointFormat</a> as
    * <code>{point.formattedValue}</code>. If not set, <code>{point.formattedValue}</code>
    * will use other options, in this order:</p>
    * <ol>
    * <li><p><a href="#yAxis.labels.format">yAxis.labels.format</a> will be used if
    * set</p>
    * </li>
    * <li><p>If yAxis is a category, then category name will be displayed</p>
    * </li>
    * <li><p>If yAxis is a datetime, then value will use the same format as
    * yAxis labels</p>
    * </li>
    * <li><p>If yAxis is linear/logarithmic type, then simple value will be
    * used</p>
    * </li>
    * </ol>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples//highcharts/parallel-coordinates/tooltipvalueformat/">Different tooltipValueFormats's</a>
    * @since 6.0.0
    */
  var tooltipValueFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>The top position of the Y axis. If it&#39;s a number, it is interpreted
    * as pixel position relative to the chart.</p>
    * <p>Since Highcharts 2: If it&#39;s a percentage string, it is interpreted as
    * percentages of the plot height, offset from plot area top.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/candlestick-and-volume/">Percentage height panes</a>
    * @since 6.0.0
    */
  var top: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The type of axis. Can be one of <code>linear</code>, <code>logarithmic</code>, <code>datetime</code>,
    * <code>category</code> or <code>treegrid</code>. Defaults to <code>treegrid</code> for Gantt charts,
    * <code>linear</code> for other chart types.</p>
    * <p>In a datetime axis, the numbers are given in milliseconds, and tick
    * marks are placed on appropriate values, like full hours or days. In a
    * category or treegrid axis, the <a href="#series.line.data.name">point names</a>
    * of the chart&#39;s series are used for categories, if a
    * <a href="#xAxis.categories">categories</a> array is not defined.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log-minorgrid/">Logarithmic with minor grid lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log-negative/">Logarithmic with extension to emulate negative values</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/treegrid-axis/demo">Treegrid axis</a>
    * @since 6.0.0
    */
  var `type`: js.Any = js.undefined

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
    * @since 6.0.0
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
    * <p>If categories are present for the xAxis, names are used instead of
    * numbers for that axis.</p>
    * <p>Since Highcharts 3.0, categories can also
    * be extracted by giving each point a <a href="#series.data">name</a> and setting
    * axis <a href="#xAxis.type">type</a> to <code>category</code>. However, if you have multiple
    * series, best practice remains defining the <code>categories</code> array.</p>
    * <p>Example: <code>categories: [&#39;Apples&#39;, &#39;Bananas&#39;, &#39;Oranges&#39;]</code></p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/line-labels/">With</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/categories/">Without</a>
    * @since 6.0.0
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
    * <p>Configure a crosshair that follows either the mouse pointer or the
    * hovered point.</p>
    * <p>In styled mode, the crosshairs are styled in the
    * <code>.highcharts-crosshair</code>, <code>.highcharts-crosshair-thin</code> or
    * <code>.highcharts-xaxis-category</code> classes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-both/">Crosshair on both axes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/crosshairs-xy/">Crosshair on both axes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-both/">Crosshair on both axes</a>
    * @since 4.1.0
    */
  var crosshair: js.UndefOr[Boolean | js.Any] = js.undefined

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
    * @since 6.0.0
    */
  var dateTimeLabelFormats: js.Any = js.undefined

  /**
    * <p>Event handlers for the axis.</p>
    * @since 6.0.0
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
    * <p>The Z index of the grid lines.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/gridzindex/">A Z index of 4 renders the grid above the graph</a>
    * @since 6.0.0
    */
  var gridZIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>The left position as the horizontal axis. If it&#39;s a number, it is
    * interpreted as pixel position relative to the chart.</p>
    * <p>Since Highcharts v5.0.13: If it&#39;s a percentage string, it is
    * interpreted as percentages of the plot width, offset from plot area
    * left.</p>
    * @since 6.0.0
    */
  var left: js.UndefOr[Double | String] = js.undefined

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
    * <p>Maximum range which can be set using the navigator&#39;s handles.
    * Opposite of <a href="#xAxis.minRange">xAxis.minRange</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/maxrange/">Defined max and min range</a>
    * @since 6.0.0
    */
  var maxRange: js.UndefOr[Double] = js.undefined

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
    * @since 6.0.0
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
    * <p>Color for the minor tick marks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickcolor/">Black tick marks on Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">Black tick marks on Y axis</a>
    * @since 6.0.0
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
    * @since 6.0.0
    */
  var minorTickInterval: js.UndefOr[Double | String | Null] = js.undefined

  /**
    * <p>The pixel length of the minor tick marks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorticklength/">10px on Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">10px on Y axis</a>
    * @since 6.0.0
    */
  var minorTickLength: js.UndefOr[Double] = js.undefined

  /**
    * <p>The position of the minor tick marks relative to the axis line.
    *  Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickposition-outside/">Outside by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickposition-inside/">Inside</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">Inside</a>
    * @since 6.0.0
    */
  var minorTickPosition: js.UndefOr[String] = js.undefined

  /**
    * <p>The pixel width of the minor tick mark.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickwidth/">3px width</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minorticks/">1px width</a>
    * @since 6.0.0
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
    * <p>Refers to the index in the <a href="#panes">panes</a> array. Used for circular
    * gauges and polar charts. When the option is not set then first pane
    * will be used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter">Two gauges with different center</a>
    * @since 6.0.0
    */
  var pane: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to pan axis. If <code>chart.panning</code> is enabled, the option
    * allows to disable panning on an individual axis.</p>
    * @since 6.0.0
    */
  var panningEnabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The zoomed range to display when only defining one or none of <code>min</code>
    * or <code>max</code>. For example, to show the latest month, a range of one month
    * can be set.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/range/">Setting a zoomed range when the rangeSelector is disabled</a>
    * @since 6.0.0
    */
  var range: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to show the axis line and title when the axis has no data.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/showempty/">When clicking the legend to hide series, one axis preserves line and title, the other doesn't</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/showempty/">When clicking the legend to hide series, one axis preserves line and title, the other doesn't</a>
    * @since 1.1.0
    */
  var showEmpty: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to show the first tick label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/showfirstlabel-false/">Set to false on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/showfirstlabel/">Labels below plot lines on Y axis</a>
    * @since 6.0.0
    */
  var showFirstLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>For datetime axes, this decides where to put the tick between weeks.
    *  0 = Sunday, 1 = Monday.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startofweek-monday/">Monday by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startofweek-sunday/">Sunday</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/startofweek-1">Monday by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/startofweek-0">Sunday</a>
    * @since 6.0.0
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
    * @since 6.0.0
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
    * @since 6.0.0
    */
  var tickInterval: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel length of the main tick marks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/ticklength/">20 px tick length on the X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/">Formatted ticks on X axis</a>
    * @since 6.0.0
    */
  var tickLength: js.UndefOr[Double] = js.undefined

  /**
    * <p>The position of the major tick marks relative to the axis line.
    * Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickposition-outside/">"outside" by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickposition-inside/">"inside"</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/">Formatted ticks on X axis</a>
    * @since 6.0.0
    */
  var tickPosition: js.UndefOr[String] = js.undefined

  /**
    * <p>A callback function returning array defining where the ticks are
    * laid out on the axis. This overrides the default behaviour of
    * <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>. The automatic tick positions are accessible
    * through <code>this.tickPositions</code> and can be modified by the callback.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
    * @since 6.0.0
    */
  var tickPositioner: js.Any = js.undefined

  /**
    * <p>An array defining where the ticks are laid out on the axis. This
    * overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
    * @since 6.0.0
    */
  var tickPositions: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * <p>For categorized axes only. If <code>on</code> the tick mark is placed in the
    * center of the category, if <code>between</code> the tick mark is placed between
    * categories. The default is <code>between</code> if the <code>tickInterval</code> is 1, else
    * <code>on</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickmarkplacement-between/">"between" by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickmarkplacement-on/">"on"</a>
    * @since 6.0.0
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
    * @since 6.0.0
    */
  var units: js.UndefOr[js.Array[js.Array[js.Array[js.Any]]]] = js.undefined

  /**
    * <p>Whether axis, including axis title, line, ticks and labels, should
    * be visible.</p>
    * @since 4.1.9
    */
  var visible: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The width as the horizontal axis. If it&#39;s a number, it is interpreted
    * as pixels.</p>
    * <p>Since Highcharts v5.0.13: If it&#39;s a percentage string, it is
    * interpreted as percentages of the total plot width.</p>
    * @since 6.0.0
    */
  var width: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The Z index for the axis group.</p>
    * @since 6.0.0
    */
  var zIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to zoom axis. If <code>chart.zoomType</code> is set, the option allows
    * to disable zooming on an individual axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/zoomenabled/">Zoom enabled is false</a>
    * @since 6.0.0
    */
  var zoomEnabled: js.UndefOr[Boolean] = js.undefined
}

object ChartParallelAxes {
  /**
    * @param labels <p>The axis labels show the number or category for each tick.</p>. <p>Since v8.0.0: Labels are animated in categorized x-axis with. updating data if <code>tickInterval</code> and <code>step</code> is set to 1.</p>
    * @param lineWidth <p>The width of the line marking the axis itself.</p>. <p>In styled mode, the stroke width is given in the. <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    * @param offset <p>The distance in pixels from the plot area to the axis line.. A positive offset moves the axis with it&#39;s line, labels and ticks. away from the plot area. This is typically used when two or more. axes are displayed on the same side of the plot. With multiple. axes the offset is dynamically adjusted to avoid collision, this. can be overridden by setting offset explicitly.</p>
    * @param title <p>Titles for yAxes are taken from. <a href="#xAxis.categories">xAxis.categories</a>. All options for <code>xAxis.labels</code>. applies to parallel coordinates titles. For example, to style. categories, use <a href="#xAxis.labels.style">xAxis.labels.style</a>.</p>
    * @param endOnTick <p>Whether to force the axis to end on a tick. Use this option with. the <code>maxPadding</code> option to control the axis end.</p>. <p>This option is always disabled, when panning type is. either <code>y</code> or <code>xy</code>.</p>
    * @param height <p>The height of the Y axis. If it&#39;s a number, it is interpreted as. pixels.</p>. <p>Since Highcharts 2: If it&#39;s a percentage string, it is interpreted as. percentages of the total plot height.</p>
    * @param lineColor <p>The color of the line marking the axis itself.</p>. <p>In styled mode, the line stroke is given in the. <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    * @param max <p>The maximum value of the axis. If <code>null</code>, the max value is. automatically calculated.</p>. <p>If the <a href="#yAxis.endOnTick">endOnTick</a> option is true, the <code>max</code> value. might be rounded up.</p>. <p>If a <a href="#yAxis.tickAmount">tickAmount</a> is set, the axis may be extended. beyond the set max in order to reach the given number of ticks. The. same may happen in a chart with multiple axes, determined by <a href="#chart">chart.. alignTicks</a>, where a <code>tickAmount</code> is applied internally.</p>
    * @param maxLength <p>Maximal size of a resizable axis. Could be set as a percent. of plot area or pixel size.</p>
    * @param maxPadding <p>Padding of the max value relative to the length of the axis. A. padding of 0.05 will make a 100px axis 5px longer. This is useful. when you don&#39;t want the highest data value to appear on the edge. of the plot area. When the axis&#39; <code>max</code> option is set or a max extreme. is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.</p>. <p>Also the <code>softThreshold</code> option takes precedence over <code>maxPadding</code>,. so if the data is tangent to the threshold, <code>maxPadding</code> may not. apply unless <code>softThreshold</code> is set to false.</p>
    * @param min <p>The minimum value of the axis. If <code>null</code> the min value is. automatically calculated.</p>. <p>If the <a href="#yAxis.startOnTick">startOnTick</a> option is true (default),. the <code>min</code> value might be rounded down.</p>. <p>The automatically calculated minimum value is also affected by. <a href="#yAxis.floor">floor</a>, <a href="#yAxis.softMin">softMin</a>,. <a href="#yAxis.minPadding">minPadding</a>, <a href="#yAxis.minRange">minRange</a>. as well as <a href="#plotOptions.series.threshold">series.threshold</a>. and <a href="#plotOptions.series.softThreshold">series.softThreshold</a>.</p>
    * @param minLength <p>Minimal size of a resizable axis. Could be set as a percent. of plot area or pixel size.</p>
    * @param minPadding <p>Padding of the min value relative to the length of the axis. A. padding of 0.05 will make a 100px axis 5px longer. This is useful. when you don&#39;t want the lowest data value to appear on the edge. of the plot area. When the axis&#39; <code>min</code> option is set or a max extreme. is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.</p>. <p>Also the <code>softThreshold</code> option takes precedence over <code>minPadding</code>,. so if the data is tangent to the threshold, <code>minPadding</code> may not. apply unless <code>softThreshold</code> is set to false.</p>
    * @param opposite <p>Whether to display the axis on the opposite side of the normal. The. normal is on the left side for vertical axes and bottom for. horizontal, so the opposite sides will be right and top respectively.. This is typically used with dual or multiple axes.</p>
    * @param resize <p>Options for axis resizing. It adds a thick line between panes which. the user can drag in order to resize the panes.</p>
    * @param reversed <p>Whether to reverse the axis so that the highest number is closest. to the origin.</p>
    * @param reversedStacks <p>If <code>true</code>, the first series in a stack will be drawn on top in a. positive, non-reversed Y axis. If <code>false</code>, the first series is in. the base of the stack.</p>
    * @param showLastLabel <p>Whether to show the last tick label. Defaults to <code>true</code> on cartesian. charts, and <code>false</code> on polar charts.</p>
    * @param softMax <p>A soft maximum for the axis. If the series data maximum is less. than this, the axis will stay at this maximum, but if the series. data maximum is higher, the axis will flex to show all data.</p>. <p><strong>Note</strong>: The <a href="#plotOptions.series.softThreshold">series.softThreshold</a> option takes precedence over this. option.</p>
    * @param softMin <p>A soft minimum for the axis. If the series data minimum is greater. than this, the axis will stay at this minimum, but if the series. data minimum is lower, the axis will flex to show all data.</p>. <p><strong>Note</strong>: The <a href="#plotOptions.series.softThreshold">series.softThreshold</a> option takes precedence over this. option.</p>
    * @param startOnTick <p>Whether to force the axis to start on a tick. Use this option with. the <code>maxPadding</code> option to control the axis start.</p>. <p>This option is always disabled, when panning type is. either <code>y</code> or <code>xy</code>.</p>
    * @param staticScale <p>For vertical axes only. Setting the static scale ensures that each tick unit. is translated into a fixed pixel height. For example, setting the static. scale to 24 results in each Y axis category taking up 24 pixels, and the. height of the chart adjusts. Adding or removing items will make the chart. resize.</p>
    * @param tickPixelInterval <p>If tickInterval is <code>null</code> this option sets the approximate pixel. interval of the tick marks. Not applicable to categorized axis.</p>. <p>The tick interval is also influenced by the <a href="#xAxis.minTickInterval">minTickInterval</a> option, that, by default prevents ticks from. being denser than the data points.</p>
    * @param tickWidth <p>The pixel width of the major tick marks.</p>
    * @param tooltipValueFormat <p>Parallel coordinates only. Format that will be used for point.y. and available in <a href="#tooltip.pointFormat">tooltip.pointFormat</a> as. <code>{point.formattedValue}</code>. If not set, <code>{point.formattedValue}</code>. will use other options, in this order:</p>. <ol>. <li><p><a href="#yAxis.labels.format">yAxis.labels.format</a> will be used if. set</p>. </li>. <li><p>If yAxis is a category, then category name will be displayed</p>. </li>. <li><p>If yAxis is a datetime, then value will use the same format as. yAxis labels</p>. </li>. <li><p>If yAxis is linear/logarithmic type, then simple value will be. used</p>. </li>. </ol>
    * @param top <p>The top position of the Y axis. If it&#39;s a number, it is interpreted. as pixel position relative to the chart.</p>. <p>Since Highcharts 2: If it&#39;s a percentage string, it is interpreted as. percentages of the plot height, offset from plot area top.</p>
    * @param `type` <p>The type of axis. Can be one of <code>linear</code>, <code>logarithmic</code>, <code>datetime</code>,. <code>category</code> or <code>treegrid</code>. Defaults to <code>treegrid</code> for Gantt charts,. <code>linear</code> for other chart types.</p>. <p>In a datetime axis, the numbers are given in milliseconds, and tick. marks are placed on appropriate values, like full hours or days. In a. category or treegrid axis, the <a href="#series.line.data.name">point names</a>. of the chart&#39;s series are used for categories, if a. <a href="#xAxis.categories">categories</a> array is not defined.</p>
    * @param accessibility <p>Accessibility options for an axis. Requires the accessibility module.</p>
    * @param alignTicks <p>When using multiple axis, the ticks of two or more opposite axes. will automatically be aligned by adding ticks to the axis or axes. with the least ticks, as if <code>tickAmount</code> were specified.</p>. <p>This can be prevented by setting <code>alignTicks</code> to false. If the grid. lines look messy, it&#39;s a good idea to hide them for the secondary. axis by setting <code>gridLineWidth</code> to 0.</p>. <p>If <code>startOnTick</code> or <code>endOnTick</code> in an Axis options are set to false,. then the <code>alignTicks </code> will be disabled for the Axis.</p>. <p>Disabled for logarithmic axes.</p>
    * @param allowDecimals <p>Whether to allow decimals in this axis&#39; ticks. When counting. integers, like persons or hits on a web page, decimals should. be avoided in the labels. By default, decimals are allowed on small. scale axes.</p>
    * @param categories <p>If categories are present for the xAxis, names are used instead of. numbers for that axis.</p>. <p>Since Highcharts 3.0, categories can also. be extracted by giving each point a <a href="#series.data">name</a> and setting. axis <a href="#xAxis.type">type</a> to <code>category</code>. However, if you have multiple. series, best practice remains defining the <code>categories</code> array.</p>. <p>Example: <code>categories: [&#39;Apples&#39;, &#39;Bananas&#39;, &#39;Oranges&#39;]</code></p>
    * @param ceiling <p>The highest allowed value for automatically computed axis extremes.</p>
    * @param className <p>A class name that opens for styling the axis by CSS, especially in. Highcharts styled mode. The class name is applied to group elements. for the grid, axis elements and labels.</p>
    * @param crosshair <p>Configure a crosshair that follows either the mouse pointer or the. hovered point.</p>. <p>In styled mode, the crosshairs are styled in the. <code>.highcharts-crosshair</code>, <code>.highcharts-crosshair-thin</code> or. <code>.highcharts-xaxis-category</code> classes.</p>
    * @param dateTimeLabelFormats <p>For a datetime axis, the scale will automatically adjust to the. appropriate unit. This member gives the default string. representations used for each unit. For intermediate values,. different units may be used, for example the <code>day</code> unit can be used. on midnight and <code>hour</code> unit be used for intermediate values on the. same axis.</p>. <p>For an overview of the replacement codes, see. <a href="/class-reference/Highcharts.Time#dateFormat">dateFormat</a>.</p>. <p>Defaults to:</p>. <pre><code class="language-js">{.     millisecond: &#39;%H:%M:%S.%L&#39;,.     second: &#39;%H:%M:%S&#39;,.     minute: &#39;%H:%M&#39;,.     hour: &#39;%H:%M&#39;,.     day: &#39;%e. %b&#39;,.     week: &#39;%e. %b&#39;,.     month: &#39;%b \&#39;%y&#39;,.     year: &#39;%Y&#39;. }. </code></pre>
    * @param events <p>Event handlers for the axis.</p>
    * @param floor <p>The lowest allowed value for automatically computed axis extremes.</p>
    * @param grid <p>Set grid options for the axis labels. Requires Highcharts Gantt.</p>
    * @param gridZIndex <p>The Z index of the grid lines.</p>
    * @param left <p>The left position as the horizontal axis. If it&#39;s a number, it is. interpreted as pixel position relative to the chart.</p>. <p>Since Highcharts v5.0.13: If it&#39;s a percentage string, it is. interpreted as percentages of the plot width, offset from plot area. left.</p>
    * @param linkedTo <p>Index of another axis that this axis is linked to. When an axis is. linked to a master axis, it will take the same extremes as. the master, but as assigned by min or max or by setExtremes.. It can be used to show additional info, or to ease reading the. chart by duplicating the scales.</p>
    * @param margin <p>If there are multiple axes on the same side of the chart, the pixel. margin between the axes. Defaults to 0 on vertical axes, 15 on. horizontal axes.</p>
    * @param maxRange <p>Maximum range which can be set using the navigator&#39;s handles.. Opposite of <a href="#xAxis.minRange">xAxis.minRange</a>.</p>
    * @param minRange <p>The minimum range to display on this axis. The entire axis will not. be allowed to span over a smaller interval than this. For example,. for a datetime axis the main unit is milliseconds. If minRange is. set to 3600000, you can&#39;t zoom in more than to one hour.</p>. <p>The default minRange for the x axis is five times the smallest. interval between any of the data points.</p>. <p>On a logarithmic axis, the unit for the minimum range is the power.. So a minRange of 1 means that the axis can be zoomed to 10-100,. 100-1000, 1000-10000 etc.</p>. <p><strong>Note</strong>: The <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and. <code>endOnTick</code> settings also affect how the extremes of the axis. are computed.</p>
    * @param minTickInterval <p>The minimum tick interval allowed in axis values. For example on. zooming in on an axis with daily data, this can be used to prevent. the axis from showing hours. Defaults to the closest distance between. two points on the axis.</p>
    * @param minorTickColor <p>Color for the minor tick marks.</p>
    * @param minorTickInterval <p>Specific tick interval in axis units for the minor ticks. On a linear. axis, if <code>&quot;auto&quot;</code>, the minor tick interval is calculated as a fifth. of the tickInterval. If <code>null</code> or <code>undefined</code>, minor ticks are not. shown.</p>. <p>On logarithmic axes, the unit is the power of the value. For example,. setting the minorTickInterval to 1 puts one tick on each of 0.1, 1,. 10, 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks. between 1 and 10, 10 and 100 etc.</p>. <p>If user settings dictate minor ticks to become too dense, they don&#39;t. make sense, and will be ignored to prevent performance problems.</p>
    * @param minorTickLength <p>The pixel length of the minor tick marks.</p>
    * @param minorTickPosition <p>The position of the minor tick marks relative to the axis line..  Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @param minorTickWidth <p>The pixel width of the minor tick mark.</p>
    * @param minorTicks <p>Enable or disable minor ticks. Unless. <a href="#xAxis.minorTickInterval">minorTickInterval</a> is set, the tick. interval is calculated as a fifth of the <code>tickInterval</code>.</p>. <p>On a logarithmic axis, minor ticks are laid out based on a best. guess, attempting to enter approximately 5 minor ticks between. each major tick.</p>. <p>Prior to v6.0.0, ticks were unabled in auto layout by setting. <code>minorTickInterval</code> to <code>&quot;auto&quot;</code>.</p>
    * @param pane <p>Refers to the index in the <a href="#panes">panes</a> array. Used for circular. gauges and polar charts. When the option is not set then first pane. will be used.</p>
    * @param panningEnabled <p>Whether to pan axis. If <code>chart.panning</code> is enabled, the option. allows to disable panning on an individual axis.</p>
    * @param range <p>The zoomed range to display when only defining one or none of <code>min</code>. or <code>max</code>. For example, to show the latest month, a range of one month. can be set.</p>
    * @param showEmpty <p>Whether to show the axis line and title when the axis has no data.</p>
    * @param showFirstLabel <p>Whether to show the first tick label.</p>
    * @param startOfWeek <p>For datetime axes, this decides where to put the tick between weeks..  0 = Sunday, 1 = Monday.</p>
    * @param tickAmount <p>The amount of ticks to draw on the axis. This opens up for aligning. the ticks of multiple charts or panes within a chart. This option. overrides the <code>tickPixelInterval</code> option.</p>. <p>This option only has an effect on linear axes. Datetime, logarithmic. or category axes are not affected.</p>
    * @param tickColor <p>Color for the main tick marks.</p>. <p>In styled mode, the stroke is given in the <code>.highcharts-tick</code>. class.</p>
    * @param tickInterval <p>The interval of the tick marks in axis units. When <code>undefined</code>, the. tick interval is computed to approximately follow the. <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> on linear and datetime. axes. On categorized axes, a <code>undefined</code> tickInterval will default to. 1, one category. Note that datetime axes are based on milliseconds,. so for example an interval of one day is expressed as. <code>24 * 3600 * 1000</code>.</p>. <p>On logarithmic axes, the tickInterval is based on powers, so a. tickInterval of 1 means one tick on each of 0.1, 1, 10, 100 etc. A. tickInterval of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval. of 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20,. 40 etc.</p>. <p>If the tickInterval is too dense for labels to be drawn, Highcharts. may remove ticks.</p>. <p>If the chart has multiple axes, the <a href="#chart.alignTicks">alignTicks</a>. option may interfere with the <code>tickInterval</code> setting.</p>
    * @param tickLength <p>The pixel length of the main tick marks.</p>
    * @param tickPosition <p>The position of the major tick marks relative to the axis line.. Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @param tickPositioner <p>A callback function returning array defining where the ticks are. laid out on the axis. This overrides the default behaviour of. <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>. The automatic tick positions are accessible. through <code>this.tickPositions</code> and can be modified by the callback.</p>
    * @param tickPositions <p>An array defining where the ticks are laid out on the axis. This. overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.</p>
    * @param tickmarkPlacement <p>For categorized axes only. If <code>on</code> the tick mark is placed in the. center of the category, if <code>between</code> the tick mark is placed between. categories. The default is <code>between</code> if the <code>tickInterval</code> is 1, else. <code>on</code>.</p>
    * @param uniqueNames <p>Applies only when the axis <code>type</code> is <code>category</code>. When <code>uniqueNames</code>. is true, points are placed on the X axis according to their names.. If the same point name is repeated in the same or another series,. the point is placed on the same X position as other points of the. same name. When <code>uniqueNames</code> is false, the points are laid out in. increasing X positions regardless of their names, and the X axis. category will take the name of the last point in each position.</p>
    * @param units <p>Datetime axis only. An array determining what time intervals the. ticks are allowed to fall on. Each array item is an array where the. first value is the time unit and the second value another array of. allowed multiples.</p>. <p>Defaults to:</p>. <pre><code class="language-js">units: [[.     &#39;millisecond&#39;, // unit name.     [1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples. ], [.     &#39;second&#39;,.     [1, 2, 5, 10, 15, 30]. ], [.     &#39;minute&#39;,.     [1, 2, 5, 10, 15, 30]. ], [.     &#39;hour&#39;,.     [1, 2, 3, 4, 6, 8, 12]. ], [.     &#39;day&#39;,.     [1, 2]. ], [.     &#39;week&#39;,.     [1, 2]. ], [.     &#39;month&#39;,.     [1, 2, 3, 4, 6]. ], [.     &#39;year&#39;,.     null. ]]. </code></pre>
    * @param visible <p>Whether axis, including axis title, line, ticks and labels, should. be visible.</p>
    * @param width <p>The width as the horizontal axis. If it&#39;s a number, it is interpreted. as pixels.</p>. <p>Since Highcharts v5.0.13: If it&#39;s a percentage string, it is. interpreted as percentages of the total plot width.</p>
    * @param zIndex <p>The Z index for the axis group.</p>
    * @param zoomEnabled <p>Whether to zoom axis. If <code>chart.zoomType</code> is set, the option allows. to disable zooming on an individual axis.</p>
    */
  def apply(labels: js.UndefOr[js.Any] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, offset: js.UndefOr[Double] = js.undefined, title: js.UndefOr[js.Any] = js.undefined, endOnTick: js.UndefOr[Boolean] = js.undefined, height: js.UndefOr[Double | String] = js.undefined, lineColor: js.UndefOr[js.Any] = js.undefined, max: js.UndefOr[Double | Null] = js.undefined, maxLength: js.UndefOr[Double | String] = js.undefined, maxPadding: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double | Null] = js.undefined, minLength: js.UndefOr[Double | String] = js.undefined, minPadding: js.UndefOr[Double] = js.undefined, opposite: js.UndefOr[Boolean] = js.undefined, resize: js.UndefOr[js.Any] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined, reversedStacks: js.UndefOr[Boolean] = js.undefined, showLastLabel: js.UndefOr[Boolean] = js.undefined, softMax: js.UndefOr[Double] = js.undefined, softMin: js.UndefOr[Double] = js.undefined, startOnTick: js.UndefOr[Boolean] = js.undefined, staticScale: js.UndefOr[Double] = js.undefined, tickPixelInterval: js.UndefOr[Double] = js.undefined, tickWidth: js.UndefOr[Double] = js.undefined, tooltipValueFormat: js.UndefOr[String] = js.undefined, top: js.UndefOr[Double | String] = js.undefined, `type`: js.UndefOr[js.Any] = js.undefined, accessibility: js.UndefOr[js.Any] = js.undefined, alignTicks: js.UndefOr[Boolean] = js.undefined, allowDecimals: js.UndefOr[js.UndefOr[Boolean]] = js.undefined, categories: js.UndefOr[js.Array[String]] = js.undefined, ceiling: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, crosshair: js.UndefOr[Boolean | js.Any] = js.undefined, dateTimeLabelFormats: js.UndefOr[js.Any] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, floor: js.UndefOr[Double] = js.undefined, grid: js.UndefOr[js.Any] = js.undefined, gridZIndex: js.UndefOr[Double] = js.undefined, left: js.UndefOr[Double | String] = js.undefined, linkedTo: js.UndefOr[Double] = js.undefined, margin: js.UndefOr[Double] = js.undefined, maxRange: js.UndefOr[Double] = js.undefined, minRange: js.UndefOr[Double] = js.undefined, minTickInterval: js.UndefOr[Double] = js.undefined, minorTickColor: js.UndefOr[js.Any] = js.undefined, minorTickInterval: js.UndefOr[Double | String | Null] = js.undefined, minorTickLength: js.UndefOr[Double] = js.undefined, minorTickPosition: js.UndefOr[String] = js.undefined, minorTickWidth: js.UndefOr[Double] = js.undefined, minorTicks: js.UndefOr[Boolean] = js.undefined, pane: js.UndefOr[Double] = js.undefined, panningEnabled: js.UndefOr[Boolean] = js.undefined, range: js.UndefOr[Double] = js.undefined, showEmpty: js.UndefOr[Boolean] = js.undefined, showFirstLabel: js.UndefOr[Boolean] = js.undefined, startOfWeek: js.UndefOr[Double] = js.undefined, tickAmount: js.UndefOr[Double] = js.undefined, tickColor: js.UndefOr[js.Any] = js.undefined, tickInterval: js.UndefOr[Double] = js.undefined, tickLength: js.UndefOr[Double] = js.undefined, tickPosition: js.UndefOr[String] = js.undefined, tickPositioner: js.UndefOr[js.Any] = js.undefined, tickPositions: js.UndefOr[js.Array[Double]] = js.undefined, tickmarkPlacement: js.UndefOr[String] = js.undefined, uniqueNames: js.UndefOr[Boolean] = js.undefined, units: js.UndefOr[js.Array[js.Array[js.Array[js.Any]]]] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, width: js.UndefOr[Double | String] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, zoomEnabled: js.UndefOr[Boolean] = js.undefined): ChartParallelAxes = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartParallelAxes {
      this.labels = labels
      this.lineWidth = lineWidth
      this.offset = offset
      this.title = title
      this.endOnTick = endOnTick
      this.height = height
      this.lineColor = lineColor
      this.max = max
      this.maxLength = maxLength
      this.maxPadding = maxPadding
      this.min = min
      this.minLength = minLength
      this.minPadding = minPadding
      this.opposite = opposite
      this.resize = resize
      this.reversed = reversed
      this.reversedStacks = reversedStacks
      this.showLastLabel = showLastLabel
      this.softMax = softMax
      this.softMin = softMin
      this.startOnTick = startOnTick
      this.staticScale = staticScale
      this.tickPixelInterval = tickPixelInterval
      this.tickWidth = tickWidth
      this.tooltipValueFormat = tooltipValueFormat
      this.top = top
      this.`type` = `type`
      this.accessibility = accessibility
      this.alignTicks = alignTicks
      this.allowDecimals = allowDecimals
      this.categories = categories
      this.ceiling = ceiling
      this.className = className
      this.crosshair = crosshair
      this.dateTimeLabelFormats = dateTimeLabelFormats
      this.events = events
      this.floor = floor
      this.grid = grid
      this.gridZIndex = gridZIndex
      this.left = left
      this.linkedTo = linkedTo
      this.margin = margin
      this.maxRange = maxRange
      this.minRange = minRange
      this.minTickInterval = minTickInterval
      this.minorTickColor = minorTickColor
      this.minorTickInterval = minorTickInterval
      this.minorTickLength = minorTickLength
      this.minorTickPosition = minorTickPosition
      this.minorTickWidth = minorTickWidth
      this.minorTicks = minorTicks
      this.pane = pane
      this.panningEnabled = panningEnabled
      this.range = range
      this.showEmpty = showEmpty
      this.showFirstLabel = showFirstLabel
      this.startOfWeek = startOfWeek
      this.tickAmount = tickAmount
      this.tickColor = tickColor
      this.tickInterval = tickInterval
      this.tickLength = tickLength
      this.tickPosition = tickPosition
      this.tickPositioner = tickPositioner
      this.tickPositions = tickPositions
      this.tickmarkPlacement = tickmarkPlacement
      this.uniqueNames = uniqueNames
      this.units = units
      this.visible = visible
      this.width = width
      this.zIndex = zIndex
      this.zoomEnabled = zoomEnabled
    })
  }
}
