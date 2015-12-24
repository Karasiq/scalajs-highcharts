/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.3 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class NoData extends js.Object {
  
  /**
   * An object of additional SVG attributes for the no-data label.
   * @since 3.0.8
   */
  val attr: UndefOr[js.Object] = js.undefined
  
  /**
   * The position of the no-data label, relative to the plot area. 
   * @since 3.0.8
   */
  val position: js.Object = js.eval("{ \"x\": 0, \"y\": 0, \"align\": \"center\", \"verticalAlign\": \"middle\" }").asInstanceOf[js.Object]
  
  /**
   * CSS styles for the no-data label. 
   * @since 3.0.8
   */
  val style: js.Object = js.eval("{ \"fontSize\": \"12px\", \"fontWeight\": \"bold\", \"color\": \"#60606a\" }").asInstanceOf[js.Object]
  
  /**
   * Whether to insert the label as HTML, or as pseudo-HTML rendered with SVG.
   * @since 4.1.10
   */
  val useHTML: Boolean = false
}
