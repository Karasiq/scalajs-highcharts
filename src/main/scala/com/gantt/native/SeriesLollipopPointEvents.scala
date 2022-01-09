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
  * @note JavaScript name: <code>series&lt;lollipop&gt;-point-events</code>
  */
class SeriesLollipopPointEvents extends com.highcharts.HighchartsGenericObject {

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
  var click: js.Any = js.undefined

  /**
    * <p>Callback that fires while dragging a point. The mouse event is passed in as
    * parameter. The original data can be accessed from <code>e.origin</code>, and the new
    * point values can be accessed from <code>e.newPoints</code>. If there is only a single
    * point being updated, it can be accessed from <code>e.newPoint</code> for simplicity, and
    * its ID can be accessed from <code>e.newPointId</code>. The <code>this</code> context is the point
    * being dragged. To stop the default drag action, return false. See
    * <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Drag events</a>
    * @since 6.2.0
    */
  var drag: js.Any = js.undefined

  /**
    * <p>Callback that fires when starting to drag a point. The mouse event object is
    * passed in as an argument. If a drag handle is used, <code>e.updateProp</code> is set to
    * the data property being dragged. The <code>this</code> context is the point. See
    * <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Drag events</a>
    * @since 6.2.0
    */
  var dragStart: js.Any = js.undefined

  /**
    * <p>Callback that fires when the point is dropped. The parameters passed are the
    * same as for <a href="#plotOptions.series.point.events.drag">drag</a>. To stop the
    * default drop action, return false. See
    * <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Drag events</a>
    * @since 6.2.0
    */
  var drop: js.Any = js.undefined

  /**
    * <p>Fires when the mouse leaves the area close to the point. One
    * parameter, <code>event</code>, is passed to the function, containing common
    * event information.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/">Show values in the chart's corner on mouse over</a>
    */
  var mouseOut: js.Any = js.undefined

  /**
    * <p>Fires when the mouse enters the area close to the point. One
    * parameter, <code>event</code>, is passed to the function, containing common
    * event information.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/">Show values in the chart's corner on mouse over</a>
    */
  var mouseOver: js.Any = js.undefined

  /**
    * <p>Fires when the point is removed using the <code>.remove()</code> method. One
    * parameter, <code>event</code>, is passed to the function. Returning <code>false</code>
    * cancels the operation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-remove/">Remove point and confirm</a>
    * @since 1.2.0
    */
  var remove: js.Any = js.undefined

  /**
    * <p>Fires when the point is selected either programmatically or
    * following a click on the point. One parameter, <code>event</code>, is passed
    * to the function. Returning <code>false</code> cancels the operation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-select/">Report the last selected point</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Report select and unselect</a>
    * @since 1.2.0
    */
  var select: js.Any = js.undefined

  /**
    * <p>Fires when the point is unselected either programmatically or
    * following a click on the point. One parameter, <code>event</code>, is passed
    * to the function.
    *  Returning <code>false</code> cancels the operation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-unselect/">Report the last unselected point</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Report select and unselect</a>
    * @since 1.2.0
    */
  var unselect: js.Any = js.undefined

  /**
    * <p>Fires when the point is updated programmatically through the
    * <code>.update()</code> method. One parameter, <code>event</code>, is passed to the
    * function. The new point options can be accessed through
    * <code>event.options</code>. Returning <code>false</code> cancels the operation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-update/">Confirm point updating</a>
    * @since 1.2.0
    */
  var update: js.Any = js.undefined
}

object SeriesLollipopPointEvents {
  /**
    * @param click <p>Fires when a point is clicked. One parameter, <code>event</code>, is passed. to the function, containing common event information.</p>. <p>If the <code>series.allowPointSelect</code> option is true, the default. action for the point&#39;s click event is to toggle the point&#39;s. select state. Returning <code>false</code> cancels this action.</p>
    * @param drag <p>Callback that fires while dragging a point. The mouse event is passed in as. parameter. The original data can be accessed from <code>e.origin</code>, and the new. point values can be accessed from <code>e.newPoints</code>. If there is only a single. point being updated, it can be accessed from <code>e.newPoint</code> for simplicity, and. its ID can be accessed from <code>e.newPointId</code>. The <code>this</code> context is the point. being dragged. To stop the default drag action, return false. See. <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>
    * @param dragStart <p>Callback that fires when starting to drag a point. The mouse event object is. passed in as an argument. If a drag handle is used, <code>e.updateProp</code> is set to. the data property being dragged. The <code>this</code> context is the point. See. <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>
    * @param drop <p>Callback that fires when the point is dropped. The parameters passed are the. same as for <a href="#plotOptions.series.point.events.drag">drag</a>. To stop the. default drop action, return false. See. <a href="plotOptions.series.dragDrop">drag and drop options</a>.</p>
    * @param mouseOut <p>Fires when the mouse leaves the area close to the point. One. parameter, <code>event</code>, is passed to the function, containing common. event information.</p>
    * @param mouseOver <p>Fires when the mouse enters the area close to the point. One. parameter, <code>event</code>, is passed to the function, containing common. event information.</p>
    * @param remove <p>Fires when the point is removed using the <code>.remove()</code> method. One. parameter, <code>event</code>, is passed to the function. Returning <code>false</code>. cancels the operation.</p>
    * @param select <p>Fires when the point is selected either programmatically or. following a click on the point. One parameter, <code>event</code>, is passed. to the function. Returning <code>false</code> cancels the operation.</p>
    * @param unselect <p>Fires when the point is unselected either programmatically or. following a click on the point. One parameter, <code>event</code>, is passed. to the function..  Returning <code>false</code> cancels the operation.</p>
    * @param update <p>Fires when the point is updated programmatically through the. <code>.update()</code> method. One parameter, <code>event</code>, is passed to the. function. The new point options can be accessed through. <code>event.options</code>. Returning <code>false</code> cancels the operation.</p>
    */
  def apply(click: js.UndefOr[js.Any] = js.undefined, drag: js.UndefOr[js.Any] = js.undefined, dragStart: js.UndefOr[js.Any] = js.undefined, drop: js.UndefOr[js.Any] = js.undefined, mouseOut: js.UndefOr[js.Any] = js.undefined, mouseOver: js.UndefOr[js.Any] = js.undefined, remove: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[js.Any] = js.undefined, unselect: js.UndefOr[js.Any] = js.undefined, update: js.UndefOr[js.Any] = js.undefined): SeriesLollipopPointEvents = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesLollipopPointEvents {
      this.click = click
      this.drag = drag
      this.dragStart = dragStart
      this.drop = drop
      this.mouseOut = mouseOut
      this.mouseOver = mouseOver
      this.remove = remove
      this.select = select
      this.unselect = unselect
      this.update = update
    })
  }
}
