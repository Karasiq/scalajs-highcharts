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
class ChartOptions3d extends js.Object {

  /**
    * One of the two rotation angles for the chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/demo/3d-column-interactive/">Dynamic Angles</a>
    * @since 4.0
    */
  val alpha: js.UndefOr[Double] = js.undefined

  /**
    * One of the two rotation angles for the chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/demo/3d-column-interactive/">Dynamic Angles</a>
    * @since 4.0
    */
  val beta: js.UndefOr[Double] = js.undefined

  /**
    * The total depth of the chart.
    * @since 4.0
    */
  val depth: js.UndefOr[Double] = js.undefined

  /**
    * Wether to render the chart using the 3D functionality.
    * @since 4.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether the 3d box should automatically adjust to the chart plot area.
    * @since 4.2.4
    */
  val fitToPlot: js.UndefOr[Boolean] = js.undefined

  /**
    * Provides the option to draw a frame around the charts by defining a bottom, front and back panel. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/3d/column-frame/">Framed column chart</a>
    * @since 4.0
    */
  val frame: js.UndefOr[CleanJsObject[ChartOptions3dFrame]] = js.undefined

  /**
    * Defines the distance the viewer is standing in front of the chart, this setting is important to calculate the perspective effect in column and scatter charts.
    * It is not used for 3D pie charts.
    * @since 4.0
    */
  val viewDistance: js.UndefOr[Double] = js.undefined
}

object ChartOptions3d {
  /**
    * @param alpha One of the two rotation angles for the chart.
    * @param beta One of the two rotation angles for the chart.
    * @param depth The total depth of the chart.
    * @param enabled Wether to render the chart using the 3D functionality.
    * @param fitToPlot Whether the 3d box should automatically adjust to the chart plot area.
    * @param frame Provides the option to draw a frame around the charts by defining a bottom, front and back panel. 
    * @param viewDistance Defines the distance the viewer is standing in front of the chart, this setting is important to calculate the perspective effect in column and scatter charts.. It is not used for 3D pie charts.
    */
  def apply(alpha: js.UndefOr[Double] = js.undefined, beta: js.UndefOr[Double] = js.undefined, depth: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, fitToPlot: js.UndefOr[Boolean] = js.undefined, frame: js.UndefOr[CleanJsObject[ChartOptions3dFrame]] = js.undefined, viewDistance: js.UndefOr[Double] = js.undefined): ChartOptions3d = {
    val alphaOuter: js.UndefOr[Double] = alpha
    val betaOuter: js.UndefOr[Double] = beta
    val depthOuter: js.UndefOr[Double] = depth
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val fitToPlotOuter: js.UndefOr[Boolean] = fitToPlot
    val frameOuter: js.UndefOr[CleanJsObject[ChartOptions3dFrame]] = frame
    val viewDistanceOuter: js.UndefOr[Double] = viewDistance
    new ChartOptions3d {
      override val alpha: js.UndefOr[Double] = alphaOuter
      override val beta: js.UndefOr[Double] = betaOuter
      override val depth: js.UndefOr[Double] = depthOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val fitToPlot: js.UndefOr[Boolean] = fitToPlotOuter
      override val frame: js.UndefOr[CleanJsObject[ChartOptions3dFrame]] = frameOuter
      override val viewDistance: js.UndefOr[Double] = viewDistanceOuter
    }
  }
}
