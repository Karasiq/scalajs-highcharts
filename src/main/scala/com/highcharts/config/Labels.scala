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
  * @note JavaScript name: <code>labels</code>
  */
@js.annotation.ScalaJSDefined
class Labels extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Shared CSS styles for all labels.</p>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>An HTML label that can be positioned anywhere in the chart area.</p>
    */
  val items: js.UndefOr[js.Array[js.Any]] = js.undefined
}

object Labels {
  /**
    * @param style <p>Shared CSS styles for all labels.</p>
    * @param items <p>An HTML label that can be positioned anywhere in the chart area.</p>
    */
  def apply(style: js.UndefOr[js.Object] = js.undefined, items: js.UndefOr[js.Array[js.Any]] = js.undefined): Labels = {
    val styleOuter: js.UndefOr[js.Object] = style
    val itemsOuter: js.UndefOr[js.Array[js.Any]] = items
    com.highcharts.HighchartsGenericObject.toCleanObject(new Labels {
      override val style: js.UndefOr[js.Object] = styleOuter
      override val items: js.UndefOr[js.Array[js.Any]] = itemsOuter
    })
  }
}
