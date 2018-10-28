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
  * @note JavaScript name: <code>colorAxis-dataClasses</code>
  */
@js.annotation.ScalaJSDefined
class ColorAxisDataClasses extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of each data class. If not set, the color is pulled
    * from the global or chart-specific <a href="#colors">colors</a> array. In
    * styled mode, this option is ignored. Instead, use colors defined
    * in CSS.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/data-class-two-ranges/">Explicit colors</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The start of the value range that the data class represents,
    * relating to the point value.</p>
    * <p>The range of each <code>dataClass</code> is closed in both ends, but can be
    * overridden by the next <code>dataClass</code>.</p>
    */
  val from: js.UndefOr[Double] = js.undefined

  /**
    * <p>The name of the data class as it appears in the legend.
    * If no name is given, it is automatically created based on the
    * <code>from</code> and <code>to</code> values. For full programmatic control,
    * <a href="#legend.labelFormatter">legend.labelFormatter</a> can be used.
    * In the formatter, <code>this.from</code> and <code>this.to</code> can be accessed.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/dataclasses-name/">Named data classes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/dataclasses-labelformatter/">Formatted data classes</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * <p>The end of the value range that the data class represents,
    * relating to the point value.</p>
    * <p>The range of each <code>dataClass</code> is closed in both ends, but can be
    * overridden by the next <code>dataClass</code>.</p>
    */
  val to: js.UndefOr[Double] = js.undefined
}

object ColorAxisDataClasses {
  /**
    * @param color <p>The color of each data class. If not set, the color is pulled. from the global or chart-specific <a href="#colors">colors</a> array. In. styled mode, this option is ignored. Instead, use colors defined. in CSS.</p>
    * @param from <p>The start of the value range that the data class represents,. relating to the point value.</p>. <p>The range of each <code>dataClass</code> is closed in both ends, but can be. overridden by the next <code>dataClass</code>.</p>
    * @param name <p>The name of the data class as it appears in the legend.. If no name is given, it is automatically created based on the. <code>from</code> and <code>to</code> values. For full programmatic control,. <a href="#legend.labelFormatter">legend.labelFormatter</a> can be used.. In the formatter, <code>this.from</code> and <code>this.to</code> can be accessed.</p>
    * @param to <p>The end of the value range that the data class represents,. relating to the point value.</p>. <p>The range of each <code>dataClass</code> is closed in both ends, but can be. overridden by the next <code>dataClass</code>.</p>
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, from: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, to: js.UndefOr[Double] = js.undefined): ColorAxisDataClasses = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val fromOuter: js.UndefOr[Double] = from
    val nameOuter: js.UndefOr[String] = name
    val toOuter: js.UndefOr[Double] = to
    com.highcharts.HighchartsGenericObject.toCleanObject(new ColorAxisDataClasses {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val from: js.UndefOr[Double] = fromOuter
      override val name: js.UndefOr[String] = nameOuter
      override val to: js.UndefOr[Double] = toOuter
    })
  }
}
