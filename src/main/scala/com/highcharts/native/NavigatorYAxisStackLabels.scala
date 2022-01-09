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
  * @note JavaScript name: <code>navigator-yAxis-stackLabels</code>
  */
class NavigatorYAxisStackLabels extends com.highcharts.HighchartsGenericObject {

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
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>Allow the stack labels to overlap.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-allowoverlap-false/">Default false</a>
    * @since 5.0.13
    */
  var allowOverlap: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enable or disable the initial animation when a series is
    * displayed for the <code>stackLabels</code>. The animation can also be set as
    * a configuration object. Please note that this option only
    * applies to the initial animation.
    * For other animations, see <a href="#chart.animation">chart.animation</a>
    * and the animation parameter under the API methods.
    * The following properties are supported:</p>
    * <ul>
    * <li><code>defer</code>: The animation delay time in milliseconds.</li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/animation-defer/">Animation defer settings</a>
    * @since 8.2.0
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>The background color or gradient for the stack label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-box/">Stack labels box options</a>
    * @since 8.1.0
    */
  var backgroundColor: js.Any = js.undefined

  /**
    * <p>The border color for the stack label. Defaults to <code>undefined</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-box/">Stack labels box options</a>
    * @since 8.1.0
    */
  var borderColor: js.Any = js.undefined

  /**
    * <p>The border radius in pixels for the stack label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-box/">Stack labels box options</a>
    * @since 8.1.0
    */
  var borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border width in pixels for the stack label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-box/">Stack labels box options</a>
    * @since 8.1.0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to hide stack labels that are outside the plot area.
    * By default, the stack label is moved
    * inside the plot area according to the
    * <a href="/highcharts/#yAxis/stackLabels/overflow">overflow</a>
    * option.</p>
    * @since 7.1.3
    */
  var crop: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enable or disable the stack total labels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-enabled/">Enabled stack total labels</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-enabled-waterfall/">Enabled stack labels in waterfall chart</a>
    * @since 2.1.5
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A format string for the data label. Available variables are the same
    * as for <code>formatter</code>.</p>
    * @since 3.0.2
    */
  var format: js.UndefOr[String] = js.undefined

  /**
    * <p>Callback JavaScript function to format the label. The value is
    * given by <code>this.total</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-formatter/">Added units to stack total value</a>
    * @since 2.1.5
    */
  var formatter: js.Any = js.undefined

  /**
    * <p>How to handle stack total labels that flow outside the plot area.
    * The default is set to <code>&quot;justify&quot;</code>,
    * which aligns them inside the plot area.
    * For columns and bars, this means it will be moved inside the bar.
    * To display stack labels outside the plot area,
    * set <code>crop</code> to <code>false</code> and <code>overflow</code> to <code>&quot;allow&quot;</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-overflow/">Stack labels flows outside the plot area.</a>
    * @since 7.1.3
    */
  var overflow: js.Any = js.undefined

  /**
    * <p>Rotation of the labels in degrees.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-rotation/">Labels rotated 45°</a>
    * @since 2.1.5
    */
  var rotation: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS styles for the label.</p>
    * <p>In styled mode, the styles are set in the
    * <code>.highcharts-stack-label</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-style/">Red stack total labels</a>
    * @since 2.1.5
    */
  var style: js.UndefOr[js.Object] = js.undefined

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
  var textAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>
    * to render the labels.</p>
    * @since 3.0.0
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined

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
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The x position offset of the label relative to the left of the
    * stacked bar. The default value is calculated at runtime and depends
    * on orientation and whether the stack is positive or negative.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-x/">Stack total labels with x offset</a>
    * @since 2.1.5
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position offset of the label relative to the tick position
    * on the axis. The default value is calculated at runtime and depends
    * on orientation and whether the stack is positive or negative.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-y/">Stack total labels with y offset</a>
    * @since 2.1.5
    */
  var y: js.UndefOr[Double] = js.undefined
}

object NavigatorYAxisStackLabels {
  /**
    * @param align <p>Defines the horizontal alignment of the stack total label. Can be one. of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. The default value is calculated. at runtime and depends on orientation and whether the stack is. positive or negative.</p>
    * @param allowOverlap <p>Allow the stack labels to overlap.</p>
    * @param animation <p>Enable or disable the initial animation when a series is. displayed for the <code>stackLabels</code>. The animation can also be set as. a configuration object. Please note that this option only. applies to the initial animation.. For other animations, see <a href="#chart.animation">chart.animation</a>. and the animation parameter under the API methods.. The following properties are supported:</p>. <ul>. <li><code>defer</code>: The animation delay time in milliseconds.</li>. </ul>
    * @param backgroundColor <p>The background color or gradient for the stack label.</p>
    * @param borderColor <p>The border color for the stack label. Defaults to <code>undefined</code>.</p>
    * @param borderRadius <p>The border radius in pixels for the stack label.</p>
    * @param borderWidth <p>The border width in pixels for the stack label.</p>
    * @param crop <p>Whether to hide stack labels that are outside the plot area.. By default, the stack label is moved. inside the plot area according to the. <a href="/highcharts/#yAxis/stackLabels/overflow">overflow</a>. option.</p>
    * @param enabled <p>Enable or disable the stack total labels.</p>
    * @param format <p>A format string for the data label. Available variables are the same. as for <code>formatter</code>.</p>
    * @param formatter <p>Callback JavaScript function to format the label. The value is. given by <code>this.total</code>.</p>
    * @param overflow <p>How to handle stack total labels that flow outside the plot area.. The default is set to <code>&quot;justify&quot;</code>,. which aligns them inside the plot area.. For columns and bars, this means it will be moved inside the bar.. To display stack labels outside the plot area,. set <code>crop</code> to <code>false</code> and <code>overflow</code> to <code>&quot;allow&quot;</code>.</p>
    * @param rotation <p>Rotation of the labels in degrees.</p>
    * @param style <p>CSS styles for the label.</p>. <p>In styled mode, the styles are set in the. <code>.highcharts-stack-label</code> class.</p>
    * @param textAlign <p>The text alignment for the label. While <code>align</code> determines where the. texts anchor point is placed with regards to the stack, <code>textAlign</code>. determines how the text is aligned against its anchor point. Possible. values are <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> and <code>&quot;right&quot;</code>. The default value is. calculated at runtime and depends on orientation and whether the. stack is positive or negative.</p>
    * @param useHTML <p>Whether to <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>. to render the labels.</p>
    * @param verticalAlign <p>Defines the vertical alignment of the stack total label. Can be one. of <code>&quot;top&quot;</code>, <code>&quot;middle&quot;</code> or <code>&quot;bottom&quot;</code>. The default value is calculated. at runtime and depends on orientation and whether the stack is. positive or negative.</p>
    * @param x <p>The x position offset of the label relative to the left of the. stacked bar. The default value is calculated at runtime and depends. on orientation and whether the stack is positive or negative.</p>
    * @param y <p>The y position offset of the label relative to the tick position. on the axis. The default value is calculated at runtime and depends. on orientation and whether the stack is positive or negative.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, allowOverlap: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, backgroundColor: js.UndefOr[js.Any] = js.undefined, borderColor: js.UndefOr[js.Any] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, crop: js.UndefOr[Boolean] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, format: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Any] = js.undefined, overflow: js.UndefOr[js.Any] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, textAlign: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): NavigatorYAxisStackLabels = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorYAxisStackLabels {
      this.align = align
      this.allowOverlap = allowOverlap
      this.animation = animation
      this.backgroundColor = backgroundColor
      this.borderColor = borderColor
      this.borderRadius = borderRadius
      this.borderWidth = borderWidth
      this.crop = crop
      this.enabled = enabled
      this.format = format
      this.formatter = formatter
      this.overflow = overflow
      this.rotation = rotation
      this.style = style
      this.textAlign = textAlign
      this.useHTML = useHTML
      this.verticalAlign = verticalAlign
      this.x = x
      this.y = y
    })
  }
}
