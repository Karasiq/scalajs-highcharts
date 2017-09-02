/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

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
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * The background color of the legend.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The color of the drawn border around the legend.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border corner radius of the legend.
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The width of the drawn border around the legend.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * Enable or disable the legend.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * When the legend is floating, the plot area ignores it and is allowed to be placed below it.
    */
  val floating: js.UndefOr[Boolean] = js.undefined

  /**
    * In a legend with horizontal layout, the itemDistance defines the pixel distance between each item. 
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-horizontal/" target="_blank">50px item distance</a>
    * @since 1.3.3
    */
  val itemDistance: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for each legend item when the corresponding series or point is hidden. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here.
    */
  val itemHiddenStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * CSS styles for each legend item in hover mode. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here.
    */
  val itemHoverStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * The pixel bottom margin for each legend item.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/" target="_blank">
				Padding and item margins demonstrated</a>
    * @since 1.1
    */
  val itemMarginBottom: js.UndefOr[Double] = js.undefined

  /**
    * The pixel top margin for each legend item.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/" target="_blank">
				Padding and item margins demonstrated</a>
    * @since 1.1
    */
  val itemMarginTop: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for each legend item. Only a subset of CSS is supported, notably those options related to text. The default <code>textOverflow</code> property makes long texts truncate. Set it to <code>null</code> to wrap text instead. A <code>width</code> property can be added to control the text width.
    */
  val itemStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * The width for each legend item. This is useful in a horizontal layout with many items when you want the items to align vertically.  .
    */
  val itemWidth: js.UndefOr[Double] = js.undefined

  /**
    * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for each legend label. Available variables relates to properties on the series, or the point in case of pies.
    * @since 3.0
    */
  val labelFormat: js.UndefOr[String] = js.undefined

  /**
    * Callback function to format each of the series' labels. The <em>this</em> keyword refers to the series object, or the point object in case of pie charts. By default the series or point name is printed.
    */
  val labelFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * The layout of the legend items. Can be one of "horizontal" or "vertical".
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/layout-horizontal/" target="_blank">Horizontal by default</a>
    */
  val layout: js.UndefOr[String] = js.undefined

  /**
    * If the plot area sized is calculated automatically and the legend is not floating, the legend margin is the  space between the legend and the axis labels or plot area.
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * Maximum pixel height for the legend. When the maximum height is extended, navigation will show.
    * @since 1.2.0
    */
  val maxHeight: js.UndefOr[Double] = js.undefined

  /**
    * Options for the paging or navigation appearing when the legend is overflown.
    */
  val navigation: js.UndefOr[CleanJsObject[LegendNavigation]] = js.undefined

  /**
    * The inner padding of the legend box.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/" target="_blank">
				Padding and item margins demonstrated</a>
    * @since 1.1
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * Whether to reverse the order of the legend items compared to the order of the series or points as defined in the configuration object.
    */
  val reversed: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to apply a drop shadow to the legend. A <code>backgroundColor</code>
    *  also needs to be applied for this to take effect. Since 1.1.7 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * When this is true, the legend symbol width will be the same as the symbol height, which in turn defaults to the font size of the legend items.
    * @since 5.0.0
    */
  val squareSymbol: js.UndefOr[Boolean] = js.undefined

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
    */
  val symbolPadding: js.UndefOr[Double] = js.undefined

  /**
    * The border radius of the symbol for series types that use a rectangle in the legend. Defaults to half the <code>symbolHeight</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolradius/" target="_blank">Round symbols</a>
    */
  val symbolRadius: js.UndefOr[Double] = js.undefined

  /**
    * The pixel width of the legend item symbol. When the <code>squareSymbol</code> option is set, this defaults to the <code>symbolHeight</code>, otherwise 16.
    */
  val symbolWidth: js.UndefOr[Double] = js.undefined

  /**
    * A title to be added on top of the legend
    * @since 1.3
    */
  val title: js.UndefOr[CleanJsObject[LegendTitle]] = js.undefined

  /**
    * <p>Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the legend item texts. Prior to 2.1.7, when using HTML, <a href="#legend.navigation">legend.navigation</a> was disabled.</p>
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The vertical alignment of the legend box. Can be one of <code>top</code>, <code>middle</code> or  <code>bottom</code>. Vertical position can be further determined by the <code>y</code> option.</p>
    * 
    * <p>In the case that the legend is aligned in a corner position, the <code>layout</code> option will determine whether to place it above/below or on the side of the plot area.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * The width of the legend box.
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * The x offset of the legend relative to its horizontal alignment <code>align</code> within chart.spacingLeft and chart.spacingRight. Negative x moves it to the left, positive x moves it to the right.
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The vertical offset of the legend relative to it's vertical alignment <code>verticalAlign</code> within chart.spacingTop and chart.spacingBottom. Negative y moves it up, positive y moves it down.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
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
    * @param itemHiddenStyle CSS styles for each legend item when the corresponding series or point is hidden. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here.
    * @param itemHoverStyle CSS styles for each legend item in hover mode. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here.
    * @param itemMarginBottom The pixel bottom margin for each legend item.
    * @param itemMarginTop The pixel top margin for each legend item.
    * @param itemStyle CSS styles for each legend item. Only a subset of CSS is supported, notably those options related to text. The default <code>textOverflow</code> property makes long texts truncate. Set it to <code>null</code> to wrap text instead. A <code>width</code> property can be added to control the text width.
    * @param itemWidth The width for each legend item. This is useful in a horizontal layout with many items when you want the items to align vertically.  .
    * @param labelFormat A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for each legend label. Available variables relates to properties on the series, or the point in case of pies.
    * @param labelFormatter Callback function to format each of the series' labels. The <em>this</em> keyword refers to the series object, or the point object in case of pie charts. By default the series or point name is printed.
    * @param layout The layout of the legend items. Can be one of "horizontal" or "vertical".
    * @param margin If the plot area sized is calculated automatically and the legend is not floating, the legend margin is the  space between the legend and the axis labels or plot area.
    * @param maxHeight Maximum pixel height for the legend. When the maximum height is extended, navigation will show.
    * @param navigation Options for the paging or navigation appearing when the legend is overflown.
    * @param padding The inner padding of the legend box.
    * @param reversed Whether to reverse the order of the legend items compared to the order of the series or points as defined in the configuration object.
    * @param shadow Whether to apply a drop shadow to the legend. A <code>backgroundColor</code>.  also needs to be applied for this to take effect. Since 1.1.7 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @param squareSymbol When this is true, the legend symbol width will be the same as the symbol height, which in turn defaults to the font size of the legend items.
    * @param style CSS styles for the legend area. In the 1.x versions the position of the legend area was determined by CSS. In 2.x, the position is determined by properties like  <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>, but the styles are still parsed for backwards compatibility.
    * @param symbolHeight The pixel height of the symbol for series types that use a rectangle in the legend. Defaults to the font size of legend items.
    * @param symbolPadding The pixel padding between the legend item symbol and the legend item text.
    * @param symbolRadius The border radius of the symbol for series types that use a rectangle in the legend. Defaults to half the <code>symbolHeight</code>.
    * @param symbolWidth The pixel width of the legend item symbol. When the <code>squareSymbol</code> option is set, this defaults to the <code>symbolHeight</code>, otherwise 16.
    * @param title A title to be added on top of the legend
    * @param useHTML <p>Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the legend item texts. Prior to 2.1.7, when using HTML, <a href="#legend.navigation">legend.navigation</a> was disabled.</p>
    * @param verticalAlign <p>The vertical alignment of the legend box. Can be one of <code>top</code>, <code>middle</code> or  <code>bottom</code>. Vertical position can be further determined by the <code>y</code> option.</p>. . <p>In the case that the legend is aligned in a corner position, the <code>layout</code> option will determine whether to place it above/below or on the side of the plot area.</p>
    * @param width The width of the legend box.
    * @param x The x offset of the legend relative to its horizontal alignment <code>align</code> within chart.spacingLeft and chart.spacingRight. Negative x moves it to the left, positive x moves it to the right.
    * @param y The vertical offset of the legend relative to it's vertical alignment <code>verticalAlign</code> within chart.spacingTop and chart.spacingBottom. Negative y moves it up, positive y moves it down.
    */
  def apply(align: js.UndefOr[String] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, floating: js.UndefOr[Boolean] = js.undefined, itemDistance: js.UndefOr[Double] = js.undefined, itemHiddenStyle: js.UndefOr[js.Object] = js.undefined, itemHoverStyle: js.UndefOr[js.Object] = js.undefined, itemMarginBottom: js.UndefOr[Double] = js.undefined, itemMarginTop: js.UndefOr[Double] = js.undefined, itemStyle: js.UndefOr[js.Object] = js.undefined, itemWidth: js.UndefOr[Double] = js.undefined, labelFormat: js.UndefOr[String] = js.undefined, labelFormatter: js.UndefOr[js.Function] = js.undefined, layout: js.UndefOr[String] = js.undefined, margin: js.UndefOr[Double] = js.undefined, maxHeight: js.UndefOr[Double] = js.undefined, navigation: js.UndefOr[CleanJsObject[LegendNavigation]] = js.undefined, padding: js.UndefOr[Double] = js.undefined, reversed: js.UndefOr[Boolean] = js.undefined, shadow: js.UndefOr[Boolean | js.Object] = js.undefined, squareSymbol: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, symbolHeight: js.UndefOr[Double] = js.undefined, symbolPadding: js.UndefOr[Double] = js.undefined, symbolRadius: js.UndefOr[Double] = js.undefined, symbolWidth: js.UndefOr[Double] = js.undefined, title: js.UndefOr[CleanJsObject[LegendTitle]] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): Legend = {
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
    val marginOuter: js.UndefOr[Double] = margin
    val maxHeightOuter: js.UndefOr[Double] = maxHeight
    val navigationOuter: js.UndefOr[CleanJsObject[LegendNavigation]] = navigation
    val paddingOuter: js.UndefOr[Double] = padding
    val reversedOuter: js.UndefOr[Boolean] = reversed
    val shadowOuter: js.UndefOr[Boolean | js.Object] = shadow
    val squareSymbolOuter: js.UndefOr[Boolean] = squareSymbol
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
      override val margin: js.UndefOr[Double] = marginOuter
      override val maxHeight: js.UndefOr[Double] = maxHeightOuter
      override val navigation: js.UndefOr[CleanJsObject[LegendNavigation]] = navigationOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val reversed: js.UndefOr[Boolean] = reversedOuter
      override val shadow: js.UndefOr[Boolean | js.Object] = shadowOuter
      override val squareSymbol: js.UndefOr[Boolean] = squareSymbolOuter
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
