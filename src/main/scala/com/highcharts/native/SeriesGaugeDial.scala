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
  * @note JavaScript name: <code>series&lt;gauge&gt;-dial</code>
  */
class SeriesGaugeDial extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The background or fill color of the gauge&#39;s dial.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  var backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The length of the dial&#39;s base part, relative to the total radius
    * or length of the dial.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  var baseLength: js.UndefOr[String] = js.undefined

  /**
    * <p>The pixel width of the base of the gauge dial. The base is the
    * part closest to the pivot, defined by baseLength.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  var baseWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border color or stroke of the gauge&#39;s dial. By default, the
    * borderWidth is 0, so this must be set in addition to a custom
    * border color.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  var borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the gauge dial border in pixels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The radius or length of the dial, in percentages relative to the
    * radius of the gauge itself.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  var radius: js.UndefOr[String] = js.undefined

  /**
    * <p>The length of the dial&#39;s rear end, the part that extends out on
    * the other side of the pivot. Relative to the dial&#39;s length.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  var rearLength: js.UndefOr[String] = js.undefined

  /**
    * <p>The width of the top of the dial, closest to the perimeter. The
    * pivot narrows in from the base to the top.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a>
    * @since 2.3.0
    */
  var topWidth: js.UndefOr[Double] = js.undefined
}

object SeriesGaugeDial {
  /**
    * @param backgroundColor <p>The background or fill color of the gauge&#39;s dial.</p>
    * @param baseLength <p>The length of the dial&#39;s base part, relative to the total radius. or length of the dial.</p>
    * @param baseWidth <p>The pixel width of the base of the gauge dial. The base is the. part closest to the pivot, defined by baseLength.</p>
    * @param borderColor <p>The border color or stroke of the gauge&#39;s dial. By default, the. borderWidth is 0, so this must be set in addition to a custom. border color.</p>
    * @param borderWidth <p>The width of the gauge dial border in pixels.</p>
    * @param radius <p>The radius or length of the dial, in percentages relative to the. radius of the gauge itself.</p>
    * @param rearLength <p>The length of the dial&#39;s rear end, the part that extends out on. the other side of the pivot. Relative to the dial&#39;s length.</p>
    * @param topWidth <p>The width of the top of the dial, closest to the perimeter. The. pivot narrows in from the base to the top.</p>
    */
  def apply(backgroundColor: js.UndefOr[String | js.Object] = js.undefined, baseLength: js.UndefOr[String] = js.undefined, baseWidth: js.UndefOr[Double] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[String] = js.undefined, rearLength: js.UndefOr[String] = js.undefined, topWidth: js.UndefOr[Double] = js.undefined): SeriesGaugeDial = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesGaugeDial {
      this.backgroundColor = backgroundColor
      this.baseLength = baseLength
      this.baseWidth = baseWidth
      this.borderColor = borderColor
      this.borderWidth = borderWidth
      this.radius = radius
      this.rearLength = rearLength
      this.topWidth = topWidth
    })
  }
}
