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
  * @note JavaScript name: <code>plotOptions-gantt-states-select</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsGanttStatesSelect extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A specific color for the selected point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-states-hover/">Hover options</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>A specific border color for the selected point.</p>
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

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

object PlotOptionsGanttStatesSelect {
  /**
    * @param color <p>A specific color for the selected point.</p>
    * @param borderColor <p>A specific border color for the selected point.</p>
    * @param animation <p>Animation setting for hovering the graph in line-type series.</p>
    * @param enabled <p>Enable separate styles for the hovered series to visualize that. the user hovers either the series itself or the legend. .</p>
    * @param borderWidth <p>The border width of the point in this state</p>
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined): PlotOptionsGanttStatesSelect = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsGanttStatesSelect {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
    })
  }
}
