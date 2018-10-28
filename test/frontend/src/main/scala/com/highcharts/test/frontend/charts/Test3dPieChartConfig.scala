package com.highcharts.test.frontend.charts

import com.highcharts.HighchartsAliases._
import com.highcharts.HighchartsUtils._
import com.highcharts.config._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Example 3D pie chart config
  * @see [[https://jsfiddle.net/gh/get/jquery/1.9.1/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/3d-pie/]]
  */
@ScalaJSDefined
class Test3dPieChartConfig extends HighchartsConfig {
  override val chart = Chart(`type` = "pie", options3d = ChartOptions3d(alpha = 45, beta = 0, enabled = true))

  override val title = Title(text = "Browser market shares at a specific website, 2014")

  override val tooltip = Tooltip(pointFormat = "{series.name}: <b>{point.percentage:.1f}%</b>")

  override val plotOptions = PlotOptions(pie = PlotOptionsPie(
    allowPointSelect = true,
    cursor = "pointer",
    depth = 35,
    dataLabels = PlotOptionsPieDataLabels(enabled = true, format = "{point.name}"),
    size = "100%"
  ))

  private def mkData(str: String, value: Double): SeriesPieData = SeriesPieData(y = value, name = str)

  override val series: SeriesCfg = js.Array[AnySeries](
    SeriesPie(name = "Browser share", data = js.Array(
      mkData("Firefox", 45),
      mkData("IE", 26.8),
      SeriesPieData(y = 12.8, name = "Chrome", sliced = true, selected = true),
      mkData("Safari", 8.5),
      mkData("Opera", 6.2),
      mkData("Others", 0.7)
    ))
  )
}
