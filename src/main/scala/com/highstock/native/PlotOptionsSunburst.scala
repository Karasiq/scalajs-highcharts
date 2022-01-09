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
  * @note JavaScript name: <code>plotOptions-sunburst</code>
  */
class PlotOptionsSunburst extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>When enabled the user can click on a point which is a parent and
    * zoom in on its children. Deprecated and replaced by
    * <a href="#plotOptions.sunburst.allowTraversingTree">allowTraversingTree</a>.</p>
    * @since 6.0.0
    */
  var allowDrillToNode: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When enabled the user can click on a point which is a parent and
    * zoom in on its children.</p>
    * @since 7.0.3
    */
  var allowTraversingTree: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The center of the sunburst chart relative to the plot area. Can be
    * percentages or pixel values.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-center/">Centered at 100, 100</a>
    */
  var center: js.UndefOr[js.Array[Double | String]] = js.undefined

  var colorByPoint: js.UndefOr[Boolean] = js.undefined

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
    */
  var dataLabels: js.Any = js.undefined

  /**
    * <p>Used together with the levels and <code>allowDrillToNode</code> options. When
    * set to false the first level visible when drilling is considered
    * to be level one. Otherwise the level will be the same as the tree
    * structure.</p>
    */
  var levelIsConstant: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Determines the width of the ring per level.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sunburst-levelsize/">Sunburst with various sizes per level</a>
    * @since 6.0.5
    */
  var levelSize: js.Any = js.undefined

  /**
    * <p>Set options on specific levels. Takes precedence over series options,
    * but not point options.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst">Sunburst chart</a>
    */
  var levels: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>Which point to use as a root in the visualization.</p>
    */
  var rootId: js.UndefOr[String] = js.undefined

  /**
    * <p>If a point is sliced, moved out from the center, how many pixels
    * should it be moved?.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sunburst-sliced">Sliced sunburst</a>
    * @since 6.0.4
    */
  var slicedOffset: js.UndefOr[Double] = js.undefined

  /**
    * <p>Options for the button appearing when traversing down in a treemap.</p>
    * @since 6.0.0
    */
  var traverseUpButton: js.UndefOr[CleanJsObject[PlotOptionsSunburstTraverseUpButton]] = js.undefined

  /**
    * <p>The color of the border surrounding each slice. When <code>null</code>, the
    * border takes the same color as the slice fill. This can be used
    * together with a <code>borderWidth</code> to fill drawing gaps created by
    * antialiazing artefacts in borderless pies.</p>
    * <p>In styled mode, the border stroke is given in the <code>.highcharts-point</code>
    * class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-bordercolor-black/">Black border</a>
    */
  var borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the border surrounding each slice.</p>
    * <p>When setting the border width to 0, there may be small gaps between
    * the slices due to SVG antialiasing artefacts. To work around this,
    * keep the border width at 0.5 or 1, but set the <code>borderColor</code> to
    * <code>null</code> instead.</p>
    * <p>In styled mode, the border stroke width is given in the
    * <code>.highcharts-point</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-borderwidth/">3px border</a>
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the pie series. A pie series is represented as an empty
    * circle if the total sum of its values is 0. Use this property to
    * define the color of its border.</p>
    * <p>In styled mode, the color can be defined by the
    * <a href="#plotOptions.series.colorIndex">colorIndex</a> option. Also, the series
    * color can be set with the <code>.highcharts-series</code>,
    * <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or
    * <code>.highcharts-series-{n}</code> class, or individual classes given by the
    * <code>className</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-emptyseries/">Empty pie series</a>
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>A series specific or series type specific color set to use instead
    * of the global <a href="#colors">colors</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-monochrome/">Set default colors for all pies</a>
    * @since 3.0.0
    */
  var colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined

  /**
    * <p>General event handlers for the series items. These event hooks can
    * also be attached to the series at run time using the
    * <code>Highcharts.addEvent</code> function.</p>
    */
  var events: js.Any = js.undefined

  /**
    * <p>If the total sum of the pie&#39;s values is 0, the series is represented
    * as an empty circle . The <code>fillColor</code> option defines the color of that
    * circle. Use <a href="#plotOptions.pie.borderWidth">pie.borderWidth</a> to set
    * the border thickness.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-emptyseries/">Empty pie series</a>
    */
  var fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Properties for each single point.</p>
    */
  var point: js.Any = js.undefined

  /**
    * <p>Whether to display this particular series or series type in the
    * legend. Since 2.1, pies are not shown in the legend by default.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-showinlegend/">One series in the legend, one hidden</a>
    */
  var showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The diameter of the pie relative to the plot area. Can be a
    * percentage or pixel value. Pixel values are given as integers. The
    * default behaviour (as of 3.0) is to scale to the plot area and give
    * room for data labels within the plot area.
    * <a href="#plotOptions.pie.slicedOffset">slicedOffset</a> is also included in the
    * default size calculation. As a consequence, the size of the pie may
    * vary when points are updated and data labels more around. In that
    * case it is best to set a fixed value, for example <code>&quot;75%&quot;</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-size/">Smaller pie</a>
    */
  var size: js.UndefOr[Double | String | Null] = js.undefined

  /**
    * <p>The start angle of the pie slices in degrees where 0 is top and 90
    * right.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-startangle-90/">Start from right</a>
    * @since 2.3.4
    */
  var startAngle: js.UndefOr[Double] = js.undefined

  var states: js.Any = js.undefined

  /**
    * <p>Sticky tracking of mouse events. When true, the <code>mouseOut</code> event
    * on a series isn&#39;t triggered until the mouse moves over another
    * series, or out of the plot area. When false, the <code>mouseOut</code> event on
    * a series is triggered when the mouse leaves the area around the
    * series&#39;  graph or markers. This also implies the tooltip. When
    * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip
    * will be hidden when moving the mouse between series.</p>
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
  var tooltip: js.Any = js.undefined

  /**
    * <p>The parameter allows setting line series type and use OHLC indicators.
    * Data in OHLC format is required.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/use-ohlc-data">Use OHLC data format to plot line chart</a>
    */
  var useOhlcData: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Accessibility options for a series.</p>
    * @since 7.1.0
    */
  var accessibility: js.Any = js.undefined

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
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>An additional class name to apply to the series&#39; graphical elements.
    * This option does not replace default class names of the graphical
    * element.</p>
    * @since 5.0.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>Styled mode only. A specific color index to use for the series, so
    * its graphic representations are given the class name
    * <code>highcharts-color-{n}</code>.</p>
    * @since 5.0.0
    */
  var colorIndex: js.UndefOr[Double] = js.undefined

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
    * <p>Override Pathfinder connector options for a series. Requires Highcharts Gantt
    * to be loaded.</p>
    * @since 6.2.0
    */
  var connectors: js.UndefOr[CleanJsObject[PlotOptionsSunburstConnectors]] = js.undefined

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
    */
  var cursor: js.UndefOr[String] = js.undefined

  /**
    * <p>A reserved subspace to store options and values for customized
    * functionality. Here you can add additional data for your own event
    * callbacks and formatter callbacks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/custom/">Point and series with custom data</a>
    */
  var custom: js.UndefOr[js.Object] = js.undefined

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
    */
  var enableMouseTracking: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When set to <code>false</code> will prevent the series data from being included in
    * any form of data export.</p>
    * <p>Since version 6.0.0 until 7.1.0 the option was existing undocumented
    * as <code>includeInCSVExport</code>.</p>
    * @since 7.1.0
    */
  var includeInDataExport: js.UndefOr[Boolean] = js.undefined

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
    * <p>The line marks the last price from all points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/last-price">Last price</a>
    */
  var lastPrice: js.Any = js.undefined

  /**
    * <p>The line marks the last price from visible range of points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/last-visible-price">Last visible price</a>
    */
  var lastVisiblePrice: js.Any = js.undefined

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
    * <p>Opacity of a series parts: line, fill (e.g. area) and dataLabels.</p>
    * @since 7.1.0
    */
  var opacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>Same as
    * <a href="#accessibility.series.descriptionFormatter">accessibility.series.descriptionFormatter</a>,
    * but for an individual series. Overrides the chart wide configuration.</p>
    * @since 5.0.12
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>When true, X values in the data set are relative to the current
    * <code>pointStart</code>, <code>pointInterval</code> and <code>pointIntervalUnit</code> settings. This
    * allows compression of the data for datasets with irregular X values.</p>
    * <p>The real X values are computed on the formula <code>f(x) = ax + b</code>, where
    * <code>a</code> is the <code>pointInterval</code> (optionally with a time unit given by
    * <code>pointIntervalUnit</code>), and <code>b</code> is the <code>pointStart</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-relativexvalue/">Relative X value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/relativexvalue/">Relative X value</a>
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
    * <p>Set the initial visibility of the series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-visible/">Two series, one hidden and one visible</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-visibility/">Hidden series</a>
    */
  var visible: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Define the z index of the series.</p>
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PlotOptionsSunburst {
  /**
    * @param allowDrillToNode <p>When enabled the user can click on a point which is a parent and. zoom in on its children. Deprecated and replaced by. <a href="#plotOptions.sunburst.allowTraversingTree">allowTraversingTree</a>.</p>
    * @param allowTraversingTree <p>When enabled the user can click on a point which is a parent and. zoom in on its children.</p>
    * @param center <p>The center of the sunburst chart relative to the plot area. Can be. percentages or pixel values.</p>
    * @param dataLabels <p>Options for the series data labels, appearing next to each data. point.</p>. <p>Since v6.2.0, multiple data labels can be applied to each single. point by defining them as an array of configs.</p>. <p>In styled mode, the data labels can be styled with the. <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names. (<a href="https://www.highcharts.com/samples/highcharts/css/series-datalabels">see example</a>).</p>
    * @param levelIsConstant <p>Used together with the levels and <code>allowDrillToNode</code> options. When. set to false the first level visible when drilling is considered. to be level one. Otherwise the level will be the same as the tree. structure.</p>
    * @param levelSize <p>Determines the width of the ring per level.</p>
    * @param levels <p>Set options on specific levels. Takes precedence over series options,. but not point options.</p>
    * @param rootId <p>Which point to use as a root in the visualization.</p>
    * @param slicedOffset <p>If a point is sliced, moved out from the center, how many pixels. should it be moved?.</p>
    * @param traverseUpButton <p>Options for the button appearing when traversing down in a treemap.</p>
    * @param borderColor <p>The color of the border surrounding each slice. When <code>null</code>, the. border takes the same color as the slice fill. This can be used. together with a <code>borderWidth</code> to fill drawing gaps created by. antialiazing artefacts in borderless pies.</p>. <p>In styled mode, the border stroke is given in the <code>.highcharts-point</code>. class.</p>
    * @param borderWidth <p>The width of the border surrounding each slice.</p>. <p>When setting the border width to 0, there may be small gaps between. the slices due to SVG antialiasing artefacts. To work around this,. keep the border width at 0.5 or 1, but set the <code>borderColor</code> to. <code>null</code> instead.</p>. <p>In styled mode, the border stroke width is given in the. <code>.highcharts-point</code> class.</p>
    * @param color <p>The color of the pie series. A pie series is represented as an empty. circle if the total sum of its values is 0. Use this property to. define the color of its border.</p>. <p>In styled mode, the color can be defined by the. <a href="#plotOptions.series.colorIndex">colorIndex</a> option. Also, the series. color can be set with the <code>.highcharts-series</code>,. <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or. <code>.highcharts-series-{n}</code> class, or individual classes given by the. <code>className</code> option.</p>
    * @param colors <p>A series specific or series type specific color set to use instead. of the global <a href="#colors">colors</a>.</p>
    * @param events <p>General event handlers for the series items. These event hooks can. also be attached to the series at run time using the. <code>Highcharts.addEvent</code> function.</p>
    * @param fillColor <p>If the total sum of the pie&#39;s values is 0, the series is represented. as an empty circle . The <code>fillColor</code> option defines the color of that. circle. Use <a href="#plotOptions.pie.borderWidth">pie.borderWidth</a> to set. the border thickness.</p>
    * @param point <p>Properties for each single point.</p>
    * @param showInLegend <p>Whether to display this particular series or series type in the. legend. Since 2.1, pies are not shown in the legend by default.</p>
    * @param size <p>The diameter of the pie relative to the plot area. Can be a. percentage or pixel value. Pixel values are given as integers. The. default behaviour (as of 3.0) is to scale to the plot area and give. room for data labels within the plot area.. <a href="#plotOptions.pie.slicedOffset">slicedOffset</a> is also included in the. default size calculation. As a consequence, the size of the pie may. vary when points are updated and data labels more around. In that. case it is best to set a fixed value, for example <code>&quot;75%&quot;</code>.</p>
    * @param startAngle <p>The start angle of the pie slices in degrees where 0 is top and 90. right.</p>
    * @param stickyTracking <p>Sticky tracking of mouse events. When true, the <code>mouseOut</code> event. on a series isn&#39;t triggered until the mouse moves over another. series, or out of the plot area. When false, the <code>mouseOut</code> event on. a series is triggered when the mouse leaves the area around the. series&#39;  graph or markers. This also implies the tooltip. When. <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip. will be hidden when moving the mouse between series.</p>
    * @param tooltip <p>A configuration object for the tooltip rendering of each single. series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only. the following properties can be defined on a series level.</p>
    * @param useOhlcData <p>The parameter allows setting line series type and use OHLC indicators.. Data in OHLC format is required.</p>
    * @param accessibility <p>Accessibility options for a series.</p>
    * @param allowPointSelect <p>Allow this series&#39; points to be selected by clicking on the graphic. (columns, point markers, pie slices, map areas etc).</p>. <p>The selected points can be handled by point select and unselect. events, or collectively by the <a href="/class-reference/Highcharts.Chart#getSelectedPoints">getSelectedPoints</a> function.</p>. <p>And alternative way of selecting points is through dragging.</p>
    * @param animation <p>Enable or disable the initial animation when a series is displayed.. The animation can also be set as a configuration object. Please. note that this option only applies to the initial animation of the. series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.. The following properties are supported:</p>. <ul>. <li><p><code>defer</code>: The animation delay time in milliseconds.</p>. </li>. <li><p><code>duration</code>: The duration of the animation in milliseconds.</p>. </li>. <li><p><code>easing</code>: Can be a string reference to an easing function set on. the <code>Math</code> object or a function. See the <em>Custom easing function</em>. demo below.</p>. </li>. </ul>. <p>Due to poor performance, animation is disabled in old IE browsers. for several chart types.</p>
    * @param className <p>An additional class name to apply to the series&#39; graphical elements.. This option does not replace default class names of the graphical. element.</p>
    * @param colorIndex <p>Styled mode only. A specific color index to use for the series, so. its graphic representations are given the class name. <code>highcharts-color-{n}</code>.</p>
    * @param compareStart <p>Defines if comparison should start from the first point within the visible. range or should start from the first point <strong>before</strong> the range.</p>. <p>In other words, this flag determines if first point within the visible range. will have 0% (<code>compareStart=true</code>) or should have been already calculated. according to the previous point (<code>compareStart=false</code>).</p>
    * @param connectors <p>Override Pathfinder connector options for a series. Requires Highcharts Gantt. to be loaded.</p>
    * @param crisp <p>When true, each point or column edge is rounded to its nearest pixel. in order to render sharp on screen. In some cases, when there are a. lot of densely packed columns, this leads to visible difference. in column widths or distance between columns. In these cases,. setting <code>crisp</code> to <code>false</code> may look better, even though each column. is rendered blurry.</p>
    * @param cumulative <p>Cumulative Sum feature replaces points&#39; values with the following formula:. <code>sum of all previous points&#39; values + current point&#39;s value</code>.. Works only for points in a visible range.. Adds the <code>cumulativeSum</code> field to each point object that can be accessed. e.g. in the <a href="https://api.highcharts.com/highstock/tooltip.pointFormat">tooltip.pointFormat</a>.</p>
    * @param cursor <p>You can set the cursor to &quot;pointer&quot; if you have click events attached. to the series, to signal to the user that the points and lines can. be clicked.</p>. <p>In styled mode, the series cursor can be set with the same classes. as listed under <a href="#plotOptions.series.color">series.color</a>.</p>
    * @param custom <p>A reserved subspace to store options and values for customized. functionality. Here you can add additional data for your own event. callbacks and formatter callbacks.</p>
    * @param description <p>A description of the series to add to the screen reader information. about the series.</p>
    * @param enableMouseTracking <p>Enable or disable the mouse tracking for a specific series. This. includes point tooltips and click events on graphs and points. For. large datasets it improves performance.</p>
    * @param includeInDataExport <p>When set to <code>false</code> will prevent the series data from being included in. any form of data export.</p>. <p>Since version 6.0.0 until 7.1.0 the option was existing undocumented. as <code>includeInCSVExport</code>.</p>
    * @param keys <p>An array specifying which option maps to which key in the data point. array. This makes it convenient to work with unstructured data arrays. from different sources.</p>
    * @param lastPrice <p>The line marks the last price from all points.</p>
    * @param lastVisiblePrice <p>The line marks the last price from visible range of points.</p>
    * @param linkedTo <p>The <a href="#series.id">id</a> of another series to link to. Additionally,. the value can be &quot;:previous&quot; to link to the previous series. When. two series are linked, only the first one appears in the legend.. Toggling the visibility of this also toggles the linked series.</p>. <p>If master series uses data sorting and linked series does not have. its own sorting definition, the linked series will be sorted in the. same order as the master one.</p>
    * @param opacity <p>Opacity of a series parts: line, fill (e.g. area) and dataLabels.</p>
    * @param pointDescriptionFormatter <p>Same as. <a href="#accessibility.series.descriptionFormatter">accessibility.series.descriptionFormatter</a>,. but for an individual series. Overrides the chart wide configuration.</p>
    * @param relativeXValue <p>When true, X values in the data set are relative to the current. <code>pointStart</code>, <code>pointInterval</code> and <code>pointIntervalUnit</code> settings. This. allows compression of the data for datasets with irregular X values.</p>. <p>The real X values are computed on the formula <code>f(x) = ax + b</code>, where. <code>a</code> is the <code>pointInterval</code> (optionally with a time unit given by. <code>pointIntervalUnit</code>), and <code>b</code> is the <code>pointStart</code>.</p>
    * @param selected <p>Whether to select the series initially. If <code>showCheckbox</code> is true,. the checkbox next to the series name in the legend will be checked. for a selected series.</p>
    * @param shadow <p>Whether to apply a drop shadow to the graph line. Since 2.3 the. shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>,. <code>offsetY</code>, <code>opacity</code> and <code>width</code>.</p>
    * @param showCheckbox <p>If true, a checkbox is displayed next to the legend item to allow. selecting the series. The state of the checkbox is determined by. the <code>selected</code> option.</p>
    * @param showInNavigator <p>Whether or not to show the series in the navigator. Takes precedence. over <a href="#navigator.baseSeries">navigator.baseSeries</a> if defined.</p>
    * @param skipKeyboardNavigation <p>If set to <code>true</code>, the accessibility module will skip past the points. in this series for keyboard navigation.</p>
    * @param visible <p>Set the initial visibility of the series.</p>
    * @param zIndex <p>Define the z index of the series.</p>
    */
  def apply(allowDrillToNode: js.UndefOr[Boolean] = js.undefined, allowTraversingTree: js.UndefOr[Boolean] = js.undefined, center: js.UndefOr[js.Array[Double | String]] = js.undefined, colorByPoint: js.UndefOr[Boolean] = js.undefined, dataLabels: js.UndefOr[js.Any] = js.undefined, levelIsConstant: js.UndefOr[Boolean] = js.undefined, levelSize: js.UndefOr[js.Any] = js.undefined, levels: js.UndefOr[js.Array[js.Any]] = js.undefined, rootId: js.UndefOr[String] = js.undefined, slicedOffset: js.UndefOr[Double] = js.undefined, traverseUpButton: js.UndefOr[CleanJsObject[PlotOptionsSunburstTraverseUpButton]] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, point: js.UndefOr[js.Any] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, size: js.UndefOr[Double | String | Null] = js.undefined, startAngle: js.UndefOr[Double] = js.undefined, states: js.UndefOr[js.Any] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, tooltip: js.UndefOr[js.Any] = js.undefined, useOhlcData: js.UndefOr[Boolean] = js.undefined, accessibility: js.UndefOr[js.Any] = js.undefined, allowPointSelect: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, className: js.UndefOr[String] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, compareStart: js.UndefOr[Boolean] = js.undefined, connectors: js.UndefOr[CleanJsObject[PlotOptionsSunburstConnectors]] = js.undefined, crisp: js.UndefOr[Boolean] = js.undefined, cumulative: js.UndefOr[Boolean] = js.undefined, cursor: js.UndefOr[String] = js.undefined, custom: js.UndefOr[js.Object] = js.undefined, description: js.UndefOr[String] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, includeInDataExport: js.UndefOr[Boolean] = js.undefined, keys: js.UndefOr[js.Array[String]] = js.undefined, lastPrice: js.UndefOr[js.Any] = js.undefined, lastVisiblePrice: js.UndefOr[js.Any] = js.undefined, linkedTo: js.UndefOr[String] = js.undefined, opacity: js.UndefOr[Double] = js.undefined, pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined, relativeXValue: js.UndefOr[Boolean] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, showCheckbox: js.UndefOr[Boolean] = js.undefined, showInNavigator: js.UndefOr[Boolean] = js.undefined, skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): PlotOptionsSunburst = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSunburst {
      this.allowDrillToNode = allowDrillToNode
      this.allowTraversingTree = allowTraversingTree
      this.center = center
      this.colorByPoint = colorByPoint
      this.dataLabels = dataLabels
      this.levelIsConstant = levelIsConstant
      this.levelSize = levelSize
      this.levels = levels
      this.rootId = rootId
      this.slicedOffset = slicedOffset
      this.traverseUpButton = traverseUpButton
      this.borderColor = borderColor
      this.borderWidth = borderWidth
      this.color = color
      this.colors = colors
      this.events = events
      this.fillColor = fillColor
      this.point = point
      this.showInLegend = showInLegend
      this.size = size
      this.startAngle = startAngle
      this.states = states
      this.stickyTracking = stickyTracking
      this.tooltip = tooltip
      this.useOhlcData = useOhlcData
      this.accessibility = accessibility
      this.allowPointSelect = allowPointSelect
      this.animation = animation
      this.className = className
      this.colorIndex = colorIndex
      this.compareStart = compareStart
      this.connectors = connectors
      this.crisp = crisp
      this.cumulative = cumulative
      this.cursor = cursor
      this.custom = custom
      this.description = description
      this.enableMouseTracking = enableMouseTracking
      this.includeInDataExport = includeInDataExport
      this.keys = keys
      this.lastPrice = lastPrice
      this.lastVisiblePrice = lastVisiblePrice
      this.linkedTo = linkedTo
      this.opacity = opacity
      this.pointDescriptionFormatter = pointDescriptionFormatter
      this.relativeXValue = relativeXValue
      this.selected = selected
      this.shadow = shadow
      this.showCheckbox = showCheckbox
      this.showInNavigator = showInNavigator
      this.skipKeyboardNavigation = skipKeyboardNavigation
      this.visible = visible
      this.zIndex = zIndex
    })
  }
}
