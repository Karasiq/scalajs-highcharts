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
  * @note JavaScript name: <code>series&lt;abands&gt;-bottomLine-styles</code>
  */
class SeriesAbandsBottomLineStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Pixel width of the line.</p>
    * @since 7.0.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object SeriesAbandsBottomLineStyles {
  /**
    * @param lineWidth <p>Pixel width of the line.</p>
    */
  def apply(lineWidth: js.UndefOr[Double] = js.undefined): SeriesAbandsBottomLineStyles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesAbandsBottomLineStyles {
      this.lineWidth = lineWidth
    })
  }
}
