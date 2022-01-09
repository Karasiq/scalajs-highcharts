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
  * @note JavaScript name: <code>series&lt;errorbar&gt;-dragDrop-dragHandle</code>
  */
class SeriesErrorbarDragDropDragHandle extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The class name of the drag handles. Defaults to <code>highcharts-drag-handle</code>.</p>
    * @since 6.2.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>The fill color of the drag handles.</p>
    * @since 6.2.0
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The mouse cursor to use for the drag handles. By default this is
    * intelligently switching between <code>ew-resize</code> and <code>ns-resize</code> depending on
    * the direction the point is being dragged.</p>
    * @since 6.2.0
    */
  var cursor: js.UndefOr[String] = js.undefined

  /**
    * <p>The line color of the drag handles.</p>
    * @since 6.2.0
    */
  var lineColor: js.UndefOr[String] = js.undefined

  /**
    * <p>The line width for the drag handles.</p>
    * @since 6.2.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Function to define the SVG path to use for the drag handles. Takes the
    * point as argument. Should return an SVG path in array format. The SVG
    * path is automatically positioned on the point.</p>
    * @since 6.2.0
    */
  var pathFormatter: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>The z index for the drag handles.</p>
    * @since 6.2.0
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object SeriesErrorbarDragDropDragHandle {
  /**
    * @param className <p>The class name of the drag handles. Defaults to <code>highcharts-drag-handle</code>.</p>
    * @param color <p>The fill color of the drag handles.</p>
    * @param cursor <p>The mouse cursor to use for the drag handles. By default this is. intelligently switching between <code>ew-resize</code> and <code>ns-resize</code> depending on. the direction the point is being dragged.</p>
    * @param lineColor <p>The line color of the drag handles.</p>
    * @param lineWidth <p>The line width for the drag handles.</p>
    * @param pathFormatter <p>Function to define the SVG path to use for the drag handles. Takes the. point as argument. Should return an SVG path in array format. The SVG. path is automatically positioned on the point.</p>
    * @param zIndex <p>The z index for the drag handles.</p>
    */
  def apply(className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, cursor: js.UndefOr[String] = js.undefined, lineColor: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, pathFormatter: js.UndefOr[js.Function] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): SeriesErrorbarDragDropDragHandle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesErrorbarDragDropDragHandle {
      this.className = className
      this.color = color
      this.cursor = cursor
      this.lineColor = lineColor
      this.lineWidth = lineWidth
      this.pathFormatter = pathFormatter
      this.zIndex = zIndex
    })
  }
}
