package com.highcharts.test.frontend

import com.highcharts.HighchartsUtils._
import com.highcharts.config.{HighchartsConfig, Title, XAxis}

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@js.annotation.ScalaJSDefined
class HighchartsNgSize extends js.Object {
  val width: UndefOr[Int] = js.undefined
  val height: UndefOr[Int] = js.undefined
}

/**
  * @see [[https://github.com/pablojim/highcharts-ng]]
  */
@js.annotation.ScalaJSDefined
class HighchartsNgConfig extends js.Object {
  /**
    * This is the Main Highcharts chart config. Any Highchart options are valid here.
    * Will be overriden by values specified below.
    */
  val options: Cfg[HighchartsConfig] = js.undefined

  /**
    * Series object (optional) - a list of series using normal Highcharts series options.
    */
  val series: SeriesCfg = js.undefined

  /**
    * Title configuration (optional)
    */
  val title: Cfg[Title] = js.undefined

  /**
    * Boolean to control showing loading status on chart (optional).
    * Could be a string if you want to show specific loading text.
    */
  val loading: js.Any = js.undefined.asInstanceOf[js.Any]

  /**
    * Configuration for the xAxis (optional). Currently only one x axis can be dynamically controlled.
    * Properties currentMin and currentMax provided 2-way binding to the chart's maximum and minimum
    */
  val xAxis: Cfg[XAxis] = js.undefined

  /**
    * Whether to use Highstocks instead of Highcharts (optional). Defaults to false.
    */
  val useHighStocks: UndefOr[Boolean] = js.undefined

  /**
    * Size (optional) if left out the chart will default to size of the div or something sensible.
    */
  val size: Cfg[HighchartsNgSize] = js.undefined

  /**
    * Function (optional)
    */
  val func: UndefOr[js.Function] = js.undefined
}
