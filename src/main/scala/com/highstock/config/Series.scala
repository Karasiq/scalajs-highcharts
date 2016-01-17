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
  * @note JavaScript name: <code>series</code>
  */
@js.annotation.ScalaJSDefined
class Series extends js.Object {

  /**
    * An array of data points for the series. The series object is expecting the points to be ordered from low to high. 
    *  The reason for this is to increase performance. While in many cases the data is fetched from a server, it's also more convenient to sort on the server and thereby save on client resources. 
    *   
    *  The points can be given in three ways:
    * <ol>
    * <li>A list of numerical values. In this case, the numerical values will be interpreted as y values, and x values will be automatically calculated, either starting at 0 and incrementing by 1, or from <code>pointStart</code> and <code>pointInterval</code> given in the plotOptions. This option is not available for series types with more than one value per point, like area range or OHLC. Example:
    * <pre>data: [0, 5, 3, 5]</pre>
    *  	</li>
    *  	<li><p>A list of arrays with two values. In this case, the first value is the
    *  	x value and the second is the y value. If the first value is a string, it is
    *  	applied as the name of the point, and the x value is incremented following
    *  	the above rules.</p> <p>For series with more than one value per point, like range or OHLC, the arrays will be interpreted as <code>[x, low, high]</code> or <code>[x, open, high, low, close]</code>. In these cases, the X value can be skipped altogether to make use of <code>pointStart</code> and <code>pointRange</code>.</p>
    * 
    *  Example:
    * <pre>data: [[5, 2], [6, 3], [8, 2]]</pre></li>
    * 
    * 
    * <li><p>A list of object with named values. In this case the objects are	point configuration objects as seen under <a href="#point">options.point</a>.</p>
    * 
    * <p>Range series values are given by <code>low</code> and <code>high</code>, while candlestick/OHLC values are given by <code>open</code>, <code>high</code>, <code>low</code>, <code>close</code>.</p>
    * 
    *  Example:
    * <pre>data: [{
    * 	name: 'Point 1',
    * 	color: '#00FF00',
    * 	y: 0
    * }, {
    * 	name: 'Point 2',
    * 	color: '#FF00FF',
    * 	y: 5
    * }]</pre></li>
    *  </ol>
    * <p>
    *  In turbo mode, when working with series longer than <a class="internal" href="#plotOptions.series.turboThreshold">
    *  turboThreshold</a> (1000 points by default), only one- or two dimensional arrays of numbers are allowed. The
    *  first value is tested, and we assume that all the rest are defined the same
    *  way.</p>
    * 
    * <p>Note data must be sorted by X in order for the tooltip positioning and data grouping to work.</p>
    */
  val data: js.UndefOr[js.Array[js.Object | js.Array[js.Any] | Double]] = js.undefined

  /**
    * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    * @since 1.2.0
    */
  val index: js.UndefOr[Double] = js.undefined

  /**
    * The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
    */
  val legendIndex: js.UndefOr[Double] = js.undefined

  /**
    * The name of the series as shown in the legend, tooltip etc.
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * This option allows grouping series in a stacked chart. The stack option can be a string  or a number or anything else, as long as the grouped series' stack options match each other.
    */
  val stack: js.UndefOr[String] = js.undefined

  /**
    * The type of series. Can be one of <code>area</code>, <code>areaspline</code>,
    *  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,
    *  <code>scatter</code>, <code>spline</code>, <code>candlestick</code> or <code>ohlc</code>. From version 1.1.7, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    */
  val `type`: js.UndefOr[String] = js.undefined

  /**
    * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
    */
  val xAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
    */
  val yAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * Define the visual z index of the series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-zindex-default/" target="_blank">With no z index, the series defined last are on top</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-zindex/" target="_blank">with a z index, the series with the highest z index is on top</a>.
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}
