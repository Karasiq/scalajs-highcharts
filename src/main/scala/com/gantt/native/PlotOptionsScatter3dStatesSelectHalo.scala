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
  * @note JavaScript name: <code>plotOptions-scatter3d-states-select-halo</code>
  */
class PlotOptionsScatter3dStatesSelectHalo extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A collection of SVG attributes to override the appearance
    * of the halo, for example <code>fill</code>, <code>stroke</code> and
    * <code>stroke-width</code>.</p>
    * @since 4.0.0
    */
  var attributes: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Opacity for the halo unless a specific fill is overridden
    * using the <code>attributes</code> setting. Note that Highcharts is
    * only able to apply opacity to colors of hex or rgb(a)
    * formats.</p>
    * @since 4.0.0
    */
  var opacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel size of the halo. For point markers this is the
    * radius of the halo. For pie slices it is the width of the
    * halo outside the slice. For bubbles it defaults to 5 and
    * is the width of the halo outside the bubble.</p>
    * @since 4.0.0
    */
  var size: js.UndefOr[Double] = js.undefined
}

object PlotOptionsScatter3dStatesSelectHalo {
  /**
    * @param attributes <p>A collection of SVG attributes to override the appearance. of the halo, for example <code>fill</code>, <code>stroke</code> and. <code>stroke-width</code>.</p>
    * @param opacity <p>Opacity for the halo unless a specific fill is overridden. using the <code>attributes</code> setting. Note that Highcharts is. only able to apply opacity to colors of hex or rgb(a). formats.</p>
    * @param size <p>The pixel size of the halo. For point markers this is the. radius of the halo. For pie slices it is the width of the. halo outside the slice. For bubbles it defaults to 5 and. is the width of the halo outside the bubble.</p>
    */
  def apply(attributes: js.UndefOr[js.Object] = js.undefined, opacity: js.UndefOr[Double] = js.undefined, size: js.UndefOr[Double] = js.undefined): PlotOptionsScatter3dStatesSelectHalo = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsScatter3dStatesSelectHalo {
      this.attributes = attributes
      this.opacity = opacity
      this.size = size
    })
  }
}