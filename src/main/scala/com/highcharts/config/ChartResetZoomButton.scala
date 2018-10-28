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
  * @note JavaScript name: <code>chart-resetZoomButton</code>
  */
@js.annotation.ScalaJSDefined
class ChartResetZoomButton extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A collection of attributes for the button. The object takes SVG
    * attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the
    * border radius. The theme also supports <code>style</code>, a collection of
    * CSS properties for the text. Equivalent attributes for the hover
    * state are given in <code>theme.states.hover</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-theme/">Theming the button</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-theme/">Theming the button</a>
    * @since 2.2
    */
  val theme: js.Any = js.undefined

  /**
    * <p>The position of the button.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-position/">Above the plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-position/">Above the plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-position/">Above the plot area</a>
    * @since 2.2
    */
  val position: js.Any = js.undefined

  /**
    * <p>What frame the button should be placed related to. Can be either
    * <code>plot</code> or <code>chart</code></p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-relativeto/">Relative to the chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-relativeto/">Relative to the chart</a>
    * @since 2.2
    */
  val relativeTo: js.UndefOr[String] = js.undefined
}

object ChartResetZoomButton {
  /**
    * @param theme <p>A collection of attributes for the button. The object takes SVG. attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the. border radius. The theme also supports <code>style</code>, a collection of. CSS properties for the text. Equivalent attributes for the hover. state are given in <code>theme.states.hover</code>.</p>
    * @param position <p>The position of the button.</p>
    * @param relativeTo <p>What frame the button should be placed related to. Can be either. <code>plot</code> or <code>chart</code></p>
    */
  def apply(theme: js.UndefOr[js.Any] = js.undefined, position: js.UndefOr[js.Any] = js.undefined, relativeTo: js.UndefOr[String] = js.undefined): ChartResetZoomButton = {
    val themeOuter: js.Any = theme
    val positionOuter: js.Any = position
    val relativeToOuter: js.UndefOr[String] = relativeTo
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartResetZoomButton {
      override val theme: js.Any = themeOuter
      override val position: js.Any = positionOuter
      override val relativeTo: js.UndefOr[String] = relativeToOuter
    })
  }
}
