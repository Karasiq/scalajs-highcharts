/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
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

object ChartResetZoomButton {
  /**
    * @param position The position of the button. This is an object that can hold the properties <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>.
    * @param relativeTo What frame the button should be placed related to. Can be either "plot" or "chart".
    * @param theme A collection of attributes for the button. The object takes SVG attributes like  <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the border radius. The theme also supports <code>style</code>, a collection of CSS properties for the text. Equivalent attributes for the hover state are given in <code>theme.states.hover</code>.
    */
  def apply(position: js.UndefOr[js.Object] = js.undefined, relativeTo: js.UndefOr[String] = js.undefined, theme: js.UndefOr[js.Object] = js.undefined): ChartResetZoomButton = {
    val positionOuter: js.UndefOr[js.Object] = position
    val relativeToOuter: js.UndefOr[String] = relativeTo
    val themeOuter: js.UndefOr[js.Object] = theme
    new ChartResetZoomButton {
      override val position: js.UndefOr[js.Object] = positionOuter
      override val relativeTo: js.UndefOr[String] = relativeToOuter
      override val theme: js.UndefOr[js.Object] = themeOuter
    }
  }
}
