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
  * @note JavaScript name: <code>series&lt;treemap&gt;-data-events</code>
  */
@js.annotation.ScalaJSDefined
class SeriesTreemapDataEvents extends js.Object {

  /**
    * <p></p>Fires when a point is clicked. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.<p></p> <p>If the <code>series.allowPointSelect</code> option is true, the default action for the point's click event is to toggle the point's select state. Returning <code>false</code> cancels this action.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-point-events-click/" target="_blank">Click marker to alert values</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-point-events-click-column/" target="_blank">click column</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-point-events-click-url/" target="_blank">go to URL</a>
    */
  val click: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the mouse leaves the area close to the point. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/" target="_blank">Show values in the chart's corner on mouse over</a>
    */
  val mouseOut: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the mouse enters the area close to the point. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/" target="_blank">Show values in the chart's corner on mouse over</a>
    */
  val mouseOver: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the point is removed using the <code>.remove()</code> method. One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-point-events-remove/" target="_blank">Remove point and confirm</a>
    * @since 1.2.0
    */
  val remove: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the point is selected either programmatically or following a click on the point. One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-point-events-select/" target="_blank">Report the last selected point</a>
    * @since 1.2.0
    */
  val select: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the point is unselected either programmatically or following a click on the point. One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-point-events-unselect/" target="_blank">Report the last unselected point</a>
    * @since 1.2.0
    */
  val unselect: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the point is updated programmatically through the <code>.update()</code> method. One parameter, <code>event</code>, is passed to the function. The  new point options can be accessed through <code>event.options</code>. Returning <code>false</code> cancels the operation.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-point-events-update/" target="_blank">Confirm point updating</a>
    * @since 1.2.0
    */
  val update: js.UndefOr[js.Function] = js.undefined
}

object SeriesTreemapDataEvents {
  /**
    * @param click <p></p>Fires when a point is clicked. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.<p></p> <p>If the <code>series.allowPointSelect</code> option is true, the default action for the point's click event is to toggle the point's select state. Returning <code>false</code> cancels this action.</p>
    * @param mouseOut Fires when the mouse leaves the area close to the point. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    * @param mouseOver Fires when the mouse enters the area close to the point. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    * @param remove Fires when the point is removed using the <code>.remove()</code> method. One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    * @param select Fires when the point is selected either programmatically or following a click on the point. One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    * @param unselect Fires when the point is unselected either programmatically or following a click on the point. One parameter, <code>event</code>, is passed to the function. Returning <code>false</code> cancels the operation.
    * @param update Fires when the point is updated programmatically through the <code>.update()</code> method. One parameter, <code>event</code>, is passed to the function. The  new point options can be accessed through <code>event.options</code>. Returning <code>false</code> cancels the operation.
    */
  def apply(click: js.UndefOr[js.Function] = js.undefined, mouseOut: js.UndefOr[js.Function] = js.undefined, mouseOver: js.UndefOr[js.Function] = js.undefined, remove: js.UndefOr[js.Function] = js.undefined, select: js.UndefOr[js.Function] = js.undefined, unselect: js.UndefOr[js.Function] = js.undefined, update: js.UndefOr[js.Function] = js.undefined): SeriesTreemapDataEvents = {
    val clickOuter: js.UndefOr[js.Function] = click
    val mouseOutOuter: js.UndefOr[js.Function] = mouseOut
    val mouseOverOuter: js.UndefOr[js.Function] = mouseOver
    val removeOuter: js.UndefOr[js.Function] = remove
    val selectOuter: js.UndefOr[js.Function] = select
    val unselectOuter: js.UndefOr[js.Function] = unselect
    val updateOuter: js.UndefOr[js.Function] = update
    new SeriesTreemapDataEvents {
      override val click: js.UndefOr[js.Function] = clickOuter
      override val mouseOut: js.UndefOr[js.Function] = mouseOutOuter
      override val mouseOver: js.UndefOr[js.Function] = mouseOverOuter
      override val remove: js.UndefOr[js.Function] = removeOuter
      override val select: js.UndefOr[js.Function] = selectOuter
      override val unselect: js.UndefOr[js.Function] = unselectOuter
      override val update: js.UndefOr[js.Function] = updateOuter
    }
  }
}
