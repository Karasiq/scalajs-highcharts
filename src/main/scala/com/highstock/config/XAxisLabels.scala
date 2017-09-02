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
  * @note JavaScript name: <code>xAxis-labels</code>
  */
@js.annotation.ScalaJSDefined
class XAxisLabels extends js.Object {

  /**
    * What part of the string the given position is anchored to. If <code>left</code>, the left side of the string is at the axis position. Can be one of <code>"left"</code>, <code>"center"</code> or <code>"right"</code>. Defaults to an intelligent guess based on which side of the chart the axis is on and the rotation of the label.
    * @example <a href="http://jsfiddle.net/highcharts/72sbw0Lz/">Understand alignment to boxes, lines and points</a>
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * For horizontal axes, the allowed degrees of label rotation to prevent overlapping labels. If there is enough space, labels are not rotated. As the chart gets narrower, it will start rotating the labels -45 degrees, then remove every second label and try again with rotations 0 and -45 etc. Set it to <code>false</code> to disable rotation, which will cause the labels to word-wrap if possible.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotation-default/" target="_blank">Default auto rotation of 0 or -45</a>, <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotation-0-90/" target="_blank">custom graded auto rotation</a>
    * @since 2.1.0
    */
  val autoRotation: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * Enable or disable the axis labels.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/labels-enabled/" target="_blank">X axis labels disabled</a>
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
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/labels-formatter/" target="_blank">Added units on Y axis</a>
    */
  val formatter: js.UndefOr[js.Function] = js.undefined

  /**
    * Horizontal axis only. When <code>staggerLines</code> is not set, <code>maxStaggerLines</code> defines how many lines the axis is allowed to add to automatically avoid overlapping X labels. Set to <code>1</code> to disable overlap detection. 
    * @since 1.3.3
    */
  val maxStaggerLines: js.UndefOr[Double] = js.undefined

  /**
    * How to handle overflowing labels on horizontal axis. Can be undefined, <code>false</code> or <code>"justify"</code>. By default it aligns inside the chart area. If "justify", labels will not render outside the plot area. If <code>false</code>, it will not be aligned at all. If there is room to move it, it will be aligned to the edge, else it will be removed.
    * @since 1.1.6
    */
  val overflow: js.UndefOr[String] = js.undefined

  /**
    * Rotation of the labels in degrees.
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.  .
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/labels-staggerlines/" target="_blank">Show labels over two lines</a>
    */
  val staggerLines: js.UndefOr[Double] = js.undefined

  /**
    * To show only every <em>n</em>'th label on the axis, set the step to <em>n</em>. Setting the step to 2 shows every other label.
    */
  val step: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to prevent ellipsis (dots).</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the labels are styled with the <code>.highcharts-axis-labels</code> class.</p>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * The x position offset of the label relative to the tick position on the axis.
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The y position offset of the label relative to the tick position on the axis. The default makes it adapt to the font size on bottom axis.
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
    * @param enabled Enable or disable the axis labels.
    * @param format A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the axis label. 
    * @param formatter <p>Callback JavaScript function to format the label. The value is given by <code>this.value</code>. Additional properties for <code>this</code> are.  <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>. The value of the default label formatter can be retrieved by calling <code>this.axis.defaultLabelFormatter.call(this)</code> within the function.</p>. . <p>Defaults to: . <pre>function() {. 	return this.value;. }</pre>. </p>
    * @param maxStaggerLines Horizontal axis only. When <code>staggerLines</code> is not set, <code>maxStaggerLines</code> defines how many lines the axis is allowed to add to automatically avoid overlapping X labels. Set to <code>1</code> to disable overlap detection. 
    * @param overflow How to handle overflowing labels on horizontal axis. Can be undefined, <code>false</code> or <code>"justify"</code>. By default it aligns inside the chart area. If "justify", labels will not render outside the plot area. If <code>false</code>, it will not be aligned at all. If there is room to move it, it will be aligned to the edge, else it will be removed.
    * @param rotation Rotation of the labels in degrees.
    * @param staggerLines Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.  .
    * @param step To show only every <em>n</em>'th label on the axis, set the step to <em>n</em>. Setting the step to 2 shows every other label.
    * @param style <p>CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to prevent ellipsis (dots).</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the labels are styled with the <code>.highcharts-axis-labels</code> class.</p>
    * @param useHTML Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    * @param x The x position offset of the label relative to the tick position on the axis.
    * @param y The y position offset of the label relative to the tick position on the axis. The default makes it adapt to the font size on bottom axis.
    * @param zIndex The Z index for the axis labels.
    */
  def apply(align: js.UndefOr[String] = js.undefined, autoRotation: js.UndefOr[js.Array[Double]] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, format: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Function] = js.undefined, maxStaggerLines: js.UndefOr[Double] = js.undefined, overflow: js.UndefOr[String] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, staggerLines: js.UndefOr[Double] = js.undefined, step: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): XAxisLabels = {
    val alignOuter: js.UndefOr[String] = align
    val autoRotationOuter: js.UndefOr[js.Array[Double]] = autoRotation
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val formatOuter: js.UndefOr[String] = format
    val formatterOuter: js.UndefOr[js.Function] = formatter
    val maxStaggerLinesOuter: js.UndefOr[Double] = maxStaggerLines
    val overflowOuter: js.UndefOr[String] = overflow
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
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val format: js.UndefOr[String] = formatOuter
      override val formatter: js.UndefOr[js.Function] = formatterOuter
      override val maxStaggerLines: js.UndefOr[Double] = maxStaggerLinesOuter
      override val overflow: js.UndefOr[String] = overflowOuter
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
