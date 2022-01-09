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
  * @note JavaScript name: <code>plotOptions-packedbubble-dataLabels-parentNodeTextPath</code>
  */
class PlotOptionsPackedbubbleDataLabelsParentNodeTextPath extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable <code>textPath</code> option for link&#39;s or marker&#39;s
    * data labels.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotOptionsPackedbubbleDataLabelsParentNodeTextPath {
  /**
    * @param enabled <p>Enable or disable <code>textPath</code> option for link&#39;s or marker&#39;s. data labels.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): PlotOptionsPackedbubbleDataLabelsParentNodeTextPath = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPackedbubbleDataLabelsParentNodeTextPath {
      this.enabled = enabled
    })
  }
}
