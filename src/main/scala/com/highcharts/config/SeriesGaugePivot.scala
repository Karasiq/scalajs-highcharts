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
  * @note JavaScript name: <code>series&lt;gauge&gt;-pivot</code>
  */
@js.annotation.ScalaJSDefined
class SeriesGaugePivot extends js.Object {

  /**
    * The background color or fill of the pivot.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-pivot/" target="_blank">Pivot options demonstrated</a>
    * @since 2.3.0
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border or stroke color of the pivot. In able to change this, the borderWidth must also be set to something other than the default 0.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-pivot/" target="_blank">Pivot options demonstrated</a>
    * @since 2.3.0
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border or stroke width of the pivot.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-pivot/" target="_blank">Pivot options demonstrated</a>
    * @since 2.3.0
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * The pixel radius of the pivot.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/gauge-pivot/" target="_blank">Pivot options demonstrated</a>
    * @since 2.3.0
    */
  val radius: js.UndefOr[Double] = js.undefined
}

object SeriesGaugePivot {
  /**
    * @param backgroundColor The background color or fill of the pivot.
    * @param borderColor The border or stroke color of the pivot. In able to change this, the borderWidth must also be set to something other than the default 0.
    * @param borderWidth The border or stroke width of the pivot.
    * @param radius The pixel radius of the pivot.
    */
  def apply(backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[Double] = js.undefined): SeriesGaugePivot = {
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val radiusOuter: js.UndefOr[Double] = radius
    new SeriesGaugePivot {
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val radius: js.UndefOr[Double] = radiusOuter
    }
  }
}
