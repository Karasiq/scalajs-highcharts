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
  * @note JavaScript name: <code>series&lt;treemap&gt;-cluster-dataLabels</code>
  */
class SeriesTreemapClusterDataLabels extends com.highcharts.HighchartsGenericObject {

  var align: js.UndefOr[String] = js.undefined

  var enabled: js.UndefOr[Boolean] = js.undefined

  var format: js.UndefOr[String] = js.undefined

  var inside: js.UndefOr[Boolean] = js.undefined

  var style: js.Any = js.undefined

  var verticalAlign: js.UndefOr[String] = js.undefined
}

object SeriesTreemapClusterDataLabels {
  /**
    */
  def apply(align: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, format: js.UndefOr[String] = js.undefined, inside: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Any] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined): SeriesTreemapClusterDataLabels = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapClusterDataLabels {
      this.align = align
      this.enabled = enabled
      this.format = format
      this.inside = inside
      this.style = style
      this.verticalAlign = verticalAlign
    })
  }
}