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
  * @note JavaScript name: <code>series&lt;networkgraph&gt;-lastVisiblePrice</code>
  */
class SeriesNetworkgraphLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesNetworkgraphLastVisiblePriceLabel]] = js.undefined
}

object SeriesNetworkgraphLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesNetworkgraphLastVisiblePriceLabel]] = js.undefined): SeriesNetworkgraphLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesNetworkgraphLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
