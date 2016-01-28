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
  * @note JavaScript name: <code>series&lt;heatmap&gt;-zones</code>
  */
@js.annotation.ScalaJSDefined
class SeriesHeatmapZones extends js.Object {

  /**
    * Defines the color of the series.
    * @since 4.1.0
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * A name for the dash style to use for the graph.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/color-zones-dashstyle-dot/" target="_blank">Dashed line indicates prognosis</a>
    * @since 4.1.0
    */
  val dashStyle: js.UndefOr[String] = js.undefined

  /**
    * Defines the fill color for the series (in area type series)
    * @since 4.1.0
    */
  val fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The value up to where the zone extends, if undefined the zones stretches to the last value in the series.
    * @since 4.1.0
    */
  val value: js.UndefOr[Double] = js.undefined
}
