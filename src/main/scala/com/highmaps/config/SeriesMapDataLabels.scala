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
  * @note JavaScript name: <code>series&lt;map&gt;-dataLabels</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMapDataLabels extends js.Object {

  /**
    * The alignment of the data label compared to the point.  If <code>right</code>, the right side of the label should be touching the point. For points with an extent, like map areas, the alignments also dictates how to align it inside the box, as given with the <a href="#plotOptions.column.dataLabels.inside">inside</a> option. Can be one of "left", "center" or "right".
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * Whether to allow data labels to overlap. To make the labels less sensitive for overlapping, the <a href="#plotOptions.series.dataLabels.padding">dataLabels.padding</a> can be set to 0.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-allowoverlap-false/" target="_blank">Don't allow overlap</a>
    * @since 1.1.0
    */
  val allowOverlap: js.UndefOr[Boolean] = js.undefined

  /**
    * The background color or gradient for the data label. Defaults to <code>undefined</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border color for the data label. Defaults to <code>undefined</code>.
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border radius in pixels for the data label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The border width in pixels for the data label.
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * The text color for the data labels. Defaults to <code>null</code>. Note that data labels in Highmaps by default have a <code>style.HcTextStroke</code> in order to make the text readable against any background. When the color is changed, it is also recommended to change this.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/color-axis/" target="_blank">White data labels</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Whether to hide data labels that are outside the plot area. By default, the data label is moved inside the plot area according to the <a href="#plotOptions.series.dataLabels.overflow">overflow</a> option.
    */
  val crop: js.UndefOr[Boolean] = js.undefined

  /**
    * Enable or disable the data labels.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/color-axis/" target="_blank">Data labels enabled</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the data label. Available variables are the same as for <code>formatter</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-datalabels-format/" target="_blank">Formatted value in the data label</a>
    */
  val format: js.UndefOr[String] = js.undefined

  /**
    * Callback JavaScript function to format the data label. Note that if a <code>format</code> is defined, the format takes precedence and the formatter is ignored. Available data are:
    * <table>
    * <tbody>
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
    * </tbody></table>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-datalabels-format/" target="_blank">Formatted value</a>
    */
  val formatter: js.UndefOr[js.Function] = js.undefined

  /**
    * How to handle data labels that flow outside the plot area. The default is <code>justify</code>, which aligns them inside the plot area. For columns and bars, this means it will be moved inside the bar. To display data labels outside the plot area, set <code>crop</code> to <code>false</code> and <code>overflow</code> to <code>"none"</code>.
    */
  val overflow: js.UndefOr[String] = js.undefined

  /**
    * When either the <code>borderWidth</code> or the <code>backgroundColor</code> is set, this		is the padding within the box.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * Text rotation in degrees. Note that due to a more complex structure, backgrounds, borders and padding will be lost on a rotated data label.
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * The shadow of the box. Works best with <code>borderWidth</code> or <code>backgroundColor</code>. The shadow can also be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * The name of a symbol to use for the border around the label. Symbols are predefined functions on the Renderer object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-datalabels-shape/" target="_blank">A callout for annotations (Highcharts demo)</a>
    * @since 1.1.2
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * Styles for the label. Note that changes in the text color should be accompanied with changes in <code>HcTextStroke</code> in order for the text to stand out against the background.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/color-axis/" target="_blank">Bold labels</a>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * The vertical alignment of a data label. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. 
    */
  val verticalAlign: js.Any = js.undefined

  /**
    * The x position offset of the label relative to the point. 
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The y position offset of the label relative to the point. 
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * The Z index of the data labels. The default Z index puts it above the series. Use a Z index of 2 to display it behind the series.
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}
