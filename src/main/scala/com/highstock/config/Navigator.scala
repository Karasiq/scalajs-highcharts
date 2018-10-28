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
  * @note JavaScript name: <code>navigator</code>
  */
@js.annotation.ScalaJSDefined
class Navigator extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The height of the navigator.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/height/">A higher navigator</a>
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * <p>The distance from the nearest element, the X axis or X axis labels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/margin/">A margin of 2 draws the navigator closer to the X axis labels</a>
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether the mask should be inside the range marking the zoomed
    * range, or outside. In Highstock 1.x it was always <code>false</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/maskinside-false/">False, mask outside</a>
    * @since 2.0
    */
  val maskInside: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Options for the handles for dragging the zoomed area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/handles/">Colored handles</a>
    */
  val handles: js.Any = js.undefined

  /**
    * <p>The color of the mask covering the areas of the navigator series
    * that are currently not visible in the main series. The default
    * color is bluish with an opacity of 0.3 to see the series below.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/maskfill/">Blue, semi transparent mask</a>
    */
  val maskFill: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the line marking the currently zoomed area in the
    * navigator.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/outline/">2px blue outline</a>
    */
  val outlineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the line marking the currently zoomed area in the
    * navigator.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/outline/">2px blue outline</a>
    */
  val outlineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Options for the navigator series. Available options are the same
    * as any series, documented at <a href="#plotOptions.series">plotOptions</a>
    * and <a href="#series">series</a>.</p>
    * <p>Unless data is explicitly defined on navigator.series, the data
    * is borrowed from the first series in the chart.</p>
    * <p>Default series options for the navigator series are:</p>
    * <pre>series: {
    *     type: 'areaspline',
    *     fillOpacity: 0.05,
    *     dataGrouping: {
    *         smoothed: true
    *     },
    *     lineWidth: 1,
    *     marker: {
    *         enabled: false
    *     }
    * }</pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/series-data/">Using a separate data set for the navigator</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/series/">A green navigator series</a>
    */
  val series: js.Any = js.undefined

  /**
    * <p>Options for the navigator X axis. Default series options
    * for the navigator xAxis are:</p>
    * <pre>xAxis: {
    *     tickWidth: 0,
    *     lineWidth: 0,
    *     gridLineWidth: 1,
    *     tickPixelInterval: 200,
    *     labels: {
    *            align: 'left',
    *         style: {
    *             color: '#888'
    *         },
    *         x: 3,
    *         y: -4
    *     }
    * }</pre>
    */
  val xAxis: js.Any = js.undefined

  /**
    * <p>Options for the navigator Y axis. Default series options
    * for the navigator yAxis are:</p>
    * <pre>yAxis: {
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
    * }</pre>
    */
  val yAxis: js.Any = js.undefined

  /**
    * <p>Whether the navigator and scrollbar should adapt to updated data
    * in the base X axis. When loading data async, as in the demo below,
    * this should be <code>false</code>. Otherwise new data will trigger navigator
    * redraw, which will cause unwanted looping. In the demo below, the
    * data in the navigator is set only once. On navigating, only the main
    * chart content is updated.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/lazy-loading/">Set to false with async data loading</a>
    */
  val adaptToUpdatedData: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>An integer identifying the index to use for the base series, or a
    * string representing the id of the series.</p>
    * <p><strong>Note</strong>: As of Highcharts 5.0, this is now a deprecated option.
    * Prefer <a href="#plotOptions.series.showInNavigator">series.showInNavigator</a>.</p>
    */
  val baseSeries: js.Any = js.undefined

  /**
    * <p>Enable or disable the navigator.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/enabled/">Disable the navigator</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>When the chart is inverted, whether to draw the navigator on the
    * opposite side.</p>
    * @since 5.0.8
    */
  val opposite: js.UndefOr[Boolean] = js.undefined
}

object Navigator {
  /**
    * @param height <p>The height of the navigator.</p>
    * @param margin <p>The distance from the nearest element, the X axis or X axis labels.</p>
    * @param maskInside <p>Whether the mask should be inside the range marking the zoomed. range, or outside. In Highstock 1.x it was always <code>false</code>.</p>
    * @param handles <p>Options for the handles for dragging the zoomed area.</p>
    * @param maskFill <p>The color of the mask covering the areas of the navigator series. that are currently not visible in the main series. The default. color is bluish with an opacity of 0.3 to see the series below.</p>
    * @param outlineColor <p>The color of the line marking the currently zoomed area in the. navigator.</p>
    * @param outlineWidth <p>The width of the line marking the currently zoomed area in the. navigator.</p>
    * @param series <p>Options for the navigator series. Available options are the same. as any series, documented at <a href="#plotOptions.series">plotOptions</a>. and <a href="#series">series</a>.</p>. <p>Unless data is explicitly defined on navigator.series, the data. is borrowed from the first series in the chart.</p>. <p>Default series options for the navigator series are:</p>. <pre>series: {.     type: 'areaspline',.     fillOpacity: 0.05,.     dataGrouping: {.         smoothed: true.     },.     lineWidth: 1,.     marker: {.         enabled: false.     }. }</pre>
    * @param xAxis <p>Options for the navigator X axis. Default series options. for the navigator xAxis are:</p>. <pre>xAxis: {.     tickWidth: 0,.     lineWidth: 0,.     gridLineWidth: 1,.     tickPixelInterval: 200,.     labels: {.            align: 'left',.         style: {.             color: '#888'.         },.         x: 3,.         y: -4.     }. }</pre>
    * @param yAxis <p>Options for the navigator Y axis. Default series options. for the navigator yAxis are:</p>. <pre>yAxis: {.     gridLineWidth: 0,.     startOnTick: false,.     endOnTick: false,.     minPadding: 0.1,.     maxPadding: 0.1,.     labels: {.         enabled: false.     },.     title: {.         text: null.     },.     tickWidth: 0. }</pre>
    * @param adaptToUpdatedData <p>Whether the navigator and scrollbar should adapt to updated data. in the base X axis. When loading data async, as in the demo below,. this should be <code>false</code>. Otherwise new data will trigger navigator. redraw, which will cause unwanted looping. In the demo below, the. data in the navigator is set only once. On navigating, only the main. chart content is updated.</p>
    * @param baseSeries <p>An integer identifying the index to use for the base series, or a. string representing the id of the series.</p>. <p><strong>Note</strong>: As of Highcharts 5.0, this is now a deprecated option.. Prefer <a href="#plotOptions.series.showInNavigator">series.showInNavigator</a>.</p>
    * @param enabled <p>Enable or disable the navigator.</p>
    * @param opposite <p>When the chart is inverted, whether to draw the navigator on the. opposite side.</p>
    */
  def apply(height: js.UndefOr[Double] = js.undefined, margin: js.UndefOr[Double] = js.undefined, maskInside: js.UndefOr[Boolean] = js.undefined, handles: js.UndefOr[js.Any] = js.undefined, maskFill: js.UndefOr[String | js.Object] = js.undefined, outlineColor: js.UndefOr[String | js.Object] = js.undefined, outlineWidth: js.UndefOr[Double] = js.undefined, series: js.UndefOr[js.Any] = js.undefined, xAxis: js.UndefOr[js.Any] = js.undefined, yAxis: js.UndefOr[js.Any] = js.undefined, adaptToUpdatedData: js.UndefOr[Boolean] = js.undefined, baseSeries: js.UndefOr[js.Any] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, opposite: js.UndefOr[Boolean] = js.undefined): Navigator = {
    val heightOuter: js.UndefOr[Double] = height
    val marginOuter: js.UndefOr[Double] = margin
    val maskInsideOuter: js.UndefOr[Boolean] = maskInside
    val handlesOuter: js.Any = handles
    val maskFillOuter: js.UndefOr[String | js.Object] = maskFill
    val outlineColorOuter: js.UndefOr[String | js.Object] = outlineColor
    val outlineWidthOuter: js.UndefOr[Double] = outlineWidth
    val seriesOuter: js.Any = series
    val xAxisOuter: js.Any = xAxis
    val yAxisOuter: js.Any = yAxis
    val adaptToUpdatedDataOuter: js.UndefOr[Boolean] = adaptToUpdatedData
    val baseSeriesOuter: js.Any = baseSeries
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val oppositeOuter: js.UndefOr[Boolean] = opposite
    com.highcharts.HighchartsGenericObject.toCleanObject(new Navigator {
      override val height: js.UndefOr[Double] = heightOuter
      override val margin: js.UndefOr[Double] = marginOuter
      override val maskInside: js.UndefOr[Boolean] = maskInsideOuter
      override val handles: js.Any = handlesOuter
      override val maskFill: js.UndefOr[String | js.Object] = maskFillOuter
      override val outlineColor: js.UndefOr[String | js.Object] = outlineColorOuter
      override val outlineWidth: js.UndefOr[Double] = outlineWidthOuter
      override val series: js.Any = seriesOuter
      override val xAxis: js.Any = xAxisOuter
      override val yAxis: js.Any = yAxisOuter
      override val adaptToUpdatedData: js.UndefOr[Boolean] = adaptToUpdatedDataOuter
      override val baseSeries: js.Any = baseSeriesOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val opposite: js.UndefOr[Boolean] = oppositeOuter
    })
  }
}
