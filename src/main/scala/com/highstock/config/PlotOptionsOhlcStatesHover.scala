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
  * @note JavaScript name: <code>plotOptions-ohlc-states-hover</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsOhlcStatesHover extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The pixel width of the line representing the OHLC point.</p>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

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
}

object PlotOptionsOhlcStatesHover {
  /**
    * @param lineWidth <p>The pixel width of the line representing the OHLC point.</p>
    * @param brightness <p>How much to brighten the point on interaction. Requires the main. color to be defined in hex or rgb(a) format.</p>. <p>In styled mode, the hover brightening is by default replaced. with a fill-opacity set in the <code>.highcharts-point:hover</code> rule.</p>
    * @param borderColor <p>A specific border color for the hovered point. Defaults to. inherit the normal state border color.</p>
    * @param color <p>A specific color for the hovered point.</p>
    * @param animation <p>Animation setting for hovering the graph in line-type series.</p>
    * @param enabled <p>Enable separate styles for the hovered series to visualize that. the user hovers either the series itself or the legend. .</p>
    * @param borderWidth <p>The border width of the point in this state</p>
    */
  def apply(lineWidth: js.UndefOr[Double] = js.undefined, brightness: js.UndefOr[Double] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined): PlotOptionsOhlcStatesHover = {
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val brightnessOuter: js.UndefOr[Double] = brightness
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val colorOuter: js.UndefOr[String | js.Object] = color
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsOhlcStatesHover {
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val brightness: js.UndefOr[Double] = brightnessOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
    })
  }
}
