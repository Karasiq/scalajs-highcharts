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
  * @note JavaScript name: <code>annotations-elliottWave-typeOptions</code>
  */
class AnnotationsElliottWaveTypeOptions extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Line options.</p>
    * @since 6.0.0
    */
  var line: js.Any = js.undefined

  var points: js.Any = js.undefined

  /**
    * <p>This number defines which xAxis the point is connected to.
    * It refers to either the axis id or the index of the axis
    * in the xAxis array.</p>
    * @since 6.0.0
    */
  var xAxis: js.UndefOr[Double] = js.undefined

  /**
    * <p>This number defines which yAxis the point is connected to.
    * It refers to either the axis id or the index of the axis
    * in the xAxis array.</p>
    * @since 6.0.0
    */
  var yAxis: js.UndefOr[Double] = js.undefined
}

object AnnotationsElliottWaveTypeOptions {
  /**
    * @param line <p>Line options.</p>
    * @param xAxis <p>This number defines which xAxis the point is connected to.. It refers to either the axis id or the index of the axis. in the xAxis array.</p>
    * @param yAxis <p>This number defines which yAxis the point is connected to.. It refers to either the axis id or the index of the axis. in the xAxis array.</p>
    */
  def apply(line: js.UndefOr[js.Any] = js.undefined, points: js.UndefOr[js.Any] = js.undefined, xAxis: js.UndefOr[Double] = js.undefined, yAxis: js.UndefOr[Double] = js.undefined): AnnotationsElliottWaveTypeOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsElliottWaveTypeOptions {
      this.line = line
      this.points = points
      this.xAxis = xAxis
      this.yAxis = yAxis
    })
  }
}
