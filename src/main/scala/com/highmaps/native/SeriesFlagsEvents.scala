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
  * @note JavaScript name: <code>series&lt;flags&gt;-events</code>
  */
class SeriesFlagsEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Fires after the series has finished its initial animation, or in case
    * animation is disabled, immediately as the series is displayed.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-afteranimate/">Show label after animate</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-afteranimate/">Show label after animate</a>
    * @since 4.0.0
    */
  var afterAnimate: js.Any = js.undefined

  /**
    * <p>Fires when the checkbox next to the series&#39; name in the legend is
    * clicked. One parameter, <code>event</code>, is passed to the function. The state
    * of the checkbox is found by <code>event.checked</code>. The checked item is
    * found by <code>event.item</code>. Return <code>false</code> to prevent the default action
    * which is to toggle the select state of the series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-checkboxclick/">Alert checkbox status</a>
    * @since 1.2.0
    */
  var checkboxClick: js.Any = js.undefined

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
    * <p>Fires when the legend item belonging to the series is clicked. One
    * parameter, <code>event</code>, is passed to the function. The default action
    * is to toggle the visibility of the series. This can be prevented
    * by returning <code>false</code> or calling <code>event.preventDefault()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-legenditemclick/">Confirm hiding and showing</a>
    */
  var legendItemClick: js.Any = js.undefined

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

object SeriesFlagsEvents {
  /**
    * @param afterAnimate <p>Fires after the series has finished its initial animation, or in case. animation is disabled, immediately as the series is displayed.</p>
    * @param checkboxClick <p>Fires when the checkbox next to the series&#39; name in the legend is. clicked. One parameter, <code>event</code>, is passed to the function. The state. of the checkbox is found by <code>event.checked</code>. The checked item is. found by <code>event.item</code>. Return <code>false</code> to prevent the default action. which is to toggle the select state of the series.</p>
    * @param click <p>Fires when the series is clicked. One parameter, <code>event</code>, is passed. to the function, containing common event information. Additionally,. <code>event.point</code> holds a pointer to the nearest point on the graph.</p>
    * @param hide <p>Fires when the series is hidden after chart generation time, either. by clicking the legend item or by calling <code>.hide()</code>.</p>
    * @param legendItemClick <p>Fires when the legend item belonging to the series is clicked. One. parameter, <code>event</code>, is passed to the function. The default action. is to toggle the visibility of the series. This can be prevented. by returning <code>false</code> or calling <code>event.preventDefault()</code>.</p>
    * @param mouseOut <p>Fires when the mouse leaves the graph. One parameter, <code>event</code>, is. passed to the function, containing common event information. If the. <a href="#plotOptions.series">stickyTracking</a> option is true, <code>mouseOut</code>. doesn&#39;t happen before the mouse enters another graph or leaves the. plot area.</p>
    * @param mouseOver <p>Fires when the mouse enters the graph. One parameter, <code>event</code>, is. passed to the function, containing common event information.</p>
    * @param show <p>Fires when the series is shown after chart generation time, either. by clicking the legend item or by calling <code>.show()</code>.</p>
    */
  def apply(afterAnimate: js.UndefOr[js.Any] = js.undefined, checkboxClick: js.UndefOr[js.Any] = js.undefined, click: js.UndefOr[js.Any] = js.undefined, hide: js.UndefOr[js.Any] = js.undefined, legendItemClick: js.UndefOr[js.Any] = js.undefined, mouseOut: js.UndefOr[js.Any] = js.undefined, mouseOver: js.UndefOr[js.Any] = js.undefined, show: js.UndefOr[js.Any] = js.undefined): SeriesFlagsEvents = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesFlagsEvents {
      this.afterAnimate = afterAnimate
      this.checkboxClick = checkboxClick
      this.click = click
      this.hide = hide
      this.legendItemClick = legendItemClick
      this.mouseOut = mouseOut
      this.mouseOver = mouseOver
      this.show = show
    })
  }
}
