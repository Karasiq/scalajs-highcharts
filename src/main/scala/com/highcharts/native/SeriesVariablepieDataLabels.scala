/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;variablepie&gt;-dataLabels</code>
  */
class SeriesVariablepieDataLabels extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Alignment method for data labels. Possible values are:</p>
    * <ul>
    * <li><p><code>toPlotEdges</code>: Each label touches the nearest vertical edge of
    * the plot area.</p>
    * </li>
    * <li><p><code>connectors</code>: Connectors have the same x position and the
    * widest label of each half (left &amp; right) touches the nearest
    * vertical edge of the plot area.</p>
    * </li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-alignto-connectors/">alignTo: connectors</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-alignto-plotedges/">alignTo: plotEdges</a>
    * @since 7.0.0
    */
  var alignTo: js.UndefOr[String] = js.undefined

  /**
    * <p>The color of the line connecting the data label to the pie slice.
    * The default color is the same as the point&#39;s color.</p>
    * <p>In styled mode, the connector stroke is given in the
    * <code>.highcharts-data-label-connector</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorcolor/">Blue connectors</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pie-point/">Styled connectors</a>
    * @since 2.1.0
    */
  var connectorColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The distance from the data label to the connector. Note that
    * data labels also have a default <code>padding</code>, so in order for the
    * connector to touch the text, the <code>padding</code> must also be 0.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorpadding/">No padding</a>
    * @since 2.1.0
    */
  var connectorPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Specifies the method that is used to generate the connector path.
    * Highcharts provides 3 built-in connector shapes: <code>&#39;fixedOffset&#39;</code>
    * (default), <code>&#39;straight&#39;</code> and <code>&#39;crookedLine&#39;</code>. Using
    * <code>&#39;crookedLine&#39;</code> has the most sense (in most of the cases) when
    * <code>&#39;alignTo&#39;</code> is set.</p>
    * <p>Users can provide their own method by passing a function instead
    * of a String. 3 arguments are passed to the callback:</p>
    * <ul>
    * <li><p>Object that holds the information about the coordinates of the
    * label (<code>x</code> &amp; <code>y</code> properties) and how the label is located in
    * relation to the pie (<code>alignment</code> property). <code>alignment</code> can by
    * one of the following:
    * <code>&#39;left&#39;</code> (pie on the left side of the data label),
    * <code>&#39;right&#39;</code> (pie on the right side of the data label) or
    * <code>&#39;center&#39;</code> (data label overlaps the pie).</p>
    * </li>
    * <li><p>Object that holds the information about the position of the
    * connector. Its <code>touchingSliceAt</code>  porperty tells the position
    * of the place where the connector touches the slice.</p>
    * </li>
    * <li><p>Data label options</p>
    * </li>
    * </ul>
    * <p>The function has to return an SVG path definition in array form
    * (see the example).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorshape-string/">connectorShape is a String</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorshape-function/">connectorShape is a function</a>
    * @since 7.0.0
    */
  var connectorShape: js.UndefOr[String | js.Function] = js.undefined

  /**
    * <p>The width of the line connecting the data label to the pie slice.</p>
    * <p>In styled mode, the connector stroke width is given in the
    * <code>.highcharts-data-label-connector</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorwidth-disabled/">Disable the connector</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pie-point/">Styled connectors</a>
    * @since 2.1.0
    */
  var connectorWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Works only if <code>connectorShape</code> is <code>&#39;crookedLine&#39;</code>. It defines how
    * far from the vertical plot edge the coonnector path should be
    * crooked.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-crookdistance/">crookDistance set to 90%</a>
    * @since 7.0.0
    */
  var crookDistance: js.UndefOr[String] = js.undefined

  /**
    * <p>The distance of the data label from the pie&#39;s edge. Negative
    * numbers put the data label on top of the pie slices. Can also be
    * defined as a percentage of pie&#39;s radius. Connectors are only
    * shown for data labels outside the pie.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-distance/">Data labels on top of the pie</a>
    * @since 2.1.0
    */
  var distance: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>Enable or disable the data labels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-enabled/">Data labels enabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/color-axis/">Data labels enabled</a>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A
    * <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a>
    * for the data label. Available variables are the same as for
    * <code>formatter</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-format/">Add a unit</a>
    * @since 3.0.0
    */
  var format: js.UndefOr[String] = js.undefined

  /**
    * <p>Callback JavaScript function to format the data label. Note that
    * if a <code>format</code> is defined, the format takes precedence and the
    * formatter is ignored.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-format/">Formatted value</a>
    */
  var formatter: js.Any = js.undefined

  /**
    * <p>Whether to render the connector as a soft arc or a line with
    * sharp break. Works only if <code>connectorShape</code> equals to
    * <code>fixedOffset</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-softconnector-true/">Soft</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-softconnector-false/">Non soft</a>
    * @since 2.1.7
    */
  var softConnector: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Styles for the label. The default <code>color</code> setting is
    * <code>&quot;contrast&quot;</code>, which is a pseudo color that Highcharts picks up
    * and applies the maximum contrast to the underlying point item,
    * for example the bar in a bar chart.</p>
    * <p>The <code>textOutline</code> is a pseudo property that applies an outline of
    * the given width with the given color, which by default is the
    * maximum contrast to the text. So a bright text color will result
    * in a black text outline for maximum readability on a mixed
    * background. In some cases, especially with grayscale text, the
    * text outline doesn&#39;t work well, in which cases it can be disabled
    * by setting it to <code>&quot;none&quot;</code>. When <code>useHTML</code> is true, the
    * <code>textOutline</code> will not be picked up. In this, case, the same
    * effect can be acheived through the <code>text-shadow</code> CSS property.</p>
    * <p>For some series types, where each point has an extent, like for
    * example tree maps, the data label may overflow the point. There
    * are two strategies for handling overflow. By default, the text
    * will wrap to multiple lines. The other strategy is to set
    * <code>style.textOverflow</code> to <code>ellipsis</code>, which will keep the text on
    * one line plus it will break inside long words.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-overflow">Long labels truncated with an ellipsis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-overflow-wrap">Long labels are wrapped</a>
    * @since 4.1.0
    */
  var style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Enable or disable the initial animation when a series is
    * displayed for the <code>dataLabels</code>. The animation can also be set as
    * a configuration object. Please note that this option only
    * applies to the initial animation.
    * For other animations, see <a href="#chart.animation">chart.animation</a>
    * and the animation parameter under the API methods.
    * The following properties are supported:</p>
    * <ul>
    * <li><code>defer</code>: The animation delay time in milliseconds.</li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/animation-defer/">Animation defer settings</a>
    * @since 8.2.0
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>The background color or gradient for the data label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-box/">Data labels box options</a>
    * @since 2.2.1
    */
  var backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border color for the data label. Defaults to <code>undefined</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
    * @since 2.2.1
    */
  var borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border radius in pixels for the data label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-box/">Data labels box options</a>
    * @since 2.2.1
    */
  var borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border width in pixels for the data label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
    * @since 2.2.1
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>A class name for the data label. Particularly in styled mode,
    * this can be used to give each series&#39; or point&#39;s data label
    * unique styling. In addition to this option, a default color class
    * name is added so that we can give the labels a contrast text
    * shadow.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/data-label-contrast/">Contrast text shadow</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels/">Styling by CSS</a>
    * @since 5.0.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>The text color for the data labels. Defaults to <code>undefined</code>. For
    * certain series types, like column or map, the data labels can be
    * drawn inside the points. In this case the data label will be
    * drawn with maximum contrast by default. Additionally, it will be
    * given a <code>text-outline</code> style with the opposite color, to further
    * increase the contrast. This can be overridden by setting the
    * <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-color/">Red data labels</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/color-axis/">White data labels</a>
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Whether to hide data labels that are outside the plot area. By
    * default, the data label is moved inside the plot area according
    * to the
    * <a href="#plotOptions.series.dataLabels.overflow">overflow</a>
    * option.</p>
    * @since 2.3.3
    */
  var crop: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to defer displaying the data labels until the initial
    * series animation has finished. Setting to <code>false</code> renders the
    * data label immediately. If set to <code>true</code> inherits the defer
    * time set in <a href="#plotOptions.series.animation">plotOptions.series.animation</a>.
    * If set to a number, a defer time is specified in milliseconds.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/animation-defer">Set defer time</a>
    * @since 4.0.0
    */
  var defer: js.UndefOr[Boolean | Double] = js.undefined

  /**
    * <p>A declarative filter to control of which data labels to display.
    * The declarative filter is designed for use when callback
    * functions are not available, like when the chart options require
    * a pure JSON structure or for use with graphical editors. For
    * programmatic control, use the <code>formatter</code> instead, and return
    * <code>undefined</code> to disable a single data label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-monochrome">Data labels filtered by percentage</a>
    * @since 6.0.3
    */
  var filter: js.Any = js.undefined

  /**
    * <p>Format for points with the value of null. Works analogously to
    * <a href="#plotOptions.series.dataLabels.format">format</a>. <code>nullFormat</code> can
    * be applied only to series which support displaying null points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-format/">Format data label and tooltip for null point.</a>
    * @since 7.1.0
    */
  var nullFormat: js.UndefOr[Boolean | String] = js.undefined

  /**
    * <p>Callback JavaScript function that defines formatting for points
    * with the value of null. Works analogously to
    * <a href="#plotOptions.series.dataLabels.formatter">formatter</a>.
    * <code>nullPointFormatter</code> can be applied only to series which support
    * displaying null points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-format/">Format data label and tooltip for null point.</a>
    * @since 7.1.0
    */
  var nullFormatter: js.Any = js.undefined

  /**
    * <p>How to handle data labels that flow outside the plot area. The
    * default is <code>&quot;justify&quot;</code>, which aligns them inside the plot area.
    * For columns and bars, this means it will be moved inside the bar.
    * To display data labels outside the plot area, set <code>crop</code> to
    * <code>false</code> and <code>overflow</code> to <code>&quot;allow&quot;</code>.</p>
    * @since 3.0.6
    */
  var overflow: js.Any = js.undefined

  /**
    * <p>When either the <code>borderWidth</code> or the <code>backgroundColor</code> is set,
    * this is the padding within the box.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-box/">Data labels box options</a>
    * @since 2.2.1
    */
  var padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Aligns data labels relative to points. If <code>center</code> alignment is
    * not possible, it defaults to <code>right</code>.</p>
    */
  var position: js.UndefOr[String] = js.undefined

  /**
    * <p>Text rotation in degrees. Note that due to a more complex
    * structure, backgrounds, borders and padding will be lost on a
    * rotated data label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/">Vertical labels</a>
    */
  var rotation: js.UndefOr[Double] = js.undefined

  /**
    * <p>The shadow of the box. Works best with <code>borderWidth</code> or
    * <code>backgroundColor</code>. Since 2.3 the shadow can be an object
    * configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code>
    * and <code>width</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
    * @since 2.2.1
    */
  var shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>The name of a symbol to use for the border around the label.
    * Symbols are predefined functions on the Renderer object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-shape/">A callout for annotations</a>
    * @since 4.1.2
    */
  var shape: js.UndefOr[String] = js.undefined

  /**
    * <p>Options for a label text which should follow marker&#39;s shape.
    * Border and background are disabled for a label that follows a
    * path.</p>
    * <p><strong>Note:</strong> Only SVG-based renderer supports this option. Setting
    * <code>useHTML</code> to true will disable this option.</p>
    * @since 7.1.0
    */
  var textPath: js.Any = js.undefined

  /**
    * <p>Whether to
    * <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>
    * to render the labels.</p>
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The vertical alignment of a data label. Can be one of <code>top</code>,
    * <code>middle</code> or <code>bottom</code>. The default value depends on the data, for
    * instance in a column chart, the label is above positive values
    * and below negative values.</p>
    * @since 2.3.3
    */
  var verticalAlign: js.UndefOr[String | Null] = js.undefined

  /**
    * <p>The x position offset of the label relative to the point in
    * pixels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/">Vertical and positioned</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bar-datalabels-align-inside-bar/">Data labels inside the bar</a>
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position offset of the label relative to the point in
    * pixels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/">Vertical and positioned</a>
    */
  var y: js.UndefOr[Double] = js.undefined

  /**
    * <p>The Z index of the data labels. The default Z index puts it above
    * the series. Use a Z index of 2 to display it behind the series.</p>
    * @since 2.3.5
    */
  var z: js.UndefOr[Double] = js.undefined

  /**
    * <p>The alignment of the data label compared to the point. If
    * <code>right</code>, the right side of the label should be touching the
    * point. For points with an extent, like columns, the alignments
    * also dictates how to align it inside the box, as given with the
    * <a href="#plotOptions.column.dataLabels.inside">inside</a>
    * option. Can be one of <code>left</code>, <code>center</code> or <code>right</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-align-left/">Left aligned</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bar-datalabels-align-inside-bar/">Data labels inside the bar</a>
    */
  var align: js.UndefOr[String | Null] = js.undefined

  /**
    * <p>Whether to allow data labels to overlap. To make the labels less
    * sensitive for overlapping, the
    * <a href="#plotOptions.series.dataLabels.padding">dataLabels.padding</a>
    * can be set to 0.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-allowoverlap-false/">Don't allow overlap</a>
    * @since 4.1.0
    */
  var allowOverlap: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>For points with an extent, like columns or map areas, whether to
    * align the data label inside the box or to the actual value point.
    * Defaults to <code>false</code> in most cases, <code>true</code> in stacked columns.</p>
    * @since 3.0.0
    */
  var inside: js.UndefOr[Boolean] = js.undefined
}

object SeriesVariablepieDataLabels {
  /**
    * @param alignTo <p>Alignment method for data labels. Possible values are:</p>. <ul>. <li><p><code>toPlotEdges</code>: Each label touches the nearest vertical edge of. the plot area.</p>. </li>. <li><p><code>connectors</code>: Connectors have the same x position and the. widest label of each half (left &amp; right) touches the nearest. vertical edge of the plot area.</p>. </li>. </ul>
    * @param connectorColor <p>The color of the line connecting the data label to the pie slice.. The default color is the same as the point&#39;s color.</p>. <p>In styled mode, the connector stroke is given in the. <code>.highcharts-data-label-connector</code> class.</p>
    * @param connectorPadding <p>The distance from the data label to the connector. Note that. data labels also have a default <code>padding</code>, so in order for the. connector to touch the text, the <code>padding</code> must also be 0.</p>
    * @param connectorShape <p>Specifies the method that is used to generate the connector path.. Highcharts provides 3 built-in connector shapes: <code>&#39;fixedOffset&#39;</code>. (default), <code>&#39;straight&#39;</code> and <code>&#39;crookedLine&#39;</code>. Using. <code>&#39;crookedLine&#39;</code> has the most sense (in most of the cases) when. <code>&#39;alignTo&#39;</code> is set.</p>. <p>Users can provide their own method by passing a function instead. of a String. 3 arguments are passed to the callback:</p>. <ul>. <li><p>Object that holds the information about the coordinates of the. label (<code>x</code> &amp; <code>y</code> properties) and how the label is located in. relation to the pie (<code>alignment</code> property). <code>alignment</code> can by. one of the following:. <code>&#39;left&#39;</code> (pie on the left side of the data label),. <code>&#39;right&#39;</code> (pie on the right side of the data label) or. <code>&#39;center&#39;</code> (data label overlaps the pie).</p>. </li>. <li><p>Object that holds the information about the position of the. connector. Its <code>touchingSliceAt</code>  porperty tells the position. of the place where the connector touches the slice.</p>. </li>. <li><p>Data label options</p>. </li>. </ul>. <p>The function has to return an SVG path definition in array form. (see the example).</p>
    * @param connectorWidth <p>The width of the line connecting the data label to the pie slice.</p>. <p>In styled mode, the connector stroke width is given in the. <code>.highcharts-data-label-connector</code> class.</p>
    * @param crookDistance <p>Works only if <code>connectorShape</code> is <code>&#39;crookedLine&#39;</code>. It defines how. far from the vertical plot edge the coonnector path should be. crooked.</p>
    * @param distance <p>The distance of the data label from the pie&#39;s edge. Negative. numbers put the data label on top of the pie slices. Can also be. defined as a percentage of pie&#39;s radius. Connectors are only. shown for data labels outside the pie.</p>
    * @param enabled <p>Enable or disable the data labels.</p>
    * @param format <p>A. <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a>. for the data label. Available variables are the same as for. <code>formatter</code>.</p>
    * @param formatter <p>Callback JavaScript function to format the data label. Note that. if a <code>format</code> is defined, the format takes precedence and the. formatter is ignored.</p>
    * @param softConnector <p>Whether to render the connector as a soft arc or a line with. sharp break. Works only if <code>connectorShape</code> equals to. <code>fixedOffset</code>.</p>
    * @param style <p>Styles for the label. The default <code>color</code> setting is. <code>&quot;contrast&quot;</code>, which is a pseudo color that Highcharts picks up. and applies the maximum contrast to the underlying point item,. for example the bar in a bar chart.</p>. <p>The <code>textOutline</code> is a pseudo property that applies an outline of. the given width with the given color, which by default is the. maximum contrast to the text. So a bright text color will result. in a black text outline for maximum readability on a mixed. background. In some cases, especially with grayscale text, the. text outline doesn&#39;t work well, in which cases it can be disabled. by setting it to <code>&quot;none&quot;</code>. When <code>useHTML</code> is true, the. <code>textOutline</code> will not be picked up. In this, case, the same. effect can be acheived through the <code>text-shadow</code> CSS property.</p>. <p>For some series types, where each point has an extent, like for. example tree maps, the data label may overflow the point. There. are two strategies for handling overflow. By default, the text. will wrap to multiple lines. The other strategy is to set. <code>style.textOverflow</code> to <code>ellipsis</code>, which will keep the text on. one line plus it will break inside long words.</p>
    * @param animation <p>Enable or disable the initial animation when a series is. displayed for the <code>dataLabels</code>. The animation can also be set as. a configuration object. Please note that this option only. applies to the initial animation.. For other animations, see <a href="#chart.animation">chart.animation</a>. and the animation parameter under the API methods.. The following properties are supported:</p>. <ul>. <li><code>defer</code>: The animation delay time in milliseconds.</li>. </ul>
    * @param backgroundColor <p>The background color or gradient for the data label.</p>
    * @param borderColor <p>The border color for the data label. Defaults to <code>undefined</code>.</p>
    * @param borderRadius <p>The border radius in pixels for the data label.</p>
    * @param borderWidth <p>The border width in pixels for the data label.</p>
    * @param className <p>A class name for the data label. Particularly in styled mode,. this can be used to give each series&#39; or point&#39;s data label. unique styling. In addition to this option, a default color class. name is added so that we can give the labels a contrast text. shadow.</p>
    * @param color <p>The text color for the data labels. Defaults to <code>undefined</code>. For. certain series types, like column or map, the data labels can be. drawn inside the points. In this case the data label will be. drawn with maximum contrast by default. Additionally, it will be. given a <code>text-outline</code> style with the opposite color, to further. increase the contrast. This can be overridden by setting the. <code>text-outline</code> style to <code>none</code> in the <code>dataLabels.style</code> option.</p>
    * @param crop <p>Whether to hide data labels that are outside the plot area. By. default, the data label is moved inside the plot area according. to the. <a href="#plotOptions.series.dataLabels.overflow">overflow</a>. option.</p>
    * @param defer <p>Whether to defer displaying the data labels until the initial. series animation has finished. Setting to <code>false</code> renders the. data label immediately. If set to <code>true</code> inherits the defer. time set in <a href="#plotOptions.series.animation">plotOptions.series.animation</a>.. If set to a number, a defer time is specified in milliseconds.</p>
    * @param filter <p>A declarative filter to control of which data labels to display.. The declarative filter is designed for use when callback. functions are not available, like when the chart options require. a pure JSON structure or for use with graphical editors. For. programmatic control, use the <code>formatter</code> instead, and return. <code>undefined</code> to disable a single data label.</p>
    * @param nullFormat <p>Format for points with the value of null. Works analogously to. <a href="#plotOptions.series.dataLabels.format">format</a>. <code>nullFormat</code> can. be applied only to series which support displaying null points.</p>
    * @param nullFormatter <p>Callback JavaScript function that defines formatting for points. with the value of null. Works analogously to. <a href="#plotOptions.series.dataLabels.formatter">formatter</a>.. <code>nullPointFormatter</code> can be applied only to series which support. displaying null points.</p>
    * @param overflow <p>How to handle data labels that flow outside the plot area. The. default is <code>&quot;justify&quot;</code>, which aligns them inside the plot area.. For columns and bars, this means it will be moved inside the bar.. To display data labels outside the plot area, set <code>crop</code> to. <code>false</code> and <code>overflow</code> to <code>&quot;allow&quot;</code>.</p>
    * @param padding <p>When either the <code>borderWidth</code> or the <code>backgroundColor</code> is set,. this is the padding within the box.</p>
    * @param position <p>Aligns data labels relative to points. If <code>center</code> alignment is. not possible, it defaults to <code>right</code>.</p>
    * @param rotation <p>Text rotation in degrees. Note that due to a more complex. structure, backgrounds, borders and padding will be lost on a. rotated data label.</p>
    * @param shadow <p>The shadow of the box. Works best with <code>borderWidth</code> or. <code>backgroundColor</code>. Since 2.3 the shadow can be an object. configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code>. and <code>width</code>.</p>
    * @param shape <p>The name of a symbol to use for the border around the label.. Symbols are predefined functions on the Renderer object.</p>
    * @param textPath <p>Options for a label text which should follow marker&#39;s shape.. Border and background are disabled for a label that follows a. path.</p>. <p><strong>Note:</strong> Only SVG-based renderer supports this option. Setting. <code>useHTML</code> to true will disable this option.</p>
    * @param useHTML <p>Whether to. <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>. to render the labels.</p>
    * @param verticalAlign <p>The vertical alignment of a data label. Can be one of <code>top</code>,. <code>middle</code> or <code>bottom</code>. The default value depends on the data, for. instance in a column chart, the label is above positive values. and below negative values.</p>
    * @param x <p>The x position offset of the label relative to the point in. pixels.</p>
    * @param y <p>The y position offset of the label relative to the point in. pixels.</p>
    * @param z <p>The Z index of the data labels. The default Z index puts it above. the series. Use a Z index of 2 to display it behind the series.</p>
    * @param align <p>The alignment of the data label compared to the point. If. <code>right</code>, the right side of the label should be touching the. point. For points with an extent, like columns, the alignments. also dictates how to align it inside the box, as given with the. <a href="#plotOptions.column.dataLabels.inside">inside</a>. option. Can be one of <code>left</code>, <code>center</code> or <code>right</code>.</p>
    * @param allowOverlap <p>Whether to allow data labels to overlap. To make the labels less. sensitive for overlapping, the. <a href="#plotOptions.series.dataLabels.padding">dataLabels.padding</a>. can be set to 0.</p>
    * @param inside <p>For points with an extent, like columns or map areas, whether to. align the data label inside the box or to the actual value point.. Defaults to <code>false</code> in most cases, <code>true</code> in stacked columns.</p>
    */
  def apply(alignTo: js.UndefOr[String] = js.undefined, connectorColor: js.UndefOr[String | js.Object] = js.undefined, connectorPadding: js.UndefOr[Double] = js.undefined, connectorShape: js.UndefOr[String | js.Function] = js.undefined, connectorWidth: js.UndefOr[Double] = js.undefined, crookDistance: js.UndefOr[String] = js.undefined, distance: js.UndefOr[Double | String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, format: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Any] = js.undefined, softConnector: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, crop: js.UndefOr[Boolean] = js.undefined, defer: js.UndefOr[Boolean | Double] = js.undefined, filter: js.UndefOr[js.Any] = js.undefined, nullFormat: js.UndefOr[Boolean | String] = js.undefined, nullFormatter: js.UndefOr[js.Any] = js.undefined, overflow: js.UndefOr[js.Any] = js.undefined, padding: js.UndefOr[Double] = js.undefined, position: js.UndefOr[String] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, shape: js.UndefOr[String] = js.undefined, textPath: js.UndefOr[js.Any] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String | Null] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, z: js.UndefOr[Double] = js.undefined, align: js.UndefOr[String | Null] = js.undefined, allowOverlap: js.UndefOr[Boolean] = js.undefined, inside: js.UndefOr[Boolean] = js.undefined): SeriesVariablepieDataLabels = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVariablepieDataLabels {
      this.alignTo = alignTo
      this.connectorColor = connectorColor
      this.connectorPadding = connectorPadding
      this.connectorShape = connectorShape
      this.connectorWidth = connectorWidth
      this.crookDistance = crookDistance
      this.distance = distance
      this.enabled = enabled
      this.format = format
      this.formatter = formatter
      this.softConnector = softConnector
      this.style = style
      this.animation = animation
      this.backgroundColor = backgroundColor
      this.borderColor = borderColor
      this.borderRadius = borderRadius
      this.borderWidth = borderWidth
      this.className = className
      this.color = color
      this.crop = crop
      this.defer = defer
      this.filter = filter
      this.nullFormat = nullFormat
      this.nullFormatter = nullFormatter
      this.overflow = overflow
      this.padding = padding
      this.position = position
      this.rotation = rotation
      this.shadow = shadow
      this.shape = shape
      this.textPath = textPath
      this.useHTML = useHTML
      this.verticalAlign = verticalAlign
      this.x = x
      this.y = y
      this.z = z
      this.align = align
      this.allowOverlap = allowOverlap
      this.inside = inside
    })
  }
}
