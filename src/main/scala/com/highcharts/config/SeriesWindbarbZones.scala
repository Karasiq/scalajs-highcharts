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
  * @note JavaScript name: <code>series&lt;windbarb&gt;-zones</code>
  */
@js.annotation.ScalaJSDefined
class SeriesWindbarbZones extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styled mode only. A custom class name for the zone.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">Zones styled by class name</a>
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * <p>Defines the color of the series.</p>
    * @since 4.1.0
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>A name for the dash style to use for the graph.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-dashstyle-dot/">Dashed line indicates prognosis</a>
    * @since 4.1.0
    */
  val dashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Defines the fill color for the series (in area type series)</p>
    * @since 4.1.0
    */
  val fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The value up to where the zone extends, if undefined the zones stretches
    * to the last value in the series.</p>
    * @since 4.1.0
    */
  val value: js.UndefOr[Double] = js.undefined
}

object SeriesWindbarbZones {
  /**
    * @param className <p>Styled mode only. A custom class name for the zone.</p>
    * @param color <p>Defines the color of the series.</p>
    * @param dashStyle <p>A name for the dash style to use for the graph.</p>
    * @param fillColor <p>Defines the fill color for the series (in area type series)</p>
    * @param value <p>The value up to where the zone extends, if undefined the zones stretches. to the last value in the series.</p>
    */
  def apply(className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, value: js.UndefOr[Double] = js.undefined): SeriesWindbarbZones = {
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dashStyleOuter: js.UndefOr[String] = dashStyle
    val fillColorOuter: js.UndefOr[String | js.Object] = fillColor
    val valueOuter: js.UndefOr[Double] = value
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesWindbarbZones {
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dashStyle: js.UndefOr[String] = dashStyleOuter
      override val fillColor: js.UndefOr[String | js.Object] = fillColorOuter
      override val value: js.UndefOr[Double] = valueOuter
    })
  }
}
