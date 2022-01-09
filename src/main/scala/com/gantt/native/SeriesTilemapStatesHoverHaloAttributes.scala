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
  * @note JavaScript name: <code>series&lt;tilemap&gt;-states-hover-halo-attributes</code>
  */
class SeriesTilemapStatesHoverHaloAttributes extends com.highcharts.HighchartsGenericObject {

  var zIndex: js.UndefOr[Double] = js.undefined
}

object SeriesTilemapStatesHoverHaloAttributes {
  /**
    */
  def apply(zIndex: js.UndefOr[Double] = js.undefined): SeriesTilemapStatesHoverHaloAttributes = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTilemapStatesHoverHaloAttributes {
      this.zIndex = zIndex
    })
  }
}
