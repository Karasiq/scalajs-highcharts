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
  * @note JavaScript name: <code>series&lt;packedbubble&gt;-dataLabels-parentNodeTextPath</code>
  */
class SeriesPackedbubbleDataLabelsParentNodeTextPath extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable <code>textPath</code> option for link&#39;s or marker&#39;s
    * data labels.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object SeriesPackedbubbleDataLabelsParentNodeTextPath {
  /**
    * @param enabled <p>Enable or disable <code>textPath</code> option for link&#39;s or marker&#39;s. data labels.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SeriesPackedbubbleDataLabelsParentNodeTextPath = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPackedbubbleDataLabelsParentNodeTextPath {
      this.enabled = enabled
    })
  }
}