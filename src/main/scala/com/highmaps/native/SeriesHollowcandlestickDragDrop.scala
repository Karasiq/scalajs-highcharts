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
  * @note JavaScript name: <code>series&lt;hollowcandlestick&gt;-dragDrop</code>
  */
class SeriesHollowcandlestickDragDrop extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Allow close value to be dragged individually.</p>
    * @since 6.2.0
    */
  var draggableClose: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Allow high value to be dragged individually.</p>
    * @since 6.2.0
    */
  var draggableHigh: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Allow low value to be dragged individually.</p>
    * @since 6.2.0
    */
  var draggableLow: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Allow open value to be dragged individually.</p>
    * @since 6.2.0
    */
  var draggableOpen: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Options for the drag handles.</p>
    * @since 6.2.0
    */
  var dragHandle: js.Any = js.undefined

  /**
    * <p>Set the maximum X value the points can be moved to.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/dragdrop/drag-gantt">Limit dragging</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Limit dragging</a>
    * @since 6.2.0
    */
  var dragMaxX: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set the maximum Y value the points can be moved to.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/dragdrop/drag-gantt">Limit dragging</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Limit dragging</a>
    * @since 6.2.0
    */
  var dragMaxY: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set the minimum X value the points can be moved to.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/dragdrop/drag-gantt">Limit dragging</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Limit dragging</a>
    * @since 6.2.0
    */
  var dragMinX: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set the minimum Y value the points can be moved to.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/dragdrop/drag-gantt">Limit dragging</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Limit dragging</a>
    * @since 6.2.0
    */
  var dragMinY: js.UndefOr[Double] = js.undefined

  /**
    * <p>The X precision value to drag to for this series. Set to 0 to disable. By
    * default this is disabled, except for category axes, where the default is 1.</p>
    * @since 6.2.0
    */
  var dragPrecisionX: js.UndefOr[Double] = js.undefined

  /**
    * <p>The Y precision value to drag to for this series. Set to 0 to disable. By
    * default this is disabled, except for category axes, where the default is 1.</p>
    * @since 6.2.0
    */
  var dragPrecisionY: js.UndefOr[Double] = js.undefined

  /**
    * <p>The amount of pixels to drag the pointer before it counts as a drag
    * operation. This prevents drag/drop to fire when just clicking or selecting
    * points.</p>
    * @since 6.2.0
    */
  var dragSensitivity: js.UndefOr[Double] = js.undefined

  /**
    * <p>Enable dragging in the X dimension.</p>
    * @since 6.2.0
    */
  var draggableX: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enable dragging in the Y dimension. Note that this is not supported for
    * TreeGrid axes (the default axis type in Gantt charts).</p>
    * @since 6.2.0
    */
  var draggableY: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Group the points by a property. Points with the same property value will be
    * grouped together when moving.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/dragdrop/drag-gantt">Drag grouped points</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Drag grouped points</a>
    * @since 6.2.0
    */
  var groupBy: js.UndefOr[String] = js.undefined

  /**
    * <p>Style options for the guide box. The guide box has one state by default, the
    * <code>default</code> state.</p>
    * @since 6.2.0
    */
  var guideBox: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Update points as they are dragged. If false, a guide box is drawn to
    * illustrate the new point size.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/dragdrop/drag-gantt">liveRedraw disabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">liveRedraw disabled</a>
    * @since 6.2.0
    */
  var liveRedraw: js.UndefOr[Boolean] = js.undefined
}

object SeriesHollowcandlestickDragDrop {
  /**
    * @param draggableClose <p>Allow close value to be dragged individually.</p>
    * @param draggableHigh <p>Allow high value to be dragged individually.</p>
    * @param draggableLow <p>Allow low value to be dragged individually.</p>
    * @param draggableOpen <p>Allow open value to be dragged individually.</p>
    * @param dragHandle <p>Options for the drag handles.</p>
    * @param dragMaxX <p>Set the maximum X value the points can be moved to.</p>
    * @param dragMaxY <p>Set the maximum Y value the points can be moved to.</p>
    * @param dragMinX <p>Set the minimum X value the points can be moved to.</p>
    * @param dragMinY <p>Set the minimum Y value the points can be moved to.</p>
    * @param dragPrecisionX <p>The X precision value to drag to for this series. Set to 0 to disable. By. default this is disabled, except for category axes, where the default is 1.</p>
    * @param dragPrecisionY <p>The Y precision value to drag to for this series. Set to 0 to disable. By. default this is disabled, except for category axes, where the default is 1.</p>
    * @param dragSensitivity <p>The amount of pixels to drag the pointer before it counts as a drag. operation. This prevents drag/drop to fire when just clicking or selecting. points.</p>
    * @param draggableX <p>Enable dragging in the X dimension.</p>
    * @param draggableY <p>Enable dragging in the Y dimension. Note that this is not supported for. TreeGrid axes (the default axis type in Gantt charts).</p>
    * @param groupBy <p>Group the points by a property. Points with the same property value will be. grouped together when moving.</p>
    * @param guideBox <p>Style options for the guide box. The guide box has one state by default, the. <code>default</code> state.</p>
    * @param liveRedraw <p>Update points as they are dragged. If false, a guide box is drawn to. illustrate the new point size.</p>
    */
  def apply(draggableClose: js.UndefOr[Boolean] = js.undefined, draggableHigh: js.UndefOr[Boolean] = js.undefined, draggableLow: js.UndefOr[Boolean] = js.undefined, draggableOpen: js.UndefOr[Boolean] = js.undefined, dragHandle: js.UndefOr[js.Any] = js.undefined, dragMaxX: js.UndefOr[Double] = js.undefined, dragMaxY: js.UndefOr[Double] = js.undefined, dragMinX: js.UndefOr[Double] = js.undefined, dragMinY: js.UndefOr[Double] = js.undefined, dragPrecisionX: js.UndefOr[Double] = js.undefined, dragPrecisionY: js.UndefOr[Double] = js.undefined, dragSensitivity: js.UndefOr[Double] = js.undefined, draggableX: js.UndefOr[Boolean] = js.undefined, draggableY: js.UndefOr[Boolean] = js.undefined, groupBy: js.UndefOr[String] = js.undefined, guideBox: js.UndefOr[js.Object] = js.undefined, liveRedraw: js.UndefOr[Boolean] = js.undefined): SeriesHollowcandlestickDragDrop = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesHollowcandlestickDragDrop {
      this.draggableClose = draggableClose
      this.draggableHigh = draggableHigh
      this.draggableLow = draggableLow
      this.draggableOpen = draggableOpen
      this.dragHandle = dragHandle
      this.dragMaxX = dragMaxX
      this.dragMaxY = dragMaxY
      this.dragMinX = dragMinX
      this.dragMinY = dragMinY
      this.dragPrecisionX = dragPrecisionX
      this.dragPrecisionY = dragPrecisionY
      this.dragSensitivity = dragSensitivity
      this.draggableX = draggableX
      this.draggableY = draggableY
      this.groupBy = groupBy
      this.guideBox = guideBox
      this.liveRedraw = liveRedraw
    })
  }
}