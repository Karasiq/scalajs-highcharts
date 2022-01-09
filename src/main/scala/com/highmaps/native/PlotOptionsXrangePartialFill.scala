/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-xrange-partialFill</code>
  */
class PlotOptionsXrangePartialFill extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The fill color to be used for partial fills. Defaults to a darker
    * shade of the point color.</p>
    * @since 6.0.0
    */
  var fill: js.UndefOr[String | js.Object] = js.undefined
}

object PlotOptionsXrangePartialFill {
  /**
    * @param fill <p>The fill color to be used for partial fills. Defaults to a darker. shade of the point color.</p>
    */
  def apply(fill: js.UndefOr[String | js.Object] = js.undefined): PlotOptionsXrangePartialFill = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsXrangePartialFill {
      this.fill = fill
    })
  }
}
