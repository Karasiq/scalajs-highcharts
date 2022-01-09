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
  * @note JavaScript name: <code>series&lt;networkgraph&gt;-dataLabels-style</code>
  */
class SeriesNetworkgraphDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var transition: js.UndefOr[String] = js.undefined
}

object SeriesNetworkgraphDataLabelsStyle {
  /**
    */
  def apply(transition: js.UndefOr[String] = js.undefined): SeriesNetworkgraphDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesNetworkgraphDataLabelsStyle {
      this.transition = transition
    })
  }
}
