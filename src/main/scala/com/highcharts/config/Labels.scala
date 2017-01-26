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
class Labels extends js.Object {

  /**
    * A HTML label that can be positioned anywhere in the chart area.
    */
  val items: js.UndefOr[js.Array[CleanJsObject[LabelsItems]]] = js.undefined

  /**
    * Shared CSS styles for all labels.
    */
  val style: js.UndefOr[js.Object] = js.undefined
}

object Labels {
  /**
    * @param items A HTML label that can be positioned anywhere in the chart area.
    * @param style Shared CSS styles for all labels.
    */
  def apply(items: js.UndefOr[js.Array[CleanJsObject[LabelsItems]]] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): Labels = {
    val itemsOuter: js.UndefOr[js.Array[CleanJsObject[LabelsItems]]] = items
    val styleOuter: js.UndefOr[js.Object] = style
    new Labels {
      override val items: js.UndefOr[js.Array[CleanJsObject[LabelsItems]]] = itemsOuter
      override val style: js.UndefOr[js.Object] = styleOuter
    }
  }
}
