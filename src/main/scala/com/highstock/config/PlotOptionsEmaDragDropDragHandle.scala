/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-ema-dragDrop-dragHandle</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsEmaDragDropDragHandle extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Function to define the SVG path to use for the drag handles. Takes
    * the point as argument. Should return an SVG path in array format. The
    * SVG path is automatically positioned on the point.</p>
    * @since 6.2.0
    */
  val pathFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>The mouse cursor to use for the drag handles. By default this is
    * intelligently switching between <code>ew-resize</code> and <code>ns-resize</code> depending
    * on the direction the point is being dragged.</p>
    * @since 6.2.0
    */
  val cursor: js.UndefOr[String] = js.undefined

  /**
    * <p>The class name of the drag handles. Defaults to <code>highcharts-drag-handle</code>.</p>
    * @since 6.2.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * <p>The fill color of the drag handles.</p>
    * @since 6.2.0
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The line color of the drag handles.</p>
    * @since 6.2.0
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The line width for the drag handles.</p>
    * @since 6.2.0
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The z index for the drag handles.</p>
    * @since 6.2.0
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object PlotOptionsEmaDragDropDragHandle {
  /**
    * @param pathFormatter <p>Function to define the SVG path to use for the drag handles. Takes. the point as argument. Should return an SVG path in array format. The. SVG path is automatically positioned on the point.</p>
    * @param cursor <p>The mouse cursor to use for the drag handles. By default this is. intelligently switching between <code>ew-resize</code> and <code>ns-resize</code> depending. on the direction the point is being dragged.</p>
    * @param className <p>The class name of the drag handles. Defaults to <code>highcharts-drag-handle</code>.</p>
    * @param color <p>The fill color of the drag handles.</p>
    * @param lineColor <p>The line color of the drag handles.</p>
    * @param lineWidth <p>The line width for the drag handles.</p>
    * @param zIndex <p>The z index for the drag handles.</p>
    */
  def apply(pathFormatter: js.UndefOr[js.Function] = js.undefined, cursor: js.UndefOr[String] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): PlotOptionsEmaDragDropDragHandle = {
    val pathFormatterOuter: js.UndefOr[js.Function] = pathFormatter
    val cursorOuter: js.UndefOr[String] = cursor
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val zIndexOuter: js.UndefOr[Double] = zIndex
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsEmaDragDropDragHandle {
      override val pathFormatter: js.UndefOr[js.Function] = pathFormatterOuter
      override val cursor: js.UndefOr[String] = cursorOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    })
  }
}
