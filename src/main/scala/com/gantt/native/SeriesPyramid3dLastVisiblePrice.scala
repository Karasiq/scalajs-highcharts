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
  * @note JavaScript name: <code>series&lt;pyramid3d&gt;-lastVisiblePrice</code>
  */
class SeriesPyramid3dLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesPyramid3dLastVisiblePriceLabel]] = js.undefined
}

object SeriesPyramid3dLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesPyramid3dLastVisiblePriceLabel]] = js.undefined): SeriesPyramid3dLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPyramid3dLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
