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
  * @note JavaScript name: <code>navigation-annotationsOptions-timeCycles-typeOptions-points</code>
  */
class NavigationAnnotationsOptionsTimeCyclesTypeOptionsPoints extends com.highcharts.HighchartsGenericObject {

  var controlPoint: js.UndefOr[Double] = js.undefined

  /**
    * <p>The x position of the point.</p>
    * @since 6.0.0
    */
  var x: js.UndefOr[Double] = js.undefined
}

object NavigationAnnotationsOptionsTimeCyclesTypeOptionsPoints {
  /**
    * @param x <p>The x position of the point.</p>
    */
  def apply(controlPoint: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined): NavigationAnnotationsOptionsTimeCyclesTypeOptionsPoints = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigationAnnotationsOptionsTimeCyclesTypeOptionsPoints {
      this.controlPoint = controlPoint
      this.x = x
    })
  }
}
