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
  * @note JavaScript name: <code>series&lt;mapbubble&gt;-dragDrop-guideBox</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMapbubbleDragDropGuideBox extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Style options for the guide box default state.</p>
    * @since 6.2.0
    */
  val default: js.UndefOr[js.Object] = js.undefined
}

object SeriesMapbubbleDragDropGuideBox {
  /**
    * @param default <p>Style options for the guide box default state.</p>
    */
  def apply(default: js.UndefOr[js.Object] = js.undefined): SeriesMapbubbleDragDropGuideBox = {
    val defaultOuter: js.UndefOr[js.Object] = default
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMapbubbleDragDropGuideBox {
      override val default: js.UndefOr[js.Object] = defaultOuter
    })
  }
}
