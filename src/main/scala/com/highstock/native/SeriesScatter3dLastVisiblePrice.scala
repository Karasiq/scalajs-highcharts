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
  * @note JavaScript name: <code>series&lt;scatter3d&gt;-lastVisiblePrice</code>
  */
class SeriesScatter3dLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesScatter3dLastVisiblePriceLabel]] = js.undefined
}

object SeriesScatter3dLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesScatter3dLastVisiblePriceLabel]] = js.undefined): SeriesScatter3dLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesScatter3dLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
