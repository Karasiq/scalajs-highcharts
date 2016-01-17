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
  * @note JavaScript name: <code>navigator</code>
  */
@js.annotation.ScalaJSDefined
class Navigator extends js.Object {

  /**
    * Whether the navigator and scrollbar should adapt to updated data in the base X axis. This should be false when loading data asynchronously, to prevent circular loading.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/demo/lazy-loading/" target="_blank">Set to false with async data loading</a>
    */
  val adaptToUpdatedData: js.UndefOr[Boolean] = js.undefined

  /**
    * An integer identifying the index to use for the base series, or a string representing the id of the series.
    */
  val baseSeries: js.Any = js.undefined

  /**
    * Enable or disable the navigator.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/enabled/" target="_blank">Disable the navigator</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Options for the handles for dragging the zoomed area. Available options are <code>backgroundColor</code> (defaults to <code>#ebe7e8</code>) and <code>borderColor</code> (defaults to <code>#b2b1b6</code>).
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/handles/" target="_blank">Colored handles</a>
    */
  val handles: js.UndefOr[js.Object] = js.undefined

  /**
    * The height of the navigator.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/height/" target="_blank">A higher navigator</a>
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * The distance from the nearest element, the X axis or X axis labels.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/margin/" target="_blank">A margin of 2 draws the
				navigator closer to the X axis labels</a>
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * The color of the mask covering the areas of the navigator series that are currently not visible in the main series. The default color is bluish with an opacity of 0.3 to see the series below.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/maskfill/" target="_blank">Blue, semi transparent mask</a>
    */
  val maskFill: js.UndefOr[String] = js.undefined

  /**
    * Whether the mask should be inside the range marking the zoomed range, or outside. In Highstock 1.x it was always <code>false</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/maskinside-false/" target="_blank">False, mask outside</a>
    * @since 2.0
    */
  val maskInside: js.UndefOr[Boolean] = js.undefined

  /**
    * The color of the line marking the currently zoomed area in the navigator.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/outline/" target="_blank">2px blue outline</a>
    */
  val outlineColor: js.UndefOr[String] = js.undefined

  /**
    * The width of the line marking the currently zoomed area in the navigator.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/outline/" target="_blank">2px blue outline</a>
    */
  val outlineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Options for the navigator series. Available options are the same as any series, documented at <a class="internal" href="#plotOptions.series">plotOptions</a> and <a class="internal" href="#series">series</a>.</p>
    * 
    * <p>Unless data is explicitly defined on navigator.series, the data is borrowed from the first series in the chart.</p>
    * 
    * <p>Default series options for the navigator series are:</p>
    * <pre>series: {
    * 	type: 'areaspline',
    * 	color: '#4572A7',
    * 	fillOpacity: 0.05,
    * 	dataGrouping: {
    * 		smoothed: true
    * 	},
    * 	lineWidth: 1,
    * 	marker: {
    * 		enabled: false
    * 	}
    * }</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/series-data/" target="_blank">Using a separate data set for the navigator</a>;
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/navigator/series/" target="_blank">A green navigator series</a>
    */
  val series: js.UndefOr[js.Object] = js.undefined

  /**
    * Options for the navigator X axis. Available options are the same as any X axis, documented at <a class="internal" href="#xAxis">xAxis</a>. Default series options for the navigator xAxis are:
    * <pre>xAxis: {
    *     tickWidth: 0,
    *     lineWidth: 0,
    *     gridLineWidth: 1,
    *     tickPixelInterval: 200,
    *     labels: {
    *         align: 'left',
    *         style: {
    *             color: '#888'
    *         },
    *         x: 3,
    *         y: -4
    *     }
    * }</pre>
    */
  val xAxis: js.UndefOr[js.Object] = js.undefined

  /**
    * Options for the navigator Y axis. Available options are the same as any y axis, documented at <a class="internal" href="#yAxis">yAxis</a>. Default series options for the navigator yAxis are:
    * <pre>yAxis: {
    * 	gridLineWidth: 0,
    * 	startOnTick: false,
    * 	endOnTick: false,
    * 	minPadding: 0.1,
    * 	maxPadding: 0.1,
    * 	labels: {
    * 		enabled: false
    * 	},
    * 	title: {
    * 		text: null
    * 	},
    * 	tickWidth: 0
    * }</pre>
    */
  val yAxis: js.UndefOr[js.Object] = js.undefined
}
