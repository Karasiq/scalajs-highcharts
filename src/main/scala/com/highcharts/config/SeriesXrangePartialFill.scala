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
  * @note JavaScript name: <code>series&lt;xrange&gt;-partialFill</code>
  */
@js.annotation.ScalaJSDefined
class SeriesXrangePartialFill extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The fill color to be used for partial fills. Defaults to a darker shade
    * of the point color.</p>
    */
  val fill: js.UndefOr[String | js.Object] = js.undefined
}

object SeriesXrangePartialFill {
  /**
    * @param fill <p>The fill color to be used for partial fills. Defaults to a darker shade. of the point color.</p>
    */
  def apply(fill: js.UndefOr[String | js.Object] = js.undefined): SeriesXrangePartialFill = {
    val fillOuter: js.UndefOr[String | js.Object] = fill
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesXrangePartialFill {
      override val fill: js.UndefOr[String | js.Object] = fillOuter
    })
  }
}
