/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>navigator-yAxis-crosshair-label</code>
  */
@js.annotation.ScalaJSDefined
class NavigatorYAxisCrosshairLabel extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Alignment of the label compared to the axis. Defaults to <code>left</code> for
    * right-side axes, <code>right</code> for left-side axes and <code>center</code> for
    * horizontal axes.</p>
    * @since 2.1
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>The background color for the label. Defaults to the related series
    * color, or <code>#666666</code> if that is not available.</p>
    * @since 2.1
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border color for the crosshair label</p>
    * @since 2.1
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border corner radius of the crosshair label.</p>
    * @since 2.1.10
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border width for the crosshair label.</p>
    * @since 2.1
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>A format string for the crosshair label. Defaults to <code>{value}</code> for
    * numeric axes and <code>{value:%b %d, %Y}</code> for datetime axes.</p>
    * @since 2.1
    */
  val format: js.UndefOr[String] = js.undefined

  /**
    * <p>Formatter function for the label text.</p>
    * @since 2.1
    */
  val formatter: js.Any = js.undefined

  /**
    * <p>Padding inside the crosshair label.</p>
    * @since 2.1
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The shape to use for the label box.</p>
    * @since 2.1
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * <p>Text styles for the crosshair label.</p>
    * @since 2.1
    */
  val style: js.UndefOr[js.Object] = js.undefined
}

object NavigatorYAxisCrosshairLabel {
  /**
    * @param align <p>Alignment of the label compared to the axis. Defaults to <code>left</code> for. right-side axes, <code>right</code> for left-side axes and <code>center</code> for. horizontal axes.</p>
    * @param backgroundColor <p>The background color for the label. Defaults to the related series. color, or <code>#666666</code> if that is not available.</p>
    * @param borderColor <p>The border color for the crosshair label</p>
    * @param borderRadius <p>The border corner radius of the crosshair label.</p>
    * @param borderWidth <p>The border width for the crosshair label.</p>
    * @param format <p>A format string for the crosshair label. Defaults to <code>{value}</code> for. numeric axes and <code>{value:%b %d, %Y}</code> for datetime axes.</p>
    * @param formatter <p>Formatter function for the label text.</p>
    * @param padding <p>Padding inside the crosshair label.</p>
    * @param shape <p>The shape to use for the label box.</p>
    * @param style <p>Text styles for the crosshair label.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, format: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Any] = js.undefined, padding: js.UndefOr[Double] = js.undefined, shape: js.UndefOr[String] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): NavigatorYAxisCrosshairLabel = {
    val alignOuter: js.UndefOr[String] = align
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderRadiusOuter: js.UndefOr[Double] = borderRadius
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val formatOuter: js.UndefOr[String] = format
    val formatterOuter: js.Any = formatter
    val paddingOuter: js.UndefOr[Double] = padding
    val shapeOuter: js.UndefOr[String] = shape
    val styleOuter: js.UndefOr[js.Object] = style
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorYAxisCrosshairLabel {
      override val align: js.UndefOr[String] = alignOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderRadius: js.UndefOr[Double] = borderRadiusOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val format: js.UndefOr[String] = formatOuter
      override val formatter: js.Any = formatterOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val shape: js.UndefOr[String] = shapeOuter
      override val style: js.UndefOr[js.Object] = styleOuter
    })
  }
}
