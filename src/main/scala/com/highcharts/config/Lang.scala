/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.3 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class Lang extends js.Object {
  
  /**
   * Exporting module menu. The tooltip title for the context menu holding print and export menu items.
   * @since 3.0
   */
  val contextButtonTitle: String = "Chart context menu"
  
  /**
   * The default decimal point used in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the function arguments.
   * @since 1.2.2
   */
  val decimalPoint: String = "."
  
  /**
   * Exporting module only. The text for the JPEG download menu item.
   * @since 2.0
   */
  val downloadJPEG: String = "Download JPEG image"
  
  /**
   * Exporting module only. The text for the PDF download menu item.
   * @since 2.0
   */
  val downloadPDF: String = "Download PDF document"
  
  /**
   * Exporting module only. The text for the PNG download menu item.
   * @since 2.0
   */
  val downloadPNG: String = "Download PNG image"
  
  /**
   * Exporting module only. The text for the SVG download menu item.
   * @since 2.0
   */
  val downloadSVG: String = "Download SVG vector image"
  
  /**
   * The text for the button that appears when drilling down, linking back to the parent series. The parent series' name is inserted for <code>{series.name}</code>.
   * @since 3.0.8
   */
  val drillUpText: String = "Back to {series.name}"
  
  /**
   * What to show in a date field for invalid dates. Defaults to an empty string.
   * @since 4.1.8
   */
  val invalidDate: String = ""
  
  /**
   * The loading text that appears when the chart is set into the loading state following a call to <code>chart.showLoading</code>.
   */
  val loading: String = "Loading..."
  
  /**
   * An array containing the months names. Corresponds to the 
   *  <code>%B</code> format in <code>Highcharts.dateFormat()</code>.
   */
  val months: js.Array[String] = js.Array( "January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December")
  
  /**
   * The text to display when the chart contains no data. Requires the no-data module, see <a href="#noData">noData</a>.
   * @since 3.0.8
   */
  val noData: String = "No data to display"
  
  /**
   * <a href="http://en.wikipedia.org/wiki/Metric_prefix">Metric prefixes</a> used to shorten high numbers in axis labels. Replacing any of the positions with <code>null</code> causes the full number to be written. Setting <code>numericSymbols</code> to <code>null</code> disables shortening altogether.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/lang/numericsymbols/" target="_blank">Replacing the symbols with text</a>
   * @since 2.3.0
   */
  val numericSymbols: js.Array[String] = js.Array( "k" , "M" , "G" , "T" , "P" , "E")
  
  /**
   * Exporting module only. The text for the menu item to print the chart.
   * @since 3.0.1
   */
  val printChart: String = "Print chart"
  
  /**
   * The text for the label appearing when a chart is zoomed.
   * @since 1.2.4
   */
  val resetZoom: String = "Reset zoom"
  
  /**
   * The tooltip title for the label appearing when a chart is zoomed.
   * @since 1.2.4
   */
  val resetZoomTitle: String = "Reset zoom level 1:1"
  
  /**
   * An array containing the months names in abbreviated form. Corresponds to the 
   *  <code>%b</code> format in <code>Highcharts.dateFormat()</code>. 
   */
  val shortMonths: js.Array[String] = js.Array( "Jan" , "Feb" , "Mar" , "Apr" , "May" , "Jun" , "Jul" , "Aug" , "Sep" , "Oct" , "Nov" , "Dec")
  
  /**
   * The default thousands separator used in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the function arguments. Since Highcharts 4.1 it defaults to a single space character, which is compatible with ISO and works across Anglo-American and continental European languages.
   * @since 1.2.2
   */
  val thousandsSep: String = " "
  
  /**
   * An array containing the weekday names.		 
   */
  val weekdays: js.Array[String] = js.Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
}
