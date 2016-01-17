/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart</code>
  */
@js.annotation.ScalaJSDefined
class Chart extends js.Object {

  /**
    * <p>Set the overall animation for all chart updating. Animation can be disabled throughout
    *  the chart by setting it to false here. It can be overridden for each individual
    *  API method as a function parameter. The only animation not affected by this option is the 
    *  initial series animation, see <a class="internal" href="#plotOptions.series.animation">plotOptions.series.animation</a>.</p>
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/animation-none/" target="_blank">Updating with no animation</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/animation-duration/" target="_blank">with a longer duration</a>.
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * The background color or gradient for the outer chart area.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/backgroundcolor-color/" target="_blank">Color</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/backgroundcolor-gradient/" target="_blank">gradient</a>
    */
  val backgroundColor: js.UndefOr[String] = js.undefined

  /**
    * The color of the outer chart border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/border/" target="_blank">Border options</a>
    */
  val borderColor: js.UndefOr[String] = js.undefined

  /**
    * The corner radius of the outer chart border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/border/" target="_blank">Border options</a>
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The pixel width of the outer chart border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/border/" target="_blank">Border options</a>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * A CSS class name to apply to the charts container <code>div</code>, allowing unique CSS styling for each chart.
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * Event listeners for the chart.
    */
  val events: js.UndefOr[CleanJsObject[ChartEvents]] = js.undefined

  /**
    * An explicit height for the chart. By default the height is calculated from the offset height of the containing element, or 400 pixels if the containing element's height is 0.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/size/" target="_blank">Chart with explicit size</a>
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * <p>The margin between the outer edge of the chart and the plot area. The numbers in the array designate top, right, bottom and left respectively. Use the options <code>marginTop</code>, <code>marginRight</code>, <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of one option.</p> 
    * 
    * <p>By default there is no margin. The actual space is dynamically calculated  from the offset of axis labels, axis title, title, subtitle and legend in addition to the <code>spacingTop</code>, <code>spacingRight</code>, <code>spacingBottom</code> and <code>spacingLeft</code> options.</p>
    * 		 Defaults to <code>[null]</code>.
    */
  val margin: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * The margin between the bottom outer edge of the chart and the plot area. Use this to set a fixed
    *  pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingBottom</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/margin/" target="_blank">100px margins</a>
    */
  val marginBottom: js.UndefOr[Double] = js.undefined

  /**
    * The margin between the left outer edge of the chart and the plot area. Use this to set a fixed
    *  pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingLeft</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/margin/" target="_blank">100px margins</a>
    */
  val marginLeft: js.UndefOr[Double] = js.undefined

  /**
    * The margin between the right outer edge of the chart and the plot area. Use this to set a fixed
    *  pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingRight</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/margin/" target="_blank">100px margins</a>
    */
  val marginRight: js.UndefOr[Double] = js.undefined

  /**
    * The margin between the top outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingTop</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/margin/" target="_blank">100px margins</a>
    */
  val marginTop: js.UndefOr[Double] = js.undefined

  /**
    * The background color or gradient for the plot area.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/plotbackgroundcolor-color/" target="_blank">Color</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/plotbackgroundcolor-gradient/" target="_blank">gradient</a>
    */
  val plotBackgroundColor: js.UndefOr[String] = js.undefined

  /**
    * The URL for an image to use as the plot background. To set an image as the background for the entire chart, set a CSS background image to the container element. Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server.
    */
  val plotBackgroundImage: js.UndefOr[String] = js.undefined

  /**
    * The color of the inner chart or plot area border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/plotborder/" target="_blank">Plot border options</a>
    */
  val plotBorderColor: js.UndefOr[String] = js.undefined

  /**
    * The pixel width of the plot area border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/plotborder/" target="_blank">Plot border options</a>
    */
  val plotBorderWidth: js.UndefOr[Double] = js.undefined

  /**
    * Whether to apply a drop shadow to the plot area. Requires that plotBackgroundColor be set. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/plotborder/" target="_blank">Plot border options</a>
    */
  val plotShadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * Whether to reflow the chart to fit the width of the container div on resizing the window.
    * @example Move the bar between the JavaScript frame and the Preview frame to see the effect: 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/reflow-true/" target="_blank">True by default</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/reflow-false/" target="_blank">false</a>.
    */
  val reflow: js.UndefOr[Boolean] = js.undefined

  /**
    * The HTML element where the chart will be rendered. If it is a string, the element by that id is used. The HTML element can also be passed by direct reference. The preferred way of adding a chart to a container is to use the jQuery plugin syntax.
    */
  val renderTo: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The button that appears after a selection zoom, allowing the user to reset zoom. In Highmaps, the reset zoom button is rarely used, as the controls for mapNavigation are used instead.</p>
    * 
    * <p>For live demos, see the <a href="/highcharts/#chart.resetZoomButton">resetZoomButton options for basic Highcharts</a>.</p>
    */
  val resetZoomButton: js.UndefOr[CleanJsObject[ChartResetZoomButton]] = js.undefined

  /**
    * The background color of the marker square when selecting (zooming in on) an area of the chart.
    */
  val selectionMarkerFill: js.UndefOr[String] = js.undefined

  /**
    * Whether to apply a drop shadow to the outer chart area. Requires that 
    *  backgroundColor be set. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/border/" target="_blank">Chart border and shadow</a>
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * The distance between the outer edge of the chart and the content, like title and legend. The numbers in the array designate top, right, bottom and left respectively. Use the options spacingTop, spacingRight, spacingBottom and spacingLeft options for shorthand setting of one option.
    */
  val spacing: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * <p>The space between the bottom edge of the chart and the content (plot area, title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/spacing/" target="_blank">Spacing 100 all around</a>.
    */
  val spacingBottom: js.UndefOr[Double] = js.undefined

  /**
    * <p>The space between the left edge of the chart and the content (plot area,title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/spacing/" target="_blank">Spacing 100 all around</a>.
    */
  val spacingLeft: js.UndefOr[Double] = js.undefined

  /**
    * <p>The space between the right edge of the chart and the content (plot area, title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/spacing/" target="_blank">Spacing 100 all around</a>
    */
  val spacingRight: js.UndefOr[Double] = js.undefined

  /**
    * <p>The space between the top edge of the chart and the content (plot area, title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/spacing/" target="_blank">Spacing 100 all around</a>.
    */
  val spacingTop: js.UndefOr[Double] = js.undefined

  /**
    * Additional CSS styles to apply inline to the container <code>div</code>. Note that since the default font styles are applied in the renderer, it is ignorant of the individual chart  options and must be set globally. Defaults to:
    * <pre>style: {
    * 	fontFamily: '"Lucida Grande", "Lucida Sans Unicode", Verdana, Arial, Helvetica, sans-serif', // default font
    * 	fontSize: '12px'
    * }</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/style-serif-font/" target="_blank">Using a serif type font</a>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The default series type for the chart. Can be any of the chart types listed under <a href="#plotOptions">plotOptions</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/type-mapline/" target="_blank">mapline</a>
    */
  val `type`: js.UndefOr[String] = js.undefined

  /**
    * An explicit width for the chart. By default the width is calculated from the offset width of the containing element.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/size/" target="_blank">Chart with explicit size</a>
    */
  val width: js.UndefOr[Double] = js.undefined
}
