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
  * @note JavaScript name: <code>xAxis-dateTimeLabelFormats-millisecond</code>
  */
class XAxisDateTimeLabelFormatsMillisecond extends com.highcharts.HighchartsGenericObject {

  var main: js.UndefOr[String] = js.undefined

  var range: js.UndefOr[Boolean] = js.undefined
}

object XAxisDateTimeLabelFormatsMillisecond {
  /**
    */
  def apply(main: js.UndefOr[String] = js.undefined, range: js.UndefOr[Boolean] = js.undefined): XAxisDateTimeLabelFormatsMillisecond = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new XAxisDateTimeLabelFormatsMillisecond {
      this.main = main
      this.range = range
    })
  }
}
