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
  * @note JavaScript name: <code>plotOptions-wordcloud-animation</code>
  */
class PlotOptionsWordcloudAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined

  var defer: js.UndefOr[Double] = js.undefined
}

object PlotOptionsWordcloudAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined, defer: js.UndefOr[Double] = js.undefined): PlotOptionsWordcloudAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsWordcloudAnimation {
      this.duration = duration
      this.defer = defer
    })
  }
}
