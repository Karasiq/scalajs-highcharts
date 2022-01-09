/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-sunburst-traverseUpButton-position</code>
  */
class PlotOptionsSunburstTraverseUpButtonPosition extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Horizontal alignment of the button.</p>
    * @since 6.0.0
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>Vertical alignment of the button.</p>
    * @since 6.0.0
    */
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Horizontal offset of the button.</p>
    * @since 6.0.0
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>Vertical offset of the button.</p>
    * @since 6.0.0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object PlotOptionsSunburstTraverseUpButtonPosition {
  /**
    * @param align <p>Horizontal alignment of the button.</p>
    * @param verticalAlign <p>Vertical alignment of the button.</p>
    * @param x <p>Horizontal offset of the button.</p>
    * @param y <p>Vertical offset of the button.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): PlotOptionsSunburstTraverseUpButtonPosition = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSunburstTraverseUpButtonPosition {
      this.align = align
      this.verticalAlign = verticalAlign
      this.x = x
      this.y = y
    })
  }
}
