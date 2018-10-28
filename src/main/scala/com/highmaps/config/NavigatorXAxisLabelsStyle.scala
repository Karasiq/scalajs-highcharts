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
  * @note JavaScript name: <code>navigator-xAxis-labels-style</code>
  */
@js.annotation.ScalaJSDefined
class NavigatorXAxisLabelsStyle extends com.highcharts.HighchartsGenericObject {

  val color: js.UndefOr[String] = js.undefined
}

object NavigatorXAxisLabelsStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined): NavigatorXAxisLabelsStyle = {
    val colorOuter: js.UndefOr[String] = color
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorXAxisLabelsStyle {
      override val color: js.UndefOr[String] = colorOuter
    })
  }
}
