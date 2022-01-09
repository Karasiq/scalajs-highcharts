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
  * @note JavaScript name: <code>annotations-measure-typeOptions-background</code>
  */
class AnnotationsMeasureTypeOptionsBackground extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of the rectangle.</p>
    * @since 6.0.0
    */
  var fill: js.UndefOr[String] = js.undefined

  /**
    * <p>The color of border.</p>
    * @since 6.0.0
    */
  var stroke: js.UndefOr[String] = js.undefined

  /**
    * <p>The width of border.</p>
    * @since 6.0.0
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
}

object AnnotationsMeasureTypeOptionsBackground {
  /**
    * @param fill <p>The color of the rectangle.</p>
    * @param stroke <p>The color of border.</p>
    * @param strokeWidth <p>The width of border.</p>
    */
  def apply(fill: js.UndefOr[String] = js.undefined, stroke: js.UndefOr[String] = js.undefined, strokeWidth: js.UndefOr[Double] = js.undefined): AnnotationsMeasureTypeOptionsBackground = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsMeasureTypeOptionsBackground {
      this.fill = fill
      this.stroke = stroke
      this.strokeWidth = strokeWidth
    })
  }
}
