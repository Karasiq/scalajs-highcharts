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
  * @note JavaScript name: <code>lang-accessibility-screenReaderSection-annotations</code>
  */
class LangAccessibilityScreenReaderSectionAnnotations extends com.highcharts.HighchartsGenericObject {

  var descriptionMultiplePoints: js.UndefOr[String] = js.undefined

  var descriptionNoPoints: js.UndefOr[String] = js.undefined

  var descriptionSinglePoint: js.UndefOr[String] = js.undefined

  var heading: js.UndefOr[String] = js.undefined
}

object LangAccessibilityScreenReaderSectionAnnotations {
  /**
    */
  def apply(descriptionMultiplePoints: js.UndefOr[String] = js.undefined, descriptionNoPoints: js.UndefOr[String] = js.undefined, descriptionSinglePoint: js.UndefOr[String] = js.undefined, heading: js.UndefOr[String] = js.undefined): LangAccessibilityScreenReaderSectionAnnotations = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibilityScreenReaderSectionAnnotations {
      this.descriptionMultiplePoints = descriptionMultiplePoints
      this.descriptionNoPoints = descriptionNoPoints
      this.descriptionSinglePoint = descriptionSinglePoint
      this.heading = heading
    })
  }
}
