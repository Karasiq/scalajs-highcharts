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
  * @note JavaScript name: <code>annotations-measure-typeOptions-points</code>
  */
class AnnotationsMeasureTypeOptionsPoints extends com.highcharts.HighchartsGenericObject {

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

object AnnotationsMeasureTypeOptionsPoints {
  /**
    * @param x <p>The x position of the point.</p>
    * @param y <p>The y position of the point.</p>
    */
  def apply(controlPoint: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): AnnotationsMeasureTypeOptionsPoints = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsMeasureTypeOptionsPoints {
      this.controlPoint = controlPoint
      this.x = x
      this.y = y
    })
  }
}