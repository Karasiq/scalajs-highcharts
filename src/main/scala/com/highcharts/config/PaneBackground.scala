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
  * @note JavaScript name: <code>pane-background</code>
  */
@js.annotation.ScalaJSDefined
class PaneBackground extends js.Object {

  /**
    * The background color or gradient for the pane.
    * @since 2.3.0
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pane background border color.
    * @since 2.3.0
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pixel border width of the pane background.
    * @since 2.3.0
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * The class name for this background.
    * @example  <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/pane/" target="_blank">Panes styled by CSS</a> in <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * The inner radius of the pane background. Can be either numeric (pixels) or a percentage string.
    * @since 2.3.0
    */
  val innerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * The outer radius of the circular pane background. Can be either numeric (pixels) or a percentage string.
    * @since 2.3.0
    */
  val outerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * Tha shape of the pane background. When <code>solid</code>, the background is circular. When <code>arc</code>, the background extends only from the min to the max of the value axis.
    * @since 2.3.0
    */
  val shape: js.UndefOr[String] = js.undefined
}

object PaneBackground {
  /**
    * @param backgroundColor The background color or gradient for the pane.
    * @param borderColor The pane background border color.
    * @param borderWidth The pixel border width of the pane background.
    * @param className The class name for this background.
    * @param innerRadius The inner radius of the pane background. Can be either numeric (pixels) or a percentage string.
    * @param outerRadius The outer radius of the circular pane background. Can be either numeric (pixels) or a percentage string.
    * @param shape Tha shape of the pane background. When <code>solid</code>, the background is circular. When <code>arc</code>, the background extends only from the min to the max of the value axis.
    */
  def apply(backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, innerRadius: js.UndefOr[Double | String] = js.undefined, outerRadius: js.UndefOr[Double | String] = js.undefined, shape: js.UndefOr[String] = js.undefined): PaneBackground = {
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val classNameOuter: js.UndefOr[String] = className
    val innerRadiusOuter: js.UndefOr[Double | String] = innerRadius
    val outerRadiusOuter: js.UndefOr[Double | String] = outerRadius
    val shapeOuter: js.UndefOr[String] = shape
    new PaneBackground {
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val innerRadius: js.UndefOr[Double | String] = innerRadiusOuter
      override val outerRadius: js.UndefOr[Double | String] = outerRadiusOuter
      override val shape: js.UndefOr[String] = shapeOuter
    }
  }
}
