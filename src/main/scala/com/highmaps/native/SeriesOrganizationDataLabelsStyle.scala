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
  * @note JavaScript name: <code>series&lt;organization&gt;-dataLabels-style</code>
  */
class SeriesOrganizationDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var fontSize: js.UndefOr[String] = js.undefined

  var fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesOrganizationDataLabelsStyle {
  /**
    */
  def apply(fontSize: js.UndefOr[String] = js.undefined, fontWeight: js.UndefOr[String] = js.undefined): SeriesOrganizationDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesOrganizationDataLabelsStyle {
      this.fontSize = fontSize
      this.fontWeight = fontWeight
    })
  }
}
