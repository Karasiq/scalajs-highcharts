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
  * @note JavaScript name: <code>series&lt;keltnerchannels&gt;-bottomLine</code>
  */
class SeriesKeltnerchannelsBottomLine extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styles for a bottom line.</p>
    * @since 7.0.0
    */
  var styles: js.Any = js.undefined
}

object SeriesKeltnerchannelsBottomLine {
  /**
    * @param styles <p>Styles for a bottom line.</p>
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined): SeriesKeltnerchannelsBottomLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesKeltnerchannelsBottomLine {
      this.styles = styles
    })
  }
}
