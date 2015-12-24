/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.3 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class Legend extends js.Object {
  
  /**
   * <p>The horizontal alignment of the legend box within the chart area. Valid values are <code>left</code>, <code>center</code> and <code>right</code>.</p>
   * 
   * <p>In the case that the legend is aligned in a corner position, the <code>layout</code> option will determine whether to place it above/below or on the side of the plot area.</p>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/align/" target="_blank">Legend at the right of the chart</a>
   * @since 2.0
   */
  val align: String = "center"
  
  /**
   * The background color of the legend.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/backgroundcolor/" target="_blank">Yellowish background</a>
   */
  val backgroundColor: UndefOr[String] = js.undefined
  
  /**
   * The color of the drawn border around the legend.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/bordercolor/" target="_blank">Brown border</a>
   */
  val borderColor: String = "#909090"
  
  /**
   * The border corner radius of the legend.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/borderradius-default/" target="_blank">Square by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/borderradius-round/" target="_blank">5px rounded</a>
   */
  val borderRadius: Double = 0
  
  /**
   * The width of the drawn border around the legend.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/borderwidth/" target="_blank">2px border width</a>
   */
  val borderWidth: Double = 0
  
  /**
   * Enable or disable the legend.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/enabled-false/" target="_blank">Legend disabled</a>
   */
  val enabled: Boolean = true
  
  /**
   * When the legend is floating, the plot area ignores it and is allowed to be placed below it.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/floating-false/" target="_blank">False by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/floating-true/" target="_blank">true</a>.
   * @since 2.1
   */
  val floating: Boolean = false
  
  /**
   * In a legend with horizontal layout, the itemDistance defines the pixel distance between each item. 
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/layout-horizontal/" target="_blank">50px item distance</a>
   * @since 3.0.3
   */
  val itemDistance: Double = 20
  
  /**
   * CSS styles for each legend item when the corresponding series or point is hidden. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here. Defaults to:
   * <pre>itemHiddenStyle: {
   * 	color: '#CCC'
   * }</pre>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/itemhiddenstyle/" target="_blank">Darker gray color</a>
   */
  val itemHiddenStyle: UndefOr[js.Object] = js.undefined
  
  /**
   * CSS styles for each legend item in hover mode. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here. Defaults to:
   * <pre>itemHoverStyle: {
   * 	color: '#000'
   * }</pre>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/itemhoverstyle/" target="_blank">Red on hover</a>
   */
  val itemHoverStyle: UndefOr[js.Object] = js.undefined
  
  /**
   * The pixel bottom margin for each legend item.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/padding-itemmargin/" target="_blank">
				Padding and item margins demonstrated</a>
   * @since 2.2.0
   */
  val itemMarginBottom: Double = 0
  
  /**
   * The pixel top margin for each legend item.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/padding-itemmargin/" target="_blank">
				Padding and item margins demonstrated</a>
   * @since 2.2.0
   */
  val itemMarginTop: Double = 0
  
  /**
   * CSS styles for each legend item. Only a subset of CSS is supported, notably those options related to text.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/itemstyle/" target="_blank">Bold black text</a>
   */
  val itemStyle: js.Object = js.eval("{ \"color\": \"#333333\", \"cursor\": \"pointer\", \"fontSize\": \"12px\", \"fontWeight\": \"bold\" }").asInstanceOf[js.Object]
  
  /**
   * The width for each legend item. This is useful in a horizontal layout with many items when you want the items to align vertically.  .
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/itemwidth-default/" target="_blank">Null by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/itemwidth-80/" target="_blank">80 for aligned legend items</a>
   * @since 2.0
   */
  val itemWidth: UndefOr[Double] = js.undefined
  
  /**
   * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for each legend label. Available variables relates to properties on the series, or the point in case of pies.
   * @since 1.3
   */
  val labelFormat: String = "{name}"
  
  /**
   * Callback function to format each of the series' labels. The <em>this</em> keyword refers to the series object, or the point object in case of pie charts. By default the series or point name is printed.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/labelformatter/" target="_blank">Add text</a>
   */
  val labelFormatter: UndefOr[js.Function] = js.undefined
  
  /**
   * The layout of the legend items. Can be one of "horizontal" or "vertical".
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/layout-horizontal/" target="_blank">Horizontal by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/layout-vertical/" target="_blank">vertical</a>
   */
  val layout: String = "horizontal"
  
  /**
   * Line height for the legend items. Deprecated as of 2.1. Instead, the line height for each  item can be set using itemStyle.lineHeight, and the padding between items using itemMarginTop and itemMarginBottom.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/lineheight/" target="_blank">Setting padding</a>.
   * @since 2.0
   */
  val lineHeight: Double = 16
  
  /**
   * If the plot area sized is calculated automatically and the legend is not floating, the legend margin is the  space between the legend and the axis labels or plot area.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/margin-default/" target="_blank">12 pixels by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/margin-30/" target="_blank">30 pixels</a>.
   * @since 2.1
   */
  val margin: Double = 12
  
  /**
   * Maximum pixel height for the legend. When the maximum height is extended, navigation will show.
   * @since 2.3.0
   */
  val maxHeight: UndefOr[Double] = js.undefined
  
  /**
   * Options for the paging or navigation appearing when the legend is overflown.
   */
  val navigation: UndefOr[LegendNavigation] = js.undefined
  
  /**
   * The inner padding of the legend box.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/padding-itemmargin/" target="_blank">
				Padding and item margins demonstrated</a>
   * @since 2.2.0
   */
  val padding: Double = 8
  
  /**
   * Whether to reverse the order of the legend items compared to the order of the series or points as defined in the configuration object.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/reversed/" target="_blank">Stacked bar with reversed legend</a>
   * @since 1.2.5
   */
  val reversed: Boolean = false
  
  /**
   * Whether to show the symbol on the right side of the text rather than the left side.  This is common in Arabic and Hebraic.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/rtl/" target="_blank">Symbol to the right</a>
   * @since 2.2
   */
  val rtl: Boolean = false
  
  /**
   * Whether to apply a drop shadow to the legend. A <code>backgroundColor</code>
   *  also needs to be applied for this to take effect. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/shadow/" target="_blank">White background and drop shadow</a>
   */
  val shadow: js.Any = false
  
  /**
   * CSS styles for the legend area. In the 1.x versions the position of the legend area was determined by CSS. In 2.x, the position is determined by properties like  <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>, but the styles are still parsed for backwards compatibility.
   */
  @deprecated
  val style: UndefOr[js.Object] = js.undefined
  
  /**
   * The pixel height of the symbol for series types that use a rectangle in the legend. Defaults to the font size of legend items.
   * @since 3.0.8
   */
  val symbolHeight: UndefOr[Double] = js.undefined
  
  /**
   * The pixel padding between the legend item symbol and the legend item text.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/symbolpadding/" target="_blank">Greater symbol width and padding</a>
   */
  val symbolPadding: Double = 5
  
  /**
   * The border radius of the symbol for series types that use a rectangle in the legend.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/symbolradius/" target="_blank">Round symbols</a>
   * @since 3.0.8
   */
  val symbolRadius: Double = 0
  
  /**
   * The pixel width of the legend item symbol.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/symbolwidth/" target="_blank">Greater symbol width and padding</a>
   */
  val symbolWidth: Double = 16
  
  /**
   * A title to be added on top of the legend.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/title/" target="_blank">Legend title</a>
   * @since 3.0
   */
  val title: UndefOr[LegendTitle] = js.undefined
  
  /**
   * <p>Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the legend item texts. Prior to 4.1.7, when using HTML, <a href="#legend.navigation">legend.navigation</a> was disabled.</p>
   */
  val useHTML: Boolean = false
  
  /**
   * <p>The vertical alignment of the legend box. Can be one of <code>top</code>, <code>middle</code> or  <code>bottom</code>. Vertical position can be further determined by the <code>y</code> option.</p>
   * 
   * <p>In the case that the legend is aligned in a corner position, the <code>layout</code> option will determine whether to place it above/below or on the side of the plot area.</p>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/verticalalign/" target="_blank">Legend 100px from the top of the chart</a>
   * @since 2.0
   */
  val verticalAlign: String = "bottom"
  
  /**
   * The width of the legend box.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/width/" target="_blank">Aligned to the plot area</a>
   * @since 2.0
   */
  val width: UndefOr[Double] = js.undefined
  
  /**
   * The x offset of the legend relative to its horizontal alignment <code>align</code> within chart.spacingLeft and chart.spacingRight. Negative x moves it to the left, positive x moves it to the right. 
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/width/" target="_blank">Aligned to the plot area</a>
   * @since 2.0
   */
  val x: Double = 0
  
  /**
   * The vertical offset of the legend relative to it's vertical alignment <code>verticalAlign</code> within chart.spacingTop and chart.spacingBottom. Negative y moves it up, positive y moves it down.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/verticalalign/" target="_blank">Legend 100px from the top of the chart</a>
   * @since 2.0
   */
  val y: Double = 0
}
