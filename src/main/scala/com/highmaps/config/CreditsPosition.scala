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
  * @note JavaScript name: <code>credits-position</code>
  */
@js.annotation.ScalaJSDefined
class CreditsPosition extends js.Object {

  /**
    * Horizontal alignment of the credits.
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * Vertical alignment of the credits.
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * Horizontal pixel offset of the credits.
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * Vertical pixel offset of the credits.
    */
  val y: js.UndefOr[Double] = js.undefined
}

object CreditsPosition {
  /**
    * @param align Horizontal alignment of the credits.
    * @param verticalAlign Vertical alignment of the credits.
    * @param x Horizontal pixel offset of the credits.
    * @param y Vertical pixel offset of the credits.
    */
  def apply(align: js.UndefOr[String] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): CreditsPosition = {
    val alignOuter: js.UndefOr[String] = align
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new CreditsPosition {
      override val align: js.UndefOr[String] = alignOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
