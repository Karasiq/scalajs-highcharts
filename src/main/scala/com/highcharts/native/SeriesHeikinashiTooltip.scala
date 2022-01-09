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
  * @note JavaScript name: <code>series&lt;heikinashi&gt;-tooltip</code>
  */
class SeriesHeikinashiTooltip extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The HTML of the point&#39;s line in the tooltip. Variables are enclosed
    * by curly brackets. Available variables are <code>point.x</code>, <code>point.y</code>,
    * <code>series.name</code> and <code>series.color</code> and other properties on the same
    * form. Furthermore, <code>point.y</code> can be extended by the
    * <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can
    * also be overridden for each series, which makes it a good hook for
    * displaying units.</p>
    * <p>In styled mode, the dot is colored by a class name rather
    * than the point color.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/pointformat/">A different point format with value suffix</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/format/">Format demo</a>
    * @since 2.2.0
    */
  var pointFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Distance from point to tooltip in pixels.</p>
    * @since 2.3.0
    */
  var distance: js.UndefOr[Double] = js.undefined

  /**
    * <p>How many decimals to show for the <code>point.change</code>
    * or the <code>point.cumulativeSum</code> value when the <code>series.compare</code>
    * or the <code>series.cumulative</code> option is set.
    * This is overridable in each series&#39; tooltip options object.</p>
    * @since 1.0.1
    */
  var changeDecimals: js.UndefOr[Double] = js.undefined

  /**
    * <p>The HTML of the cluster point&#39;s in the tooltip. Works only with
    * marker-clusters module and analogously to
    * <a href="#tooltip.pointFormat">pointFormat</a>.</p>
    * <p>The cluster tooltip can be also formatted using
    * <code>tooltip.formatter</code> callback function and <code>point.isCluster</code> flag.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/marker-clusters/grid">Format tooltip for cluster points.</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/marker-clusters/europe/">Format tooltip for clusters using tooltip.formatter</a>
    * @since 2.3.0
    */
  var clusterFormat: js.Any = js.undefined

  /**
    * <p>For series on datetime axes, the date format in the tooltip&#39;s
    * header will by default be guessed based on the closest data points.
    * This member gives the default string representations used for
    * each unit. For an overview of the replacement codes, see
    * <a href="/class-reference/Highcharts.Time#dateFormat">dateFormat</a>.</p>
    * @since 2.3.0
    */
  var dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Whether the tooltip should follow the mouse as it moves across
    * columns, pie slices and other point types with an extent.
    * By default it behaves this way for pie, polygon, map, sankey
    * and wordcloud series by override in the <code>plotOptions</code>
    * for those series types.</p>
    * <p>Does not apply if <a href="#tooltip.split">split</a> is <code>true</code>.</p>
    * <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @since 3.0.0
    */
  var followPointer: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether the tooltip should update as the finger moves on a touch
    * device. If this is <code>true</code> and <a href="#chart.panning">chart.panning</a> is
    * set,<code>followTouchMove</code> will take over one-finger touches, so the user
    * needs to use two fingers for zooming and panning.</p>
    * <p>Note the difference to <a href="#tooltip.followPointer">followPointer</a> that
    * only defines the <em>position</em> of the tooltip. If <code>followPointer</code> is
    * false in for example a column series, the tooltip will show above or
    * below the column, but as <code>followTouchMove</code> is true, the tooltip will
    * jump from column to column as the user swipes across the plot area.</p>
    * @since 3.0.1
    */
  var followTouchMove: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A string to append to the tooltip format.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">A table for value alignment</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/format/">Format demo</a>
    * @since 2.2.0
    */
  var footerFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>The HTML of the tooltip header line. Variables are enclosed by
    * curly brackets. Available variables are <code>point.key</code>, <code>series.name</code>,
    * <code>series.color</code> and other members from the <code>point</code> and <code>series</code>
    * objects. The <code>point.key</code> variable contains the category name, x
    * value or datetime string depending on the type of axis. For datetime
    * axes, the <code>point.key</code> date format can be set using
    * <code>tooltip.xDateFormat</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">An HTML table in the tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">An HTML table in the tooltip</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/format/">Format demo</a>
    * @since 2.3.0
    */
  var headerFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>The HTML of the null point&#39;s line in the tooltip. Works analogously
    * to <a href="#tooltip.pointFormat">pointFormat</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-nullformat">Format data label and tooltip for null point.</a>
    * @since 2.3.0
    */
  var nullFormat: js.UndefOr[String] = js.undefined

  /**
    * <p>Callback function to format the text of the tooltip for
    * visible null points.
    * Works analogously to <a href="#tooltip.formatter">formatter</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-nullformat">Format data label and tooltip for null point.</a>
    * @since 2.3.0
    */
  var nullFormatter: js.Any = js.undefined

  /**
    * <p>A callback function for formatting the HTML output for a single point
    * in the tooltip. Like the <code>pointFormat</code> string, but with more
    * flexibility.</p>
    * @since 4.1.0
    */
  var pointFormatter: js.Any = js.undefined

  /**
    * <p>How many decimals to show in each series&#39; y value. This is
    * overridable in each series&#39; tooltip options object. The default is to
    * preserve all decimals.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
    * @since 2.2.0
    */
  var valueDecimals: js.UndefOr[js.UndefOr[Double]] = js.undefined

  /**
    * <p>A string to prepend to each series&#39; y value. Overridable in each
    * series&#39; tooltip options object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
    * @since 2.2.0
    */
  var valuePrefix: js.UndefOr[String] = js.undefined

  /**
    * <p>A string to append to each series&#39; y value. Overridable in each
    * series&#39; tooltip options object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
    * @since 2.2.0
    */
  var valueSuffix: js.UndefOr[String] = js.undefined

  /**
    * <p>The format for the date in the tooltip header if the X axis is a
    * datetime axis. The default is a best guess based on the smallest
    * distance between points in the chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/xdateformat/">A different format</a>
    * @since 2.3.0
    */
  var xDateFormat: js.UndefOr[String] = js.undefined
}

object SeriesHeikinashiTooltip {
  /**
    * @param pointFormat <p>The HTML of the point&#39;s line in the tooltip. Variables are enclosed. by curly brackets. Available variables are <code>point.x</code>, <code>point.y</code>,. <code>series.name</code> and <code>series.color</code> and other properties on the same. form. Furthermore, <code>point.y</code> can be extended by the. <code>tooltip.valuePrefix</code> and <code>tooltip.valueSuffix</code> variables. This can. also be overridden for each series, which makes it a good hook for. displaying units.</p>. <p>In styled mode, the dot is colored by a class name rather. than the point color.</p>
    * @param distance <p>Distance from point to tooltip in pixels.</p>
    * @param changeDecimals <p>How many decimals to show for the <code>point.change</code>. or the <code>point.cumulativeSum</code> value when the <code>series.compare</code>. or the <code>series.cumulative</code> option is set.. This is overridable in each series&#39; tooltip options object.</p>
    * @param clusterFormat <p>The HTML of the cluster point&#39;s in the tooltip. Works only with. marker-clusters module and analogously to. <a href="#tooltip.pointFormat">pointFormat</a>.</p>. <p>The cluster tooltip can be also formatted using. <code>tooltip.formatter</code> callback function and <code>point.isCluster</code> flag.</p>
    * @param dateTimeLabelFormats <p>For series on datetime axes, the date format in the tooltip&#39;s. header will by default be guessed based on the closest data points.. This member gives the default string representations used for. each unit. For an overview of the replacement codes, see. <a href="/class-reference/Highcharts.Time#dateFormat">dateFormat</a>.</p>
    * @param followPointer <p>Whether the tooltip should follow the mouse as it moves across. columns, pie slices and other point types with an extent.. By default it behaves this way for pie, polygon, map, sankey. and wordcloud series by override in the <code>plotOptions</code>. for those series types.</p>. <p>Does not apply if <a href="#tooltip.split">split</a> is <code>true</code>.</p>. <p>For touch moves to behave the same way, <a href="#tooltip.followTouchMove">followTouchMove</a> must be <code>true</code> also.</p>
    * @param followTouchMove <p>Whether the tooltip should update as the finger moves on a touch. device. If this is <code>true</code> and <a href="#chart.panning">chart.panning</a> is. set,<code>followTouchMove</code> will take over one-finger touches, so the user. needs to use two fingers for zooming and panning.</p>. <p>Note the difference to <a href="#tooltip.followPointer">followPointer</a> that. only defines the <em>position</em> of the tooltip. If <code>followPointer</code> is. false in for example a column series, the tooltip will show above or. below the column, but as <code>followTouchMove</code> is true, the tooltip will. jump from column to column as the user swipes across the plot area.</p>
    * @param footerFormat <p>A string to append to the tooltip format.</p>
    * @param headerFormat <p>The HTML of the tooltip header line. Variables are enclosed by. curly brackets. Available variables are <code>point.key</code>, <code>series.name</code>,. <code>series.color</code> and other members from the <code>point</code> and <code>series</code>. objects. The <code>point.key</code> variable contains the category name, x. value or datetime string depending on the type of axis. For datetime. axes, the <code>point.key</code> date format can be set using. <code>tooltip.xDateFormat</code>.</p>
    * @param nullFormat <p>The HTML of the null point&#39;s line in the tooltip. Works analogously. to <a href="#tooltip.pointFormat">pointFormat</a>.</p>
    * @param nullFormatter <p>Callback function to format the text of the tooltip for. visible null points.. Works analogously to <a href="#tooltip.formatter">formatter</a>.</p>
    * @param pointFormatter <p>A callback function for formatting the HTML output for a single point. in the tooltip. Like the <code>pointFormat</code> string, but with more. flexibility.</p>
    * @param valueDecimals <p>How many decimals to show in each series&#39; y value. This is. overridable in each series&#39; tooltip options object. The default is to. preserve all decimals.</p>
    * @param valuePrefix <p>A string to prepend to each series&#39; y value. Overridable in each. series&#39; tooltip options object.</p>
    * @param valueSuffix <p>A string to append to each series&#39; y value. Overridable in each. series&#39; tooltip options object.</p>
    * @param xDateFormat <p>The format for the date in the tooltip header if the X axis is a. datetime axis. The default is a best guess based on the smallest. distance between points in the chart.</p>
    */
  def apply(pointFormat: js.UndefOr[String] = js.undefined, distance: js.UndefOr[Double] = js.undefined, changeDecimals: js.UndefOr[Double] = js.undefined, clusterFormat: js.UndefOr[js.Any] = js.undefined, dateTimeLabelFormats: js.UndefOr[js.Object] = js.undefined, followPointer: js.UndefOr[Boolean] = js.undefined, followTouchMove: js.UndefOr[Boolean] = js.undefined, footerFormat: js.UndefOr[String] = js.undefined, headerFormat: js.UndefOr[String] = js.undefined, nullFormat: js.UndefOr[String] = js.undefined, nullFormatter: js.UndefOr[js.Any] = js.undefined, pointFormatter: js.UndefOr[js.Any] = js.undefined, valueDecimals: js.UndefOr[js.UndefOr[Double]] = js.undefined, valuePrefix: js.UndefOr[String] = js.undefined, valueSuffix: js.UndefOr[String] = js.undefined, xDateFormat: js.UndefOr[String] = js.undefined): SeriesHeikinashiTooltip = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesHeikinashiTooltip {
      this.pointFormat = pointFormat
      this.distance = distance
      this.changeDecimals = changeDecimals
      this.clusterFormat = clusterFormat
      this.dateTimeLabelFormats = dateTimeLabelFormats
      this.followPointer = followPointer
      this.followTouchMove = followTouchMove
      this.footerFormat = footerFormat
      this.headerFormat = headerFormat
      this.nullFormat = nullFormat
      this.nullFormatter = nullFormatter
      this.pointFormatter = pointFormatter
      this.valueDecimals = valueDecimals
      this.valuePrefix = valuePrefix
      this.valueSuffix = valueSuffix
      this.xDateFormat = xDateFormat
    })
  }
}
