/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;cci&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesCciPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 6.0.0
    */
  val events: js.Any = js.undefined
}

object SeriesCciPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): SeriesCciPoint = {
    val eventsOuter: js.Any = events
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesCciPoint {
      override val events: js.Any = eventsOuter
    })
  }
}