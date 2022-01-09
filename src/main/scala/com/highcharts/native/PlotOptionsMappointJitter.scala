/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-mappoint-jitter</code>
  */
class PlotOptionsMappointJitter extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The maximal X offset for the random jitter effect.</p>
    * @since 7.0.2
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The maximal Y offset for the random jitter effect.</p>
    * @since 7.0.2
    */
  var y: js.UndefOr[Double] = js.undefined
}

object PlotOptionsMappointJitter {
  /**
    * @param x <p>The maximal X offset for the random jitter effect.</p>
    * @param y <p>The maximal Y offset for the random jitter effect.</p>
    */
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): PlotOptionsMappointJitter = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMappointJitter {
      this.x = x
      this.y = y
    })
  }
}
