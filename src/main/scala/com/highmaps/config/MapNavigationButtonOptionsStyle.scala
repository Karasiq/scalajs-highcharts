/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>mapNavigation-buttonOptions-style</code>
  */
@js.annotation.ScalaJSDefined
class MapNavigationButtonOptionsStyle extends com.highcharts.HighchartsGenericObject {

  val fontSize: js.UndefOr[String] = js.undefined

  val fontWeight: js.UndefOr[String] = js.undefined
}

object MapNavigationButtonOptionsStyle {
  /**
    */
  def apply(fontSize: js.UndefOr[String] = js.undefined, fontWeight: js.UndefOr[String] = js.undefined): MapNavigationButtonOptionsStyle = {
    val fontSizeOuter: js.UndefOr[String] = fontSize
    val fontWeightOuter: js.UndefOr[String] = fontWeight
    com.highcharts.HighchartsGenericObject.toCleanObject(new MapNavigationButtonOptionsStyle {
      override val fontSize: js.UndefOr[String] = fontSizeOuter
      override val fontWeight: js.UndefOr[String] = fontWeightOuter
    })
  }
}
