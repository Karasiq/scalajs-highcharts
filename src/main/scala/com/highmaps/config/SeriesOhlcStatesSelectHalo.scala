/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;ohlc&gt;-states-select-halo</code>
  */
@js.annotation.ScalaJSDefined
class SeriesOhlcStatesSelectHalo extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The pixel size of the halo. For point markers this is the
    * radius of the halo. For pie slices it is the width of the
    * halo outside the slice. For bubbles it defaults to 5 and is
    * the width of the halo outside the bubble.</p>
    * @since 4.0
    */
  val size: js.UndefOr[Double] = js.undefined

  /**
    * <p>Opacity for the halo unless a specific fill is overridden
    * using the <code>attributes</code> setting. Note that Highcharts is only
    * able to apply opacity to colors of hex or rgb(a) formats.</p>
    * @since 4.0
    */
  val opacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>A collection of SVG attributes to override the appearance of
    * the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.</p>
    * @since 4.0
    */
  val attributes: js.UndefOr[js.Object] = js.undefined
}

object SeriesOhlcStatesSelectHalo {
  /**
    * @param size <p>The pixel size of the halo. For point markers this is the. radius of the halo. For pie slices it is the width of the. halo outside the slice. For bubbles it defaults to 5 and is. the width of the halo outside the bubble.</p>
    * @param opacity <p>Opacity for the halo unless a specific fill is overridden. using the <code>attributes</code> setting. Note that Highcharts is only. able to apply opacity to colors of hex or rgb(a) formats.</p>
    * @param attributes <p>A collection of SVG attributes to override the appearance of. the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.</p>
    */
  def apply(size: js.UndefOr[Double] = js.undefined, opacity: js.UndefOr[Double] = js.undefined, attributes: js.UndefOr[js.Object] = js.undefined): SeriesOhlcStatesSelectHalo = {
    val sizeOuter: js.UndefOr[Double] = size
    val opacityOuter: js.UndefOr[Double] = opacity
    val attributesOuter: js.UndefOr[js.Object] = attributes
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesOhlcStatesSelectHalo {
      override val size: js.UndefOr[Double] = sizeOuter
      override val opacity: js.UndefOr[Double] = opacityOuter
      override val attributes: js.UndefOr[js.Object] = attributesOuter
    })
  }
}
