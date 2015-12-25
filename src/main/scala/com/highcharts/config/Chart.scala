/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.5 by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js

/**
  * @note JavaScript name: <code>chart</code>
  */
@js.annotation.ScalaJSDefined
class Chart extends js.Object {

  /**
    * When using multiple axis, the ticks of two or more opposite axes will  automatically be aligned by adding ticks to the axis or axes with the least ticks. This can be prevented by setting <code>alignTicks</code> to false. If the grid lines look messy, it's a good idea to hide them for the secondary axis by setting <code>gridLineWidth</code> to 0.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/alignticks-true/" target="_blank">True by default</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/alignticks-false/" target="_blank">false</a>.
    */
  val alignTicks: Boolean = true

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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/animation-none/" target="_blank">Updating with no animation</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/animation-duration/" target="_blank">with a longer duration</a>,  
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/animation-easing/" target="_blank">with a jQuery UI easing</a>.
    */
  val animation: js.Any = true

  /**
    * The background color or gradient for the outer chart area.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/backgroundcolor-color/" target="_blank">Color</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/backgroundcolor-gradient/" target="_blank">gradient</a>
    */
  val backgroundColor: String = "#FFFFFF"

  /**
    * The color of the outer chart border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/bordercolor/" target="_blank">Brown border</a>
    */
  val borderColor: String = "#4572A7"

  /**
    * The corner radius of the outer chart border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/borderradius/" target="_blank">20px radius</a>
    */
  val borderRadius: Double = 0

  /**
    * The pixel width of the outer chart border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/borderwidth/" target="_blank">5px border</a>
    */
  val borderWidth: Double = 0

  /**
    * A CSS class name to apply to the charts container <code>div</code>, allowing unique CSS styling for each chart.
    */
  val className: String = js.undefined.asInstanceOf[String]

  /**
    * Alias of <code>type</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/defaultseriestype/" target="_blank">Bar</a>
    */
  val defaultSeriesType: String = "line"

  /**
    * Event listeners for the chart.
    */
  val events: ChartEvents = new ChartEvents

  /**
    * An explicit height for the chart. By default the height is calculated from the offset height of the containing element, or 400 pixels if the containing element's height is 0.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/height/" target="_blank">500px height</a>
    */
  val height: Double = js.undefined.asInstanceOf[Double]

  /**
    * If true, the axes will scale to the remaining visible series once one series is hidden. If false, hiding and showing a series will not affect the axes or the other series. For stacks, once one series within the stack is hidden, the rest of the stack will close in around it even if the axis is not affected.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/ignorehiddenseries-true/" target="_blank">True by default</a>
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/ignorehiddenseries-false/" target="_blank">false</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/ignorehiddenseries-true-stacked/" target="_blank">true with stack</a>
    * @since 1.2.0
    */
  val ignoreHiddenSeries: Boolean = true

  /**
    * Whether to invert the axes so that the x axis is vertical and y axis is horizontal.
    *  When true, the x axis is reversed by default. If a bar series is present in the chart,
    *  it will be inverted automatically.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/inverted/" target="_blank">Inverted line</a>
    */
  val inverted: Boolean = false

  /**
    * <p>The margin between the outer edge of the chart and the plot area. The numbers in the array designate top, right, bottom and left respectively. Use the options <code>marginTop</code>, <code>marginRight</code>, <code>marginBottom</code> and <code>marginLeft</code> for shorthand setting of one option.</p> <p>Since version 2.1, the margin is 0 by default. The actual space is dynamically calculated  from the offset of axis labels, axis title, title, subtitle and legend in addition to the <code>spacingTop</code>, <code>spacingRight</code>, <code>spacingBottom</code> and <code>spacingLeft</code> options.</p>
    * 		 Defaults to <code>[null]</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/margins-zero/" target="_blank">Zero margins</a>
    */
  val margin: js.Array[js.Any] = js.undefined.asInstanceOf[js.Array[js.Any]]

  /**
    * The margin between the bottom outer edge of the chart and the plot area. Use this to set a fixed
    *  pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingBottom</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/marginbottom/" target="_blank">100px bottom margin</a>
    * @since 2.0
    */
  val marginBottom: Double = js.undefined.asInstanceOf[Double]

  /**
    * The margin between the left outer edge of the chart and the plot area. Use this to set a fixed
    *  pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingLeft</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/marginleft/" target="_blank">150px left margin</a>
    * @since 2.0
    */
  val marginLeft: Double = js.undefined.asInstanceOf[Double]

  /**
    * The margin between the right outer edge of the chart and the plot area. Use this to set a fixed
    *  pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingRight</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/marginright/" target="_blank">100px right margin</a>
    * @since 2.0
    */
  val marginRight: Double = js.undefined.asInstanceOf[Double]

  /**
    * The margin between the top outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the default dynamic margin. See also <code>spacingTop</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/margintop/" target="_blank">100px top margin</a>
    * @since 2.0
    */
  val marginTop: Double = js.undefined.asInstanceOf[Double]

  /**
    * Options to render charts in 3 dimensions. This feature requires <code>highcharts-3d.js</code>, found in the download package or online at <a href="http://code.highcharts.com/highcharts-3d.js">code.highcharts.com/highcharts-3d.js</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/3d/column/">Basic 3D columns</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/3d-pie/">basic 3D pie</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/3d/scatter/">basic 3D scatter chart</a>.
    * @since 4.0
    */
  val options3d: ChartOptions3d = new ChartOptions3d

  /**
    * Allows setting a key to switch between zooming and panning. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/pankey/" target="_blank">Hold down <em>shift</em> to pan</a>
    * @since 4.0.3
    */
  val panKey: String = ""

  /**
    * Allow panning in a chart. Best used with <a href="#chart.panKey">panKey</a> to combine zooming and panning.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/pankey/" target="_blank">Zooming and panning</a>
    * @since 4.0.3
    */
  val panning: Boolean = false

  /**
    * Equivalent to <a href="#chart.zoomType">zoomType</a>, but for multitouch gestures only. By default, the <code>pinchType</code> is the same as the <code>zoomType</code> setting. However, pinching can be enabled separately in some cases, for example in stock charts where a mouse drag pans the chart, while pinching is enabled.
    * @since 3.0
    */
  val pinchType: String = null.asInstanceOf[String]

  /**
    * The background color or gradient for the plot area.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/plotbackgroundcolor-color/" target="_blank">Color</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/plotbackgroundcolor-gradient/" target="_blank">gradient</a>
    */
  val plotBackgroundColor: String = js.undefined.asInstanceOf[String]

  /**
    * The URL for an image to use as the plot background. To set an image as the background for the entire chart, set a CSS background image to the container element. Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/plotbackgroundimage/" target="_blank">Skies</a>
    */
  val plotBackgroundImage: String = js.undefined.asInstanceOf[String]

  /**
    * The color of the inner chart or plot area border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/plotbordercolor/" target="_blank">Blue border</a>
    */
  val plotBorderColor: String = "#C0C0C0"

  /**
    * The pixel width of the plot area border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/plotborderwidth/" target="_blank">1px border</a>
    */
  val plotBorderWidth: Double = 0

  /**
    * Whether to apply a drop shadow to the plot area. Requires that plotBackgroundColor be set. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/plotshadow/" target="_blank">Plot shadow</a>
    */
  val plotShadow: js.Any = false

  /**
    * When true, cartesian charts like line, spline, area and column are transformed into the polar coordinate system. Requires <code>highcharts-more.js</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/polar-line/">Polar line</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/polar-area/">polar area</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/alignticks-true/">polar column</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/polar/">combined series types</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/polar-spider/">spider chart</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/polar-wind-rose/">wind rose</a>.
    * @since 2.3.0
    */
  val polar: Boolean = false

  /**
    * Whether to reflow the chart to fit the width of the container div on resizing the window.
    * @example Move the bar between the JavaScript frame and the Preview frame to see the effect: 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/reflow-true/" target="_blank">True by default</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/reflow-false/" target="_blank">false</a>.
    * @since 2.1
    */
  val reflow: Boolean = true

  /**
    * The HTML element where the chart will be rendered. If it is a string, the element by that id is used. The HTML element can also be passed by direct reference.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/reflow-true/" target="_blank">String</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/renderto-object/" target="_blank">object reference</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/renderto-jquery/" target="_blank">object reference through jQuery</a>,
    */
  val renderTo: js.Any = js.undefined.asInstanceOf[js.Any]

  /**
    * The button that appears after a selection zoom, allowing the user to reset zoom.
    */
  val resetZoomButton: ChartResetZoomButton = new ChartResetZoomButton

  /**
    * The background color of the marker square when selecting (zooming in on) an area of the chart.
    * @since 2.1.7
    */
  val selectionMarkerFill: String = "rgba(69,114,167,0.25)"

  /**
    * Whether to apply a drop shadow to the outer chart area. Requires that 
    *  backgroundColor be set. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/shadow/" target="_blank">Shadow</a>
    */
  val shadow: js.Any = false

  /**
    * Whether to show the axes initially. This only applies to empty charts where series are added dynamically, as axes are automatically added to cartesian series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/showaxes-false/" target="_blank">False by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/showaxes-true/" target="_blank">true</a>
    * @since 1.2.5
    */
  val showAxes: Boolean = false

  /**
    * The distance between the outer edge of the chart and the content, like title, legend, axis title or labels. The numbers in the array designate top, right, bottom and left respectively. Use the options spacingTop, spacingRight, spacingBottom and spacingLeft options for shorthand setting of one option.
    * @since 3.0.6
    */
  val spacing: js.Array[Double] = js.Array(10, 10, 15, 10)

  /**
    * <p>The space between the bottom edge of the chart and the content (plot area, axis title and labels, title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/spacingbottom/" target="_blank">Spacing bottom set to 100</a>.
    * @since 2.1
    */
  val spacingBottom: Double = 15

  /**
    * <p>The space between the left edge of the chart and the content (plot area, axis title and labels, title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/spacingleft/" target="_blank">Spacing left set to 100</a>
    * @since 2.1
    */
  val spacingLeft: Double = 10

  /**
    * <p>The space between the right edge of the chart and the content (plot area, axis title and labels, title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/spacingright-100/" target="_blank">Spacing set to 100</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/spacingright-legend/" target="_blank">legend in right position with default spacing</a>
    * @since 2.1
    */
  val spacingRight: Double = 10

  /**
    * <p>The space between the top edge of the chart and the content (plot area, axis title and labels, title, subtitle or 
    *  legend in top position).</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/spacingtop-100/" target="_blank">A top spacing of 100</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/spacingtop-10/" target="_blank">floating chart title makes the plot area align to the 
			default spacingTop of 10.</a>.
    * @since 2.1
    */
  val spacingTop: Double = 10

  /**
    * Additional CSS styles to apply inline to the container <code>div</code>. Note that since the default font styles are applied in the renderer, it is ignorant of the individual chart  options and must be set globally. Defaults to:
    * <pre>style: {
    * 	fontFamily: '"Lucida Grande", "Lucida Sans Unicode", Verdana, Arial, Helvetica, sans-serif', // default font
    * 	fontSize: '12px'
    * }</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/style-serif-font/" target="_blank">Using a serif type font</a>
    */
  val style: js.Object = js.eval("{\"fontFamily\":\"\\\"Lucida Grande\\\", \\\"Lucida Sans Unicode\\\", Verdana, Arial, Helvetica, sans-serif\",\"fontSize\":\"12px\"}").asInstanceOf[js.Object]

  /**
    * The default series type for the chart. Can be any of the chart types listed under <a href="#plotOptions">plotOptions</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/type-bar/" target="_blank">Bar</a>
    * @since 2.1.0
    */
  val `type`: String = "line"

  /**
    * An explicit width for the chart. By default the width is calculated from the offset width of the containing element.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/width/" target="_blank">800px wide</a>
    */
  val width: Double = js.undefined.asInstanceOf[Double]

  /**
    * Decides in what dimensions the user can zoom by dragging the mouse. Can be one of <code>x</code>, <code>y</code> or <code>xy</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/zoomtype-none/" target="_blank">None by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/zoomtype-x/" target="_blank">x</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/zoomtype-y/" target="_blank">y</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/zoomtype-xy/" target="_blank">xy</a>
    */
  val zoomType: String = js.undefined.asInstanceOf[String]
}
