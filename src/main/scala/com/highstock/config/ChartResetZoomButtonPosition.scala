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
  * @note JavaScript name: <code>chart-resetZoomButton-position</code>
  */
@js.annotation.ScalaJSDefined
class ChartResetZoomButtonPosition extends js.Object {

  /**
    * The horizontal alignment.
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * The vertical alignment of the button.
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * The horizontal offset of the button
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The vertical offset of the button.
    */
  val y: js.UndefOr[Double] = js.undefined
}

object ChartResetZoomButtonPosition {
  /**
    * @param align The horizontal alignment.
    * @param verticalAlign The vertical alignment of the button.
    * @param x The horizontal offset of the button
    * @param y The vertical offset of the button.
    */
  def apply(align: js.UndefOr[String] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): ChartResetZoomButtonPosition = {
    val alignOuter: js.UndefOr[String] = align
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new ChartResetZoomButtonPosition {
      override val align: js.UndefOr[String] = alignOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
