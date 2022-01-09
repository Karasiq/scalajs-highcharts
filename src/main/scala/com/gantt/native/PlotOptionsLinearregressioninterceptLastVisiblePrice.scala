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
  * @note JavaScript name: <code>plotOptions-linearregressionintercept-lastVisiblePrice</code>
  */
class PlotOptionsLinearregressioninterceptLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 7.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[PlotOptionsLinearregressioninterceptLastVisiblePriceLabel]] = js.undefined
}

object PlotOptionsLinearregressioninterceptLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[PlotOptionsLinearregressioninterceptLastVisiblePriceLabel]] = js.undefined): PlotOptionsLinearregressioninterceptLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsLinearregressioninterceptLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
