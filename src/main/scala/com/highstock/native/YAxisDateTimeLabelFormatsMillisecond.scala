/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>yAxis-dateTimeLabelFormats-millisecond</code>
  */
class YAxisDateTimeLabelFormatsMillisecond extends com.highcharts.HighchartsGenericObject {

  var main: js.UndefOr[String] = js.undefined

  var range: js.UndefOr[Boolean] = js.undefined
}

object YAxisDateTimeLabelFormatsMillisecond {
  /**
    */
  def apply(main: js.UndefOr[String] = js.undefined, range: js.UndefOr[Boolean] = js.undefined): YAxisDateTimeLabelFormatsMillisecond = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisDateTimeLabelFormatsMillisecond {
      this.main = main
      this.range = range
    })
  }
}
