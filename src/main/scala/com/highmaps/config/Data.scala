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
  * @note JavaScript name: <code>data</code>
  */
@js.annotation.ScalaJSDefined
class Data extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A callback function to modify the CSV before parsing it. Return the modified
    * string.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/line-ajax/">Modify CSV before parse</a>
    * @since 6.1
    */
  val beforeParse: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>A two-dimensional array representing the input data on tabular form.
    * This input can be used when the data is already parsed, for example
    * from a grid view component. Each cell can be a string or number.
    * If not switchRowsAndColumns is set, the columns are interpreted as
    * series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/columns/">Columns</a>
    * @since 4.0
    */
  val columns: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined

  /**
    * <p>The callback that is evaluated when the data is finished loading,
    * optionally from an external source, and parsed. The first argument
    * passed is a finished chart options object, containing the series.
    * These options can be extended with additional options and passed
    * directly to the chart constructor.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/complete/">Modify data on complete</a>
    * @since 4.0
    */
  val complete: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>A comma delimited string to be parsed. Related options are <a href="#data.startRow">startRow</a>, <a href="#data.endRow">endRow</a>, <a href="#data.startColumn">startColumn</a>
    * and <a href="#data.endColumn">endColumn</a> to delimit what part of the table
    * is used. The <a href="#data.lineDelimiter">lineDelimiter</a> and <a href="#data.itemDelimiter">itemDelimiter</a> options define the CSV delimiter formats.</p>
    * <p>The built-in CSV parser doesn&#39;t support all flavours of CSV, so in
    * some cases it may be necessary to use an external CSV parser. See
    * <a href="https://jsfiddle.net/highcharts/u59176h4/">this example</a> of parsing
    * CSV through the MIT licensed <a href="http://papaparse.com/">Papa Parse</a>
    * library.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/csv/">Data from CSV</a>
    * @since 4.0
    */
  val csv: js.UndefOr[String] = js.undefined

  /**
    * <p>Which of the predefined date formats in Date.prototype.dateFormats
    * to use to parse date values. Defaults to a best guess based on what
    * format gives valid and ordered dates.</p>
    * <p>Valid options include:</p>
    * <ul>
    * <li><code>YYYY/mm/dd</code></li>
    * <li><code>dd/mm/YYYY</code></li>
    * <li><code>mm/dd/YYYY</code></li>
    * <li><code>dd/mm/YY</code></li>
    * <li><code>mm/dd/YY</code></li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/dateformat-auto/">Best guess date format</a>
    * @since 4.0
    */
  val dateFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>The decimal point used for parsing numbers in the CSV.</p>
    * <p>If both this and data.delimiter is set to false, the parser will
    * attempt to deduce the decimal point automatically.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/delimiters/">Comma as decimal point</a>
    * @since 4.1.0
    */
  val decimalPoint: js.UndefOr[String] = js.undefined

  /**
    * <p>In tabular input data, the last column (indexed by 0) to use. Defaults
    * to the last column containing data.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Limited data</a>
    * @since 4.0
    */
  val endColumn: js.UndefOr[Double] = js.undefined

  /**
    * <p>In tabular input data, the last row (indexed by 0) to use. Defaults
    * to the last row containing data.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Limited data</a>
    * @since 4.0.4
    */
  val endRow: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to use the first row in the data set as series names.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Don't get series names from the CSV</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Don't get series names from the CSV</a>
    * @since 4.1.0
    */
  val firstRowAsNames: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The key for a Google Spreadsheet to load. See <a href="https://developers.google.com/gdata/samples/spreadsheet_sample">general information
    * on GS</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/google-spreadsheet/">Load a Google Spreadsheet</a>
    * @since 4.0
    */
  val googleSpreadsheetKey: js.UndefOr[String] = js.undefined

  /**
    * <p>The Google Spreadsheet worksheet to use in combination with
    * <a href="#data.googleSpreadsheetKey">googleSpreadsheetKey</a>. The available id&#39;s from
    * your sheet can be read from <code>https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/google-spreadsheet/">Load a Google Spreadsheet</a>
    * @since 4.0
    */
  val googleSpreadsheetWorksheet: js.UndefOr[String] = js.undefined

  /**
    * <p>Item or cell delimiter for parsing CSV. Defaults to the tab character
    * <code>\t</code> if a tab character is found in the CSV string, if not it defaults
    * to <code>,</code>.</p>
    * <p>If this is set to false or undefined, the parser will attempt to deduce
    * the delimiter automatically.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/delimiters/">Delimiters</a>
    * @since 4.0
    */
  val itemDelimiter: js.UndefOr[String] = js.undefined

  /**
    * <p>Line delimiter for parsing CSV.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/delimiters/">Delimiters</a>
    * @since 4.0
    */
  val lineDelimiter: js.UndefOr[String] = js.undefined

  /**
    * <p>A callback function to parse string representations of dates into
    * JavaScript timestamps. Should return an integer timestamp on success.</p>
    * @since 4.0
    */
  val parseDate: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>A callback function to access the parsed columns, the two-dimentional
    * input data array directly, before they are interpreted into series
    * data and categories. Return <code>false</code> to stop completion, or call
    * <code>this.complete()</code> to continue async.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/parsed/">Modify data after parse</a>
    * @since 4.0
    */
  val parsed: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>The same as the columns input option, but defining rows intead of
    * columns.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/rows/">Data in rows</a>
    * @since 4.0
    */
  val rows: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined

  /**
    * <p>An array containing object with Point property names along with what
    * column id the property should be taken from.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/seriesmapping-label/">Label from data set</a>
    * @since 4.0.4
    */
  val seriesMapping: js.UndefOr[js.Array[js.Object]] = js.undefined

  /**
    * <p>In tabular input data, the first column (indexed by 0) to use.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Limited data</a>
    * @since 4.0
    */
  val startColumn: js.UndefOr[Double] = js.undefined

  /**
    * <p>In tabular input data, the first row (indexed by 0) to use.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Limited data</a>
    * @since 4.0
    */
  val startRow: js.UndefOr[Double] = js.undefined

  /**
    * <p>Switch rows and columns of the input data, so that <code>this.columns</code>
    * effectively becomes the rows of the data set, and the rows are interpreted
    * as series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/switchrowsandcolumns/">Switch rows and columns</a>
    * @since 4.0
    */
  val switchRowsAndColumns: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>An HTML table or the id of such to be parsed as input data. Related
    * options are <code>startRow</code>, <code>endRow</code>, <code>startColumn</code> and <code>endColumn</code> to
    * delimit what part of the table is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/column-parsed/">Parsed table</a>
    * @since 4.0
    */
  val table: js.UndefOr[String] = js.undefined

  /**
    * <p>A URL to a remote CSV dataset.
    * Will be fetched when the chart is created using Ajax.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/livedata-columns">Categorized bar chart with CSV and live polling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/livedata-csv">Time based line chart with CSV and live polling</a>
    * @since 4.0
    */
  val csvURL: js.UndefOr[String] = js.undefined

  /**
    * <p>A URL to a remote JSON dataset, structured as a row array.
    * Will be fetched when the chart is created using Ajax.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/livedata-rows">Rows with live polling</a>
    * @since 4.0
    */
  val rowsURL: js.UndefOr[String] = js.undefined

  /**
    * <p>A URL to a remote JSON dataset, structured as a column array.
    * Will be fetched when the chart is created using Ajax.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/livedata-columns">Columns with live polling</a>
    * @since 4.0
    */
  val columnsURL: js.UndefOr[String] = js.undefined

  /**
    * <p>Sets the refresh rate for data polling when importing remote dataset by
    * setting <a href="data.csvURL">data.csvURL</a>, <a href="data.rowsURL">data.rowsURL</a>,
    * <a href="data.columnsURL">data.columnsURL</a>, or
    * <a href="data.googleSpreadsheetKey">data.googleSpreadsheetKey</a>.</p>
    * <p>Note that polling must be enabled by setting
    * <a href="data.enablePolling">data.enablePolling</a> to true.</p>
    * <p>The value is the number of seconds between pollings.
    * It cannot be set to less than 1 second.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/live-data">Live data with user set refresh rate</a>
    * @since 4.0
    */
  val dataRefreshRate: js.UndefOr[Double] = js.undefined

  /**
    * <p>Enables automatic refetching of remote datasets every <em>n</em> seconds (defined by
    * setting <a href="data.dataRefreshRate">data.dataRefreshRate</a>).</p>
    * <p>Only works when either <a href="data.csvURL">data.csvURL</a>,
    * <a href="data.rowsURL">data.rowsURL</a>, <a href="data.columnsURL">data.columnsURL</a>, or
    * <a href="data.googleSpreadsheetKey">data.googleSpreadsheetKey</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/live-data">Live data</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/livedata-columns">Categorized bar chart with CSV and live polling</a>
    * @since 4.0
    */
  val enablePolling: js.UndefOr[Boolean] = js.undefined
}

object Data {
  /**
    * @param beforeParse <p>A callback function to modify the CSV before parsing it. Return the modified. string.</p>
    * @param columns <p>A two-dimensional array representing the input data on tabular form.. This input can be used when the data is already parsed, for example. from a grid view component. Each cell can be a string or number.. If not switchRowsAndColumns is set, the columns are interpreted as. series.</p>
    * @param complete <p>The callback that is evaluated when the data is finished loading,. optionally from an external source, and parsed. The first argument. passed is a finished chart options object, containing the series.. These options can be extended with additional options and passed. directly to the chart constructor.</p>
    * @param csv <p>A comma delimited string to be parsed. Related options are <a href="#data.startRow">startRow</a>, <a href="#data.endRow">endRow</a>, <a href="#data.startColumn">startColumn</a>. and <a href="#data.endColumn">endColumn</a> to delimit what part of the table. is used. The <a href="#data.lineDelimiter">lineDelimiter</a> and <a href="#data.itemDelimiter">itemDelimiter</a> options define the CSV delimiter formats.</p>. <p>The built-in CSV parser doesn&#39;t support all flavours of CSV, so in. some cases it may be necessary to use an external CSV parser. See. <a href="https://jsfiddle.net/highcharts/u59176h4/">this example</a> of parsing. CSV through the MIT licensed <a href="http://papaparse.com/">Papa Parse</a>. library.</p>
    * @param dateFormat <p>Which of the predefined date formats in Date.prototype.dateFormats. to use to parse date values. Defaults to a best guess based on what. format gives valid and ordered dates.</p>. <p>Valid options include:</p>. <ul>. <li><code>YYYY/mm/dd</code></li>. <li><code>dd/mm/YYYY</code></li>. <li><code>mm/dd/YYYY</code></li>. <li><code>dd/mm/YY</code></li>. <li><code>mm/dd/YY</code></li>. </ul>
    * @param decimalPoint <p>The decimal point used for parsing numbers in the CSV.</p>. <p>If both this and data.delimiter is set to false, the parser will. attempt to deduce the decimal point automatically.</p>
    * @param endColumn <p>In tabular input data, the last column (indexed by 0) to use. Defaults. to the last column containing data.</p>
    * @param endRow <p>In tabular input data, the last row (indexed by 0) to use. Defaults. to the last row containing data.</p>
    * @param firstRowAsNames <p>Whether to use the first row in the data set as series names.</p>
    * @param googleSpreadsheetKey <p>The key for a Google Spreadsheet to load. See <a href="https://developers.google.com/gdata/samples/spreadsheet_sample">general information. on GS</a>.</p>
    * @param googleSpreadsheetWorksheet <p>The Google Spreadsheet worksheet to use in combination with. <a href="#data.googleSpreadsheetKey">googleSpreadsheetKey</a>. The available id&#39;s from. your sheet can be read from <code>https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic</code>.</p>
    * @param itemDelimiter <p>Item or cell delimiter for parsing CSV. Defaults to the tab character. <code>\t</code> if a tab character is found in the CSV string, if not it defaults. to <code>,</code>.</p>. <p>If this is set to false or undefined, the parser will attempt to deduce. the delimiter automatically.</p>
    * @param lineDelimiter <p>Line delimiter for parsing CSV.</p>
    * @param parseDate <p>A callback function to parse string representations of dates into. JavaScript timestamps. Should return an integer timestamp on success.</p>
    * @param parsed <p>A callback function to access the parsed columns, the two-dimentional. input data array directly, before they are interpreted into series. data and categories. Return <code>false</code> to stop completion, or call. <code>this.complete()</code> to continue async.</p>
    * @param rows <p>The same as the columns input option, but defining rows intead of. columns.</p>
    * @param seriesMapping <p>An array containing object with Point property names along with what. column id the property should be taken from.</p>
    * @param startColumn <p>In tabular input data, the first column (indexed by 0) to use.</p>
    * @param startRow <p>In tabular input data, the first row (indexed by 0) to use.</p>
    * @param switchRowsAndColumns <p>Switch rows and columns of the input data, so that <code>this.columns</code>. effectively becomes the rows of the data set, and the rows are interpreted. as series.</p>
    * @param table <p>An HTML table or the id of such to be parsed as input data. Related. options are <code>startRow</code>, <code>endRow</code>, <code>startColumn</code> and <code>endColumn</code> to. delimit what part of the table is used.</p>
    * @param csvURL <p>A URL to a remote CSV dataset.. Will be fetched when the chart is created using Ajax.</p>
    * @param rowsURL <p>A URL to a remote JSON dataset, structured as a row array.. Will be fetched when the chart is created using Ajax.</p>
    * @param columnsURL <p>A URL to a remote JSON dataset, structured as a column array.. Will be fetched when the chart is created using Ajax.</p>
    * @param dataRefreshRate <p>Sets the refresh rate for data polling when importing remote dataset by. setting <a href="data.csvURL">data.csvURL</a>, <a href="data.rowsURL">data.rowsURL</a>,. <a href="data.columnsURL">data.columnsURL</a>, or. <a href="data.googleSpreadsheetKey">data.googleSpreadsheetKey</a>.</p>. <p>Note that polling must be enabled by setting. <a href="data.enablePolling">data.enablePolling</a> to true.</p>. <p>The value is the number of seconds between pollings.. It cannot be set to less than 1 second.</p>
    * @param enablePolling <p>Enables automatic refetching of remote datasets every <em>n</em> seconds (defined by. setting <a href="data.dataRefreshRate">data.dataRefreshRate</a>).</p>. <p>Only works when either <a href="data.csvURL">data.csvURL</a>,. <a href="data.rowsURL">data.rowsURL</a>, <a href="data.columnsURL">data.columnsURL</a>, or. <a href="data.googleSpreadsheetKey">data.googleSpreadsheetKey</a>.</p>
    */
  def apply(beforeParse: js.UndefOr[js.Function] = js.undefined, columns: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined, complete: js.UndefOr[js.Function] = js.undefined, csv: js.UndefOr[String] = js.undefined, dateFormat: js.UndefOr[String] = js.undefined, decimalPoint: js.UndefOr[String] = js.undefined, endColumn: js.UndefOr[Double] = js.undefined, endRow: js.UndefOr[Double] = js.undefined, firstRowAsNames: js.UndefOr[Boolean] = js.undefined, googleSpreadsheetKey: js.UndefOr[String] = js.undefined, googleSpreadsheetWorksheet: js.UndefOr[String] = js.undefined, itemDelimiter: js.UndefOr[String] = js.undefined, lineDelimiter: js.UndefOr[String] = js.undefined, parseDate: js.UndefOr[js.Function] = js.undefined, parsed: js.UndefOr[js.Function] = js.undefined, rows: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined, seriesMapping: js.UndefOr[js.Array[js.Object]] = js.undefined, startColumn: js.UndefOr[Double] = js.undefined, startRow: js.UndefOr[Double] = js.undefined, switchRowsAndColumns: js.UndefOr[Boolean] = js.undefined, table: js.UndefOr[String] = js.undefined, csvURL: js.UndefOr[String] = js.undefined, rowsURL: js.UndefOr[String] = js.undefined, columnsURL: js.UndefOr[String] = js.undefined, dataRefreshRate: js.UndefOr[Double] = js.undefined, enablePolling: js.UndefOr[Boolean] = js.undefined): Data = {
    val beforeParseOuter: js.UndefOr[js.Function] = beforeParse
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
    val csvURLOuter: js.UndefOr[String] = csvURL
    val rowsURLOuter: js.UndefOr[String] = rowsURL
    val columnsURLOuter: js.UndefOr[String] = columnsURL
    val dataRefreshRateOuter: js.UndefOr[Double] = dataRefreshRate
    val enablePollingOuter: js.UndefOr[Boolean] = enablePolling
    com.highcharts.HighchartsGenericObject.toCleanObject(new Data {
      override val beforeParse: js.UndefOr[js.Function] = beforeParseOuter
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
      override val csvURL: js.UndefOr[String] = csvURLOuter
      override val rowsURL: js.UndefOr[String] = rowsURLOuter
      override val columnsURL: js.UndefOr[String] = columnsURLOuter
      override val dataRefreshRate: js.UndefOr[Double] = dataRefreshRateOuter
      override val enablePolling: js.UndefOr[Boolean] = enablePollingOuter
    })
  }
}
