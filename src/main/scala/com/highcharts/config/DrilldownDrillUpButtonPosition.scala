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
  * @note JavaScript name: <code>drilldown-drillUpButton-position</code>
  */
@js.annotation.ScalaJSDefined
class DrilldownDrillUpButtonPosition extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Horizontal alignment.</p>
    * @since 3.0.8
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>The X offset of the button.</p>
    * @since 3.0.8
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The Y offset of the button.</p>
    * @since 3.0.8
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * <p>Vertical alignment of the button.</p>
    * @since 3.0.8
    */
  val verticalAlign: js.UndefOr[String] = js.undefined
}

object DrilldownDrillUpButtonPosition {
  /**
    * @param align <p>Horizontal alignment.</p>
    * @param x <p>The X offset of the button.</p>
    * @param y <p>The Y offset of the button.</p>
    * @param verticalAlign <p>Vertical alignment of the button.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined): DrilldownDrillUpButtonPosition = {
    val alignOuter: js.UndefOr[String] = align
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    com.highcharts.HighchartsGenericObject.toCleanObject(new DrilldownDrillUpButtonPosition {
      override val align: js.UndefOr[String] = alignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
    })
  }
}
