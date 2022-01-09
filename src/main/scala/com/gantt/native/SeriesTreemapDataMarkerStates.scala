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
  * @note JavaScript name: <code>series&lt;treemap&gt;-data-marker-states</code>
  */
class SeriesTreemapDataMarkerStates extends com.highcharts.HighchartsGenericObject {

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

object SeriesTreemapDataMarkerStates {
  /**
    * @param hover <p>The hover state for a single point marker.</p>
    * @param select <p>The appearance of the point marker when selected. In order to. allow a point to be selected, set the. <code>series.allowPointSelect</code> option to true.</p>
    * @param normal <p>The normal state of a single point marker. Currently only. used for setting animation when returning to normal state. from hover.</p>
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[js.Any] = js.undefined, normal: js.UndefOr[js.Any] = js.undefined): SeriesTreemapDataMarkerStates = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapDataMarkerStates {
      this.hover = hover
      this.select = select
      this.normal = normal
    })
  }
}
