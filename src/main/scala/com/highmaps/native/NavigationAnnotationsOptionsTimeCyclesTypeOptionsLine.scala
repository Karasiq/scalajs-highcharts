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
  * @note JavaScript name: <code>navigation-annotationsOptions-timeCycles-typeOptions-line</code>
  */
class NavigationAnnotationsOptionsTimeCyclesTypeOptionsLine extends com.highcharts.HighchartsGenericObject {

  var fill: js.UndefOr[String] = js.undefined
}

object NavigationAnnotationsOptionsTimeCyclesTypeOptionsLine {
  /**
    */
  def apply(fill: js.UndefOr[String] = js.undefined): NavigationAnnotationsOptionsTimeCyclesTypeOptionsLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigationAnnotationsOptionsTimeCyclesTypeOptionsLine {
      this.fill = fill
    })
  }
}
