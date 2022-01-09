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
  * @note JavaScript name: <code>series&lt;dmi&gt;-minusDILine-styles</code>
  */
class SeriesDmiMinusDILineStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Color of the line.</p>
    * @since 9.1.0
    */
  var lineColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Pixel width of the line.</p>
    * @since 9.1.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object SeriesDmiMinusDILineStyles {
  /**
    * @param lineColor <p>Color of the line.</p>
    * @param lineWidth <p>Pixel width of the line.</p>
    */
  def apply(lineColor: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined): SeriesDmiMinusDILineStyles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesDmiMinusDILineStyles {
      this.lineColor = lineColor
      this.lineWidth = lineWidth
    })
  }
}