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
  * @note JavaScript name: <code>chart-options3d</code>
  */
@js.annotation.ScalaJSDefined
class ChartOptions3d extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Provides the option to draw a frame around the charts by defining
    * a bottom, front and back panel.</p>
    * @since 4.0
    */
  val frame: js.Any = js.undefined

  /**
    * <p>Wether to render the chart using the 3D functionality.</p>
    * @since 4.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>One of the two rotation angles for the chart.</p>
    * @since 4.0
    */
  val alpha: js.UndefOr[Double] = js.undefined

  /**
    * <p>One of the two rotation angles for the chart.</p>
    * @since 4.0
    */
  val beta: js.UndefOr[Double] = js.undefined

  /**
    * <p>The total depth of the chart.</p>
    * @since 4.0
    */
  val depth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether the 3d box should automatically adjust to the chart plot
    * area.</p>
    * @since 4.2.4
    */
  val fitToPlot: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Defines the distance the viewer is standing in front of the
    * chart, this setting is important to calculate the perspective
    * effect in column and scatter charts. It is not used for 3D pie
    * charts.</p>
    * @since 4.0
    */
  val viewDistance: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set it to <code>&quot;auto&quot;</code> to automatically move the labels to the best
    * edge.</p>
    * @since 5.0.12
    */
  val axisLabelPosition: js.UndefOr[String] = js.undefined
}

object ChartOptions3d {
  /**
    * @param frame <p>Provides the option to draw a frame around the charts by defining. a bottom, front and back panel.</p>
    * @param enabled <p>Wether to render the chart using the 3D functionality.</p>
    * @param alpha <p>One of the two rotation angles for the chart.</p>
    * @param beta <p>One of the two rotation angles for the chart.</p>
    * @param depth <p>The total depth of the chart.</p>
    * @param fitToPlot <p>Whether the 3d box should automatically adjust to the chart plot. area.</p>
    * @param viewDistance <p>Defines the distance the viewer is standing in front of the. chart, this setting is important to calculate the perspective. effect in column and scatter charts. It is not used for 3D pie. charts.</p>
    * @param axisLabelPosition <p>Set it to <code>&quot;auto&quot;</code> to automatically move the labels to the best. edge.</p>
    */
  def apply(frame: js.UndefOr[js.Any] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, alpha: js.UndefOr[Double] = js.undefined, beta: js.UndefOr[Double] = js.undefined, depth: js.UndefOr[Double] = js.undefined, fitToPlot: js.UndefOr[Boolean] = js.undefined, viewDistance: js.UndefOr[Double] = js.undefined, axisLabelPosition: js.UndefOr[String] = js.undefined): ChartOptions3d = {
    val frameOuter: js.Any = frame
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val alphaOuter: js.UndefOr[Double] = alpha
    val betaOuter: js.UndefOr[Double] = beta
    val depthOuter: js.UndefOr[Double] = depth
    val fitToPlotOuter: js.UndefOr[Boolean] = fitToPlot
    val viewDistanceOuter: js.UndefOr[Double] = viewDistance
    val axisLabelPositionOuter: js.UndefOr[String] = axisLabelPosition
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartOptions3d {
      override val frame: js.Any = frameOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val alpha: js.UndefOr[Double] = alphaOuter
      override val beta: js.UndefOr[Double] = betaOuter
      override val depth: js.UndefOr[Double] = depthOuter
      override val fitToPlot: js.UndefOr[Boolean] = fitToPlotOuter
      override val viewDistance: js.UndefOr[Double] = viewDistanceOuter
      override val axisLabelPosition: js.UndefOr[String] = axisLabelPositionOuter
    })
  }
}
