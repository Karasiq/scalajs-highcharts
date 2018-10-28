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
  * @note JavaScript name: <code>plotOptions-treemap-events</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsTreemapEvents extends com.highcharts.HighchartsGenericObject {

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

object PlotOptionsTreemapEvents {
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
  def apply(afterAnimate: js.UndefOr[js.Function] = js.undefined, checkboxClick: js.UndefOr[js.Function] = js.undefined, click: js.UndefOr[js.Function] = js.undefined, hide: js.UndefOr[js.Function] = js.undefined, legendItemClick: js.UndefOr[js.Function] = js.undefined, mouseOut: js.UndefOr[js.Function] = js.undefined, mouseOver: js.UndefOr[js.Function] = js.undefined, show: js.UndefOr[js.Function] = js.undefined): PlotOptionsTreemapEvents = {
    val afterAnimateOuter: js.UndefOr[js.Function] = afterAnimate
    val checkboxClickOuter: js.UndefOr[js.Function] = checkboxClick
    val clickOuter: js.UndefOr[js.Function] = click
    val hideOuter: js.UndefOr[js.Function] = hide
    val legendItemClickOuter: js.UndefOr[js.Function] = legendItemClick
    val mouseOutOuter: js.UndefOr[js.Function] = mouseOut
    val mouseOverOuter: js.UndefOr[js.Function] = mouseOver
    val showOuter: js.UndefOr[js.Function] = show
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTreemapEvents {
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
