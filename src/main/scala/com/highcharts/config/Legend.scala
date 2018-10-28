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
  * @note JavaScript name: <code>legend</code>
  */
@js.annotation.ScalaJSDefined
class Legend extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Keyboard navigation for the legend. Requires the Accessibility module.</p>
    * @since 5.0.14
    */
  val keyboardNavigation: js.Any = js.undefined

  /**
    * <p>CSS styles for each legend item. Only a subset of CSS is supported,
    * notably those options related to text. The default <code>textOverflow</code>
    * property makes long texts truncate. Set it to <code>undefined</code> to wrap
    * text instead. A <code>width</code> property can be added to control the text
    * width.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemstyle/">Bold black text</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/itemstyle/">Item text styles</a>
    */
  val itemStyle: js.UndefOr[js.Object] = js.undefined

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
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The horizontal alignment of the legend box within the chart area.
    * Valid values are <code>left</code>, <code>center</code> and <code>right</code>.</p>
    * <p>In the case that the legend is aligned in a corner position, the
    * <code>layout</code> option will determine whether to place it above/below
    * or on the side of the plot area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/align/">Legend at the right of the chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/">Various legend options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/alignment/">Legend alignment</a>
    * @since 2.0
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>If the <a href="legend.layout">layout</a> is <code>horizontal</code> and the legend items
    * span over two lines or more, whether to align the items into vertical
    * columns. Setting this to <code>false</code> makes room for more items, but will
    * look more messy.</p>
    * @since 6.1.0
    */
  val alignColumns: js.UndefOr[Boolean] = js.undefined

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
  val layout: js.UndefOr[String] = js.undefined

  /**
    * <p>Callback function to format each of the series&#39; labels. The <code>this</code>
    * keyword refers to the series object, or the point object in case
    * of pie charts. By default the series or point name is printed.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/labelformatter/">Add text</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/labelformatter/">Data classes with label formatter</a>
    */
  val labelFormatter: js.Any = js.undefined

  /**
    * <p>The color of the drawn border around the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/bordercolor/">Brown border</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/">Various legend options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/border-background/">Border and background options</a>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border corner radius of the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/borderradius-default/">Square by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/borderradius-round/">5px rounded</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/border-background/">Border and background options</a>
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>Options for the paging or navigation appearing when the legend
    * is overflown. Navigation works well on screen, but not in static
    * exported images. One way of working around that is to
    * <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation-enabled-false/">increase the chart height in
    * export</a>.</p>
    */
  val navigation: js.Any = js.undefined

  /**
    * <p>CSS styles for each legend item in hover mode. Only a subset of
    * CSS is supported, notably those options related to text. Properties
    * are inherited from <code>style</code> unless overridden here.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemhoverstyle/">Red on hover</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/itemstyle/">Item text styles</a>
    */
  val itemHoverStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>CSS styles for each legend item when the corresponding series or
    * point is hidden. Only a subset of CSS is supported, notably those
    * options related to text. Properties are inherited from <code>style</code>
    * unless overridden here.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemhiddenstyle/">Darker gray color</a>
    */
  val itemHiddenStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Whether to apply a drop shadow to the legend. A <code>backgroundColor</code>
    * also needs to be applied for this to take effect. The shadow can be
    * an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,
    * <code>opacity</code> and <code>width</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/shadow/">White background and drop shadow</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/">Various legend options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/border-background/">Border and background options</a>
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Default styling for the checkbox next to a legend item when
    * <code>showCheckbox</code> is true.</p>
    */
  val itemCheckboxStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>When this is true, the legend symbol width will be the same as
    * the symbol height, which in turn defaults to the font size of the
    * legend items.</p>
    * @since 5.0.0
    */
  val squareSymbol: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The pixel padding between the legend item symbol and the legend
    * item text.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolpadding/">Greater symbol width and padding</a>
    */
  val symbolPadding: js.UndefOr[Double] = js.undefined

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
    * @since 2.0
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The x offset of the legend relative to its horizontal alignment
    * <code>align</code> within chart.spacingLeft and chart.spacingRight. Negative
    * x moves it to the left, positive x moves it to the right.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/width/">Aligned to the plot area</a>
    * @since 2.0
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The vertical offset of the legend relative to it&#39;s vertical alignment
    * <code>verticalAlign</code> within chart.spacingTop and chart.spacingBottom.
    *  Negative y moves it up, positive y moves it down.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/verticalalign/">Legend 100px from the top of the chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/">Various legend options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/alignment/">Legend alignment</a>
    * @since 2.0
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * <p>A title to be added on top of the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/title/">Legend title</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/alignment/">Legend with title</a>
    * @since 3.0
    */
  val title: js.Any = js.undefined

  /**
    * <p>The background color of the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/backgroundcolor/">Yellowish background</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/">Various legend options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/border-background/">Border and background options</a>
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the drawn border around the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/borderwidth/">2px border width</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/">Various legend options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/border-background/">Border and background options</a>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>When the legend is floating, the plot area ignores it and is allowed
    * to be placed below it.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/floating-false/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/floating-true/">True</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/alignment/">Floating legend</a>
    * @since 2.1
    */
  val floating: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>In a legend with horizontal layout, the itemDistance defines the
    * pixel distance between each item.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-horizontal/">50px item distance</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-horizontal/">50px item distance</a>
    * @since 3.0.3
    */
  val itemDistance: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel bottom margin for each legend item.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
    * @since 2.2.0
    */
  val itemMarginBottom: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel top margin for each legend item.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
    * @since 2.2.0
    */
  val itemMarginTop: js.UndefOr[Double] = js.undefined

  /**
    * <p>The width for each legend item. By default the items are laid out
    * successively. In a <a href="legend.layout">horizontal layout</a>, if the items
    * are laid out across two rows or more, they will be vertically aligned
    * depending on the <a href="legend.alignColumns">legend.alignColumns</a> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemwidth-default/">Undefined by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemwidth-80/">80 for aligned legend items</a>
    * @since 2.0
    */
  val itemWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>A [format string](<a href="https://www.highcharts.com/docs/chart-concepts/">https://www.highcharts.com/docs/chart-concepts/</a>
    * labels-and-string-formatting) for each legend label. Available
    * variables relates to properties on the series, or the point in case
    * of pies.</p>
    * @since 1.3
    */
  val labelFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Line height for the legend items. Deprecated as of 2.1. Instead,
    * the line height for each item can be set using itemStyle.lineHeight,
    * and the padding between items using <code>itemMarginTop</code> and
    * <code>itemMarginBottom</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/lineheight/">Setting padding</a>
    * @since 2.0
    */
  val lineHeight: js.UndefOr[Double] = js.undefined

  /**
    * <p>If the plot area sized is calculated automatically and the legend
    * is not floating, the legend margin is the space between the legend
    * and the axis labels or plot area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/margin-default/">12 pixels by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/margin-30/">30 pixels</a>
    * @since 2.1
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * <p>Maximum pixel height for the legend. When the maximum height is
    * extended, navigation will show.</p>
    * @since 2.3.0
    */
  val maxHeight: js.UndefOr[Double] = js.undefined

  /**
    * <p>The inner padding of the legend box.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
    * @since 2.2.0
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to reverse the order of the legend items compared to the
    * order of the series or points as defined in the configuration object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/reversed/">Stacked bar with reversed legend</a>
    * @since 1.2.5
    */
  val reversed: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to show the symbol on the right side of the text rather than
    * the left side. This is common in Arabic and Hebraic.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/rtl/">Symbol to the right</a>
    * @since 2.2
    */
  val rtl: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>CSS styles for the legend area. In the 1.x versions the position
    * of the legend area was determined by CSS. In 2.x, the position is
    * determined by properties like <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>,
    * but the styles are still parsed for backwards compatibility.</p>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The pixel height of the symbol for series types that use a rectangle
    * in the legend. Defaults to the font size of legend items.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/layout-vertical-sized/">Sized vertical gradient</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/padding-itemmargin/">No distance between data classes</a>
    * @since 3.0.8
    */
  val symbolHeight: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border radius of the symbol for series types that use a rectangle
    * in the legend. Defaults to half the <code>symbolHeight</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolradius/">Round symbols</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolradius/">Round symbols</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolradius/">Round symbols</a>
    * @since 3.0.8
    */
  val symbolRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel width of the legend item symbol. When the <code>squareSymbol</code>
    * option is set, this defaults to the <code>symbolHeight</code>, otherwise 16.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolwidth/">Greater symbol width and padding</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/layout-vertical-sized/">Sized vertical gradient</a>
    */
  val symbolWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to [use HTML](<a href="https://www.highcharts.com/docs/chart-concepts/">https://www.highcharts.com/docs/chart-concepts/</a>
    * labels-and-string-formatting#html) to render the legend item texts.</p>
    * <p>Prior to 4.1.7, when using HTML, <a href="#legend.navigation">legend.navigation</a> was disabled.</p>
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The width of the legend box.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/width/">Aligned to the plot area</a>
    * @since 2.0
    */
  val width: js.UndefOr[Double] = js.undefined
}

object Legend {
  /**
    * @param keyboardNavigation <p>Keyboard navigation for the legend. Requires the Accessibility module.</p>
    * @param itemStyle <p>CSS styles for each legend item. Only a subset of CSS is supported,. notably those options related to text. The default <code>textOverflow</code>. property makes long texts truncate. Set it to <code>undefined</code> to wrap. text instead. A <code>width</code> property can be added to control the text. width.</p>
    * @param enabled <p>Enable or disable the legend. There is also a series-specific option,. <a href="#plotOptions.series.showInLegend">showInLegend</a>, that can hide the. series from the legend. In some series types this is <code>false</code> by. default, so it must set to <code>true</code> in order to show the legend for the. series.</p>
    * @param align <p>The horizontal alignment of the legend box within the chart area.. Valid values are <code>left</code>, <code>center</code> and <code>right</code>.</p>. <p>In the case that the legend is aligned in a corner position, the. <code>layout</code> option will determine whether to place it above/below. or on the side of the plot area.</p>
    * @param alignColumns <p>If the <a href="legend.layout">layout</a> is <code>horizontal</code> and the legend items. span over two lines or more, whether to align the items into vertical. columns. Setting this to <code>false</code> makes room for more items, but will. look more messy.</p>
    * @param layout <p>The layout of the legend items. Can be one of <code>horizontal</code> or. <code>vertical</code> or <code>proximate</code>. When <code>proximate</code>, the legend items will be. placed as close as possible to the graphs they&#39;re representing,. except in inverted charts or when the legend position doesn&#39;t allow. it.</p>
    * @param labelFormatter <p>Callback function to format each of the series&#39; labels. The <code>this</code>. keyword refers to the series object, or the point object in case. of pie charts. By default the series or point name is printed.</p>
    * @param borderColor <p>The color of the drawn border around the legend.</p>
    * @param borderRadius <p>The border corner radius of the legend.</p>
    * @param navigation <p>Options for the paging or navigation appearing when the legend. is overflown. Navigation works well on screen, but not in static. exported images. One way of working around that is to. <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation-enabled-false/">increase the chart height in. export</a>.</p>
    * @param itemHoverStyle <p>CSS styles for each legend item in hover mode. Only a subset of. CSS is supported, notably those options related to text. Properties. are inherited from <code>style</code> unless overridden here.</p>
    * @param itemHiddenStyle <p>CSS styles for each legend item when the corresponding series or. point is hidden. Only a subset of CSS is supported, notably those. options related to text. Properties are inherited from <code>style</code>. unless overridden here.</p>
    * @param shadow <p>Whether to apply a drop shadow to the legend. A <code>backgroundColor</code>. also needs to be applied for this to take effect. The shadow can be. an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>,. <code>opacity</code> and <code>width</code>.</p>
    * @param itemCheckboxStyle <p>Default styling for the checkbox next to a legend item when. <code>showCheckbox</code> is true.</p>
    * @param squareSymbol <p>When this is true, the legend symbol width will be the same as. the symbol height, which in turn defaults to the font size of the. legend items.</p>
    * @param symbolPadding <p>The pixel padding between the legend item symbol and the legend. item text.</p>
    * @param verticalAlign <p>The vertical alignment of the legend box. Can be one of <code>top</code>,. <code>middle</code> or <code>bottom</code>. Vertical position can be further determined. by the <code>y</code> option.</p>. <p>In the case that the legend is aligned in a corner position, the. <code>layout</code> option will determine whether to place it above/below. or on the side of the plot area.</p>. <p>When the <a href="#legend.layout">layout</a> option is <code>proximate</code>, the. <code>verticalAlign</code> option doesn&#39;t apply.</p>
    * @param x <p>The x offset of the legend relative to its horizontal alignment. <code>align</code> within chart.spacingLeft and chart.spacingRight. Negative. x moves it to the left, positive x moves it to the right.</p>
    * @param y <p>The vertical offset of the legend relative to it&#39;s vertical alignment. <code>verticalAlign</code> within chart.spacingTop and chart.spacingBottom..  Negative y moves it up, positive y moves it down.</p>
    * @param title <p>A title to be added on top of the legend.</p>
    * @param backgroundColor <p>The background color of the legend.</p>
    * @param borderWidth <p>The width of the drawn border around the legend.</p>
    * @param floating <p>When the legend is floating, the plot area ignores it and is allowed. to be placed below it.</p>
    * @param itemDistance <p>In a legend with horizontal layout, the itemDistance defines the. pixel distance between each item.</p>
    * @param itemMarginBottom <p>The pixel bottom margin for each legend item.</p>
    * @param itemMarginTop <p>The pixel top margin for each legend item.</p>
    * @param itemWidth <p>The width for each legend item. By default the items are laid out. successively. In a <a href="legend.layout">horizontal layout</a>, if the items. are laid out across two rows or more, they will be vertically aligned. depending on the <a href="legend.alignColumns">legend.alignColumns</a> option.</p>
    * @param labelFormat <p>A [format string](<a href="https://www.highcharts.com/docs/chart-concepts/">https://www.highcharts.com/docs/chart-concepts/</a>. labels-and-string-formatting) for each legend label. Available. variables relates to properties on the series, or the point in case. of pies.</p>
    * @param lineHeight <p>Line height for the legend items. Deprecated as of 2.1. Instead,. the line height for each item can be set using itemStyle.lineHeight,. and the padding between items using <code>itemMarginTop</code> and. <code>itemMarginBottom</code>.</p>
    * @param margin <p>If the plot area sized is calculated automatically and the legend. is not floating, the legend margin is the space between the legend. and the axis labels or plot area.</p>
    * @param maxHeight <p>Maximum pixel height for the legend. When the maximum height is. extended, navigation will show.</p>
    * @param padding <p>The inner padding of the legend box.</p>
    * @param reversed <p>Whether to reverse the order of the legend items compared to the. order of the series or points as defined in the configuration object.</p>
    * @param rtl <p>Whether to show the symbol on the right side of the text rather than. the left side. This is common in Arabic and Hebraic.</p>
    * @param style <p>CSS styles for the legend area. In the 1.x versions the position. of the legend area was determined by CSS. In 2.x, the position is. determined by properties like <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>,. but the styles are still parsed for backwards compatibility.</p>
    * @param symbolHeight <p>The pixel height of the symbol for series types that use a rectangle. in the legend. Defaults to the font size of legend items.</p>
    * @param symbolRadius <p>The border radius of the symbol for series types that use a rectangle. in the legend. Defaults to half the <code>symbolHeight</code>.</p>
    * @param symbolWidth <p>The pixel width of the legend item symbol. When the <code>squareSymbol</code>. option is set, this defaults to the <code>symbolHeight</code>, otherwise 16.</p>
    * @param useHTML <p>Whether to [use HTML](<a href="https://www.highcharts.com/docs/chart-concepts/">https://www.highcharts.com/docs/chart-concepts/</a>. labels-and-string-formatting#html) to render the legend item texts.</p>. <p>Prior to 4.1.7, when using HTML, <a href="#legend.navigation">legend.navigation</a> was disabled.</p>
    * @param width <p>The width of the legend box.</p>
    */
  def apply(keyboardNavigation: js.UndefOr[js.Any] = js.undefined, itemStyle: js.UndefOr[js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, align: js.UndefOr[String] = js.undefined, alignColumns: js.UndefOr[Boolean] = js.undefined, layout: js.UndefOr[String] = js.undefined, labelFormatter: js.UndefOr[js.Any] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, navigation: js.UndefOr[js.Any] = js.undefined, itemHoverStyle: js.UndefOr[js.Object] = js.undefined, itemHiddenStyle: js.UndefOr[js.Object] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, itemCheckboxStyle: js.UndefOr[js.Object] = js.undefined, squareSymbol: js.UndefOr[Boolean] = js.undefined, symbolPadding: js.UndefOr[Double] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, title: js.UndefOr[js.Any] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, floating: js.UndefOr[Boolean] = js.undefined, itemDistance: js.UndefOr[Double] = js.undefined, itemMarginBottom: js.UndefOr[Double] = js.undefined, itemMarginTop: js.UndefOr[Double] = js.undefined, itemWidth: js.UndefOr[Double] = js.undefined, labelFormat: js.UndefOr[String] = js.undefined, lineHeight: js.UndefOr[Double] = js.undefined, margin: js.UndefOr[Double] = js.undefined, maxHeight: js.UndefOr[Double] = js.undefined, padding: js.UndefOr[Double] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined, rtl: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, symbolHeight: js.UndefOr[Double] = js.undefined, symbolRadius: js.UndefOr[Double] = js.undefined, symbolWidth: js.UndefOr[Double] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, width: js.UndefOr[Double] = js.undefined): Legend = {
    val keyboardNavigationOuter: js.Any = keyboardNavigation
    val itemStyleOuter: js.UndefOr[js.Object] = itemStyle
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val alignOuter: js.UndefOr[String] = align
    val alignColumnsOuter: js.UndefOr[Boolean] = alignColumns
    val layoutOuter: js.UndefOr[String] = layout
    val labelFormatterOuter: js.Any = labelFormatter
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderRadiusOuter: js.UndefOr[Double] = borderRadius
    val navigationOuter: js.Any = navigation
    val itemHoverStyleOuter: js.UndefOr[js.Object] = itemHoverStyle
    val itemHiddenStyleOuter: js.UndefOr[js.Object] = itemHiddenStyle
    val shadowOuter: js.UndefOr[Boolean | js.Object] = shadow
    val itemCheckboxStyleOuter: js.UndefOr[js.Object] = itemCheckboxStyle
    val squareSymbolOuter: js.UndefOr[Boolean] = squareSymbol
    val symbolPaddingOuter: js.UndefOr[Double] = symbolPadding
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val titleOuter: js.Any = title
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val floatingOuter: js.UndefOr[Boolean] = floating
    val itemDistanceOuter: js.UndefOr[Double] = itemDistance
    val itemMarginBottomOuter: js.UndefOr[Double] = itemMarginBottom
    val itemMarginTopOuter: js.UndefOr[Double] = itemMarginTop
    val itemWidthOuter: js.UndefOr[Double] = itemWidth
    val labelFormatOuter: js.UndefOr[String] = labelFormat
    val lineHeightOuter: js.UndefOr[Double] = lineHeight
    val marginOuter: js.UndefOr[Double] = margin
    val maxHeightOuter: js.UndefOr[Double] = maxHeight
    val paddingOuter: js.UndefOr[Double] = padding
    val reversedOuter: js.UndefOr[Boolean] = reversed
    val rtlOuter: js.UndefOr[Boolean] = rtl
    val styleOuter: js.UndefOr[js.Object] = style
    val symbolHeightOuter: js.UndefOr[Double] = symbolHeight
    val symbolRadiusOuter: js.UndefOr[Double] = symbolRadius
    val symbolWidthOuter: js.UndefOr[Double] = symbolWidth
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val widthOuter: js.UndefOr[Double] = width
    com.highcharts.HighchartsGenericObject.toCleanObject(new Legend {
      override val keyboardNavigation: js.Any = keyboardNavigationOuter
      override val itemStyle: js.UndefOr[js.Object] = itemStyleOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val align: js.UndefOr[String] = alignOuter
      override val alignColumns: js.UndefOr[Boolean] = alignColumnsOuter
      override val layout: js.UndefOr[String] = layoutOuter
      override val labelFormatter: js.Any = labelFormatterOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderRadius: js.UndefOr[Double] = borderRadiusOuter
      override val navigation: js.Any = navigationOuter
      override val itemHoverStyle: js.UndefOr[js.Object] = itemHoverStyleOuter
      override val itemHiddenStyle: js.UndefOr[js.Object] = itemHiddenStyleOuter
      override val shadow: js.UndefOr[Boolean | js.Object] = shadowOuter
      override val itemCheckboxStyle: js.UndefOr[js.Object] = itemCheckboxStyleOuter
      override val squareSymbol: js.UndefOr[Boolean] = squareSymbolOuter
      override val symbolPadding: js.UndefOr[Double] = symbolPaddingOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val title: js.Any = titleOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val floating: js.UndefOr[Boolean] = floatingOuter
      override val itemDistance: js.UndefOr[Double] = itemDistanceOuter
      override val itemMarginBottom: js.UndefOr[Double] = itemMarginBottomOuter
      override val itemMarginTop: js.UndefOr[Double] = itemMarginTopOuter
      override val itemWidth: js.UndefOr[Double] = itemWidthOuter
      override val labelFormat: js.UndefOr[String] = labelFormatOuter
      override val lineHeight: js.UndefOr[Double] = lineHeightOuter
      override val margin: js.UndefOr[Double] = marginOuter
      override val maxHeight: js.UndefOr[Double] = maxHeightOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val reversed: js.UndefOr[Boolean] = reversedOuter
      override val rtl: js.UndefOr[Boolean] = rtlOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val symbolHeight: js.UndefOr[Double] = symbolHeightOuter
      override val symbolRadius: js.UndefOr[Double] = symbolRadiusOuter
      override val symbolWidth: js.UndefOr[Double] = symbolWidthOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val width: js.UndefOr[Double] = widthOuter
    })
  }
}
