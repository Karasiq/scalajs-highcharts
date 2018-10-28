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
  * @note JavaScript name: <code>series&lt;ema&gt;-dragDrop</code>
  */
@js.annotation.ScalaJSDefined
class SeriesEmaDragDrop extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The amount of pixels to drag the pointer before it counts as a drag
    * operation. This prevents drag/drop to fire when just clicking or selecting
    * points.</p>
    * @since 6.2.0
    */
  val dragSensitivity: js.UndefOr[Double] = js.undefined

  /**
    * <p>Style options for the guide box. The guide box has one state by default,
    * the &quot;default&quot; state.</p>
    * @since 6.2.0
    */
  val guideBox: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Options for the drag handles.</p>
    * @since 6.2.0
    */
  val dragHandle: js.UndefOr[CleanJsObject[SeriesEmaDragDropDragHandle]] = js.undefined

  /**
    * <p>Set the minimum X value the points can be moved to.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/dragdrop/drag-gantt">Limit dragging</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Limit dragging</a>
    * @since 6.2.0
    */
  val dragMinX: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set the maximum X value the points can be moved to.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/dragdrop/drag-gantt">Limit dragging</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Limit dragging</a>
    * @since 6.2.0
    */
  val dragMaxX: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set the minimum Y value the points can be moved to.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/dragdrop/drag-gantt">Limit dragging</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Limit dragging</a>
    * @since 6.2.0
    */
  val dragMinY: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set the maximum Y value the points can be moved to.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/dragdrop/drag-gantt">Limit dragging</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Limit dragging</a>
    * @since 6.2.0
    */
  val dragMaxY: js.UndefOr[Double] = js.undefined

  /**
    * <p>The X precision value to drag to for this series. Set to 0 to disable. By
    * default this is disabled, except for category axes, where the default is 1.</p>
    * @since 6.2.0
    */
  val dragPrecisionX: js.UndefOr[Double] = js.undefined

  /**
    * <p>The Y precision value to drag to for this series. Set to 0 to disable. By
    * default this is disabled, except for category axes, where the default is 1.</p>
    * @since 6.2.0
    */
  val dragPrecisionY: js.UndefOr[Double] = js.undefined

  /**
    * <p>Enable dragging in the X dimension.</p>
    * @since 6.2.0
    */
  val draggableX: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enable dragging in the Y dimension. Note that this is not supported for
    * TreeGrid axes (the default axis type in Gantt charts).</p>
    * @since 6.2.0
    */
  val draggableY: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Group the points by a property. Points with the same property value will be
    * grouped together when moving.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/dragdrop/drag-gantt">Drag grouped points</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Drag grouped points</a>
    * @since 6.2.0
    */
  val groupBy: js.UndefOr[String] = js.undefined

  /**
    * <p>Update points as they are dragged. If false, a guide box is drawn to
    * illustrate the new point size.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/dragdrop/drag-gantt">liveRedraw disabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">liveRedraw disabled</a>
    * @since 6.2.0
    */
  val liveRedraw: js.UndefOr[Boolean] = js.undefined
}

object SeriesEmaDragDrop {
  /**
    * @param dragSensitivity <p>The amount of pixels to drag the pointer before it counts as a drag. operation. This prevents drag/drop to fire when just clicking or selecting. points.</p>
    * @param guideBox <p>Style options for the guide box. The guide box has one state by default,. the &quot;default&quot; state.</p>
    * @param dragHandle <p>Options for the drag handles.</p>
    * @param dragMinX <p>Set the minimum X value the points can be moved to.</p>
    * @param dragMaxX <p>Set the maximum X value the points can be moved to.</p>
    * @param dragMinY <p>Set the minimum Y value the points can be moved to.</p>
    * @param dragMaxY <p>Set the maximum Y value the points can be moved to.</p>
    * @param dragPrecisionX <p>The X precision value to drag to for this series. Set to 0 to disable. By. default this is disabled, except for category axes, where the default is 1.</p>
    * @param dragPrecisionY <p>The Y precision value to drag to for this series. Set to 0 to disable. By. default this is disabled, except for category axes, where the default is 1.</p>
    * @param draggableX <p>Enable dragging in the X dimension.</p>
    * @param draggableY <p>Enable dragging in the Y dimension. Note that this is not supported for. TreeGrid axes (the default axis type in Gantt charts).</p>
    * @param groupBy <p>Group the points by a property. Points with the same property value will be. grouped together when moving.</p>
    * @param liveRedraw <p>Update points as they are dragged. If false, a guide box is drawn to. illustrate the new point size.</p>
    */
  def apply(dragSensitivity: js.UndefOr[Double] = js.undefined, guideBox: js.UndefOr[js.Object] = js.undefined, dragHandle: js.UndefOr[CleanJsObject[SeriesEmaDragDropDragHandle]] = js.undefined, dragMinX: js.UndefOr[Double] = js.undefined, dragMaxX: js.UndefOr[Double] = js.undefined, dragMinY: js.UndefOr[Double] = js.undefined, dragMaxY: js.UndefOr[Double] = js.undefined, dragPrecisionX: js.UndefOr[Double] = js.undefined, dragPrecisionY: js.UndefOr[Double] = js.undefined, draggableX: js.UndefOr[Boolean] = js.undefined, draggableY: js.UndefOr[Boolean] = js.undefined, groupBy: js.UndefOr[String] = js.undefined, liveRedraw: js.UndefOr[Boolean] = js.undefined): SeriesEmaDragDrop = {
    val dragSensitivityOuter: js.UndefOr[Double] = dragSensitivity
    val guideBoxOuter: js.UndefOr[js.Object] = guideBox
    val dragHandleOuter: js.UndefOr[CleanJsObject[SeriesEmaDragDropDragHandle]] = dragHandle
    val dragMinXOuter: js.UndefOr[Double] = dragMinX
    val dragMaxXOuter: js.UndefOr[Double] = dragMaxX
    val dragMinYOuter: js.UndefOr[Double] = dragMinY
    val dragMaxYOuter: js.UndefOr[Double] = dragMaxY
    val dragPrecisionXOuter: js.UndefOr[Double] = dragPrecisionX
    val dragPrecisionYOuter: js.UndefOr[Double] = dragPrecisionY
    val draggableXOuter: js.UndefOr[Boolean] = draggableX
    val draggableYOuter: js.UndefOr[Boolean] = draggableY
    val groupByOuter: js.UndefOr[String] = groupBy
    val liveRedrawOuter: js.UndefOr[Boolean] = liveRedraw
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesEmaDragDrop {
      override val dragSensitivity: js.UndefOr[Double] = dragSensitivityOuter
      override val guideBox: js.UndefOr[js.Object] = guideBoxOuter
      override val dragHandle: js.UndefOr[CleanJsObject[SeriesEmaDragDropDragHandle]] = dragHandleOuter
      override val dragMinX: js.UndefOr[Double] = dragMinXOuter
      override val dragMaxX: js.UndefOr[Double] = dragMaxXOuter
      override val dragMinY: js.UndefOr[Double] = dragMinYOuter
      override val dragMaxY: js.UndefOr[Double] = dragMaxYOuter
      override val dragPrecisionX: js.UndefOr[Double] = dragPrecisionXOuter
      override val dragPrecisionY: js.UndefOr[Double] = dragPrecisionYOuter
      override val draggableX: js.UndefOr[Boolean] = draggableXOuter
      override val draggableY: js.UndefOr[Boolean] = draggableYOuter
      override val groupBy: js.UndefOr[String] = groupByOuter
      override val liveRedraw: js.UndefOr[Boolean] = liveRedrawOuter
    })
  }
}
