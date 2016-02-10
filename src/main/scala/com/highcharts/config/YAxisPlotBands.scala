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
  * @note JavaScript name: <code>yAxis-plotBands</code>
  */
@js.annotation.ScalaJSDefined
class YAxisPlotBands extends js.Object {

  /**
    * Border color for the plot band. Also requires <code>borderWidth</code> to be set.
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Border width for the plot band.  Also requires <code>borderColor</code> to be set.
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * The color of the plot band.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-color/" target="_blank">Color band</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * An object defining mouse events for the plot band. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-events/" target="_blank">Mouse events demonstrated</a>
    * @since 1.2
    */
  val events: js.UndefOr[js.Object] = js.undefined

  /**
    * The start position of the plot band in axis units.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-color/" target="_blank">Datetime axis</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-from/" target="_blank">categorized axis</a>,
    */
  val from: js.UndefOr[Double] = js.undefined

  /**
    * An id used for identifying the plot band in Axis.removePlotBand.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-id/" target="_blank">Remove plot band by id</a>
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * In a gauge chart, this option determines the inner radius of the plot band that stretches along the perimeter. It can be given as a percentage string, like <code>"100%"</code>, or as a pixel number, like <code>100</code>. By default, the inner radius is controlled by the <a href="#yAxis.plotBands.thickness">thickness</a> option.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-gauge" target="_blank">Gauge plot band</a>
    * @since 2.3
    */
  val innerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * Text labels for the plot bands
    */
  val label: js.UndefOr[CleanJsObject[YAxisPlotBandsLabel]] = js.undefined

  /**
    * In a gauge chart, this option determines the outer radius of the plot band that stretches along the perimeter. It can be given as a percentage string, like <code>"100%"</code>, or as a pixel number, like <code>100</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-gauge" target="_blank">Gauge plot band</a>
    * @since 2.3
    */
  val outerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * In a gauge chart, this option sets the width of the plot band stretching along the perimeter. It can be given as a percentage string, like <code>"10%"</code>, or as a pixel number, like <code>10</code>. The default value 10 is the same as the default <a href="#yAxis.tickLength">tickLength</a>, thus making the plot band act as a background for the tick markers. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-gauge" target="_blank">Gauge plot band</a>
    * @since 2.3
    */
  val thickness: js.UndefOr[Double | String] = js.undefined

  /**
    * The end position of the plot band in axis units.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-color/" target="_blank">Datetime axis</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-from/" target="_blank">categorized axis</a>,
    */
  val to: js.UndefOr[Double] = js.undefined

  /**
    * The z index of the plot band within the chart, relative to other elements. Using the same z index as another element may give unpredictable results, as the last rendered element will be on top. Values from 0 to 20 make sense.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-color/" target="_blank">Behind plot lines by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-zindex/" target="_blank">above plot lines</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-zindex-above-series/" target="_blank">above plot lines and series</a>.
    * @since 1.2
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object YAxisPlotBands {
  /**
    * @param borderColor Border color for the plot band. Also requires <code>borderWidth</code> to be set.
    * @param borderWidth Border width for the plot band.  Also requires <code>borderColor</code> to be set.
    * @param color The color of the plot band.
    * @param events An object defining mouse events for the plot band. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
    * @param from The start position of the plot band in axis units.
    * @param id An id used for identifying the plot band in Axis.removePlotBand.
    * @param innerRadius In a gauge chart, this option determines the inner radius of the plot band that stretches along the perimeter. It can be given as a percentage string, like <code>"100%"</code>, or as a pixel number, like <code>100</code>. By default, the inner radius is controlled by the <a href="#yAxis.plotBands.thickness">thickness</a> option.
    * @param label Text labels for the plot bands
    * @param outerRadius In a gauge chart, this option determines the outer radius of the plot band that stretches along the perimeter. It can be given as a percentage string, like <code>"100%"</code>, or as a pixel number, like <code>100</code>.
    * @param thickness In a gauge chart, this option sets the width of the plot band stretching along the perimeter. It can be given as a percentage string, like <code>"10%"</code>, or as a pixel number, like <code>10</code>. The default value 10 is the same as the default <a href="#yAxis.tickLength">tickLength</a>, thus making the plot band act as a background for the tick markers. 
    * @param to The end position of the plot band in axis units.
    * @param zIndex The z index of the plot band within the chart, relative to other elements. Using the same z index as another element may give unpredictable results, as the last rendered element will be on top. Values from 0 to 20 make sense.
    */
  def apply(borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, events: js.UndefOr[js.Object] = js.undefined, from: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, innerRadius: js.UndefOr[Double | String] = js.undefined, label: js.UndefOr[CleanJsObject[YAxisPlotBandsLabel]] = js.undefined, outerRadius: js.UndefOr[Double | String] = js.undefined, thickness: js.UndefOr[Double | String] = js.undefined, to: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): YAxisPlotBands = {
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val colorOuter: js.UndefOr[String | js.Object] = color
    val eventsOuter: js.UndefOr[js.Object] = events
    val fromOuter: js.UndefOr[Double] = from
    val idOuter: js.UndefOr[String] = id
    val innerRadiusOuter: js.UndefOr[Double | String] = innerRadius
    val labelOuter: js.UndefOr[CleanJsObject[YAxisPlotBandsLabel]] = label
    val outerRadiusOuter: js.UndefOr[Double | String] = outerRadius
    val thicknessOuter: js.UndefOr[Double | String] = thickness
    val toOuter: js.UndefOr[Double] = to
    val zIndexOuter: js.UndefOr[Double] = zIndex
    new YAxisPlotBands {
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val events: js.UndefOr[js.Object] = eventsOuter
      override val from: js.UndefOr[Double] = fromOuter
      override val id: js.UndefOr[String] = idOuter
      override val innerRadius: js.UndefOr[Double | String] = innerRadiusOuter
      override val label: js.UndefOr[CleanJsObject[YAxisPlotBandsLabel]] = labelOuter
      override val outerRadius: js.UndefOr[Double | String] = outerRadiusOuter
      override val thickness: js.UndefOr[Double | String] = thicknessOuter
      override val to: js.UndefOr[Double] = toOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    }
  }
}
