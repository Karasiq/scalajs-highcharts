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
  * @note JavaScript name: <code>plotOptions-keltnerchannels-topLine-styles</code>
  */
class PlotOptionsKeltnerchannelsTopLineStyles extends com.highcharts.HighchartsGenericObject {

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

object PlotOptionsKeltnerchannelsTopLineStyles {
  /**
    * @param lineColor <p>Color of the line. If not set, it&#39;s inherited from. <code>plotOptions.keltnerchannels.color</code></p>
    * @param lineWidth <p>Pixel width of the line.</p>
    */
  def apply(lineColor: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined): PlotOptionsKeltnerchannelsTopLineStyles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsKeltnerchannelsTopLineStyles {
      this.lineColor = lineColor
      this.lineWidth = lineWidth
    })
  }
}
