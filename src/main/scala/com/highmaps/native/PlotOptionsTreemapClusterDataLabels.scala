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
  * @note JavaScript name: <code>plotOptions-treemap-cluster-dataLabels</code>
  */
class PlotOptionsTreemapClusterDataLabels extends com.highcharts.HighchartsGenericObject {

  var align: js.UndefOr[String] = js.undefined

  var enabled: js.UndefOr[Boolean] = js.undefined

  var format: js.UndefOr[String] = js.undefined

  var inside: js.UndefOr[Boolean] = js.undefined

  var style: js.Any = js.undefined

  var verticalAlign: js.UndefOr[String] = js.undefined
}

object PlotOptionsTreemapClusterDataLabels {
  /**
    */
  def apply(align: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, format: js.UndefOr[String] = js.undefined, inside: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Any] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined): PlotOptionsTreemapClusterDataLabels = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTreemapClusterDataLabels {
      this.align = align
      this.enabled = enabled
      this.format = format
      this.inside = inside
      this.style = style
      this.verticalAlign = verticalAlign
    })
  }
}