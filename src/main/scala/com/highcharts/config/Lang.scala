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
  * @note JavaScript name: <code>lang</code>
  */
@js.annotation.ScalaJSDefined
class Lang extends js.Object {

  /**
    * Exporting module menu. The tooltip title for the context menu holding print and export menu items.
    * @since 3.0
    */
  val contextButtonTitle: js.UndefOr[String] = js.undefined

  /**
    * The default decimal point used in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the function arguments.
    * @since 1.2.2
    */
  val decimalPoint: js.UndefOr[String] = js.undefined

  /**
    * Exporting module only. The text for the JPEG download menu item.
    * @since 2.0
    */
  val downloadJPEG: js.UndefOr[String] = js.undefined

  /**
    * Exporting module only. The text for the PDF download menu item.
    * @since 2.0
    */
  val downloadPDF: js.UndefOr[String] = js.undefined

  /**
    * Exporting module only. The text for the PNG download menu item.
    * @since 2.0
    */
  val downloadPNG: js.UndefOr[String] = js.undefined

  /**
    * Exporting module only. The text for the SVG download menu item.
    * @since 2.0
    */
  val downloadSVG: js.UndefOr[String] = js.undefined

  /**
    * The text for the button that appears when drilling down, linking back to the parent series. The parent series' name is inserted for <code>{series.name}</code>.
    * @since 3.0.8
    */
  val drillUpText: js.UndefOr[String] = js.undefined

  /**
    * What to show in a date field for invalid dates. Defaults to an empty string.
    * @since 4.1.8
    */
  val invalidDate: js.UndefOr[String] = js.undefined

  /**
    * The loading text that appears when the chart is set into the loading state following a call to <code>chart.showLoading</code>.
    */
  val loading: js.UndefOr[String] = js.undefined

  /**
    * An array containing the months names. Corresponds to the 
    *  <code>%B</code> format in <code>Highcharts.dateFormat()</code>.
    */
  val months: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * The text to display when the chart contains no data. Requires the no-data module, see <a href="#noData">noData</a>.
    * @since 3.0.8
    */
  val noData: js.UndefOr[String] = js.undefined

  /**
    * The magnitude of <a href="#lang.numericSymbol">numericSymbols</a> replacements. Use 10000 for Japanese, Korean and various Chinese locales, which use symbols for 10^4, 10^8 and 10^12.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/numericsymbolmagnitude/" target="_blank">10000 magnitude for Japanese</a>
    * @since 5.0.3
    */
  val numericSymbolMagnitude: js.UndefOr[Double] = js.undefined

  /**
    * <a href="http://en.wikipedia.org/wiki/Metric_prefix">Metric prefixes</a> used to shorten high numbers in axis labels. Replacing any of the positions with <code>null</code> causes the full number to be written. Setting <code>numericSymbols</code> to <code>null</code> disables shortening altogether.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/numericsymbols/" target="_blank">Replacing the symbols with text</a>
    * @since 2.3.0
    */
  val numericSymbols: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * Exporting module only. The text for the menu item to print the chart.
    * @since 3.0.1
    */
  val printChart: js.UndefOr[String] = js.undefined

  /**
    * The text for the label appearing when a chart is zoomed.
    * @since 1.2.4
    */
  val resetZoom: js.UndefOr[String] = js.undefined

  /**
    * The tooltip title for the label appearing when a chart is zoomed.
    * @since 1.2.4
    */
  val resetZoomTitle: js.UndefOr[String] = js.undefined

  /**
    * An array containing the months names in abbreviated form. Corresponds to the 
    *  <code>%b</code> format in <code>Highcharts.dateFormat()</code>. 
    */
  val shortMonths: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * Short week days, starting Sunday. If not specified, Highcharts uses the first three letters of the <code>lang.weekdays</code> option.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/shortweekdays/" target="_blank">Finnish two-letter abbreviations</a>.
    * @since 4.2.4
    */
  val shortWeekdays: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>The default thousands separator used in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the function arguments. Since Highcharts 4.1 it defaults to a single space character, which is compatible with ISO and works across Anglo-American and continental European languages.</p>
    * 
    * <p>The default is a single space.</p>
    * @since 1.2.2
    */
  val thousandsSep: js.UndefOr[String] = js.undefined

  /**
    * An array containing the weekday names.		 
    */
  val weekdays: js.UndefOr[js.Array[String]] = js.undefined
}

object Lang {
  /**
    * @param contextButtonTitle Exporting module menu. The tooltip title for the context menu holding print and export menu items.
    * @param decimalPoint The default decimal point used in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the function arguments.
    * @param downloadJPEG Exporting module only. The text for the JPEG download menu item.
    * @param downloadPDF Exporting module only. The text for the PDF download menu item.
    * @param downloadPNG Exporting module only. The text for the PNG download menu item.
    * @param downloadSVG Exporting module only. The text for the SVG download menu item.
    * @param drillUpText The text for the button that appears when drilling down, linking back to the parent series. The parent series' name is inserted for <code>{series.name}</code>.
    * @param invalidDate What to show in a date field for invalid dates. Defaults to an empty string.
    * @param loading The loading text that appears when the chart is set into the loading state following a call to <code>chart.showLoading</code>.
    * @param months An array containing the months names. Corresponds to the .  <code>%B</code> format in <code>Highcharts.dateFormat()</code>.
    * @param noData The text to display when the chart contains no data. Requires the no-data module, see <a href="#noData">noData</a>.
    * @param numericSymbolMagnitude The magnitude of <a href="#lang.numericSymbol">numericSymbols</a> replacements. Use 10000 for Japanese, Korean and various Chinese locales, which use symbols for 10^4, 10^8 and 10^12.
    * @param numericSymbols <a href="http://en.wikipedia.org/wiki/Metric_prefix">Metric prefixes</a> used to shorten high numbers in axis labels. Replacing any of the positions with <code>null</code> causes the full number to be written. Setting <code>numericSymbols</code> to <code>null</code> disables shortening altogether.
    * @param printChart Exporting module only. The text for the menu item to print the chart.
    * @param resetZoom The text for the label appearing when a chart is zoomed.
    * @param resetZoomTitle The tooltip title for the label appearing when a chart is zoomed.
    * @param shortMonths An array containing the months names in abbreviated form. Corresponds to the .  <code>%b</code> format in <code>Highcharts.dateFormat()</code>. 
    * @param shortWeekdays Short week days, starting Sunday. If not specified, Highcharts uses the first three letters of the <code>lang.weekdays</code> option.
    * @param thousandsSep <p>The default thousands separator used in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the function arguments. Since Highcharts 4.1 it defaults to a single space character, which is compatible with ISO and works across Anglo-American and continental European languages.</p>. . <p>The default is a single space.</p>
    * @param weekdays An array containing the weekday names.		 
    */
  def apply(contextButtonTitle: js.UndefOr[String] = js.undefined, decimalPoint: js.UndefOr[String] = js.undefined, downloadJPEG: js.UndefOr[String] = js.undefined, downloadPDF: js.UndefOr[String] = js.undefined, downloadPNG: js.UndefOr[String] = js.undefined, downloadSVG: js.UndefOr[String] = js.undefined, drillUpText: js.UndefOr[String] = js.undefined, invalidDate: js.UndefOr[String] = js.undefined, loading: js.UndefOr[String] = js.undefined, months: js.UndefOr[js.Array[String]] = js.undefined, noData: js.UndefOr[String] = js.undefined, numericSymbolMagnitude: js.UndefOr[Double] = js.undefined, numericSymbols: js.UndefOr[js.Array[String]] = js.undefined, printChart: js.UndefOr[String] = js.undefined, resetZoom: js.UndefOr[String] = js.undefined, resetZoomTitle: js.UndefOr[String] = js.undefined, shortMonths: js.UndefOr[js.Array[String]] = js.undefined, shortWeekdays: js.UndefOr[js.Array[String]] = js.undefined, thousandsSep: js.UndefOr[String] = js.undefined, weekdays: js.UndefOr[js.Array[String]] = js.undefined): Lang = {
    val contextButtonTitleOuter: js.UndefOr[String] = contextButtonTitle
    val decimalPointOuter: js.UndefOr[String] = decimalPoint
    val downloadJPEGOuter: js.UndefOr[String] = downloadJPEG
    val downloadPDFOuter: js.UndefOr[String] = downloadPDF
    val downloadPNGOuter: js.UndefOr[String] = downloadPNG
    val downloadSVGOuter: js.UndefOr[String] = downloadSVG
    val drillUpTextOuter: js.UndefOr[String] = drillUpText
    val invalidDateOuter: js.UndefOr[String] = invalidDate
    val loadingOuter: js.UndefOr[String] = loading
    val monthsOuter: js.UndefOr[js.Array[String]] = months
    val noDataOuter: js.UndefOr[String] = noData
    val numericSymbolMagnitudeOuter: js.UndefOr[Double] = numericSymbolMagnitude
    val numericSymbolsOuter: js.UndefOr[js.Array[String]] = numericSymbols
    val printChartOuter: js.UndefOr[String] = printChart
    val resetZoomOuter: js.UndefOr[String] = resetZoom
    val resetZoomTitleOuter: js.UndefOr[String] = resetZoomTitle
    val shortMonthsOuter: js.UndefOr[js.Array[String]] = shortMonths
    val shortWeekdaysOuter: js.UndefOr[js.Array[String]] = shortWeekdays
    val thousandsSepOuter: js.UndefOr[String] = thousandsSep
    val weekdaysOuter: js.UndefOr[js.Array[String]] = weekdays
    new Lang {
      override val contextButtonTitle: js.UndefOr[String] = contextButtonTitleOuter
      override val decimalPoint: js.UndefOr[String] = decimalPointOuter
      override val downloadJPEG: js.UndefOr[String] = downloadJPEGOuter
      override val downloadPDF: js.UndefOr[String] = downloadPDFOuter
      override val downloadPNG: js.UndefOr[String] = downloadPNGOuter
      override val downloadSVG: js.UndefOr[String] = downloadSVGOuter
      override val drillUpText: js.UndefOr[String] = drillUpTextOuter
      override val invalidDate: js.UndefOr[String] = invalidDateOuter
      override val loading: js.UndefOr[String] = loadingOuter
      override val months: js.UndefOr[js.Array[String]] = monthsOuter
      override val noData: js.UndefOr[String] = noDataOuter
      override val numericSymbolMagnitude: js.UndefOr[Double] = numericSymbolMagnitudeOuter
      override val numericSymbols: js.UndefOr[js.Array[String]] = numericSymbolsOuter
      override val printChart: js.UndefOr[String] = printChartOuter
      override val resetZoom: js.UndefOr[String] = resetZoomOuter
      override val resetZoomTitle: js.UndefOr[String] = resetZoomTitleOuter
      override val shortMonths: js.UndefOr[js.Array[String]] = shortMonthsOuter
      override val shortWeekdays: js.UndefOr[js.Array[String]] = shortWeekdaysOuter
      override val thousandsSep: js.UndefOr[String] = thousandsSepOuter
      override val weekdays: js.UndefOr[js.Array[String]] = weekdaysOuter
    }
  }
}
