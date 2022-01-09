/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;bullet&gt;-targetOptions</code>
  */
class SeriesBulletTargetOptions extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The border color of the rectangle representing the target. When
    * not set, the  point&#39;s border color is used.</p>
    * <p>In styled mode, use class <code>highcharts-bullet-target</code> instead.</p>
    * @since 6.0.0
    */
  var borderColor: js.UndefOr[String] = js.undefined

  /**
    * <p>The border radius of the rectangle representing the target.</p>
    * @since 6.0.0
    */
  var borderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border width of the rectangle representing the target.</p>
    * <p>In styled mode, use class <code>highcharts-bullet-target</code> instead.</p>
    * @since 6.0.0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

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
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The height of the rectangle representing the target.</p>
    * @since 6.0.0
    */
  var height: js.UndefOr[Double] = js.undefined

  /**
    * <p>The width of the rectangle representing the target. Could be set
    * as a pixel value or as a percentage of a column width.</p>
    * @since 6.0.0
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object SeriesBulletTargetOptions {
  /**
    * @param borderColor <p>The border color of the rectangle representing the target. When. not set, the  point&#39;s border color is used.</p>. <p>In styled mode, use class <code>highcharts-bullet-target</code> instead.</p>
    * @param borderRadius <p>The border radius of the rectangle representing the target.</p>
    * @param borderWidth <p>The border width of the rectangle representing the target.</p>. <p>In styled mode, use class <code>highcharts-bullet-target</code> instead.</p>
    * @param color <p>The color of the rectangle representing the target. When not set,. point&#39;s color (if set in point&#39;s options -. <a href="#series.bullet.data.color"><code>color</code></a>) or zone of the target value. (if <a href="#plotOptions.bullet.zones"><code>zones</code></a> or. <a href="#plotOptions.bullet.negativeColor"><code>negativeColor</code></a> are set). or the same color as the point has is used.</p>. <p>In styled mode, use class <code>highcharts-bullet-target</code> instead.</p>
    * @param height <p>The height of the rectangle representing the target.</p>
    * @param width <p>The width of the rectangle representing the target. Could be set. as a pixel value or as a percentage of a column width.</p>
    */
  def apply(borderColor: js.UndefOr[String] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double | String] = js.undefined): SeriesBulletTargetOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBulletTargetOptions {
      this.borderColor = borderColor
      this.borderRadius = borderRadius
      this.borderWidth = borderWidth
      this.color = color
      this.height = height
      this.width = width
    })
  }
}
