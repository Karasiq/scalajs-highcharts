/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>exporting-csv-annotations</code>
  */
class ExportingCsvAnnotations extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The way to mark the separator for annotations
    * combined in one export-data table cell.</p>
    * @since 8.2.0
    */
  var itemDelimiter: js.UndefOr[String] = js.undefined

  /**
    * <p>When several labels are assigned to a specific point,
    * they will be displayed in one field in the table.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/join-annotations/">Concatenate point annotations with itemDelimiter set.</a>
    * @since 8.2.0
    */
  var join: js.UndefOr[Boolean] = js.undefined
}

object ExportingCsvAnnotations {
  /**
    * @param itemDelimiter <p>The way to mark the separator for annotations. combined in one export-data table cell.</p>
    * @param join <p>When several labels are assigned to a specific point,. they will be displayed in one field in the table.</p>
    */
  def apply(itemDelimiter: js.UndefOr[String] = js.undefined, join: js.UndefOr[Boolean] = js.undefined): ExportingCsvAnnotations = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ExportingCsvAnnotations {
      this.itemDelimiter = itemDelimiter
      this.join = join
    })
  }
}
