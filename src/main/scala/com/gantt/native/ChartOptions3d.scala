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
  * @note JavaScript name: <code>chart-options3d</code>
  */
class ChartOptions3d extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>One of the two rotation angles for the chart.</p>
    * @since 4.0.0
    */
  var alpha: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set it to <code>&quot;auto&quot;</code> to automatically move the labels to the
    * best edge.</p>
    * @since 5.0.12
    */
  var axisLabelPosition: js.UndefOr[String | Null] = js.undefined

  /**
    * <p>One of the two rotation angles for the chart.</p>
    * @since 4.0.0
    */
  var beta: js.UndefOr[Double] = js.undefined

  /**
    * <p>The total depth of the chart.</p>
    * @since 4.0.0
    */
  var depth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Wether to render the chart using the 3D functionality.</p>
    * @since 4.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether the 3d box should automatically adjust to the chart
    * plot area.</p>
    * @since 4.2.4
    */
  var fitToPlot: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Provides the option to draw a frame around the charts by
    * defining a bottom, front and back panel.</p>
    * @since 4.0.0
    */
  var frame: js.Any = js.undefined

  /**
    * <p>Defines the distance the viewer is standing in front of the
    * chart, this setting is important to calculate the perspective
    * effect in column and scatter charts. It is not used for 3D
    * pie charts.</p>
    * @since 4.0.0
    */
  var viewDistance: js.UndefOr[Double] = js.undefined
}

object ChartOptions3d {
  /**
    * @param alpha <p>One of the two rotation angles for the chart.</p>
    * @param axisLabelPosition <p>Set it to <code>&quot;auto&quot;</code> to automatically move the labels to the. best edge.</p>
    * @param beta <p>One of the two rotation angles for the chart.</p>
    * @param depth <p>The total depth of the chart.</p>
    * @param enabled <p>Wether to render the chart using the 3D functionality.</p>
    * @param fitToPlot <p>Whether the 3d box should automatically adjust to the chart. plot area.</p>
    * @param frame <p>Provides the option to draw a frame around the charts by. defining a bottom, front and back panel.</p>
    * @param viewDistance <p>Defines the distance the viewer is standing in front of the. chart, this setting is important to calculate the perspective. effect in column and scatter charts. It is not used for 3D. pie charts.</p>
    */
  def apply(alpha: js.UndefOr[Double] = js.undefined, axisLabelPosition: js.UndefOr[String | Null] = js.undefined, beta: js.UndefOr[Double] = js.undefined, depth: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, fitToPlot: js.UndefOr[Boolean] = js.undefined, frame: js.UndefOr[js.Any] = js.undefined, viewDistance: js.UndefOr[Double] = js.undefined): ChartOptions3d = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartOptions3d {
      this.alpha = alpha
      this.axisLabelPosition = axisLabelPosition
      this.beta = beta
      this.depth = depth
      this.enabled = enabled
      this.fitToPlot = fitToPlot
      this.frame = frame
      this.viewDistance = viewDistance
    })
  }
}
