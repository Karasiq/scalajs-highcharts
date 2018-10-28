/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;treemap&gt;-states-hover</code>
  */
@js.annotation.ScalaJSDefined
class SeriesTreemapStatesHover extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The border color for the hovered state.</p>
    */
  val borderColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Brightness for the hovered point. Defaults to 0 if the heatmap
    * series is loaded first, otherwise 0.1.</p>
    */
  val brightness: js.UndefOr[Double] = js.undefined

  /**
    * <p>The opacity of a point in treemap. When a point has children,
    * the visibility of the children is determined by the opacity.</p>
    * @since 4.2.4
    */
  val opacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>The shadow option for hovered state.</p>
    */
  val shadow: js.UndefOr[Boolean] = js.undefined

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
  val marker: js.UndefOr[CleanJsObject[SeriesTreemapStatesHoverMarker]] = js.undefined

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
    * <p>The border width of the point in this state</p>
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

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
}

object SeriesTreemapStatesHover {
  /**
    * @param borderColor <p>The border color for the hovered state.</p>
    * @param brightness <p>Brightness for the hovered point. Defaults to 0 if the heatmap. series is loaded first, otherwise 0.1.</p>
    * @param opacity <p>The opacity of a point in treemap. When a point has children,. the visibility of the children is determined by the opacity.</p>
    * @param shadow <p>The shadow option for hovered state.</p>
    * @param animation <p>Animation setting for hovering the graph in line-type series.</p>
    * @param lineWidthPlus <p>The additional line width for the graph of a hovered series.</p>
    * @param marker <p>In Highcharts 1.0, the appearance of all markers belonging to the. hovered series. For settings on the hover state of the individual. point, see. <a href="#plotOptions.series.marker.states.hover">marker.states.hover</a>.</p>
    * @param enabled <p>Enable separate styles for the hovered series to visualize that. the user hovers either the series itself or the legend. .</p>
    * @param lineWidth <p>Pixel width of the graph line. By default this property is. undefined, and the <code>lineWidthPlus</code> property dictates how much. to increase the linewidth from normal state.</p>
    * @param color <p>The color of the shape in this state</p>
    * @param borderWidth <p>The border width of the point in this state</p>
    * @param halo <p>Options for the halo appearing around the hovered point in line-. type series as well as outside the hovered slice in pie charts.. By default the halo is filled by the current point or series. color with an opacity of 0.25. The halo can be disabled by. setting the <code>halo</code> option to <code>false</code>.</p>. <p>In styled mode, the halo is styled with the <code>.highcharts-halo</code>. class, with colors inherited from <code>.highcharts-color-{n}</code>.</p>
    */
  def apply(borderColor: js.UndefOr[String] = js.undefined, brightness: js.UndefOr[Double] = js.undefined, opacity: js.UndefOr[Double] = js.undefined, shadow: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, lineWidthPlus: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[CleanJsObject[SeriesTreemapStatesHoverMarker]] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, halo: js.UndefOr[js.Any] = js.undefined): SeriesTreemapStatesHover = {
    val borderColorOuter: js.UndefOr[String] = borderColor
    val brightnessOuter: js.UndefOr[Double] = brightness
    val opacityOuter: js.UndefOr[Double] = opacity
    val shadowOuter: js.UndefOr[Boolean] = shadow
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    val lineWidthPlusOuter: js.UndefOr[Double] = lineWidthPlus
    val markerOuter: js.UndefOr[CleanJsObject[SeriesTreemapStatesHoverMarker]] = marker
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val colorOuter: js.UndefOr[String | js.Object] = color
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val haloOuter: js.Any = halo
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapStatesHover {
      override val borderColor: js.UndefOr[String] = borderColorOuter
      override val brightness: js.UndefOr[Double] = brightnessOuter
      override val opacity: js.UndefOr[Double] = opacityOuter
      override val shadow: js.UndefOr[Boolean] = shadowOuter
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
      override val lineWidthPlus: js.UndefOr[Double] = lineWidthPlusOuter
      override val marker: js.UndefOr[CleanJsObject[SeriesTreemapStatesHoverMarker]] = markerOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val halo: js.Any = haloOuter
    })
  }
}
