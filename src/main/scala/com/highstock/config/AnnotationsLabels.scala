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
  * @note JavaScript name: <code>annotations-labels</code>
  */
@js.annotation.ScalaJSDefined
class AnnotationsLabels extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>This option defines the point to which the label will be connected.
    * It can be either the point which exists in the series - it is
    * referenced by the point&#39;s id - or a new point with defined x, y
    * properies and optionally axes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/mock-point/">Attach annotation to a mock point</a>
    * @since 6.0.0
    */
  val point: js.UndefOr[String | CleanJsObject[AnnotationsLabelsPoint]] = js.undefined

  /**
    * <p>The alignment of the annotation&#39;s label. If right,
    * the right side of the label should be touching the point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position</a>
    * @since 6.0.0
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to allow the annotation&#39;s labels to overlap.
    * To make the labels less sensitive for overlapping,
    * the can be set to 0.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/tooltip-like/">Hide overlapping labels</a>
    * @since 6.0.0
    */
  val allowOverlap: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The background color or gradient for the annotation&#39;s label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>
    * @since 6.0.0
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border color for the annotation&#39;s label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>
    * @since 6.0.0
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border radius in pixels for the annotaiton&#39;s label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>
    * @since 6.0.0
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border width in pixels for the annotation&#39;s label</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>
    * @since 6.0.0
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>A class name for styling by CSS.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/annotations">Styled mode annotations</a>
    * @since 6.0.5
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to hide the annotation&#39;s label that is outside the plot
    * area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-crop-overflow/">Crop or justify labels</a>
    * @since 6.0.0
    */
  val crop: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Callback JavaScript function to format the annotation&#39;s label.
    * Note that if a <code>format</code> or <code>text</code> are defined, the format or text
    * take precedence and the formatter is ignored. <code>This</code> refers to a
    * point object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/">Set labels text</a>
    * @since 6.0.0
    */
  val formatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>How to handle the annotation&#39;s label that flow outside the plot
    * area. The justify option aligns the label inside the plot area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-crop-overflow/">Crop or justify labels
*</a>
    * @since 6.0.0
    */
  val overflow: js.UndefOr[String] = js.undefined

  /**
    * <p>When either the borderWidth or the backgroundColor is set,
    * this    is the padding within the box.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>
    * @since 6.0.0
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The shadow of the box. The shadow can be an object configuration
    * containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>
    * @since 6.0.0
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>The name of a symbol to use for the border around the label.
    * Symbols are predefined functions on the Renderer object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shapes/">Available shapes for labels</a>
    * @since 6.0.0
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * <p>Styles for the annotation&#39;s label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>
    * @since 6.0.0
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Whether to <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>
    * to render the annotation&#39;s label.</p>
    * @since 6.0.0
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The vertical alignment of the annotation&#39;s label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position</a>
    * @since 6.0.0
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The x position offset of the label relative to the point.
    * Note that if a <code>distance</code> is defined, the distance takes
    * precedence over <code>x</code> and <code>y</code> options.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position</a>
    * @since 6.0.0
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position offset of the label relative to the point.
    * Note that if a <code>distance</code> is defined, the distance takes
    * precedence over <code>x</code> and <code>y</code> options.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position</a>
    * @since 6.0.0
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * <p>The label&#39;s pixel distance from the point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position</a>
    * @since 6.0.0
    */
  val distance: js.UndefOr[Double] = js.undefined

  /**
    * <p>A <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format</a> string for the data label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/">Set labels text</a>
    * @since 6.0.0
    */
  val format: js.UndefOr[String] = js.undefined

  /**
    * <p>Alias for the format option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/">Set labels text</a>
    * @since 6.0.0
    */
  val text: js.UndefOr[String] = js.undefined
}

object AnnotationsLabels {
  /**
    * @param point <p>This option defines the point to which the label will be connected.. It can be either the point which exists in the series - it is. referenced by the point&#39;s id - or a new point with defined x, y. properies and optionally axes.</p>
    * @param align <p>The alignment of the annotation&#39;s label. If right,. the right side of the label should be touching the point.</p>
    * @param allowOverlap <p>Whether to allow the annotation&#39;s labels to overlap.. To make the labels less sensitive for overlapping,. the can be set to 0.</p>
    * @param backgroundColor <p>The background color or gradient for the annotation&#39;s label.</p>
    * @param borderColor <p>The border color for the annotation&#39;s label.</p>
    * @param borderRadius <p>The border radius in pixels for the annotaiton&#39;s label.</p>
    * @param borderWidth <p>The border width in pixels for the annotation&#39;s label</p>
    * @param className <p>A class name for styling by CSS.</p>
    * @param crop <p>Whether to hide the annotation&#39;s label that is outside the plot. area.</p>
    * @param formatter <p>Callback JavaScript function to format the annotation&#39;s label.. Note that if a <code>format</code> or <code>text</code> are defined, the format or text. take precedence and the formatter is ignored. <code>This</code> refers to a. point object.</p>
    * @param overflow <p>How to handle the annotation&#39;s label that flow outside the plot. area. The justify option aligns the label inside the plot area.</p>
    * @param padding <p>When either the borderWidth or the backgroundColor is set,. this    is the padding within the box.</p>
    * @param shadow <p>The shadow of the box. The shadow can be an object configuration. containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.</p>
    * @param shape <p>The name of a symbol to use for the border around the label.. Symbols are predefined functions on the Renderer object.</p>
    * @param style <p>Styles for the annotation&#39;s label.</p>
    * @param useHTML <p>Whether to <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>. to render the annotation&#39;s label.</p>
    * @param verticalAlign <p>The vertical alignment of the annotation&#39;s label.</p>
    * @param x <p>The x position offset of the label relative to the point.. Note that if a <code>distance</code> is defined, the distance takes. precedence over <code>x</code> and <code>y</code> options.</p>
    * @param y <p>The y position offset of the label relative to the point.. Note that if a <code>distance</code> is defined, the distance takes. precedence over <code>x</code> and <code>y</code> options.</p>
    * @param distance <p>The label&#39;s pixel distance from the point.</p>
    * @param format <p>A <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format</a> string for the data label.</p>
    * @param text <p>Alias for the format option.</p>
    */
  def apply(point: js.UndefOr[String | CleanJsObject[AnnotationsLabelsPoint]] = js.undefined, align: js.UndefOr[String] = js.undefined, allowOverlap: js.UndefOr[Boolean] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, crop: js.UndefOr[Boolean] = js.undefined, formatter: js.UndefOr[js.Function] = js.undefined, overflow: js.UndefOr[String] = js.undefined, padding: js.UndefOr[Double] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, shape: js.UndefOr[String] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, distance: js.UndefOr[Double] = js.undefined, format: js.UndefOr[String] = js.undefined, text: js.UndefOr[String] = js.undefined): AnnotationsLabels = {
    val pointOuter: js.UndefOr[String | CleanJsObject[AnnotationsLabelsPoint]] = point
    val alignOuter: js.UndefOr[String] = align
    val allowOverlapOuter: js.UndefOr[Boolean] = allowOverlap
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderRadiusOuter: js.UndefOr[Double] = borderRadius
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val classNameOuter: js.UndefOr[String] = className
    val cropOuter: js.UndefOr[Boolean] = crop
    val formatterOuter: js.UndefOr[js.Function] = formatter
    val overflowOuter: js.UndefOr[String] = overflow
    val paddingOuter: js.UndefOr[Double] = padding
    val shadowOuter: js.UndefOr[Boolean | js.Object] = shadow
    val shapeOuter: js.UndefOr[String] = shape
    val styleOuter: js.UndefOr[js.Object] = style
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val distanceOuter: js.UndefOr[Double] = distance
    val formatOuter: js.UndefOr[String] = format
    val textOuter: js.UndefOr[String] = text
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsLabels {
      override val point: js.UndefOr[String | CleanJsObject[AnnotationsLabelsPoint]] = pointOuter
      override val align: js.UndefOr[String] = alignOuter
      override val allowOverlap: js.UndefOr[Boolean] = allowOverlapOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderRadius: js.UndefOr[Double] = borderRadiusOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val crop: js.UndefOr[Boolean] = cropOuter
      override val formatter: js.UndefOr[js.Function] = formatterOuter
      override val overflow: js.UndefOr[String] = overflowOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val shadow: js.UndefOr[Boolean | js.Object] = shadowOuter
      override val shape: js.UndefOr[String] = shapeOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val distance: js.UndefOr[Double] = distanceOuter
      override val format: js.UndefOr[String] = formatOuter
      override val text: js.UndefOr[String] = textOuter
    })
  }
}
