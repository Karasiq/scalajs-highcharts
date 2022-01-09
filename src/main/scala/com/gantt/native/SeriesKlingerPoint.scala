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
  * @note JavaScript name: <code>series&lt;klinger&gt;-point</code>
  */
class SeriesKlingerPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 9.1.0
    */
  var events: js.Any = js.undefined
}

object SeriesKlingerPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): SeriesKlingerPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesKlingerPoint {
      this.events = events
    })
  }
}
