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
  * @note JavaScript name: <code>series&lt;boxplot&gt;</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBoxplot extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>An array of data points for the series. For the <code>boxplot</code> series
    * type, points can be given in the following ways:</p>
    * <ol>
    * <li><p>An array of arrays with 6 or 5 values. In this case, the values
    * correspond to <code>x,low,q1,median,q3,high</code>. If the first value is a
    * string, it is applied as the name of the point, and the <code>x</code> value
    * is inferred. The <code>x</code> value can also be omitted, in which case the
    * inner arrays should be of length 5. Then the <code>x</code> value is automatically
    * calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code>
    * and <code>pointInterval</code> given in the series options.</p>
    * <pre><code class="language-js">data: [
    *     [0, 3, 0, 10, 3, 5],
    *     [1, 7, 8, 7, 2, 9],
    *     [2, 6, 9, 5, 1, 3]
    * ]</code></pre>
    * </li>
    * <li><p>An array of objects with named values. The following snippet shows only a
    * few settings, see the complete options set below. If the total number of data
    * points exceeds the series&#39; <a href="#series.boxplot.turboThreshold">turboThreshold</a>,
    * this option is not available.</p>
    * <pre><code class="language-js">data: [{
    *     x: 1,
    *     low: 4,
    *     q1: 9,
    *     median: 9,
    *     q3: 1,
    *     high: 10,
    *     name: &quot;Point2&quot;,
    *     color: &quot;#00FF00&quot;
    * }, {
    *     x: 1,
    *     low: 5,
    *     q1: 7,
    *     median: 3,
    *     q3: 6,
    *     high: 2,
    *     name: &quot;Point1&quot;,
    *     color: &quot;#FF00FF&quot;
    * }]</code></pre>
    * </li>
    * </ol>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/">Numerical values</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-arrays/">Arrays of numeric x and y</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-arrays-datetime/">Arrays of datetime x and y</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-name-value/">Arrays of point.name and y</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-objects/">Config objects</a>
    */
  val data: js.UndefOr[js.Array[CleanJsObject[SeriesBoxplotData] | js.Array[js.Any]]] = js.undefined

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
    */
  val legendIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>The name of the series as shown in the legend, tooltip etc.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/name/">Series name</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/category-map/">Series name</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * <p>The type of series, for example <code>line</code> or <code>column</code>. By default, the
    * series type is inherited from <a href="#chart.type">chart.type</a>, so unless the
    * chart is a combination of series types, there is no need to set it on the
    * series level.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/type/">Line and column in the same chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/mapline-mappoint/">Multiple types in the same map</a>
    */
  val `type`: js.UndefOr[String] = "boxplot"

  /**
    * <p>When using dual or multiple x axes, this number defines which xAxis the
    * particular series is connected to. It refers to either the
    * {@link #xAxis.id|axis id}
    * or the index of the axis in the xAxis array, with 0 being the first.</p>
    */
  val xAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>When using dual or multiple y axes, this number defines which yAxis the
    * particular series is connected to. It refers to either the
    * {@link #yAxis.id|axis id}
    * or the index of the axis in the yAxis array, with 0 being the first.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/yaxis/">Apply the column series to the secondary Y axis</a>
    */
  val yAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>Define the visual z index of the series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex-default/">With no z index, the series defined last are on top</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex/">With a z index, the series with the highest z index is on top</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex-default/">With no z index, the series defined last are on top</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex/">With a z index, the series with the highest z index is on top</a>
    */
  val zIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>An array of objects containing a <code>path</code> definition and optionally
    * a code or property to join in the data as per the <code>joinBy</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/category-map/">Map data and joinBy</a>
    */
  val mapData: js.UndefOr[js.Array[js.Object]] = js.undefined

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
  val dragDrop: js.Any = js.undefined

  /**
    * <p>The Y axis value to serve as the base for the columns, for distinguishing
    * between values above and below a threshold. If <code>null</code>, the columns
    * extend from the padding Y axis minimum.</p>
    * @since 2.0
    */
  val threshold: js.Any = js.undefined

  /**
    * <p>A configuration object for the tooltip rendering of each single series.
    * Properties are inherited from <a href="#tooltip">tooltip</a>, but only the
    * following properties can be defined on a series level.</p>
    * @since 2.3
    */
  val tooltip: js.Any = js.undefined

  /**
    * <p>The length of the whiskers, the horizontal lines marking low and
    * high values. It can be a numerical pixel value, or a percentage
    * value of the box width. Set <code>0</code> to disable whiskers.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">True by default</a>
    * @since 3.0
    */
  val whiskerLength: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The fill color of the box.</p>
    * <p>In styled mode, the fill color can be set with the
    * <code>.highcharts-boxplot-box</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a>
    * @since 3.0
    */
  val fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the line surrounding the box. If any of
    * <a href="#plotOptions.boxplot.stemWidth">stemWidth</a>,
    * <a href="#plotOptions.boxplot.medianWidth">medianWidth</a>
    * or <a href="#plotOptions.boxplot.whiskerWidth">whiskerWidth</a> are <code>null</code>,
    * the lineWidth also applies to these lines.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/error-bar-styling/">Error bar styling</a>
    * @since 3.0
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel width of the median line. If <code>null</code>, the
    * <a href="#plotOptions.boxplot.lineWidth">lineWidth</a> is used.</p>
    * <p>In styled mode, the median stroke width can be set with the
    * <code>.highcharts-boxplot-median</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a>
    * @since 3.0
    */
  val medianWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The line width of the whiskers, the horizontal lines marking low and
    * high values. When <code>null</code>, the general
    * <a href="#plotOptions.boxplot.lineWidth">lineWidth</a> applies.</p>
    * <p>In styled mode, the whisker stroke width can be set with the
    * <code>.highcharts-boxplot-whisker</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a>
    * @since 3.0
    */
  val whiskerWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the median line. If <code>null</code>, the general series color
    * applies.</p>
    * <p>In styled mode, the median stroke width can be set with the
    * <code>.highcharts-boxplot-median</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/error-bar-styling/">Error bar styling</a>
    * @since 3.0
    */
  val medianColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the stem, the vertical line extending from the box to
    * the whiskers. If <code>null</code>, the series color is used.</p>
    * <p>In styled mode, the stem stroke can be set with the
    * <code>.highcharts-boxplot-stem</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/error-bar-styling/">Error bar styling</a>
    * @since 3.0
    */
  val stemColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The dash style of the stem, the vertical line extending from the
    * box to the whiskers.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/error-bar-styling/">Error bar styling</a>
    * @since 3.0
    */
  val stemDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>The width of the stem, the vertical line extending from the box to
    * the whiskers. If <code>null</code>, the width is inherited from the
    * <a href="#plotOptions.boxplot.lineWidth">lineWidth</a> option.</p>
    * <p>In styled mode, the stem stroke width can be set with the
    * <code>.highcharts-boxplot-stem</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/error-bar-styling/">Error bar styling</a>
    * @since 3.0
    */
  val stemWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the whiskers, the horizontal lines marking low and high
    * values. When <code>null</code>, the general series color is used.</p>
    * <p>In styled mode, the whisker stroke can be set with the
    * <code>.highcharts-boxplot-whisker</code> class .</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a>
    * @since 3.0
    */
  val whiskerColor: js.UndefOr[String | js.Object] = js.undefined

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
    * <p>Padding between each column or bar, in x axis units.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-default/">0.1 by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-025/">0.25</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-none/">0 for tightly packed columns</a>
    */
  val pointPadding: js.UndefOr[Double] = js.undefined

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
  val pointRange: js.UndefOr[Double | Null] = js.undefined

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
    * <p>A pixel value specifying a fixed width for each column or bar. When
    * <code>null</code>, the width is calculated from the <code>pointPadding</code> and
    * <code>groupPadding</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointwidth-20/">20px wide columns regardless of chart width or the amount of data points</a>
    * @since 1.2.5
    */
  val pointWidth: js.UndefOr[Double] = js.undefined

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
    */
  val dataGrouping: js.Any = js.undefined

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
    * <p>Set the point threshold for when a series should enter boost mode.</p>
    * <p>Setting it to e.g. 2000 will cause the series to enter boost mode when there
    * are 2000 or more points in the series.</p>
    * <p>To disable boosting on the series, set the <code>boostThreshold</code> to 0. Setting it
    * to 1 will force boosting.</p>
    * <p>Requires <code>modules/boost.js</code>.</p>
    */
  val boostThreshold: js.UndefOr[Double] = js.undefined

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
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>General event handlers for the series items. These event hooks can also
    * be attached to the series at run time using the <code>Highcharts.addEvent</code>
    * function.</p>
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
  val pathfinder: js.UndefOr[CleanJsObject[SeriesBoxplotPathfinder]] = js.undefined

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
    * <p>Whether to connect a graph line across null points, or render a gap
    * between the two points on either side of the null.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-connectnulls-false/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-connectnulls-true/">True</a>
    */
  val connectNulls: js.UndefOr[Boolean] = js.undefined

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
    * <p>The line cap used for line ends and line joins on the graph.</p>
    */
  val linecap: js.UndefOr[String] = js.undefined

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
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border width of each map area.</p>
    * <p>In styled mode, the border stroke width is given in the
    * <code>.highcharts-point</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-border/">Borders demo</a>
    */
  val borderWidth: js.Any = js.undefined
}

object SeriesBoxplot {
  /**
    * @param data <p>An array of data points for the series. For the <code>boxplot</code> series. type, points can be given in the following ways:</p>. <ol>. <li><p>An array of arrays with 6 or 5 values. In this case, the values. correspond to <code>x,low,q1,median,q3,high</code>. If the first value is a. string, it is applied as the name of the point, and the <code>x</code> value. is inferred. The <code>x</code> value can also be omitted, in which case the. inner arrays should be of length 5. Then the <code>x</code> value is automatically. calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code>. and <code>pointInterval</code> given in the series options.</p>. <pre><code class="language-js">data: [.     [0, 3, 0, 10, 3, 5],.     [1, 7, 8, 7, 2, 9],.     [2, 6, 9, 5, 1, 3]. ]</code></pre>. </li>. <li><p>An array of objects with named values. The following snippet shows only a. few settings, see the complete options set below. If the total number of data. points exceeds the series&#39; <a href="#series.boxplot.turboThreshold">turboThreshold</a>,. this option is not available.</p>. <pre><code class="language-js">data: [{.     x: 1,.     low: 4,.     q1: 9,.     median: 9,.     q3: 1,.     high: 10,.     name: &quot;Point2&quot;,.     color: &quot;#00FF00&quot;. }, {.     x: 1,.     low: 5,.     q1: 7,.     median: 3,.     q3: 6,.     high: 2,.     name: &quot;Point1&quot;,.     color: &quot;#FF00FF&quot;. }]</code></pre>. </li>. </ol>
    * @param id <p>An id for the series. This can be used after render time to get a pointer. to the series object through <code>chart.get()</code>.</p>
    * @param index <p>The index of the series in the chart, affecting the internal index in the. <code>chart.series</code> array, the visible Z index as well as the order in the. legend.</p>
    * @param legendIndex <p>The sequential index of the series in the legend.</p>
    * @param name <p>The name of the series as shown in the legend, tooltip etc.</p>
    * @param `type` <p>The type of series, for example <code>line</code> or <code>column</code>. By default, the. series type is inherited from <a href="#chart.type">chart.type</a>, so unless the. chart is a combination of series types, there is no need to set it on the. series level.</p>
    * @param xAxis <p>When using dual or multiple x axes, this number defines which xAxis the. particular series is connected to. It refers to either the. {@link #xAxis.id|axis id}. or the index of the axis in the xAxis array, with 0 being the first.</p>
    * @param yAxis <p>When using dual or multiple y axes, this number defines which yAxis the. particular series is connected to. It refers to either the. {@link #yAxis.id|axis id}. or the index of the axis in the yAxis array, with 0 being the first.</p>
    * @param zIndex <p>Define the visual z index of the series.</p>
    * @param mapData <p>An array of objects containing a <code>path</code> definition and optionally. a code or property to join in the data as per the <code>joinBy</code> option.</p>
    * @param dragDrop <p>The draggable-points module allows points to be moved around or modified. in the chart. In addition to the options mentioned under the <code>dragDrop</code>. API structure, the module fires three events,. <a href="plotOptions.series.point.events.dragStart">point.dragStart</a>,. <a href="plotOptions.series.point.events.drag">point.drag</a> and. <a href="plotOptions.series.point.events.drop">point.drop</a>.</p>. <p>It requires the <code>modules/draggable-points.js</code> file to be loaded.</p>
    * @param threshold <p>The Y axis value to serve as the base for the columns, for distinguishing. between values above and below a threshold. If <code>null</code>, the columns. extend from the padding Y axis minimum.</p>
    * @param tooltip <p>A configuration object for the tooltip rendering of each single series.. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the. following properties can be defined on a series level.</p>
    * @param whiskerLength <p>The length of the whiskers, the horizontal lines marking low and. high values. It can be a numerical pixel value, or a percentage. value of the box width. Set <code>0</code> to disable whiskers.</p>
    * @param fillColor <p>The fill color of the box.</p>. <p>In styled mode, the fill color can be set with the. <code>.highcharts-boxplot-box</code> class.</p>
    * @param lineWidth <p>The width of the line surrounding the box. If any of. <a href="#plotOptions.boxplot.stemWidth">stemWidth</a>,. <a href="#plotOptions.boxplot.medianWidth">medianWidth</a>. or <a href="#plotOptions.boxplot.whiskerWidth">whiskerWidth</a> are <code>null</code>,. the lineWidth also applies to these lines.</p>
    * @param medianWidth <p>The pixel width of the median line. If <code>null</code>, the. <a href="#plotOptions.boxplot.lineWidth">lineWidth</a> is used.</p>. <p>In styled mode, the median stroke width can be set with the. <code>.highcharts-boxplot-median</code> class.</p>
    * @param whiskerWidth <p>The line width of the whiskers, the horizontal lines marking low and. high values. When <code>null</code>, the general. <a href="#plotOptions.boxplot.lineWidth">lineWidth</a> applies.</p>. <p>In styled mode, the whisker stroke width can be set with the. <code>.highcharts-boxplot-whisker</code> class.</p>
    * @param medianColor <p>The color of the median line. If <code>null</code>, the general series color. applies.</p>. <p>In styled mode, the median stroke width can be set with the. <code>.highcharts-boxplot-median</code> class.</p>
    * @param stemColor <p>The color of the stem, the vertical line extending from the box to. the whiskers. If <code>null</code>, the series color is used.</p>. <p>In styled mode, the stem stroke can be set with the. <code>.highcharts-boxplot-stem</code> class.</p>
    * @param stemDashStyle <p>The dash style of the stem, the vertical line extending from the. box to the whiskers.</p>
    * @param stemWidth <p>The width of the stem, the vertical line extending from the box to. the whiskers. If <code>null</code>, the width is inherited from the. <a href="#plotOptions.boxplot.lineWidth">lineWidth</a> option.</p>. <p>In styled mode, the stem stroke width can be set with the. <code>.highcharts-boxplot-stem</code> class.</p>
    * @param whiskerColor <p>The color of the whiskers, the horizontal lines marking low and high. values. When <code>null</code>, the general series color is used.</p>. <p>In styled mode, the whisker stroke can be set with the. <code>.highcharts-boxplot-whisker</code> class .</p>
    * @param crisp <p>When true, each column edge is rounded to its nearest pixel in order. to render sharp on screen. In some cases, when there are a lot of. densely packed columns, this leads to visible difference in column. widths or distance between columns. In these cases, setting <code>crisp</code>. to <code>false</code> may look better, even though each column is rendered. blurry.</p>
    * @param groupPadding <p>Padding between each value groups, in x axis units.</p>
    * @param pointPadding <p>Padding between each column or bar, in x axis units.</p>
    * @param minPointLength <p>The minimal height for a column or width for a bar. By default,. 0 values are not shown. To visualize a 0 (or close to zero) point,. set the minimal point length to a pixel value like 3. In stacked. column charts, minPointLength might not be respected for tightly. packed values.</p>
    * @param cropThreshold <p>When the series contains less points than the crop threshold, all. points are drawn, event if the points fall outside the visible plot. area at the current zoom. The advantage of drawing all points (including. markers and columns), is that animation is performed on updates.. On the other hand, when the series contains more points than the. crop threshold, the series data is cropped to only contain points. that fall within the plot area. The advantage of cropping away invisible. points is to increase performance on large series.</p>
    * @param pointRange <p>The X axis range that each point is valid for. This determines the. width of the column. On a categorized axis, the range will be 1. by default (one category unit). On linear and datetime axes, the. range will be computed as the distance between the two closest data. points.</p>. <p>The default <code>null</code> means it is computed automatically, but this option. can be used to override the automatic value.</p>
    * @param dataLabels <p>Options for the series data labels, appearing next to each data point.</p>. <p>Since v6.2.0, multiple data labels can be applied to each single point by. defining them as an array of configs.</p>. <p>In styled mode, the data labels can be styled with the. <code>.highcharts-data-label-box</code> and <code>.highcharts-data-label</code> class names. (<a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels">see example</a>).</p>
    * @param softThreshold <p>When this is true, the series will not cause the Y axis to cross. the zero plane (or <a href="#plotOptions.series.threshold">threshold</a> option). unless the data actually crosses the plane.</p>. <p>For example, if <code>softThreshold</code> is <code>false</code>, a series of 0, 1, 2,. 3 will make the Y axis show negative values according to the <code>minPadding</code>. option. If <code>softThreshold</code> is <code>true</code>, the Y axis starts at 0.</p>
    * @param stickyTracking <p>Sticky tracking of mouse events. When true, the <code>mouseOut</code> event. on a series isn&#39;t triggered until the mouse moves over another series,. or out of the plot area. When false, the <code>mouseOut</code> event on a. series is triggered when the mouse leaves the area around the series&#39;. graph or markers. This also implies the tooltip when not shared. When. <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the tooltip will. be hidden when moving the mouse between series. Defaults to true for line. and area type series, but to false for columns, pies etc.</p>
    * @param colorByPoint <p>When using automatic point colors pulled from the global <a href="colors">colors</a>. or series-specific <a href="series.colors">plotOptions.column.colors</a>. collections, this option determines whether the chart should receive. one color per series or one color per point.</p>. <p>In styled mode, the <code>colors</code> or <code>series.colors</code> arrays are not supported,. and instead this option gives the points individual color class names on. the form <code>highcharts-color-{n}</code>.</p>
    * @param colors <p>A series specific or series type specific color set to apply instead. of the global <a href="#colors">colors</a> when <a href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.</p>
    * @param grouping <p>Whether to group non-stacked columns or to let them render independent. of each other. Non-grouped columns will be laid out individually. and overlap each other.</p>
    * @param maxPointWidth <p>The maximum allowed pixel width for a column, translated to the height. of a bar in a bar chart. This prevents the columns from becoming. too wide when there is a small number of points in the chart.</p>
    * @param pointWidth <p>A pixel value specifying a fixed width for each column or bar. When. <code>null</code>, the width is calculated from the <code>pointPadding</code> and. <code>groupPadding</code>.</p>
    * @param dataGrouping <p>Data grouping is the concept of sampling the data values into larger. blocks in order to ease readability and increase performance of the. JavaScript charts. Highstock by default applies data grouping when. the points become closer than a certain pixel value, determined by. the <code>groupPixelWidth</code> option.</p>. <p>If data grouping is applied, the grouping information of grouped. points can be read from the <a href="/class-reference/Highcharts.Point#.dataGroup">Point.dataGroup</a>. If point options other than. the data itself are set, for example <code>name</code> or <code>color</code> or custom properties,. the grouping logic doesn&#39;t know how to group it. In this case the options of. the first point instance are copied over to the group point. This can be. altered through a custom <code>approximation</code> callback function.</p>
    * @param depth <p>Depth of the columns in a 3D column chart. Requires <code>highcharts-3d.js</code>.</p>
    * @param edgeColor <p>3D columns only. The color of the edges. Similar to <code>borderColor</code>,.  except it defaults to the same color as the column.</p>
    * @param edgeWidth <p>3D columns only. The width of the colored edges.</p>
    * @param boostThreshold <p>Set the point threshold for when a series should enter boost mode.</p>. <p>Setting it to e.g. 2000 will cause the series to enter boost mode when there. are 2000 or more points in the series.</p>. <p>To disable boosting on the series, set the <code>boostThreshold</code> to 0. Setting it. to 1 will force boosting.</p>. <p>Requires <code>modules/boost.js</code>.</p>
    * @param point <p>Properties for each single point.</p>
    * @param label <p>Series labels are placed as close to the series as possible in a. natural way, seeking to avoid other series. The goal of this. feature is to make the chart more easily readable, like if a. human designer placed the labels in the optimal position.</p>. <p>The series labels currently work with series types having a. <code>graph</code> or an <code>area</code>.</p>. <p>Requires the <code>series-label.js</code> module.</p>
    * @param allowPointSelect <p>Allow this series&#39; points to be selected by clicking on the graphic. (columns, point markers, pie slices, map areas etc).</p>
    * @param showCheckbox <p>If true, a checkbox is displayed next to the legend item to allow. selecting the series. The state of the checkbox is determined by. the <code>selected</code> option.</p>
    * @param animation <p>Enable or disable the initial animation when a series is displayed.. The animation can also be set as a configuration object. Please. note that this option only applies to the initial animation of the. series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods. The. following properties are supported:</p>. <dl>. . <dt>duration</dt>. . <dd>The duration of the animation in milliseconds.</dd>. . <dt>easing</dt>. . <dd>Can be a string reference to an easing function set on the `Math`. object or a function. See the _Custom easing function_ demo below.</dd>. . </dl>. . <p>Due to poor performance, animation is disabled in old IE browsers. for several chart types.</p>
    * @param events <p>General event handlers for the series items. These event hooks can also. be attached to the series at run time using the <code>Highcharts.addEvent</code>. function.</p>
    * @param turboThreshold <p>When a series contains a data array that is longer than this, only. one dimensional arrays of numbers, or two dimensional arrays with. x and y values are allowed. Also, only the first point is tested,. and the rest are assumed to be the same format. This saves expensive. data checking and indexing in long series. Set it to <code>0</code> disable.</p>
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
    * @param visible <p>Set the initial visibility of the series.</p>
    * @param zoneAxis <p>Defines the Axis on which the zones are applied.</p>
    * @param zones <p>An array defining zones within a series. Zones can be applied to. the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code>. option. The zone definitions have to be in ascending order regarding to. the value.</p>. <p>In styled mode, the color zones are styled with the. <code>.highcharts-zone-{n}</code> class, or custom classed from the <code>className</code>. option. (<a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">view live demo</a>).</p>
    * @param compare <p>Compare the values of the series against the first non-null, non-. zero value in the visible range. The y axis will show percentage. or absolute change depending on whether <code>compare</code> is set to <code>&quot;percent&quot;</code>. or <code>&quot;value&quot;</code>. When this is applied to multiple series, it allows. comparing the development of the series against each other. Adds. a <code>change</code> field to every point object.</p>
    * @param compareStart <p>Defines if comparison should start from the first point within the visible. range or should start from the first point <b>before</b> the range.. In other words, this flag determines if first point within the visible range. will have 0% (<code>compareStart=true</code>) or should have been already calculated. according to the previous point (<code>compareStart=false</code>).</p>
    * @param compareBase <p>When <a href="#plotOptions.series.compare">compare</a> is <code>percent</code>, this option. dictates whether to use 0 or 100 as the base of comparison.</p>
    * @param allAreas <p>Whether all areas of the map defined in <code>mapData</code> should be rendered.. If <code>true</code>, areas which don&#39;t correspond to a data point, are rendered. as <code>null</code> points. If <code>false</code>, those areas are skipped.</p>
    * @param colorAxis <p>Set this option to <code>false</code> to prevent a series from connecting to. the global color axis. This will cause the series to have its own. legend item.</p>
    * @param joinBy <p>What property to join the <code>mapData</code> to the value data. For example,. if joinBy is &quot;code&quot;, the mapData items with a specific code is merged. into the data with the same code. For maps loaded from GeoJSON, the. keys may be held in each point&#39;s <code>properties</code> object.</p>. <p>The joinBy option can also be an array of two values, where the first. points to a key in the <code>mapData</code>, and the second points to another. key in the <code>data</code>.</p>. <p>When joinBy is <code>null</code>, the map items are joined by their position. in the array, which performs much better in maps with many data points.. This is the recommended option if you are printing more than a thousand. data points and have a backend that can preprocess the data into. a parallel array of the mapData.</p>
    * @param pathfinder <p>Override Pathfinder options for a series. Requires Highcharts Gantt or the. Pathfinder module.</p>
    * @param gapSize <p>Defines when to display a gap in the graph, together with the. <a href="plotOptions.series.gapUnit">gapUnit</a> option.</p>. <p>In case when <code>dataGrouping</code> is enabled, points can be grouped into a. larger time span. This can make the grouped points to have a greater. distance than the absolute value of <code>gapSize</code> property, which will result. in disappearing graph completely. To prevent this situation the mentioned. distance between grouped points is used instead of previously defined. <code>gapSize</code>.</p>. <p>In practice, this option is most often used to visualize gaps in. time series. In a stock chart, intraday data is available for daytime. hours, while gaps will appear in nights and weekends.</p>
    * @param gapUnit <p>Together with <a href="plotOptions.series.gapSize">gapSize</a>, this option defines. where to draw gaps in the graph.</p>. <p>When the <code>gapUnit</code> is <code>relative</code> (default), a gap size of 5 means. that if the distance between two points is greater than five times. that of the two closest points, the graph will be broken.</p>. <p>When the <code>gapUnit</code> is <code>value</code>, the gap is based on absolute axis values,. which on a datetime axis is milliseconds. This also applies to the. navigator series that inherits gap options from the base series.</p>
    * @param connectNulls <p>Whether to connect a graph line across null points, or render a gap. between the two points on either side of the null.</p>
    * @param dashStyle <p>A name for the dash style to use for the graph, or for some series types. the outline of each shape.</p>. <p>In styled mode, the [stroke dash-array](<a href="https://jsfiddle.net/gh/get/">https://jsfiddle.net/gh/get/</a>. library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/. series-dashstyle/) can be set with the same classes as listed under. <a href="#plotOptions.series.color">series.color</a>.</p>
    * @param linecap <p>The line cap used for line ends and line joins on the graph.</p>
    * @param step <p>Whether to apply steps to the line. Possible values are <code>left</code>, <code>center</code>. and <code>right</code>.</p>
    * @param connectEnds <p>Polar charts only. Whether to connect the ends of a line series. plot across the extremes.</p>
    * @param borderColor <p>The border color of the map areas.</p>. <p>In styled mode, the border stroke is given in the <code>.highcharts-point</code>. class.</p>
    * @param borderWidth <p>The border width of each map area.</p>. <p>In styled mode, the border stroke width is given in the. <code>.highcharts-point</code> class.</p>
    */
  def apply(data: js.UndefOr[js.Array[CleanJsObject[SeriesBoxplotData] | js.Array[js.Any]]] = js.undefined, id: js.UndefOr[String] = js.undefined, index: js.UndefOr[Double] = js.undefined, legendIndex: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, `type`: js.UndefOr[String] = "boxplot", xAxis: js.UndefOr[Double | String] = js.undefined, yAxis: js.UndefOr[Double | String] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, mapData: js.UndefOr[js.Array[js.Object]] = js.undefined, dragDrop: js.UndefOr[js.Any] = js.undefined, threshold: js.UndefOr[js.Any] = js.undefined, tooltip: js.UndefOr[js.Any] = js.undefined, whiskerLength: js.UndefOr[Double | String] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, medianWidth: js.UndefOr[Double] = js.undefined, whiskerWidth: js.UndefOr[Double] = js.undefined, medianColor: js.UndefOr[String | js.Object] = js.undefined, stemColor: js.UndefOr[String | js.Object] = js.undefined, stemDashStyle: js.UndefOr[String] = js.undefined, stemWidth: js.UndefOr[Double] = js.undefined, whiskerColor: js.UndefOr[String | js.Object] = js.undefined, crisp: js.UndefOr[Boolean] = js.undefined, groupPadding: js.UndefOr[Double] = js.undefined, pointPadding: js.UndefOr[Double] = js.undefined, minPointLength: js.UndefOr[Double] = js.undefined, cropThreshold: js.UndefOr[Double] = js.undefined, pointRange: js.UndefOr[Double | Null] = js.undefined, dataLabels: js.UndefOr[js.Any] = js.undefined, softThreshold: js.UndefOr[Boolean] = js.undefined, stickyTracking: js.UndefOr[Boolean] = js.undefined, colorByPoint: js.UndefOr[Boolean] = js.undefined, colors: js.UndefOr[js.Array[String | js.Object]] = js.undefined, grouping: js.UndefOr[Boolean] = js.undefined, maxPointWidth: js.UndefOr[Double] = js.undefined, pointWidth: js.UndefOr[Double] = js.undefined, dataGrouping: js.UndefOr[js.Any] = js.undefined, depth: js.UndefOr[Double] = js.undefined, edgeColor: js.UndefOr[String | js.Object] = js.undefined, edgeWidth: js.UndefOr[Double] = js.undefined, boostThreshold: js.UndefOr[Double] = js.undefined, point: js.UndefOr[js.Any] = js.undefined, label: js.UndefOr[js.Any] = js.undefined, allowPointSelect: js.UndefOr[Boolean] = js.undefined, showCheckbox: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, turboThreshold: js.UndefOr[Double] = js.undefined, findNearestPointBy: js.UndefOr[String] = js.undefined, animationLimit: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, clip: js.UndefOr[Boolean] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, cursor: js.UndefOr[String] = js.undefined, description: js.UndefOr[String] = js.undefined, enableMouseTracking: js.UndefOr[Boolean] = js.undefined, exposeElementToA11y: js.UndefOr[Boolean] = js.undefined, getExtremesFromAll: js.UndefOr[Boolean] = js.undefined, keys: js.UndefOr[js.Array[String]] = js.undefined, linkedTo: js.UndefOr[String] = js.undefined, navigatorOptions: js.UndefOr[js.Any] = js.undefined, negativeColor: js.UndefOr[String | js.Object] = js.undefined, pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined, pointInterval: js.UndefOr[Double] = js.undefined, pointIntervalUnit: js.UndefOr[String] = js.undefined, pointPlacement: js.UndefOr[String | Double] = js.undefined, pointStart: js.UndefOr[Double] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean] = js.undefined, showInLegend: js.UndefOr[Boolean] = js.undefined, showInNavigator: js.UndefOr[Boolean] = js.undefined, skipKeyboardNavigation: js.UndefOr[Boolean] = js.undefined, visible: js.UndefOr[Boolean] = js.undefined, zoneAxis: js.UndefOr[String] = js.undefined, zones: js.UndefOr[js.Array[js.Any]] = js.undefined, compare: js.UndefOr[String] = js.undefined, compareStart: js.UndefOr[Boolean] = js.undefined, compareBase: js.UndefOr[Double] = js.undefined, allAreas: js.UndefOr[Boolean] = js.undefined, colorAxis: js.UndefOr[Boolean] = js.undefined, joinBy: js.UndefOr[String | js.Array[String]] = js.undefined, pathfinder: js.UndefOr[CleanJsObject[SeriesBoxplotPathfinder]] = js.undefined, gapSize: js.UndefOr[Double] = js.undefined, gapUnit: js.UndefOr[String] = js.undefined, connectNulls: js.UndefOr[Boolean] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, linecap: js.UndefOr[String] = js.undefined, step: js.UndefOr[String] = js.undefined, connectEnds: js.UndefOr[Boolean] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[js.Any] = js.undefined): SeriesBoxplot = {
    val dataOuter: js.UndefOr[js.Array[CleanJsObject[SeriesBoxplotData] | js.Array[js.Any]]] = data
    val idOuter: js.UndefOr[String] = id
    val indexOuter: js.UndefOr[Double] = index
    val legendIndexOuter: js.UndefOr[Double] = legendIndex
    val nameOuter: js.UndefOr[String] = name
    val typeOuter: js.UndefOr[String] = `type`
    val xAxisOuter: js.UndefOr[Double | String] = xAxis
    val yAxisOuter: js.UndefOr[Double | String] = yAxis
    val zIndexOuter: js.UndefOr[Double] = zIndex
    val mapDataOuter: js.UndefOr[js.Array[js.Object]] = mapData
    val dragDropOuter: js.Any = dragDrop
    val thresholdOuter: js.Any = threshold
    val tooltipOuter: js.Any = tooltip
    val whiskerLengthOuter: js.UndefOr[Double | String] = whiskerLength
    val fillColorOuter: js.UndefOr[String | js.Object] = fillColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val medianWidthOuter: js.UndefOr[Double] = medianWidth
    val whiskerWidthOuter: js.UndefOr[Double] = whiskerWidth
    val medianColorOuter: js.UndefOr[String | js.Object] = medianColor
    val stemColorOuter: js.UndefOr[String | js.Object] = stemColor
    val stemDashStyleOuter: js.UndefOr[String] = stemDashStyle
    val stemWidthOuter: js.UndefOr[Double] = stemWidth
    val whiskerColorOuter: js.UndefOr[String | js.Object] = whiskerColor
    val crispOuter: js.UndefOr[Boolean] = crisp
    val groupPaddingOuter: js.UndefOr[Double] = groupPadding
    val pointPaddingOuter: js.UndefOr[Double] = pointPadding
    val minPointLengthOuter: js.UndefOr[Double] = minPointLength
    val cropThresholdOuter: js.UndefOr[Double] = cropThreshold
    val pointRangeOuter: js.UndefOr[Double | Null] = pointRange
    val dataLabelsOuter: js.Any = dataLabels
    val softThresholdOuter: js.UndefOr[Boolean] = softThreshold
    val stickyTrackingOuter: js.UndefOr[Boolean] = stickyTracking
    val colorByPointOuter: js.UndefOr[Boolean] = colorByPoint
    val colorsOuter: js.UndefOr[js.Array[String | js.Object]] = colors
    val groupingOuter: js.UndefOr[Boolean] = grouping
    val maxPointWidthOuter: js.UndefOr[Double] = maxPointWidth
    val pointWidthOuter: js.UndefOr[Double] = pointWidth
    val dataGroupingOuter: js.Any = dataGrouping
    val depthOuter: js.UndefOr[Double] = depth
    val edgeColorOuter: js.UndefOr[String | js.Object] = edgeColor
    val edgeWidthOuter: js.UndefOr[Double] = edgeWidth
    val boostThresholdOuter: js.UndefOr[Double] = boostThreshold
    val pointOuter: js.Any = point
    val labelOuter: js.Any = label
    val allowPointSelectOuter: js.UndefOr[Boolean] = allowPointSelect
    val showCheckboxOuter: js.UndefOr[Boolean] = showCheckbox
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    val eventsOuter: js.Any = events
    val turboThresholdOuter: js.UndefOr[Double] = turboThreshold
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
    val visibleOuter: js.UndefOr[Boolean] = visible
    val zoneAxisOuter: js.UndefOr[String] = zoneAxis
    val zonesOuter: js.UndefOr[js.Array[js.Any]] = zones
    val compareOuter: js.UndefOr[String] = compare
    val compareStartOuter: js.UndefOr[Boolean] = compareStart
    val compareBaseOuter: js.UndefOr[Double] = compareBase
    val allAreasOuter: js.UndefOr[Boolean] = allAreas
    val colorAxisOuter: js.UndefOr[Boolean] = colorAxis
    val joinByOuter: js.UndefOr[String | js.Array[String]] = joinBy
    val pathfinderOuter: js.UndefOr[CleanJsObject[SeriesBoxplotPathfinder]] = pathfinder
    val gapSizeOuter: js.UndefOr[Double] = gapSize
    val gapUnitOuter: js.UndefOr[String] = gapUnit
    val connectNullsOuter: js.UndefOr[Boolean] = connectNulls
    val dashStyleOuter: js.UndefOr[String] = dashStyle
    val linecapOuter: js.UndefOr[String] = linecap
    val stepOuter: js.UndefOr[String] = step
    val connectEndsOuter: js.UndefOr[Boolean] = connectEnds
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.Any = borderWidth
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBoxplot {
      override val data: js.UndefOr[js.Array[CleanJsObject[SeriesBoxplotData] | js.Array[js.Any]]] = dataOuter
      override val id: js.UndefOr[String] = idOuter
      override val index: js.UndefOr[Double] = indexOuter
      override val legendIndex: js.UndefOr[Double] = legendIndexOuter
      override val name: js.UndefOr[String] = nameOuter
      override val `type`: js.UndefOr[String] = typeOuter
      override val xAxis: js.UndefOr[Double | String] = xAxisOuter
      override val yAxis: js.UndefOr[Double | String] = yAxisOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
      override val mapData: js.UndefOr[js.Array[js.Object]] = mapDataOuter
      override val dragDrop: js.Any = dragDropOuter
      override val threshold: js.Any = thresholdOuter
      override val tooltip: js.Any = tooltipOuter
      override val whiskerLength: js.UndefOr[Double | String] = whiskerLengthOuter
      override val fillColor: js.UndefOr[String | js.Object] = fillColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val medianWidth: js.UndefOr[Double] = medianWidthOuter
      override val whiskerWidth: js.UndefOr[Double] = whiskerWidthOuter
      override val medianColor: js.UndefOr[String | js.Object] = medianColorOuter
      override val stemColor: js.UndefOr[String | js.Object] = stemColorOuter
      override val stemDashStyle: js.UndefOr[String] = stemDashStyleOuter
      override val stemWidth: js.UndefOr[Double] = stemWidthOuter
      override val whiskerColor: js.UndefOr[String | js.Object] = whiskerColorOuter
      override val crisp: js.UndefOr[Boolean] = crispOuter
      override val groupPadding: js.UndefOr[Double] = groupPaddingOuter
      override val pointPadding: js.UndefOr[Double] = pointPaddingOuter
      override val minPointLength: js.UndefOr[Double] = minPointLengthOuter
      override val cropThreshold: js.UndefOr[Double] = cropThresholdOuter
      override val pointRange: js.UndefOr[Double | Null] = pointRangeOuter
      override val dataLabels: js.Any = dataLabelsOuter
      override val softThreshold: js.UndefOr[Boolean] = softThresholdOuter
      override val stickyTracking: js.UndefOr[Boolean] = stickyTrackingOuter
      override val colorByPoint: js.UndefOr[Boolean] = colorByPointOuter
      override val colors: js.UndefOr[js.Array[String | js.Object]] = colorsOuter
      override val grouping: js.UndefOr[Boolean] = groupingOuter
      override val maxPointWidth: js.UndefOr[Double] = maxPointWidthOuter
      override val pointWidth: js.UndefOr[Double] = pointWidthOuter
      override val dataGrouping: js.Any = dataGroupingOuter
      override val depth: js.UndefOr[Double] = depthOuter
      override val edgeColor: js.UndefOr[String | js.Object] = edgeColorOuter
      override val edgeWidth: js.UndefOr[Double] = edgeWidthOuter
      override val boostThreshold: js.UndefOr[Double] = boostThresholdOuter
      override val point: js.Any = pointOuter
      override val label: js.Any = labelOuter
      override val allowPointSelect: js.UndefOr[Boolean] = allowPointSelectOuter
      override val showCheckbox: js.UndefOr[Boolean] = showCheckboxOuter
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
      override val events: js.Any = eventsOuter
      override val turboThreshold: js.UndefOr[Double] = turboThresholdOuter
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
      override val visible: js.UndefOr[Boolean] = visibleOuter
      override val zoneAxis: js.UndefOr[String] = zoneAxisOuter
      override val zones: js.UndefOr[js.Array[js.Any]] = zonesOuter
      override val compare: js.UndefOr[String] = compareOuter
      override val compareStart: js.UndefOr[Boolean] = compareStartOuter
      override val compareBase: js.UndefOr[Double] = compareBaseOuter
      override val allAreas: js.UndefOr[Boolean] = allAreasOuter
      override val colorAxis: js.UndefOr[Boolean] = colorAxisOuter
      override val joinBy: js.UndefOr[String | js.Array[String]] = joinByOuter
      override val pathfinder: js.UndefOr[CleanJsObject[SeriesBoxplotPathfinder]] = pathfinderOuter
      override val gapSize: js.UndefOr[Double] = gapSizeOuter
      override val gapUnit: js.UndefOr[String] = gapUnitOuter
      override val connectNulls: js.UndefOr[Boolean] = connectNullsOuter
      override val dashStyle: js.UndefOr[String] = dashStyleOuter
      override val linecap: js.UndefOr[String] = linecapOuter
      override val step: js.UndefOr[String] = stepOuter
      override val connectEnds: js.UndefOr[Boolean] = connectEndsOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.Any = borderWidthOuter
    })
  }
}
