/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-klinger-connectors</code>
  */
class PlotOptionsKlingerConnectors extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Set the default dash style for this chart&#39;s connecting lines.</p>
    * @since 6.2.0
    */
  var dashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Marker options specific to the end markers for this chart&#39;s
    * Pathfinder connectors. Overrides the generic marker options.</p>
    * @since 6.2.0
    */
  var endMarker: js.UndefOr[CleanJsObject[PlotOptionsKlingerConnectorsEndMarker]] = js.undefined

  /**
    * <p>Set the default color for this chart&#39;s Pathfinder connecting lines.
    * Defaults to the color of the point being connected.</p>
    * @since 6.2.0
    */
  var lineColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Set the default pixel width for this chart&#39;s Pathfinder connecting
    * lines.</p>
    * @since 6.2.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Marker options for this chart&#39;s Pathfinder connectors. Note that
    * this option is overridden by the <code>startMarker</code> and <code>endMarker</code>
    * options.</p>
    * @since 6.2.0
    */
  var marker: js.Any = js.undefined

  /**
    * <p>Marker options specific to the start markers for this chart&#39;s
    * Pathfinder connectors. Overrides the generic marker options.</p>
    * @since 6.2.0
    */
  var startMarker: js.UndefOr[CleanJsObject[PlotOptionsKlingerConnectorsStartMarker]] = js.undefined

  /**
    * <p>Set the default pathfinder algorithm to use for this chart. It is
    * possible to define your own algorithms by adding them to the
    * Highcharts.Pathfinder.prototype.algorithms object before the chart
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
    * <p>Default value: <code>straight</code> is used as default for most series types,
    * while <code>simpleConnect</code> is used as default for Gantt series, to show
    * dependencies between points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/pathfinder/demo">Different types used</a>
    * @since 6.2.0
    */
  var `type`: js.Any = js.undefined
}

object PlotOptionsKlingerConnectors {
  /**
    * @param dashStyle <p>Set the default dash style for this chart&#39;s connecting lines.</p>
    * @param endMarker <p>Marker options specific to the end markers for this chart&#39;s. Pathfinder connectors. Overrides the generic marker options.</p>
    * @param lineColor <p>Set the default color for this chart&#39;s Pathfinder connecting lines.. Defaults to the color of the point being connected.</p>
    * @param lineWidth <p>Set the default pixel width for this chart&#39;s Pathfinder connecting. lines.</p>
    * @param marker <p>Marker options for this chart&#39;s Pathfinder connectors. Note that. this option is overridden by the <code>startMarker</code> and <code>endMarker</code>. options.</p>
    * @param startMarker <p>Marker options specific to the start markers for this chart&#39;s. Pathfinder connectors. Overrides the generic marker options.</p>
    * @param `type` <p>Set the default pathfinder algorithm to use for this chart. It is. possible to define your own algorithms by adding them to the. Highcharts.Pathfinder.prototype.algorithms object before the chart. has been created.</p>. <p>The default algorithms are as follows:</p>. <p><code>straight</code>:      Draws a straight line between the connecting.                  points. Does not avoid other points when drawing.</p>. <p><code>simpleConnect</code>: Finds a path between the points using right angles.                  only. Takes only starting/ending points into.                  account, and will not avoid other points.</p>. <p><code>fastAvoid</code>:     Finds a path between the points using right angles.                  only. Will attempt to avoid other points, but its.                  focus is performance over accuracy. Works well with.                  less dense datasets.</p>. <p>Default value: <code>straight</code> is used as default for most series types,. while <code>simpleConnect</code> is used as default for Gantt series, to show. dependencies between points.</p>
    */
  def apply(dashStyle: js.UndefOr[String] = js.undefined, endMarker: js.UndefOr[CleanJsObject[PlotOptionsKlingerConnectorsEndMarker]] = js.undefined, lineColor: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[js.Any] = js.undefined, startMarker: js.UndefOr[CleanJsObject[PlotOptionsKlingerConnectorsStartMarker]] = js.undefined, `type`: js.UndefOr[js.Any] = js.undefined): PlotOptionsKlingerConnectors = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsKlingerConnectors {
      this.dashStyle = dashStyle
      this.endMarker = endMarker
      this.lineColor = lineColor
      this.lineWidth = lineWidth
      this.marker = marker
      this.startMarker = startMarker
      this.`type` = `type`
    })
  }
}
