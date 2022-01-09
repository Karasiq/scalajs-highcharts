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
  * @note JavaScript name: <code>plotOptions-networkgraph-dataLabels-style</code>
  */
class PlotOptionsNetworkgraphDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var transition: js.UndefOr[String] = js.undefined
}

object PlotOptionsNetworkgraphDataLabelsStyle {
  /**
    */
  def apply(transition: js.UndefOr[String] = js.undefined): PlotOptionsNetworkgraphDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsNetworkgraphDataLabelsStyle {
      this.transition = transition
    })
  }
}
