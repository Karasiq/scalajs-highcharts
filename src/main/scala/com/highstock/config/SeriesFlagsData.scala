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
  * @note JavaScript name: <code>series&lt;flags&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesFlagsData extends js.Object {

  /**
    * Individual color for the point.
    */
  val color: js.UndefOr[String] = js.undefined

  val events: js.UndefOr[CleanJsObject[SeriesFlagsDataEvents]] = js.undefined

  /**
    * An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * Whether the data point is selected initially.
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * The longer text to be shown in the flag's tooltip.
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * The short text to be shown on the flag.
    */
  val title: js.UndefOr[String] = js.undefined

  /**
    * The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
    */
  val x: js.UndefOr[Double] = js.undefined
}
