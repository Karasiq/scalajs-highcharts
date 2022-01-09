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
  * @note JavaScript name: <code>plotOptions-treemap-levels-colorVariation</code>
  */
class PlotOptionsTreemapLevelsColorVariation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The key of a color variation. Currently supports <code>brightness</code> only.</p>
    * @since 6.0.0
    */
  var key: js.UndefOr[String] = js.undefined

  /**
    * <p>The ending value of a color variation. The last sibling will receive
    * this value.</p>
    * @since 6.0.0
    */
  var to: js.UndefOr[Double] = js.undefined
}

object PlotOptionsTreemapLevelsColorVariation {
  /**
    * @param key <p>The key of a color variation. Currently supports <code>brightness</code> only.</p>
    * @param to <p>The ending value of a color variation. The last sibling will receive. this value.</p>
    */
  def apply(key: js.UndefOr[String] = js.undefined, to: js.UndefOr[Double] = js.undefined): PlotOptionsTreemapLevelsColorVariation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTreemapLevelsColorVariation {
      this.key = key
      this.to = to
    })
  }
}
