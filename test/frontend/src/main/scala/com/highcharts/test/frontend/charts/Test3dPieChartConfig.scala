package com.highcharts.test.frontend.charts

import com.highcharts.HighchartsUtils._
import com.highcharts.config._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr, |}

/**
  * Example 3D pie chart config
 *
  * @see [[https://jsfiddle.net/gh/get/jquery/1.9.1/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/3d-pie/]]
  */
@ScalaJSDefined
class Test3dPieChartConfig extends HighchartsConfig {
  override val chart: Cfg[Chart] = new Chart {
    override val `type`: UndefOr[String] = "pie"

    override val options3d: Cfg[ChartOptions3d] = new ChartOptions3d {
      override val alpha: UndefOr[Double] = 45D
      override val beta: UndefOr[Double] = 0D
      override val enabled: UndefOr[Boolean] = true
    }
  }

  override val title: Cfg[Title] = new Title {
    override val text: UndefOr[String] = "Browser market shares at a specific website, 2014"
  }

  override val tooltip: Cfg[Tooltip] = new Tooltip {
    override val pointFormat: UndefOr[String] = "{series.name}: <b>{point.percentage:.1f}%</b>"
  }

  override val plotOptions: Cfg[PlotOptions] = new PlotOptions {
    override val pie: Cfg[PlotOptionsPie] = new PlotOptionsPie {
      override val allowPointSelect: UndefOr[Boolean] = true
      override val cursor: UndefOr[String] = "pointer"
      override val depth: UndefOr[Double] = 35D
      override val dataLabels: Cfg[PlotOptionsPieDataLabels] = new PlotOptionsPieDataLabels {
        override val enabled: UndefOr[Boolean] = true
        override val format: UndefOr[String] = "{point.name}"
      }
      override val size: UndefOr[String | Double] = "100%"
    }
  }

  private def mkData(str: String, value: Double): SeriesPieData = new SeriesPieData {
    override val y: UndefOr[Double] = value
    override val name: UndefOr[String] = str
  }

  override val series: SeriesCfg = mkSeries(new SeriesPie {
    override val name: UndefOr[String] = "Browser share"

    override val data: SeriesPieCfgData = js.Array[SeriesPieData](
      mkData("Firefox", 45),
      mkData("IE", 26.8),
      new SeriesPieData {
        override val y: UndefOr[Double] = 12.8
        override val name: UndefOr[String] = "Chrome"
        override val sliced: UndefOr[Boolean] = true
        override val selected: UndefOr[Boolean] = true
      },
      mkData("Safari", 8.5),
      mkData("Opera", 6.2),
      mkData("Others", 0.7)
    )
  })
}
