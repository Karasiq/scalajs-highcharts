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
  * @note JavaScript name: <code>series&lt;funnel&gt;-lastPrice</code>
  */
class SeriesFunnelLastPrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of the line of last price.
    * By default, the line has the same color as the series.</p>
    */
  var color: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesFunnelLastPriceLabel]] = js.undefined
}

object SeriesFunnelLastPrice {
  /**
    * @param color <p>The color of the line of last price.. By default, the line has the same color as the series.</p>
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(color: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesFunnelLastPriceLabel]] = js.undefined): SeriesFunnelLastPrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesFunnelLastPrice {
      this.color = color
      this.enabled = enabled
      this.label = label
    })
  }
}
