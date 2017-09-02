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
  * @note JavaScript name: <code>chart-options3d-frame-back</code>
  */
@js.annotation.ScalaJSDefined
class ChartOptions3dFrameBack extends js.Object {

  /**
    * The color of the panel.
    * @since 4.0
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Thickness of the panel.
    * @since 4.0
    */
  val size: js.UndefOr[Double] = js.undefined

  /**
    * Whether to display the frame. Possible values are <code>true</code>, <code>false</code>, <code>"auto"</code> to display only the frames behind the data, and <code>"default"</code> to display faces behind the data based on the axis layout, ignoring the point of view.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/samples/highcharts/3d/scatter-frame/" target="_blank">Auto frames</a>
    * @since 5.0.12
    */
  val visible: js.UndefOr[Boolean | String] = js.undefined
}

object ChartOptions3dFrameBack {
  /**
    * @param color The color of the panel.
    * @param size Thickness of the panel.
    * @param visible Whether to display the frame. Possible values are <code>true</code>, <code>false</code>, <code>"auto"</code> to display only the frames behind the data, and <code>"default"</code> to display faces behind the data based on the axis layout, ignoring the point of view.
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, size: js.UndefOr[Double] = js.undefined, visible: js.UndefOr[Boolean | String] = js.undefined): ChartOptions3dFrameBack = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val sizeOuter: js.UndefOr[Double] = size
    val visibleOuter: js.UndefOr[Boolean | String] = visible
    new ChartOptions3dFrameBack {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val size: js.UndefOr[Double] = sizeOuter
      override val visible: js.UndefOr[Boolean | String] = visibleOuter
    }
  }
}
