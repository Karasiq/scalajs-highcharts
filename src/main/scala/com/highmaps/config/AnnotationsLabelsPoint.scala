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
  * @note JavaScript name: <code>annotations-labels-point</code>
  */
@js.annotation.ScalaJSDefined
class AnnotationsLabelsPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The x position of the point. Units can be either in axis
    * or chart pixel coordinates.</p>
    * @since 6.0.0
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position of the point. Units can be either in axis
    * or chart pixel coordinates.</p>
    * @since 6.0.0
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * <p>This number defines which xAxis the point is connected to. It refers
    * to either the axis id or the index of the axis in the xAxis array.
    * If the option is not configured or the axis is not found the point&#39;s
    * x coordinate refers to the chart pixels.</p>
    * @since 6.0.0
    */
  val xAxis: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>This number defines which yAxis the point is connected to. It refers
    * to either the axis id or the index of the axis in the yAxis array.
    * If the option is not configured or the axis is not found the point&#39;s
    * y coordinate refers to the chart pixels.</p>
    * @since 6.0.0
    */
  val yAxis: js.UndefOr[Double | String] = js.undefined
}

object AnnotationsLabelsPoint {
  /**
    * @param x <p>The x position of the point. Units can be either in axis. or chart pixel coordinates.</p>
    * @param y <p>The y position of the point. Units can be either in axis. or chart pixel coordinates.</p>
    * @param xAxis <p>This number defines which xAxis the point is connected to. It refers. to either the axis id or the index of the axis in the xAxis array.. If the option is not configured or the axis is not found the point&#39;s. x coordinate refers to the chart pixels.</p>
    * @param yAxis <p>This number defines which yAxis the point is connected to. It refers. to either the axis id or the index of the axis in the yAxis array.. If the option is not configured or the axis is not found the point&#39;s. y coordinate refers to the chart pixels.</p>
    */
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, xAxis: js.UndefOr[Double | String] = js.undefined, yAxis: js.UndefOr[Double | String] = js.undefined): AnnotationsLabelsPoint = {
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val xAxisOuter: js.UndefOr[Double | String] = xAxis
    val yAxisOuter: js.UndefOr[Double | String] = yAxis
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsLabelsPoint {
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val xAxis: js.UndefOr[Double | String] = xAxisOuter
      override val yAxis: js.UndefOr[Double | String] = yAxisOuter
    })
  }
}
