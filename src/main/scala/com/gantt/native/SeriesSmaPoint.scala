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
  * @note JavaScript name: <code>series&lt;sma&gt;-point</code>
  */
class SeriesSmaPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 6.0.0
    */
  var events: js.Any = js.undefined
}

object SeriesSmaPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): SeriesSmaPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSmaPoint {
      this.events = events
    })
  }
}
