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
  * @note JavaScript name: <code>chart-scrollablePlotArea</code>
  */
class ChartScrollablePlotArea extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The minimum height for the plot area. If it gets smaller than this, the plot
    * area will become scrollable.</p>
    * @since 6.1.0
    */
  var minHeight: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimum width for the plot area. If it gets smaller than this, the plot
    * area will become scrollable.</p>
    * @since 6.1.0
    */
  var minWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The opacity of mask applied on one of the sides of the plot
    * area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/scrollable-plotarea-opacity">Disabled opacity for the mask</a>
    * @since 7.1.1
    */
  var opacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>The initial scrolling position of the scrollable plot area. Ranges from 0 to
    * 1, where 0 aligns the plot area to the left and 1 aligns it to the right.
    * Typically we would use 1 if the chart has right aligned Y axes.</p>
    * @since 6.1.0
    */
  var scrollPositionX: js.UndefOr[Double] = js.undefined

  /**
    * <p>The initial scrolling position of the scrollable plot area. Ranges from 0 to
    * 1, where 0 aligns the plot area to the top and 1 aligns it to the bottom.</p>
    * @since 6.1.0
    */
  var scrollPositionY: js.UndefOr[Double] = js.undefined
}

object ChartScrollablePlotArea {
  /**
    * @param minHeight <p>The minimum height for the plot area. If it gets smaller than this, the plot. area will become scrollable.</p>
    * @param minWidth <p>The minimum width for the plot area. If it gets smaller than this, the plot. area will become scrollable.</p>
    * @param opacity <p>The opacity of mask applied on one of the sides of the plot. area.</p>
    * @param scrollPositionX <p>The initial scrolling position of the scrollable plot area. Ranges from 0 to. 1, where 0 aligns the plot area to the left and 1 aligns it to the right.. Typically we would use 1 if the chart has right aligned Y axes.</p>
    * @param scrollPositionY <p>The initial scrolling position of the scrollable plot area. Ranges from 0 to. 1, where 0 aligns the plot area to the top and 1 aligns it to the bottom.</p>
    */
  def apply(minHeight: js.UndefOr[Double] = js.undefined, minWidth: js.UndefOr[Double] = js.undefined, opacity: js.UndefOr[Double] = js.undefined, scrollPositionX: js.UndefOr[Double] = js.undefined, scrollPositionY: js.UndefOr[Double] = js.undefined): ChartScrollablePlotArea = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartScrollablePlotArea {
      this.minHeight = minHeight
      this.minWidth = minWidth
      this.opacity = opacity
      this.scrollPositionX = scrollPositionX
      this.scrollPositionY = scrollPositionY
    })
  }
}
