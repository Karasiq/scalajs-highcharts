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
  * @note JavaScript name: <code>noData-position</code>
  */
class NoDataPosition extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Horizontal alignment of the label.</p>
    * @since 3.0.8
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>Vertical alignment of the label.</p>
    * @since 3.0.8
    */
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Horizontal offset of the label, in pixels.</p>
    * @since 3.0.8
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>Vertical offset of the label, in pixels.</p>
    * @since 3.0.8
    */
  var y: js.UndefOr[Double] = js.undefined
}

object NoDataPosition {
  /**
    * @param align <p>Horizontal alignment of the label.</p>
    * @param verticalAlign <p>Vertical alignment of the label.</p>
    * @param x <p>Horizontal offset of the label, in pixels.</p>
    * @param y <p>Vertical offset of the label, in pixels.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): NoDataPosition = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NoDataPosition {
      this.align = align
      this.verticalAlign = verticalAlign
      this.x = x
      this.y = y
    })
  }
}
