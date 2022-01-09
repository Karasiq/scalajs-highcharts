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
  * @note JavaScript name: <code>series&lt;disparityindex&gt;-lastVisiblePrice</code>
  */
class SeriesDisparityindexLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 9.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesDisparityindexLastVisiblePriceLabel]] = js.undefined
}

object SeriesDisparityindexLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesDisparityindexLastVisiblePriceLabel]] = js.undefined): SeriesDisparityindexLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesDisparityindexLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
