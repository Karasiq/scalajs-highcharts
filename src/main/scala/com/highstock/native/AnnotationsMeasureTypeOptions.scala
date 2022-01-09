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
  * @note JavaScript name: <code>annotations-measure-typeOptions</code>
  */
class AnnotationsMeasureTypeOptions extends com.highcharts.HighchartsGenericObject {

  var background: js.Any = js.undefined

  /**
    * <p>Configure a crosshair that is horizontally placed in middle of
    * rectangle.</p>
    * @since 6.0.0
    */
  var crosshairX: js.Any = js.undefined

  /**
    * <p>Configure a crosshair that is vertically placed in middle of
    * rectangle.</p>
    * @since 6.0.0
    */
  var crosshairY: js.Any = js.undefined

  var label: js.Any = js.undefined

  /**
    * <p>Decides in what dimensions the user can resize by dragging the
    * mouse. Can be one of x, y or xy.</p>
    * @since 6.0.0
    */
  var selectType: js.UndefOr[String] = js.undefined

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
    * in the yAxis array.</p>
    * @since 6.0.0
    */
  var yAxis: js.UndefOr[Double] = js.undefined

  /**
    * <p>Line options.</p>
    * @since 6.0.0
    */
  var line: js.Any = js.undefined

  var points: js.UndefOr[js.Array[js.Any]] = js.undefined
}

object AnnotationsMeasureTypeOptions {
  /**
    * @param crosshairX <p>Configure a crosshair that is horizontally placed in middle of. rectangle.</p>
    * @param crosshairY <p>Configure a crosshair that is vertically placed in middle of. rectangle.</p>
    * @param selectType <p>Decides in what dimensions the user can resize by dragging the. mouse. Can be one of x, y or xy.</p>
    * @param xAxis <p>This number defines which xAxis the point is connected to.. It refers to either the axis id or the index of the axis. in the xAxis array.</p>
    * @param yAxis <p>This number defines which yAxis the point is connected to.. It refers to either the axis id or the index of the axis. in the yAxis array.</p>
    * @param line <p>Line options.</p>
    */
  def apply(background: js.UndefOr[js.Any] = js.undefined, crosshairX: js.UndefOr[js.Any] = js.undefined, crosshairY: js.UndefOr[js.Any] = js.undefined, label: js.UndefOr[js.Any] = js.undefined, selectType: js.UndefOr[String] = js.undefined, xAxis: js.UndefOr[Double] = js.undefined, yAxis: js.UndefOr[Double] = js.undefined, line: js.UndefOr[js.Any] = js.undefined, points: js.UndefOr[js.Array[js.Any]] = js.undefined): AnnotationsMeasureTypeOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsMeasureTypeOptions {
      this.background = background
      this.crosshairX = crosshairX
      this.crosshairY = crosshairY
      this.label = label
      this.selectType = selectType
      this.xAxis = xAxis
      this.yAxis = yAxis
      this.line = line
      this.points = points
    })
  }
}
