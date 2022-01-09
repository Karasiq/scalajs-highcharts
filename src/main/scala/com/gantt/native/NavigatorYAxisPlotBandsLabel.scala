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
  * @note JavaScript name: <code>navigator-yAxis-plotBands-label</code>
  */
class NavigatorYAxisPlotBandsLabel extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Horizontal alignment of the label. Can be one of &quot;left&quot;, &quot;center&quot; or
    * &quot;right&quot;.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-label-align/">Aligned to the right</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotbands-label/">Plot band with labels</a>
    * @since 2.1.0
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>Rotation of the text label in degrees .</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-label-rotation/">Vertical text</a>
    * @since 2.1.0
    */
  var rotation: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS styles for the text label.</p>
    * <p>In styled mode, the labels are styled by the
    * <code>.highcharts-plot-band-label</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-label-style/">Blue and bold label</a>
    * @since 2.1.0
    */
  var style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The string text itself. A subset of HTML is supported.</p>
    * @since 2.1.0
    */
  var text: js.UndefOr[String] = js.undefined

  /**
    * <p>The text alignment for the label. While <code>align</code> determines where the
    * texts anchor point is placed within the plot band, <code>textAlign</code> determines
    * how the text is aligned against its anchor point. Possible values are
    * &quot;left&quot;, &quot;center&quot; and &quot;right&quot;. Defaults to the same as the <code>align</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-label-rotation/">Vertical text in center position but text-aligned left</a>
    * @since 2.1.0
    */
  var textAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>
    * to render the labels.</p>
    * @since 3.0.3
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Vertical alignment of the label relative to the plot band. Can be one of
    * &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-label-verticalalign/">Vertically centered label</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotbands-label/">Plot band with labels</a>
    * @since 2.1.0
    */
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Horizontal position relative the alignment. Default varies by
    * orientation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-label-align/">Aligned 10px from the right edge</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotbands-label/">Plot band with labels</a>
    * @since 2.1.0
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>Vertical position of the text baseline relative to the alignment. Default
    * varies by orientation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-label-y/">Label on x axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotbands-label/">Plot band with labels</a>
    * @since 2.1.0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object NavigatorYAxisPlotBandsLabel {
  /**
    * @param align <p>Horizontal alignment of the label. Can be one of &quot;left&quot;, &quot;center&quot; or. &quot;right&quot;.</p>
    * @param rotation <p>Rotation of the text label in degrees .</p>
    * @param style <p>CSS styles for the text label.</p>. <p>In styled mode, the labels are styled by the. <code>.highcharts-plot-band-label</code> class.</p>
    * @param text <p>The string text itself. A subset of HTML is supported.</p>
    * @param textAlign <p>The text alignment for the label. While <code>align</code> determines where the. texts anchor point is placed within the plot band, <code>textAlign</code> determines. how the text is aligned against its anchor point. Possible values are. &quot;left&quot;, &quot;center&quot; and &quot;right&quot;. Defaults to the same as the <code>align</code> option.</p>
    * @param useHTML <p>Whether to <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>. to render the labels.</p>
    * @param verticalAlign <p>Vertical alignment of the label relative to the plot band. Can be one of. &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.</p>
    * @param x <p>Horizontal position relative the alignment. Default varies by. orientation.</p>
    * @param y <p>Vertical position of the text baseline relative to the alignment. Default. varies by orientation.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined, textAlign: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): NavigatorYAxisPlotBandsLabel = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorYAxisPlotBandsLabel {
      this.align = align
      this.rotation = rotation
      this.style = style
      this.text = text
      this.textAlign = textAlign
      this.useHTML = useHTML
      this.verticalAlign = verticalAlign
      this.x = x
      this.y = y
    })
  }
}
