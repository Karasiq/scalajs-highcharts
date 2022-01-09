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
  * @note JavaScript name: <code>series&lt;cylinder&gt;-point</code>
  */
class SeriesCylinderPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 7.0.0
    */
  var events: js.Any = js.undefined
}

object SeriesCylinderPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): SeriesCylinderPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesCylinderPoint {
      this.events = events
    })
  }
}
