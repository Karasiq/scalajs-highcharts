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
  * @note JavaScript name: <code>xAxis-accessibility</code>
  */
class XAxisAccessibility extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Description for an axis to expose to screen reader users.</p>
    * @since 7.1.0
    */
  var description: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable axis accessibility features, including axis information in the
    * screen reader information region. If this is disabled on the xAxis, the
    * x values are not exposed to screen readers for the individual data points
    * by default.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Range description for an axis. Overrides the default range description.
    * Set to empty to disable range description for this axis.</p>
    * @since 7.1.0
    */
  var rangeDescription: js.UndefOr[String] = js.undefined
}

object XAxisAccessibility {
  /**
    * @param description <p>Description for an axis to expose to screen reader users.</p>
    * @param enabled <p>Enable axis accessibility features, including axis information in the. screen reader information region. If this is disabled on the xAxis, the. x values are not exposed to screen readers for the individual data points. by default.</p>
    * @param rangeDescription <p>Range description for an axis. Overrides the default range description.. Set to empty to disable range description for this axis.</p>
    */
  def apply(description: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, rangeDescription: js.UndefOr[String] = js.undefined): XAxisAccessibility = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new XAxisAccessibility {
      this.description = description
      this.enabled = enabled
      this.rangeDescription = rangeDescription
    })
  }
}
