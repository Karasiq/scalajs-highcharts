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
  * @note JavaScript name: <code>series&lt;keltnerchannels&gt;-topLine-styles</code>
  */
class SeriesKeltnerchannelsTopLineStyles extends com.highcharts.HighchartsGenericObject {

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

object SeriesKeltnerchannelsTopLineStyles {
  /**
    * @param lineColor <p>Color of the line. If not set, it&#39;s inherited from. <code>plotOptions.keltnerchannels.color</code></p>
    * @param lineWidth <p>Pixel width of the line.</p>
    */
  def apply(lineColor: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined): SeriesKeltnerchannelsTopLineStyles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesKeltnerchannelsTopLineStyles {
      this.lineColor = lineColor
      this.lineWidth = lineWidth
    })
  }
}