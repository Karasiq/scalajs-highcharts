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
  * @note JavaScript name: <code>navigator-xAxis-plotBands</code>
  */
class NavigatorXAxisPlotBands extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Flag to decide if plotBand should be rendered across all panes.</p>
    * @since 7.1.2
    */
  var acrossPanes: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Border color for the plot band. Also requires <code>borderWidth</code> to be set.</p>
    */
  var borderColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Border width for the plot band. Also requires <code>borderColor</code> to be set.</p>
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>A custom class name, in addition to the default <code>highcharts-plot-band</code>,
    * to apply to each individual band.</p>
    * @since 5.0.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>The color of the plot band.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/">Color band</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotbands/">Plot band on Y axis</a>
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>An object defining mouse events for the plot band. Supported properties
    * are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-events/">Mouse events demonstrated</a>
    * @since 1.2.0
    */
  var events: js.Any = js.undefined

  /**
    * <p>The start position of the plot band in axis units.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/">Datetime axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-from/">Categorized axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotbands/">Plot band on Y axis</a>
    */
  var from: js.UndefOr[Double] = js.undefined

  /**
    * <p>An id used for identifying the plot band in Axis.removePlotBand.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-id/">Remove plot band by id</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-id/">Remove plot band by id</a>
    */
  var id: js.UndefOr[String] = js.undefined

  /**
    * <p>Text labels for the plot bands</p>
    */
  var label: js.Any = js.undefined

  /**
    * <p>The end position of the plot band in axis units.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/">Datetime axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-from/">Categorized axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotbands/">Plot band on Y axis</a>
    */
  var to: js.UndefOr[Double] = js.undefined

  /**
    * <p>The z index of the plot band within the chart, relative to other
    * elements. Using the same z index as another element may give
    * unpredictable results, as the last rendered element will be on top.
    * Values from 0 to 20 make sense.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/">Behind plot lines by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-zindex/">Above plot lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-zindex-above-series/">Above plot lines and series</a>
    * @since 1.2.0
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object NavigatorXAxisPlotBands {
  /**
    * @param acrossPanes <p>Flag to decide if plotBand should be rendered across all panes.</p>
    * @param borderColor <p>Border color for the plot band. Also requires <code>borderWidth</code> to be set.</p>
    * @param borderWidth <p>Border width for the plot band. Also requires <code>borderColor</code> to be set.</p>
    * @param className <p>A custom class name, in addition to the default <code>highcharts-plot-band</code>,. to apply to each individual band.</p>
    * @param color <p>The color of the plot band.</p>
    * @param events <p>An object defining mouse events for the plot band. Supported properties. are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.</p>
    * @param from <p>The start position of the plot band in axis units.</p>
    * @param id <p>An id used for identifying the plot band in Axis.removePlotBand.</p>
    * @param label <p>Text labels for the plot bands</p>
    * @param to <p>The end position of the plot band in axis units.</p>
    * @param zIndex <p>The z index of the plot band within the chart, relative to other. elements. Using the same z index as another element may give. unpredictable results, as the last rendered element will be on top.. Values from 0 to 20 make sense.</p>
    */
  def apply(acrossPanes: js.UndefOr[Boolean] = js.undefined, borderColor: js.UndefOr[String] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, from: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, label: js.UndefOr[js.Any] = js.undefined, to: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): NavigatorXAxisPlotBands = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorXAxisPlotBands {
      this.acrossPanes = acrossPanes
      this.borderColor = borderColor
      this.borderWidth = borderWidth
      this.className = className
      this.color = color
      this.events = events
      this.from = from
      this.id = id
      this.label = label
      this.to = to
      this.zIndex = zIndex
    })
  }
}
