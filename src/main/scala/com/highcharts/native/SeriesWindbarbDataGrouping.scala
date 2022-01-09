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
  * @note JavaScript name: <code>series&lt;windbarb&gt;-dataGrouping</code>
  */
class SeriesWindbarbDataGrouping extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Approximation function for the data grouping. The default
    * returns an average of wind speed and a vector average direction
    * weighted by wind speed.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-datagrouping-approximation">Approximation callback with custom data</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-datagrouping-simple-approximation">Simple approximation demo</a>
    * @since 7.1.0
    */
  var approximation: js.UndefOr[String | js.Function] = js.undefined

  /**
    * <p>Whether to enable data grouping.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The approximate data group width.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-datagrouping-grouppixelwidth/">Two series with the same data density but different groupPixelWidth</a>
    * @since 7.1.0
    */
  var groupPixelWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Specifies how the points should be located on the X axis inside the group.
    * Points that are extremes can be set separately. Available options:</p>
    * <ul>
    * <li><p><code>start</code> places the point at the beginning of the group
    * (e.g. range 00:00:00 - 23:59:59 -&gt; 00:00:00)</p>
    * </li>
    * <li><p><code>middle</code> places the point in the middle of the group
    * (e.g. range 00:00:00 - 23:59:59 -&gt; 12:00:00)</p>
    * </li>
    * <li><p><code>end</code> places the point at the end of the group
    * (e.g. range 00:00:00 - 23:59:59 -&gt; 23:59:59)</p>
    * </li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-datagrouping-anchor">Changing the point x-coordinate inside the group.</a>
    * @since 9.1.0
    */
  var anchor: js.UndefOr[String] = js.undefined

  /**
    * <p>Datetime formats for the header of the tooltip in a stock chart.
    * The format can vary within a chart depending on the currently selected
    * time range and the current data grouping.</p>
    * <p>The default formats are:</p>
    * <pre><code class="language-js">{
    *     millisecond: [
    *         &#39;%A, %b %e, %H:%M:%S.%L&#39;, &#39;%A, %b %e, %H:%M:%S.%L&#39;, &#39;-%H:%M:%S.%L&#39;
    *     ],
    *     second: [&#39;%A, %b %e, %H:%M:%S&#39;, &#39;%A, %b %e, %H:%M:%S&#39;, &#39;-%H:%M:%S&#39;],
    *     minute: [&#39;%A, %b %e, %H:%M&#39;, &#39;%A, %b %e, %H:%M&#39;, &#39;-%H:%M&#39;],
    *     hour: [&#39;%A, %b %e, %H:%M&#39;, &#39;%A, %b %e, %H:%M&#39;, &#39;-%H:%M&#39;],
    *     day: [&#39;%A, %b %e, %Y&#39;, &#39;%A, %b %e&#39;, &#39;-%A, %b %e, %Y&#39;],
    *     week: [&#39;Week from %A, %b %e, %Y&#39;, &#39;%A, %b %e&#39;, &#39;-%A, %b %e, %Y&#39;],
    *     month: [&#39;%B %Y&#39;, &#39;%B&#39;, &#39;-%B %Y&#39;],
    *     year: [&#39;%Y&#39;, &#39;%Y&#39;, &#39;-%Y&#39;]
    * }
    * </code></pre>
    * <p>For each of these array definitions, the first item is the format
    * used when the active time span is one unit. For instance, if the
    * current data applies to one week, the first item of the week array
    * is used. The second and third items are used when the active time
    * span is more than two units. For instance, if the current data applies
    * to two weeks, the second and third item of the week array are used,
    *  and applied to the start and end date of the time span.</p>
    * @since 7.1.0
    */
  var dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Specifies how the first grouped point is positioned on the xAxis.
    * If firstAnchor and/or lastAnchor are defined, then those options take
    * precedence over anchor for the first and/or last grouped points.
    * Available options:</p>
    * <p>-<code>start</code> places the point at the beginning of the group
    * (e.g. range 00:00:00 - 23:59:59 -&gt; 00:00:00)</p>
    * <p>-<code>middle</code> places the point in the middle of the group
    * (e.g. range 00:00:00 - 23:59:59 -&gt; 12:00:00)</p>
    * <p>-<code>end</code> places the point at the end of the group
    * (e.g. range 00:00:00 - 23:59:59 -&gt; 23:59:59)</p>
    * <p>-<code>firstPoint</code> the first point in the group
    * (e.g. points at 00:13, 00:35, 00:59 -&gt; 00:13)</p>
    * <p>-<code>lastPoint</code> the last point in the group
    * (e.g. points at 00:13, 00:35, 00:59 -&gt; 00:59)</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-datagrouping-first-anchor">Applying first and last anchor.</a>
    * @since 9.1.0
    */
  var firstAnchor: js.UndefOr[String] = js.undefined

  /**
    * <p>When data grouping is forced, it runs no matter how small the intervals
    * are. This can be handy for example when the sum should be calculated
    * for values appearing at random times within each hour.</p>
    * @since 7.1.0
    */
  var forced: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>By default only points within the visible range are grouped. Enabling this
    * option will force data grouping to calculate all grouped points for a given
    * dataset. That option prevents for example a column series from calculating
    * a grouped point partially. The effect is similar to
    * <a href="#plotOptions.series.getExtremesFromAll">Series.getExtremesFromAll</a> but does
    * not affect yAxis extremes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-datagrouping-groupall/">Two series with the same data but different groupAll setting</a>
    * @since 6.1.0
    */
  var groupAll: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Specifies how the last grouped point is positioned on the xAxis.
    * If firstAnchor and/or lastAnchor are defined, then those options take
    * precedence over anchor for the first and/or last grouped points.
    * Available options:</p>
    * <p>-<code>start</code> places the point at the beginning of the group
    * (e.g. range 00:00:00 - 23:59:59 -&gt; 00:00:00)</p>
    * <p>-<code>middle</code> places the point in the middle of the group
    * (e.g. range 00:00:00 - 23:59:59 -&gt; 12:00:00)</p>
    * <p>-<code>end</code> places the point at the end of the group
    * (e.g. range 00:00:00 - 23:59:59 -&gt; 23:59:59)</p>
    * <p>-<code>firstPoint</code> the first point in the group
    * (e.g. points at 00:13, 00:35, 00:59 -&gt; 00:13)</p>
    * <p>-<code>lastPoint</code> the last point in the group
    * (e.g. points at 00:13, 00:35, 00:59 -&gt; 00:59)</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-datagrouping-first-anchor">Applying first and last anchor.</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-datagrouping-last-anchor">Applying the last anchor in the chart with live data.</a>
    * @since 9.1.0
    */
  var lastAnchor: js.UndefOr[String] = js.undefined

  /**
    * <p>Normally, a group is indexed by the start of that group, so for example
    * when 30 daily values are grouped into one month, that month&#39;s x value
    * will be the 1st of the month. This apparently shifts the data to
    * the left. When the smoothed option is true, this is compensated for.
    * The data is shifted to the middle of the group, and min and max
    * values are preserved. Internally, this is used in the Navigator series.</p>
    * @since 7.1.0
    */
  var smoothed: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>An array determining what time intervals the data is allowed to be
    * grouped to. Each array item is an array where the first value is
    * the time unit and the second value another array of allowed multiples.</p>
    * <p>Defaults to:</p>
    * <pre><code class="language-js">units: [[
    *     &#39;millisecond&#39;, // unit name
    *     [1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples
    * ], [
    *     &#39;second&#39;,
    *     [1, 2, 5, 10, 15, 30]
    * ], [
    *     &#39;minute&#39;,
    *     [1, 2, 5, 10, 15, 30]
    * ], [
    *     &#39;hour&#39;,
    *     [1, 2, 3, 4, 6, 8, 12]
    * ], [
    *     &#39;day&#39;,
    *     [1]
    * ], [
    *     &#39;week&#39;,
    *     [1]
    * ], [
    *     &#39;month&#39;,
    *     [1, 3, 6]
    * ], [
    *     &#39;year&#39;,
    *     null
    * ]]
    * </code></pre>
    * @since 7.1.0
    */
  var units: js.UndefOr[js.Array[js.Array[js.Array[js.Any]]]] = js.undefined
}

object SeriesWindbarbDataGrouping {
  /**
    * @param approximation <p>Approximation function for the data grouping. The default. returns an average of wind speed and a vector average direction. weighted by wind speed.</p>
    * @param enabled <p>Whether to enable data grouping.</p>
    * @param groupPixelWidth <p>The approximate data group width.</p>
    * @param anchor <p>Specifies how the points should be located on the X axis inside the group.. Points that are extremes can be set separately. Available options:</p>. <ul>. <li><p><code>start</code> places the point at the beginning of the group. (e.g. range 00:00:00 - 23:59:59 -&gt; 00:00:00)</p>. </li>. <li><p><code>middle</code> places the point in the middle of the group. (e.g. range 00:00:00 - 23:59:59 -&gt; 12:00:00)</p>. </li>. <li><p><code>end</code> places the point at the end of the group. (e.g. range 00:00:00 - 23:59:59 -&gt; 23:59:59)</p>. </li>. </ul>
    * @param dateTimeLabelFormats <p>Datetime formats for the header of the tooltip in a stock chart.. The format can vary within a chart depending on the currently selected. time range and the current data grouping.</p>. <p>The default formats are:</p>. <pre><code class="language-js">{.     millisecond: [.         &#39;%A, %b %e, %H:%M:%S.%L&#39;, &#39;%A, %b %e, %H:%M:%S.%L&#39;, &#39;-%H:%M:%S.%L&#39;.     ],.     second: [&#39;%A, %b %e, %H:%M:%S&#39;, &#39;%A, %b %e, %H:%M:%S&#39;, &#39;-%H:%M:%S&#39;],.     minute: [&#39;%A, %b %e, %H:%M&#39;, &#39;%A, %b %e, %H:%M&#39;, &#39;-%H:%M&#39;],.     hour: [&#39;%A, %b %e, %H:%M&#39;, &#39;%A, %b %e, %H:%M&#39;, &#39;-%H:%M&#39;],.     day: [&#39;%A, %b %e, %Y&#39;, &#39;%A, %b %e&#39;, &#39;-%A, %b %e, %Y&#39;],.     week: [&#39;Week from %A, %b %e, %Y&#39;, &#39;%A, %b %e&#39;, &#39;-%A, %b %e, %Y&#39;],.     month: [&#39;%B %Y&#39;, &#39;%B&#39;, &#39;-%B %Y&#39;],.     year: [&#39;%Y&#39;, &#39;%Y&#39;, &#39;-%Y&#39;]. }. </code></pre>. <p>For each of these array definitions, the first item is the format. used when the active time span is one unit. For instance, if the. current data applies to one week, the first item of the week array. is used. The second and third items are used when the active time. span is more than two units. For instance, if the current data applies. to two weeks, the second and third item of the week array are used,.  and applied to the start and end date of the time span.</p>
    * @param firstAnchor <p>Specifies how the first grouped point is positioned on the xAxis.. If firstAnchor and/or lastAnchor are defined, then those options take. precedence over anchor for the first and/or last grouped points.. Available options:</p>. <p>-<code>start</code> places the point at the beginning of the group. (e.g. range 00:00:00 - 23:59:59 -&gt; 00:00:00)</p>. <p>-<code>middle</code> places the point in the middle of the group. (e.g. range 00:00:00 - 23:59:59 -&gt; 12:00:00)</p>. <p>-<code>end</code> places the point at the end of the group. (e.g. range 00:00:00 - 23:59:59 -&gt; 23:59:59)</p>. <p>-<code>firstPoint</code> the first point in the group. (e.g. points at 00:13, 00:35, 00:59 -&gt; 00:13)</p>. <p>-<code>lastPoint</code> the last point in the group. (e.g. points at 00:13, 00:35, 00:59 -&gt; 00:59)</p>
    * @param forced <p>When data grouping is forced, it runs no matter how small the intervals. are. This can be handy for example when the sum should be calculated. for values appearing at random times within each hour.</p>
    * @param groupAll <p>By default only points within the visible range are grouped. Enabling this. option will force data grouping to calculate all grouped points for a given. dataset. That option prevents for example a column series from calculating. a grouped point partially. The effect is similar to. <a href="#plotOptions.series.getExtremesFromAll">Series.getExtremesFromAll</a> but does. not affect yAxis extremes.</p>
    * @param lastAnchor <p>Specifies how the last grouped point is positioned on the xAxis.. If firstAnchor and/or lastAnchor are defined, then those options take. precedence over anchor for the first and/or last grouped points.. Available options:</p>. <p>-<code>start</code> places the point at the beginning of the group. (e.g. range 00:00:00 - 23:59:59 -&gt; 00:00:00)</p>. <p>-<code>middle</code> places the point in the middle of the group. (e.g. range 00:00:00 - 23:59:59 -&gt; 12:00:00)</p>. <p>-<code>end</code> places the point at the end of the group. (e.g. range 00:00:00 - 23:59:59 -&gt; 23:59:59)</p>. <p>-<code>firstPoint</code> the first point in the group. (e.g. points at 00:13, 00:35, 00:59 -&gt; 00:13)</p>. <p>-<code>lastPoint</code> the last point in the group. (e.g. points at 00:13, 00:35, 00:59 -&gt; 00:59)</p>
    * @param smoothed <p>Normally, a group is indexed by the start of that group, so for example. when 30 daily values are grouped into one month, that month&#39;s x value. will be the 1st of the month. This apparently shifts the data to. the left. When the smoothed option is true, this is compensated for.. The data is shifted to the middle of the group, and min and max. values are preserved. Internally, this is used in the Navigator series.</p>
    * @param units <p>An array determining what time intervals the data is allowed to be. grouped to. Each array item is an array where the first value is. the time unit and the second value another array of allowed multiples.</p>. <p>Defaults to:</p>. <pre><code class="language-js">units: [[.     &#39;millisecond&#39;, // unit name.     [1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples. ], [.     &#39;second&#39;,.     [1, 2, 5, 10, 15, 30]. ], [.     &#39;minute&#39;,.     [1, 2, 5, 10, 15, 30]. ], [.     &#39;hour&#39;,.     [1, 2, 3, 4, 6, 8, 12]. ], [.     &#39;day&#39;,.     [1]. ], [.     &#39;week&#39;,.     [1]. ], [.     &#39;month&#39;,.     [1, 3, 6]. ], [.     &#39;year&#39;,.     null. ]]. </code></pre>
    */
  def apply(approximation: js.UndefOr[String | js.Function] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, groupPixelWidth: js.UndefOr[Double] = js.undefined, anchor: js.UndefOr[String] = js.undefined, dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined, firstAnchor: js.UndefOr[String] = js.undefined, forced: js.UndefOr[Boolean] = js.undefined, groupAll: js.UndefOr[Boolean] = js.undefined, lastAnchor: js.UndefOr[String] = js.undefined, smoothed: js.UndefOr[Boolean] = js.undefined, units: js.UndefOr[js.Array[js.Array[js.Array[js.Any]]]] = js.undefined): SeriesWindbarbDataGrouping = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesWindbarbDataGrouping {
      this.approximation = approximation
      this.enabled = enabled
      this.groupPixelWidth = groupPixelWidth
      this.anchor = anchor
      this.dateTimeLabelFormats = dateTimeLabelFormats
      this.firstAnchor = firstAnchor
      this.forced = forced
      this.groupAll = groupAll
      this.lastAnchor = lastAnchor
      this.smoothed = smoothed
      this.units = units
    })
  }
}
