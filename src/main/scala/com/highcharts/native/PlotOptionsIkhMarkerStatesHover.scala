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
  * @note JavaScript name: <code>plotOptions-ikh-marker-states-hover</code>
  */
class PlotOptionsIkhMarkerStatesHover extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when hovering over the marker.</p>
    * @since 6.0.0
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Enable or disable the point marker.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-enabled/">Disabled hover state</a>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The fill color of the marker in hover state. When
    * <code>undefined</code>, the series&#39; or point&#39;s fillColor for normal
    * state is used.</p>
    * @since 6.0.0
    */
  var fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the point marker&#39;s outline. When
    * <code>undefined</code>, the series&#39; or point&#39;s lineColor for normal
    * state is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-linecolor/">White fill color, black line color</a>
    * @since 6.0.0
    */
  var lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the point marker&#39;s outline. When
    * <code>undefined</code>, the series&#39; or point&#39;s lineWidth for normal
    * state is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-linewidth/">3px line width</a>
    * @since 6.0.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The additional line width for a hovered point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/">2 pixels wider on hover</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/">2 pixels wider on hover</a>
    * @since 4.0.3
    */
  var lineWidthPlus: js.UndefOr[Double] = js.undefined

  /**
    * <p>The radius of the point marker. In hover state, it
    * defaults to the normal state&#39;s radius + 2 as per the
    * <a href="#plotOptions.series.marker.states.hover.radiusPlus">radiusPlus</a>
    * option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-radius/">10px radius</a>
    * @since 6.0.0
    */
  var radius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The number of pixels to increase the radius of the
    * hovered point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/">5 pixels greater radius on hover</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/">5 pixels greater radius on hover</a>
    * @since 4.0.3
    */
  var radiusPlus: js.UndefOr[Double] = js.undefined
}

object PlotOptionsIkhMarkerStatesHover {
  /**
    * @param animation <p>Animation when hovering over the marker.</p>
    * @param enabled <p>Enable or disable the point marker.</p>
    * @param fillColor <p>The fill color of the marker in hover state. When. <code>undefined</code>, the series&#39; or point&#39;s fillColor for normal. state is used.</p>
    * @param lineColor <p>The color of the point marker&#39;s outline. When. <code>undefined</code>, the series&#39; or point&#39;s lineColor for normal. state is used.</p>
    * @param lineWidth <p>The width of the point marker&#39;s outline. When. <code>undefined</code>, the series&#39; or point&#39;s lineWidth for normal. state is used.</p>
    * @param lineWidthPlus <p>The additional line width for a hovered point.</p>
    * @param radius <p>The radius of the point marker. In hover state, it. defaults to the normal state&#39;s radius + 2 as per the. <a href="#plotOptions.series.marker.states.hover.radiusPlus">radiusPlus</a>. option.</p>
    * @param radiusPlus <p>The number of pixels to increase the radius of the. hovered point.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, lineWidthPlus: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[Double] = js.undefined, radiusPlus: js.UndefOr[Double] = js.undefined): PlotOptionsIkhMarkerStatesHover = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsIkhMarkerStatesHover {
      this.animation = animation
      this.enabled = enabled
      this.fillColor = fillColor
      this.lineColor = lineColor
      this.lineWidth = lineWidth
      this.lineWidthPlus = lineWidthPlus
      this.radius = radius
      this.radiusPlus = radiusPlus
    })
  }
}
