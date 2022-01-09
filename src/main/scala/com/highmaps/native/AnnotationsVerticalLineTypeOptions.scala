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
  * @note JavaScript name: <code>annotations-verticalLine-typeOptions</code>
  */
class AnnotationsVerticalLineTypeOptions extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Connector options.</p>
    * @since 6.0.0
    */
  var connector: js.UndefOr[CleanJsObject[AnnotationsVerticalLineTypeOptionsConnector]] = js.undefined

  /**
    * <p>Label options.</p>
    * @since 6.0.0
    */
  var label: js.UndefOr[CleanJsObject[AnnotationsVerticalLineTypeOptionsLabel]] = js.undefined

  /**
    * <p>Line options.</p>
    * @since 6.0.0
    */
  var line: js.Any = js.undefined

  var points: js.UndefOr[js.Array[js.Any]] = js.undefined

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

object AnnotationsVerticalLineTypeOptions {
  /**
    * @param connector <p>Connector options.</p>
    * @param label <p>Label options.</p>
    * @param line <p>Line options.</p>
    * @param xAxis <p>This number defines which xAxis the point is connected to.. It refers to either the axis id or the index of the axis. in the xAxis array.</p>
    * @param yAxis <p>This number defines which yAxis the point is connected to.. It refers to either the axis id or the index of the axis. in the xAxis array.</p>
    */
  def apply(connector: js.UndefOr[CleanJsObject[AnnotationsVerticalLineTypeOptionsConnector]] = js.undefined, label: js.UndefOr[CleanJsObject[AnnotationsVerticalLineTypeOptionsLabel]] = js.undefined, line: js.UndefOr[js.Any] = js.undefined, points: js.UndefOr[js.Array[js.Any]] = js.undefined, xAxis: js.UndefOr[Double] = js.undefined, yAxis: js.UndefOr[Double] = js.undefined): AnnotationsVerticalLineTypeOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsVerticalLineTypeOptions {
      this.connector = connector
      this.label = label
      this.line = line
      this.points = points
      this.xAxis = xAxis
      this.yAxis = yAxis
    })
  }
}
