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
  * @note JavaScript name: <code>annotations-shapeOptions</code>
  */
@js.annotation.ScalaJSDefined
class AnnotationsShapeOptions extends com.highcharts.HighchartsGenericObject {

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

object AnnotationsShapeOptions {
  /**
    * @param stroke <p>The color of the shape&#39;s stroke.</p>
    * @param strokeWidth <p>The pixel stroke width of the shape.</p>
    * @param fill <p>The color of the shape&#39;s fill.</p>
    * @param r <p>The radius of the shape.</p>
    * @param width <p>The width of the shape.</p>
    * @param height <p>The height of the shape.</p>
    * @param `type` <p>The type of the shape, e.g. circle or rectangle.</p>
    */
  def apply(stroke: js.UndefOr[String | js.Object] = js.undefined, strokeWidth: js.UndefOr[Double] = js.undefined, fill: js.UndefOr[String | js.Object] = js.undefined, r: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, `type`: js.UndefOr[String] = "'rect'"): AnnotationsShapeOptions = {
    val strokeOuter: js.UndefOr[String | js.Object] = stroke
    val strokeWidthOuter: js.UndefOr[Double] = strokeWidth
    val fillOuter: js.UndefOr[String | js.Object] = fill
    val rOuter: js.UndefOr[Double] = r
    val widthOuter: js.UndefOr[Double] = width
    val heightOuter: js.UndefOr[Double] = height
    val typeOuter: js.UndefOr[String] = `type`
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsShapeOptions {
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
