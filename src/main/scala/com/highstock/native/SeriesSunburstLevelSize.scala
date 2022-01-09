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
  * @note JavaScript name: <code>series&lt;sunburst&gt;-levelSize</code>
  */
class SeriesSunburstLevelSize extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>How to interpret <code>levelSize.value</code>.</p>
    * <ul>
    * <li><p><code>percentage</code> gives a width relative to result of outer radius
    * minus inner radius.</p>
    * </li>
    * <li><p><code>pixels</code> gives the ring a fixed width in pixels.</p>
    * </li>
    * <li><p><code>weight</code> takes the remaining width after percentage and pixels,
    * and distributes it accross all &quot;weighted&quot; levels. The value
    * relative to the sum of all weights determines the width.</p>
    * </li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sunburst-levelsize/">Sunburst with various sizes per level</a>
    * @since 6.0.5
    */
  var unit: js.UndefOr[String] = js.undefined

  /**
    * <p>The value used for calculating the width of the ring. Its&#39; affect
    * is determined by <code>levelSize.unit</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sunburst-levelsize/">Sunburst with various sizes per level</a>
    * @since 6.0.5
    */
  var value: js.UndefOr[Double] = js.undefined
}

object SeriesSunburstLevelSize {
  /**
    * @param unit <p>How to interpret <code>levelSize.value</code>.</p>. <ul>. <li><p><code>percentage</code> gives a width relative to result of outer radius. minus inner radius.</p>. </li>. <li><p><code>pixels</code> gives the ring a fixed width in pixels.</p>. </li>. <li><p><code>weight</code> takes the remaining width after percentage and pixels,. and distributes it accross all &quot;weighted&quot; levels. The value. relative to the sum of all weights determines the width.</p>. </li>. </ul>
    * @param value <p>The value used for calculating the width of the ring. Its&#39; affect. is determined by <code>levelSize.unit</code>.</p>
    */
  def apply(unit: js.UndefOr[String] = js.undefined, value: js.UndefOr[Double] = js.undefined): SeriesSunburstLevelSize = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSunburstLevelSize {
      this.unit = unit
      this.value = value
    })
  }
}
