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
  * @note JavaScript name: <code>drilldown-activeDataLabelStyle</code>
  */
class DrilldownActiveDataLabelStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined

  var cursor: js.UndefOr[String] = js.undefined

  var fontWeight: js.UndefOr[String] = js.undefined

  var textDecoration: js.UndefOr[String] = js.undefined
}

object DrilldownActiveDataLabelStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined, cursor: js.UndefOr[String] = js.undefined, fontWeight: js.UndefOr[String] = js.undefined, textDecoration: js.UndefOr[String] = js.undefined): DrilldownActiveDataLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new DrilldownActiveDataLabelStyle {
      this.color = color
      this.cursor = cursor
      this.fontWeight = fontWeight
      this.textDecoration = textDecoration
    })
  }
}
