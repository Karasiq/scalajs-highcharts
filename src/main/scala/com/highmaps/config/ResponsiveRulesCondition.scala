/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>responsive-rules-condition</code>
  */
@js.annotation.ScalaJSDefined
class ResponsiveRulesCondition extends js.Object {

  /**
    * A callback function to gain complete control on when the responsive rule applies. Return <code>true</code> if it applies. This opens for checking against other metrics than the chart size, or example the document size or other elements.
    * @since 5.0.0
    */
  val callback: js.UndefOr[js.Function] = js.undefined

  /**
    * The responsive rule applies if the chart height is less than this.
    * @since 5.0.0
    */
  val maxHeight: js.UndefOr[Double] = js.undefined

  /**
    * The responsive rule applies if the chart width is less than this.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/" target="_blank">Max width is 500</a>
    * @since 5.0.0
    */
  val maxWidth: js.UndefOr[Double] = js.undefined

  /**
    * The responsive rule applies if the chart height is greater than this.
    * @since 5.0.0
    */
  val minHeight: js.UndefOr[Double] = js.undefined

  /**
    * The responsive rule applies if the chart width is greater than this.
    * @since 5.0.0
    */
  val minWidth: js.UndefOr[Double] = js.undefined
}

object ResponsiveRulesCondition {
  /**
    * @param callback A callback function to gain complete control on when the responsive rule applies. Return <code>true</code> if it applies. This opens for checking against other metrics than the chart size, or example the document size or other elements.
    * @param maxHeight The responsive rule applies if the chart height is less than this.
    * @param maxWidth The responsive rule applies if the chart width is less than this.
    * @param minHeight The responsive rule applies if the chart height is greater than this.
    * @param minWidth The responsive rule applies if the chart width is greater than this.
    */
  def apply(callback: js.UndefOr[js.Function] = js.undefined, maxHeight: js.UndefOr[Double] = js.undefined, maxWidth: js.UndefOr[Double] = js.undefined, minHeight: js.UndefOr[Double] = js.undefined, minWidth: js.UndefOr[Double] = js.undefined): ResponsiveRulesCondition = {
    val callbackOuter: js.UndefOr[js.Function] = callback
    val maxHeightOuter: js.UndefOr[Double] = maxHeight
    val maxWidthOuter: js.UndefOr[Double] = maxWidth
    val minHeightOuter: js.UndefOr[Double] = minHeight
    val minWidthOuter: js.UndefOr[Double] = minWidth
    new ResponsiveRulesCondition {
      override val callback: js.UndefOr[js.Function] = callbackOuter
      override val maxHeight: js.UndefOr[Double] = maxHeightOuter
      override val maxWidth: js.UndefOr[Double] = maxWidthOuter
      override val minHeight: js.UndefOr[Double] = minHeightOuter
      override val minWidth: js.UndefOr[Double] = minWidthOuter
    }
  }
}
