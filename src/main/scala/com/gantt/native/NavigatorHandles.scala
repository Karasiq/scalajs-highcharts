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
  * @note JavaScript name: <code>navigator-handles</code>
  */
class NavigatorHandles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The fill for the handle.</p>
    */
  var backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The stroke for the handle border and the stripes inside.</p>
    */
  var borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Allows to enable/disable handles.</p>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Height for handles.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/styled-handles/">Styled handles</a>
    * @since 6.0.0
    */
  var height: js.UndefOr[Double] = js.undefined

  /**
    * <p>The width for the handle border and the stripes inside.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/styled-handles/">Styled handles</a>
    * @since 6.0.0
    */
  var lineWidth: js.Any = js.undefined

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
  var symbols: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>Width for handles.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/styled-handles/">Styled handles</a>
    * @since 6.0.0
    */
  var width: js.UndefOr[Double] = js.undefined
}

object NavigatorHandles {
  /**
    * @param backgroundColor <p>The fill for the handle.</p>
    * @param borderColor <p>The stroke for the handle border and the stripes inside.</p>
    * @param enabled <p>Allows to enable/disable handles.</p>
    * @param height <p>Height for handles.</p>
    * @param lineWidth <p>The width for the handle border and the stripes inside.</p>
    * @param symbols <p>Array to define shapes of handles. 0-index for left, 1-index for. right.</p>. <p>Additionally, the URL to a graphic can be given on this form:. <code>url(graphic.png)</code>. Note that for the image to be applied to. exported charts, its URL needs to be accessible by the export. server.</p>. <p>Custom callbacks for symbol path generation can also be added to. <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then. used by its method name, as shown in the demo.</p>
    * @param width <p>Width for handles.</p>
    */
  def apply(backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, height: js.UndefOr[Double] = js.undefined, lineWidth: js.UndefOr[js.Any] = js.undefined, symbols: js.UndefOr[js.Array[String]] = js.undefined, width: js.UndefOr[Double] = js.undefined): NavigatorHandles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorHandles {
      this.backgroundColor = backgroundColor
      this.borderColor = borderColor
      this.enabled = enabled
      this.height = height
      this.lineWidth = lineWidth
      this.symbols = symbols
      this.width = width
    })
  }
}
