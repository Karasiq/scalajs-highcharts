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
  * @note JavaScript name: <code>exporting-csv</code>
  */
@js.annotation.ScalaJSDefined
class ExportingCsv extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Formatter callback for the column headers. Parameters are:</p>
    * <ul>
    * <li><code>item</code> - The series or axis object)</li>
    * <li><code>key</code> -  The point key, for example y or z</li>
    * <li><code>keyLength</code> - The amount of value keys for this item, for
    * example a range series has the keys <code>low</code> and <code>high</code> so the
    * key length is 2.</li>
    * </ul>
    * <p>If <a href="#exporting.useMultiLevelHeaders">useMultiLevelHeaders</a> is
    * true, columnHeaderFormatter by default returns an object with
    * columnTitle and topLevelColumnTitle for each key. Columns with
    * the same topLevelColumnTitle have their titles merged into a
    * single cell with colspan for table/Excel export.</p>
    * <p>If <code>useMultiLevelHeaders</code> is false, or for CSV export, it returns
    * the series name, followed by the key if there is more than one
    * key.</p>
    * <p>For the axis it returns the axis title or &quot;Category&quot; or
    * &quot;DateTime&quot; by default.</p>
    * <p>Return <code>false</code> to use Highcharts&#39; proposed header.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/multilevel-table">Multiple table headers</a>
    * @since 6.0.0
    */
  val columnHeaderFormatter: js.UndefOr[js.Function | Null] = js.undefined

  /**
    * <p>Which date format to use for exported dates on a datetime X axis.
    * See <code>Highcharts.dateFormat</code>.</p>
    * @since 6.0.0
    */
  val dateFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Which decimal point to use for exported CSV. Defaults to the same
    * as the browser locale, typically <code>.</code> (English) or <code>,</code> (German,
    * French etc).</p>
    * @since 6.0.4
    */
  val decimalPoint: js.UndefOr[String] = js.undefined

  /**
    * <p>The item delimiter in the exported data. Use <code>;</code> for direct
    * exporting to Excel. Defaults to a best guess based on the browser
    * locale. If the locale <em>decimal point</em> is <code>,</code>, the <code>itemDelimiter</code>
    * defaults to <code>;</code>, otherwise the <code>itemDelimiter</code> defaults to <code>,</code>.</p>
    * @since 6.0.0
    */
  val itemDelimiter: js.UndefOr[String] = js.undefined

  /**
    * <p>The line delimiter in the exported data, defaults to a newline.</p>
    * @since 6.0.0
    */
  val lineDelimiter: js.UndefOr[String] = js.undefined
}

object ExportingCsv {
  /**
    * @param columnHeaderFormatter <p>Formatter callback for the column headers. Parameters are:</p>. <ul>. <li><code>item</code> - The series or axis object)</li>. <li><code>key</code> -  The point key, for example y or z</li>. <li><code>keyLength</code> - The amount of value keys for this item, for. example a range series has the keys <code>low</code> and <code>high</code> so the. key length is 2.</li>. </ul>. <p>If <a href="#exporting.useMultiLevelHeaders">useMultiLevelHeaders</a> is. true, columnHeaderFormatter by default returns an object with. columnTitle and topLevelColumnTitle for each key. Columns with. the same topLevelColumnTitle have their titles merged into a. single cell with colspan for table/Excel export.</p>. <p>If <code>useMultiLevelHeaders</code> is false, or for CSV export, it returns. the series name, followed by the key if there is more than one. key.</p>. <p>For the axis it returns the axis title or &quot;Category&quot; or. &quot;DateTime&quot; by default.</p>. <p>Return <code>false</code> to use Highcharts&#39; proposed header.</p>
    * @param dateFormat <p>Which date format to use for exported dates on a datetime X axis.. See <code>Highcharts.dateFormat</code>.</p>
    * @param decimalPoint <p>Which decimal point to use for exported CSV. Defaults to the same. as the browser locale, typically <code>.</code> (English) or <code>,</code> (German,. French etc).</p>
    * @param itemDelimiter <p>The item delimiter in the exported data. Use <code>;</code> for direct. exporting to Excel. Defaults to a best guess based on the browser. locale. If the locale <em>decimal point</em> is <code>,</code>, the <code>itemDelimiter</code>. defaults to <code>;</code>, otherwise the <code>itemDelimiter</code> defaults to <code>,</code>.</p>
    * @param lineDelimiter <p>The line delimiter in the exported data, defaults to a newline.</p>
    */
  def apply(columnHeaderFormatter: js.UndefOr[js.Function | Null] = js.undefined, dateFormat: js.UndefOr[String] = js.undefined, decimalPoint: js.UndefOr[String] = js.undefined, itemDelimiter: js.UndefOr[String] = js.undefined, lineDelimiter: js.UndefOr[String] = js.undefined): ExportingCsv = {
    val columnHeaderFormatterOuter: js.UndefOr[js.Function | Null] = columnHeaderFormatter
    val dateFormatOuter: js.UndefOr[String] = dateFormat
    val decimalPointOuter: js.UndefOr[String] = decimalPoint
    val itemDelimiterOuter: js.UndefOr[String] = itemDelimiter
    val lineDelimiterOuter: js.UndefOr[String] = lineDelimiter
    com.highcharts.HighchartsGenericObject.toCleanObject(new ExportingCsv {
      override val columnHeaderFormatter: js.UndefOr[js.Function | Null] = columnHeaderFormatterOuter
      override val dateFormat: js.UndefOr[String] = dateFormatOuter
      override val decimalPoint: js.UndefOr[String] = decimalPointOuter
      override val itemDelimiter: js.UndefOr[String] = itemDelimiterOuter
      override val lineDelimiter: js.UndefOr[String] = lineDelimiterOuter
    })
  }
}
