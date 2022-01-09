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
  * @note JavaScript name: <code>series&lt;sunburst&gt;-dataLabels-style</code>
  */
class SeriesSunburstDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var textOverflow: js.UndefOr[String] = js.undefined
}

object SeriesSunburstDataLabelsStyle {
  /**
    */
  def apply(textOverflow: js.UndefOr[String] = js.undefined): SeriesSunburstDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSunburstDataLabelsStyle {
      this.textOverflow = textOverflow
    })
  }
}
