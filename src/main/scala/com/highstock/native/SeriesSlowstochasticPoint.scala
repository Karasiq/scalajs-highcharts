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
  * @note JavaScript name: <code>series&lt;slowstochastic&gt;-point</code>
  */
class SeriesSlowstochasticPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 8.0.0
    */
  var events: js.Any = js.undefined
}

object SeriesSlowstochasticPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): SeriesSlowstochasticPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSlowstochasticPoint {
      this.events = events
    })
  }
}
