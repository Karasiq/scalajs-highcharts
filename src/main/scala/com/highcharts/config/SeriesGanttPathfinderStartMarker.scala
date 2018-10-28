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
  * @note JavaScript name: <code>series&lt;gantt&gt;-pathfinder-startMarker</code>
  */
@js.annotation.ScalaJSDefined
class SeriesGanttPathfinderStartMarker extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable markers for the connectors.</p>
    * @since 6.2.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Set the symbol of the pathfinder start markers.</p>
    * @since 6.2.0
    */
  val symbol: js.UndefOr[String] = js.undefined

  /**
    * <p>Set the radius of the pathfinder markers. The default is
    * automatically computed based on the algorithmMargin setting.</p>
    * <p>Setting marker.width and marker.height will override this
    * setting.</p>
    * @since 6.2.0
    */
  val radius: js.UndefOr[Double] = js.undefined

  val fill: js.UndefOr[String] = js.undefined

  /**
    * <p>Horizontal alignment of the markers relative to the points.</p>
    * @since 6.2.0
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>Vertical alignment of the markers relative to the points.</p>
    * @since 6.2.0
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether or not to draw the markers inside the points.</p>
    * @since 6.2.0
    */
  val inside: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Set the line/border width of the pathfinder markers.</p>
    * @since 6.2.0
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set the width of the pathfinder markers. If not supplied, this
    * is inferred from the marker radius.</p>
    * @since 6.2.0
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set the height of the pathfinder markers. If not supplied, this
    * is inferred from the marker radius.</p>
    * @since 6.2.0
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set the color of the pathfinder markers. By default this is the
    * same as the connector color.</p>
    * @since 6.2.0
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Set the line/border color of the pathfinder markers. By default
    * this is the same as the marker color.</p>
    * @since 6.2.0
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined
}

object SeriesGanttPathfinderStartMarker {
  /**
    * @param enabled <p>Enable markers for the connectors.</p>
    * @param symbol <p>Set the symbol of the pathfinder start markers.</p>
    * @param radius <p>Set the radius of the pathfinder markers. The default is. automatically computed based on the algorithmMargin setting.</p>. <p>Setting marker.width and marker.height will override this. setting.</p>
    * @param align <p>Horizontal alignment of the markers relative to the points.</p>
    * @param verticalAlign <p>Vertical alignment of the markers relative to the points.</p>
    * @param inside <p>Whether or not to draw the markers inside the points.</p>
    * @param lineWidth <p>Set the line/border width of the pathfinder markers.</p>
    * @param width <p>Set the width of the pathfinder markers. If not supplied, this. is inferred from the marker radius.</p>
    * @param height <p>Set the height of the pathfinder markers. If not supplied, this. is inferred from the marker radius.</p>
    * @param color <p>Set the color of the pathfinder markers. By default this is the. same as the connector color.</p>
    * @param lineColor <p>Set the line/border color of the pathfinder markers. By default. this is the same as the marker color.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, symbol: js.UndefOr[String] = js.undefined, radius: js.UndefOr[Double] = js.undefined, fill: js.UndefOr[String] = js.undefined, align: js.UndefOr[String] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, inside: js.UndefOr[Boolean] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined): SeriesGanttPathfinderStartMarker = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val symbolOuter: js.UndefOr[String] = symbol
    val radiusOuter: js.UndefOr[Double] = radius
    val fillOuter: js.UndefOr[String] = fill
    val alignOuter: js.UndefOr[String] = align
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val insideOuter: js.UndefOr[Boolean] = inside
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val widthOuter: js.UndefOr[Double] = width
    val heightOuter: js.UndefOr[Double] = height
    val colorOuter: js.UndefOr[String | js.Object] = color
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesGanttPathfinderStartMarker {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val symbol: js.UndefOr[String] = symbolOuter
      override val radius: js.UndefOr[Double] = radiusOuter
      override val fill: js.UndefOr[String] = fillOuter
      override val align: js.UndefOr[String] = alignOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val inside: js.UndefOr[Boolean] = insideOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val width: js.UndefOr[Double] = widthOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
    })
  }
}
