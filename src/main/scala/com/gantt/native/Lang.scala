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
  * @note JavaScript name: <code>lang</code>
  */
class Lang extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Configure the accessibility strings in the chart. Requires the
    * <a href="https://code.highcharts.com/modules/accessibility.js">accessibility module</a>
    * to be loaded. For a description of the module and information on its
    * features, see
    * <a href="https://www.highcharts.com/docs/chart-concepts/accessibility">Highcharts Accessibility</a>.</p>
    * <p>For more dynamic control over the accessibility functionality, see
    * <a href="#accessibility.point.descriptionFormatter">accessibility.point.descriptionFormatter</a>,
    * <a href="#accessibility.series.descriptionFormatter">accessibility.series.descriptionFormatter</a>,
    * and
    * <a href="#accessibility.screenReaderSection.beforeChartFormatter">accessibility.screenReaderSection.beforeChartFormatter</a>.</p>
    * @since 6.0.6
    */
  var accessibility: js.Any = js.undefined

  /**
    * <p>Exporting module menu. The tooltip title for the context menu holding
    * print and export menu items.</p>
    * @since 3.0.0
    */
  var contextButtonTitle: js.UndefOr[String] = js.undefined

  /**
    * <p>The default decimal point used in the <code>Highcharts.numberFormat</code>
    * method unless otherwise specified in the function arguments.</p>
    * @since 1.2.2
    */
  var decimalPoint: js.UndefOr[String] = js.undefined

  /**
    * <p>The text for the menu item.</p>
    * @since 6.0.0
    */
  var downloadCSV: js.UndefOr[String] = js.undefined

  /**
    * <p>Exporting module only. The text for the JPEG download menu item.</p>
    * @since 2.0.0
    */
  var downloadJPEG: js.UndefOr[String] = js.undefined

  /**
    * <p>Exporting module only. The text for the PDF download menu item.</p>
    * @since 2.0.0
    */
  var downloadPDF: js.UndefOr[String] = js.undefined

  /**
    * <p>Exporting module only. The text for the PNG download menu item.</p>
    * @since 2.0.0
    */
  var downloadPNG: js.UndefOr[String] = js.undefined

  /**
    * <p>Exporting module only. The text for the SVG download menu item.</p>
    * @since 2.0.0
    */
  var downloadSVG: js.UndefOr[String] = js.undefined

  /**
    * <p>The text for the menu item.</p>
    * @since 6.0.0
    */
  var downloadXLS: js.UndefOr[String] = js.undefined

  /**
    * <p>The text for the button that appears when drilling down, linking back
    * to the parent series. The parent series&#39; name is inserted for
    * <code>{series.name}</code>.</p>
    * @since 3.0.8
    */
  var drillUpText: js.UndefOr[String] = js.undefined

  /**
    * <p>Exporting module only. The text for the menu item to exit the chart
    * from full screen.</p>
    * @since 8.0.1
    */
  var exitFullscreen: js.UndefOr[String] = js.undefined

  /**
    * <p>The text for exported table.</p>
    * @since 8.1.0
    */
  var exportData: js.Any = js.undefined

  /**
    * <p>The text for the menu item.</p>
    * @since 8.2.0
    */
  var hideData: js.UndefOr[String] = js.undefined

  /**
    * <p>What to show in a date field for invalid dates. Defaults to an empty
    * string.</p>
    * @since 4.1.8
    */
  var invalidDate: js.UndefOr[String] = js.undefined

  /**
    * <p>The loading text that appears when the chart is set into the loading
    * state following a call to <code>chart.showLoading</code>.</p>
    */
  var loading: js.UndefOr[String] = js.undefined

  /**
    * <p>An array containing the months names. Corresponds to the <code>%B</code> format
    * in <code>Highcharts.dateFormat()</code>.</p>
    */
  var months: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>Configure the Popup strings in the chart. Requires the
    * <code>annotations.js</code> or <code>annotations-advanced.src.js</code> module to be
    * loaded.</p>
    * @since 7.0.0
    */
  var navigation: js.Any = js.undefined

  /**
    * <p>The text to display when the chart contains no data.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-line">No-data text</a>
    * @since 3.0.8
    */
  var noData: js.UndefOr[String] = js.undefined

  /**
    * <p>The magnitude of <a href="#lang.numericSymbol">numericSymbols</a> replacements.
    * Use 10000 for Japanese, Korean and various Chinese locales, which
    * use symbols for 10^4, 10^8 and 10^12.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/numericsymbolmagnitude/">10000 magnitude for Japanese</a>
    * @since 5.0.3
    */
  var numericSymbolMagnitude: js.UndefOr[Double] = js.undefined

  /**
    * <p><a href="https://en.wikipedia.org/wiki/Metric_prefix">Metric prefixes</a> used
    * to shorten high numbers in axis labels. Replacing any of the
    * positions with <code>null</code> causes the full number to be written. Setting
    * <code>numericSymbols</code> to <code>null</code> disables shortening altogether.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/numericsymbols/">Replacing the symbols with text</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/numericsymbols/">Replacing the symbols with text</a>
    * @since 2.3.0
    */
  var numericSymbols: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>Exporting module only. The text for the menu item to print the chart.</p>
    * @since 3.0.1
    */
  var printChart: js.UndefOr[String] = js.undefined

  /**
    * <p>The text for the label for the &quot;from&quot; input box in the range
    * selector. Since v9.0, this string is empty as the label is not
    * rendered by default.</p>
    */
  var rangeSelectorFrom: js.UndefOr[String] = js.undefined

  /**
    * <p>The text for the label for the &quot;to&quot; input box in the range selector.</p>
    */
  var rangeSelectorTo: js.UndefOr[String] = js.undefined

  /**
    * <p>The text for the label for the range selector buttons.</p>
    */
  var rangeSelectorZoom: js.UndefOr[String] = js.undefined

  /**
    * <p>The text for the label appearing when a chart is zoomed.</p>
    * @since 1.2.4
    */
  var resetZoom: js.UndefOr[String] = js.undefined

  /**
    * <p>The tooltip title for the label appearing when a chart is zoomed.</p>
    * @since 1.2.4
    */
  var resetZoomTitle: js.UndefOr[String] = js.undefined

  /**
    * <p>An array containing the months names in abbreviated form. Corresponds
    * to the <code>%b</code> format in <code>Highcharts.dateFormat()</code>.</p>
    */
  var shortMonths: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>Short week days, starting Sunday. If not specified, Highcharts uses
    * the first three letters of the <code>lang.weekdays</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/shortweekdays/">Finnish two-letter abbreviations</a>
    * @since 4.2.4
    */
  var shortWeekdays: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>Configure the stockTools GUI titles(hints) in the chart. Requires
    * the <code>stock-tools.js</code> module to be loaded.</p>
    * @since 7.0.0
    */
  var stockTools: js.Any = js.undefined

  /**
    * <p>The default thousands separator used in the <code>Highcharts.numberFormat</code>
    * method unless otherwise specified in the function arguments. Defaults
    * to a single space character, which is recommended in
    * <a href="https://en.wikipedia.org/wiki/ISO_31-0#Numbers">ISO 31-0</a> and works
    * across Anglo-American and continental European languages.</p>
    * @since 1.2.2
    */
  var thousandsSep: js.UndefOr[String] = js.undefined

  /**
    * <p>The text for the menu item.</p>
    * @since 6.0.0
    */
  var viewData: js.UndefOr[String] = js.undefined

  /**
    * <p>Exporting module only. The text for the menu item to view the chart
    * in full screen.</p>
    * @since 8.0.1
    */
  var viewFullscreen: js.UndefOr[String] = js.undefined

  /**
    * <p>An array containing the weekday names.</p>
    */
  var weekdays: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>The title appearing on hovering the zoom in button. The text itself
    * defaults to &quot;+&quot; and can be changed in the button options.</p>
    */
  var zoomIn: js.UndefOr[String] = js.undefined

  /**
    * <p>The title appearing on hovering the zoom out button. The text itself
    * defaults to &quot;-&quot; and can be changed in the button options.</p>
    */
  var zoomOut: js.UndefOr[String] = js.undefined
}

object Lang {
  /**
    * @param accessibility <p>Configure the accessibility strings in the chart. Requires the. <a href="https://code.highcharts.com/modules/accessibility.js">accessibility module</a>. to be loaded. For a description of the module and information on its. features, see. <a href="https://www.highcharts.com/docs/chart-concepts/accessibility">Highcharts Accessibility</a>.</p>. <p>For more dynamic control over the accessibility functionality, see. <a href="#accessibility.point.descriptionFormatter">accessibility.point.descriptionFormatter</a>,. <a href="#accessibility.series.descriptionFormatter">accessibility.series.descriptionFormatter</a>,. and. <a href="#accessibility.screenReaderSection.beforeChartFormatter">accessibility.screenReaderSection.beforeChartFormatter</a>.</p>
    * @param contextButtonTitle <p>Exporting module menu. The tooltip title for the context menu holding. print and export menu items.</p>
    * @param decimalPoint <p>The default decimal point used in the <code>Highcharts.numberFormat</code>. method unless otherwise specified in the function arguments.</p>
    * @param downloadCSV <p>The text for the menu item.</p>
    * @param downloadJPEG <p>Exporting module only. The text for the JPEG download menu item.</p>
    * @param downloadPDF <p>Exporting module only. The text for the PDF download menu item.</p>
    * @param downloadPNG <p>Exporting module only. The text for the PNG download menu item.</p>
    * @param downloadSVG <p>Exporting module only. The text for the SVG download menu item.</p>
    * @param downloadXLS <p>The text for the menu item.</p>
    * @param drillUpText <p>The text for the button that appears when drilling down, linking back. to the parent series. The parent series&#39; name is inserted for. <code>{series.name}</code>.</p>
    * @param exitFullscreen <p>Exporting module only. The text for the menu item to exit the chart. from full screen.</p>
    * @param exportData <p>The text for exported table.</p>
    * @param hideData <p>The text for the menu item.</p>
    * @param invalidDate <p>What to show in a date field for invalid dates. Defaults to an empty. string.</p>
    * @param loading <p>The loading text that appears when the chart is set into the loading. state following a call to <code>chart.showLoading</code>.</p>
    * @param months <p>An array containing the months names. Corresponds to the <code>%B</code> format. in <code>Highcharts.dateFormat()</code>.</p>
    * @param navigation <p>Configure the Popup strings in the chart. Requires the. <code>annotations.js</code> or <code>annotations-advanced.src.js</code> module to be. loaded.</p>
    * @param noData <p>The text to display when the chart contains no data.</p>
    * @param numericSymbolMagnitude <p>The magnitude of <a href="#lang.numericSymbol">numericSymbols</a> replacements.. Use 10000 for Japanese, Korean and various Chinese locales, which. use symbols for 10^4, 10^8 and 10^12.</p>
    * @param numericSymbols <p><a href="https://en.wikipedia.org/wiki/Metric_prefix">Metric prefixes</a> used. to shorten high numbers in axis labels. Replacing any of the. positions with <code>null</code> causes the full number to be written. Setting. <code>numericSymbols</code> to <code>null</code> disables shortening altogether.</p>
    * @param printChart <p>Exporting module only. The text for the menu item to print the chart.</p>
    * @param rangeSelectorFrom <p>The text for the label for the &quot;from&quot; input box in the range. selector. Since v9.0, this string is empty as the label is not. rendered by default.</p>
    * @param rangeSelectorTo <p>The text for the label for the &quot;to&quot; input box in the range selector.</p>
    * @param rangeSelectorZoom <p>The text for the label for the range selector buttons.</p>
    * @param resetZoom <p>The text for the label appearing when a chart is zoomed.</p>
    * @param resetZoomTitle <p>The tooltip title for the label appearing when a chart is zoomed.</p>
    * @param shortMonths <p>An array containing the months names in abbreviated form. Corresponds. to the <code>%b</code> format in <code>Highcharts.dateFormat()</code>.</p>
    * @param shortWeekdays <p>Short week days, starting Sunday. If not specified, Highcharts uses. the first three letters of the <code>lang.weekdays</code> option.</p>
    * @param stockTools <p>Configure the stockTools GUI titles(hints) in the chart. Requires. the <code>stock-tools.js</code> module to be loaded.</p>
    * @param thousandsSep <p>The default thousands separator used in the <code>Highcharts.numberFormat</code>. method unless otherwise specified in the function arguments. Defaults. to a single space character, which is recommended in. <a href="https://en.wikipedia.org/wiki/ISO_31-0#Numbers">ISO 31-0</a> and works. across Anglo-American and continental European languages.</p>
    * @param viewData <p>The text for the menu item.</p>
    * @param viewFullscreen <p>Exporting module only. The text for the menu item to view the chart. in full screen.</p>
    * @param weekdays <p>An array containing the weekday names.</p>
    * @param zoomIn <p>The title appearing on hovering the zoom in button. The text itself. defaults to &quot;+&quot; and can be changed in the button options.</p>
    * @param zoomOut <p>The title appearing on hovering the zoom out button. The text itself. defaults to &quot;-&quot; and can be changed in the button options.</p>
    */
  def apply(accessibility: js.UndefOr[js.Any] = js.undefined, contextButtonTitle: js.UndefOr[String] = js.undefined, decimalPoint: js.UndefOr[String] = js.undefined, downloadCSV: js.UndefOr[String] = js.undefined, downloadJPEG: js.UndefOr[String] = js.undefined, downloadPDF: js.UndefOr[String] = js.undefined, downloadPNG: js.UndefOr[String] = js.undefined, downloadSVG: js.UndefOr[String] = js.undefined, downloadXLS: js.UndefOr[String] = js.undefined, drillUpText: js.UndefOr[String] = js.undefined, exitFullscreen: js.UndefOr[String] = js.undefined, exportData: js.UndefOr[js.Any] = js.undefined, hideData: js.UndefOr[String] = js.undefined, invalidDate: js.UndefOr[String] = js.undefined, loading: js.UndefOr[String] = js.undefined, months: js.UndefOr[js.Array[String]] = js.undefined, navigation: js.UndefOr[js.Any] = js.undefined, noData: js.UndefOr[String] = js.undefined, numericSymbolMagnitude: js.UndefOr[Double] = js.undefined, numericSymbols: js.UndefOr[js.Array[String]] = js.undefined, printChart: js.UndefOr[String] = js.undefined, rangeSelectorFrom: js.UndefOr[String] = js.undefined, rangeSelectorTo: js.UndefOr[String] = js.undefined, rangeSelectorZoom: js.UndefOr[String] = js.undefined, resetZoom: js.UndefOr[String] = js.undefined, resetZoomTitle: js.UndefOr[String] = js.undefined, shortMonths: js.UndefOr[js.Array[String]] = js.undefined, shortWeekdays: js.UndefOr[js.Array[String]] = js.undefined, stockTools: js.UndefOr[js.Any] = js.undefined, thousandsSep: js.UndefOr[String] = js.undefined, viewData: js.UndefOr[String] = js.undefined, viewFullscreen: js.UndefOr[String] = js.undefined, weekdays: js.UndefOr[js.Array[String]] = js.undefined, zoomIn: js.UndefOr[String] = js.undefined, zoomOut: js.UndefOr[String] = js.undefined): Lang = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Lang {
      this.accessibility = accessibility
      this.contextButtonTitle = contextButtonTitle
      this.decimalPoint = decimalPoint
      this.downloadCSV = downloadCSV
      this.downloadJPEG = downloadJPEG
      this.downloadPDF = downloadPDF
      this.downloadPNG = downloadPNG
      this.downloadSVG = downloadSVG
      this.downloadXLS = downloadXLS
      this.drillUpText = drillUpText
      this.exitFullscreen = exitFullscreen
      this.exportData = exportData
      this.hideData = hideData
      this.invalidDate = invalidDate
      this.loading = loading
      this.months = months
      this.navigation = navigation
      this.noData = noData
      this.numericSymbolMagnitude = numericSymbolMagnitude
      this.numericSymbols = numericSymbols
      this.printChart = printChart
      this.rangeSelectorFrom = rangeSelectorFrom
      this.rangeSelectorTo = rangeSelectorTo
      this.rangeSelectorZoom = rangeSelectorZoom
      this.resetZoom = resetZoom
      this.resetZoomTitle = resetZoomTitle
      this.shortMonths = shortMonths
      this.shortWeekdays = shortWeekdays
      this.stockTools = stockTools
      this.thousandsSep = thousandsSep
      this.viewData = viewData
      this.viewFullscreen = viewFullscreen
      this.weekdays = weekdays
      this.zoomIn = zoomIn
      this.zoomOut = zoomOut
    })
  }
}
