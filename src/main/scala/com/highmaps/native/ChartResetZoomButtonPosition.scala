/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart-resetZoomButton-position</code>
  */
class ChartResetZoomButtonPosition extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The horizontal alignment of the button.</p>
    * @since 2.2.0
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>The vertical alignment of the button.</p>
    * @since 2.2.0
    */
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The horizontal offset of the button.</p>
    * @since 2.2.0
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The vertical offset of the button.</p>
    * @since 2.2.0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ChartResetZoomButtonPosition {
  /**
    * @param align <p>The horizontal alignment of the button.</p>
    * @param verticalAlign <p>The vertical alignment of the button.</p>
    * @param x <p>The horizontal offset of the button.</p>
    * @param y <p>The vertical offset of the button.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): ChartResetZoomButtonPosition = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartResetZoomButtonPosition {
      this.align = align
      this.verticalAlign = verticalAlign
      this.x = x
      this.y = y
    })
  }
}
