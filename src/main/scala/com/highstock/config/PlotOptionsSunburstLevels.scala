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
  * @note JavaScript name: <code>plotOptions-sunburst-levels</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSunburstLevels extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Can set a <code>borderColor</code> on all points which lies on the same level.</p>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Can set a <code>borderWidth</code> on all points which lies on the same level.</p>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Can set a <code>borderDashStyle</code> on all points which lies on the same level.</p>
    */
  val borderDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Can set a <code>color</code> on all points which lies on the same level.</p>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Can set a <code>colorVariation</code> on all points which lies on the same level.</p>
    */
  val colorVariation: js.UndefOr[CleanJsObject[PlotOptionsSunburstLevelsColorVariation]] = js.undefined

  /**
    * <p>Can set a <code>dataLabels</code> on all points which lies on the same level.</p>
    */
  val dataLabels: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Can set a <code>levelSize</code> on all points which lies on the same level.</p>
    */
  val levelSize: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Can set a <code>rotation</code> on all points which lies on the same level.</p>
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * <p>Can set a <code>rotationMode</code> on all points which lies on the same level.</p>
    */
  val rotationMode: js.UndefOr[String] = js.undefined
}

object PlotOptionsSunburstLevels {
  /**
    * @param borderColor <p>Can set a <code>borderColor</code> on all points which lies on the same level.</p>
    * @param borderWidth <p>Can set a <code>borderWidth</code> on all points which lies on the same level.</p>
    * @param borderDashStyle <p>Can set a <code>borderDashStyle</code> on all points which lies on the same level.</p>
    * @param color <p>Can set a <code>color</code> on all points which lies on the same level.</p>
    * @param colorVariation <p>Can set a <code>colorVariation</code> on all points which lies on the same level.</p>
    * @param dataLabels <p>Can set a <code>dataLabels</code> on all points which lies on the same level.</p>
    * @param levelSize <p>Can set a <code>levelSize</code> on all points which lies on the same level.</p>
    * @param rotation <p>Can set a <code>rotation</code> on all points which lies on the same level.</p>
    * @param rotationMode <p>Can set a <code>rotationMode</code> on all points which lies on the same level.</p>
    */
  def apply(borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, borderDashStyle: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorVariation: js.UndefOr[CleanJsObject[PlotOptionsSunburstLevelsColorVariation]] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, levelSize: js.UndefOr[js.Object] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, rotationMode: js.UndefOr[String] = js.undefined): PlotOptionsSunburstLevels = {
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val borderDashStyleOuter: js.UndefOr[String] = borderDashStyle
    val colorOuter: js.UndefOr[String | js.Object] = color
    val colorVariationOuter: js.UndefOr[CleanJsObject[PlotOptionsSunburstLevelsColorVariation]] = colorVariation
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val levelSizeOuter: js.UndefOr[js.Object] = levelSize
    val rotationOuter: js.UndefOr[Double] = rotation
    val rotationModeOuter: js.UndefOr[String] = rotationMode
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSunburstLevels {
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val borderDashStyle: js.UndefOr[String] = borderDashStyleOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val colorVariation: js.UndefOr[CleanJsObject[PlotOptionsSunburstLevelsColorVariation]] = colorVariationOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val levelSize: js.UndefOr[js.Object] = levelSizeOuter
      override val rotation: js.UndefOr[Double] = rotationOuter
      override val rotationMode: js.UndefOr[String] = rotationModeOuter
    })
  }
}
