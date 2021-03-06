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
class YAxis extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Minimal size of a resizable axis. Could be set as a percent
    * of plot area or pixel size.</p>
    * <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/resize-min-max-length">minLength and maxLength</a>
    */
  val minLength: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>Maximal size of a resizable axis. Could be set as a percent
    * of plot area or pixel size.</p>
    * <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/resize-min-max-length">minLength and maxLength</a>
    */
  val maxLength: js.UndefOr[String | Double] = js.undefined

  /**
    * <p>Options for axis resizing. This feature requires the
    * <code>drag-panes.js</code> -
    * <a href="http://code.highcharts.com/stock/modules/drag-panes.js">classic</a> or
    * <a href="http://code.highcharts.com/stock/js/modules/drag-panes.js">styled</a>
    * mode - module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/candlestick-and-volume">Axis resizing enabled</a>
    */
  val resize: js.Any = js.undefined

  /**
    * <p>Parallel coordinates only. Format that will be used for point.y
    * and available in <a href="#tooltip.pointFormat">tooltip.pointFormat</a> as
    * <code>{point.formattedValue}</code>. If not set, <code>{point.formattedValue}</code>
    * will use other options, in this order:</p>
    * <ol>
    * <li><a href="#yAxis.labels.format">yAxis.labels.format</a> will be used if
    * set</li>
    * <li>if yAxis is a category, then category name will be displayed</li>
    * <li>if yAxis is a datetime, then value will use the same format as
    * yAxis labels</li>
    * <li>if yAxis is linear/logarithmic type, then simple value will be
    * used</li>
    * </ol>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples//highcharts/parallel-coordinates/tooltipvalueformat/">Different tooltipValueFormats's</a>
    */
  val tooltipValueFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>For vertical axes only. Setting the static scale ensures that each tick unit
    * is translated into a fixed pixel height. For example, setting the static
    * scale to 24 results in each Y axis category taking up 24 pixels, and the
    * height of the chart adjusts. Adding or removing items will make the chart
    * resize.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/xrange-series/demo/">X-range series with static scale</a>
    * @since 6.2.0
    */
  val staticScale: js.UndefOr[Double] = js.undefined

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
    */
  val `type`: js.UndefOr[String] = "linear"

  /**
    * <p>Whether to force the axis to end on a tick. Use this option with
    * the <code>maxPadding</code> option to control the axis end.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/endontick/">False</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/basic-line/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/endontick/">False</a>
    * @since 1.2.0
    */
  val endOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Padding of the max value relative to the length of the axis. A
    * padding of 0.05 will make a 100px axis 5px longer. This is useful
    * when you don&#39;t want the highest data value to appear on the edge
    * of the plot area. When the axis&#39; <code>max</code> option is set or a max extreme
    * is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/maxpadding-02/">Max padding of 0.2</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minpadding-maxpadding/">Greater min- and maxPadding</a>
    * @since 1.2.0
    */
  val maxPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Padding of the min value relative to the length of the axis. A
    * padding of 0.05 will make a 100px axis 5px longer. This is useful
    * when you don&#39;t want the lowest data value to appear on the edge
    * of the plot area. When the axis&#39; <code>min</code> option is set or a max extreme
    * is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minpadding/">Min padding of 0.2</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minpadding-maxpadding/">Greater min- and maxPadding</a>
    * @since 1.2.0
    */
  val minPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>If tickInterval is <code>null</code> this option sets the approximate pixel
    * interval of the tick marks. Not applicable to categorized axis.</p>
    * <p>The tick interval is also influenced by the <a href="#xAxis.minTickInterval">minTickInterval</a> option, that, by default prevents ticks from
    * being denser than the data points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpixelinterval-50/">50 px on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/tickpixelinterval/">200 px on X axis</a>
    */
  val tickPixelInterval: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to show the last tick label. Defaults to <code>true</code> on cartesian
    * charts, and <code>false</code> on polar charts.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/showlastlabel-true/">Set to true on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/showfirstlabel/">Labels below plot lines on Y axis</a>
    */
  val showLastLabel: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The axis labels show the number or category for each tick.</p>
    */
  val labels: js.Any = js.undefined

  /**
    * <p>Whether to force the axis to start on a tick. Use this option with
    * the <code>maxPadding</code> option to control the axis start.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-false/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-true/">True</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/endontick/">False for Y axis</a>
    * @since 1.2.0
    */
  val startOnTick: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The axis title, showing next to the axis line.</p>
    */
  val title: js.Any = js.undefined

  /**
    * <p>The stack labels show the total value for each bar in a stacked
    * column or bar chart. The label will be placed on top of positive
    * columns and below negative columns. In case of an inverted column
    * chart or a bar chart the label is placed to the right of positive
    * bars and to the left of negative bars.</p>
    */
  val stackLabels: js.Any = js.undefined

  /**
    * <p>The width of the grid lines extending the ticks across the plot area.</p>
    * <p>In styled mode, the stroke width is given in the
    * <code>.highcharts-grid-line</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinewidth/">2px lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/gridlinewidth/">2px lines</a>
    */
  val gridLineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The width of the line marking the axis itself.</p>
    * <p>In styled mode, the stroke width is given in the
    * <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/linecolor/">A 1px line on Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/">Axes in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/linewidth/">A 2px line on X axis</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>In a polar chart, this is the angle of the Y axis in degrees, where
    * 0 is up and 90 is right. The angle determines the position of the
    * axis line and the labels, though the coordinate system is unaffected.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/angle/">Dual axis polar chart</a>
    * @since 4.2.7
    */
  val angle: js.UndefOr[Double] = js.undefined

  /**
    * <p>Polar charts only. Whether the grid lines should draw as a polygon
    * with straight lines between categories, or as circles. Can be either
    * <code>circle</code> or <code>polygon</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polar-spider/">Polygon grid lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlineinterpolation/">Circle and polygon</a>
    */
  val gridLineInterpolation: js.UndefOr[String] = js.undefined

  /**
    * <p>The height of the Y axis. If it&#39;s a number, it is interpreted as
    * pixels.</p>
    * <p>Since Highstock 2: If it&#39;s a percentage string, it is interpreted
    * as percentages of the total plot height.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/candlestick-and-volume/">Percentage height panes</a>
    */
  val height: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>Solid gauge only. Unless <a href="#yAxis.stops">stops</a> are set, the color
    * to represent the maximum value of the Y axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/mincolor-maxcolor/">Min and max colors</a>
    * @since 4.0
    */
  val maxColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Solid gauge only. Unless <a href="#yAxis.stops">stops</a> are set, the color
    * to represent the minimum value of the Y axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/mincolor-maxcolor/">Min and max color</a>
    * @since 4.0
    */
  val minColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Whether to reverse the axis so that the highest number is closest
    * to the origin.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/reversed/">Reversed Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/reversed/">Reversed Y axis</a>
    */
  val reversed: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>If <code>true</code>, the first series in a stack will be drawn on top in a
    * positive, non-reversed Y axis. If <code>false</code>, the first series is in
    * the base of the stack.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/reversedstacks-false/">Non-reversed stacks</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/reversedstacks-false/">Non-reversed stacks</a>
    * @since 3.0.10
    */
  val reversedStacks: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Solid gauge series only. Color stops for the solid gauge. Use this
    * in cases where a linear gradient between a <code>minColor</code> and <code>maxColor</code>
    * is not sufficient. The stops is an array of tuples, where the first
    * item is a float between 0 and 1 assigning the relative position in
    * the gradient, and the second item is the color.</p>
    * <p>For solid gauges, the Y axis also inherits the concept of [data classes](<a href="http://api">http://api</a>.
    * highcharts.com/highmaps#colorAxis.dataClasses) from the Highmaps
    * color axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-solid/">True by default</a>
    * @since 4.0
    */
  val stops: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined

  /**
    * <p>The pixel width of the major tick marks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickwidth/">10 px width</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/">Formatted ticks on X axis</a>
    */
  val tickWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to display the axis on the opposite side of the normal. The
    * normal is on the left side for vertical axes and bottom for
    * horizontal, so the opposite sides will be right and top respectively.
    * This is typically used with dual or multiple axes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/opposite/">Secondary Y axis opposite</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/opposite/">Y axis on left side</a>
    */
  val opposite: js.UndefOr[Boolean] = js.undefined

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
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/axis/min-max/">Pre-zoomed to a specific area</a>
    */
  val max: js.UndefOr[Double] = js.undefined

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
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/axis/min-max/">Pre-zoomed to a specific area</a>
    */
  val min: js.UndefOr[Double] = js.undefined

  /**
    * <p>An optional scrollbar to display on the Y axis in response to
    * limiting the minimum an maximum of the axis values.</p>
    * <p>In styled mode, all the presentational options for the scrollbar
    * are replaced by the classes <code>.highcharts-scrollbar-thumb</code>,
    * <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,
    * <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/scrollbar/">Scrollbar on the Y axis</a>
    * @since 4.2.6
    */
  val scrollbar: js.Any = js.undefined

  /**
    * <p>A soft maximum for the axis. If the series data maximum is less
    * than this, the axis will stay at this maximum, but if the series
    * data maximum is higher, the axis will flex to show all data.</p>
    * <p><strong>Note</strong>: The <a href="#plotOptions.series.softThreshold">series.softThreshold</a> option takes precedence over this
    * option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/">Soft min and max</a>
    * @since 5.0.1
    */
  val softMax: js.UndefOr[Double] = js.undefined

  /**
    * <p>A soft minimum for the axis. If the series data minimum is greater
    * than this, the axis will stay at this minimum, but if the series
    * data minimum is lower, the axis will flex to show all data.</p>
    * <p><strong>Note</strong>: The <a href="#plotOptions.series.softThreshold">series.softThreshold</a> option takes precedence over this
    * option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/">Soft min and max</a>
    * @since 5.0.1
    */
  val softMin: js.UndefOr[Double] = js.undefined

  /**
    * <p>The top position of the Y axis. If it&#39;s a number, it is interpreted
    * as pixel position relative to the chart.</p>
    * <p>Since Highstock 2: If it&#39;s a percentage string, it is interpreted
    * as percentages of the plot height, offset from plot area top.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/candlestick-and-volume/">Percentage height panes</a>
    */
  val top: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>An array of objects defining plot bands on the Y axis.</p>
    */
  val plotBands: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>An array of objects representing plot lines on the X axis</p>
    */
  val plotLines: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>For a datetime axis, the scale will automatically adjust to the
    * appropriate unit. This member gives the default string
    * representations used for each unit. For intermediate values,
    * different units may be used, for example the <code>day</code> unit can be used
    * on midnight and <code>hour</code> unit be used for intermediate values on the
    * same axis. For an overview of the replacement codes, see
    * <a href="/class-reference/Highcharts#dateFormat">dateFormat</a>. Defaults to:</p>
    * <pre>{
    *     millisecond: '%H:%M:%S.%L',
    *     second: '%H:%M:%S',
    *     minute: '%H:%M',
    *     hour: '%H:%M',
    *     day: '%e. %b',
    *     week: '%e. %b',
    *     month: '%b \'%y',
    *     year: '%Y'
    * }</pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/datetimelabelformats/">Different day format on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/datetimelabelformats/">More information in x axis labels</a>
    */
  val dateTimeLabelFormats: js.Any = js.undefined

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
    * <p>The pixel length of the main tick marks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/ticklength/">20 px tick length on the X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/ticks/">Formatted ticks on X axis</a>
    */
  val tickLength: js.UndefOr[Double] = js.undefined

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
    * <p>Color of the grid lines extending the ticks across the plot area.</p>
    * <p>In styled mode, the stroke is given in the <code>.highcharts-grid-line</code>
    * class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinecolor/">Green lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/gridlinecolor/">Green lines</a>
    */
  val gridLineColor: js.UndefOr[String | js.Object] = js.undefined

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
    * <p>Whether to allow decimals in this axis&#39; ticks. When counting
    * integers, like persons or hits on a web page, decimals should
    * be avoided in the labels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/allowdecimals-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/allowdecimals-false/">False</a>
    * @since 2.0
    */
  val allowDecimals: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When using an alternate grid color, a band is painted across the
    * plot area between every other grid line.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/alternategridcolor/">Alternate grid color on the Y axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/alternategridcolor/">Alternate grid color on the Y axis</a>
    */
  val alternateGridColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>An array defining breaks in the axis, the sections defined will be
    * left out and all the points shifted closer to each other.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-simple/">Simple break</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-visualized/">Advanced with callback</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/intraday-breaks/">Break on nights and weekends</a>
    * @since 4.1.0
    */
  val breaks: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>If categories are present for the xAxis, names are used instead of
    * numbers for that axis. Since Highcharts 3.0, categories can also
    * be extracted by giving each point a <a href="#series.data">name</a> and setting
    * axis <a href="#xAxis.type">type</a> to <code>category</code>. However, if you have multiple
    * series, best practice remains defining the <code>categories</code> array.</p>
    * <p>Example:</p>
    * <pre>categories: ['Apples', 'Bananas', 'Oranges']</pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/line-labels/">With</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/categories/">Without</a>
    */
  val categories: js.UndefOr[js.Array[String]] = js.undefined

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
    * <p>Configure a crosshair that follows either the mouse pointer or the
    * hovered point.</p>
    * <p>In styled mode, the crosshairs are styled in the
    * <code>.highcharts-crosshair</code>, <code>.highcharts-crosshair-thin</code> or
    * <code>.highcharts-xaxis-category</code> classes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-both/">Crosshair on both axes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/crosshairs-xy/">Crosshair on both axes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-both/">Crosshair on both axes</a>
    * @since 4.1
    */
  val crosshair: js.UndefOr[Boolean | js.Any] = js.undefined

  /**
    * <p><em>Requires Accessibility module</em></p>
    * <p>Description of the axis to screen reader users.</p>
    * @since 5.0.0
    */
  val description: js.UndefOr[String] = js.undefined

  /**
    * <p>Event handlers for the axis.</p>
    */
  val events: js.Any = js.undefined

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
    * <p>Index of another axis that this axis is linked to. When an axis is
    * linked to a master axis, it will take the same extremes as
    * the master, but as assigned by min or max or by setExtremes.
    * It can be used to show additional info, or to ease reading the
    * chart by duplicating the scales.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/linkedto/">Different string formats of the same date</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/linkedto/">Y values on both sides</a>
    * @since 2.0.2
    */
  val linkedTo: js.UndefOr[Double] = js.undefined

  /**
    * <p>Deprecated. Use <code>minRange</code> instead.</p>
    */
  val maxZoom: js.UndefOr[Double] = js.undefined

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
    * <p>The minimum range to display on this axis. The entire axis will not
    * be allowed to span over a smaller interval than this. For example,
    * for a datetime axis the main unit is milliseconds. If minRange is
    * set to 3600000, you can&#39;t zoom in more than to one hour.</p>
    * <p>The default minRange for the x axis is five times the smallest
    * interval between any of the data points.</p>
    * <p>On a logarithmic axis, the unit for the minimum range is the power.
    * So a minRange of 1 means that the axis can be zoomed to 10-100,
    * 100-1000, 1000-10000 etc.</p>
    * <p>Note that the <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and
    * <code>endOnTick</code> settings also affect how the extremes of the axis
    * are computed.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/minrange/">Minimum range of 5</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/minrange/">Max zoom of 6 months overrides user selections</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/axis/minrange/">Minimum range of 1000</a>
    */
  val minRange: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimum tick interval allowed in axis values. For example on
    * zooming in on an axis with daily data, this can be used to prevent
    * the axis from showing hours. Defaults to the closest distance between
    * two points on the axis.</p>
    * @since 2.3.0
    */
  val minTickInterval: js.UndefOr[Double] = js.undefined

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
    */
  val offset: js.UndefOr[Double] = js.undefined

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
    * <p>Whether to show the axis line and title when the axis has no data.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/showempty/">When clicking the legend to hide series, one axis preserves line and title, the other doesn't</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/showempty/">When clicking the legend to hide series, one axis preserves line and title, the other doesn't</a>
    * @since 1.1
    */
  val showEmpty: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to show the first tick label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/showfirstlabel-false/">Set to false on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/showfirstlabel/">Labels below plot lines on Y axis</a>
    */
  val showFirstLabel: js.UndefOr[Boolean] = js.undefined

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
    */
  val tickInterval: js.UndefOr[Double] = js.undefined

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
    * <p>Set grid options for the axis labels. Requires Highcharts Gantt.</p>
    * @since 6.2.0
    */
  val grid: js.UndefOr[js.Object] = js.undefined
}

object YAxis {
  /**
    * @param minLength <p>Minimal size of a resizable axis. Could be set as a percent. of plot area or pixel size.</p>. <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @param maxLength <p>Maximal size of a resizable axis. Could be set as a percent. of plot area or pixel size.</p>. <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @param resize <p>Options for axis resizing. This feature requires the. <code>drag-panes.js</code> -. <a href="http://code.highcharts.com/stock/modules/drag-panes.js">classic</a> or. <a href="http://code.highcharts.com/stock/js/modules/drag-panes.js">styled</a>. mode - module.</p>
    * @param tooltipValueFormat <p>Parallel coordinates only. Format that will be used for point.y. and available in <a href="#tooltip.pointFormat">tooltip.pointFormat</a> as. <code>{point.formattedValue}</code>. If not set, <code>{point.formattedValue}</code>. will use other options, in this order:</p>. <ol>. <li><a href="#yAxis.labels.format">yAxis.labels.format</a> will be used if. set</li>. <li>if yAxis is a category, then category name will be displayed</li>. <li>if yAxis is a datetime, then value will use the same format as. yAxis labels</li>. <li>if yAxis is linear/logarithmic type, then simple value will be. used</li>. </ol>
    * @param staticScale <p>For vertical axes only. Setting the static scale ensures that each tick unit. is translated into a fixed pixel height. For example, setting the static. scale to 24 results in each Y axis category taking up 24 pixels, and the. height of the chart adjusts. Adding or removing items will make the chart. resize.</p>
    * @param `type` <p>The type of axis. Can be one of <code>linear</code>, <code>logarithmic</code>, <code>datetime</code>,. <code>category</code> or <code>treegrid</code>. Defaults to <code>treegrid</code> for Gantt charts,. <code>linear</code> for other chart types.</p>. <p>In a datetime axis, the numbers are given in milliseconds, and tick. marks are placed on appropriate values, like full hours or days. In a. category or treegrid axis, the <a href="#series.line.data.name">point names</a>. of the chart&#39;s series are used for categories, if a. <a href="#xAxis.categories">categories</a> array is not defined.</p>
    * @param endOnTick <p>Whether to force the axis to end on a tick. Use this option with. the <code>maxPadding</code> option to control the axis end.</p>
    * @param maxPadding <p>Padding of the max value relative to the length of the axis. A. padding of 0.05 will make a 100px axis 5px longer. This is useful. when you don&#39;t want the highest data value to appear on the edge. of the plot area. When the axis&#39; <code>max</code> option is set or a max extreme. is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.</p>
    * @param minPadding <p>Padding of the min value relative to the length of the axis. A. padding of 0.05 will make a 100px axis 5px longer. This is useful. when you don&#39;t want the lowest data value to appear on the edge. of the plot area. When the axis&#39; <code>min</code> option is set or a max extreme. is set using <code>axis.setExtremes()</code>, the maxPadding will be ignored.</p>
    * @param tickPixelInterval <p>If tickInterval is <code>null</code> this option sets the approximate pixel. interval of the tick marks. Not applicable to categorized axis.</p>. <p>The tick interval is also influenced by the <a href="#xAxis.minTickInterval">minTickInterval</a> option, that, by default prevents ticks from. being denser than the data points.</p>
    * @param showLastLabel <p>Whether to show the last tick label. Defaults to <code>true</code> on cartesian. charts, and <code>false</code> on polar charts.</p>
    * @param labels <p>The axis labels show the number or category for each tick.</p>
    * @param startOnTick <p>Whether to force the axis to start on a tick. Use this option with. the <code>maxPadding</code> option to control the axis start.</p>
    * @param title <p>The axis title, showing next to the axis line.</p>
    * @param stackLabels <p>The stack labels show the total value for each bar in a stacked. column or bar chart. The label will be placed on top of positive. columns and below negative columns. In case of an inverted column. chart or a bar chart the label is placed to the right of positive. bars and to the left of negative bars.</p>
    * @param gridLineWidth <p>The width of the grid lines extending the ticks across the plot area.</p>. <p>In styled mode, the stroke width is given in the. <code>.highcharts-grid-line</code> class.</p>
    * @param lineWidth <p>The width of the line marking the axis itself.</p>. <p>In styled mode, the stroke width is given in the. <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    * @param angle <p>In a polar chart, this is the angle of the Y axis in degrees, where. 0 is up and 90 is right. The angle determines the position of the. axis line and the labels, though the coordinate system is unaffected.</p>
    * @param gridLineInterpolation <p>Polar charts only. Whether the grid lines should draw as a polygon. with straight lines between categories, or as circles. Can be either. <code>circle</code> or <code>polygon</code>.</p>
    * @param height <p>The height of the Y axis. If it&#39;s a number, it is interpreted as. pixels.</p>. <p>Since Highstock 2: If it&#39;s a percentage string, it is interpreted. as percentages of the total plot height.</p>
    * @param maxColor <p>Solid gauge only. Unless <a href="#yAxis.stops">stops</a> are set, the color. to represent the maximum value of the Y axis.</p>
    * @param minColor <p>Solid gauge only. Unless <a href="#yAxis.stops">stops</a> are set, the color. to represent the minimum value of the Y axis.</p>
    * @param reversed <p>Whether to reverse the axis so that the highest number is closest. to the origin.</p>
    * @param reversedStacks <p>If <code>true</code>, the first series in a stack will be drawn on top in a. positive, non-reversed Y axis. If <code>false</code>, the first series is in. the base of the stack.</p>
    * @param stops <p>Solid gauge series only. Color stops for the solid gauge. Use this. in cases where a linear gradient between a <code>minColor</code> and <code>maxColor</code>. is not sufficient. The stops is an array of tuples, where the first. item is a float between 0 and 1 assigning the relative position in. the gradient, and the second item is the color.</p>. <p>For solid gauges, the Y axis also inherits the concept of [data classes](<a href="http://api">http://api</a>.. highcharts.com/highmaps#colorAxis.dataClasses) from the Highmaps. color axis.</p>
    * @param tickWidth <p>The pixel width of the major tick marks.</p>
    * @param opposite <p>Whether to display the axis on the opposite side of the normal. The. normal is on the left side for vertical axes and bottom for. horizontal, so the opposite sides will be right and top respectively.. This is typically used with dual or multiple axes.</p>
    * @param lineColor <p>The color of the line marking the axis itself.</p>. <p>In styled mode, the line stroke is given in the. <code>.highcharts-axis-line</code> or <code>.highcharts-xaxis-line</code> class.</p>
    * @param max <p>The maximum value of the axis. If <code>null</code>, the max value is. automatically calculated.</p>. <p>If the <a href="#yAxis.endOnTick">endOnTick</a> option is true, the <code>max</code> value. might be rounded up.</p>. <p>If a <a href="#yAxis.tickAmount">tickAmount</a> is set, the axis may be extended. beyond the set max in order to reach the given number of ticks. The. same may happen in a chart with multiple axes, determined by <a href="#chart">chart.. alignTicks</a>, where a <code>tickAmount</code> is applied internally.</p>
    * @param min <p>The minimum value of the axis. If <code>null</code> the min value is. automatically calculated.</p>. <p>If the <a href="#yAxis.startOnTick">startOnTick</a> option is true (default),. the <code>min</code> value might be rounded down.</p>. <p>The automatically calculated minimum value is also affected by. <a href="#yAxis.floor">floor</a>, <a href="#yAxis.softMin">softMin</a>,. <a href="#yAxis.minPadding">minPadding</a>, <a href="#yAxis.minRange">minRange</a>. as well as <a href="#plotOptions.series.threshold">series.threshold</a>. and <a href="#plotOptions.series.softThreshold">series.softThreshold</a>.</p>
    * @param scrollbar <p>An optional scrollbar to display on the Y axis in response to. limiting the minimum an maximum of the axis values.</p>. <p>In styled mode, all the presentational options for the scrollbar. are replaced by the classes <code>.highcharts-scrollbar-thumb</code>,. <code>.highcharts-scrollbar-arrow</code>, <code>.highcharts-scrollbar-button</code>,. <code>.highcharts-scrollbar-rifles</code> and <code>.highcharts-scrollbar-track</code>.</p>
    * @param softMax <p>A soft maximum for the axis. If the series data maximum is less. than this, the axis will stay at this maximum, but if the series. data maximum is higher, the axis will flex to show all data.</p>. <p><strong>Note</strong>: The <a href="#plotOptions.series.softThreshold">series.softThreshold</a> option takes precedence over this. option.</p>
    * @param softMin <p>A soft minimum for the axis. If the series data minimum is greater. than this, the axis will stay at this minimum, but if the series. data minimum is lower, the axis will flex to show all data.</p>. <p><strong>Note</strong>: The <a href="#plotOptions.series.softThreshold">series.softThreshold</a> option takes precedence over this. option.</p>
    * @param top <p>The top position of the Y axis. If it&#39;s a number, it is interpreted. as pixel position relative to the chart.</p>. <p>Since Highstock 2: If it&#39;s a percentage string, it is interpreted. as percentages of the plot height, offset from plot area top.</p>
    * @param plotBands <p>An array of objects defining plot bands on the Y axis.</p>
    * @param plotLines <p>An array of objects representing plot lines on the X axis</p>
    * @param dateTimeLabelFormats <p>For a datetime axis, the scale will automatically adjust to the. appropriate unit. This member gives the default string. representations used for each unit. For intermediate values,. different units may be used, for example the <code>day</code> unit can be used. on midnight and <code>hour</code> unit be used for intermediate values on the. same axis. For an overview of the replacement codes, see. <a href="/class-reference/Highcharts#dateFormat">dateFormat</a>. Defaults to:</p>. <pre>{.     millisecond: '%H:%M:%S.%L',.     second: '%H:%M:%S',.     minute: '%H:%M',.     hour: '%H:%M',.     day: '%e. %b',.     week: '%e. %b',.     month: '%b \'%y',.     year: '%Y'. }</pre>
    * @param minorTickLength <p>The pixel length of the minor tick marks.</p>
    * @param minorTickPosition <p>The position of the minor tick marks relative to the axis line..  Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @param startOfWeek <p>For datetime axes, this decides where to put the tick between weeks..  0 = Sunday, 1 = Monday.</p>
    * @param tickLength <p>The pixel length of the main tick marks.</p>
    * @param tickmarkPlacement <p>For categorized axes only. If <code>on</code> the tick mark is placed in the. center of the category, if <code>between</code> the tick mark is placed between. categories. The default is <code>between</code> if the <code>tickInterval</code> is 1,.  else <code>on</code>.</p>
    * @param tickPosition <p>The position of the major tick marks relative to the axis line.. Can be one of <code>inside</code> and <code>outside</code>.</p>
    * @param minorGridLineColor <p>Color of the minor, secondary grid lines.</p>. <p>In styled mode, the stroke width is given in the. <code>.highcharts-minor-grid-line</code> class.</p>
    * @param minorGridLineWidth <p>Width of the minor, secondary grid lines.</p>. <p>In styled mode, the stroke width is given in the. <code>.highcharts-grid-line</code> class.</p>
    * @param minorTickColor <p>Color for the minor tick marks.</p>
    * @param gridLineColor <p>Color of the grid lines extending the ticks across the plot area.</p>. <p>In styled mode, the stroke is given in the <code>.highcharts-grid-line</code>. class.</p>
    * @param tickColor <p>Color for the main tick marks.</p>. <p>In styled mode, the stroke is given in the <code>.highcharts-tick</code>. class.</p>
    * @param alignTicks <p>When using multiple axis, the ticks of two or more opposite axes. will automatically be aligned by adding ticks to the axis or axes. with the least ticks, as if <code>tickAmount</code> were specified.</p>. <p>This can be prevented by setting <code>alignTicks</code> to false. If the grid. lines look messy, it&#39;s a good idea to hide them for the secondary. axis by setting <code>gridLineWidth</code> to 0.</p>. <p>If <code>startOnTick</code> or <code>endOnTick</code> in an Axis options are set to false,. then the <code>alignTicks</code> will be disabled for the Axis.</p>. <p>Disabled for logarithmic axes.</p>
    * @param allowDecimals <p>Whether to allow decimals in this axis&#39; ticks. When counting. integers, like persons or hits on a web page, decimals should. be avoided in the labels.</p>
    * @param alternateGridColor <p>When using an alternate grid color, a band is painted across the. plot area between every other grid line.</p>
    * @param breaks <p>An array defining breaks in the axis, the sections defined will be. left out and all the points shifted closer to each other.</p>
    * @param categories <p>If categories are present for the xAxis, names are used instead of. numbers for that axis. Since Highcharts 3.0, categories can also. be extracted by giving each point a <a href="#series.data">name</a> and setting. axis <a href="#xAxis.type">type</a> to <code>category</code>. However, if you have multiple. series, best practice remains defining the <code>categories</code> array.</p>. <p>Example:</p>. <pre>categories: ['Apples', 'Bananas', 'Oranges']</pre>
    * @param ceiling <p>The highest allowed value for automatically computed axis extremes.</p>
    * @param className <p>A class name that opens for styling the axis by CSS, especially in. Highcharts styled mode. The class name is applied to group elements. for the grid, axis elements and labels.</p>
    * @param crosshair <p>Configure a crosshair that follows either the mouse pointer or the. hovered point.</p>. <p>In styled mode, the crosshairs are styled in the. <code>.highcharts-crosshair</code>, <code>.highcharts-crosshair-thin</code> or. <code>.highcharts-xaxis-category</code> classes.</p>
    * @param description <p><em>Requires Accessibility module</em></p>. <p>Description of the axis to screen reader users.</p>
    * @param events <p>Event handlers for the axis.</p>
    * @param floor <p>The lowest allowed value for automatically computed axis extremes.</p>
    * @param gridLineDashStyle <p>The dash or dot style of the grid lines. For possible values, see. [this demonstration](<a href="https://jsfiddle.net/gh/get/library/pure/">https://jsfiddle.net/gh/get/library/pure/</a>. highcharts/highcharts/tree/master/samples/highcharts/plotoptions/. series-dashstyle-all/).</p>
    * @param gridZIndex <p>The Z index of the grid lines.</p>
    * @param id <p>An id for the axis. This can be used after render time to get. a pointer to the axis object through <code>chart.get()</code>.</p>
    * @param linkedTo <p>Index of another axis that this axis is linked to. When an axis is. linked to a master axis, it will take the same extremes as. the master, but as assigned by min or max or by setExtremes.. It can be used to show additional info, or to ease reading the. chart by duplicating the scales.</p>
    * @param maxZoom <p>Deprecated. Use <code>minRange</code> instead.</p>
    * @param minorGridLineDashStyle <p>The dash or dot style of the minor grid lines. For possible values,. see [this demonstration](<a href="https://jsfiddle.net/gh/get/library/pure/">https://jsfiddle.net/gh/get/library/pure/</a>. highcharts/highcharts/tree/master/samples/highcharts/plotoptions/. series-dashstyle-all/).</p>
    * @param minorTickInterval <p>Specific tick interval in axis units for the minor ticks. On a linear. axis, if <code>&quot;auto&quot;</code>, the minor tick interval is calculated as a fifth. of the tickInterval. If <code>null</code> or <code>undefined</code>, minor ticks are not. shown.</p>. <p>On logarithmic axes, the unit is the power of the value. For example,. setting the minorTickInterval to 1 puts one tick on each of 0.1, 1,. 10, 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks. between 1 and 10, 10 and 100 etc.</p>. <p>If user settings dictate minor ticks to become too dense, they don&#39;t. make sense, and will be ignored to prevent performance problems.</p>
    * @param minorTicks <p>Enable or disable minor ticks. Unless. <a href="#xAxis.minorTickInterval">minorTickInterval</a> is set, the tick. interval is calculated as a fifth of the <code>tickInterval</code>.</p>. <p>On a logarithmic axis, minor ticks are laid out based on a best. guess, attempting to enter approximately 5 minor ticks between. each major tick.</p>. <p>Prior to v6.0.0, ticks were unabled in auto layout by setting. <code>minorTickInterval</code> to <code>&quot;auto&quot;</code>.</p>
    * @param minorTickWidth <p>The pixel width of the minor tick mark.</p>
    * @param minRange <p>The minimum range to display on this axis. The entire axis will not. be allowed to span over a smaller interval than this. For example,. for a datetime axis the main unit is milliseconds. If minRange is. set to 3600000, you can&#39;t zoom in more than to one hour.</p>. <p>The default minRange for the x axis is five times the smallest. interval between any of the data points.</p>. <p>On a logarithmic axis, the unit for the minimum range is the power.. So a minRange of 1 means that the axis can be zoomed to 10-100,. 100-1000, 1000-10000 etc.</p>. <p>Note that the <code>minPadding</code>, <code>maxPadding</code>, <code>startOnTick</code> and. <code>endOnTick</code> settings also affect how the extremes of the axis. are computed.</p>
    * @param minTickInterval <p>The minimum tick interval allowed in axis values. For example on. zooming in on an axis with daily data, this can be used to prevent. the axis from showing hours. Defaults to the closest distance between. two points on the axis.</p>
    * @param offset <p>The distance in pixels from the plot area to the axis line.. A positive offset moves the axis with it&#39;s line, labels and ticks. away from the plot area. This is typically used when two or more. axes are displayed on the same side of the plot. With multiple. axes the offset is dynamically adjusted to avoid collision, this. can be overridden by setting offset explicitly.</p>
    * @param pane <p>Refers to the index in the <a href="#panes">panes</a> array. Used for circular. gauges and polar charts. When the option is not set then first pane. will be used.</p>
    * @param range <p>The zoomed range to display when only defining one or none of <code>min</code>. or <code>max</code>. For example, to show the latest month, a range of one month. can be set.</p>
    * @param showEmpty <p>Whether to show the axis line and title when the axis has no data.</p>
    * @param showFirstLabel <p>Whether to show the first tick label.</p>
    * @param tickAmount <p>The amount of ticks to draw on the axis. This opens up for aligning. the ticks of multiple charts or panes within a chart. This option. overrides the <code>tickPixelInterval</code> option.</p>. <p>This option only has an effect on linear axes. Datetime, logarithmic. or category axes are not affected.</p>
    * @param tickInterval <p>The interval of the tick marks in axis units. When <code>undefined</code>, the. tick interval is computed to approximately follow the. <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> on linear and datetime. axes. On categorized axes, a <code>undefined</code> tickInterval will default to. 1, one category. Note that datetime axes are based on milliseconds,. so for example an interval of one day is expressed as. <code>24 * 3600 * 1000</code>.</p>. <p>On logarithmic axes, the tickInterval is based on powers, so a. tickInterval of 1 means one tick on each of 0.1, 1, 10, 100 etc. A. tickInterval of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval. of 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20,. 40 etc.</p>. <p>If the tickInterval is too dense for labels to be drawn, Highcharts. may remove ticks.</p>. <p>If the chart has multiple axes, the <a href="#chart.alignTicks">alignTicks</a>. option may interfere with the <code>tickInterval</code> setting.</p>
    * @param tickPositioner <p>A callback function returning array defining where the ticks are. laid out on the axis. This overrides the default behaviour of. <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>. The automatic tick positions are accessible. through <code>this.tickPositions</code> and can be modified by the callback.</p>
    * @param tickPositions <p>An array defining where the ticks are laid out on the axis. This. overrides the default behaviour of <a href="#xAxis.tickPixelInterval">tickPixelInterval</a> and <a href="#xAxis.tickInterval">tickInterval</a>.</p>
    * @param uniqueNames <p>Applies only when the axis <code>type</code> is <code>category</code>. When <code>uniqueNames</code>. is true, points are placed on the X axis according to their names.. If the same point name is repeated in the same or another series,. the point is placed on the same X position as other points of the. same name. When <code>uniqueNames</code> is false, the points are laid out in. increasing X positions regardless of their names, and the X axis. category will take the name of the last point in each position.</p>
    * @param units <p>Datetime axis only. An array determining what time intervals the. ticks are allowed to fall on. Each array item is an array where the. first value is the time unit and the second value another array of. allowed multiples. Defaults to:</p>. <pre>units: [[.     'millisecond', // unit name.     [1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples. ], [.     'second',.     [1, 2, 5, 10, 15, 30]. ], [.     'minute',.     [1, 2, 5, 10, 15, 30]. ], [.     'hour',.     [1, 2, 3, 4, 6, 8, 12]. ], [.     'day',.     [1]. ], [.     'week',.     [1]. ], [.     'month',.     [1, 3, 6]. ], [.     'year',.     null. ]]</pre>
    * @param visible <p>Whether axis, including axis title, line, ticks and labels, should. be visible.</p>
    * @param maxRange <p>Maximum range which can be set using the navigator&#39;s handles.. Opposite of <a href="#xAxis.minRange">xAxis.minRange</a>.</p>
    * @param grid <p>Set grid options for the axis labels. Requires Highcharts Gantt.</p>
    */
  def apply(minLength: js.UndefOr[Double | String] = js.undefined, maxLength: js.UndefOr[String | Double] = js.undefined, resize: js.UndefOr[js.Any] = js.undefined, tooltipValueFormat: js.UndefOr[String] = js.undefined, staticScale: js.UndefOr[Double] = js.undefined, `type`: js.UndefOr[String] = "linear", endOnTick: js.UndefOr[Boolean] = js.undefined, maxPadding: js.UndefOr[Double] = js.undefined, minPadding: js.UndefOr[Double] = js.undefined, tickPixelInterval: js.UndefOr[Double] = js.undefined, showLastLabel: js.UndefOr[Boolean] = js.undefined, labels: js.UndefOr[js.Any] = js.undefined, startOnTick: js.UndefOr[Boolean] = js.undefined, title: js.UndefOr[js.Any] = js.undefined, stackLabels: js.UndefOr[js.Any] = js.undefined, gridLineWidth: js.UndefOr[Double] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, angle: js.UndefOr[Double] = js.undefined, gridLineInterpolation: js.UndefOr[String] = js.undefined, height: js.UndefOr[Double | String] = js.undefined, maxColor: js.UndefOr[String | js.Object] = js.undefined, minColor: js.UndefOr[String | js.Object] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined, reversedStacks: js.UndefOr[Boolean] = js.undefined, stops: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined, tickWidth: js.UndefOr[Double] = js.undefined, opposite: js.UndefOr[Boolean] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, max: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined, scrollbar: js.UndefOr[js.Any] = js.undefined, softMax: js.UndefOr[Double] = js.undefined, softMin: js.UndefOr[Double] = js.undefined, top: js.UndefOr[Double | String] = js.undefined, plotBands: js.UndefOr[js.Array[js.Any]] = js.undefined, plotLines: js.UndefOr[js.Array[js.Any]] = js.undefined, dateTimeLabelFormats: js.UndefOr[js.Any] = js.undefined, minorTickLength: js.UndefOr[Double] = js.undefined, minorTickPosition: js.UndefOr[String] = js.undefined, startOfWeek: js.UndefOr[Double] = js.undefined, tickLength: js.UndefOr[Double] = js.undefined, tickmarkPlacement: js.UndefOr[String] = js.undefined, tickPosition: js.UndefOr[String] = js.undefined, minorGridLineColor: js.UndefOr[String | js.Object] = js.undefined, minorGridLineWidth: js.UndefOr[Double] = js.undefined, minorTickColor: js.UndefOr[String | js.Object] = js.undefined, gridLineColor: js.UndefOr[String | js.Object] = js.undefined, tickColor: js.UndefOr[String | js.Object] = js.undefined, alignTicks: js.UndefOr[Boolean] = js.undefined, allowDecimals: js.UndefOr[Boolean] = js.undefined, alternateGridColor: js.UndefOr[String | js.Object] = js.undefined, breaks: js.UndefOr[js.Array[js.Any]] = js.undefined, categories: js.UndefOr[js.Array[String]] = js.undefined, ceiling: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, crosshair: js.UndefOr[Boolean | js.Any] = js.undefined, description: js.UndefOr[String] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, floor: js.UndefOr[Double] = js.undefined, gridLineDashStyle: js.UndefOr[String] = js.undefined, gridZIndex: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, linkedTo: js.UndefOr[Double] = js.undefined, maxZoom: js.UndefOr[Double] = js.undefined, minorGridLineDashStyle: js.UndefOr[String] = js.undefined, minorTickInterval: js.UndefOr[Double | String | Null] = js.undefined, minorTicks: js.UndefOr[Boolean] = js.undefined, minorTickWidth: js.UndefOr[Double] = js.undefined, minRange: js.UndefOr[Double] = js.undefined, minTickInterval: js.UndefOr[Double] = js.undefined, offset: js.UndefOr[Double] = js.undefined, pane: js.UndefOr[Double] = js.undefined, range: js.UndefOr[Double] = js.undefined, showEmpty: js.UndefOr[Boolean] = js.undefined, showFirstLabel: js.UndefOr[Boolean] = js.undefined, tickAmount: js.UndefOr[Double] = js.undefined, tickInterval: js.UndefOr[Double] = js.undefined, tickPositioner: js.UndefOr[js.Function] = js.undefined, tickPositions: js.UndefOr[js.Array[Double]] = js.undefined, uniqueNames: js.UndefOr[Boolean] = js.undefined, units: js.UndefOr[js.Array[js.Array[String | js.Array[Double]]]] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, maxRange: js.UndefOr[Double] = js.undefined, grid: js.UndefOr[js.Object] = js.undefined): YAxis = {
    val minLengthOuter: js.UndefOr[Double | String] = minLength
    val maxLengthOuter: js.UndefOr[String | Double] = maxLength
    val resizeOuter: js.Any = resize
    val tooltipValueFormatOuter: js.UndefOr[String] = tooltipValueFormat
    val staticScaleOuter: js.UndefOr[Double] = staticScale
    val typeOuter: js.UndefOr[String] = `type`
    val endOnTickOuter: js.UndefOr[Boolean] = endOnTick
    val maxPaddingOuter: js.UndefOr[Double] = maxPadding
    val minPaddingOuter: js.UndefOr[Double] = minPadding
    val tickPixelIntervalOuter: js.UndefOr[Double] = tickPixelInterval
    val showLastLabelOuter: js.UndefOr[Boolean] = showLastLabel
    val labelsOuter: js.Any = labels
    val startOnTickOuter: js.UndefOr[Boolean] = startOnTick
    val titleOuter: js.Any = title
    val stackLabelsOuter: js.Any = stackLabels
    val gridLineWidthOuter: js.UndefOr[Double] = gridLineWidth
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val angleOuter: js.UndefOr[Double] = angle
    val gridLineInterpolationOuter: js.UndefOr[String] = gridLineInterpolation
    val heightOuter: js.UndefOr[Double | String] = height
    val maxColorOuter: js.UndefOr[String | js.Object] = maxColor
    val minColorOuter: js.UndefOr[String | js.Object] = minColor
    val reversedOuter: js.UndefOr[Boolean] = reversed
    val reversedStacksOuter: js.UndefOr[Boolean] = reversedStacks
    val stopsOuter: js.UndefOr[js.Array[js.Array[js.Any]]] = stops
    val tickWidthOuter: js.UndefOr[Double] = tickWidth
    val oppositeOuter: js.UndefOr[Boolean] = opposite
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val maxOuter: js.UndefOr[Double] = max
    val minOuter: js.UndefOr[Double] = min
    val scrollbarOuter: js.Any = scrollbar
    val softMaxOuter: js.UndefOr[Double] = softMax
    val softMinOuter: js.UndefOr[Double] = softMin
    val topOuter: js.UndefOr[Double | String] = top
    val plotBandsOuter: js.UndefOr[js.Array[js.Any]] = plotBands
    val plotLinesOuter: js.UndefOr[js.Array[js.Any]] = plotLines
    val dateTimeLabelFormatsOuter: js.Any = dateTimeLabelFormats
    val minorTickLengthOuter: js.UndefOr[Double] = minorTickLength
    val minorTickPositionOuter: js.UndefOr[String] = minorTickPosition
    val startOfWeekOuter: js.UndefOr[Double] = startOfWeek
    val tickLengthOuter: js.UndefOr[Double] = tickLength
    val tickmarkPlacementOuter: js.UndefOr[String] = tickmarkPlacement
    val tickPositionOuter: js.UndefOr[String] = tickPosition
    val minorGridLineColorOuter: js.UndefOr[String | js.Object] = minorGridLineColor
    val minorGridLineWidthOuter: js.UndefOr[Double] = minorGridLineWidth
    val minorTickColorOuter: js.UndefOr[String | js.Object] = minorTickColor
    val gridLineColorOuter: js.UndefOr[String | js.Object] = gridLineColor
    val tickColorOuter: js.UndefOr[String | js.Object] = tickColor
    val alignTicksOuter: js.UndefOr[Boolean] = alignTicks
    val allowDecimalsOuter: js.UndefOr[Boolean] = allowDecimals
    val alternateGridColorOuter: js.UndefOr[String | js.Object] = alternateGridColor
    val breaksOuter: js.UndefOr[js.Array[js.Any]] = breaks
    val categoriesOuter: js.UndefOr[js.Array[String]] = categories
    val ceilingOuter: js.UndefOr[Double] = ceiling
    val classNameOuter: js.UndefOr[String] = className
    val crosshairOuter: js.UndefOr[Boolean | js.Any] = crosshair
    val descriptionOuter: js.UndefOr[String] = description
    val eventsOuter: js.Any = events
    val floorOuter: js.UndefOr[Double] = floor
    val gridLineDashStyleOuter: js.UndefOr[String] = gridLineDashStyle
    val gridZIndexOuter: js.UndefOr[Double] = gridZIndex
    val idOuter: js.UndefOr[String] = id
    val linkedToOuter: js.UndefOr[Double] = linkedTo
    val maxZoomOuter: js.UndefOr[Double] = maxZoom
    val minorGridLineDashStyleOuter: js.UndefOr[String] = minorGridLineDashStyle
    val minorTickIntervalOuter: js.UndefOr[Double | String | Null] = minorTickInterval
    val minorTicksOuter: js.UndefOr[Boolean] = minorTicks
    val minorTickWidthOuter: js.UndefOr[Double] = minorTickWidth
    val minRangeOuter: js.UndefOr[Double] = minRange
    val minTickIntervalOuter: js.UndefOr[Double] = minTickInterval
    val offsetOuter: js.UndefOr[Double] = offset
    val paneOuter: js.UndefOr[Double] = pane
    val rangeOuter: js.UndefOr[Double] = range
    val showEmptyOuter: js.UndefOr[Boolean] = showEmpty
    val showFirstLabelOuter: js.UndefOr[Boolean] = showFirstLabel
    val tickAmountOuter: js.UndefOr[Double] = tickAmount
    val tickIntervalOuter: js.UndefOr[Double] = tickInterval
    val tickPositionerOuter: js.UndefOr[js.Function] = tickPositioner
    val tickPositionsOuter: js.UndefOr[js.Array[Double]] = tickPositions
    val uniqueNamesOuter: js.UndefOr[Boolean] = uniqueNames
    val unitsOuter: js.UndefOr[js.Array[js.Array[String | js.Array[Double]]]] = units
    val visibleOuter: js.UndefOr[Boolean] = visible
    val maxRangeOuter: js.UndefOr[Double] = maxRange
    val gridOuter: js.UndefOr[js.Object] = grid
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxis {
      override val minLength: js.UndefOr[Double | String] = minLengthOuter
      override val maxLength: js.UndefOr[String | Double] = maxLengthOuter
      override val resize: js.Any = resizeOuter
      override val tooltipValueFormat: js.UndefOr[String] = tooltipValueFormatOuter
      override val staticScale: js.UndefOr[Double] = staticScaleOuter
      override val `type`: js.UndefOr[String] = typeOuter
      override val endOnTick: js.UndefOr[Boolean] = endOnTickOuter
      override val maxPadding: js.UndefOr[Double] = maxPaddingOuter
      override val minPadding: js.UndefOr[Double] = minPaddingOuter
      override val tickPixelInterval: js.UndefOr[Double] = tickPixelIntervalOuter
      override val showLastLabel: js.UndefOr[Boolean] = showLastLabelOuter
      override val labels: js.Any = labelsOuter
      override val startOnTick: js.UndefOr[Boolean] = startOnTickOuter
      override val title: js.Any = titleOuter
      override val stackLabels: js.Any = stackLabelsOuter
      override val gridLineWidth: js.UndefOr[Double] = gridLineWidthOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val angle: js.UndefOr[Double] = angleOuter
      override val gridLineInterpolation: js.UndefOr[String] = gridLineInterpolationOuter
      override val height: js.UndefOr[Double | String] = heightOuter
      override val maxColor: js.UndefOr[String | js.Object] = maxColorOuter
      override val minColor: js.UndefOr[String | js.Object] = minColorOuter
      override val reversed: js.UndefOr[Boolean] = reversedOuter
      override val reversedStacks: js.UndefOr[Boolean] = reversedStacksOuter
      override val stops: js.UndefOr[js.Array[js.Array[js.Any]]] = stopsOuter
      override val tickWidth: js.UndefOr[Double] = tickWidthOuter
      override val opposite: js.UndefOr[Boolean] = oppositeOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val max: js.UndefOr[Double] = maxOuter
      override val min: js.UndefOr[Double] = minOuter
      override val scrollbar: js.Any = scrollbarOuter
      override val softMax: js.UndefOr[Double] = softMaxOuter
      override val softMin: js.UndefOr[Double] = softMinOuter
      override val top: js.UndefOr[Double | String] = topOuter
      override val plotBands: js.UndefOr[js.Array[js.Any]] = plotBandsOuter
      override val plotLines: js.UndefOr[js.Array[js.Any]] = plotLinesOuter
      override val dateTimeLabelFormats: js.Any = dateTimeLabelFormatsOuter
      override val minorTickLength: js.UndefOr[Double] = minorTickLengthOuter
      override val minorTickPosition: js.UndefOr[String] = minorTickPositionOuter
      override val startOfWeek: js.UndefOr[Double] = startOfWeekOuter
      override val tickLength: js.UndefOr[Double] = tickLengthOuter
      override val tickmarkPlacement: js.UndefOr[String] = tickmarkPlacementOuter
      override val tickPosition: js.UndefOr[String] = tickPositionOuter
      override val minorGridLineColor: js.UndefOr[String | js.Object] = minorGridLineColorOuter
      override val minorGridLineWidth: js.UndefOr[Double] = minorGridLineWidthOuter
      override val minorTickColor: js.UndefOr[String | js.Object] = minorTickColorOuter
      override val gridLineColor: js.UndefOr[String | js.Object] = gridLineColorOuter
      override val tickColor: js.UndefOr[String | js.Object] = tickColorOuter
      override val alignTicks: js.UndefOr[Boolean] = alignTicksOuter
      override val allowDecimals: js.UndefOr[Boolean] = allowDecimalsOuter
      override val alternateGridColor: js.UndefOr[String | js.Object] = alternateGridColorOuter
      override val breaks: js.UndefOr[js.Array[js.Any]] = breaksOuter
      override val categories: js.UndefOr[js.Array[String]] = categoriesOuter
      override val ceiling: js.UndefOr[Double] = ceilingOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val crosshair: js.UndefOr[Boolean | js.Any] = crosshairOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val events: js.Any = eventsOuter
      override val floor: js.UndefOr[Double] = floorOuter
      override val gridLineDashStyle: js.UndefOr[String] = gridLineDashStyleOuter
      override val gridZIndex: js.UndefOr[Double] = gridZIndexOuter
      override val id: js.UndefOr[String] = idOuter
      override val linkedTo: js.UndefOr[Double] = linkedToOuter
      override val maxZoom: js.UndefOr[Double] = maxZoomOuter
      override val minorGridLineDashStyle: js.UndefOr[String] = minorGridLineDashStyleOuter
      override val minorTickInterval: js.UndefOr[Double | String | Null] = minorTickIntervalOuter
      override val minorTicks: js.UndefOr[Boolean] = minorTicksOuter
      override val minorTickWidth: js.UndefOr[Double] = minorTickWidthOuter
      override val minRange: js.UndefOr[Double] = minRangeOuter
      override val minTickInterval: js.UndefOr[Double] = minTickIntervalOuter
      override val offset: js.UndefOr[Double] = offsetOuter
      override val pane: js.UndefOr[Double] = paneOuter
      override val range: js.UndefOr[Double] = rangeOuter
      override val showEmpty: js.UndefOr[Boolean] = showEmptyOuter
      override val showFirstLabel: js.UndefOr[Boolean] = showFirstLabelOuter
      override val tickAmount: js.UndefOr[Double] = tickAmountOuter
      override val tickInterval: js.UndefOr[Double] = tickIntervalOuter
      override val tickPositioner: js.UndefOr[js.Function] = tickPositionerOuter
      override val tickPositions: js.UndefOr[js.Array[Double]] = tickPositionsOuter
      override val uniqueNames: js.UndefOr[Boolean] = uniqueNamesOuter
      override val units: js.UndefOr[js.Array[js.Array[String | js.Array[Double]]]] = unitsOuter
      override val visible: js.UndefOr[Boolean] = visibleOuter
      override val maxRange: js.UndefOr[Double] = maxRangeOuter
      override val grid: js.UndefOr[js.Object] = gridOuter
    })
  }
}
