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
  * @note JavaScript name: <code>plotOptions-vector-cluster-zones</code>
  */
class PlotOptionsVectorClusterZones extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styled mode only. A custom class name for the zone.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">Zones styled by class name</a>
    * @since 8.0.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>The value where the zone starts.</p>
    * @since 8.0.0
    */
  var from: js.UndefOr[Double] = js.undefined

  /**
    * <p>Settings for the cluster marker belonging to the zone.</p>
    * @since 8.0.0
    */
  var marker: js.UndefOr[CleanJsObject[PlotOptionsVectorClusterZonesMarker]] = js.undefined

  /**
    * <p>The value where the zone ends.</p>
    * @since 8.0.0
    */
  var to: js.UndefOr[Double] = js.undefined
}

object PlotOptionsVectorClusterZones {
  /**
    * @param className <p>Styled mode only. A custom class name for the zone.</p>
    * @param from <p>The value where the zone starts.</p>
    * @param marker <p>Settings for the cluster marker belonging to the zone.</p>
    * @param to <p>The value where the zone ends.</p>
    */
  def apply(className: js.UndefOr[String] = js.undefined, from: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[CleanJsObject[PlotOptionsVectorClusterZonesMarker]] = js.undefined, to: js.UndefOr[Double] = js.undefined): PlotOptionsVectorClusterZones = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVectorClusterZones {
      this.className = className
      this.from = from
      this.marker = marker
      this.to = to
    })
  }
}
