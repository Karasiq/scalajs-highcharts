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
class RangeSelector extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The vertical alignment of the rangeselector box. Allowed properties
    * are <code>top</code>, <code>middle</code>, <code>bottom</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/vertical-align-middle/">Middle</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/vertical-align-bottom/">Bottom</a>
    * @since 6.0.0
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>A collection of attributes for the buttons. The object takes SVG
    * attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code>, as well as <code>style</code>,
    * a collection of CSS properties for the text.</p>
    * <p>The object can also be extended with states, so you can set
    * presentational options for <code>hover</code>, <code>select</code> or <code>disabled</code> button
    * states.</p>
    * <p>CSS styles for the text label.</p>
    * <p>In styled mode, the buttons are styled by the
    * <code>.highcharts-range-selector-buttons .highcharts-button</code> rule with its
    * different states.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/">Styling the buttons and inputs</a>
    */
  val buttonTheme: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>When the rangeselector is floating, the plot area does not reserve
    * space for it. This opens for positioning anywhere on the chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/floating/">Placing the range selector between the plot area and the navigator</a>
    * @since 6.0.0
    */
  val floating: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The x offset of the range selector relative to its horizontal
    * alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @since 6.0.0
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y offset of the range selector relative to its horizontal
    * alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @since 6.0.0
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * <p>Deprecated. The height of the range selector. Currently it is
    * calculated dynamically.</p>
    * @since 2.1.9
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * <p>Positioning for the input boxes. Allowed properties are <code>align</code>,
    *  <code>x</code> and <code>y</code>.</p>
    * @since 1.2.4
    */
  val inputPosition: js.Any = js.undefined

  /**
    * <p>Positioning for the button row.</p>
    * @since 1.2.4
    */
  val buttonPosition: js.Any = js.undefined

  /**
    * <p>CSS styles for the labels - the Zoom, From and To texts.</p>
    * <p>In styled mode, the labels are styled by the
    * <code>.highcharts-range-label</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/">Styling the buttons and inputs</a>
    */
  val labelStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Whether to enable all buttons from the start. By default buttons are
    * only enabled if the corresponding time range exists on the X axis,
    * but enabling all buttons allows for dynamically loading different
    * time ranges.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/allbuttonsenabled-true/">All buttons enabled</a>
    * @since 2.0.3
    */
  val allButtonsEnabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>An array of configuration objects for the buttons.</p>
    * <p>Defaults to</p>
    * <pre>buttons: [{
    *     type: 'month',
    *     count: 1,
    *     text: '1m'
    * }, {
    *     type: 'month',
    *     count: 3,
    *     text: '3m'
    * }, {
    *     type: 'month',
    *     count: 6,
    *     text: '6m'
    * }, {
    *     type: 'ytd',
    *     text: 'YTD'
    * }, {
    *     type: 'year',
    *     count: 1,
    *     text: '1y'
    * }, {
    *     type: 'all',
    *     text: 'All'
    * }]</pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/datagrouping/">Data grouping by buttons</a>
    */
  val buttons: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>The space in pixels between the buttons in the range selector.</p>
    */
  val buttonSpacing: js.UndefOr[Double] = js.undefined

  /**
    * <p>Enable or disable the range selector.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/enabled/">Disable the range selector</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The border color of the date input boxes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/">Styling the buttons and inputs</a>
    * @since 1.3.7
    */
  val inputBoxBorderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The pixel height of the date input boxes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/">Styling the buttons and inputs</a>
    * @since 1.3.7
    */
  val inputBoxHeight: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS for the container DIV holding the input boxes. Deprecated as
    * of 1.2.5. Use <a href="#rangeSelector.inputPosition">inputPosition</a> instead.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/">Styling the buttons and inputs</a>
    */
  val inputBoxStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The pixel width of the date input boxes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/">Styling the buttons and inputs</a>
    * @since 1.3.7
    */
  val inputBoxWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The date format in the input boxes when not selected for editing.
    * Defaults to <code>%b %e, %Y</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/input-format/">Milliseconds in the range selector</a>
    */
  val inputDateFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>A custom callback function to parse values entered in the input boxes
    * and return a valid JavaScript time as milliseconds since 1970.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/input-format/">Milliseconds in the range selector</a>
    * @since 1.3.3
    */
  val inputDateParser: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>The date format in the input boxes when they are selected for
    * editing. This must be a format that is recognized by JavaScript
    * Date.parse.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/input-format/">Milliseconds in the range selector</a>
    */
  val inputEditDateFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable the date input boxes. Defaults to enabled when
    * there is enough space, disabled if not (typically mobile).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/input-datepicker/">Extending the input with a jQuery UI datepicker</a>
    */
  val inputEnabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The index of the button to appear pre-selected.</p>
    */
  val selected: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS for the HTML inputs in the range selector.</p>
    * <p>In styled mode, the inputs are styled by the
    * <code>.highcharts-range-input text</code> rule in SVG mode, and
    * <code>input.highcharts-range-selector</code> when active.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/">Styling the buttons and inputs</a>
    */
  val inputStyle: js.UndefOr[js.Object] = js.undefined
}

object RangeSelector {
  /**
    * @param verticalAlign <p>The vertical alignment of the rangeselector box. Allowed properties. are <code>top</code>, <code>middle</code>, <code>bottom</code>.</p>
    * @param buttonTheme <p>A collection of attributes for the buttons. The object takes SVG. attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code>, as well as <code>style</code>,. a collection of CSS properties for the text.</p>. <p>The object can also be extended with states, so you can set. presentational options for <code>hover</code>, <code>select</code> or <code>disabled</code> button. states.</p>. <p>CSS styles for the text label.</p>. <p>In styled mode, the buttons are styled by the. <code>.highcharts-range-selector-buttons .highcharts-button</code> rule with its. different states.</p>
    * @param floating <p>When the rangeselector is floating, the plot area does not reserve. space for it. This opens for positioning anywhere on the chart.</p>
    * @param x <p>The x offset of the range selector relative to its horizontal. alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @param y <p>The y offset of the range selector relative to its horizontal. alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @param height <p>Deprecated. The height of the range selector. Currently it is. calculated dynamically.</p>
    * @param inputPosition <p>Positioning for the input boxes. Allowed properties are <code>align</code>,.  <code>x</code> and <code>y</code>.</p>
    * @param buttonPosition <p>Positioning for the button row.</p>
    * @param labelStyle <p>CSS styles for the labels - the Zoom, From and To texts.</p>. <p>In styled mode, the labels are styled by the. <code>.highcharts-range-label</code> class.</p>
    * @param allButtonsEnabled <p>Whether to enable all buttons from the start. By default buttons are. only enabled if the corresponding time range exists on the X axis,. but enabling all buttons allows for dynamically loading different. time ranges.</p>
    * @param buttons <p>An array of configuration objects for the buttons.</p>. <p>Defaults to</p>. <pre>buttons: [{.     type: 'month',.     count: 1,.     text: '1m'. }, {.     type: 'month',.     count: 3,.     text: '3m'. }, {.     type: 'month',.     count: 6,.     text: '6m'. }, {.     type: 'ytd',.     text: 'YTD'. }, {.     type: 'year',.     count: 1,.     text: '1y'. }, {.     type: 'all',.     text: 'All'. }]</pre>
    * @param buttonSpacing <p>The space in pixels between the buttons in the range selector.</p>
    * @param enabled <p>Enable or disable the range selector.</p>
    * @param inputBoxBorderColor <p>The border color of the date input boxes.</p>
    * @param inputBoxHeight <p>The pixel height of the date input boxes.</p>
    * @param inputBoxStyle <p>CSS for the container DIV holding the input boxes. Deprecated as. of 1.2.5. Use <a href="#rangeSelector.inputPosition">inputPosition</a> instead.</p>
    * @param inputBoxWidth <p>The pixel width of the date input boxes.</p>
    * @param inputDateFormat <p>The date format in the input boxes when not selected for editing.. Defaults to <code>%b %e, %Y</code>.</p>
    * @param inputDateParser <p>A custom callback function to parse values entered in the input boxes. and return a valid JavaScript time as milliseconds since 1970.</p>
    * @param inputEditDateFormat <p>The date format in the input boxes when they are selected for. editing. This must be a format that is recognized by JavaScript. Date.parse.</p>
    * @param inputEnabled <p>Enable or disable the date input boxes. Defaults to enabled when. there is enough space, disabled if not (typically mobile).</p>
    * @param selected <p>The index of the button to appear pre-selected.</p>
    * @param inputStyle <p>CSS for the HTML inputs in the range selector.</p>. <p>In styled mode, the inputs are styled by the. <code>.highcharts-range-input text</code> rule in SVG mode, and. <code>input.highcharts-range-selector</code> when active.</p>
    */
  def apply(verticalAlign: js.UndefOr[String] = js.undefined, buttonTheme: js.UndefOr[js.Object] = js.undefined, floating: js.UndefOr[Boolean] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, inputPosition: js.UndefOr[js.Any] = js.undefined, buttonPosition: js.UndefOr[js.Any] = js.undefined, labelStyle: js.UndefOr[js.Object] = js.undefined, allButtonsEnabled: js.UndefOr[Boolean] = js.undefined, buttons: js.UndefOr[js.Array[js.Any]] = js.undefined, buttonSpacing: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, inputBoxBorderColor: js.UndefOr[String | js.Object] = js.undefined, inputBoxHeight: js.UndefOr[Double] = js.undefined, inputBoxStyle: js.UndefOr[js.Object] = js.undefined, inputBoxWidth: js.UndefOr[Double] = js.undefined, inputDateFormat: js.UndefOr[String] = js.undefined, inputDateParser: js.UndefOr[js.Function] = js.undefined, inputEditDateFormat: js.UndefOr[String] = js.undefined, inputEnabled: js.UndefOr[Boolean] = js.undefined, selected: js.UndefOr[Double] = js.undefined, inputStyle: js.UndefOr[js.Object] = js.undefined): RangeSelector = {
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val buttonThemeOuter: js.UndefOr[js.Object] = buttonTheme
    val floatingOuter: js.UndefOr[Boolean] = floating
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val heightOuter: js.UndefOr[Double] = height
    val inputPositionOuter: js.Any = inputPosition
    val buttonPositionOuter: js.Any = buttonPosition
    val labelStyleOuter: js.UndefOr[js.Object] = labelStyle
    val allButtonsEnabledOuter: js.UndefOr[Boolean] = allButtonsEnabled
    val buttonsOuter: js.UndefOr[js.Array[js.Any]] = buttons
    val buttonSpacingOuter: js.UndefOr[Double] = buttonSpacing
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val inputBoxBorderColorOuter: js.UndefOr[String | js.Object] = inputBoxBorderColor
    val inputBoxHeightOuter: js.UndefOr[Double] = inputBoxHeight
    val inputBoxStyleOuter: js.UndefOr[js.Object] = inputBoxStyle
    val inputBoxWidthOuter: js.UndefOr[Double] = inputBoxWidth
    val inputDateFormatOuter: js.UndefOr[String] = inputDateFormat
    val inputDateParserOuter: js.UndefOr[js.Function] = inputDateParser
    val inputEditDateFormatOuter: js.UndefOr[String] = inputEditDateFormat
    val inputEnabledOuter: js.UndefOr[Boolean] = inputEnabled
    val selectedOuter: js.UndefOr[Double] = selected
    val inputStyleOuter: js.UndefOr[js.Object] = inputStyle
    com.highcharts.HighchartsGenericObject.toCleanObject(new RangeSelector {
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val buttonTheme: js.UndefOr[js.Object] = buttonThemeOuter
      override val floating: js.UndefOr[Boolean] = floatingOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val inputPosition: js.Any = inputPositionOuter
      override val buttonPosition: js.Any = buttonPositionOuter
      override val labelStyle: js.UndefOr[js.Object] = labelStyleOuter
      override val allButtonsEnabled: js.UndefOr[Boolean] = allButtonsEnabledOuter
      override val buttons: js.UndefOr[js.Array[js.Any]] = buttonsOuter
      override val buttonSpacing: js.UndefOr[Double] = buttonSpacingOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val inputBoxBorderColor: js.UndefOr[String | js.Object] = inputBoxBorderColorOuter
      override val inputBoxHeight: js.UndefOr[Double] = inputBoxHeightOuter
      override val inputBoxStyle: js.UndefOr[js.Object] = inputBoxStyleOuter
      override val inputBoxWidth: js.UndefOr[Double] = inputBoxWidthOuter
      override val inputDateFormat: js.UndefOr[String] = inputDateFormatOuter
      override val inputDateParser: js.UndefOr[js.Function] = inputDateParserOuter
      override val inputEditDateFormat: js.UndefOr[String] = inputEditDateFormatOuter
      override val inputEnabled: js.UndefOr[Boolean] = inputEnabledOuter
      override val selected: js.UndefOr[Double] = selectedOuter
      override val inputStyle: js.UndefOr[js.Object] = inputStyleOuter
    })
  }
}
