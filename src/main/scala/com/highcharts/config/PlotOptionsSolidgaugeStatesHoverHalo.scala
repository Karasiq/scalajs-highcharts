/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-solidgauge-states-hover-halo</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSolidgaugeStatesHoverHalo extends js.Object {

  /**
    * A collection of SVG attributes to override the appearance of the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.
    * @since 4.0
    */
  val attributes: js.UndefOr[js.Object] = js.undefined

  /**
    * Opacity for the halo unless a specific fill is overridden using the <code>attributes</code> setting. Note that Highcharts is only able to apply opacity to colors of hex or rgb(a) formats.
    * @since 4.0
    */
  val opacity: js.UndefOr[Double] = js.undefined

  /**
    * The pixel size of the halo. For point markers this is the radius of the halo. For pie slices it is the width of the halo outside the slice. For bubbles it defaults to 5 and is the width of the halo outside the bubble.
    * @since 4.0
    */
  val size: js.UndefOr[Double] = js.undefined
}

object PlotOptionsSolidgaugeStatesHoverHalo {
  /**
    * @param attributes A collection of SVG attributes to override the appearance of the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.
    * @param opacity Opacity for the halo unless a specific fill is overridden using the <code>attributes</code> setting. Note that Highcharts is only able to apply opacity to colors of hex or rgb(a) formats.
    * @param size The pixel size of the halo. For point markers this is the radius of the halo. For pie slices it is the width of the halo outside the slice. For bubbles it defaults to 5 and is the width of the halo outside the bubble.
    */
  def apply(attributes: js.UndefOr[js.Object] = js.undefined, opacity: js.UndefOr[Double] = js.undefined, size: js.UndefOr[Double] = js.undefined): PlotOptionsSolidgaugeStatesHoverHalo = {
    val attributesOuter: js.UndefOr[js.Object] = attributes
    val opacityOuter: js.UndefOr[Double] = opacity
    val sizeOuter: js.UndefOr[Double] = size
    new PlotOptionsSolidgaugeStatesHoverHalo {
      override val attributes: js.UndefOr[js.Object] = attributesOuter
      override val opacity: js.UndefOr[Double] = opacityOuter
      override val size: js.UndefOr[Double] = sizeOuter
    }
  }
}
