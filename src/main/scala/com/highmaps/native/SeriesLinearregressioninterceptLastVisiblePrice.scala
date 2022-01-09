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
  * @note JavaScript name: <code>series&lt;linearregressionintercept&gt;-lastVisiblePrice</code>
  */
class SeriesLinearregressioninterceptLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 7.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesLinearregressioninterceptLastVisiblePriceLabel]] = js.undefined
}

object SeriesLinearregressioninterceptLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesLinearregressioninterceptLastVisiblePriceLabel]] = js.undefined): SeriesLinearregressioninterceptLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesLinearregressioninterceptLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
