/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart-resetZoomButton-position</code>
  */
@js.annotation.ScalaJSDefined
class ChartResetZoomButtonPosition extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The horizontal alignment of the button.</p>
    * @since 2.2
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>The horizontal offset of the button.</p>
    * @since 2.2
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The vertical offset of the button.</p>
    * @since 2.2
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * <p>The vertical alignment of the button.</p>
    * @since 2.2
    */
  val verticalAlign: js.UndefOr[String] = js.undefined
}

object ChartResetZoomButtonPosition {
  /**
    * @param align <p>The horizontal alignment of the button.</p>
    * @param x <p>The horizontal offset of the button.</p>
    * @param y <p>The vertical offset of the button.</p>
    * @param verticalAlign <p>The vertical alignment of the button.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined): ChartResetZoomButtonPosition = {
    val alignOuter: js.UndefOr[String] = align
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartResetZoomButtonPosition {
      override val align: js.UndefOr[String] = alignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
    })
  }
}
