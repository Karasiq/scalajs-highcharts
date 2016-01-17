/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart</code>
  */
@js.annotation.ScalaJSDefined
class Chart extends js.Object {

  /**
    * When using multiple axis, the ticks of two or more opposite axes will  automatically be aligned by adding ticks to the axis or axes with the least ticks. This can be prevented by setting <code>alignTicks</code> to false. If the grid lines look messy, it's a good idea to hide them for the secondary axis by setting <code>gridLineWidth</code> to 0.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/alignticks-true/" target="_blank">True by default</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/alignticks-false/" target="_blank">false</a>.
    */
  val alignTicks: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Set the overall animation for all chart updating. Animation can be disabled throughout
    *  the chart by setting it to false here. It can be overridden for each individual
    *  API method as a function parameter. The only animation not affected by this option is the 
    *  initial series animation, see <a class="internal" href="#plotOptions.series">plotOptions.series</a>
    *  =&gt; animation.</p>
    *  
    *  <p>The animation can either be set as a boolean or a configuration object. If <code>true</code>,
    *  it will use the 'swing' jQuery easing and a duration of 500 ms. If used as a configuration object,
    *  the following properties are supported: 
    *  </p><dl>
    *  	<dt>duration</dt>
    *  	<dd>The duration of the animation in milliseconds.</dd>
    *  	
    *  	<dt>easing</dt>
    *  	<dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>
    *  </dl>
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * The background color or gradient for the outer chart area.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/backgroundcolor-color/" target="_blank">Color</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/backgroundcolor-gradient/" target="_blank">gradient</a>
    */
  val backgroundColor: js.UndefOr[String] = js.undefined

  /**
    * The color of the outer chart border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/border/" target="_blank">Brown border</a>
    */
  val borderColor: js.UndefOr[String] = js.undefined

  /**
    * The corner radius of the outer chart border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/border/" target="_blank">10px radius</a>
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The pixel width of the outer chart border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/border/" target="_blank">2px border</a>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * A CSS class name to apply to the charts container <code>div</code>, allowing unique CSS styling
    *  for each chart.
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * Event listeners for the chart.
    */
  val events: js.UndefOr[CleanJsObject[ChartEvents]] = js.undefined

  /**
    * An explicit height for the chart. By default the height is calculated from the offset height of the containing element, or 400 pixels if the containing element's height is 0.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/height/" target="_blank">300px height</a>
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * If true, the axes will scale to the remaining visible series once one series is hidden. If false, hiding and showing a series will not affect the axes or the other series. For stacks, once one series within the stack is hidden, the rest of the stack will close in around it even if the axis is not affected.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/ignorehiddenseries-true/" target="_blank">True by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/ignorehiddenseries-false/" target="_blank">false</a>
    */
  val ignoreHiddenSeries: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The margin between the outer edge of the chart and the plot area. The numbers in the array designate top, right, bottom and left respectively. Use the options <code>marginTop</code>, <code>marginRight</code>, <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of one option.</p> <p>Since version 2.1, the margin is 0 by default. The actual space is dynamically calculated  from the offset of axis labels, axis title, title, subtitle and legend in addition to the <code>spacingTop</code>, <code>spacingRight</code>, <code>spacingBottom</code> and <code>spacingLeft</code> options.</p>
    * 		 Defaults to <code>[null]</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/margin-zero/" target="_blank">Zero margins</a>
    */
  val margin: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * The margin between the bottom outer edge of the chart and the plot area. Use this to set a fixed
    *  pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingBottom</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/marginbottom/" target="_blank">100px bottom margin</a>
    */
  val marginBottom: js.UndefOr[Double] = js.undefined

  /**
    * The margin between the left outer edge of the chart and the plot area. Use this to set a fixed
    *  pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingLeft</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/marginleft/" target="_blank">150px left margin</a>
    */
  val marginLeft: js.UndefOr[Double] = js.undefined

  /**
    * The margin between the right outer edge of the chart and the plot area. Use this to set a fixed
    *  pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingRight</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/marginright/" target="_blank">100px right margin</a>
    */
  val marginRight: js.UndefOr[Double] = js.undefined

  /**
    * The margin between the top outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingTop</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/margintop/" target="_blank">100px top margin</a>
    */
  val marginTop: js.UndefOr[Double] = js.undefined

  /**
    * Allow panning the zoomed area by click and drag on the chart. When the <code>zoomType</code> option is set, panning is disabled.
    */
  val panning: js.UndefOr[Boolean] = js.undefined

  /**
    * Equivalent to <a href="#chart.zoomType">zoomType</a>, but for multitouch gestures only. By default, the <code>pinchType</code> is the same as the <code>zoomType</code> setting. However, pinching can be enabled separately in some cases, for example in stock charts where a mouse drag pans the chart, while pinching is enabled.
    * @since 1.3
    */
  val pinchType: js.UndefOr[String] = js.undefined

  /**
    * The background color or gradient for the plot area.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/plotbackgroundcolor-color/" target="_blank">Color</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/plotbackgroundcolor-gradient/" target="_blank">gradient</a>
    */
  val plotBackgroundColor: js.UndefOr[String] = js.undefined

  /**
    * The URL for an image to use as the plot background. To set an image as the background for the entire chart, set a CSS background image to the container element. Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/plotbackgroundimage/" target="_blank">Skies</a>
    */
  val plotBackgroundImage: js.UndefOr[String] = js.undefined

  /**
    * The color of the inner chart or plot area border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/plotborder/" target="_blank">Blue border</a>
    */
  val plotBorderColor: js.UndefOr[String] = js.undefined

  /**
    * The pixel width of the plot area border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/plotborder/" target="_blank">2px border</a>
    */
  val plotBorderWidth: js.UndefOr[Double] = js.undefined

  /**
    * Whether to apply a drop shadow to the plot area. Requires that plotBackgroundColor
    *  be set. Since 1.1.7 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/plotshadow/" target="_blank">Plot shadow</a>
    */
  val plotShadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * Whether to reflow the chart to fit the width of the container div on resizing the window.
    * @example Move the bar between the JavaScript frame and the Preview frame to see the effect: 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/reflow-true/" target="_blank">True by default</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/reflow-false/" target="_blank">false</a>.
    */
  val reflow: js.UndefOr[Boolean] = js.undefined

  /**
    * The HTML element where the chart will be rendered. If it is a string, the element by that id is used. The HTML element can also be passed by direct reference.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/renderto-string/" target="_blank">String</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/renderto-object/" target="_blank">object reference</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/renderto-jquery/" target="_blank">object reference through jQuery</a>,
    */
  val renderTo: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The background color of the marker square when selecting (zooming in on) an area of the chart.
    * 		 Defaults to <code>rgba(69,114,167,0.25)</code>.
    */
  val selectionMarkerFill: js.UndefOr[String] = js.undefined

  /**
    * Whether to apply a drop shadow to the outer chart area. Requires that 
    *  backgroundColor be set. Since 1.1.7 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/shadow/" target="_blank">Shadow</a>
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * The distance between the outer edge of the chart and the content, like title, legend, axis title or labels. The numbers in the array designate top, right, bottom and left respectively. Use the options spacingTop, spacingRight, spacingBottom and spacingLeft options for shorthand setting of one option.
    * @since 1.3.6
    */
  val spacing: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * <p>The space between the bottom edge of the chart and the content (plot area, axis title and labels, title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/spacingbottom/" target="_blank">Spacing bottom set to 100</a>.
    */
  val spacingBottom: js.UndefOr[Double] = js.undefined

  /**
    * <p>The space between the left edge of the chart and the content (plot area, axis title and labels, title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/spacingleft/" target="_blank">Spacing left set to 100</a>
    */
  val spacingLeft: js.UndefOr[Double] = js.undefined

  /**
    * <p>The space between the right edge of the chart and the content (plot area, axis title and labels, title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/spacingright/" target="_blank">Spacing set to 100</a>
    */
  val spacingRight: js.UndefOr[Double] = js.undefined

  /**
    * <p>The space between the top edge of the chart and the content (plot area, axis title and labels, title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/spacingtop/" target="_blank">A top spacing of 100</a>
    */
  val spacingTop: js.UndefOr[Double] = js.undefined

  /**
    * Additional CSS styles to apply inline to the container <code>div</code>. Note that since the default font styles are applied in the renderer, it is ignorant of the individual chart  options and must be set globally. Defaults to:
    * <pre>style: {
    * 	fontFamily: '"Lucida Grande", "Lucida Sans Unicode", Verdana, Arial, Helvetica, sans-serif', // default font
    * 	fontSize: '12px'
    * }</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/style/" target="_blank">Using a serif type font</a>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The default series type for the chart. Can be any of the chart types listed under <a href="#plotOptions">plotOptions</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/type/" target="_blank">Areaspline</a>
    */
  val `type`: js.UndefOr[String] = js.undefined

  /**
    * An explicit width for the chart. By default the width is calculated from the offset width of the containing element.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/width/" target="_blank">800px wide</a>
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * Decides in what dimensions the user can zoom by dragging the mouse. Can be one of <code>x</code>, <code>y</code> or <code>xy</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/demo/basic-line/" target="_blank">None by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/zoomtype-x/" target="_blank">x</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/zoomtype-y/" target="_blank">y</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/zoomtype-xy/" target="_blank">xy</a>
    */
  val zoomType: js.UndefOr[String] = js.undefined
}
