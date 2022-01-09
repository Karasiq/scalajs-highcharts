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
  * @note JavaScript name: <code>annotations-tunnel-shapeOptions</code>
  */
class AnnotationsTunnelShapeOptions extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Name of the dash style to use for the shape&#39;s stroke.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">Possible values demonstrated</a>
    * @since 6.0.0
    */
  var dashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>The color of the shape&#39;s fill.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
    * @since 6.0.0
    */
  var fill: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The height of the shape.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
    * @since 6.0.0
    */
  var height: js.UndefOr[Double] = js.undefined

  /**
    * <p>The radius of the shape.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
    * @since 6.0.0
    */
  var r: js.UndefOr[Double] = js.undefined

  /**
    * <p>The radius of the shape in y direction.
    * Used for the ellipse.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/ellipse/">Ellipse annotation</a>
    * @since 6.0.0
    */
  var ry: js.UndefOr[Double] = js.undefined

  /**
    * <p>Defines additional snapping area around an annotation
    * making this annotation to focus. Defined in pixels.</p>
    * @since 6.0.0
    */
  var snap: js.UndefOr[Double] = js.undefined

  /**
    * <p>The URL for an image to use as the annotation shape.
    * Note, type has to be set to <code>&#39;image&#39;</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape-src/">Define a marker image url for annotations</a>
    * @since 6.0.0
    */
  var src: js.UndefOr[String] = js.undefined

  /**
    * <p>The color of the shape&#39;s stroke.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
    * @since 6.0.0
    */
  var stroke: js.UndefOr[String] = js.undefined

  /**
    * <p>The pixel stroke width of the shape.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
    * @since 6.0.0
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The type of the shape.
    * Avaliable options are circle, rect and ellipse.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/ellipse/">Ellipse annotation</a>
    * @since 6.0.0
    */
  var `type`: js.UndefOr[String] = "rect"

  /**
    * <p>The width of the shape.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
    * @since 6.0.0
    */
  var width: js.UndefOr[Double] = js.undefined

  /**
    * <p>The xAxis index to which the points should be attached.
    * Used for the ellipse.</p>
    * @since 6.0.0
    */
  var xAxis: js.UndefOr[Double] = js.undefined

  /**
    * <p>The yAxis index to which the points should be attached.
    * Used for the ellipse.</p>
    * @since 6.0.0
    */
  var yAxis: js.UndefOr[Double] = js.undefined
}

object AnnotationsTunnelShapeOptions {
  /**
    * @param dashStyle <p>Name of the dash style to use for the shape&#39;s stroke.</p>
    * @param fill <p>The color of the shape&#39;s fill.</p>
    * @param height <p>The height of the shape.</p>
    * @param r <p>The radius of the shape.</p>
    * @param ry <p>The radius of the shape in y direction.. Used for the ellipse.</p>
    * @param snap <p>Defines additional snapping area around an annotation. making this annotation to focus. Defined in pixels.</p>
    * @param src <p>The URL for an image to use as the annotation shape.. Note, type has to be set to <code>&#39;image&#39;</code>.</p>
    * @param stroke <p>The color of the shape&#39;s stroke.</p>
    * @param strokeWidth <p>The pixel stroke width of the shape.</p>
    * @param `type` <p>The type of the shape.. Avaliable options are circle, rect and ellipse.</p>
    * @param width <p>The width of the shape.</p>
    * @param xAxis <p>The xAxis index to which the points should be attached.. Used for the ellipse.</p>
    * @param yAxis <p>The yAxis index to which the points should be attached.. Used for the ellipse.</p>
    */
  def apply(dashStyle: js.UndefOr[String] = js.undefined, fill: js.UndefOr[String | js.Object] = js.undefined, height: js.UndefOr[Double] = js.undefined, r: js.UndefOr[Double] = js.undefined, ry: js.UndefOr[Double] = js.undefined, snap: js.UndefOr[Double] = js.undefined, src: js.UndefOr[String] = js.undefined, stroke: js.UndefOr[String] = js.undefined, strokeWidth: js.UndefOr[Double] = js.undefined, `type`: js.UndefOr[String] = "rect", width: js.UndefOr[Double] = js.undefined, xAxis: js.UndefOr[Double] = js.undefined, yAxis: js.UndefOr[Double] = js.undefined): AnnotationsTunnelShapeOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsTunnelShapeOptions {
      this.dashStyle = dashStyle
      this.fill = fill
      this.height = height
      this.r = r
      this.ry = ry
      this.snap = snap
      this.src = src
      this.stroke = stroke
      this.strokeWidth = strokeWidth
      this.`type` = `type`
      this.width = width
      this.xAxis = xAxis
      this.yAxis = yAxis
    })
  }
}
