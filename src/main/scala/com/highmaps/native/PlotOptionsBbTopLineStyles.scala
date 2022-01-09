/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-bb-topLine-styles</code>
  */
class PlotOptionsBbTopLineStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Color of the line. If not set, it&#39;s inherited from
    * <a href="#plotOptions.bb.color">plotOptions.bb.color</a>.</p>
    * @since 6.0.0
    */
  var lineColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Pixel width of the line.</p>
    * @since 6.0.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object PlotOptionsBbTopLineStyles {
  /**
    * @param lineColor <p>Color of the line. If not set, it&#39;s inherited from. <a href="#plotOptions.bb.color">plotOptions.bb.color</a>.</p>
    * @param lineWidth <p>Pixel width of the line.</p>
    */
  def apply(lineColor: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined): PlotOptionsBbTopLineStyles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsBbTopLineStyles {
      this.lineColor = lineColor
      this.lineWidth = lineWidth
    })
  }
}
