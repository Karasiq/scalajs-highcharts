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
  * @note JavaScript name: <code>plotOptions-mapbubble-dataLabels</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMapbubbleDataLabels extends js.Object {

  /**
    * The alignment of the data label compared to the point.  If <code>right</code>, the right side of the label should be touching the point. For points with an extent, like map areas, the alignments also dictates how to align it inside the box, as given with the <a href="#plotOptions.column.dataLabels.inside">inside</a> option. Can be one of "left", "center" or "right".
    * @example <a href="http://jsfiddle.net/highcharts/72sbw0Lz/">Understand alignment to boxes, lines and points</a>.
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * Whether to allow data labels to overlap. To make the labels less sensitive for overlapping, the <a href="#plotOptions.series.dataLabels.padding">dataLabels.padding</a> can be set to 0.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-allowoverlap-false/" target="_blank">Don't allow overlap</a>
    * @since 1.1.0
    */
  val allowOverlap: js.UndefOr[Boolean] = js.undefined

  /**
    * The background color or gradient for the data label. Defaults to <code>undefined</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border color for the data label. Defaults to <code>undefined</code>.
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border radius in pixels for the data label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The border width in pixels for the data label.
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * A class name for the data label. Particularly in <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, this can be used to give each series' or point's data label unique styling. In addition to this option, a default color class name is added so that we can give the labels a <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/data-label-contrast/">contrast text shadow</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels/" target="_blank">Styling by CSS</a>.
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * The text color for the data labels. Defaults to <code>null</code>. Note that data labels in Highmaps by default have a <code>style.HcTextStroke</code> in order to make the text readable against any background. When the color is changed, it is also recommended to change this.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/demo/color-axis/" target="_blank">White data labels</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Whether to hide data labels that are outside the plot area. By default, the data label is moved inside the plot area according to the <a href="#plotOptions.series.dataLabels.overflow">overflow</a> option.
    */
  val crop: js.UndefOr[Boolean] = js.undefined

  /**
    * Enable or disable the data labels.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/demo/color-axis/" target="_blank">Data labels enabled</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the data label. Available variables are the same as for <code>formatter</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-format/" target="_blank">Formatted value in the data label</a>
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-format/" target="_blank">Formatted value</a>
    */
  val formatter: js.UndefOr[js.Function] = js.undefined

  /**
    * How to handle data labels that flow outside the plot area. The default is <code>justify</code>, which aligns them inside the plot area. For columns and bars, this means it will be moved inside the bar. To display data labels outside the plot area, set <code>crop</code> to <code>false</code> and <code>overflow</code> to <code>"none"</code>.
    */
  val overflow: js.UndefOr[String] = js.undefined

  /**
    * When either the <code>borderWidth</code> or the <code>backgroundColor</code> is set, this		is the padding within the box.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-box/" target="_blank">Data labels box options</a>
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-shape/" target="_blank">A callout for annotations (Highcharts demo)</a>
    * @since 1.1.2
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * Styles for the label. Note that changes in the text color should be accompanied with changes in <code>HcTextStroke</code> in order for the text to stand out against the background.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/demo/color-axis/" target="_blank">Bold labels</a>
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

object PlotOptionsMapbubbleDataLabels {
  /**
    * @param align The alignment of the data label compared to the point.  If <code>right</code>, the right side of the label should be touching the point. For points with an extent, like map areas, the alignments also dictates how to align it inside the box, as given with the <a href="#plotOptions.column.dataLabels.inside">inside</a> option. Can be one of "left", "center" or "right".
    * @param allowOverlap Whether to allow data labels to overlap. To make the labels less sensitive for overlapping, the <a href="#plotOptions.series.dataLabels.padding">dataLabels.padding</a> can be set to 0.
    * @param backgroundColor The background color or gradient for the data label. Defaults to <code>undefined</code>.
    * @param borderColor The border color for the data label. Defaults to <code>undefined</code>.
    * @param borderRadius The border radius in pixels for the data label.
    * @param borderWidth The border width in pixels for the data label.
    * @param className A class name for the data label. Particularly in <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, this can be used to give each series' or point's data label unique styling. In addition to this option, a default color class name is added so that we can give the labels a <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/data-label-contrast/">contrast text shadow</a>.
    * @param color The text color for the data labels. Defaults to <code>null</code>. Note that data labels in Highmaps by default have a <code>style.HcTextStroke</code> in order to make the text readable against any background. When the color is changed, it is also recommended to change this.
    * @param crop Whether to hide data labels that are outside the plot area. By default, the data label is moved inside the plot area according to the <a href="#plotOptions.series.dataLabels.overflow">overflow</a> option.
    * @param enabled Enable or disable the data labels.
    * @param format A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for the data label. Available variables are the same as for <code>formatter</code>.
    * @param formatter Callback JavaScript function to format the data label. Note that if a <code>format</code> is defined, the format takes precedence and the formatter is ignored. Available data are:. <table>. <tbody>. <tr>.   <td><code>this.point</code></td>.   <td>The point object. The point name, if defined, is available . through <code>this.point.name</code>.</td>. </tr>. <tr>.   <td><code>this.series</code>:</td>.   <td>The series object. The series name is available . through <code>this.series.name</code>.</td>. </tr>. </tbody></table>
    * @param overflow How to handle data labels that flow outside the plot area. The default is <code>justify</code>, which aligns them inside the plot area. For columns and bars, this means it will be moved inside the bar. To display data labels outside the plot area, set <code>crop</code> to <code>false</code> and <code>overflow</code> to <code>"none"</code>.
    * @param padding When either the <code>borderWidth</code> or the <code>backgroundColor</code> is set, this		is the padding within the box.
    * @param rotation Text rotation in degrees. Note that due to a more complex structure, backgrounds, borders and padding will be lost on a rotated data label.
    * @param shadow The shadow of the box. Works best with <code>borderWidth</code> or <code>backgroundColor</code>. The shadow can also be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @param shape The name of a symbol to use for the border around the label. Symbols are predefined functions on the Renderer object.
    * @param style Styles for the label. Note that changes in the text color should be accompanied with changes in <code>HcTextStroke</code> in order for the text to stand out against the background.
    * @param useHTML Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    * @param verticalAlign The vertical alignment of a data label. Can be one of <code>top</code>, <code>middle</code> or <code>bottom</code>. 
    * @param x The x position offset of the label relative to the point. 
    * @param y The y position offset of the label relative to the point. 
    * @param zIndex The Z index of the data labels. The default Z index puts it above the series. Use a Z index of 2 to display it behind the series.
    */
  def apply(align: js.UndefOr[String] = js.undefined, allowOverlap: js.UndefOr[Boolean] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, crop: js.UndefOr[Boolean] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, format: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Function] = js.undefined, overflow: js.UndefOr[String] = js.undefined, padding: js.UndefOr[Double] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, shape: js.UndefOr[String] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[js.Any] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): PlotOptionsMapbubbleDataLabels = {
    val alignOuter: js.UndefOr[String] = align
    val allowOverlapOuter: js.UndefOr[Boolean] = allowOverlap
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderRadiusOuter: js.UndefOr[Double] = borderRadius
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val cropOuter: js.UndefOr[Boolean] = crop
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val formatOuter: js.UndefOr[String] = format
    val formatterOuter: js.UndefOr[js.Function] = formatter
    val overflowOuter: js.UndefOr[String] = overflow
    val paddingOuter: js.UndefOr[Double] = padding
    val rotationOuter: js.UndefOr[Double] = rotation
    val shadowOuter: js.UndefOr[Boolean | js.Object] = shadow
    val shapeOuter: js.UndefOr[String] = shape
    val styleOuter: js.UndefOr[js.Object] = style
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val verticalAlignOuter: js.Any = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val zIndexOuter: js.UndefOr[Double] = zIndex
    new PlotOptionsMapbubbleDataLabels {
      override val align: js.UndefOr[String] = alignOuter
      override val allowOverlap: js.UndefOr[Boolean] = allowOverlapOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderRadius: js.UndefOr[Double] = borderRadiusOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val crop: js.UndefOr[Boolean] = cropOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val format: js.UndefOr[String] = formatOuter
      override val formatter: js.UndefOr[js.Function] = formatterOuter
      override val overflow: js.UndefOr[String] = overflowOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val rotation: js.UndefOr[Double] = rotationOuter
      override val shadow: js.UndefOr[Boolean | js.Object] = shadowOuter
      override val shape: js.UndefOr[String] = shapeOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val verticalAlign: js.Any = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    }
  }
}
