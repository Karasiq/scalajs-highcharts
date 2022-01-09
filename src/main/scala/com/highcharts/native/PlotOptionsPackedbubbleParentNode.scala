/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-packedbubble-parentNode</code>
  */
class PlotOptionsPackedbubbleParentNode extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Allow this series&#39; parent nodes to be selected
    * by clicking on the graph.</p>
    * @since 8.1.1
    */
  var allowPointSelect: js.UndefOr[Boolean] = js.undefined
}

object PlotOptionsPackedbubbleParentNode {
  /**
    * @param allowPointSelect <p>Allow this series&#39; parent nodes to be selected. by clicking on the graph.</p>
    */
  def apply(allowPointSelect: js.UndefOr[Boolean] = js.undefined): PlotOptionsPackedbubbleParentNode = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPackedbubbleParentNode {
      this.allowPointSelect = allowPointSelect
    })
  }
}
