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
  * @note JavaScript name: <code>annotations-fibonacci-typeOptions</code>
  */
class AnnotationsFibonacciTypeOptions extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>An array of background colors:
    * Default to:</p>
    * <pre><code>[
    * &#39;rgba(130, 170, 255, 0.4)&#39;,
    * &#39;rgba(139, 191, 216, 0.4)&#39;,
    * &#39;rgba(150, 216, 192, 0.4)&#39;,
    * &#39;rgba(156, 229, 161, 0.4)&#39;,
    * &#39;rgba(162, 241, 130, 0.4)&#39;,
    * &#39;rgba(169, 255, 101, 0.4)&#39;
    * ]
    * </code></pre>
    * @since 6.0.0
    */
  var backgroundColors: js.Any = js.undefined

  /**
    * <p>The height of the fibonacci in terms of yAxis.</p>
    * @since 6.0.0
    */
  var height: js.UndefOr[Double] = js.undefined

  /**
    * <p>An array with options for the labels.</p>
    * @since 6.0.0
    */
  var labels: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>The color of line.</p>
    * @since 6.0.0
    */
  var lineColor: js.UndefOr[String] = js.undefined

  /**
    * <p>An array of colors for the lines.</p>
    * @since 6.0.0
    */
  var lineColors: js.Any = js.undefined

  /**
    * <p>Line options.</p>
    * @since 6.0.0
    */
  var line: js.Any = js.undefined

  var points: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>This number defines which xAxis the point is connected to.
    * It refers to either the axis id or the index of the axis
    * in the xAxis array.</p>
    * @since 6.0.0
    */
  var xAxis: js.UndefOr[Double] = js.undefined

  /**
    * <p>This number defines which yAxis the point is connected to.
    * It refers to either the axis id or the index of the axis
    * in the xAxis array.</p>
    * @since 6.0.0
    */
  var yAxis: js.UndefOr[Double] = js.undefined
}

object AnnotationsFibonacciTypeOptions {
  /**
    * @param backgroundColors <p>An array of background colors:. Default to:</p>. <pre><code>[. &#39;rgba(130, 170, 255, 0.4)&#39;,. &#39;rgba(139, 191, 216, 0.4)&#39;,. &#39;rgba(150, 216, 192, 0.4)&#39;,. &#39;rgba(156, 229, 161, 0.4)&#39;,. &#39;rgba(162, 241, 130, 0.4)&#39;,. &#39;rgba(169, 255, 101, 0.4)&#39;. ]. </code></pre>
    * @param height <p>The height of the fibonacci in terms of yAxis.</p>
    * @param labels <p>An array with options for the labels.</p>
    * @param lineColor <p>The color of line.</p>
    * @param lineColors <p>An array of colors for the lines.</p>
    * @param line <p>Line options.</p>
    * @param xAxis <p>This number defines which xAxis the point is connected to.. It refers to either the axis id or the index of the axis. in the xAxis array.</p>
    * @param yAxis <p>This number defines which yAxis the point is connected to.. It refers to either the axis id or the index of the axis. in the xAxis array.</p>
    */
  def apply(backgroundColors: js.UndefOr[js.Any] = js.undefined, height: js.UndefOr[Double] = js.undefined, labels: js.UndefOr[js.Array[js.Any]] = js.undefined, lineColor: js.UndefOr[String] = js.undefined, lineColors: js.UndefOr[js.Any] = js.undefined, line: js.UndefOr[js.Any] = js.undefined, points: js.UndefOr[js.Array[js.Any]] = js.undefined, xAxis: js.UndefOr[Double] = js.undefined, yAxis: js.UndefOr[Double] = js.undefined): AnnotationsFibonacciTypeOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsFibonacciTypeOptions {
      this.backgroundColors = backgroundColors
      this.height = height
      this.labels = labels
      this.lineColor = lineColor
      this.lineColors = lineColors
      this.line = line
      this.points = points
      this.xAxis = xAxis
      this.yAxis = yAxis
    })
  }
}
