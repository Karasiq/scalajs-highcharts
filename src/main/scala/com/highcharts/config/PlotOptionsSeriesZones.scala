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
  * @note JavaScript name: <code>plotOptions-series-zones</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSeriesZones extends js.Object {

  /**
    * <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">Styled mode</a> only. A custom class name for the zone.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/" target="_blank">Zones styled by class name</a>.
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * Defines the color of the series.
    * @since 4.1.0
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * A name for the dash style to use for the graph.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-dashstyle-dot/" target="_blank">Dashed line indicates prognosis</a>
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

object PlotOptionsSeriesZones {
  /**
    * @param className <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">Styled mode</a> only. A custom class name for the zone.
    * @param color Defines the color of the series.
    * @param dashStyle A name for the dash style to use for the graph.
    * @param fillColor Defines the fill color for the series (in area type series)
    * @param value The value up to where the zone extends, if undefined the zones stretches to the last value in the series.
    */
  def apply(className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, value: js.UndefOr[Double] = js.undefined): PlotOptionsSeriesZones = {
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dashStyleOuter: js.UndefOr[String] = dashStyle
    val fillColorOuter: js.UndefOr[String | js.Object] = fillColor
    val valueOuter: js.UndefOr[Double] = value
    new PlotOptionsSeriesZones {
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dashStyle: js.UndefOr[String] = dashStyleOuter
      override val fillColor: js.UndefOr[String | js.Object] = fillColorOuter
      override val value: js.UndefOr[Double] = valueOuter
    }
  }
}
