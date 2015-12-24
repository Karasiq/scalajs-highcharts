/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.3 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class Data extends js.Object {
  
  /**
   * A two-dimensional array representing the input data on tabular form. This input can be used when the data is already parsed, for example from a grid view component. Each cell can be a string or number. If not switchRowsAndColumns is set, the columns are interpreted as series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/columns/" target="_blank">Columns</a>
   * @since 4.0
   */
  val columns: UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
  /**
   * The callback that is evaluated when the data is finished loading, optionally from an external source, and parsed. The first argument passed is a finished chart options object, containing the series. These options can be extended with additional options and passed directly to the chart constructor.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/complete/" target="_blank">Modify data on complete</a>
   * @since 4.0
   */
  val complete: UndefOr[js.Function] = js.undefined
  
  /**
   * A comma delimited string to be parsed. Related options are <a href="#data.startRow">startRow</a>, <a href="#data.endRow">endRow</a>, <a href="#data.startColumn">startColumn</a> and <a href="#data.endColumn">endColumn</a> to delimit what part of the table is used. The <a href="#data.lineDelimiter">lineDelimiter</a> and <a href="#data.itemDelimiter">itemDelimiter</a> options define the CSV delimiter formats.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/csv/" target="_blank">Data from CSV</a>
   * @since 4.0
   */
  val csv: String = ""
  
  /**
   * <p>Which of the predefined date formats in Date.prototype.dateFormats to use to parse date values. Defaults to a best guess based on what format gives valid and ordered dates.</p>
   * 
   * <p>Valid options include:
   * <ul>
   * <li><code>YYYY-mm-dd</code></li>
   * <li><code>dd/mm/YYYY</code></li>
   * <li><code>mm/dd/YYYY</code></li>
   * <li><code>dd/mm/YY</code></li>
   * <li><code>mm/dd/YY</code></li>
   * </ul>
   * </p>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/dateformat-auto/" target="_blank">Best guess date format</a>
   * @since 4.0
   */
  val dateFormat: UndefOr[String] = js.undefined
  
  /**
   * The decimal point used for parsing numbers in the CSV.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/delimiters/" target="_blank">Comma as decimal point</a>
   * @since 4.1.0
   */
  val decimalPoint: String = "."
  
  /**
   * In tabular input data, the last column (indexed by 0) to use. Defaults to the last column containing data.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/start-end/" target="_blank">Limited data</a>
   * @since 4.0
   */
  val endColumn: UndefOr[Double] = js.undefined
  
  /**
   * In tabular input data, the last row (indexed by 0) to use. Defaults to the last row containing data.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/start-end/" target="_blank">Limited data</a>
   * @since 4.0.4
   */
  val endRow: UndefOr[Double] = js.undefined
  
  /**
   * Whether to use the first row in the data set as series names. 
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/start-end/" target="_blank">Don't get series names from the CSV</a>
   * @since 4.1.0
   */
  val firstRowAsNames: Boolean = true
  
  /**
   * The key for a Google Spreadsheet to load. See <a href="https://developers.google.com/gdata/samples/spreadsheet_sample">general information on GS</a>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/google-spreadsheet/" target="_blank">Load a Google Spreadsheet</a>
   * @since 4.0
   */
  val googleSpreadsheetKey: String = ""
  
  /**
   * The Google Spreadsheet worksheet to use in combination with <a href="#data.googleSpreadsheetKey">googleSpreadsheetKey</a>. The available id's from your sheet can be read from <code>https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic</code>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/google-spreadsheet/" target="_blank">Load a Google Spreadsheet</a>
   * @since 4.0
   */
  val googleSpreadsheetWorksheet: UndefOr[String] = js.undefined
  
  /**
   * Item or cell delimiter for parsing CSV. Defaults to the tab character <code>\t</code> if a tab character is found in the CSV string, if not it defaults to <code>,</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/delimiters/" target="_blank">Delimiters</a>
   * @since 4.0
   */
  val itemDelimiter: String = ""
  
  /**
   * Line delimiter for parsing CSV.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/delimiters/" target="_blank">Delimiters</a>
   * @since 4.0
   */
  val lineDelimiter: String = "\\n"
  
  /**
   * A callback function to parse string representations of dates into JavaScript timestamps. Should return an integer timestamp on success.
   * @since 4.0
   */
  val parseDate: UndefOr[js.Function] = js.undefined
  
  /**
   * A callback function to access the parsed columns, the two-dimentional input data array directly, before they are interpreted into series data and categories. Return <code>false</code> to stop completion, or call <code>this.complete()</code> to continue async.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/parsed/" target="_blank">Modify data after parse</a>
   * @since 4.0
   */
  val parsed: UndefOr[js.Function] = js.undefined
  
  /**
   * The same as the columns input option, but defining rows intead of columns.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/rows/" target="_blank">Data in rows</a>
   * @since 4.0
   */
  val rows: UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
  
  /**
   * An array containing object with Point property names along with what column id the property should be taken from.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/seriesmapping-label/" target="_blank">Label from data set</a>
   * @since 4.0.4
   */
  val seriesMapping: UndefOr[js.Array[js.Object]] = js.undefined
  
  /**
   * In tabular input data, the first column (indexed by 0) to use.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/start-end/" target="_blank">Limited data</a>
   * @since 4.0
   */
  val startColumn: Double = 0
  
  /**
   * In tabular input data, the first row (indexed by 0) to use.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/start-end/" target="_blank">Limited data</a>
   * @since 4.0
   */
  val startRow: Double = 0
  
  /**
   * Switch rows and columns of the input data, so that <code>this.columns</code> effectively becomes the rows of the data set, and the rows are interpreted as series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/data/switchrowsandcolumns/" target="_blank">Switch rows and columns</a>
   * @since 4.0
   */
  val switchRowsAndColumns: Boolean = false
  
  /**
   * A HTML table or the id of such to be parsed as input data. Related options are <code>startRow</code>, <code>endRow</code>, <code>startColumn</code> and <code>endColumn</code> to delimit what part of the table is used.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/column-parsed/" target="_blank">Parsed table</a>
   * @since 4.0
   */
  val table: UndefOr[js.Any] = js.undefined
}
