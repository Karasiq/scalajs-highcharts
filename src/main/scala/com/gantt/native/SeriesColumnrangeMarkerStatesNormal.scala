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
  * @note JavaScript name: <code>series&lt;columnrange&gt;-marker-states-normal</code>
  */
class SeriesColumnrangeMarkerStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object SeriesColumnrangeMarkerStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): SeriesColumnrangeMarkerStatesNormal = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesColumnrangeMarkerStatesNormal {
      this.animation = animation
    })
  }
}
