/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;columnrange&gt;-dataLabels</code>
  */
@js.annotation.ScalaJSDefined
class SeriesColumnrangeDataLabels extends js.Object {

  /**
    * The alignment of the data label compared to the point.  If <code>right</code>, the right side of the label should be touching the point. For points with an extent, like columns, the alignments also dictates how to align it inside the box, as given with the <a href="#plotOptions.column.dataLabels.inside">inside</a> option. Can be one of "left", "center" or "right".
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * Whether to allow data labels to overlap. To make the labels less sensitive for overlapping, the <a href="#plotOptions.series.dataLabels.padding">dataLabels.padding</a> can be set to 0.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-allowoverlap-false/" target="_blank">Don't allow overlap</a>
    * @since 2.1.0
    */
  val allowOverlap: js.UndefOr[Boolean] = js.undefined

  /**
    * The border color for the data label. Defaults to <code>undefined</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    * @since 1.1.6
    */
  val borderColor: js.UndefOr[String] = js.undefined

  /**
    * The border radius in pixels for the data label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    * @since 1.1.6
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The border width in pixels for the data label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    * @since 1.1.6
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * The text color for the data labels. Defaults to <code>null</code>.
    */
  val color: js.UndefOr[String] = js.undefined

  /**
    * Whether to hide data labels that are outside the plot area. By default, the data label is moved inside the plot area according to the <a href="#plotOptions.series.dataLabels.overflow">overflow</a> option.
    * @since 2.3.3
    */
  val crop: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to defer displaying the data labels until the initial series animation has finished.
    * @since 4.0
    */
  val defer: js.UndefOr[Boolean] = js.undefined

  /**
    * Enable or disable the data labels.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the data label. Available variables are the same as for <code>formatter</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-format/" target="_blank">Add a unit</a>
    * @since 1.3
    */
  val format: js.UndefOr[String] = js.undefined

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
  val formatter: js.UndefOr[js.Function] = js.undefined

  /**
    * For points with an extent, like columns, whether to align the data label inside the box or to the actual value point. Defaults to <code>false</code> in most cases, <code>true</code> in stacked columns.
    * @since 1.3
    */
  val inside: js.UndefOr[Boolean] = js.undefined

  /**
    * How to handle data labels that flow outside the plot area. The default is <code>justify</code>, which aligns them inside the plot area. For columns and bars, this means it will be moved inside the bar. To display data labels outside the plot area, set <code>crop</code> to <code>false</code> and <code>overflow</code> to <code>"none"</code>.
    * @since 1.3.6
    */
  val overflow: js.UndefOr[String] = js.undefined

  /**
    * When either the <code>borderWidth</code> or the <code>backgroundColor</code> is set, this
    *  is the padding within the box.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    * @since 1.1.6
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * Text rotation in degrees. Note that due to a more complex structure, backgrounds, borders and padding will be lost on a rotated data label.
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * The shadow of the box. Works best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 1.1.7 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    * @since 1.1.6
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * The name of a symbol to use for the border around the label. Symbols are predefined functions on the Renderer object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-shape/" target="_blank">A callout for annotations</a>
    * @since 2.1.2
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * Styles for the label.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * The vertical alignment of a data label. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. The default value depends on the data, for instance in a column chart, the label is above positive values and below negative values.
    * @since 1.1
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * X offset of the higher data labels relative to the point value.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/arearange-datalabels/" target="_blank">Data labels on range series</a>
    * @since 1.2.0
    */
  val xHigh: js.UndefOr[Double] = js.undefined

  /**
    * X offset of the lower data labels relative to the point value.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/arearange-datalabels/" target="_blank">Data labels on range series</a>
    * @since 1.2.0
    */
  val xLow: js.UndefOr[Double] = js.undefined

  /**
    * Y offset of the higher data labels relative to the point value.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/arearange-datalabels/" target="_blank">Data labels on range series</a>
    * @since 1.2.0
    */
  val yHigh: js.UndefOr[Double] = js.undefined

  /**
    * Y offset of the lower data labels relative to the point value.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/arearange-datalabels/" target="_blank">Data labels on range series</a>
    * @since 1.2.0
    */
  val yLow: js.UndefOr[Double] = js.undefined

  /**
    * The Z index of the data labels. The default Z index puts it above the series. Use a Z index of 2 to display it behind the series.
    * @since 1.2.5
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}
