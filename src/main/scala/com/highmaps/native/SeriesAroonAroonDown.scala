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
  * @note JavaScript name: <code>series&lt;aroon&gt;-aroonDown</code>
  */
class SeriesAroonAroonDown extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styles for an aroonDown line.</p>
    * @since 7.0.0
    */
  var styles: js.Any = js.undefined
}

object SeriesAroonAroonDown {
  /**
    * @param styles <p>Styles for an aroonDown line.</p>
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined): SeriesAroonAroonDown = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesAroonAroonDown {
      this.styles = styles
    })
  }
}
