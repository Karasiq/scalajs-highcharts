/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.0 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class PlotOptions extends js.Object {
  
  var area: UndefOr[PlotOptionsArea] = js.undefined
  
  /**
   * The area range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/arearange/">Arearange example</a>
   * @since 2.3.0
   */
  var arearange: UndefOr[PlotOptionsArearange] = js.undefined
  
  var areaspline: UndefOr[PlotOptionsAreaspline] = js.undefined
  
  /**
   * The area spline range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
   * @since 2.3.0
   */
  var areasplinerange: UndefOr[PlotOptionsAreasplinerange] = js.undefined
  
  var bar: UndefOr[PlotOptionsBar] = js.undefined
  
  /**
   * A box plot is a convenient way of depicting groups of data through their five-number summaries: the smallest observation (sample minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest observation (sample maximum). 
   * @since 3.0
   */
  var boxplot: UndefOr[js.Object] = js.undefined
  
  /**
   * A bubble series is a three dimensional series type where each point renders an X, Y and Z value. Each points is drawn as a bubble where the position along the X and Y axes mark the X and Y values, and the size of the bubble relates to the Z value.
   * @since 3.0
   */
  var bubble: UndefOr[js.Object] = js.undefined
  
  var column: UndefOr[PlotOptionsColumn] = js.undefined
  
  /**
   * The column range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>. To display horizontal bars, set <a href="#chart.inverted">chart.inverted</a> to <code>true</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/columnrange/" target="_blank">Inverted column range</a>
   * @since 2.3.0
   */
  var columnrange: UndefOr[js.Object] = js.undefined
  
  /**
   * Error bars are a graphical representation of the variability of data and are used on graphs to indicate the error, or uncertainty in a reported measurement. 
   * @since 3.0
   */
  var errorbar: UndefOr[js.Object] = js.undefined
  
  /**
   * Funnel charts are a type of chart often used to visualize stages in a sales project, where the top are the initial stages with the most clients. It requires that the <code>modules/funnel.js</code> file is loaded.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/funnel/" target="_blank">Funnel demo</a>
   * @since 3.0
   */
  var funnel: UndefOr[js.Object] = js.undefined
  
  /**
   * General plotting options for the gauge series type. Requires <code>highcharts-more.js</code>
   * @since 2.3.0
   */
  var gauge: UndefOr[js.Object] = js.undefined
  
  /**
   * <p>The heatmap series type. This series type is available both in Highcharts and Highmaps.</p>
   * 
   * <p>The colors of each heat map point is usually determined by its value and controlled by settings on the <a href="#colorAxis">colorAxis</a>.</p>
   * @since 4.0
   */
  var heatmap: UndefOr[js.Object] = js.undefined
  
  var line: UndefOr[PlotOptionsLine] = js.undefined
  
  /**
   * A pie chart is a circular chart divided into sectors, illustrating numerical proportion.
   * @example  <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/pie-basic/" target="_blank">Pie chart</a>,  

<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/3d-pie/" target="_blank">3D pie</a>
   */
  var pie: UndefOr[PlotOptionsPie] = js.undefined
  
  /**
   * A polygon series can be used to draw any freeform shape in the cartesian coordinate system. A fill is applied with the <code>color</code> option, and stroke is applied through <code>lineWidth</code> and <code>lineColor</code> options. Requires the <code>highcharts-more.js</code> file.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/polygon/" target="_blank">Polygon</a>
   * @since 4.1.0
   */
  var polygon: UndefOr[js.Object] = js.undefined
  
  /**
   * A pyramid chart consists of a single pyramid with item heights corresponding to each point value. Technically it is the same as a reversed funnel chart without a neck.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/pyramid/" target="_blank">Pyramid chart</a>
   * @since 3.0.10
   */
  var pyramid: UndefOr[js.Object] = js.undefined
  
  var scatter: UndefOr[PlotOptionsScatter] = js.undefined
  
  /**
   * <p>General options for all series types.</p>
   */
  var series: UndefOr[PlotOptionsSeries] = js.undefined
  
  /**
   * A gauge showing values using a filled arc with colors indicating the value. The solid gauge plots values against the <code>yAxis</code>, which is extended with some color options, <a href="#yAxis.minColor">minColor</a>, <a href="#yAxis.maxColor">maxColor</a> and <a href="#yAxis.stops">stops</a>, to control the color of the gauge itself.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/gauge-solid/" target="_blank">Solid gauge</a>
   * @since 4.0
   */
  var solidgauge: UndefOr[js.Object] = js.undefined
  
  var spline: UndefOr[PlotOptionsSpline] = js.undefined
  
  /**
   * The size of the point shape is determined by its value relative to its siblings values.
   * Requires the module <code>heatmap.js</code> as well, if functionality such as the <a href="http://api.highcharts.com/highmaps#colorAxis">colorAxis</a> is to be used.
   * @since 4.1.0
   */
  var treemap: UndefOr[js.Object] = js.undefined
  
  /**
   * Options for the waterfall series type.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/waterfall/" target="_blank">Waterfall chart</a>
   * @since 3.0
   */
  var waterfall: UndefOr[js.Object] = js.undefined
}
