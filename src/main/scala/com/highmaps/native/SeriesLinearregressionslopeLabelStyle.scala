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
  * @note JavaScript name: <code>series&lt;linearregressionslope&gt;-label-style</code>
  */
class SeriesLinearregressionslopeLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesLinearregressionslopeLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesLinearregressionslopeLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesLinearregressionslopeLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
