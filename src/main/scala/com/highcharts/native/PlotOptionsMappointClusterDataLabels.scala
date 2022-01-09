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
  * @note JavaScript name: <code>plotOptions-mappoint-cluster-dataLabels</code>
  */
class PlotOptionsMappointClusterDataLabels extends com.highcharts.HighchartsGenericObject {

  var align: js.UndefOr[String] = js.undefined

  var enabled: js.UndefOr[Boolean] = js.undefined

  var format: js.UndefOr[String] = js.undefined

  var inside: js.UndefOr[Boolean] = js.undefined

  var style: js.Any = js.undefined

  var verticalAlign: js.UndefOr[String] = js.undefined
}

object PlotOptionsMappointClusterDataLabels {
  /**
    */
  def apply(align: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, format: js.UndefOr[String] = js.undefined, inside: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Any] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined): PlotOptionsMappointClusterDataLabels = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMappointClusterDataLabels {
      this.align = align
      this.enabled = enabled
      this.format = format
      this.inside = inside
      this.style = style
      this.verticalAlign = verticalAlign
    })
  }
}
