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
  * @note JavaScript name: <code>lang-accessibility-screenReaderSection</code>
  */
class LangAccessibilityScreenReaderSection extends com.highcharts.HighchartsGenericObject {

  var afterRegionLabel: js.UndefOr[String] = js.undefined

  /**
    * <p>Language options for annotation descriptions.</p>
    * @since 8.0.1
    */
  var annotations: js.Any = js.undefined

  var beforeRegionLabel: js.UndefOr[String] = js.undefined

  /**
    * <p>Label for the end of the chart. Announced by screen readers.</p>
    * @since 8.0.0
    */
  var endOfChartMarker: js.UndefOr[String] = js.undefined
}

object LangAccessibilityScreenReaderSection {
  /**
    * @param annotations <p>Language options for annotation descriptions.</p>
    * @param endOfChartMarker <p>Label for the end of the chart. Announced by screen readers.</p>
    */
  def apply(afterRegionLabel: js.UndefOr[String] = js.undefined, annotations: js.UndefOr[js.Any] = js.undefined, beforeRegionLabel: js.UndefOr[String] = js.undefined, endOfChartMarker: js.UndefOr[String] = js.undefined): LangAccessibilityScreenReaderSection = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibilityScreenReaderSection {
      this.afterRegionLabel = afterRegionLabel
      this.annotations = annotations
      this.beforeRegionLabel = beforeRegionLabel
      this.endOfChartMarker = endOfChartMarker
    })
  }
}
