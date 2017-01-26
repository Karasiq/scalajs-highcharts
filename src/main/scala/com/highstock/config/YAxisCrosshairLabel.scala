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
  * @note JavaScript name: <code>yAxis-crosshair-label</code>
  */
@js.annotation.ScalaJSDefined
class YAxisCrosshairLabel extends js.Object {

  /**
    * Alignment of the label compared to the axis. Defaults to <code>left</code> for right-side axes, <code>right</code> for left-side axes and <code>center</code> for horizontal axes.
    * @since 2.1
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * The background color for the label. Defaults to the related series color, or <code>#666666</code> if that is not available.
    * @since 2.1
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border color for the crosshair label
    * @since 2.1
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border corner radius of the crosshair label.
    * @since 2.1.10
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The border width for the crosshair label.
    * @since 2.1
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * A format string for the crosshair label. Defaults to <code>{value}</code> for numeric axes and <code>{value:%b %d, %Y}</code> for datetime axes.
    * @since 2.1
    */
  val format: js.UndefOr[String] = js.undefined

  /**
    * Formatter function for the label text.
    * @since 2.1
    */
  val formatter: js.UndefOr[js.Function] = js.undefined

  /**
    * Padding inside the crosshair label.
    * @since 2.1
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * The shape to use for the label box.
    * @since 2.1
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * Text styles for the crosshair label.
    * @since 2.1
    */
  val style: js.Any = js.undefined
}

object YAxisCrosshairLabel {
  /**
    * @param align Alignment of the label compared to the axis. Defaults to <code>left</code> for right-side axes, <code>right</code> for left-side axes and <code>center</code> for horizontal axes.
    * @param backgroundColor The background color for the label. Defaults to the related series color, or <code>#666666</code> if that is not available.
    * @param borderColor The border color for the crosshair label
    * @param borderRadius The border corner radius of the crosshair label.
    * @param borderWidth The border width for the crosshair label.
    * @param format A format string for the crosshair label. Defaults to <code>{value}</code> for numeric axes and <code>{value:%b %d, %Y}</code> for datetime axes.
    * @param formatter Formatter function for the label text.
    * @param padding Padding inside the crosshair label.
    * @param shape The shape to use for the label box.
    * @param style Text styles for the crosshair label.
    */
  def apply(align: js.UndefOr[String] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, format: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Function] = js.undefined, padding: js.UndefOr[Double] = js.undefined, shape: js.UndefOr[String] = js.undefined, style: js.UndefOr[js.Any] = js.undefined): YAxisCrosshairLabel = {
    val alignOuter: js.UndefOr[String] = align
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderRadiusOuter: js.UndefOr[Double] = borderRadius
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val formatOuter: js.UndefOr[String] = format
    val formatterOuter: js.UndefOr[js.Function] = formatter
    val paddingOuter: js.UndefOr[Double] = padding
    val shapeOuter: js.UndefOr[String] = shape
    val styleOuter: js.Any = style
    new YAxisCrosshairLabel {
      override val align: js.UndefOr[String] = alignOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderRadius: js.UndefOr[Double] = borderRadiusOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val format: js.UndefOr[String] = formatOuter
      override val formatter: js.UndefOr[js.Function] = formatterOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val shape: js.UndefOr[String] = shapeOuter
      override val style: js.Any = styleOuter
    }
  }
}
