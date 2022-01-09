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
  * @note JavaScript name: <code>plotOptions-sunburst-levels-colorVariation</code>
  */
class PlotOptionsSunburstLevelsColorVariation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The key of a color variation. Currently supports <code>brightness</code> only.</p>
    */
  var key: js.UndefOr[String] = js.undefined

  /**
    * <p>The ending value of a color variation. The last sibling will receive
    * this value.</p>
    */
  var to: js.UndefOr[Double] = js.undefined
}

object PlotOptionsSunburstLevelsColorVariation {
  /**
    * @param key <p>The key of a color variation. Currently supports <code>brightness</code> only.</p>
    * @param to <p>The ending value of a color variation. The last sibling will receive. this value.</p>
    */
  def apply(key: js.UndefOr[String] = js.undefined, to: js.UndefOr[Double] = js.undefined): PlotOptionsSunburstLevelsColorVariation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSunburstLevelsColorVariation {
      this.key = key
      this.to = to
    })
  }
}
