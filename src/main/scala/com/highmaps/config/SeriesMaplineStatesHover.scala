/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;mapline&gt;-states-hover</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMaplineStatesHover extends com.highcharts.HighchartsGenericObject {

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
    * <p>The relative brightness of the point when hovered, relative to
    * the normal point color.</p>
    */
  val brightness: js.UndefOr[Double] = js.undefined

  /**
    * <p>Animation setting for hovering the graph in line-type series.</p>
    * @since 5.0.8
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined

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
  val marker: js.UndefOr[CleanJsObject[SeriesMaplineStatesHoverMarker]] = js.undefined

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
    * <p>Pixel width of the graph line. By default this property is
    * undefined, and the <code>lineWidthPlus</code> property dictates how much
    * to increase the linewidth from normal state.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidth/">5px line on hover</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the shape in this state</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-states-hover/">Hover options</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border color of the point in this state.</p>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border width of the point in this state</p>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined
}

object SeriesMaplineStatesHover {
  /**
    * @param halo <p>Options for the halo appearing around the hovered point in line-. type series as well as outside the hovered slice in pie charts.. By default the halo is filled by the current point or series. color with an opacity of 0.25. The halo can be disabled by. setting the <code>halo</code> option to <code>false</code>.</p>. <p>In styled mode, the halo is styled with the <code>.highcharts-halo</code>. class, with colors inherited from <code>.highcharts-color-{n}</code>.</p>
    * @param brightness <p>The relative brightness of the point when hovered, relative to. the normal point color.</p>
    * @param animation <p>Animation setting for hovering the graph in line-type series.</p>
    * @param lineWidthPlus <p>The additional line width for the graph of a hovered series.</p>
    * @param marker <p>In Highcharts 1.0, the appearance of all markers belonging to the. hovered series. For settings on the hover state of the individual. point, see. <a href="#plotOptions.series.marker.states.hover">marker.states.hover</a>.</p>
    * @param enabled <p>Enable separate styles for the hovered series to visualize that. the user hovers either the series itself or the legend. .</p>
    * @param lineWidth <p>Pixel width of the graph line. By default this property is. undefined, and the <code>lineWidthPlus</code> property dictates how much. to increase the linewidth from normal state.</p>
    * @param color <p>The color of the shape in this state</p>
    * @param borderColor <p>The border color of the point in this state.</p>
    * @param borderWidth <p>The border width of the point in this state</p>
    */
  def apply(halo: js.UndefOr[js.Any] = js.undefined, brightness: js.UndefOr[Double] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, lineWidthPlus: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[CleanJsObject[SeriesMaplineStatesHoverMarker]] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined): SeriesMaplineStatesHover = {
    val haloOuter: js.Any = halo
    val brightnessOuter: js.UndefOr[Double] = brightness
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    val lineWidthPlusOuter: js.UndefOr[Double] = lineWidthPlus
    val markerOuter: js.UndefOr[CleanJsObject[SeriesMaplineStatesHoverMarker]] = marker
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val colorOuter: js.UndefOr[String | js.Object] = color
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMaplineStatesHover {
      override val halo: js.Any = haloOuter
      override val brightness: js.UndefOr[Double] = brightnessOuter
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
      override val lineWidthPlus: js.UndefOr[Double] = lineWidthPlusOuter
      override val marker: js.UndefOr[CleanJsObject[SeriesMaplineStatesHoverMarker]] = markerOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
    })
  }
}
