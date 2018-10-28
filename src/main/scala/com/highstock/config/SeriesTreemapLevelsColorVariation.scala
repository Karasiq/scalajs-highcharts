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
  * @note JavaScript name: <code>series&lt;treemap&gt;-levels-colorVariation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesTreemapLevelsColorVariation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The key of a color variation. Currently supports <code>brightness</code> only.</p>
    * @since 6.0.0
    */
  val key: js.UndefOr[String] = js.undefined

  /**
    * <p>The ending value of a color variation. The last sibling will receive this
    * value.</p>
    * @since 6.0.0
    */
  val to: js.UndefOr[Double] = js.undefined
}

object SeriesTreemapLevelsColorVariation {
  /**
    * @param key <p>The key of a color variation. Currently supports <code>brightness</code> only.</p>
    * @param to <p>The ending value of a color variation. The last sibling will receive this. value.</p>
    */
  def apply(key: js.UndefOr[String] = js.undefined, to: js.UndefOr[Double] = js.undefined): SeriesTreemapLevelsColorVariation = {
    val keyOuter: js.UndefOr[String] = key
    val toOuter: js.UndefOr[Double] = to
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapLevelsColorVariation {
      override val key: js.UndefOr[String] = keyOuter
      override val to: js.UndefOr[Double] = toOuter
    })
  }
}
