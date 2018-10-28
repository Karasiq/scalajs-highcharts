/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>tooltip-style</code>
  */
@js.annotation.ScalaJSDefined
class TooltipStyle extends com.highcharts.HighchartsGenericObject {

  val whiteSpace: js.UndefOr[String] = js.undefined
}

object TooltipStyle {
  /**
    */
  def apply(whiteSpace: js.UndefOr[String] = js.undefined): TooltipStyle = {
    val whiteSpaceOuter: js.UndefOr[String] = whiteSpace
    com.highcharts.HighchartsGenericObject.toCleanObject(new TooltipStyle {
      override val whiteSpace: js.UndefOr[String] = whiteSpaceOuter
    })
  }
}
