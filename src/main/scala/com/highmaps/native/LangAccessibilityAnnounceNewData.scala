/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>lang-accessibility-announceNewData</code>
  */
class LangAccessibilityAnnounceNewData extends com.highcharts.HighchartsGenericObject {

  var newDataAnnounce: js.UndefOr[String] = js.undefined

  var newPointAnnounceMultiple: js.UndefOr[String] = js.undefined

  var newPointAnnounceSingle: js.UndefOr[String] = js.undefined

  var newSeriesAnnounceMultiple: js.UndefOr[String] = js.undefined

  var newSeriesAnnounceSingle: js.UndefOr[String] = js.undefined
}

object LangAccessibilityAnnounceNewData {
  /**
    */
  def apply(newDataAnnounce: js.UndefOr[String] = js.undefined, newPointAnnounceMultiple: js.UndefOr[String] = js.undefined, newPointAnnounceSingle: js.UndefOr[String] = js.undefined, newSeriesAnnounceMultiple: js.UndefOr[String] = js.undefined, newSeriesAnnounceSingle: js.UndefOr[String] = js.undefined): LangAccessibilityAnnounceNewData = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibilityAnnounceNewData {
      this.newDataAnnounce = newDataAnnounce
      this.newPointAnnounceMultiple = newPointAnnounceMultiple
      this.newPointAnnounceSingle = newPointAnnounceSingle
      this.newSeriesAnnounceMultiple = newSeriesAnnounceMultiple
      this.newSeriesAnnounceSingle = newSeriesAnnounceSingle
    })
  }
}
