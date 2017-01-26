/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>loading</code>
  */
@js.annotation.ScalaJSDefined
class Loading extends js.Object {

  /**
    * The duration in milliseconds of the fade out effect.
    */
  val hideDuration: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for the loading label <code>span</code>.
    */
  val labelStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * The duration in milliseconds of the fade in effect.
    */
  val showDuration: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for the loading screen that covers the plot area.
    */
  val style: js.UndefOr[js.Object] = js.undefined
}

object Loading {
  /**
    * @param hideDuration The duration in milliseconds of the fade out effect.
    * @param labelStyle CSS styles for the loading label <code>span</code>.
    * @param showDuration The duration in milliseconds of the fade in effect.
    * @param style CSS styles for the loading screen that covers the plot area.
    */
  def apply(hideDuration: js.UndefOr[Double] = js.undefined, labelStyle: js.UndefOr[js.Object] = js.undefined, showDuration: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): Loading = {
    val hideDurationOuter: js.UndefOr[Double] = hideDuration
    val labelStyleOuter: js.UndefOr[js.Object] = labelStyle
    val showDurationOuter: js.UndefOr[Double] = showDuration
    val styleOuter: js.UndefOr[js.Object] = style
    new Loading {
      override val hideDuration: js.UndefOr[Double] = hideDurationOuter
      override val labelStyle: js.UndefOr[js.Object] = labelStyleOuter
      override val showDuration: js.UndefOr[Double] = showDurationOuter
      override val style: js.UndefOr[js.Object] = styleOuter
    }
  }
}
