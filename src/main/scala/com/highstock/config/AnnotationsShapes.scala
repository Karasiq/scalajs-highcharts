/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>annotations-shapes</code>
  */
@js.annotation.ScalaJSDefined
class AnnotationsShapes extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>This option defines the point to which the shape will be connected.
    * It can be either the point which exists in the series - it is
    * referenced by the point&#39;s id - or a new point with defined x, y
    * properties and optionally axes.</p>
    * @since 6.0.0
    */
  val point: js.UndefOr[String | CleanJsObject[AnnotationsShapesPoint]] = js.undefined

  /**
    * <p>An array of points for the shape. This option is available for shapes
    * which can use multiple points such as path. A point can be either
    * a point object or a point&#39;s id.</p>
    * @since 6.0.0
    */
  val points: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>Id of the marker which will be drawn at the final vertex of the path.
    * Custom markers can be defined in defs property.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/custom-markers/">Define a custom marker for annotations</a>
    * @since 6.0.0
    */
  val markerEnd: js.UndefOr[String] = js.undefined

  /**
    * <p>Id of the marker which will be drawn at the first vertex of the path.
    * Custom markers can be defined in defs property.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/custom-markers/">Define a custom marker for annotations</a>
    * @since 6.0.0
    */
  val markerStart: js.UndefOr[String] = js.undefined

  /**
    * <p>The color of the shape&#39;s stroke.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
    * @since 6.0.0
    */
  val stroke: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The pixel stroke width of the shape.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
    * @since 6.0.0
    */
  val strokeWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the shape&#39;s fill.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
    * @since 6.0.0
    */
  val fill: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The radius of the shape.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
    * @since 6.0.0
    */
  val r: js.UndefOr[Double] = js.undefined

  /**
    * <p>The width of the shape.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
    * @since 6.0.0
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * <p>The height of the shape.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
    * @since 6.0.0
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * <p>The type of the shape, e.g. circle or rectangle.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
    * @since 6.0.0
    */
  val `type`: js.UndefOr[String] = "'rect'"
}

object AnnotationsShapes {
  /**
    * @param point <p>This option defines the point to which the shape will be connected.. It can be either the point which exists in the series - it is. referenced by the point&#39;s id - or a new point with defined x, y. properties and optionally axes.</p>
    * @param points <p>An array of points for the shape. This option is available for shapes. which can use multiple points such as path. A point can be either. a point object or a point&#39;s id.</p>
    * @param markerEnd <p>Id of the marker which will be drawn at the final vertex of the path.. Custom markers can be defined in defs property.</p>
    * @param markerStart <p>Id of the marker which will be drawn at the first vertex of the path.. Custom markers can be defined in defs property.</p>
    * @param stroke <p>The color of the shape&#39;s stroke.</p>
    * @param strokeWidth <p>The pixel stroke width of the shape.</p>
    * @param fill <p>The color of the shape&#39;s fill.</p>
    * @param r <p>The radius of the shape.</p>
    * @param width <p>The width of the shape.</p>
    * @param height <p>The height of the shape.</p>
    * @param `type` <p>The type of the shape, e.g. circle or rectangle.</p>
    */
  def apply(point: js.UndefOr[String | CleanJsObject[AnnotationsShapesPoint]] = js.undefined, points: js.UndefOr[js.Array[js.Any]] = js.undefined, markerEnd: js.UndefOr[String] = js.undefined, markerStart: js.UndefOr[String] = js.undefined, stroke: js.UndefOr[String | js.Object] = js.undefined, strokeWidth: js.UndefOr[Double] = js.undefined, fill: js.UndefOr[String | js.Object] = js.undefined, r: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, `type`: js.UndefOr[String] = "'rect'"): AnnotationsShapes = {
    val pointOuter: js.UndefOr[String | CleanJsObject[AnnotationsShapesPoint]] = point
    val pointsOuter: js.UndefOr[js.Array[js.Any]] = points
    val markerEndOuter: js.UndefOr[String] = markerEnd
    val markerStartOuter: js.UndefOr[String] = markerStart
    val strokeOuter: js.UndefOr[String | js.Object] = stroke
    val strokeWidthOuter: js.UndefOr[Double] = strokeWidth
    val fillOuter: js.UndefOr[String | js.Object] = fill
    val rOuter: js.UndefOr[Double] = r
    val widthOuter: js.UndefOr[Double] = width
    val heightOuter: js.UndefOr[Double] = height
    val typeOuter: js.UndefOr[String] = `type`
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsShapes {
      override val point: js.UndefOr[String | CleanJsObject[AnnotationsShapesPoint]] = pointOuter
      override val points: js.UndefOr[js.Array[js.Any]] = pointsOuter
      override val markerEnd: js.UndefOr[String] = markerEndOuter
      override val markerStart: js.UndefOr[String] = markerStartOuter
      override val stroke: js.UndefOr[String | js.Object] = strokeOuter
      override val strokeWidth: js.UndefOr[Double] = strokeWidthOuter
      override val fill: js.UndefOr[String | js.Object] = fillOuter
      override val r: js.UndefOr[Double] = rOuter
      override val width: js.UndefOr[Double] = widthOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val `type`: js.UndefOr[String] = typeOuter
    })
  }
}
