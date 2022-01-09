/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>lang-exportData</code>
  */
class LangExportData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The annotation column title.</p>
    * @since 8.1.0
    */
  var annotationHeader: js.UndefOr[String] = js.undefined

  /**
    * <p>The category column title when axis type set to &quot;datetime&quot;.</p>
    * @since 8.1.0
    */
  var categoryDatetimeHeader: js.UndefOr[String] = js.undefined

  /**
    * <p>The category column title.</p>
    * @since 8.1.0
    */
  var categoryHeader: js.UndefOr[String] = js.undefined
}

object LangExportData {
  /**
    * @param annotationHeader <p>The annotation column title.</p>
    * @param categoryDatetimeHeader <p>The category column title when axis type set to &quot;datetime&quot;.</p>
    * @param categoryHeader <p>The category column title.</p>
    */
  def apply(annotationHeader: js.UndefOr[String] = js.undefined, categoryDatetimeHeader: js.UndefOr[String] = js.undefined, categoryHeader: js.UndefOr[String] = js.undefined): LangExportData = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangExportData {
      this.annotationHeader = annotationHeader
      this.categoryDatetimeHeader = categoryDatetimeHeader
      this.categoryHeader = categoryHeader
    })
  }
}
