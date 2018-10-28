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
  * @note JavaScript name: <code>series&lt;bullet&gt;-targetOptions</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBulletTargetOptions extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The width of the rectangle representing the target. Could be set
    * as a pixel value or as a percentage of a column width.</p>
    * @since 6.0.0
    */
  val width: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The height of the rectangle representing the target.</p>
    * @since 6.0.0
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border width of the rectangle representing the target.</p>
    * <p>In styled mode, use class <code>highcharts-bullet-target</code> instead.</p>
    * @since 6.0.0
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border color of the rectangle representing the target. When
    * not set, the  point&#39;s border color is used.</p>
    * <p>In styled mode, use class <code>highcharts-bullet-target</code> instead.</p>
    * @since 6.0.0
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the rectangle representing the target. When not set,
    * point&#39;s color (if set in point&#39;s options -
    * <a href="#series.bullet.data.color"><code>color</code></a>) or zone of the target value
    * (if <a href="#plotOptions.bullet.zones"><code>zones</code></a> or
    * <a href="#plotOptions.bullet.negativeColor"><code>negativeColor</code></a> are set)
    * or the same color as the point has is used.</p>
    * <p>In styled mode, use class <code>highcharts-bullet-target</code> instead.</p>
    * @since 6.0.0
    */
  val color: js.UndefOr[String | js.Object] = js.undefined
}

object SeriesBulletTargetOptions {
  /**
    * @param width <p>The width of the rectangle representing the target. Could be set. as a pixel value or as a percentage of a column width.</p>
    * @param height <p>The height of the rectangle representing the target.</p>
    * @param borderWidth <p>The border width of the rectangle representing the target.</p>. <p>In styled mode, use class <code>highcharts-bullet-target</code> instead.</p>
    * @param borderColor <p>The border color of the rectangle representing the target. When. not set, the  point&#39;s border color is used.</p>. <p>In styled mode, use class <code>highcharts-bullet-target</code> instead.</p>
    * @param color <p>The color of the rectangle representing the target. When not set,. point&#39;s color (if set in point&#39;s options -. <a href="#series.bullet.data.color"><code>color</code></a>) or zone of the target value. (if <a href="#plotOptions.bullet.zones"><code>zones</code></a> or. <a href="#plotOptions.bullet.negativeColor"><code>negativeColor</code></a> are set). or the same color as the point has is used.</p>. <p>In styled mode, use class <code>highcharts-bullet-target</code> instead.</p>
    */
  def apply(width: js.UndefOr[Double | String] = js.undefined, height: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined): SeriesBulletTargetOptions = {
    val widthOuter: js.UndefOr[Double | String] = width
    val heightOuter: js.UndefOr[Double] = height
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val colorOuter: js.UndefOr[String | js.Object] = color
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBulletTargetOptions {
      override val width: js.UndefOr[Double | String] = widthOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
    })
  }
}
