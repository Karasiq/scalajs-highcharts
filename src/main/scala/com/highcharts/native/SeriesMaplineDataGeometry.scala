/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;mapline&gt;-data-geometry</code>
  */
class SeriesMaplineDataGeometry extends com.highcharts.HighchartsGenericObject {

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

object SeriesMaplineDataGeometry {
  /**
    * @param coordinates <p>The geometry coordinates in terms of arrays of <code>[longitude, latitude]</code>, or. a two dimensional array of the same. The dimensionality must comply with the. <code>type</code>.</p>
    * @param `type` <p>The geometry type. Can be one of <code>LineString</code>, <code>Polygon</code>, <code>MultiLineString</code>. or <code>MultiPolygon</code>.</p>
    */
  def apply(coordinates: js.UndefOr[js.Array[js.Any] | js.Array[js.Array[js.Any]]] = js.undefined, `type`: js.UndefOr[String] = js.undefined): SeriesMaplineDataGeometry = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMaplineDataGeometry {
      this.coordinates = coordinates
      this.`type` = `type`
    })
  }
}
