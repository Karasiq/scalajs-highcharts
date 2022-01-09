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
  * @note JavaScript name: <code>plotOptions-columnpyramid-lastVisiblePrice</code>
  */
class PlotOptionsColumnpyramidLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 7.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[PlotOptionsColumnpyramidLastVisiblePriceLabel]] = js.undefined
}

object PlotOptionsColumnpyramidLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[PlotOptionsColumnpyramidLastVisiblePriceLabel]] = js.undefined): PlotOptionsColumnpyramidLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsColumnpyramidLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
