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
  * @note JavaScript name: <code>chart-options3d-frame-back</code>
  */
@js.annotation.ScalaJSDefined
class ChartOptions3dFrameBack extends js.Object {

  /**
    * The color of the panel.
    * @since 4.0
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Thickness of the panel.
    * @since 4.0
    */
  val size: js.UndefOr[Double] = js.undefined
}

object ChartOptions3dFrameBack {
  /**
    * @param color The color of the panel.
    * @param size Thickness of the panel.
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, size: js.UndefOr[Double] = js.undefined): ChartOptions3dFrameBack = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val sizeOuter: js.UndefOr[Double] = size
    new ChartOptions3dFrameBack {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val size: js.UndefOr[Double] = sizeOuter
    }
  }
}
