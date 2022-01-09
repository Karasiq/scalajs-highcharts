/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;vector&gt;-cluster-dataLabels-style</code>
  */
class SeriesVectorClusterDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined
}

object SeriesVectorClusterDataLabelsStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined): SeriesVectorClusterDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVectorClusterDataLabelsStyle {
      this.color = color
    })
  }
}
