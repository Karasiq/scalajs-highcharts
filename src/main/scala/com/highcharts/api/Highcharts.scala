/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.3 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.api

import scalajs.js, js.UndefOr

@js.native
trait Highcharts extends js.Object {
  
  /**
   * An array containing the current chart objects in the page. A chart's position in the array is preserved throughout the page's lifetime. When a chart is destroyed, the array item becomes <code>undefined</code>.
   * @since 2.3.4
   */
  val charts: UndefOr[js.Array[Chart]] = js.native
  
  /**
   * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970) into a human readable date string. The format is a subset of the formats for <a href="http://php.net/manual/en/function.strftime.php">PHP's strftime function</a>. Additional formats can be given  in the Highcharts.dateFormats hook, see below.
   * @param format A string containing some of the formats above.
   * @param time The JavaScript time to format.
   * @param capitalize Whether to capitalize words in the return string.
   */
  def dateFormat(format: UndefOr[String] = js.undefined, time: UndefOr[Double] = js.undefined, capitalize: UndefOr[Boolean] = js.undefined): String = js.native
  
  /**
   * A hook for defining additional date format specifiers. New specifiers are defined as key-value pairs by using the specifier as key, and a function which takes the timestamp as value. This function returns the formatted portion of the date.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/global/dateformats/" target="_blank">Adding support for week number</a>
   * @since 3.0
   */
  val dateFormats: UndefOr[js.Any] = js.native
  
  /**
   * Sets the options globally for all charts created after this has been called. Takes an options JavaScript object structure as the argument. These options are merged with the default options and the result is returned.
   * @param options The chart configuration object.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/global/useutc-false/" target="_blank">Setting a global option</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/setoptions/" target="_blank">applying a general theme</a>
   */
  def setOptions(options: UndefOr[js.Object] = js.undefined): js.Object = js.native
  
  /**
   * Formats a JavaScript number with grouped thousands, a fixed amount of decimals and an optional decimal point. It is a port of PHP's function with the same name. See <a href="http://php.net/manual/en/function.number-format.php">PHP number_format</a> for a full explanation of the parameters.
   * @param number The raw number to format.
   * @param decimals The desired number of decimals.
   * @param decimalPoint The decimal point. Defaults to "." or to the string specified globally in options.lang.decimalPoint.
   * @param thousandsSep The thousands separator. Defaults to " " or to the string specified globally in options.lang.thousandsSep.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/highcharts-numberformat/" target="_blank">Custom number format</a>
   */
  def numberFormat(number: UndefOr[Double] = js.undefined, decimals: UndefOr[Double] = js.undefined, decimalPoint: UndefOr[String] = js.undefined, thousandsSep: UndefOr[String] = js.undefined): String = js.native
  
  /**
   * This is the constructor for creating a new chart object.
   */
  def Chart(renderTo: UndefOr[js.Any] = js.undefined, options: UndefOr[js.Object] = js.undefined, callback: UndefOr[js.Function] = js.undefined): Chart = js.native
  
  /**
   * As <code>Highcharts.Chart</code>, but without need for the <code>new</code> keyword.
   * @since 4.2.0
   */
  def chart(renderTo: UndefOr[js.Any] = js.undefined, options: UndefOr[js.Object] = js.undefined, callback: UndefOr[js.Function] = js.undefined): Chart = js.native
}
