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
  * @note JavaScript name: <code>plotOptions-pyramid-states-hover</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsPyramidStatesHover extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>How much to brighten the point on interaction. Requires the main
    * color to be defined in hex or rgb(a) format.</p>
    * <p>In styled mode, the hover brightness is by default replaced
    * by a fill-opacity given in the <code>.highcharts-point-hover</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-states-hover-brightness/">Brightened by 0.5</a>
    */
  val brightness: js.UndefOr[Double] = js.undefined

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

object PlotOptionsPyramidStatesHover {
  /**
    * @param brightness <p>How much to brighten the point on interaction. Requires the main. color to be defined in hex or rgb(a) format.</p>. <p>In styled mode, the hover brightness is by default replaced. by a fill-opacity given in the <code>.highcharts-point-hover</code> class.</p>
    * @param animation <p>Animation setting for hovering the graph in line-type series.</p>
    * @param enabled <p>Enable separate styles for the hovered series to visualize that. the user hovers either the series itself or the legend. .</p>
    * @param color <p>The color of the shape in this state</p>
    * @param borderColor <p>The border color of the point in this state.</p>
    * @param borderWidth <p>The border width of the point in this state</p>
    */
  def apply(brightness: js.UndefOr[Double] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined): PlotOptionsPyramidStatesHover = {
    val brightnessOuter: js.UndefOr[Double] = brightness
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val colorOuter: js.UndefOr[String | js.Object] = color
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPyramidStatesHover {
      override val brightness: js.UndefOr[Double] = brightnessOuter
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
    })
  }
}
