/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>zAxis-dateTimeLabelFormats-hour</code>
  */
class ZAxisDateTimeLabelFormatsHour extends com.highcharts.HighchartsGenericObject {

  var main: js.UndefOr[String] = js.undefined

  var range: js.UndefOr[Boolean] = js.undefined
}

object ZAxisDateTimeLabelFormatsHour {
  /**
    */
  def apply(main: js.UndefOr[String] = js.undefined, range: js.UndefOr[Boolean] = js.undefined): ZAxisDateTimeLabelFormatsHour = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ZAxisDateTimeLabelFormatsHour {
      this.main = main
      this.range = range
    })
  }
}
