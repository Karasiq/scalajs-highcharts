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
  * @note JavaScript name: <code>series&lt;dmi&gt;-minusDILine</code>
  */
class SeriesDmiMinusDILine extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styles for the -DI line.</p>
    * @since 9.1.0
    */
  var styles: js.Any = js.undefined
}

object SeriesDmiMinusDILine {
  /**
    * @param styles <p>Styles for the -DI line.</p>
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined): SeriesDmiMinusDILine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesDmiMinusDILine {
      this.styles = styles
    })
  }
}
