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
  * @note JavaScript name: <code>plotOptions-sunburst-levels-colorVariation</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSunburstLevelsColorVariation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The key of a color variation. Currently supports <code>brightness</code> only.</p>
    */
  val key: js.UndefOr[String] = js.undefined

  /**
    * <p>The ending value of a color variation. The last sibling will receive this
    * value.</p>
    */
  val to: js.UndefOr[Double] = js.undefined
}

object PlotOptionsSunburstLevelsColorVariation {
  /**
    * @param key <p>The key of a color variation. Currently supports <code>brightness</code> only.</p>
    * @param to <p>The ending value of a color variation. The last sibling will receive this. value.</p>
    */
  def apply(key: js.UndefOr[String] = js.undefined, to: js.UndefOr[Double] = js.undefined): PlotOptionsSunburstLevelsColorVariation = {
    val keyOuter: js.UndefOr[String] = key
    val toOuter: js.UndefOr[Double] = to
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSunburstLevelsColorVariation {
      override val key: js.UndefOr[String] = keyOuter
      override val to: js.UndefOr[Double] = toOuter
    })
  }
}
