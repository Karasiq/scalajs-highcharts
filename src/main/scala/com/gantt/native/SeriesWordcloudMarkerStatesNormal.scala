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
  * @note JavaScript name: <code>series&lt;wordcloud&gt;-marker-states-normal</code>
  */
class SeriesWordcloudMarkerStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object SeriesWordcloudMarkerStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): SeriesWordcloudMarkerStatesNormal = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesWordcloudMarkerStatesNormal {
      this.animation = animation
    })
  }
}
