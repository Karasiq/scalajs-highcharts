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
  * @note JavaScript name: <code>plotOptions-bb-bottomLine</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsBbBottomLine extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styles for a bottom line.</p>
    * @since 6.0.0
    */
  val styles: js.Any = js.undefined
}

object PlotOptionsBbBottomLine {
  /**
    * @param styles <p>Styles for a bottom line.</p>
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined): PlotOptionsBbBottomLine = {
    val stylesOuter: js.Any = styles
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsBbBottomLine {
      override val styles: js.Any = stylesOuter
    })
  }
}
