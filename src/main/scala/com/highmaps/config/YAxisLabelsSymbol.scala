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
  * @note JavaScript name: <code>yAxis-labels-symbol</code>
  */
@js.annotation.ScalaJSDefined
class YAxisLabelsSymbol extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The symbol type. Points to a definition function in
    * the <code>Highcharts.Renderer.symbols</code> collection.</p>
    */
  val `type`: js.UndefOr[String] = "triangle"

  val x: js.UndefOr[Double] = js.undefined

  val y: js.UndefOr[Double] = js.undefined

  val height: js.UndefOr[Double] = js.undefined

  val width: js.UndefOr[Double] = js.undefined

  val padding: js.UndefOr[Double] = js.undefined
}

object YAxisLabelsSymbol {
  /**
    * @param `type` <p>The symbol type. Points to a definition function in. the <code>Highcharts.Renderer.symbols</code> collection.</p>
    */
  def apply(`type`: js.UndefOr[String] = "triangle", x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined, padding: js.UndefOr[Double] = js.undefined): YAxisLabelsSymbol = {
    val typeOuter: js.UndefOr[String] = `type`
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val heightOuter: js.UndefOr[Double] = height
    val widthOuter: js.UndefOr[Double] = width
    val paddingOuter: js.UndefOr[Double] = padding
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisLabelsSymbol {
      override val `type`: js.UndefOr[String] = typeOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val width: js.UndefOr[Double] = widthOuter
      override val padding: js.UndefOr[Double] = paddingOuter
    })
  }
}
