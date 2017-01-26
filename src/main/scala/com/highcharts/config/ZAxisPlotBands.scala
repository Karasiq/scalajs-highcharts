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
  * @note JavaScript name: <code>zAxis-plotBands</code>
  */
@js.annotation.ScalaJSDefined
class ZAxisPlotBands extends js.Object {

  /**
    * Border color for the plot band. Also requires <code>borderWidth</code> to be set.
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Border width for the plot band.  Also requires <code>borderColor</code> to be set.
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * A custom class name, in addition to the default <code>highcharts-plot-band</code>, to apply to each individual band.
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * The color of the plot band.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/" target="_blank">Color band</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * An object defining mouse events for the plot band. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-events/" target="_blank">Mouse events demonstrated</a>
    * @since 1.2
    */
  val events: js.UndefOr[js.Object] = js.undefined

  /**
    * The start position of the plot band in axis units.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/" target="_blank">Datetime axis</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-from/" target="_blank">categorized axis</a>,
    */
  val from: js.UndefOr[Double] = js.undefined

  /**
    * An id used for identifying the plot band in Axis.removePlotBand.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-id/" target="_blank">Remove plot band by id</a>
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * Text labels for the plot bands
    */
  val label: js.UndefOr[CleanJsObject[ZAxisPlotBandsLabel]] = js.undefined

  /**
    * The end position of the plot band in axis units.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/" target="_blank">Datetime axis</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-from/" target="_blank">categorized axis</a>,
    */
  val to: js.UndefOr[Double] = js.undefined

  /**
    * The z index of the plot band within the chart, relative to other elements. Using the same z index as another element may give unpredictable results, as the last rendered element will be on top. Values from 0 to 20 make sense.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/" target="_blank">Behind plot lines by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-zindex/" target="_blank">above plot lines</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-zindex-above-series/" target="_blank">above plot lines and series</a>.
    * @since 1.2
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object ZAxisPlotBands {
  /**
    * @param borderColor Border color for the plot band. Also requires <code>borderWidth</code> to be set.
    * @param borderWidth Border width for the plot band.  Also requires <code>borderColor</code> to be set.
    * @param className A custom class name, in addition to the default <code>highcharts-plot-band</code>, to apply to each individual band.
    * @param color The color of the plot band.
    * @param events An object defining mouse events for the plot band. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
    * @param from The start position of the plot band in axis units.
    * @param id An id used for identifying the plot band in Axis.removePlotBand.
    * @param label Text labels for the plot bands
    * @param to The end position of the plot band in axis units.
    * @param zIndex The z index of the plot band within the chart, relative to other elements. Using the same z index as another element may give unpredictable results, as the last rendered element will be on top. Values from 0 to 20 make sense.
    */
  def apply(borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, events: js.UndefOr[js.Object] = js.undefined, from: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, label: js.UndefOr[CleanJsObject[ZAxisPlotBandsLabel]] = js.undefined, to: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): ZAxisPlotBands = {
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val eventsOuter: js.UndefOr[js.Object] = events
    val fromOuter: js.UndefOr[Double] = from
    val idOuter: js.UndefOr[String] = id
    val labelOuter: js.UndefOr[CleanJsObject[ZAxisPlotBandsLabel]] = label
    val toOuter: js.UndefOr[Double] = to
    val zIndexOuter: js.UndefOr[Double] = zIndex
    new ZAxisPlotBands {
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val events: js.UndefOr[js.Object] = eventsOuter
      override val from: js.UndefOr[Double] = fromOuter
      override val id: js.UndefOr[String] = idOuter
      override val label: js.UndefOr[CleanJsObject[ZAxisPlotBandsLabel]] = labelOuter
      override val to: js.UndefOr[Double] = toOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    }
  }
}
