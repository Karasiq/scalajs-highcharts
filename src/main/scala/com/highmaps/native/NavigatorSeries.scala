/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>navigator-series</code>
  */
class NavigatorSeries extends com.highcharts.HighchartsGenericObject {

  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>Sets the fill color of the navigator series.</p>
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Unless data is explicitly defined, the data is borrowed from the
    * first series in the chart.</p>
    */
  var data: js.UndefOr[js.Array[Double | js.Array[js.Any] | js.Object | Null]] = js.undefined

  /**
    * <p>Data grouping options for the navigator series.</p>
    */
  var dataGrouping: js.UndefOr[CleanJsObject[NavigatorSeriesDataGrouping]] = js.undefined

  /**
    * <p>Data label options for the navigator series. Data labels are
    * disabled by default on the navigator series.</p>
    */
  var dataLabels: js.UndefOr[CleanJsObject[NavigatorSeriesDataLabels]] = js.undefined

  /**
    * <p>The fill opacity of the navigator series.</p>
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined

  var id: js.UndefOr[String] = js.undefined

  /**
    * <p>Line color for the navigator series. Allows setting the color
    * while disallowing the default candlestick setting.</p>
    */
  var lineColor: js.UndefOr[String | Null] = js.undefined

  /**
    * <p>The pixel line width of the navigator series.</p>
    */
  var lineWidth: js.UndefOr[Double] = js.undefined

  var marker: js.Any = js.undefined

  /**
    * <p>Since Highcharts Stock v8, default value is the same as default
    * <code>pointRange</code> defined for a specific type (e.g. <code>null</code> for
    * column type).</p>
    * <p>In Highcharts Stock version &lt; 8, defaults to 0.</p>
    */
  var pointRange: js.UndefOr[Double | Null] = js.undefined

  /**
    * <p>The threshold option. Setting it to 0 will make the default
    * navigator area series draw its area from the 0 value and up.</p>
    */
  var threshold: js.UndefOr[Double | Null] = js.undefined

  /**
    * <p>The type of the navigator series.</p>
    * <p>Heads up:
    * In column-type navigator, zooming is limited to at least one
    * point with its <code>pointRange</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/navigator/column/">Column type navigator</a>
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NavigatorSeries {
  /**
    * @param color <p>Sets the fill color of the navigator series.</p>
    * @param data <p>Unless data is explicitly defined, the data is borrowed from the. first series in the chart.</p>
    * @param dataGrouping <p>Data grouping options for the navigator series.</p>
    * @param dataLabels <p>Data label options for the navigator series. Data labels are. disabled by default on the navigator series.</p>
    * @param fillOpacity <p>The fill opacity of the navigator series.</p>
    * @param lineColor <p>Line color for the navigator series. Allows setting the color. while disallowing the default candlestick setting.</p>
    * @param lineWidth <p>The pixel line width of the navigator series.</p>
    * @param pointRange <p>Since Highcharts Stock v8, default value is the same as default. <code>pointRange</code> defined for a specific type (e.g. <code>null</code> for. column type).</p>. <p>In Highcharts Stock version &lt; 8, defaults to 0.</p>
    * @param threshold <p>The threshold option. Setting it to 0 will make the default. navigator area series draw its area from the 0 value and up.</p>
    * @param `type` <p>The type of the navigator series.</p>. <p>Heads up:. In column-type navigator, zooming is limited to at least one. point with its <code>pointRange</code>.</p>
    */
  def apply(className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, data: js.UndefOr[js.Array[Double | js.Array[js.Any] | js.Object | Null]] = js.undefined, dataGrouping: js.UndefOr[CleanJsObject[NavigatorSeriesDataGrouping]] = js.undefined, dataLabels: js.UndefOr[CleanJsObject[NavigatorSeriesDataLabels]] = js.undefined, fillOpacity: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, lineColor: js.UndefOr[String | Null] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[js.Any] = js.undefined, pointRange: js.UndefOr[Double | Null] = js.undefined, threshold: js.UndefOr[Double | Null] = js.undefined, `type`: js.UndefOr[String] = js.undefined): NavigatorSeries = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorSeries {
      this.className = className
      this.color = color
      this.data = data
      this.dataGrouping = dataGrouping
      this.dataLabels = dataLabels
      this.fillOpacity = fillOpacity
      this.id = id
      this.lineColor = lineColor
      this.lineWidth = lineWidth
      this.marker = marker
      this.pointRange = pointRange
      this.threshold = threshold
      this.`type` = `type`
    })
  }
}
