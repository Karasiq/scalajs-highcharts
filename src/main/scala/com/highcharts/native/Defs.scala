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
  * @note JavaScript name: <code>defs</code>
  */
class Defs extends com.highcharts.HighchartsGenericObject {

  var arrow: js.Any = js.undefined

  var `reverse-arrow`: js.Any = js.undefined
}

object Defs {
  /**
    */
  def apply(arrow: js.UndefOr[js.Any] = js.undefined, `reverse-arrow`: js.UndefOr[js.Any] = js.undefined): Defs = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Defs {
      this.arrow = arrow
      this.`reverse-arrow` = `reverse-arrow`
    })
  }
}
