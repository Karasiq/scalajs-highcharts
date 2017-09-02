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
  * @note JavaScript name: <code>legend-navigation</code>
  */
@js.annotation.ScalaJSDefined
class LegendNavigation extends js.Object {

  /**
    * The color for the active up or down arrow in the legend page navigation.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/" target="_blank">
				Legend page navigation demonstrated</a>
    * @since 1.1.5
    */
  val activeColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * How to animate the pages when navigating up or down. A value of <code>true</code> applies the default navigation given in  the chart.animation option. Additional options can be given as an object containing values for easing and duration.  .
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/" target="_blank">
				Legend page navigation demonstrated</a>
    * @since 1.1.5
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * The pixel size of the up and down arrows in the legend paging navigation.  .
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/" target="_blank">
				Legend page navigation demonstrated</a>
    * @since 1.1.5
    */
  val arrowSize: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to enable the legend navigation. In most cases, disabling the navigation results in an unwanted overflow.</p>
    * 
    * <p>See also the <a href="http://www.highcharts.com/plugin-registry/single/8/Adapt-Chart-To-Legend">adapt chart to legend</a> plugin for a solution to extend the chart height to make room for the legend, optionally in exported charts only.</p>
    * @since 4.2.4
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * The color of the inactive up or down arrow in the legend page navigation.  .
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/" target="_blank">
				Legend page navigation demonstrated</a>
    * @since 1.1.5
    */
  val inactiveColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Text styles for the legend page navigation.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/" target="_blank">
				Legend page navigation demonstrated</a>
    * @since 1.1.5
    */
  val style: js.UndefOr[js.Object] = js.undefined
}

object LegendNavigation {
  /**
    * @param activeColor The color for the active up or down arrow in the legend page navigation.
    * @param animation How to animate the pages when navigating up or down. A value of <code>true</code> applies the default navigation given in  the chart.animation option. Additional options can be given as an object containing values for easing and duration.  .
    * @param arrowSize The pixel size of the up and down arrows in the legend paging navigation.  .
    * @param enabled <p>Whether to enable the legend navigation. In most cases, disabling the navigation results in an unwanted overflow.</p>. . <p>See also the <a href="http://www.highcharts.com/plugin-registry/single/8/Adapt-Chart-To-Legend">adapt chart to legend</a> plugin for a solution to extend the chart height to make room for the legend, optionally in exported charts only.</p>
    * @param inactiveColor The color of the inactive up or down arrow in the legend page navigation.  .
    * @param style Text styles for the legend page navigation.
    */
  def apply(activeColor: js.UndefOr[String | js.Object] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, arrowSize: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, inactiveColor: js.UndefOr[String | js.Object] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): LegendNavigation = {
    val activeColorOuter: js.UndefOr[String | js.Object] = activeColor
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    val arrowSizeOuter: js.UndefOr[Double] = arrowSize
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val inactiveColorOuter: js.UndefOr[String | js.Object] = inactiveColor
    val styleOuter: js.UndefOr[js.Object] = style
    new LegendNavigation {
      override val activeColor: js.UndefOr[String | js.Object] = activeColorOuter
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
      override val arrowSize: js.UndefOr[Double] = arrowSizeOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val inactiveColor: js.UndefOr[String | js.Object] = inactiveColorOuter
      override val style: js.UndefOr[js.Object] = styleOuter
    }
  }
}
