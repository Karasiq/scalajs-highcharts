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
  * @note JavaScript name: <code>navigator-series-marker</code>
  */
class NavigatorSeriesMarker extends com.highcharts.HighchartsGenericObject {

  var enabled: js.UndefOr[Boolean] = js.undefined
}

object NavigatorSeriesMarker {
  /**
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): NavigatorSeriesMarker = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorSeriesMarker {
      this.enabled = enabled
    })
  }
}
