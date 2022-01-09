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
  * @note JavaScript name: <code>plotOptions-mappoint-cluster-dataLabels-style</code>
  */
class PlotOptionsMappointClusterDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined
}

object PlotOptionsMappointClusterDataLabelsStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined): PlotOptionsMappointClusterDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMappointClusterDataLabelsStyle {
      this.color = color
    })
  }
}
