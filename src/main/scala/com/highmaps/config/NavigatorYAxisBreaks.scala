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
  * @note JavaScript name: <code>navigator-yAxis-breaks</code>
  */
@js.annotation.ScalaJSDefined
class NavigatorYAxisBreaks extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A number indicating how much space should be left between the start
    * and the end of the break. The break size is given in axis units,
    * so for instance on a <code>datetime</code> axis, a break size of 3600000 would
    * indicate the equivalent of an hour.</p>
    * @since 4.1.0
    */
  val breakSize: js.UndefOr[Double] = js.undefined

  /**
    * <p>The point where the break starts.</p>
    * @since 4.1.0
    */
  val from: js.UndefOr[Double] = js.undefined

  /**
    * <p>Defines an interval after which the break appears again. By default
    * the breaks do not repeat.</p>
    * @since 4.1.0
    */
  val repeat: js.UndefOr[Double] = js.undefined

  /**
    * <p>The point where the break ends.</p>
    * @since 4.1.0
    */
  val to: js.UndefOr[Double] = js.undefined
}

object NavigatorYAxisBreaks {
  /**
    * @param breakSize <p>A number indicating how much space should be left between the start. and the end of the break. The break size is given in axis units,. so for instance on a <code>datetime</code> axis, a break size of 3600000 would. indicate the equivalent of an hour.</p>
    * @param from <p>The point where the break starts.</p>
    * @param repeat <p>Defines an interval after which the break appears again. By default. the breaks do not repeat.</p>
    * @param to <p>The point where the break ends.</p>
    */
  def apply(breakSize: js.UndefOr[Double] = js.undefined, from: js.UndefOr[Double] = js.undefined, repeat: js.UndefOr[Double] = js.undefined, to: js.UndefOr[Double] = js.undefined): NavigatorYAxisBreaks = {
    val breakSizeOuter: js.UndefOr[Double] = breakSize
    val fromOuter: js.UndefOr[Double] = from
    val repeatOuter: js.UndefOr[Double] = repeat
    val toOuter: js.UndefOr[Double] = to
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorYAxisBreaks {
      override val breakSize: js.UndefOr[Double] = breakSizeOuter
      override val from: js.UndefOr[Double] = fromOuter
      override val repeat: js.UndefOr[Double] = repeatOuter
      override val to: js.UndefOr[Double] = toOuter
    })
  }
}
