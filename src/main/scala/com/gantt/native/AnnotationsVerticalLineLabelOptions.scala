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
  * @note JavaScript name: <code>annotations-verticalLine-labelOptions</code>
  */
class AnnotationsVerticalLineLabelOptions extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Accessibility options for an annotation label.</p>
    * @since 8.0.1
    */
  var accessibility: js.Any = js.undefined

  /**
    * <p>The alignment of the annotation&#39;s label. If right,
    * the right side of the label should be touching the point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position</a>
    * @since 6.0.0
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to allow the annotation&#39;s labels to overlap.
    * To make the labels less sensitive for overlapping,
    * the can be set to 0.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/tooltip-like/">Hide overlapping labels</a>
    * @since 6.0.0
    */
  var allowOverlap: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The background color or gradient for the annotation&#39;s
    * label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>
    * @since 6.0.0
    */
  var backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border color for the annotation&#39;s label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>
    * @since 6.0.0
    */
  var borderColor: js.UndefOr[String] = js.undefined

  /**
    * <p>The border radius in pixels for the annotaiton&#39;s label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>
    * @since 6.0.0
    */
  var borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border width in pixels for the annotation&#39;s label</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>
    * @since 6.0.0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>A class name for styling by CSS.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/annotations">Styled mode annotations</a>
    * @since 6.0.5
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to hide the annotation&#39;s label
    * that is outside the plot area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-crop-overflow/">Crop or justify labels</a>
    * @since 6.0.0
    */
  var crop: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The label&#39;s pixel distance from the point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position</a>
    * @since 6.0.0
    */
  var distance: js.UndefOr[Double] = js.undefined

  /**
    * <p>A
    * <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format</a>
    * string for the data label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/">Set labels text</a>
    * @since 6.0.0
    */
  var format: js.UndefOr[String] = js.undefined

  /**
    * <p>Callback JavaScript function to format the annotation&#39;s
    * label. Note that if a <code>format</code> or <code>text</code> are defined,
    * the format or text take precedence and the formatter is
    * ignored. <code>This</code> refers to a point object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/">Set labels text</a>
    * @since 6.0.0
    */
  var formatter: js.Any = js.undefined

  /**
    * <p>Whether the annotation is visible in the exported data
    * table.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/include-in-data-export/">Do not include in the data export</a>
    * @since 8.2.0
    */
  var includeInDataExport: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>How to handle the annotation&#39;s label that flow outside
    * the plot area. The justify option aligns the label inside
    * the plot area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-crop-overflow/">Crop or justify labels</a>
    * @since 6.0.0
    */
  var overflow: js.UndefOr[String] = js.undefined

  /**
    * <p>When either the borderWidth or the backgroundColor is
    * set, this is the padding within the box.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>
    * @since 6.0.0
    */
  var padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The shadow of the box. The shadow can be an object
    * configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
    * <code>opacity</code> and <code>width</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>
    * @since 6.0.0
    */
  var shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>The name of a symbol to use for the border around the
    * label. Symbols are predefined functions on the Renderer
    * object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shapes/">Available shapes for labels</a>
    * @since 6.0.0
    */
  var shape: js.UndefOr[String] = js.undefined

  /**
    * <p>Styles for the annotation&#39;s label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>
    * @since 6.0.0
    */
  var style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Alias for the format option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/">Set labels text</a>
    * @since 6.0.0
    */
  var text: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>
    * to render the annotation&#39;s label.</p>
    * @since 6.0.0
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The vertical alignment of the annotation&#39;s label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position</a>
    * @since 6.0.0
    */
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The x position offset of the label relative to the point.
    * Note that if a <code>distance</code> is defined, the distance takes
    * precedence over <code>x</code> and <code>y</code> options.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position</a>
    * @since 6.0.0
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position offset of the label relative to the point.
    * Note that if a <code>distance</code> is defined, the distance takes
    * precedence over <code>x</code> and <code>y</code> options.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position</a>
    * @since 6.0.0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object AnnotationsVerticalLineLabelOptions {
  /**
    * @param accessibility <p>Accessibility options for an annotation label.</p>
    * @param align <p>The alignment of the annotation&#39;s label. If right,. the right side of the label should be touching the point.</p>
    * @param allowOverlap <p>Whether to allow the annotation&#39;s labels to overlap.. To make the labels less sensitive for overlapping,. the can be set to 0.</p>
    * @param backgroundColor <p>The background color or gradient for the annotation&#39;s. label.</p>
    * @param borderColor <p>The border color for the annotation&#39;s label.</p>
    * @param borderRadius <p>The border radius in pixels for the annotaiton&#39;s label.</p>
    * @param borderWidth <p>The border width in pixels for the annotation&#39;s label</p>
    * @param className <p>A class name for styling by CSS.</p>
    * @param crop <p>Whether to hide the annotation&#39;s label. that is outside the plot area.</p>
    * @param distance <p>The label&#39;s pixel distance from the point.</p>
    * @param format <p>A. <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format</a>. string for the data label.</p>
    * @param formatter <p>Callback JavaScript function to format the annotation&#39;s. label. Note that if a <code>format</code> or <code>text</code> are defined,. the format or text take precedence and the formatter is. ignored. <code>This</code> refers to a point object.</p>
    * @param includeInDataExport <p>Whether the annotation is visible in the exported data. table.</p>
    * @param overflow <p>How to handle the annotation&#39;s label that flow outside. the plot area. The justify option aligns the label inside. the plot area.</p>
    * @param padding <p>When either the borderWidth or the backgroundColor is. set, this is the padding within the box.</p>
    * @param shadow <p>The shadow of the box. The shadow can be an object. configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,. <code>opacity</code> and <code>width</code>.</p>
    * @param shape <p>The name of a symbol to use for the border around the. label. Symbols are predefined functions on the Renderer. object.</p>
    * @param style <p>Styles for the annotation&#39;s label.</p>
    * @param text <p>Alias for the format option.</p>
    * @param useHTML <p>Whether to <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>. to render the annotation&#39;s label.</p>
    * @param verticalAlign <p>The vertical alignment of the annotation&#39;s label.</p>
    * @param x <p>The x position offset of the label relative to the point.. Note that if a <code>distance</code> is defined, the distance takes. precedence over <code>x</code> and <code>y</code> options.</p>
    * @param y <p>The y position offset of the label relative to the point.. Note that if a <code>distance</code> is defined, the distance takes. precedence over <code>x</code> and <code>y</code> options.</p>
    */
  def apply(accessibility: js.UndefOr[js.Any] = js.undefined, align: js.UndefOr[String] = js.undefined, allowOverlap: js.UndefOr[Boolean] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, crop: js.UndefOr[Boolean] = js.undefined, distance: js.UndefOr[Double] = js.undefined, format: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Any] = js.undefined, includeInDataExport: js.UndefOr[Boolean] = js.undefined, overflow: js.UndefOr[String] = js.undefined, padding: js.UndefOr[Double] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, shape: js.UndefOr[String] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): AnnotationsVerticalLineLabelOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsVerticalLineLabelOptions {
      this.accessibility = accessibility
      this.align = align
      this.allowOverlap = allowOverlap
      this.backgroundColor = backgroundColor
      this.borderColor = borderColor
      this.borderRadius = borderRadius
      this.borderWidth = borderWidth
      this.className = className
      this.crop = crop
      this.distance = distance
      this.format = format
      this.formatter = formatter
      this.includeInDataExport = includeInDataExport
      this.overflow = overflow
      this.padding = padding
      this.shadow = shadow
      this.shape = shape
      this.style = style
      this.text = text
      this.useHTML = useHTML
      this.verticalAlign = verticalAlign
      this.x = x
      this.y = y
    })
  }
}
