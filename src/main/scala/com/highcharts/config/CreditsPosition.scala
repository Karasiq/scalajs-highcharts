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
  * @note JavaScript name: <code>credits-position</code>
  */
@js.annotation.ScalaJSDefined
class CreditsPosition extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Horizontal alignment of the credits.</p>
    * @since 2.1
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>Horizontal pixel offset of the credits.</p>
    * @since 2.1
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>Vertical alignment of the credits.</p>
    * @since 2.1
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Vertical pixel offset of the credits.</p>
    * @since 2.1
    */
  val y: js.UndefOr[Double] = js.undefined
}

object CreditsPosition {
  /**
    * @param align <p>Horizontal alignment of the credits.</p>
    * @param x <p>Horizontal pixel offset of the credits.</p>
    * @param verticalAlign <p>Vertical alignment of the credits.</p>
    * @param y <p>Vertical pixel offset of the credits.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, y: js.UndefOr[Double] = js.undefined): CreditsPosition = {
    val alignOuter: js.UndefOr[String] = align
    val xOuter: js.UndefOr[Double] = x
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val yOuter: js.UndefOr[Double] = y
    com.highcharts.HighchartsGenericObject.toCleanObject(new CreditsPosition {
      override val align: js.UndefOr[String] = alignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val y: js.UndefOr[Double] = yOuter
    })
  }
}
