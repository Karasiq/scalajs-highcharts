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
  * @note JavaScript name: <code>chart-options3d-frame</code>
  */
@js.annotation.ScalaJSDefined
class ChartOptions3dFrame extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Note: As of v5.0.12, <code>frame.left</code> or <code>frame.right</code> should be used
    * instead.</p>
    * <p>The side for the frame around a 3D chart.</p>
    * @since 4.0
    */
  val side: js.Any = js.undefined

  /**
    * <p>Whether the frames are visible.</p>
    * @since 4.0
    */
  val visible: js.UndefOr[String] = js.undefined

  /**
    * <p>General pixel thickness for the frame faces.</p>
    * @since 4.0
    */
  val size: js.UndefOr[Double] = js.undefined

  /**
    * <p>The bottom of the frame around a 3D chart.</p>
    * @since 4.0
    */
  val bottom: js.Any = js.undefined

  /**
    * <p>The top of the frame around a 3D chart.</p>
    * @since 4.0
    */
  val top: js.UndefOr[CleanJsObject[ChartOptions3dFrameTop]] = js.undefined

  /**
    * <p>The left side of the frame around a 3D chart.</p>
    * @since 4.0
    */
  val left: js.UndefOr[CleanJsObject[ChartOptions3dFrameLeft]] = js.undefined

  /**
    * <p>The right of the frame around a 3D chart.</p>
    * @since 4.0
    */
  val right: js.UndefOr[CleanJsObject[ChartOptions3dFrameRight]] = js.undefined

  /**
    * <p>The back side of the frame around a 3D chart.</p>
    * @since 4.0
    */
  val back: js.UndefOr[CleanJsObject[ChartOptions3dFrameBack]] = js.undefined

  /**
    * <p>The front of the frame around a 3D chart.</p>
    * @since 4.0
    */
  val front: js.UndefOr[CleanJsObject[ChartOptions3dFrameFront]] = js.undefined
}

object ChartOptions3dFrame {
  /**
    * @param side <p>Note: As of v5.0.12, <code>frame.left</code> or <code>frame.right</code> should be used. instead.</p>. <p>The side for the frame around a 3D chart.</p>
    * @param visible <p>Whether the frames are visible.</p>
    * @param size <p>General pixel thickness for the frame faces.</p>
    * @param bottom <p>The bottom of the frame around a 3D chart.</p>
    * @param top <p>The top of the frame around a 3D chart.</p>
    * @param left <p>The left side of the frame around a 3D chart.</p>
    * @param right <p>The right of the frame around a 3D chart.</p>
    * @param back <p>The back side of the frame around a 3D chart.</p>
    * @param front <p>The front of the frame around a 3D chart.</p>
    */
  def apply(side: js.UndefOr[js.Any] = js.undefined, visible: js.UndefOr[String] = js.undefined, size: js.UndefOr[Double] = js.undefined, bottom: js.UndefOr[js.Any] = js.undefined, top: js.UndefOr[CleanJsObject[ChartOptions3dFrameTop]] = js.undefined, left: js.UndefOr[CleanJsObject[ChartOptions3dFrameLeft]] = js.undefined, right: js.UndefOr[CleanJsObject[ChartOptions3dFrameRight]] = js.undefined, back: js.UndefOr[CleanJsObject[ChartOptions3dFrameBack]] = js.undefined, front: js.UndefOr[CleanJsObject[ChartOptions3dFrameFront]] = js.undefined): ChartOptions3dFrame = {
    val sideOuter: js.Any = side
    val visibleOuter: js.UndefOr[String] = visible
    val sizeOuter: js.UndefOr[Double] = size
    val bottomOuter: js.Any = bottom
    val topOuter: js.UndefOr[CleanJsObject[ChartOptions3dFrameTop]] = top
    val leftOuter: js.UndefOr[CleanJsObject[ChartOptions3dFrameLeft]] = left
    val rightOuter: js.UndefOr[CleanJsObject[ChartOptions3dFrameRight]] = right
    val backOuter: js.UndefOr[CleanJsObject[ChartOptions3dFrameBack]] = back
    val frontOuter: js.UndefOr[CleanJsObject[ChartOptions3dFrameFront]] = front
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartOptions3dFrame {
      override val side: js.Any = sideOuter
      override val visible: js.UndefOr[String] = visibleOuter
      override val size: js.UndefOr[Double] = sizeOuter
      override val bottom: js.Any = bottomOuter
      override val top: js.UndefOr[CleanJsObject[ChartOptions3dFrameTop]] = topOuter
      override val left: js.UndefOr[CleanJsObject[ChartOptions3dFrameLeft]] = leftOuter
      override val right: js.UndefOr[CleanJsObject[ChartOptions3dFrameRight]] = rightOuter
      override val back: js.UndefOr[CleanJsObject[ChartOptions3dFrameBack]] = backOuter
      override val front: js.UndefOr[CleanJsObject[ChartOptions3dFrameFront]] = frontOuter
    })
  }
}
