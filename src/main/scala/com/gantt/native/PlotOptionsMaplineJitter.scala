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
  * @note JavaScript name: <code>plotOptions-mapline-jitter</code>
  */
class PlotOptionsMaplineJitter extends com.highcharts.HighchartsGenericObject {

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

object PlotOptionsMaplineJitter {
  /**
    * @param x <p>The maximal X offset for the random jitter effect.</p>
    * @param y <p>The maximal Y offset for the random jitter effect.</p>
    */
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): PlotOptionsMaplineJitter = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMaplineJitter {
      this.x = x
      this.y = y
    })
  }
}
