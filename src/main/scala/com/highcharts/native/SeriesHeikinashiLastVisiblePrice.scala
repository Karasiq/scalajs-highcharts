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
  * @note JavaScript name: <code>series&lt;heikinashi&gt;-lastVisiblePrice</code>
  */
class SeriesHeikinashiLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesHeikinashiLastVisiblePriceLabel]] = js.undefined
}

object SeriesHeikinashiLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesHeikinashiLastVisiblePriceLabel]] = js.undefined): SeriesHeikinashiLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesHeikinashiLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
