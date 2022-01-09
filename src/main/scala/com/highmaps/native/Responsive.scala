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
  * @note JavaScript name: <code>responsive</code>
  */
class Responsive extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A set of rules for responsive settings. The rules are executed from
    * the top down.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/">Axis changes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/">Axis changes</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/">Axis changes</a>
    * @since 5.0.0
    */
  var rules: js.UndefOr[js.Array[js.Any]] = js.undefined
}

object Responsive {
  /**
    * @param rules <p>A set of rules for responsive settings. The rules are executed from. the top down.</p>
    */
  def apply(rules: js.UndefOr[js.Array[js.Any]] = js.undefined): Responsive = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Responsive {
      this.rules = rules
    })
  }
}
