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
  * @note JavaScript name: <code>chart</code>
  */
@js.annotation.ScalaJSDefined
class Chart extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Set a key to hold when dragging to zoom the chart. Requires the
    * draggable-points module. This is useful to avoid zooming while moving points.
    * Should be set different than <a href="#chart.panKey">chart.panKey</a>.</p>
    * @since 6.2.0
    */
  val zoomKey: js.UndefOr[String] = js.undefined

  /**
    * <p>Event listeners for the chart.</p>
    */
  val events: js.Any = js.undefined

  /**
    * <p>Flag to render charts as a parallel coordinates plot. In a parallel
    * coordinates plot (||-coords) by default all required yAxes are generated
    * and the legend is disabled. This feature requires
    * <code>modules/parallel-coordinates.js</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples//highcharts/demo/parallel-coordinates/">Parallel coordinates demo</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/parallel-coordinates/polar/">Star plot, multivariate data in a polar chart</a>
    * @since 6.0.0
    */
  val parallelCoordinates: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Common options for all yAxes rendered in a parallel coordinates plot.
    * This feature requires <code>modules/parallel-coordinates.js</code>.</p>
    * <p>The default options are:</p>
    * <pre>
    * parallelAxes: {
    *    lineWidth: 1,       // classic mode only
    *    gridlinesWidth: 0,  // classic mode only
    *    title: {
    *        text: '',
    *        reserveSpace: false
    *    },
    *    labels: {
    *        x: 0,
    *        y: 0,
    *        align: 'center',
    *        reserveSpace: false
    *    },
    *    offset: 0
    * }</pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/parallel-coordinates/parallelaxes/">Set the same tickAmount for all yAxes</a>
    * @since 6.0.0
    */
  val parallelAxes: js.Any = js.undefined

  /**
    * <p>A text description of the chart.</p>
    * <p>If the Accessibility module is loaded, this is included by default
    * as a long description of the chart and its contents in the hidden
    * screen reader information region.</p>
    * @since 5.0.0
    */
  val description: js.UndefOr[String] = js.undefined

  /**
    * <p>A text description of the chart type.</p>
    * <p>If the Accessibility module is loaded, this will be included in the
    * description of the chart in the screen reader information region.</p>
    * <p>Highcharts will by default attempt to guess the chart type, but for
    * more complex charts it is recommended to specify this property for
    * clarity.</p>
    * @since 5.0.0
    */
  val typeDescription: js.UndefOr[String] = js.undefined

  /**
    * <p>The corner radius of the outer chart border.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/borderradius/">20px radius</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/border/">10px radius</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/border/">Border options</a>
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>In styled mode, this sets how many colors the class names
    * should rotate between. With ten colors, series (or points) are
    * given class names like <code>highcharts-color-0</code>, <code>highcharts-color-0</code>
    * [...] <code>highcharts-color-9</code>. The equivalent in non-styled mode
    * is to set colors using the <a href="#colors">colors</a> setting.</p>
    * @since 5.0.0
    */
  val colorCount: js.UndefOr[Double] = js.undefined

  /**
    * <p>Alias of <code>type</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/defaultseriestype/">Bar</a>
    */
  val defaultSeriesType: js.UndefOr[String] = js.undefined

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
  val ignoreHiddenSeries: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The distance between the outer edge of the chart and the content,
    * like title or legend, or axis title and labels if present. The
    * numbers in the array designate top, right, bottom and left
    * respectively. Use the options spacingTop, spacingRight, spacingBottom
    * and spacingLeft options for shorthand setting of one option.</p>
    * @since 3.0.6
    */
  val spacing: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * <p>The button that appears after a selection zoom, allowing the user
    * to reset zoom.</p>
    */
  val resetZoomButton: js.Any = js.undefined

  /**
    * <p>An explicit width for the chart. By default (when <code>null</code>) the width
    * is calculated from the offset width of the containing element.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/width/">800px wide</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/width/">800px wide</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/size/">Chart with explicit size</a>
    */
  val width: js.UndefOr[Double | Null] = js.undefined

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
  val height: js.UndefOr[Double | String | Null] = js.undefined

  /**
    * <p>The color of the outer chart border.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/bordercolor/">Brown border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/border/">Brown border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/border/">Border options</a>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The background color or gradient for the outer chart area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/backgroundcolor-color/">Color</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/backgroundcolor-gradient/">Gradient</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/backgroundcolor-color/">Color</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/backgroundcolor-gradient/">Gradient</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/backgroundcolor-color/">Color</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/backgroundcolor-gradient/">Gradient</a>
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the inner chart or plot area border.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbordercolor/">Blue border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/plotborder/">Blue border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotborder/">Plot border options</a>
    */
  val plotBorderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Default <code>mapData</code> for all series. If set to a string, it functions
    * as an index into the <code>Highcharts.maps</code> array. Otherwise it is
    * interpreted s map data.</p>
    * @since 5.0.0
    */
  val map: js.UndefOr[String | js.Array[js.Any]] = js.undefined

  /**
    * <p>Set lat/lon transformation definitions for the chart. If not defined,
    * these are extracted from the map data.</p>
    * @since 5.0.0
    */
  val mapTransforms: js.Any = js.undefined

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
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/alignticks-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/alignticks-false/">False</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/alignticks-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/alignticks-false/">False</a>
    */
  val alignTicks: js.UndefOr[Boolean] = js.undefined

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
    * <dl>
    * 
    * <dt>duration</dt>
    * 
    * <dd>The duration of the animation in milliseconds.</dd>
    * 
    * <dt>easing</dt>
    * 
    * <dd>A string reference to an easing function set on the `Math`
    * object. See [the easing
    * demo](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/).
    * </dd>
    * 
    * </dl>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/animation-none/">Updating with no animation</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/animation-duration/">With a longer duration</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/animation-easing/">With a jQuery UI easing</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/animation-none/">Updating with no animation</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/animation-duration/">With a longer duration</a>
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>A CSS class name to apply to the charts container <code>div</code>, allowing
    * unique CSS styling for each chart.</p>
    */
  val className: js.UndefOr[String] = js.undefined

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
  val margin: js.UndefOr[Double | js.Array[Double]] = js.undefined

  /**
    * <p>The margin between the bottom outer edge of the chart and the plot
    * area. Use this to set a fixed pixel value for the margin as opposed
    * to the default dynamic margin. See also <code>spacingBottom</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/marginbottom/">100px bottom margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/marginbottom/">100px bottom margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/margin/">100px margins</a>
    * @since 2.0
    */
  val marginBottom: js.UndefOr[Double] = js.undefined

  /**
    * <p>The margin between the left outer edge of the chart and the plot
    * area. Use this to set a fixed pixel value for the margin as opposed
    * to the default dynamic margin. See also <code>spacingLeft</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/marginleft/">150px left margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/marginleft/">150px left margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/margin/">100px margins</a>
    * @since 2.0
    */
  val marginLeft: js.UndefOr[Double] = js.undefined

  /**
    * <p>The margin between the right outer edge of the chart and the plot
    * area. Use this to set a fixed pixel value for the margin as opposed
    * to the default dynamic margin. See also <code>spacingRight</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/marginright/">100px right margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/marginright/">100px right margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/margin/">100px margins</a>
    * @since 2.0
    */
  val marginRight: js.UndefOr[Double] = js.undefined

  /**
    * <p>The margin between the top outer edge of the chart and the plot area.
    * Use this to set a fixed pixel value for the margin as opposed to
    * the default dynamic margin. See also <code>spacingTop</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/margintop/">100px top margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/margintop/">100px top margin</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/margin/">100px margins</a>
    * @since 2.0
    */
  val marginTop: js.UndefOr[Double] = js.undefined

  /**
    * <p>Allows setting a key to switch between zooming and panning. Can be
    * one of <code>alt</code>, <code>ctrl</code>, <code>meta</code> (the command key on Mac and Windows
    * key on Windows) or <code>shift</code>. The keys are mapped directly to the key
    * properties of the click event argument (<code>event.altKey</code>,
    * <code>event.ctrlKey</code>, <code>event.metaKey</code> and <code>event.shiftKey</code>).</p>
    * @since 4.0.3
    */
  val panKey: js.UndefOr[String] = js.undefined

  /**
    * <p>Allow panning in a chart. Best used with <a href="#chart.panKey">panKey</a>
    * to combine zooming and panning.</p>
    * <p>On touch devices, when the <a href="#tooltip.followTouchMove">tooltip.followTouchMove</a> option is <code>true</code> (default), panning
    * requires two fingers. To allow panning with one finger, set
    * <code>followTouchMove</code> to <code>false</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/pankey/">Zooming and panning</a>
    * @since 4.0.3
    */
  val panning: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Equivalent to <a href="#chart.zoomType">zoomType</a>, but for multitouch
    * gestures only. By default, the <code>pinchType</code> is the same as the
    * <code>zoomType</code> setting. However, pinching can be enabled separately in
    * some cases, for example in stock charts where a mouse drag pans the
    * chart, while pinching is enabled. When <a href="#tooltip.followTouchMove">tooltip.followTouchMove</a> is true, pinchType only applies to
    * two-finger touches.</p>
    * @since 3.0
    */
  val pinchType: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to invert the axes so that the x axis is vertical and y axis
    * is horizontal. When <code>true</code>, the x axis is <a href="#xAxis.reversed">reversed</a>
    * by default.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/inverted/">Inverted line</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/inverted/">Inverted stock chart</a>
    */
  val inverted: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The pixel width of the plot area border.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotborderwidth/">1px border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/plotborder/">2px border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotborder/">Plot border options</a>
    */
  val plotBorderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to apply a drop shadow to the plot area. Requires that
    * plotBackgroundColor be set. The shadow can be an object configuration
    * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotshadow/">Plot shadow</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/plotshadow/">Plot shadow</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotborder/">Plot border options</a>
    */
  val plotShadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>When true, cartesian charts like line, spline, area and column are
    * transformed into the polar coordinate system. Requires
    * <code>highcharts-more.js</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polar/">Polar chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polar-wind-rose/">Wind rose, stacked polar column chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polar-spider/">Spider web chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/parallel-coordinates/polar/">Star plot, multivariate data in a polar chart</a>
    * @since 2.3.0
    */
  val polar: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to reflow the chart to fit the width of the container div
    * on resizing the window.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-false/">False</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/reflow-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/reflow-false/">False</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/reflow-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/reflow-false/">False</a>
    * @since 2.1
    */
  val reflow: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The HTML element where the chart will be rendered. If it is a string,
    * the element by that id is used. The HTML element can also be passed
    * by direct reference, or as the first argument of the chart
    * constructor, in which case the option is not needed.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/">String</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/renderto-object/">Object reference</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/renderto-jquery/">Object reference through jQuery</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/renderto-string/">String</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/renderto-object/">Object reference</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/renderto-jquery/">Object reference through jQuery</a>
    */
  val renderTo: js.UndefOr[String] = js.undefined

  /**
    * <p>The background color of the marker square when selecting (zooming
    * in on) an area of the chart.</p>
    * @since 2.1.7
    */
  val selectionMarkerFill: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Whether to apply a drop shadow to the outer chart area. Requires
    * that backgroundColor be set. The shadow can be an object
    * configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and
    * <code>width</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/shadow/">Shadow</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/shadow/">Shadow</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/border/">Chart border and shadow</a>
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Whether to show the axes initially. This only applies to empty charts
    * where series are added dynamically, as axes are automatically added
    * to cartesian series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/showaxes-false/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/showaxes-true/">True</a>
    * @since 1.2.5
    */
  val showAxes: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The space between the bottom edge of the chart and the content (plot
    * area, axis title and labels, title, subtitle or legend in top
    * position).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingbottom/">Spacing bottom set to 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/spacingbottom/">Spacing bottom set to 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/spacing/">Spacing 100 all around</a>
    * @since 2.1
    */
  val spacingBottom: js.UndefOr[Double] = js.undefined

  /**
    * <p>The space between the left edge of the chart and the content (plot
    * area, axis title and labels, title, subtitle or legend in top
    * position).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingleft/">Spacing left set to 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/spacingleft/">Spacing left set to 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/spacing/">Spacing 100 all around</a>
    * @since 2.1
    */
  val spacingLeft: js.UndefOr[Double] = js.undefined

  /**
    * <p>The space between the right edge of the chart and the content (plot
    * area, axis title and labels, title, subtitle or legend in top
    * position).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingright-100/">Spacing set to 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingright-legend/">Legend in right position with default spacing</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/spacingright/">Spacing set to 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/spacing/">Spacing 100 all around</a>
    * @since 2.1
    */
  val spacingRight: js.UndefOr[Double] = js.undefined

  /**
    * <p>The space between the top edge of the chart and the content (plot
    * area, axis title and labels, title, subtitle or legend in top
    * position).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingtop-100/">A top spacing of 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingtop-10/">Floating chart title makes the plot area align to the default spacingTop of 10.</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/spacingtop/">A top spacing of 100</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/spacing/">Spacing 100 all around</a>
    * @since 2.1
    */
  val spacingTop: js.UndefOr[Double] = js.undefined

  /**
    * <p>Additional CSS styles to apply inline to the container <code>div</code>. Note
    * that since the default font styles are applied in the renderer, it
    * is ignorant of the individual chart options and must be set globally.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/style-serif-font/">Using a serif type font</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/em/">Styled mode with relative font sizes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/style/">Using a serif type font</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/style-serif-font/">Using a serif type font</a>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The default series type for the chart. Can be any of the chart types
    * listed under <a href="#plotOptions">plotOptions</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/type-bar/">Bar</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/type/">Areaspline</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/type-mapline/">Mapline</a>
    * @since 2.1.0
    */
  val `type`: js.UndefOr[String] = js.undefined

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
  val zoomType: js.UndefOr[String] = js.undefined

  /**
    * <p>The pixel width of the outer chart border.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/borderwidth/">5px border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/border/">2px border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/border/">Border options</a>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The background color or gradient for the plot area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbackgroundcolor-color/">Color</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbackgroundcolor-gradient/">Gradient</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/plotbackgroundcolor-color/">Color</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/plotbackgroundcolor-gradient/">Gradient</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotbackgroundcolor-color/">Color</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotbackgroundcolor-gradient/">Gradient</a>
    */
  val plotBackgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The URL for an image to use as the plot background. To set an image
    * as the background for the entire chart, set a CSS background image
    * to the container element. Note that for the image to be applied to
    * exported charts, its URL needs to be accessible by the export server.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbackgroundimage/">Skies</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/plotbackgroundimage/">Skies</a>
    */
  val plotBackgroundImage: js.UndefOr[String] = js.undefined

  /**
    * <p>Options for a scrollable plot area. This feature provides a minimum width for
    * the plot area of the chart. If the width gets smaller than this, typically
    * on mobile devices, a native browser scrollbar is presented below the chart.
    * This scrollbar provides smooth scrolling for the contents of the plot area,
    * whereas the title, legend and axes are fixed.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/scrollable-plotarea">Scrollable plot area</a>
    * @since 6.1.0
    */
  val scrollablePlotArea: js.Any = js.undefined

  /**
    * <p>Options to render charts in 3 dimensions. This feature requires
    * <code>highcharts-3d.js</code>, found in the download package or online at
    * [code.highcharts.com/highcharts-3d.js](<a href="http://code.highcharts.com/highcharts-">http://code.highcharts.com/highcharts-</a>
    * 3d.js).</p>
    * @since 4.0
    */
  val options3d: js.Any = js.undefined
}

object Chart {
  /**
    * @param zoomKey <p>Set a key to hold when dragging to zoom the chart. Requires the. draggable-points module. This is useful to avoid zooming while moving points.. Should be set different than <a href="#chart.panKey">chart.panKey</a>.</p>
    * @param events <p>Event listeners for the chart.</p>
    * @param parallelCoordinates <p>Flag to render charts as a parallel coordinates plot. In a parallel. coordinates plot (||-coords) by default all required yAxes are generated. and the legend is disabled. This feature requires. <code>modules/parallel-coordinates.js</code>.</p>
    * @param parallelAxes <p>Common options for all yAxes rendered in a parallel coordinates plot.. This feature requires <code>modules/parallel-coordinates.js</code>.</p>. <p>The default options are:</p>. <pre>. parallelAxes: {.    lineWidth: 1,       // classic mode only.    gridlinesWidth: 0,  // classic mode only.    title: {.        text: '',.        reserveSpace: false.    },.    labels: {.        x: 0,.        y: 0,.        align: 'center',.        reserveSpace: false.    },.    offset: 0. }</pre>
    * @param description <p>A text description of the chart.</p>. <p>If the Accessibility module is loaded, this is included by default. as a long description of the chart and its contents in the hidden. screen reader information region.</p>
    * @param typeDescription <p>A text description of the chart type.</p>. <p>If the Accessibility module is loaded, this will be included in the. description of the chart in the screen reader information region.</p>. <p>Highcharts will by default attempt to guess the chart type, but for. more complex charts it is recommended to specify this property for. clarity.</p>
    * @param borderRadius <p>The corner radius of the outer chart border.</p>
    * @param colorCount <p>In styled mode, this sets how many colors the class names. should rotate between. With ten colors, series (or points) are. given class names like <code>highcharts-color-0</code>, <code>highcharts-color-0</code>. [...] <code>highcharts-color-9</code>. The equivalent in non-styled mode. is to set colors using the <a href="#colors">colors</a> setting.</p>
    * @param defaultSeriesType <p>Alias of <code>type</code>.</p>
    * @param ignoreHiddenSeries <p>If true, the axes will scale to the remaining visible series once. one series is hidden. If false, hiding and showing a series will. not affect the axes or the other series. For stacks, once one series. within the stack is hidden, the rest of the stack will close in. around it even if the axis is not affected.</p>
    * @param spacing <p>The distance between the outer edge of the chart and the content,. like title or legend, or axis title and labels if present. The. numbers in the array designate top, right, bottom and left. respectively. Use the options spacingTop, spacingRight, spacingBottom. and spacingLeft options for shorthand setting of one option.</p>
    * @param resetZoomButton <p>The button that appears after a selection zoom, allowing the user. to reset zoom.</p>
    * @param width <p>An explicit width for the chart. By default (when <code>null</code>) the width. is calculated from the offset width of the containing element.</p>
    * @param height <p>An explicit height for the chart. If a <em>number</em>, the height is. given in pixels. If given a <em>percentage string</em> (for example. <code>&#39;56%&#39;</code>), the height is given as the percentage of the actual chart. width. This allows for preserving the aspect ratio across responsive. sizes.</p>. <p>By default (when <code>null</code>) the height is calculated from the offset. height of the containing element, or 400 pixels if the containing. element&#39;s height is 0.</p>
    * @param borderColor <p>The color of the outer chart border.</p>
    * @param backgroundColor <p>The background color or gradient for the outer chart area.</p>
    * @param plotBorderColor <p>The color of the inner chart or plot area border.</p>
    * @param map <p>Default <code>mapData</code> for all series. If set to a string, it functions. as an index into the <code>Highcharts.maps</code> array. Otherwise it is. interpreted s map data.</p>
    * @param mapTransforms <p>Set lat/lon transformation definitions for the chart. If not defined,. these are extracted from the map data.</p>
    * @param alignTicks <p>When using multiple axis, the ticks of two or more opposite axes. will automatically be aligned by adding ticks to the axis or axes. with the least ticks, as if <code>tickAmount</code> were specified.</p>. <p>This can be prevented by setting <code>alignTicks</code> to false. If the grid. lines look messy, it&#39;s a good idea to hide them for the secondary. axis by setting <code>gridLineWidth</code> to 0.</p>. <p>If <code>startOnTick</code> or <code>endOnTick</code> in an Axis options are set to false,. then the <code>alignTicks</code> will be disabled for the Axis.</p>. <p>Disabled for logarithmic axes.</p>
    * @param animation <p>Set the overall animation for all chart updating. Animation can be. disabled throughout the chart by setting it to false here. It can. be overridden for each individual API method as a function parameter.. The only animation not affected by this option is the initial series. animation, see <a href="#plotOptions.series.animation">plotOptions.series.animation</a>.</p>. <p>The animation can either be set as a boolean or a configuration. object. If <code>true</code>, it will use the &#39;swing&#39; jQuery easing and a. duration of 500 ms. If used as a configuration object, the following. properties are supported:</p>. <dl>. . <dt>duration</dt>. . <dd>The duration of the animation in milliseconds.</dd>. . <dt>easing</dt>. . <dd>A string reference to an easing function set on the `Math`. object. See [the easing. demo](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/).. </dd>. . </dl>
    * @param className <p>A CSS class name to apply to the charts container <code>div</code>, allowing. unique CSS styling for each chart.</p>
    * @param margin <p>The margin between the outer edge of the chart and the plot area.. The numbers in the array designate top, right, bottom and left. respectively. Use the options <code>marginTop</code>, <code>marginRight</code>,. <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of one option.</p>. <p>By default there is no margin. The actual space is dynamically. calculated from the offset of axis labels, axis title, title,. subtitle and legend in addition to the <code>spacingTop</code>, <code>spacingRight</code>,. <code>spacingBottom</code> and <code>spacingLeft</code> options.</p>
    * @param marginBottom <p>The margin between the bottom outer edge of the chart and the plot. area. Use this to set a fixed pixel value for the margin as opposed. to the default dynamic margin. See also <code>spacingBottom</code>.</p>
    * @param marginLeft <p>The margin between the left outer edge of the chart and the plot. area. Use this to set a fixed pixel value for the margin as opposed. to the default dynamic margin. See also <code>spacingLeft</code>.</p>
    * @param marginRight <p>The margin between the right outer edge of the chart and the plot. area. Use this to set a fixed pixel value for the margin as opposed. to the default dynamic margin. See also <code>spacingRight</code>.</p>
    * @param marginTop <p>The margin between the top outer edge of the chart and the plot area.. Use this to set a fixed pixel value for the margin as opposed to. the default dynamic margin. See also <code>spacingTop</code>.</p>
    * @param panKey <p>Allows setting a key to switch between zooming and panning. Can be. one of <code>alt</code>, <code>ctrl</code>, <code>meta</code> (the command key on Mac and Windows. key on Windows) or <code>shift</code>. The keys are mapped directly to the key. properties of the click event argument (<code>event.altKey</code>,. <code>event.ctrlKey</code>, <code>event.metaKey</code> and <code>event.shiftKey</code>).</p>
    * @param panning <p>Allow panning in a chart. Best used with <a href="#chart.panKey">panKey</a>. to combine zooming and panning.</p>. <p>On touch devices, when the <a href="#tooltip.followTouchMove">tooltip.followTouchMove</a> option is <code>true</code> (default), panning. requires two fingers. To allow panning with one finger, set. <code>followTouchMove</code> to <code>false</code>.</p>
    * @param pinchType <p>Equivalent to <a href="#chart.zoomType">zoomType</a>, but for multitouch. gestures only. By default, the <code>pinchType</code> is the same as the. <code>zoomType</code> setting. However, pinching can be enabled separately in. some cases, for example in stock charts where a mouse drag pans the. chart, while pinching is enabled. When <a href="#tooltip.followTouchMove">tooltip.followTouchMove</a> is true, pinchType only applies to. two-finger touches.</p>
    * @param inverted <p>Whether to invert the axes so that the x axis is vertical and y axis. is horizontal. When <code>true</code>, the x axis is <a href="#xAxis.reversed">reversed</a>. by default.</p>
    * @param plotBorderWidth <p>The pixel width of the plot area border.</p>
    * @param plotShadow <p>Whether to apply a drop shadow to the plot area. Requires that. plotBackgroundColor be set. The shadow can be an object configuration. containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.</p>
    * @param polar <p>When true, cartesian charts like line, spline, area and column are. transformed into the polar coordinate system. Requires. <code>highcharts-more.js</code>.</p>
    * @param reflow <p>Whether to reflow the chart to fit the width of the container div. on resizing the window.</p>
    * @param renderTo <p>The HTML element where the chart will be rendered. If it is a string,. the element by that id is used. The HTML element can also be passed. by direct reference, or as the first argument of the chart. constructor, in which case the option is not needed.</p>
    * @param selectionMarkerFill <p>The background color of the marker square when selecting (zooming. in on) an area of the chart.</p>
    * @param shadow <p>Whether to apply a drop shadow to the outer chart area. Requires. that backgroundColor be set. The shadow can be an object. configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and. <code>width</code>.</p>
    * @param showAxes <p>Whether to show the axes initially. This only applies to empty charts. where series are added dynamically, as axes are automatically added. to cartesian series.</p>
    * @param spacingBottom <p>The space between the bottom edge of the chart and the content (plot. area, axis title and labels, title, subtitle or legend in top. position).</p>
    * @param spacingLeft <p>The space between the left edge of the chart and the content (plot. area, axis title and labels, title, subtitle or legend in top. position).</p>
    * @param spacingRight <p>The space between the right edge of the chart and the content (plot. area, axis title and labels, title, subtitle or legend in top. position).</p>
    * @param spacingTop <p>The space between the top edge of the chart and the content (plot. area, axis title and labels, title, subtitle or legend in top. position).</p>
    * @param style <p>Additional CSS styles to apply inline to the container <code>div</code>. Note. that since the default font styles are applied in the renderer, it. is ignorant of the individual chart options and must be set globally.</p>
    * @param `type` <p>The default series type for the chart. Can be any of the chart types. listed under <a href="#plotOptions">plotOptions</a>.</p>
    * @param zoomType <p>Decides in what dimensions the user can zoom by dragging the mouse.. Can be one of <code>x</code>, <code>y</code> or <code>xy</code>.</p>
    * @param borderWidth <p>The pixel width of the outer chart border.</p>
    * @param plotBackgroundColor <p>The background color or gradient for the plot area.</p>
    * @param plotBackgroundImage <p>The URL for an image to use as the plot background. To set an image. as the background for the entire chart, set a CSS background image. to the container element. Note that for the image to be applied to. exported charts, its URL needs to be accessible by the export server.</p>
    * @param scrollablePlotArea <p>Options for a scrollable plot area. This feature provides a minimum width for. the plot area of the chart. If the width gets smaller than this, typically. on mobile devices, a native browser scrollbar is presented below the chart.. This scrollbar provides smooth scrolling for the contents of the plot area,. whereas the title, legend and axes are fixed.</p>
    * @param options3d <p>Options to render charts in 3 dimensions. This feature requires. <code>highcharts-3d.js</code>, found in the download package or online at. [code.highcharts.com/highcharts-3d.js](<a href="http://code.highcharts.com/highcharts-">http://code.highcharts.com/highcharts-</a>. 3d.js).</p>
    */
  def apply(zoomKey: js.UndefOr[String] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, parallelCoordinates: js.UndefOr[Boolean] = js.undefined, parallelAxes: js.UndefOr[js.Any] = js.undefined, description: js.UndefOr[String] = js.undefined, typeDescription: js.UndefOr[String] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, colorCount: js.UndefOr[Double] = js.undefined, defaultSeriesType: js.UndefOr[String] = js.undefined, ignoreHiddenSeries: js.UndefOr[Boolean] = js.undefined, spacing: js.UndefOr[js.Array[Double]] = js.undefined, resetZoomButton: js.UndefOr[js.Any] = js.undefined, width: js.UndefOr[Double | Null] = js.undefined, height: js.UndefOr[Double | String | Null] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, plotBorderColor: js.UndefOr[String | js.Object] = js.undefined, map: js.UndefOr[String | js.Array[js.Any]] = js.undefined, mapTransforms: js.UndefOr[js.Any] = js.undefined, alignTicks: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, className: js.UndefOr[String] = js.undefined, margin: js.UndefOr[Double | js.Array[Double]] = js.undefined, marginBottom: js.UndefOr[Double] = js.undefined, marginLeft: js.UndefOr[Double] = js.undefined, marginRight: js.UndefOr[Double] = js.undefined, marginTop: js.UndefOr[Double] = js.undefined, panKey: js.UndefOr[String] = js.undefined, panning: js.UndefOr[Boolean] = js.undefined, pinchType: js.UndefOr[String] = js.undefined, inverted: js.UndefOr[Boolean] = js.undefined, plotBorderWidth: js.UndefOr[Double] = js.undefined, plotShadow: js.UndefOr[Boolean | js.Object] = js.undefined, polar: js.UndefOr[Boolean] = js.undefined, reflow: js.UndefOr[Boolean] = js.undefined, renderTo: js.UndefOr[String] = js.undefined, selectionMarkerFill: js.UndefOr[String | js.Object] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, showAxes: js.UndefOr[Boolean] = js.undefined, spacingBottom: js.UndefOr[Double] = js.undefined, spacingLeft: js.UndefOr[Double] = js.undefined, spacingRight: js.UndefOr[Double] = js.undefined, spacingTop: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, `type`: js.UndefOr[String] = js.undefined, zoomType: js.UndefOr[String] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, plotBackgroundColor: js.UndefOr[String | js.Object] = js.undefined, plotBackgroundImage: js.UndefOr[String] = js.undefined, scrollablePlotArea: js.UndefOr[js.Any] = js.undefined, options3d: js.UndefOr[js.Any] = js.undefined): Chart = {
    val zoomKeyOuter: js.UndefOr[String] = zoomKey
    val eventsOuter: js.Any = events
    val parallelCoordinatesOuter: js.UndefOr[Boolean] = parallelCoordinates
    val parallelAxesOuter: js.Any = parallelAxes
    val descriptionOuter: js.UndefOr[String] = description
    val typeDescriptionOuter: js.UndefOr[String] = typeDescription
    val borderRadiusOuter: js.UndefOr[Double] = borderRadius
    val colorCountOuter: js.UndefOr[Double] = colorCount
    val defaultSeriesTypeOuter: js.UndefOr[String] = defaultSeriesType
    val ignoreHiddenSeriesOuter: js.UndefOr[Boolean] = ignoreHiddenSeries
    val spacingOuter: js.UndefOr[js.Array[Double]] = spacing
    val resetZoomButtonOuter: js.Any = resetZoomButton
    val widthOuter: js.UndefOr[Double | Null] = width
    val heightOuter: js.UndefOr[Double | String | Null] = height
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val plotBorderColorOuter: js.UndefOr[String | js.Object] = plotBorderColor
    val mapOuter: js.UndefOr[String | js.Array[js.Any]] = map
    val mapTransformsOuter: js.Any = mapTransforms
    val alignTicksOuter: js.UndefOr[Boolean] = alignTicks
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    val classNameOuter: js.UndefOr[String] = className
    val marginOuter: js.UndefOr[Double | js.Array[Double]] = margin
    val marginBottomOuter: js.UndefOr[Double] = marginBottom
    val marginLeftOuter: js.UndefOr[Double] = marginLeft
    val marginRightOuter: js.UndefOr[Double] = marginRight
    val marginTopOuter: js.UndefOr[Double] = marginTop
    val panKeyOuter: js.UndefOr[String] = panKey
    val panningOuter: js.UndefOr[Boolean] = panning
    val pinchTypeOuter: js.UndefOr[String] = pinchType
    val invertedOuter: js.UndefOr[Boolean] = inverted
    val plotBorderWidthOuter: js.UndefOr[Double] = plotBorderWidth
    val plotShadowOuter: js.UndefOr[Boolean | js.Object] = plotShadow
    val polarOuter: js.UndefOr[Boolean] = polar
    val reflowOuter: js.UndefOr[Boolean] = reflow
    val renderToOuter: js.UndefOr[String] = renderTo
    val selectionMarkerFillOuter: js.UndefOr[String | js.Object] = selectionMarkerFill
    val shadowOuter: js.UndefOr[Boolean | js.Object] = shadow
    val showAxesOuter: js.UndefOr[Boolean] = showAxes
    val spacingBottomOuter: js.UndefOr[Double] = spacingBottom
    val spacingLeftOuter: js.UndefOr[Double] = spacingLeft
    val spacingRightOuter: js.UndefOr[Double] = spacingRight
    val spacingTopOuter: js.UndefOr[Double] = spacingTop
    val styleOuter: js.UndefOr[js.Object] = style
    val typeOuter: js.UndefOr[String] = `type`
    val zoomTypeOuter: js.UndefOr[String] = zoomType
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val plotBackgroundColorOuter: js.UndefOr[String | js.Object] = plotBackgroundColor
    val plotBackgroundImageOuter: js.UndefOr[String] = plotBackgroundImage
    val scrollablePlotAreaOuter: js.Any = scrollablePlotArea
    val options3dOuter: js.Any = options3d
    com.highcharts.HighchartsGenericObject.toCleanObject(new Chart {
      override val zoomKey: js.UndefOr[String] = zoomKeyOuter
      override val events: js.Any = eventsOuter
      override val parallelCoordinates: js.UndefOr[Boolean] = parallelCoordinatesOuter
      override val parallelAxes: js.Any = parallelAxesOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val typeDescription: js.UndefOr[String] = typeDescriptionOuter
      override val borderRadius: js.UndefOr[Double] = borderRadiusOuter
      override val colorCount: js.UndefOr[Double] = colorCountOuter
      override val defaultSeriesType: js.UndefOr[String] = defaultSeriesTypeOuter
      override val ignoreHiddenSeries: js.UndefOr[Boolean] = ignoreHiddenSeriesOuter
      override val spacing: js.UndefOr[js.Array[Double]] = spacingOuter
      override val resetZoomButton: js.Any = resetZoomButtonOuter
      override val width: js.UndefOr[Double | Null] = widthOuter
      override val height: js.UndefOr[Double | String | Null] = heightOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val plotBorderColor: js.UndefOr[String | js.Object] = plotBorderColorOuter
      override val map: js.UndefOr[String | js.Array[js.Any]] = mapOuter
      override val mapTransforms: js.Any = mapTransformsOuter
      override val alignTicks: js.UndefOr[Boolean] = alignTicksOuter
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val margin: js.UndefOr[Double | js.Array[Double]] = marginOuter
      override val marginBottom: js.UndefOr[Double] = marginBottomOuter
      override val marginLeft: js.UndefOr[Double] = marginLeftOuter
      override val marginRight: js.UndefOr[Double] = marginRightOuter
      override val marginTop: js.UndefOr[Double] = marginTopOuter
      override val panKey: js.UndefOr[String] = panKeyOuter
      override val panning: js.UndefOr[Boolean] = panningOuter
      override val pinchType: js.UndefOr[String] = pinchTypeOuter
      override val inverted: js.UndefOr[Boolean] = invertedOuter
      override val plotBorderWidth: js.UndefOr[Double] = plotBorderWidthOuter
      override val plotShadow: js.UndefOr[Boolean | js.Object] = plotShadowOuter
      override val polar: js.UndefOr[Boolean] = polarOuter
      override val reflow: js.UndefOr[Boolean] = reflowOuter
      override val renderTo: js.UndefOr[String] = renderToOuter
      override val selectionMarkerFill: js.UndefOr[String | js.Object] = selectionMarkerFillOuter
      override val shadow: js.UndefOr[Boolean | js.Object] = shadowOuter
      override val showAxes: js.UndefOr[Boolean] = showAxesOuter
      override val spacingBottom: js.UndefOr[Double] = spacingBottomOuter
      override val spacingLeft: js.UndefOr[Double] = spacingLeftOuter
      override val spacingRight: js.UndefOr[Double] = spacingRightOuter
      override val spacingTop: js.UndefOr[Double] = spacingTopOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val `type`: js.UndefOr[String] = typeOuter
      override val zoomType: js.UndefOr[String] = zoomTypeOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val plotBackgroundColor: js.UndefOr[String | js.Object] = plotBackgroundColorOuter
      override val plotBackgroundImage: js.UndefOr[String] = plotBackgroundImageOuter
      override val scrollablePlotArea: js.Any = scrollablePlotAreaOuter
      override val options3d: js.Any = options3dOuter
    })
  }
}
