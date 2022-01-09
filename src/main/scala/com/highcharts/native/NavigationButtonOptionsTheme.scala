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
  * @note JavaScript name: <code>navigation-buttonOptions-theme</code>
  */
class NavigationButtonOptionsTheme extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The default fill exists only to capture hover events.</p>
    */
  var fill: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Default stroke for the buttons.</p>
    */
  var stroke: js.UndefOr[String] = js.undefined
}

object NavigationButtonOptionsTheme {
  /**
    * @param fill <p>The default fill exists only to capture hover events.</p>
    * @param stroke <p>Default stroke for the buttons.</p>
    */
  def apply(fill: js.UndefOr[String | js.Object] = js.undefined, stroke: js.UndefOr[String] = js.undefined): NavigationButtonOptionsTheme = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigationButtonOptionsTheme {
      this.fill = fill
      this.stroke = stroke
    })
  }
}
