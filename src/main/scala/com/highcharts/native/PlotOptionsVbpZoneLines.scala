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
  * @note JavaScript name: <code>plotOptions-vbp-zoneLines</code>
  */
class PlotOptionsVbpZoneLines extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable/disable zone lines.</p>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Specify the style of zone lines.</p>
    * @since 6.0.0
    */
  var styles: js.UndefOr[js.Object] = js.undefined
}

object PlotOptionsVbpZoneLines {
  /**
    * @param enabled <p>Enable/disable zone lines.</p>
    * @param styles <p>Specify the style of zone lines.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, styles: js.UndefOr[js.Object] = js.undefined): PlotOptionsVbpZoneLines = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVbpZoneLines {
      this.enabled = enabled
      this.styles = styles
    })
  }
}
