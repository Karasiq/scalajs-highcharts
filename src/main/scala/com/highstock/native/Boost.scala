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
  * @note JavaScript name: <code>boost</code>
  */
class Boost extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>If set to true, the whole chart will be boosted if one of the series
    * crosses its threshold, and all the series can be boosted.</p>
    */
  var allowForce: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Debugging options for boost.
    * Useful for benchmarking, and general timing.</p>
    */
  var debug: js.Any = js.undefined

  /**
    * <p>Enable or disable boost on a chart.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Set the series threshold for when the boost should kick in globally.</p>
    * <p>Setting to e.g. 20 will cause the whole chart to enter boost mode
    * if there are 20 or more series active. When the chart is in boost mode,
    * every series in it will be rendered to a common canvas. This offers
    * a significant speed improvment in charts with a very high
    * amount of series.</p>
    */
  var seriesThreshold: js.UndefOr[Double] = js.undefined

  /**
    * <p>Enable or disable GPU translations. GPU translations are faster than doing
    * the translation in JavaScript.</p>
    * <p>This option may cause rendering issues with certain datasets.
    * Namely, if your dataset has large numbers with small increments (such as
    * timestamps), it won&#39;t work correctly. This is due to floating point
    * precission.</p>
    */
  var useGPUTranslations: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enable or disable pre-allocation of vertex buffers.</p>
    * <p>Enabling this will make it so that the binary data arrays required for
    * storing the series data will be allocated prior to transforming the data
    * to a WebGL-compatible format.</p>
    * <p>This saves a copy operation on the order of O(n) and so is significantly more
    * performant. However, this is currently an experimental option, and may cause
    * visual artifacts with some datasets.</p>
    * <p>As such, care should be taken when using this setting to make sure that
    * it doesn&#39;t cause any rendering glitches with the given use-case.</p>
    */
  var usePreallocated: js.UndefOr[Boolean] = js.undefined
}

object Boost {
  /**
    * @param allowForce <p>If set to true, the whole chart will be boosted if one of the series. crosses its threshold, and all the series can be boosted.</p>
    * @param debug <p>Debugging options for boost.. Useful for benchmarking, and general timing.</p>
    * @param enabled <p>Enable or disable boost on a chart.</p>
    * @param seriesThreshold <p>Set the series threshold for when the boost should kick in globally.</p>. <p>Setting to e.g. 20 will cause the whole chart to enter boost mode. if there are 20 or more series active. When the chart is in boost mode,. every series in it will be rendered to a common canvas. This offers. a significant speed improvment in charts with a very high. amount of series.</p>
    * @param useGPUTranslations <p>Enable or disable GPU translations. GPU translations are faster than doing. the translation in JavaScript.</p>. <p>This option may cause rendering issues with certain datasets.. Namely, if your dataset has large numbers with small increments (such as. timestamps), it won&#39;t work correctly. This is due to floating point. precission.</p>
    * @param usePreallocated <p>Enable or disable pre-allocation of vertex buffers.</p>. <p>Enabling this will make it so that the binary data arrays required for. storing the series data will be allocated prior to transforming the data. to a WebGL-compatible format.</p>. <p>This saves a copy operation on the order of O(n) and so is significantly more. performant. However, this is currently an experimental option, and may cause. visual artifacts with some datasets.</p>. <p>As such, care should be taken when using this setting to make sure that. it doesn&#39;t cause any rendering glitches with the given use-case.</p>
    */
  def apply(allowForce: js.UndefOr[Boolean] = js.undefined, debug: js.UndefOr[js.Any] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, seriesThreshold: js.UndefOr[Double] = js.undefined, useGPUTranslations: js.UndefOr[Boolean] = js.undefined, usePreallocated: js.UndefOr[Boolean] = js.undefined): Boost = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Boost {
      this.allowForce = allowForce
      this.debug = debug
      this.enabled = enabled
      this.seriesThreshold = seriesThreshold
      this.useGPUTranslations = useGPUTranslations
      this.usePreallocated = usePreallocated
    })
  }
}
