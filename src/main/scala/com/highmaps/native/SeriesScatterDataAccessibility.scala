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
  * @note JavaScript name: <code>series&lt;scatter&gt;-data-accessibility</code>
  */
class SeriesScatterDataAccessibility extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Provide a description of the data point, announced to screen readers.</p>
    * @since 7.1.0
    */
  var description: js.UndefOr[String] = js.undefined

  /**
    * <p>Set to false to disable accessibility functionality for a specific point.
    * The point will not be included in keyboard navigation, and will not be
    * exposed to assistive technology.</p>
    * @since 9.0.1
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object SeriesScatterDataAccessibility {
  /**
    * @param description <p>Provide a description of the data point, announced to screen readers.</p>
    * @param enabled <p>Set to false to disable accessibility functionality for a specific point.. The point will not be included in keyboard navigation, and will not be. exposed to assistive technology.</p>
    */
  def apply(description: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined): SeriesScatterDataAccessibility = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesScatterDataAccessibility {
      this.description = description
      this.enabled = enabled
    })
  }
}
