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
  * @note JavaScript name: <code>plotOptions-pyramid-states-inactive</code>
  */
class PlotOptionsPyramidStatesInactive extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when not hovering over the marker.</p>
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Enable or disable the inactive state for a series</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-inactive-disabled">Disabled inactive state</a>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Opacity of inactive markers.</p>
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotOptionsPyramidStatesInactive {
  /**
    * @param animation <p>Animation when not hovering over the marker.</p>
    * @param enabled <p>Enable or disable the inactive state for a series</p>
    * @param opacity <p>Opacity of inactive markers.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, opacity: js.UndefOr[Double] = js.undefined): PlotOptionsPyramidStatesInactive = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPyramidStatesInactive {
      this.animation = animation
      this.enabled = enabled
      this.opacity = opacity
    })
  }
}