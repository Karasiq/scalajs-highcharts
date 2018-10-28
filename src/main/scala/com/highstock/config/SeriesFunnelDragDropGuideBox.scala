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
  * @note JavaScript name: <code>series&lt;funnel&gt;-dragDrop-guideBox</code>
  */
@js.annotation.ScalaJSDefined
class SeriesFunnelDragDropGuideBox extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Style options for the guide box default state.</p>
    * @since 6.2.0
    */
  val default: js.UndefOr[js.Object] = js.undefined
}

object SeriesFunnelDragDropGuideBox {
  /**
    * @param default <p>Style options for the guide box default state.</p>
    */
  def apply(default: js.UndefOr[js.Object] = js.undefined): SeriesFunnelDragDropGuideBox = {
    val defaultOuter: js.UndefOr[js.Object] = default
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesFunnelDragDropGuideBox {
      override val default: js.UndefOr[js.Object] = defaultOuter
    })
  }
}
