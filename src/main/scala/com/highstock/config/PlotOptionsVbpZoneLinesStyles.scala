/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-vbp-zoneLines-styles</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsVbpZoneLinesStyles extends com.highcharts.HighchartsGenericObject {

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

object PlotOptionsVbpZoneLinesStyles {
  /**
    * @param color <p>Color of zone lines.</p>
    * @param dashStyle <p>The dash style of zone lines.</p>
    * @param lineWidth <p>Pixel width of zone lines.</p>
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined): PlotOptionsVbpZoneLinesStyles = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dashStyleOuter: js.UndefOr[String] = dashStyle
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVbpZoneLinesStyles {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dashStyle: js.UndefOr[String] = dashStyleOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
    })
  }
}
