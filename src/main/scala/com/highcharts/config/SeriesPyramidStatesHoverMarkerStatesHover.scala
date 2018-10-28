/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;pyramid&gt;-states-hover-marker-states-hover</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPyramidStatesHoverMarkerStatesHover extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when hovering over the marker.</p>
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Enable or disable the point marker.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-enabled/">Disabled hover state</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The number of pixels to increase the radius of the hovered
    * point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/">5 pixels greater radius on hover</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/">5 pixels greater radius on hover</a>
    * @since 4.0.3
    */
  val radiusPlus: js.UndefOr[Double] = js.undefined

  /**
    * <p>The additional line width for a hovered point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/">2 pixels wider on hover</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/">2 pixels wider on hover</a>
    * @since 4.0.3
    */
  val lineWidthPlus: js.UndefOr[Double] = js.undefined

  /**
    * <p>The fill color of the marker in hover state. When
    * <code>undefined</code>, the series&#39; or point&#39;s fillColor for normal
    * state is used.</p>
    */
  val fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the point marker&#39;s outline. When <code>undefined</code>,
    * the series&#39; or point&#39;s lineColor for normal state is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-linecolor/">White fill color, black line color</a>
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the point marker&#39;s outline. When <code>undefined</code>,
    * the series&#39; or point&#39;s lineWidth for normal state is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-linewidth/">3px line width</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The radius of the point marker. In hover state, it defaults
    * to the normal state&#39;s radius + 2 as per the <a href="#plotOptions.series.marker.states.hover.radiusPlus">radiusPlus</a>
    * option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-radius/">10px radius</a>
    */
  val radius: js.UndefOr[Double] = js.undefined
}

object SeriesPyramidStatesHoverMarkerStatesHover {
  /**
    * @param animation <p>Animation when hovering over the marker.</p>
    * @param enabled <p>Enable or disable the point marker.</p>
    * @param radiusPlus <p>The number of pixels to increase the radius of the hovered. point.</p>
    * @param lineWidthPlus <p>The additional line width for a hovered point.</p>
    * @param fillColor <p>The fill color of the marker in hover state. When. <code>undefined</code>, the series&#39; or point&#39;s fillColor for normal. state is used.</p>
    * @param lineColor <p>The color of the point marker&#39;s outline. When <code>undefined</code>,. the series&#39; or point&#39;s lineColor for normal state is used.</p>
    * @param lineWidth <p>The width of the point marker&#39;s outline. When <code>undefined</code>,. the series&#39; or point&#39;s lineWidth for normal state is used.</p>
    * @param radius <p>The radius of the point marker. In hover state, it defaults. to the normal state&#39;s radius + 2 as per the <a href="#plotOptions.series.marker.states.hover.radiusPlus">radiusPlus</a>. option.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, radiusPlus: js.UndefOr[Double] = js.undefined, lineWidthPlus: js.UndefOr[Double] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[Double] = js.undefined): SeriesPyramidStatesHoverMarkerStatesHover = {
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val radiusPlusOuter: js.UndefOr[Double] = radiusPlus
    val lineWidthPlusOuter: js.UndefOr[Double] = lineWidthPlus
    val fillColorOuter: js.UndefOr[String | js.Object] = fillColor
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val radiusOuter: js.UndefOr[Double] = radius
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPyramidStatesHoverMarkerStatesHover {
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val radiusPlus: js.UndefOr[Double] = radiusPlusOuter
      override val lineWidthPlus: js.UndefOr[Double] = lineWidthPlusOuter
      override val fillColor: js.UndefOr[String | js.Object] = fillColorOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val radius: js.UndefOr[Double] = radiusOuter
    })
  }
}
