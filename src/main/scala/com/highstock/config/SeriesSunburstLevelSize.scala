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
  * @note JavaScript name: <code>series&lt;sunburst&gt;-levelSize</code>
  */
@js.annotation.ScalaJSDefined
class SeriesSunburstLevelSize extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The value used for calculating the width of the ring. Its&#39; affect is
    * determined by <code>levelSize.unit</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sunburst-levelsize/">Sunburst with various sizes per level</a>
    * @since 6.0.5
    */
  val value: js.UndefOr[Double] = js.undefined

  /**
    * <p>How to interpret <code>levelSize.value</code>.
    * <code>percentage</code> gives a width relative to result of outer radius minus
    * inner radius.
    * <code>pixels</code> gives the ring a fixed width in pixels.
    * <code>weight</code> takes the remaining width after percentage and pixels, and
    * distributes it accross all &quot;weighted&quot; levels. The value relative to
    * the sum of all weights determines the width.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sunburst-levelsize/">Sunburst with various sizes per level</a>
    * @since 6.0.5
    */
  val unit: js.UndefOr[String] = js.undefined
}

object SeriesSunburstLevelSize {
  /**
    * @param value <p>The value used for calculating the width of the ring. Its&#39; affect is. determined by <code>levelSize.unit</code>.</p>
    * @param unit <p>How to interpret <code>levelSize.value</code>.. <code>percentage</code> gives a width relative to result of outer radius minus. inner radius.. <code>pixels</code> gives the ring a fixed width in pixels.. <code>weight</code> takes the remaining width after percentage and pixels, and. distributes it accross all &quot;weighted&quot; levels. The value relative to. the sum of all weights determines the width.</p>
    */
  def apply(value: js.UndefOr[Double] = js.undefined, unit: js.UndefOr[String] = js.undefined): SeriesSunburstLevelSize = {
    val valueOuter: js.UndefOr[Double] = value
    val unitOuter: js.UndefOr[String] = unit
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSunburstLevelSize {
      override val value: js.UndefOr[Double] = valueOuter
      override val unit: js.UndefOr[String] = unitOuter
    })
  }
}
