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
  * @note JavaScript name: <code>chart-scrollablePlotArea</code>
  */
@js.annotation.ScalaJSDefined
class ChartScrollablePlotArea extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The minimum width for the plot area. If it gets smaller than this, the plot
    * area will become scrollable.</p>
    * @since 6.1.0
    */
  val minWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The initial scrolling position of the scrollable plot area. Ranges from 0 to
    * 1, where 0 aligns the plot area to the left and 1 aligns it to the right.
    * Typically we would use 1 if the chart has right aligned Y axes.</p>
    * @since 6.1.0
    */
  val scrollPositionX: js.UndefOr[Double] = js.undefined
}

object ChartScrollablePlotArea {
  /**
    * @param minWidth <p>The minimum width for the plot area. If it gets smaller than this, the plot. area will become scrollable.</p>
    * @param scrollPositionX <p>The initial scrolling position of the scrollable plot area. Ranges from 0 to. 1, where 0 aligns the plot area to the left and 1 aligns it to the right.. Typically we would use 1 if the chart has right aligned Y axes.</p>
    */
  def apply(minWidth: js.UndefOr[Double] = js.undefined, scrollPositionX: js.UndefOr[Double] = js.undefined): ChartScrollablePlotArea = {
    val minWidthOuter: js.UndefOr[Double] = minWidth
    val scrollPositionXOuter: js.UndefOr[Double] = scrollPositionX
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartScrollablePlotArea {
      override val minWidth: js.UndefOr[Double] = minWidthOuter
      override val scrollPositionX: js.UndefOr[Double] = scrollPositionXOuter
    })
  }
}
