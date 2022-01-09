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
  * @note JavaScript name: <code>series&lt;bar&gt;-lastPrice-label</code>
  */
class SeriesBarLastPriceLabel extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Alignment of the label compared to the axis. Defaults to <code>&quot;left&quot;</code> for
    * right-side axes, <code>&quot;right&quot;</code> for left-side axes and <code>&quot;center&quot;</code> for
    * horizontal axes.</p>
    * @since 7.0.0
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>The background color for the label. Defaults to the related series
    * color, or <code>#666666</code> if that is not available.</p>
    * @since 7.0.0
    */
  var backgroundColor: js.Any = js.undefined

  /**
    * <p>The border color of <code>lastPrice</code> label.</p>
    * @since 7.0.0
    */
  var borderColor: js.Any = js.undefined

  /**
    * <p>The border radius of <code>lastPrice</code> label.</p>
    * @since 7.0.0
    */
  var borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border width for the <code>lastPrice</code> label.</p>
    * @since 7.0.0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Flag to enable <code>lastPrice</code> label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/crosshairs-xy/">Enabled label for yAxis' crosshair</a>
    * @since 7.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A format string for the <code>lastPrice</code> label. Defaults to <code>{value}</code> for
    * numeric axes and <code>{value:%b %d, %Y}</code> for datetime axes.</p>
    * @since 7.0.0
    */
  var format: js.UndefOr[String] = js.undefined

  /**
    * <p>Formatter function for the label text.</p>
    * @since 7.0.0
    */
  var formatter: js.Any = js.undefined

  /**
    * <p>Padding inside the <code>lastPrice</code> label.</p>
    * @since 7.0.0
    */
  var padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The shape to use for the label box.</p>
    * @since 7.0.0
    */
  var shape: js.UndefOr[String] = js.undefined

  /**
    * <p>Text styles for the <code>lastPrice</code> label.</p>
    * @since 7.0.0
    */
  var style: js.UndefOr[js.Object] = js.undefined
}

object SeriesBarLastPriceLabel {
  /**
    * @param align <p>Alignment of the label compared to the axis. Defaults to <code>&quot;left&quot;</code> for. right-side axes, <code>&quot;right&quot;</code> for left-side axes and <code>&quot;center&quot;</code> for. horizontal axes.</p>
    * @param backgroundColor <p>The background color for the label. Defaults to the related series. color, or <code>#666666</code> if that is not available.</p>
    * @param borderColor <p>The border color of <code>lastPrice</code> label.</p>
    * @param borderRadius <p>The border radius of <code>lastPrice</code> label.</p>
    * @param borderWidth <p>The border width for the <code>lastPrice</code> label.</p>
    * @param enabled <p>Flag to enable <code>lastPrice</code> label.</p>
    * @param format <p>A format string for the <code>lastPrice</code> label. Defaults to <code>{value}</code> for. numeric axes and <code>{value:%b %d, %Y}</code> for datetime axes.</p>
    * @param formatter <p>Formatter function for the label text.</p>
    * @param padding <p>Padding inside the <code>lastPrice</code> label.</p>
    * @param shape <p>The shape to use for the label box.</p>
    * @param style <p>Text styles for the <code>lastPrice</code> label.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, backgroundColor: js.UndefOr[js.Any] = js.undefined, borderColor: js.UndefOr[js.Any] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, format: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Any] = js.undefined, padding: js.UndefOr[Double] = js.undefined, shape: js.UndefOr[String] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): SeriesBarLastPriceLabel = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBarLastPriceLabel {
      this.align = align
      this.backgroundColor = backgroundColor
      this.borderColor = borderColor
      this.borderRadius = borderRadius
      this.borderWidth = borderWidth
      this.enabled = enabled
      this.format = format
      this.formatter = formatter
      this.padding = padding
      this.shape = shape
      this.style = style
    })
  }
}
