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
  * @note JavaScript name: <code>plotOptions-pie-events</code>
  */
class PlotOptionsPieEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Fires when the checkbox next to the point name in the legend is
    * clicked. One parameter, event, is passed to the function. The state
    * of the checkbox is found by event.checked. The checked item is found
    * by event.item. Return false to prevent the default action which is to
    * toggle the select state of the series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-checkboxclick/">Alert checkbox status</a>
    * @since 1.2.0
    */
  var checkboxClick: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires after the series has finished its initial animation, or in case
    * animation is disabled, immediately as the series is displayed.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-afteranimate/">Show label after animate</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-afteranimate/">Show label after animate</a>
    * @since 4.0.0
    */
  var afterAnimate: js.Any = js.undefined

  /**
    * <p>Fires when the series is clicked. One parameter, <code>event</code>, is passed
    * to the function, containing common event information. Additionally,
    * <code>event.point</code> holds a pointer to the nearest point on the graph.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-click/">Alert click info</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-events-click/">Alert click info</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-events-click/">Display click info in subtitle</a>
    */
  var click: js.Any = js.undefined

  /**
    * <p>Fires when the series is hidden after chart generation time, either
    * by clicking the legend item or by calling <code>.hide()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-hide/">Alert when the series is hidden by clicking the legend item</a>
    * @since 1.2.0
    */
  var hide: js.Any = js.undefined

  /**
    * <p>Fires when the mouse leaves the graph. One parameter, <code>event</code>, is
    * passed to the function, containing common event information. If the
    * <a href="#plotOptions.series">stickyTracking</a> option is true, <code>mouseOut</code>
    * doesn&#39;t happen before the mouse enters another graph or leaves the
    * plot area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-mouseover-sticky/">With sticky tracking by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-mouseover-no-sticky/">Without sticky tracking</a>
    */
  var mouseOut: js.Any = js.undefined

  /**
    * <p>Fires when the mouse enters the graph. One parameter, <code>event</code>, is
    * passed to the function, containing common event information.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-mouseover-sticky/">With sticky tracking by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-mouseover-no-sticky/">Without sticky tracking</a>
    */
  var mouseOver: js.Any = js.undefined

  /**
    * <p>Fires when the series is shown after chart generation time, either
    * by clicking the legend item or by calling <code>.show()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-show/">Alert when the series is shown by clicking the legend item.</a>
    * @since 1.2.0
    */
  var show: js.Any = js.undefined
}

object PlotOptionsPieEvents {
  /**
    * @param checkboxClick <p>Fires when the checkbox next to the point name in the legend is. clicked. One parameter, event, is passed to the function. The state. of the checkbox is found by event.checked. The checked item is found. by event.item. Return false to prevent the default action which is to. toggle the select state of the series.</p>
    * @param afterAnimate <p>Fires after the series has finished its initial animation, or in case. animation is disabled, immediately as the series is displayed.</p>
    * @param click <p>Fires when the series is clicked. One parameter, <code>event</code>, is passed. to the function, containing common event information. Additionally,. <code>event.point</code> holds a pointer to the nearest point on the graph.</p>
    * @param hide <p>Fires when the series is hidden after chart generation time, either. by clicking the legend item or by calling <code>.hide()</code>.</p>
    * @param mouseOut <p>Fires when the mouse leaves the graph. One parameter, <code>event</code>, is. passed to the function, containing common event information. If the. <a href="#plotOptions.series">stickyTracking</a> option is true, <code>mouseOut</code>. doesn&#39;t happen before the mouse enters another graph or leaves the. plot area.</p>
    * @param mouseOver <p>Fires when the mouse enters the graph. One parameter, <code>event</code>, is. passed to the function, containing common event information.</p>
    * @param show <p>Fires when the series is shown after chart generation time, either. by clicking the legend item or by calling <code>.show()</code>.</p>
    */
  def apply(checkboxClick: js.UndefOr[js.Function] = js.undefined, afterAnimate: js.UndefOr[js.Any] = js.undefined, click: js.UndefOr[js.Any] = js.undefined, hide: js.UndefOr[js.Any] = js.undefined, mouseOut: js.UndefOr[js.Any] = js.undefined, mouseOver: js.UndefOr[js.Any] = js.undefined, show: js.UndefOr[js.Any] = js.undefined): PlotOptionsPieEvents = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPieEvents {
      this.checkboxClick = checkboxClick
      this.afterAnimate = afterAnimate
      this.click = click
      this.hide = hide
      this.mouseOut = mouseOut
      this.mouseOver = mouseOver
      this.show = show
    })
  }
}
