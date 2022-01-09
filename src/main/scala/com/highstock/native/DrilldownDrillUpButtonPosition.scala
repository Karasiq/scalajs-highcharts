/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>drilldown-drillUpButton-position</code>
  */
class DrilldownDrillUpButtonPosition extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Horizontal alignment.</p>
    * @since 3.0.8
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>Vertical alignment of the button.</p>
    * @since 3.0.8
    */
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The X offset of the button.</p>
    * @since 3.0.8
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The Y offset of the button.</p>
    * @since 3.0.8
    */
  var y: js.UndefOr[Double] = js.undefined
}

object DrilldownDrillUpButtonPosition {
  /**
    * @param align <p>Horizontal alignment.</p>
    * @param verticalAlign <p>Vertical alignment of the button.</p>
    * @param x <p>The X offset of the button.</p>
    * @param y <p>The Y offset of the button.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): DrilldownDrillUpButtonPosition = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new DrilldownDrillUpButtonPosition {
      this.align = align
      this.verticalAlign = verticalAlign
      this.x = x
      this.y = y
    })
  }
}
