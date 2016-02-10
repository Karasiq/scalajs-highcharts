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
class Legend extends js.Object {

  /**
    * <p>The horizontal alignment of the legend box within the chart area. Valid values are <code>left</code>, <code>center</code> and <code>right</code>.</p>
    * 
    * <p>In the case that the legend is aligned in a corner position, the <code>layout</code> option will determine whether to place it above/below or on the side of the plot area.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/align/" target="_blank">Legend at the right of the chart</a>
    * @since 2.0
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * The background color of the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/backgroundcolor/" target="_blank">Yellowish background</a>
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The color of the drawn border around the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/bordercolor/" target="_blank">Brown border</a>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border corner radius of the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/borderradius-default/" target="_blank">Square by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/borderradius-round/" target="_blank">5px rounded</a>
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The width of the drawn border around the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/borderwidth/" target="_blank">2px border width</a>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * Enable or disable the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/enabled-false/" target="_blank">Legend disabled</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * When the legend is floating, the plot area ignores it and is allowed to be placed below it.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/floating-false/" target="_blank">False by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/floating-true/" target="_blank">true</a>.
    * @since 2.1
    */
  val floating: js.UndefOr[Boolean] = js.undefined

  /**
    * In a legend with horizontal layout, the itemDistance defines the pixel distance between each item. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/layout-horizontal/" target="_blank">50px item distance</a>
    * @since 3.0.3
    */
  val itemDistance: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for each legend item when the corresponding series or point is hidden. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here. Defaults to:
    * <pre>itemHiddenStyle: {
    * 	color: '#CCC'
    * }</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/itemhiddenstyle/" target="_blank">Darker gray color</a>
    */
  val itemHiddenStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * CSS styles for each legend item in hover mode. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here. Defaults to:
    * <pre>itemHoverStyle: {
    * 	color: '#000'
    * }</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/itemhoverstyle/" target="_blank">Red on hover</a>
    */
  val itemHoverStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * The pixel bottom margin for each legend item.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/padding-itemmargin/" target="_blank">
				Padding and item margins demonstrated</a>
    * @since 2.2.0
    */
  val itemMarginBottom: js.UndefOr[Double] = js.undefined

  /**
    * The pixel top margin for each legend item.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/padding-itemmargin/" target="_blank">
				Padding and item margins demonstrated</a>
    * @since 2.2.0
    */
  val itemMarginTop: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for each legend item. Only a subset of CSS is supported, notably those options related to text.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/itemstyle/" target="_blank">Bold black text</a>
    */
  val itemStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * The width for each legend item. This is useful in a horizontal layout with many items when you want the items to align vertically.  .
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/itemwidth-default/" target="_blank">Null by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/itemwidth-80/" target="_blank">80 for aligned legend items</a>
    * @since 2.0
    */
  val itemWidth: js.UndefOr[Double] = js.undefined

  /**
    * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for each legend label. Available variables relates to properties on the series, or the point in case of pies.
    * @since 1.3
    */
  val labelFormat: js.UndefOr[String] = js.undefined

  /**
    * Callback function to format each of the series' labels. The <em>this</em> keyword refers to the series object, or the point object in case of pie charts. By default the series or point name is printed.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/labelformatter/" target="_blank">Add text</a>
    */
  val labelFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * The layout of the legend items. Can be one of "horizontal" or "vertical".
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/layout-horizontal/" target="_blank">Horizontal by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/layout-vertical/" target="_blank">vertical</a>
    */
  val layout: js.UndefOr[String] = js.undefined

  /**
    * Line height for the legend items. Deprecated as of 2.1. Instead, the line height for each  item can be set using itemStyle.lineHeight, and the padding between items using itemMarginTop and itemMarginBottom.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/lineheight/" target="_blank">Setting padding</a>.
    * @since 2.0
    */
  val lineHeight: js.UndefOr[Double] = js.undefined

  /**
    * If the plot area sized is calculated automatically and the legend is not floating, the legend margin is the  space between the legend and the axis labels or plot area.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/margin-default/" target="_blank">12 pixels by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/margin-30/" target="_blank">30 pixels</a>.
    * @since 2.1
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * Maximum pixel height for the legend. When the maximum height is extended, navigation will show.
    * @since 2.3.0
    */
  val maxHeight: js.UndefOr[Double] = js.undefined

  /**
    * Options for the paging or navigation appearing when the legend is overflown.
    */
  val navigation: js.UndefOr[CleanJsObject[LegendNavigation]] = js.undefined

  /**
    * The inner padding of the legend box.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/padding-itemmargin/" target="_blank">
				Padding and item margins demonstrated</a>
    * @since 2.2.0
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * Whether to reverse the order of the legend items compared to the order of the series or points as defined in the configuration object.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/reversed/" target="_blank">Stacked bar with reversed legend</a>
    * @since 1.2.5
    */
  val reversed: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to show the symbol on the right side of the text rather than the left side.  This is common in Arabic and Hebraic.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/rtl/" target="_blank">Symbol to the right</a>
    * @since 2.2
    */
  val rtl: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to apply a drop shadow to the legend. A <code>backgroundColor</code>
    *  also needs to be applied for this to take effect. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/shadow/" target="_blank">White background and drop shadow</a>
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * CSS styles for the legend area. In the 1.x versions the position of the legend area was determined by CSS. In 2.x, the position is determined by properties like  <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>, but the styles are still parsed for backwards compatibility.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The pixel height of the symbol for series types that use a rectangle in the legend. Defaults to the font size of legend items.
    * @since 3.0.8
    */
  val symbolHeight: js.UndefOr[Double] = js.undefined

  /**
    * The pixel padding between the legend item symbol and the legend item text.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/symbolpadding/" target="_blank">Greater symbol width and padding</a>
    */
  val symbolPadding: js.UndefOr[Double] = js.undefined

  /**
    * The border radius of the symbol for series types that use a rectangle in the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/symbolradius/" target="_blank">Round symbols</a>
    * @since 3.0.8
    */
  val symbolRadius: js.UndefOr[Double] = js.undefined

  /**
    * The pixel width of the legend item symbol.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/symbolwidth/" target="_blank">Greater symbol width and padding</a>
    */
  val symbolWidth: js.UndefOr[Double] = js.undefined

  /**
    * A title to be added on top of the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/title/" target="_blank">Legend title</a>
    * @since 3.0
    */
  val title: js.UndefOr[CleanJsObject[LegendTitle]] = js.undefined

  /**
    * <p>Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the legend item texts. Prior to 4.1.7, when using HTML, <a href="#legend.navigation">legend.navigation</a> was disabled.</p>
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The vertical alignment of the legend box. Can be one of <code>top</code>, <code>middle</code> or  <code>bottom</code>. Vertical position can be further determined by the <code>y</code> option.</p>
    * 
    * <p>In the case that the legend is aligned in a corner position, the <code>layout</code> option will determine whether to place it above/below or on the side of the plot area.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/verticalalign/" target="_blank">Legend 100px from the top of the chart</a>
    * @since 2.0
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * The width of the legend box.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/width/" target="_blank">Aligned to the plot area</a>
    * @since 2.0
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * The x offset of the legend relative to its horizontal alignment <code>align</code> within chart.spacingLeft and chart.spacingRight. Negative x moves it to the left, positive x moves it to the right. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/width/" target="_blank">Aligned to the plot area</a>
    * @since 2.0
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The vertical offset of the legend relative to it's vertical alignment <code>verticalAlign</code> within chart.spacingTop and chart.spacingBottom. Negative y moves it up, positive y moves it down.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/verticalalign/" target="_blank">Legend 100px from the top of the chart</a>
    * @since 2.0
    */
  val y: js.UndefOr[Double] = js.undefined
}

object Legend {
  /**
    * @param align <p>The horizontal alignment of the legend box within the chart area. Valid values are <code>left</code>, <code>center</code> and <code>right</code>.</p>. . <p>In the case that the legend is aligned in a corner position, the <code>layout</code> option will determine whether to place it above/below or on the side of the plot area.</p>
    * @param backgroundColor The background color of the legend.
    * @param borderColor The color of the drawn border around the legend.
    * @param borderRadius The border corner radius of the legend.
    * @param borderWidth The width of the drawn border around the legend.
    * @param enabled Enable or disable the legend.
    * @param floating When the legend is floating, the plot area ignores it and is allowed to be placed below it.
    * @param itemDistance In a legend with horizontal layout, the itemDistance defines the pixel distance between each item. 
    * @param itemHiddenStyle CSS styles for each legend item when the corresponding series or point is hidden. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here. Defaults to:. <pre>itemHiddenStyle: {. 	color: '#CCC'. }</pre>
    * @param itemHoverStyle CSS styles for each legend item in hover mode. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here. Defaults to:. <pre>itemHoverStyle: {. 	color: '#000'. }</pre>
    * @param itemMarginBottom The pixel bottom margin for each legend item.
    * @param itemMarginTop The pixel top margin for each legend item.
    * @param itemStyle CSS styles for each legend item. Only a subset of CSS is supported, notably those options related to text.
    * @param itemWidth The width for each legend item. This is useful in a horizontal layout with many items when you want the items to align vertically.  .
    * @param labelFormat A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for each legend label. Available variables relates to properties on the series, or the point in case of pies.
    * @param labelFormatter Callback function to format each of the series' labels. The <em>this</em> keyword refers to the series object, or the point object in case of pie charts. By default the series or point name is printed.
    * @param layout The layout of the legend items. Can be one of "horizontal" or "vertical".
    * @param lineHeight Line height for the legend items. Deprecated as of 2.1. Instead, the line height for each  item can be set using itemStyle.lineHeight, and the padding between items using itemMarginTop and itemMarginBottom.
    * @param margin If the plot area sized is calculated automatically and the legend is not floating, the legend margin is the  space between the legend and the axis labels or plot area.
    * @param maxHeight Maximum pixel height for the legend. When the maximum height is extended, navigation will show.
    * @param navigation Options for the paging or navigation appearing when the legend is overflown.
    * @param padding The inner padding of the legend box.
    * @param reversed Whether to reverse the order of the legend items compared to the order of the series or points as defined in the configuration object.
    * @param rtl Whether to show the symbol on the right side of the text rather than the left side.  This is common in Arabic and Hebraic.
    * @param shadow Whether to apply a drop shadow to the legend. A <code>backgroundColor</code>.  also needs to be applied for this to take effect. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @param style CSS styles for the legend area. In the 1.x versions the position of the legend area was determined by CSS. In 2.x, the position is determined by properties like  <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>, but the styles are still parsed for backwards compatibility.
    * @param symbolHeight The pixel height of the symbol for series types that use a rectangle in the legend. Defaults to the font size of legend items.
    * @param symbolPadding The pixel padding between the legend item symbol and the legend item text.
    * @param symbolRadius The border radius of the symbol for series types that use a rectangle in the legend.
    * @param symbolWidth The pixel width of the legend item symbol.
    * @param title A title to be added on top of the legend.
    * @param useHTML <p>Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the legend item texts. Prior to 4.1.7, when using HTML, <a href="#legend.navigation">legend.navigation</a> was disabled.</p>
    * @param verticalAlign <p>The vertical alignment of the legend box. Can be one of <code>top</code>, <code>middle</code> or  <code>bottom</code>. Vertical position can be further determined by the <code>y</code> option.</p>. . <p>In the case that the legend is aligned in a corner position, the <code>layout</code> option will determine whether to place it above/below or on the side of the plot area.</p>
    * @param width The width of the legend box.
    * @param x The x offset of the legend relative to its horizontal alignment <code>align</code> within chart.spacingLeft and chart.spacingRight. Negative x moves it to the left, positive x moves it to the right. 
    * @param y The vertical offset of the legend relative to it's vertical alignment <code>verticalAlign</code> within chart.spacingTop and chart.spacingBottom. Negative y moves it up, positive y moves it down.
    */
  def apply(align: js.UndefOr[String] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, floating: js.UndefOr[Boolean] = js.undefined, itemDistance: js.UndefOr[Double] = js.undefined, itemHiddenStyle: js.UndefOr[js.Object] = js.undefined, itemHoverStyle: js.UndefOr[js.Object] = js.undefined, itemMarginBottom: js.UndefOr[Double] = js.undefined, itemMarginTop: js.UndefOr[Double] = js.undefined, itemStyle: js.UndefOr[js.Object] = js.undefined, itemWidth: js.UndefOr[Double] = js.undefined, labelFormat: js.UndefOr[String] = js.undefined, labelFormatter: js.UndefOr[js.Function] = js.undefined, layout: js.UndefOr[String] = js.undefined, lineHeight: js.UndefOr[Double] = js.undefined, margin: js.UndefOr[Double] = js.undefined, maxHeight: js.UndefOr[Double] = js.undefined, navigation: js.UndefOr[CleanJsObject[LegendNavigation]] = js.undefined, padding: js.UndefOr[Double] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined, rtl: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, symbolHeight: js.UndefOr[Double] = js.undefined, symbolPadding: js.UndefOr[Double] = js.undefined, symbolRadius: js.UndefOr[Double] = js.undefined, symbolWidth: js.UndefOr[Double] = js.undefined, title: js.UndefOr[CleanJsObject[LegendTitle]] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): Legend = {
    val alignOuter: js.UndefOr[String] = align
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderRadiusOuter: js.UndefOr[Double] = borderRadius
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val floatingOuter: js.UndefOr[Boolean] = floating
    val itemDistanceOuter: js.UndefOr[Double] = itemDistance
    val itemHiddenStyleOuter: js.UndefOr[js.Object] = itemHiddenStyle
    val itemHoverStyleOuter: js.UndefOr[js.Object] = itemHoverStyle
    val itemMarginBottomOuter: js.UndefOr[Double] = itemMarginBottom
    val itemMarginTopOuter: js.UndefOr[Double] = itemMarginTop
    val itemStyleOuter: js.UndefOr[js.Object] = itemStyle
    val itemWidthOuter: js.UndefOr[Double] = itemWidth
    val labelFormatOuter: js.UndefOr[String] = labelFormat
    val labelFormatterOuter: js.UndefOr[js.Function] = labelFormatter
    val layoutOuter: js.UndefOr[String] = layout
    val lineHeightOuter: js.UndefOr[Double] = lineHeight
    val marginOuter: js.UndefOr[Double] = margin
    val maxHeightOuter: js.UndefOr[Double] = maxHeight
    val navigationOuter: js.UndefOr[CleanJsObject[LegendNavigation]] = navigation
    val paddingOuter: js.UndefOr[Double] = padding
    val reversedOuter: js.UndefOr[Boolean] = reversed
    val rtlOuter: js.UndefOr[Boolean] = rtl
    val shadowOuter: js.UndefOr[Boolean | js.Object] = shadow
    val styleOuter: js.UndefOr[js.Object] = style
    val symbolHeightOuter: js.UndefOr[Double] = symbolHeight
    val symbolPaddingOuter: js.UndefOr[Double] = symbolPadding
    val symbolRadiusOuter: js.UndefOr[Double] = symbolRadius
    val symbolWidthOuter: js.UndefOr[Double] = symbolWidth
    val titleOuter: js.UndefOr[CleanJsObject[LegendTitle]] = title
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val widthOuter: js.UndefOr[Double] = width
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new Legend {
      override val align: js.UndefOr[String] = alignOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderRadius: js.UndefOr[Double] = borderRadiusOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val floating: js.UndefOr[Boolean] = floatingOuter
      override val itemDistance: js.UndefOr[Double] = itemDistanceOuter
      override val itemHiddenStyle: js.UndefOr[js.Object] = itemHiddenStyleOuter
      override val itemHoverStyle: js.UndefOr[js.Object] = itemHoverStyleOuter
      override val itemMarginBottom: js.UndefOr[Double] = itemMarginBottomOuter
      override val itemMarginTop: js.UndefOr[Double] = itemMarginTopOuter
      override val itemStyle: js.UndefOr[js.Object] = itemStyleOuter
      override val itemWidth: js.UndefOr[Double] = itemWidthOuter
      override val labelFormat: js.UndefOr[String] = labelFormatOuter
      override val labelFormatter: js.UndefOr[js.Function] = labelFormatterOuter
      override val layout: js.UndefOr[String] = layoutOuter
      override val lineHeight: js.UndefOr[Double] = lineHeightOuter
      override val margin: js.UndefOr[Double] = marginOuter
      override val maxHeight: js.UndefOr[Double] = maxHeightOuter
      override val navigation: js.UndefOr[CleanJsObject[LegendNavigation]] = navigationOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val reversed: js.UndefOr[Boolean] = reversedOuter
      override val rtl: js.UndefOr[Boolean] = rtlOuter
      override val shadow: js.UndefOr[Boolean | js.Object] = shadowOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val symbolHeight: js.UndefOr[Double] = symbolHeightOuter
      override val symbolPadding: js.UndefOr[Double] = symbolPaddingOuter
      override val symbolRadius: js.UndefOr[Double] = symbolRadiusOuter
      override val symbolWidth: js.UndefOr[Double] = symbolWidthOuter
      override val title: js.UndefOr[CleanJsObject[LegendTitle]] = titleOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val width: js.UndefOr[Double] = widthOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
