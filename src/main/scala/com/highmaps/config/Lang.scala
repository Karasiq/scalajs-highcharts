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
class Lang extends js.Object {

  /**
    * Exporting module menu. The tooltip title for the context menu holding print and export menu items.
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
    * The text for the button that appears when drilling down, linking back to the parent series. The parent series' name is inserted for <code>{series.name}</code>.
    */
  val drillUpText: js.UndefOr[String] = js.undefined

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
    * <a href="http://en.wikipedia.org/wiki/Metric_prefix">Metric prefixes</a> used to shorten high numbers in axis labels. Replacing any of the positions with <code>null</code> causes the full number to be written. Setting <code>numericSymbols</code> to <code>null</code> disables shortening altogether.
    */
  val numericSymbols: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * Exporting module only. The text for the menu item to print the chart.
    */
  val printChart: js.UndefOr[String] = js.undefined

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
    */
  val weekdays: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * The title appearing on hovering the zoom in button. The text itself defaults to "+" and can be changed in the button options.
    */
  val zoomIn: js.UndefOr[String] = js.undefined

  /**
    * The title appearing on hovering the zoom out button. The text itself defaults to "-" and can be changed in the button options.
    */
  val zoomOut: js.UndefOr[String] = js.undefined
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
    * @param loading The loading text that appears when the chart is set into the loading state following a call to <code>chart.showLoading</code>.
    * @param months An array containing the months names. Corresponds to the .  <code>%B</code> format in <code>Highcharts.dateFormat()</code>.
    * @param numericSymbols <a href="http://en.wikipedia.org/wiki/Metric_prefix">Metric prefixes</a> used to shorten high numbers in axis labels. Replacing any of the positions with <code>null</code> causes the full number to be written. Setting <code>numericSymbols</code> to <code>null</code> disables shortening altogether.
    * @param printChart Exporting module only. The text for the menu item to print the chart.
    * @param resetZoom The text for the label appearing when a chart is zoomed.
    * @param resetZoomTitle The tooltip title for the label appearing when a chart is zoomed.
    * @param shortMonths An array containing the months names in abbreviated form. Corresponds to the .  <code>%b</code> format in <code>Highcharts.dateFormat()</code>. 
    * @param thousandsSep The default thousands separator used in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the function arguments. Since Highcharts 4.1 it defaults to a single space character, which is compatible with ISO and works across Anglo-American and continental European languages.
    * @param weekdays An array containing the weekday names.		 
    * @param zoomIn The title appearing on hovering the zoom in button. The text itself defaults to "+" and can be changed in the button options.
    * @param zoomOut The title appearing on hovering the zoom out button. The text itself defaults to "-" and can be changed in the button options.
    */
  def apply(contextButtonTitle: js.UndefOr[String] = js.undefined, decimalPoint: js.UndefOr[String] = js.undefined, downloadJPEG: js.UndefOr[String] = js.undefined, downloadPDF: js.UndefOr[String] = js.undefined, downloadPNG: js.UndefOr[String] = js.undefined, downloadSVG: js.UndefOr[String] = js.undefined, drillUpText: js.UndefOr[String] = js.undefined, loading: js.UndefOr[String] = js.undefined, months: js.UndefOr[js.Array[String]] = js.undefined, numericSymbols: js.UndefOr[js.Array[String]] = js.undefined, printChart: js.UndefOr[String] = js.undefined, resetZoom: js.UndefOr[String] = js.undefined, resetZoomTitle: js.UndefOr[String] = js.undefined, shortMonths: js.UndefOr[js.Array[String]] = js.undefined, thousandsSep: js.UndefOr[String] = js.undefined, weekdays: js.UndefOr[js.Array[String]] = js.undefined, zoomIn: js.UndefOr[String] = js.undefined, zoomOut: js.UndefOr[String] = js.undefined): Lang = {
    val contextButtonTitleOuter: js.UndefOr[String] = contextButtonTitle
    val decimalPointOuter: js.UndefOr[String] = decimalPoint
    val downloadJPEGOuter: js.UndefOr[String] = downloadJPEG
    val downloadPDFOuter: js.UndefOr[String] = downloadPDF
    val downloadPNGOuter: js.UndefOr[String] = downloadPNG
    val downloadSVGOuter: js.UndefOr[String] = downloadSVG
    val drillUpTextOuter: js.UndefOr[String] = drillUpText
    val loadingOuter: js.UndefOr[String] = loading
    val monthsOuter: js.UndefOr[js.Array[String]] = months
    val numericSymbolsOuter: js.UndefOr[js.Array[String]] = numericSymbols
    val printChartOuter: js.UndefOr[String] = printChart
    val resetZoomOuter: js.UndefOr[String] = resetZoom
    val resetZoomTitleOuter: js.UndefOr[String] = resetZoomTitle
    val shortMonthsOuter: js.UndefOr[js.Array[String]] = shortMonths
    val thousandsSepOuter: js.UndefOr[String] = thousandsSep
    val weekdaysOuter: js.UndefOr[js.Array[String]] = weekdays
    val zoomInOuter: js.UndefOr[String] = zoomIn
    val zoomOutOuter: js.UndefOr[String] = zoomOut
    new Lang {
      override val contextButtonTitle: js.UndefOr[String] = contextButtonTitleOuter
      override val decimalPoint: js.UndefOr[String] = decimalPointOuter
      override val downloadJPEG: js.UndefOr[String] = downloadJPEGOuter
      override val downloadPDF: js.UndefOr[String] = downloadPDFOuter
      override val downloadPNG: js.UndefOr[String] = downloadPNGOuter
      override val downloadSVG: js.UndefOr[String] = downloadSVGOuter
      override val drillUpText: js.UndefOr[String] = drillUpTextOuter
      override val loading: js.UndefOr[String] = loadingOuter
      override val months: js.UndefOr[js.Array[String]] = monthsOuter
      override val numericSymbols: js.UndefOr[js.Array[String]] = numericSymbolsOuter
      override val printChart: js.UndefOr[String] = printChartOuter
      override val resetZoom: js.UndefOr[String] = resetZoomOuter
      override val resetZoomTitle: js.UndefOr[String] = resetZoomTitleOuter
      override val shortMonths: js.UndefOr[js.Array[String]] = shortMonthsOuter
      override val thousandsSep: js.UndefOr[String] = thousandsSepOuter
      override val weekdays: js.UndefOr[js.Array[String]] = weekdaysOuter
      override val zoomIn: js.UndefOr[String] = zoomInOuter
      override val zoomOut: js.UndefOr[String] = zoomOutOuter
    }
  }
}
