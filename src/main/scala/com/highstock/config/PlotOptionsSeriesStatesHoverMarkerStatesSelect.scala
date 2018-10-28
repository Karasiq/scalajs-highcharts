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
  * @note JavaScript name: <code>plotOptions-series-states-hover-marker-states-select</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSeriesStatesHoverMarkerStatesSelect extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The fill color of the point marker.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-fillcolor/">Solid red discs for selected points</a>
    */
  val fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the point marker&#39;s outline. When <code>undefined</code>,
    * the series&#39; or point&#39;s color is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-linecolor/">Red line color for selected points</a>
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the point marker&#39;s outline.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-linewidth/">3px line width for selected points</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The radius of the point marker. In hover state, it defaults
    * to the normal state&#39;s radius + 2.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-radius/">10px radius for selected points</a>
    */
  val radius: js.UndefOr[Double] = js.undefined

  /**
    * <p>Enable or disable visible feedback for selection.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-enabled/">Disabled select state</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotOptionsSeriesStatesHoverMarkerStatesSelect {
  /**
    * @param fillColor <p>The fill color of the point marker.</p>
    * @param lineColor <p>The color of the point marker&#39;s outline. When <code>undefined</code>,. the series&#39; or point&#39;s color is used.</p>
    * @param lineWidth <p>The width of the point marker&#39;s outline.</p>
    * @param radius <p>The radius of the point marker. In hover state, it defaults. to the normal state&#39;s radius + 2.</p>
    * @param enabled <p>Enable or disable visible feedback for selection.</p>
    */
  def apply(fillColor: js.UndefOr[String | js.Object] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined): PlotOptionsSeriesStatesHoverMarkerStatesSelect = {
    val fillColorOuter: js.UndefOr[String | js.Object] = fillColor
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val radiusOuter: js.UndefOr[Double] = radius
    val enabledOuter: js.UndefOr[Boolean] = enabled
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSeriesStatesHoverMarkerStatesSelect {
      override val fillColor: js.UndefOr[String | js.Object] = fillColorOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val radius: js.UndefOr[Double] = radiusOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
    })
  }
}
