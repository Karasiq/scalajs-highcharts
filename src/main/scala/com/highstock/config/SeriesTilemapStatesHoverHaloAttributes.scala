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
  * @note JavaScript name: <code>series&lt;tilemap&gt;-states-hover-halo-attributes</code>
  */
@js.annotation.ScalaJSDefined
class SeriesTilemapStatesHoverHaloAttributes extends com.highcharts.HighchartsGenericObject {

  val zIndex: js.UndefOr[Double] = js.undefined
}

object SeriesTilemapStatesHoverHaloAttributes {
  /**
    */
  def apply(zIndex: js.UndefOr[Double] = js.undefined): SeriesTilemapStatesHoverHaloAttributes = {
    val zIndexOuter: js.UndefOr[Double] = zIndex
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTilemapStatesHoverHaloAttributes {
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    })
  }
}
