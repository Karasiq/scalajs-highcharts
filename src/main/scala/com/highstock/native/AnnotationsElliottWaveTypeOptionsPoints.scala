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
  * @note JavaScript name: <code>annotations-elliottWave-typeOptions-points</code>
  */
class AnnotationsElliottWaveTypeOptionsPoints extends com.highcharts.HighchartsGenericObject {

  var label: js.UndefOr[CleanJsObject[AnnotationsElliottWaveTypeOptionsPointsLabel]] = js.undefined

  var controlPoint: js.UndefOr[Double] = js.undefined

  /**
    * <p>The x position of the point.</p>
    * @since 6.0.0
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position of the point.</p>
    * @since 6.0.0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object AnnotationsElliottWaveTypeOptionsPoints {
  /**
    * @param x <p>The x position of the point.</p>
    * @param y <p>The y position of the point.</p>
    */
  def apply(label: js.UndefOr[CleanJsObject[AnnotationsElliottWaveTypeOptionsPointsLabel]] = js.undefined, controlPoint: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): AnnotationsElliottWaveTypeOptionsPoints = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsElliottWaveTypeOptionsPoints {
      this.label = label
      this.controlPoint = controlPoint
      this.x = x
      this.y = y
    })
  }
}
