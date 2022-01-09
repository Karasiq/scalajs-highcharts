/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-vbp-volumeDivision-styles</code>
  */
class PlotOptionsVbpVolumeDivisionStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Color of negative volume bars.</p>
    * @since 6.0.0
    */
  var negativeColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Color of positive volume bars.</p>
    * @since 6.0.0
    */
  var positiveColor: js.UndefOr[String] = js.undefined
}

object PlotOptionsVbpVolumeDivisionStyles {
  /**
    * @param negativeColor <p>Color of negative volume bars.</p>
    * @param positiveColor <p>Color of positive volume bars.</p>
    */
  def apply(negativeColor: js.UndefOr[String] = js.undefined, positiveColor: js.UndefOr[String] = js.undefined): PlotOptionsVbpVolumeDivisionStyles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVbpVolumeDivisionStyles {
      this.negativeColor = negativeColor
      this.positiveColor = positiveColor
    })
  }
}
