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
  * @note JavaScript name: <code>lang</code>
  */
@js.annotation.ScalaJSDefined
class Lang extends js.Object {

  /**
    * Exporting module menu. The tooltip title for the context menu holding print and export menu items.
    * @since 1.3
    */
  val contextButtonTitle: js.UndefOr[String] = js.undefined

  /**
    * The default decimal point used in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the function arguments.
    */
  val decimalPoint: js.UndefOr[String] = js.undefined

  /**
    * Exporting module only. The text for the JPEG download menu item.
    */
  val downloadJPEG: js.UndefOr[String] = js.undefined

  /**
    * Exporting module only. The text for the PDF download menu item.
    */
  val downloadPDF: js.UndefOr[String] = js.undefined

  /**
    * Exporting module only. The text for the PNG download menu item.
    */
  val downloadPNG: js.UndefOr[String] = js.undefined

  /**
    * Exporting module only. The text for the SVG download menu item.
    */
  val downloadSVG: js.UndefOr[String] = js.undefined

  /**
    * What to show in a date field, specifically in the range selector inputs, for invalid dates. Defaults to an empty string.
    * @since 2.1.8
    */
  val invalidDate: js.UndefOr[String] = js.undefined

  /**
    * The loading text that appears when the chart is set into the loading state following a call to <code>chart.showLoading</code>.
    */
  val loading: js.UndefOr[String] = js.undefined

  /**
    * An array containing the months names.
    * 		 Defaults to <code>['January', 'February', 'March', 'April', 'May', 'June', 'July',  	'August', 'September', 'October', 'November', 'December']</code>.
    */
  val months: js.Any = js.undefined

  /**
    * <a href="http://en.wikipedia.org/wiki/Metric_prefix">Metric prefixes</a> used to shorten high numbers in axis labels. Replacing any of the positions with <code>null</code> causes the full number to be written. Setting <code>numericSymbols</code> to <code>null</code> disables shortening altogether.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/lang/numericsymbols/" target="_blank">Replacing the symbols with text</a>
    * @since 1.2.0
    */
  val numericSymbols: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * Exporting module only. The text for the menu item to print the chart.
    * @since 1.3.1
    */
  val printChart: js.UndefOr[String] = js.undefined

  /**
    * The text for the label for the "from" input box in the range selector.
    */
  val rangeSelectorFrom: js.UndefOr[String] = js.undefined

  /**
    * The text for the label for the "to" input box in the range selector.
    */
  val rangeSelectorTo: js.UndefOr[String] = js.undefined

  /**
    * The text for the label for the range selector buttons.
    */
  val rangeSelectorZoom: js.UndefOr[String] = js.undefined

  /**
    * The text for the label appearing when a chart is zoomed.
    */
  val resetZoom: js.UndefOr[String] = js.undefined

  /**
    * The tooltip title for the label appearing when a chart is zoomed.
    */
  val resetZoomTitle: js.UndefOr[String] = js.undefined

  /**
    * An array containing the months names in abbreviated form. Corresponds to the 
    *  <code>%b</code> format in <code>Highcharts.dateFormat()</code>. 
    */
  val shortMonths: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * The default thousands separator used in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the function arguments. Since Highcharts 4.1 it defaults to a single space character, which is compatible with ISO and works across Anglo-American and continental European languages.
    */
  val thousandsSep: js.UndefOr[String] = js.undefined

  /**
    * An array containing the weekday names.
    * 		 Defaults to <code>['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']</code>.
    */
  val weekdays: js.Any = js.undefined
}

object Lang {
  /**
    * @param contextButtonTitle Exporting module menu. The tooltip title for the context menu holding print and export menu items.
    * @param decimalPoint The default decimal point used in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the function arguments.
    * @param downloadJPEG Exporting module only. The text for the JPEG download menu item.
    * @param downloadPDF Exporting module only. The text for the PDF download menu item.
    * @param downloadPNG Exporting module only. The text for the PNG download menu item.
    * @param downloadSVG Exporting module only. The text for the SVG download menu item.
    * @param invalidDate What to show in a date field, specifically in the range selector inputs, for invalid dates. Defaults to an empty string.
    * @param loading The loading text that appears when the chart is set into the loading state following a call to <code>chart.showLoading</code>.
    * @param months An array containing the months names.. 		 Defaults to <code>['January', 'February', 'March', 'April', 'May', 'June', 'July',  	'August', 'September', 'October', 'November', 'December']</code>.
    * @param numericSymbols <a href="http://en.wikipedia.org/wiki/Metric_prefix">Metric prefixes</a> used to shorten high numbers in axis labels. Replacing any of the positions with <code>null</code> causes the full number to be written. Setting <code>numericSymbols</code> to <code>null</code> disables shortening altogether.
    * @param printChart Exporting module only. The text for the menu item to print the chart.
    * @param rangeSelectorFrom The text for the label for the "from" input box in the range selector.
    * @param rangeSelectorTo The text for the label for the "to" input box in the range selector.
    * @param rangeSelectorZoom The text for the label for the range selector buttons.
    * @param resetZoom The text for the label appearing when a chart is zoomed.
    * @param resetZoomTitle The tooltip title for the label appearing when a chart is zoomed.
    * @param shortMonths An array containing the months names in abbreviated form. Corresponds to the .  <code>%b</code> format in <code>Highcharts.dateFormat()</code>. 
    * @param thousandsSep The default thousands separator used in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the function arguments. Since Highcharts 4.1 it defaults to a single space character, which is compatible with ISO and works across Anglo-American and continental European languages.
    * @param weekdays An array containing the weekday names.. 		 Defaults to <code>['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']</code>.
    */
  def apply(contextButtonTitle: js.UndefOr[String] = js.undefined, decimalPoint: js.UndefOr[String] = js.undefined, downloadJPEG: js.UndefOr[String] = js.undefined, downloadPDF: js.UndefOr[String] = js.undefined, downloadPNG: js.UndefOr[String] = js.undefined, downloadSVG: js.UndefOr[String] = js.undefined, invalidDate: js.UndefOr[String] = js.undefined, loading: js.UndefOr[String] = js.undefined, months: js.UndefOr[js.Any] = js.undefined, numericSymbols: js.UndefOr[js.Array[String]] = js.undefined, printChart: js.UndefOr[String] = js.undefined, rangeSelectorFrom: js.UndefOr[String] = js.undefined, rangeSelectorTo: js.UndefOr[String] = js.undefined, rangeSelectorZoom: js.UndefOr[String] = js.undefined, resetZoom: js.UndefOr[String] = js.undefined, resetZoomTitle: js.UndefOr[String] = js.undefined, shortMonths: js.UndefOr[js.Array[String]] = js.undefined, thousandsSep: js.UndefOr[String] = js.undefined, weekdays: js.UndefOr[js.Any] = js.undefined): Lang = {
    val contextButtonTitleOuter: js.UndefOr[String] = contextButtonTitle
    val decimalPointOuter: js.UndefOr[String] = decimalPoint
    val downloadJPEGOuter: js.UndefOr[String] = downloadJPEG
    val downloadPDFOuter: js.UndefOr[String] = downloadPDF
    val downloadPNGOuter: js.UndefOr[String] = downloadPNG
    val downloadSVGOuter: js.UndefOr[String] = downloadSVG
    val invalidDateOuter: js.UndefOr[String] = invalidDate
    val loadingOuter: js.UndefOr[String] = loading
    val monthsOuter: js.Any = months
    val numericSymbolsOuter: js.UndefOr[js.Array[String]] = numericSymbols
    val printChartOuter: js.UndefOr[String] = printChart
    val rangeSelectorFromOuter: js.UndefOr[String] = rangeSelectorFrom
    val rangeSelectorToOuter: js.UndefOr[String] = rangeSelectorTo
    val rangeSelectorZoomOuter: js.UndefOr[String] = rangeSelectorZoom
    val resetZoomOuter: js.UndefOr[String] = resetZoom
    val resetZoomTitleOuter: js.UndefOr[String] = resetZoomTitle
    val shortMonthsOuter: js.UndefOr[js.Array[String]] = shortMonths
    val thousandsSepOuter: js.UndefOr[String] = thousandsSep
    val weekdaysOuter: js.Any = weekdays
    new Lang {
      override val contextButtonTitle: js.UndefOr[String] = contextButtonTitleOuter
      override val decimalPoint: js.UndefOr[String] = decimalPointOuter
      override val downloadJPEG: js.UndefOr[String] = downloadJPEGOuter
      override val downloadPDF: js.UndefOr[String] = downloadPDFOuter
      override val downloadPNG: js.UndefOr[String] = downloadPNGOuter
      override val downloadSVG: js.UndefOr[String] = downloadSVGOuter
      override val invalidDate: js.UndefOr[String] = invalidDateOuter
      override val loading: js.UndefOr[String] = loadingOuter
      override val months: js.Any = monthsOuter
      override val numericSymbols: js.UndefOr[js.Array[String]] = numericSymbolsOuter
      override val printChart: js.UndefOr[String] = printChartOuter
      override val rangeSelectorFrom: js.UndefOr[String] = rangeSelectorFromOuter
      override val rangeSelectorTo: js.UndefOr[String] = rangeSelectorToOuter
      override val rangeSelectorZoom: js.UndefOr[String] = rangeSelectorZoomOuter
      override val resetZoom: js.UndefOr[String] = resetZoomOuter
      override val resetZoomTitle: js.UndefOr[String] = resetZoomTitleOuter
      override val shortMonths: js.UndefOr[js.Array[String]] = shortMonthsOuter
      override val thousandsSep: js.UndefOr[String] = thousandsSepOuter
      override val weekdays: js.Any = weekdaysOuter
    }
  }
}
