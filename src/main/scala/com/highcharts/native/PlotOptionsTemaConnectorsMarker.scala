/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-tema-connectors-marker</code>
  */
class PlotOptionsTemaConnectorsMarker extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Horizontal alignment of the markers relative to the points.</p>
    * @since 6.2.0
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>Set the color of the connector markers. By default this is the
    * same as the connector color.</p>
    * @since 6.2.0
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Enable markers for the connectors.</p>
    * @since 6.2.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Set the height of the connector markers. If not supplied, this
    * is inferred from the marker radius.</p>
    * @since 6.2.0
    */
  var height: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether or not to draw the markers inside the points.</p>
    * @since 6.2.0
    */
  var inside: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Set the line/border color of the connector markers. By default
    * this is the same as the marker color.</p>
    * @since 6.2.0
    */
  var lineColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Set the line/border width of the pathfinder markers.</p>
    * @since 6.2.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set the radius of the connector markers. The default is
    * automatically computed based on the algorithmMargin setting.</p>
    * <p>Setting marker.width and marker.height will override this
    * setting.</p>
    * @since 6.2.0
    */
  var radius: js.UndefOr[Double] = js.undefined

  /**
    * <p>Vertical alignment of the markers relative to the points.</p>
    * @since 6.2.0
    */
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Set the width of the connector markers. If not supplied, this
    * is inferred from the marker radius.</p>
    * @since 6.2.0
    */
  var width: js.UndefOr[Double] = js.undefined
}

object PlotOptionsTemaConnectorsMarker {
  /**
    * @param align <p>Horizontal alignment of the markers relative to the points.</p>
    * @param color <p>Set the color of the connector markers. By default this is the. same as the connector color.</p>
    * @param enabled <p>Enable markers for the connectors.</p>
    * @param height <p>Set the height of the connector markers. If not supplied, this. is inferred from the marker radius.</p>
    * @param inside <p>Whether or not to draw the markers inside the points.</p>
    * @param lineColor <p>Set the line/border color of the connector markers. By default. this is the same as the marker color.</p>
    * @param lineWidth <p>Set the line/border width of the pathfinder markers.</p>
    * @param radius <p>Set the radius of the connector markers. The default is. automatically computed based on the algorithmMargin setting.</p>. <p>Setting marker.width and marker.height will override this. setting.</p>
    * @param verticalAlign <p>Vertical alignment of the markers relative to the points.</p>
    * @param width <p>Set the width of the connector markers. If not supplied, this. is inferred from the marker radius.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, height: js.UndefOr[Double] = js.undefined, inside: js.UndefOr[Boolean] = js.undefined, lineColor: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[Double] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double] = js.undefined): PlotOptionsTemaConnectorsMarker = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTemaConnectorsMarker {
      this.align = align
      this.color = color
      this.enabled = enabled
      this.height = height
      this.inside = inside
      this.lineColor = lineColor
      this.lineWidth = lineWidth
      this.radius = radius
      this.verticalAlign = verticalAlign
      this.width = width
    })
  }
}