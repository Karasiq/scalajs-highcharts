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
  * @note JavaScript name: <code>navigation-buttonOptions</code>
  */
class NavigationButtonOptions extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Whether to enable buttons.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-enabled/">Exporting module loaded but buttons disabled</a>
    * @since 2.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A text string to add to the individual button.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text/">Full text button</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text-symbol/">Combined symbol and text</a>
    * @since 3.0.0
    */
  var text: js.UndefOr[String] = js.undefined

  var theme: js.Any = js.undefined

  /**
    * <p>The vertical offset of the button&#39;s position relative to its
    * <code>verticalAlign</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/">Buttons at lower right</a>
    * @since 2.0.0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object NavigationButtonOptions {
  /**
    * @param enabled <p>Whether to enable buttons.</p>
    * @param text <p>A text string to add to the individual button.</p>
    * @param y <p>The vertical offset of the button&#39;s position relative to its. <code>verticalAlign</code>.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, text: js.UndefOr[String] = js.undefined, theme: js.UndefOr[js.Any] = js.undefined, y: js.UndefOr[Double] = js.undefined): NavigationButtonOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigationButtonOptions {
      this.enabled = enabled
      this.text = text
      this.theme = theme
      this.y = y
    })
  }
}
