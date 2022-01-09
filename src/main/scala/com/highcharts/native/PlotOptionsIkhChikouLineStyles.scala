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
  * @note JavaScript name: <code>plotOptions-ikh-chikouLine-styles</code>
  */
class PlotOptionsIkhChikouLineStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Color of the line.</p>
    * @since 6.0.0
    */
  var lineColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Pixel width of the line.</p>
    * @since 6.0.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object PlotOptionsIkhChikouLineStyles {
  /**
    * @param lineColor <p>Color of the line.</p>
    * @param lineWidth <p>Pixel width of the line.</p>
    */
  def apply(lineColor: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined): PlotOptionsIkhChikouLineStyles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsIkhChikouLineStyles {
      this.lineColor = lineColor
      this.lineWidth = lineWidth
    })
  }
}
