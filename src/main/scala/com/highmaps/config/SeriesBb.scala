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
  * @note JavaScript name: <code>series&lt;bb&gt;</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBb extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>An id for the series. This can be used after render time to get a pointer
    * to the series object through <code>chart.get()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-id/">Get series by id</a>
    * @since 1.2.0
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * <p>The index of the series in the chart, affecting the internal index in the
    * <code>chart.series</code> array, the visible Z index as well as the order in the
    * legend.</p>
    * @since 2.3.0
    */
  val index: js.UndefOr[Double] = js.undefined

  /**
    * <p>The sequential index of the series in the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/legendindex/">Legend in opposite order</a>
    * @since 6.0.0
    */
  val legendIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>The name of the series as shown in the legend, tooltip etc.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/name/">Series name</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/category-map/">Series name</a>
    * @since 6.0.0
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * <p>This option allows grouping series in a stacked chart. The stack option
    * can be a string or anything else, as long as the grouped series&#39; stack
    * options match each other after conversion into a string.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/stack/">Stacked and grouped columns</a>
    * @since 2.1
    */
  val stack: js.UndefOr[String | js.Any] = js.undefined

  /**
    * <p>The type of series, for example <code>line</code> or <code>column</code>. By default, the
    * series type is inherited from <a href="#chart.type">chart.type</a>, so unless the
    * chart is a combination of series types, there is no need to set it on the
    * series level.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/type/">Line and column in the same chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/mapline-mappoint/">Multiple types in the same map</a>
    * @since 6.0.0
    */
  val `type`: js.UndefOr[String] = "bb"

  /**
    * <p>When using dual or multiple x axes, this number defines which xAxis the
    * particular series is connected to. It refers to either the
    * {@link #xAxis.id|axis id}
    * or the index of the axis in the xAxis array, with 0 being the first.</p>
    * @since 6.0.0
    */
  val xAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>When using dual or multiple y axes, this number defines which yAxis the
    * particular series is connected to. It refers to either the
    * {@link #yAxis.id|axis id}
    * or the index of the axis in the yAxis array, with 0 being the first.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/yaxis/">Apply the column series to the secondary Y axis</a>
    * @since 6.0.0
    */
  val yAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>Define the visual z index of the series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex-default/">With no z index, the series defined last are on top</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex/">With a z index, the series with the highest z index is on top</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex-default/">With no z index, the series defined last are on top</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex/">With a z index, the series with the highest z index is on top</a>
    * @since 6.0.0
    */
  val zIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>An array of objects containing a <code>path</code> definition and optionally
    * a code or property to join in the data as per the <code>joinBy</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/category-map/">Map data and joinBy</a>
    * @since 6.0.0
    */
  val mapData: js.UndefOr[js.Array[js.Object]] = js.undefined

  val params: js.Any = js.undefined

  /**
    * <p>Bottom line options.</p>
    * @since 6.0.0
    */
  val bottomLine: js.Any = js.undefined

  /**
    * <p>Top line options.</p>
    * @since 6.0.0
    */
  val topLine: js.Any = js.undefined

  /**
    * <p>A configuration object for the tooltip rendering of each single series.
    * Properties are inherited from <a href="#tooltip">tooltip</a>, but only the
    * following properties can be defined on a series level.</p>
    * @since 2.3
    */
  val tooltip: js.Any = js.undefined

  /**
    * <p>Options for the point markers of line-like series. Properties like
    * <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual appearance
    * of the markers. Other series types, like column series, don&#39;t have
    * markers, but have visual options on the series level instead.</p>
    * <p>In styled mode, the markers can be styled with the <code>.highcharts-point</code>,
    * <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code>
    * class names.</p>
    * @since 6.0.0
    */
  val marker: js.Any = js.undefined

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
    * <p>The main series ID that indicator will be based on. Required for this
    * indicator.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/arearange-line/">Linked series</a>
    * @since 6.0.0
    */
  val linkedTo: js.UndefOr[String] = js.undefined

  /**
    * <p>The SVG value used for the <code>stroke-linecap</code> and <code>stroke-linejoin</code>
    * of a line graph. Round means that lines are rounded in the ends and
    * bends.</p>
    * @since 3.0.7
    */
  val linecap: js.UndefOr[String] = js.undefined

  /**
    * <p>Set the point threshold for when a series should enter boost mode.</p>
    * <p>Setting it to e.g. 2000 will cause the series to enter boost mode when there
    * are 2000 or more points in the series.</p>
    * <p>To disable boosting on the series, set the <code>boostThreshold</code> to 0. Setting it
    * to 1 will force boosting.</p>
    * <p>Requires <code>modules/boost.js</code>.</p>
    * @since 6.0.0
    */
  val boostThreshold: js.UndefOr[Double] = js.undefined

  /**
    * <p>Defines when to display a gap in the graph, together with the
    * <a href="plotOptions.series.gapUnit">gapUnit</a> option.</p>
    * <p>In case when <code>dataGrouping</code> is enabled, points can be grouped into a
    * larger time span. This can make the grouped points to have a greater
    * distance than the absolute value of <code>gapSize</code> property, which will result
    * in disappearing graph completely. To prevent this situation the mentioned
    * distance between grouped points is used instead of previously defined
    * <code>gapSize</code>.</p>
    * <p>In practice, this option is most often used to visualize gaps in
    * time series. In a stock chart, intraday data is available for daytime
    * hours, while gaps will appear in nights and weekends.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-gapsize/">Setting the gap size to 2 introduces gaps for weekends in daily datasets.</a>
    * @since 6.0.0
    */
  val gapSize: js.UndefOr[Double] = js.undefined

  /**
    * <p>Together with <a href="plotOptions.series.gapSize">gapSize</a>, this option defines
    * where to draw gaps in the graph.</p>
    * <p>When the <code>gapUnit</code> is <code>relative</code> (default), a gap size of 5 means
    * that if the distance between two points is greater than five times
    * that of the two closest points, the graph will be broken.</p>
    * <p>When the <code>gapUnit</code> is <code>value</code>, the gap is based on absolute axis values,
    * which on a datetime axis is milliseconds. This also applies to the
    * navigator series that inherits gap options from the base series.</p>
    * @since 5.0.13
    */
  val gapUnit: js.UndefOr[String] = js.undefined

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
    * <p>Pixel width of the graph line.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-linewidth-general/">On all series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-linewidth-specific/">On one single series</a>
    * @since 6.0.0
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

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
    * <p>Options for the series data labels, appearing next to each data point.</p>
    * <p>Since v6.2.0, multiple data labels can be applied to each single point by
    * defining them as an array of configs.</p>
    * <p>In styled mode, the data labels can be styled with the
    * <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names
    * (<a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels">see example</a>).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-enabled">Data labels enabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-multiple">Multiple data labels on a bar series</a>
    * @since 6.0.0
    */
  val dataLabels: js.Any = js.undefined

  /**
    * <p>When the series contains less points than the crop threshold, all
    * points are drawn, even if the points fall outside the visible plot
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
    * <p>A wrapper object for all the series options in specific states.</p>
    * @since 6.0.0
    */
  val states: js.Any = js.undefined

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
    * <p>When a series contains a data array that is longer than this, only
    * one dimensional arrays of numbers, or two dimensional arrays with
    * x and y values are allowed. Also, only the first point is tested,
    * and the rest are assumed to be the same format. This saves expensive
    * data checking and indexing in long series. Set it to <code>0</code> disable.</p>
    * @since 2.2
    */
  val turboThreshold: js.UndefOr[Double] = js.undefined

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
    * @since 6.0.0
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
    * <p>Whether to connect a graph line across null points, or render a gap
    * between the two points on either side of the null.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-connectnulls-false/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-connectnulls-true/">True</a>
    * @since 6.0.0
    */
  val connectNulls: js.UndefOr[Boolean] = js.undefined

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
    * <p>A name for the dash style to use for the graph, or for some series types
    * the outline of each shape.</p>
    * <p>In styled mode, the [stroke dash-array](<a href="https://jsfiddle.net/gh/get/">https://jsfiddle.net/gh/get/</a>
    * library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/
    * series-dashstyle/) can be set with the same classes as listed under
    * <a href="#plotOptions.series.color">series.color</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">Possible values demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle/">Chart suitable for printing in black and white</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">Possible values demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">Possible values demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-dashstyle/">Dotted borders on a map</a>
    * @since 2.1
    */
  val dashStyle: js.UndefOr[String] = js.undefined

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
    * @since 6.0.0
    */
  val shadow: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to display this particular series or series type in the legend.
    * The default value is <code>true</code> for standalone series, <code>false</code> for linked
    * series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-showinlegend/">One series in the legend, one hidden</a>
    * @since 6.0.0
    */
  val showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>If set to <code>true</code>, the accessibility module will skip past the points
    * in this series for keyboard navigation.</p>
    * @since 5.0.12
    */
  val skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to apply steps to the line. Possible values are <code>left</code>, <code>center</code>
    * and <code>right</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/line-step/">Different step line options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-step/">Stepped, stacked area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/line-step/">Step line</a>
    * @since 1.2.5
    */
  val step: js.UndefOr[String] = js.undefined

  /**
    * <p>The threshold, also called zero level or base level. For line type
    * series this is only used in conjunction with
    * <a href="#plotOptions.series.negativeColor">negativeColor</a>.</p>
    * @since 3.0
    */
  val threshold: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set the initial visibility of the series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-visible/">Two series, one hidden and one visible</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-visibility/">Hidden series</a>
    * @since 6.0.0
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
    * <p>Polar charts only. Whether to connect the ends of a line series
    * plot across the extremes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/line-connectends-false/">Do not connect</a>
    * @since 2.3.0
    */
  val connectEnds: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The border color of the map areas.</p>
    * <p>In styled mode, the border stroke is given in the <code>.highcharts-point</code>
    * class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-border/">Borders demo</a>
    * @since 6.0.0
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border width of each map area.</p>
    * <p>In styled mode, the border stroke width is given in the
    * <code>.highcharts-point</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-border/">Borders demo</a>
    * @since 6.0.0
    */
  val borderWidth: js.Any = js.undefined

  /**
    * <p>Override Pathfinder options for a series. Requires Highcharts Gantt or the
    * Pathfinder module.</p>
    * @since 6.2.0
    */
  val pathfinder: js.UndefOr[CleanJsObject[SeriesBbPathfinder]] = js.undefined

  /**
    * <p>The width of each point on the x axis. For example in a column chart
    * with one value each day, the pointRange would be 1 day (= 24 * 3600</p>
    * <ul>
    * <li>1000 milliseconds). This is normally computed automatically, but
    * this option can be used to override the automatic value.</li>
    * </ul>
    * @since 6.0.0
    */
  val pointRange: js.UndefOr[Double] = js.undefined

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
    * @since 6.0.0
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
    * @since 6.0.0
    */
  val pointStart: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether or not to show the series in the navigator. Takes precedence
    * over <a href="#navigator.baseSeries">navigator.baseSeries</a> if defined.</p>
    * @since 5.0.0
    */
  val showInNavigator: js.UndefOr[Boolean] = js.undefined

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
    * @since 6.0.0
    */
  val stacking: js.UndefOr[String] = js.undefined

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
    * <p>When <a href="#plotOptions.series.compare">compare</a> is <code>percent</code>, this option
    * dictates whether to use 0 or 100 as the base of comparison.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples//">Compare base is 100</a>
    * @since 5.0.6
    */
  val compareBase: js.UndefOr[Double] = js.undefined

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
}

object SeriesBb {
  /**
    * @param id <p>An id for the series. This can be used after render time to get a pointer. to the series object through <code>chart.get()</code>.</p>
    * @param index <p>The index of the series in the chart, affecting the internal index in the. <code>chart.series</code> array, the visible Z index as well as the order in the. legend.</p>
    * @param legendIndex <p>The sequential index of the series in the legend.</p>
    * @param name <p>The name of the series as shown in the legend, tooltip etc.</p>
    * @param stack <p>This option allows grouping series in a stacked chart. The stack option. can be a string or anything else, as long as the grouped series&#39; stack. options match each other after conversion into a string.</p>
    * @param `type` <p>The type of series, for example <code>line</code> or <code>column</code>. By default, the. series type is inherited from <a href="#chart.type">chart.type</a>, so unless the. chart is a combination of series types, there is no need to set it on the. series level.</p>
    * @param xAxis <p>When using dual or multiple x axes, this number defines which xAxis the. particular series is connected to. It refers to either the. {@link #xAxis.id|axis id}. or the index of the axis in the xAxis array, with 0 being the first.</p>
    * @param yAxis <p>When using dual or multiple y axes, this number defines which yAxis the. particular series is connected to. It refers to either the. {@link #yAxis.id|axis id}. or the index of the axis in the yAxis array, with 0 being the first.</p>
    * @param zIndex <p>Define the visual z index of the series.</p>
    * @param mapData <p>An array of objects containing a <code>path</code> definition and optionally. a code or property to join in the data as per the <code>joinBy</code> option.</p>
    * @param bottomLine <p>Bottom line options.</p>
    * @param topLine <p>Top line options.</p>
    * @param tooltip <p>A configuration object for the tooltip rendering of each single series.. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the. following properties can be defined on a series level.</p>
    * @param marker <p>Options for the point markers of line-like series. Properties like. <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code> define the visual appearance. of the markers. Other series types, like column series, don&#39;t have. markers, but have visual options on the series level instead.</p>. <p>In styled mode, the markers can be styled with the <code>.highcharts-point</code>,. <code>.highcharts-point-hover</code> and <code>.highcharts-point-select</code>. class names.</p>
    * @param dataGrouping <p>Data grouping is the concept of sampling the data values into larger. blocks in order to ease readability and increase performance of the. JavaScript charts. Highstock by default applies data grouping when. the points become closer than a certain pixel value, determined by. the <code>groupPixelWidth</code> option.</p>. <p>If data grouping is applied, the grouping information of grouped. points can be read from the <a href="/class-reference/Highcharts.Point#.dataGroup">Point.dataGroup</a>. If point options other than. the data itself are set, for example <code>name</code> or <code>color</code> or custom properties,. the grouping logic doesn&#39;t know how to group it. In this case the options of. the first point instance are copied over to the group point. This can be. altered through a custom <code>approximation</code> callback function.</p>
    * @param linkedTo <p>The main series ID that indicator will be based on. Required for this. indicator.</p>
    * @param linecap <p>The SVG value used for the <code>stroke-linecap</code> and <code>stroke-linejoin</code>. of a line graph. Round means that lines are rounded in the ends and. bends.</p>
    * @param boostThreshold <p>Set the point threshold for when a series should enter boost mode.</p>. <p>Setting it to e.g. 2000 will cause the series to enter boost mode when there. are 2000 or more points in the series.</p>. <p>To disable boosting on the series, set the <code>boostThreshold</code> to 0. Setting it. to 1 will force boosting.</p>. <p>Requires <code>modules/boost.js</code>.</p>
    * @param gapSize <p>Defines when to display a gap in the graph, together with the. <a href="plotOptions.series.gapUnit">gapUnit</a> option.</p>. <p>In case when <code>dataGrouping</code> is enabled, points can be grouped into a. larger time span. This can make the grouped points to have a greater. distance than the absolute value of <code>gapSize</code> property, which will result. in disappearing graph completely. To prevent this situation the mentioned. distance between grouped points is used instead of previously defined. <code>gapSize</code>.</p>. <p>In practice, this option is most often used to visualize gaps in. time series. In a stock chart, intraday data is available for daytime. hours, while gaps will appear in nights and weekends.</p>
    * @param gapUnit <p>Together with <a href="plotOptions.series.gapSize">gapSize</a>, this option defines. where to draw gaps in the graph.</p>. <p>When the <code>gapUnit</code> is <code>relative</code> (default), a gap size of 5 means. that if the distance between two points is greater than five times. that of the two closest points, the graph will be broken.</p>. <p>When the <code>gapUnit</code> is <code>value</code>, the gap is based on absolute axis values,. which on a datetime axis is milliseconds. This also applies to the. navigator series that inherits gap options from the base series.</p>
    * @param dragDrop <p>The draggable-points module allows points to be moved around or modified. in the chart. In addition to the options mentioned under the <code>dragDrop</code>. API structure, the module fires three events,. <a href="plotOptions.series.point.events.dragStart">point.dragStart</a>,. <a href="plotOptions.series.point.events.drag">point.drag</a> and. <a href="plotOptions.series.point.events.drop">point.drop</a>.</p>. <p>It requires the <code>modules/draggable-points.js</code> file to be loaded.</p>
    * @param point <p>Properties for each single point.</p>
    * @param label <p>Series labels are placed as close to the series as possible in a. natural way, seeking to avoid other series. The goal of this. feature is to make the chart more easily readable, like if a. human designer placed the labels in the optimal position.</p>. <p>The series labels currently work with series types having a. <code>graph</code> or an <code>area</code>.</p>. <p>Requires the <code>series-label.js</code> module.</p>
    * @param lineWidth <p>Pixel width of the graph line.</p>
    * @param allowPointSelect <p>Allow this series&#39; points to be selected by clicking on the graphic. (columns, point markers, pie slices, map areas etc).</p>
    * @param showCheckbox <p>If true, a checkbox is displayed next to the legend item to allow. selecting the series. The state of the checkbox is determined by. the <code>selected</code> option.</p>
    * @param animation <p>Enable or disable the initial animation when a series is displayed.. The animation can also be set as a configuration object. Please. note that this option only applies to the initial animation of the. series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods. The. following properties are supported:</p>. <dl>. . <dt>duration</dt>. . <dd>The duration of the animation in milliseconds.</dd>. . <dt>easing</dt>. . <dd>Can be a string reference to an easing function set on the `Math`. object or a function. See the _Custom easing function_ demo below.</dd>. . </dl>. . <p>Due to poor performance, animation is disabled in old IE browsers. for several chart types.</p>
    * @param events <p>General event handlers for the series items. These event hooks can also. be attached to the series at run time using the <code>Highcharts.addEvent</code>. function.</p>
    * @param dataLabels <p>Options for the series data labels, appearing next to each data point.</p>. <p>Since v6.2.0, multiple data labels can be applied to each single point by. defining them as an array of configs.</p>. <p>In styled mode, the data labels can be styled with the. <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names. (<a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels">see example</a>).</p>
    * @param cropThreshold <p>When the series contains less points than the crop threshold, all. points are drawn, even if the points fall outside the visible plot. area at the current zoom. The advantage of drawing all points (including. markers and columns), is that animation is performed on updates.. On the other hand, when the series contains more points than the. crop threshold, the series data is cropped to only contain points. that fall within the plot area. The advantage of cropping away invisible. points is to increase performance on large series.</p>
    * @param softThreshold <p>When this is true, the series will not cause the Y axis to cross. the zero plane (or <a href="#plotOptions.series.threshold">threshold</a> option). unless the data actually crosses the plane.</p>. <p>For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2,. 3 will make the Y axis show negative values according to the <code>minPadding</code>. option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.</p>
    * @param states <p>A wrapper object for all the series options in specific states.</p>
    * @param stickyTracking <p>Sticky tracking of mouse events. When true, the <code>mouseOut</code> event. on a series isn&#39;t triggered until the mouse moves over another series,. or out of the plot area. When false, the <code>mouseOut</code> event on a. series is triggered when the mouse leaves the area around the series&#39;. graph or markers. This also implies the tooltip when not shared. When. <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will. be hidden when moving the mouse between series. Defaults to true for line. and area type series, but to false for columns, pies etc.</p>
    * @param turboThreshold <p>When a series contains a data array that is longer than this, only. one dimensional arrays of numbers, or two dimensional arrays with. x and y values are allowed. Also, only the first point is tested,. and the rest are assumed to be the same format. This saves expensive. data checking and indexing in long series. Set it to <code>0</code> disable.</p>
    * @param findNearestPointBy <p>Determines whether the series should look for the nearest point. in both dimensions or just the x-dimension when hovering the series.. Defaults to <code>&#39;xy&#39;</code> for scatter series and <code>&#39;x&#39;</code> for most other. series. If the data has duplicate x-values, it is recommended to. set this to <code>&#39;xy&#39;</code> to allow hovering over all points.</p>. <p>Applies only to series types using nearest neighbor search (not. direct hover) for tooltip.</p>
    * @param animationLimit <p>For some series, there is a limit that shuts down initial animation. by default when the total number of points in the chart is too high.. For example, for a column chart and its derivatives, animation doesn&#39;t. run if there is more than 250 points totally. To disable this cap, set. <code>animationLimit</code> to <code>Infinity</code>.</p>
    * @param className <p>An additional class name to apply to the series&#39; graphical elements. This. option does not replace default class names of the graphical element.</p>
    * @param clip <p>Disable this option to allow series rendering in the whole plotting. area.</p>. <p><strong>Note:</strong> Clipping should be always enabled when. <a href="#chart.zoomType">chart.zoomType</a> is set</p>
    * @param color <p>The main color of the series. In line type series it applies to the. line and the point markers unless otherwise specified. In bar type. series it applies to the bars unless a color is specified per point.. The default value is pulled from the <code>options.colors</code> array.</p>. <p>In styled mode, the color can be defined by the. <a href="#plotOptions.series.colorIndex">colorIndex</a> option. Also, the series. color can be set with the <code>.highcharts-series</code>, <code>.highcharts-color-{n}</code>,. <code>.highcharts-{type}-series</code> or <code>.highcharts-series-{n}</code> class, or. individual classes given by the <code>className</code> option.</p>
    * @param colorIndex <p>Styled mode only. A specific color index to use for the series, so its. graphic representations are given the class name <code>highcharts-color-{n}</code>.</p>
    * @param connectNulls <p>Whether to connect a graph line across null points, or render a gap. between the two points on either side of the null.</p>
    * @param cursor <p>You can set the cursor to &quot;pointer&quot; if you have click events attached. to the series, to signal to the user that the points and lines can. be clicked.</p>. <p>In styled mode, the series cursor can be set with the same classes. as listed under <a href="#plotOptions.series.color">series.color</a>.</p>
    * @param dashStyle <p>A name for the dash style to use for the graph, or for some series types. the outline of each shape.</p>. <p>In styled mode, the [stroke dash-array](<a href="https://jsfiddle.net/gh/get/">https://jsfiddle.net/gh/get/</a>. library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/. series-dashstyle/) can be set with the same classes as listed under. <a href="#plotOptions.series.color">series.color</a>.</p>
    * @param description <p>Requires the Accessibility module.</p>. <p>A description of the series to add to the screen reader information. about the series.</p>
    * @param enableMouseTracking <p>Enable or disable the mouse tracking for a specific series. This. includes point tooltips and click events on graphs and points. For. large datasets it improves performance.</p>
    * @param exposeElementToA11y <p>By default, series are exposed to screen readers as regions. By enabling. this option, the series element itself will be exposed in the same. way as the data points. This is useful if the series is not used. as a grouping entity in the chart, but you still want to attach a. description to the series.</p>. <p>Requires the Accessibility module.</p>
    * @param getExtremesFromAll <p>Whether to use the Y extremes of the total chart width or only the. zoomed area when zooming in on parts of the X axis. By default, the. Y axis adjusts to the min and max of the visible data. Cartesian. series only.</p>
    * @param negativeColor <p>The color for the parts of the graph or points that are below the. <a href="#plotOptions.series.threshold">threshold</a>.</p>
    * @param pointDescriptionFormatter <p>Same as <a href="#accessibility.pointDescriptionFormatter">accessibility.pointDescriptionFormatter</a>, but for an individual series.. Overrides the chart wide configuration.</p>
    * @param selected <p>Whether to select the series initially. If <code>showCheckbox</code> is true,. the checkbox next to the series name in the legend will be checked for a. selected series.</p>
    * @param shadow <p>Whether to apply a drop shadow to the graph line. Since 2.3 the shadow. can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,. <code>opacity</code> and <code>width</code>.</p>
    * @param showInLegend <p>Whether to display this particular series or series type in the legend.. The default value is <code>true</code> for standalone series, <code>false</code> for linked. series.</p>
    * @param skipKeyboardNavigation <p>If set to <code>true</code>, the accessibility module will skip past the points. in this series for keyboard navigation.</p>
    * @param step <p>Whether to apply steps to the line. Possible values are <code>left</code>, <code>center</code>. and <code>right</code>.</p>
    * @param threshold <p>The threshold, also called zero level or base level. For line type. series this is only used in conjunction with. <a href="#plotOptions.series.negativeColor">negativeColor</a>.</p>
    * @param visible <p>Set the initial visibility of the series.</p>
    * @param zoneAxis <p>Defines the Axis on which the zones are applied.</p>
    * @param zones <p>An array defining zones within a series. Zones can be applied to. the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code>. option. The zone definitions have to be in ascending order regarding to. the value.</p>. <p>In styled mode, the color zones are styled with the. <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>. option. (<a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">view live demo</a>).</p>
    * @param compareStart <p>Defines if comparison should start from the first point within the visible. range or should start from the first point <b>before</b> the range.. In other words, this flag determines if first point within the visible range. will have 0% (<code>compareStart=true</code>) or should have been already calculated. according to the previous point (<code>compareStart=false</code>).</p>
    * @param connectEnds <p>Polar charts only. Whether to connect the ends of a line series. plot across the extremes.</p>
    * @param borderColor <p>The border color of the map areas.</p>. <p>In styled mode, the border stroke is given in the <code>.highcharts-point</code>. class.</p>
    * @param borderWidth <p>The border width of each map area.</p>. <p>In styled mode, the border stroke width is given in the. <code>.highcharts-point</code> class.</p>
    * @param pathfinder <p>Override Pathfinder options for a series. Requires Highcharts Gantt or the. Pathfinder module.</p>
    * @param pointRange <p>The width of each point on the x axis. For example in a column chart. with one value each day, the pointRange would be 1 day (= 24 * 3600</p>. <ul>. <li>1000 milliseconds). This is normally computed automatically, but. this option can be used to override the automatic value.</li>. </ul>
    * @param keys <p>An array specifying which option maps to which key in the data point. array. This makes it convenient to work with unstructured data arrays. from different sources.</p>
    * @param navigatorOptions <p>Options for the corresponding navigator series if <code>showInNavigator</code>. is <code>true</code> for this series. Available options are the same as any. series, documented at <a href="#plotOptions.series">plotOptions</a> and. <a href="#series">series</a>.</p>. <p>These options are merged with options in <a href="#navigator.series">navigator.series</a>, and will take precedence if the same option is. defined both places.</p>
    * @param pointInterval <p>If no x values are given for the points in a series, <code>pointInterval</code>. defines the interval of the x values. For example, if a series contains. one value every decade starting from year 0, set <code>pointInterval</code> to. <code>10</code>. In true <code>datetime</code> axes, the <code>pointInterval</code> is set in. milliseconds.</p>. <p>It can be also be combined with <code>pointIntervalUnit</code> to draw irregular. time intervals.</p>. <p>Please note that this options applies to the <em>series data</em>, not the. interval of the axis ticks, which is independent.</p>
    * @param pointIntervalUnit <p>On datetime series, this allows for setting the. <a href="#plotOptions.series.pointInterval">pointInterval</a> to irregular time. units, <code>day</code>, <code>month</code> and <code>year</code>. A day is usually the same as 24 hours,. but <code>pointIntervalUnit</code> also takes the DST crossover into consideration. when dealing with local time. Combine this option with <code>pointInterval</code>. to draw weeks, quarters, 6 months, 10 years etc.</p>. <p>Please note that this options applies to the <em>series data</em>, not the. interval of the axis ticks, which is independent.</p>
    * @param pointPlacement <p>Possible values: <code>&quot;on&quot;</code>, <code>&quot;between&quot;</code>, <code>number</code>.</p>. <p>In a column chart, when pointPlacement is <code>&quot;on&quot;</code>, the point will. not create any padding of the X axis. In a polar column chart this. means that the first column points directly north. If the pointPlacement. is <code>&quot;between&quot;</code>, the columns will be laid out between ticks. This. is useful for example for visualising an amount between two points. in time or in a certain sector of a polar chart.</p>. <p>Since Highcharts 3.0.2, the point placement can also be numeric,. where 0 is on the axis value, -0.5 is between this value and the. previous, and 0.5 is between this value and the next. Unlike the. textual options, numeric point placement options won&#39;t affect axis. padding.</p>. <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is. computed, but for line-type series it needs to be set.</p>. <p>For the <code>xrange</code> series type and gantt charts, if the Y axis is a. category axis, the <code>pointPlacement</code> applies to the Y axis rather than. the (typically datetime) X axis.</p>. <p>Defaults to <code>undefined</code> in cartesian charts, <code>&quot;between&quot;</code> in polar charts.</p>
    * @param pointStart <p>If no x values are given for the points in a series, pointStart defines. on what value to start. For example, if a series contains one yearly. value starting from 1945, set pointStart to 1945.</p>
    * @param showInNavigator <p>Whether or not to show the series in the navigator. Takes precedence. over <a href="#navigator.baseSeries">navigator.baseSeries</a> if defined.</p>
    * @param stacking <p>Whether to stack the values of each series on top of each other. Possible. values are <code>undefined</code> to disable, <code>&quot;normal&quot;</code> to stack by value or. <code>&quot;percent&quot;</code>. When stacking is enabled, data must be sorted in ascending. X order. A special stacking option is with the streamgraph series type,. where the stacking option is set to <code>&quot;stream&quot;</code>.</p>
    * @param compare <p>Compare the values of the series against the first non-null, non-. zero value in the visible range. The y axis will show percentage. or absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code>. or <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows. comparing the development of the series against each other. Adds. a <code>change</code> field to every point object.</p>
    * @param compareBase <p>When <a href="#plotOptions.series.compare">compare</a> is <code>percent</code>, this option. dictates whether to use 0 or 100 as the base of comparison.</p>
    * @param allAreas <p>Whether all areas of the map defined in <code>mapData</code> should be rendered.. If <code>true</code>, areas which don&#39;t correspond to a data point, are rendered. as <code>null</code> points. If <code>false</code>, those areas are skipped.</p>
    * @param colorAxis <p>Set this option to <code>false</code> to prevent a series from connecting to. the global color axis. This will cause the series to have its own. legend item.</p>
    * @param joinBy <p>What property to join the <code>mapData</code> to the value data. For example,. if joinBy is &quot;code&quot;, the mapData items with a specific code is merged. into the data with the same code. For maps loaded from GeoJSON, the. keys may be held in each point&#39;s <code>properties</code> object.</p>. <p>The joinBy option can also be an array of two values, where the first. points to a key in the <code>mapData</code>, and the second points to another. key in the <code>data</code>.</p>. <p>When joinBy is <code>null</code>, the map items are joined by their position. in the array, which performs much better in maps with many data points.. This is the recommended option if you are printing more than a thousand. data points and have a backend that can preprocess the data into. a parallel array of the mapData.</p>
    */
  def apply(id: js.UndefOr[String] = js.undefined, index: js.UndefOr[Double] = js.undefined, legendIndex: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, stack: js.UndefOr[String | js.Any] = js.undefined, `type`: js.UndefOr[String] = "bb", xAxis: js.UndefOr[Double | String] = js.undefined, yAxis: js.UndefOr[Double | String] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, mapData: js.UndefOr[js.Array[js.Object]] = js.undefined, params: js.UndefOr[js.Any] = js.undefined, bottomLine: js.UndefOr[js.Any] = js.undefined, topLine: js.UndefOr[js.Any] = js.undefined, tooltip: js.UndefOr[js.Any] = js.undefined, marker: js.UndefOr[js.Any] = js.undefined, dataGrouping: js.UndefOr[js.Any] = js.undefined, linkedTo: js.UndefOr[String] = js.undefined, linecap: js.UndefOr[String] = js.undefined, boostThreshold: js.UndefOr[Double] = js.undefined, gapSize: js.UndefOr[Double] = js.undefined, gapUnit: js.UndefOr[String] = js.undefined, dragDrop: js.UndefOr[js.Object] = js.undefined, point: js.UndefOr[js.Any] = js.undefined, label: js.UndefOr[js.Any] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, allowPointSelect: js.UndefOr[Boolean] = js.undefined, showCheckbox: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, dataLabels: js.UndefOr[js.Any] = js.undefined, cropThreshold: js.UndefOr[Double] = js.undefined, softThreshold: js.UndefOr[Boolean] = js.undefined, states: js.UndefOr[js.Any] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, turboThreshold: js.UndefOr[Double] = js.undefined, findNearestPointBy: js.UndefOr[String] = js.undefined, animationLimit: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, clip: js.UndefOr[Boolean] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, connectNulls: js.UndefOr[Boolean] = js.undefined, cursor: js.UndefOr[String] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, description: js.UndefOr[String] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, exposeElementToA11y: js.UndefOr[Boolean] = js.undefined, getExtremesFromAll: js.UndefOr[Boolean] = js.undefined, negativeColor: js.UndefOr[String | js.Object] = js.undefined, pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined, step: js.UndefOr[String] = js.undefined, threshold: js.UndefOr[Double] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, zoneAxis: js.UndefOr[String] = js.undefined, zones: js.UndefOr[js.Array[js.Any]] = js.undefined, compareStart: js.UndefOr[Boolean] = js.undefined, connectEnds: js.UndefOr[Boolean] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[js.Any] = js.undefined, pathfinder: js.UndefOr[CleanJsObject[SeriesBbPathfinder]] = js.undefined, pointRange: js.UndefOr[Double] = js.undefined, keys: js.UndefOr[js.Array[String]] = js.undefined, navigatorOptions: js.UndefOr[js.Any] = js.undefined, pointInterval: js.UndefOr[Double] = js.undefined, pointIntervalUnit: js.UndefOr[String] = js.undefined, pointPlacement: js.UndefOr[String | Double] = js.undefined, pointStart: js.UndefOr[Double] = js.undefined, showInNavigator: js.UndefOr[Boolean] = js.undefined, stacking: js.UndefOr[String] = js.undefined, compare: js.UndefOr[String] = js.undefined, compareBase: js.UndefOr[Double] = js.undefined, allAreas: js.UndefOr[Boolean] = js.undefined, colorAxis: js.UndefOr[Boolean] = js.undefined, joinBy: js.UndefOr[String | js.Array[String]] = js.undefined): SeriesBb = {
    val idOuter: js.UndefOr[String] = id
    val indexOuter: js.UndefOr[Double] = index
    val legendIndexOuter: js.UndefOr[Double] = legendIndex
    val nameOuter: js.UndefOr[String] = name
    val stackOuter: js.UndefOr[String | js.Any] = stack
    val typeOuter: js.UndefOr[String] = `type`
    val xAxisOuter: js.UndefOr[Double | String] = xAxis
    val yAxisOuter: js.UndefOr[Double | String] = yAxis
    val zIndexOuter: js.UndefOr[Double] = zIndex
    val mapDataOuter: js.UndefOr[js.Array[js.Object]] = mapData
    val paramsOuter: js.Any = params
    val bottomLineOuter: js.Any = bottomLine
    val topLineOuter: js.Any = topLine
    val tooltipOuter: js.Any = tooltip
    val markerOuter: js.Any = marker
    val dataGroupingOuter: js.Any = dataGrouping
    val linkedToOuter: js.UndefOr[String] = linkedTo
    val linecapOuter: js.UndefOr[String] = linecap
    val boostThresholdOuter: js.UndefOr[Double] = boostThreshold
    val gapSizeOuter: js.UndefOr[Double] = gapSize
    val gapUnitOuter: js.UndefOr[String] = gapUnit
    val dragDropOuter: js.UndefOr[js.Object] = dragDrop
    val pointOuter: js.Any = point
    val labelOuter: js.Any = label
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val allowPointSelectOuter: js.UndefOr[Boolean] = allowPointSelect
    val showCheckboxOuter: js.UndefOr[Boolean] = showCheckbox
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    val eventsOuter: js.Any = events
    val dataLabelsOuter: js.Any = dataLabels
    val cropThresholdOuter: js.UndefOr[Double] = cropThreshold
    val softThresholdOuter: js.UndefOr[Boolean] = softThreshold
    val statesOuter: js.Any = states
    val stickyTrackingOuter: js.UndefOr[Boolean] = stickyTracking
    val turboThresholdOuter: js.UndefOr[Double] = turboThreshold
    val findNearestPointByOuter: js.UndefOr[String] = findNearestPointBy
    val animationLimitOuter: js.UndefOr[Double] = animationLimit
    val classNameOuter: js.UndefOr[String] = className
    val clipOuter: js.UndefOr[Boolean] = clip
    val colorOuter: js.UndefOr[String | js.Object] = color
    val colorIndexOuter: js.UndefOr[Double] = colorIndex
    val connectNullsOuter: js.UndefOr[Boolean] = connectNulls
    val cursorOuter: js.UndefOr[String] = cursor
    val dashStyleOuter: js.UndefOr[String] = dashStyle
    val descriptionOuter: js.UndefOr[String] = description
    val enableMouseTrackingOuter: js.UndefOr[Boolean] = enableMouseTracking
    val exposeElementToA11yOuter: js.UndefOr[Boolean] = exposeElementToA11y
    val getExtremesFromAllOuter: js.UndefOr[Boolean] = getExtremesFromAll
    val negativeColorOuter: js.UndefOr[String | js.Object] = negativeColor
    val pointDescriptionFormatterOuter: js.UndefOr[js.Function] = pointDescriptionFormatter
    val selectedOuter: js.UndefOr[Boolean] = selected
    val shadowOuter: js.UndefOr[Boolean] = shadow
    val showInLegendOuter: js.UndefOr[Boolean] = showInLegend
    val skipKeyboardNavigationOuter: js.UndefOr[Boolean] = skipKeyboardNavigation
    val stepOuter: js.UndefOr[String] = step
    val thresholdOuter: js.UndefOr[Double] = threshold
    val visibleOuter: js.UndefOr[Boolean] = visible
    val zoneAxisOuter: js.UndefOr[String] = zoneAxis
    val zonesOuter: js.UndefOr[js.Array[js.Any]] = zones
    val compareStartOuter: js.UndefOr[Boolean] = compareStart
    val connectEndsOuter: js.UndefOr[Boolean] = connectEnds
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.Any = borderWidth
    val pathfinderOuter: js.UndefOr[CleanJsObject[SeriesBbPathfinder]] = pathfinder
    val pointRangeOuter: js.UndefOr[Double] = pointRange
    val keysOuter: js.UndefOr[js.Array[String]] = keys
    val navigatorOptionsOuter: js.Any = navigatorOptions
    val pointIntervalOuter: js.UndefOr[Double] = pointInterval
    val pointIntervalUnitOuter: js.UndefOr[String] = pointIntervalUnit
    val pointPlacementOuter: js.UndefOr[String | Double] = pointPlacement
    val pointStartOuter: js.UndefOr[Double] = pointStart
    val showInNavigatorOuter: js.UndefOr[Boolean] = showInNavigator
    val stackingOuter: js.UndefOr[String] = stacking
    val compareOuter: js.UndefOr[String] = compare
    val compareBaseOuter: js.UndefOr[Double] = compareBase
    val allAreasOuter: js.UndefOr[Boolean] = allAreas
    val colorAxisOuter: js.UndefOr[Boolean] = colorAxis
    val joinByOuter: js.UndefOr[String | js.Array[String]] = joinBy
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBb {
      override val id: js.UndefOr[String] = idOuter
      override val index: js.UndefOr[Double] = indexOuter
      override val legendIndex: js.UndefOr[Double] = legendIndexOuter
      override val name: js.UndefOr[String] = nameOuter
      override val stack: js.UndefOr[String | js.Any] = stackOuter
      override val `type`: js.UndefOr[String] = typeOuter
      override val xAxis: js.UndefOr[Double | String] = xAxisOuter
      override val yAxis: js.UndefOr[Double | String] = yAxisOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
      override val mapData: js.UndefOr[js.Array[js.Object]] = mapDataOuter
      override val params: js.Any = paramsOuter
      override val bottomLine: js.Any = bottomLineOuter
      override val topLine: js.Any = topLineOuter
      override val tooltip: js.Any = tooltipOuter
      override val marker: js.Any = markerOuter
      override val dataGrouping: js.Any = dataGroupingOuter
      override val linkedTo: js.UndefOr[String] = linkedToOuter
      override val linecap: js.UndefOr[String] = linecapOuter
      override val boostThreshold: js.UndefOr[Double] = boostThresholdOuter
      override val gapSize: js.UndefOr[Double] = gapSizeOuter
      override val gapUnit: js.UndefOr[String] = gapUnitOuter
      override val dragDrop: js.UndefOr[js.Object] = dragDropOuter
      override val point: js.Any = pointOuter
      override val label: js.Any = labelOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val allowPointSelect: js.UndefOr[Boolean] = allowPointSelectOuter
      override val showCheckbox: js.UndefOr[Boolean] = showCheckboxOuter
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
      override val events: js.Any = eventsOuter
      override val dataLabels: js.Any = dataLabelsOuter
      override val cropThreshold: js.UndefOr[Double] = cropThresholdOuter
      override val softThreshold: js.UndefOr[Boolean] = softThresholdOuter
      override val states: js.Any = statesOuter
      override val stickyTracking: js.UndefOr[Boolean] = stickyTrackingOuter
      override val turboThreshold: js.UndefOr[Double] = turboThresholdOuter
      override val findNearestPointBy: js.UndefOr[String] = findNearestPointByOuter
      override val animationLimit: js.UndefOr[Double] = animationLimitOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val clip: js.UndefOr[Boolean] = clipOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val colorIndex: js.UndefOr[Double] = colorIndexOuter
      override val connectNulls: js.UndefOr[Boolean] = connectNullsOuter
      override val cursor: js.UndefOr[String] = cursorOuter
      override val dashStyle: js.UndefOr[String] = dashStyleOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val enableMouseTracking: js.UndefOr[Boolean] = enableMouseTrackingOuter
      override val exposeElementToA11y: js.UndefOr[Boolean] = exposeElementToA11yOuter
      override val getExtremesFromAll: js.UndefOr[Boolean] = getExtremesFromAllOuter
      override val negativeColor: js.UndefOr[String | js.Object] = negativeColorOuter
      override val pointDescriptionFormatter: js.UndefOr[js.Function] = pointDescriptionFormatterOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val shadow: js.UndefOr[Boolean] = shadowOuter
      override val showInLegend: js.UndefOr[Boolean] = showInLegendOuter
      override val skipKeyboardNavigation: js.UndefOr[Boolean] = skipKeyboardNavigationOuter
      override val step: js.UndefOr[String] = stepOuter
      override val threshold: js.UndefOr[Double] = thresholdOuter
      override val visible: js.UndefOr[Boolean] = visibleOuter
      override val zoneAxis: js.UndefOr[String] = zoneAxisOuter
      override val zones: js.UndefOr[js.Array[js.Any]] = zonesOuter
      override val compareStart: js.UndefOr[Boolean] = compareStartOuter
      override val connectEnds: js.UndefOr[Boolean] = connectEndsOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.Any = borderWidthOuter
      override val pathfinder: js.UndefOr[CleanJsObject[SeriesBbPathfinder]] = pathfinderOuter
      override val pointRange: js.UndefOr[Double] = pointRangeOuter
      override val keys: js.UndefOr[js.Array[String]] = keysOuter
      override val navigatorOptions: js.Any = navigatorOptionsOuter
      override val pointInterval: js.UndefOr[Double] = pointIntervalOuter
      override val pointIntervalUnit: js.UndefOr[String] = pointIntervalUnitOuter
      override val pointPlacement: js.UndefOr[String | Double] = pointPlacementOuter
      override val pointStart: js.UndefOr[Double] = pointStartOuter
      override val showInNavigator: js.UndefOr[Boolean] = showInNavigatorOuter
      override val stacking: js.UndefOr[String] = stackingOuter
      override val compare: js.UndefOr[String] = compareOuter
      override val compareBase: js.UndefOr[Double] = compareBaseOuter
      override val allAreas: js.UndefOr[Boolean] = allAreasOuter
      override val colorAxis: js.UndefOr[Boolean] = colorAxisOuter
      override val joinBy: js.UndefOr[String | js.Array[String]] = joinByOuter
    })
  }
}
