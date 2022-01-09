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
  * @note JavaScript name: <code>chart-parallelAxes-labels-symbol</code>
  */
class ChartParallelAxesLabelsSymbol extends com.highcharts.HighchartsGenericObject {

  var height: js.UndefOr[Double] = js.undefined

  var padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The symbol type. Points to a definition function in
    * the <code>Highcharts.Renderer.symbols</code> collection.</p>
    * @since 6.0.0
    */
  var `type`: js.UndefOr[String] = js.undefined

  var width: js.UndefOr[Double] = js.undefined

  var x: js.UndefOr[Double] = js.undefined

  var y: js.UndefOr[Double] = js.undefined
}

object ChartParallelAxesLabelsSymbol {
  /**
    * @param `type` <p>The symbol type. Points to a definition function in. the <code>Highcharts.Renderer.symbols</code> collection.</p>
    */
  def apply(height: js.UndefOr[Double] = js.undefined, padding: js.UndefOr[Double] = js.undefined, `type`: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): ChartParallelAxesLabelsSymbol = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartParallelAxesLabelsSymbol {
      this.height = height
      this.padding = padding
      this.`type` = `type`
      this.width = width
      this.x = x
      this.y = y
    })
  }
}
