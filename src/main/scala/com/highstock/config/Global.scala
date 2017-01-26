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
  * @note JavaScript name: <code>global</code>
  */
@js.annotation.ScalaJSDefined
class Global extends js.Object {

  /**
    * A custom <code>Date</code> class for advanced date handling. For example, <a href="https://github.com/tahajahangir/jdate">JDate</a> can be hooked in to handle Jalali dates.
    * @since 2.0.4
    */
  val Date: js.UndefOr[js.Object] = js.undefined

  /**
    * Path to the pattern image required by VML browsers in order to draw radial gradients.
    * @since 1.2.0
    */
  val VMLRadialGradientURL: js.UndefOr[String] = js.undefined

  /**
    * A callback to return the time zone offset for a given datetime. It takes the timestamp in terms of milliseconds since January 1 1970, and returns the timezone offset in minutes. This provides a hook for drawing time based charts in specific time zones using their local DST crossover dates, with the help of external libraries. 
    * @example  <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/global/gettimezoneoffset/" target="_blank">Use moment.js to draw Oslo time regardless of browser locale</a>
    * @since 2.1.0
    */
  val getTimezoneOffset: js.UndefOr[js.Function] = js.undefined

  /**
    * Requires <a href="http://momentjs.com/">moment.js</a>. If the timezone option is specified, it creates a default <a href="#global.getTimezoneOffset">getTimezoneOffset</a> function that looks up the specified timezone in moment.js. If moment.js is not included, this throws a Highcharts error in the console, but does not crash the chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.0.0/highslide-software/highcharts.com/tree/master/samples/highcharts/global/timezone/" target="_blank">Europe/Oslo</a>
    * @since 5.0.7
    */
  val timezone: js.UndefOr[String] = js.undefined

  /**
    * The timezone offset in minutes. Positive values are west, negative values are east of UTC, as in the ECMAScript <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset">getTimezoneOffset</a> method. Use this to display UTC based data in a predefined time zone. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/global/timezoneoffset/" target="_blank">Timezone offset</a>
    * @since 1.3.8
    */
  val timezoneOffset: js.UndefOr[Double] = js.undefined

  /**
    * Whether to use UTC time for axis scaling, tickmark placement and time display in  <code>Highcharts.dateFormat</code>. Advantages of using UTC is that the time displays equally regardless of the user agent's time zone settings. Local time can be used when the data is loaded in real time or when correct Daylight Saving Time transitions are required.
    */
  val useUTC: js.UndefOr[Boolean] = js.undefined
}

object Global {
  /**
    * @param Date A custom <code>Date</code> class for advanced date handling. For example, <a href="https://github.com/tahajahangir/jdate">JDate</a> can be hooked in to handle Jalali dates.
    * @param VMLRadialGradientURL Path to the pattern image required by VML browsers in order to draw radial gradients.
    * @param getTimezoneOffset A callback to return the time zone offset for a given datetime. It takes the timestamp in terms of milliseconds since January 1 1970, and returns the timezone offset in minutes. This provides a hook for drawing time based charts in specific time zones using their local DST crossover dates, with the help of external libraries. 
    * @param timezone Requires <a href="http://momentjs.com/">moment.js</a>. If the timezone option is specified, it creates a default <a href="#global.getTimezoneOffset">getTimezoneOffset</a> function that looks up the specified timezone in moment.js. If moment.js is not included, this throws a Highcharts error in the console, but does not crash the chart.
    * @param timezoneOffset The timezone offset in minutes. Positive values are west, negative values are east of UTC, as in the ECMAScript <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset">getTimezoneOffset</a> method. Use this to display UTC based data in a predefined time zone. 
    * @param useUTC Whether to use UTC time for axis scaling, tickmark placement and time display in  <code>Highcharts.dateFormat</code>. Advantages of using UTC is that the time displays equally regardless of the user agent's time zone settings. Local time can be used when the data is loaded in real time or when correct Daylight Saving Time transitions are required.
    */
  def apply(Date: js.UndefOr[js.Object] = js.undefined, VMLRadialGradientURL: js.UndefOr[String] = js.undefined, getTimezoneOffset: js.UndefOr[js.Function] = js.undefined, timezone: js.UndefOr[String] = js.undefined, timezoneOffset: js.UndefOr[Double] = js.undefined, useUTC: js.UndefOr[Boolean] = js.undefined): Global = {
    val DateOuter: js.UndefOr[js.Object] = Date
    val VMLRadialGradientURLOuter: js.UndefOr[String] = VMLRadialGradientURL
    val getTimezoneOffsetOuter: js.UndefOr[js.Function] = getTimezoneOffset
    val timezoneOuter: js.UndefOr[String] = timezone
    val timezoneOffsetOuter: js.UndefOr[Double] = timezoneOffset
    val useUTCOuter: js.UndefOr[Boolean] = useUTC
    new Global {
      override val Date: js.UndefOr[js.Object] = DateOuter
      override val VMLRadialGradientURL: js.UndefOr[String] = VMLRadialGradientURLOuter
      override val getTimezoneOffset: js.UndefOr[js.Function] = getTimezoneOffsetOuter
      override val timezone: js.UndefOr[String] = timezoneOuter
      override val timezoneOffset: js.UndefOr[Double] = timezoneOffsetOuter
      override val useUTC: js.UndefOr[Boolean] = useUTCOuter
    }
  }
}
