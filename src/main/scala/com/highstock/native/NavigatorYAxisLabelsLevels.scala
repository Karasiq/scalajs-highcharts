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
  * @note JavaScript name: <code>navigator-yAxis-labels-levels</code>
  */
class NavigatorYAxisLabelsLevels extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Specify the level which the options within this object
    * applies to.</p>
    */
  var level: js.UndefOr[Double] = js.undefined

  var style: js.UndefOr[js.Object] = js.undefined
}

object NavigatorYAxisLabelsLevels {
  /**
    * @param level <p>Specify the level which the options within this object. applies to.</p>
    */
  def apply(level: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): NavigatorYAxisLabelsLevels = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorYAxisLabelsLevels {
      this.level = level
      this.style = style
    })
  }
}
