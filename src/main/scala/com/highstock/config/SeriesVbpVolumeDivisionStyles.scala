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
  * @note JavaScript name: <code>series&lt;vbp&gt;-volumeDivision-styles</code>
  */
@js.annotation.ScalaJSDefined
class SeriesVbpVolumeDivisionStyles extends com.highcharts.HighchartsGenericObject {

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

object SeriesVbpVolumeDivisionStyles {
  /**
    * @param positiveColor <p>Color of positive volume bars.</p>
    * @param negativeColor <p>Color of negative volume bars.</p>
    */
  def apply(positiveColor: js.UndefOr[String | js.Object] = js.undefined, negativeColor: js.UndefOr[String | js.Object] = js.undefined): SeriesVbpVolumeDivisionStyles = {
    val positiveColorOuter: js.UndefOr[String | js.Object] = positiveColor
    val negativeColorOuter: js.UndefOr[String | js.Object] = negativeColor
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVbpVolumeDivisionStyles {
      override val positiveColor: js.UndefOr[String | js.Object] = positiveColorOuter
      override val negativeColor: js.UndefOr[String | js.Object] = negativeColorOuter
    })
  }
}
