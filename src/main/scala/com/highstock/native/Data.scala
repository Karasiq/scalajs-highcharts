/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>data</code>
  */
class Data extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A callback function to modify the CSV before parsing it. Return the modified
    * string.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/line-ajax/">Modify CSV before parse</a>
    * @since 6.1.0
    */
  var beforeParse: js.Any = js.undefined

  /**
    * <p>A two-dimensional array representing the input data on tabular form.
    * This input can be used when the data is already parsed, for example
    * from a grid view component. Each cell can be a string or number.
    * If not switchRowsAndColumns is set, the columns are interpreted as
    * series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/columns/">Columns</a>
    * @since 4.0.0
    */
  var columns: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined

  /**
    * <p>A URL to a remote JSON dataset, structured as a column array.
    * Will be fetched when the chart is created using Ajax.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/livedata-columns">Columns with live polling</a>
    * @since 4.0.0
    */
  var columnsURL: js.UndefOr[String] = js.undefined

  /**
    * <p>The callback that is evaluated when the data is finished loading,
    * optionally from an external source, and parsed. The first argument
    * passed is a finished chart options object, containing the series.
    * These options can be extended with additional options and passed
    * directly to the chart constructor.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/complete/">Modify data on complete</a>
    * @since 4.0.0
    */
  var complete: js.Any = js.undefined

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
    * @since 4.0.0
    */
  var csv: js.UndefOr[String] = js.undefined

  /**
    * <p>An URL to a remote CSV dataset. Will be fetched when the chart is created
    * using Ajax.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/livedata-columns">Categorized bar chart with CSV and live polling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/livedata-csv">Time based line chart with CSV and live polling</a>
    * @since 4.0.0
    */
  var csvURL: js.UndefOr[String] = js.undefined

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
    * @since 4.0.0
    */
  var dataRefreshRate: js.UndefOr[Double] = js.undefined

  /**
    * <p>Which of the predefined date formats in Date.prototype.dateFormats
    * to use to parse date values. Defaults to a best guess based on what
    * format gives valid and ordered dates. Valid options include: <code>YYYY/mm/dd</code>,
    * <code>dd/mm/YYYY</code>, <code>mm/dd/YYYY</code>, <code>dd/mm/YY</code>, <code>mm/dd/YY</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/dateformat-auto/">Best guess date format</a>
    * @since 4.0.0
    */
  var dateFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>The decimal point used for parsing numbers in the CSV.</p>
    * <p>If both this and data.delimiter is set to <code>undefined</code>, the parser will
    * attempt to deduce the decimal point automatically.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/delimiters/">Comma as decimal point</a>
    * @since 4.1.0
    */
  var decimalPoint: js.UndefOr[String] = js.undefined

  /**
    * <p>Enables automatic refetching of remote datasets every <em>n</em> seconds (defined by
    * setting <a href="data.dataRefreshRate">data.dataRefreshRate</a>).</p>
    * <p>Only works when either <a href="data.csvURL">data.csvURL</a>,
    * <a href="data.rowsURL">data.rowsURL</a>, <a href="data.columnsURL">data.columnsURL</a>, or
    * <a href="data.googleSpreadsheetKey">data.googleSpreadsheetKey</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/live-data">Live data</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/livedata-columns">Categorized bar chart with CSV and live polling</a>
    * @since 4.0.0
    */
  var enablePolling: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>In tabular input data, the last column (indexed by 0) to use. Defaults
    * to the last column containing data.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Limited data</a>
    * @since 4.0.0
    */
  var endColumn: js.UndefOr[Double] = js.undefined

  /**
    * <p>In tabular input data, the last row (indexed by 0) to use. Defaults
    * to the last row containing data.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Limited data</a>
    * @since 4.0.4
    */
  var endRow: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to use the first row in the data set as series names.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Don't get series names from the CSV</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Don't get series names from the CSV</a>
    * @since 4.1.0
    */
  var firstRowAsNames: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The Google Spreadsheet API key required for access generated at <a href="https://console.cloud.google.com/apis/credentials">API Services
    * / Credentials</a>. See a
    * comprehensive tutorial for setting up the key at the
    * <a href="https://handsondataviz.org/google-sheets-api-key.html">Hands-On Data Visualization</a>
    * book website.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/google-spreadsheet/">Load a Google Spreadsheet</a>
    * @since 9.2.2
    */
  var googleAPIKey: js.UndefOr[String] = js.undefined

  /**
    * <p>The key or <code>spreadsheetId</code> value for a Google Spreadsheet to load. See
    * <a href="https://developers.google.com/sheets/api/guides/concepts">developers.google.com</a>
    * for how to find the <code>spreadsheetId</code>.</p>
    * <p>In order for Google Sheets to load, a valid <a href="#data.googleAPIKey">googleAPIKey</a>
    * must also be given.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/google-spreadsheet/">Load a Google Spreadsheet</a>
    * @since 4.0.0
    */
  var googleSpreadsheetKey: js.UndefOr[String] = js.undefined

  /**
    * <p>The Google Spreadsheet <code>range</code> to use in combination with
    * <a href="#data.googleSpreadsheetKey">googleSpreadsheetKey</a>. See
    * <a href="https://developers.google.com/sheets/api/reference/rest/v4/spreadsheets.values/get">developers.google.com</a>
    * for details.</p>
    * <p>If given, it takes precedence over <code>startColumn</code>, <code>endColumn</code>, <code>startRow</code> and
    * <code>endRow</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/google-spreadsheet/">Load a Google Spreadsheet</a>
    * @since 9.2.2
    */
  var googleSpreadsheetRange: js.UndefOr[js.UndefOr[String]] = js.undefined

  /**
    * <p>No longer works since v9.2.2, that uses Google Sheets API v4. Instead, use
    * the <a href="#data.googleSpreadsheetRange">googleSpreadsheetRange</a> option to load a
    * specific sheet.</p>
    * @since 4.0.0
    */
  var googleSpreadsheetWorksheet: js.UndefOr[String] = js.undefined

  /**
    * <p>Item or cell delimiter for parsing CSV. Defaults to the tab character
    * <code>\t</code> if a tab character is found in the CSV string, if not it defaults
    * to <code>,</code>.</p>
    * <p>If this is set to false or undefined, the parser will attempt to deduce
    * the delimiter automatically.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/delimiters/">Delimiters</a>
    * @since 4.0.0
    */
  var itemDelimiter: js.UndefOr[String] = js.undefined

  /**
    * <p>Line delimiter for parsing CSV.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/delimiters/">Delimiters</a>
    * @since 4.0.0
    */
  var lineDelimiter: js.UndefOr[String] = js.undefined

  /**
    * <p>A callback function to parse string representations of dates into
    * JavaScript timestamps. Should return an integer timestamp on success.</p>
    * @since 4.0.0
    */
  var parseDate: js.Any = js.undefined

  /**
    * <p>A callback function to access the parsed columns, the two-dimentional
    * input data array directly, before they are interpreted into series
    * data and categories. Return <code>false</code> to stop completion, or call
    * <code>this.complete()</code> to continue async.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/parsed/">Modify data after parse</a>
    * @since 4.0.0
    */
  var parsed: js.Any = js.undefined

  /**
    * <p>The same as the columns input option, but defining rows intead of
    * columns.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/rows/">Data in rows</a>
    * @since 4.0.0
    */
  var rows: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined

  /**
    * <p>A URL to a remote JSON dataset, structured as a row array.
    * Will be fetched when the chart is created using Ajax.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/livedata-rows">Rows with live polling</a>
    * @since 4.0.0
    */
  var rowsURL: js.UndefOr[String] = js.undefined

  /**
    * <p>An array containing dictionaries for each series. A dictionary exists of
    * Point property names as the key and the CSV column index as the value.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/seriesmapping-label/">Label from data set</a>
    * @since 4.0.4
    */
  var seriesMapping: js.UndefOr[js.Array[js.Object]] = js.undefined

  /**
    * <p>In tabular input data, the first column (indexed by 0) to use.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Limited data</a>
    * @since 4.0.0
    */
  var startColumn: js.UndefOr[Double] = js.undefined

  /**
    * <p>In tabular input data, the first row (indexed by 0) to use.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Limited data</a>
    * @since 4.0.0
    */
  var startRow: js.UndefOr[Double] = js.undefined

  /**
    * <p>Switch rows and columns of the input data, so that <code>this.columns</code>
    * effectively becomes the rows of the data set, and the rows are interpreted
    * as series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/switchrowsandcolumns/">Switch rows and columns</a>
    * @since 4.0.0
    */
  var switchRowsAndColumns: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>An HTML table or the id of such to be parsed as input data. Related
    * options are <code>startRow</code>, <code>endRow</code>, <code>startColumn</code> and <code>endColumn</code> to
    * delimit what part of the table is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/column-parsed/">Parsed table</a>
    * @since 4.0.0
    */
  var table: js.UndefOr[String | dom.Element] = js.undefined
}

object Data {
  /**
    * @param beforeParse <p>A callback function to modify the CSV before parsing it. Return the modified. string.</p>
    * @param columns <p>A two-dimensional array representing the input data on tabular form.. This input can be used when the data is already parsed, for example. from a grid view component. Each cell can be a string or number.. If not switchRowsAndColumns is set, the columns are interpreted as. series.</p>
    * @param columnsURL <p>A URL to a remote JSON dataset, structured as a column array.. Will be fetched when the chart is created using Ajax.</p>
    * @param complete <p>The callback that is evaluated when the data is finished loading,. optionally from an external source, and parsed. The first argument. passed is a finished chart options object, containing the series.. These options can be extended with additional options and passed. directly to the chart constructor.</p>
    * @param csv <p>A comma delimited string to be parsed. Related options are <a href="#data.startRow">startRow</a>, <a href="#data.endRow">endRow</a>, <a href="#data.startColumn">startColumn</a>. and <a href="#data.endColumn">endColumn</a> to delimit what part of the table. is used. The <a href="#data.lineDelimiter">lineDelimiter</a> and <a href="#data.itemDelimiter">itemDelimiter</a> options define the CSV delimiter formats.</p>. <p>The built-in CSV parser doesn&#39;t support all flavours of CSV, so in. some cases it may be necessary to use an external CSV parser. See. <a href="https://jsfiddle.net/highcharts/u59176h4/">this example</a> of parsing. CSV through the MIT licensed <a href="http://papaparse.com/">Papa Parse</a>. library.</p>
    * @param csvURL <p>An URL to a remote CSV dataset. Will be fetched when the chart is created. using Ajax.</p>
    * @param dataRefreshRate <p>Sets the refresh rate for data polling when importing remote dataset by. setting <a href="data.csvURL">data.csvURL</a>, <a href="data.rowsURL">data.rowsURL</a>,. <a href="data.columnsURL">data.columnsURL</a>, or. <a href="data.googleSpreadsheetKey">data.googleSpreadsheetKey</a>.</p>. <p>Note that polling must be enabled by setting. <a href="data.enablePolling">data.enablePolling</a> to true.</p>. <p>The value is the number of seconds between pollings.. It cannot be set to less than 1 second.</p>
    * @param dateFormat <p>Which of the predefined date formats in Date.prototype.dateFormats. to use to parse date values. Defaults to a best guess based on what. format gives valid and ordered dates. Valid options include: <code>YYYY/mm/dd</code>,. <code>dd/mm/YYYY</code>, <code>mm/dd/YYYY</code>, <code>dd/mm/YY</code>, <code>mm/dd/YY</code>.</p>
    * @param decimalPoint <p>The decimal point used for parsing numbers in the CSV.</p>. <p>If both this and data.delimiter is set to <code>undefined</code>, the parser will. attempt to deduce the decimal point automatically.</p>
    * @param enablePolling <p>Enables automatic refetching of remote datasets every <em>n</em> seconds (defined by. setting <a href="data.dataRefreshRate">data.dataRefreshRate</a>).</p>. <p>Only works when either <a href="data.csvURL">data.csvURL</a>,. <a href="data.rowsURL">data.rowsURL</a>, <a href="data.columnsURL">data.columnsURL</a>, or. <a href="data.googleSpreadsheetKey">data.googleSpreadsheetKey</a>.</p>
    * @param endColumn <p>In tabular input data, the last column (indexed by 0) to use. Defaults. to the last column containing data.</p>
    * @param endRow <p>In tabular input data, the last row (indexed by 0) to use. Defaults. to the last row containing data.</p>
    * @param firstRowAsNames <p>Whether to use the first row in the data set as series names.</p>
    * @param googleAPIKey <p>The Google Spreadsheet API key required for access generated at <a href="https://console.cloud.google.com/apis/credentials">API Services. / Credentials</a>. See a. comprehensive tutorial for setting up the key at the. <a href="https://handsondataviz.org/google-sheets-api-key.html">Hands-On Data Visualization</a>. book website.</p>
    * @param googleSpreadsheetKey <p>The key or <code>spreadsheetId</code> value for a Google Spreadsheet to load. See. <a href="https://developers.google.com/sheets/api/guides/concepts">developers.google.com</a>. for how to find the <code>spreadsheetId</code>.</p>. <p>In order for Google Sheets to load, a valid <a href="#data.googleAPIKey">googleAPIKey</a>. must also be given.</p>
    * @param googleSpreadsheetRange <p>The Google Spreadsheet <code>range</code> to use in combination with. <a href="#data.googleSpreadsheetKey">googleSpreadsheetKey</a>. See. <a href="https://developers.google.com/sheets/api/reference/rest/v4/spreadsheets.values/get">developers.google.com</a>. for details.</p>. <p>If given, it takes precedence over <code>startColumn</code>, <code>endColumn</code>, <code>startRow</code> and. <code>endRow</code>.</p>
    * @param googleSpreadsheetWorksheet <p>No longer works since v9.2.2, that uses Google Sheets API v4. Instead, use. the <a href="#data.googleSpreadsheetRange">googleSpreadsheetRange</a> option to load a. specific sheet.</p>
    * @param itemDelimiter <p>Item or cell delimiter for parsing CSV. Defaults to the tab character. <code>\t</code> if a tab character is found in the CSV string, if not it defaults. to <code>,</code>.</p>. <p>If this is set to false or undefined, the parser will attempt to deduce. the delimiter automatically.</p>
    * @param lineDelimiter <p>Line delimiter for parsing CSV.</p>
    * @param parseDate <p>A callback function to parse string representations of dates into. JavaScript timestamps. Should return an integer timestamp on success.</p>
    * @param parsed <p>A callback function to access the parsed columns, the two-dimentional. input data array directly, before they are interpreted into series. data and categories. Return <code>false</code> to stop completion, or call. <code>this.complete()</code> to continue async.</p>
    * @param rows <p>The same as the columns input option, but defining rows intead of. columns.</p>
    * @param rowsURL <p>A URL to a remote JSON dataset, structured as a row array.. Will be fetched when the chart is created using Ajax.</p>
    * @param seriesMapping <p>An array containing dictionaries for each series. A dictionary exists of. Point property names as the key and the CSV column index as the value.</p>
    * @param startColumn <p>In tabular input data, the first column (indexed by 0) to use.</p>
    * @param startRow <p>In tabular input data, the first row (indexed by 0) to use.</p>
    * @param switchRowsAndColumns <p>Switch rows and columns of the input data, so that <code>this.columns</code>. effectively becomes the rows of the data set, and the rows are interpreted. as series.</p>
    * @param table <p>An HTML table or the id of such to be parsed as input data. Related. options are <code>startRow</code>, <code>endRow</code>, <code>startColumn</code> and <code>endColumn</code> to. delimit what part of the table is used.</p>
    */
  def apply(beforeParse: js.UndefOr[js.Any] = js.undefined, columns: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined, columnsURL: js.UndefOr[String] = js.undefined, complete: js.UndefOr[js.Any] = js.undefined, csv: js.UndefOr[String] = js.undefined, csvURL: js.UndefOr[String] = js.undefined, dataRefreshRate: js.UndefOr[Double] = js.undefined, dateFormat: js.UndefOr[String] = js.undefined, decimalPoint: js.UndefOr[String] = js.undefined, enablePolling: js.UndefOr[Boolean] = js.undefined, endColumn: js.UndefOr[Double] = js.undefined, endRow: js.UndefOr[Double] = js.undefined, firstRowAsNames: js.UndefOr[Boolean] = js.undefined, googleAPIKey: js.UndefOr[String] = js.undefined, googleSpreadsheetKey: js.UndefOr[String] = js.undefined, googleSpreadsheetRange: js.UndefOr[js.UndefOr[String]] = js.undefined, googleSpreadsheetWorksheet: js.UndefOr[String] = js.undefined, itemDelimiter: js.UndefOr[String] = js.undefined, lineDelimiter: js.UndefOr[String] = js.undefined, parseDate: js.UndefOr[js.Any] = js.undefined, parsed: js.UndefOr[js.Any] = js.undefined, rows: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined, rowsURL: js.UndefOr[String] = js.undefined, seriesMapping: js.UndefOr[js.Array[js.Object]] = js.undefined, startColumn: js.UndefOr[Double] = js.undefined, startRow: js.UndefOr[Double] = js.undefined, switchRowsAndColumns: js.UndefOr[Boolean] = js.undefined, table: js.UndefOr[String | dom.Element] = js.undefined): Data = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Data {
      this.beforeParse = beforeParse
      this.columns = columns
      this.columnsURL = columnsURL
      this.complete = complete
      this.csv = csv
      this.csvURL = csvURL
      this.dataRefreshRate = dataRefreshRate
      this.dateFormat = dateFormat
      this.decimalPoint = decimalPoint
      this.enablePolling = enablePolling
      this.endColumn = endColumn
      this.endRow = endRow
      this.firstRowAsNames = firstRowAsNames
      this.googleAPIKey = googleAPIKey
      this.googleSpreadsheetKey = googleSpreadsheetKey
      this.googleSpreadsheetRange = googleSpreadsheetRange
      this.googleSpreadsheetWorksheet = googleSpreadsheetWorksheet
      this.itemDelimiter = itemDelimiter
      this.lineDelimiter = lineDelimiter
      this.parseDate = parseDate
      this.parsed = parsed
      this.rows = rows
      this.rowsURL = rowsURL
      this.seriesMapping = seriesMapping
      this.startColumn = startColumn
      this.startRow = startRow
      this.switchRowsAndColumns = switchRowsAndColumns
      this.table = table
    })
  }
}
