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
  * @note JavaScript name: <code>xAxis-dateTimeLabelFormats-hour</code>
  */
class XAxisDateTimeLabelFormatsHour extends com.highcharts.HighchartsGenericObject {

  var main: js.UndefOr[String] = js.undefined

  var range: js.UndefOr[Boolean] = js.undefined
}

object XAxisDateTimeLabelFormatsHour {
  /**
    */
  def apply(main: js.UndefOr[String] = js.undefined, range: js.UndefOr[Boolean] = js.undefined): XAxisDateTimeLabelFormatsHour = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new XAxisDateTimeLabelFormatsHour {
      this.main = main
      this.range = range
    })
  }
}
