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
  * @note JavaScript name: <code>series&lt;mappoint&gt;-cluster-dataLabels-style</code>
  */
class SeriesMappointClusterDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined
}

object SeriesMappointClusterDataLabelsStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined): SeriesMappointClusterDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMappointClusterDataLabelsStyle {
      this.color = color
    })
  }
}
