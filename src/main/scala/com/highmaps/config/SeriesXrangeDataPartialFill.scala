/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;xrange&gt;-data-partialFill</code>
  */
@js.annotation.ScalaJSDefined
class SeriesXrangeDataPartialFill extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The amount of the X-range point to be filled. Values can be 0-1 and are
    * converted to percentages in the default data label formatter.</p>
    */
  val amount: js.UndefOr[Double] = js.undefined

  /**
    * <p>The fill color to be used for partial fills. Defaults to a darker shade
    * of the point color.</p>
    */
  val fill: js.UndefOr[String | js.Object] = js.undefined
}

object SeriesXrangeDataPartialFill {
  /**
    * @param amount <p>The amount of the X-range point to be filled. Values can be 0-1 and are. converted to percentages in the default data label formatter.</p>
    * @param fill <p>The fill color to be used for partial fills. Defaults to a darker shade. of the point color.</p>
    */
  def apply(amount: js.UndefOr[Double] = js.undefined, fill: js.UndefOr[String | js.Object] = js.undefined): SeriesXrangeDataPartialFill = {
    val amountOuter: js.UndefOr[Double] = amount
    val fillOuter: js.UndefOr[String | js.Object] = fill
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesXrangeDataPartialFill {
      override val amount: js.UndefOr[Double] = amountOuter
      override val fill: js.UndefOr[String | js.Object] = fillOuter
    })
  }
}
