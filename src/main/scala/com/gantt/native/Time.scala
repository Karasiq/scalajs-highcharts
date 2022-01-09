/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>time</code>
  */
class Time extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A custom <code>Date</code> class for advanced date handling. For example,
    * <a href="https://github.com/tahajahangir/jdate">JDate</a> can be hooked in to
    * handle Jalali dates.</p>
    * @since 6.0.5
    */
  var Date: js.Any = js.undefined

  /**
    * <p>A callback to return the time zone offset for a given datetime. It
    * takes the timestamp in terms of milliseconds since January 1 1970,
    * and returns the timezone offset in minutes. This provides a hook
    * for drawing time based charts in specific time zones using their
    * local DST crossover dates, with the help of external libraries.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/gettimezoneoffset/">Use moment.js to draw Oslo time regardless of browser locale</a>
    * @since 6.0.5
    */
  var getTimezoneOffset: js.Any = js.undefined

  /**
    * <p>Allows to manually load the <code>moment.js</code> library from Highcharts options
    * instead of the <code>window</code>.
    * In case of loading the library from a <code>script</code> tag,
    * this option is not needed, it will be loaded from there by default.</p>
    * @since 8.2.0
    */
  var moment: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Requires <a href="https://momentjs.com/">moment.js</a>. If the timezone option
    * is specified, it creates a default
    * <a href="#time.getTimezoneOffset">getTimezoneOffset</a> function that looks
    * up the specified timezone in moment.js. If moment.js is not included,
    * this throws a Highcharts error in the console, but does not crash the
    * chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/timezone/">Europe/Oslo</a>
    * @since 6.0.5
    */
  var timezone: js.UndefOr[String] = js.undefined

  /**
    * <p>The timezone offset in minutes. Positive values are west, negative
    * values are east of UTC, as in the ECMAScript
    * <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset">getTimezoneOffset</a>
    * method. Use this to display UTC based data in a predefined time zone.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/timezoneoffset/">Timezone offset</a>
    * @since 6.0.5
    */
  var timezoneOffset: js.UndefOr[Double] = js.undefined

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
  var useUTC: js.UndefOr[Boolean] = js.undefined
}

object Time {
  /**
    * @param Date <p>A custom <code>Date</code> class for advanced date handling. For example,. <a href="https://github.com/tahajahangir/jdate">JDate</a> can be hooked in to. handle Jalali dates.</p>
    * @param getTimezoneOffset <p>A callback to return the time zone offset for a given datetime. It. takes the timestamp in terms of milliseconds since January 1 1970,. and returns the timezone offset in minutes. This provides a hook. for drawing time based charts in specific time zones using their. local DST crossover dates, with the help of external libraries.</p>
    * @param moment <p>Allows to manually load the <code>moment.js</code> library from Highcharts options. instead of the <code>window</code>.. In case of loading the library from a <code>script</code> tag,. this option is not needed, it will be loaded from there by default.</p>
    * @param timezone <p>Requires <a href="https://momentjs.com/">moment.js</a>. If the timezone option. is specified, it creates a default. <a href="#time.getTimezoneOffset">getTimezoneOffset</a> function that looks. up the specified timezone in moment.js. If moment.js is not included,. this throws a Highcharts error in the console, but does not crash the. chart.</p>
    * @param timezoneOffset <p>The timezone offset in minutes. Positive values are west, negative. values are east of UTC, as in the ECMAScript. <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset">getTimezoneOffset</a>. method. Use this to display UTC based data in a predefined time zone.</p>
    * @param useUTC <p>Whether to use UTC time for axis scaling, tickmark placement and. time display in <code>Highcharts.dateFormat</code>. Advantages of using UTC. is that the time displays equally regardless of the user agent&#39;s. time zone settings. Local time can be used when the data is loaded. in real time or when correct Daylight Saving Time transitions are. required.</p>
    */
  def apply(Date: js.UndefOr[js.Any] = js.undefined, getTimezoneOffset: js.UndefOr[js.Any] = js.undefined, moment: js.UndefOr[js.Function] = js.undefined, timezone: js.UndefOr[String] = js.undefined, timezoneOffset: js.UndefOr[Double] = js.undefined, useUTC: js.UndefOr[Boolean] = js.undefined): Time = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Time {
      this.Date = Date
      this.getTimezoneOffset = getTimezoneOffset
      this.moment = moment
      this.timezone = timezone
      this.timezoneOffset = timezoneOffset
      this.useUTC = useUTC
    })
  }
}
