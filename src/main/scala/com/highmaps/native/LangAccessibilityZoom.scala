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
  * @note JavaScript name: <code>lang-accessibility-zoom</code>
  */
class LangAccessibilityZoom extends com.highcharts.HighchartsGenericObject {

  var mapZoomIn: js.UndefOr[String] = js.undefined

  var mapZoomOut: js.UndefOr[String] = js.undefined

  var resetZoomButton: js.UndefOr[String] = js.undefined
}

object LangAccessibilityZoom {
  /**
    */
  def apply(mapZoomIn: js.UndefOr[String] = js.undefined, mapZoomOut: js.UndefOr[String] = js.undefined, resetZoomButton: js.UndefOr[String] = js.undefined): LangAccessibilityZoom = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibilityZoom {
      this.mapZoomIn = mapZoomIn
      this.mapZoomOut = mapZoomOut
      this.resetZoomButton = resetZoomButton
    })
  }
}
