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
  * @note JavaScript name: <code>series&lt;mappoint&gt;-events</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMappointEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Fires after the series has finished its initial animation, or in
    * case animation is disabled, immediately as the series is displayed.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-afteranimate/">Show label after animate</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-afteranimate/">Show label after animate</a>
    * @since 4.0
    */
  val afterAnimate: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the checkbox next to the series&#39; name in the legend is
    * clicked. One parameter, <code>event</code>, is passed to the function. The state
    * of the checkbox is found by <code>event.checked</code>. The checked item is
    * found by <code>event.item</code>. Return <code>false</code> to prevent the default action
    * which is to toggle the select state of the series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-checkboxclick/">Alert checkbox status</a>
    * @since 1.2.0
    */
  val checkboxClick: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the series is clicked. One parameter, <code>event</code>, is passed to
    * the function, containing common event information. Additionally,
    * <code>event.point</code> holds a pointer to the nearest point on the graph.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-click/">Alert click info</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-events-click/">Alert click info</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-events-click/">Display click info in subtitle</a>
    */
  val click: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the series is hidden after chart generation time, either
    * by clicking the legend item or by calling <code>.hide()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-hide/">Alert when the series is hidden by clicking the legend item</a>
    * @since 1.2.0
    */
  val hide: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the legend item belonging to the series is clicked. One
    * parameter, <code>event</code>, is passed to the function. The default action
    * is to toggle the visibility of the series. This can be prevented
    * by returning <code>false</code> or calling <code>event.preventDefault()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-legenditemclick/">Confirm hiding and showing</a>
    */
  val legendItemClick: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the mouse leaves the graph. One parameter, <code>event</code>, is
    * passed to the function, containing common event information. If the
    * <a href="#plotOptions.series">stickyTracking</a> option is true, <code>mouseOut</code>
    * doesn&#39;t happen before the mouse enters another graph or leaves the
    * plot area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-mouseover-sticky/">With sticky tracking by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-mouseover-no-sticky/">Without sticky tracking</a>
    */
  val mouseOut: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the mouse enters the graph. One parameter, <code>event</code>, is
    * passed to the function, containing common event information.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-mouseover-sticky/">With sticky tracking by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-mouseover-no-sticky/">Without sticky tracking</a>
    */
  val mouseOver: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the series is shown after chart generation time, either
    * by clicking the legend item or by calling <code>.show()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-show/">Alert when the series is shown by clicking the legend item.</a>
    * @since 1.2.0
    */
  val show: js.UndefOr[js.Function] = js.undefined
}

object SeriesMappointEvents {
  /**
    * @param afterAnimate <p>Fires after the series has finished its initial animation, or in. case animation is disabled, immediately as the series is displayed.</p>
    * @param checkboxClick <p>Fires when the checkbox next to the series&#39; name in the legend is. clicked. One parameter, <code>event</code>, is passed to the function. The state. of the checkbox is found by <code>event.checked</code>. The checked item is. found by <code>event.item</code>. Return <code>false</code> to prevent the default action. which is to toggle the select state of the series.</p>
    * @param click <p>Fires when the series is clicked. One parameter, <code>event</code>, is passed to. the function, containing common event information. Additionally,. <code>event.point</code> holds a pointer to the nearest point on the graph.</p>
    * @param hide <p>Fires when the series is hidden after chart generation time, either. by clicking the legend item or by calling <code>.hide()</code>.</p>
    * @param legendItemClick <p>Fires when the legend item belonging to the series is clicked. One. parameter, <code>event</code>, is passed to the function. The default action. is to toggle the visibility of the series. This can be prevented. by returning <code>false</code> or calling <code>event.preventDefault()</code>.</p>
    * @param mouseOut <p>Fires when the mouse leaves the graph. One parameter, <code>event</code>, is. passed to the function, containing common event information. If the. <a href="#plotOptions.series">stickyTracking</a> option is true, <code>mouseOut</code>. doesn&#39;t happen before the mouse enters another graph or leaves the. plot area.</p>
    * @param mouseOver <p>Fires when the mouse enters the graph. One parameter, <code>event</code>, is. passed to the function, containing common event information.</p>
    * @param show <p>Fires when the series is shown after chart generation time, either. by clicking the legend item or by calling <code>.show()</code>.</p>
    */
  def apply(afterAnimate: js.UndefOr[js.Function] = js.undefined, checkboxClick: js.UndefOr[js.Function] = js.undefined, click: js.UndefOr[js.Function] = js.undefined, hide: js.UndefOr[js.Function] = js.undefined, legendItemClick: js.UndefOr[js.Function] = js.undefined, mouseOut: js.UndefOr[js.Function] = js.undefined, mouseOver: js.UndefOr[js.Function] = js.undefined, show: js.UndefOr[js.Function] = js.undefined): SeriesMappointEvents = {
    val afterAnimateOuter: js.UndefOr[js.Function] = afterAnimate
    val checkboxClickOuter: js.UndefOr[js.Function] = checkboxClick
    val clickOuter: js.UndefOr[js.Function] = click
    val hideOuter: js.UndefOr[js.Function] = hide
    val legendItemClickOuter: js.UndefOr[js.Function] = legendItemClick
    val mouseOutOuter: js.UndefOr[js.Function] = mouseOut
    val mouseOverOuter: js.UndefOr[js.Function] = mouseOver
    val showOuter: js.UndefOr[js.Function] = show
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMappointEvents {
      override val afterAnimate: js.UndefOr[js.Function] = afterAnimateOuter
      override val checkboxClick: js.UndefOr[js.Function] = checkboxClickOuter
      override val click: js.UndefOr[js.Function] = clickOuter
      override val hide: js.UndefOr[js.Function] = hideOuter
      override val legendItemClick: js.UndefOr[js.Function] = legendItemClickOuter
      override val mouseOut: js.UndefOr[js.Function] = mouseOutOuter
      override val mouseOver: js.UndefOr[js.Function] = mouseOverOuter
      override val show: js.UndefOr[js.Function] = showOuter
    })
  }
}
/**
  * @note JavaScript name: <code>series&lt;map&gt;-point-events</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMapPointEvents extends com.highcharts.HighchartsGenericObject {

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

object SeriesMapPointEvents {
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
  def apply(dragStart: js.UndefOr[js.Function] = js.undefined, drag: js.UndefOr[js.Function] = js.undefined, drop: js.UndefOr[js.Function] = js.undefined, click: js.UndefOr[js.Function] = js.undefined, mouseOut: js.UndefOr[js.Function] = js.undefined, mouseOver: js.UndefOr[js.Function] = js.undefined, remove: js.UndefOr[js.Function] = js.undefined, select: js.UndefOr[js.Function] = js.undefined, unselect: js.UndefOr[js.Function] = js.undefined, update: js.UndefOr[js.Function] = js.undefined): SeriesMapPointEvents = {
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
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMapPointEvents {
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
