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
  * @note JavaScript name: <code>navigator-yAxis-stackLabels</code>
  */
@js.annotation.ScalaJSDefined
class NavigatorYAxisStackLabels extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Allow the stack labels to overlap.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-allowoverlap-false/">Default false</a>
    * @since 5.0.13
    */
  val allowOverlap: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enable or disable the stack total labels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-enabled/">Enabled stack total labels</a>
    * @since 2.1.5
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Callback JavaScript function to format the label. The value is
    * given by <code>this.total</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-formatter/">Added units to stack total value</a>
    * @since 2.1.5
    */
  val formatter: js.Any = js.undefined

  /**
    * <p>CSS styles for the label.</p>
    * <p>In styled mode, the styles are set in the
    * <code>.highcharts-stack-label</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-style/">Red stack total labels</a>
    * @since 2.1.5
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Defines the horizontal alignment of the stack total label. Can be one
    * of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. The default value is calculated
    * at runtime and depends on orientation and whether the stack is
    * positive or negative.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-align-left/">Aligned to the left</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-align-center/">Aligned in center</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-align-right/">Aligned to the right</a>
    * @since 2.1.5
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>A <a href="http://docs.highcharts.com/#formatting">format string</a> for the
    * data label. Available variables are the same as for <code>formatter</code>.</p>
    * @since 3.0.2
    */
  val format: js.UndefOr[String] = js.undefined

  /**
    * <p>Rotation of the labels in degrees.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-rotation/">Labels rotated 45°</a>
    * @since 2.1.5
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * <p>The text alignment for the label. While <code>align</code> determines where the
    * texts anchor point is placed with regards to the stack, <code>textAlign</code>
    * determines how the text is aligned against its anchor point. Possible
    * values are <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> and <code>&quot;right&quot;</code>. The default value is
    * calculated at runtime and depends on orientation and whether the
    * stack is positive or negative.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-textalign-left/">Label in center position but text-aligned left</a>
    * @since 2.1.5
    */
  val textAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to [use HTML](<a href="https://www.highcharts.com/docs/chart-concepts/">https://www.highcharts.com/docs/chart-concepts/</a>
    * labels-and-string-formatting#html) to render the labels.</p>
    * @since 3.0
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Defines the vertical alignment of the stack total label. Can be one
    * of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> or <code>&quot;bottom&quot;</code>. The default value is calculated
    * at runtime and depends on orientation and whether the stack is
    * positive or negative.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-verticalalign-top/">Vertically aligned top</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-verticalalign-middle/">Vertically aligned middle</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-verticalalign-bottom/">Vertically aligned bottom</a>
    * @since 2.1.5
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The x position offset of the label relative to the left of the
    * stacked bar. The default value is calculated at runtime and depends
    * on orientation and whether the stack is positive or negative.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-x/">Stack total labels with x offset</a>
    * @since 2.1.5
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position offset of the label relative to the tick position
    * on the axis. The default value is calculated at runtime and depends
    * on orientation and whether the stack is positive or negative.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-y/">Stack total labels with y offset</a>
    * @since 2.1.5
    */
  val y: js.UndefOr[Double] = js.undefined
}

object NavigatorYAxisStackLabels {
  /**
    * @param allowOverlap <p>Allow the stack labels to overlap.</p>
    * @param enabled <p>Enable or disable the stack total labels.</p>
    * @param formatter <p>Callback JavaScript function to format the label. The value is. given by <code>this.total</code>.</p>
    * @param style <p>CSS styles for the label.</p>. <p>In styled mode, the styles are set in the. <code>.highcharts-stack-label</code> class.</p>
    * @param align <p>Defines the horizontal alignment of the stack total label. Can be one. of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. The default value is calculated. at runtime and depends on orientation and whether the stack is. positive or negative.</p>
    * @param format <p>A <a href="http://docs.highcharts.com/#formatting">format string</a> for the. data label. Available variables are the same as for <code>formatter</code>.</p>
    * @param rotation <p>Rotation of the labels in degrees.</p>
    * @param textAlign <p>The text alignment for the label. While <code>align</code> determines where the. texts anchor point is placed with regards to the stack, <code>textAlign</code>. determines how the text is aligned against its anchor point. Possible. values are <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> and <code>&quot;right&quot;</code>. The default value is. calculated at runtime and depends on orientation and whether the. stack is positive or negative.</p>
    * @param useHTML <p>Whether to [use HTML](<a href="https://www.highcharts.com/docs/chart-concepts/">https://www.highcharts.com/docs/chart-concepts/</a>. labels-and-string-formatting#html) to render the labels.</p>
    * @param verticalAlign <p>Defines the vertical alignment of the stack total label. Can be one. of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> or <code>&quot;bottom&quot;</code>. The default value is calculated. at runtime and depends on orientation and whether the stack is. positive or negative.</p>
    * @param x <p>The x position offset of the label relative to the left of the. stacked bar. The default value is calculated at runtime and depends. on orientation and whether the stack is positive or negative.</p>
    * @param y <p>The y position offset of the label relative to the tick position. on the axis. The default value is calculated at runtime and depends. on orientation and whether the stack is positive or negative.</p>
    */
  def apply(allowOverlap: js.UndefOr[Boolean] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, formatter: js.UndefOr[js.Any] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, align: js.UndefOr[String] = js.undefined, format: js.UndefOr[String] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, textAlign: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): NavigatorYAxisStackLabels = {
    val allowOverlapOuter: js.UndefOr[Boolean] = allowOverlap
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val formatterOuter: js.Any = formatter
    val styleOuter: js.UndefOr[js.Object] = style
    val alignOuter: js.UndefOr[String] = align
    val formatOuter: js.UndefOr[String] = format
    val rotationOuter: js.UndefOr[Double] = rotation
    val textAlignOuter: js.UndefOr[String] = textAlign
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorYAxisStackLabels {
      override val allowOverlap: js.UndefOr[Boolean] = allowOverlapOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val formatter: js.Any = formatterOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val align: js.UndefOr[String] = alignOuter
      override val format: js.UndefOr[String] = formatOuter
      override val rotation: js.UndefOr[Double] = rotationOuter
      override val textAlign: js.UndefOr[String] = textAlignOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    })
  }
}
