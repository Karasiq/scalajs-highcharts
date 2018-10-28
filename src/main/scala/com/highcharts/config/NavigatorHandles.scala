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
  * @note JavaScript name: <code>navigator-handles</code>
  */
@js.annotation.ScalaJSDefined
class NavigatorHandles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Width for handles.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/styled-handles/">Styled handles</a>
    * @since 6.0.0
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * <p>Height for handles.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/styled-handles/">Styled handles</a>
    * @since 6.0.0
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * <p>Array to define shapes of handles. 0-index for left, 1-index for
    * right.</p>
    * <p>Additionally, the URL to a graphic can be given on this form:
    * <code>url(graphic.png)</code>. Note that for the image to be applied to
    * exported charts, its URL needs to be accessible by the export
    * server.</p>
    * <p>Custom callbacks for symbol path generation can also be added to
    * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then
    * used by its method name, as shown in the demo.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/styled-handles/">Styled handles</a>
    * @since 6.0.0
    */
  val symbols: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>Allows to enable/disable handles.</p>
    * @since 6.0.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The width for the handle border and the stripes inside.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/styled-handles/">Styled handles</a>
    * @since 6.0.0
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The fill for the handle.</p>
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The stroke for the handle border and the stripes inside.</p>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined
}

object NavigatorHandles {
  /**
    * @param width <p>Width for handles.</p>
    * @param height <p>Height for handles.</p>
    * @param symbols <p>Array to define shapes of handles. 0-index for left, 1-index for. right.</p>. <p>Additionally, the URL to a graphic can be given on this form:. <code>url(graphic.png)</code>. Note that for the image to be applied to. exported charts, its URL needs to be accessible by the export. server.</p>. <p>Custom callbacks for symbol path generation can also be added to. <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then. used by its method name, as shown in the demo.</p>
    * @param enabled <p>Allows to enable/disable handles.</p>
    * @param lineWidth <p>The width for the handle border and the stripes inside.</p>
    * @param backgroundColor <p>The fill for the handle.</p>
    * @param borderColor <p>The stroke for the handle border and the stripes inside.</p>
    */
  def apply(width: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, symbols: js.UndefOr[js.Array[String]] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined): NavigatorHandles = {
    val widthOuter: js.UndefOr[Double] = width
    val heightOuter: js.UndefOr[Double] = height
    val symbolsOuter: js.UndefOr[js.Array[String]] = symbols
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorHandles {
      override val width: js.UndefOr[Double] = widthOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val symbols: js.UndefOr[js.Array[String]] = symbolsOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
    })
  }
}
