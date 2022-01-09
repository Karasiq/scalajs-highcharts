/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>lang-accessibility</code>
  */
class LangAccessibility extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Default announcement for new data in charts. If addPoint or
    * addSeries is used, and only one series/point is added, the
    * <code>newPointAnnounce</code> and <code>newSeriesAnnounce</code> strings are used.
    * The <code>...Single</code> versions will be used if there is only one chart
    * on the page, and the <code>...Multiple</code> versions will be used if there
    * are multiple charts on the page. For all other new data events,
    * the <code>newDataAnnounce</code> string will be used.</p>
    * @since 7.1.0
    */
  var announceNewData: js.Any = js.undefined

  /**
    * <p>Axis description format strings.</p>
    * @since 6.0.6
    */
  var axis: js.Any = js.undefined

  var chartContainerLabel: js.UndefOr[String] = js.undefined

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
  var chartTypes: js.Any = js.undefined

  var credits: js.UndefOr[String] = js.undefined

  var defaultChartTitle: js.UndefOr[String] = js.undefined

  var drillUpButton: js.UndefOr[String] = js.undefined

  /**
    * <p>Exporting menu format strings for accessibility module.</p>
    * @since 6.0.6
    */
  var exporting: js.Any = js.undefined

  /**
    * <p>Set a label on the container wrapping the SVG.</p>
    * @since 8.0.0
    */
  var graphicContainerLabel: js.UndefOr[String] = js.undefined

  /**
    * <p>Language options for accessibility of the legend.</p>
    * @since 8.0.0
    */
  var legend: js.Any = js.undefined

  /**
    * <p>Range selector language options for accessibility.</p>
    * @since 8.0.0
    */
  var rangeSelector: js.Any = js.undefined

  /**
    * <p>Language options for the screen reader information sections added
    * before and after the charts.</p>
    * @since 8.0.0
    */
  var screenReaderSection: js.Any = js.undefined

  /**
    * <p>Lang configuration for different series types. For more dynamic
    * control over the series element descriptions, see
    * <a href="#accessibility.seriesDescriptionFormatter">accessibility.seriesDescriptionFormatter</a>.</p>
    * @since 6.0.6
    */
  var series: js.Any = js.undefined

  /**
    * <p>Descriptions of lesser known series types. The relevant
    * description is added to the screen reader information region
    * when these series types are used.</p>
    * @since 6.0.6
    */
  var seriesTypeDescriptions: js.Any = js.undefined

  /**
    * <p>Language options for sonification.</p>
    * @since 8.0.1
    */
  var sonification: js.Any = js.undefined

  var svgContainerLabel: js.UndefOr[String] = js.undefined

  /**
    * <p>Title element text for the chart SVG element. Leave this
    * empty to disable adding the title element. Browsers will display
    * this content when hovering over elements in the chart. Assistive
    * technology may use this element to label the chart.</p>
    * @since 6.0.8
    */
  var svgContainerTitle: js.UndefOr[String] = js.undefined

  /**
    * <p>Accessibility language options for the data table.</p>
    * @since 8.0.0
    */
  var table: js.Any = js.undefined

  /**
    * <p>Thousands separator to use when formatting numbers for screen
    * readers. Note that many screen readers will not handle space as a
    * thousands separator, and will consider &quot;11 700&quot; as two numbers.</p>
    * <p>Set to <code>null</code> to use the separator defined in
    * <a href="lang.thousandsSep">lang.thousandsSep</a>.</p>
    * @since 7.1.0
    */
  var thousandsSep: js.UndefOr[String] = js.undefined

  /**
    * <p>Chart and map zoom accessibility language options.</p>
    * @since 8.0.0
    */
  var zoom: js.Any = js.undefined
}

object LangAccessibility {
  /**
    * @param announceNewData <p>Default announcement for new data in charts. If addPoint or. addSeries is used, and only one series/point is added, the. <code>newPointAnnounce</code> and <code>newSeriesAnnounce</code> strings are used.. The <code>...Single</code> versions will be used if there is only one chart. on the page, and the <code>...Multiple</code> versions will be used if there. are multiple charts on the page. For all other new data events,. the <code>newDataAnnounce</code> string will be used.</p>
    * @param axis <p>Axis description format strings.</p>
    * @param chartTypes <p>Chart type description strings. This is added to the chart. information region.</p>. <p>If there is only a single series type used in the chart, we use. the format string for the series type, or default if missing.. There is one format string for cases where there is only a single. series in the chart, and one for multiple series of the same. type.</p>
    * @param exporting <p>Exporting menu format strings for accessibility module.</p>
    * @param graphicContainerLabel <p>Set a label on the container wrapping the SVG.</p>
    * @param legend <p>Language options for accessibility of the legend.</p>
    * @param rangeSelector <p>Range selector language options for accessibility.</p>
    * @param screenReaderSection <p>Language options for the screen reader information sections added. before and after the charts.</p>
    * @param series <p>Lang configuration for different series types. For more dynamic. control over the series element descriptions, see. <a href="#accessibility.seriesDescriptionFormatter">accessibility.seriesDescriptionFormatter</a>.</p>
    * @param seriesTypeDescriptions <p>Descriptions of lesser known series types. The relevant. description is added to the screen reader information region. when these series types are used.</p>
    * @param sonification <p>Language options for sonification.</p>
    * @param svgContainerTitle <p>Title element text for the chart SVG element. Leave this. empty to disable adding the title element. Browsers will display. this content when hovering over elements in the chart. Assistive. technology may use this element to label the chart.</p>
    * @param table <p>Accessibility language options for the data table.</p>
    * @param thousandsSep <p>Thousands separator to use when formatting numbers for screen. readers. Note that many screen readers will not handle space as a. thousands separator, and will consider &quot;11 700&quot; as two numbers.</p>. <p>Set to <code>null</code> to use the separator defined in. <a href="lang.thousandsSep">lang.thousandsSep</a>.</p>
    * @param zoom <p>Chart and map zoom accessibility language options.</p>
    */
  def apply(announceNewData: js.UndefOr[js.Any] = js.undefined, axis: js.UndefOr[js.Any] = js.undefined, chartContainerLabel: js.UndefOr[String] = js.undefined, chartTypes: js.UndefOr[js.Any] = js.undefined, credits: js.UndefOr[String] = js.undefined, defaultChartTitle: js.UndefOr[String] = js.undefined, drillUpButton: js.UndefOr[String] = js.undefined, exporting: js.UndefOr[js.Any] = js.undefined, graphicContainerLabel: js.UndefOr[String] = js.undefined, legend: js.UndefOr[js.Any] = js.undefined, rangeSelector: js.UndefOr[js.Any] = js.undefined, screenReaderSection: js.UndefOr[js.Any] = js.undefined, series: js.UndefOr[js.Any] = js.undefined, seriesTypeDescriptions: js.UndefOr[js.Any] = js.undefined, sonification: js.UndefOr[js.Any] = js.undefined, svgContainerLabel: js.UndefOr[String] = js.undefined, svgContainerTitle: js.UndefOr[String] = js.undefined, table: js.UndefOr[js.Any] = js.undefined, thousandsSep: js.UndefOr[String] = js.undefined, zoom: js.UndefOr[js.Any] = js.undefined): LangAccessibility = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibility {
      this.announceNewData = announceNewData
      this.axis = axis
      this.chartContainerLabel = chartContainerLabel
      this.chartTypes = chartTypes
      this.credits = credits
      this.defaultChartTitle = defaultChartTitle
      this.drillUpButton = drillUpButton
      this.exporting = exporting
      this.graphicContainerLabel = graphicContainerLabel
      this.legend = legend
      this.rangeSelector = rangeSelector
      this.screenReaderSection = screenReaderSection
      this.series = series
      this.seriesTypeDescriptions = seriesTypeDescriptions
      this.sonification = sonification
      this.svgContainerLabel = svgContainerLabel
      this.svgContainerTitle = svgContainerTitle
      this.table = table
      this.thousandsSep = thousandsSep
      this.zoom = zoom
    })
  }
}
