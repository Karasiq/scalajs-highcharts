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
  * @note JavaScript name: <code>time</code>
  */
@js.annotation.ScalaJSDefined
class Time extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Whether to use UTC time for axis scaling, tickmark placement and
    * time display in <code>Highcharts.dateFormat</code>. Advantages of using UTC
    * is that the time displays equally regardless of the user agent&#39;s
    * time zone settings. Local time can be used when the data is loaded
    * in real time or when correct Daylight Saving Time transitions are
    * required.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/useutc-true/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/useutc-false/">False</a>
    * @since 6.0.5
    */
  val useUTC: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A custom <code>Date</code> class for advanced date handling. For example,
    * <a href="https://github.com/tahajahangir/jdate">JDate</a> can be hooked in to
    * handle Jalali dates.</p>
    * @since 4.0.4
    */
  val Date: js.Any = js.undefined

  /**
    * <p>A callback to return the time zone offset for a given datetime. It
    * takes the timestamp in terms of milliseconds since January 1 1970,
    * and returns the timezone offset in minutes. This provides a hook
    * for drawing time based charts in specific time zones using their
    * local DST crossover dates, with the help of external libraries.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/gettimezoneoffset/">Use moment.js to draw Oslo time regardless of browser locale</a>
    * @since 4.1.0
    */
  val getTimezoneOffset: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Requires <a href="http://momentjs.com/">moment.js</a>. If the timezone option
    * is specified, it creates a default
    * <a href="#time.getTimezoneOffset">getTimezoneOffset</a> function that looks
    * up the specified timezone in moment.js. If moment.js is not included,
    * this throws a Highcharts error in the console, but does not crash the
    * chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/timezone/">Europe/Oslo</a>
    * @since 5.0.7
    */
  val timezone: js.UndefOr[String] = js.undefined

  /**
    * <p>The timezone offset in minutes. Positive values are west, negative
    * values are east of UTC, as in the ECMAScript
    * <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset">getTimezoneOffset</a>
    * method. Use this to display UTC based data in a predefined time zone.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/timezoneoffset/">Timezone offset</a>
    * @since 3.0.8
    */
  val timezoneOffset: js.UndefOr[Double] = js.undefined
}

object Time {
  /**
    * @param useUTC <p>Whether to use UTC time for axis scaling, tickmark placement and. time display in <code>Highcharts.dateFormat</code>. Advantages of using UTC. is that the time displays equally regardless of the user agent&#39;s. time zone settings. Local time can be used when the data is loaded. in real time or when correct Daylight Saving Time transitions are. required.</p>
    * @param Date <p>A custom <code>Date</code> class for advanced date handling. For example,. <a href="https://github.com/tahajahangir/jdate">JDate</a> can be hooked in to. handle Jalali dates.</p>
    * @param getTimezoneOffset <p>A callback to return the time zone offset for a given datetime. It. takes the timestamp in terms of milliseconds since January 1 1970,. and returns the timezone offset in minutes. This provides a hook. for drawing time based charts in specific time zones using their. local DST crossover dates, with the help of external libraries.</p>
    * @param timezone <p>Requires <a href="http://momentjs.com/">moment.js</a>. If the timezone option. is specified, it creates a default. <a href="#time.getTimezoneOffset">getTimezoneOffset</a> function that looks. up the specified timezone in moment.js. If moment.js is not included,. this throws a Highcharts error in the console, but does not crash the. chart.</p>
    * @param timezoneOffset <p>The timezone offset in minutes. Positive values are west, negative. values are east of UTC, as in the ECMAScript. <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset">getTimezoneOffset</a>. method. Use this to display UTC based data in a predefined time zone.</p>
    */
  def apply(useUTC: js.UndefOr[Boolean] = js.undefined, Date: js.UndefOr[js.Any] = js.undefined, getTimezoneOffset: js.UndefOr[js.Function] = js.undefined, timezone: js.UndefOr[String] = js.undefined, timezoneOffset: js.UndefOr[Double] = js.undefined): Time = {
    val useUTCOuter: js.UndefOr[Boolean] = useUTC
    val DateOuter: js.Any = Date
    val getTimezoneOffsetOuter: js.UndefOr[js.Function] = getTimezoneOffset
    val timezoneOuter: js.UndefOr[String] = timezone
    val timezoneOffsetOuter: js.UndefOr[Double] = timezoneOffset
    com.highcharts.HighchartsGenericObject.toCleanObject(new Time {
      override val useUTC: js.UndefOr[Boolean] = useUTCOuter
      override val Date: js.Any = DateOuter
      override val getTimezoneOffset: js.UndefOr[js.Function] = getTimezoneOffsetOuter
      override val timezone: js.UndefOr[String] = timezoneOuter
      override val timezoneOffset: js.UndefOr[Double] = timezoneOffsetOuter
    })
  }
}
