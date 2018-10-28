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
class YAxisPlotBands extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>In a gauge chart, this option determines the inner radius of the
    * plot band that stretches along the perimeter. It can be given as
    * a percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>.
    * By default, the inner radius is controlled by the <a href="#yAxis.plotBands.thickness">thickness</a> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-gauge">Gauge plot band</a>
    * @since 2.3
    */
  val innerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>In a gauge chart, this option determines the outer radius of the
    * plot band that stretches along the perimeter. It can be given as
    * a percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-gauge">Gauge plot band</a>
    * @since 2.3
    */
  val outerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>In a gauge chart, this option sets the width of the plot band
    * stretching along the perimeter. It can be given as a percentage
    * string, like <code>&quot;10%&quot;</code>, or as a pixel number, like <code>10</code>. The default
    * value 10 is the same as the default <a href="#yAxis.tickLength">tickLength</a>,
    * thus making the plot band act as a background for the tick markers.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-gauge">Gauge plot band</a>
    * @since 2.3
    */
  val thickness: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>Border color for the plot band. Also requires <code>borderWidth</code> to be set.</p>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Border width for the plot band. Also requires <code>borderColor</code> to be set.</p>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>A custom class name, in addition to the default <code>highcharts-plot-band</code>,
    * to apply to each individual band.</p>
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * <p>The color of the plot band.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/">Color band</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotbands/">Plot band on Y axis</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>An object defining mouse events for the plot band. Supported properties
    * are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-events/">Mouse events demonstrated</a>
    * @since 1.2
    */
  val events: js.Any = js.undefined

  /**
    * <p>The start position of the plot band in axis units.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/">Datetime axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-from/">Categorized axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotbands/">Plot band on Y axis</a>
    */
  val from: js.UndefOr[Double] = js.undefined

  /**
    * <p>An id used for identifying the plot band in Axis.removePlotBand.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-id/">Remove plot band by id</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-id/">Remove plot band by id</a>
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * <p>The end position of the plot band in axis units.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/">Datetime axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-from/">Categorized axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotbands/">Plot band on Y axis</a>
    */
  val to: js.UndefOr[Double] = js.undefined

  /**
    * <p>The z index of the plot band within the chart, relative to other
    * elements. Using the same z index as another element may give
    * unpredictable results, as the last rendered element will be on top.
    * Values from 0 to 20 make sense.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/">Behind plot lines by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-zindex/">Above plot lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-zindex-above-series/">Above plot lines and series</a>
    * @since 1.2
    */
  val zIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>Text labels for the plot bands</p>
    */
  val label: js.Any = js.undefined
}

object YAxisPlotBands {
  /**
    * @param innerRadius <p>In a gauge chart, this option determines the inner radius of the. plot band that stretches along the perimeter. It can be given as. a percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>.. By default, the inner radius is controlled by the <a href="#yAxis.plotBands.thickness">thickness</a> option.</p>
    * @param outerRadius <p>In a gauge chart, this option determines the outer radius of the. plot band that stretches along the perimeter. It can be given as. a percentage string, like <code>&quot;100%&quot;</code>, or as a pixel number, like <code>100</code>.</p>
    * @param thickness <p>In a gauge chart, this option sets the width of the plot band. stretching along the perimeter. It can be given as a percentage. string, like <code>&quot;10%&quot;</code>, or as a pixel number, like <code>10</code>. The default. value 10 is the same as the default <a href="#yAxis.tickLength">tickLength</a>,. thus making the plot band act as a background for the tick markers.</p>
    * @param borderColor <p>Border color for the plot band. Also requires <code>borderWidth</code> to be set.</p>
    * @param borderWidth <p>Border width for the plot band. Also requires <code>borderColor</code> to be set.</p>
    * @param className <p>A custom class name, in addition to the default <code>highcharts-plot-band</code>,. to apply to each individual band.</p>
    * @param color <p>The color of the plot band.</p>
    * @param events <p>An object defining mouse events for the plot band. Supported properties. are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.</p>
    * @param from <p>The start position of the plot band in axis units.</p>
    * @param id <p>An id used for identifying the plot band in Axis.removePlotBand.</p>
    * @param to <p>The end position of the plot band in axis units.</p>
    * @param zIndex <p>The z index of the plot band within the chart, relative to other. elements. Using the same z index as another element may give. unpredictable results, as the last rendered element will be on top.. Values from 0 to 20 make sense.</p>
    * @param label <p>Text labels for the plot bands</p>
    */
  def apply(innerRadius: js.UndefOr[Double | String] = js.undefined, outerRadius: js.UndefOr[Double | String] = js.undefined, thickness: js.UndefOr[Double | String] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, from: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, to: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, label: js.UndefOr[js.Any] = js.undefined): YAxisPlotBands = {
    val innerRadiusOuter: js.UndefOr[Double | String] = innerRadius
    val outerRadiusOuter: js.UndefOr[Double | String] = outerRadius
    val thicknessOuter: js.UndefOr[Double | String] = thickness
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val eventsOuter: js.Any = events
    val fromOuter: js.UndefOr[Double] = from
    val idOuter: js.UndefOr[String] = id
    val toOuter: js.UndefOr[Double] = to
    val zIndexOuter: js.UndefOr[Double] = zIndex
    val labelOuter: js.Any = label
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisPlotBands {
      override val innerRadius: js.UndefOr[Double | String] = innerRadiusOuter
      override val outerRadius: js.UndefOr[Double | String] = outerRadiusOuter
      override val thickness: js.UndefOr[Double | String] = thicknessOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val events: js.Any = eventsOuter
      override val from: js.UndefOr[Double] = fromOuter
      override val id: js.UndefOr[String] = idOuter
      override val to: js.UndefOr[Double] = toOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
      override val label: js.Any = labelOuter
    })
  }
}
