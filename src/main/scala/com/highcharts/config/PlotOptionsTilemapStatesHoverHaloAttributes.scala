/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-tilemap-states-hover-halo-attributes</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsTilemapStatesHoverHaloAttributes extends com.highcharts.HighchartsGenericObject {

  val zIndex: js.UndefOr[Double] = js.undefined
}

object PlotOptionsTilemapStatesHoverHaloAttributes {
  /**
    */
  def apply(zIndex: js.UndefOr[Double] = js.undefined): PlotOptionsTilemapStatesHoverHaloAttributes = {
    val zIndexOuter: js.UndefOr[Double] = zIndex
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTilemapStatesHoverHaloAttributes {
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    })
  }
}
