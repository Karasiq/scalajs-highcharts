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
  * @note JavaScript name: <code>series&lt;xrange&gt;-states-hover</code>
  */
@js.annotation.ScalaJSDefined
class SeriesXrangeStatesHover extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>How much to brighten the point on interaction. Requires the main
    * color to be defined in hex or rgb(a) format.</p>
    * <p>In styled mode, the hover brightening is by default replaced
    * with a fill-opacity set in the <code>.highcharts-point:hover</code> rule.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-states-hover-brightness/">Brighten by 0.5</a>
    */
  val brightness: js.UndefOr[Double] = js.undefined

  /**
    * <p>A specific border color for the hovered point. Defaults to
    * inherit the normal state border color.</p>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>A specific color for the hovered point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-states-hover/">Hover options</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Animation setting for hovering the graph in line-type series.</p>
    * @since 5.0.8
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Enable separate styles for the hovered series to visualize that
    * the user hovers either the series itself or the legend. .</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled/">Line</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-column/">Column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-pie/">Pie</a>
    * @since 1.2
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The border width of the point in this state</p>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The additional line width for the graph of a hovered series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/">5 pixels wider</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/">5 pixels wider</a>
    * @since 4.0.3
    */
  val lineWidthPlus: js.UndefOr[Double] = js.undefined

  /**
    * <p>In Highcharts 1.0, the appearance of all markers belonging to the
    * hovered series. For settings on the hover state of the individual
    * point, see
    * <a href="#plotOptions.series.marker.states.hover">marker.states.hover</a>.</p>
    */
  val marker: js.UndefOr[CleanJsObject[SeriesXrangeStatesHoverMarker]] = js.undefined

  /**
    * <p>Options for the halo appearing around the hovered point in line-
    * type series as well as outside the hovered slice in pie charts.
    * By default the halo is filled by the current point or series
    * color with an opacity of 0.25. The halo can be disabled by
    * setting the <code>halo</code> option to <code>false</code>.</p>
    * <p>In styled mode, the halo is styled with the <code>.highcharts-halo</code>
    * class, with colors inherited from <code>.highcharts-color-{n}</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/halo/">Halo options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/halo/">Halo options</a>
    * @since 4.0
    */
  val halo: js.Any = js.undefined

  /**
    * <p>Pixel width of the graph line. By default this property is
    * undefined, and the <code>lineWidthPlus</code> property dictates how much
    * to increase the linewidth from normal state.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidth/">5px line on hover</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined
}

object SeriesXrangeStatesHover {
  /**
    * @param brightness <p>How much to brighten the point on interaction. Requires the main. color to be defined in hex or rgb(a) format.</p>. <p>In styled mode, the hover brightening is by default replaced. with a fill-opacity set in the <code>.highcharts-point:hover</code> rule.</p>
    * @param borderColor <p>A specific border color for the hovered point. Defaults to. inherit the normal state border color.</p>
    * @param color <p>A specific color for the hovered point.</p>
    * @param animation <p>Animation setting for hovering the graph in line-type series.</p>
    * @param enabled <p>Enable separate styles for the hovered series to visualize that. the user hovers either the series itself or the legend. .</p>
    * @param borderWidth <p>The border width of the point in this state</p>
    * @param lineWidthPlus <p>The additional line width for the graph of a hovered series.</p>
    * @param marker <p>In Highcharts 1.0, the appearance of all markers belonging to the. hovered series. For settings on the hover state of the individual. point, see. <a href="#plotOptions.series.marker.states.hover">marker.states.hover</a>.</p>
    * @param halo <p>Options for the halo appearing around the hovered point in line-. type series as well as outside the hovered slice in pie charts.. By default the halo is filled by the current point or series. color with an opacity of 0.25. The halo can be disabled by. setting the <code>halo</code> option to <code>false</code>.</p>. <p>In styled mode, the halo is styled with the <code>.highcharts-halo</code>. class, with colors inherited from <code>.highcharts-color-{n}</code>.</p>
    * @param lineWidth <p>Pixel width of the graph line. By default this property is. undefined, and the <code>lineWidthPlus</code> property dictates how much. to increase the linewidth from normal state.</p>
    */
  def apply(brightness: js.UndefOr[Double] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, lineWidthPlus: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[CleanJsObject[SeriesXrangeStatesHoverMarker]] = js.undefined, halo: js.UndefOr[js.Any] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined): SeriesXrangeStatesHover = {
    val brightnessOuter: js.UndefOr[Double] = brightness
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val colorOuter: js.UndefOr[String | js.Object] = color
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val lineWidthPlusOuter: js.UndefOr[Double] = lineWidthPlus
    val markerOuter: js.UndefOr[CleanJsObject[SeriesXrangeStatesHoverMarker]] = marker
    val haloOuter: js.Any = halo
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesXrangeStatesHover {
      override val brightness: js.UndefOr[Double] = brightnessOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val lineWidthPlus: js.UndefOr[Double] = lineWidthPlusOuter
      override val marker: js.UndefOr[CleanJsObject[SeriesXrangeStatesHoverMarker]] = markerOuter
      override val halo: js.Any = haloOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
    })
  }
}
