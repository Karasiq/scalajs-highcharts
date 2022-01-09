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
  * @note JavaScript name: <code>series&lt;trendline&gt;-point</code>
  */
class SeriesTrendlinePoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 7.1.3
    */
  var events: js.Any = js.undefined
}

object SeriesTrendlinePoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): SeriesTrendlinePoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTrendlinePoint {
      this.events = events
    })
  }
}
