/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.3 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class SeriesSolidgaugeDataLabels extends js.Object {
  
  /**
   * The alignment of the data label compared to the point.  If <code>right</code>, the right side of the label should be touching the point. For points with an extent, like columns, the alignments also dictates how to align it inside the box, as given with the <a href="#plotOptions.column.dataLabels.inside">inside</a> option. Can be one of "left", "center" or "right".
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-align-left/" target="_blank">Left aligned</a>
   */
  val align: String = "center"
  
  /**
   * Whether to allow data labels to overlap. To make the labels less sensitive for overlapping, the <a href="#plotOptions.series.dataLabels.padding">dataLabels.padding</a> can be set to 0.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-allowoverlap-false/" target="_blank">Don't allow overlap</a>
   * @since 4.1.0
   */
  val allowOverlap: Boolean = false
  
  /**
   * The background color or gradient for the data label. Defaults to <code>undefined</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
   * @since 2.2.1
   */
  val backgroundColor: UndefOr[String] = js.undefined
  
  /**
   * The border color for the data label.
   * @since 2.3.0
   */
  val borderColor: String = "silver"
  
  /**
   * The border radius in pixels for the gauge's data label.
   * @since 2.3.0
   */
  val borderRadius: Double = 3
  
  /**
   * The border width in pixels for the gauge data label.
   * @since 2.3.0
   */
  val borderWidth: Double = 1
  
  /**
   * The text color for the data labels. Defaults to <code>null</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-color/" target="_blank">Red data labels</a>
   */
  val color: UndefOr[String] = js.undefined
  
  /**
   * Whether to hide data labels that are outside the plot area. By default, the data label is moved inside the plot area according to the <a href="#plotOptions.series.dataLabels.overflow">overflow</a> option.
   * @since 2.3.3
   */
  val crop: Boolean = true
  
  /**
   * Whether to defer displaying the data labels until the initial series animation has finished.
   * @since 4.0
   */
  val defer: Boolean = true
  
  /**
   * Enable or disable the data labels.
   * @since 2.3.0
   */
  val enabled: Boolean = false
  
  /**
   * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the data label. Available variables are the same as for <code>formatter</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-format/" target="_blank">Add a unit</a>
   * @since 3.0
   */
  val format: String = "{y}"
  
  /**
   * Callback JavaScript function to format the data label. Note that if a <code>format</code> is defined, the format takes precedence and the formatter is ignored. Available data are:
   * <table>
   * <tbody><tr>
   *   <td><code>this.percentage</code></td>
   *   <td>Stacked series and pies only. The point's percentage of the total.</td>
   * </tr>
   * <tr>
   *   <td><code>this.point</code></td>
   *   <td>The point object. The point name, if defined, is available 
   * through <code>this.point.name</code>.</td>
   * </tr>
   * <tr>
   *   <td><code>this.series</code>:</td>
   *   <td>The series object. The series name is available 
   * through <code>this.series.name</code>.</td>
   * </tr>
   * <tr>
   *   <td><code>this.total</code></td>
   *   <td>Stacked series only. The total value at this point's x value.</td>
   * </tr>				
   * <tr>
   *   <td><code>this.x</code>:</td>
   *   <td>The x value.</td>
   * </tr>
   * <tr>
   *   <td><code>this.y</code>:</td>
   *   <td>The y value.</td>
   * </tr>
   * </tbody></table>
   */
  val formatter: UndefOr[js.Function] = js.undefined
  
  /**
   * For points with an extent, like columns, whether to align the data label inside the box or to the actual value point. Defaults to <code>false</code> in most cases, <code>true</code> in stacked columns.
   * @since 3.0
   */
  val inside: UndefOr[Boolean] = js.undefined
  
  /**
   * How to handle data labels that flow outside the plot area. The default is <code>justify</code>, which aligns them inside the plot area. For columns and bars, this means it will be moved inside the bar. To display data labels outside the plot area, set <code>crop</code> to <code>false</code> and <code>overflow</code> to <code>"none"</code>.
   * @since 3.0.6
   */
  val overflow: String = "justify"
  
  /**
   * When either the <code>borderWidth</code> or the <code>backgroundColor</code> is set, this		is the padding within the box.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
   * @since 2.2.1
   */
  val padding: Double = 5
  
  /**
   * Whether to reserve space for the labels. This can be turned off when for example the labels are rendered inside the plot area instead of outside.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/labels-reservespace/" target="_blank">No reserved space, labels inside plot</a>.
   * @since 4.1.10
   */
  val reserveSpace: Boolean = true
  
  /**
   * Text rotation in degrees. Note that due to a more complex structure, backgrounds, borders and padding will be lost on a rotated data label.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/" target="_blank">Vertical labels</a>
   */
  val rotation: Double = 0
  
  /**
   * The shadow of the box. Works best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
   * @since 2.2.1
   */
  val shadow: js.Any = false
  
  /**
   * The name of a symbol to use for the border around the label. Symbols are predefined functions on the Renderer object.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-shape/" target="_blank">A callout for annotations</a>
   * @since 4.1.2
   */
  val shape: String = "square"
  
  /**
   * Styles for the label.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-style/" target="_blank">Bold labels</a>
   * @since 4.1.0
   */
  val style: js.Object = js.eval("{\"color\": \"contrast\", \"fontSize\": \"11px\", \"fontWeight\": \"bold\", \"textShadow\": \"0 0 6px contrast, 0 0 3px contrast\" }").asInstanceOf[js.Object]
  
  /**
   * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
   */
  val useHTML: Boolean = false
  
  /**
   * The vertical alignment of the data label.
   */
  val verticalAlign: String = "top"
  
  /**
   * The x position offset of the label relative to the point. 
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/" target="_blank">Vertical and positioned</a>
   */
  val x: Double = 0
  
  /**
   * The y position offset of the label relative to the center of the gauge. 
   * @since 2.3.0
   */
  val y: Double = 15
  
  /**
   * The Z index of the data labels. A value of 2 display them behind the dial.
   * @since 2.1.5
   */
  val zIndex: Double = 2
}
