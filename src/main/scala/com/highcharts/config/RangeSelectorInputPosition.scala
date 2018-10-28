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
  * @note JavaScript name: <code>rangeSelector-inputPosition</code>
  */
@js.annotation.ScalaJSDefined
class RangeSelectorInputPosition extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The alignment of the input box. Allowed properties are <code>left</code>,
    * <code>center</code>, <code>right</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/input-button-position/">Alignment</a>
    * @since 6.0.0
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>X offset of the input row.</p>
    * @since 1.2.4
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>Y offset of the input row.</p>
    * @since 1.2.4
    */
  val y: js.UndefOr[Double] = js.undefined
}

object RangeSelectorInputPosition {
  /**
    * @param align <p>The alignment of the input box. Allowed properties are <code>left</code>,. <code>center</code>, <code>right</code>.</p>
    * @param x <p>X offset of the input row.</p>
    * @param y <p>Y offset of the input row.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): RangeSelectorInputPosition = {
    val alignOuter: js.UndefOr[String] = align
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    com.highcharts.HighchartsGenericObject.toCleanObject(new RangeSelectorInputPosition {
      override val align: js.UndefOr[String] = alignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    })
  }
}
