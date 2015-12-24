/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.1 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class XAxisBreaks extends js.Object {
  
  /**
   * A number indicating how much space should be left between the start and the end of the break. The break size is given in axis units, so for instance on a <code>datetime</code> axis, a break size of 3600000 would indicate the equivalent of an hour.
   * @since 4.1.0
   */
  var breakSize: Double = 0
  
  /**
   * The point where the break starts.
   * @since 4.1.0
   */
  var from: UndefOr[Double] = js.undefined
  
  /**
   * Defines an interval after which the break appears again. By default the breaks do not repeat.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/axisbreak/break-repeated/">Repeated Break</a>
   * @since 4.1.0
   */
  var repeat: Double = 0
  
  /**
   * The point where the break ends.
   * @since 4.1.0
   */
  var to: UndefOr[Double] = js.undefined
}
