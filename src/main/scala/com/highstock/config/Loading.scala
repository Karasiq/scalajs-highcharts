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
  * @note JavaScript name: <code>loading</code>
  */
@js.annotation.ScalaJSDefined
class Loading extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>CSS styles for the loading label <code>span</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/labelstyle/">Vertically centered</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/loading/general/">Label styles</a>
    * @since 1.2.0
    */
  val labelStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>CSS styles for the loading screen that covers the plot area.</p>
    * <p>In styled mode, the loading label is styled with the
    * <code>.highcharts-loading</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/style/">Gray plot area, white text</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/loading/general/">Gray plot area, white text</a>
    * @since 1.2.0
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The duration in milliseconds of the fade out effect.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/hideduration/">Fade in and out over a second</a>
    * @since 1.2.0
    */
  val hideDuration: js.UndefOr[Double] = js.undefined

  /**
    * <p>The duration in milliseconds of the fade in effect.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/hideduration/">Fade in and out over a second</a>
    * @since 1.2.0
    */
  val showDuration: js.UndefOr[Double] = js.undefined
}

object Loading {
  /**
    * @param labelStyle <p>CSS styles for the loading label <code>span</code>.</p>
    * @param style <p>CSS styles for the loading screen that covers the plot area.</p>. <p>In styled mode, the loading label is styled with the. <code>.highcharts-loading</code> class.</p>
    * @param hideDuration <p>The duration in milliseconds of the fade out effect.</p>
    * @param showDuration <p>The duration in milliseconds of the fade in effect.</p>
    */
  def apply(labelStyle: js.UndefOr[js.Object] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, hideDuration: js.UndefOr[Double] = js.undefined, showDuration: js.UndefOr[Double] = js.undefined): Loading = {
    val labelStyleOuter: js.UndefOr[js.Object] = labelStyle
    val styleOuter: js.UndefOr[js.Object] = style
    val hideDurationOuter: js.UndefOr[Double] = hideDuration
    val showDurationOuter: js.UndefOr[Double] = showDuration
    com.highcharts.HighchartsGenericObject.toCleanObject(new Loading {
      override val labelStyle: js.UndefOr[js.Object] = labelStyleOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val hideDuration: js.UndefOr[Double] = hideDurationOuter
      override val showDuration: js.UndefOr[Double] = showDurationOuter
    })
  }
}
