/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>annotations-labelOptions-style</code>
  */
@js.annotation.ScalaJSDefined
class AnnotationsLabelOptionsStyle extends com.highcharts.HighchartsGenericObject {

  val fontSize: js.UndefOr[String] = js.undefined

  val fontWeight: js.UndefOr[String] = js.undefined

  val color: js.UndefOr[String] = js.undefined
}

object AnnotationsLabelOptionsStyle {
  /**
    */
  def apply(fontSize: js.UndefOr[String] = js.undefined, fontWeight: js.UndefOr[String] = js.undefined, color: js.UndefOr[String] = js.undefined): AnnotationsLabelOptionsStyle = {
    val fontSizeOuter: js.UndefOr[String] = fontSize
    val fontWeightOuter: js.UndefOr[String] = fontWeight
    val colorOuter: js.UndefOr[String] = color
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsLabelOptionsStyle {
      override val fontSize: js.UndefOr[String] = fontSizeOuter
      override val fontWeight: js.UndefOr[String] = fontWeightOuter
      override val color: js.UndefOr[String] = colorOuter
    })
  }
}
