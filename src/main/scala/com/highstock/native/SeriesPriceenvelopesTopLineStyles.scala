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
  * @note JavaScript name: <code>series&lt;priceenvelopes&gt;-topLine-styles</code>
  */
class SeriesPriceenvelopesTopLineStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Pixel width of the line.</p>
    * @since 6.0.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color of the line. If not set, it&#39;s inherited from
    * <a href="#plotOptions.priceenvelopes.color">plotOptions.priceenvelopes.color</a>.</p>
    * @since 6.0.0
    */
  var lineColor: js.UndefOr[String] = js.undefined
}

object SeriesPriceenvelopesTopLineStyles {
  /**
    * @param lineWidth <p>Pixel width of the line.</p>
    * @param lineColor <p>Color of the line. If not set, it&#39;s inherited from. <a href="#plotOptions.priceenvelopes.color">plotOptions.priceenvelopes.color</a>.</p>
    */
  def apply(lineWidth: js.UndefOr[Double] = js.undefined, lineColor: js.UndefOr[String] = js.undefined): SeriesPriceenvelopesTopLineStyles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPriceenvelopesTopLineStyles {
      this.lineWidth = lineWidth
      this.lineColor = lineColor
    })
  }
}
