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
  * @note JavaScript name: <code>chart-options3d-frame-left</code>
  */
@js.annotation.ScalaJSDefined
class ChartOptions3dFrameLeft extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of the panel.</p>
    * @since 4.0
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The thickness of the panel.</p>
    * @since 4.0
    */
  val size: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to display the frame. Possible values are <code>true</code>,
    * <code>false</code>, <code>&quot;auto&quot;</code> to display only the frames behind the data,
    * and <code>&quot;default&quot;</code> to display faces behind the data based on the
    * axis layout, ignoring the point of view.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter-frame/">Auto frames</a>
    * @since 5.0.12
    */
  val visible: js.UndefOr[Boolean | String] = js.undefined
}

object ChartOptions3dFrameLeft {
  /**
    * @param color <p>The color of the panel.</p>
    * @param size <p>The thickness of the panel.</p>
    * @param visible <p>Whether to display the frame. Possible values are <code>true</code>,. <code>false</code>, <code>&quot;auto&quot;</code> to display only the frames behind the data,. and <code>&quot;default&quot;</code> to display faces behind the data based on the. axis layout, ignoring the point of view.</p>
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, size: js.UndefOr[Double] = js.undefined, visible: js.UndefOr[Boolean | String] = js.undefined): ChartOptions3dFrameLeft = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val sizeOuter: js.UndefOr[Double] = size
    val visibleOuter: js.UndefOr[Boolean | String] = visible
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartOptions3dFrameLeft {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val size: js.UndefOr[Double] = sizeOuter
      override val visible: js.UndefOr[Boolean | String] = visibleOuter
    })
  }
}
