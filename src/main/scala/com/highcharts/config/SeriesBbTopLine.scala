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
  * @note JavaScript name: <code>series&lt;bb&gt;-topLine</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBbTopLine extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styles for a bottom line.</p>
    * @since 6.0.0
    */
  val styles: js.Any = js.undefined
}

object SeriesBbTopLine {
  /**
    * @param styles <p>Styles for a bottom line.</p>
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined): SeriesBbTopLine = {
    val stylesOuter: js.Any = styles
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBbTopLine {
      override val styles: js.Any = stylesOuter
    })
  }
}
