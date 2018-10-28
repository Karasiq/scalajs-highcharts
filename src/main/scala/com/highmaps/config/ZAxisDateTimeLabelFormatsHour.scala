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
  * @note JavaScript name: <code>zAxis-dateTimeLabelFormats-hour</code>
  */
@js.annotation.ScalaJSDefined
class ZAxisDateTimeLabelFormatsHour extends com.highcharts.HighchartsGenericObject {

  val main: js.UndefOr[String] = js.undefined

  val range: js.UndefOr[Boolean] = js.undefined
}

object ZAxisDateTimeLabelFormatsHour {
  /**
    */
  def apply(main: js.UndefOr[String] = js.undefined, range: js.UndefOr[Boolean] = js.undefined): ZAxisDateTimeLabelFormatsHour = {
    val mainOuter: js.UndefOr[String] = main
    val rangeOuter: js.UndefOr[Boolean] = range
    com.highcharts.HighchartsGenericObject.toCleanObject(new ZAxisDateTimeLabelFormatsHour {
      override val main: js.UndefOr[String] = mainOuter
      override val range: js.UndefOr[Boolean] = rangeOuter
    })
  }
}
