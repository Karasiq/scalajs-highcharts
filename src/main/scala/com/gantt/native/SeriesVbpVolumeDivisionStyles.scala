/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;vbp&gt;-volumeDivision-styles</code>
  */
class SeriesVbpVolumeDivisionStyles extends com.highcharts.HighchartsGenericObject {

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

object SeriesVbpVolumeDivisionStyles {
  /**
    * @param negativeColor <p>Color of negative volume bars.</p>
    * @param positiveColor <p>Color of positive volume bars.</p>
    */
  def apply(negativeColor: js.UndefOr[String] = js.undefined, positiveColor: js.UndefOr[String] = js.undefined): SeriesVbpVolumeDivisionStyles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVbpVolumeDivisionStyles {
      this.negativeColor = negativeColor
      this.positiveColor = positiveColor
    })
  }
}
