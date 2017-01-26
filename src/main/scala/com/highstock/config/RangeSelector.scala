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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/rangeselector/allbuttonsenabled-true/" target="_blank">All buttons enabled</a>
    * @since 2.0.3
    */
  val allButtonsEnabled: js.UndefOr[Boolean] = js.undefined

  /**
    * A fixed pixel position for the buttons. Supports two properties, <code>x</code> and <code>y<code>.
    */
  val buttonPosition: js.UndefOr[js.Object] = js.undefined

  /**
    * The space in pixels between the buttons in the range selector.
    */
  val buttonSpacing: js.UndefOr[Double] = js.undefined

  /**
    * <p>A collection of attributes for the buttons. The object takes SVG attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code>, as well as <code>style</code>, a collection of CSS properties for the text.</p>
    * 
    * <p>The object can also be extended with states, so you can set presentational options for <code>hover</code>, <code>select</code> or <code>disabled</code> button states.</p>
    * 
    * <p>CSS styles for the text label.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the buttons are styled by the <code>.highcharts-range-selector-buttons .highcharts-button</code> rule with its different states.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/" target="_blank">Styling the buttons and inputs</a>.
    */
  val buttonTheme: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>An array of configuration objects for the buttons.</p>
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/rangeselector/datagrouping/" target="_blank">Data grouping by buttons</a>
    */
  val buttons: js.UndefOr[js.Array[CleanJsObject[RangeSelectorButtons]]] = js.undefined

  /**
    * Enable or disable the range selector.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/rangeselector/enabled/" target="_blank">Disable the range selector</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * The height of the range selector, used to reserve space for buttons and input.
    * @since 2.1.9
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * The border color of the date input boxes.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/" target="_blank">Styling the buttons and inputs</a>
    * @since 1.3.7
    */
  val inputBoxBorderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pixel height of the date input boxes.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/" target="_blank">Styling the buttons and inputs</a>
    * @since 1.3.7
    */
  val inputBoxHeight: js.UndefOr[Double] = js.undefined

  /**
    * CSS for the container DIV holding the input boxes. Deprecated as of 1.2.5. Use <a href="#rangeSelector.inputPosition">inputPosition</a> instead.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/" target="_blank">Styling the buttons and inputs</a>
    */
  val inputBoxStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * The pixel width of the date input boxes. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/" target="_blank">Styling the buttons and inputs</a>
    * @since 1.3.7
    */
  val inputBoxWidth: js.UndefOr[Double] = js.undefined

  /**
    * The date format in the input boxes when not selected for editing.
    * 		 Defaults to <code>%b %e, %Y</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/rangeselector/input-format/" target="_blank">Milliseconds in the range selector</a>
    */
  val inputDateFormat: js.UndefOr[String] = js.undefined

  /**
    * A custom callback function to parse values entered in the input boxes and return a valid JavaScript time as milliseconds since 1970.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/rangeselector/input-format/" target="_blank">Milliseconds in the range selector</a>
    * @since 1.3.3
    */
  val inputDateParser: js.UndefOr[js.Function] = js.undefined

  /**
    * The date format in the input boxes when they are selected for editing. This must be a format that
    *  is recognized by JavaScript Date.parse.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/rangeselector/input-format/" target="_blank">Milliseconds in the range selector</a>
    */
  val inputEditDateFormat: js.UndefOr[String] = js.undefined

  /**
    * Enable or disable the date input boxes. Defaults to enabled when there is enough space, disabled if not (typically mobile).
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/rangeselector/input-datepicker/" target="_blank">
				Extending the input with a jQuery UI datepicker</a>
    */
  val inputEnabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Positioning for the input boxes. Allowed properties are <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>.
    * @since 1.2.5
    */
  val inputPosition: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>CSS for the HTML inputs in the range selector.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the inputs are styled by the <code>.highcharts-range-input text</code> rule in SVG mode, and <code>input.highcharts-range-selector</code> when active.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/" target="_blank">Styling the buttons and inputs</a>
    */
  val inputStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>CSS styles for the labels - the Zoom, From and To texts.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the labels are styled by the <code>.highcharts-range-label</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/" target="_blank">Styling the buttons and inputs</a>
    */
  val labelStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * The index of the button to appear pre-selected.
    */
  val selected: js.UndefOr[Double] = js.undefined
}

object RangeSelector {
  /**
    * @param allButtonsEnabled Whether to enable all buttons from the start. By default buttons are only enabled if the corresponding time range exists on the X axis, but enabling all buttons allows for dynamically loading different time ranges.
    * @param buttonPosition A fixed pixel position for the buttons. Supports two properties, <code>x</code> and <code>y<code>.
    * @param buttonSpacing The space in pixels between the buttons in the range selector.
    * @param buttonTheme <p>A collection of attributes for the buttons. The object takes SVG attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code>, as well as <code>style</code>, a collection of CSS properties for the text.</p>. . <p>The object can also be extended with states, so you can set presentational options for <code>hover</code>, <code>select</code> or <code>disabled</code> button states.</p>. . <p>CSS styles for the text label.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the buttons are styled by the <code>.highcharts-range-selector-buttons .highcharts-button</code> rule with its different states.</p>
    * @param buttons <p>An array of configuration objects for the buttons.</p>. . Defaults to . <pre>buttons: [{. 	type: 'month',. 	count: 1,. 	text: '1m'. }, {. 	type: 'month',. 	count: 3,. 	text: '3m'. }, {. 	type: 'month',. 	count: 6,. 	text: '6m'. }, {. 	type: 'ytd',. 	text: 'YTD'. }, {. 	type: 'year',. 	count: 1,. 	text: '1y'. }, {. 	type: 'all',. 	text: 'All'. }]</pre>
    * @param enabled Enable or disable the range selector.
    * @param height The height of the range selector, used to reserve space for buttons and input.
    * @param inputBoxBorderColor The border color of the date input boxes.
    * @param inputBoxHeight The pixel height of the date input boxes.
    * @param inputBoxStyle CSS for the container DIV holding the input boxes. Deprecated as of 1.2.5. Use <a href="#rangeSelector.inputPosition">inputPosition</a> instead.
    * @param inputBoxWidth The pixel width of the date input boxes. 
    * @param inputDateFormat The date format in the input boxes when not selected for editing.. 		 Defaults to <code>%b %e, %Y</code>.
    * @param inputDateParser A custom callback function to parse values entered in the input boxes and return a valid JavaScript time as milliseconds since 1970.
    * @param inputEditDateFormat The date format in the input boxes when they are selected for editing. This must be a format that.  is recognized by JavaScript Date.parse.
    * @param inputEnabled Enable or disable the date input boxes. Defaults to enabled when there is enough space, disabled if not (typically mobile).
    * @param inputPosition Positioning for the input boxes. Allowed properties are <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>.
    * @param inputStyle <p>CSS for the HTML inputs in the range selector.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the inputs are styled by the <code>.highcharts-range-input text</code> rule in SVG mode, and <code>input.highcharts-range-selector</code> when active.</p>
    * @param labelStyle <p>CSS styles for the labels - the Zoom, From and To texts.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the labels are styled by the <code>.highcharts-range-label</code> class.</p>
    * @param selected The index of the button to appear pre-selected.
    */
  def apply(allButtonsEnabled: js.UndefOr[Boolean] = js.undefined, buttonPosition: js.UndefOr[js.Object] = js.undefined, buttonSpacing: js.UndefOr[Double] = js.undefined, buttonTheme: js.UndefOr[js.Object] = js.undefined, buttons: js.UndefOr[js.Array[CleanJsObject[RangeSelectorButtons]]] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, height: js.UndefOr[Double] = js.undefined, inputBoxBorderColor: js.UndefOr[String | js.Object] = js.undefined, inputBoxHeight: js.UndefOr[Double] = js.undefined, inputBoxStyle: js.UndefOr[js.Object] = js.undefined, inputBoxWidth: js.UndefOr[Double] = js.undefined, inputDateFormat: js.UndefOr[String] = js.undefined, inputDateParser: js.UndefOr[js.Function] = js.undefined, inputEditDateFormat: js.UndefOr[String] = js.undefined, inputEnabled: js.UndefOr[Boolean] = js.undefined, inputPosition: js.UndefOr[js.Object] = js.undefined, inputStyle: js.UndefOr[js.Object] = js.undefined, labelStyle: js.UndefOr[js.Object] = js.undefined, selected: js.UndefOr[Double] = js.undefined): RangeSelector = {
    val allButtonsEnabledOuter: js.UndefOr[Boolean] = allButtonsEnabled
    val buttonPositionOuter: js.UndefOr[js.Object] = buttonPosition
    val buttonSpacingOuter: js.UndefOr[Double] = buttonSpacing
    val buttonThemeOuter: js.UndefOr[js.Object] = buttonTheme
    val buttonsOuter: js.UndefOr[js.Array[CleanJsObject[RangeSelectorButtons]]] = buttons
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val heightOuter: js.UndefOr[Double] = height
    val inputBoxBorderColorOuter: js.UndefOr[String | js.Object] = inputBoxBorderColor
    val inputBoxHeightOuter: js.UndefOr[Double] = inputBoxHeight
    val inputBoxStyleOuter: js.UndefOr[js.Object] = inputBoxStyle
    val inputBoxWidthOuter: js.UndefOr[Double] = inputBoxWidth
    val inputDateFormatOuter: js.UndefOr[String] = inputDateFormat
    val inputDateParserOuter: js.UndefOr[js.Function] = inputDateParser
    val inputEditDateFormatOuter: js.UndefOr[String] = inputEditDateFormat
    val inputEnabledOuter: js.UndefOr[Boolean] = inputEnabled
    val inputPositionOuter: js.UndefOr[js.Object] = inputPosition
    val inputStyleOuter: js.UndefOr[js.Object] = inputStyle
    val labelStyleOuter: js.UndefOr[js.Object] = labelStyle
    val selectedOuter: js.UndefOr[Double] = selected
    new RangeSelector {
      override val allButtonsEnabled: js.UndefOr[Boolean] = allButtonsEnabledOuter
      override val buttonPosition: js.UndefOr[js.Object] = buttonPositionOuter
      override val buttonSpacing: js.UndefOr[Double] = buttonSpacingOuter
      override val buttonTheme: js.UndefOr[js.Object] = buttonThemeOuter
      override val buttons: js.UndefOr[js.Array[CleanJsObject[RangeSelectorButtons]]] = buttonsOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val inputBoxBorderColor: js.UndefOr[String | js.Object] = inputBoxBorderColorOuter
      override val inputBoxHeight: js.UndefOr[Double] = inputBoxHeightOuter
      override val inputBoxStyle: js.UndefOr[js.Object] = inputBoxStyleOuter
      override val inputBoxWidth: js.UndefOr[Double] = inputBoxWidthOuter
      override val inputDateFormat: js.UndefOr[String] = inputDateFormatOuter
      override val inputDateParser: js.UndefOr[js.Function] = inputDateParserOuter
      override val inputEditDateFormat: js.UndefOr[String] = inputEditDateFormatOuter
      override val inputEnabled: js.UndefOr[Boolean] = inputEnabledOuter
      override val inputPosition: js.UndefOr[js.Object] = inputPositionOuter
      override val inputStyle: js.UndefOr[js.Object] = inputStyleOuter
      override val labelStyle: js.UndefOr[js.Object] = labelStyleOuter
      override val selected: js.UndefOr[Double] = selectedOuter
    }
  }
}
