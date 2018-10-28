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
  * @note JavaScript name: <code>series&lt;wordcloud&gt;-rotation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesWordcloudRotation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The smallest degree of rotation for a word.</p>
    */
  val from: js.UndefOr[Double] = js.undefined

  /**
    * <p>The number of possible orientations for a word, within the range of
    * <code>rotation.from</code> and <code>rotation.to</code>.</p>
    */
  val orientations: js.UndefOr[Double] = js.undefined

  /**
    * <p>The largest degree of rotation for a word.</p>
    */
  val to: js.UndefOr[Double] = js.undefined
}

object SeriesWordcloudRotation {
  /**
    * @param from <p>The smallest degree of rotation for a word.</p>
    * @param orientations <p>The number of possible orientations for a word, within the range of. <code>rotation.from</code> and <code>rotation.to</code>.</p>
    * @param to <p>The largest degree of rotation for a word.</p>
    */
  def apply(from: js.UndefOr[Double] = js.undefined, orientations: js.UndefOr[Double] = js.undefined, to: js.UndefOr[Double] = js.undefined): SeriesWordcloudRotation = {
    val fromOuter: js.UndefOr[Double] = from
    val orientationsOuter: js.UndefOr[Double] = orientations
    val toOuter: js.UndefOr[Double] = to
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesWordcloudRotation {
      override val from: js.UndefOr[Double] = fromOuter
      override val orientations: js.UndefOr[Double] = orientationsOuter
      override val to: js.UndefOr[Double] = toOuter
    })
  }
}
