/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.api

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>Highcharts</code>
  */
@js.native
trait Highcharts extends js.Object {

  /**
    * As <code>Highcharts.Chart</code>, but without need for the <code>new</code> keyword.
    * @since 4.2.0
    */
  def chart(renderTo: String | js.Object = ???, options: js.Object = ???, callback: js.Function = ???): CleanJsObject[Chart] = js.native

  /**
    * As <code>Highcharts.StockChart</code>, but without need for the <code>new</code> keyword.
    * @since 4.2.0
    */
  def stockChart(renderTo: String | js.Object = ???, options: js.Object = ???, callback: js.Function = ???): CleanJsObject[Chart] = js.native

  /**
    * An array containing the current chart objects in the page. A chart's position in the array is preserved throughout the page's lifetime. When a chart is destroyed, the array item becomes <code>undefined</code>.
    * @since 2.3.4
    */
  val charts: js.Array[CleanJsObject[Chart]] = js.native

  /**
    * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970) into a human readable date string. The format is a subset of the formats for <a href="http://php.net/manual/en/function.strftime.php">PHP's strftime function</a>.
    * @param format A string containing some of the formats above.
    * @param time The JavaScript time to format.
    * @param capitalize Whether to capitalize words in the return string.
    */
  def dateFormat(format: String = ???, time: Double = ???, capitalize: Boolean = ???): String = js.native

  /**
    * Sets the options globally for all charts created after this has been called. Takes an options JavaScript object structure as the argument. These options are merged with the default options and the result is returned.
    * @param options The chart configuration object.
    */
  def setOptions(options: js.Object = ???): js.Object = js.native

  /**
    * Formats a JavaScript number with grouped thousands, a fixed amount of decimals and an optional decimal point. It is a port of PHP's function with the same name. See <a href="http://php.net/manual/en/function.number-format.php">PHP number_format</a> for a full explanation of the parameters.
    * @param number The raw number to format.
    * @param decimals The desired number of decimals.
    * @param decimalPoint The decimal point. Defaults to "." or to the string specified globally in options.lang.decimalPoint.
    * @param thousandsSep The thousands separator. Defaults to " " or to the string specified globally in options.lang.thousandsSep.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/highcharts-numberformat/" target="_blank">Custom number format</a>
    */
  def numberFormat(number: Double = ???, decimals: Double = ???, decimalPoint: String = ???, thousandsSep: String = ???): String = js.native

  /**
    * This is the constructor for creating a new basic chart object (not Stock chart).
    */
  def Chart(renderTo: String | js.Object = ???, options: js.Object = ???, callback: js.Function = ???): CleanJsObject[Chart] = js.native

  /**
    * This is the constructor for creating a new stock chart object. Basically a stock chart object is the same as a Chart object with some different default options.
    */
  def StockChart(renderTo: String | js.Object = ???, options: js.Object = ???, callback: js.Function = ???): CleanJsObject[Chart] = js.native
}
