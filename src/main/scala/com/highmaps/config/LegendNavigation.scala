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
  * @note JavaScript name: <code>legend-navigation</code>
  */
@js.annotation.ScalaJSDefined
class LegendNavigation extends js.Object {

  /**
    * The color for the active up or down arrow in the legend page navigation.
    */
  val activeColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * How to animate the pages when navigating up or down. A value of <code>true</code> applies the default navigation given in  the chart.animation option. Additional options can be given as an object containing values for easing and duration.  .
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * The pixel size of the up and down arrows in the legend paging navigation.  .
    */
  val arrowSize: js.UndefOr[Double] = js.undefined

  /**
    * The color of the inactive up or down arrow in the legend page navigation.  .
    */
  val inactiveColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Text styles for the legend page navigation.
    */
  val style: js.UndefOr[js.Object] = js.undefined
}

object LegendNavigation {
  /**
    * @param activeColor The color for the active up or down arrow in the legend page navigation.
    * @param animation How to animate the pages when navigating up or down. A value of <code>true</code> applies the default navigation given in  the chart.animation option. Additional options can be given as an object containing values for easing and duration.  .
    * @param arrowSize The pixel size of the up and down arrows in the legend paging navigation.  .
    * @param inactiveColor The color of the inactive up or down arrow in the legend page navigation.  .
    * @param style Text styles for the legend page navigation.
    */
  def apply(activeColor: js.UndefOr[String | js.Object] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, arrowSize: js.UndefOr[Double] = js.undefined, inactiveColor: js.UndefOr[String | js.Object] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): LegendNavigation = {
    val activeColorOuter: js.UndefOr[String | js.Object] = activeColor
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    val arrowSizeOuter: js.UndefOr[Double] = arrowSize
    val inactiveColorOuter: js.UndefOr[String | js.Object] = inactiveColor
    val styleOuter: js.UndefOr[js.Object] = style
    new LegendNavigation {
      override val activeColor: js.UndefOr[String | js.Object] = activeColorOuter
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
      override val arrowSize: js.UndefOr[Double] = arrowSizeOuter
      override val inactiveColor: js.UndefOr[String | js.Object] = inactiveColorOuter
      override val style: js.UndefOr[js.Object] = styleOuter
    }
  }
}
