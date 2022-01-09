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
  * @note JavaScript name: <code>plotOptions-keltnerchannels-bottomLine-styles</code>
  */
class PlotOptionsKeltnerchannelsBottomLineStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Color of the line. If not set, it&#39;s inherited from
    * <code>plotOptions.keltnerchannels.color</code></p>
    * @since 7.0.0
    */
  var lineColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Pixel width of the line.</p>
    * @since 7.0.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object PlotOptionsKeltnerchannelsBottomLineStyles {
  /**
    * @param lineColor <p>Color of the line. If not set, it&#39;s inherited from. <code>plotOptions.keltnerchannels.color</code></p>
    * @param lineWidth <p>Pixel width of the line.</p>
    */
  def apply(lineColor: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined): PlotOptionsKeltnerchannelsBottomLineStyles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsKeltnerchannelsBottomLineStyles {
      this.lineColor = lineColor
      this.lineWidth = lineWidth
    })
  }
}