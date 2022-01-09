/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;map&gt;-dataSorting</code>
  */
class SeriesMapDataSorting extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable data sorting for the series. Use <a href="#xAxis.reversed">xAxis.reversed</a> to change the sorting order.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/datasorting/animation/">Data sorting in scatter-3d</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/datasorting/labels-animation/">Axis labels animation</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/datasorting/dependent-sorting/">Dependent series sorting</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/datasorting/independent-sorting/">Independent series sorting</a>
    * @since 8.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to allow matching points by name in an update. If this option
    * is disabled, points will be matched by order.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/datasorting/match-by-name/">Enabled match by name</a>
    * @since 8.0.0
    */
  var matchByName: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Determines what data value should be used to sort by.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/datasorting/sort-key/">Sort key as `z` value</a>
    * @since 8.0.0
    */
  var sortKey: js.UndefOr[String] = js.undefined
}

object SeriesMapDataSorting {
  /**
    * @param enabled <p>Enable or disable data sorting for the series. Use <a href="#xAxis.reversed">xAxis.reversed</a> to change the sorting order.</p>
    * @param matchByName <p>Whether to allow matching points by name in an update. If this option. is disabled, points will be matched by order.</p>
    * @param sortKey <p>Determines what data value should be used to sort by.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, matchByName: js.UndefOr[Boolean] = js.undefined, sortKey: js.UndefOr[String] = js.undefined): SeriesMapDataSorting = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMapDataSorting {
      this.enabled = enabled
      this.matchByName = matchByName
      this.sortKey = sortKey
    })
  }
}
