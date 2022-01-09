/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart-resetZoomButton</code>
  */
class ChartResetZoomButton extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The position of the button.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-position/">Above the plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-position/">Above the plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-position/">Above the plot area</a>
    * @since 2.2.0
    */
  var position: js.Any = js.undefined

  /**
    * <p>What frame the button placement should be related to. Can be
    * either <code>plotBox</code> or <code>spacingBox</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-relativeto/">Relative to the chart</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-relativeto/">Relative to the chart</a>
    * @since 2.2.0
    */
  var relativeTo: js.Any = js.undefined

  /**
    * <p>A collection of attributes for the button. The object takes SVG
    * attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the
    * border radius. The theme also supports <code>style</code>, a collection of
    * CSS properties for the text. Equivalent attributes for the hover
    * state are given in <code>theme.states.hover</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-theme/">Theming the button</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-theme/">Theming the button</a>
    * @since 2.2.0
    */
  var theme: js.UndefOr[js.Object] = js.undefined
}

object ChartResetZoomButton {
  /**
    * @param position <p>The position of the button.</p>
    * @param relativeTo <p>What frame the button placement should be related to. Can be. either <code>plotBox</code> or <code>spacingBox</code>.</p>
    * @param theme <p>A collection of attributes for the button. The object takes SVG. attributes like <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the. border radius. The theme also supports <code>style</code>, a collection of. CSS properties for the text. Equivalent attributes for the hover. state are given in <code>theme.states.hover</code>.</p>
    */
  def apply(position: js.UndefOr[js.Any] = js.undefined, relativeTo: js.UndefOr[js.Any] = js.undefined, theme: js.UndefOr[js.Object] = js.undefined): ChartResetZoomButton = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartResetZoomButton {
      this.position = position
      this.relativeTo = relativeTo
      this.theme = theme
    })
  }
}
