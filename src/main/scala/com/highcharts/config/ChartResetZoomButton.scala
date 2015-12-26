/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.7 by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart-resetZoomButton</code>
  */
@js.annotation.ScalaJSDefined
class ChartResetZoomButton extends js.Object {

  /**
    * The position of the button. This is an object that can hold the properties <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/resetzoombutton-position/" target="_blank">Above the plot area</a>
    * @since 2.2
    */
  val position: js.UndefOr[js.Object] = js.undefined

  /**
    * What frame the button should be placed related to. Can be either "plot" or "chart".
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/resetzoombutton-relativeto/" target="_blank">Relative to the chart</a>
    * @since 2.2
    */
  val relativeTo: js.UndefOr[String] = js.undefined

  /**
    * A collection of attributes for the button. The object takes SVG attributes like  <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the border radius. The theme also supports <code>style</code>, a collection of CSS properties for the text. Equivalent attributes for the hover state are given in <code>theme.states.hover</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/resetzoombutton-theme/" target="_blank">Theming the button</a>
    * @since 2.2
    */
  val theme: js.UndefOr[js.Object] = js.undefined
}
