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
  * @note JavaScript name: <code>series&lt;sunburst&gt;-traverseUpButton</code>
  */
class SeriesSunburstTraverseUpButton extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The position of the button.</p>
    * @since 6.0.0
    */
  var position: js.Any = js.undefined
}

object SeriesSunburstTraverseUpButton {
  /**
    * @param position <p>The position of the button.</p>
    */
  def apply(position: js.UndefOr[js.Any] = js.undefined): SeriesSunburstTraverseUpButton = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSunburstTraverseUpButton {
      this.position = position
    })
  }
}
