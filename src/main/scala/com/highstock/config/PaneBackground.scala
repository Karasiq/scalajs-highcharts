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
  * @note JavaScript name: <code>pane-background</code>
  */
@js.annotation.ScalaJSDefined
class PaneBackground extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The shape of the pane background. When <code>solid</code>, the background
    * is circular. When <code>arc</code>, the background extends only from the min
    * to the max of the value axis.</p>
    * @since 2.3.0
    */
  val shape: js.UndefOr[String] = js.undefined

  /**
    * <p>The pixel border width of the pane background.</p>
    * @since 2.3.0
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pane background border color.</p>
    * @since 2.3.0
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The background color or gradient for the pane.</p>
    * @since 2.3.0
    */
  val backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The inner radius of the pane background. Can be either numeric
    * (pixels) or a percentage string.</p>
    * @since 2.3.0
    */
  val innerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The outer radius of the circular pane background. Can be either
    * numeric (pixels) or a percentage string.</p>
    * @since 2.3.0
    */
  val outerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The class name for this background.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pane/">Panes styled by CSS</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pane/">Panes styled by CSS</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pane/">Panes styled by CSS</a>
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined
}

object PaneBackground {
  /**
    * @param shape <p>The shape of the pane background. When <code>solid</code>, the background. is circular. When <code>arc</code>, the background extends only from the min. to the max of the value axis.</p>
    * @param borderWidth <p>The pixel border width of the pane background.</p>
    * @param borderColor <p>The pane background border color.</p>
    * @param backgroundColor <p>The background color or gradient for the pane.</p>
    * @param innerRadius <p>The inner radius of the pane background. Can be either numeric. (pixels) or a percentage string.</p>
    * @param outerRadius <p>The outer radius of the circular pane background. Can be either. numeric (pixels) or a percentage string.</p>
    * @param className <p>The class name for this background.</p>
    */
  def apply(shape: js.UndefOr[String] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, backgroundColor: js.UndefOr[String | js.Object] = js.undefined, innerRadius: js.UndefOr[Double | String] = js.undefined, outerRadius: js.UndefOr[Double | String] = js.undefined, className: js.UndefOr[String] = js.undefined): PaneBackground = {
    val shapeOuter: js.UndefOr[String] = shape
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val backgroundColorOuter: js.UndefOr[String | js.Object] = backgroundColor
    val innerRadiusOuter: js.UndefOr[Double | String] = innerRadius
    val outerRadiusOuter: js.UndefOr[Double | String] = outerRadius
    val classNameOuter: js.UndefOr[String] = className
    com.highcharts.HighchartsGenericObject.toCleanObject(new PaneBackground {
      override val shape: js.UndefOr[String] = shapeOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val backgroundColor: js.UndefOr[String | js.Object] = backgroundColorOuter
      override val innerRadius: js.UndefOr[Double | String] = innerRadiusOuter
      override val outerRadius: js.UndefOr[Double | String] = outerRadiusOuter
      override val className: js.UndefOr[String] = classNameOuter
    })
  }
}
