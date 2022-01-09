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
  * @note JavaScript name: <code>series&lt;sunburst&gt;-levels-dataLabels-style</code>
  */
class SeriesSunburstLevelsDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var textOverflow: js.UndefOr[String] = js.undefined
}

object SeriesSunburstLevelsDataLabelsStyle {
  /**
    */
  def apply(textOverflow: js.UndefOr[String] = js.undefined): SeriesSunburstLevelsDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSunburstLevelsDataLabelsStyle {
      this.textOverflow = textOverflow
    })
  }
}
