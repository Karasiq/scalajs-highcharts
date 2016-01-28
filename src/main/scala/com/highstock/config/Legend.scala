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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * The background color of the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The color of the drawn border around the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border corner radius of the legend.
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The width of the drawn border around the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * Enable or disable the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * When the legend is floating, the plot area ignores it and is allowed to be placed below it.
    */
  val floating: js.UndefOr[Boolean] = js.undefined

  /**
    * In a legend with horizontal layout, the itemDistance defines the pixel distance between each item. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/layout-horizontal/" target="_blank">50px item distance</a>
    * @since 1.3.3
    */
  val itemDistance: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for each legend item when the corresponding series or point is hidden. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here. Defaults to:
    * <pre>itemHiddenStyle: {
    * 	color: '#CCC'
    * }</pre>
    */
  val itemHiddenStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * CSS styles for each legend item in hover mode. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from <code>style</code> unless overridden here. Defaults to:
    * <pre>itemHoverStyle: {
    * 	color: '#000'
    * }</pre>
    */
  val itemHoverStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * The pixel bottom margin for each legend item.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/padding-itemmargin/" target="_blank">
				Padding and item margins demonstrated</a>
    * @since 1.1
    */
  val itemMarginBottom: js.UndefOr[Double] = js.undefined

  /**
    * The pixel top margin for each legend item.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/padding-itemmargin/" target="_blank">
				Padding and item margins demonstrated</a>
    * @since 1.1
    */
  val itemMarginTop: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for each legend item. Only a subset of CSS is supported, notably those options related to text.
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/legend/layout-horizontal/" target="_blank">Horizontal by default</a>
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/padding-itemmargin/" target="_blank">
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
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
    */
  val symbolPadding: js.UndefOr[Double] = js.undefined

  /**
    * The border radius of the symbol for series types that use a rectangle in the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/legend/symbolradius/" target="_blank">Round symbols</a>
    */
  val symbolRadius: js.UndefOr[Double] = js.undefined

  /**
    * The pixel width of the legend item symbol.
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/legend/align/" target="_blank">Various legend options</a>
    */
  val y: js.UndefOr[Double] = js.undefined
}
