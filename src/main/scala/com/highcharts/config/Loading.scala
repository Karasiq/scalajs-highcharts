/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.5 by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js

/**
  * @note JavaScript name: <code>loading</code>
  */
@js.annotation.ScalaJSDefined
class Loading extends js.Object {

  /**
    * The duration in milliseconds of the fade out effect.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/loading/hideduration/" target="_blank">Fade in and out over a second</a>
    * @since 1.2.0
    */
  val hideDuration: Double = 100

  /**
    * CSS styles for the loading label <code>span</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/loading/labelstyle/" target="_blank">Vertically centered</a>
    * @since 1.2.0
    */
  val labelStyle: js.Object = js.eval("{ \"fontWeight\": \"bold\", \"position\": \"relative\", \"top\": \"45%\" }").asInstanceOf[js.Object]

  /**
    * The duration in milliseconds of the fade in effect.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/loading/hideduration/" target="_blank">Fade in and out over a second</a>
    * @since 1.2.0
    */
  val showDuration: Double = 100

  /**
    * CSS styles for the loading screen that covers the plot area. Defaults to:
    * <pre>style: {
    * 	position: 'absolute',
    * 	backgroundColor: 'white',
    * 	opacity: 0.5,
    * 	textAlign: 'center'
    * }</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/loading/style/" target="_blank">Gray plot area, white text</a>
    * @since 1.2.0
    */
  val style: js.Object = js.undefined.asInstanceOf[js.Object]
}
