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
  * @note JavaScript name: <code>lang</code>
  */
@js.annotation.ScalaJSDefined
class Lang extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Configure the accessibility strings in the chart. Requires the
    * [accessibility module](//code.highcharts.com/modules/accessibility.
    * js) to be loaded. For a description of the module and information
    * on its features, see [Highcharts Accessibility](<a href="http://www.highcharts">http://www.highcharts</a>.
    * com/docs/chart-concepts/accessibility).</p>
    * <p>For more dynamic control over the accessibility functionality, see
    * <a href="accessibility.pointDescriptionFormatter">accessibility.pointDescriptionFormatter</a>,
    * <a href="accessibility.seriesDescriptionFormatter">accessibility.seriesDescriptionFormatter</a>, and
    * <a href="accessibility.screenReaderSectionFormatter">accessibility.screenReaderSectionFormatter</a>.</p>
    * @since 6.0.6
    */
  val accessibility: js.UndefOr[CleanJsObject[LangAccessibility]] = js.undefined

  /**
    * <p>The text for the button that appears when drilling down, linking
    * back to the parent series. The parent series&#39; name is inserted for
    * <code>{series.name}</code>.</p>
    * @since 3.0.8
    */
  val drillUpText: js.UndefOr[String] = js.undefined

  /**
    * <p>Export-data module only. The text for the menu item.</p>
    * @since 6.0.0
    */
  val downloadCSV: js.UndefOr[String] = js.undefined

  /**
    * <p>Export-data module only. The text for the menu item.</p>
    * @since 6.0.0
    */
  val downloadXLS: js.UndefOr[String] = js.undefined

  /**
    * <p>Export-data module only. The text for the menu item.</p>
    * @since 6.1.0
    */
  val openInCloud: js.UndefOr[String] = js.undefined

  /**
    * <p>Export-data module only. The text for the menu item.</p>
    * @since 6.0.0
    */
  val viewData: js.UndefOr[String] = js.undefined

  /**
    * <p>Exporting module only. The text for the menu item to print the chart.</p>
    * @since 3.0.1
    */
  val printChart: js.UndefOr[String] = js.undefined

  /**
    * <p>Exporting module only. The text for the PNG download menu item.</p>
    * @since 2.0
    */
  val downloadPNG: js.UndefOr[String] = js.undefined

  /**
    * <p>Exporting module only. The text for the JPEG download menu item.</p>
    * @since 2.0
    */
  val downloadJPEG: js.UndefOr[String] = js.undefined

  /**
    * <p>Exporting module only. The text for the PDF download menu item.</p>
    * @since 2.0
    */
  val downloadPDF: js.UndefOr[String] = js.undefined

  /**
    * <p>Exporting module only. The text for the SVG download menu item.</p>
    * @since 2.0
    */
  val downloadSVG: js.UndefOr[String] = js.undefined

  /**
    * <p>Exporting module menu. The tooltip title for the context menu holding
    * print and export menu items.</p>
    * @since 3.0
    */
  val contextButtonTitle: js.UndefOr[String] = js.undefined

  /**
    * <p>The text to display when the chart contains no data. Requires the
    * no-data module, see <a href="#noData">noData</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-line">No-data text</a>
    * @since 3.0.8
    */
  val noData: js.UndefOr[String] = js.undefined

  /**
    * <p>The loading text that appears when the chart is set into the loading
    * state following a call to <code>chart.showLoading</code>.</p>
    */
  val loading: js.UndefOr[String] = js.undefined

  /**
    * <p>An array containing the months names. Corresponds to the <code>%B</code> format
    * in <code>Highcharts.dateFormat()</code>.</p>
    */
  val months: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>An array containing the months names in abbreviated form. Corresponds
    * to the <code>%b</code> format in <code>Highcharts.dateFormat()</code>.</p>
    */
  val shortMonths: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>An array containing the weekday names.</p>
    */
  val weekdays: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>The default decimal point used in the <code>Highcharts.numberFormat</code>
    * method unless otherwise specified in the function arguments.</p>
    * @since 1.2.2
    */
  val decimalPoint: js.UndefOr[String] = js.undefined

  /**
    * <p><a href="http://en.wikipedia.org/wiki/Metric_prefix">Metric prefixes</a> used
    * to shorten high numbers in axis labels. Replacing any of the
    * positions with <code>null</code> causes the full number to be written. Setting
    * <code>numericSymbols</code> to <code>null</code> disables shortening altogether.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/numericsymbols/">Replacing the symbols with text</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/numericsymbols/">Replacing the symbols with text</a>
    * @since 2.3.0
    */
  val numericSymbols: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>The text for the label appearing when a chart is zoomed.</p>
    * @since 1.2.4
    */
  val resetZoom: js.UndefOr[String] = js.undefined

  /**
    * <p>The tooltip title for the label appearing when a chart is zoomed.</p>
    * @since 1.2.4
    */
  val resetZoomTitle: js.UndefOr[String] = js.undefined

  /**
    * <p>The default thousands separator used in the <code>Highcharts.numberFormat</code>
    * method unless otherwise specified in the function arguments. Since
    * Highcharts 4.1 it defaults to a single space character, which is
    * compatible with ISO and works across Anglo-American and continental
    * European languages.</p>
    * <p>The default is a single space.</p>
    * @since 1.2.2
    */
  val thousandsSep: js.UndefOr[String] = js.undefined

  /**
    * <p>Short week days, starting Sunday. If not specified, Highcharts uses
    * the first three letters of the <code>lang.weekdays</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/shortweekdays/">Finnish two-letter abbreviations</a>
    * @since 4.2.4
    */
  val shortWeekdays: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>What to show in a date field for invalid dates. Defaults to an empty
    * string.</p>
    * @since 4.1.8
    */
  val invalidDate: js.UndefOr[String] = js.undefined

  /**
    * <p>The title appearing on hovering the zoom in button. The text itself
    * defaults to &quot;+&quot; and can be changed in the button options.</p>
    */
  val zoomIn: js.UndefOr[String] = js.undefined

  /**
    * <p>The title appearing on hovering the zoom out button. The text itself
    * defaults to &quot;-&quot; and can be changed in the button options.</p>
    */
  val zoomOut: js.UndefOr[String] = js.undefined

  /**
    * <p>The magnitude of <a href="#lang.numericSymbol">numericSymbols</a> replacements.
    * Use 10000 for Japanese, Korean and various Chinese locales, which
    * use symbols for 10^4, 10^8 and 10^12.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/numericsymbolmagnitude/">10000 magnitude for Japanese</a>
    * @since 5.0.3
    */
  val numericSymbolMagnitude: js.UndefOr[Double] = js.undefined

  /**
    * <p>The text for the label for the range selector buttons.</p>
    */
  val rangeSelectorZoom: js.UndefOr[String] = js.undefined

  /**
    * <p>The text for the label for the &quot;from&quot; input box in the range
    * selector.</p>
    */
  val rangeSelectorFrom: js.UndefOr[String] = js.undefined

  /**
    * <p>The text for the label for the &quot;to&quot; input box in the range selector.</p>
    */
  val rangeSelectorTo: js.UndefOr[String] = js.undefined
}

object Lang {
  /**
    * @param accessibility <p>Configure the accessibility strings in the chart. Requires the. [accessibility module](//code.highcharts.com/modules/accessibility.. js) to be loaded. For a description of the module and information. on its features, see [Highcharts Accessibility](<a href="http://www.highcharts">http://www.highcharts</a>.. com/docs/chart-concepts/accessibility).</p>. <p>For more dynamic control over the accessibility functionality, see. <a href="accessibility.pointDescriptionFormatter">accessibility.pointDescriptionFormatter</a>,. <a href="accessibility.seriesDescriptionFormatter">accessibility.seriesDescriptionFormatter</a>, and. <a href="accessibility.screenReaderSectionFormatter">accessibility.screenReaderSectionFormatter</a>.</p>
    * @param drillUpText <p>The text for the button that appears when drilling down, linking. back to the parent series. The parent series&#39; name is inserted for. <code>{series.name}</code>.</p>
    * @param downloadCSV <p>Export-data module only. The text for the menu item.</p>
    * @param downloadXLS <p>Export-data module only. The text for the menu item.</p>
    * @param openInCloud <p>Export-data module only. The text for the menu item.</p>
    * @param viewData <p>Export-data module only. The text for the menu item.</p>
    * @param printChart <p>Exporting module only. The text for the menu item to print the chart.</p>
    * @param downloadPNG <p>Exporting module only. The text for the PNG download menu item.</p>
    * @param downloadJPEG <p>Exporting module only. The text for the JPEG download menu item.</p>
    * @param downloadPDF <p>Exporting module only. The text for the PDF download menu item.</p>
    * @param downloadSVG <p>Exporting module only. The text for the SVG download menu item.</p>
    * @param contextButtonTitle <p>Exporting module menu. The tooltip title for the context menu holding. print and export menu items.</p>
    * @param noData <p>The text to display when the chart contains no data. Requires the. no-data module, see <a href="#noData">noData</a>.</p>
    * @param loading <p>The loading text that appears when the chart is set into the loading. state following a call to <code>chart.showLoading</code>.</p>
    * @param months <p>An array containing the months names. Corresponds to the <code>%B</code> format. in <code>Highcharts.dateFormat()</code>.</p>
    * @param shortMonths <p>An array containing the months names in abbreviated form. Corresponds. to the <code>%b</code> format in <code>Highcharts.dateFormat()</code>.</p>
    * @param weekdays <p>An array containing the weekday names.</p>
    * @param decimalPoint <p>The default decimal point used in the <code>Highcharts.numberFormat</code>. method unless otherwise specified in the function arguments.</p>
    * @param numericSymbols <p><a href="http://en.wikipedia.org/wiki/Metric_prefix">Metric prefixes</a> used. to shorten high numbers in axis labels. Replacing any of the. positions with <code>null</code> causes the full number to be written. Setting. <code>numericSymbols</code> to <code>null</code> disables shortening altogether.</p>
    * @param resetZoom <p>The text for the label appearing when a chart is zoomed.</p>
    * @param resetZoomTitle <p>The tooltip title for the label appearing when a chart is zoomed.</p>
    * @param thousandsSep <p>The default thousands separator used in the <code>Highcharts.numberFormat</code>. method unless otherwise specified in the function arguments. Since. Highcharts 4.1 it defaults to a single space character, which is. compatible with ISO and works across Anglo-American and continental. European languages.</p>. <p>The default is a single space.</p>
    * @param shortWeekdays <p>Short week days, starting Sunday. If not specified, Highcharts uses. the first three letters of the <code>lang.weekdays</code> option.</p>
    * @param invalidDate <p>What to show in a date field for invalid dates. Defaults to an empty. string.</p>
    * @param zoomIn <p>The title appearing on hovering the zoom in button. The text itself. defaults to &quot;+&quot; and can be changed in the button options.</p>
    * @param zoomOut <p>The title appearing on hovering the zoom out button. The text itself. defaults to &quot;-&quot; and can be changed in the button options.</p>
    * @param numericSymbolMagnitude <p>The magnitude of <a href="#lang.numericSymbol">numericSymbols</a> replacements.. Use 10000 for Japanese, Korean and various Chinese locales, which. use symbols for 10^4, 10^8 and 10^12.</p>
    * @param rangeSelectorZoom <p>The text for the label for the range selector buttons.</p>
    * @param rangeSelectorFrom <p>The text for the label for the &quot;from&quot; input box in the range. selector.</p>
    * @param rangeSelectorTo <p>The text for the label for the &quot;to&quot; input box in the range selector.</p>
    */
  def apply(accessibility: js.UndefOr[CleanJsObject[LangAccessibility]] = js.undefined, drillUpText: js.UndefOr[String] = js.undefined, downloadCSV: js.UndefOr[String] = js.undefined, downloadXLS: js.UndefOr[String] = js.undefined, openInCloud: js.UndefOr[String] = js.undefined, viewData: js.UndefOr[String] = js.undefined, printChart: js.UndefOr[String] = js.undefined, downloadPNG: js.UndefOr[String] = js.undefined, downloadJPEG: js.UndefOr[String] = js.undefined, downloadPDF: js.UndefOr[String] = js.undefined, downloadSVG: js.UndefOr[String] = js.undefined, contextButtonTitle: js.UndefOr[String] = js.undefined, noData: js.UndefOr[String] = js.undefined, loading: js.UndefOr[String] = js.undefined, months: js.UndefOr[js.Array[String]] = js.undefined, shortMonths: js.UndefOr[js.Array[String]] = js.undefined, weekdays: js.UndefOr[js.Array[String]] = js.undefined, decimalPoint: js.UndefOr[String] = js.undefined, numericSymbols: js.UndefOr[js.Array[String]] = js.undefined, resetZoom: js.UndefOr[String] = js.undefined, resetZoomTitle: js.UndefOr[String] = js.undefined, thousandsSep: js.UndefOr[String] = js.undefined, shortWeekdays: js.UndefOr[js.Array[String]] = js.undefined, invalidDate: js.UndefOr[String] = js.undefined, zoomIn: js.UndefOr[String] = js.undefined, zoomOut: js.UndefOr[String] = js.undefined, numericSymbolMagnitude: js.UndefOr[Double] = js.undefined, rangeSelectorZoom: js.UndefOr[String] = js.undefined, rangeSelectorFrom: js.UndefOr[String] = js.undefined, rangeSelectorTo: js.UndefOr[String] = js.undefined): Lang = {
    val accessibilityOuter: js.UndefOr[CleanJsObject[LangAccessibility]] = accessibility
    val drillUpTextOuter: js.UndefOr[String] = drillUpText
    val downloadCSVOuter: js.UndefOr[String] = downloadCSV
    val downloadXLSOuter: js.UndefOr[String] = downloadXLS
    val openInCloudOuter: js.UndefOr[String] = openInCloud
    val viewDataOuter: js.UndefOr[String] = viewData
    val printChartOuter: js.UndefOr[String] = printChart
    val downloadPNGOuter: js.UndefOr[String] = downloadPNG
    val downloadJPEGOuter: js.UndefOr[String] = downloadJPEG
    val downloadPDFOuter: js.UndefOr[String] = downloadPDF
    val downloadSVGOuter: js.UndefOr[String] = downloadSVG
    val contextButtonTitleOuter: js.UndefOr[String] = contextButtonTitle
    val noDataOuter: js.UndefOr[String] = noData
    val loadingOuter: js.UndefOr[String] = loading
    val monthsOuter: js.UndefOr[js.Array[String]] = months
    val shortMonthsOuter: js.UndefOr[js.Array[String]] = shortMonths
    val weekdaysOuter: js.UndefOr[js.Array[String]] = weekdays
    val decimalPointOuter: js.UndefOr[String] = decimalPoint
    val numericSymbolsOuter: js.UndefOr[js.Array[String]] = numericSymbols
    val resetZoomOuter: js.UndefOr[String] = resetZoom
    val resetZoomTitleOuter: js.UndefOr[String] = resetZoomTitle
    val thousandsSepOuter: js.UndefOr[String] = thousandsSep
    val shortWeekdaysOuter: js.UndefOr[js.Array[String]] = shortWeekdays
    val invalidDateOuter: js.UndefOr[String] = invalidDate
    val zoomInOuter: js.UndefOr[String] = zoomIn
    val zoomOutOuter: js.UndefOr[String] = zoomOut
    val numericSymbolMagnitudeOuter: js.UndefOr[Double] = numericSymbolMagnitude
    val rangeSelectorZoomOuter: js.UndefOr[String] = rangeSelectorZoom
    val rangeSelectorFromOuter: js.UndefOr[String] = rangeSelectorFrom
    val rangeSelectorToOuter: js.UndefOr[String] = rangeSelectorTo
    com.highcharts.HighchartsGenericObject.toCleanObject(new Lang {
      override val accessibility: js.UndefOr[CleanJsObject[LangAccessibility]] = accessibilityOuter
      override val drillUpText: js.UndefOr[String] = drillUpTextOuter
      override val downloadCSV: js.UndefOr[String] = downloadCSVOuter
      override val downloadXLS: js.UndefOr[String] = downloadXLSOuter
      override val openInCloud: js.UndefOr[String] = openInCloudOuter
      override val viewData: js.UndefOr[String] = viewDataOuter
      override val printChart: js.UndefOr[String] = printChartOuter
      override val downloadPNG: js.UndefOr[String] = downloadPNGOuter
      override val downloadJPEG: js.UndefOr[String] = downloadJPEGOuter
      override val downloadPDF: js.UndefOr[String] = downloadPDFOuter
      override val downloadSVG: js.UndefOr[String] = downloadSVGOuter
      override val contextButtonTitle: js.UndefOr[String] = contextButtonTitleOuter
      override val noData: js.UndefOr[String] = noDataOuter
      override val loading: js.UndefOr[String] = loadingOuter
      override val months: js.UndefOr[js.Array[String]] = monthsOuter
      override val shortMonths: js.UndefOr[js.Array[String]] = shortMonthsOuter
      override val weekdays: js.UndefOr[js.Array[String]] = weekdaysOuter
      override val decimalPoint: js.UndefOr[String] = decimalPointOuter
      override val numericSymbols: js.UndefOr[js.Array[String]] = numericSymbolsOuter
      override val resetZoom: js.UndefOr[String] = resetZoomOuter
      override val resetZoomTitle: js.UndefOr[String] = resetZoomTitleOuter
      override val thousandsSep: js.UndefOr[String] = thousandsSepOuter
      override val shortWeekdays: js.UndefOr[js.Array[String]] = shortWeekdaysOuter
      override val invalidDate: js.UndefOr[String] = invalidDateOuter
      override val zoomIn: js.UndefOr[String] = zoomInOuter
      override val zoomOut: js.UndefOr[String] = zoomOutOuter
      override val numericSymbolMagnitude: js.UndefOr[Double] = numericSymbolMagnitudeOuter
      override val rangeSelectorZoom: js.UndefOr[String] = rangeSelectorZoomOuter
      override val rangeSelectorFrom: js.UndefOr[String] = rangeSelectorFromOuter
      override val rangeSelectorTo: js.UndefOr[String] = rangeSelectorToOuter
    })
  }
}
