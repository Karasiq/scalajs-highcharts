/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>loading</code>
  */
class Loading extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The duration in milliseconds of the fade out effect.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/hideduration/">Fade in and out over a second</a>
    * @since 1.2.0
    */
  var hideDuration: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS styles for the loading label <code>span</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/labelstyle/">Vertically centered</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/loading/general/">Label styles</a>
    * @since 1.2.0
    */
  var labelStyle: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The duration in milliseconds of the fade in effect.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/hideduration/">Fade in and out over a second</a>
    * @since 1.2.0
    */
  var showDuration: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS styles for the loading screen that covers the plot area.</p>
    * <p>In styled mode, the loading label is styled with the
    * <code>.highcharts-loading</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/style/">Gray plot area, white text</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/loading/general/">Gray plot area, white text</a>
    * @since 1.2.0
    */
  var style: js.UndefOr[js.Object] = js.undefined
}

object Loading {
  /**
    * @param hideDuration <p>The duration in milliseconds of the fade out effect.</p>
    * @param labelStyle <p>CSS styles for the loading label <code>span</code>.</p>
    * @param showDuration <p>The duration in milliseconds of the fade in effect.</p>
    * @param style <p>CSS styles for the loading screen that covers the plot area.</p>. <p>In styled mode, the loading label is styled with the. <code>.highcharts-loading</code> class.</p>
    */
  def apply(hideDuration: js.UndefOr[Double] = js.undefined, labelStyle: js.UndefOr[js.Object] = js.undefined, showDuration: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): Loading = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Loading {
      this.hideDuration = hideDuration
      this.labelStyle = labelStyle
      this.showDuration = showDuration
      this.style = style
    })
  }
}
