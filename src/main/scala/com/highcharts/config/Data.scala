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
  * @note JavaScript name: <code>data</code>
  */
@js.annotation.ScalaJSDefined
class Data extends js.Object {

  /**
    * A two-dimensional array representing the input data on tabular form. This input can be used when the data is already parsed, for example from a grid view component. Each cell can be a string or number. If not switchRowsAndColumns is set, the columns are interpreted as series.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/columns/" target="_blank">Columns</a>
    * @since 4.0
    */
  val columns: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined

  /**
    * The callback that is evaluated when the data is finished loading, optionally from an external source, and parsed. The first argument passed is a finished chart options object, containing the series. These options can be extended with additional options and passed directly to the chart constructor.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/complete/" target="_blank">Modify data on complete</a>
    * @since 4.0
    */
  val complete: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>A comma delimited string to be parsed. Related options are <a href="#data.startRow">startRow</a>, <a href="#data.endRow">endRow</a>, <a href="#data.startColumn">startColumn</a> and <a href="#data.endColumn">endColumn</a> to delimit what part of the table is used. The <a href="#data.lineDelimiter">lineDelimiter</a> and <a href="#data.itemDelimiter">itemDelimiter</a> options define the CSV delimiter formats.</p>
    * 
    * <p>The built-in CSV parser doesn't support all flavours of CSV, so in some cases it may be necessary to use an external CSV parser. See <a href="http://jsfiddle.net/highcharts/u59176h4/">this example</a> of parsing CSV through the MIT licensed <a href="http://papaparse.com/">Papa Parse</a> library.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/csv/" target="_blank">Data from CSV</a>
    * @since 4.0
    */
  val csv: js.UndefOr[String] = js.undefined

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
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/dateformat-auto/" target="_blank">Best guess date format</a>
    * @since 4.0
    */
  val dateFormat: js.UndefOr[String] = js.undefined

  /**
    * The decimal point used for parsing numbers in the CSV.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/delimiters/" target="_blank">Comma as decimal point</a>
    * @since 4.1.0
    */
  val decimalPoint: js.UndefOr[String] = js.undefined

  /**
    * In tabular input data, the last column (indexed by 0) to use. Defaults to the last column containing data.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/" target="_blank">Limited data</a>
    * @since 4.0
    */
  val endColumn: js.UndefOr[Double] = js.undefined

  /**
    * In tabular input data, the last row (indexed by 0) to use. Defaults to the last row containing data.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/" target="_blank">Limited data</a>
    * @since 4.0.4
    */
  val endRow: js.UndefOr[Double] = js.undefined

  /**
    * Whether to use the first row in the data set as series names. 
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/" target="_blank">Don't get series names from the CSV</a>
    * @since 4.1.0
    */
  val firstRowAsNames: js.UndefOr[Boolean] = js.undefined

  /**
    * The key for a Google Spreadsheet to load. See <a href="https://developers.google.com/gdata/samples/spreadsheet_sample">general information on GS</a>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/google-spreadsheet/" target="_blank">Load a Google Spreadsheet</a>
    * @since 4.0
    */
  val googleSpreadsheetKey: js.UndefOr[String] = js.undefined

  /**
    * The Google Spreadsheet worksheet to use in combination with <a href="#data.googleSpreadsheetKey">googleSpreadsheetKey</a>. The available id's from your sheet can be read from <code>https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic</code>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/google-spreadsheet/" target="_blank">Load a Google Spreadsheet</a>
    * @since 4.0
    */
  val googleSpreadsheetWorksheet: js.UndefOr[String] = js.undefined

  /**
    * Item or cell delimiter for parsing CSV. Defaults to the tab character <code>\t</code> if a tab character is found in the CSV string, if not it defaults to <code>,</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/delimiters/" target="_blank">Delimiters</a>
    * @since 4.0
    */
  val itemDelimiter: js.UndefOr[String] = js.undefined

  /**
    * Line delimiter for parsing CSV.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/delimiters/" target="_blank">Delimiters</a>
    * @since 4.0
    */
  val lineDelimiter: js.UndefOr[String] = js.undefined

  /**
    * A callback function to parse string representations of dates into JavaScript timestamps. Should return an integer timestamp on success.
    * @since 4.0
    */
  val parseDate: js.UndefOr[js.Function] = js.undefined

  /**
    * A callback function to access the parsed columns, the two-dimentional input data array directly, before they are interpreted into series data and categories. Return <code>false</code> to stop completion, or call <code>this.complete()</code> to continue async.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/parsed/" target="_blank">Modify data after parse</a>
    * @since 4.0
    */
  val parsed: js.UndefOr[js.Function] = js.undefined

  /**
    * The same as the columns input option, but defining rows intead of columns.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/rows/" target="_blank">Data in rows</a>
    * @since 4.0
    */
  val rows: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined

  /**
    * An array containing object with Point property names along with what column id the property should be taken from.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/seriesmapping-label/" target="_blank">Label from data set</a>
    * @since 4.0.4
    */
  val seriesMapping: js.UndefOr[js.Array[js.Object]] = js.undefined

  /**
    * In tabular input data, the first column (indexed by 0) to use.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/" target="_blank">Limited data</a>
    * @since 4.0
    */
  val startColumn: js.UndefOr[Double] = js.undefined

  /**
    * In tabular input data, the first row (indexed by 0) to use.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/" target="_blank">Limited data</a>
    * @since 4.0
    */
  val startRow: js.UndefOr[Double] = js.undefined

  /**
    * Switch rows and columns of the input data, so that <code>this.columns</code> effectively becomes the rows of the data set, and the rows are interpreted as series.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/switchrowsandcolumns/" target="_blank">Switch rows and columns</a>
    * @since 4.0
    */
  val switchRowsAndColumns: js.UndefOr[Boolean] = js.undefined

  /**
    * A HTML table or the id of such to be parsed as input data. Related options are <code>startRow</code>, <code>endRow</code>, <code>startColumn</code> and <code>endColumn</code> to delimit what part of the table is used.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/column-parsed/" target="_blank">Parsed table</a>
    * @since 4.0
    */
  val table: js.UndefOr[String] = js.undefined
}

object Data {
  /**
    * @param columns A two-dimensional array representing the input data on tabular form. This input can be used when the data is already parsed, for example from a grid view component. Each cell can be a string or number. If not switchRowsAndColumns is set, the columns are interpreted as series.
    * @param complete The callback that is evaluated when the data is finished loading, optionally from an external source, and parsed. The first argument passed is a finished chart options object, containing the series. These options can be extended with additional options and passed directly to the chart constructor.
    * @param csv <p>A comma delimited string to be parsed. Related options are <a href="#data.startRow">startRow</a>, <a href="#data.endRow">endRow</a>, <a href="#data.startColumn">startColumn</a> and <a href="#data.endColumn">endColumn</a> to delimit what part of the table is used. The <a href="#data.lineDelimiter">lineDelimiter</a> and <a href="#data.itemDelimiter">itemDelimiter</a> options define the CSV delimiter formats.</p>. . <p>The built-in CSV parser doesn't support all flavours of CSV, so in some cases it may be necessary to use an external CSV parser. See <a href="http://jsfiddle.net/highcharts/u59176h4/">this example</a> of parsing CSV through the MIT licensed <a href="http://papaparse.com/">Papa Parse</a> library.</p>
    * @param dateFormat <p>Which of the predefined date formats in Date.prototype.dateFormats to use to parse date values. Defaults to a best guess based on what format gives valid and ordered dates.</p>. . <p>Valid options include:. <ul>. <li><code>YYYY-mm-dd</code></li>. <li><code>dd/mm/YYYY</code></li>. <li><code>mm/dd/YYYY</code></li>. <li><code>dd/mm/YY</code></li>. <li><code>mm/dd/YY</code></li>. </ul>. </p>
    * @param decimalPoint The decimal point used for parsing numbers in the CSV.
    * @param endColumn In tabular input data, the last column (indexed by 0) to use. Defaults to the last column containing data.
    * @param endRow In tabular input data, the last row (indexed by 0) to use. Defaults to the last row containing data.
    * @param firstRowAsNames Whether to use the first row in the data set as series names. 
    * @param googleSpreadsheetKey The key for a Google Spreadsheet to load. See <a href="https://developers.google.com/gdata/samples/spreadsheet_sample">general information on GS</a>.
    * @param googleSpreadsheetWorksheet The Google Spreadsheet worksheet to use in combination with <a href="#data.googleSpreadsheetKey">googleSpreadsheetKey</a>. The available id's from your sheet can be read from <code>https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic</code>
    * @param itemDelimiter Item or cell delimiter for parsing CSV. Defaults to the tab character <code>\t</code> if a tab character is found in the CSV string, if not it defaults to <code>,</code>.
    * @param lineDelimiter Line delimiter for parsing CSV.
    * @param parseDate A callback function to parse string representations of dates into JavaScript timestamps. Should return an integer timestamp on success.
    * @param parsed A callback function to access the parsed columns, the two-dimentional input data array directly, before they are interpreted into series data and categories. Return <code>false</code> to stop completion, or call <code>this.complete()</code> to continue async.
    * @param rows The same as the columns input option, but defining rows intead of columns.
    * @param seriesMapping An array containing object with Point property names along with what column id the property should be taken from.
    * @param startColumn In tabular input data, the first column (indexed by 0) to use.
    * @param startRow In tabular input data, the first row (indexed by 0) to use.
    * @param switchRowsAndColumns Switch rows and columns of the input data, so that <code>this.columns</code> effectively becomes the rows of the data set, and the rows are interpreted as series.
    * @param table A HTML table or the id of such to be parsed as input data. Related options are <code>startRow</code>, <code>endRow</code>, <code>startColumn</code> and <code>endColumn</code> to delimit what part of the table is used.
    */
  def apply(columns: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined, complete: js.UndefOr[js.Function] = js.undefined, csv: js.UndefOr[String] = js.undefined, dateFormat: js.UndefOr[String] = js.undefined, decimalPoint: js.UndefOr[String] = js.undefined, endColumn: js.UndefOr[Double] = js.undefined, endRow: js.UndefOr[Double] = js.undefined, firstRowAsNames: js.UndefOr[Boolean] = js.undefined, googleSpreadsheetKey: js.UndefOr[String] = js.undefined, googleSpreadsheetWorksheet: js.UndefOr[String] = js.undefined, itemDelimiter: js.UndefOr[String] = js.undefined, lineDelimiter: js.UndefOr[String] = js.undefined, parseDate: js.UndefOr[js.Function] = js.undefined, parsed: js.UndefOr[js.Function] = js.undefined, rows: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined, seriesMapping: js.UndefOr[js.Array[js.Object]] = js.undefined, startColumn: js.UndefOr[Double] = js.undefined, startRow: js.UndefOr[Double] = js.undefined, switchRowsAndColumns: js.UndefOr[Boolean] = js.undefined, table: js.UndefOr[String] = js.undefined): Data = {
    val columnsOuter: js.UndefOr[js.Array[js.Array[js.Any]]] = columns
    val completeOuter: js.UndefOr[js.Function] = complete
    val csvOuter: js.UndefOr[String] = csv
    val dateFormatOuter: js.UndefOr[String] = dateFormat
    val decimalPointOuter: js.UndefOr[String] = decimalPoint
    val endColumnOuter: js.UndefOr[Double] = endColumn
    val endRowOuter: js.UndefOr[Double] = endRow
    val firstRowAsNamesOuter: js.UndefOr[Boolean] = firstRowAsNames
    val googleSpreadsheetKeyOuter: js.UndefOr[String] = googleSpreadsheetKey
    val googleSpreadsheetWorksheetOuter: js.UndefOr[String] = googleSpreadsheetWorksheet
    val itemDelimiterOuter: js.UndefOr[String] = itemDelimiter
    val lineDelimiterOuter: js.UndefOr[String] = lineDelimiter
    val parseDateOuter: js.UndefOr[js.Function] = parseDate
    val parsedOuter: js.UndefOr[js.Function] = parsed
    val rowsOuter: js.UndefOr[js.Array[js.Array[js.Any]]] = rows
    val seriesMappingOuter: js.UndefOr[js.Array[js.Object]] = seriesMapping
    val startColumnOuter: js.UndefOr[Double] = startColumn
    val startRowOuter: js.UndefOr[Double] = startRow
    val switchRowsAndColumnsOuter: js.UndefOr[Boolean] = switchRowsAndColumns
    val tableOuter: js.UndefOr[String] = table
    new Data {
      override val columns: js.UndefOr[js.Array[js.Array[js.Any]]] = columnsOuter
      override val complete: js.UndefOr[js.Function] = completeOuter
      override val csv: js.UndefOr[String] = csvOuter
      override val dateFormat: js.UndefOr[String] = dateFormatOuter
      override val decimalPoint: js.UndefOr[String] = decimalPointOuter
      override val endColumn: js.UndefOr[Double] = endColumnOuter
      override val endRow: js.UndefOr[Double] = endRowOuter
      override val firstRowAsNames: js.UndefOr[Boolean] = firstRowAsNamesOuter
      override val googleSpreadsheetKey: js.UndefOr[String] = googleSpreadsheetKeyOuter
      override val googleSpreadsheetWorksheet: js.UndefOr[String] = googleSpreadsheetWorksheetOuter
      override val itemDelimiter: js.UndefOr[String] = itemDelimiterOuter
      override val lineDelimiter: js.UndefOr[String] = lineDelimiterOuter
      override val parseDate: js.UndefOr[js.Function] = parseDateOuter
      override val parsed: js.UndefOr[js.Function] = parsedOuter
      override val rows: js.UndefOr[js.Array[js.Array[js.Any]]] = rowsOuter
      override val seriesMapping: js.UndefOr[js.Array[js.Object]] = seriesMappingOuter
      override val startColumn: js.UndefOr[Double] = startColumnOuter
      override val startRow: js.UndefOr[Double] = startRowOuter
      override val switchRowsAndColumns: js.UndefOr[Boolean] = switchRowsAndColumnsOuter
      override val table: js.UndefOr[String] = tableOuter
    }
  }
}
