/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.0 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class Credits extends js.Object {
  
  /**
   * Whether to show the credits text.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/credits/enabled-false/" target="_blank">Credits disabled</a>
   */
  var enabled: Boolean = true
  
  /**
   * The URL for the credits label.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/credits/href/" target="_blank">Custom URL and text</a>
   */
  var href: String = "http://www.highcharts.com"
  
  /**
   * Position configuration for the credits label. Supported properties are  <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>. Defaults to 
   * <pre>position: {
   * 	align: 'right',
   * 	x: -10,
   * 	verticalAlign: 'bottom',
   * 	y: -5
   * }</pre>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/credits/position-left/" target="_blank">Left aligned</a>
   * @since 2.1
   */
  var position: UndefOr[js.Object] = js.undefined
  
  /**
   * CSS styles for the credits label. Defaults to:
   * <pre>style: {
   * 	cursor: 'pointer',
   * 	color: '#909090',
   * 	fontSize: '10px'
   * 
   * }</pre>
   */
  var style: UndefOr[js.Object] = js.undefined
  
  /**
   * The text for the credits label.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/credits/href/" target="_blank">Custom URL and text</a>
   */
  var text: String = "Highcharts.com"
}
