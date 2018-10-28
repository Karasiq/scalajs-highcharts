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
  * @note JavaScript name: <code>xAxis-title</code>
  */
@js.annotation.ScalaJSDefined
class XAxisTitle extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Alignment of the title relative to the axis values. Possible
    * values are &quot;low&quot;, &quot;middle&quot; or &quot;high&quot;.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-align-low/">"low"</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-align-center/">"middle" by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-align-high/">"high"</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/">Place the Y axis title on top of the axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/title-align/">Aligned to "high" value</a>
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>CSS styles for the title. If the title text is longer than the
    * axis length, it will wrap to multiple lines by default. This can
    * be customized by setting <code>textOverflow: &#39;ellipsis&#39;</code>, by
    * setting a specific <code>width</code> or by setting <code>whiteSpace: &#39;nowrap&#39;</code>.</p>
    * <p>In styled mode, the stroke width is given in the
    * <code>.highcharts-axis-title</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-style/">Red</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/">Styled mode</a>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Deprecated. Set the <code>text</code> to <code>null</code> to disable the title.</p>
    */
  val enabled: js.UndefOr[String] = js.undefined

  /**
    * <p>The pixel distance between the axis labels or line and the title.
    * Defaults to 0 for horizontal axes, 10 for vertical</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-margin/">Y axis title margin of 60</a>
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * <p>The distance of the axis title from the axis line. By default,
    * this distance is computed from the offset width of the labels,
    * the labels&#39; distance from the axis and the title&#39;s margin.
    * However when the offset option is set, it overrides all this.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/">Place the axis title on top of the axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/">Place the axis title on top of the Y axis</a>
    * @since 2.2.0
    */
  val offset: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to reserve space for the title when laying out the axis.</p>
    * @since 5.0.11
    */
  val reserveSpace: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The rotation of the text in degrees. 0 is horizontal, 270 is
    * vertical reading from bottom to top.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/">Horizontal</a>
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * <p>The actual text of the axis title. It can contain basic HTML text
    * markup like <b>, <i> and spans with style.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-text/">Custom HTML</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/title-text/">Titles for both axes</a>
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * <p>Alignment of the text, can be <code>&quot;left&quot;</code>, <code>&quot;right&quot;</code> or <code>&quot;center&quot;</code>.
    * Default alignment depends on the
    * <a href="xAxis.title.align">title.align</a>:</p>
    * <p>Horizontal axes:</p>
    * <ul>
    * <li>for <code>align</code> = <code>&quot;low&quot;</code>, <code>textAlign</code> is set to <code>left</code></li>
    * <li>for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code></li>
    * <li>for <code>align</code> = <code>&quot;high&quot;</code>, <code>textAlign</code> is set to <code>right</code></li>
    * </ul>
    * <p>Vertical axes:</p>
    * <ul>
    * <li>for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>true</code>, <code>textAlign</code> is
    * set to <code>right</code></li>
    * <li>for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>false</code>, <code>textAlign</code> is
    * set to <code>left</code></li>
    * <li>for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code></li>
    * <li>for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>true</code> <code>textAlign</code> is
    * set to <code>left</code></li>
    * <li>for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>false</code> <code>textAlign</code> is
    * set to <code>right</code></li>
    * </ul>
    */
  val textAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to [use HTML](<a href="https://www.highcharts.com/docs/">https://www.highcharts.com/docs/</a>
    * chart-concepts/labels-and-string-formatting#html) to render the
    * axis title.</p>
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Horizontal pixel offset of the title position.</p>
    * @since 4.1.6
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>Vertical pixel offset of the title position.</p>
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * <p>Defines how the title is repositioned according to the 3D chart
    * orientation.</p>
    * <ul>
    * <li><code>&#39;offset&#39;</code>: Maintain a fixed horizontal/vertical distance from the
    * tick marks, despite the chart orientation. This is the backwards
    * compatible behavior, and causes skewing of X and Z axes.</li>
    * <li><code>&#39;chart&#39;</code>: Preserve 3D position relative to the chart.
    * This looks nice, but hard to read if the text isn&#39;t
    * forward-facing.</li>
    * <li><code>&#39;flap&#39;</code>: Rotated text along the axis to compensate for the chart
    * orientation. This tries to maintain text as legible as possible on
    * all orientations.</li>
    * <li><code>&#39;ortho&#39;</code>: Rotated text along the axis direction so that the labels
    * are orthogonal to the axis. This is very similar to <code>&#39;flap&#39;</code>, but
    * prevents skewing the labels (X and Y scaling are still present).</li>
    * <li><code>null</code>: Will use the config from <code>labels.position3d</code></li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/skewed-labels/">Skewed labels</a>
    * @since 5.0.15
    */
  val position3d: js.UndefOr[String] = js.undefined

  /**
    * <p>If enabled, the axis title will skewed to follow the perspective.</p>
    * <p>This will fix overlapping labels and titles, but texts become less
    * legible due to the distortion.</p>
    * <p>The final appearance depends heavily on <code>title.position3d</code>.</p>
    * <p>A <code>null</code> value will use the config from <code>labels.skew3d</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/skewed-labels/">Skewed labels</a>
    * @since 5.0.15
    */
  val skew3d: js.UndefOr[Boolean] = js.undefined
}

object XAxisTitle {
  /**
    * @param align <p>Alignment of the title relative to the axis values. Possible. values are &quot;low&quot;, &quot;middle&quot; or &quot;high&quot;.</p>
    * @param style <p>CSS styles for the title. If the title text is longer than the. axis length, it will wrap to multiple lines by default. This can. be customized by setting <code>textOverflow: &#39;ellipsis&#39;</code>, by. setting a specific <code>width</code> or by setting <code>whiteSpace: &#39;nowrap&#39;</code>.</p>. <p>In styled mode, the stroke width is given in the. <code>.highcharts-axis-title</code> class.</p>
    * @param enabled <p>Deprecated. Set the <code>text</code> to <code>null</code> to disable the title.</p>
    * @param margin <p>The pixel distance between the axis labels or line and the title.. Defaults to 0 for horizontal axes, 10 for vertical</p>
    * @param offset <p>The distance of the axis title from the axis line. By default,. this distance is computed from the offset width of the labels,. the labels&#39; distance from the axis and the title&#39;s margin.. However when the offset option is set, it overrides all this.</p>
    * @param reserveSpace <p>Whether to reserve space for the title when laying out the axis.</p>
    * @param rotation <p>The rotation of the text in degrees. 0 is horizontal, 270 is. vertical reading from bottom to top.</p>
    * @param text <p>The actual text of the axis title. It can contain basic HTML text. markup like <b>, <i> and spans with style.</p>
    * @param textAlign <p>Alignment of the text, can be <code>&quot;left&quot;</code>, <code>&quot;right&quot;</code> or <code>&quot;center&quot;</code>.. Default alignment depends on the. <a href="xAxis.title.align">title.align</a>:</p>. <p>Horizontal axes:</p>. <ul>. <li>for <code>align</code> = <code>&quot;low&quot;</code>, <code>textAlign</code> is set to <code>left</code></li>. <li>for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code></li>. <li>for <code>align</code> = <code>&quot;high&quot;</code>, <code>textAlign</code> is set to <code>right</code></li>. </ul>. <p>Vertical axes:</p>. <ul>. <li>for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>true</code>, <code>textAlign</code> is. set to <code>right</code></li>. <li>for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>false</code>, <code>textAlign</code> is. set to <code>left</code></li>. <li>for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code></li>. <li>for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>true</code> <code>textAlign</code> is. set to <code>left</code></li>. <li>for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>false</code> <code>textAlign</code> is. set to <code>right</code></li>. </ul>
    * @param useHTML <p>Whether to [use HTML](<a href="https://www.highcharts.com/docs/">https://www.highcharts.com/docs/</a>. chart-concepts/labels-and-string-formatting#html) to render the. axis title.</p>
    * @param x <p>Horizontal pixel offset of the title position.</p>
    * @param y <p>Vertical pixel offset of the title position.</p>
    * @param position3d <p>Defines how the title is repositioned according to the 3D chart. orientation.</p>. <ul>. <li><code>&#39;offset&#39;</code>: Maintain a fixed horizontal/vertical distance from the. tick marks, despite the chart orientation. This is the backwards. compatible behavior, and causes skewing of X and Z axes.</li>. <li><code>&#39;chart&#39;</code>: Preserve 3D position relative to the chart.. This looks nice, but hard to read if the text isn&#39;t. forward-facing.</li>. <li><code>&#39;flap&#39;</code>: Rotated text along the axis to compensate for the chart. orientation. This tries to maintain text as legible as possible on. all orientations.</li>. <li><code>&#39;ortho&#39;</code>: Rotated text along the axis direction so that the labels. are orthogonal to the axis. This is very similar to <code>&#39;flap&#39;</code>, but. prevents skewing the labels (X and Y scaling are still present).</li>. <li><code>null</code>: Will use the config from <code>labels.position3d</code></li>. </ul>
    * @param skew3d <p>If enabled, the axis title will skewed to follow the perspective.</p>. <p>This will fix overlapping labels and titles, but texts become less. legible due to the distortion.</p>. <p>The final appearance depends heavily on <code>title.position3d</code>.</p>. <p>A <code>null</code> value will use the config from <code>labels.skew3d</code>.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, enabled: js.UndefOr[String] = js.undefined, margin: js.UndefOr[Double] = js.undefined, offset: js.UndefOr[Double] = js.undefined, reserveSpace: js.UndefOr[Boolean] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, text: js.UndefOr[String] = js.undefined, textAlign: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, position3d: js.UndefOr[String] = js.undefined, skew3d: js.UndefOr[Boolean] = js.undefined): XAxisTitle = {
    val alignOuter: js.UndefOr[String] = align
    val styleOuter: js.UndefOr[js.Object] = style
    val enabledOuter: js.UndefOr[String] = enabled
    val marginOuter: js.UndefOr[Double] = margin
    val offsetOuter: js.UndefOr[Double] = offset
    val reserveSpaceOuter: js.UndefOr[Boolean] = reserveSpace
    val rotationOuter: js.UndefOr[Double] = rotation
    val textOuter: js.UndefOr[String] = text
    val textAlignOuter: js.UndefOr[String] = textAlign
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val position3dOuter: js.UndefOr[String] = position3d
    val skew3dOuter: js.UndefOr[Boolean] = skew3d
    com.highcharts.HighchartsGenericObject.toCleanObject(new XAxisTitle {
      override val align: js.UndefOr[String] = alignOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val enabled: js.UndefOr[String] = enabledOuter
      override val margin: js.UndefOr[Double] = marginOuter
      override val offset: js.UndefOr[Double] = offsetOuter
      override val reserveSpace: js.UndefOr[Boolean] = reserveSpaceOuter
      override val rotation: js.UndefOr[Double] = rotationOuter
      override val text: js.UndefOr[String] = textOuter
      override val textAlign: js.UndefOr[String] = textAlignOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val position3d: js.UndefOr[String] = position3dOuter
      override val skew3d: js.UndefOr[Boolean] = skew3dOuter
    })
  }
}
