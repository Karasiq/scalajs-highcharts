/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>rangeSelector</code>
  */
class RangeSelector extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Whether to enable all buttons from the start. By default buttons are
    * only enabled if the corresponding time range exists on the X axis,
    * but enabling all buttons allows for dynamically loading different
    * time ranges.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/allbuttonsenabled-true/">All buttons enabled</a>
    * @since 2.0.3
    */
  var allButtonsEnabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Positioning for the button row.</p>
    * @since 1.2.4
    */
  var buttonPosition: js.Any = js.undefined

  /**
    * <p>The space in pixels between the buttons in the range selector.</p>
    */
  var buttonSpacing: js.UndefOr[Double] = js.undefined

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
  var buttonTheme: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>An array of configuration objects for the buttons.</p>
    * <p>Defaults to:</p>
    * <pre><code class="language-js">buttons: [{
    *     type: &#39;month&#39;,
    *     count: 1,
    *     text: &#39;1m&#39;,
    *     title: &#39;View 1 month&#39;
    * }, {
    *     type: &#39;month&#39;,
    *     count: 3,
    *     text: &#39;3m&#39;,
    *     title: &#39;View 3 months&#39;
    * }, {
    *     type: &#39;month&#39;,
    *     count: 6,
    *     text: &#39;6m&#39;,
    *     title: &#39;View 6 months&#39;
    * }, {
    *     type: &#39;ytd&#39;,
    *     text: &#39;YTD&#39;,
    *     title: &#39;View year to date&#39;
    * }, {
    *     type: &#39;year&#39;,
    *     count: 1,
    *     text: &#39;1y&#39;,
    *     title: &#39;View 1 year&#39;
    * }, {
    *     type: &#39;all&#39;,
    *     text: &#39;All&#39;,
    *     title: &#39;View all&#39;
    * }]
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/datagrouping/">Data grouping by buttons</a>
    */
  var buttons: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>Whether to collapse the range selector buttons into a dropdown when
    * there is not enough room to show everything in a single row, instead
    * of dividing the range selector into multiple rows.
    * Can be one of the following:</p>
    * <ul>
    * <li><code>always</code>: Always collapse</li>
    * <li><code>responsive</code>: Only collapse when there is not enough room</li>
    * <li><code>never</code>: Never collapse</li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/dropdown/">Dropdown option</a>
    * @since 9.0.0
    */
  var dropdown: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable the range selector. Default to <code>true</code> for stock
    * charts, using the <code>stockChart</code> factory.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/enabled/">Disable the range selector</a>
    */
  var enabled: js.UndefOr[js.UndefOr[Boolean]] = js.undefined

  /**
    * <p>When the rangeselector is floating, the plot area does not reserve
    * space for it. This opens for positioning anywhere on the chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/floating/">Placing the range selector between the plot area and the navigator</a>
    * @since 6.0.0
    */
  var floating: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Deprecated. The height of the range selector. Currently it is
    * calculated dynamically.</p>
    * @since 2.1.9
    */
  var height: js.UndefOr[js.UndefOr[Double]] = js.undefined

  /**
    * <p>The border color of the date input boxes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/">Styling the buttons and inputs</a>
    * @since 1.3.7
    */
  var inputBoxBorderColor: js.UndefOr[String] = js.undefined

  /**
    * <p>The pixel height of the date input boxes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/">Styling the buttons and inputs</a>
    * @since 1.3.7
    */
  var inputBoxHeight: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel width of the date input boxes. When <code>undefined</code>, the width
    * is fitted to the rendered content.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/">Styling the buttons and inputs</a>
    * @since 1.3.7
    */
  var inputBoxWidth: js.UndefOr[js.UndefOr[Double]] = js.undefined

  /**
    * <p>The date format in the input boxes when not selected for editing.
    * Defaults to <code>%b %e, %Y</code>.</p>
    * <p>This is used to determine which type of input to show,
    * <code>datetime-local</code>, <code>date</code> or <code>time</code> and falling back to <code>text</code> when
    * the browser does not support the input type or the format contains
    * milliseconds.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/input-type/">Input types</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/input-format/">Milliseconds in the range selector</a>
    */
  var inputDateFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>A custom callback function to parse values entered in the input boxes
    * and return a valid JavaScript time as milliseconds since 1970.
    * The first argument passed is a value to parse,
    * second is a boolean indicating use of the UTC time.</p>
    * <p>This will only get called for inputs of type <code>text</code>. Since v8.2.3,
    * the input type is dynamically determined based on the granularity
    * of the <code>inputDateFormat</code> and the browser support.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/input-format/">Milliseconds in the range selector</a>
    * @since 1.3.3
    */
  var inputDateParser: js.Any = js.undefined

  /**
    * <p>The date format in the input boxes when they are selected for
    * editing. This must be a format that is recognized by JavaScript
    * Date.parse.</p>
    * <p>This will only be used for inputs of type <code>text</code>. Since v8.2.3,
    * the input type is dynamically determined based on the granularity
    * of the <code>inputDateFormat</code> and the browser support.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/input-format/">Milliseconds in the range selector</a>
    */
  var inputEditDateFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable the date input boxes.</p>
    */
  var inputEnabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Positioning for the input boxes. Allowed properties are <code>align</code>,
    *  <code>x</code> and <code>y</code>.</p>
    * @since 1.2.4
    */
  var inputPosition: js.Any = js.undefined

  /**
    * <p>The space in pixels between the labels and the date input boxes in
    * the range selector.</p>
    * @since 9.0.0
    */
  var inputSpacing: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS for the HTML inputs in the range selector.</p>
    * <p>In styled mode, the inputs are styled by the
    * <code>.highcharts-range-input text</code> rule in SVG mode, and
    * <code>input.highcharts-range-selector</code> when active.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/">Styling the buttons and inputs</a>
    */
  var inputStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>CSS styles for the labels - the Zoom, From and To texts.</p>
    * <p>In styled mode, the labels are styled by the
    * <code>.highcharts-range-label</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/styling/">Styling the buttons and inputs</a>
    */
  var labelStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The index of the button to appear pre-selected.</p>
    */
  var selected: js.UndefOr[Double] = js.undefined

  /**
    * <p>The vertical alignment of the rangeselector box. Allowed properties
    * are <code>top</code>, <code>middle</code>, <code>bottom</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/vertical-align-middle/">Middle</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/vertical-align-bottom/">Bottom</a>
    * @since 6.0.0
    */
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The x offset of the range selector relative to its horizontal
    * alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @since 6.0.0
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y offset of the range selector relative to its horizontal
    * alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @since 6.0.0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object RangeSelector {
  /**
    * @param allButtonsEnabled <p>Whether to enable all buttons from the start. By default buttons are. only enabled if the corresponding time range exists on the X axis,. but enabling all buttons allows for dynamically loading different. time ranges.</p>
    * @param buttonPosition <p>Positioning for the button row.</p>
    * @param buttonSpacing <p>The space in pixels between the buttons in the range selector.</p>
    * @param buttonTheme <p>A collection of attributes for the buttons. The object takes SVG. attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code>, as well as <code>style</code>,. a collection of CSS properties for the text.</p>. <p>The object can also be extended with states, so you can set. presentational options for <code>hover</code>, <code>select</code> or <code>disabled</code> button. states.</p>. <p>CSS styles for the text label.</p>. <p>In styled mode, the buttons are styled by the. <code>.highcharts-range-selector-buttons .highcharts-button</code> rule with its. different states.</p>
    * @param buttons <p>An array of configuration objects for the buttons.</p>. <p>Defaults to:</p>. <pre><code class="language-js">buttons: [{.     type: &#39;month&#39;,.     count: 1,.     text: &#39;1m&#39;,.     title: &#39;View 1 month&#39;. }, {.     type: &#39;month&#39;,.     count: 3,.     text: &#39;3m&#39;,.     title: &#39;View 3 months&#39;. }, {.     type: &#39;month&#39;,.     count: 6,.     text: &#39;6m&#39;,.     title: &#39;View 6 months&#39;. }, {.     type: &#39;ytd&#39;,.     text: &#39;YTD&#39;,.     title: &#39;View year to date&#39;. }, {.     type: &#39;year&#39;,.     count: 1,.     text: &#39;1y&#39;,.     title: &#39;View 1 year&#39;. }, {.     type: &#39;all&#39;,.     text: &#39;All&#39;,.     title: &#39;View all&#39;. }]. </code></pre>
    * @param dropdown <p>Whether to collapse the range selector buttons into a dropdown when. there is not enough room to show everything in a single row, instead. of dividing the range selector into multiple rows.. Can be one of the following:</p>. <ul>. <li><code>always</code>: Always collapse</li>. <li><code>responsive</code>: Only collapse when there is not enough room</li>. <li><code>never</code>: Never collapse</li>. </ul>
    * @param enabled <p>Enable or disable the range selector. Default to <code>true</code> for stock. charts, using the <code>stockChart</code> factory.</p>
    * @param floating <p>When the rangeselector is floating, the plot area does not reserve. space for it. This opens for positioning anywhere on the chart.</p>
    * @param height <p>Deprecated. The height of the range selector. Currently it is. calculated dynamically.</p>
    * @param inputBoxBorderColor <p>The border color of the date input boxes.</p>
    * @param inputBoxHeight <p>The pixel height of the date input boxes.</p>
    * @param inputBoxWidth <p>The pixel width of the date input boxes. When <code>undefined</code>, the width. is fitted to the rendered content.</p>
    * @param inputDateFormat <p>The date format in the input boxes when not selected for editing.. Defaults to <code>%b %e, %Y</code>.</p>. <p>This is used to determine which type of input to show,. <code>datetime-local</code>, <code>date</code> or <code>time</code> and falling back to <code>text</code> when. the browser does not support the input type or the format contains. milliseconds.</p>
    * @param inputDateParser <p>A custom callback function to parse values entered in the input boxes. and return a valid JavaScript time as milliseconds since 1970.. The first argument passed is a value to parse,. second is a boolean indicating use of the UTC time.</p>. <p>This will only get called for inputs of type <code>text</code>. Since v8.2.3,. the input type is dynamically determined based on the granularity. of the <code>inputDateFormat</code> and the browser support.</p>
    * @param inputEditDateFormat <p>The date format in the input boxes when they are selected for. editing. This must be a format that is recognized by JavaScript. Date.parse.</p>. <p>This will only be used for inputs of type <code>text</code>. Since v8.2.3,. the input type is dynamically determined based on the granularity. of the <code>inputDateFormat</code> and the browser support.</p>
    * @param inputEnabled <p>Enable or disable the date input boxes.</p>
    * @param inputPosition <p>Positioning for the input boxes. Allowed properties are <code>align</code>,.  <code>x</code> and <code>y</code>.</p>
    * @param inputSpacing <p>The space in pixels between the labels and the date input boxes in. the range selector.</p>
    * @param inputStyle <p>CSS for the HTML inputs in the range selector.</p>. <p>In styled mode, the inputs are styled by the. <code>.highcharts-range-input text</code> rule in SVG mode, and. <code>input.highcharts-range-selector</code> when active.</p>
    * @param labelStyle <p>CSS styles for the labels - the Zoom, From and To texts.</p>. <p>In styled mode, the labels are styled by the. <code>.highcharts-range-label</code> class.</p>
    * @param selected <p>The index of the button to appear pre-selected.</p>
    * @param verticalAlign <p>The vertical alignment of the rangeselector box. Allowed properties. are <code>top</code>, <code>middle</code>, <code>bottom</code>.</p>
    * @param x <p>The x offset of the range selector relative to its horizontal. alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @param y <p>The y offset of the range selector relative to its horizontal. alignment within <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    */
  def apply(allButtonsEnabled: js.UndefOr[Boolean] = js.undefined, buttonPosition: js.UndefOr[js.Any] = js.undefined, buttonSpacing: js.UndefOr[Double] = js.undefined, buttonTheme: js.UndefOr[js.Object] = js.undefined, buttons: js.UndefOr[js.Array[js.Any]] = js.undefined, dropdown: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[js.UndefOr[Boolean]] = js.undefined, floating: js.UndefOr[Boolean] = js.undefined, height: js.UndefOr[js.UndefOr[Double]] = js.undefined, inputBoxBorderColor: js.UndefOr[String] = js.undefined, inputBoxHeight: js.UndefOr[Double] = js.undefined, inputBoxWidth: js.UndefOr[js.UndefOr[Double]] = js.undefined, inputDateFormat: js.UndefOr[String] = js.undefined, inputDateParser: js.UndefOr[js.Any] = js.undefined, inputEditDateFormat: js.UndefOr[String] = js.undefined, inputEnabled: js.UndefOr[Boolean] = js.undefined, inputPosition: js.UndefOr[js.Any] = js.undefined, inputSpacing: js.UndefOr[Double] = js.undefined, inputStyle: js.UndefOr[js.Object] = js.undefined, labelStyle: js.UndefOr[js.Object] = js.undefined, selected: js.UndefOr[Double] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): RangeSelector = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new RangeSelector {
      this.allButtonsEnabled = allButtonsEnabled
      this.buttonPosition = buttonPosition
      this.buttonSpacing = buttonSpacing
      this.buttonTheme = buttonTheme
      this.buttons = buttons
      this.dropdown = dropdown
      this.enabled = enabled
      this.floating = floating
      this.height = height
      this.inputBoxBorderColor = inputBoxBorderColor
      this.inputBoxHeight = inputBoxHeight
      this.inputBoxWidth = inputBoxWidth
      this.inputDateFormat = inputDateFormat
      this.inputDateParser = inputDateParser
      this.inputEditDateFormat = inputEditDateFormat
      this.inputEnabled = inputEnabled
      this.inputPosition = inputPosition
      this.inputSpacing = inputSpacing
      this.inputStyle = inputStyle
      this.labelStyle = labelStyle
      this.selected = selected
      this.verticalAlign = verticalAlign
      this.x = x
      this.y = y
    })
  }
}
