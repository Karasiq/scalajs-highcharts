/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart</code>
  */
class Chart extends com.highcharts.HighchartsGenericObject {

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
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/alignticks-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/alignticks-false/">False</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/alignticks-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/alignticks-false/">False</a>
    */
  var alignTicks: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Set the overall animation for all chart updating. Animation can be
    * disabled throughout the chart by setting it to false here. It can
    * be overridden for each individual API method as a function parameter.
    * The only animation not affected by this option is the initial series
    * animation, see <a href="#plotOptions.series.animation">plotOptions.series.animation</a>.</p>
    * <p>The animation can either be set as a boolean or a configuration
    * object. If <code>true</code>, it will use the &#39;swing&#39; jQuery easing and a
    * duration of 500 ms. If used as a configuration object, the following
    * properties are supported:</p>
    * <ul>
    * <li><p><code>defer</code>: The animation delay time in milliseconds.</p>
    * </li>
    * <li><p><code>duration</code>: The duration of the animation in milliseconds.</p>
    * </li>
    * <li><p><code>easing</code>: A string reference to an easing function set on the
    * <code>Math</code> object. See
    * <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</p>
    * </li>
    * </ul>
    * <p>When zooming on a series with less than 100 points, the chart redraw
    * will be done with animation, but in case of more data points, it is
    * necessary to set this option to ensure animation on zoom.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/animation-none/">Updating with no animation</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/animation-duration/">With a longer duration</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/animation-easing/">With a jQuery UI easing</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/animation-none/">Updating with no animation</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/animation-duration/">With a longer duration</a>
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>The background color or gradient for the outer chart area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/backgroundcolor-color/">Color</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/backgroundcolor-gradient/">Gradient</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/backgroundcolor-color/">Color</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/backgroundcolor-gradient/">Gradient</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/backgroundcolor-color/">Color</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/backgroundcolor-gradient/">Gradient</a>
    */
  var backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the outer chart border.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/bordercolor/">Brown border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/border/">Brown border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/border/">Border options</a>
    */
  var borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The corner radius of the outer chart border.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/borderradius/">20px radius</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/border/">10px radius</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/border/">Border options</a>
    */
  var borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel width of the outer chart border.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/borderwidth/">5px border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/border/">2px border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/border/">Border options</a>
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>A CSS class name to apply to the charts container <code>div</code>, allowing
    * unique CSS styling for each chart.</p>
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>In styled mode, this sets how many colors the class names
    * should rotate between. With ten colors, series (or points) are
    * given class names like <code>highcharts-color-0</code>, <code>highcharts-color-0</code>
    * [...] <code>highcharts-color-9</code>. The equivalent in non-styled mode
    * is to set colors using the <a href="#colors">colors</a> setting.</p>
    * @since 5.0.0
    */
  var colorCount: js.UndefOr[Double] = js.undefined

  /**
    * <p>Alias of <code>type</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/defaultseriestype/">Bar</a>
    */
  var defaultSeriesType: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to display errors on the chart. When <code>false</code>, the errors will
    * be shown only in the console.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/display-errors/">Show errors on chart</a>
    * @since 7.0.0
    */
  var displayErrors: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Event listeners for the chart.</p>
    */
  var events: js.Any = js.undefined

  /**
    * <p>An explicit height for the chart. If a <em>number</em>, the height is
    * given in pixels. If given a <em>percentage string</em> (for example
    * <code>&#39;56%&#39;</code>), the height is given as the percentage of the actual chart
    * width. This allows for preserving the aspect ratio across responsive
    * sizes.</p>
    * <p>By default (when <code>null</code>) the height is calculated from the offset
    * height of the containing element, or 400 pixels if the containing
    * element&#39;s height is 0.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/height/">500px height</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/height/">300px height</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/size/">Chart with explicit size</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/height-percent/">Highcharts with percentage height</a>
    */
  var height: js.UndefOr[Null | Double | String] = js.undefined

  /**
    * <p>If true, the axes will scale to the remaining visible series once
    * one series is hidden. If false, hiding and showing a series will
    * not affect the axes or the other series. For stacks, once one series
    * within the stack is hidden, the rest of the stack will close in
    * around it even if the axis is not affected.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/ignorehiddenseries-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/ignorehiddenseries-false/">False</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/ignorehiddenseries-true-stacked/">True with stack</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/ignorehiddenseries-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/ignorehiddenseries-false/">False</a>
    * @since 1.2.0
    */
  var ignoreHiddenSeries: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to invert the axes so that the x axis is vertical and y axis
    * is horizontal. When <code>true</code>, the x axis is <a href="#xAxis.reversed">reversed</a>
    * by default.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/inverted/">Inverted line</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/inverted/">Inverted stock chart</a>
    */
  var inverted: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Default <code>mapData</code> for all series. If set to a string, it functions
    * as an index into the <code>Highcharts.maps</code> array. Otherwise it is
    * interpreted as map data.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/geojson">Loading geoJSON data</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/topojson">Loading topoJSON converted to geoJSON</a>
    * @since 5.0.0
    */
  var map: js.UndefOr[String | js.Array[js.Any] | js.Object] = js.undefined

  /**
    * <p>Set lat/lon transformation definitions for the chart. If not defined,
    * these are extracted from the map data.</p>
    * @since 5.0.0
    */
  var mapTransforms: js.Any = js.undefined

  /**
    * <p>The margin between the outer edge of the chart and the plot area.
    * The numbers in the array designate top, right, bottom and left
    * respectively. Use the options <code>marginTop</code>, <code>marginRight</code>,
    * <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of one option.</p>
    * <p>By default there is no margin. The actual space is dynamically
    * calculated from the offset of axis labels, axis title, title,
    * subtitle and legend in addition to the <code>spacingTop</code>, <code>spacingRight</code>,
    * <code>spacingBottom</code> and <code>spacingLeft</code> options.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/margins-zero/">Zero margins</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/margin-zero/">Zero margins</a>
    */
  var margin: js.UndefOr[Double | js.Array[Double]] = js.undefined

  /**
    * <p>The margin between the bottom outer edge of the chart and the plot
    * area. Use this to set a fixed pixel value for the margin as opposed
    * to the default dynamic margin. See also <code>spacingBottom</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/marginbottom/">100px bottom margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/marginbottom/">100px bottom margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/margin/">100px margins</a>
    * @since 2.0.0
    */
  var marginBottom: js.UndefOr[Double] = js.undefined

  /**
    * <p>The margin between the left outer edge of the chart and the plot
    * area. Use this to set a fixed pixel value for the margin as opposed
    * to the default dynamic margin. See also <code>spacingLeft</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/marginleft/">150px left margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/marginleft/">150px left margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/margin/">100px margins</a>
    * @since 2.0.0
    */
  var marginLeft: js.UndefOr[Double] = js.undefined

  /**
    * <p>The margin between the right outer edge of the chart and the plot
    * area. Use this to set a fixed pixel value for the margin as opposed
    * to the default dynamic margin. See also <code>spacingRight</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/marginright/">100px right margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/marginright/">100px right margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/margin/">100px margins</a>
    * @since 2.0.0
    */
  var marginRight: js.UndefOr[Double] = js.undefined

  /**
    * <p>The margin between the top outer edge of the chart and the plot area.
    * Use this to set a fixed pixel value for the margin as opposed to
    * the default dynamic margin. See also <code>spacingTop</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/margintop/">100px top margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/margintop/">100px top margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/margin/">100px margins</a>
    * @since 2.0.0
    */
  var marginTop: js.UndefOr[Double] = js.undefined

  /**
    * <p>Callback function to override the default function that formats all
    * the numbers in the chart. Returns a string with the formatted number.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/members/highcharts-numberformat">Arabic digits in Highcharts</a>
    * @since 8.0.0
    */
  var numberFormatter: js.Any = js.undefined

  /**
    * <p>Options to render charts in 3 dimensions. This feature requires
    * <code>highcharts-3d.js</code>, found in the download package or online at
    * <a href="https://code.highcharts.com/highcharts-3d.js">code.highcharts.com/highcharts-3d.js</a>.</p>
    * @since 4.0.0
    */
  var options3d: js.Any = js.undefined

  /**
    * <p>Allows setting a key to switch between zooming and panning. Can be
    * one of <code>alt</code>, <code>ctrl</code>, <code>meta</code> (the command key on Mac and Windows
    * key on Windows) or <code>shift</code>. The keys are mapped directly to the key
    * properties of the click event argument (<code>event.altKey</code>,
    * <code>event.ctrlKey</code>, <code>event.metaKey</code> and <code>event.shiftKey</code>).</p>
    * @since 4.0.3
    */
  var panKey: js.UndefOr[String] = js.undefined

  /**
    * <p>Allow panning in a chart. Best used with <a href="#chart.panKey">panKey</a>
    * to combine zooming and panning.</p>
    * <p>On touch devices, when the <a href="#tooltip.followTouchMove">tooltip.followTouchMove</a> option is <code>true</code> (default), panning
    * requires two fingers. To allow panning with one finger, set
    * <code>followTouchMove</code> to <code>false</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/pankey/">Zooming and panning</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/panning/">Zooming and xy panning</a>
    */
  var panning: js.Any = js.undefined

  /**
    * <p>Common options for all yAxes rendered in a parallel coordinates plot.
    * This feature requires <code>modules/parallel-coordinates.js</code>.</p>
    * <p>The default options are:</p>
    * <pre><code class="language-js">parallelAxes: {
    *    lineWidth: 1,       // classic mode only
    *    gridlinesWidth: 0,  // classic mode only
    *    title: {
    *        text: &#39;&#39;,
    *        reserveSpace: false
    *    },
    *    labels: {
    *        x: 0,
    *        y: 0,
    *        align: &#39;center&#39;,
    *        reserveSpace: false
    *    },
    *    offset: 0
    * }
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/parallel-coordinates/parallelaxes/">Set the same tickAmount for all yAxes</a>
    * @since 6.0.0
    */
  var parallelAxes: js.UndefOr[CleanJsObject[ChartParallelAxes]] = js.undefined

  /**
    * <p>Flag to render charts as a parallel coordinates plot. In a parallel
    * coordinates plot (||-coords) by default all required yAxes are generated
    * and the legend is disabled. This feature requires
    * <code>modules/parallel-coordinates.js</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples//highcharts/demo/parallel-coordinates/">Parallel coordinates demo</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/parallel-coordinates/polar/">Star plot, multivariate data in a polar chart</a>
    * @since 6.0.0
    */
  var parallelCoordinates: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Equivalent to <a href="#chart.zoomType">zoomType</a>, but for multitouch
    * gestures only. By default, the <code>pinchType</code> is the same as the
    * <code>zoomType</code> setting. However, pinching can be enabled separately in
    * some cases, for example in stock charts where a mouse drag pans the
    * chart, while pinching is enabled. When <a href="#tooltip.followTouchMove">tooltip.followTouchMove</a> is true, pinchType only applies to
    * two-finger touches.</p>
    * @since 3.0.0
    */
  var pinchType: js.UndefOr[String] = js.undefined

  /**
    * <p>The background color or gradient for the plot area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbackgroundcolor-color/">Color</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbackgroundcolor-gradient/">Gradient</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/plotbackgroundcolor-color/">Color</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/plotbackgroundcolor-gradient/">Gradient</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotbackgroundcolor-color/">Color</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotbackgroundcolor-gradient/">Gradient</a>
    */
  var plotBackgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The URL for an image to use as the plot background. To set an image
    * as the background for the entire chart, set a CSS background image
    * to the container element. Note that for the image to be applied to
    * exported charts, its URL needs to be accessible by the export server.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbackgroundimage/">Skies</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/plotbackgroundimage/">Skies</a>
    */
  var plotBackgroundImage: js.UndefOr[String] = js.undefined

  /**
    * <p>The color of the inner chart or plot area border.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbordercolor/">Blue border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/plotborder/">Blue border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotborder/">Plot border options</a>
    */
  var plotBorderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The pixel width of the plot area border.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotborderwidth/">1px border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/plotborder/">2px border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotborder/">Plot border options</a>
    */
  var plotBorderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to apply a drop shadow to the plot area. Requires that
    * plotBackgroundColor be set. The shadow can be an object configuration
    * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotshadow/">Plot shadow</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/plotshadow/">Plot shadow</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotborder/">Plot border options</a>
    */
  var plotShadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>When true, cartesian charts like line, spline, area and column are
    * transformed into the polar coordinate system. This produces <em>polar
    * charts</em>, also known as <em>radar charts</em>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polar/">Polar chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polar-wind-rose/">Wind rose, stacked polar column chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polar-spider/">Spider web chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/parallel-coordinates/polar/">Star plot, multivariate data in a polar chart</a>
    * @since 2.3.0
    */
  var polar: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Allows to manually load the proj4 library from Highcharts options
    * instead of the <code>window</code>.
    * In case of loading the library from a <code>script</code> tag,
    * this option is not needed, it will be loaded from there by default.</p>
    */
  var proj4: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Whether to reflow the chart to fit the width of the container div
    * on resizing the window.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-false/">False</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/reflow-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/reflow-false/">False</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/reflow-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/reflow-false/">False</a>
    * @since 2.1.0
    */
  var reflow: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The HTML element where the chart will be rendered. If it is a string,
    * the element by that id is used. The HTML element can also be passed
    * by direct reference, or as the first argument of the chart
    * constructor, in which case the option is not needed.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/">String</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/renderto-object/">Object reference</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/renderto-string/">String</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/renderto-object/">Object reference</a>
    */
  var renderTo: js.UndefOr[String | dom.Element] = js.undefined

  /**
    * <p>The button that appears after a selection zoom, allowing the user
    * to reset zoom.</p>
    */
  var resetZoomButton: js.Any = js.undefined

  /**
    * <p>Options for a scrollable plot area. This feature provides a minimum size for
    * the plot area of the chart. If the size gets smaller than this, typically
    * on mobile devices, a native browser scrollbar is presented. This scrollbar
    * provides smooth scrolling for the contents of the plot area, whereas the
    * title, legend and unaffected axes are fixed.</p>
    * <p>Since v7.1.2, a scrollable plot area can be defined for either horizontal or
    * vertical scrolling, depending on whether the <code>minWidth</code> or <code>minHeight</code>
    * option is set.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/scrollable-plotarea">Scrollable plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/scrollable-plotarea-vertical">Vertically scrollable plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/scrollable-plotarea-vertical">Gantt chart with vertically scrollable plot area</a>
    * @since 6.1.0
    */
  var scrollablePlotArea: js.Any = js.undefined

  /**
    * <p>The background color of the marker square when selecting (zooming
    * in on) an area of the chart.</p>
    * @since 2.1.7
    */
  var selectionMarkerFill: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Whether to apply a drop shadow to the outer chart area. Requires
    * that backgroundColor be set. The shadow can be an object
    * configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and
    * <code>width</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/shadow/">Shadow</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/shadow/">Shadow</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/border/">Chart border and shadow</a>
    */
  var shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Whether to show the axes initially. This only applies to empty charts
    * where series are added dynamically, as axes are automatically added
    * to cartesian series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/showaxes-false/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/showaxes-true/">True</a>
    * @since 1.2.5
    */
  var showAxes: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The distance between the outer edge of the chart and the content,
    * like title or legend, or axis title and labels if present. The
    * numbers in the array designate top, right, bottom and left
    * respectively. Use the options spacingTop, spacingRight, spacingBottom
    * and spacingLeft options for shorthand setting of one option.</p>
    * @since 3.0.6
    */
  var spacing: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * <p>The space between the bottom edge of the chart and the content (plot
    * area, axis title and labels, title, subtitle or legend in top
    * position).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingbottom/">Spacing bottom set to 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/spacingbottom/">Spacing bottom set to 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/spacing/">Spacing 100 all around</a>
    * @since 2.1.0
    */
  var spacingBottom: js.UndefOr[Double] = js.undefined

  /**
    * <p>The space between the left edge of the chart and the content (plot
    * area, axis title and labels, title, subtitle or legend in top
    * position).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingleft/">Spacing left set to 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/spacingleft/">Spacing left set to 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/spacing/">Spacing 100 all around</a>
    * @since 2.1.0
    */
  var spacingLeft: js.UndefOr[Double] = js.undefined

  /**
    * <p>The space between the right edge of the chart and the content (plot
    * area, axis title and labels, title, subtitle or legend in top
    * position).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingright-100/">Spacing set to 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingright-legend/">Legend in right position with default spacing</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/spacingright/">Spacing set to 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/spacing/">Spacing 100 all around</a>
    * @since 2.1.0
    */
  var spacingRight: js.UndefOr[Double] = js.undefined

  /**
    * <p>The space between the top edge of the chart and the content (plot
    * area, axis title and labels, title, subtitle or legend in top
    * position).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingtop-100/">A top spacing of 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingtop-10/">Floating chart title makes the plot area align to the default spacingTop of 10.</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/spacingtop/">A top spacing of 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/spacing/">Spacing 100 all around</a>
    * @since 2.1.0
    */
  var spacingTop: js.UndefOr[Double] = js.undefined

  /**
    * <p>Additional CSS styles to apply inline to the container <code>div</code>. Note
    * that since the default font styles are applied in the renderer, it
    * is ignorant of the individual chart options and must be set globally.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/style-serif-font/">Using a serif type font</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/em/">Styled mode with relative font sizes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/style/">Using a serif type font</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/style-serif-font/">Using a serif type font</a>
    */
  var style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Whether to apply styled mode. When in styled mode, no presentational
    * attributes or CSS are applied to the chart SVG. Instead, CSS rules
    * are required to style the chart. The default style sheet is
    * available from <code>https://code.highcharts.com/css/highcharts.css</code>.</p>
    * @since 7.0.0
    */
  var styledMode: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The default series type for the chart. Can be any of the chart types
    * listed under <a href="#plotOptions">plotOptions</a> and <a href="#series">series</a> or can
    * be a series provided by an additional module.</p>
    * <p>In TypeScript this option has no effect in sense of typing and
    * instead the <code>type</code> option must always be set in the series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/type-bar/">Bar</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/type/">Areaspline</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/type-mapline/">Mapline</a>
    * @since 2.1.0
    */
  var `type`: js.UndefOr[String] = js.undefined

  /**
    * <p>An explicit width for the chart. By default (when <code>null</code>) the width
    * is calculated from the offset width of the containing element.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/width/">800px wide</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/width/">800px wide</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/size/">Chart with explicit size</a>
    */
  var width: js.UndefOr[Null | Double | String] = js.undefined

  /**
    * <p>Enables zooming by a single touch, in combination with
    * <a href="#chart.zoomType">chart.zoomType</a>. When enabled, two-finger pinch
    * will still work as set up by <a href="#chart.pinchType">chart.pinchType</a>.
    * However, <code>zoomBySingleTouch</code> will interfere with touch-dragging the
    * chart to read the tooltip. And especially when vertical zooming is
    * enabled, it will make it hard to scroll vertically on the page.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoombysingletouch">Zoom by single touch enabled, with buttons to toggle</a>
    * @since 9.0.0
    */
  var zoomBySingleTouch: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Set a key to hold when dragging to zoom the chart. This is useful to avoid
    * zooming while moving points. Should be set different than
    * <a href="#chart.panKey">chart.panKey</a>.</p>
    * @since 6.2.0
    */
  var zoomKey: js.UndefOr[String] = js.undefined

  /**
    * <p>Decides in what dimensions the user can zoom by dragging the mouse.
    * Can be one of <code>x</code>, <code>y</code> or <code>xy</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-none/">None by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-x/">X</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-y/">Y</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-xy/">Xy</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/basic-line/">None by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/zoomtype-x/">X</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/zoomtype-y/">Y</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/zoomtype-xy/">Xy</a>
    */
  var zoomType: js.UndefOr[String] = js.undefined
}

object Chart {
  /**
    * @param alignTicks <p>When using multiple axis, the ticks of two or more opposite axes. will automatically be aligned by adding ticks to the axis or axes. with the least ticks, as if <code>tickAmount</code> were specified.</p>. <p>This can be prevented by setting <code>alignTicks</code> to false. If the grid. lines look messy, it&#39;s a good idea to hide them for the secondary. axis by setting <code>gridLineWidth</code> to 0.</p>. <p>If <code>startOnTick</code> or <code>endOnTick</code> in an Axis options are set to false,. then the <code>alignTicks </code> will be disabled for the Axis.</p>. <p>Disabled for logarithmic axes.</p>
    * @param animation <p>Set the overall animation for all chart updating. Animation can be. disabled throughout the chart by setting it to false here. It can. be overridden for each individual API method as a function parameter.. The only animation not affected by this option is the initial series. animation, see <a href="#plotOptions.series.animation">plotOptions.series.animation</a>.</p>. <p>The animation can either be set as a boolean or a configuration. object. If <code>true</code>, it will use the &#39;swing&#39; jQuery easing and a. duration of 500 ms. If used as a configuration object, the following. properties are supported:</p>. <ul>. <li><p><code>defer</code>: The animation delay time in milliseconds.</p>. </li>. <li><p><code>duration</code>: The duration of the animation in milliseconds.</p>. </li>. <li><p><code>easing</code>: A string reference to an easing function set on the. <code>Math</code> object. See. <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</p>. </li>. </ul>. <p>When zooming on a series with less than 100 points, the chart redraw. will be done with animation, but in case of more data points, it is. necessary to set this option to ensure animation on zoom.</p>
    * @param backgroundColor <p>The background color or gradient for the outer chart area.</p>
    * @param borderColor <p>The color of the outer chart border.</p>
    * @param borderRadius <p>The corner radius of the outer chart border.</p>
    * @param borderWidth <p>The pixel width of the outer chart border.</p>
    * @param className <p>A CSS class name to apply to the charts container <code>div</code>, allowing. unique CSS styling for each chart.</p>
    * @param colorCount <p>In styled mode, this sets how many colors the class names. should rotate between. With ten colors, series (or points) are. given class names like <code>highcharts-color-0</code>, <code>highcharts-color-0</code>. [...] <code>highcharts-color-9</code>. The equivalent in non-styled mode. is to set colors using the <a href="#colors">colors</a> setting.</p>
    * @param defaultSeriesType <p>Alias of <code>type</code>.</p>
    * @param displayErrors <p>Whether to display errors on the chart. When <code>false</code>, the errors will. be shown only in the console.</p>
    * @param events <p>Event listeners for the chart.</p>
    * @param height <p>An explicit height for the chart. If a <em>number</em>, the height is. given in pixels. If given a <em>percentage string</em> (for example. <code>&#39;56%&#39;</code>), the height is given as the percentage of the actual chart. width. This allows for preserving the aspect ratio across responsive. sizes.</p>. <p>By default (when <code>null</code>) the height is calculated from the offset. height of the containing element, or 400 pixels if the containing. element&#39;s height is 0.</p>
    * @param ignoreHiddenSeries <p>If true, the axes will scale to the remaining visible series once. one series is hidden. If false, hiding and showing a series will. not affect the axes or the other series. For stacks, once one series. within the stack is hidden, the rest of the stack will close in. around it even if the axis is not affected.</p>
    * @param inverted <p>Whether to invert the axes so that the x axis is vertical and y axis. is horizontal. When <code>true</code>, the x axis is <a href="#xAxis.reversed">reversed</a>. by default.</p>
    * @param map <p>Default <code>mapData</code> for all series. If set to a string, it functions. as an index into the <code>Highcharts.maps</code> array. Otherwise it is. interpreted as map data.</p>
    * @param mapTransforms <p>Set lat/lon transformation definitions for the chart. If not defined,. these are extracted from the map data.</p>
    * @param margin <p>The margin between the outer edge of the chart and the plot area.. The numbers in the array designate top, right, bottom and left. respectively. Use the options <code>marginTop</code>, <code>marginRight</code>,. <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of one option.</p>. <p>By default there is no margin. The actual space is dynamically. calculated from the offset of axis labels, axis title, title,. subtitle and legend in addition to the <code>spacingTop</code>, <code>spacingRight</code>,. <code>spacingBottom</code> and <code>spacingLeft</code> options.</p>
    * @param marginBottom <p>The margin between the bottom outer edge of the chart and the plot. area. Use this to set a fixed pixel value for the margin as opposed. to the default dynamic margin. See also <code>spacingBottom</code>.</p>
    * @param marginLeft <p>The margin between the left outer edge of the chart and the plot. area. Use this to set a fixed pixel value for the margin as opposed. to the default dynamic margin. See also <code>spacingLeft</code>.</p>
    * @param marginRight <p>The margin between the right outer edge of the chart and the plot. area. Use this to set a fixed pixel value for the margin as opposed. to the default dynamic margin. See also <code>spacingRight</code>.</p>
    * @param marginTop <p>The margin between the top outer edge of the chart and the plot area.. Use this to set a fixed pixel value for the margin as opposed to. the default dynamic margin. See also <code>spacingTop</code>.</p>
    * @param numberFormatter <p>Callback function to override the default function that formats all. the numbers in the chart. Returns a string with the formatted number.</p>
    * @param options3d <p>Options to render charts in 3 dimensions. This feature requires. <code>highcharts-3d.js</code>, found in the download package or online at. <a href="https://code.highcharts.com/highcharts-3d.js">code.highcharts.com/highcharts-3d.js</a>.</p>
    * @param panKey <p>Allows setting a key to switch between zooming and panning. Can be. one of <code>alt</code>, <code>ctrl</code>, <code>meta</code> (the command key on Mac and Windows. key on Windows) or <code>shift</code>. The keys are mapped directly to the key. properties of the click event argument (<code>event.altKey</code>,. <code>event.ctrlKey</code>, <code>event.metaKey</code> and <code>event.shiftKey</code>).</p>
    * @param panning <p>Allow panning in a chart. Best used with <a href="#chart.panKey">panKey</a>. to combine zooming and panning.</p>. <p>On touch devices, when the <a href="#tooltip.followTouchMove">tooltip.followTouchMove</a> option is <code>true</code> (default), panning. requires two fingers. To allow panning with one finger, set. <code>followTouchMove</code> to <code>false</code>.</p>
    * @param parallelAxes <p>Common options for all yAxes rendered in a parallel coordinates plot.. This feature requires <code>modules/parallel-coordinates.js</code>.</p>. <p>The default options are:</p>. <pre><code class="language-js">parallelAxes: {.    lineWidth: 1,       // classic mode only.    gridlinesWidth: 0,  // classic mode only.    title: {.        text: &#39;&#39;,.        reserveSpace: false.    },.    labels: {.        x: 0,.        y: 0,.        align: &#39;center&#39;,.        reserveSpace: false.    },.    offset: 0. }. </code></pre>
    * @param parallelCoordinates <p>Flag to render charts as a parallel coordinates plot. In a parallel. coordinates plot (||-coords) by default all required yAxes are generated. and the legend is disabled. This feature requires. <code>modules/parallel-coordinates.js</code>.</p>
    * @param pinchType <p>Equivalent to <a href="#chart.zoomType">zoomType</a>, but for multitouch. gestures only. By default, the <code>pinchType</code> is the same as the. <code>zoomType</code> setting. However, pinching can be enabled separately in. some cases, for example in stock charts where a mouse drag pans the. chart, while pinching is enabled. When <a href="#tooltip.followTouchMove">tooltip.followTouchMove</a> is true, pinchType only applies to. two-finger touches.</p>
    * @param plotBackgroundColor <p>The background color or gradient for the plot area.</p>
    * @param plotBackgroundImage <p>The URL for an image to use as the plot background. To set an image. as the background for the entire chart, set a CSS background image. to the container element. Note that for the image to be applied to. exported charts, its URL needs to be accessible by the export server.</p>
    * @param plotBorderColor <p>The color of the inner chart or plot area border.</p>
    * @param plotBorderWidth <p>The pixel width of the plot area border.</p>
    * @param plotShadow <p>Whether to apply a drop shadow to the plot area. Requires that. plotBackgroundColor be set. The shadow can be an object configuration. containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.</p>
    * @param polar <p>When true, cartesian charts like line, spline, area and column are. transformed into the polar coordinate system. This produces <em>polar. charts</em>, also known as <em>radar charts</em>.</p>
    * @param proj4 <p>Allows to manually load the proj4 library from Highcharts options. instead of the <code>window</code>.. In case of loading the library from a <code>script</code> tag,. this option is not needed, it will be loaded from there by default.</p>
    * @param reflow <p>Whether to reflow the chart to fit the width of the container div. on resizing the window.</p>
    * @param renderTo <p>The HTML element where the chart will be rendered. If it is a string,. the element by that id is used. The HTML element can also be passed. by direct reference, or as the first argument of the chart. constructor, in which case the option is not needed.</p>
    * @param resetZoomButton <p>The button that appears after a selection zoom, allowing the user. to reset zoom.</p>
    * @param scrollablePlotArea <p>Options for a scrollable plot area. This feature provides a minimum size for. the plot area of the chart. If the size gets smaller than this, typically. on mobile devices, a native browser scrollbar is presented. This scrollbar. provides smooth scrolling for the contents of the plot area, whereas the. title, legend and unaffected axes are fixed.</p>. <p>Since v7.1.2, a scrollable plot area can be defined for either horizontal or. vertical scrolling, depending on whether the <code>minWidth</code> or <code>minHeight</code>. option is set.</p>
    * @param selectionMarkerFill <p>The background color of the marker square when selecting (zooming. in on) an area of the chart.</p>
    * @param shadow <p>Whether to apply a drop shadow to the outer chart area. Requires. that backgroundColor be set. The shadow can be an object. configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and. <code>width</code>.</p>
    * @param showAxes <p>Whether to show the axes initially. This only applies to empty charts. where series are added dynamically, as axes are automatically added. to cartesian series.</p>
    * @param spacing <p>The distance between the outer edge of the chart and the content,. like title or legend, or axis title and labels if present. The. numbers in the array designate top, right, bottom and left. respectively. Use the options spacingTop, spacingRight, spacingBottom. and spacingLeft options for shorthand setting of one option.</p>
    * @param spacingBottom <p>The space between the bottom edge of the chart and the content (plot. area, axis title and labels, title, subtitle or legend in top. position).</p>
    * @param spacingLeft <p>The space between the left edge of the chart and the content (plot. area, axis title and labels, title, subtitle or legend in top. position).</p>
    * @param spacingRight <p>The space between the right edge of the chart and the content (plot. area, axis title and labels, title, subtitle or legend in top. position).</p>
    * @param spacingTop <p>The space between the top edge of the chart and the content (plot. area, axis title and labels, title, subtitle or legend in top. position).</p>
    * @param style <p>Additional CSS styles to apply inline to the container <code>div</code>. Note. that since the default font styles are applied in the renderer, it. is ignorant of the individual chart options and must be set globally.</p>
    * @param styledMode <p>Whether to apply styled mode. When in styled mode, no presentational. attributes or CSS are applied to the chart SVG. Instead, CSS rules. are required to style the chart. The default style sheet is. available from <code>https://code.highcharts.com/css/highcharts.css</code>.</p>
    * @param `type` <p>The default series type for the chart. Can be any of the chart types. listed under <a href="#plotOptions">plotOptions</a> and <a href="#series">series</a> or can. be a series provided by an additional module.</p>. <p>In TypeScript this option has no effect in sense of typing and. instead the <code>type</code> option must always be set in the series.</p>
    * @param width <p>An explicit width for the chart. By default (when <code>null</code>) the width. is calculated from the offset width of the containing element.</p>
    * @param zoomBySingleTouch <p>Enables zooming by a single touch, in combination with. <a href="#chart.zoomType">chart.zoomType</a>. When enabled, two-finger pinch. will still work as set up by <a href="#chart.pinchType">chart.pinchType</a>.. However, <code>zoomBySingleTouch</code> will interfere with touch-dragging the. chart to read the tooltip. And especially when vertical zooming is. enabled, it will make it hard to scroll vertically on the page.</p>
    * @param zoomKey <p>Set a key to hold when dragging to zoom the chart. This is useful to avoid. zooming while moving points. Should be set different than. <a href="#chart.panKey">chart.panKey</a>.</p>
    * @param zoomType <p>Decides in what dimensions the user can zoom by dragging the mouse.. Can be one of <code>x</code>, <code>y</code> or <code>xy</code>.</p>
    */
  def apply(alignTicks: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, colorCount: js.UndefOr[Double] = js.undefined, defaultSeriesType: js.UndefOr[String] = js.undefined, displayErrors: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, height: js.UndefOr[Null | Double | String] = js.undefined, ignoreHiddenSeries: js.UndefOr[Boolean] = js.undefined, inverted: js.UndefOr[Boolean] = js.undefined, map: js.UndefOr[String | js.Array[js.Any] | js.Object] = js.undefined, mapTransforms: js.UndefOr[js.Any] = js.undefined, margin: js.UndefOr[Double | js.Array[Double]] = js.undefined, marginBottom: js.UndefOr[Double] = js.undefined, marginLeft: js.UndefOr[Double] = js.undefined, marginRight: js.UndefOr[Double] = js.undefined, marginTop: js.UndefOr[Double] = js.undefined, numberFormatter: js.UndefOr[js.Any] = js.undefined, options3d: js.UndefOr[js.Any] = js.undefined, panKey: js.UndefOr[String] = js.undefined, panning: js.UndefOr[js.Any] = js.undefined, parallelAxes: js.UndefOr[CleanJsObject[ChartParallelAxes]] = js.undefined, parallelCoordinates: js.UndefOr[Boolean] = js.undefined, pinchType: js.UndefOr[String] = js.undefined, plotBackgroundColor: js.UndefOr[String | js.Object] = js.undefined, plotBackgroundImage: js.UndefOr[String] = js.undefined, plotBorderColor: js.UndefOr[String | js.Object] = js.undefined, plotBorderWidth: js.UndefOr[Double] = js.undefined, plotShadow: js.UndefOr[Boolean | js.Object] = js.undefined, polar: js.UndefOr[Boolean] = js.undefined, proj4: js.UndefOr[js.Function] = js.undefined, reflow: js.UndefOr[Boolean] = js.undefined, renderTo: js.UndefOr[String | dom.Element] = js.undefined, resetZoomButton: js.UndefOr[js.Any] = js.undefined, scrollablePlotArea: js.UndefOr[js.Any] = js.undefined, selectionMarkerFill: js.UndefOr[String | js.Object] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, showAxes: js.UndefOr[Boolean] = js.undefined, spacing: js.UndefOr[js.Array[Double]] = js.undefined, spacingBottom: js.UndefOr[Double] = js.undefined, spacingLeft: js.UndefOr[Double] = js.undefined, spacingRight: js.UndefOr[Double] = js.undefined, spacingTop: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, styledMode: js.UndefOr[Boolean] = js.undefined, `type`: js.UndefOr[String] = js.undefined, width: js.UndefOr[Null | Double | String] = js.undefined, zoomBySingleTouch: js.UndefOr[Boolean] = js.undefined, zoomKey: js.UndefOr[String] = js.undefined, zoomType: js.UndefOr[String] = js.undefined): Chart = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Chart {
      this.alignTicks = alignTicks
      this.animation = animation
      this.backgroundColor = backgroundColor
      this.borderColor = borderColor
      this.borderRadius = borderRadius
      this.borderWidth = borderWidth
      this.className = className
      this.colorCount = colorCount
      this.defaultSeriesType = defaultSeriesType
      this.displayErrors = displayErrors
      this.events = events
      this.height = height
      this.ignoreHiddenSeries = ignoreHiddenSeries
      this.inverted = inverted
      this.map = map
      this.mapTransforms = mapTransforms
      this.margin = margin
      this.marginBottom = marginBottom
      this.marginLeft = marginLeft
      this.marginRight = marginRight
      this.marginTop = marginTop
      this.numberFormatter = numberFormatter
      this.options3d = options3d
      this.panKey = panKey
      this.panning = panning
      this.parallelAxes = parallelAxes
      this.parallelCoordinates = parallelCoordinates
      this.pinchType = pinchType
      this.plotBackgroundColor = plotBackgroundColor
      this.plotBackgroundImage = plotBackgroundImage
      this.plotBorderColor = plotBorderColor
      this.plotBorderWidth = plotBorderWidth
      this.plotShadow = plotShadow
      this.polar = polar
      this.proj4 = proj4
      this.reflow = reflow
      this.renderTo = renderTo
      this.resetZoomButton = resetZoomButton
      this.scrollablePlotArea = scrollablePlotArea
      this.selectionMarkerFill = selectionMarkerFill
      this.shadow = shadow
      this.showAxes = showAxes
      this.spacing = spacing
      this.spacingBottom = spacingBottom
      this.spacingLeft = spacingLeft
      this.spacingRight = spacingRight
      this.spacingTop = spacingTop
      this.style = style
      this.styledMode = styledMode
      this.`type` = `type`
      this.width = width
      this.zoomBySingleTouch = zoomBySingleTouch
      this.zoomKey = zoomKey
      this.zoomType = zoomType
    })
  }
}
