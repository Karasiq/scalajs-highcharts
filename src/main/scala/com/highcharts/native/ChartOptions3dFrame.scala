/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart-options3d-frame</code>
  */
class ChartOptions3dFrame extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The back side of the frame around a 3D chart.</p>
    * @since 4.0.0
    */
  var back: js.UndefOr[CleanJsObject[ChartOptions3dFrameBack]] = js.undefined

  /**
    * <p>The bottom of the frame around a 3D chart.</p>
    * @since 4.0.0
    */
  var bottom: js.Any = js.undefined

  /**
    * <p>The front of the frame around a 3D chart.</p>
    * @since 4.0.0
    */
  var front: js.UndefOr[CleanJsObject[ChartOptions3dFrameFront]] = js.undefined

  /**
    * <p>The left side of the frame around a 3D chart.</p>
    * @since 4.0.0
    */
  var left: js.UndefOr[CleanJsObject[ChartOptions3dFrameLeft]] = js.undefined

  /**
    * <p>The right of the frame around a 3D chart.</p>
    * @since 4.0.0
    */
  var right: js.UndefOr[CleanJsObject[ChartOptions3dFrameRight]] = js.undefined

  /**
    * <p>Note: As of v5.0.12, <code>frame.left</code> or <code>frame.right</code> should be used instead.</p>
    * <p>The side for the frame around a 3D chart.</p>
    * @since 4.0.0
    */
  var side: js.Any = js.undefined

  /**
    * <p>General pixel thickness for the frame faces.</p>
    * @since 4.0.0
    */
  var size: js.UndefOr[Double] = js.undefined

  /**
    * <p>The top of the frame around a 3D chart.</p>
    * @since 4.0.0
    */
  var top: js.UndefOr[CleanJsObject[ChartOptions3dFrameTop]] = js.undefined

  /**
    * <p>Whether the frames are visible.</p>
    * @since 4.0.0
    */
  var visible: js.UndefOr[String] = js.undefined
}

object ChartOptions3dFrame {
  /**
    * @param back <p>The back side of the frame around a 3D chart.</p>
    * @param bottom <p>The bottom of the frame around a 3D chart.</p>
    * @param front <p>The front of the frame around a 3D chart.</p>
    * @param left <p>The left side of the frame around a 3D chart.</p>
    * @param right <p>The right of the frame around a 3D chart.</p>
    * @param side <p>Note: As of v5.0.12, <code>frame.left</code> or <code>frame.right</code> should be used instead.</p>. <p>The side for the frame around a 3D chart.</p>
    * @param size <p>General pixel thickness for the frame faces.</p>
    * @param top <p>The top of the frame around a 3D chart.</p>
    * @param visible <p>Whether the frames are visible.</p>
    */
  def apply(back: js.UndefOr[CleanJsObject[ChartOptions3dFrameBack]] = js.undefined, bottom: js.UndefOr[js.Any] = js.undefined, front: js.UndefOr[CleanJsObject[ChartOptions3dFrameFront]] = js.undefined, left: js.UndefOr[CleanJsObject[ChartOptions3dFrameLeft]] = js.undefined, right: js.UndefOr[CleanJsObject[ChartOptions3dFrameRight]] = js.undefined, side: js.UndefOr[js.Any] = js.undefined, size: js.UndefOr[Double] = js.undefined, top: js.UndefOr[CleanJsObject[ChartOptions3dFrameTop]] = js.undefined, visible: js.UndefOr[String] = js.undefined): ChartOptions3dFrame = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartOptions3dFrame {
      this.back = back
      this.bottom = bottom
      this.front = front
      this.left = left
      this.right = right
      this.side = side
      this.size = size
      this.top = top
      this.visible = visible
    })
  }
}
