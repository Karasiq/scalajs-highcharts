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
  * @note JavaScript name: <code>series&lt;scatter3d&gt;-accessibility</code>
  */
class SeriesScatter3dAccessibility extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Provide a description of the series, announced to screen readers.</p>
    * @since 7.1.0
    */
  var description: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable/disable accessibility functionality for a specific series.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Expose only the series element to screen readers, not its points.</p>
    * @since 7.1.0
    */
  var exposeAsGroupOnly: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Keyboard navigation for a series</p>
    * @since 7.1.0
    */
  var keyboardNavigation: js.Any = js.undefined

  /**
    * <p>Point accessibility options for a series.</p>
    * @since 9.3.0
    */
  var point: js.UndefOr[CleanJsObject[SeriesScatter3dAccessibilityPoint]] = js.undefined
}

object SeriesScatter3dAccessibility {
  /**
    * @param description <p>Provide a description of the series, announced to screen readers.</p>
    * @param enabled <p>Enable/disable accessibility functionality for a specific series.</p>
    * @param exposeAsGroupOnly <p>Expose only the series element to screen readers, not its points.</p>
    * @param keyboardNavigation <p>Keyboard navigation for a series</p>
    * @param point <p>Point accessibility options for a series.</p>
    */
  def apply(description: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, exposeAsGroupOnly: js.UndefOr[Boolean] = js.undefined, keyboardNavigation: js.UndefOr[js.Any] = js.undefined, point: js.UndefOr[CleanJsObject[SeriesScatter3dAccessibilityPoint]] = js.undefined): SeriesScatter3dAccessibility = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesScatter3dAccessibility {
      this.description = description
      this.enabled = enabled
      this.exposeAsGroupOnly = exposeAsGroupOnly
      this.keyboardNavigation = keyboardNavigation
      this.point = point
    })
  }
}
