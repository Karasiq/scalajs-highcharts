/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.4 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class SeriesGaugeDial extends js.Object {
  
  /**
   * The background or fill color of the gauge's dial. 
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
   * @since 2.3.0
   */
  val backgroundColor: String = "black"
  
  /**
   * The length of the dial's base part, relative to the total radius or length of the dial. 
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
   * @since 2.3.0
   */
  val baseLength: String = "70%"
  
  /**
   * The pixel width of the base of the gauge dial. The base is the part closest to the pivot, defined by baseLength. 
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
   * @since 2.3.0
   */
  val baseWidth: Double = 3
  
  /**
   * The border color or stroke of the gauge's dial. By default, the borderWidth is 0, so this must be set in addition to a custom border color.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
   * @since 2.3.0
   */
  val borderColor: String = "silver"
  
  /**
   * The width of the gauge dial border in pixels.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
   * @since 2.3.0
   */
  val borderWidth: Double = 0
  
  /**
   * The radius or length of the dial, in percentages relative to the radius of the gauge itself.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
   * @since 2.3.0
   */
  val radius: String = "80%"
  
  /**
   * The length of the dial's rear end, the part that extends out on the other side of the pivot. Relative to the dial's length. 
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
   * @since 2.3.0
   */
  val rearLength: String = "10%"
  
  /**
   * The width of the top of the dial, closest to the perimeter. The pivot narrows in from the base to the top.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-dial/" target="_blank">Dial options demonstrated</a>
   * @since 2.3.0
   */
  val topWidth: Double = 1
}
