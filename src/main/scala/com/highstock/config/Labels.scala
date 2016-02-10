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
  * @note JavaScript name: <code>labels</code>
  */
@js.annotation.ScalaJSDefined
class Labels extends js.Object {

  /**
    * A HTML label that can be positioned anywhere in the chart area.
    */
  val items: js.UndefOr[CleanJsObject[LabelsItems]] = js.undefined

  /**
    * Shared CSS styles for all labels. Defaults to:
    * <pre>style: {
    * 	color: '#3E576F'
    * }</pre>
    */
  val style: js.UndefOr[js.Object] = js.undefined
}

object Labels {
  /**
    * @param items A HTML label that can be positioned anywhere in the chart area.
    * @param style Shared CSS styles for all labels. Defaults to:. <pre>style: {. 	color: '#3E576F'. }</pre>
    */
  def apply(items: js.UndefOr[CleanJsObject[LabelsItems]] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): Labels = {
    val itemsOuter: js.UndefOr[CleanJsObject[LabelsItems]] = items
    val styleOuter: js.UndefOr[js.Object] = style
    new Labels {
      override val items: js.UndefOr[CleanJsObject[LabelsItems]] = itemsOuter
      override val style: js.UndefOr[js.Object] = styleOuter
    }
  }
}
