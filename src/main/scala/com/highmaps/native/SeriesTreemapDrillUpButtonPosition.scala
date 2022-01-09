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
  * @note JavaScript name: <code>series&lt;treemap&gt;-drillUpButton-position</code>
  */
class SeriesTreemapDrillUpButtonPosition extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Horizontal alignment of the button.</p>
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>Vertical alignment of the button.</p>
    */
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Horizontal offset of the button.</p>
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>Vertical offset of the button.</p>
    */
  var y: js.UndefOr[Double] = js.undefined
}

object SeriesTreemapDrillUpButtonPosition {
  /**
    * @param align <p>Horizontal alignment of the button.</p>
    * @param verticalAlign <p>Vertical alignment of the button.</p>
    * @param x <p>Horizontal offset of the button.</p>
    * @param y <p>Vertical offset of the button.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): SeriesTreemapDrillUpButtonPosition = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapDrillUpButtonPosition {
      this.align = align
      this.verticalAlign = verticalAlign
      this.x = x
      this.y = y
    })
  }
}
