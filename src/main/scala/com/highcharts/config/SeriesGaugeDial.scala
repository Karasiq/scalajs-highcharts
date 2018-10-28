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
  * @note JavaScript name: <code>series&lt;gauge&gt;-dial</code>
  */
@js.annotation.ScalaJSDefined
class SeriesGaugeDial extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The length of the dial&#39;s base part, relative to the total radius
    * or length of the dial.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  val baseLength: js.UndefOr[String] = js.undefined

  /**
    * <p>The pixel width of the base of the gauge dial. The base is the part
    * closest to the pivot, defined by baseLength.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  val baseWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The radius or length of the dial, in percentages relative to the
    * radius of the gauge itself.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  val radius: js.UndefOr[String] = js.undefined

  /**
    * <p>The length of the dial&#39;s rear end, the part that extends out on the
    * other side of the pivot. Relative to the dial&#39;s length.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  val rearLength: js.UndefOr[String] = js.undefined

  /**
    * <p>The width of the top of the dial, closest to the perimeter. The pivot
    * narrows in from the base to the top.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  val topWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The background or fill color of the gauge&#39;s dial.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border color or stroke of the gauge&#39;s dial. By default, the
    * borderWidth is 0, so this must be set in addition to a custom border
    * color.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the gauge dial border in pixels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  val borderWidth: js.UndefOr[Double] = js.undefined
}

object SeriesGaugeDial {
  /**
    * @param baseLength <p>The length of the dial&#39;s base part, relative to the total radius. or length of the dial.</p>
    * @param baseWidth <p>The pixel width of the base of the gauge dial. The base is the part. closest to the pivot, defined by baseLength.</p>
    * @param radius <p>The radius or length of the dial, in percentages relative to the. radius of the gauge itself.</p>
    * @param rearLength <p>The length of the dial&#39;s rear end, the part that extends out on the. other side of the pivot. Relative to the dial&#39;s length.</p>
    * @param topWidth <p>The width of the top of the dial, closest to the perimeter. The pivot. narrows in from the base to the top.</p>
    * @param backgroundColor <p>The background or fill color of the gauge&#39;s dial.</p>
    * @param borderColor <p>The border color or stroke of the gauge&#39;s dial. By default, the. borderWidth is 0, so this must be set in addition to a custom border. color.</p>
    * @param borderWidth <p>The width of the gauge dial border in pixels.</p>
    */
  def apply(baseLength: js.UndefOr[String] = js.undefined, baseWidth: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[String] = js.undefined, rearLength: js.UndefOr[String] = js.undefined, topWidth: js.UndefOr[Double] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined): SeriesGaugeDial = {
    val baseLengthOuter: js.UndefOr[String] = baseLength
    val baseWidthOuter: js.UndefOr[Double] = baseWidth
    val radiusOuter: js.UndefOr[String] = radius
    val rearLengthOuter: js.UndefOr[String] = rearLength
    val topWidthOuter: js.UndefOr[Double] = topWidth
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesGaugeDial {
      override val baseLength: js.UndefOr[String] = baseLengthOuter
      override val baseWidth: js.UndefOr[Double] = baseWidthOuter
      override val radius: js.UndefOr[String] = radiusOuter
      override val rearLength: js.UndefOr[String] = rearLengthOuter
      override val topWidth: js.UndefOr[Double] = topWidthOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
    })
  }
}
