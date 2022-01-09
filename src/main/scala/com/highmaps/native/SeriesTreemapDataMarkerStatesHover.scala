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
  * @note JavaScript name: <code>series&lt;treemap&gt;-data-marker-states-hover</code>
  */
class SeriesTreemapDataMarkerStatesHover extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Set the marker&#39;s fixed height on hover state.</p>
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
    * <p>Set the marker&#39;s fixed width on hover state.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/heatmap-marker-states-hover-linewidthplus">5 pixels wider lineWidth on hover</a>
    * @since 4.0.3
    */
  var lineWidthPlus: js.UndefOr[js.UndefOr[Double]] = js.undefined

  /**
    * <p>Set the marker&#39;s fixed width on hover state.</p>
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
    * <p>Animation when hovering over the marker.</p>
    * @since 8.1
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Enable or disable the point marker.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-enabled/">Disabled hover state</a>
    * @since 8.1
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The fill color of the marker in hover state. When
    * <code>undefined</code>, the series&#39; or point&#39;s fillColor for normal
    * state is used.</p>
    * @since 8.1
    */
  var fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the point marker&#39;s outline. When
    * <code>undefined</code>, the series&#39; or point&#39;s lineColor for normal
    * state is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-linecolor/">White fill color, black line color</a>
    * @since 8.1
    */
  var lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the point marker&#39;s outline. When
    * <code>undefined</code>, the series&#39; or point&#39;s lineWidth for normal
    * state is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-linewidth/">3px line width</a>
    * @since 8.1
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object SeriesTreemapDataMarkerStatesHover {
  /**
    * @param height <p>Set the marker&#39;s fixed height on hover state.</p>
    * @param heightPlus <p>The number of pixels to increase the height of the. hovered point.</p>
    * @param lineWidthPlus <p>Set the marker&#39;s fixed width on hover state.</p>
    * @param width <p>Set the marker&#39;s fixed width on hover state.</p>
    * @param widthPlus <p>The number of pixels to increase the width of the. hovered point.</p>
    * @param animation <p>Animation when hovering over the marker.</p>
    * @param enabled <p>Enable or disable the point marker.</p>
    * @param fillColor <p>The fill color of the marker in hover state. When. <code>undefined</code>, the series&#39; or point&#39;s fillColor for normal. state is used.</p>
    * @param lineColor <p>The color of the point marker&#39;s outline. When. <code>undefined</code>, the series&#39; or point&#39;s lineColor for normal. state is used.</p>
    * @param lineWidth <p>The width of the point marker&#39;s outline. When. <code>undefined</code>, the series&#39; or point&#39;s lineWidth for normal. state is used.</p>
    */
  def apply(height: js.UndefOr[js.UndefOr[Double]] = js.undefined, heightPlus: js.UndefOr[js.UndefOr[Double]] = js.undefined, lineWidthPlus: js.UndefOr[js.UndefOr[Double]] = js.undefined, width: js.UndefOr[js.UndefOr[Double]] = js.undefined, widthPlus: js.UndefOr[js.UndefOr[Double]] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined): SeriesTreemapDataMarkerStatesHover = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapDataMarkerStatesHover {
      this.height = height
      this.heightPlus = heightPlus
      this.lineWidthPlus = lineWidthPlus
      this.width = width
      this.widthPlus = widthPlus
      this.animation = animation
      this.enabled = enabled
      this.fillColor = fillColor
      this.lineColor = lineColor
      this.lineWidth = lineWidth
    })
  }
}
