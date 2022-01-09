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
  * @note JavaScript name: <code>plotOptions-venn-states-inactive</code>
  */
class PlotOptionsVennStatesInactive extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Opacity of inactive markers.</p>
    */
  var opacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>Animation when not hovering over the marker.</p>
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Enable or disable the inactive state for a series</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-inactive-disabled">Disabled inactive state</a>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotOptionsVennStatesInactive {
  /**
    * @param opacity <p>Opacity of inactive markers.</p>
    * @param animation <p>Animation when not hovering over the marker.</p>
    * @param enabled <p>Enable or disable the inactive state for a series</p>
    */
  def apply(opacity: js.UndefOr[Double] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined): PlotOptionsVennStatesInactive = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVennStatesInactive {
      this.opacity = opacity
      this.animation = animation
      this.enabled = enabled
    })
  }
}
