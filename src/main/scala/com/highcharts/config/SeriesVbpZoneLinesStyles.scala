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
  * @note JavaScript name: <code>series&lt;vbp&gt;-zoneLines-styles</code>
  */
@js.annotation.ScalaJSDefined
class SeriesVbpZoneLinesStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Color of zone lines.</p>
    * @since 6.0.0
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The dash style of zone lines.</p>
    * @since 6.0.0
    */
  val dashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Pixel width of zone lines.</p>
    * @since 6.0.0
    */
  val lineWidth: js.UndefOr[Double] = js.undefined
}

object SeriesVbpZoneLinesStyles {
  /**
    * @param color <p>Color of zone lines.</p>
    * @param dashStyle <p>The dash style of zone lines.</p>
    * @param lineWidth <p>Pixel width of zone lines.</p>
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined): SeriesVbpZoneLinesStyles = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dashStyleOuter: js.UndefOr[String] = dashStyle
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVbpZoneLinesStyles {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dashStyle: js.UndefOr[String] = dashStyleOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
    })
  }
}
