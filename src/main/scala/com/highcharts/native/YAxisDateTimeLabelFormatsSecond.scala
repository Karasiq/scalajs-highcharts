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
  * @note JavaScript name: <code>yAxis-dateTimeLabelFormats-second</code>
  */
class YAxisDateTimeLabelFormatsSecond extends com.highcharts.HighchartsGenericObject {

  var main: js.UndefOr[String] = js.undefined

  var range: js.UndefOr[Boolean] = js.undefined
}

object YAxisDateTimeLabelFormatsSecond {
  /**
    */
  def apply(main: js.UndefOr[String] = js.undefined, range: js.UndefOr[Boolean] = js.undefined): YAxisDateTimeLabelFormatsSecond = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisDateTimeLabelFormatsSecond {
      this.main = main
      this.range = range
    })
  }
}
