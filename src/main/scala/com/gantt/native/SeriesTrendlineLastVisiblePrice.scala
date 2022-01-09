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
  * @note JavaScript name: <code>series&lt;trendline&gt;-lastVisiblePrice</code>
  */
class SeriesTrendlineLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 7.1.3
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesTrendlineLastVisiblePriceLabel]] = js.undefined
}

object SeriesTrendlineLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesTrendlineLastVisiblePriceLabel]] = js.undefined): SeriesTrendlineLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTrendlineLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
