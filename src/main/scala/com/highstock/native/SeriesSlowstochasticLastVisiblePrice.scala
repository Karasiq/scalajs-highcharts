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
  * @note JavaScript name: <code>series&lt;slowstochastic&gt;-lastVisiblePrice</code>
  */
class SeriesSlowstochasticLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 8.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesSlowstochasticLastVisiblePriceLabel]] = js.undefined
}

object SeriesSlowstochasticLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesSlowstochasticLastVisiblePriceLabel]] = js.undefined): SeriesSlowstochasticLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSlowstochasticLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
