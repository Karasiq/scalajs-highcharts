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
  * @note JavaScript name: <code>mapNavigation-buttons-zoomIn</code>
  */
@js.annotation.ScalaJSDefined
class MapNavigationButtonsZoomIn extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Click handler for the button. Defaults to:</p>
    * <pre>function () {
    * this.mapZoom(0.5);
    * }</pre>
    */
  val onclick: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>The text for the button. The tooltip (title) is a language option
    * given by <a href="#lang.zoomIn">lang.zoomIn</a>.</p>
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * <p>The position of the zoomIn button relative to the vertical
    * alignment.</p>
    */
  val y: js.UndefOr[Double] = js.undefined
}

object MapNavigationButtonsZoomIn {
  /**
    * @param onclick <p>Click handler for the button. Defaults to:</p>. <pre>function () {. this.mapZoom(0.5);. }</pre>
    * @param text <p>The text for the button. The tooltip (title) is a language option. given by <a href="#lang.zoomIn">lang.zoomIn</a>.</p>
    * @param y <p>The position of the zoomIn button relative to the vertical. alignment.</p>
    */
  def apply(onclick: js.UndefOr[js.Function] = js.undefined, text: js.UndefOr[String] = js.undefined, y: js.UndefOr[Double] = js.undefined): MapNavigationButtonsZoomIn = {
    val onclickOuter: js.UndefOr[js.Function] = onclick
    val textOuter: js.UndefOr[String] = text
    val yOuter: js.UndefOr[Double] = y
    com.highcharts.HighchartsGenericObject.toCleanObject(new MapNavigationButtonsZoomIn {
      override val onclick: js.UndefOr[js.Function] = onclickOuter
      override val text: js.UndefOr[String] = textOuter
      override val y: js.UndefOr[Double] = yOuter
    })
  }
}
