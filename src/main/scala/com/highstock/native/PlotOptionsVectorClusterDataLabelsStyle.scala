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
  * @note JavaScript name: <code>plotOptions-vector-cluster-dataLabels-style</code>
  */
class PlotOptionsVectorClusterDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined
}

object PlotOptionsVectorClusterDataLabelsStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined): PlotOptionsVectorClusterDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVectorClusterDataLabelsStyle {
      this.color = color
    })
  }
}
