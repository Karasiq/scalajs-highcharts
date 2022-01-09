/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;mappoint&gt;-data-geometry</code>
  */
class SeriesMappointDataGeometry extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The geometry coordinates in terms of <code>[longitude, latitude]</code>.</p>
    * @since 9.3.0
    */
  var coordinates: js.Any = js.undefined

  /**
    * <p>The geometry type, which in case of the <code>mappoint</code> series is always <code>Point</code>.</p>
    * @since 9.3.0
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SeriesMappointDataGeometry {
  /**
    * @param coordinates <p>The geometry coordinates in terms of <code>[longitude, latitude]</code>.</p>
    * @param `type` <p>The geometry type, which in case of the <code>mappoint</code> series is always <code>Point</code>.</p>
    */
  def apply(coordinates: js.UndefOr[js.Any] = js.undefined, `type`: js.UndefOr[String] = js.undefined): SeriesMappointDataGeometry = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMappointDataGeometry {
      this.coordinates = coordinates
      this.`type` = `type`
    })
  }
}
