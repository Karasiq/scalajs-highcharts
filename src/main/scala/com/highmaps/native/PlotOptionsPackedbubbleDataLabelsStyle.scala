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
  * @note JavaScript name: <code>plotOptions-packedbubble-dataLabels-style</code>
  */
class PlotOptionsPackedbubbleDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var transition: js.UndefOr[String] = js.undefined
}

object PlotOptionsPackedbubbleDataLabelsStyle {
  /**
    */
  def apply(transition: js.UndefOr[String] = js.undefined): PlotOptionsPackedbubbleDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPackedbubbleDataLabelsStyle {
      this.transition = transition
    })
  }
}
