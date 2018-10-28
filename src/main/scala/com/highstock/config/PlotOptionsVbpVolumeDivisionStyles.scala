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
  * @note JavaScript name: <code>plotOptions-vbp-volumeDivision-styles</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsVbpVolumeDivisionStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Color of positive volume bars.</p>
    * @since 6.0.0
    */
  val positiveColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Color of negative volume bars.</p>
    * @since 6.0.0
    */
  val negativeColor: js.UndefOr[String | js.Object] = js.undefined
}

object PlotOptionsVbpVolumeDivisionStyles {
  /**
    * @param positiveColor <p>Color of positive volume bars.</p>
    * @param negativeColor <p>Color of negative volume bars.</p>
    */
  def apply(positiveColor: js.UndefOr[String | js.Object] = js.undefined, negativeColor: js.UndefOr[String | js.Object] = js.undefined): PlotOptionsVbpVolumeDivisionStyles = {
    val positiveColorOuter: js.UndefOr[String | js.Object] = positiveColor
    val negativeColorOuter: js.UndefOr[String | js.Object] = negativeColor
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVbpVolumeDivisionStyles {
      override val positiveColor: js.UndefOr[String | js.Object] = positiveColorOuter
      override val negativeColor: js.UndefOr[String | js.Object] = negativeColorOuter
    })
  }
}
