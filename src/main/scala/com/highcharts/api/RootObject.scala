/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.3 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.api

import scalajs.js, js.UndefOr

@js.native
trait RootObject extends js.Object {
  
  /**
   * <p>A chart can have from 0 axes (pie chart) to multiples. In a normal, single series cartesian chart, there is one X axis and one Y axis.</p><p>The X axis or axes are referenced by <code>chart.xAxis</code>, which is an array of Axis objects. If there is only one axis, it can be referenced through <code>chart.xAxis[0]</code>, and multiple axes have increasing indices. The same pattern goes for Y axes.</p><p>If you need to get the axes from a series object, use the <code>series.xAxis</code> and<code>series.yAxis</code> properties. These are not arrays, as one series can only be associated to one X and one Y axis.</p><p>A third way to reference the axis programmatically is by id. Add an id in the axis configuration options, and get the axis by <code>chart.get(id)</code>.</p> <p>Configuration options for the axes are given in <a class="internal" href="#xAxis">options.xAxis</a> and <a class="internal" href="#yAxis">options.yAxis</a>.</p>
   */
  val Axis: UndefOr[Axis] = js.native
  
  /**
   * <p>The chart object is the JavaScript object representing a single chart in the web page.The pointer to your chart object is returned when a chart is created using the <code>Highcharts.Chart()</code> constructor:</p><pre>var chart1 = new Highcharts.Chart(options);</pre>
   */
  val Chart: UndefOr[Chart] = js.native
  
  /**
   * <p>The Element class is a JavaScript wrapper for SVG elements used in the rendering layer of Highchart. Combined with the Renderer object, these elements allows freeform annotation in the charts or even in your HTML pages without creating a chart at all.</p>
   */
  val Element: UndefOr[Element] = js.native
  
  /**
   * <p>The namespace under which all other Highcharts variables are assembled is called <code>Highcharts</code>. </p><pre>var chart1 = new Highcharts.Chart(options);</pre>
   */
  val Highcharts: UndefOr[Highcharts] = js.native
  
  /**
   * <p>The Point object is the JavaScript representation of each data point</p><p>The object can be accessed in a number of ways. In all point event handlers the point object is <code>this</code>. In the <code>series</code> object all the points are accessed by the <code>series.data</code> array.</p><p>Another way to reference the point programmatically is by id. Add an id in the point configuration options, and get the point object by <code>chart.get(id)</code>.</p>
   */
  val Point: UndefOr[Point] = js.native
  
  /**
   * <p>Allows direct access to the Highcharts rendering layer in order to draw primitive shapes like circles, rectangles,paths or text directly on a chart, or independent from any chart. The Renderer represents a wrapper object for SVGin modern browsers and VML in IE &lt; 8.</p><p>An existing chart's renderer can be accessed through <code>chart.renderer</code>. To create a renderer independent from a chart, use <code>var renderer = new Highcharts.Renderer(parentNode, width, height);</code> where parentNode is the HTML element where you want to add it.</p><p>The Renderer's methods are chained wherever possible, so you can initiate an element then call for example <code>attr</code> and <code>css</code> and <code>add</code> on that element in one statement.</p><div class="demo"><a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-on-chart/">Annotating a chart programmatically</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/members/renderer-basic/">independent SVG/VML drawing</a></div>
   */
  val Renderer: UndefOr[Renderer] = js.native
  
  /**
   * <p>The Series object is the JavaScript representation of each line, area series, pie etc.</p><p>The object can be accessed in a number of ways. All series and point event handlers give a reference to the series object. The <code>chart</code> object has a <code>series</code> property that is a collection of all the chart's series. The <code>point</code> objects also have the same reference.</p><p>Another way to reference the series programmatically is by id. Add an id in the series configuration options, and get the series object by <code>chart.get(id)</code>.</p><p>Configuration options for the series are given in three levels. Options for all series in a chart are given in the <a class="internal" href="#plotOptions.series">plotOptions.series</a> object. Then options for all series of a specific type are given in the plotOptions of that type, for example plotOptions.line. Next, options for one single series are given in <a class="internal" href="#series">the series array</a>.</p>
   */
  val Series: UndefOr[Series] = js.native
}
