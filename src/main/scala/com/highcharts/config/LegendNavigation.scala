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
  * @note JavaScript name: <code>legend-navigation</code>
  */
@js.annotation.ScalaJSDefined
class LegendNavigation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color for the active up or down arrow in the legend page
    * navigation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>
    * @since 2.2.4
    */
  val activeColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the inactive up or down arrow in the legend page
    * navigation. .</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>
    * @since 2.2.4
    */
  val inactiveColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>How to animate the pages when navigating up or down. A value of
    * <code>true</code> applies the default navigation given in the
    * <code>chart.animation</code> option. Additional options can be given as an
    * object containing values for easing and duration.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>
    * @since 2.2.4
    */
  val animation: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The pixel size of the up and down arrows in the legend paging
    * navigation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>
    * @since 2.2.4
    */
  val arrowSize: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to enable the legend navigation. In most cases, disabling
    * the navigation results in an unwanted overflow.</p>
    * <p>See also the <a href="https://www.highcharts.com/products/plugin-registry/single/8/Adapt-Chart-To-Legend">adapt chart to legend</a>
    * plugin for a solution to extend the chart height to make room for
    * the legend, optionally in exported charts only.</p>
    * @since 4.2.4
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Text styles for the legend page navigation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>
    * @since 2.2.4
    */
  val style: js.UndefOr[js.Object] = js.undefined
}

object LegendNavigation {
  /**
    * @param activeColor <p>The color for the active up or down arrow in the legend page. navigation.</p>
    * @param inactiveColor <p>The color of the inactive up or down arrow in the legend page. navigation. .</p>
    * @param animation <p>How to animate the pages when navigating up or down. A value of. <code>true</code> applies the default navigation given in the. <code>chart.animation</code> option. Additional options can be given as an. object containing values for easing and duration.</p>
    * @param arrowSize <p>The pixel size of the up and down arrows in the legend paging. navigation.</p>
    * @param enabled <p>Whether to enable the legend navigation. In most cases, disabling. the navigation results in an unwanted overflow.</p>. <p>See also the <a href="https://www.highcharts.com/products/plugin-registry/single/8/Adapt-Chart-To-Legend">adapt chart to legend</a>. plugin for a solution to extend the chart height to make room for. the legend, optionally in exported charts only.</p>
    * @param style <p>Text styles for the legend page navigation.</p>
    */
  def apply(activeColor: js.UndefOr[String | js.Object] = js.undefined, inactiveColor: js.UndefOr[String | js.Object] = js.undefined, animation: js.UndefOr[Boolean] = js.undefined, arrowSize: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): LegendNavigation = {
    val activeColorOuter: js.UndefOr[String | js.Object] = activeColor
    val inactiveColorOuter: js.UndefOr[String | js.Object] = inactiveColor
    val animationOuter: js.UndefOr[Boolean] = animation
    val arrowSizeOuter: js.UndefOr[Double] = arrowSize
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val styleOuter: js.UndefOr[js.Object] = style
    com.highcharts.HighchartsGenericObject.toCleanObject(new LegendNavigation {
      override val activeColor: js.UndefOr[String | js.Object] = activeColorOuter
      override val inactiveColor: js.UndefOr[String | js.Object] = inactiveColorOuter
      override val animation: js.UndefOr[Boolean] = animationOuter
      override val arrowSize: js.UndefOr[Double] = arrowSizeOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val style: js.UndefOr[js.Object] = styleOuter
    })
  }
}
