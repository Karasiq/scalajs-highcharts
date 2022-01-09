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
  * @note JavaScript name: <code>series&lt;gauge&gt;-pivot</code>
  */
class SeriesGaugePivot extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The background color or fill of the pivot.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-pivot/">Pivot options demonstrated</a>
    * @since 2.3.0
    */
  var backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border or stroke color of the pivot. In able to change this,
    * the borderWidth must also be set to something other than the
    * default 0.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-pivot/">Pivot options demonstrated</a>
    * @since 2.3.0
    */
  var borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border or stroke width of the pivot.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-pivot/">Pivot options demonstrated</a>
    * @since 2.3.0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel radius of the pivot.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-pivot/">Pivot options demonstrated</a>
    * @since 2.3.0
    */
  var radius: js.UndefOr[Double] = js.undefined
}

object SeriesGaugePivot {
  /**
    * @param backgroundColor <p>The background color or fill of the pivot.</p>
    * @param borderColor <p>The border or stroke color of the pivot. In able to change this,. the borderWidth must also be set to something other than the. default 0.</p>
    * @param borderWidth <p>The border or stroke width of the pivot.</p>
    * @param radius <p>The pixel radius of the pivot.</p>
    */
  def apply(backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[Double] = js.undefined): SeriesGaugePivot = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesGaugePivot {
      this.backgroundColor = backgroundColor
      this.borderColor = borderColor
      this.borderWidth = borderWidth
      this.radius = radius
    })
  }
}
