package com.highcharts.test.frontend.charts

import com.highcharts.HighchartsAliases._
import com.highcharts.HighchartsUtils._
import com.highcharts.config._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
class TestBarChartConfig extends HighchartsConfig {
  // Chart config
  override val chart: Cfg[Chart] = Chart(`type` = "bar")

  // Chart title
  override val title: Cfg[Title] = Title(text = "Demo bar chart")

  // Y Axis settings
  override val yAxis: CfgArray[YAxis] = js.Array(YAxis(title = YAxisTitle(text = "Fruit eaten")))

  // X Axis settings
  override val xAxis: CfgArray[XAxis] = js.Array(XAxis(categories = js.Array("Apples", "Bananas", "Oranges")))

  // Chart data
  override val series: SeriesCfg = js.Array[AnySeries](
    SeriesBar(name = "Jane", data = js.Array[Double](1, 0, 4)),
    SeriesBar(name = "John", data = js.Array[Double](5, 7, 3))
  )
}
