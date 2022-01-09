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
  * @note JavaScript name: <code>series&lt;xrange&gt;-data-partialFill</code>
  */
class SeriesXrangeDataPartialFill extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The amount of the X-range point to be filled. Values can be 0-1 and are
    * converted to percentages in the default data label formatter.</p>
    */
  var amount: js.UndefOr[Double] = js.undefined

  /**
    * <p>The fill color to be used for partial fills. Defaults to a darker shade
    * of the point color.</p>
    */
  var fill: js.UndefOr[String | js.Object] = js.undefined
}

object SeriesXrangeDataPartialFill {
  /**
    * @param amount <p>The amount of the X-range point to be filled. Values can be 0-1 and are. converted to percentages in the default data label formatter.</p>
    * @param fill <p>The fill color to be used for partial fills. Defaults to a darker shade. of the point color.</p>
    */
  def apply(amount: js.UndefOr[Double] = js.undefined, fill: js.UndefOr[String | js.Object] = js.undefined): SeriesXrangeDataPartialFill = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesXrangeDataPartialFill {
      this.amount = amount
      this.fill = fill
    })
  }
}
