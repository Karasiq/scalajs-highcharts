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
  * @note JavaScript name: <code>series&lt;disparityindex&gt;-point</code>
  */
class SeriesDisparityindexPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 9.1.0
    */
  var events: js.Any = js.undefined
}

object SeriesDisparityindexPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): SeriesDisparityindexPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesDisparityindexPoint {
      this.events = events
    })
  }
}
