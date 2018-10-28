/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>lang-accessibility</code>
  */
@js.annotation.ScalaJSDefined
class LangAccessibility extends com.highcharts.HighchartsGenericObject {

  val screenReaderRegionLabel: js.UndefOr[String] = js.undefined

  val navigationHint: js.UndefOr[String] = js.undefined

  val defaultChartTitle: js.UndefOr[String] = js.undefined

  val longDescriptionHeading: js.UndefOr[String] = js.undefined

  val noDescription: js.UndefOr[String] = js.undefined

  val structureHeading: js.UndefOr[String] = js.undefined

  val viewAsDataTable: js.UndefOr[String] = js.undefined

  val chartHeading: js.UndefOr[String] = js.undefined

  val chartContainerLabel: js.UndefOr[String] = js.undefined

  val rangeSelectorMinInput: js.UndefOr[String] = js.undefined

  val rangeSelectorMaxInput: js.UndefOr[String] = js.undefined

  val tableSummary: js.UndefOr[String] = js.undefined

  val mapZoomIn: js.UndefOr[String] = js.undefined

  val mapZoomOut: js.UndefOr[String] = js.undefined

  val rangeSelectorButton: js.UndefOr[String] = js.undefined

  val legendItem: js.UndefOr[String] = js.undefined

  /**
    * <p>Title element text for the chart SVG element. Leave this
    * empty to disable adding the title element. Browsers will display
    * this content when hovering over elements in the chart. Assistive
    * technology may use this element to label the chart.</p>
    * @since 6.0.8
    */
  val svgContainerTitle: js.UndefOr[String] = js.undefined

  /**
    * <p>Descriptions of lesser known series types. The relevant
    * description is added to the screen reader information region
    * when these series types are used.</p>
    * @since 6.0.6
    */
  val seriesTypeDescriptions: js.UndefOr[CleanJsObject[LangAccessibilitySeriesTypeDescriptions]] = js.undefined

  /**
    * <p>Chart type description strings. This is added to the chart
    * information region.</p>
    * <p>If there is only a single series type used in the chart, we use
    * the format string for the series type, or default if missing.
    * There is one format string for cases where there is only a single
    * series in the chart, and one for multiple series of the same
    * type.</p>
    * @since 6.0.6
    */
  val chartTypes: js.UndefOr[CleanJsObject[LangAccessibilityChartTypes]] = js.undefined

  /**
    * <p>Axis description format strings.</p>
    * @since 6.0.6
    */
  val axis: js.UndefOr[CleanJsObject[LangAccessibilityAxis]] = js.undefined

  /**
    * <p>Exporting menu format strings for accessibility module.</p>
    * @since 6.0.6
    */
  val exporting: js.UndefOr[CleanJsObject[LangAccessibilityExporting]] = js.undefined

  /**
    * <p>Lang configuration for different series types. For more dynamic
    * control over the series element descriptions, see
    * <a href="accessibility.seriesDescriptionFormatter">accessibility.seriesDescriptionFormatter</a>.</p>
    * @since 6.0.6
    */
  val series: js.UndefOr[CleanJsObject[LangAccessibilitySeries]] = js.undefined
}

object LangAccessibility {
  /**
    * @param svgContainerTitle <p>Title element text for the chart SVG element. Leave this. empty to disable adding the title element. Browsers will display. this content when hovering over elements in the chart. Assistive. technology may use this element to label the chart.</p>
    * @param seriesTypeDescriptions <p>Descriptions of lesser known series types. The relevant. description is added to the screen reader information region. when these series types are used.</p>
    * @param chartTypes <p>Chart type description strings. This is added to the chart. information region.</p>. <p>If there is only a single series type used in the chart, we use. the format string for the series type, or default if missing.. There is one format string for cases where there is only a single. series in the chart, and one for multiple series of the same. type.</p>
    * @param axis <p>Axis description format strings.</p>
    * @param exporting <p>Exporting menu format strings for accessibility module.</p>
    * @param series <p>Lang configuration for different series types. For more dynamic. control over the series element descriptions, see. <a href="accessibility.seriesDescriptionFormatter">accessibility.seriesDescriptionFormatter</a>.</p>
    */
  def apply(screenReaderRegionLabel: js.UndefOr[String] = js.undefined, navigationHint: js.UndefOr[String] = js.undefined, defaultChartTitle: js.UndefOr[String] = js.undefined, longDescriptionHeading: js.UndefOr[String] = js.undefined, noDescription: js.UndefOr[String] = js.undefined, structureHeading: js.UndefOr[String] = js.undefined, viewAsDataTable: js.UndefOr[String] = js.undefined, chartHeading: js.UndefOr[String] = js.undefined, chartContainerLabel: js.UndefOr[String] = js.undefined, rangeSelectorMinInput: js.UndefOr[String] = js.undefined, rangeSelectorMaxInput: js.UndefOr[String] = js.undefined, tableSummary: js.UndefOr[String] = js.undefined, mapZoomIn: js.UndefOr[String] = js.undefined, mapZoomOut: js.UndefOr[String] = js.undefined, rangeSelectorButton: js.UndefOr[String] = js.undefined, legendItem: js.UndefOr[String] = js.undefined, svgContainerTitle: js.UndefOr[String] = js.undefined, seriesTypeDescriptions: js.UndefOr[CleanJsObject[LangAccessibilitySeriesTypeDescriptions]] = js.undefined, chartTypes: js.UndefOr[CleanJsObject[LangAccessibilityChartTypes]] = js.undefined, axis: js.UndefOr[CleanJsObject[LangAccessibilityAxis]] = js.undefined, exporting: js.UndefOr[CleanJsObject[LangAccessibilityExporting]] = js.undefined, series: js.UndefOr[CleanJsObject[LangAccessibilitySeries]] = js.undefined): LangAccessibility = {
    val screenReaderRegionLabelOuter: js.UndefOr[String] = screenReaderRegionLabel
    val navigationHintOuter: js.UndefOr[String] = navigationHint
    val defaultChartTitleOuter: js.UndefOr[String] = defaultChartTitle
    val longDescriptionHeadingOuter: js.UndefOr[String] = longDescriptionHeading
    val noDescriptionOuter: js.UndefOr[String] = noDescription
    val structureHeadingOuter: js.UndefOr[String] = structureHeading
    val viewAsDataTableOuter: js.UndefOr[String] = viewAsDataTable
    val chartHeadingOuter: js.UndefOr[String] = chartHeading
    val chartContainerLabelOuter: js.UndefOr[String] = chartContainerLabel
    val rangeSelectorMinInputOuter: js.UndefOr[String] = rangeSelectorMinInput
    val rangeSelectorMaxInputOuter: js.UndefOr[String] = rangeSelectorMaxInput
    val tableSummaryOuter: js.UndefOr[String] = tableSummary
    val mapZoomInOuter: js.UndefOr[String] = mapZoomIn
    val mapZoomOutOuter: js.UndefOr[String] = mapZoomOut
    val rangeSelectorButtonOuter: js.UndefOr[String] = rangeSelectorButton
    val legendItemOuter: js.UndefOr[String] = legendItem
    val svgContainerTitleOuter: js.UndefOr[String] = svgContainerTitle
    val seriesTypeDescriptionsOuter: js.UndefOr[CleanJsObject[LangAccessibilitySeriesTypeDescriptions]] = seriesTypeDescriptions
    val chartTypesOuter: js.UndefOr[CleanJsObject[LangAccessibilityChartTypes]] = chartTypes
    val axisOuter: js.UndefOr[CleanJsObject[LangAccessibilityAxis]] = axis
    val exportingOuter: js.UndefOr[CleanJsObject[LangAccessibilityExporting]] = exporting
    val seriesOuter: js.UndefOr[CleanJsObject[LangAccessibilitySeries]] = series
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibility {
      override val screenReaderRegionLabel: js.UndefOr[String] = screenReaderRegionLabelOuter
      override val navigationHint: js.UndefOr[String] = navigationHintOuter
      override val defaultChartTitle: js.UndefOr[String] = defaultChartTitleOuter
      override val longDescriptionHeading: js.UndefOr[String] = longDescriptionHeadingOuter
      override val noDescription: js.UndefOr[String] = noDescriptionOuter
      override val structureHeading: js.UndefOr[String] = structureHeadingOuter
      override val viewAsDataTable: js.UndefOr[String] = viewAsDataTableOuter
      override val chartHeading: js.UndefOr[String] = chartHeadingOuter
      override val chartContainerLabel: js.UndefOr[String] = chartContainerLabelOuter
      override val rangeSelectorMinInput: js.UndefOr[String] = rangeSelectorMinInputOuter
      override val rangeSelectorMaxInput: js.UndefOr[String] = rangeSelectorMaxInputOuter
      override val tableSummary: js.UndefOr[String] = tableSummaryOuter
      override val mapZoomIn: js.UndefOr[String] = mapZoomInOuter
      override val mapZoomOut: js.UndefOr[String] = mapZoomOutOuter
      override val rangeSelectorButton: js.UndefOr[String] = rangeSelectorButtonOuter
      override val legendItem: js.UndefOr[String] = legendItemOuter
      override val svgContainerTitle: js.UndefOr[String] = svgContainerTitleOuter
      override val seriesTypeDescriptions: js.UndefOr[CleanJsObject[LangAccessibilitySeriesTypeDescriptions]] = seriesTypeDescriptionsOuter
      override val chartTypes: js.UndefOr[CleanJsObject[LangAccessibilityChartTypes]] = chartTypesOuter
      override val axis: js.UndefOr[CleanJsObject[LangAccessibilityAxis]] = axisOuter
      override val exporting: js.UndefOr[CleanJsObject[LangAccessibilityExporting]] = exportingOuter
      override val series: js.UndefOr[CleanJsObject[LangAccessibilitySeries]] = seriesOuter
    })
  }
}
