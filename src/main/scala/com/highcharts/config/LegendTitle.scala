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
  * @note JavaScript name: <code>legend-title</code>
  */
@js.annotation.ScalaJSDefined
class LegendTitle extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Generic CSS styles for the legend title.</p>
    * @since 3.0
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>A text or HTML string for the title.</p>
    * @since 3.0
    */
  val text: js.UndefOr[String] = js.undefined
}

object LegendTitle {
  /**
    * @param style <p>Generic CSS styles for the legend title.</p>
    * @param text <p>A text or HTML string for the title.</p>
    */
  def apply(style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined): LegendTitle = {
    val styleOuter: js.UndefOr[js.Object] = style
    val textOuter: js.UndefOr[String] = text
    com.highcharts.HighchartsGenericObject.toCleanObject(new LegendTitle {
      override val style: js.UndefOr[js.Object] = styleOuter
      override val text: js.UndefOr[String] = textOuter
    })
  }
}
