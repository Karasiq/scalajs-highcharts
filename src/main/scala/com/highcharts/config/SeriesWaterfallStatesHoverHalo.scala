/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.2 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class SeriesWaterfallStatesHoverHalo extends js.Object {
  
  /**
   * A collection of SVG attributes to override the appearance of the halo, for example <code>fill</code>, <code>stroke</code> and <code>stroke-width</code>.
   * @since 4.0
   */
  var attributes: UndefOr[js.Object] = js.undefined
  
  /**
   * Opacity for the halo unless a specific fill is overridden using the <code>attributes</code> setting. Note that Highcharts is only able to apply opacity to colors of hex or rgb(a) formats.
   * @since 4.0
   */
  var opacity: Double = 0.25
  
  /**
   * The pixel size of the halo. For point markers this is the radius of the halo. For pie slices it is the width of the halo outside the slice. For bubbles it defaults to 5 and is the width of the halo outside the bubble.
   * @since 4.0
   */
  var size: Double = 10
}
