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
  * @note JavaScript name: <code>series&lt;windbarb&gt;-lastVisiblePrice</code>
  */
class SeriesWindbarbLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesWindbarbLastVisiblePriceLabel]] = js.undefined
}

object SeriesWindbarbLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesWindbarbLastVisiblePriceLabel]] = js.undefined): SeriesWindbarbLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesWindbarbLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
