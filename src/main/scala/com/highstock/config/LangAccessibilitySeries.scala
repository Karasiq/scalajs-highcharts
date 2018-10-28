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
  * @note JavaScript name: <code>lang-accessibility-series</code>
  */
@js.annotation.ScalaJSDefined
class LangAccessibilitySeries extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Lang configuration for the series main summary. Each series
    * type has two modes:</p>
    * <pre><code>1. This series type is the only series type used in the
    *    chart</code></pre><ol start="2">
    * <li>This is a combination chart with multiple series types</li>
    * </ol>
    * <p>If a definition does not exist for the specific series type
    * and mode, the &#39;default&#39; lang definitions are used.</p>
    * @since 6.0.6
    */
  val summary: js.UndefOr[CleanJsObject[LangAccessibilitySeriesSummary]] = js.undefined

  /**
    * <p>User supplied description text. This is added after the main
    * summary if present.</p>
    * @since 6.0.6
    */
  val description: js.UndefOr[String] = js.undefined

  /**
    * <p>xAxis description for series if there are multiple xAxes in
    * the chart.</p>
    * @since 6.0.6
    */
  val xAxisDescription: js.UndefOr[String] = js.undefined

  /**
    * <p>yAxis description for series if there are multiple yAxes in
    * the chart.</p>
    * @since 6.0.6
    */
  val yAxisDescription: js.UndefOr[String] = js.undefined
}

object LangAccessibilitySeries {
  /**
    * @param summary <p>Lang configuration for the series main summary. Each series. type has two modes:</p>. <pre><code>1. This series type is the only series type used in the.    chart</code></pre><ol start="2">. <li>This is a combination chart with multiple series types</li>. </ol>. <p>If a definition does not exist for the specific series type. and mode, the &#39;default&#39; lang definitions are used.</p>
    * @param description <p>User supplied description text. This is added after the main. summary if present.</p>
    * @param xAxisDescription <p>xAxis description for series if there are multiple xAxes in. the chart.</p>
    * @param yAxisDescription <p>yAxis description for series if there are multiple yAxes in. the chart.</p>
    */
  def apply(summary: js.UndefOr[CleanJsObject[LangAccessibilitySeriesSummary]] = js.undefined, description: js.UndefOr[String] = js.undefined, xAxisDescription: js.UndefOr[String] = js.undefined, yAxisDescription: js.UndefOr[String] = js.undefined): LangAccessibilitySeries = {
    val summaryOuter: js.UndefOr[CleanJsObject[LangAccessibilitySeriesSummary]] = summary
    val descriptionOuter: js.UndefOr[String] = description
    val xAxisDescriptionOuter: js.UndefOr[String] = xAxisDescription
    val yAxisDescriptionOuter: js.UndefOr[String] = yAxisDescription
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibilitySeries {
      override val summary: js.UndefOr[CleanJsObject[LangAccessibilitySeriesSummary]] = summaryOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val xAxisDescription: js.UndefOr[String] = xAxisDescriptionOuter
      override val yAxisDescription: js.UndefOr[String] = yAxisDescriptionOuter
    })
  }
}
