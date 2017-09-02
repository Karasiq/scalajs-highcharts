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
  * @note JavaScript name: <code>series&lt;treemap&gt;-states-hover</code>
  */
@js.annotation.ScalaJSDefined
class SeriesTreemapStatesHover extends js.Object {

  /**
    * Animation setting for hovering the graph in line-type series.
    * @since 5.0.8
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * A specific border color for the hovered point. Defaults to inherit the normal state border color.
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>How much to brighten the point on interaction. Requires the main color to be defined in hex or rgb(a) format.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the hover brightening is by default replaced with a fill-opacity set in the <code>.highcharts-point:hover</code> rule.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-states-hover-brightness/" target="_blank">Brighten by 0.5</a>
    */
  val brightness: js.UndefOr[Double] = js.undefined

  /**
    * A specific color for the hovered point.
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Enable separate styles for the hovered series to visualize that the user hovers either the series itself or the legend.			.
    * @example Disable hover on <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled/" target="_blank">line</a>,
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-column/" target="_blank">column</a>,
			<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-pie/" target="_blank">pie</a>
    * @since 1.2
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * The opacity of a point in treemap. When a point has children, the visibility of the children is determined by the opacity. 
    * @since 4.2.4
    */
  val opacity: js.UndefOr[Double] = js.undefined
}

object SeriesTreemapStatesHover {
  /**
    * @param animation Animation setting for hovering the graph in line-type series.
    * @param borderColor A specific border color for the hovered point. Defaults to inherit the normal state border color.
    * @param brightness <p>How much to brighten the point on interaction. Requires the main color to be defined in hex or rgb(a) format.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the hover brightening is by default replaced with a fill-opacity set in the <code>.highcharts-point:hover</code> rule.</p>
    * @param color A specific color for the hovered point.
    * @param enabled Enable separate styles for the hovered series to visualize that the user hovers either the series itself or the legend.			.
    * @param opacity The opacity of a point in treemap. When a point has children, the visibility of the children is determined by the opacity. 
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, brightness: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, opacity: js.UndefOr[Double] = js.undefined): SeriesTreemapStatesHover = {
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val brightnessOuter: js.UndefOr[Double] = brightness
    val colorOuter: js.UndefOr[String | js.Object] = color
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val opacityOuter: js.UndefOr[Double] = opacity
    new SeriesTreemapStatesHover {
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val brightness: js.UndefOr[Double] = brightnessOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val opacity: js.UndefOr[Double] = opacityOuter
    }
  }
}
