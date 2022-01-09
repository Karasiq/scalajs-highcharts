/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;bb&gt;-bottomLine</code>
  */
class SeriesBbBottomLine extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styles for a bottom line.</p>
    * @since 6.0.0
    */
  var styles: js.Any = js.undefined
}

object SeriesBbBottomLine {
  /**
    * @param styles <p>Styles for a bottom line.</p>
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined): SeriesBbBottomLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBbBottomLine {
      this.styles = styles
    })
  }
}
