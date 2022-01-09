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
  * @note JavaScript name: <code>plotOptions-tilemap-states-hover-halo-attributes</code>
  */
class PlotOptionsTilemapStatesHoverHaloAttributes extends com.highcharts.HighchartsGenericObject {

  var zIndex: js.UndefOr[Double] = js.undefined
}

object PlotOptionsTilemapStatesHoverHaloAttributes {
  /**
    */
  def apply(zIndex: js.UndefOr[Double] = js.undefined): PlotOptionsTilemapStatesHoverHaloAttributes = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTilemapStatesHoverHaloAttributes {
      this.zIndex = zIndex
    })
  }
}
