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
  * @note JavaScript name: <code>series&lt;momentum&gt;-dataLabels</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMomentumDataLabels extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The alignment of the data label compared to the point. If <code>right</code>,
    * the right side of the label should be touching the point. For
    * points with an extent, like columns, the alignments also dictates
    * how to align it inside the box, as given with the
    * <a href="#plotOptions.column.dataLabels.inside">inside</a> option. Can be one of
    * <code>left</code>, <code>center</code> or <code>right</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-align-left/">Left aligned</a>
    * @since 6.0.0
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>Callback JavaScript function to format the data label. Note that if a
    * <code>format</code> is defined, the format takes precedence and the formatter is
    * ignored. Available data are:</p>
    * <table>
    * 
    * <tbody>
    * 
    * <tr>
    * 
    * <td>`this.percentage`</td>
    * 
    * <td>Stacked series and pies only. The point's percentage of the
    * total.</td>
    * 
    * </tr>
    * 
    * <tr>
    * 
    * <td>`this.point`</td>
    * 
    * <td>The point object. The point name, if defined, is available
    * through `this.point.name`.</td>
    * 
    * </tr>
    * 
    * <tr>
    * 
    * <td>`this.series`:</td>
    * 
    * <td>The series object. The series name is available through
    * `this.series.name`.</td>
    * 
    * </tr>
    * 
    * <tr>
    * 
    * <td>`this.total`</td>
    * 
    * <td>Stacked series only. The total value at this point's x value.
    * </td>
    * 
    * </tr>
    * 
    * <tr>
    * 
    * <td>`this.x`:</td>
    * 
    * <td>The x value.</td>
    * 
    * </tr>
    * 
    * <tr>
    * 
    * <td>`this.y`:</td>
    * 
    * <td>The y value.</td>
    * 
    * </tr>
    * 
    * </tbody>
    * 
    * </table>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-format/">Formatted value</a>
    * @since 6.0.0
    */
  val formatter: js.Any = js.undefined

  /**
    * <p>Styles for the label. The default <code>color</code> setting is <code>&quot;contrast&quot;</code>,
    * which is a pseudo color that Highcharts picks up and applies the
    * maximum contrast to the underlying point item, for example the
    * bar in a bar chart.</p>
    * <p>The <code>textOutline</code> is a pseudo property that
    * applies an outline of the given width with the given color, which
    * by default is the maximum contrast to the text. So a bright text
    * color will result in a black text outline for maximum readability
    * on a mixed background. In some cases, especially with grayscale
    * text, the text outline doesn&#39;t work well, in which cases it can
    * be disabled by setting it to <code>&quot;none&quot;</code>. When <code>useHTML</code> is true, the
    * <code>textOutline</code> will not be picked up. In this, case, the same effect
    * can be acheived through the <code>text-shadow</code> CSS property.</p>
    * <p>For some series types, where each point has an extent, like for
    * example tree maps, the data label may overflow the point. There are
    * two strategies for handling overflow. By default, the text will wrap
    * to multiple lines. The other strategy is to set
    * <code>style.textOverflow</code> to <code>ellipsis</code>, which will keep the text on one
    * line plus it will break inside long words.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-style/">Bold labels</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/color-axis/">Bold labels</a>
    * @since 4.1.0
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The vertical alignment of a data label. Can be one of <code>top</code>, <code>middle</code>
    * or <code>bottom</code>. The default value depends on the data, for instance
    * in a column chart, the label is above positive values and below
    * negative values.</p>
    * @since 2.3.3
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The x position offset of the label relative to the point in pixels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/">Vertical and positioned</a>
    * @since 6.0.0
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position offset of the label relative to the point in pixels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/">Vertical and positioned</a>
    * @since 6.0.0
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * <p>When either the <code>borderWidth</code> or the <code>backgroundColor</code> is set,
    * this is the padding within the box.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-box/">Data labels box options</a>
    * @since 2.2.1
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to allow data labels to overlap. To make the labels less
    * sensitive for overlapping, the <a href="#plotOptions.series.dataLabels.padding">dataLabels.padding</a> can be set to 0.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-allowoverlap-false/">Don't allow overlap</a>
    * @since 4.1.0
    */
  val allowOverlap: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The border radius in pixels for the data label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-box/">Data labels box options</a>
    * @since 2.2.1
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border width in pixels for the data label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
    * @since 2.2.1
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>A class name for the data label. Particularly in styled mode, this
    * can be used to give each series&#39; or point&#39;s data label unique
    * styling. In addition to this option, a default color class name is
    * added so that we can give the labels a
    * <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/data-label-contrast/">contrast text shadow</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels/">Styling by CSS</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels/">Styling by CSS</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels/">Styling by CSS</a>
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * <p>The text color for the data labels. Defaults to <code>undefined</code>. For
    * certain series types, like column or map, the data labels can be
    * drawn inside the points. In this case the data label will be drawn
    * with maximum contrast by default. Additionally, it will be given a
    * <code>text-outline</code> style with the opposite color, to further increase the
    * contrast. This can be overridden by setting the <code>text-outline</code> style
    * to <code>none</code> in the <code>dataLabels.style</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-color/">Red data labels</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/color-axis/">White data labels</a>
    * @since 6.0.0
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Whether to hide data labels that are outside the plot area. By
    * default, the data label is moved inside the plot area according to
    * the <a href="#plotOptions.series.dataLabels.overflow">overflow</a> option.</p>
    * @since 2.3.3
    */
  val crop: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to defer displaying the data labels until the initial series
    * animation has finished.</p>
    * @since 4.0
    */
  val defer: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enable or disable the data labels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-enabled/">Data labels enabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/color-axis/">Data labels enabled</a>
    * @since 6.0.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a>
    * for the data label. Available variables are the same as for
    * <code>formatter</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-format/">Add a unit</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-format/">Formatted value in the data label</a>
    * @since 3.0
    */
  val format: js.UndefOr[String] = js.undefined

  /**
    * <p>The name of a symbol to use for the border around the label. Symbols
    * are predefined functions on the Renderer object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-shape/">A callout for annotations</a>
    * @since 4.1.2
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * <p>The Z index of the data labels. The default Z index puts it above
    * the series. Use a Z index of 2 to display it behind the series.</p>
    * @since 2.3.5
    */
  val zIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>A declarative filter for which data labels to display. The
    * declarative filter is designed for use when callback functions are
    * not available, like when the chart options require a pure JSON
    * structure or for use with graphical editors. For programmatic
    * control, use the <code>formatter</code> instead, and return <code>undefined</code> to
    * disable a single data label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-monochrome">Data labels filtered by percentage</a>
    * @since 6.0.3
    */
  val filter: js.Any = js.undefined

  /**
    * <p>The background color or gradient for the data label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-box/">Data labels box options</a>
    * @since 2.2.1
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border color for the data label. Defaults to <code>undefined</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
    * @since 2.2.1
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The shadow of the box. Works best with <code>borderWidth</code> or
    * <code>backgroundColor</code>. Since 2.3 the shadow can be an object
    * configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and
    * <code>width</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
    * @since 2.2.1
    */
  val shadow: js.UndefOr[Boolean | js.Any] = js.undefined

  /**
    * <p>For points with an extent, like columns or map areas, whether to
    * align the data label inside the box or to the actual value point.
    * Defaults to <code>false</code> in most cases, <code>true</code> in stacked columns.</p>
    * @since 3.0
    */
  val inside: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>How to handle data labels that flow outside the plot area. The
    * default is <code>&quot;justify&quot;</code>, which aligns them inside the plot area. For
    * columns and bars, this means it will be moved inside the bar. To
    * display data labels outside the plot area, set <code>crop</code> to <code>false</code> and
    * <code>overflow</code> to <code>&quot;allow&quot;</code>.</p>
    * @since 3.0.6
    */
  val overflow: js.UndefOr[String] = js.undefined

  /**
    * <p>Text rotation in degrees. Note that due to a more complex structure,
    * backgrounds, borders and padding will be lost on a rotated data
    * label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/">Vertical labels</a>
    * @since 6.0.0
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to
    * <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>
    * to render the labels.</p>
    * @since 6.0.0
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined
}

object SeriesMomentumDataLabels {
  /**
    * @param align <p>The alignment of the data label compared to the point. If <code>right</code>,. the right side of the label should be touching the point. For. points with an extent, like columns, the alignments also dictates. how to align it inside the box, as given with the. <a href="#plotOptions.column.dataLabels.inside">inside</a> option. Can be one of. <code>left</code>, <code>center</code> or <code>right</code>.</p>
    * @param formatter <p>Callback JavaScript function to format the data label. Note that if a. <code>format</code> is defined, the format takes precedence and the formatter is. ignored. Available data are:</p>. <table>. . <tbody>. . <tr>. . <td>`this.percentage`</td>. . <td>Stacked series and pies only. The point's percentage of the. total.</td>. . </tr>. . <tr>. . <td>`this.point`</td>. . <td>The point object. The point name, if defined, is available. through `this.point.name`.</td>. . </tr>. . <tr>. . <td>`this.series`:</td>. . <td>The series object. The series name is available through. `this.series.name`.</td>. . </tr>. . <tr>. . <td>`this.total`</td>. . <td>Stacked series only. The total value at this point's x value.. </td>. . </tr>. . <tr>. . <td>`this.x`:</td>. . <td>The x value.</td>. . </tr>. . <tr>. . <td>`this.y`:</td>. . <td>The y value.</td>. . </tr>. . </tbody>. . </table>
    * @param style <p>Styles for the label. The default <code>color</code> setting is <code>&quot;contrast&quot;</code>,. which is a pseudo color that Highcharts picks up and applies the. maximum contrast to the underlying point item, for example the. bar in a bar chart.</p>. <p>The <code>textOutline</code> is a pseudo property that. applies an outline of the given width with the given color, which. by default is the maximum contrast to the text. So a bright text. color will result in a black text outline for maximum readability. on a mixed background. In some cases, especially with grayscale. text, the text outline doesn&#39;t work well, in which cases it can. be disabled by setting it to <code>&quot;none&quot;</code>. When <code>useHTML</code> is true, the. <code>textOutline</code> will not be picked up. In this, case, the same effect. can be acheived through the <code>text-shadow</code> CSS property.</p>. <p>For some series types, where each point has an extent, like for. example tree maps, the data label may overflow the point. There are. two strategies for handling overflow. By default, the text will wrap. to multiple lines. The other strategy is to set. <code>style.textOverflow</code> to <code>ellipsis</code>, which will keep the text on one. line plus it will break inside long words.</p>
    * @param verticalAlign <p>The vertical alignment of a data label. Can be one of <code>top</code>, <code>middle</code>. or <code>bottom</code>. The default value depends on the data, for instance. in a column chart, the label is above positive values and below. negative values.</p>
    * @param x <p>The x position offset of the label relative to the point in pixels.</p>
    * @param y <p>The y position offset of the label relative to the point in pixels.</p>
    * @param padding <p>When either the <code>borderWidth</code> or the <code>backgroundColor</code> is set,. this is the padding within the box.</p>
    * @param allowOverlap <p>Whether to allow data labels to overlap. To make the labels less. sensitive for overlapping, the <a href="#plotOptions.series.dataLabels.padding">dataLabels.padding</a> can be set to 0.</p>
    * @param borderRadius <p>The border radius in pixels for the data label.</p>
    * @param borderWidth <p>The border width in pixels for the data label.</p>
    * @param className <p>A class name for the data label. Particularly in styled mode, this. can be used to give each series&#39; or point&#39;s data label unique. styling. In addition to this option, a default color class name is. added so that we can give the labels a. <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/data-label-contrast/">contrast text shadow</a>.</p>
    * @param color <p>The text color for the data labels. Defaults to <code>undefined</code>. For. certain series types, like column or map, the data labels can be. drawn inside the points. In this case the data label will be drawn. with maximum contrast by default. Additionally, it will be given a. <code>text-outline</code> style with the opposite color, to further increase the. contrast. This can be overridden by setting the <code>text-outline</code> style. to <code>none</code> in the <code>dataLabels.style</code> option.</p>
    * @param crop <p>Whether to hide data labels that are outside the plot area. By. default, the data label is moved inside the plot area according to. the <a href="#plotOptions.series.dataLabels.overflow">overflow</a> option.</p>
    * @param defer <p>Whether to defer displaying the data labels until the initial series. animation has finished.</p>
    * @param enabled <p>Enable or disable the data labels.</p>
    * @param format <p>A <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a>. for the data label. Available variables are the same as for. <code>formatter</code>.</p>
    * @param shape <p>The name of a symbol to use for the border around the label. Symbols. are predefined functions on the Renderer object.</p>
    * @param zIndex <p>The Z index of the data labels. The default Z index puts it above. the series. Use a Z index of 2 to display it behind the series.</p>
    * @param filter <p>A declarative filter for which data labels to display. The. declarative filter is designed for use when callback functions are. not available, like when the chart options require a pure JSON. structure or for use with graphical editors. For programmatic. control, use the <code>formatter</code> instead, and return <code>undefined</code> to. disable a single data label.</p>
    * @param backgroundColor <p>The background color or gradient for the data label.</p>
    * @param borderColor <p>The border color for the data label. Defaults to <code>undefined</code>.</p>
    * @param shadow <p>The shadow of the box. Works best with <code>borderWidth</code> or. <code>backgroundColor</code>. Since 2.3 the shadow can be an object. configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and. <code>width</code>.</p>
    * @param inside <p>For points with an extent, like columns or map areas, whether to. align the data label inside the box or to the actual value point.. Defaults to <code>false</code> in most cases, <code>true</code> in stacked columns.</p>
    * @param overflow <p>How to handle data labels that flow outside the plot area. The. default is <code>&quot;justify&quot;</code>, which aligns them inside the plot area. For. columns and bars, this means it will be moved inside the bar. To. display data labels outside the plot area, set <code>crop</code> to <code>false</code> and. <code>overflow</code> to <code>&quot;allow&quot;</code>.</p>
    * @param rotation <p>Text rotation in degrees. Note that due to a more complex structure,. backgrounds, borders and padding will be lost on a rotated data. label.</p>
    * @param useHTML <p>Whether to. <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>. to render the labels.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Any] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, padding: js.UndefOr[Double] = js.undefined, allowOverlap: js.UndefOr[Boolean] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, crop: js.UndefOr[Boolean] = js.undefined, defer: js.UndefOr[Boolean] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, format: js.UndefOr[String] = js.undefined, shape: js.UndefOr[String] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, filter: js.UndefOr[js.Any] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, shadow: js.UndefOr[Boolean | js.Any] = js.undefined, inside: js.UndefOr[Boolean] = js.undefined, overflow: js.UndefOr[String] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined): SeriesMomentumDataLabels = {
    val alignOuter: js.UndefOr[String] = align
    val formatterOuter: js.Any = formatter
    val styleOuter: js.UndefOr[js.Object] = style
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val paddingOuter: js.UndefOr[Double] = padding
    val allowOverlapOuter: js.UndefOr[Boolean] = allowOverlap
    val borderRadiusOuter: js.UndefOr[Double] = borderRadius
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val cropOuter: js.UndefOr[Boolean] = crop
    val deferOuter: js.UndefOr[Boolean] = defer
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val formatOuter: js.UndefOr[String] = format
    val shapeOuter: js.UndefOr[String] = shape
    val zIndexOuter: js.UndefOr[Double] = zIndex
    val filterOuter: js.Any = filter
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val shadowOuter: js.UndefOr[Boolean | js.Any] = shadow
    val insideOuter: js.UndefOr[Boolean] = inside
    val overflowOuter: js.UndefOr[String] = overflow
    val rotationOuter: js.UndefOr[Double] = rotation
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMomentumDataLabels {
      override val align: js.UndefOr[String] = alignOuter
      override val formatter: js.Any = formatterOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val allowOverlap: js.UndefOr[Boolean] = allowOverlapOuter
      override val borderRadius: js.UndefOr[Double] = borderRadiusOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val crop: js.UndefOr[Boolean] = cropOuter
      override val defer: js.UndefOr[Boolean] = deferOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val format: js.UndefOr[String] = formatOuter
      override val shape: js.UndefOr[String] = shapeOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
      override val filter: js.Any = filterOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val shadow: js.UndefOr[Boolean | js.Any] = shadowOuter
      override val inside: js.UndefOr[Boolean] = insideOuter
      override val overflow: js.UndefOr[String] = overflowOuter
      override val rotation: js.UndefOr[Double] = rotationOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
    })
  }
}
