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
  * @note JavaScript name: <code>plotOptions-xrange-partialFill</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsXrangePartialFill extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The fill color to be used for partial fills. Defaults to a darker shade
    * of the point color.</p>
    * @since 6.0.0
    */
  val fill: js.UndefOr[String | js.Object] = js.undefined
}

object PlotOptionsXrangePartialFill {
  /**
    * @param fill <p>The fill color to be used for partial fills. Defaults to a darker shade. of the point color.</p>
    */
  def apply(fill: js.UndefOr[String | js.Object] = js.undefined): PlotOptionsXrangePartialFill = {
    val fillOuter: js.UndefOr[String | js.Object] = fill
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsXrangePartialFill {
      override val fill: js.UndefOr[String | js.Object] = fillOuter
    })
  }
}
