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
  * @note JavaScript name: <code>plotOptions-scatter-cluster-states-hover</code>
  */
class PlotOptionsScatterClusterStatesHover extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The fill color of the cluster marker in hover state. When
    * <code>undefined</code>, the series&#39; or point&#39;s fillColor for normal
    * state is used.</p>
    * @since 8.0.0
    */
  var fillColor: js.Any = js.undefined
}

object PlotOptionsScatterClusterStatesHover {
  /**
    * @param fillColor <p>The fill color of the cluster marker in hover state. When. <code>undefined</code>, the series&#39; or point&#39;s fillColor for normal. state is used.</p>
    */
  def apply(fillColor: js.UndefOr[js.Any] = js.undefined): PlotOptionsScatterClusterStatesHover = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsScatterClusterStatesHover {
      this.fillColor = fillColor
    })
  }
}
