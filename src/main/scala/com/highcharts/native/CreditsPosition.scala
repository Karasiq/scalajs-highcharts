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
  * @note JavaScript name: <code>credits-position</code>
  */
class CreditsPosition extends com.highcharts.HighchartsGenericObject {

  var align: js.UndefOr[String] = js.undefined

  var verticalAlign: js.UndefOr[String] = js.undefined

  var x: js.UndefOr[Double] = js.undefined

  var y: js.UndefOr[Double] = js.undefined
}

object CreditsPosition {
  /**
    */
  def apply(align: js.UndefOr[String] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): CreditsPosition = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new CreditsPosition {
      this.align = align
      this.verticalAlign = verticalAlign
      this.x = x
      this.y = y
    })
  }
}
