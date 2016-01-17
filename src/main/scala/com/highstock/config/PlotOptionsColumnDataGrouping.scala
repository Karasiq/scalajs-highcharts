/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-column-dataGrouping</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsColumnDataGrouping extends js.Object {

  /**
    * <p>The method of approximation inside a group. When for example
    *  30 days are grouped into one month, this determines what value should represent the
    *  group. Possible values are "average", "open", "high", "low", "close" and "sum". For
    *  OHLC and candlestick series the approximation is "ohlc" by default, which finds the 
    *  open, high, low and close values within all the grouped data. For ranges, the approximation is "range", which finds the low and high values.</p>
    *  
    *  <p>Custom aggregate methods
    *  can be added by assigning a callback function as the approximation. This function takes
    *  a numeric array as the argument and should return a single numeric value or <code>null</code>. Note that
    *  the numeric array will never contain null values, only true numbers. Instead, if null
    *  values are present in the raw data, the numeric array will have an <code>.hasNulls</code>
    *  property set to <code>true</code>. For single-value data sets the data is available in the first
    *  argument of the callback function. For OHLC data sets, all the open values are in the first
    *  argument, all high values in the second etc.</p>
    * 
    * <p>Defaults to <code>average</code> for line-type series, <code>sum</code> for columns, <code>range</code> for range series and <code>ohlc</code> for OHLC and candlestick.
    */
  val approximation: js.UndefOr[String | js.Function] = js.undefined

  /**
    * <p>Datetime formats for the header of the tooltip in a stock chart. The format can vary within a chart depending on the currently selected time range and the current data grouping.</p>
    * 
    * <p>The default formats are: </p>
    * <pre>{
    *    millisecond: ['%A, %b %e, %H:%M:%S.%L', '%A, %b %e, %H:%M:%S.%L', '-%H:%M:%S.%L'],
    *    second: ['%A, %b %e, %H:%M:%S', '%A, %b %e, %H:%M:%S', '-%H:%M:%S'],
    *    minute: ['%A, %b %e, %H:%M', '%A, %b %e, %H:%M', '-%H:%M'],
    *    hour: ['%A, %b %e, %H:%M', '%A, %b %e, %H:%M', '-%H:%M'],
    *    day: ['%A, %b %e, %Y', '%A, %b %e', '-%A, %b %e, %Y'],
    *    week: ['Week from %A, %b %e, %Y', '%A, %b %e', '-%A, %b %e, %Y'],
    *    month: ['%B %Y', '%B', '-%B %Y'],
    *    year: ['%Y', '%Y', '-%Y']
    * }</pre>
    * 
    * <p>For each of these array definitions, the first item is the format used when the active time span is one unit. For instance, if the current data applies to one week, the first item of the week array is used. The second and third items are used when the active time span is more than two units. For instance, if the current data applies to two weeks, the second and third item of the week array are used, and applied to the start and end date of the time span.</p>
    */
  val dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined

  /**
    * Enable or disable data grouping. Defaults to <code>true</code>.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * When data grouping is forced, it runs no matter how small the intervals are. This can be handy for example when the sum should be calculated for values appearing at random times within each hour. Defaults to <code>false</code>.
    */
  val forced: js.UndefOr[Boolean] = js.undefined

  /**
    * The approximate pixel width of each group. If for example a series with 30 points is displayed over a 600 pixel wide plot area, no grouping is performed. If however the series contains so many points that the spacing is less than the  groupPixelWidth, Highcharts will try to group it into appropriate groups so that each is more or less two pixels wide. Defaults to <code>10</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/plotoptions/series-datagrouping-grouppixelwidth/" target="_blank">
				Two series with the same data density but different groupPixelWidth
			</a>
    */
  val groupPixelWidth: js.UndefOr[Double] = js.undefined

  /**
    * Normally, a group is indexed by the start of that group, so for example when 30 daily values are grouped into one month, that month's x value will be the 1st of  the month. This apparently shifts the data to the left. When the smoothed option is true, this is compensated for. The data is shifted to the middle of the group, and min and max values are preserved. Internally, this is used in the Navigator series. 
    */
  val smoothed: js.UndefOr[Boolean] = js.undefined

  /**
    * An array determining what time intervals the data is allowed to be grouped to. Each array item is an array where the first value is the time unit and the  second value another array of allowed multiples. Defaults to:
    * <pre>units: [[
    * 	'millisecond', // unit name
    * 	[1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples
    * ], [
    * 	'second',
    * 	[1, 2, 5, 10, 15, 30]
    * ], [
    * 	'minute',
    * 	[1, 2, 5, 10, 15, 30]
    * ], [
    * 	'hour',
    * 	[1, 2, 3, 4, 6, 8, 12]
    * ], [
    * 	'day',
    * 	[1]
    * ], [
    * 	'week',
    * 	[1]
    * ], [
    * 	'month',
    * 	[1, 3, 6]
    * ], [
    * 	'year',
    * 	null
    * ]]</pre>
    */
  val units: js.UndefOr[js.Array[js.Any]] = js.undefined
}
