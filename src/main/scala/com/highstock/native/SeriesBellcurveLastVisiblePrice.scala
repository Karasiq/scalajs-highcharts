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
  * @note JavaScript name: <code>series&lt;bellcurve&gt;-lastVisiblePrice</code>
  */
class SeriesBellcurveLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesBellcurveLastVisiblePriceLabel]] = js.undefined
}

object SeriesBellcurveLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesBellcurveLastVisiblePriceLabel]] = js.undefined): SeriesBellcurveLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBellcurveLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
