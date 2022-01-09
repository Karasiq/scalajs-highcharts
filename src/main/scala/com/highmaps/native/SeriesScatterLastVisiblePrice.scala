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
  * @note JavaScript name: <code>series&lt;scatter&gt;-lastVisiblePrice</code>
  */
class SeriesScatterLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesScatterLastVisiblePriceLabel]] = js.undefined
}

object SeriesScatterLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesScatterLastVisiblePriceLabel]] = js.undefined): SeriesScatterLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesScatterLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
