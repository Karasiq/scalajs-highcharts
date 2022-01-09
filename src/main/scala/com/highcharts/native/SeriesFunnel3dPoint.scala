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
  * @note JavaScript name: <code>series&lt;funnel3d&gt;-point</code>
  */
class SeriesFunnel3dPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 7.1.0
    */
  var events: js.Any = js.undefined
}

object SeriesFunnel3dPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): SeriesFunnel3dPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesFunnel3dPoint {
      this.events = events
    })
  }
}
