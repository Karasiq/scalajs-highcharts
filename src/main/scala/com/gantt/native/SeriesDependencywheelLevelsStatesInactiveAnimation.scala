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
  * @note JavaScript name: <code>series&lt;dependencywheel&gt;-levels-states-inactive-animation</code>
  */
class SeriesDependencywheelLevelsStatesInactiveAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object SeriesDependencywheelLevelsStatesInactiveAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesDependencywheelLevelsStatesInactiveAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesDependencywheelLevelsStatesInactiveAnimation {
      this.duration = duration
    })
  }
}