/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
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
  val color: js.UndefOr[String | js.Object] = js.undefined

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

object SeriesFlagsData {
  /**
    * @param color Individual color for the point.
    * @param id An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param selected Whether the data point is selected initially.
    * @param text The longer text to be shown in the flag's tooltip.
    * @param title The short text to be shown on the flag.
    * @param x The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesFlagsDataEvents]] = js.undefined, id: js.UndefOr[String] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, text: js.UndefOr[String] = js.undefined, title: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined): SeriesFlagsData = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesFlagsDataEvents]] = events
    val idOuter: js.UndefOr[String] = id
    val selectedOuter: js.UndefOr[Boolean] = selected
    val textOuter: js.UndefOr[String] = text
    val titleOuter: js.UndefOr[String] = title
    val xOuter: js.UndefOr[Double] = x
    new SeriesFlagsData {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val events: js.UndefOr[CleanJsObject[SeriesFlagsDataEvents]] = eventsOuter
      override val id: js.UndefOr[String] = idOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val text: js.UndefOr[String] = textOuter
      override val title: js.UndefOr[String] = titleOuter
      override val x: js.UndefOr[Double] = xOuter
    }
  }
}
