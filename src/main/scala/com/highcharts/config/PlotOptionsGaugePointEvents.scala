/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-gauge-point-events</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsGaugePointEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Callback that fires when starting to drag a point. The mouse event object is
    * passed in as an argument. If a drag handle is used, <code>e.updateProp</code> is set to
    * the data property being dragged. The <code>this</code> context is the point. See
    * <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>
    * <p>Requires the <code>draggable-points</code> module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Drag events</a>
    * @since 6.2.0
    */
  val dragStart: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Callback that fires while dragging a point. The mouse event is passed in as
    * parameter. The original data can be accessed from <code>e.origin</code>, and the new
    * point values can be accessed from <code>e.newPoints</code>. If there is only a single
    * point being updated, it can be accessed from <code>e.newPoint</code> for simplicity, and
    * its ID can be accessed from <code>e.newPointId</code>. The <code>this</code> context is the point
    * being dragged. To stop the default drag action, return false.
    * See <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>
    * <p>Requires the <code>draggable-points</code> module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Drag events</a>
    * @since 6.2.0
    */
  val drag: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Callback that fires when the point is dropped. The parameters passed are the
    * same as for <a href="#plotOptions.series.point.events.drag">drag</a>. To stop the
    * default drop action, return false. See
    * <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>
    * <p>Requires the <code>draggable-points</code> module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Drag events</a>
    * @since 6.2.0
    */
  val drop: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when a point is clicked. One parameter, <code>event</code>, is passed
    * to the function, containing common event information.</p>
    * <p>If the <code>series.allowPointSelect</code> option is true, the default
    * action for the point&#39;s click event is to toggle the point&#39;s
    * select state. Returning <code>false</code> cancels this action.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-click/">Click marker to alert values</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-click-column/">Click column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-click-url/">Go to URL</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-point-events-click/">Click marker to display values</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-point-events-click-url/">Go to URL</a>
    */
  val click: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the mouse leaves the area close to the point. One
    * parameter, <code>event</code>, is passed to the function, containing common
    * event information.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/">Show values in the chart's corner on mouse over</a>
    */
  val mouseOut: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the mouse enters the area close to the point. One
    * parameter, <code>event</code>, is passed to the function, containing common
    * event information.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/">Show values in the chart's corner on mouse over</a>
    */
  val mouseOver: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the point is removed using the <code>.remove()</code> method. One
    * parameter, <code>event</code>, is passed to the function. Returning <code>false</code>
    * cancels the operation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-remove/">Remove point and confirm</a>
    * @since 1.2.0
    */
  val remove: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the point is selected either programmatically or
    * following a click on the point. One parameter, <code>event</code>, is passed
    * to the function. Returning <code>false</code> cancels the operation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-select/">Report the last selected point</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Report select and unselect</a>
    * @since 1.2.0
    */
  val select: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the point is unselected either programmatically or
    * following a click on the point. One parameter, <code>event</code>, is passed
    * to the function.
    *  Returning <code>false</code> cancels the operation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-unselect/">Report the last unselected point</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Report select and unselect</a>
    * @since 1.2.0
    */
  val unselect: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the point is updated programmatically through the
    * <code>.update()</code> method. One parameter, <code>event</code>, is passed to the
    * function. The new point options can be accessed through
    * <code>event.options</code>. Returning <code>false</code> cancels the operation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-update/">Confirm point updating</a>
    * @since 1.2.0
    */
  val update: js.UndefOr[js.Function] = js.undefined
}

object PlotOptionsGaugePointEvents {
  /**
    * @param dragStart <p>Callback that fires when starting to drag a point. The mouse event object is. passed in as an argument. If a drag handle is used, <code>e.updateProp</code> is set to. the data property being dragged. The <code>this</code> context is the point. See. <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>. <p>Requires the <code>draggable-points</code> module.</p>
    * @param drag <p>Callback that fires while dragging a point. The mouse event is passed in as. parameter. The original data can be accessed from <code>e.origin</code>, and the new. point values can be accessed from <code>e.newPoints</code>. If there is only a single. point being updated, it can be accessed from <code>e.newPoint</code> for simplicity, and. its ID can be accessed from <code>e.newPointId</code>. The <code>this</code> context is the point. being dragged. To stop the default drag action, return false.. See <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>. <p>Requires the <code>draggable-points</code> module.</p>
    * @param drop <p>Callback that fires when the point is dropped. The parameters passed are the. same as for <a href="#plotOptions.series.point.events.drag">drag</a>. To stop the. default drop action, return false. See. <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>. <p>Requires the <code>draggable-points</code> module.</p>
    * @param click <p>Fires when a point is clicked. One parameter, <code>event</code>, is passed. to the function, containing common event information.</p>. <p>If the <code>series.allowPointSelect</code> option is true, the default. action for the point&#39;s click event is to toggle the point&#39;s. select state. Returning <code>false</code> cancels this action.</p>
    * @param mouseOut <p>Fires when the mouse leaves the area close to the point. One. parameter, <code>event</code>, is passed to the function, containing common. event information.</p>
    * @param mouseOver <p>Fires when the mouse enters the area close to the point. One. parameter, <code>event</code>, is passed to the function, containing common. event information.</p>
    * @param remove <p>Fires when the point is removed using the <code>.remove()</code> method. One. parameter, <code>event</code>, is passed to the function. Returning <code>false</code>. cancels the operation.</p>
    * @param select <p>Fires when the point is selected either programmatically or. following a click on the point. One parameter, <code>event</code>, is passed. to the function. Returning <code>false</code> cancels the operation.</p>
    * @param unselect <p>Fires when the point is unselected either programmatically or. following a click on the point. One parameter, <code>event</code>, is passed. to the function..  Returning <code>false</code> cancels the operation.</p>
    * @param update <p>Fires when the point is updated programmatically through the. <code>.update()</code> method. One parameter, <code>event</code>, is passed to the. function. The new point options can be accessed through. <code>event.options</code>. Returning <code>false</code> cancels the operation.</p>
    */
  def apply(dragStart: js.UndefOr[js.Function] = js.undefined, drag: js.UndefOr[js.Function] = js.undefined, drop: js.UndefOr[js.Function] = js.undefined, click: js.UndefOr[js.Function] = js.undefined, mouseOut: js.UndefOr[js.Function] = js.undefined, mouseOver: js.UndefOr[js.Function] = js.undefined, remove: js.UndefOr[js.Function] = js.undefined, select: js.UndefOr[js.Function] = js.undefined, unselect: js.UndefOr[js.Function] = js.undefined, update: js.UndefOr[js.Function] = js.undefined): PlotOptionsGaugePointEvents = {
    val dragStartOuter: js.UndefOr[js.Function] = dragStart
    val dragOuter: js.UndefOr[js.Function] = drag
    val dropOuter: js.UndefOr[js.Function] = drop
    val clickOuter: js.UndefOr[js.Function] = click
    val mouseOutOuter: js.UndefOr[js.Function] = mouseOut
    val mouseOverOuter: js.UndefOr[js.Function] = mouseOver
    val removeOuter: js.UndefOr[js.Function] = remove
    val selectOuter: js.UndefOr[js.Function] = select
    val unselectOuter: js.UndefOr[js.Function] = unselect
    val updateOuter: js.UndefOr[js.Function] = update
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsGaugePointEvents {
      override val dragStart: js.UndefOr[js.Function] = dragStartOuter
      override val drag: js.UndefOr[js.Function] = dragOuter
      override val drop: js.UndefOr[js.Function] = dropOuter
      override val click: js.UndefOr[js.Function] = clickOuter
      override val mouseOut: js.UndefOr[js.Function] = mouseOutOuter
      override val mouseOver: js.UndefOr[js.Function] = mouseOverOuter
      override val remove: js.UndefOr[js.Function] = removeOuter
      override val select: js.UndefOr[js.Function] = selectOuter
      override val unselect: js.UndefOr[js.Function] = unselectOuter
      override val update: js.UndefOr[js.Function] = updateOuter
    })
  }
}
