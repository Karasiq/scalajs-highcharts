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
  * @note JavaScript name: <code>chart-options3d-frame</code>
  */
@js.annotation.ScalaJSDefined
class ChartOptions3dFrame extends js.Object {

  /**
    * Defines the back panel of the frame around 3D charts.
    * @since 4.0
    */
  val back: js.UndefOr[CleanJsObject[ChartOptions3dFrameBack]] = js.undefined

  /**
    * The bottom of the frame around a 3D chart.
    * @since 4.0
    */
  val bottom: js.UndefOr[CleanJsObject[ChartOptions3dFrameBottom]] = js.undefined

  /**
    * The side for the frame around a 3D chart.
    * @since 4.0
    */
  val side: js.UndefOr[CleanJsObject[ChartOptions3dFrameSide]] = js.undefined
}

object ChartOptions3dFrame {
  /**
    * @param back Defines the back panel of the frame around 3D charts.
    * @param bottom The bottom of the frame around a 3D chart.
    * @param side The side for the frame around a 3D chart.
    */
  def apply(back: js.UndefOr[CleanJsObject[ChartOptions3dFrameBack]] = js.undefined, bottom: js.UndefOr[CleanJsObject[ChartOptions3dFrameBottom]] = js.undefined, side: js.UndefOr[CleanJsObject[ChartOptions3dFrameSide]] = js.undefined): ChartOptions3dFrame = {
    val backOuter: js.UndefOr[CleanJsObject[ChartOptions3dFrameBack]] = back
    val bottomOuter: js.UndefOr[CleanJsObject[ChartOptions3dFrameBottom]] = bottom
    val sideOuter: js.UndefOr[CleanJsObject[ChartOptions3dFrameSide]] = side
    new ChartOptions3dFrame {
      override val back: js.UndefOr[CleanJsObject[ChartOptions3dFrameBack]] = backOuter
      override val bottom: js.UndefOr[CleanJsObject[ChartOptions3dFrameBottom]] = bottomOuter
      override val side: js.UndefOr[CleanJsObject[ChartOptions3dFrameSide]] = sideOuter
    }
  }
}
