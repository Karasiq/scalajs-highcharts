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
  * @note JavaScript name: <code>series&lt;mapline&gt;-lastVisiblePrice</code>
  */
class SeriesMaplineLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesMaplineLastVisiblePriceLabel]] = js.undefined
}

object SeriesMaplineLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesMaplineLastVisiblePriceLabel]] = js.undefined): SeriesMaplineLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMaplineLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}