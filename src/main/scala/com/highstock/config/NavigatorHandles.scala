/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>navigator-handles</code>
  */
@js.annotation.ScalaJSDefined
class NavigatorHandles extends js.Object {

  /**
    * The fill for the handle.
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The stroke for the handle border and the stripes inside.
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined
}

object NavigatorHandles {
  /**
    * @param backgroundColor The fill for the handle.
    * @param borderColor The stroke for the handle border and the stripes inside.
    */
  def apply(backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined): NavigatorHandles = {
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    new NavigatorHandles {
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
    }
  }
}
