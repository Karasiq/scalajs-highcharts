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
  * @note JavaScript name: <code>plotOptions-stochastic-pathfinder</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsStochasticPathfinder extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Set the default pathfinder algorithm to use for this chart. It is
    * possible to define your own algorithms by adding them to the
    * Highcharts.Pathfinder.prototype.algorithms object after the chart
    * has been created.</p>
    * <p>The default algorithms are as follows:</p>
    * <p><code>straight</code>:      Draws a straight line between the connecting
    *                  points. Does not avoid other points when drawing.</p>
    * <p><code>simpleConnect</code>: Finds a path between the points using right angles
    *                  only. Takes only starting/ending points into
    *                  account, and will not avoid other points.</p>
    * <p><code>fastAvoid</code>:     Finds a path between the points using right angles
    *                  only. Will attempt to avoid other points, but its
    *                  focus is performance over accuracy. Works well with
    *                  less dense datasets.</p>
    * <p><code>straight</code> is used as default for most series types, while
    * <code>simpleConnect</code> is used as default for Gantt series, to show
    * dependencies between points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/pathfinder/demo">Different types used</a>
    * @since 6.2.0
    */
  val `type`: js.UndefOr[String] = "straight|simpleConnect"

  /**
    * <p>Set the default pixel width for this chart&#39;s Pathfinder connecting
    * lines.</p>
    * @since 6.2.0
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Marker options for this chart&#39;s Pathfinder connectors. Note that
    * this option is overridden by the <code>startMarker</code> and <code>endMarker</code>
    * options.</p>
    * @since 6.2.0
    */
  val marker: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Marker options specific to the start markers for this chart&#39;s
    * Pathfinder connectors. Overrides the generic marker options.</p>
    * @since 6.2.0
    */
  val startMarker: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Marker options specific to the end markers for this chart&#39;s
    * Pathfinder connectors. Overrides the generic marker options.</p>
    * @since 6.2.0
    */
  val endMarker: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Enable the pathfinder for this chart. Requires Highcharts Gantt.</p>
    * @since 6.2.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Set the default dash style for this chart&#39;s Pathfinder connecting
    * lines.</p>
    * @since 6.2.0
    */
  val dashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Set the default color for this chart&#39;s Pathfinder connecting lines.
    * Defaults to the color of the point being connected.</p>
    * @since 6.2.0
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Set the default pathfinder margin to use, in pixels. Some Pathfinder
    * algorithms attempt to avoid obstacles, such as other points in the
    * chart. These algorithms use this margin to determine how close lines
    * can be to an obstacle. The default is to compute this automatically
    * from the size of the obstacles in the chart.</p>
    * <p>To draw connecting lines close to existing points, set this to a low
    * number. For more space around existing points, set this number
    * higher.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/pathfinder/algorithm-margin">Small algorithmMargin</a>
    * @since 6.2.0
    */
  val algorithmMargin: js.UndefOr[Double] = js.undefined
}

object PlotOptionsStochasticPathfinder {
  /**
    * @param `type` <p>Set the default pathfinder algorithm to use for this chart. It is. possible to define your own algorithms by adding them to the. Highcharts.Pathfinder.prototype.algorithms object after the chart. has been created.</p>. <p>The default algorithms are as follows:</p>. <p><code>straight</code>:      Draws a straight line between the connecting.                  points. Does not avoid other points when drawing.</p>. <p><code>simpleConnect</code>: Finds a path between the points using right angles.                  only. Takes only starting/ending points into.                  account, and will not avoid other points.</p>. <p><code>fastAvoid</code>:     Finds a path between the points using right angles.                  only. Will attempt to avoid other points, but its.                  focus is performance over accuracy. Works well with.                  less dense datasets.</p>. <p><code>straight</code> is used as default for most series types, while. <code>simpleConnect</code> is used as default for Gantt series, to show. dependencies between points.</p>
    * @param lineWidth <p>Set the default pixel width for this chart&#39;s Pathfinder connecting. lines.</p>
    * @param marker <p>Marker options for this chart&#39;s Pathfinder connectors. Note that. this option is overridden by the <code>startMarker</code> and <code>endMarker</code>. options.</p>
    * @param startMarker <p>Marker options specific to the start markers for this chart&#39;s. Pathfinder connectors. Overrides the generic marker options.</p>
    * @param endMarker <p>Marker options specific to the end markers for this chart&#39;s. Pathfinder connectors. Overrides the generic marker options.</p>
    * @param enabled <p>Enable the pathfinder for this chart. Requires Highcharts Gantt.</p>
    * @param dashStyle <p>Set the default dash style for this chart&#39;s Pathfinder connecting. lines.</p>
    * @param lineColor <p>Set the default color for this chart&#39;s Pathfinder connecting lines.. Defaults to the color of the point being connected.</p>
    * @param algorithmMargin <p>Set the default pathfinder margin to use, in pixels. Some Pathfinder. algorithms attempt to avoid obstacles, such as other points in the. chart. These algorithms use this margin to determine how close lines. can be to an obstacle. The default is to compute this automatically. from the size of the obstacles in the chart.</p>. <p>To draw connecting lines close to existing points, set this to a low. number. For more space around existing points, set this number. higher.</p>
    */
  def apply(`type`: js.UndefOr[String] = "straight|simpleConnect", lineWidth: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[js.Object] = js.undefined, startMarker: js.UndefOr[js.Object] = js.undefined, endMarker: js.UndefOr[js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, algorithmMargin: js.UndefOr[Double] = js.undefined): PlotOptionsStochasticPathfinder = {
    val typeOuter: js.UndefOr[String] = `type`
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val markerOuter: js.UndefOr[js.Object] = marker
    val startMarkerOuter: js.UndefOr[js.Object] = startMarker
    val endMarkerOuter: js.UndefOr[js.Object] = endMarker
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val dashStyleOuter: js.UndefOr[String] = dashStyle
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val algorithmMarginOuter: js.UndefOr[Double] = algorithmMargin
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsStochasticPathfinder {
      override val `type`: js.UndefOr[String] = typeOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val marker: js.UndefOr[js.Object] = markerOuter
      override val startMarker: js.UndefOr[js.Object] = startMarkerOuter
      override val endMarker: js.UndefOr[js.Object] = endMarkerOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val dashStyle: js.UndefOr[String] = dashStyleOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val algorithmMargin: js.UndefOr[Double] = algorithmMarginOuter
    })
  }
}
