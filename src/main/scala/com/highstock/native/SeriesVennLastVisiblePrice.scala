/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;venn&gt;-lastVisiblePrice</code>
  */
class SeriesVennLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesVennLastVisiblePriceLabel]] = js.undefined
}

object SeriesVennLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesVennLastVisiblePriceLabel]] = js.undefined): SeriesVennLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVennLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
