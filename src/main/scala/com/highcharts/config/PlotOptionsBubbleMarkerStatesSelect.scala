/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.1 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class PlotOptionsBubbleMarkerStatesSelect extends js.Object {
  
  /**
   * Enable or disable visible feedback for selection.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-states-select-enabled/" target="_blank">Disabled select state</a>
   */
  var enabled: Boolean = true
  
  /**
   * The fill color of the point marker.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-states-select-fillcolor/" target="_blank">Solid red discs for selected points</a>
   */
  var fillColor: UndefOr[String] = js.undefined
  
  /**
   * The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-states-select-linecolor/" target="_blank">Red line color for selected points</a>
   */
  var lineColor: String = "#000000"
  
  /**
   * The width of the point marker's outline.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-states-select-linewidth/" target="_blank">3px line width for selected points</a>
   */
  var lineWidth: Double = 0
  
  /**
   * The radius of the point marker. In hover state, it defaults
   * 		to the normal state's radius + 2.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-states-select-radius/" target="_blank">10px radius for selected points</a>
   */
  var radius: UndefOr[Double] = js.undefined
}
