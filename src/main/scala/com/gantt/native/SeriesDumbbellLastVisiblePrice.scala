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
  * @note JavaScript name: <code>series&lt;dumbbell&gt;-lastVisiblePrice</code>
  */
class SeriesDumbbellLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesDumbbellLastVisiblePriceLabel]] = js.undefined
}

object SeriesDumbbellLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesDumbbellLastVisiblePriceLabel]] = js.undefined): SeriesDumbbellLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesDumbbellLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
