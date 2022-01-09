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
  * @note JavaScript name: <code>series&lt;treemap&gt;-lastVisiblePrice</code>
  */
class SeriesTreemapLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesTreemapLastVisiblePriceLabel]] = js.undefined
}

object SeriesTreemapLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesTreemapLastVisiblePriceLabel]] = js.undefined): SeriesTreemapLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
