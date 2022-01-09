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
  * @note JavaScript name: <code>plotOptions-bellcurve</code>
  */
class PlotOptionsBellcurve extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The main color of the series. In line type series it applies to the
    * line and the point markers unless otherwise specified. In bar type
    * series it applies to the bars unless a color is specified per point.
    * The default value is pulled from the <code>options.colors</code> array.</p>
    * <p>In styled mode, the color can be defined by the
    * <a href="#plotOptions.series.colorIndex">colorIndex</a> option. Also, the series
    * color can be set with the <code>.highcharts-series</code>,
    * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
    * <code>.highcharts-series-{n}</code> class, or individual classes given by the
    * <code>className</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-color-general/">General plot option</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-color-specific/">One specific series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-color-area/">Area color</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/infographic/">Pattern fill</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/category-map/">Category map by multiple series</a>
    * @since 6.0.0
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Fill color or gradient for the area. When <code>null</code>, the series&#39; <code>color</code>
    * is used with the series&#39; <code>fillOpacity</code>.</p>
    * <p>In styled mode, the fill color can be set with the <code>.highcharts-area</code>
    * class name.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillcolor-default/">Null by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillcolor-gradient/">Gradient</a>
    * @since 6.0.0
    */
  var fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Fill opacity for the area. When you set an explicit <code>fillColor</code>,
    * the <code>fillOpacity</code> is not applied. Instead, you should define the
    * opacity in the <code>fillColor</code> with an rgba color definition. The
    * <code>fillOpacity</code> setting, also the default setting, overrides the alpha
    * component of the <code>color</code> setting.</p>
    * <p>In styled mode, the fill opacity can be set with the
    * <code>.highcharts-area</code> class name.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillopacity/">Automatic fill color and fill opacity of 0.1</a>
    * @since 6.0.0
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>This option allows to define the length of the bell curve. A unit of
    * the length of the bell curve is standard deviation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bellcurve-intervals-pointsininterval">Intervals and points in interval</a>
    * @since 6.0.0
    */
  var intervals: js.UndefOr[Double] = js.undefined

  /**
    * <p>Options for the point markers of line-like series. Properties like
    * <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual appearance
    * of the markers. Other series types, like column series, don&#39;t have
    * markers, but have visual options on the series level instead.</p>
    * <p>In styled mode, the markers can be styled with the
    * <code>.highcharts-point</code>, <code>.highcharts-point-hover</code> and
    * <code>.highcharts-point-select</code> class names.</p>
    * @since 6.0.0
    */
  var marker: js.Any = js.undefined

  /**
    * <p>Defines how many points should be plotted within 1 interval. See
    * <code>plotOptions.bellcurve.intervals</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bellcurve-intervals-pointsininterval">Intervals and points in interval</a>
    * @since 6.0.0
    */
  var pointsInInterval: js.UndefOr[Double] = js.undefined

  /**
    * <p>A separate color for the graph line. By default the line takes the
    * <code>color</code> of the series, but the lineColor setting allows setting a
    * separate color for the line without altering the <code>fillColor</code>.</p>
    * <p>In styled mode, the line stroke can be set with the
    * <code>.highcharts-graph</code> class name.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-linecolor/">Dark gray line</a>
    * @since 6.0.0
    */
  var lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>A separate color for the negative part of the area.</p>
    * <p>In styled mode, a negative color is set with the
    * <code>.highcharts-negative</code> class name.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-negative-color/">Negative color in styled mode</a>
    * @since 3.0.0
    */
  var negativeFillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The Y axis value to serve as the base for the area, for
    * distinguishing between values above and below a threshold. The area
    * between the graph and the threshold is filled.</p>
    * <ul>
    * <li>If a number is given, the Y axis will scale to the threshold.</li>
    * <li>If <code>null</code>, the scaling behaves like a line series with fill between
    * the graph and the Y axis minimum.</li>
    * <li>If <code>Infinity</code> or <code>-Infinity</code>, the area between the graph and the
    * corresponding Y axis extreme is filled (since v6.1.0).</li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-threshold/">A threshold of 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-threshold-infinity/">A threshold of Infinity</a>
    * @since 2.0.0
    */
  var threshold: js.UndefOr[Double | Null] = js.undefined

  /**
    * <p>Whether the whole area or just the line should respond to mouseover
    * tooltips and other mouse or touch events.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-trackbyarea/">Display the tooltip when the area is hovered</a>
    * @since 1.1.6
    */
  var trackByArea: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The SVG value used for the <code>stroke-linecap</code> and <code>stroke-linejoin</code>
    * of a line graph. Round means that lines are rounded in the ends and
    * bends.</p>
    * @since 3.0.7
    */
  var linecap: js.Any = js.undefined

  /**
    * <p>Accessibility options for a series.</p>
    * @since 7.1.0
    */
  var accessibility: js.Any = js.undefined

  /**
    * <p>Whether all areas of the map defined in <code>mapData</code> should be rendered.
    * If <code>true</code>, areas which don&#39;t correspond to a data point, are rendered
    * as <code>null</code> points. If <code>false</code>, those areas are skipped.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allareas-false/">All areas set to false</a>
    * @since 6.0.0
    */
  var allAreas: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Allow this series&#39; points to be selected by clicking on the graphic
    * (columns, point markers, pie slices, map areas etc).</p>
    * <p>The selected points can be handled by point select and unselect
    * events, or collectively by the <a href="/class-reference/Highcharts.Chart#getSelectedPoints">getSelectedPoints</a> function.</p>
    * <p>And alternative way of selecting points is through dragging.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-allowpointselect-line/">Line</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-allowpointselect-column/">Column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-allowpointselect-pie/">Pie</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection-points/">Select a range of points through a drag selection</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Map area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/mapbubble-allowpointselect/">Map bubble</a>
    * @since 1.2.0
    */
  var allowPointSelect: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enable or disable the initial animation when a series is displayed.
    * The animation can also be set as a configuration object. Please
    * note that this option only applies to the initial animation of the
    * series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.
    * The following properties are supported:</p>
    * <ul>
    * <li><p><code>defer</code>: The animation delay time in milliseconds.</p>
    * </li>
    * <li><p><code>duration</code>: The duration of the animation in milliseconds.</p>
    * </li>
    * <li><p><code>easing</code>: Can be a string reference to an easing function set on
    * the <code>Math</code> object or a function. See the <em>Custom easing function</em>
    * demo below.</p>
    * </li>
    * </ul>
    * <p>Due to poor performance, animation is disabled in old IE browsers
    * for several chart types.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-disabled/">Animation disabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-slower/">Slower animation</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">Custom easing function</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/animation-slower/">Slower animation</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/animation-easing/">Custom easing function</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-animation-true/">Animation enabled on map series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/mapbubble-animation-false/">Disabled on mapbubble series</a>
    * @since 6.0.0
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>For some series, there is a limit that shuts down initial animation
    * by default when the total number of points in the chart is too high.
    * For example, for a column chart and its derivatives, animation does
    * not run if there is more than 250 points totally. To disable this
    * cap, set <code>animationLimit</code> to <code>Infinity</code>.</p>
    * @since 6.0.0
    */
  var animationLimit: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border color of the map areas.</p>
    * <p>In styled mode, the border stroke is given in the <code>.highcharts-point</code>
    * class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-border/">Borders demo</a>
    * @since 6.0.0
    */
  var borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border width of each map area.</p>
    * <p>In styled mode, the border stroke width is given in the
    * <code>.highcharts-point</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-border/">Borders demo</a>
    * @since 6.0.0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>An additional class name to apply to the series&#39; graphical elements.
    * This option does not replace default class names of the graphical
    * element.</p>
    * @since 5.0.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>Disable this option to allow series rendering in the whole plotting
    * area.</p>
    * <p><strong>Note:</strong> Clipping should be always enabled when
    * <a href="#chart.zoomType">chart.zoomType</a> is set</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-clip/">Disabled clipping</a>
    * @since 3.0.0
    */
  var clip: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When using dual or multiple color axes, this number defines which
    * colorAxis the particular series is connected to. It refers to
    * either the
    * {@link #colorAxis.id|axis id}
    * or the index of the axis in the colorAxis array, with 0 being the
    * first. Set this option to false to prevent a series from connecting
    * to the default color axis.</p>
    * <p>Since v7.2.0 the option can also be an axis id or an axis index
    * instead of a boolean flag.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/coloraxis-with-pie/">Color axis with pie series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/multiple-coloraxis/">Multiple color axis</a>
    * @since 6.0.0
    */
  var colorAxis: js.UndefOr[Double | String | Boolean] = js.undefined

  /**
    * <p>Styled mode only. A specific color index to use for the series, so
    * its graphic representations are given the class name
    * <code>highcharts-color-{n}</code>.</p>
    * @since 5.0.0
    */
  var colorIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>Determines what data value should be used to calculate point color
    * if <code>colorAxis</code> is used. Requires to set <code>min</code> and <code>max</code> if some
    * custom point property is used or if approximation for data grouping
    * is set to <code>&#39;sum&#39;</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/custom-color-key/">Custom color key</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/changed-default-color-key/">Changed default color key</a>
    * @since 7.2.0
    */
  var colorKey: js.UndefOr[String] = js.undefined

  /**
    * <p>Compare the values of the series against the first non-null, non-
    * zero value in the visible range. The y axis will show percentage
    * or absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code>
    * or <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows
    * comparing the development of the series against each other. Adds
    * a <code>change</code> field to every point object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-compare-percent/">Percent</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-compare-value/">Value</a>
    * @since 1.0.1
    */
  var compare: js.UndefOr[String] = js.undefined

  /**
    * <p>When <a href="#plotOptions.series.compare">compare</a> is <code>percent</code>, this option
    * dictates whether to use 0 or 100 as the base of comparison.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-comparebase/">Compare base is 100</a>
    * @since 5.0.6
    */
  var compareBase: js.UndefOr[Double] = js.undefined

  /**
    * <p>Defines if comparison should start from the first point within the visible
    * range or should start from the first point <strong>before</strong> the range.</p>
    * <p>In other words, this flag determines if first point within the visible range
    * will have 0% (<code>compareStart=true</code>) or should have been already calculated
    * according to the previous point (<code>compareStart=false</code>).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-comparestart/">Calculate compare within visible range</a>
    * @since 6.0.0
    */
  var compareStart: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Polar charts only. Whether to connect the ends of a line series
    * plot across the extremes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/line-connectends-false/">Do not connect</a>
    * @since 2.3.0
    */
  var connectEnds: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Override Pathfinder connector options for a series. Requires Highcharts Gantt
    * to be loaded.</p>
    * @since 6.2.0
    */
  var connectors: js.UndefOr[CleanJsObject[PlotOptionsBellcurveConnectors]] = js.undefined

  /**
    * <p>When true, each point or column edge is rounded to its nearest pixel
    * in order to render sharp on screen. In some cases, when there are a
    * lot of densely packed columns, this leads to visible difference
    * in column widths or distance between columns. In these cases,
    * setting <code>crisp</code> to <code>false</code> may look better, even though each column
    * is rendered blurry.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-crisp-false/">Crisp is false</a>
    * @since 5.0.10
    */
  var crisp: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When the series contains less points than the crop threshold, all
    * points are drawn, even if the points fall outside the visible plot
    * area at the current zoom. The advantage of drawing all points
    * (including markers and columns), is that animation is performed on
    * updates. On the other hand, when the series contains more points than
    * the crop threshold, the series data is cropped to only contain points
    * that fall within the plot area. The advantage of cropping away
    * invisible points is to increase performance on large series.</p>
    * @since 2.2.0
    */
  var cropThreshold: js.UndefOr[Double] = js.undefined

  /**
    * <p>Cumulative Sum feature replaces points&#39; values with the following formula:
    * <code>sum of all previous points&#39; values + current point&#39;s value</code>.
    * Works only for points in a visible range.
    * Adds the <code>cumulativeSum</code> field to each point object that can be accessed
    * e.g. in the <a href="https://api.highcharts.com/highstock/tooltip.pointFormat">tooltip.pointFormat</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-cumulative-sum/">Cumulative Sum</a>
    * @since 9.3.0
    */
  var cumulative: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>You can set the cursor to &quot;pointer&quot; if you have click events attached
    * to the series, to signal to the user that the points and lines can
    * be clicked.</p>
    * <p>In styled mode, the series cursor can be set with the same classes
    * as listed under <a href="#plotOptions.series.color">series.color</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-cursor-line/">On line graph</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-cursor-column/">On columns</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-cursor-scatter/">On scatter markers</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/cursor/">Pointer on a line graph</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Map area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/mapbubble-allowpointselect/">Map bubble</a>
    * @since 6.0.0
    */
  var cursor: js.UndefOr[String] = js.undefined

  /**
    * <p>A reserved subspace to store options and values for customized
    * functionality. Here you can add additional data for your own event
    * callbacks and formatter callbacks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/custom/">Point and series with custom data</a>
    * @since 6.0.0
    */
  var custom: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Name of the dash style to use for the graph, or for some series types
    * the outline of each shape.</p>
    * <p>In styled mode, the
    * <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-dashstyle/">stroke dash-array</a>
    * can be set with the same classes as listed under
    * <a href="#plotOptions.series.color">series.color</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">Possible values demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle/">Chart suitable for printing in black and white</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">Possible values demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">Possible values demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-dashstyle/">Dotted borders on a map</a>
    * @since 2.1.0
    */
  var dashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Data grouping is the concept of sampling the data values into larger
    * blocks in order to ease readability and increase performance of the
    * JavaScript charts. Highcharts Stock by default applies data grouping when
    * the points become closer than a certain pixel value, determined by
    * the <code>groupPixelWidth</code> option.</p>
    * <p>If data grouping is applied, the grouping information of grouped
    * points can be read from the <a href="/class-reference/Highcharts.Point#dataGroup">Point.dataGroup</a>. If point options other than
    * the data itself are set, for example <code>name</code> or <code>color</code> or custom properties,
    * the grouping logic doesn&#39;t know how to group it. In this case the options of
    * the first point instance are copied over to the group point. This can be
    * altered through a custom <code>approximation</code> callback function.</p>
    * @since 6.0.0
    */
  var dataGrouping: js.Any = js.undefined

  /**
    * <p>Options for the series data labels, appearing next to each data
    * point.</p>
    * <p>Since v6.2.0, multiple data labels can be applied to each single
    * point by defining them as an array of configs.</p>
    * <p>In styled mode, the data labels can be styled with the
    * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
    * (<a href="https://www.highcharts.com/samples/highcharts/css/series-datalabels">see example</a>).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-enabled">Data labels enabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-multiple">Multiple data labels on a bar series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels">Style mode example</a>
    * @since 6.0.0
    */
  var dataLabels: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined

  /**
    * <p>Options for the series data sorting.</p>
    * @since 8.0.0
    */
  var dataSorting: js.Any = js.undefined

  /**
    * <p>A description of the series to add to the screen reader information
    * about the series.</p>
    * @since 5.0.0
    */
  var description: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable the mouse tracking for a specific series. This
    * includes point tooltips and click events on graphs and points. For
    * large datasets it improves performance.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-enablemousetracking-false/">No mouse tracking</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-enablemousetracking-false/">No mouse tracking</a>
    * @since 6.0.0
    */
  var enableMouseTracking: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>General event handlers for the series items. These event hooks can
    * also be attached to the series at run time using the
    * <code>Highcharts.addEvent</code> function.</p>
    * @since 6.0.0
    */
  var events: js.Any = js.undefined

  /**
    * <p>Determines whether the series should look for the nearest point
    * in both dimensions or just the x-dimension when hovering the series.
    * Defaults to <code>&#39;xy&#39;</code> for scatter series and <code>&#39;x&#39;</code> for most other
    * series. If the data has duplicate x-values, it is recommended to
    * set this to <code>&#39;xy&#39;</code> to allow hovering over all points.</p>
    * <p>Applies only to series types using nearest neighbor search (not
    * direct hover) for tooltip.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/findnearestpointby/">Different hover behaviors</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/findnearestpointby/">Different hover behaviors</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/findnearestpointby/">Different hover behaviors</a>
    * @since 5.0.10
    */
  var findNearestPointBy: js.UndefOr[String] = js.undefined

  /**
    * <p>Defines when to display a gap in the graph, together with the
    * <a href="plotOptions.series.gapUnit">gapUnit</a> option.</p>
    * <p>In case when <code>dataGrouping</code> is enabled, points can be grouped
    * into a larger time span. This can make the grouped points to
    * have a greater distance than the absolute value of <code>gapSize</code>
    * property, which will result in disappearing graph completely.
    * To prevent this situation the mentioned distance between
    * grouped points is used instead of previously defined
    * <code>gapSize</code>.</p>
    * <p>In practice, this option is most often used to visualize gaps
    * in time series. In a stock chart, intraday data is available
    * for daytime hours, while gaps will appear in nights and
    * weekends.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-gapsize/">Setting the gap size to 2 introduces gaps for weekends in
daily datasets.</a>
    * @since 6.0.0
    */
  var gapSize: js.UndefOr[Double] = js.undefined

  /**
    * <p>Together with <a href="plotOptions.series.gapSize">gapSize</a>, this
    * option defines where to draw gaps in the graph.</p>
    * <p>When the <code>gapUnit</code> is <code>&quot;relative&quot;</code> (default), a gap size of 5
    * means that if the distance between two points is greater than
    * 5 times that of the two closest points, the graph will be
    * broken.</p>
    * <p>When the <code>gapUnit</code> is <code>&quot;value&quot;</code>, the gap is based on absolute
    * axis values, which on a datetime axis is milliseconds. This
    * also applies to the navigator series that inherits gap
    * options from the base series.</p>
    * @since 5.0.13
    */
  var gapUnit: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to use the Y extremes of the total chart width or only the
    * zoomed area when zooming in on parts of the X axis. By default, the
    * Y axis adjusts to the min and max of the visible data. Cartesian
    * series only.</p>
    * @since 4.1.6
    */
  var getExtremesFromAll: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When set to <code>false</code> will prevent the series data from being included in
    * any form of data export.</p>
    * <p>Since version 6.0.0 until 7.1.0 the option was existing undocumented
    * as <code>includeInCSVExport</code>.</p>
    * @since 7.1.0
    */
  var includeInDataExport: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>What property to join the <code>mapData</code> to the value data. For example,
    * if joinBy is &quot;code&quot;, the mapData items with a specific code is merged
    * into the data with the same code. For maps loaded from GeoJSON, the
    * keys may be held in each point&#39;s <code>properties</code> object.</p>
    * <p>The joinBy option can also be an array of two values, where the first
    * points to a key in the <code>mapData</code>, and the second points to another
    * key in the <code>data</code>.</p>
    * <p>When joinBy is <code>null</code>, the map items are joined by their position in
    * the array, which performs much better in maps with many data points.
    * This is the recommended option if you are printing more than a
    * thousand data points and have a backend that can preprocess the data
    * into a parallel array of the mapData.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-border/">Joined by "code"</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/geojson/">GeoJSON joined by an array</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/joinby-null/">Simple data joined by null</a>
    * @since 6.0.0
    */
  var joinBy: js.UndefOr[String | js.Array[String]] = js.undefined

  /**
    * <p>An array specifying which option maps to which key in the data point
    * array. This makes it convenient to work with unstructured data arrays
    * from different sources.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-keys/">An extended data array with keys</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-nested-keys/">Nested keys used to access object properties</a>
    * @since 4.1.6
    */
  var keys: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>Series labels are placed as close to the series as possible in a
    * natural way, seeking to avoid other series. The goal of this
    * feature is to make the chart more easily readable, like if a
    * human designer placed the labels in the optimal position.</p>
    * <p>The series labels currently work with series types having a
    * <code>graph</code> or an <code>area</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-label/line-chart">Line chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/streamgraph">Stream graph</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-label/stock-chart">Stock chart</a>
    * @since 6.0.0
    */
  var label: js.Any = js.undefined

  /**
    * <p>The line marks the last price from all points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/last-price">Last price</a>
    * @since 6.0.0
    */
  var lastPrice: js.Any = js.undefined

  /**
    * <p>The line marks the last price from visible range of points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/last-visible-price">Last visible price</a>
    * @since 6.0.0
    */
  var lastVisiblePrice: js.Any = js.undefined

  /**
    * <p>Pixel width of the graph line.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-linewidth-general/">On all series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-linewidth-specific/">On one single series</a>
    * @since 6.0.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The <a href="#series.id">id</a> of another series to link to. Additionally,
    * the value can be &quot;:previous&quot; to link to the previous series. When
    * two series are linked, only the first one appears in the legend.
    * Toggling the visibility of this also toggles the linked series.</p>
    * <p>If master series uses data sorting and linked series does not have
    * its own sorting definition, the linked series will be sorted in the
    * same order as the master one.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/arearange-line/">Linked series</a>
    * @since 3.0.0
    */
  var linkedTo: js.UndefOr[String] = js.undefined

  /**
    * <p>Options for the corresponding navigator series if <code>showInNavigator</code>
    * is <code>true</code> for this series. Available options are the same as any
    * series, documented at <a href="#plotOptions.series">plotOptions</a> and
    * <a href="#series">series</a>.</p>
    * <p>These options are merged with options in <a href="#navigator.series">navigator.series</a>, and will take precedence if the same option is
    * defined both places.</p>
    * @since 5.0.0
    */
  var navigatorOptions: js.Any = js.undefined

  /**
    * <p>The color for the parts of the graph or points that are below the
    * <a href="#plotOptions.series.threshold">threshold</a>. Note that <code>zones</code> takes
    * precedence over the negative color. Using <code>negativeColor</code> is
    * equivalent to applying a zone with value of 0.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-negative-color/">Spline, area and column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-negativecolor/">Arearange</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-negative-color/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-negative-color/">Spline, area and column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-negativecolor/">Arearange</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-negative-color/">Spline, area and column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-negativecolor/">Arearange</a>
    * @since 3.0.0
    */
  var negativeColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Opacity of a series parts: line, fill (e.g. area) and dataLabels.</p>
    * @since 7.1.0
    */
  var opacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>Properties for each single point.</p>
    * @since 6.0.0
    */
  var point: js.Any = js.undefined

  /**
    * <p>Same as
    * <a href="#accessibility.series.descriptionFormatter">accessibility.series.descriptionFormatter</a>,
    * but for an individual series. Overrides the chart wide configuration.</p>
    * @since 5.0.12
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Possible values: <code>&quot;on&quot;</code>, <code>&quot;between&quot;</code>, <code>number</code>.</p>
    * <p>In a column chart, when pointPlacement is <code>&quot;on&quot;</code>, the point will not
    * create any padding of the X axis. In a polar column chart this means
    * that the first column points directly north. If the pointPlacement is
    * <code>&quot;between&quot;</code>, the columns will be laid out between ticks. This is
    * useful for example for visualising an amount between two points in
    * time or in a certain sector of a polar chart.</p>
    * <p>Since Highcharts 3.0.2, the point placement can also be numeric,
    * where 0 is on the axis value, -0.5 is between this value and the
    * previous, and 0.5 is between this value and the next. Unlike the
    * textual options, numeric point placement options won&#39;t affect axis
    * padding.</p>
    * <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is
    * computed, but for line-type series it needs to be set.</p>
    * <p>For the <code>xrange</code> series type and gantt charts, if the Y axis is a
    * category axis, the <code>pointPlacement</code> applies to the Y axis rather than
    * the (typically datetime) X axis.</p>
    * <p>Defaults to <code>undefined</code> in cartesian charts, <code>&quot;between&quot;</code> in polar
    * charts.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointplacement-between/">Between in a column chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointplacement-numeric/">Numeric placement for custom layout</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/heatmap-pointplacement/">Placement in heatmap</a>
    * @since 2.3.0
    */
  var pointPlacement: js.UndefOr[String | Double] = js.undefined

  /**
    * <p>The width of each point on the x axis. For example in a column chart
    * with one value each day, the pointRange would be 1 day (= 24 * 3600</p>
    * <ul>
    * <li>1000 milliseconds). This is normally computed automatically, but
    * this option can be used to override the automatic value.</li>
    * </ul>
    * @since 6.0.0
    */
  var pointRange: js.UndefOr[Double] = js.undefined

  /**
    * <p>If no x values are given for the points in a series, pointStart
    * defines on what value to start. For example, if a series contains one
    * yearly value starting from 1945, set pointStart to 1945.</p>
    * <p>If combined with <code>relativeXValue</code>, an x value can be set on each
    * point. The x value from the point options is multiplied by
    * <code>pointInterval</code> and added to <code>pointStart</code> to produce a modified x
    * value.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointstart-linear/">Linear</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointstart-datetime/">Datetime</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-relativexvalue/">Relative x value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/pointinterval-pointstart/">Using pointStart and pointInterval</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/relativexvalue/">Relative x value</a>
    * @since 6.0.0
    */
  var pointStart: js.UndefOr[Double] = js.undefined

  /**
    * <p>When true, X values in the data set are relative to the current
    * <code>pointStart</code>, <code>pointInterval</code> and <code>pointIntervalUnit</code> settings. This
    * allows compression of the data for datasets with irregular X values.</p>
    * <p>The real X values are computed on the formula <code>f(x) = ax + b</code>, where
    * <code>a</code> is the <code>pointInterval</code> (optionally with a time unit given by
    * <code>pointIntervalUnit</code>), and <code>b</code> is the <code>pointStart</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-relativexvalue/">Relative X value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/relativexvalue/">Relative X value</a>
    * @since 6.0.0
    */
  var relativeXValue: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to select the series initially. If <code>showCheckbox</code> is true,
    * the checkbox next to the series name in the legend will be checked
    * for a selected series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-selected/">One out of two series selected</a>
    * @since 1.2.0
    */
  var selected: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to apply a drop shadow to the graph line. Since 2.3 the
    * shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,
    * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-shadow/">Shadow enabled</a>
    * @since 6.0.0
    */
  var shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>If true, a checkbox is displayed next to the legend item to allow
    * selecting the series. The state of the checkbox is determined by
    * the <code>selected</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-showcheckbox-true/">Show select box</a>
    * @since 1.2.0
    */
  var showCheckbox: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to display this particular series or series type in the
    * legend. Standalone series are shown in legend by default, and linked
    * series are not. Since v7.2.0 it is possible to show series that use
    * colorAxis by setting this option to <code>true</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-showinlegend/">One series in the legend, one hidden</a>
    * @since 6.0.0
    */
  var showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether or not to show the series in the navigator. Takes precedence
    * over <a href="#navigator.baseSeries">navigator.baseSeries</a> if defined.</p>
    * @since 5.0.0
    */
  var showInNavigator: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>If set to <code>true</code>, the accessibility module will skip past the points
    * in this series for keyboard navigation.</p>
    * @since 5.0.12
    */
  var skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When this is true, the series will not cause the Y axis to cross
    * the zero plane (or <a href="#plotOptions.series.threshold">threshold</a> option)
    * unless the data actually crosses the plane.</p>
    * <p>For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2,
    * 3 will make the Y axis show negative values according to the
    * <code>minPadding</code> option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts
    * at 0.</p>
    * @since 4.1.9
    */
  var softThreshold: js.UndefOr[Boolean] = js.undefined

  var states: js.Any = js.undefined

  /**
    * <p>Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a
    * series isn&#39;t triggered until the mouse moves over another series, or
    * out of the plot area. When false, the <code>mouseOut</code> event on a series is
    * triggered when the mouse leaves the area around the series&#39; graph or
    * markers. This also implies the tooltip when not shared. When
    * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip
    * will be hidden when moving the mouse between series. Defaults to true
    * for line and area type series, but to false for columns, pies etc.</p>
    * <p><strong>Note:</strong> The boost module will force this option because of
    * technical limitations.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stickytracking-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stickytracking-false/">False</a>
    * @since 2.0.0
    */
  var stickyTracking: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A configuration object for the tooltip rendering of each single
    * series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only
    * the following properties can be defined on a series level.</p>
    * @since 2.3.0
    */
  var tooltip: js.UndefOr[CleanJsObject[PlotOptionsBellcurveTooltip]] = js.undefined

  /**
    * <p>When a series contains a data array that is longer than this, only
    * one dimensional arrays of numbers, or two dimensional arrays with
    * x and y values are allowed. Also, only the first point is tested,
    * and the rest are assumed to be the same format. This saves expensive
    * data checking and indexing in long series. Set it to <code>0</code> disable.</p>
    * <p>Note:
    * In boost mode turbo threshold is forced. Only array of numbers or
    * two dimensional arrays are allowed.</p>
    * @since 2.2.0
    */
  var turboThreshold: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set the initial visibility of the series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-visible/">Two series, one hidden and one visible</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-visibility/">Hidden series</a>
    * @since 6.0.0
    */
  var visible: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Define the z index of the series.</p>
    * @since 6.0.0
    */
  var zIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>Defines the Axis on which the zones are applied.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/">Zones on the X-Axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/">Zones on the X-Axis</a>
    * @since 4.1.0
    */
  var zoneAxis: js.UndefOr[String] = js.undefined

  /**
    * <p>An array defining zones within a series. Zones can be applied to the
    * X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code>
    * option. The zone definitions have to be in ascending order regarding
    * to the value.</p>
    * <p>In styled mode, the color zones are styled with the
    * <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>
    * option
    * (<a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">view live demo</a>).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-simple/">Color zones</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-simple/">Color zones</a>
    * @since 4.1.0
    */
  var zones: js.UndefOr[js.Array[js.Any]] = js.undefined
}

object PlotOptionsBellcurve {
  /**
    * @param color <p>The main color of the series. In line type series it applies to the. line and the point markers unless otherwise specified. In bar type. series it applies to the bars unless a color is specified per point.. The default value is pulled from the <code>options.colors</code> array.</p>. <p>In styled mode, the color can be defined by the. <a href="#plotOptions.series.colorIndex">colorIndex</a> option. Also, the series. color can be set with the <code>.highcharts-series</code>,. <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or. <code>.highcharts-series-{n}</code> class, or individual classes given by the. <code>className</code> option.</p>
    * @param fillColor <p>Fill color or gradient for the area. When <code>null</code>, the series&#39; <code>color</code>. is used with the series&#39; <code>fillOpacity</code>.</p>. <p>In styled mode, the fill color can be set with the <code>.highcharts-area</code>. class name.</p>
    * @param fillOpacity <p>Fill opacity for the area. When you set an explicit <code>fillColor</code>,. the <code>fillOpacity</code> is not applied. Instead, you should define the. opacity in the <code>fillColor</code> with an rgba color definition. The. <code>fillOpacity</code> setting, also the default setting, overrides the alpha. component of the <code>color</code> setting.</p>. <p>In styled mode, the fill opacity can be set with the. <code>.highcharts-area</code> class name.</p>
    * @param intervals <p>This option allows to define the length of the bell curve. A unit of. the length of the bell curve is standard deviation.</p>
    * @param marker <p>Options for the point markers of line-like series. Properties like. <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual appearance. of the markers. Other series types, like column series, don&#39;t have. markers, but have visual options on the series level instead.</p>. <p>In styled mode, the markers can be styled with the. <code>.highcharts-point</code>, <code>.highcharts-point-hover</code> and. <code>.highcharts-point-select</code> class names.</p>
    * @param pointsInInterval <p>Defines how many points should be plotted within 1 interval. See. <code>plotOptions.bellcurve.intervals</code>.</p>
    * @param lineColor <p>A separate color for the graph line. By default the line takes the. <code>color</code> of the series, but the lineColor setting allows setting a. separate color for the line without altering the <code>fillColor</code>.</p>. <p>In styled mode, the line stroke can be set with the. <code>.highcharts-graph</code> class name.</p>
    * @param negativeFillColor <p>A separate color for the negative part of the area.</p>. <p>In styled mode, a negative color is set with the. <code>.highcharts-negative</code> class name.</p>
    * @param threshold <p>The Y axis value to serve as the base for the area, for. distinguishing between values above and below a threshold. The area. between the graph and the threshold is filled.</p>. <ul>. <li>If a number is given, the Y axis will scale to the threshold.</li>. <li>If <code>null</code>, the scaling behaves like a line series with fill between. the graph and the Y axis minimum.</li>. <li>If <code>Infinity</code> or <code>-Infinity</code>, the area between the graph and the. corresponding Y axis extreme is filled (since v6.1.0).</li>. </ul>
    * @param trackByArea <p>Whether the whole area or just the line should respond to mouseover. tooltips and other mouse or touch events.</p>
    * @param linecap <p>The SVG value used for the <code>stroke-linecap</code> and <code>stroke-linejoin</code>. of a line graph. Round means that lines are rounded in the ends and. bends.</p>
    * @param accessibility <p>Accessibility options for a series.</p>
    * @param allAreas <p>Whether all areas of the map defined in <code>mapData</code> should be rendered.. If <code>true</code>, areas which don&#39;t correspond to a data point, are rendered. as <code>null</code> points. If <code>false</code>, those areas are skipped.</p>
    * @param allowPointSelect <p>Allow this series&#39; points to be selected by clicking on the graphic. (columns, point markers, pie slices, map areas etc).</p>. <p>The selected points can be handled by point select and unselect. events, or collectively by the <a href="/class-reference/Highcharts.Chart#getSelectedPoints">getSelectedPoints</a> function.</p>. <p>And alternative way of selecting points is through dragging.</p>
    * @param animation <p>Enable or disable the initial animation when a series is displayed.. The animation can also be set as a configuration object. Please. note that this option only applies to the initial animation of the. series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.. The following properties are supported:</p>. <ul>. <li><p><code>defer</code>: The animation delay time in milliseconds.</p>. </li>. <li><p><code>duration</code>: The duration of the animation in milliseconds.</p>. </li>. <li><p><code>easing</code>: Can be a string reference to an easing function set on. the <code>Math</code> object or a function. See the <em>Custom easing function</em>. demo below.</p>. </li>. </ul>. <p>Due to poor performance, animation is disabled in old IE browsers. for several chart types.</p>
    * @param animationLimit <p>For some series, there is a limit that shuts down initial animation. by default when the total number of points in the chart is too high.. For example, for a column chart and its derivatives, animation does. not run if there is more than 250 points totally. To disable this. cap, set <code>animationLimit</code> to <code>Infinity</code>.</p>
    * @param borderColor <p>The border color of the map areas.</p>. <p>In styled mode, the border stroke is given in the <code>.highcharts-point</code>. class.</p>
    * @param borderWidth <p>The border width of each map area.</p>. <p>In styled mode, the border stroke width is given in the. <code>.highcharts-point</code> class.</p>
    * @param className <p>An additional class name to apply to the series&#39; graphical elements.. This option does not replace default class names of the graphical. element.</p>
    * @param clip <p>Disable this option to allow series rendering in the whole plotting. area.</p>. <p><strong>Note:</strong> Clipping should be always enabled when. <a href="#chart.zoomType">chart.zoomType</a> is set</p>
    * @param colorAxis <p>When using dual or multiple color axes, this number defines which. colorAxis the particular series is connected to. It refers to. either the. {@link #colorAxis.id|axis id}. or the index of the axis in the colorAxis array, with 0 being the. first. Set this option to false to prevent a series from connecting. to the default color axis.</p>. <p>Since v7.2.0 the option can also be an axis id or an axis index. instead of a boolean flag.</p>
    * @param colorIndex <p>Styled mode only. A specific color index to use for the series, so. its graphic representations are given the class name. <code>highcharts-color-{n}</code>.</p>
    * @param colorKey <p>Determines what data value should be used to calculate point color. if <code>colorAxis</code> is used. Requires to set <code>min</code> and <code>max</code> if some. custom point property is used or if approximation for data grouping. is set to <code>&#39;sum&#39;</code>.</p>
    * @param compare <p>Compare the values of the series against the first non-null, non-. zero value in the visible range. The y axis will show percentage. or absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code>. or <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows. comparing the development of the series against each other. Adds. a <code>change</code> field to every point object.</p>
    * @param compareBase <p>When <a href="#plotOptions.series.compare">compare</a> is <code>percent</code>, this option. dictates whether to use 0 or 100 as the base of comparison.</p>
    * @param compareStart <p>Defines if comparison should start from the first point within the visible. range or should start from the first point <strong>before</strong> the range.</p>. <p>In other words, this flag determines if first point within the visible range. will have 0% (<code>compareStart=true</code>) or should have been already calculated. according to the previous point (<code>compareStart=false</code>).</p>
    * @param connectEnds <p>Polar charts only. Whether to connect the ends of a line series. plot across the extremes.</p>
    * @param connectors <p>Override Pathfinder connector options for a series. Requires Highcharts Gantt. to be loaded.</p>
    * @param crisp <p>When true, each point or column edge is rounded to its nearest pixel. in order to render sharp on screen. In some cases, when there are a. lot of densely packed columns, this leads to visible difference. in column widths or distance between columns. In these cases,. setting <code>crisp</code> to <code>false</code> may look better, even though each column. is rendered blurry.</p>
    * @param cropThreshold <p>When the series contains less points than the crop threshold, all. points are drawn, even if the points fall outside the visible plot. area at the current zoom. The advantage of drawing all points. (including markers and columns), is that animation is performed on. updates. On the other hand, when the series contains more points than. the crop threshold, the series data is cropped to only contain points. that fall within the plot area. The advantage of cropping away. invisible points is to increase performance on large series.</p>
    * @param cumulative <p>Cumulative Sum feature replaces points&#39; values with the following formula:. <code>sum of all previous points&#39; values + current point&#39;s value</code>.. Works only for points in a visible range.. Adds the <code>cumulativeSum</code> field to each point object that can be accessed. e.g. in the <a href="https://api.highcharts.com/highstock/tooltip.pointFormat">tooltip.pointFormat</a>.</p>
    * @param cursor <p>You can set the cursor to &quot;pointer&quot; if you have click events attached. to the series, to signal to the user that the points and lines can. be clicked.</p>. <p>In styled mode, the series cursor can be set with the same classes. as listed under <a href="#plotOptions.series.color">series.color</a>.</p>
    * @param custom <p>A reserved subspace to store options and values for customized. functionality. Here you can add additional data for your own event. callbacks and formatter callbacks.</p>
    * @param dashStyle <p>Name of the dash style to use for the graph, or for some series types. the outline of each shape.</p>. <p>In styled mode, the. <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-dashstyle/">stroke dash-array</a>. can be set with the same classes as listed under. <a href="#plotOptions.series.color">series.color</a>.</p>
    * @param dataGrouping <p>Data grouping is the concept of sampling the data values into larger. blocks in order to ease readability and increase performance of the. JavaScript charts. Highcharts Stock by default applies data grouping when. the points become closer than a certain pixel value, determined by. the <code>groupPixelWidth</code> option.</p>. <p>If data grouping is applied, the grouping information of grouped. points can be read from the <a href="/class-reference/Highcharts.Point#dataGroup">Point.dataGroup</a>. If point options other than. the data itself are set, for example <code>name</code> or <code>color</code> or custom properties,. the grouping logic doesn&#39;t know how to group it. In this case the options of. the first point instance are copied over to the group point. This can be. altered through a custom <code>approximation</code> callback function.</p>
    * @param dataLabels <p>Options for the series data labels, appearing next to each data. point.</p>. <p>Since v6.2.0, multiple data labels can be applied to each single. point by defining them as an array of configs.</p>. <p>In styled mode, the data labels can be styled with the. <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names. (<a href="https://www.highcharts.com/samples/highcharts/css/series-datalabels">see example</a>).</p>
    * @param dataSorting <p>Options for the series data sorting.</p>
    * @param description <p>A description of the series to add to the screen reader information. about the series.</p>
    * @param enableMouseTracking <p>Enable or disable the mouse tracking for a specific series. This. includes point tooltips and click events on graphs and points. For. large datasets it improves performance.</p>
    * @param events <p>General event handlers for the series items. These event hooks can. also be attached to the series at run time using the. <code>Highcharts.addEvent</code> function.</p>
    * @param findNearestPointBy <p>Determines whether the series should look for the nearest point. in both dimensions or just the x-dimension when hovering the series.. Defaults to <code>&#39;xy&#39;</code> for scatter series and <code>&#39;x&#39;</code> for most other. series. If the data has duplicate x-values, it is recommended to. set this to <code>&#39;xy&#39;</code> to allow hovering over all points.</p>. <p>Applies only to series types using nearest neighbor search (not. direct hover) for tooltip.</p>
    * @param gapSize <p>Defines when to display a gap in the graph, together with the. <a href="plotOptions.series.gapUnit">gapUnit</a> option.</p>. <p>In case when <code>dataGrouping</code> is enabled, points can be grouped. into a larger time span. This can make the grouped points to. have a greater distance than the absolute value of <code>gapSize</code>. property, which will result in disappearing graph completely.. To prevent this situation the mentioned distance between. grouped points is used instead of previously defined. <code>gapSize</code>.</p>. <p>In practice, this option is most often used to visualize gaps. in time series. In a stock chart, intraday data is available. for daytime hours, while gaps will appear in nights and. weekends.</p>
    * @param gapUnit <p>Together with <a href="plotOptions.series.gapSize">gapSize</a>, this. option defines where to draw gaps in the graph.</p>. <p>When the <code>gapUnit</code> is <code>&quot;relative&quot;</code> (default), a gap size of 5. means that if the distance between two points is greater than. 5 times that of the two closest points, the graph will be. broken.</p>. <p>When the <code>gapUnit</code> is <code>&quot;value&quot;</code>, the gap is based on absolute. axis values, which on a datetime axis is milliseconds. This. also applies to the navigator series that inherits gap. options from the base series.</p>
    * @param getExtremesFromAll <p>Whether to use the Y extremes of the total chart width or only the. zoomed area when zooming in on parts of the X axis. By default, the. Y axis adjusts to the min and max of the visible data. Cartesian. series only.</p>
    * @param includeInDataExport <p>When set to <code>false</code> will prevent the series data from being included in. any form of data export.</p>. <p>Since version 6.0.0 until 7.1.0 the option was existing undocumented. as <code>includeInCSVExport</code>.</p>
    * @param joinBy <p>What property to join the <code>mapData</code> to the value data. For example,. if joinBy is &quot;code&quot;, the mapData items with a specific code is merged. into the data with the same code. For maps loaded from GeoJSON, the. keys may be held in each point&#39;s <code>properties</code> object.</p>. <p>The joinBy option can also be an array of two values, where the first. points to a key in the <code>mapData</code>, and the second points to another. key in the <code>data</code>.</p>. <p>When joinBy is <code>null</code>, the map items are joined by their position in. the array, which performs much better in maps with many data points.. This is the recommended option if you are printing more than a. thousand data points and have a backend that can preprocess the data. into a parallel array of the mapData.</p>
    * @param keys <p>An array specifying which option maps to which key in the data point. array. This makes it convenient to work with unstructured data arrays. from different sources.</p>
    * @param label <p>Series labels are placed as close to the series as possible in a. natural way, seeking to avoid other series. The goal of this. feature is to make the chart more easily readable, like if a. human designer placed the labels in the optimal position.</p>. <p>The series labels currently work with series types having a. <code>graph</code> or an <code>area</code>.</p>
    * @param lastPrice <p>The line marks the last price from all points.</p>
    * @param lastVisiblePrice <p>The line marks the last price from visible range of points.</p>
    * @param lineWidth <p>Pixel width of the graph line.</p>
    * @param linkedTo <p>The <a href="#series.id">id</a> of another series to link to. Additionally,. the value can be &quot;:previous&quot; to link to the previous series. When. two series are linked, only the first one appears in the legend.. Toggling the visibility of this also toggles the linked series.</p>. <p>If master series uses data sorting and linked series does not have. its own sorting definition, the linked series will be sorted in the. same order as the master one.</p>
    * @param navigatorOptions <p>Options for the corresponding navigator series if <code>showInNavigator</code>. is <code>true</code> for this series. Available options are the same as any. series, documented at <a href="#plotOptions.series">plotOptions</a> and. <a href="#series">series</a>.</p>. <p>These options are merged with options in <a href="#navigator.series">navigator.series</a>, and will take precedence if the same option is. defined both places.</p>
    * @param negativeColor <p>The color for the parts of the graph or points that are below the. <a href="#plotOptions.series.threshold">threshold</a>. Note that <code>zones</code> takes. precedence over the negative color. Using <code>negativeColor</code> is. equivalent to applying a zone with value of 0.</p>
    * @param opacity <p>Opacity of a series parts: line, fill (e.g. area) and dataLabels.</p>
    * @param point <p>Properties for each single point.</p>
    * @param pointDescriptionFormatter <p>Same as. <a href="#accessibility.series.descriptionFormatter">accessibility.series.descriptionFormatter</a>,. but for an individual series. Overrides the chart wide configuration.</p>
    * @param pointPlacement <p>Possible values: <code>&quot;on&quot;</code>, <code>&quot;between&quot;</code>, <code>number</code>.</p>. <p>In a column chart, when pointPlacement is <code>&quot;on&quot;</code>, the point will not. create any padding of the X axis. In a polar column chart this means. that the first column points directly north. If the pointPlacement is. <code>&quot;between&quot;</code>, the columns will be laid out between ticks. This is. useful for example for visualising an amount between two points in. time or in a certain sector of a polar chart.</p>. <p>Since Highcharts 3.0.2, the point placement can also be numeric,. where 0 is on the axis value, -0.5 is between this value and the. previous, and 0.5 is between this value and the next. Unlike the. textual options, numeric point placement options won&#39;t affect axis. padding.</p>. <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is. computed, but for line-type series it needs to be set.</p>. <p>For the <code>xrange</code> series type and gantt charts, if the Y axis is a. category axis, the <code>pointPlacement</code> applies to the Y axis rather than. the (typically datetime) X axis.</p>. <p>Defaults to <code>undefined</code> in cartesian charts, <code>&quot;between&quot;</code> in polar. charts.</p>
    * @param pointRange <p>The width of each point on the x axis. For example in a column chart. with one value each day, the pointRange would be 1 day (= 24 * 3600</p>. <ul>. <li>1000 milliseconds). This is normally computed automatically, but. this option can be used to override the automatic value.</li>. </ul>
    * @param pointStart <p>If no x values are given for the points in a series, pointStart. defines on what value to start. For example, if a series contains one. yearly value starting from 1945, set pointStart to 1945.</p>. <p>If combined with <code>relativeXValue</code>, an x value can be set on each. point. The x value from the point options is multiplied by. <code>pointInterval</code> and added to <code>pointStart</code> to produce a modified x. value.</p>
    * @param relativeXValue <p>When true, X values in the data set are relative to the current. <code>pointStart</code>, <code>pointInterval</code> and <code>pointIntervalUnit</code> settings. This. allows compression of the data for datasets with irregular X values.</p>. <p>The real X values are computed on the formula <code>f(x) = ax + b</code>, where. <code>a</code> is the <code>pointInterval</code> (optionally with a time unit given by. <code>pointIntervalUnit</code>), and <code>b</code> is the <code>pointStart</code>.</p>
    * @param selected <p>Whether to select the series initially. If <code>showCheckbox</code> is true,. the checkbox next to the series name in the legend will be checked. for a selected series.</p>
    * @param shadow <p>Whether to apply a drop shadow to the graph line. Since 2.3 the. shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,. <code>offsetY</code>, <code>opacity</code> and <code>width</code>.</p>
    * @param showCheckbox <p>If true, a checkbox is displayed next to the legend item to allow. selecting the series. The state of the checkbox is determined by. the <code>selected</code> option.</p>
    * @param showInLegend <p>Whether to display this particular series or series type in the. legend. Standalone series are shown in legend by default, and linked. series are not. Since v7.2.0 it is possible to show series that use. colorAxis by setting this option to <code>true</code>.</p>
    * @param showInNavigator <p>Whether or not to show the series in the navigator. Takes precedence. over <a href="#navigator.baseSeries">navigator.baseSeries</a> if defined.</p>
    * @param skipKeyboardNavigation <p>If set to <code>true</code>, the accessibility module will skip past the points. in this series for keyboard navigation.</p>
    * @param softThreshold <p>When this is true, the series will not cause the Y axis to cross. the zero plane (or <a href="#plotOptions.series.threshold">threshold</a> option). unless the data actually crosses the plane.</p>. <p>For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2,. 3 will make the Y axis show negative values according to the. <code>minPadding</code> option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts. at 0.</p>
    * @param stickyTracking <p>Sticky tracking of mouse events. When true, the <code>mouseOut</code> event on a. series isn&#39;t triggered until the mouse moves over another series, or. out of the plot area. When false, the <code>mouseOut</code> event on a series is. triggered when the mouse leaves the area around the series&#39; graph or. markers. This also implies the tooltip when not shared. When. <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip. will be hidden when moving the mouse between series. Defaults to true. for line and area type series, but to false for columns, pies etc.</p>. <p><strong>Note:</strong> The boost module will force this option because of. technical limitations.</p>
    * @param tooltip <p>A configuration object for the tooltip rendering of each single. series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only. the following properties can be defined on a series level.</p>
    * @param turboThreshold <p>When a series contains a data array that is longer than this, only. one dimensional arrays of numbers, or two dimensional arrays with. x and y values are allowed. Also, only the first point is tested,. and the rest are assumed to be the same format. This saves expensive. data checking and indexing in long series. Set it to <code>0</code> disable.</p>. <p>Note:. In boost mode turbo threshold is forced. Only array of numbers or. two dimensional arrays are allowed.</p>
    * @param visible <p>Set the initial visibility of the series.</p>
    * @param zIndex <p>Define the z index of the series.</p>
    * @param zoneAxis <p>Defines the Axis on which the zones are applied.</p>
    * @param zones <p>An array defining zones within a series. Zones can be applied to the. X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code>. option. The zone definitions have to be in ascending order regarding. to the value.</p>. <p>In styled mode, the color zones are styled with the. <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>. option. (<a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">view live demo</a>).</p>
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, fillOpacity: js.UndefOr[Double] = js.undefined, intervals: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[js.Any] = js.undefined, pointsInInterval: js.UndefOr[Double] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, negativeFillColor: js.UndefOr[String | js.Object] = js.undefined, threshold: js.UndefOr[Double | Null] = js.undefined, trackByArea: js.UndefOr[Boolean] = js.undefined, linecap: js.UndefOr[js.Any] = js.undefined, accessibility: js.UndefOr[js.Any] = js.undefined, allAreas: js.UndefOr[Boolean] = js.undefined, allowPointSelect: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, animationLimit: js.UndefOr[Double] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, clip: js.UndefOr[Boolean] = js.undefined, colorAxis: js.UndefOr[Double | String | Boolean] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, colorKey: js.UndefOr[String] = js.undefined, compare: js.UndefOr[String] = js.undefined, compareBase: js.UndefOr[Double] = js.undefined, compareStart: js.UndefOr[Boolean] = js.undefined, connectEnds: js.UndefOr[Boolean] = js.undefined, connectors: js.UndefOr[CleanJsObject[PlotOptionsBellcurveConnectors]] = js.undefined, crisp: js.UndefOr[Boolean] = js.undefined, cropThreshold: js.UndefOr[Double] = js.undefined, cumulative: js.UndefOr[Boolean] = js.undefined, cursor: js.UndefOr[String] = js.undefined, custom: js.UndefOr[js.Object] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, dataGrouping: js.UndefOr[js.Any] = js.undefined, dataLabels: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined, dataSorting: js.UndefOr[js.Any] = js.undefined, description: js.UndefOr[String] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, findNearestPointBy: js.UndefOr[String] = js.undefined, gapSize: js.UndefOr[Double] = js.undefined, gapUnit: js.UndefOr[String] = js.undefined, getExtremesFromAll: js.UndefOr[Boolean] = js.undefined, includeInDataExport: js.UndefOr[Boolean] = js.undefined, joinBy: js.UndefOr[String | js.Array[String]] = js.undefined, keys: js.UndefOr[js.Array[String]] = js.undefined, label: js.UndefOr[js.Any] = js.undefined, lastPrice: js.UndefOr[js.Any] = js.undefined, lastVisiblePrice: js.UndefOr[js.Any] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, linkedTo: js.UndefOr[String] = js.undefined, navigatorOptions: js.UndefOr[js.Any] = js.undefined, negativeColor: js.UndefOr[String | js.Object] = js.undefined, opacity: js.UndefOr[Double] = js.undefined, point: js.UndefOr[js.Any] = js.undefined, pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined, pointPlacement: js.UndefOr[String | Double] = js.undefined, pointRange: js.UndefOr[Double] = js.undefined, pointStart: js.UndefOr[Double] = js.undefined, relativeXValue: js.UndefOr[Boolean] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, showCheckbox: js.UndefOr[Boolean] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, showInNavigator: js.UndefOr[Boolean] = js.undefined, skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined, softThreshold: js.UndefOr[Boolean] = js.undefined, states: js.UndefOr[js.Any] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, tooltip: js.UndefOr[CleanJsObject[PlotOptionsBellcurveTooltip]] = js.undefined, turboThreshold: js.UndefOr[Double] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, zoneAxis: js.UndefOr[String] = js.undefined, zones: js.UndefOr[js.Array[js.Any]] = js.undefined): PlotOptionsBellcurve = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsBellcurve {
      this.color = color
      this.fillColor = fillColor
      this.fillOpacity = fillOpacity
      this.intervals = intervals
      this.marker = marker
      this.pointsInInterval = pointsInInterval
      this.lineColor = lineColor
      this.negativeFillColor = negativeFillColor
      this.threshold = threshold
      this.trackByArea = trackByArea
      this.linecap = linecap
      this.accessibility = accessibility
      this.allAreas = allAreas
      this.allowPointSelect = allowPointSelect
      this.animation = animation
      this.animationLimit = animationLimit
      this.borderColor = borderColor
      this.borderWidth = borderWidth
      this.className = className
      this.clip = clip
      this.colorAxis = colorAxis
      this.colorIndex = colorIndex
      this.colorKey = colorKey
      this.compare = compare
      this.compareBase = compareBase
      this.compareStart = compareStart
      this.connectEnds = connectEnds
      this.connectors = connectors
      this.crisp = crisp
      this.cropThreshold = cropThreshold
      this.cumulative = cumulative
      this.cursor = cursor
      this.custom = custom
      this.dashStyle = dashStyle
      this.dataGrouping = dataGrouping
      this.dataLabels = dataLabels
      this.dataSorting = dataSorting
      this.description = description
      this.enableMouseTracking = enableMouseTracking
      this.events = events
      this.findNearestPointBy = findNearestPointBy
      this.gapSize = gapSize
      this.gapUnit = gapUnit
      this.getExtremesFromAll = getExtremesFromAll
      this.includeInDataExport = includeInDataExport
      this.joinBy = joinBy
      this.keys = keys
      this.label = label
      this.lastPrice = lastPrice
      this.lastVisiblePrice = lastVisiblePrice
      this.lineWidth = lineWidth
      this.linkedTo = linkedTo
      this.navigatorOptions = navigatorOptions
      this.negativeColor = negativeColor
      this.opacity = opacity
      this.point = point
      this.pointDescriptionFormatter = pointDescriptionFormatter
      this.pointPlacement = pointPlacement
      this.pointRange = pointRange
      this.pointStart = pointStart
      this.relativeXValue = relativeXValue
      this.selected = selected
      this.shadow = shadow
      this.showCheckbox = showCheckbox
      this.showInLegend = showInLegend
      this.showInNavigator = showInNavigator
      this.skipKeyboardNavigation = skipKeyboardNavigation
      this.softThreshold = softThreshold
      this.states = states
      this.stickyTracking = stickyTracking
      this.tooltip = tooltip
      this.turboThreshold = turboThreshold
      this.visible = visible
      this.zIndex = zIndex
      this.zoneAxis = zoneAxis
      this.zones = zones
    })
  }
}
