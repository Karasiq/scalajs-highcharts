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
  * @note JavaScript name: <code>series&lt;gauge&gt;-pivot</code>
  */
@js.annotation.ScalaJSDefined
class SeriesGaugePivot extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The pixel radius of the pivot.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-pivot/">Pivot options demonstrated</a>
    * @since 2.3.0
    */
  val radius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border or stroke width of the pivot.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-pivot/">Pivot options demonstrated</a>
    * @since 2.3.0
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border or stroke color of the pivot. In able to change this,
    * the borderWidth must also be set to something other than the default
    * 0.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-pivot/">Pivot options demonstrated</a>
    * @since 2.3.0
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The background color or fill of the pivot.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-pivot/">Pivot options demonstrated</a>
    * @since 2.3.0
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined
}

object SeriesGaugePivot {
  /**
    * @param radius <p>The pixel radius of the pivot.</p>
    * @param borderWidth <p>The border or stroke width of the pivot.</p>
    * @param borderColor <p>The border or stroke color of the pivot. In able to change this,. the borderWidth must also be set to something other than the default. 0.</p>
    * @param backgroundColor <p>The background color or fill of the pivot.</p>
    */
  def apply(radius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined): SeriesGaugePivot = {
    val radiusOuter: js.UndefOr[Double] = radius
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesGaugePivot {
      override val radius: js.UndefOr[Double] = radiusOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
    })
  }
}
