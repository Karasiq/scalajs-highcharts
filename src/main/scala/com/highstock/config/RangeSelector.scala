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
  * @note JavaScript name: <code>rangeSelector</code>
  */
@js.annotation.ScalaJSDefined
class RangeSelector extends js.Object {

  /**
    * Whether to enable all buttons from the start. By default buttons are only enabled if the corresponding time range exists on the X axis, but enabling all buttons allows for dynamically loading different time ranges.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/rangeselector/allbuttonsenabled-true/" target="_blank">All buttons enabled</a>
    * @since 2.0.3
    */
  val allButtonsEnabled: js.UndefOr[Boolean] = js.undefined

  /**
    * The space in pixels between the buttons in the range selector.
    */
  val buttonSpacing: js.UndefOr[Double] = js.undefined

  /**
    * A collection of attributes for the buttons. The object takes SVG attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code>, as well as <code>style</code>, a collection of CSS properties for the text.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/rangeselector/styling/" target="_blank">Styling the buttons and inputs</a>
    */
  val buttonTheme: js.UndefOr[js.Object] = js.undefined

  /**
    * An array of configuration objects for the buttons. The individual options for each item are:  
    * 
    * <dl>
    *  	<dt><code>type</code></dt>
    *  	<dd>Defines the timespan, can be one of 'millisecond', 'second', 'minute', 'day', 'week',  		'month', 'ytd' (year to date), 'year' and 'all'.</dd>
    * 
    *  	<dt><code>count</code></dt>
    *  	<dd>Defines how many units of the defined type to use.</dd>
    * 
    *  	<dt><code>dataGrouping</code></dt>
    *  	<dd>A custom data grouping definition for the button.</dd>
    * 
    *  	<dt><code>text</code></dt>
    *  	<dd>The text for the button itself</dd>
    *  
    * </dl>
    * 
    * 
    * Defaults to 
    * <pre>buttons: [{
    * 	type: 'month',
    * 	count: 1,
    * 	text: '1m'
    * }, {
    * 	type: 'month',
    * 	count: 3,
    * 	text: '3m'
    * }, {
    * 	type: 'month',
    * 	count: 6,
    * 	text: '6m'
    * }, {
    * 	type: 'ytd',
    * 	text: 'YTD'
    * }, {
    * 	type: 'year',
    * 	count: 1,
    * 	text: '1y'
    * }, {
    * 	type: 'all',
    * 	text: 'All'
    * }]</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/rangeselector/datagrouping/" target="_blank">Data grouping by buttons</a>
    */
  val buttons: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * Enable or disable the range selector.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/rangeselector/enabled/" target="_blank">Disable the range selector</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * The height of the range selector, used to reserve space for buttons and input.
    * @since 2.1.9
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * The border color of the date input boxes.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/rangeselector/styling/" target="_blank">Styling the buttons and inputs</a>
    * @since 1.3.7
    */
  val inputBoxBorderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pixel height of the date input boxes.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/rangeselector/styling/" target="_blank">Styling the buttons and inputs</a>
    * @since 1.3.7
    */
  val inputBoxHeight: js.UndefOr[Double] = js.undefined

  /**
    * CSS for the container DIV holding the input boxes. Deprecated as of 1.2.5. Use <a href="#rangeSelector.inputPosition">inputPosition</a> instead.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/rangeselector/styling/" target="_blank">Styling the buttons and inputs</a>
    */
  val inputBoxStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * The pixel width of the date input boxes. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/rangeselector/styling/" target="_blank">Styling the buttons and inputs</a>
    * @since 1.3.7
    */
  val inputBoxWidth: js.UndefOr[Double] = js.undefined

  /**
    * The date format in the input boxes when not selected for editing.
    * 		 Defaults to <code>%b %e, %Y</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/rangeselector/input-format/" target="_blank">Milliseconds in the range selector</a>
    */
  val inputDateFormat: js.UndefOr[String] = js.undefined

  /**
    * A custom callback function to parse values entered in the input boxes and return a valid JavaScript time as milliseconds since 1970.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/rangeselector/input-format/" target="_blank">Milliseconds in the range selector</a>
    * @since 1.3.3
    */
  val inputDateParser: js.UndefOr[js.Function] = js.undefined

  /**
    * The date format in the input boxes when they are selected for editing. This must be a format that
    *  is recognized by JavaScript Date.parse.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/rangeselector/input-format/" target="_blank">Milliseconds in the range selector</a>
    */
  val inputEditDateFormat: js.UndefOr[String] = js.undefined

  /**
    * Enable or disable the date input boxes. Defaults to enabled when there is enough space, disabled if not (typically mobile).
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/rangeselector/input-datepicker/" target="_blank">
				Extending the input with a jQuery UI datepicker</a>
    */
  val inputEnabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Positioning for the input boxes. Allowed properties are <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>.
    * @since 1.2.5
    */
  val inputPosition: js.UndefOr[js.Object] = js.undefined

  /**
    * CSS for the HTML inputs in the range selector.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/rangeselector/styling/" target="_blank">Styling the buttons and inputs</a>
    */
  val inputStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * CSS styles for the labels - the Zoom, From and To texts.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/rangeselector/styling/" target="_blank">Styling the buttons and inputs</a>
    */
  val labelStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * The index of the button to appear pre-selected.
    */
  val selected: js.UndefOr[Double] = js.undefined
}
