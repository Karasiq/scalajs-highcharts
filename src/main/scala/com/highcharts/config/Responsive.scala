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
  * @note JavaScript name: <code>responsive</code>
  */
@js.annotation.ScalaJSDefined
class Responsive extends js.Object {

  /**
    * A set of rules for responsive settings. The rules are executed from the top down.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/" target="_blank">Axis changes</a>
    * @since 5.0.0
    */
  val rules: js.UndefOr[js.Array[CleanJsObject[ResponsiveRules]]] = js.undefined
}

object Responsive {
  /**
    * @param rules A set of rules for responsive settings. The rules are executed from the top down.
    */
  def apply(rules: js.UndefOr[js.Array[CleanJsObject[ResponsiveRules]]] = js.undefined): Responsive = {
    val rulesOuter: js.UndefOr[js.Array[CleanJsObject[ResponsiveRules]]] = rules
    new Responsive {
      override val rules: js.UndefOr[js.Array[CleanJsObject[ResponsiveRules]]] = rulesOuter
    }
  }
}
