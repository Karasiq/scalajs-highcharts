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
  * @note JavaScript name: <code>series&lt;wordcloud&gt;-animation</code>
  */
class SeriesWordcloudAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined

  var defer: js.UndefOr[Double] = js.undefined
}

object SeriesWordcloudAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined, defer: js.UndefOr[Double] = js.undefined): SeriesWordcloudAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesWordcloudAnimation {
      this.duration = duration
      this.defer = defer
    })
  }
}
