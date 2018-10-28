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
  * @note JavaScript name: <code>plotOptions-gantt-label</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsGanttLabel extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable the series label per series.</p>
    * @since 6.0.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Allow labels to be placed distant to the graph if necessary,
    * and draw a connector line to the graph. Setting this option
    * to true may decrease the performance significantly, since the
    * algorithm with systematically search for open spaces in the
    * while plot area. Visually, it may also result in a more
    * cluttered chart, though more of the series will be labeled.</p>
    * @since 6.0.0
    */
  val connectorAllowed: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>If the label is closer than this to a neighbour graph, draw a
    * connector.</p>
    * @since 6.0.0
    */
  val connectorNeighbourDistance: js.UndefOr[Double] = js.undefined

  /**
    * <p>For area-like series, allow the font size to vary so that
    * small areas get a smaller font size. The default applies this
    * effect to area-like series but not line-like series.</p>
    * @since 6.0.0
    */
  val minFontSize: js.UndefOr[Double] = js.undefined

  /**
    * <p>For area-like series, allow the font size to vary so that
    * small areas get a smaller font size. The default applies this
    * effect to area-like series but not line-like series.</p>
    * @since 6.0.0
    */
  val maxFontSize: js.UndefOr[Double] = js.undefined

  /**
    * <p>Draw the label on the area of an area series. By default it
    * is drawn on the area. Set it to <code>false</code> to draw it next to
    * the graph instead.</p>
    * @since 6.0.0
    */
  val onArea: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Styles for the series label. The color defaults to the series
    * color, or a contrast color if <code>onArea</code>.</p>
    * @since 6.0.0
    */
  val style: js.Any = js.undefined

  /**
    * <p>An array of boxes to avoid when laying out the labels. Each
    * item has a <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code> property.</p>
    * @since 6.0.0
    */
  val boxesToAvoid: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object PlotOptionsGanttLabel {
  /**
    * @param enabled <p>Enable the series label per series.</p>
    * @param connectorAllowed <p>Allow labels to be placed distant to the graph if necessary,. and draw a connector line to the graph. Setting this option. to true may decrease the performance significantly, since the. algorithm with systematically search for open spaces in the. while plot area. Visually, it may also result in a more. cluttered chart, though more of the series will be labeled.</p>
    * @param connectorNeighbourDistance <p>If the label is closer than this to a neighbour graph, draw a. connector.</p>
    * @param minFontSize <p>For area-like series, allow the font size to vary so that. small areas get a smaller font size. The default applies this. effect to area-like series but not line-like series.</p>
    * @param maxFontSize <p>For area-like series, allow the font size to vary so that. small areas get a smaller font size. The default applies this. effect to area-like series but not line-like series.</p>
    * @param onArea <p>Draw the label on the area of an area series. By default it. is drawn on the area. Set it to <code>false</code> to draw it next to. the graph instead.</p>
    * @param style <p>Styles for the series label. The color defaults to the series. color, or a contrast color if <code>onArea</code>.</p>
    * @param boxesToAvoid <p>An array of boxes to avoid when laying out the labels. Each. item has a <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code> property.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, connectorAllowed: js.UndefOr[Boolean] = js.undefined, connectorNeighbourDistance: js.UndefOr[Double] = js.undefined, minFontSize: js.UndefOr[Double] = js.undefined, maxFontSize: js.UndefOr[Double] = js.undefined, onArea: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Any] = js.undefined, boxesToAvoid: js.UndefOr[js.Array[js.Object]] = js.undefined): PlotOptionsGanttLabel = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val connectorAllowedOuter: js.UndefOr[Boolean] = connectorAllowed
    val connectorNeighbourDistanceOuter: js.UndefOr[Double] = connectorNeighbourDistance
    val minFontSizeOuter: js.UndefOr[Double] = minFontSize
    val maxFontSizeOuter: js.UndefOr[Double] = maxFontSize
    val onAreaOuter: js.UndefOr[Boolean] = onArea
    val styleOuter: js.Any = style
    val boxesToAvoidOuter: js.UndefOr[js.Array[js.Object]] = boxesToAvoid
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsGanttLabel {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val connectorAllowed: js.UndefOr[Boolean] = connectorAllowedOuter
      override val connectorNeighbourDistance: js.UndefOr[Double] = connectorNeighbourDistanceOuter
      override val minFontSize: js.UndefOr[Double] = minFontSizeOuter
      override val maxFontSize: js.UndefOr[Double] = maxFontSizeOuter
      override val onArea: js.UndefOr[Boolean] = onAreaOuter
      override val style: js.Any = styleOuter
      override val boxesToAvoid: js.UndefOr[js.Array[js.Object]] = boxesToAvoidOuter
    })
  }
}
