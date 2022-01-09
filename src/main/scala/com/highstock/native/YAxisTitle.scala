/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>yAxis-title</code>
  */
class YAxisTitle extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The pixel distance between the axis labels and the title.
    * Positive values are outside the axis line, negative are inside.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-margin/">Y axis title margin of 60</a>
    */
  var margin: js.UndefOr[Double] = js.undefined

  /**
    * <p>The rotation of the text in degrees. 0 is horizontal, 270 is
    * vertical reading from bottom to top.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/">Horizontal</a>
    */
  var rotation: js.UndefOr[Double] = js.undefined

  /**
    * <p>The actual text of the axis title. Horizontal texts can contain
    * HTML, but rotated texts are painted using vector techniques and
    * must be clean text. The Y axis title is disabled by setting the
    * <code>text</code> option to <code>undefined</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-text/">Custom HTML</a>
    */
  var text: js.UndefOr[String | Null] = js.undefined

  /**
    * <p>Alignment of the title relative to the axis values. Possible
    * values are &quot;low&quot;, &quot;middle&quot; or &quot;high&quot;.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-align-low/">"low"</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-align-center/">"middle" by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-align-high/">"high"</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/">Place the Y axis title on top of the axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/title-align/">Aligned to "high" value</a>
    */
  var align: js.Any = js.undefined

  /**
    * <p>Deprecated. Set the <code>text</code> to <code>undefined</code> to disable the title.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The distance of the axis title from the axis line. By default,
    * this distance is computed from the offset width of the labels,
    * the labels&#39; distance from the axis and the title&#39;s margin.
    * However when the offset option is set, it overrides all this.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/">Place the axis title on top of the axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/">Place the axis title on top of the Y axis</a>
    * @since 2.2.0
    */
  var offset: js.UndefOr[Double] = js.undefined

  /**
    * <p>Defines how the title is repositioned according to the 3D chart
    * orientation.</p>
    * <ul>
    * <li><p><code>&#39;offset&#39;</code>: Maintain a fixed horizontal/vertical distance from
    * the tick marks, despite the chart orientation. This is the
    * backwards compatible behavior, and causes skewing of X and Z
    * axes.</p>
    * </li>
    * <li><p><code>&#39;chart&#39;</code>: Preserve 3D position relative to the chart. This
    * looks nice, but hard to read if the text isn&#39;t forward-facing.</p>
    * </li>
    * <li><p><code>&#39;flap&#39;</code>: Rotated text along the axis to compensate for the
    * chart orientation. This tries to maintain text as legible as
    * possible on all orientations.</p>
    * </li>
    * <li><p><code>&#39;ortho&#39;</code>: Rotated text along the axis direction so that the
    * labels are orthogonal to the axis. This is very similar to
    * <code>&#39;flap&#39;</code>, but prevents skewing the labels (X and Y scaling are
    * still present).</p>
    * </li>
    * <li><p><code>undefined</code>: Will use the config from <code>labels.position3d</code></p>
    * </li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/skewed-labels/">Skewed labels</a>
    * @since 5.0.15
    */
  var position3d: js.UndefOr[String | Null] = js.undefined

  /**
    * <p>Whether to reserve space for the title when laying out the axis.</p>
    * @since 5.0.11
    */
  var reserveSpace: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>If enabled, the axis title will skewed to follow the perspective.</p>
    * <p>This will fix overlapping labels and titles, but texts become
    * less legible due to the distortion.</p>
    * <p>The final appearance depends heavily on <code>title.position3d</code>.</p>
    * <p>A <code>null</code> value will use the config from <code>labels.skew3d</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/skewed-labels/">Skewed labels</a>
    * @since 5.0.15
    */
  var skew3d: js.UndefOr[Boolean | Null] = js.undefined

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
  var style: js.UndefOr[js.Object] = js.undefined

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
  var textAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>
    * to render the axis title.</p>
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Horizontal pixel offset of the title position.</p>
    * @since 4.1.6
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>Vertical pixel offset of the title position.</p>
    */
  var y: js.UndefOr[Double] = js.undefined
}

object YAxisTitle {
  /**
    * @param margin <p>The pixel distance between the axis labels and the title.. Positive values are outside the axis line, negative are inside.</p>
    * @param rotation <p>The rotation of the text in degrees. 0 is horizontal, 270 is. vertical reading from bottom to top.</p>
    * @param text <p>The actual text of the axis title. Horizontal texts can contain. HTML, but rotated texts are painted using vector techniques and. must be clean text. The Y axis title is disabled by setting the. <code>text</code> option to <code>undefined</code>.</p>
    * @param align <p>Alignment of the title relative to the axis values. Possible. values are &quot;low&quot;, &quot;middle&quot; or &quot;high&quot;.</p>
    * @param enabled <p>Deprecated. Set the <code>text</code> to <code>undefined</code> to disable the title.</p>
    * @param offset <p>The distance of the axis title from the axis line. By default,. this distance is computed from the offset width of the labels,. the labels&#39; distance from the axis and the title&#39;s margin.. However when the offset option is set, it overrides all this.</p>
    * @param position3d <p>Defines how the title is repositioned according to the 3D chart. orientation.</p>. <ul>. <li><p><code>&#39;offset&#39;</code>: Maintain a fixed horizontal/vertical distance from. the tick marks, despite the chart orientation. This is the. backwards compatible behavior, and causes skewing of X and Z. axes.</p>. </li>. <li><p><code>&#39;chart&#39;</code>: Preserve 3D position relative to the chart. This. looks nice, but hard to read if the text isn&#39;t forward-facing.</p>. </li>. <li><p><code>&#39;flap&#39;</code>: Rotated text along the axis to compensate for the. chart orientation. This tries to maintain text as legible as. possible on all orientations.</p>. </li>. <li><p><code>&#39;ortho&#39;</code>: Rotated text along the axis direction so that the. labels are orthogonal to the axis. This is very similar to. <code>&#39;flap&#39;</code>, but prevents skewing the labels (X and Y scaling are. still present).</p>. </li>. <li><p><code>undefined</code>: Will use the config from <code>labels.position3d</code></p>. </li>. </ul>
    * @param reserveSpace <p>Whether to reserve space for the title when laying out the axis.</p>
    * @param skew3d <p>If enabled, the axis title will skewed to follow the perspective.</p>. <p>This will fix overlapping labels and titles, but texts become. less legible due to the distortion.</p>. <p>The final appearance depends heavily on <code>title.position3d</code>.</p>. <p>A <code>null</code> value will use the config from <code>labels.skew3d</code>.</p>
    * @param style <p>CSS styles for the title. If the title text is longer than the. axis length, it will wrap to multiple lines by default. This can. be customized by setting <code>textOverflow: &#39;ellipsis&#39;</code>, by. setting a specific <code>width</code> or by setting <code>whiteSpace: &#39;nowrap&#39;</code>.</p>. <p>In styled mode, the stroke width is given in the. <code>.highcharts-axis-title</code> class.</p>
    * @param textAlign <p>Alignment of the text, can be <code>&quot;left&quot;</code>, <code>&quot;right&quot;</code> or <code>&quot;center&quot;</code>.. Default alignment depends on the. <a href="xAxis.title.align">title.align</a>:</p>. <p>Horizontal axes:</p>. <ul>. <li>for <code>align</code> = <code>&quot;low&quot;</code>, <code>textAlign</code> is set to <code>left</code></li>. <li>for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code></li>. <li>for <code>align</code> = <code>&quot;high&quot;</code>, <code>textAlign</code> is set to <code>right</code></li>. </ul>. <p>Vertical axes:</p>. <ul>. <li>for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>true</code>, <code>textAlign</code> is. set to <code>right</code></li>. <li>for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>false</code>, <code>textAlign</code> is. set to <code>left</code></li>. <li>for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code></li>. <li>for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>true</code> <code>textAlign</code> is. set to <code>left</code></li>. <li>for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>false</code> <code>textAlign</code> is. set to <code>right</code></li>. </ul>
    * @param useHTML <p>Whether to <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>. to render the axis title.</p>
    * @param x <p>Horizontal pixel offset of the title position.</p>
    * @param y <p>Vertical pixel offset of the title position.</p>
    */
  def apply(margin: js.UndefOr[Double] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, text: js.UndefOr[String | Null] = js.undefined, align: js.UndefOr[js.Any] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, offset: js.UndefOr[Double] = js.undefined, position3d: js.UndefOr[String | Null] = js.undefined, reserveSpace: js.UndefOr[Boolean] = js.undefined, skew3d: js.UndefOr[Boolean | Null] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, textAlign: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): YAxisTitle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisTitle {
      this.margin = margin
      this.rotation = rotation
      this.text = text
      this.align = align
      this.enabled = enabled
      this.offset = offset
      this.position3d = position3d
      this.reserveSpace = reserveSpace
      this.skew3d = skew3d
      this.style = style
      this.textAlign = textAlign
      this.useHTML = useHTML
      this.x = x
      this.y = y
    })
  }
}
