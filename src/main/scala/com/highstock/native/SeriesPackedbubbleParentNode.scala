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
  * @note JavaScript name: <code>series&lt;packedbubble&gt;-parentNode</code>
  */
class SeriesPackedbubbleParentNode extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Allow this series&#39; parent nodes to be selected
    * by clicking on the graph.</p>
    * @since 8.1.1
    */
  var allowPointSelect: js.UndefOr[Boolean] = js.undefined
}

object SeriesPackedbubbleParentNode {
  /**
    * @param allowPointSelect <p>Allow this series&#39; parent nodes to be selected. by clicking on the graph.</p>
    */
  def apply(allowPointSelect: js.UndefOr[Boolean] = js.undefined): SeriesPackedbubbleParentNode = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPackedbubbleParentNode {
      this.allowPointSelect = allowPointSelect
    })
  }
}
