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
  * @note JavaScript name: <code>labels</code>
  */
class Labels extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>An HTML label that can be positioned anywhere in the chart area.</p>
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>Shared CSS styles for all labels.</p>
    */
  var style: js.UndefOr[js.Object] = js.undefined
}

object Labels {
  /**
    * @param items <p>An HTML label that can be positioned anywhere in the chart area.</p>
    * @param style <p>Shared CSS styles for all labels.</p>
    */
  def apply(items: js.UndefOr[js.Array[js.Any]] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): Labels = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Labels {
      this.items = items
      this.style = style
    })
  }
}
