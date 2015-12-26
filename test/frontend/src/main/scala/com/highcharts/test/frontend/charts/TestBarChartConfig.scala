package com.highcharts.test.frontend.charts

import com.highcharts.HighchartsUtils._
import com.highcharts.config._
import com.highcharts.test.frontend.HighchartsNgConfig

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.{JSExport, ScalaJSDefined}

@JSExport
@ScalaJSDefined
object TestBarChartConfig extends HighchartsNgConfig {
  override val options: Cfg[HighchartsConfig] = new HighchartsConfig {
    // Chart config
    override val chart: Cfg[Chart] = new Chart {
      override val `type`: UndefOr[String] = "bar"
    }

    // Chart title
    override val title: Cfg[Title] = new Title {
      override val text: UndefOr[String] = "Demo bar chart"
    }

    // Y Axis settings
    override val yAxis: Cfg[YAxis] = new YAxis {
      override val title: Cfg[YAxisTitle] = new YAxisTitle {
        override val text: UndefOr[String] = "Fruit eaten"
      }
    }

    // X Axis settings
    override val xAxis: Cfg[XAxis] = new XAxis {
      override val categories: CategoriesCfg = js.Array("Apples", "Bananas", "Oranges")
    }
  }

  // Chart data
  override val series: SeriesCfg = mkSeries(
    new SeriesBar {
      override val name: js.UndefOr[String] = "Jane"
      override val data: SeriesCfgData[SeriesBarData] = js.Array[Double](1, 0, 4)
    },
    new SeriesBar {
      override val name: js.UndefOr[String] = "John"
      override val data: SeriesCfgData[SeriesBarData] = js.Array[Double](5, 7, 3)
    }
  )
}
