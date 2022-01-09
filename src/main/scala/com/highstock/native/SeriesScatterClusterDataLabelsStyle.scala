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
  * @note JavaScript name: <code>series&lt;scatter&gt;-cluster-dataLabels-style</code>
  */
class SeriesScatterClusterDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined
}

object SeriesScatterClusterDataLabelsStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined): SeriesScatterClusterDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesScatterClusterDataLabelsStyle {
      this.color = color
    })
  }
}
