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
  * @note JavaScript name: <code>series&lt;sunburst&gt;-data-marker-states</code>
  */
class SeriesSunburstDataMarkerStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The hover state for a single point marker.</p>
    * @since 8.1
    */
  var hover: js.Any = js.undefined

  /**
    * <p>The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the
    * <code>series.allowPointSelect</code> option to true.</p>
    * @since 8.1
    */
  var select: js.Any = js.undefined

  /**
    * <p>The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state
    * from hover.</p>
    * @since 8.1
    */
  var normal: js.Any = js.undefined
}

object SeriesSunburstDataMarkerStates {
  /**
    * @param hover <p>The hover state for a single point marker.</p>
    * @param select <p>The appearance of the point marker when selected. In order to. allow a point to be selected, set the. <code>series.allowPointSelect</code> option to true.</p>
    * @param normal <p>The normal state of a single point marker. Currently only. used for setting animation when returning to normal state. from hover.</p>
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[js.Any] = js.undefined, normal: js.UndefOr[js.Any] = js.undefined): SeriesSunburstDataMarkerStates = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSunburstDataMarkerStates {
      this.hover = hover
      this.select = select
      this.normal = normal
    })
  }
}
