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
  * @note JavaScript name: <code>plotOptions-aroon-aroonDown</code>
  */
class PlotOptionsAroonAroonDown extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styles for an aroonDown line.</p>
    * @since 7.0.0
    */
  var styles: js.Any = js.undefined
}

object PlotOptionsAroonAroonDown {
  /**
    * @param styles <p>Styles for an aroonDown line.</p>
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined): PlotOptionsAroonAroonDown = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsAroonAroonDown {
      this.styles = styles
    })
  }
}
