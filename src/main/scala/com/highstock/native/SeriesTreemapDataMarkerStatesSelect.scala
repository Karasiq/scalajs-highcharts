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
  * @note JavaScript name: <code>series&lt;treemap&gt;-data-marker-states-select</code>
  */
class SeriesTreemapDataMarkerStatesSelect extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Set the marker&#39;s fixed height on select state.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/heatmap-marker-states-hover-width">70px fixed marker's width and height on hover</a>
    * @since 8.1
    */
  var height: js.UndefOr[js.UndefOr[Double]] = js.undefined

  /**
    * <p>The number of pixels to increase the height of the
    * hovered point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/heatmap-marker-states-hover-widthplus">One day</a>
    * @since 8.1
    */
  var heightPlus: js.UndefOr[js.UndefOr[Double]] = js.undefined

  /**
    * <p>Set the marker&#39;s fixed width on select state.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/heatmap-marker-states-hover-width">70px fixed marker's width and height on hover</a>
    * @since 8.1
    */
  var width: js.UndefOr[js.UndefOr[Double]] = js.undefined

  /**
    * <p>The number of pixels to increase the width of the
    * hovered point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/heatmap-marker-states-hover-widthplus">One day</a>
    * @since 8.1
    */
  var widthPlus: js.UndefOr[js.UndefOr[Double]] = js.undefined

  /**
    * <p>Enable or disable visible feedback for selection.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-enabled/">Disabled select state</a>
    * @since 8.1
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The fill color of the point marker.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-fillcolor/">Solid red discs for selected points</a>
    * @since 8.1
    */
  var fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the point marker&#39;s outline. When
    * <code>undefined</code>, the series&#39; or point&#39;s color is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-linecolor/">Red line color for selected points</a>
    * @since 8.1
    */
  var lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the point marker&#39;s outline.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-linewidth/">3px line width for selected points</a>
    * @since 8.1
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object SeriesTreemapDataMarkerStatesSelect {
  /**
    * @param height <p>Set the marker&#39;s fixed height on select state.</p>
    * @param heightPlus <p>The number of pixels to increase the height of the. hovered point.</p>
    * @param width <p>Set the marker&#39;s fixed width on select state.</p>
    * @param widthPlus <p>The number of pixels to increase the width of the. hovered point.</p>
    * @param enabled <p>Enable or disable visible feedback for selection.</p>
    * @param fillColor <p>The fill color of the point marker.</p>
    * @param lineColor <p>The color of the point marker&#39;s outline. When. <code>undefined</code>, the series&#39; or point&#39;s color is used.</p>
    * @param lineWidth <p>The width of the point marker&#39;s outline.</p>
    */
  def apply(height: js.UndefOr[js.UndefOr[Double]] = js.undefined, heightPlus: js.UndefOr[js.UndefOr[Double]] = js.undefined, width: js.UndefOr[js.UndefOr[Double]] = js.undefined, widthPlus: js.UndefOr[js.UndefOr[Double]] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined): SeriesTreemapDataMarkerStatesSelect = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapDataMarkerStatesSelect {
      this.height = height
      this.heightPlus = heightPlus
      this.width = width
      this.widthPlus = widthPlus
      this.enabled = enabled
      this.fillColor = fillColor
      this.lineColor = lineColor
      this.lineWidth = lineWidth
    })
  }
}
