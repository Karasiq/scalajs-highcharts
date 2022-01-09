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
  * @note JavaScript name: <code>series&lt;xrange&gt;-lastVisiblePrice</code>
  */
class SeriesXrangeLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesXrangeLastVisiblePriceLabel]] = js.undefined
}

object SeriesXrangeLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesXrangeLastVisiblePriceLabel]] = js.undefined): SeriesXrangeLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesXrangeLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
