/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.1 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class NavigationButtonOptions extends js.Object {
  
  /**
   * Alignment for the buttons.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/buttonoptions-align/" target="_blank">Center aligned</a>
   * @since 2.0
   */
  var align: String = "right"
  
  /**
   * Whether to enable buttons.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/buttonoptions-enabled/" target="_blank">Exporting module loaded but buttons disabled</a>
   * @since 2.0
   */
  var enabled: Boolean = true
  
  /**
   * Pixel height of the buttons.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
   * @since 2.0
   */
  var height: Double = 20
  
  /**
   * Fill color for the symbol within the button.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/buttonoptions-symbolfill/" target="_blank">Blue symbol stroke for one of the buttons</a>
   * @since 2.0
   */
  var symbolFill: String = "#E0E0E0"
  
  /**
   * The pixel size of the symbol on the button.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
   * @since 2.0
   */
  var symbolSize: Double = 14
  
  /**
   * The color of the symbol's stroke or line.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/buttonoptions-symbolstroke/" target="_blank">Blue symbol stroke</a>
   * @since 2.0
   */
  var symbolStroke: String = "#666"
  
  /**
   * The pixel stroke width of the symbol on the button.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
   * @since 2.0
   */
  var symbolStrokeWidth: Double = 1
  
  /**
   * The x position of the center of the symbol inside the button.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
   * @since 2.0
   */
  var symbolX: Double = 12.5
  
  /**
   * The y position of the center of the symbol inside the button.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
   * @since 2.0
   */
  var symbolY: Double = 10.5
  
  /**
   * A text string to add to the individual button. 
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/exporting/buttons-text/" target="_blank">Full text button</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/exporting/buttons-text-symbol/" target="_blank">combined symbol and text</a> 
   * @since 3.0
   */
  var text: String = null.asInstanceOf[String]
  
  /**
   * A configuration object for the button theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code> and <code>states.select</code> objects.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/buttonoptions-theme/" target="_blank">Theming the buttons</a>
   * @since 3.0
   */
  var theme: UndefOr[js.Object] = js.undefined
  
  /**
   * The vertical alignment of the buttons. Can be one of "top", "middle" or "bottom".
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/" target="_blank">Buttons at lower right</a>
   * @since 2.0
   */
  var verticalAlign: String = "top"
  
  /**
   * The pixel width of the button.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
   * @since 2.0
   */
  var width: Double = 24
  
  /**
   * The vertical offset of the button's position relative to its <code>verticalAlign</code>.			 .
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/" target="_blank">Buttons at lower right</a>
   * @since 2.0
   */
  var y: Double = 0
}
