/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-item</code>
  */
class PlotOptionsItem extends com.highcharts.HighchartsGenericObject {

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
    * <p>In circular view, the end angle of the item layout, in degrees where
    * 0 is up.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/parliament-chart">Parliament chart</a>
    * @since 7.1.0
    */
  var endAngle: js.UndefOr[js.UndefOr[Double]] = js.undefined

  /**
    * <p>In circular view, the size of the inner diameter of the circle. Can
    * be a percentage or pixel value. Percentages are relative to the outer
    * perimeter. Pixel values are given as integers.</p>
    * <p>If the <code>rows</code> option is set, it overrides the <code>innerSize</code> setting.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/parliament-chart">Parliament chart</a>
    * @since 7.1.0
    */
  var innerSize: js.UndefOr[String | Double] = js.undefined

  /**
    * <p>The padding between the items, given in relative size where the size
    * of the item is 1.</p>
    * @since 7.1.0
    */
  var itemPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The layout of the items in rectangular view. Can be either
    * <code>horizontal</code> or <code>vertical</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-item/symbols">Horizontal layout</a>
    * @since 7.1.0
    */
  var layout: js.UndefOr[String] = js.undefined

  var marker: js.UndefOr[CleanJsObject[PlotOptionsItemMarker]] = js.undefined

  /**
    * <p>The number of rows to display in the rectangular or circular view. If
    * the <code>innerSize</code> is set, it will be overridden by the <code>rows</code> setting.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-item/rows-columns">Fixed row count</a>
    * @since 7.1.0
    */
  var rows: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to display this particular series or series type in the
    * legend. Since 2.1, pies are not shown in the legend by default.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-showinlegend/">One series in the legend, one hidden</a>
    * @since 7.1.0
    */
  var showInLegend: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>In circular view, the start angle of the item layout, in degrees
    * where 0 is up.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/parliament-chart">Parliament chart</a>
    * @since 7.1.0
    */
  var startAngle: js.UndefOr[js.UndefOr[Double]] = js.undefined

  /**
    * <p>The center of the pie chart relative to the plot area. Can be
    * percentages or pixel values. The default behaviour (as of 3.0) is to
    * center the pie so that all slices and data labels are within the plot
    * area. As a consequence, the pie may actually jump around in a chart
    * with dynamic values, as the data labels move. In that case, the
    * center should be explicitly set, for example to <code>[&quot;50%&quot;, &quot;50%&quot;]</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-center/">Centered at 100, 100</a>
    * @since 7.1.0
    */
  var center: js.UndefOr[js.Array[js.Any]] = js.undefined

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
    * @since 7.1.0
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
    * @since 7.1.0
    */
  var dataLabels: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined

  /**
    * <p>General event handlers for the series items. These event hooks can
    * also be attached to the series at run time using the
    * <code>Highcharts.addEvent</code> function.</p>
    * @since 7.1.0
    */
  var events: js.Any = js.undefined

  /**
    * <p>If the total sum of the pie&#39;s values is 0, the series is represented
    * as an empty circle . The <code>fillColor</code> option defines the color of that
    * circle. Use <a href="#plotOptions.pie.borderWidth">pie.borderWidth</a> to set
    * the border thickness.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-emptyseries/">Empty pie series</a>
    * @since 7.1.0
    */
  var fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Equivalent to <a href="#chart.ignoreHiddenSeries">chart.ignoreHiddenSeries</a>,
    * this option tells whether the series shall be redrawn as if the
    * hidden point were <code>null</code>.</p>
    * <p>The default value changed from <code>false</code> to <code>true</code> with Highcharts
    * 3.0.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-ignorehiddenpoint/">True, the hiddden point is ignored</a>
    * @since 2.3.0
    */
  var ignoreHiddenPoint: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The minimum size for a pie in response to auto margins. The pie will
    * try to shrink to make room for data labels in side the plot area,
    *  but only to this size.</p>
    * @since 3.0.0
    */
  var minSize: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>Properties for each single point.</p>
    * @since 7.1.0
    */
  var point: js.Any = js.undefined

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
    * @since 7.1.0
    */
  var size: js.UndefOr[Double | String | Null] = js.undefined

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
    * @since 7.1.0
    */
  var useOhlcData: js.UndefOr[Boolean] = js.undefined

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
    * @since 7.1.0
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
    * @since 7.1.0
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
    * @since 7.1.0
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
    * <p>Override Pathfinder connector options for a series. Requires Highcharts Gantt
    * to be loaded.</p>
    * @since 6.2.0
    */
  var connectors: js.UndefOr[CleanJsObject[PlotOptionsItemConnectors]] = js.undefined

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
    * @since 7.1.0
    */
  var cursor: js.UndefOr[String] = js.undefined

  /**
    * <p>A reserved subspace to store options and values for customized
    * functionality. Here you can add additional data for your own event
    * callbacks and formatter callbacks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/custom/">Point and series with custom data</a>
    * @since 7.1.0
    */
  var custom: js.UndefOr[js.Object] = js.undefined

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
    * @since 7.1.0
    */
  var dataGrouping: js.Any = js.undefined

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
    * @since 7.1.0
    */
  var enableMouseTracking: js.UndefOr[Boolean] = js.undefined

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
    * @since 7.1.0
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
    * @since 7.1.0
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
    * <p>The line marks the last price from all points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/last-price">Last price</a>
    * @since 7.1.0
    */
  var lastPrice: js.Any = js.undefined

  /**
    * <p>The line marks the last price from visible range of points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/last-visible-price">Last visible price</a>
    * @since 7.1.0
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
    * <p>The width of each point on the x axis. For example in a column chart
    * with one value each day, the pointRange would be 1 day (= 24 * 3600</p>
    * <ul>
    * <li>1000 milliseconds). This is normally computed automatically, but
    * this option can be used to override the automatic value.</li>
    * </ul>
    * @since 7.1.0
    */
  var pointRange: js.UndefOr[Double] = js.undefined

  /**
    * <p>When true, X values in the data set are relative to the current
    * <code>pointStart</code>, <code>pointInterval</code> and <code>pointIntervalUnit</code> settings. This
    * allows compression of the data for datasets with irregular X values.</p>
    * <p>The real X values are computed on the formula <code>f(x) = ax + b</code>, where
    * <code>a</code> is the <code>pointInterval</code> (optionally with a time unit given by
    * <code>pointIntervalUnit</code>), and <code>b</code> is the <code>pointStart</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-relativexvalue/">Relative X value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/relativexvalue/">Relative X value</a>
    * @since 7.1.0
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
    * @since 7.1.0
    */
  var visible: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Define the z index of the series.</p>
    * @since 7.1.0
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PlotOptionsItem {
  /**
    * @param crisp <p>When true, each point or column edge is rounded to its nearest pixel. in order to render sharp on screen. In some cases, when there are a. lot of densely packed columns, this leads to visible difference. in column widths or distance between columns. In these cases,. setting <code>crisp</code> to <code>false</code> may look better, even though each column. is rendered blurry.</p>
    * @param endAngle <p>In circular view, the end angle of the item layout, in degrees where. 0 is up.</p>
    * @param innerSize <p>In circular view, the size of the inner diameter of the circle. Can. be a percentage or pixel value. Percentages are relative to the outer. perimeter. Pixel values are given as integers.</p>. <p>If the <code>rows</code> option is set, it overrides the <code>innerSize</code> setting.</p>
    * @param itemPadding <p>The padding between the items, given in relative size where the size. of the item is 1.</p>
    * @param layout <p>The layout of the items in rectangular view. Can be either. <code>horizontal</code> or <code>vertical</code>.</p>
    * @param rows <p>The number of rows to display in the rectangular or circular view. If. the <code>innerSize</code> is set, it will be overridden by the <code>rows</code> setting.</p>
    * @param showInLegend <p>Whether to display this particular series or series type in the. legend. Since 2.1, pies are not shown in the legend by default.</p>
    * @param startAngle <p>In circular view, the start angle of the item layout, in degrees. where 0 is up.</p>
    * @param center <p>The center of the pie chart relative to the plot area. Can be. percentages or pixel values. The default behaviour (as of 3.0) is to. center the pie so that all slices and data labels are within the plot. area. As a consequence, the pie may actually jump around in a chart. with dynamic values, as the data labels move. In that case, the. center should be explicitly set, for example to <code>[&quot;50%&quot;, &quot;50%&quot;]</code>.</p>
    * @param clip <p>Disable this option to allow series rendering in the whole plotting. area.</p>. <p><strong>Note:</strong> Clipping should be always enabled when. <a href="#chart.zoomType">chart.zoomType</a> is set</p>
    * @param color <p>The color of the pie series. A pie series is represented as an empty. circle if the total sum of its values is 0. Use this property to. define the color of its border.</p>. <p>In styled mode, the color can be defined by the. <a href="#plotOptions.series.colorIndex">colorIndex</a> option. Also, the series. color can be set with the <code>.highcharts-series</code>,. <code>.highcharts-color-{n}</code>, <code>.highcharts-{type}-series</code> or. <code>.highcharts-series-{n}</code> class, or individual classes given by the. <code>className</code> option.</p>
    * @param colors <p>A series specific or series type specific color set to use instead. of the global <a href="#colors">colors</a>.</p>
    * @param dataLabels <p>Options for the series data labels, appearing next to each data. point.</p>. <p>Since v6.2.0, multiple data labels can be applied to each single. point by defining them as an array of configs.</p>. <p>In styled mode, the data labels can be styled with the. <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names. (<a href="https://www.highcharts.com/samples/highcharts/css/series-datalabels">see example</a>).</p>
    * @param events <p>General event handlers for the series items. These event hooks can. also be attached to the series at run time using the. <code>Highcharts.addEvent</code> function.</p>
    * @param fillColor <p>If the total sum of the pie&#39;s values is 0, the series is represented. as an empty circle . The <code>fillColor</code> option defines the color of that. circle. Use <a href="#plotOptions.pie.borderWidth">pie.borderWidth</a> to set. the border thickness.</p>
    * @param ignoreHiddenPoint <p>Equivalent to <a href="#chart.ignoreHiddenSeries">chart.ignoreHiddenSeries</a>,. this option tells whether the series shall be redrawn as if the. hidden point were <code>null</code>.</p>. <p>The default value changed from <code>false</code> to <code>true</code> with Highcharts. 3.0.</p>
    * @param minSize <p>The minimum size for a pie in response to auto margins. The pie will. try to shrink to make room for data labels in side the plot area,.  but only to this size.</p>
    * @param point <p>Properties for each single point.</p>
    * @param size <p>The diameter of the pie relative to the plot area. Can be a. percentage or pixel value. Pixel values are given as integers. The. default behaviour (as of 3.0) is to scale to the plot area and give. room for data labels within the plot area.. <a href="#plotOptions.pie.slicedOffset">slicedOffset</a> is also included in the. default size calculation. As a consequence, the size of the pie may. vary when points are updated and data labels more around. In that. case it is best to set a fixed value, for example <code>&quot;75%&quot;</code>.</p>
    * @param stickyTracking <p>Sticky tracking of mouse events. When true, the <code>mouseOut</code> event. on a series isn&#39;t triggered until the mouse moves over another. series, or out of the plot area. When false, the <code>mouseOut</code> event on. a series is triggered when the mouse leaves the area around the. series&#39;  graph or markers. This also implies the tooltip. When. <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip. will be hidden when moving the mouse between series.</p>
    * @param tooltip <p>A configuration object for the tooltip rendering of each single. series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only. the following properties can be defined on a series level.</p>
    * @param useOhlcData <p>The parameter allows setting line series type and use OHLC indicators.. Data in OHLC format is required.</p>
    * @param accessibility <p>Accessibility options for a series.</p>
    * @param allAreas <p>Whether all areas of the map defined in <code>mapData</code> should be rendered.. If <code>true</code>, areas which don&#39;t correspond to a data point, are rendered. as <code>null</code> points. If <code>false</code>, those areas are skipped.</p>
    * @param allowPointSelect <p>Allow this series&#39; points to be selected by clicking on the graphic. (columns, point markers, pie slices, map areas etc).</p>. <p>The selected points can be handled by point select and unselect. events, or collectively by the <a href="/class-reference/Highcharts.Chart#getSelectedPoints">getSelectedPoints</a> function.</p>. <p>And alternative way of selecting points is through dragging.</p>
    * @param animation <p>Enable or disable the initial animation when a series is displayed.. The animation can also be set as a configuration object. Please. note that this option only applies to the initial animation of the. series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.. The following properties are supported:</p>. <ul>. <li><p><code>defer</code>: The animation delay time in milliseconds.</p>. </li>. <li><p><code>duration</code>: The duration of the animation in milliseconds.</p>. </li>. <li><p><code>easing</code>: Can be a string reference to an easing function set on. the <code>Math</code> object or a function. See the <em>Custom easing function</em>. demo below.</p>. </li>. </ul>. <p>Due to poor performance, animation is disabled in old IE browsers. for several chart types.</p>
    * @param className <p>An additional class name to apply to the series&#39; graphical elements.. This option does not replace default class names of the graphical. element.</p>
    * @param colorAxis <p>When using dual or multiple color axes, this number defines which. colorAxis the particular series is connected to. It refers to. either the. {@link #colorAxis.id|axis id}. or the index of the axis in the colorAxis array, with 0 being the. first. Set this option to false to prevent a series from connecting. to the default color axis.</p>. <p>Since v7.2.0 the option can also be an axis id or an axis index. instead of a boolean flag.</p>
    * @param colorIndex <p>Styled mode only. A specific color index to use for the series, so. its graphic representations are given the class name. <code>highcharts-color-{n}</code>.</p>
    * @param colorKey <p>Determines what data value should be used to calculate point color. if <code>colorAxis</code> is used. Requires to set <code>min</code> and <code>max</code> if some. custom point property is used or if approximation for data grouping. is set to <code>&#39;sum&#39;</code>.</p>
    * @param compare <p>Compare the values of the series against the first non-null, non-. zero value in the visible range. The y axis will show percentage. or absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code>. or <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows. comparing the development of the series against each other. Adds. a <code>change</code> field to every point object.</p>
    * @param compareBase <p>When <a href="#plotOptions.series.compare">compare</a> is <code>percent</code>, this option. dictates whether to use 0 or 100 as the base of comparison.</p>
    * @param compareStart <p>Defines if comparison should start from the first point within the visible. range or should start from the first point <strong>before</strong> the range.</p>. <p>In other words, this flag determines if first point within the visible range. will have 0% (<code>compareStart=true</code>) or should have been already calculated. according to the previous point (<code>compareStart=false</code>).</p>
    * @param connectors <p>Override Pathfinder connector options for a series. Requires Highcharts Gantt. to be loaded.</p>
    * @param cumulative <p>Cumulative Sum feature replaces points&#39; values with the following formula:. <code>sum of all previous points&#39; values + current point&#39;s value</code>.. Works only for points in a visible range.. Adds the <code>cumulativeSum</code> field to each point object that can be accessed. e.g. in the <a href="https://api.highcharts.com/highstock/tooltip.pointFormat">tooltip.pointFormat</a>.</p>
    * @param cursor <p>You can set the cursor to &quot;pointer&quot; if you have click events attached. to the series, to signal to the user that the points and lines can. be clicked.</p>. <p>In styled mode, the series cursor can be set with the same classes. as listed under <a href="#plotOptions.series.color">series.color</a>.</p>
    * @param custom <p>A reserved subspace to store options and values for customized. functionality. Here you can add additional data for your own event. callbacks and formatter callbacks.</p>
    * @param dataGrouping <p>Data grouping is the concept of sampling the data values into larger. blocks in order to ease readability and increase performance of the. JavaScript charts. Highcharts Stock by default applies data grouping when. the points become closer than a certain pixel value, determined by. the <code>groupPixelWidth</code> option.</p>. <p>If data grouping is applied, the grouping information of grouped. points can be read from the <a href="/class-reference/Highcharts.Point#dataGroup">Point.dataGroup</a>. If point options other than. the data itself are set, for example <code>name</code> or <code>color</code> or custom properties,. the grouping logic doesn&#39;t know how to group it. In this case the options of. the first point instance are copied over to the group point. This can be. altered through a custom <code>approximation</code> callback function.</p>
    * @param description <p>A description of the series to add to the screen reader information. about the series.</p>
    * @param enableMouseTracking <p>Enable or disable the mouse tracking for a specific series. This. includes point tooltips and click events on graphs and points. For. large datasets it improves performance.</p>
    * @param gapSize <p>Defines when to display a gap in the graph, together with the. <a href="plotOptions.series.gapUnit">gapUnit</a> option.</p>. <p>In case when <code>dataGrouping</code> is enabled, points can be grouped. into a larger time span. This can make the grouped points to. have a greater distance than the absolute value of <code>gapSize</code>. property, which will result in disappearing graph completely.. To prevent this situation the mentioned distance between. grouped points is used instead of previously defined. <code>gapSize</code>.</p>. <p>In practice, this option is most often used to visualize gaps. in time series. In a stock chart, intraday data is available. for daytime hours, while gaps will appear in nights and. weekends.</p>
    * @param gapUnit <p>Together with <a href="plotOptions.series.gapSize">gapSize</a>, this. option defines where to draw gaps in the graph.</p>. <p>When the <code>gapUnit</code> is <code>&quot;relative&quot;</code> (default), a gap size of 5. means that if the distance between two points is greater than. 5 times that of the two closest points, the graph will be. broken.</p>. <p>When the <code>gapUnit</code> is <code>&quot;value&quot;</code>, the gap is based on absolute. axis values, which on a datetime axis is milliseconds. This. also applies to the navigator series that inherits gap. options from the base series.</p>
    * @param includeInDataExport <p>When set to <code>false</code> will prevent the series data from being included in. any form of data export.</p>. <p>Since version 6.0.0 until 7.1.0 the option was existing undocumented. as <code>includeInCSVExport</code>.</p>
    * @param joinBy <p>What property to join the <code>mapData</code> to the value data. For example,. if joinBy is &quot;code&quot;, the mapData items with a specific code is merged. into the data with the same code. For maps loaded from GeoJSON, the. keys may be held in each point&#39;s <code>properties</code> object.</p>. <p>The joinBy option can also be an array of two values, where the first. points to a key in the <code>mapData</code>, and the second points to another. key in the <code>data</code>.</p>. <p>When joinBy is <code>null</code>, the map items are joined by their position in. the array, which performs much better in maps with many data points.. This is the recommended option if you are printing more than a. thousand data points and have a backend that can preprocess the data. into a parallel array of the mapData.</p>
    * @param keys <p>An array specifying which option maps to which key in the data point. array. This makes it convenient to work with unstructured data arrays. from different sources.</p>
    * @param lastPrice <p>The line marks the last price from all points.</p>
    * @param lastVisiblePrice <p>The line marks the last price from visible range of points.</p>
    * @param linkedTo <p>The <a href="#series.id">id</a> of another series to link to. Additionally,. the value can be &quot;:previous&quot; to link to the previous series. When. two series are linked, only the first one appears in the legend.. Toggling the visibility of this also toggles the linked series.</p>. <p>If master series uses data sorting and linked series does not have. its own sorting definition, the linked series will be sorted in the. same order as the master one.</p>
    * @param navigatorOptions <p>Options for the corresponding navigator series if <code>showInNavigator</code>. is <code>true</code> for this series. Available options are the same as any. series, documented at <a href="#plotOptions.series">plotOptions</a> and. <a href="#series">series</a>.</p>. <p>These options are merged with options in <a href="#navigator.series">navigator.series</a>, and will take precedence if the same option is. defined both places.</p>
    * @param opacity <p>Opacity of a series parts: line, fill (e.g. area) and dataLabels.</p>
    * @param pointDescriptionFormatter <p>Same as. <a href="#accessibility.series.descriptionFormatter">accessibility.series.descriptionFormatter</a>,. but for an individual series. Overrides the chart wide configuration.</p>
    * @param pointRange <p>The width of each point on the x axis. For example in a column chart. with one value each day, the pointRange would be 1 day (= 24 * 3600</p>. <ul>. <li>1000 milliseconds). This is normally computed automatically, but. this option can be used to override the automatic value.</li>. </ul>
    * @param relativeXValue <p>When true, X values in the data set are relative to the current. <code>pointStart</code>, <code>pointInterval</code> and <code>pointIntervalUnit</code> settings. This. allows compression of the data for datasets with irregular X values.</p>. <p>The real X values are computed on the formula <code>f(x) = ax + b</code>, where. <code>a</code> is the <code>pointInterval</code> (optionally with a time unit given by. <code>pointIntervalUnit</code>), and <code>b</code> is the <code>pointStart</code>.</p>
    * @param selected <p>Whether to select the series initially. If <code>showCheckbox</code> is true,. the checkbox next to the series name in the legend will be checked. for a selected series.</p>
    * @param showCheckbox <p>If true, a checkbox is displayed next to the legend item to allow. selecting the series. The state of the checkbox is determined by. the <code>selected</code> option.</p>
    * @param showInNavigator <p>Whether or not to show the series in the navigator. Takes precedence. over <a href="#navigator.baseSeries">navigator.baseSeries</a> if defined.</p>
    * @param skipKeyboardNavigation <p>If set to <code>true</code>, the accessibility module will skip past the points. in this series for keyboard navigation.</p>
    * @param visible <p>Set the initial visibility of the series.</p>
    * @param zIndex <p>Define the z index of the series.</p>
    */
  def apply(crisp: js.UndefOr[Boolean] = js.undefined, endAngle: js.UndefOr[js.UndefOr[Double]] = js.undefined, innerSize: js.UndefOr[String | Double] = js.undefined, itemPadding: js.UndefOr[Double] = js.undefined, layout: js.UndefOr[String] = js.undefined, marker: js.UndefOr[CleanJsObject[PlotOptionsItemMarker]] = js.undefined, rows: js.UndefOr[Double] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, startAngle: js.UndefOr[js.UndefOr[Double]] = js.undefined, center: js.UndefOr[js.Array[js.Any]] = js.undefined, clip: js.UndefOr[Boolean] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined, dataLabels: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, ignoreHiddenPoint: js.UndefOr[Boolean] = js.undefined, minSize: js.UndefOr[Double | String] = js.undefined, point: js.UndefOr[js.Any] = js.undefined, size: js.UndefOr[Double | String | Null] = js.undefined, states: js.UndefOr[js.Any] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, tooltip: js.UndefOr[js.Any] = js.undefined, useOhlcData: js.UndefOr[Boolean] = js.undefined, accessibility: js.UndefOr[js.Any] = js.undefined, allAreas: js.UndefOr[Boolean] = js.undefined, allowPointSelect: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, className: js.UndefOr[String] = js.undefined, colorAxis: js.UndefOr[Double | String | Boolean] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, colorKey: js.UndefOr[String] = js.undefined, compare: js.UndefOr[String] = js.undefined, compareBase: js.UndefOr[Double] = js.undefined, compareStart: js.UndefOr[Boolean] = js.undefined, connectors: js.UndefOr[CleanJsObject[PlotOptionsItemConnectors]] = js.undefined, cumulative: js.UndefOr[Boolean] = js.undefined, cursor: js.UndefOr[String] = js.undefined, custom: js.UndefOr[js.Object] = js.undefined, dataGrouping: js.UndefOr[js.Any] = js.undefined, description: js.UndefOr[String] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, gapSize: js.UndefOr[Double] = js.undefined, gapUnit: js.UndefOr[String] = js.undefined, includeInDataExport: js.UndefOr[Boolean] = js.undefined, joinBy: js.UndefOr[String | js.Array[String]] = js.undefined, keys: js.UndefOr[js.Array[String]] = js.undefined, lastPrice: js.UndefOr[js.Any] = js.undefined, lastVisiblePrice: js.UndefOr[js.Any] = js.undefined, linkedTo: js.UndefOr[String] = js.undefined, navigatorOptions: js.UndefOr[js.Any] = js.undefined, opacity: js.UndefOr[Double] = js.undefined, pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined, pointRange: js.UndefOr[Double] = js.undefined, relativeXValue: js.UndefOr[Boolean] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, showCheckbox: js.UndefOr[Boolean] = js.undefined, showInNavigator: js.UndefOr[Boolean] = js.undefined, skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): PlotOptionsItem = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsItem {
      this.crisp = crisp
      this.endAngle = endAngle
      this.innerSize = innerSize
      this.itemPadding = itemPadding
      this.layout = layout
      this.marker = marker
      this.rows = rows
      this.showInLegend = showInLegend
      this.startAngle = startAngle
      this.center = center
      this.clip = clip
      this.color = color
      this.colors = colors
      this.dataLabels = dataLabels
      this.events = events
      this.fillColor = fillColor
      this.ignoreHiddenPoint = ignoreHiddenPoint
      this.minSize = minSize
      this.point = point
      this.size = size
      this.states = states
      this.stickyTracking = stickyTracking
      this.tooltip = tooltip
      this.useOhlcData = useOhlcData
      this.accessibility = accessibility
      this.allAreas = allAreas
      this.allowPointSelect = allowPointSelect
      this.animation = animation
      this.className = className
      this.colorAxis = colorAxis
      this.colorIndex = colorIndex
      this.colorKey = colorKey
      this.compare = compare
      this.compareBase = compareBase
      this.compareStart = compareStart
      this.connectors = connectors
      this.cumulative = cumulative
      this.cursor = cursor
      this.custom = custom
      this.dataGrouping = dataGrouping
      this.description = description
      this.enableMouseTracking = enableMouseTracking
      this.gapSize = gapSize
      this.gapUnit = gapUnit
      this.includeInDataExport = includeInDataExport
      this.joinBy = joinBy
      this.keys = keys
      this.lastPrice = lastPrice
      this.lastVisiblePrice = lastVisiblePrice
      this.linkedTo = linkedTo
      this.navigatorOptions = navigatorOptions
      this.opacity = opacity
      this.pointDescriptionFormatter = pointDescriptionFormatter
      this.pointRange = pointRange
      this.relativeXValue = relativeXValue
      this.selected = selected
      this.showCheckbox = showCheckbox
      this.showInNavigator = showInNavigator
      this.skipKeyboardNavigation = skipKeyboardNavigation
      this.visible = visible
      this.zIndex = zIndex
    })
  }
}
