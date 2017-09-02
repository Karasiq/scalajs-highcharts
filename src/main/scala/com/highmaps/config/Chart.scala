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
    *  	<dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>
    *  </dl>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/animation-none/" target="_blank">Updating with no animation</a>, 
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/animation-duration/" target="_blank">with a longer duration</a>.
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * The background color or gradient for the outer chart area.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/backgroundcolor-color/" target="_blank">Color</a>,
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/backgroundcolor-gradient/" target="_blank">gradient</a>
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The color of the outer chart border.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/border/" target="_blank">Border options</a>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The corner radius of the outer chart border.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/border/" target="_blank">Border options</a>
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The pixel width of the outer chart border.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/border/" target="_blank">Border options</a>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * A CSS class name to apply to the charts container <code>div</code>, allowing unique CSS styling for each chart.
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, this sets how many colors the class names should rotate between. With ten colors, series (or points) are given class names like <code>highcharts-color-0</code>, <code>highcharts-color-0</code> [...] <code>highcharts-color-9</code>. The equivalent in non-styled mode is to set colors using the <a href="#colors">colors</a> setting.
    * @since 5.0.0
    */
  val colorCount: js.UndefOr[Double] = js.undefined

  /**
    * <p>A text description of the chart.</p>
    * 
    * <p>If the Accessibility module is loaded, this is included by default as a long description of the chart and its contents in the hidden screen reader information region.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/accessible-line/">Accessible line chart</a>
    * @since 5.0.0
    */
  val description: js.UndefOr[String] = js.undefined

  /**
    * Event listeners for the chart.
    */
  val events: js.UndefOr[CleanJsObject[ChartEvents]] = js.undefined

  /**
    * <p>An explicit height for the chart. If a <em>number</em>, the height is given in pixels. If given a <em>percentage string</em> (for example <code>'56%'</code>), the height is given as the percentage of the actual chart width. This allows for preserving the aspect ratio across responsive sizes.</p>
    * 
    * <p>By default (when <code>null</code>) the height is calculated from the offset height of the containing element, or 400 pixels if the containing element's height is 0.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/size/" target="_blank">Chart with explicit size</a>.

<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/height-percent/" target="_blank">Highcharts with percentage height</a>.
    */
  val height: js.UndefOr[Double | String] = js.undefined

  /**
    * Default <code>mapData</code> for all series.
    * 
    * If set to a string, it functions as an index into the <code>Highcharts.maps</code> array.
    * 
    * Otherwise it is interpreted as map data.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/accessibility/accessible-map/">Accessible map</a>
    * @since 5.0.0
    */
  val map: js.UndefOr[String | js.Object | js.Array[js.Object]] = js.undefined

  /**
    * Set lat/lon transformation definitions for the chart. If not defined, these are extracted from the map data.
    * @since 5.0.0
    */
  val mapTransforms: js.UndefOr[js.Object] = js.undefined

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
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/margin/" target="_blank">100px margins</a>
    */
  val marginBottom: js.UndefOr[Double] = js.undefined

  /**
    * The margin between the left outer edge of the chart and the plot area. Use this to set a fixed
    *  pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingLeft</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/margin/" target="_blank">100px margins</a>
    */
  val marginLeft: js.UndefOr[Double] = js.undefined

  /**
    * The margin between the right outer edge of the chart and the plot area. Use this to set a fixed
    *  pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingRight</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/margin/" target="_blank">100px margins</a>
    */
  val marginRight: js.UndefOr[Double] = js.undefined

  /**
    * The margin between the top outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingTop</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/margin/" target="_blank">100px margins</a>
    */
  val marginTop: js.UndefOr[Double] = js.undefined

  /**
    * The background color or gradient for the plot area.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotbackgroundcolor-color/" target="_blank">Color</a>,
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotbackgroundcolor-gradient/" target="_blank">gradient</a>
    */
  val plotBackgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The URL for an image to use as the plot background. To set an image as the background for the entire chart, set a CSS background image to the container element. Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server.
    */
  val plotBackgroundImage: js.UndefOr[String] = js.undefined

  /**
    * The color of the inner chart or plot area border.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotborder/" target="_blank">Plot border options</a>
    */
  val plotBorderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pixel width of the plot area border.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotborder/" target="_blank">Plot border options</a>
    */
  val plotBorderWidth: js.UndefOr[Double] = js.undefined

  /**
    * Whether to apply a drop shadow to the plot area. Requires that plotBackgroundColor be set. The shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotborder/" target="_blank">Plot border options</a>
    */
  val plotShadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * Whether to reflow the chart to fit the width of the container div on resizing the window.
    * @example Move the bar between the JavaScript frame and the Preview frame to see the effect: 
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/reflow-true/" target="_blank">True by default</a>, 
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/reflow-false/" target="_blank">false</a>.
    */
  val reflow: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The HTML element where the chart will be rendered. If it is a string, the element by that id is used. The HTML element can also be passed by direct reference, or as the first argument of the chart constructor, in which case the option is not needed.</p>
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
  val selectionMarkerFill: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Whether to apply a drop shadow to the outer chart area. Requires that 
    *  backgroundColor be set. The shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/border/" target="_blank">Chart border and shadow</a>
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * The distance between the outer edge of the chart and the content, like title or legend, or axis title or labels if present. The numbers in the array designate top, right, bottom and left respectively. Use the options spacingTop, spacingRight, spacingBottom and spacingLeft options for shorthand setting of one option.
    */
  val spacing: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * <p>The space between the bottom edge of the chart and the content (plot area, title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/spacing/" target="_blank">Spacing 100 all around</a>.
    */
  val spacingBottom: js.UndefOr[Double] = js.undefined

  /**
    * <p>The space between the left edge of the chart and the content (plot area,title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/spacing/" target="_blank">Spacing 100 all around</a>.
    */
  val spacingLeft: js.UndefOr[Double] = js.undefined

  /**
    * <p>The space between the right edge of the chart and the content (plot area, title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/spacing/" target="_blank">Spacing 100 all around</a>
    */
  val spacingRight: js.UndefOr[Double] = js.undefined

  /**
    * <p>The space between the top edge of the chart and the content (plot area, title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/spacing/" target="_blank">Spacing 100 all around</a>.
    */
  val spacingTop: js.UndefOr[Double] = js.undefined

  /**
    * Additional CSS styles to apply inline to the container <code>div</code>. Note that since the default font styles are applied in the renderer, it is ignorant of the individual chart  options and must be set globally.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/style-serif-font/" target="_blank">Using a serif type font</a>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The default series type for the chart. Can be any of the chart types listed under <a href="#plotOptions">plotOptions</a>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/type-mapline/" target="_blank">mapline</a>
    */
  val `type`: js.UndefOr[String] = js.undefined

  /**
    * <p>A text description of the chart type.</p> 
    * <p>If the Accessibility module is loaded, this will be included in the description of the chart in the screen reader information region.</p>
    * <p>Highcharts will by default attempt to guess the chart type, but for more complex charts it is recommended to specify this property for clarity.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/advanced-accessible/">Accessible complex chart</a>
    * @since 5.0.0
    */
  val typeDescription: js.UndefOr[String] = js.undefined

  /**
    * An explicit width for the chart. By default (when <code>null</code>) the width is calculated from the offset width of the containing element.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/size/" target="_blank">Chart with explicit size</a>
    */
  val width: js.UndefOr[Double] = js.undefined
}

object Chart {
  /**
    * @param animation <p>Set the overall animation for all chart updating. Animation can be disabled throughout.  the chart by setting it to false here. It can be overridden for each individual.  API method as a function parameter. The only animation not affected by this option is the .  initial series animation, see <a class="internal" href="#plotOptions.series.animation">plotOptions.series.animation</a>.</p>.  .  <p>The animation can either be set as a boolean or a configuration object. If <code>true</code>,.  it will use the 'swing' jQuery easing and a duration of 500 ms. If used as a configuration object,.  the following properties are supported: .  </p><dl>.  	<dt>duration</dt>.  	<dd>The duration of the animation in milliseconds.</dd>.  	.  	<dt>easing</dt>.  	<dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>.  </dl>
    * @param backgroundColor The background color or gradient for the outer chart area.
    * @param borderColor The color of the outer chart border.
    * @param borderRadius The corner radius of the outer chart border.
    * @param borderWidth The pixel width of the outer chart border.
    * @param className A CSS class name to apply to the charts container <code>div</code>, allowing unique CSS styling for each chart.
    * @param colorCount In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, this sets how many colors the class names should rotate between. With ten colors, series (or points) are given class names like <code>highcharts-color-0</code>, <code>highcharts-color-0</code> [...] <code>highcharts-color-9</code>. The equivalent in non-styled mode is to set colors using the <a href="#colors">colors</a> setting.
    * @param description <p>A text description of the chart.</p>. . <p>If the Accessibility module is loaded, this is included by default as a long description of the chart and its contents in the hidden screen reader information region.</p>
    * @param events Event listeners for the chart.
    * @param height <p>An explicit height for the chart. If a <em>number</em>, the height is given in pixels. If given a <em>percentage string</em> (for example <code>'56%'</code>), the height is given as the percentage of the actual chart width. This allows for preserving the aspect ratio across responsive sizes.</p>. . <p>By default (when <code>null</code>) the height is calculated from the offset height of the containing element, or 400 pixels if the containing element's height is 0.</p>
    * @param map Default <code>mapData</code> for all series.. . If set to a string, it functions as an index into the <code>Highcharts.maps</code> array.. . Otherwise it is interpreted as map data.
    * @param mapTransforms Set lat/lon transformation definitions for the chart. If not defined, these are extracted from the map data.
    * @param margin <p>The margin between the outer edge of the chart and the plot area. The numbers in the array designate top, right, bottom and left respectively. Use the options <code>marginTop</code>, <code>marginRight</code>, <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of one option.</p> . . <p>By default there is no margin. The actual space is dynamically calculated  from the offset of axis labels, axis title, title, subtitle and legend in addition to the <code>spacingTop</code>, <code>spacingRight</code>, <code>spacingBottom</code> and <code>spacingLeft</code> options.</p>. 		 Defaults to <code>[null]</code>.
    * @param marginBottom The margin between the bottom outer edge of the chart and the plot area. Use this to set a fixed.  pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingBottom</code>.
    * @param marginLeft The margin between the left outer edge of the chart and the plot area. Use this to set a fixed.  pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingLeft</code>.
    * @param marginRight The margin between the right outer edge of the chart and the plot area. Use this to set a fixed.  pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingRight</code>.
    * @param marginTop The margin between the top outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingTop</code>.
    * @param plotBackgroundColor The background color or gradient for the plot area.
    * @param plotBackgroundImage The URL for an image to use as the plot background. To set an image as the background for the entire chart, set a CSS background image to the container element. Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server.
    * @param plotBorderColor The color of the inner chart or plot area border.
    * @param plotBorderWidth The pixel width of the plot area border.
    * @param plotShadow Whether to apply a drop shadow to the plot area. Requires that plotBackgroundColor be set. The shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @param reflow Whether to reflow the chart to fit the width of the container div on resizing the window.
    * @param renderTo <p>The HTML element where the chart will be rendered. If it is a string, the element by that id is used. The HTML element can also be passed by direct reference, or as the first argument of the chart constructor, in which case the option is not needed.</p>
    * @param resetZoomButton <p>The button that appears after a selection zoom, allowing the user to reset zoom. In Highmaps, the reset zoom button is rarely used, as the controls for mapNavigation are used instead.</p>. . <p>For live demos, see the <a href="/highcharts/#chart.resetZoomButton">resetZoomButton options for basic Highcharts</a>.</p>
    * @param selectionMarkerFill The background color of the marker square when selecting (zooming in on) an area of the chart.
    * @param shadow Whether to apply a drop shadow to the outer chart area. Requires that .  backgroundColor be set. The shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @param spacing The distance between the outer edge of the chart and the content, like title or legend, or axis title or labels if present. The numbers in the array designate top, right, bottom and left respectively. Use the options spacingTop, spacingRight, spacingBottom and spacingLeft options for shorthand setting of one option.
    * @param spacingBottom <p>The space between the bottom edge of the chart and the content (plot area, title, subtitle or .  legend in top position).</p>
    * @param spacingLeft <p>The space between the left edge of the chart and the content (plot area,title, subtitle or .  legend in top position).</p>
    * @param spacingRight <p>The space between the right edge of the chart and the content (plot area, title, subtitle or .  legend in top position).</p>
    * @param spacingTop <p>The space between the top edge of the chart and the content (plot area, title, subtitle or .  legend in top position).</p>
    * @param style Additional CSS styles to apply inline to the container <code>div</code>. Note that since the default font styles are applied in the renderer, it is ignorant of the individual chart  options and must be set globally.
    * @param `type` The default series type for the chart. Can be any of the chart types listed under <a href="#plotOptions">plotOptions</a>.
    * @param typeDescription <p>A text description of the chart type.</p> . <p>If the Accessibility module is loaded, this will be included in the description of the chart in the screen reader information region.</p>. <p>Highcharts will by default attempt to guess the chart type, but for more complex charts it is recommended to specify this property for clarity.</p>
    * @param width An explicit width for the chart. By default (when <code>null</code>) the width is calculated from the offset width of the containing element.
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, colorCount: js.UndefOr[Double] = js.undefined, description: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[ChartEvents]] = js.undefined, height: js.UndefOr[Double | String] = js.undefined, map: js.UndefOr[String | js.Object | js.Array[js.Object]] = js.undefined, mapTransforms: js.UndefOr[js.Object] = js.undefined, margin: js.UndefOr[js.Array[js.Any]] = js.undefined, marginBottom: js.UndefOr[Double] = js.undefined, marginLeft: js.UndefOr[Double] = js.undefined, marginRight: js.UndefOr[Double] = js.undefined, marginTop: js.UndefOr[Double] = js.undefined, plotBackgroundColor: js.UndefOr[String | js.Object] = js.undefined, plotBackgroundImage: js.UndefOr[String] = js.undefined, plotBorderColor: js.UndefOr[String | js.Object] = js.undefined, plotBorderWidth: js.UndefOr[Double] = js.undefined, plotShadow: js.UndefOr[Boolean | js.Object] = js.undefined, reflow: js.UndefOr[Boolean] = js.undefined, renderTo: js.UndefOr[String | js.Object] = js.undefined, resetZoomButton: js.UndefOr[CleanJsObject[ChartResetZoomButton]] = js.undefined, selectionMarkerFill: js.UndefOr[String | js.Object] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, spacing: js.UndefOr[js.Array[Double]] = js.undefined, spacingBottom: js.UndefOr[Double] = js.undefined, spacingLeft: js.UndefOr[Double] = js.undefined, spacingRight: js.UndefOr[Double] = js.undefined, spacingTop: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, `type`: js.UndefOr[String] = js.undefined, typeDescription: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double] = js.undefined): Chart = {
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderRadiusOuter: js.UndefOr[Double] = borderRadius
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val classNameOuter: js.UndefOr[String] = className
    val colorCountOuter: js.UndefOr[Double] = colorCount
    val descriptionOuter: js.UndefOr[String] = description
    val eventsOuter: js.UndefOr[CleanJsObject[ChartEvents]] = events
    val heightOuter: js.UndefOr[Double | String] = height
    val mapOuter: js.UndefOr[String | js.Object | js.Array[js.Object]] = map
    val mapTransformsOuter: js.UndefOr[js.Object] = mapTransforms
    val marginOuter: js.UndefOr[js.Array[js.Any]] = margin
    val marginBottomOuter: js.UndefOr[Double] = marginBottom
    val marginLeftOuter: js.UndefOr[Double] = marginLeft
    val marginRightOuter: js.UndefOr[Double] = marginRight
    val marginTopOuter: js.UndefOr[Double] = marginTop
    val plotBackgroundColorOuter: js.UndefOr[String | js.Object] = plotBackgroundColor
    val plotBackgroundImageOuter: js.UndefOr[String] = plotBackgroundImage
    val plotBorderColorOuter: js.UndefOr[String | js.Object] = plotBorderColor
    val plotBorderWidthOuter: js.UndefOr[Double] = plotBorderWidth
    val plotShadowOuter: js.UndefOr[Boolean | js.Object] = plotShadow
    val reflowOuter: js.UndefOr[Boolean] = reflow
    val renderToOuter: js.UndefOr[String | js.Object] = renderTo
    val resetZoomButtonOuter: js.UndefOr[CleanJsObject[ChartResetZoomButton]] = resetZoomButton
    val selectionMarkerFillOuter: js.UndefOr[String | js.Object] = selectionMarkerFill
    val shadowOuter: js.UndefOr[Boolean | js.Object] = shadow
    val spacingOuter: js.UndefOr[js.Array[Double]] = spacing
    val spacingBottomOuter: js.UndefOr[Double] = spacingBottom
    val spacingLeftOuter: js.UndefOr[Double] = spacingLeft
    val spacingRightOuter: js.UndefOr[Double] = spacingRight
    val spacingTopOuter: js.UndefOr[Double] = spacingTop
    val styleOuter: js.UndefOr[js.Object] = style
    val typeOuter: js.UndefOr[String] = `type`
    val typeDescriptionOuter: js.UndefOr[String] = typeDescription
    val widthOuter: js.UndefOr[Double] = width
    new Chart {
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderRadius: js.UndefOr[Double] = borderRadiusOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val colorCount: js.UndefOr[Double] = colorCountOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val events: js.UndefOr[CleanJsObject[ChartEvents]] = eventsOuter
      override val height: js.UndefOr[Double | String] = heightOuter
      override val map: js.UndefOr[String | js.Object | js.Array[js.Object]] = mapOuter
      override val mapTransforms: js.UndefOr[js.Object] = mapTransformsOuter
      override val margin: js.UndefOr[js.Array[js.Any]] = marginOuter
      override val marginBottom: js.UndefOr[Double] = marginBottomOuter
      override val marginLeft: js.UndefOr[Double] = marginLeftOuter
      override val marginRight: js.UndefOr[Double] = marginRightOuter
      override val marginTop: js.UndefOr[Double] = marginTopOuter
      override val plotBackgroundColor: js.UndefOr[String | js.Object] = plotBackgroundColorOuter
      override val plotBackgroundImage: js.UndefOr[String] = plotBackgroundImageOuter
      override val plotBorderColor: js.UndefOr[String | js.Object] = plotBorderColorOuter
      override val plotBorderWidth: js.UndefOr[Double] = plotBorderWidthOuter
      override val plotShadow: js.UndefOr[Boolean | js.Object] = plotShadowOuter
      override val reflow: js.UndefOr[Boolean] = reflowOuter
      override val renderTo: js.UndefOr[String | js.Object] = renderToOuter
      override val resetZoomButton: js.UndefOr[CleanJsObject[ChartResetZoomButton]] = resetZoomButtonOuter
      override val selectionMarkerFill: js.UndefOr[String | js.Object] = selectionMarkerFillOuter
      override val shadow: js.UndefOr[Boolean | js.Object] = shadowOuter
      override val spacing: js.UndefOr[js.Array[Double]] = spacingOuter
      override val spacingBottom: js.UndefOr[Double] = spacingBottomOuter
      override val spacingLeft: js.UndefOr[Double] = spacingLeftOuter
      override val spacingRight: js.UndefOr[Double] = spacingRightOuter
      override val spacingTop: js.UndefOr[Double] = spacingTopOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val `type`: js.UndefOr[String] = typeOuter
      override val typeDescription: js.UndefOr[String] = typeDescriptionOuter
      override val width: js.UndefOr[Double] = widthOuter
    }
  }
}
