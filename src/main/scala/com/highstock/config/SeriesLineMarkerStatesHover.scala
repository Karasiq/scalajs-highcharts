/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;line&gt;-marker-states-hover</code>
  */
@js.annotation.ScalaJSDefined
class SeriesLineMarkerStatesHover extends js.Object {

  /**
    * Enable or disable the point marker.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * The fill color of the point marker. When <code>null</code>, the series' or point's color is used.
    */
  val fillColor: js.UndefOr[String] = js.undefined

  /**
    * The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
    */
  val lineColor: js.UndefOr[String] = js.undefined

  /**
    * The width of the point marker's outline.
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The additional line width for a hovered point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/" target="_blank">2 pixels wider on hover</a>
    * @since 2.0.3
    */
  val lineWidthPlus: js.UndefOr[Double] = js.undefined

  /**
    * The radius of the point marker. In hover state, it defaults to the normal state's radius + 2 as per the <a href="#plotOptions.series.marker.states.hover.radiusPlus">radiusPlus</a> option.
    */
  val radius: js.UndefOr[Double] = js.undefined

  /**
    * The number of pixels to increase the radius of the hovered point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/" target="_blank">5 pixels greater radius on hover</a>
    * @since 2.0.3
    */
  val radiusPlus: js.UndefOr[Double] = js.undefined
}
