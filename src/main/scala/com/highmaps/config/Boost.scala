/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>boost</code>
  */
@js.annotation.ScalaJSDefined
class Boost extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Set the series threshold for when the boost should kick in globally.</p>
    * <p>Setting to e.g. 20 will cause the whole chart to enter boost mode
    * if there are 20 or more series active. When the chart is in boost mode,
    * every series in it will be rendered to a common canvas. This offers
    * a significant speed improvment in charts with a very high
    * amount of series.</p>
    */
  val seriesThreshold: js.UndefOr[Double] = js.undefined

  /**
    * <p>Enable or disable boost on a chart.</p>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Debugging options for boost.
    * Useful for benchmarking, and general timing.</p>
    */
  val debug: js.UndefOr[CleanJsObject[BoostDebug]] = js.undefined

  /**
    * <p>Enable or disable GPU translations. GPU translations are faster than doing
    * the translation in JavaScript.</p>
    * <p>This option may cause rendering issues with certain datasets.
    * Namely, if your dataset has large numbers with small increments (such as
    * timestamps), it won&#39;t work correctly. This is due to floating point
    * precission.</p>
    */
  val useGPUTranslations: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>If set to true, the whole chart will be boosted if one of the series
    * crosses its threshold, and all the series can be boosted.</p>
    */
  val allowForce: js.UndefOr[Boolean] = js.undefined
}

object Boost {
  /**
    * @param seriesThreshold <p>Set the series threshold for when the boost should kick in globally.</p>. <p>Setting to e.g. 20 will cause the whole chart to enter boost mode. if there are 20 or more series active. When the chart is in boost mode,. every series in it will be rendered to a common canvas. This offers. a significant speed improvment in charts with a very high. amount of series.</p>
    * @param enabled <p>Enable or disable boost on a chart.</p>
    * @param debug <p>Debugging options for boost.. Useful for benchmarking, and general timing.</p>
    * @param useGPUTranslations <p>Enable or disable GPU translations. GPU translations are faster than doing. the translation in JavaScript.</p>. <p>This option may cause rendering issues with certain datasets.. Namely, if your dataset has large numbers with small increments (such as. timestamps), it won&#39;t work correctly. This is due to floating point. precission.</p>
    * @param allowForce <p>If set to true, the whole chart will be boosted if one of the series. crosses its threshold, and all the series can be boosted.</p>
    */
  def apply(seriesThreshold: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, debug: js.UndefOr[CleanJsObject[BoostDebug]] = js.undefined, useGPUTranslations: js.UndefOr[Boolean] = js.undefined, allowForce: js.UndefOr[Boolean] = js.undefined): Boost = {
    val seriesThresholdOuter: js.UndefOr[Double] = seriesThreshold
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val debugOuter: js.UndefOr[CleanJsObject[BoostDebug]] = debug
    val useGPUTranslationsOuter: js.UndefOr[Boolean] = useGPUTranslations
    val allowForceOuter: js.UndefOr[Boolean] = allowForce
    com.highcharts.HighchartsGenericObject.toCleanObject(new Boost {
      override val seriesThreshold: js.UndefOr[Double] = seriesThresholdOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val debug: js.UndefOr[CleanJsObject[BoostDebug]] = debugOuter
      override val useGPUTranslations: js.UndefOr[Boolean] = useGPUTranslationsOuter
      override val allowForce: js.UndefOr[Boolean] = allowForceOuter
    })
  }
}
