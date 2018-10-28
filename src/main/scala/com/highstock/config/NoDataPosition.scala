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
  * @note JavaScript name: <code>noData-position</code>
  */
@js.annotation.ScalaJSDefined
class NoDataPosition extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Horizontal offset of the label, in pixels.</p>
    * @since 3.0.8
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>Vertical offset of the label, in pixels.</p>
    * @since 3.0.8
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * <p>Horizontal alignment of the label.</p>
    * @since 3.0.8
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>Vertical alignment of the label.</p>
    * @since 3.0.8
    */
  val verticalAlign: js.UndefOr[String] = js.undefined
}

object NoDataPosition {
  /**
    * @param x <p>Horizontal offset of the label, in pixels.</p>
    * @param y <p>Vertical offset of the label, in pixels.</p>
    * @param align <p>Horizontal alignment of the label.</p>
    * @param verticalAlign <p>Vertical alignment of the label.</p>
    */
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, align: js.UndefOr[String] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined): NoDataPosition = {
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val alignOuter: js.UndefOr[String] = align
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    com.highcharts.HighchartsGenericObject.toCleanObject(new NoDataPosition {
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val align: js.UndefOr[String] = alignOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
    })
  }
}
