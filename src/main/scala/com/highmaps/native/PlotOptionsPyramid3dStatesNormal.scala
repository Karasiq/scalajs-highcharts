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
  * @note JavaScript name: <code>plotOptions-pyramid3d-states-normal</code>
  */
class PlotOptionsPyramid3dStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-states-animation-false/">No animation of fill color</a>
    * @since 7.1.0
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object PlotOptionsPyramid3dStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): PlotOptionsPyramid3dStatesNormal = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPyramid3dStatesNormal {
      this.animation = animation
    })
  }
}
