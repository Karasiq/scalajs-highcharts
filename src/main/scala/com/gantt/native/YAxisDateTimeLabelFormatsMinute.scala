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
  * @note JavaScript name: <code>yAxis-dateTimeLabelFormats-minute</code>
  */
class YAxisDateTimeLabelFormatsMinute extends com.highcharts.HighchartsGenericObject {

  var main: js.UndefOr[String] = js.undefined

  var range: js.UndefOr[Boolean] = js.undefined
}

object YAxisDateTimeLabelFormatsMinute {
  /**
    */
  def apply(main: js.UndefOr[String] = js.undefined, range: js.UndefOr[Boolean] = js.undefined): YAxisDateTimeLabelFormatsMinute = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisDateTimeLabelFormatsMinute {
      this.main = main
      this.range = range
    })
  }
}