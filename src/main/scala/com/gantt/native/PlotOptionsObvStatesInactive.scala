/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-obv-states-inactive</code>
  */
class PlotOptionsObvStatesInactive extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when not hovering over the marker.</p>
    * @since 9.1.0
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Enable or disable the inactive state for a series</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-inactive-disabled">Disabled inactive state</a>
    * @since 9.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Opacity of inactive markers.</p>
    * @since 9.1.0
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotOptionsObvStatesInactive {
  /**
    * @param animation <p>Animation when not hovering over the marker.</p>
    * @param enabled <p>Enable or disable the inactive state for a series</p>
    * @param opacity <p>Opacity of inactive markers.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, opacity: js.UndefOr[Double] = js.undefined): PlotOptionsObvStatesInactive = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsObvStatesInactive {
      this.animation = animation
      this.enabled = enabled
      this.opacity = opacity
    })
  }
}