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
  * @note JavaScript name: <code>series&lt;cmo&gt;-point</code>
  */
class SeriesCmoPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 9.1.0
    */
  var events: js.Any = js.undefined
}

object SeriesCmoPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): SeriesCmoPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesCmoPoint {
      this.events = events
    })
  }
}
