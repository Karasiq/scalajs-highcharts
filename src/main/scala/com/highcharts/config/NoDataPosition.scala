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
  * @note JavaScript name: <code>noData-position</code>
  */
@js.annotation.ScalaJSDefined
class NoDataPosition extends js.Object {

  /**
    * Horizontal alignment of the label.
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * Vertical alignment of the label.
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * Horizontal offset of the label, in pixels.
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * Vertical offset of the label, in pixels.
    */
  val y: js.UndefOr[Double] = js.undefined
}

object NoDataPosition {
  /**
    * @param align Horizontal alignment of the label.
    * @param verticalAlign Vertical alignment of the label.
    * @param x Horizontal offset of the label, in pixels.
    * @param y Vertical offset of the label, in pixels.
    */
  def apply(align: js.UndefOr[String] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): NoDataPosition = {
    val alignOuter: js.UndefOr[String] = align
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new NoDataPosition {
      override val align: js.UndefOr[String] = alignOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
