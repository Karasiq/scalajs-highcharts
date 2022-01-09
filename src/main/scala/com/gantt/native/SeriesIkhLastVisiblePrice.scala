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
  * @note JavaScript name: <code>series&lt;ikh&gt;-lastVisiblePrice</code>
  */
class SeriesIkhLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesIkhLastVisiblePriceLabel]] = js.undefined
}

object SeriesIkhLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesIkhLastVisiblePriceLabel]] = js.undefined): SeriesIkhLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesIkhLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
