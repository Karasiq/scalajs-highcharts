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
  * @note JavaScript name: <code>plotOptions-vbp-volumeDivision</code>
  */
class PlotOptionsVbpVolumeDivision extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Option to control if volume is divided.</p>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var styles: js.Any = js.undefined
}

object PlotOptionsVbpVolumeDivision {
  /**
    * @param enabled <p>Option to control if volume is divided.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, styles: js.UndefOr[js.Any] = js.undefined): PlotOptionsVbpVolumeDivision = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVbpVolumeDivision {
      this.enabled = enabled
      this.styles = styles
    })
  }
}
