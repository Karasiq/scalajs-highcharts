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
  * @note JavaScript name: <code>series&lt;funnel3d&gt;-lastPrice</code>
  */
class SeriesFunnel3dLastPrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of the line of last price.
    * By default, the line has the same color as the series.</p>
    * @since 7.1.0
    */
  var color: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesFunnel3dLastPriceLabel]] = js.undefined
}

object SeriesFunnel3dLastPrice {
  /**
    * @param color <p>The color of the line of last price.. By default, the line has the same color as the series.</p>
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(color: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesFunnel3dLastPriceLabel]] = js.undefined): SeriesFunnel3dLastPrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesFunnel3dLastPrice {
      this.color = color
      this.enabled = enabled
      this.label = label
    })
  }
}