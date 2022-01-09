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
  * @note JavaScript name: <code>series&lt;map&gt;-data-geometry</code>
  */
class SeriesMapDataGeometry extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The geometry coordinates in terms of arrays of <code>[longitude, latitude]</code>, or
    * a two dimensional array of the same. The dimensionality must comply with the
    * <code>type</code>.</p>
    * @since 9.3.0
    */
  var coordinates: js.UndefOr[js.Array[js.Any] | js.Array[js.Array[js.Any]]] = js.undefined

  /**
    * <p>The geometry type. Can be one of <code>LineString</code>, <code>Polygon</code>, <code>MultiLineString</code>
    * or <code>MultiPolygon</code>.</p>
    * @since 9.3.0
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SeriesMapDataGeometry {
  /**
    * @param coordinates <p>The geometry coordinates in terms of arrays of <code>[longitude, latitude]</code>, or. a two dimensional array of the same. The dimensionality must comply with the. <code>type</code>.</p>
    * @param `type` <p>The geometry type. Can be one of <code>LineString</code>, <code>Polygon</code>, <code>MultiLineString</code>. or <code>MultiPolygon</code>.</p>
    */
  def apply(coordinates: js.UndefOr[js.Array[js.Any] | js.Array[js.Array[js.Any]]] = js.undefined, `type`: js.UndefOr[String] = js.undefined): SeriesMapDataGeometry = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMapDataGeometry {
      this.coordinates = coordinates
      this.`type` = `type`
    })
  }
}
