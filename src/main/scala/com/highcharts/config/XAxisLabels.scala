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
  * @note JavaScript name: <code>xAxis-labels</code>
  */
@js.annotation.ScalaJSDefined
class XAxisLabels extends js.Object {

  /**
    * What part of the string the given position is anchored to. If <code>left</code>, the left side of the string is at the axis position. Can be one of <code>"left"</code>, <code>"center"</code> or <code>"right"</code>. Defaults to an intelligent guess based on which side of the chart the axis is on and the rotation of the label.
    * @example Align <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-align-left/" target="_blank">left</a> and, 
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-align-right/" target="_blank">right</a> on X axis.

<a href="http://jsfiddle.net/highcharts/72sbw0Lz/">Understand alignment to boxes, lines and points</a>
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * For horizontal axes, the allowed degrees of label rotation to prevent overlapping labels. If there is enough space, labels are not rotated. As the chart gets narrower, it will start rotating the labels -45 degrees, then remove every second label and try again with rotations 0 and -45 etc. Set it to <code>false</code> to disable rotation, which will cause the labels to word-wrap if possible.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotation-default/" target="_blank">Default auto rotation of 0 or -45</a>, <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotation-0-90/" target="_blank">custom graded auto rotation</a>
    * @since 4.1.0
    */
  val autoRotation: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * When each category width is more than this many pixels, we don't apply auto rotation. Instead, we lay out the axis label with word wrap. A lower limit makes sense when the label contains multiple short words that don't extend the available horizontal space for each label.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotationlimit/" target="_blank">Lower limit</a>
    * @since 4.1.5
    */
  val autoRotationLimit: js.UndefOr[Double] = js.undefined

  /**
    * Polar charts only. The label's pixel distance from the perimeter of the plot area.
    */
  val distance: js.UndefOr[Double] = js.undefined

  /**
    * Enable or disable the axis labels.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-enabled/" target="_blank">X axis labels disabled</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the axis label. 
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/labels-format/" target="_blank">Add units to Y axis label</a>
    * @since 3.0
    */
  val format: js.UndefOr[String] = js.undefined

  /**
    * <p>Callback JavaScript function to format the label. The value is given by <code>this.value</code>. Additional properties for <code>this</code> are
    *  <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>. The value of the default label formatter can be retrieved by calling <code>this.axis.defaultLabelFormatter.call(this)</code> within the function.</p>
    * 
    * <p>Defaults to: 
    * <pre>function() {
    * 	return this.value;
    * }</pre>
    * </p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-formatter-linked/" target="_blank">Linked category names</a>. <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-formatter-extended/" target="_blank">Modified numeric labels</a>.
    */
  val formatter: js.UndefOr[js.Function] = js.undefined

  /**
    * How to handle overflowing labels on horizontal axis. Can be undefined, <code>false</code> or <code>"justify"</code>. By default it aligns inside the chart area. If "justify", labels will not render outside the plot area. If <code>false</code>, it will not be aligned at all. If there is room to move it, it will be aligned to the edge, else it will be removed.
    * @since 2.2.5
    */
  val overflow: js.UndefOr[String] = js.undefined

  /**
    * The pixel padding for axis labels, to ensure white space between them.
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * Whether to reserve space for the labels. This can be turned off when for example the labels are rendered inside the plot area instead of outside.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-reservespace/" target="_blank">No reserved space, labels inside plot</a>.
    * @since 4.1.10
    */
  val reserveSpace: js.UndefOr[Boolean] = js.undefined

  /**
    * Rotation of the labels in degrees.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-rotation/" target="_blank">X axis labels rotated 90°</a>
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.  .
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-staggerlines/" target="_blank">Show labels over two lines</a>
    * @since 2.1
    */
  val staggerLines: js.UndefOr[Double] = js.undefined

  /**
    * <p>To show only every <em>n</em>'th label on the axis, set the step to <em>n</em>. Setting the step to 2 shows every other label.</p>
    * 
    * <p>By default, the step is calculated automatically to avoid overlap. To prevent this, set it to 1. This usually only happens on a category axis, and is often a sign that you have chosen the wrong axis type. Read more at <a href="http://www.highcharts.com/docs/chart-concepts/axes">Axis docs</a> => What axis should I use?</p> 
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-step/" target="_blank">Showing only every other axis label on a categorized x axis</a>. <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-step-auto/" target="_blank">Auto steps on a category axis</a>.
    * @since 2.1
    */
  val step: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to prevent ellipsis (dots).</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the labels are styled with the <code>.highcharts-axis-labels</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-style/" target="_blank">Red X axis labels</a>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * The x position offset of the label relative to the tick position on the axis.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-x/" target="_blank">Y axis labels placed on grid lines</a>
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The y position offset of the label relative to the tick position on the axis. The default makes it adapt to the font size on bottom axis.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-x/" target="_blank">Y axis labels placed on grid lines</a>
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * The Z index for the axis labels.
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object XAxisLabels {
  /**
    * @param align What part of the string the given position is anchored to. If <code>left</code>, the left side of the string is at the axis position. Can be one of <code>"left"</code>, <code>"center"</code> or <code>"right"</code>. Defaults to an intelligent guess based on which side of the chart the axis is on and the rotation of the label.
    * @param autoRotation For horizontal axes, the allowed degrees of label rotation to prevent overlapping labels. If there is enough space, labels are not rotated. As the chart gets narrower, it will start rotating the labels -45 degrees, then remove every second label and try again with rotations 0 and -45 etc. Set it to <code>false</code> to disable rotation, which will cause the labels to word-wrap if possible.
    * @param autoRotationLimit When each category width is more than this many pixels, we don't apply auto rotation. Instead, we lay out the axis label with word wrap. A lower limit makes sense when the label contains multiple short words that don't extend the available horizontal space for each label.
    * @param distance Polar charts only. The label's pixel distance from the perimeter of the plot area.
    * @param enabled Enable or disable the axis labels.
    * @param format A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the axis label. 
    * @param formatter <p>Callback JavaScript function to format the label. The value is given by <code>this.value</code>. Additional properties for <code>this</code> are.  <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>. The value of the default label formatter can be retrieved by calling <code>this.axis.defaultLabelFormatter.call(this)</code> within the function.</p>. . <p>Defaults to: . <pre>function() {. 	return this.value;. }</pre>. </p>
    * @param overflow How to handle overflowing labels on horizontal axis. Can be undefined, <code>false</code> or <code>"justify"</code>. By default it aligns inside the chart area. If "justify", labels will not render outside the plot area. If <code>false</code>, it will not be aligned at all. If there is room to move it, it will be aligned to the edge, else it will be removed.
    * @param padding The pixel padding for axis labels, to ensure white space between them.
    * @param reserveSpace Whether to reserve space for the labels. This can be turned off when for example the labels are rendered inside the plot area instead of outside.
    * @param rotation Rotation of the labels in degrees.
    * @param staggerLines Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.  .
    * @param step <p>To show only every <em>n</em>'th label on the axis, set the step to <em>n</em>. Setting the step to 2 shows every other label.</p>. . <p>By default, the step is calculated automatically to avoid overlap. To prevent this, set it to 1. This usually only happens on a category axis, and is often a sign that you have chosen the wrong axis type. Read more at <a href="http://www.highcharts.com/docs/chart-concepts/axes">Axis docs</a> => What axis should I use?</p> 
    * @param style <p>CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to prevent ellipsis (dots).</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the labels are styled with the <code>.highcharts-axis-labels</code> class.</p>
    * @param useHTML Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    * @param x The x position offset of the label relative to the tick position on the axis.
    * @param y The y position offset of the label relative to the tick position on the axis. The default makes it adapt to the font size on bottom axis.
    * @param zIndex The Z index for the axis labels.
    */
  def apply(align: js.UndefOr[String] = js.undefined, autoRotation: js.UndefOr[js.Array[Double]] = js.undefined, autoRotationLimit: js.UndefOr[Double] = js.undefined, distance: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, format: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Function] = js.undefined, overflow: js.UndefOr[String] = js.undefined, padding: js.UndefOr[Double] = js.undefined, reserveSpace: js.UndefOr[Boolean] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, staggerLines: js.UndefOr[Double] = js.undefined, step: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): XAxisLabels = {
    val alignOuter: js.UndefOr[String] = align
    val autoRotationOuter: js.UndefOr[js.Array[Double]] = autoRotation
    val autoRotationLimitOuter: js.UndefOr[Double] = autoRotationLimit
    val distanceOuter: js.UndefOr[Double] = distance
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val formatOuter: js.UndefOr[String] = format
    val formatterOuter: js.UndefOr[js.Function] = formatter
    val overflowOuter: js.UndefOr[String] = overflow
    val paddingOuter: js.UndefOr[Double] = padding
    val reserveSpaceOuter: js.UndefOr[Boolean] = reserveSpace
    val rotationOuter: js.UndefOr[Double] = rotation
    val staggerLinesOuter: js.UndefOr[Double] = staggerLines
    val stepOuter: js.UndefOr[Double] = step
    val styleOuter: js.UndefOr[js.Object] = style
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val zIndexOuter: js.UndefOr[Double] = zIndex
    new XAxisLabels {
      override val align: js.UndefOr[String] = alignOuter
      override val autoRotation: js.UndefOr[js.Array[Double]] = autoRotationOuter
      override val autoRotationLimit: js.UndefOr[Double] = autoRotationLimitOuter
      override val distance: js.UndefOr[Double] = distanceOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val format: js.UndefOr[String] = formatOuter
      override val formatter: js.UndefOr[js.Function] = formatterOuter
      override val overflow: js.UndefOr[String] = overflowOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val reserveSpace: js.UndefOr[Boolean] = reserveSpaceOuter
      override val rotation: js.UndefOr[Double] = rotationOuter
      override val staggerLines: js.UndefOr[Double] = staggerLinesOuter
      override val step: js.UndefOr[Double] = stepOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    }
  }
}
