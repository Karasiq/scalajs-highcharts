/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>navigator</code>
  */
class Navigator extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Whether the navigator and scrollbar should adapt to updated data
    * in the base X axis. When loading data async, as in the demo below,
    * this should be <code>false</code>. Otherwise new data will trigger navigator
    * redraw, which will cause unwanted looping. In the demo below, the
    * data in the navigator is set only once. On navigating, only the main
    * chart content is updated.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/lazy-loading/">Set to false with async data loading</a>
    */
  var adaptToUpdatedData: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>An integer identifying the index to use for the base series, or a
    * string representing the id of the series.</p>
    * <p><strong>Note</strong>: As of Highcharts 5.0, this is now a deprecated option.
    * Prefer <a href="#plotOptions.series.showInNavigator">series.showInNavigator</a>.</p>
    */
  var baseSeries: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>Enable or disable the navigator.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/enabled/">Disable the navigator</a>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Options for the handles for dragging the zoomed area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/handles/">Colored handles</a>
    */
  var handles: js.Any = js.undefined

  /**
    * <p>The height of the navigator.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/height/">A higher navigator</a>
    */
  var height: js.UndefOr[Double] = js.undefined

  /**
    * <p>The distance from the nearest element, the X axis or X axis labels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/margin/">A margin of 2 draws the navigator closer to the X axis labels</a>
    */
  var margin: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the mask covering the areas of the navigator series
    * that are currently not visible in the main series. The default
    * color is bluish with an opacity of 0.3 to see the series below.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/maskfill/">Blue, semi transparent mask</a>
    */
  var maskFill: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Whether the mask should be inside the range marking the zoomed
    * range, or outside. In Highcharts Stock 1.x it was always <code>false</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/maskinside-false/">False, mask outside</a>
    * @since 2.0.0
    */
  var maskInside: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When the chart is inverted, whether to draw the navigator on the
    * opposite side.</p>
    * @since 5.0.8
    */
  var opposite: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The color of the line marking the currently zoomed area in the
    * navigator.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/outline/">2px blue outline</a>
    */
  var outlineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the line marking the currently zoomed area in the
    * navigator.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/outline/">2px blue outline</a>
    */
  var outlineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Options for the navigator series. Available options are the same
    * as any series, documented at <a href="#plotOptions.series">plotOptions</a>
    * and <a href="#series">series</a>.</p>
    * <p>Unless data is explicitly defined on navigator.series, the data
    * is borrowed from the first series in the chart.</p>
    * <p>Default series options for the navigator series are:</p>
    * <pre><code class="language-js">series: {
    *     type: &#39;areaspline&#39;,
    *     fillOpacity: 0.05,
    *     dataGrouping: {
    *         smoothed: true
    *     },
    *     lineWidth: 1,
    *     marker: {
    *         enabled: false
    *     }
    * }
    * </code></pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/series-data/">Using a separate data set for the navigator</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/series/">A green navigator series</a>
    */
  var series: js.UndefOr[js.Any | js.Array[js.Any] | js.Object | js.Array[js.Object]] = js.undefined

  /**
    * <p>Options for the navigator X axis. Default series options for the
    * navigator xAxis are:</p>
    * <pre><code class="language-js">xAxis: {
    *     tickWidth: 0,
    *     lineWidth: 0,
    *     gridLineWidth: 1,
    *     tickPixelInterval: 200,
    *     labels: {
    *            align: &#39;left&#39;,
    *         style: {
    *             color: &#39;#888&#39;
    *         },
    *         x: 3,
    *         y: -4
    *     }
    * }
    * </code></pre>
    */
  var xAxis: js.UndefOr[CleanJsObject[NavigatorXAxis]] = js.undefined

  /**
    * <p>Options for the navigator Y axis. Default series options for the
    * navigator yAxis are:</p>
    * <pre><code class="language-js">yAxis: {
    *     gridLineWidth: 0,
    *     startOnTick: false,
    *     endOnTick: false,
    *     minPadding: 0.1,
    *     maxPadding: 0.1,
    *     labels: {
    *         enabled: false
    *     },
    *     title: {
    *         text: null
    *     },
    *     tickWidth: 0
    * }
    * </code></pre>
    */
  var yAxis: js.UndefOr[CleanJsObject[NavigatorYAxis]] = js.undefined
}

object Navigator {
  /**
    * @param adaptToUpdatedData <p>Whether the navigator and scrollbar should adapt to updated data. in the base X axis. When loading data async, as in the demo below,. this should be <code>false</code>. Otherwise new data will trigger navigator. redraw, which will cause unwanted looping. In the demo below, the. data in the navigator is set only once. On navigating, only the main. chart content is updated.</p>
    * @param baseSeries <p>An integer identifying the index to use for the base series, or a. string representing the id of the series.</p>. <p><strong>Note</strong>: As of Highcharts 5.0, this is now a deprecated option.. Prefer <a href="#plotOptions.series.showInNavigator">series.showInNavigator</a>.</p>
    * @param enabled <p>Enable or disable the navigator.</p>
    * @param handles <p>Options for the handles for dragging the zoomed area.</p>
    * @param height <p>The height of the navigator.</p>
    * @param margin <p>The distance from the nearest element, the X axis or X axis labels.</p>
    * @param maskFill <p>The color of the mask covering the areas of the navigator series. that are currently not visible in the main series. The default. color is bluish with an opacity of 0.3 to see the series below.</p>
    * @param maskInside <p>Whether the mask should be inside the range marking the zoomed. range, or outside. In Highcharts Stock 1.x it was always <code>false</code>.</p>
    * @param opposite <p>When the chart is inverted, whether to draw the navigator on the. opposite side.</p>
    * @param outlineColor <p>The color of the line marking the currently zoomed area in the. navigator.</p>
    * @param outlineWidth <p>The width of the line marking the currently zoomed area in the. navigator.</p>
    * @param series <p>Options for the navigator series. Available options are the same. as any series, documented at <a href="#plotOptions.series">plotOptions</a>. and <a href="#series">series</a>.</p>. <p>Unless data is explicitly defined on navigator.series, the data. is borrowed from the first series in the chart.</p>. <p>Default series options for the navigator series are:</p>. <pre><code class="language-js">series: {.     type: &#39;areaspline&#39;,.     fillOpacity: 0.05,.     dataGrouping: {.         smoothed: true.     },.     lineWidth: 1,.     marker: {.         enabled: false.     }. }. </code></pre>
    * @param xAxis <p>Options for the navigator X axis. Default series options for the. navigator xAxis are:</p>. <pre><code class="language-js">xAxis: {.     tickWidth: 0,.     lineWidth: 0,.     gridLineWidth: 1,.     tickPixelInterval: 200,.     labels: {.            align: &#39;left&#39;,.         style: {.             color: &#39;#888&#39;.         },.         x: 3,.         y: -4.     }. }. </code></pre>
    * @param yAxis <p>Options for the navigator Y axis. Default series options for the. navigator yAxis are:</p>. <pre><code class="language-js">yAxis: {.     gridLineWidth: 0,.     startOnTick: false,.     endOnTick: false,.     minPadding: 0.1,.     maxPadding: 0.1,.     labels: {.         enabled: false.     },.     title: {.         text: null.     },.     tickWidth: 0. }. </code></pre>
    */
  def apply(adaptToUpdatedData: js.UndefOr[Boolean] = js.undefined, baseSeries: js.UndefOr[Double | String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, handles: js.UndefOr[js.Any] = js.undefined, height: js.UndefOr[Double] = js.undefined, margin: js.UndefOr[Double] = js.undefined, maskFill: js.UndefOr[String | js.Object] = js.undefined, maskInside: js.UndefOr[Boolean] = js.undefined, opposite: js.UndefOr[Boolean] = js.undefined, outlineColor: js.UndefOr[String | js.Object] = js.undefined, outlineWidth: js.UndefOr[Double] = js.undefined, series: js.UndefOr[js.Any | js.Array[js.Any] | js.Object | js.Array[js.Object]] = js.undefined, xAxis: js.UndefOr[CleanJsObject[NavigatorXAxis]] = js.undefined, yAxis: js.UndefOr[CleanJsObject[NavigatorYAxis]] = js.undefined): Navigator = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Navigator {
      this.adaptToUpdatedData = adaptToUpdatedData
      this.baseSeries = baseSeries
      this.enabled = enabled
      this.handles = handles
      this.height = height
      this.margin = margin
      this.maskFill = maskFill
      this.maskInside = maskInside
      this.opposite = opposite
      this.outlineColor = outlineColor
      this.outlineWidth = outlineWidth
      this.series = series
      this.xAxis = xAxis
      this.yAxis = yAxis
    })
  }
}
