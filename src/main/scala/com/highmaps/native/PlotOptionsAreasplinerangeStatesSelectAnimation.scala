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
  * @note JavaScript name: <code>plotOptions-areasplinerange-states-select-animation</code>
  */
class PlotOptionsAreasplinerangeStatesSelectAnimation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The duration of the hover animation in milliseconds. By
    * default the hover state animates quickly in, and slowly
    * back to normal.</p>
    * @since 5.0.8
    */
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotOptionsAreasplinerangeStatesSelectAnimation {
  /**
    * @param duration <p>The duration of the hover animation in milliseconds. By. default the hover state animates quickly in, and slowly. back to normal.</p>
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): PlotOptionsAreasplinerangeStatesSelectAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsAreasplinerangeStatesSelectAnimation {
      this.duration = duration
    })
  }
}
