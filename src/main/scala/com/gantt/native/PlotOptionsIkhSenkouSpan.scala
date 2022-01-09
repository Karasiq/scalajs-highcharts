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
  * @note JavaScript name: <code>plotOptions-ikh-senkouSpan</code>
  */
class PlotOptionsIkhSenkouSpan extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Color of the area between Senkou Span A and B,
    * when Senkou Span A is above Senkou Span B. Note that if
    * a <code>style.fill</code> is defined, the <code>color</code> takes precedence and
    * the <code>style.fill</code> is ignored.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/ichimoku-kinko-hyo">Ichimoku Kinko Hyo color</a>
    * @since 7.0.0
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Color of the area between Senkou Span A and B,
    * when Senkou Span A is under Senkou Span B.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/indicators/ikh-negative-color">Ichimoku Kinko Hyo negativeColor</a>
    * @since 7.0.0
    */
  var negativeColor: js.UndefOr[String | js.Object] = js.undefined
}

object PlotOptionsIkhSenkouSpan {
  /**
    * @param color <p>Color of the area between Senkou Span A and B,. when Senkou Span A is above Senkou Span B. Note that if. a <code>style.fill</code> is defined, the <code>color</code> takes precedence and. the <code>style.fill</code> is ignored.</p>
    * @param negativeColor <p>Color of the area between Senkou Span A and B,. when Senkou Span A is under Senkou Span B.</p>
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, negativeColor: js.UndefOr[String | js.Object] = js.undefined): PlotOptionsIkhSenkouSpan = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsIkhSenkouSpan {
      this.color = color
      this.negativeColor = negativeColor
    })
  }
}
