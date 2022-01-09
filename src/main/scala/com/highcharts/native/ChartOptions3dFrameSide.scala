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
  * @note JavaScript name: <code>chart-options3d-frame-side</code>
  */
class ChartOptions3dFrameSide extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of the panel.</p>
    * @since 4.0.0
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The thickness of the panel.</p>
    * @since 4.0.0
    */
  var size: js.UndefOr[Double] = js.undefined
}

object ChartOptions3dFrameSide {
  /**
    * @param color <p>The color of the panel.</p>
    * @param size <p>The thickness of the panel.</p>
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, size: js.UndefOr[Double] = js.undefined): ChartOptions3dFrameSide = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartOptions3dFrameSide {
      this.color = color
      this.size = size
    })
  }
}
