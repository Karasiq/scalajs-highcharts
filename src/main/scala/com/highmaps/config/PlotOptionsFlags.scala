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
  * @note JavaScript name: <code>plotOptions-flags</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsFlags extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The X axis range that each point is valid for. This determines the
    * width of the column. On a categorized axis, the range will be 1
    * by default (one category unit). On linear and datetime axes, the
    * range will be computed as the distance between the two closest data
    * points.</p>
    * <p>The default <code>null</code> means it is computed automatically, but this option
    * can be used to override the automatic value.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointrange/">Set the point range to one day on a data set with one week between the points</a>
    * @since 2.3
    */
  val pointRange: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether the flags are allowed to overlap sideways. If <code>false</code>, the flags
    * are moved sideways using an algorithm that seeks to place every flag as
    * close as possible to its original position.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/flags-allowoverlapx">Allow sideways overlap</a>
    * @since 6.0.4
    */
  val allowOverlapX: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The shape of the marker. Can be one of &quot;flag&quot;, &quot;circlepin&quot;, &quot;squarepin&quot;,
    * or an image of the format <code>url(/path-to-image.jpg)</code>. Individual
    * shapes can also be set for each point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/flags/">Different shapes</a>
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * <p>When multiple flags in the same series fall on the same value, this
    * number determines the vertical offset between them.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/flags-stackdistance/">A greater stack distance</a>
    */
  val stackDistance: js.UndefOr[Double] = js.undefined

  /**
    * <p>Text alignment for the text inside the flag.</p>
    * @since 5.0.0
    */
  val textAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Specific tooltip options for flag series. Flag series tooltips are
    * different from most other types in that a flag doesn&#39;t have a data
    * value, so the tooltip rather displays the <code>text</code> option for each
    * point.</p>
    * @since 2.3
    */
  val tooltip: js.UndefOr[CleanJsObject[PlotOptionsFlagsTooltip]] = js.undefined

  /**
    * <p>The Y axis value to serve as the base for the columns, for distinguishing
    * between values above and below a threshold. If <code>null</code>, the columns
    * extend from the padding Y axis minimum.</p>
    * @since 2.0
    */
  val threshold: js.Any = js.undefined

  /**
    * <p>The y position of the top left corner of the flag relative to either
    * the series (if onSeries is defined), or the x axis. Defaults to
    * <code>-30</code>.</p>
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * <p>The fill color for the flags.</p>
    */
  val fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The pixel width of the flag&#39;s line/border.</p>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>A wrapper object for all the series options in specific states.</p>
    */
  val states: js.Any = js.undefined

  /**
    * <p>The text styles of the flag.</p>
    * <p>In styled mode, the styles are set in the
    * <code>.highcharts-flag-series .highcharts-point</code> rule.</p>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>In case the flag is placed on a series, on what point key to place
    * it. Line and columns have one key, <code>y</code>. In range or OHLC-type series,
    * however, the flag can optionally be placed on the <code>open</code>, <code>high</code>,
    *  <code>low</code> or <code>close</code> key.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/flags-onkey/">Range series, flag on high</a>
    * @since 4.2.2
    */
  val onKey: js.UndefOr[String] = js.undefined

  /**
    * <p>The id of the series that the flags should be drawn on. If no id
    * is given, the flags are drawn on the x axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/flags/">Flags on series and on x axis</a>
    */
  val onSeries: js.UndefOr[String] = js.undefined

  /**
    * <p>The text to display on each flag. This can be defined on series level,
    *  or individually for each point. Defaults to <code>&quot;A&quot;</code>.</p>
    */
  val title: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to use HTML to render the flag texts. Using HTML allows for
    * advanced formatting, images and reliable bi-directional text rendering.
    * Note that exported images won&#39;t respect the HTML, and that HTML
    * won&#39;t respect Z-index settings.</p>
    * @since 1.3
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Fixed width of the flag&#39;s shape. By default, width is autocalculated
    * according to the flag&#39;s title.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/flags-shapes/">Flags with fixed width</a>
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * <p>Fixed height of the flag&#39;s shape. By default, height is autocalculated
    * according to the flag&#39;s title.</p>
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the line/border of the flag.</p>
    * <p>In styled mode, the stroke is set in the
    * <code>.highcharts-flag-series.highcharts-point</code> rule.</p>
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>When true, each column edge is rounded to its nearest pixel in order
    * to render sharp on screen. In some cases, when there are a lot of
    * densely packed columns, this leads to visible difference in column
    * widths or distance between columns. In these cases, setting <code>crisp</code>
    * to <code>false</code> may look better, even though each column is rendered
    * blurry.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-crisp-false/">Crisp is false</a>
    * @since 5.0.10
    */
  val crisp: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Padding between each value groups, in x axis units.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouppadding-default/">0.2 by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouppadding-none/">No group padding - all columns are evenly spaced</a>
    */
  val groupPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimal height for a column or width for a bar. By default,
    * 0 values are not shown. To visualize a 0 (or close to zero) point,
    * set the minimal point length to a pixel value like 3. In stacked
    * column charts, minPointLength might not be respected for tightly
    * packed values.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength/">Zero base value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength-pos-and-neg/">Positive and negative close to zero values</a>
    */
  val minPointLength: js.UndefOr[Double] = js.undefined

  /**
    * <p>When the series contains less points than the crop threshold, all
    * points are drawn, event if the points fall outside the visible plot
    * area at the current zoom. The advantage of drawing all points (including
    * markers and columns), is that animation is performed on updates.
    * On the other hand, when the series contains more points than the
    * crop threshold, the series data is cropped to only contain points
    * that fall within the plot area. The advantage of cropping away invisible
    * points is to increase performance on large series.</p>
    * @since 2.2
    */
  val cropThreshold: js.UndefOr[Double] = js.undefined

  /**
    * <p>Options for the series data labels, appearing next to each data point.</p>
    * <p>Since v6.2.0, multiple data labels can be applied to each single point by
    * defining them as an array of configs.</p>
    * <p>In styled mode, the data labels can be styled with the
    * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
    * (<a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels">see example</a>).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-enabled">Data labels enabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-multiple">Multiple data labels on a bar series</a>
    */
  val dataLabels: js.Any = js.undefined

  /**
    * <p>When this is true, the series will not cause the Y axis to cross
    * the zero plane (or <a href="#plotOptions.series.threshold">threshold</a> option)
    * unless the data actually crosses the plane.</p>
    * <p>For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2,
    * 3 will make the Y axis show negative values according to the <code>minPadding</code>
    * option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.</p>
    * @since 4.1.9
    */
  val softThreshold: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Sticky tracking of mouse events. When true, the <code>mouseOut</code> event
    * on a series isn&#39;t triggered until the mouse moves over another series,
    * or out of the plot area. When false, the <code>mouseOut</code> event on a
    * series is triggered when the mouse leaves the area around the series&#39;
    * graph or markers. This also implies the tooltip when not shared. When
    * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will
    * be hidden when moving the mouse between series. Defaults to true for line
    * and area type series, but to false for columns, pies etc.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stickytracking-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stickytracking-false/">False</a>
    * @since 2.0
    */
  val stickyTracking: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A series specific or series type specific color set to apply instead
    * of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.</p>
    * @since 3.0
    */
  val colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined

  /**
    * <p>Whether to group non-stacked columns or to let them render independent
    * of each other. Non-grouped columns will be laid out individually
    * and overlap each other.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouping-false/">Grouping disabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouping-false/">Grouping disabled</a>
    * @since 2.3.0
    */
  val grouping: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The maximum allowed pixel width for a column, translated to the height
    * of a bar in a bar chart. This prevents the columns from becoming
    * too wide when there is a small number of points in the chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-maxpointwidth-20/">Limited to 50</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-maxpointwidth-20/">Limited to 50</a>
    * @since 4.1.8
    */
  val maxPointWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Depth of the columns in a 3D column chart. Requires <code>highcharts-3d.js</code>.</p>
    * @since 4.0
    */
  val depth: js.UndefOr[Double] = js.undefined

  /**
    * <p>3D columns only. The color of the edges. Similar to <code>borderColor</code>,
    *  except it defaults to the same color as the column.</p>
    */
  val edgeColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>3D columns only. The width of the colored edges.</p>
    */
  val edgeWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The spacing between columns on the Z Axis in a 3D chart. Requires
    * <code>highcharts-3d.js</code>.</p>
    * @since 4.0
    */
  val groupZPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set the point threshold for when a series should enter boost mode.</p>
    * <p>Setting it to e.g. 2000 will cause the series to enter boost mode when there
    * are 2000 or more points in the series.</p>
    * <p>To disable boosting on the series, set the <code>boostThreshold</code> to 0. Setting it
    * to 1 will force boosting.</p>
    * <p>Requires <code>modules/boost.js</code>.</p>
    */
  val boostThreshold: js.UndefOr[Double] = js.undefined

  /**
    * <p>The draggable-points module allows points to be moved around or modified
    * in the chart. In addition to the options mentioned under the <code>dragDrop</code>
    * API structure, the module fires three events,
    * <a href="plotOptions.series.point.events.dragStart">point.dragStart</a>,
    * <a href="plotOptions.series.point.events.drag">point.drag</a> and
    * <a href="plotOptions.series.point.events.drop">point.drop</a>.</p>
    * <p>It requires the <code>modules/draggable-points.js</code> file to be loaded.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/resize-column">Draggable column and line series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-bubble">Draggable bubbles</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Draggable X range series</a>
    * @since 6.2.0
    */
  val dragDrop: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Properties for each single point.</p>
    */
  val point: js.Any = js.undefined

  /**
    * <p>Series labels are placed as close to the series as possible in a
    * natural way, seeking to avoid other series. The goal of this
    * feature is to make the chart more easily readable, like if a
    * human designer placed the labels in the optimal position.</p>
    * <p>The series labels currently work with series types having a
    * <code>graph</code> or an <code>area</code>.</p>
    * <p>Requires the <code>series-label.js</code> module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-label/line-chart">Line chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/streamgraph">Stream graph</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-label/stock-chart">Stock chart</a>
    * @since 6.0.0
    */
  val label: js.Any = js.undefined

  /**
    * <p>Allow this series&#39; points to be selected by clicking on the graphic
    * (columns, point markers, pie slices, map areas etc).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-allowpointselect-line/">Line</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-allowpointselect-column/">Column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-allowpointselect-pie/">Pie</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Map area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/mapbubble-allowpointselect/">Map bubble</a>
    * @since 1.2.0
    */
  val allowPointSelect: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>If true, a checkbox is displayed next to the legend item to allow
    * selecting the series. The state of the checkbox is determined by
    * the <code>selected</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-showcheckbox-true/">Show select box</a>
    * @since 1.2.0
    */
  val showCheckbox: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>General event handlers for the series items. These event hooks can also
    * be attached to the series at run time using the <code>Highcharts.addEvent</code>
    * function.</p>
    */
  val events: js.Any = js.undefined

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
  val findNearestPointBy: js.UndefOr[String] = js.undefined

  /**
    * <p>For some series, there is a limit that shuts down initial animation
    * by default when the total number of points in the chart is too high.
    * For example, for a column chart and its derivatives, animation doesn&#39;t
    * run if there is more than 250 points totally. To disable this cap, set
    * <code>animationLimit</code> to <code>Infinity</code>.</p>
    */
  val animationLimit: js.UndefOr[Double] = js.undefined

  /**
    * <p>An additional class name to apply to the series&#39; graphical elements. This
    * option does not replace default class names of the graphical element.</p>
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * <p>Disable this option to allow series rendering in the whole plotting
    * area.</p>
    * <p><strong>Note:</strong> Clipping should be always enabled when
    * <a href="#chart.zoomType">chart.zoomType</a> is set</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-clip/">Disabled clipping</a>
    * @since 3.0.0
    */
  val clip: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The main color of the series. In line type series it applies to the
    * line and the point markers unless otherwise specified. In bar type
    * series it applies to the bars unless a color is specified per point.
    * The default value is pulled from the <code>options.colors</code> array.</p>
    * <p>In styled mode, the color can be defined by the
    * <a href="#plotOptions.series.colorIndex">colorIndex</a> option. Also, the series
    * color can be set with the <code>.highcharts-series</code>, <code>.highcharts-color-{n}</code>,
    * <code>.highcharts-{type}-series</code> or <code>.highcharts-series-{n}</code> class, or
    * individual classes given by the <code>className</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-color-general/">General plot option</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-color-specific/">One specific series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-color-area/">Area color</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/infographic/">Pattern fill</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/category-map/">Category map by multiple series</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Styled mode only. A specific color index to use for the series, so its
    * graphic representations are given the class name <code>highcharts-color-{n}</code>.</p>
    * @since 5.0.0
    */
  val colorIndex: js.UndefOr[Double] = js.undefined

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
    */
  val cursor: js.UndefOr[String] = js.undefined

  /**
    * <p>Requires the Accessibility module.</p>
    * <p>A description of the series to add to the screen reader information
    * about the series.</p>
    * @since 5.0.0
    */
  val description: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable the mouse tracking for a specific series. This
    * includes point tooltips and click events on graphs and points. For
    * large datasets it improves performance.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-enablemousetracking-false/">No mouse tracking</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-enablemousetracking-false/">No mouse tracking</a>
    */
  val enableMouseTracking: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>By default, series are exposed to screen readers as regions. By enabling
    * this option, the series element itself will be exposed in the same
    * way as the data points. This is useful if the series is not used
    * as a grouping entity in the chart, but you still want to attach a
    * description to the series.</p>
    * <p>Requires the Accessibility module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/art-grants/">Accessible data visualization</a>
    * @since 5.0.12
    */
  val exposeElementToA11y: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to use the Y extremes of the total chart width or only the
    * zoomed area when zooming in on parts of the X axis. By default, the
    * Y axis adjusts to the min and max of the visible data. Cartesian
    * series only.</p>
    * @since 4.1.6
    */
  val getExtremesFromAll: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>An array specifying which option maps to which key in the data point
    * array. This makes it convenient to work with unstructured data arrays
    * from different sources.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-keys/">An extended data array with keys</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-nested-keys/">Nested keys used to access object properties</a>
    * @since 4.1.6
    */
  val keys: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>The <a href="#series.id">id</a> of another series to link to. Additionally,
    * the value can be &quot;:previous&quot; to link to the previous series. When
    * two series are linked, only the first one appears in the legend.
    * Toggling the visibility of this also toggles the linked series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/arearange-line/">Linked series</a>
    * @since 3.0
    */
  val linkedTo: js.UndefOr[String] = js.undefined

  /**
    * <p>Options for the corresponding navigator series if <code>showInNavigator</code>
    * is <code>true</code> for this series. Available options are the same as any
    * series, documented at <a href="#plotOptions.series">plotOptions</a> and
    * <a href="#series">series</a>.</p>
    * <p>These options are merged with options in <a href="#navigator.series">navigator.series</a>, and will take precedence if the same option is
    * defined both places.</p>
    * @since 5.0.0
    */
  val navigatorOptions: js.Any = js.undefined

  /**
    * <p>The color for the parts of the graph or points that are below the
    * <a href="#plotOptions.series.threshold">threshold</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-negative-color/">Spline, area and column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-negativecolor/">Arearange</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-negative-color/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-negative-color/">Spline, area and column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-negativecolor/">Arearange</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-negative-color/">Spline, area and column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-negativecolor/">Arearange</a>
    * @since 3.0
    */
  val negativeColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Same as <a href="#accessibility.pointDescriptionFormatter">accessibility.pointDescriptionFormatter</a>, but for an individual series.
    * Overrides the chart wide configuration.</p>
    * @since 5.0.12
    */
  val pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>If no x values are given for the points in a series, <code>pointInterval</code>
    * defines the interval of the x values. For example, if a series contains
    * one value every decade starting from year 0, set <code>pointInterval</code> to
    * <code>10</code>. In true <code>datetime</code> axes, the <code>pointInterval</code> is set in
    * milliseconds.</p>
    * <p>It can be also be combined with <code>pointIntervalUnit</code> to draw irregular
    * time intervals.</p>
    * <p>Please note that this options applies to the <em>series data</em>, not the
    * interval of the axis ticks, which is independent.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointstart-datetime/">Datetime X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/pointinterval-pointstart/">Using pointStart and pointInterval</a>
    */
  val pointInterval: js.UndefOr[Double] = js.undefined

  /**
    * <p>On datetime series, this allows for setting the
    * <a href="#plotOptions.series.pointInterval">pointInterval</a> to irregular time
    * units, <code>day</code>, <code>month</code> and <code>year</code>. A day is usually the same as 24 hours,
    * but <code>pointIntervalUnit</code> also takes the DST crossover into consideration
    * when dealing with local time. Combine this option with <code>pointInterval</code>
    * to draw weeks, quarters, 6 months, 10 years etc.</p>
    * <p>Please note that this options applies to the <em>series data</em>, not the
    * interval of the axis ticks, which is independent.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointintervalunit/">One point a month</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointintervalunit/">One point a month</a>
    * @since 4.1.0
    */
  val pointIntervalUnit: js.UndefOr[String] = js.undefined

  /**
    * <p>Possible values: <code>&quot;on&quot;</code>, <code>&quot;between&quot;</code>, <code>number</code>.</p>
    * <p>In a column chart, when pointPlacement is <code>&quot;on&quot;</code>, the point will
    * not create any padding of the X axis. In a polar column chart this
    * means that the first column points directly north. If the pointPlacement
    * is <code>&quot;between&quot;</code>, the columns will be laid out between ticks. This
    * is useful for example for visualising an amount between two points
    * in time or in a certain sector of a polar chart.</p>
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
    * <p>Defaults to <code>undefined</code> in cartesian charts, <code>&quot;between&quot;</code> in polar charts.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointplacement-between/">Between in a column chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointplacement-numeric/">Numeric placement for custom layout</a>
    * @since 2.3.0
    */
  val pointPlacement: js.UndefOr[String | Double] = js.undefined

  /**
    * <p>If no x values are given for the points in a series, pointStart defines
    * on what value to start. For example, if a series contains one yearly
    * value starting from 1945, set pointStart to 1945.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointstart-linear/">Linear</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointstart-datetime/">Datetime</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/pointinterval-pointstart/">Using pointStart and pointInterval</a>
    */
  val pointStart: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to select the series initially. If <code>showCheckbox</code> is true,
    * the checkbox next to the series name in the legend will be checked for a
    * selected series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-selected/">One out of two series selected</a>
    * @since 1.2.0
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to apply a drop shadow to the graph line. Since 2.3 the shadow
    * can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
    * <code>opacity</code> and <code>width</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-shadow/">Shadow enabled</a>
    */
  val shadow: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to display this particular series or series type in the legend.
    * The default value is <code>true</code> for standalone series, <code>false</code> for linked
    * series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-showinlegend/">One series in the legend, one hidden</a>
    */
  val showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether or not to show the series in the navigator. Takes precedence
    * over <a href="#navigator.baseSeries">navigator.baseSeries</a> if defined.</p>
    * @since 5.0.0
    */
  val showInNavigator: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>If set to <code>true</code>, the accessibility module will skip past the points
    * in this series for keyboard navigation.</p>
    * @since 5.0.12
    */
  val skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to stack the values of each series on top of each other. Possible
    * values are <code>undefined</code> to disable, <code>&quot;normal&quot;</code> to stack by value or
    * <code>&quot;percent&quot;</code>. When stacking is enabled, data must be sorted in ascending
    * X order. A special stacking option is with the streamgraph series type,
    * where the stacking option is set to <code>&quot;stream&quot;</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-line/">Line</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-column/">Column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-bar/">Bar</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-area/">Area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-percent-line/">Line</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-percent-column/">Column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-percent-bar/">Bar</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-percent-area/">Area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/stacking/">Area</a>
    */
  val stacking: js.UndefOr[String] = js.undefined

  /**
    * <p>Set the initial visibility of the series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-visible/">Two series, one hidden and one visible</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-visibility/">Hidden series</a>
    */
  val visible: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Defines the Axis on which the zones are applied.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/">Zones on the X-Axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/">Zones on the X-Axis</a>
    * @since 4.1.0
    */
  val zoneAxis: js.UndefOr[String] = js.undefined

  /**
    * <p>An array defining zones within a series. Zones can be applied to
    * the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code>
    * option. The zone definitions have to be in ascending order regarding to
    * the value.</p>
    * <p>In styled mode, the color zones are styled with the
    * <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>
    * option
    * (<a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">view live demo</a>).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-simple/">Color zones</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-simple/">Color zones</a>
    * @since 4.1.0
    */
  val zones: js.UndefOr[js.Array[js.Any]] = js.undefined

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
  val compare: js.UndefOr[String] = js.undefined

  /**
    * <p>Defines if comparison should start from the first point within the visible
    * range or should start from the first point <b>before</b> the range.
    * In other words, this flag determines if first point within the visible range
    * will have 0% (<code>compareStart=true</code>) or should have been already calculated
    * according to the previous point (<code>compareStart=false</code>).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-comparestart/">Calculate compare within visible range</a>
    * @since 6.0.0
    */
  val compareStart: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When <a href="#plotOptions.series.compare">compare</a> is <code>percent</code>, this option
    * dictates whether to use 0 or 100 as the base of comparison.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples//">Compare base is 100</a>
    * @since 5.0.6
    */
  val compareBase: js.UndefOr[Double] = js.undefined

  /**
    * <p>Define the z index of the series.</p>
    */
  val zIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether all areas of the map defined in <code>mapData</code> should be rendered.
    * If <code>true</code>, areas which don&#39;t correspond to a data point, are rendered
    * as <code>null</code> points. If <code>false</code>, those areas are skipped.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allareas-false/">All areas set to false</a>
    */
  val allAreas: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Set this option to <code>false</code> to prevent a series from connecting to
    * the global color axis. This will cause the series to have its own
    * legend item.</p>
    */
  val colorAxis: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>What property to join the <code>mapData</code> to the value data. For example,
    * if joinBy is &quot;code&quot;, the mapData items with a specific code is merged
    * into the data with the same code. For maps loaded from GeoJSON, the
    * keys may be held in each point&#39;s <code>properties</code> object.</p>
    * <p>The joinBy option can also be an array of two values, where the first
    * points to a key in the <code>mapData</code>, and the second points to another
    * key in the <code>data</code>.</p>
    * <p>When joinBy is <code>null</code>, the map items are joined by their position
    * in the array, which performs much better in maps with many data points.
    * This is the recommended option if you are printing more than a thousand
    * data points and have a backend that can preprocess the data into
    * a parallel array of the mapData.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-border/">Joined by "code"</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/geojson/">GeoJSON joined by an array</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/joinby-null/">Simple data joined by null</a>
    */
  val joinBy: js.UndefOr[String | js.Array[String]] = js.undefined

  /**
    * <p>Override Pathfinder options for a series. Requires Highcharts Gantt or the
    * Pathfinder module.</p>
    * @since 6.2.0
    */
  val pathfinder: js.UndefOr[CleanJsObject[PlotOptionsFlagsPathfinder]] = js.undefined
}

object PlotOptionsFlags {
  /**
    * @param pointRange <p>The X axis range that each point is valid for. This determines the. width of the column. On a categorized axis, the range will be 1. by default (one category unit). On linear and datetime axes, the. range will be computed as the distance between the two closest data. points.</p>. <p>The default <code>null</code> means it is computed automatically, but this option. can be used to override the automatic value.</p>
    * @param allowOverlapX <p>Whether the flags are allowed to overlap sideways. If <code>false</code>, the flags. are moved sideways using an algorithm that seeks to place every flag as. close as possible to its original position.</p>
    * @param shape <p>The shape of the marker. Can be one of &quot;flag&quot;, &quot;circlepin&quot;, &quot;squarepin&quot;,. or an image of the format <code>url(/path-to-image.jpg)</code>. Individual. shapes can also be set for each point.</p>
    * @param stackDistance <p>When multiple flags in the same series fall on the same value, this. number determines the vertical offset between them.</p>
    * @param textAlign <p>Text alignment for the text inside the flag.</p>
    * @param tooltip <p>Specific tooltip options for flag series. Flag series tooltips are. different from most other types in that a flag doesn&#39;t have a data. value, so the tooltip rather displays the <code>text</code> option for each. point.</p>
    * @param threshold <p>The Y axis value to serve as the base for the columns, for distinguishing. between values above and below a threshold. If <code>null</code>, the columns. extend from the padding Y axis minimum.</p>
    * @param y <p>The y position of the top left corner of the flag relative to either. the series (if onSeries is defined), or the x axis. Defaults to. <code>-30</code>.</p>
    * @param fillColor <p>The fill color for the flags.</p>
    * @param lineWidth <p>The pixel width of the flag&#39;s line/border.</p>
    * @param states <p>A wrapper object for all the series options in specific states.</p>
    * @param style <p>The text styles of the flag.</p>. <p>In styled mode, the styles are set in the. <code>.highcharts-flag-series .highcharts-point</code> rule.</p>
    * @param onKey <p>In case the flag is placed on a series, on what point key to place. it. Line and columns have one key, <code>y</code>. In range or OHLC-type series,. however, the flag can optionally be placed on the <code>open</code>, <code>high</code>,.  <code>low</code> or <code>close</code> key.</p>
    * @param onSeries <p>The id of the series that the flags should be drawn on. If no id. is given, the flags are drawn on the x axis.</p>
    * @param title <p>The text to display on each flag. This can be defined on series level,.  or individually for each point. Defaults to <code>&quot;A&quot;</code>.</p>
    * @param useHTML <p>Whether to use HTML to render the flag texts. Using HTML allows for. advanced formatting, images and reliable bi-directional text rendering.. Note that exported images won&#39;t respect the HTML, and that HTML. won&#39;t respect Z-index settings.</p>
    * @param width <p>Fixed width of the flag&#39;s shape. By default, width is autocalculated. according to the flag&#39;s title.</p>
    * @param height <p>Fixed height of the flag&#39;s shape. By default, height is autocalculated. according to the flag&#39;s title.</p>
    * @param lineColor <p>The color of the line/border of the flag.</p>. <p>In styled mode, the stroke is set in the. <code>.highcharts-flag-series.highcharts-point</code> rule.</p>
    * @param crisp <p>When true, each column edge is rounded to its nearest pixel in order. to render sharp on screen. In some cases, when there are a lot of. densely packed columns, this leads to visible difference in column. widths or distance between columns. In these cases, setting <code>crisp</code>. to <code>false</code> may look better, even though each column is rendered. blurry.</p>
    * @param groupPadding <p>Padding between each value groups, in x axis units.</p>
    * @param minPointLength <p>The minimal height for a column or width for a bar. By default,. 0 values are not shown. To visualize a 0 (or close to zero) point,. set the minimal point length to a pixel value like 3. In stacked. column charts, minPointLength might not be respected for tightly. packed values.</p>
    * @param cropThreshold <p>When the series contains less points than the crop threshold, all. points are drawn, event if the points fall outside the visible plot. area at the current zoom. The advantage of drawing all points (including. markers and columns), is that animation is performed on updates.. On the other hand, when the series contains more points than the. crop threshold, the series data is cropped to only contain points. that fall within the plot area. The advantage of cropping away invisible. points is to increase performance on large series.</p>
    * @param dataLabels <p>Options for the series data labels, appearing next to each data point.</p>. <p>Since v6.2.0, multiple data labels can be applied to each single point by. defining them as an array of configs.</p>. <p>In styled mode, the data labels can be styled with the. <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names. (<a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels">see example</a>).</p>
    * @param softThreshold <p>When this is true, the series will not cause the Y axis to cross. the zero plane (or <a href="#plotOptions.series.threshold">threshold</a> option). unless the data actually crosses the plane.</p>. <p>For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2,. 3 will make the Y axis show negative values according to the <code>minPadding</code>. option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.</p>
    * @param stickyTracking <p>Sticky tracking of mouse events. When true, the <code>mouseOut</code> event. on a series isn&#39;t triggered until the mouse moves over another series,. or out of the plot area. When false, the <code>mouseOut</code> event on a. series is triggered when the mouse leaves the area around the series&#39;. graph or markers. This also implies the tooltip when not shared. When. <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will. be hidden when moving the mouse between series. Defaults to true for line. and area type series, but to false for columns, pies etc.</p>
    * @param colors <p>A series specific or series type specific color set to apply instead. of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.</p>
    * @param grouping <p>Whether to group non-stacked columns or to let them render independent. of each other. Non-grouped columns will be laid out individually. and overlap each other.</p>
    * @param maxPointWidth <p>The maximum allowed pixel width for a column, translated to the height. of a bar in a bar chart. This prevents the columns from becoming. too wide when there is a small number of points in the chart.</p>
    * @param depth <p>Depth of the columns in a 3D column chart. Requires <code>highcharts-3d.js</code>.</p>
    * @param edgeColor <p>3D columns only. The color of the edges. Similar to <code>borderColor</code>,.  except it defaults to the same color as the column.</p>
    * @param edgeWidth <p>3D columns only. The width of the colored edges.</p>
    * @param groupZPadding <p>The spacing between columns on the Z Axis in a 3D chart. Requires. <code>highcharts-3d.js</code>.</p>
    * @param boostThreshold <p>Set the point threshold for when a series should enter boost mode.</p>. <p>Setting it to e.g. 2000 will cause the series to enter boost mode when there. are 2000 or more points in the series.</p>. <p>To disable boosting on the series, set the <code>boostThreshold</code> to 0. Setting it. to 1 will force boosting.</p>. <p>Requires <code>modules/boost.js</code>.</p>
    * @param dragDrop <p>The draggable-points module allows points to be moved around or modified. in the chart. In addition to the options mentioned under the <code>dragDrop</code>. API structure, the module fires three events,. <a href="plotOptions.series.point.events.dragStart">point.dragStart</a>,. <a href="plotOptions.series.point.events.drag">point.drag</a> and. <a href="plotOptions.series.point.events.drop">point.drop</a>.</p>. <p>It requires the <code>modules/draggable-points.js</code> file to be loaded.</p>
    * @param point <p>Properties for each single point.</p>
    * @param label <p>Series labels are placed as close to the series as possible in a. natural way, seeking to avoid other series. The goal of this. feature is to make the chart more easily readable, like if a. human designer placed the labels in the optimal position.</p>. <p>The series labels currently work with series types having a. <code>graph</code> or an <code>area</code>.</p>. <p>Requires the <code>series-label.js</code> module.</p>
    * @param allowPointSelect <p>Allow this series&#39; points to be selected by clicking on the graphic. (columns, point markers, pie slices, map areas etc).</p>
    * @param showCheckbox <p>If true, a checkbox is displayed next to the legend item to allow. selecting the series. The state of the checkbox is determined by. the <code>selected</code> option.</p>
    * @param events <p>General event handlers for the series items. These event hooks can also. be attached to the series at run time using the <code>Highcharts.addEvent</code>. function.</p>
    * @param findNearestPointBy <p>Determines whether the series should look for the nearest point. in both dimensions or just the x-dimension when hovering the series.. Defaults to <code>&#39;xy&#39;</code> for scatter series and <code>&#39;x&#39;</code> for most other. series. If the data has duplicate x-values, it is recommended to. set this to <code>&#39;xy&#39;</code> to allow hovering over all points.</p>. <p>Applies only to series types using nearest neighbor search (not. direct hover) for tooltip.</p>
    * @param animationLimit <p>For some series, there is a limit that shuts down initial animation. by default when the total number of points in the chart is too high.. For example, for a column chart and its derivatives, animation doesn&#39;t. run if there is more than 250 points totally. To disable this cap, set. <code>animationLimit</code> to <code>Infinity</code>.</p>
    * @param className <p>An additional class name to apply to the series&#39; graphical elements. This. option does not replace default class names of the graphical element.</p>
    * @param clip <p>Disable this option to allow series rendering in the whole plotting. area.</p>. <p><strong>Note:</strong> Clipping should be always enabled when. <a href="#chart.zoomType">chart.zoomType</a> is set</p>
    * @param color <p>The main color of the series. In line type series it applies to the. line and the point markers unless otherwise specified. In bar type. series it applies to the bars unless a color is specified per point.. The default value is pulled from the <code>options.colors</code> array.</p>. <p>In styled mode, the color can be defined by the. <a href="#plotOptions.series.colorIndex">colorIndex</a> option. Also, the series. color can be set with the <code>.highcharts-series</code>, <code>.highcharts-color-{n}</code>,. <code>.highcharts-{type}-series</code> or <code>.highcharts-series-{n}</code> class, or. individual classes given by the <code>className</code> option.</p>
    * @param colorIndex <p>Styled mode only. A specific color index to use for the series, so its. graphic representations are given the class name <code>highcharts-color-{n}</code>.</p>
    * @param cursor <p>You can set the cursor to &quot;pointer&quot; if you have click events attached. to the series, to signal to the user that the points and lines can. be clicked.</p>. <p>In styled mode, the series cursor can be set with the same classes. as listed under <a href="#plotOptions.series.color">series.color</a>.</p>
    * @param description <p>Requires the Accessibility module.</p>. <p>A description of the series to add to the screen reader information. about the series.</p>
    * @param enableMouseTracking <p>Enable or disable the mouse tracking for a specific series. This. includes point tooltips and click events on graphs and points. For. large datasets it improves performance.</p>
    * @param exposeElementToA11y <p>By default, series are exposed to screen readers as regions. By enabling. this option, the series element itself will be exposed in the same. way as the data points. This is useful if the series is not used. as a grouping entity in the chart, but you still want to attach a. description to the series.</p>. <p>Requires the Accessibility module.</p>
    * @param getExtremesFromAll <p>Whether to use the Y extremes of the total chart width or only the. zoomed area when zooming in on parts of the X axis. By default, the. Y axis adjusts to the min and max of the visible data. Cartesian. series only.</p>
    * @param keys <p>An array specifying which option maps to which key in the data point. array. This makes it convenient to work with unstructured data arrays. from different sources.</p>
    * @param linkedTo <p>The <a href="#series.id">id</a> of another series to link to. Additionally,. the value can be &quot;:previous&quot; to link to the previous series. When. two series are linked, only the first one appears in the legend.. Toggling the visibility of this also toggles the linked series.</p>
    * @param navigatorOptions <p>Options for the corresponding navigator series if <code>showInNavigator</code>. is <code>true</code> for this series. Available options are the same as any. series, documented at <a href="#plotOptions.series">plotOptions</a> and. <a href="#series">series</a>.</p>. <p>These options are merged with options in <a href="#navigator.series">navigator.series</a>, and will take precedence if the same option is. defined both places.</p>
    * @param negativeColor <p>The color for the parts of the graph or points that are below the. <a href="#plotOptions.series.threshold">threshold</a>.</p>
    * @param pointDescriptionFormatter <p>Same as <a href="#accessibility.pointDescriptionFormatter">accessibility.pointDescriptionFormatter</a>, but for an individual series.. Overrides the chart wide configuration.</p>
    * @param pointInterval <p>If no x values are given for the points in a series, <code>pointInterval</code>. defines the interval of the x values. For example, if a series contains. one value every decade starting from year 0, set <code>pointInterval</code> to. <code>10</code>. In true <code>datetime</code> axes, the <code>pointInterval</code> is set in. milliseconds.</p>. <p>It can be also be combined with <code>pointIntervalUnit</code> to draw irregular. time intervals.</p>. <p>Please note that this options applies to the <em>series data</em>, not the. interval of the axis ticks, which is independent.</p>
    * @param pointIntervalUnit <p>On datetime series, this allows for setting the. <a href="#plotOptions.series.pointInterval">pointInterval</a> to irregular time. units, <code>day</code>, <code>month</code> and <code>year</code>. A day is usually the same as 24 hours,. but <code>pointIntervalUnit</code> also takes the DST crossover into consideration. when dealing with local time. Combine this option with <code>pointInterval</code>. to draw weeks, quarters, 6 months, 10 years etc.</p>. <p>Please note that this options applies to the <em>series data</em>, not the. interval of the axis ticks, which is independent.</p>
    * @param pointPlacement <p>Possible values: <code>&quot;on&quot;</code>, <code>&quot;between&quot;</code>, <code>number</code>.</p>. <p>In a column chart, when pointPlacement is <code>&quot;on&quot;</code>, the point will. not create any padding of the X axis. In a polar column chart this. means that the first column points directly north. If the pointPlacement. is <code>&quot;between&quot;</code>, the columns will be laid out between ticks. This. is useful for example for visualising an amount between two points. in time or in a certain sector of a polar chart.</p>. <p>Since Highcharts 3.0.2, the point placement can also be numeric,. where 0 is on the axis value, -0.5 is between this value and the. previous, and 0.5 is between this value and the next. Unlike the. textual options, numeric point placement options won&#39;t affect axis. padding.</p>. <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is. computed, but for line-type series it needs to be set.</p>. <p>For the <code>xrange</code> series type and gantt charts, if the Y axis is a. category axis, the <code>pointPlacement</code> applies to the Y axis rather than. the (typically datetime) X axis.</p>. <p>Defaults to <code>undefined</code> in cartesian charts, <code>&quot;between&quot;</code> in polar charts.</p>
    * @param pointStart <p>If no x values are given for the points in a series, pointStart defines. on what value to start. For example, if a series contains one yearly. value starting from 1945, set pointStart to 1945.</p>
    * @param selected <p>Whether to select the series initially. If <code>showCheckbox</code> is true,. the checkbox next to the series name in the legend will be checked for a. selected series.</p>
    * @param shadow <p>Whether to apply a drop shadow to the graph line. Since 2.3 the shadow. can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,. <code>opacity</code> and <code>width</code>.</p>
    * @param showInLegend <p>Whether to display this particular series or series type in the legend.. The default value is <code>true</code> for standalone series, <code>false</code> for linked. series.</p>
    * @param showInNavigator <p>Whether or not to show the series in the navigator. Takes precedence. over <a href="#navigator.baseSeries">navigator.baseSeries</a> if defined.</p>
    * @param skipKeyboardNavigation <p>If set to <code>true</code>, the accessibility module will skip past the points. in this series for keyboard navigation.</p>
    * @param stacking <p>Whether to stack the values of each series on top of each other. Possible. values are <code>undefined</code> to disable, <code>&quot;normal&quot;</code> to stack by value or. <code>&quot;percent&quot;</code>. When stacking is enabled, data must be sorted in ascending. X order. A special stacking option is with the streamgraph series type,. where the stacking option is set to <code>&quot;stream&quot;</code>.</p>
    * @param visible <p>Set the initial visibility of the series.</p>
    * @param zoneAxis <p>Defines the Axis on which the zones are applied.</p>
    * @param zones <p>An array defining zones within a series. Zones can be applied to. the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code>. option. The zone definitions have to be in ascending order regarding to. the value.</p>. <p>In styled mode, the color zones are styled with the. <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>. option. (<a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">view live demo</a>).</p>
    * @param compare <p>Compare the values of the series against the first non-null, non-. zero value in the visible range. The y axis will show percentage. or absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code>. or <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows. comparing the development of the series against each other. Adds. a <code>change</code> field to every point object.</p>
    * @param compareStart <p>Defines if comparison should start from the first point within the visible. range or should start from the first point <b>before</b> the range.. In other words, this flag determines if first point within the visible range. will have 0% (<code>compareStart=true</code>) or should have been already calculated. according to the previous point (<code>compareStart=false</code>).</p>
    * @param compareBase <p>When <a href="#plotOptions.series.compare">compare</a> is <code>percent</code>, this option. dictates whether to use 0 or 100 as the base of comparison.</p>
    * @param zIndex <p>Define the z index of the series.</p>
    * @param allAreas <p>Whether all areas of the map defined in <code>mapData</code> should be rendered.. If <code>true</code>, areas which don&#39;t correspond to a data point, are rendered. as <code>null</code> points. If <code>false</code>, those areas are skipped.</p>
    * @param colorAxis <p>Set this option to <code>false</code> to prevent a series from connecting to. the global color axis. This will cause the series to have its own. legend item.</p>
    * @param joinBy <p>What property to join the <code>mapData</code> to the value data. For example,. if joinBy is &quot;code&quot;, the mapData items with a specific code is merged. into the data with the same code. For maps loaded from GeoJSON, the. keys may be held in each point&#39;s <code>properties</code> object.</p>. <p>The joinBy option can also be an array of two values, where the first. points to a key in the <code>mapData</code>, and the second points to another. key in the <code>data</code>.</p>. <p>When joinBy is <code>null</code>, the map items are joined by their position. in the array, which performs much better in maps with many data points.. This is the recommended option if you are printing more than a thousand. data points and have a backend that can preprocess the data into. a parallel array of the mapData.</p>
    * @param pathfinder <p>Override Pathfinder options for a series. Requires Highcharts Gantt or the. Pathfinder module.</p>
    */
  def apply(pointRange: js.UndefOr[Double] = js.undefined, allowOverlapX: js.UndefOr[Boolean] = js.undefined, shape: js.UndefOr[String] = js.undefined, stackDistance: js.UndefOr[Double] = js.undefined, textAlign: js.UndefOr[String] = js.undefined, tooltip: js.UndefOr[CleanJsObject[PlotOptionsFlagsTooltip]] = js.undefined, threshold: js.UndefOr[js.Any] = js.undefined, y: js.UndefOr[Double] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, states: js.UndefOr[js.Any] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, onKey: js.UndefOr[String] = js.undefined, onSeries: js.UndefOr[String] = js.undefined, title: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, width: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, crisp: js.UndefOr[Boolean] = js.undefined, groupPadding: js.UndefOr[Double] = js.undefined, minPointLength: js.UndefOr[Double] = js.undefined, cropThreshold: js.UndefOr[Double] = js.undefined, dataLabels: js.UndefOr[js.Any] = js.undefined, softThreshold: js.UndefOr[Boolean] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined, grouping: js.UndefOr[Boolean] = js.undefined, maxPointWidth: js.UndefOr[Double] = js.undefined, depth: js.UndefOr[Double] = js.undefined, edgeColor: js.UndefOr[String | js.Object] = js.undefined, edgeWidth: js.UndefOr[Double] = js.undefined, groupZPadding: js.UndefOr[Double] = js.undefined, boostThreshold: js.UndefOr[Double] = js.undefined, dragDrop: js.UndefOr[js.Object] = js.undefined, point: js.UndefOr[js.Any] = js.undefined, label: js.UndefOr[js.Any] = js.undefined, allowPointSelect: js.UndefOr[Boolean] = js.undefined, showCheckbox: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, findNearestPointBy: js.UndefOr[String] = js.undefined, animationLimit: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, clip: js.UndefOr[Boolean] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, cursor: js.UndefOr[String] = js.undefined, description: js.UndefOr[String] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, exposeElementToA11y: js.UndefOr[Boolean] = js.undefined, getExtremesFromAll: js.UndefOr[Boolean] = js.undefined, keys: js.UndefOr[js.Array[String]] = js.undefined, linkedTo: js.UndefOr[String] = js.undefined, navigatorOptions: js.UndefOr[js.Any] = js.undefined, negativeColor: js.UndefOr[String | js.Object] = js.undefined, pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined, pointInterval: js.UndefOr[Double] = js.undefined, pointIntervalUnit: js.UndefOr[String] = js.undefined, pointPlacement: js.UndefOr[String | Double] = js.undefined, pointStart: js.UndefOr[Double] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, showInNavigator: js.UndefOr[Boolean] = js.undefined, skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined, stacking: js.UndefOr[String] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, zoneAxis: js.UndefOr[String] = js.undefined, zones: js.UndefOr[js.Array[js.Any]] = js.undefined, compare: js.UndefOr[String] = js.undefined, compareStart: js.UndefOr[Boolean] = js.undefined, compareBase: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, allAreas: js.UndefOr[Boolean] = js.undefined, colorAxis: js.UndefOr[Boolean] = js.undefined, joinBy: js.UndefOr[String | js.Array[String]] = js.undefined, pathfinder: js.UndefOr[CleanJsObject[PlotOptionsFlagsPathfinder]] = js.undefined): PlotOptionsFlags = {
    val pointRangeOuter: js.UndefOr[Double] = pointRange
    val allowOverlapXOuter: js.UndefOr[Boolean] = allowOverlapX
    val shapeOuter: js.UndefOr[String] = shape
    val stackDistanceOuter: js.UndefOr[Double] = stackDistance
    val textAlignOuter: js.UndefOr[String] = textAlign
    val tooltipOuter: js.UndefOr[CleanJsObject[PlotOptionsFlagsTooltip]] = tooltip
    val thresholdOuter: js.Any = threshold
    val yOuter: js.UndefOr[Double] = y
    val fillColorOuter: js.UndefOr[String | js.Object] = fillColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val statesOuter: js.Any = states
    val styleOuter: js.UndefOr[js.Object] = style
    val onKeyOuter: js.UndefOr[String] = onKey
    val onSeriesOuter: js.UndefOr[String] = onSeries
    val titleOuter: js.UndefOr[String] = title
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val widthOuter: js.UndefOr[Double] = width
    val heightOuter: js.UndefOr[Double] = height
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val crispOuter: js.UndefOr[Boolean] = crisp
    val groupPaddingOuter: js.UndefOr[Double] = groupPadding
    val minPointLengthOuter: js.UndefOr[Double] = minPointLength
    val cropThresholdOuter: js.UndefOr[Double] = cropThreshold
    val dataLabelsOuter: js.Any = dataLabels
    val softThresholdOuter: js.UndefOr[Boolean] = softThreshold
    val stickyTrackingOuter: js.UndefOr[Boolean] = stickyTracking
    val colorsOuter: js.UndefOr[js.Array[String | js.Object]] = colors
    val groupingOuter: js.UndefOr[Boolean] = grouping
    val maxPointWidthOuter: js.UndefOr[Double] = maxPointWidth
    val depthOuter: js.UndefOr[Double] = depth
    val edgeColorOuter: js.UndefOr[String | js.Object] = edgeColor
    val edgeWidthOuter: js.UndefOr[Double] = edgeWidth
    val groupZPaddingOuter: js.UndefOr[Double] = groupZPadding
    val boostThresholdOuter: js.UndefOr[Double] = boostThreshold
    val dragDropOuter: js.UndefOr[js.Object] = dragDrop
    val pointOuter: js.Any = point
    val labelOuter: js.Any = label
    val allowPointSelectOuter: js.UndefOr[Boolean] = allowPointSelect
    val showCheckboxOuter: js.UndefOr[Boolean] = showCheckbox
    val eventsOuter: js.Any = events
    val findNearestPointByOuter: js.UndefOr[String] = findNearestPointBy
    val animationLimitOuter: js.UndefOr[Double] = animationLimit
    val classNameOuter: js.UndefOr[String] = className
    val clipOuter: js.UndefOr[Boolean] = clip
    val colorOuter: js.UndefOr[String | js.Object] = color
    val colorIndexOuter: js.UndefOr[Double] = colorIndex
    val cursorOuter: js.UndefOr[String] = cursor
    val descriptionOuter: js.UndefOr[String] = description
    val enableMouseTrackingOuter: js.UndefOr[Boolean] = enableMouseTracking
    val exposeElementToA11yOuter: js.UndefOr[Boolean] = exposeElementToA11y
    val getExtremesFromAllOuter: js.UndefOr[Boolean] = getExtremesFromAll
    val keysOuter: js.UndefOr[js.Array[String]] = keys
    val linkedToOuter: js.UndefOr[String] = linkedTo
    val navigatorOptionsOuter: js.Any = navigatorOptions
    val negativeColorOuter: js.UndefOr[String | js.Object] = negativeColor
    val pointDescriptionFormatterOuter: js.UndefOr[js.Function] = pointDescriptionFormatter
    val pointIntervalOuter: js.UndefOr[Double] = pointInterval
    val pointIntervalUnitOuter: js.UndefOr[String] = pointIntervalUnit
    val pointPlacementOuter: js.UndefOr[String | Double] = pointPlacement
    val pointStartOuter: js.UndefOr[Double] = pointStart
    val selectedOuter: js.UndefOr[Boolean] = selected
    val shadowOuter: js.UndefOr[Boolean] = shadow
    val showInLegendOuter: js.UndefOr[Boolean] = showInLegend
    val showInNavigatorOuter: js.UndefOr[Boolean] = showInNavigator
    val skipKeyboardNavigationOuter: js.UndefOr[Boolean] = skipKeyboardNavigation
    val stackingOuter: js.UndefOr[String] = stacking
    val visibleOuter: js.UndefOr[Boolean] = visible
    val zoneAxisOuter: js.UndefOr[String] = zoneAxis
    val zonesOuter: js.UndefOr[js.Array[js.Any]] = zones
    val compareOuter: js.UndefOr[String] = compare
    val compareStartOuter: js.UndefOr[Boolean] = compareStart
    val compareBaseOuter: js.UndefOr[Double] = compareBase
    val zIndexOuter: js.UndefOr[Double] = zIndex
    val allAreasOuter: js.UndefOr[Boolean] = allAreas
    val colorAxisOuter: js.UndefOr[Boolean] = colorAxis
    val joinByOuter: js.UndefOr[String | js.Array[String]] = joinBy
    val pathfinderOuter: js.UndefOr[CleanJsObject[PlotOptionsFlagsPathfinder]] = pathfinder
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsFlags {
      override val pointRange: js.UndefOr[Double] = pointRangeOuter
      override val allowOverlapX: js.UndefOr[Boolean] = allowOverlapXOuter
      override val shape: js.UndefOr[String] = shapeOuter
      override val stackDistance: js.UndefOr[Double] = stackDistanceOuter
      override val textAlign: js.UndefOr[String] = textAlignOuter
      override val tooltip: js.UndefOr[CleanJsObject[PlotOptionsFlagsTooltip]] = tooltipOuter
      override val threshold: js.Any = thresholdOuter
      override val y: js.UndefOr[Double] = yOuter
      override val fillColor: js.UndefOr[String | js.Object] = fillColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val states: js.Any = statesOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val onKey: js.UndefOr[String] = onKeyOuter
      override val onSeries: js.UndefOr[String] = onSeriesOuter
      override val title: js.UndefOr[String] = titleOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val width: js.UndefOr[Double] = widthOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val crisp: js.UndefOr[Boolean] = crispOuter
      override val groupPadding: js.UndefOr[Double] = groupPaddingOuter
      override val minPointLength: js.UndefOr[Double] = minPointLengthOuter
      override val cropThreshold: js.UndefOr[Double] = cropThresholdOuter
      override val dataLabels: js.Any = dataLabelsOuter
      override val softThreshold: js.UndefOr[Boolean] = softThresholdOuter
      override val stickyTracking: js.UndefOr[Boolean] = stickyTrackingOuter
      override val colors: js.UndefOr[js.Array[String | js.Object]] = colorsOuter
      override val grouping: js.UndefOr[Boolean] = groupingOuter
      override val maxPointWidth: js.UndefOr[Double] = maxPointWidthOuter
      override val depth: js.UndefOr[Double] = depthOuter
      override val edgeColor: js.UndefOr[String | js.Object] = edgeColorOuter
      override val edgeWidth: js.UndefOr[Double] = edgeWidthOuter
      override val groupZPadding: js.UndefOr[Double] = groupZPaddingOuter
      override val boostThreshold: js.UndefOr[Double] = boostThresholdOuter
      override val dragDrop: js.UndefOr[js.Object] = dragDropOuter
      override val point: js.Any = pointOuter
      override val label: js.Any = labelOuter
      override val allowPointSelect: js.UndefOr[Boolean] = allowPointSelectOuter
      override val showCheckbox: js.UndefOr[Boolean] = showCheckboxOuter
      override val events: js.Any = eventsOuter
      override val findNearestPointBy: js.UndefOr[String] = findNearestPointByOuter
      override val animationLimit: js.UndefOr[Double] = animationLimitOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val clip: js.UndefOr[Boolean] = clipOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val colorIndex: js.UndefOr[Double] = colorIndexOuter
      override val cursor: js.UndefOr[String] = cursorOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val enableMouseTracking: js.UndefOr[Boolean] = enableMouseTrackingOuter
      override val exposeElementToA11y: js.UndefOr[Boolean] = exposeElementToA11yOuter
      override val getExtremesFromAll: js.UndefOr[Boolean] = getExtremesFromAllOuter
      override val keys: js.UndefOr[js.Array[String]] = keysOuter
      override val linkedTo: js.UndefOr[String] = linkedToOuter
      override val navigatorOptions: js.Any = navigatorOptionsOuter
      override val negativeColor: js.UndefOr[String | js.Object] = negativeColorOuter
      override val pointDescriptionFormatter: js.UndefOr[js.Function] = pointDescriptionFormatterOuter
      override val pointInterval: js.UndefOr[Double] = pointIntervalOuter
      override val pointIntervalUnit: js.UndefOr[String] = pointIntervalUnitOuter
      override val pointPlacement: js.UndefOr[String | Double] = pointPlacementOuter
      override val pointStart: js.UndefOr[Double] = pointStartOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val shadow: js.UndefOr[Boolean] = shadowOuter
      override val showInLegend: js.UndefOr[Boolean] = showInLegendOuter
      override val showInNavigator: js.UndefOr[Boolean] = showInNavigatorOuter
      override val skipKeyboardNavigation: js.UndefOr[Boolean] = skipKeyboardNavigationOuter
      override val stacking: js.UndefOr[String] = stackingOuter
      override val visible: js.UndefOr[Boolean] = visibleOuter
      override val zoneAxis: js.UndefOr[String] = zoneAxisOuter
      override val zones: js.UndefOr[js.Array[js.Any]] = zonesOuter
      override val compare: js.UndefOr[String] = compareOuter
      override val compareStart: js.UndefOr[Boolean] = compareStartOuter
      override val compareBase: js.UndefOr[Double] = compareBaseOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
      override val allAreas: js.UndefOr[Boolean] = allAreasOuter
      override val colorAxis: js.UndefOr[Boolean] = colorAxisOuter
      override val joinBy: js.UndefOr[String | js.Array[String]] = joinByOuter
      override val pathfinder: js.UndefOr[CleanJsObject[PlotOptionsFlagsPathfinder]] = pathfinderOuter
    })
  }
}
