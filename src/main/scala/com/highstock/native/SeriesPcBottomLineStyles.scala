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
  * @note JavaScript name: <code>series&lt;pc&gt;-bottomLine-styles</code>
  */
class SeriesPcBottomLineStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Color of the bottom line. If not set, it&#39;s inherited from
    * <a href="#plotOptions.pc.color">plotOptions.pc.color</a>.</p>
    * @since 7.0.0
    */
  var lineColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Pixel width of the line.</p>
    * @since 7.0.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object SeriesPcBottomLineStyles {
  /**
    * @param lineColor <p>Color of the bottom line. If not set, it&#39;s inherited from. <a href="#plotOptions.pc.color">plotOptions.pc.color</a>.</p>
    * @param lineWidth <p>Pixel width of the line.</p>
    */
  def apply(lineColor: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined): SeriesPcBottomLineStyles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPcBottomLineStyles {
      this.lineColor = lineColor
      this.lineWidth = lineWidth
    })
  }
}
