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
  * @note JavaScript name: <code>series&lt;klinger&gt;-signalLine</code>
  */
class SeriesKlingerSignalLine extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styles for a signal line.</p>
    * @since 9.1.0
    */
  var styles: js.Any = js.undefined
}

object SeriesKlingerSignalLine {
  /**
    * @param styles <p>Styles for a signal line.</p>
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined): SeriesKlingerSignalLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesKlingerSignalLine {
      this.styles = styles
    })
  }
}
