/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-sankey</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSankey extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>When using automatic point colors pulled from the global <a href="colors">colors</a>
    * or series-specific <a href="series.colors">plotOptions.column.colors</a>
    * collections, this option determines whether the chart should receive
    * one color per series or one color per point.</p>
    * <p>In styled mode, the <code>colors</code> or <code>series.colors</code> arrays are not supported,
    * and instead this option gives the points individual color class names on
    * the form <code>highcharts-color-{n}</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-false/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-true/">True</a>
    * @since 2.0
    */
  val colorByPoint: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Higher numbers makes the links in a sankey diagram render more curved.
    * A <code>curveFactor</code> of 0 makes the lines straight.</p>
    * @since 6.0.0
    */
  val curveFactor: js.UndefOr[Double] = js.undefined

  /**
    * <p>Options for the data labels appearing on top of the nodes and links. For
    * sankey charts, data labels are visible for the nodes by default, but
    * hidden for links. This is controlled by modifying the <code>nodeFormat</code>, and
    * the <code>format</code> that applies to links and is an empty string by default.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-enabled">Data labels enabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-multiple">Multiple data labels on a bar series</a>
    * @since 6.0.0
    */
  val dataLabels: js.Any = js.undefined

  /**
    * <p>Opacity for the links between nodes in the sankey diagram.</p>
    * @since 6.0.0
    */
  val linkOpacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel width of each node in a sankey diagram, or the height in case
    * the chart is inverted.</p>
    * @since 6.0.0
    */
  val nodeWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The padding between nodes in a sankey diagram, in pixels.</p>
    * @since 6.0.0
    */
  val nodePadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to display this particular series or series type in the legend.
    * The default value is <code>true</code> for standalone series, <code>false</code> for linked
    * series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-showinlegend/">One series in the legend, one hidden</a>
    * @since 6.0.0
    */
  val showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A wrapper object for all the series options in specific states.</p>
    * @since 6.0.0
    */
  val states: js.Any = js.undefined

  /**
    * <p>A configuration object for the tooltip rendering of each single series.
    * Properties are inherited from <a href="#tooltip">tooltip</a>, but only the
    * following properties can be defined on a series level.</p>
    * @since 2.3
    */
  val tooltip: js.Any = js.undefined

  /**
    * <p>The minimal height for a column or width for a bar. By default,
    * 0 values are not shown. To visualize a 0 (or close to zero) point,
    * set the minimal point length to a pixel value like 3. In stacked
    * column charts, minPointLength might not be respected for tightly
    * packed values.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength/">Zero base value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength-pos-and-neg/">Positive and negative close to zero values</a>
    * @since 6.0.0
    */
  val minPointLength: js.UndefOr[Double] = js.undefined

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
    * <p>Data grouping is the concept of sampling the data values into larger
    * blocks in order to ease readability and increase performance of the
    * JavaScript charts. Highstock by default applies data grouping when
    * the points become closer than a certain pixel value, determined by
    * the <code>groupPixelWidth</code> option.</p>
    * <p>If data grouping is applied, the grouping information of grouped
    * points can be read from the <a href="/class-reference/Highcharts.Point#.dataGroup">Point.dataGroup</a>. If point options other than
    * the data itself are set, for example <code>name</code> or <code>color</code> or custom properties,
    * the grouping logic doesn&#39;t know how to group it. In this case the options of
    * the first point instance are copied over to the group point. This can be
    * altered through a custom <code>approximation</code> callback function.</p>
    * @since 6.0.0
    */
  val dataGrouping: js.Any = js.undefined

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
    * @since 6.0.0
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
    * <p>Enable or disable the initial animation when a series is displayed.
    * The animation can also be set as a configuration object. Please
    * note that this option only applies to the initial animation of the
    * series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods. The
    * following properties are supported:</p>
    * <dl>
    * 
    * <dt>duration</dt>
    * 
    * <dd>The duration of the animation in milliseconds.</dd>
    * 
    * <dt>easing</dt>
    * 
    * <dd>Can be a string reference to an easing function set on the `Math`
    * object or a function. See the _Custom easing function_ demo below.</dd>
    * 
    * </dl>
    * 
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
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>General event handlers for the series items. These event hooks can also
    * be attached to the series at run time using the <code>Highcharts.addEvent</code>
    * function.</p>
    * @since 6.0.0
    */
  val events: js.Any = js.undefined

  /**
    * <p>When a series contains a data array that is longer than this, only
    * one dimensional arrays of numbers, or two dimensional arrays with
    * x and y values are allowed. Also, only the first point is tested,
    * and the rest are assumed to be the same format. This saves expensive
    * data checking and indexing in long series. Set it to <code>0</code> disable.</p>
    * @since 2.2
    */
  val turboThreshold: js.UndefOr[Double] = js.undefined

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
    * @since 6.0.0
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
    * @since 6.0.0
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
    * @since 6.0.0
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
    * <p>Same as <a href="#accessibility.pointDescriptionFormatter">accessibility.pointDescriptionFormatter</a>, but for an individual series.
    * Overrides the chart wide configuration.</p>
    * @since 5.0.12
    */
  val pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Whether to select the series initially. If <code>showCheckbox</code> is true,
    * the checkbox next to the series name in the legend will be checked for a
    * selected series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-selected/">One out of two series selected</a>
    * @since 1.2.0
    */
  val selected: js.UndefOr[Boolean] = js.undefined

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
    * <p>Set the initial visibility of the series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-visible/">Two series, one hidden and one visible</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-visibility/">Hidden series</a>
    * @since 6.0.0
    */
  val visible: js.UndefOr[Boolean] = js.undefined

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
    * @since 6.0.0
    */
  val zIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether all areas of the map defined in <code>mapData</code> should be rendered.
    * If <code>true</code>, areas which don&#39;t correspond to a data point, are rendered
    * as <code>null</code> points. If <code>false</code>, those areas are skipped.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allareas-false/">All areas set to false</a>
    * @since 6.0.0
    */
  val allAreas: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Set this option to <code>false</code> to prevent a series from connecting to
    * the global color axis. This will cause the series to have its own
    * legend item.</p>
    * @since 6.0.0
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
    * @since 6.0.0
    */
  val joinBy: js.UndefOr[String | js.Array[String]] = js.undefined

  /**
    * <p>Override Pathfinder options for a series. Requires Highcharts Gantt or the
    * Pathfinder module.</p>
    * @since 6.2.0
    */
  val pathfinder: js.UndefOr[CleanJsObject[PlotOptionsSankeyPathfinder]] = js.undefined
}

object PlotOptionsSankey {
  /**
    * @param colorByPoint <p>When using automatic point colors pulled from the global <a href="colors">colors</a>. or series-specific <a href="series.colors">plotOptions.column.colors</a>. collections, this option determines whether the chart should receive. one color per series or one color per point.</p>. <p>In styled mode, the <code>colors</code> or <code>series.colors</code> arrays are not supported,. and instead this option gives the points individual color class names on. the form <code>highcharts-color-{n}</code>.</p>
    * @param curveFactor <p>Higher numbers makes the links in a sankey diagram render more curved.. A <code>curveFactor</code> of 0 makes the lines straight.</p>
    * @param dataLabels <p>Options for the data labels appearing on top of the nodes and links. For. sankey charts, data labels are visible for the nodes by default, but. hidden for links. This is controlled by modifying the <code>nodeFormat</code>, and. the <code>format</code> that applies to links and is an empty string by default.</p>
    * @param linkOpacity <p>Opacity for the links between nodes in the sankey diagram.</p>
    * @param nodeWidth <p>The pixel width of each node in a sankey diagram, or the height in case. the chart is inverted.</p>
    * @param nodePadding <p>The padding between nodes in a sankey diagram, in pixels.</p>
    * @param showInLegend <p>Whether to display this particular series or series type in the legend.. The default value is <code>true</code> for standalone series, <code>false</code> for linked. series.</p>
    * @param states <p>A wrapper object for all the series options in specific states.</p>
    * @param tooltip <p>A configuration object for the tooltip rendering of each single series.. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the. following properties can be defined on a series level.</p>
    * @param minPointLength <p>The minimal height for a column or width for a bar. By default,. 0 values are not shown. To visualize a 0 (or close to zero) point,. set the minimal point length to a pixel value like 3. In stacked. column charts, minPointLength might not be respected for tightly. packed values.</p>
    * @param stickyTracking <p>Sticky tracking of mouse events. When true, the <code>mouseOut</code> event. on a series isn&#39;t triggered until the mouse moves over another series,. or out of the plot area. When false, the <code>mouseOut</code> event on a. series is triggered when the mouse leaves the area around the series&#39;. graph or markers. This also implies the tooltip when not shared. When. <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will. be hidden when moving the mouse between series. Defaults to true for line. and area type series, but to false for columns, pies etc.</p>
    * @param colors <p>A series specific or series type specific color set to apply instead. of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.</p>
    * @param dataGrouping <p>Data grouping is the concept of sampling the data values into larger. blocks in order to ease readability and increase performance of the. JavaScript charts. Highstock by default applies data grouping when. the points become closer than a certain pixel value, determined by. the <code>groupPixelWidth</code> option.</p>. <p>If data grouping is applied, the grouping information of grouped. points can be read from the <a href="/class-reference/Highcharts.Point#.dataGroup">Point.dataGroup</a>. If point options other than. the data itself are set, for example <code>name</code> or <code>color</code> or custom properties,. the grouping logic doesn&#39;t know how to group it. In this case the options of. the first point instance are copied over to the group point. This can be. altered through a custom <code>approximation</code> callback function.</p>
    * @param dragDrop <p>The draggable-points module allows points to be moved around or modified. in the chart. In addition to the options mentioned under the <code>dragDrop</code>. API structure, the module fires three events,. <a href="plotOptions.series.point.events.dragStart">point.dragStart</a>,. <a href="plotOptions.series.point.events.drag">point.drag</a> and. <a href="plotOptions.series.point.events.drop">point.drop</a>.</p>. <p>It requires the <code>modules/draggable-points.js</code> file to be loaded.</p>
    * @param point <p>Properties for each single point.</p>
    * @param label <p>Series labels are placed as close to the series as possible in a. natural way, seeking to avoid other series. The goal of this. feature is to make the chart more easily readable, like if a. human designer placed the labels in the optimal position.</p>. <p>The series labels currently work with series types having a. <code>graph</code> or an <code>area</code>.</p>. <p>Requires the <code>series-label.js</code> module.</p>
    * @param allowPointSelect <p>Allow this series&#39; points to be selected by clicking on the graphic. (columns, point markers, pie slices, map areas etc).</p>
    * @param showCheckbox <p>If true, a checkbox is displayed next to the legend item to allow. selecting the series. The state of the checkbox is determined by. the <code>selected</code> option.</p>
    * @param animation <p>Enable or disable the initial animation when a series is displayed.. The animation can also be set as a configuration object. Please. note that this option only applies to the initial animation of the. series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods. The. following properties are supported:</p>. <dl>. . <dt>duration</dt>. . <dd>The duration of the animation in milliseconds.</dd>. . <dt>easing</dt>. . <dd>Can be a string reference to an easing function set on the `Math`. object or a function. See the _Custom easing function_ demo below.</dd>. . </dl>. . <p>Due to poor performance, animation is disabled in old IE browsers. for several chart types.</p>
    * @param events <p>General event handlers for the series items. These event hooks can also. be attached to the series at run time using the <code>Highcharts.addEvent</code>. function.</p>
    * @param turboThreshold <p>When a series contains a data array that is longer than this, only. one dimensional arrays of numbers, or two dimensional arrays with. x and y values are allowed. Also, only the first point is tested,. and the rest are assumed to be the same format. This saves expensive. data checking and indexing in long series. Set it to <code>0</code> disable.</p>
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
    * @param pointDescriptionFormatter <p>Same as <a href="#accessibility.pointDescriptionFormatter">accessibility.pointDescriptionFormatter</a>, but for an individual series.. Overrides the chart wide configuration.</p>
    * @param selected <p>Whether to select the series initially. If <code>showCheckbox</code> is true,. the checkbox next to the series name in the legend will be checked for a. selected series.</p>
    * @param showInNavigator <p>Whether or not to show the series in the navigator. Takes precedence. over <a href="#navigator.baseSeries">navigator.baseSeries</a> if defined.</p>
    * @param skipKeyboardNavigation <p>If set to <code>true</code>, the accessibility module will skip past the points. in this series for keyboard navigation.</p>
    * @param visible <p>Set the initial visibility of the series.</p>
    * @param compare <p>Compare the values of the series against the first non-null, non-. zero value in the visible range. The y axis will show percentage. or absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code>. or <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows. comparing the development of the series against each other. Adds. a <code>change</code> field to every point object.</p>
    * @param compareStart <p>Defines if comparison should start from the first point within the visible. range or should start from the first point <b>before</b> the range.. In other words, this flag determines if first point within the visible range. will have 0% (<code>compareStart=true</code>) or should have been already calculated. according to the previous point (<code>compareStart=false</code>).</p>
    * @param compareBase <p>When <a href="#plotOptions.series.compare">compare</a> is <code>percent</code>, this option. dictates whether to use 0 or 100 as the base of comparison.</p>
    * @param zIndex <p>Define the z index of the series.</p>
    * @param allAreas <p>Whether all areas of the map defined in <code>mapData</code> should be rendered.. If <code>true</code>, areas which don&#39;t correspond to a data point, are rendered. as <code>null</code> points. If <code>false</code>, those areas are skipped.</p>
    * @param colorAxis <p>Set this option to <code>false</code> to prevent a series from connecting to. the global color axis. This will cause the series to have its own. legend item.</p>
    * @param joinBy <p>What property to join the <code>mapData</code> to the value data. For example,. if joinBy is &quot;code&quot;, the mapData items with a specific code is merged. into the data with the same code. For maps loaded from GeoJSON, the. keys may be held in each point&#39;s <code>properties</code> object.</p>. <p>The joinBy option can also be an array of two values, where the first. points to a key in the <code>mapData</code>, and the second points to another. key in the <code>data</code>.</p>. <p>When joinBy is <code>null</code>, the map items are joined by their position. in the array, which performs much better in maps with many data points.. This is the recommended option if you are printing more than a thousand. data points and have a backend that can preprocess the data into. a parallel array of the mapData.</p>
    * @param pathfinder <p>Override Pathfinder options for a series. Requires Highcharts Gantt or the. Pathfinder module.</p>
    */
  def apply(colorByPoint: js.UndefOr[Boolean] = js.undefined, curveFactor: js.UndefOr[Double] = js.undefined, dataLabels: js.UndefOr[js.Any] = js.undefined, linkOpacity: js.UndefOr[Double] = js.undefined, nodeWidth: js.UndefOr[Double] = js.undefined, nodePadding: js.UndefOr[Double] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, states: js.UndefOr[js.Any] = js.undefined, tooltip: js.UndefOr[js.Any] = js.undefined, minPointLength: js.UndefOr[Double] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined, dataGrouping: js.UndefOr[js.Any] = js.undefined, dragDrop: js.UndefOr[js.Object] = js.undefined, point: js.UndefOr[js.Any] = js.undefined, label: js.UndefOr[js.Any] = js.undefined, allowPointSelect: js.UndefOr[Boolean] = js.undefined, showCheckbox: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, turboThreshold: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, clip: js.UndefOr[Boolean] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, cursor: js.UndefOr[String] = js.undefined, description: js.UndefOr[String] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, exposeElementToA11y: js.UndefOr[Boolean] = js.undefined, getExtremesFromAll: js.UndefOr[Boolean] = js.undefined, keys: js.UndefOr[js.Array[String]] = js.undefined, linkedTo: js.UndefOr[String] = js.undefined, navigatorOptions: js.UndefOr[js.Any] = js.undefined, pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, showInNavigator: js.UndefOr[Boolean] = js.undefined, skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, compare: js.UndefOr[String] = js.undefined, compareStart: js.UndefOr[Boolean] = js.undefined, compareBase: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, allAreas: js.UndefOr[Boolean] = js.undefined, colorAxis: js.UndefOr[Boolean] = js.undefined, joinBy: js.UndefOr[String | js.Array[String]] = js.undefined, pathfinder: js.UndefOr[CleanJsObject[PlotOptionsSankeyPathfinder]] = js.undefined): PlotOptionsSankey = {
    val colorByPointOuter: js.UndefOr[Boolean] = colorByPoint
    val curveFactorOuter: js.UndefOr[Double] = curveFactor
    val dataLabelsOuter: js.Any = dataLabels
    val linkOpacityOuter: js.UndefOr[Double] = linkOpacity
    val nodeWidthOuter: js.UndefOr[Double] = nodeWidth
    val nodePaddingOuter: js.UndefOr[Double] = nodePadding
    val showInLegendOuter: js.UndefOr[Boolean] = showInLegend
    val statesOuter: js.Any = states
    val tooltipOuter: js.Any = tooltip
    val minPointLengthOuter: js.UndefOr[Double] = minPointLength
    val stickyTrackingOuter: js.UndefOr[Boolean] = stickyTracking
    val colorsOuter: js.UndefOr[js.Array[String | js.Object]] = colors
    val dataGroupingOuter: js.Any = dataGrouping
    val dragDropOuter: js.UndefOr[js.Object] = dragDrop
    val pointOuter: js.Any = point
    val labelOuter: js.Any = label
    val allowPointSelectOuter: js.UndefOr[Boolean] = allowPointSelect
    val showCheckboxOuter: js.UndefOr[Boolean] = showCheckbox
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    val eventsOuter: js.Any = events
    val turboThresholdOuter: js.UndefOr[Double] = turboThreshold
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
    val pointDescriptionFormatterOuter: js.UndefOr[js.Function] = pointDescriptionFormatter
    val selectedOuter: js.UndefOr[Boolean] = selected
    val showInNavigatorOuter: js.UndefOr[Boolean] = showInNavigator
    val skipKeyboardNavigationOuter: js.UndefOr[Boolean] = skipKeyboardNavigation
    val visibleOuter: js.UndefOr[Boolean] = visible
    val compareOuter: js.UndefOr[String] = compare
    val compareStartOuter: js.UndefOr[Boolean] = compareStart
    val compareBaseOuter: js.UndefOr[Double] = compareBase
    val zIndexOuter: js.UndefOr[Double] = zIndex
    val allAreasOuter: js.UndefOr[Boolean] = allAreas
    val colorAxisOuter: js.UndefOr[Boolean] = colorAxis
    val joinByOuter: js.UndefOr[String | js.Array[String]] = joinBy
    val pathfinderOuter: js.UndefOr[CleanJsObject[PlotOptionsSankeyPathfinder]] = pathfinder
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSankey {
      override val colorByPoint: js.UndefOr[Boolean] = colorByPointOuter
      override val curveFactor: js.UndefOr[Double] = curveFactorOuter
      override val dataLabels: js.Any = dataLabelsOuter
      override val linkOpacity: js.UndefOr[Double] = linkOpacityOuter
      override val nodeWidth: js.UndefOr[Double] = nodeWidthOuter
      override val nodePadding: js.UndefOr[Double] = nodePaddingOuter
      override val showInLegend: js.UndefOr[Boolean] = showInLegendOuter
      override val states: js.Any = statesOuter
      override val tooltip: js.Any = tooltipOuter
      override val minPointLength: js.UndefOr[Double] = minPointLengthOuter
      override val stickyTracking: js.UndefOr[Boolean] = stickyTrackingOuter
      override val colors: js.UndefOr[js.Array[String | js.Object]] = colorsOuter
      override val dataGrouping: js.Any = dataGroupingOuter
      override val dragDrop: js.UndefOr[js.Object] = dragDropOuter
      override val point: js.Any = pointOuter
      override val label: js.Any = labelOuter
      override val allowPointSelect: js.UndefOr[Boolean] = allowPointSelectOuter
      override val showCheckbox: js.UndefOr[Boolean] = showCheckboxOuter
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
      override val events: js.Any = eventsOuter
      override val turboThreshold: js.UndefOr[Double] = turboThresholdOuter
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
      override val pointDescriptionFormatter: js.UndefOr[js.Function] = pointDescriptionFormatterOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val showInNavigator: js.UndefOr[Boolean] = showInNavigatorOuter
      override val skipKeyboardNavigation: js.UndefOr[Boolean] = skipKeyboardNavigationOuter
      override val visible: js.UndefOr[Boolean] = visibleOuter
      override val compare: js.UndefOr[String] = compareOuter
      override val compareStart: js.UndefOr[Boolean] = compareStartOuter
      override val compareBase: js.UndefOr[Double] = compareBaseOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
      override val allAreas: js.UndefOr[Boolean] = allAreasOuter
      override val colorAxis: js.UndefOr[Boolean] = colorAxisOuter
      override val joinBy: js.UndefOr[String | js.Array[String]] = joinByOuter
      override val pathfinder: js.UndefOr[CleanJsObject[PlotOptionsSankeyPathfinder]] = pathfinderOuter
    })
  }
}
