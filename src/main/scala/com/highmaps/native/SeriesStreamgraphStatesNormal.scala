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
  * @note JavaScript name: <code>series&lt;streamgraph&gt;-states-normal</code>
  */
class SeriesStreamgraphStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-states-animation-false/">No animation of fill color</a>
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object SeriesStreamgraphStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): SeriesStreamgraphStatesNormal = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesStreamgraphStatesNormal {
      this.animation = animation
    })
  }
}
