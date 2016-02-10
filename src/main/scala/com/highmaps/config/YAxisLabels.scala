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
  * @note JavaScript name: <code>yAxis-labels</code>
  */
@js.annotation.ScalaJSDefined
class YAxisLabels extends js.Object {

  /**
    * What part of the string the given position is anchored to. 
    * 		Can be one of <code>"left"</code>, <code>"center"</code> or <code>"right"</code>.
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * Enable or disable the axis labels.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the axis label. 
    */
  val format: js.UndefOr[String] = js.undefined

  /**
    * Callback JavaScript function to format the label. The value is 
    *  given by <code>this.value</code>. Additional properties for <code>this</code> are
    *  <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>.
    *  Defaults to: 
    * <pre>function() {
    * 	return this.value;
    * }</pre>
    */
  val formatter: js.UndefOr[js.Function] = js.undefined

  /**
    * Horizontal axis only. When <code>staggerLines</code> is not set, <code>maxStaggerLines</code> defines how many lines the axis is allowed to add to automatically avoid overlapping X labels. Set to <code>1</code> to disable overlap detection. 
    */
  val maxStaggerLines: js.UndefOr[Double] = js.undefined

  /**
    * How to handle overflowing labels on horizontal axis. Can be undefined or "justify". If "justify", labels will not render outside the plot area. If there is room to move it, it will be aligned to the edge, else it will be removed.
    */
  val overflow: js.UndefOr[String] = js.undefined

  /**
    * Rotation of the labels in degrees.
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.  .
    */
  val staggerLines: js.UndefOr[Double] = js.undefined

  /**
    * To show only every <em>n</em>'th label on the axis, set the step to <em>n</em>. Setting the step to 2 shows every other label.
    */
  val step: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for the label.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * The x position offset of the label relative to the tick position on the axis. Defaults to -15 for left axis, 15 for right axis.
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The y position offset of the label relative to the tick position on the axis.
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * The Z index for the axis labels.
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object YAxisLabels {
  /**
    * @param align What part of the string the given position is anchored to. . 		Can be one of <code>"left"</code>, <code>"center"</code> or <code>"right"</code>.
    * @param enabled Enable or disable the axis labels.
    * @param format A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the axis label. 
    * @param formatter Callback JavaScript function to format the label. The value is .  given by <code>this.value</code>. Additional properties for <code>this</code> are.  <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>..  Defaults to: . <pre>function() {. 	return this.value;. }</pre>
    * @param maxStaggerLines Horizontal axis only. When <code>staggerLines</code> is not set, <code>maxStaggerLines</code> defines how many lines the axis is allowed to add to automatically avoid overlapping X labels. Set to <code>1</code> to disable overlap detection. 
    * @param overflow How to handle overflowing labels on horizontal axis. Can be undefined or "justify". If "justify", labels will not render outside the plot area. If there is room to move it, it will be aligned to the edge, else it will be removed.
    * @param rotation Rotation of the labels in degrees.
    * @param staggerLines Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.  .
    * @param step To show only every <em>n</em>'th label on the axis, set the step to <em>n</em>. Setting the step to 2 shows every other label.
    * @param style CSS styles for the label.
    * @param useHTML Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    * @param x The x position offset of the label relative to the tick position on the axis. Defaults to -15 for left axis, 15 for right axis.
    * @param y The y position offset of the label relative to the tick position on the axis.
    * @param zIndex The Z index for the axis labels.
    */
  def apply(align: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, format: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Function] = js.undefined, maxStaggerLines: js.UndefOr[Double] = js.undefined, overflow: js.UndefOr[String] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, staggerLines: js.UndefOr[Double] = js.undefined, step: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): YAxisLabels = {
    val alignOuter: js.UndefOr[String] = align
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
    new YAxisLabels {
      override val align: js.UndefOr[String] = alignOuter
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
