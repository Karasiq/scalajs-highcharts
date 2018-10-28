/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-solidgauge-dragDrop-guideBox</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSolidgaugeDragDropGuideBox extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Style options for the guide box default state.</p>
    * @since 6.2.0
    */
  val default: js.UndefOr[js.Object] = js.undefined
}

object PlotOptionsSolidgaugeDragDropGuideBox {
  /**
    * @param default <p>Style options for the guide box default state.</p>
    */
  def apply(default: js.UndefOr[js.Object] = js.undefined): PlotOptionsSolidgaugeDragDropGuideBox = {
    val defaultOuter: js.UndefOr[js.Object] = default
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSolidgaugeDragDropGuideBox {
      override val default: js.UndefOr[js.Object] = defaultOuter
    })
  }
}
