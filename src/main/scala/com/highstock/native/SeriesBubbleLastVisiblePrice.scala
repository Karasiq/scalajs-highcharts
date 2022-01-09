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
  * @note JavaScript name: <code>series&lt;bubble&gt;-lastVisiblePrice</code>
  */
class SeriesBubbleLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesBubbleLastVisiblePriceLabel]] = js.undefined
}

object SeriesBubbleLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesBubbleLastVisiblePriceLabel]] = js.undefined): SeriesBubbleLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBubbleLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
