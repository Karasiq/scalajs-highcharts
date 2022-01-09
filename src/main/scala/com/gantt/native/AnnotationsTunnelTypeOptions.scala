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
  * @note JavaScript name: <code>annotations-tunnel-typeOptions</code>
  */
class AnnotationsTunnelTypeOptions extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Background options.</p>
    * @since 6.0.0
    */
  var background: js.UndefOr[CleanJsObject[AnnotationsTunnelTypeOptionsBackground]] = js.undefined

  /**
    * <p>The height of the annotation in terms of yAxis.</p>
    * @since 6.0.0
    */
  var height: js.UndefOr[Double] = js.undefined

  /**
    * <p>Options for the control point which controls
    * the annotation&#39;s height.</p>
    * @since 6.0.0
    */
  var heightControlPoint: js.Any = js.undefined

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

object AnnotationsTunnelTypeOptions {
  /**
    * @param background <p>Background options.</p>
    * @param height <p>The height of the annotation in terms of yAxis.</p>
    * @param heightControlPoint <p>Options for the control point which controls. the annotation&#39;s height.</p>
    * @param line <p>Line options.</p>
    * @param xAxis <p>This number defines which xAxis the point is connected to.. It refers to either the axis id or the index of the axis. in the xAxis array.</p>
    * @param yAxis <p>This number defines which yAxis the point is connected to.. It refers to either the axis id or the index of the axis. in the xAxis array.</p>
    */
  def apply(background: js.UndefOr[CleanJsObject[AnnotationsTunnelTypeOptionsBackground]] = js.undefined, height: js.UndefOr[Double] = js.undefined, heightControlPoint: js.UndefOr[js.Any] = js.undefined, line: js.UndefOr[js.Any] = js.undefined, points: js.UndefOr[js.Array[js.Any]] = js.undefined, xAxis: js.UndefOr[Double] = js.undefined, yAxis: js.UndefOr[Double] = js.undefined): AnnotationsTunnelTypeOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsTunnelTypeOptions {
      this.background = background
      this.height = height
      this.heightControlPoint = heightControlPoint
      this.line = line
      this.points = points
      this.xAxis = xAxis
      this.yAxis = yAxis
    })
  }
}
