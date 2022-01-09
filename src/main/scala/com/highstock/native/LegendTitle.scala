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
  * @note JavaScript name: <code>legend-title</code>
  */
class LegendTitle extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Generic CSS styles for the legend title.</p>
    * @since 3.0.0
    */
  var style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>A text or HTML string for the title.</p>
    * @since 3.0.0
    */
  var text: js.UndefOr[String] = js.undefined
}

object LegendTitle {
  /**
    * @param style <p>Generic CSS styles for the legend title.</p>
    * @param text <p>A text or HTML string for the title.</p>
    */
  def apply(style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined): LegendTitle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LegendTitle {
      this.style = style
      this.text = text
    })
  }
}
