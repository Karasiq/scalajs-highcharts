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
  * @note JavaScript name: <code>navigator-xAxis-labels</code>
  */
@js.annotation.ScalaJSDefined
class NavigatorXAxisLabels extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>What part of the string the given position is anchored to.
    * If <code>left</code>, the left side of the string is at the axis position.
    * Can be one of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. Defaults to
    * an intelligent guess based on which side of the chart the axis
    * is on and the rotation of the label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-align-left/">Left</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-align-right/">Right</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-reservespace-true/">Left-aligned labels on a vertical category axis</a>
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>CSS styles for the label. Use <code>whiteSpace: &#39;nowrap&#39;</code> to prevent
    * wrapping of category labels. Use <code>textOverflow: &#39;none&#39;</code> to
    * prevent ellipsis (dots).</p>
    * <p>In styled mode, the labels are styled with the
    * <code>.highcharts-axis-labels</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-style/">Red X axis labels</a>
    */
  val style: js.Any = js.undefined

  /**
    * <p>The x position offset of the label relative to the tick position
    * on the axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-x/">Y axis labels placed on grid lines</a>
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position offset of the label relative to the tick position
    * on the axis. The default makes it adapt to the font size on
    * bottom axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-x/">Y axis labels placed on grid lines</a>
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * <p>Enable or disable the axis labels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-enabled/">X axis labels disabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/labels-enabled/">X axis labels disabled</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The number of pixels to indent the labels per level in a treegrid
    * axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/treegrid-axis/demo">Indentation 10px by default.</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/treegrid-axis/indentation-0px">Indentation set to 0px.</a>
    */
  val indentation: js.UndefOr[Double] = js.undefined

  /**
    * <p>For horizontal axes, the allowed degrees of label rotation
    * to prevent overlapping labels. If there is enough space,
    * labels are not rotated. As the chart gets narrower, it
    * will start rotating the labels -45 degrees, then remove
    * every second label and try again with rotations 0 and -45 etc.
    * Set it to <code>false</code> to disable rotation, which will
    * cause the labels to word-wrap if possible.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotation-default/">Default auto rotation of 0 or -45</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotation-0-90/">Custom graded auto rotation</a>
    * @since 4.1.0
    */
  val autoRotation: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * <p>When each category width is more than this many pixels, we don&#39;t
    * apply auto rotation. Instead, we lay out the axis label with word
    * wrap. A lower limit makes sense when the label contains multiple
    * short words that don&#39;t extend the available horizontal space for
    * each label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotationlimit/">Lower limit</a>
    * @since 4.1.5
    */
  val autoRotationLimit: js.UndefOr[Double] = js.undefined

  /**
    * <p>Polar charts only. The label&#39;s pixel distance from the perimeter
    * of the plot area.</p>
    */
  val distance: js.UndefOr[Double] = js.undefined

  /**
    * <p>A [format string](<a href="https://www.highcharts.com/docs/chart-">https://www.highcharts.com/docs/chart-</a>
    * concepts/labels-and-string-formatting) for the axis label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/labels-format/">Add units to Y axis label</a>
    * @since 3.0
    */
  val format: js.UndefOr[String] = js.undefined

  /**
    * <p>Callback JavaScript function to format the label. The value
    * is given by <code>this.value</code>. Additional properties for <code>this</code> are
    * <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>. The value of the default
    * label formatter can be retrieved by calling
    * <code>this.axis.defaultLabelFormatter.call(this)</code> within the function.</p>
    * <p>Defaults to:</p>
    * <pre>function() {
    *     return this.value;
    * }</pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-formatter-linked/">Linked category names</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-formatter-extended/">Modified numeric labels</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/labels-formatter/">Added units on Y axis</a>
    */
  val formatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Horizontal axis only. When <code>staggerLines</code> is not set,
    * <code>maxStaggerLines</code> defines how many lines the axis is allowed to
    * add to automatically avoid overlapping X labels. Set to <code>1</code> to
    * disable overlap detection.</p>
    * @since 1.3.3
    */
  val maxStaggerLines: js.UndefOr[Double] = js.undefined

  /**
    * <p>How to handle overflowing labels on horizontal axis. If set to
    * <code>&quot;allow&quot;</code>, it will not be aligned at all. By default it
    * <code>&quot;justify&quot;</code> labels inside the chart area. If there is room to
    * move it, it will be aligned to the edge, else it will be removed.</p>
    * @since 2.2.5
    */
  val overflow: js.UndefOr[Boolean | String] = js.undefined

  /**
    * <p>The pixel padding for axis labels, to ensure white space between
    * them.</p>
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to reserve space for the labels. By default, space is
    * reserved for the labels in these cases:</p>
    * <ul>
    * <li>On all horizontal axes.</li>
    * <li>On vertical axes if <code>label.align</code> is <code>right</code> on a left-side
    * axis or <code>left</code> on a right-side axis.</li>
    * <li>On vertical axes if <code>label.align</code> is <code>center</code>.</li>
    * </ul>
    * <p>This can be turned off when for example the labels are rendered
    * inside the plot area instead of outside.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-reservespace/">No reserved space, labels inside plot</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-reservespace-true/">Left-aligned labels on a vertical category axis</a>
    * @since 4.1.10
    */
  val reserveSpace: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Rotation of the labels in degrees.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-rotation/">X axis labels rotated 90°</a>
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * <p>Horizontal axes only. The number of lines to spread the labels
    * over to make room or tighter labels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-staggerlines/">Show labels over two lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/labels-staggerlines/">Show labels over two lines</a>
    * @since 2.1
    */
  val staggerLines: js.UndefOr[Double] = js.undefined

  /**
    * <p>To show only every <em>n_&#39;th label on the axis, set the step to _n</em>.
    * Setting the step to 2 shows every other label.</p>
    * <p>By default, the step is calculated automatically to avoid
    * overlap. To prevent this, set it to 1. This usually only
    * happens on a category axis, and is often a sign that you have
    * chosen the wrong axis type.</p>
    * <p>Read more at
    * <a href="https://www.highcharts.com/docs/chart-concepts/axes">Axis docs</a>
    * =&gt; What axis should I use?</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-step/">Showing only every other axis label on a categorized x-axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-step-auto/">Auto steps on a category axis</a>
    * @since 2.1
    */
  val step: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to [use HTML](<a href="https://www.highcharts.com/docs/chart-">https://www.highcharts.com/docs/chart-</a>
    * concepts/labels-and-string-formatting#html) to render the labels.</p>
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The Z index for the axis labels.</p>
    */
  val zIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>Defines how the labels are be repositioned according to the 3D chart
    * orientation.</p>
    * <ul>
    * <li><code>&#39;offset&#39;</code>: Maintain a fixed horizontal/vertical distance from the
    *    tick marks, despite the chart orientation. This is the backwards
    *    compatible behavior, and causes skewing of X and Z axes.</li>
    * <li><code>&#39;chart&#39;</code>: Preserve 3D position relative to the chart.
    * This looks nice, but hard to read if the text isn&#39;t
    * forward-facing.</li>
    * <li><code>&#39;flap&#39;</code>: Rotated text along the axis to compensate for the chart
    *    orientation. This tries to maintain text as legible as possible
    *    on all orientations.</li>
    * <li><code>&#39;ortho&#39;</code>: Rotated text along the axis direction so that the labels
    *    are orthogonal to the axis. This is very similar to <code>&#39;flap&#39;</code>,
    *    but prevents skewing the labels (X and Y scaling are still
    *    present).</li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/skewed-labels/">Skewed labels</a>
    * @since 5.0.15
    */
  val position3d: js.UndefOr[String] = js.undefined

  /**
    * <p>If enabled, the axis labels will skewed to follow the perspective.</p>
    * <p>This will fix overlapping labels and titles, but texts become less
    * legible due to the distortion.</p>
    * <p>The final appearance depends heavily on <code>labels.position3d</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/skewed-labels/">Skewed labels</a>
    * @since 5.0.15
    */
  val skew3d: js.UndefOr[Boolean] = js.undefined
}

object NavigatorXAxisLabels {
  /**
    * @param align <p>What part of the string the given position is anchored to.. If <code>left</code>, the left side of the string is at the axis position.. Can be one of <code>&quot;left&quot;</code>, <code>&quot;center&quot;</code> or <code>&quot;right&quot;</code>. Defaults to. an intelligent guess based on which side of the chart the axis. is on and the rotation of the label.</p>
    * @param style <p>CSS styles for the label. Use <code>whiteSpace: &#39;nowrap&#39;</code> to prevent. wrapping of category labels. Use <code>textOverflow: &#39;none&#39;</code> to. prevent ellipsis (dots).</p>. <p>In styled mode, the labels are styled with the. <code>.highcharts-axis-labels</code> class.</p>
    * @param x <p>The x position offset of the label relative to the tick position. on the axis.</p>
    * @param y <p>The y position offset of the label relative to the tick position. on the axis. The default makes it adapt to the font size on. bottom axis.</p>
    * @param enabled <p>Enable or disable the axis labels.</p>
    * @param indentation <p>The number of pixels to indent the labels per level in a treegrid. axis.</p>
    * @param autoRotation <p>For horizontal axes, the allowed degrees of label rotation. to prevent overlapping labels. If there is enough space,. labels are not rotated. As the chart gets narrower, it. will start rotating the labels -45 degrees, then remove. every second label and try again with rotations 0 and -45 etc.. Set it to <code>false</code> to disable rotation, which will. cause the labels to word-wrap if possible.</p>
    * @param autoRotationLimit <p>When each category width is more than this many pixels, we don&#39;t. apply auto rotation. Instead, we lay out the axis label with word. wrap. A lower limit makes sense when the label contains multiple. short words that don&#39;t extend the available horizontal space for. each label.</p>
    * @param distance <p>Polar charts only. The label&#39;s pixel distance from the perimeter. of the plot area.</p>
    * @param format <p>A [format string](<a href="https://www.highcharts.com/docs/chart-">https://www.highcharts.com/docs/chart-</a>. concepts/labels-and-string-formatting) for the axis label.</p>
    * @param formatter <p>Callback JavaScript function to format the label. The value. is given by <code>this.value</code>. Additional properties for <code>this</code> are. <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>. The value of the default. label formatter can be retrieved by calling. <code>this.axis.defaultLabelFormatter.call(this)</code> within the function.</p>. <p>Defaults to:</p>. <pre>function() {.     return this.value;. }</pre>
    * @param maxStaggerLines <p>Horizontal axis only. When <code>staggerLines</code> is not set,. <code>maxStaggerLines</code> defines how many lines the axis is allowed to. add to automatically avoid overlapping X labels. Set to <code>1</code> to. disable overlap detection.</p>
    * @param overflow <p>How to handle overflowing labels on horizontal axis. If set to. <code>&quot;allow&quot;</code>, it will not be aligned at all. By default it. <code>&quot;justify&quot;</code> labels inside the chart area. If there is room to. move it, it will be aligned to the edge, else it will be removed.</p>
    * @param padding <p>The pixel padding for axis labels, to ensure white space between. them.</p>
    * @param reserveSpace <p>Whether to reserve space for the labels. By default, space is. reserved for the labels in these cases:</p>. <ul>. <li>On all horizontal axes.</li>. <li>On vertical axes if <code>label.align</code> is <code>right</code> on a left-side. axis or <code>left</code> on a right-side axis.</li>. <li>On vertical axes if <code>label.align</code> is <code>center</code>.</li>. </ul>. <p>This can be turned off when for example the labels are rendered. inside the plot area instead of outside.</p>
    * @param rotation <p>Rotation of the labels in degrees.</p>
    * @param staggerLines <p>Horizontal axes only. The number of lines to spread the labels. over to make room or tighter labels.</p>
    * @param step <p>To show only every <em>n_&#39;th label on the axis, set the step to _n</em>.. Setting the step to 2 shows every other label.</p>. <p>By default, the step is calculated automatically to avoid. overlap. To prevent this, set it to 1. This usually only. happens on a category axis, and is often a sign that you have. chosen the wrong axis type.</p>. <p>Read more at. <a href="https://www.highcharts.com/docs/chart-concepts/axes">Axis docs</a>. =&gt; What axis should I use?</p>
    * @param useHTML <p>Whether to [use HTML](<a href="https://www.highcharts.com/docs/chart-">https://www.highcharts.com/docs/chart-</a>. concepts/labels-and-string-formatting#html) to render the labels.</p>
    * @param zIndex <p>The Z index for the axis labels.</p>
    * @param position3d <p>Defines how the labels are be repositioned according to the 3D chart. orientation.</p>. <ul>. <li><code>&#39;offset&#39;</code>: Maintain a fixed horizontal/vertical distance from the.    tick marks, despite the chart orientation. This is the backwards.    compatible behavior, and causes skewing of X and Z axes.</li>. <li><code>&#39;chart&#39;</code>: Preserve 3D position relative to the chart.. This looks nice, but hard to read if the text isn&#39;t. forward-facing.</li>. <li><code>&#39;flap&#39;</code>: Rotated text along the axis to compensate for the chart.    orientation. This tries to maintain text as legible as possible.    on all orientations.</li>. <li><code>&#39;ortho&#39;</code>: Rotated text along the axis direction so that the labels.    are orthogonal to the axis. This is very similar to <code>&#39;flap&#39;</code>,.    but prevents skewing the labels (X and Y scaling are still.    present).</li>. </ul>
    * @param skew3d <p>If enabled, the axis labels will skewed to follow the perspective.</p>. <p>This will fix overlapping labels and titles, but texts become less. legible due to the distortion.</p>. <p>The final appearance depends heavily on <code>labels.position3d</code>.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, style: js.UndefOr[js.Any] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, indentation: js.UndefOr[Double] = js.undefined, autoRotation: js.UndefOr[js.Array[Double]] = js.undefined, autoRotationLimit: js.UndefOr[Double] = js.undefined, distance: js.UndefOr[Double] = js.undefined, format: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Function] = js.undefined, maxStaggerLines: js.UndefOr[Double] = js.undefined, overflow: js.UndefOr[Boolean | String] = js.undefined, padding: js.UndefOr[Double] = js.undefined, reserveSpace: js.UndefOr[Boolean] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, staggerLines: js.UndefOr[Double] = js.undefined, step: js.UndefOr[Double] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, position3d: js.UndefOr[String] = js.undefined, skew3d: js.UndefOr[Boolean] = js.undefined): NavigatorXAxisLabels = {
    val alignOuter: js.UndefOr[String] = align
    val styleOuter: js.Any = style
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val indentationOuter: js.UndefOr[Double] = indentation
    val autoRotationOuter: js.UndefOr[js.Array[Double]] = autoRotation
    val autoRotationLimitOuter: js.UndefOr[Double] = autoRotationLimit
    val distanceOuter: js.UndefOr[Double] = distance
    val formatOuter: js.UndefOr[String] = format
    val formatterOuter: js.UndefOr[js.Function] = formatter
    val maxStaggerLinesOuter: js.UndefOr[Double] = maxStaggerLines
    val overflowOuter: js.UndefOr[Boolean | String] = overflow
    val paddingOuter: js.UndefOr[Double] = padding
    val reserveSpaceOuter: js.UndefOr[Boolean] = reserveSpace
    val rotationOuter: js.UndefOr[Double] = rotation
    val staggerLinesOuter: js.UndefOr[Double] = staggerLines
    val stepOuter: js.UndefOr[Double] = step
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val zIndexOuter: js.UndefOr[Double] = zIndex
    val position3dOuter: js.UndefOr[String] = position3d
    val skew3dOuter: js.UndefOr[Boolean] = skew3d
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorXAxisLabels {
      override val align: js.UndefOr[String] = alignOuter
      override val style: js.Any = styleOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val indentation: js.UndefOr[Double] = indentationOuter
      override val autoRotation: js.UndefOr[js.Array[Double]] = autoRotationOuter
      override val autoRotationLimit: js.UndefOr[Double] = autoRotationLimitOuter
      override val distance: js.UndefOr[Double] = distanceOuter
      override val format: js.UndefOr[String] = formatOuter
      override val formatter: js.UndefOr[js.Function] = formatterOuter
      override val maxStaggerLines: js.UndefOr[Double] = maxStaggerLinesOuter
      override val overflow: js.UndefOr[Boolean | String] = overflowOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val reserveSpace: js.UndefOr[Boolean] = reserveSpaceOuter
      override val rotation: js.UndefOr[Double] = rotationOuter
      override val staggerLines: js.UndefOr[Double] = staggerLinesOuter
      override val step: js.UndefOr[Double] = stepOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
      override val position3d: js.UndefOr[String] = position3dOuter
      override val skew3d: js.UndefOr[Boolean] = skew3dOuter
    })
  }
}
