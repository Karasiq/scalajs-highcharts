/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.4 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class YAxisLabels extends js.Object {
  
  /**
   * What part of the string the given position is anchored to. 
   * 		Can be one of <code>"left"</code>, <code>"center"</code> or <code>"right"</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/labels-align-left/" target="_blank">"left"</a> on Y axis
   */
  val align: String = "right"
  
  /**
   * For horizontal axes, the allowed degrees of label rotation to prevent overlapping labels. If there is enough space, labels are not rotated. As the chart gets narrower, it will start rotating the labels -45 degrees, then remove every second label and try again with rotations 0 and -45 etc. Set it to <code>false</code> to disable rotation, which will cause the labels to word-wrap if possible.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/labels-autorotation-default/" target="_blank">Default auto rotation of 0 or -45</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/labels-autorotation-0-90/" target="_blank">custom graded auto rotation</a>
   * @since 4.1.0
   */
  val autoRotation: js.Array[Double] = js.Array(-45)
  
  /**
   * When each category width is more than this many pixels, we don't apply auto rotation. Instead, we lay out the axis label with word wrap. A lower limit makes sense when the label contains multiple short words that don't extend the available horizontal space for each label.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/labels-autorotationlimit/" target="_blank">Lower limit</a>
   * @since 4.1.5
   */
  val autoRotationLimit: Double = 80
  
  /**
   * Angular gauges and solid gauges only. The label's pixel distance from the perimeter of the plot area.
   */
  val distance: Double = 15
  
  /**
   * Enable or disable the axis labels.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/labels-enabled/" target="_blank">X axis labels disabled</a>
   */
  val enabled: Boolean = true
  
  /**
   * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the axis label. 
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/labels-format/" target="_blank">Add units to Y axis label</a>
   * @since 3.0
   */
  val format: String = "{value}"
  
  /**
   * Callback JavaScript function to format the label. The value is 
   *  given by <code>this.value</code>. Additional properties for <code>this</code> are
   *  <code>axis</code>, <code>chart</code>, <code>isFirst</code> and <code>isLast</code>.
   *  Defaults to: 
   * <pre>function() {
   * 	return this.value;
   * }</pre>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/labels-formatter-linked/" target="_blank">Linked category names</a>
   */
  val formatter: UndefOr[js.Function] = js.undefined
  
  /**
   * Horizontal axis only. When <code>staggerLines</code> is not set, <code>maxStaggerLines</code> defines how many lines the axis is allowed to add to automatically avoid overlapping X labels. Set to <code>1</code> to disable overlap detection. 
   * @since 3.0.3
   */
  @deprecated
  val maxStaggerLines: Double = 5
  
  /**
   * How to handle overflowing labels on horizontal axis. Can be undefined, <code>false</code> or <code>"justify"</code>. By default it aligns inside the chart area. If "justify", labels will not render outside the plot area. If <code>false</code>, it will not be aligned at all. If there is room to move it, it will be aligned to the edge, else it will be removed.
   * @since 2.2.5
   */
  @deprecated
  val overflow: UndefOr[String] = js.undefined
  
  /**
   * The pixel padding for axis labels, to ensure white space between them.
   */
  val padding: Double = 5
  
  /**
   * Whether to reserve space for the labels. This can be turned off when for example the labels are rendered inside the plot area instead of outside.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/labels-reservespace/" target="_blank">No reserved space, labels inside plot</a>.
   * @since 4.1.10
   */
  val reserveSpace: Boolean = true
  
  /**
   * Rotation of the labels in degrees.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/labels-rotation/" target="_blank">X axis labels rotated 90°</a>
   */
  val rotation: Double = 0
  
  /**
   * Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.  .
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/labels-staggerlines/" target="_blank">Show labels over two lines</a>
   * @since 2.1
   */
  val staggerLines: UndefOr[Double] = js.undefined
  
  /**
   * <p>To show only every <em>n</em>'th label on the axis, set the step to <em>n</em>. Setting the step to 2 shows every other label.</p>
   * 
   * <p>By default, the step is calculated automatically to avoid overlap. To prevent this, set it to 1. This usually only happens on a category axis, and is often a sign that you have chosen the wrong axis type. Read more at <a href="http://www.highcharts.com/docs/chart-concepts/axes">Axis docs</a> => What axis should I use?</p> 
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/labels-step/" target="_blank">Showing only every other axis label on a categorized x axis</a>. <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/labels-step-auto/" target="_blank">Auto steps on a category axis</a>.
   * @since 2.1
   */
  val step: UndefOr[Double] = js.undefined
  
  /**
   * CSS styles for the label. Use <code>whiteSpace: 'nowrap'</code> to prevent wrapping of category labels. Use <code>textOverflow: 'none'</code> to prevent ellipsis (dots).
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/labels-style/" target="_blank">Red X axis labels</a>
   */
  val style: js.Object = js.eval("{\"color\":\"#6D869F\",\"fontWeight\":\"bold\"}").asInstanceOf[js.Object]
  
  /**
   * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
   */
  val useHTML: Boolean = false
  
  /**
   * The x position offset of the label relative to the tick position on the axis. Defaults to -15 for left axis, 15 for right axis.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/labels-x/" target="_blank">Y axis labels placed on grid lines</a>
   */
  val x: UndefOr[Double] = js.undefined
  
  /**
   * The y position offset of the label relative to the tick position on the axis.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/labels-x/" target="_blank">Y axis labels placed on grid lines</a>
   */
  val y: Double = 3
  
  /**
   * The Z index for the axis labels.
   */
  val zIndex: Double = 7
}
