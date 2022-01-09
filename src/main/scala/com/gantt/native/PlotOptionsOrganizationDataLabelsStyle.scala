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
  * @note JavaScript name: <code>plotOptions-organization-dataLabels-style</code>
  */
class PlotOptionsOrganizationDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var fontSize: js.UndefOr[String] = js.undefined

  var fontWeight: js.UndefOr[String] = js.undefined
}

object PlotOptionsOrganizationDataLabelsStyle {
  /**
    */
  def apply(fontSize: js.UndefOr[String] = js.undefined, fontWeight: js.UndefOr[String] = js.undefined): PlotOptionsOrganizationDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsOrganizationDataLabelsStyle {
      this.fontSize = fontSize
      this.fontWeight = fontWeight
    })
  }
}
