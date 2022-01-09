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
  * @note JavaScript name: <code>series&lt;packedbubble&gt;-dataLabels-style</code>
  */
class SeriesPackedbubbleDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var transition: js.UndefOr[String] = js.undefined
}

object SeriesPackedbubbleDataLabelsStyle {
  /**
    */
  def apply(transition: js.UndefOr[String] = js.undefined): SeriesPackedbubbleDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPackedbubbleDataLabelsStyle {
      this.transition = transition
    })
  }
}
