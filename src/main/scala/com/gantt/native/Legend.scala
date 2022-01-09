/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>legend</code>
  */
class Legend extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Accessibility options for the legend. Requires the Accessibility
    * module.</p>
    * @since 7.1.0
    */
  var accessibility: js.Any = js.undefined

  /**
    * <p>The horizontal alignment of the legend box within the chart area.
    * Valid values are <code>left</code>, <code>center</code> and <code>right</code>.</p>
    * <p>In the case that the legend is aligned in a corner position, the
    * <code>layout</code> option will determine whether to place it above/below
    * or on the side of the plot area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/align/">Legend at the right of the chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/">Various legend options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/alignment/">Legend alignment</a>
    * @since 2.0.0
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>If the <a href="legend.layout">layout</a> is <code>horizontal</code> and the legend items
    * span over two lines or more, whether to align the items into vertical
    * columns. Setting this to <code>false</code> makes room for more items, but will
    * look more messy.</p>
    * @since 6.1.0
    */
  var alignColumns: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The background color of the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/backgroundcolor/">Yellowish background</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/">Various legend options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/border-background/">Border and background options</a>
    */
  var backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the drawn border around the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/bordercolor/">Brown border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/">Various legend options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/border-background/">Border and background options</a>
    */
  var borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border corner radius of the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/borderradius-default/">Square by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/borderradius-round/">5px rounded</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/border-background/">Border and background options</a>
    */
  var borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The width of the drawn border around the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/borderwidth/">2px border width</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/">Various legend options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/border-background/">Border and background options</a>
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The bubble legend is an additional element in legend which
    * presents the scale of the bubble series. Individual bubble ranges
    * can be defined by user or calculated from series. In the case of
    * automatically calculated ranges, a 1px margin of error is
    * permitted.</p>
    * @since 7.0.0
    */
  var bubbleLegend: js.Any = js.undefined

  /**
    * <p>A CSS class name to apply to the legend group.</p>
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable the legend. There is also a series-specific option,
    * <a href="#plotOptions.series.showInLegend">showInLegend</a>, that can hide the
    * series from the legend. In some series types this is <code>false</code> by
    * default, so it must set to <code>true</code> in order to show the legend for the
    * series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/enabled-false/">Legend disabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/">Various legend options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/enabled-false/">Legend disabled</a>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When the legend is floating, the plot area ignores it and is allowed
    * to be placed below it.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/floating-false/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/floating-true/">True</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/alignment/">Floating legend</a>
    * @since 2.1.0
    */
  var floating: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Default styling for the checkbox next to a legend item when
    * <code>showCheckbox</code> is true.</p>
    */
  var itemCheckboxStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>In a legend with horizontal layout, the itemDistance defines the
    * pixel distance between each item.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-horizontal/">50px item distance</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-horizontal/">50px item distance</a>
    * @since 3.0.3
    */
  var itemDistance: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS styles for each legend item when the corresponding series or
    * point is hidden. Only a subset of CSS is supported, notably those
    * options related to text. Properties are inherited from <code>style</code>
    * unless overridden here.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemhiddenstyle/">Darker gray color</a>
    */
  var itemHiddenStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>CSS styles for each legend item in hover mode. Only a subset of
    * CSS is supported, notably those options related to text. Properties
    * are inherited from <code>style</code> unless overridden here.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemhoverstyle/">Red on hover</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/itemstyle/">Item text styles</a>
    */
  var itemHoverStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The pixel bottom margin for each legend item.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
    * @since 2.2.0
    */
  var itemMarginBottom: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel top margin for each legend item.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
    * @since 2.2.0
    */
  var itemMarginTop: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS styles for each legend item. Only a subset of CSS is supported,
    * notably those options related to text. The default <code>textOverflow</code>
    * property makes long texts truncate. Set it to <code>undefined</code> to wrap
    * text instead. A <code>width</code> property can be added to control the text
    * width.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemstyle/">Bold black text</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/itemstyle/">Item text styles</a>
    */
  var itemStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The width for each legend item. By default the items are laid out
    * successively. In a <a href="legend.layout">horizontal layout</a>, if the items
    * are laid out across two rows or more, they will be vertically aligned
    * depending on the <a href="legend.alignColumns">legend.alignColumns</a> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemwidth-default/">Undefined by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemwidth-80/">80 for aligned legend items</a>
    * @since 2.0.0
    */
  var itemWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>A <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a>
    * for each legend label. Available variables relates to properties on
    * the series, or the point in case of pies.</p>
    * @since 1.3.0
    */
  var labelFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Callback function to format each of the series&#39; labels. The <code>this</code>
    * keyword refers to the series object, or the point object in case of
    * pie charts. By default the series or point name is printed.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/labelformatter/">Add text</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/labelformatter/">Data classes with label formatter</a>
    */
  var labelFormatter: js.Any = js.undefined

  /**
    * <p>The layout of the legend items. Can be one of <code>horizontal</code> or
    * <code>vertical</code> or <code>proximate</code>. When <code>proximate</code>, the legend items will be
    * placed as close as possible to the graphs they&#39;re representing,
    * except in inverted charts or when the legend position doesn&#39;t allow
    * it.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-horizontal/">Horizontal by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-vertical/">Vertical</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-proximate">Labels proximate to the data</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/layout-horizontal/">Horizontal by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/padding-itemmargin/">Vertical with data classes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/layout-vertical/">Vertical with color axis gradient</a>
    */
  var layout: js.UndefOr[String] = js.undefined

  /**
    * <p>Line height for the legend items. Deprecated as of 2.1. Instead,
    * the line height for each item can be set using
    * <code>itemStyle.lineHeight</code>, and the padding between items using
    * <code>itemMarginTop</code> and <code>itemMarginBottom</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/lineheight/">Setting padding</a>
    * @since 2.0.0
    */
  var lineHeight: js.UndefOr[Double] = js.undefined

  /**
    * <p>If the plot area sized is calculated automatically and the legend is
    * not floating, the legend margin is the space between the legend and
    * the axis labels or plot area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/margin-default/">12 pixels by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/margin-30/">30 pixels</a>
    * @since 2.1.0
    */
  var margin: js.UndefOr[Double] = js.undefined

  /**
    * <p>Maximum pixel height for the legend. When the maximum height is
    * extended, navigation will show.</p>
    * @since 2.3.0
    */
  var maxHeight: js.UndefOr[Double] = js.undefined

  /**
    * <p>Options for the paging or navigation appearing when the legend is
    * overflown. Navigation works well on screen, but not in static
    * exported images. One way of working around that is to
    * <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation-enabled-false/">increase the chart height in
    * export</a>.</p>
    */
  var navigation: js.Any = js.undefined

  /**
    * <p>The inner padding of the legend box.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
    * @since 2.2.0
    */
  var padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to reverse the order of the legend items compared to the
    * order of the series or points as defined in the configuration object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/reversed/">Stacked bar with reversed legend</a>
    * @since 1.2.5
    */
  var reversed: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to show the symbol on the right side of the text rather than
    * the left side. This is common in Arabic and Hebrew.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/rtl/">Symbol to the right</a>
    * @since 2.2.0
    */
  var rtl: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to apply a drop shadow to the legend. A <code>backgroundColor</code>
    * also needs to be applied for this to take effect. The shadow can be
    * an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
    * <code>opacity</code> and <code>width</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/shadow/">White background and drop shadow</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/">Various legend options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/border-background/">Border and background options</a>
    */
  var shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>When this is true, the legend symbol width will be the same as
    * the symbol height, which in turn defaults to the font size of the
    * legend items.</p>
    * @since 5.0.0
    */
  var squareSymbol: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>CSS styles for the legend area. In the 1.x versions the position
    * of the legend area was determined by CSS. In 2.x, the position is
    * determined by properties like <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>,
    * but the styles are still parsed for backwards compatibility.</p>
    */
  var style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The pixel height of the symbol for series types that use a rectangle
    * in the legend. Defaults to the font size of legend items.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/layout-vertical-sized/">Sized vertical gradient</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/padding-itemmargin/">No distance between data classes</a>
    * @since 3.0.8
    */
  var symbolHeight: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel padding between the legend item symbol and the legend
    * item text.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolpadding/">Greater symbol width and padding</a>
    */
  var symbolPadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border radius of the symbol for series types that use a rectangle
    * in the legend. Defaults to half the <code>symbolHeight</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolradius/">Round symbols</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolradius/">Round symbols</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolradius/">Round symbols</a>
    * @since 3.0.8
    */
  var symbolRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel width of the legend item symbol. When the <code>squareSymbol</code>
    * option is set, this defaults to the <code>symbolHeight</code>, otherwise 16.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolwidth/">Greater symbol width and padding</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/layout-vertical-sized/">Sized vertical gradient</a>
    */
  var symbolWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>A title to be added on top of the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/title/">Legend title</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/alignment/">Legend with title</a>
    * @since 3.0.0
    */
  var title: js.Any = js.undefined

  /**
    * <p>Whether to <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>
    * to render the legend item texts.</p>
    * <p>Prior to 4.1.7, when using HTML, <a href="#legend.navigation">legend.navigation</a> was disabled.</p>
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The vertical alignment of the legend box. Can be one of <code>top</code>,
    * <code>middle</code> or <code>bottom</code>. Vertical position can be further determined
    * by the <code>y</code> option.</p>
    * <p>In the case that the legend is aligned in a corner position, the
    * <code>layout</code> option will determine whether to place it above/below
    * or on the side of the plot area.</p>
    * <p>When the <a href="#legend.layout">layout</a> option is <code>proximate</code>, the
    * <code>verticalAlign</code> option doesn&#39;t apply.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/verticalalign/">Legend 100px from the top of the chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/">Various legend options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/alignment/">Legend alignment</a>
    * @since 2.0.0
    */
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The width of the legend box. If a number is set, it translates to
    * pixels. Since v7.0.2 it allows setting a percent string of the full
    * chart width, for example <code>40%</code>.</p>
    * <p>Defaults to the full chart width for legends below or above the
    * chart, half the chart width for legends to the left and right.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/width/">Aligned to the plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/width-percent/">A percent of the chart width</a>
    * @since 2.0.0
    */
  var width: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The x offset of the legend relative to its horizontal alignment
    * <code>align</code> within chart.spacingLeft and chart.spacingRight. Negative
    * x moves it to the left, positive x moves it to the right.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/width/">Aligned to the plot area</a>
    * @since 2.0.0
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The vertical offset of the legend relative to it&#39;s vertical alignment
    * <code>verticalAlign</code> within chart.spacingTop and chart.spacingBottom.
    *  Negative y moves it up, positive y moves it down.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/verticalalign/">Legend 100px from the top of the chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/">Various legend options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/alignment/">Legend alignment</a>
    * @since 2.0.0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Legend {
  /**
    * @param accessibility <p>Accessibility options for the legend. Requires the Accessibility. module.</p>
    * @param align <p>The horizontal alignment of the legend box within the chart area.. Valid values are <code>left</code>, <code>center</code> and <code>right</code>.</p>. <p>In the case that the legend is aligned in a corner position, the. <code>layout</code> option will determine whether to place it above/below. or on the side of the plot area.</p>
    * @param alignColumns <p>If the <a href="legend.layout">layout</a> is <code>horizontal</code> and the legend items. span over two lines or more, whether to align the items into vertical. columns. Setting this to <code>false</code> makes room for more items, but will. look more messy.</p>
    * @param backgroundColor <p>The background color of the legend.</p>
    * @param borderColor <p>The color of the drawn border around the legend.</p>
    * @param borderRadius <p>The border corner radius of the legend.</p>
    * @param borderWidth <p>The width of the drawn border around the legend.</p>
    * @param bubbleLegend <p>The bubble legend is an additional element in legend which. presents the scale of the bubble series. Individual bubble ranges. can be defined by user or calculated from series. In the case of. automatically calculated ranges, a 1px margin of error is. permitted.</p>
    * @param className <p>A CSS class name to apply to the legend group.</p>
    * @param enabled <p>Enable or disable the legend. There is also a series-specific option,. <a href="#plotOptions.series.showInLegend">showInLegend</a>, that can hide the. series from the legend. In some series types this is <code>false</code> by. default, so it must set to <code>true</code> in order to show the legend for the. series.</p>
    * @param floating <p>When the legend is floating, the plot area ignores it and is allowed. to be placed below it.</p>
    * @param itemCheckboxStyle <p>Default styling for the checkbox next to a legend item when. <code>showCheckbox</code> is true.</p>
    * @param itemDistance <p>In a legend with horizontal layout, the itemDistance defines the. pixel distance between each item.</p>
    * @param itemHiddenStyle <p>CSS styles for each legend item when the corresponding series or. point is hidden. Only a subset of CSS is supported, notably those. options related to text. Properties are inherited from <code>style</code>. unless overridden here.</p>
    * @param itemHoverStyle <p>CSS styles for each legend item in hover mode. Only a subset of. CSS is supported, notably those options related to text. Properties. are inherited from <code>style</code> unless overridden here.</p>
    * @param itemMarginBottom <p>The pixel bottom margin for each legend item.</p>
    * @param itemMarginTop <p>The pixel top margin for each legend item.</p>
    * @param itemStyle <p>CSS styles for each legend item. Only a subset of CSS is supported,. notably those options related to text. The default <code>textOverflow</code>. property makes long texts truncate. Set it to <code>undefined</code> to wrap. text instead. A <code>width</code> property can be added to control the text. width.</p>
    * @param itemWidth <p>The width for each legend item. By default the items are laid out. successively. In a <a href="legend.layout">horizontal layout</a>, if the items. are laid out across two rows or more, they will be vertically aligned. depending on the <a href="legend.alignColumns">legend.alignColumns</a> option.</p>
    * @param labelFormat <p>A <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a>. for each legend label. Available variables relates to properties on. the series, or the point in case of pies.</p>
    * @param labelFormatter <p>Callback function to format each of the series&#39; labels. The <code>this</code>. keyword refers to the series object, or the point object in case of. pie charts. By default the series or point name is printed.</p>
    * @param layout <p>The layout of the legend items. Can be one of <code>horizontal</code> or. <code>vertical</code> or <code>proximate</code>. When <code>proximate</code>, the legend items will be. placed as close as possible to the graphs they&#39;re representing,. except in inverted charts or when the legend position doesn&#39;t allow. it.</p>
    * @param lineHeight <p>Line height for the legend items. Deprecated as of 2.1. Instead,. the line height for each item can be set using. <code>itemStyle.lineHeight</code>, and the padding between items using. <code>itemMarginTop</code> and <code>itemMarginBottom</code>.</p>
    * @param margin <p>If the plot area sized is calculated automatically and the legend is. not floating, the legend margin is the space between the legend and. the axis labels or plot area.</p>
    * @param maxHeight <p>Maximum pixel height for the legend. When the maximum height is. extended, navigation will show.</p>
    * @param navigation <p>Options for the paging or navigation appearing when the legend is. overflown. Navigation works well on screen, but not in static. exported images. One way of working around that is to. <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation-enabled-false/">increase the chart height in. export</a>.</p>
    * @param padding <p>The inner padding of the legend box.</p>
    * @param reversed <p>Whether to reverse the order of the legend items compared to the. order of the series or points as defined in the configuration object.</p>
    * @param rtl <p>Whether to show the symbol on the right side of the text rather than. the left side. This is common in Arabic and Hebrew.</p>
    * @param shadow <p>Whether to apply a drop shadow to the legend. A <code>backgroundColor</code>. also needs to be applied for this to take effect. The shadow can be. an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,. <code>opacity</code> and <code>width</code>.</p>
    * @param squareSymbol <p>When this is true, the legend symbol width will be the same as. the symbol height, which in turn defaults to the font size of the. legend items.</p>
    * @param style <p>CSS styles for the legend area. In the 1.x versions the position. of the legend area was determined by CSS. In 2.x, the position is. determined by properties like <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>,. but the styles are still parsed for backwards compatibility.</p>
    * @param symbolHeight <p>The pixel height of the symbol for series types that use a rectangle. in the legend. Defaults to the font size of legend items.</p>
    * @param symbolPadding <p>The pixel padding between the legend item symbol and the legend. item text.</p>
    * @param symbolRadius <p>The border radius of the symbol for series types that use a rectangle. in the legend. Defaults to half the <code>symbolHeight</code>.</p>
    * @param symbolWidth <p>The pixel width of the legend item symbol. When the <code>squareSymbol</code>. option is set, this defaults to the <code>symbolHeight</code>, otherwise 16.</p>
    * @param title <p>A title to be added on top of the legend.</p>
    * @param useHTML <p>Whether to <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>. to render the legend item texts.</p>. <p>Prior to 4.1.7, when using HTML, <a href="#legend.navigation">legend.navigation</a> was disabled.</p>
    * @param verticalAlign <p>The vertical alignment of the legend box. Can be one of <code>top</code>,. <code>middle</code> or <code>bottom</code>. Vertical position can be further determined. by the <code>y</code> option.</p>. <p>In the case that the legend is aligned in a corner position, the. <code>layout</code> option will determine whether to place it above/below. or on the side of the plot area.</p>. <p>When the <a href="#legend.layout">layout</a> option is <code>proximate</code>, the. <code>verticalAlign</code> option doesn&#39;t apply.</p>
    * @param width <p>The width of the legend box. If a number is set, it translates to. pixels. Since v7.0.2 it allows setting a percent string of the full. chart width, for example <code>40%</code>.</p>. <p>Defaults to the full chart width for legends below or above the. chart, half the chart width for legends to the left and right.</p>
    * @param x <p>The x offset of the legend relative to its horizontal alignment. <code>align</code> within chart.spacingLeft and chart.spacingRight. Negative. x moves it to the left, positive x moves it to the right.</p>
    * @param y <p>The vertical offset of the legend relative to it&#39;s vertical alignment. <code>verticalAlign</code> within chart.spacingTop and chart.spacingBottom..  Negative y moves it up, positive y moves it down.</p>
    */
  def apply(accessibility: js.UndefOr[js.Any] = js.undefined, align: js.UndefOr[String] = js.undefined, alignColumns: js.UndefOr[Boolean] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, bubbleLegend: js.UndefOr[js.Any] = js.undefined, className: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, floating: js.UndefOr[Boolean] = js.undefined, itemCheckboxStyle: js.UndefOr[js.Object] = js.undefined, itemDistance: js.UndefOr[Double] = js.undefined, itemHiddenStyle: js.UndefOr[js.Object] = js.undefined, itemHoverStyle: js.UndefOr[js.Object] = js.undefined, itemMarginBottom: js.UndefOr[Double] = js.undefined, itemMarginTop: js.UndefOr[Double] = js.undefined, itemStyle: js.UndefOr[js.Object] = js.undefined, itemWidth: js.UndefOr[Double] = js.undefined, labelFormat: js.UndefOr[String] = js.undefined, labelFormatter: js.UndefOr[js.Any] = js.undefined, layout: js.UndefOr[String] = js.undefined, lineHeight: js.UndefOr[Double] = js.undefined, margin: js.UndefOr[Double] = js.undefined, maxHeight: js.UndefOr[Double] = js.undefined, navigation: js.UndefOr[js.Any] = js.undefined, padding: js.UndefOr[Double] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined, rtl: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, squareSymbol: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, symbolHeight: js.UndefOr[Double] = js.undefined, symbolPadding: js.UndefOr[Double] = js.undefined, symbolRadius: js.UndefOr[Double] = js.undefined, symbolWidth: js.UndefOr[Double] = js.undefined, title: js.UndefOr[js.Any] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double | String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): Legend = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Legend {
      this.accessibility = accessibility
      this.align = align
      this.alignColumns = alignColumns
      this.backgroundColor = backgroundColor
      this.borderColor = borderColor
      this.borderRadius = borderRadius
      this.borderWidth = borderWidth
      this.bubbleLegend = bubbleLegend
      this.className = className
      this.enabled = enabled
      this.floating = floating
      this.itemCheckboxStyle = itemCheckboxStyle
      this.itemDistance = itemDistance
      this.itemHiddenStyle = itemHiddenStyle
      this.itemHoverStyle = itemHoverStyle
      this.itemMarginBottom = itemMarginBottom
      this.itemMarginTop = itemMarginTop
      this.itemStyle = itemStyle
      this.itemWidth = itemWidth
      this.labelFormat = labelFormat
      this.labelFormatter = labelFormatter
      this.layout = layout
      this.lineHeight = lineHeight
      this.margin = margin
      this.maxHeight = maxHeight
      this.navigation = navigation
      this.padding = padding
      this.reversed = reversed
      this.rtl = rtl
      this.shadow = shadow
      this.squareSymbol = squareSymbol
      this.style = style
      this.symbolHeight = symbolHeight
      this.symbolPadding = symbolPadding
      this.symbolRadius = symbolRadius
      this.symbolWidth = symbolWidth
      this.title = title
      this.useHTML = useHTML
      this.verticalAlign = verticalAlign
      this.width = width
      this.x = x
      this.y = y
    })
  }
}
