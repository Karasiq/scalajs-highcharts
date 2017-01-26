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
  * @note JavaScript name: <code>series&lt;bar&gt;-dataLabels</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBarDataLabels extends js.Object {

  /**
    * Alignment of the data label relative to the data point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bar-datalabels-align-inside-bar/" target="_blank">Data labels inside the bar</a>
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * Whether to allow data labels to overlap. To make the labels less sensitive for overlapping, the <a href="#plotOptions.series.dataLabels.padding">dataLabels.padding</a> can be set to 0.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-allowoverlap-false/" target="_blank">Don't allow overlap</a>
    * @since 4.1.0
    */
  val allowOverlap: js.UndefOr[Boolean] = js.undefined

  /**
    * The background color or gradient for the data label. Defaults to <code>undefined</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    * @since 2.2.1
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border color for the data label. Defaults to <code>undefined</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    * @since 2.2.1
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border radius in pixels for the data label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    * @since 2.2.1
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The border width in pixels for the data label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    * @since 2.2.1
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * A class name for the data label. Particularly in <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, this can be used to give each series' or point's data label unique styling. In addition to this option, a default color class name is added so that we can give the labels a <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/data-label-contrast/">contrast text shadow</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels/" target="_blank">Styling by CSS</a>.
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * The text color for the data labels. Defaults to <code>null</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-color/" target="_blank">Red data labels</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-enabled/" target="_blank">Data labels enabled</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the data label. Available variables are the same as for <code>formatter</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-format/" target="_blank">Add a unit</a>
    * @since 3.0
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
    * @since 3.0
    */
  val inside: js.UndefOr[Boolean] = js.undefined

  /**
    * How to handle data labels that flow outside the plot area. The default is <code>justify</code>, which aligns them inside the plot area. For columns and bars, this means it will be moved inside the bar. To display data labels outside the plot area, set <code>crop</code> to <code>false</code> and <code>overflow</code> to <code>"none"</code>.
    * @since 3.0.6
    */
  val overflow: js.UndefOr[String] = js.undefined

  /**
    * When either the <code>borderWidth</code> or the <code>backgroundColor</code> is set, this		is the padding within the box.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    * @since 2.2.1
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * Text rotation in degrees. Note that due to a more complex structure, backgrounds, borders and padding will be lost on a rotated data label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/" target="_blank">Vertical labels</a>
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * The shadow of the box. Works best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    * @since 2.2.1
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * The name of a symbol to use for the border around the label. Symbols are predefined functions on the Renderer object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-shape/" target="_blank">A callout for annotations</a>
    * @since 4.1.2
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * Styles for the label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-style/" target="_blank">Bold labels</a>
    * @since 4.1.0
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * The vertical alignment of a data label. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. The default value depends on the data, for instance in a column chart, the label is above positive values and below negative values.
    * @since 2.3.3
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * The x position of the data label relative to the data point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bar-datalabels-align-inside-bar/" target="_blank">Data labels inside the bar</a>
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The y position offset of the label relative to the point. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/" target="_blank">Vertical and positioned</a>
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * The Z index of the data labels. The default Z index puts it above the series. Use a Z index of 2 to display it behind the series.
    * @since 2.3.5
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object SeriesBarDataLabels {
  /**
    * @param align Alignment of the data label relative to the data point.
    * @param allowOverlap Whether to allow data labels to overlap. To make the labels less sensitive for overlapping, the <a href="#plotOptions.series.dataLabels.padding">dataLabels.padding</a> can be set to 0.
    * @param backgroundColor The background color or gradient for the data label. Defaults to <code>undefined</code>.
    * @param borderColor The border color for the data label. Defaults to <code>undefined</code>.
    * @param borderRadius The border radius in pixels for the data label.
    * @param borderWidth The border width in pixels for the data label.
    * @param className A class name for the data label. Particularly in <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, this can be used to give each series' or point's data label unique styling. In addition to this option, a default color class name is added so that we can give the labels a <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/data-label-contrast/">contrast text shadow</a>.
    * @param color The text color for the data labels. Defaults to <code>null</code>.
    * @param crop Whether to hide data labels that are outside the plot area. By default, the data label is moved inside the plot area according to the <a href="#plotOptions.series.dataLabels.overflow">overflow</a> option.
    * @param defer Whether to defer displaying the data labels until the initial series animation has finished.
    * @param enabled Enable or disable the data labels.
    * @param format A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the data label. Available variables are the same as for <code>formatter</code>.
    * @param formatter Callback JavaScript function to format the data label. Note that if a <code>format</code> is defined, the format takes precedence and the formatter is ignored. Available data are:. <table>. <tbody><tr>.   <td><code>this.percentage</code></td>.   <td>Stacked series and pies only. The point's percentage of the total.</td>. </tr>. <tr>.   <td><code>this.point</code></td>.   <td>The point object. The point name, if defined, is available . through <code>this.point.name</code>.</td>. </tr>. <tr>.   <td><code>this.series</code>:</td>.   <td>The series object. The series name is available . through <code>this.series.name</code>.</td>. </tr>. <tr>.   <td><code>this.total</code></td>.   <td>Stacked series only. The total value at this point's x value.</td>. </tr>				. <tr>.   <td><code>this.x</code>:</td>.   <td>The x value.</td>. </tr>. <tr>.   <td><code>this.y</code>:</td>.   <td>The y value.</td>. </tr>. </tbody></table>
    * @param inside For points with an extent, like columns, whether to align the data label inside the box or to the actual value point. Defaults to <code>false</code> in most cases, <code>true</code> in stacked columns.
    * @param overflow How to handle data labels that flow outside the plot area. The default is <code>justify</code>, which aligns them inside the plot area. For columns and bars, this means it will be moved inside the bar. To display data labels outside the plot area, set <code>crop</code> to <code>false</code> and <code>overflow</code> to <code>"none"</code>.
    * @param padding When either the <code>borderWidth</code> or the <code>backgroundColor</code> is set, this		is the padding within the box.
    * @param rotation Text rotation in degrees. Note that due to a more complex structure, backgrounds, borders and padding will be lost on a rotated data label.
    * @param shadow The shadow of the box. Works best with <code>borderWidth</code> or <code>backgroundColor</code>. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @param shape The name of a symbol to use for the border around the label. Symbols are predefined functions on the Renderer object.
    * @param style Styles for the label.
    * @param useHTML Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    * @param verticalAlign The vertical alignment of a data label. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. The default value depends on the data, for instance in a column chart, the label is above positive values and below negative values.
    * @param x The x position of the data label relative to the data point.
    * @param y The y position offset of the label relative to the point. 
    * @param zIndex The Z index of the data labels. The default Z index puts it above the series. Use a Z index of 2 to display it behind the series.
    */
  def apply(align: js.UndefOr[String] = js.undefined, allowOverlap: js.UndefOr[Boolean] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, crop: js.UndefOr[Boolean] = js.undefined, defer: js.UndefOr[Boolean] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, format: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Function] = js.undefined, inside: js.UndefOr[Boolean] = js.undefined, overflow: js.UndefOr[String] = js.undefined, padding: js.UndefOr[Double] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, shape: js.UndefOr[String] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): SeriesBarDataLabels = {
    val alignOuter: js.UndefOr[String] = align
    val allowOverlapOuter: js.UndefOr[Boolean] = allowOverlap
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderRadiusOuter: js.UndefOr[Double] = borderRadius
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val cropOuter: js.UndefOr[Boolean] = crop
    val deferOuter: js.UndefOr[Boolean] = defer
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val formatOuter: js.UndefOr[String] = format
    val formatterOuter: js.UndefOr[js.Function] = formatter
    val insideOuter: js.UndefOr[Boolean] = inside
    val overflowOuter: js.UndefOr[String] = overflow
    val paddingOuter: js.UndefOr[Double] = padding
    val rotationOuter: js.UndefOr[Double] = rotation
    val shadowOuter: js.UndefOr[Boolean | js.Object] = shadow
    val shapeOuter: js.UndefOr[String] = shape
    val styleOuter: js.UndefOr[js.Object] = style
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val zIndexOuter: js.UndefOr[Double] = zIndex
    new SeriesBarDataLabels {
      override val align: js.UndefOr[String] = alignOuter
      override val allowOverlap: js.UndefOr[Boolean] = allowOverlapOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderRadius: js.UndefOr[Double] = borderRadiusOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val crop: js.UndefOr[Boolean] = cropOuter
      override val defer: js.UndefOr[Boolean] = deferOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val format: js.UndefOr[String] = formatOuter
      override val formatter: js.UndefOr[js.Function] = formatterOuter
      override val inside: js.UndefOr[Boolean] = insideOuter
      override val overflow: js.UndefOr[String] = overflowOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val rotation: js.UndefOr[Double] = rotationOuter
      override val shadow: js.UndefOr[Boolean | js.Object] = shadowOuter
      override val shape: js.UndefOr[String] = shapeOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    }
  }
}
