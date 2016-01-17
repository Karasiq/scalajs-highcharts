/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/alignment/" target="_blank">Legend alignment</a>
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * The background color of the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/border-background/" target="_blank">Border and background options</a>
    */
  val backgroundColor: js.UndefOr[String] = js.undefined

  /**
    * The color of the drawn border around the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/border-background/" target="_blank">Border and background options</a>
    */
  val borderColor: js.UndefOr[String] = js.undefined

  /**
    * The border corner radius of the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/border-background/" target="_blank">Border and background options</a>
    */
  val borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The width of the drawn border around the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/border-background/" target="_blank">Border and background options</a>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * Enable or disable the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/enabled-false/" target="_blank">Legend disabled</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * When the legend is floating, the plot area ignores it and is allowed to be placed below it.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/alignment/" target="_blank">Floating legend</a>
    */
  val floating: js.UndefOr[Boolean] = js.undefined

  /**
    * In a legend with horizontal layout, the itemDistance defines the pixel distance between each item. 
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/itemstyle/" target="_blank">Item text styles</a>
    */
  val itemHoverStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * The pixel bottom margin for each legend item.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/padding-itemmargin/" target="_blank">Padding and item margins demonstrated</a>
    */
  val itemMarginBottom: js.UndefOr[Double] = js.undefined

  /**
    * The pixel top margin for each legend item.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/padding-itemmargin/" target="_blank">Padding and item margins demonstrated</a>
    */
  val itemMarginTop: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for each legend item. Only a subset of CSS is supported, notably those options related to text.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/itemstyle/" target="_blank">Item text styles</a>
    */
  val itemStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * The width for each legend item. This is useful in a horizontal layout with many items when you want the items to align vertically.  .
    */
  val itemWidth: js.UndefOr[Double] = js.undefined

  /**
    * A <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting">format string</a> for each legend label. Available variables relates to properties on the series, or the point in case of pies.
    */
  val labelFormat: js.UndefOr[String] = js.undefined

  /**
    * Callback function to format each of the series' labels. The <em>this</em> keyword refers to the series object, or the axis or data class object in case of color axes. By default the series or item name is printed.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/labelformatter/" target="_blank">Data classes with label formatter</a>
    */
  val labelFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * The layout of the legend items. Can be one of "horizontal" or "vertical".
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/padding-itemmargin/" target="_blank">Vertical with data classes</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/layout-vertical/" target="_blank">vertical with color axis gradient</a>.
    */
  val layout: js.UndefOr[String] = js.undefined

  /**
    * If the plot area sized is calculated automatically and the legend is not floating, the legend margin is the  space between the legend and the axis labels or plot area.
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * Maximum pixel height for the legend. When the maximum height is extended, navigation will show.
    */
  val maxHeight: js.UndefOr[Double] = js.undefined

  /**
    * <p>Options for the paging or navigation appearing when the legend is overflown. When <a href="#legend.useHTML">legend.useHTML</a> is enabled, navigation is disabled.</p>
    * 
    * <p>For demo cases, see the <a href="/highcharts/#legend.navigation">legend.navigation options for basic Highcharts</a>.
    */
  val navigation: js.UndefOr[CleanJsObject[LegendNavigation]] = js.undefined

  /**
    * The inner padding of the legend box.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/padding-itemmargin/" target="_blank">
				Padding and item margins demonstrated</a>
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * Whether to reverse the order of the legend items compared to the order of the series or data classes as defined in the configuration object.
    */
  val reversed: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to show the symbol on the right side of the text rather than the left side.  This is common in Arabic and Hebraic.
    */
  val rtl: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to apply a drop shadow to the legend. A <code>backgroundColor</code>
    *  also needs to be applied for this to take effect. The shadow can also be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/border-background/" target="_blank">Border and background options</a>
    */
  val shadow: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * The pixel height of the legend item symbol. Defaults to font size for regular item symbols as well as for gradient symbols on horizontal color axis and <code>200</code> for gradient symbols on vertical color axis. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/layout-vertical-sized/" target="_blank">Sized vertical gradient</a>. <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/padding-itemmargin/" target="_blank">No distance between data classes</a>.
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
    * The pixel width of the legend item symbol. Defaults to <code>16</code> for regular item symbols, <code>200</code> for gradient symbols on horizontal color axis and <code>12</code> for gradient symbols on vertical color axis. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/padding-itemmargin/" target="_blank">Padding and item margins demonstrated</a>. <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/layout-vertical-sized/" target="_blank">Sized vertical gradient</a>.
    */
  val symbolWidth: js.UndefOr[Double] = js.undefined

  /**
    * A title to be added on top of the legend.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/alignment/" target="_blank">Legend with title</a>
    */
  val title: js.UndefOr[CleanJsObject[LegendTitle]] = js.undefined

  /**
    * <p>Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the legend item texts. Prior to 1.1.7, when using HTML, <a href="#legend.navigation">legend.navigation</a> was disabled.</p>
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The vertical alignment of the legend box. Can be one of <code>top</code>, <code>middle</code> or  <code>bottom</code>. Vertical position can be further determined by the <code>y</code> option.</p>
    * 
    * <p>In the case that the legend is aligned in a corner position, the <code>layout</code> option will determine whether to place it above/below or on the side of the plot area.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/alignment/" target="_blank">Legend alignment</a>
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/legend/alignment/" target="_blank">Legend alignment</a>
    */
  val y: js.UndefOr[Double] = js.undefined
}
