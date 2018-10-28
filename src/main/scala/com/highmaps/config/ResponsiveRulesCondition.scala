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
class ResponsiveRulesCondition extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A callback function to gain complete control on when the responsive
    * rule applies. Return <code>true</code> if it applies. This opens for checking
    * against other metrics than the chart size, or example the document
    * size or other elements.</p>
    * @since 5.0.0
    */
  val callback: js.Any = js.undefined

  /**
    * <p>The responsive rule applies if the chart height is less than this.</p>
    * @since 5.0.0
    */
  val maxHeight: js.UndefOr[Double] = js.undefined

  /**
    * <p>The responsive rule applies if the chart width is less than this.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/">Max width is 500</a>
    * @since 5.0.0
    */
  val maxWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The responsive rule applies if the chart height is greater than this.</p>
    * @since 5.0.0
    */
  val minHeight: js.UndefOr[Double] = js.undefined

  /**
    * <p>The responsive rule applies if the chart width is greater than this.</p>
    * @since 5.0.0
    */
  val minWidth: js.UndefOr[Double] = js.undefined
}

object ResponsiveRulesCondition {
  /**
    * @param callback <p>A callback function to gain complete control on when the responsive. rule applies. Return <code>true</code> if it applies. This opens for checking. against other metrics than the chart size, or example the document. size or other elements.</p>
    * @param maxHeight <p>The responsive rule applies if the chart height is less than this.</p>
    * @param maxWidth <p>The responsive rule applies if the chart width is less than this.</p>
    * @param minHeight <p>The responsive rule applies if the chart height is greater than this.</p>
    * @param minWidth <p>The responsive rule applies if the chart width is greater than this.</p>
    */
  def apply(callback: js.UndefOr[js.Any] = js.undefined, maxHeight: js.UndefOr[Double] = js.undefined, maxWidth: js.UndefOr[Double] = js.undefined, minHeight: js.UndefOr[Double] = js.undefined, minWidth: js.UndefOr[Double] = js.undefined): ResponsiveRulesCondition = {
    val callbackOuter: js.Any = callback
    val maxHeightOuter: js.UndefOr[Double] = maxHeight
    val maxWidthOuter: js.UndefOr[Double] = maxWidth
    val minHeightOuter: js.UndefOr[Double] = minHeight
    val minWidthOuter: js.UndefOr[Double] = minWidth
    com.highcharts.HighchartsGenericObject.toCleanObject(new ResponsiveRulesCondition {
      override val callback: js.Any = callbackOuter
      override val maxHeight: js.UndefOr[Double] = maxHeightOuter
      override val maxWidth: js.UndefOr[Double] = maxWidthOuter
      override val minHeight: js.UndefOr[Double] = minHeightOuter
      override val minWidth: js.UndefOr[Double] = minWidthOuter
    })
  }
}
