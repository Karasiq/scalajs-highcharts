package com.highcharts.test.frontend.charts

import com.highcharts.HighchartsAliases._
import com.highcharts.HighchartsUtils._
import com.highcharts.config.{HighchartsConfig, _}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{Object, UndefOr, |}

/**
  * @see [[http://www.highcharts.com/demo/combo]]
  */
@ScalaJSDefined
class TestCombinationChartConfig extends HighchartsConfig {
  override val chart: Cfg[Chart] = new Chart {
  }

  override val title: Cfg[Title] = new Title {
    override val text: UndefOr[String] = "Combination chart"
  }

  override val xAxis: Cfg[XAxis] = new XAxis {
    override val categories: CategoriesCfg = js.Array("Apples", "Oranges", "Pears", "Bananas", "Plums")
  }

  override val labels: Cfg[Labels] = new Labels {
    override val items: CfgArray[LabelsItems] = js.Array[LabelsItems](
      new LabelsItems {
        override val html: UndefOr[String] = "Total fruit consumption"
        override val style: UndefOr[Object] = js.Dynamic.literal(
          left = "25px",
          top = "0px",
          color = fromHighchartsTheme("black")(_.textColor)
        )
      }
    )
  }

  override val series: SeriesCfg = js.Array[AnySeries](
    new SeriesColumn {
      override val name: UndefOr[String] = "Jane"
      override val data: SeriesCfgData[SeriesColumnData] = js.Array[Double](3, 2, 1, 3, 4)
    },
    new SeriesColumn {
      override val name: UndefOr[String] = "John"
      override val data: SeriesCfgData[SeriesColumnData] = js.Array[Double](2, 3, 5, 7, 6)
    },
    new SeriesColumn {
      override val name: UndefOr[String] = "Joe"
      override val data: SeriesCfgData[SeriesColumnData] = js.Array[Double](4, 3, 3, 9, 0)
    },
    new SeriesSpline {
      override val name: UndefOr[String] = "Average"
      override val data: SeriesCfgData[SeriesSplineData] = js.Array[Double](3, 2.67, 3, 6.33, 3.33)
      override val marker: Cfg[SeriesSplineMarker] = new SeriesSplineMarker {
        override val lineWidth: UndefOr[Double] = 2
        override val lineColor: UndefOr[String | js.Object] = defaultColor(3)
        override val fillColor: UndefOr[String | js.Object] = "white"
      }
    },
    new SeriesPie {
      override val name: UndefOr[String] = "Average"
      override val data: SeriesPieCfgData = js.Array[SeriesPieData](
        new SeriesPieData {
          override val name: UndefOr[String] = "Jane"
          override val y: UndefOr[Double] = 13
          override val color: UndefOr[String | js.Object] = defaultColor(0)
        },
        new SeriesPieData {
          override val name: UndefOr[String] = "John"
          override val y: UndefOr[Double] = 23
          override val color: UndefOr[String | js.Object] = defaultColor(1)
        },
        new SeriesPieData {
          override val name: UndefOr[String] = "Joe"
          override val y: UndefOr[Double] = 19
          override val color: UndefOr[String | js.Object] = defaultColor(2)
        }
      )
      override val center: UndefOr[js.Array[String | Double]] = js.Array[String | Double](100D, 100D)
      override val size: UndefOr[String | Double] = 100
      override val showInLegend: UndefOr[Boolean] = false
      override val dataLabels: Cfg[SeriesPieDataLabels] = new SeriesPieDataLabels {
        override val enabled: UndefOr[Boolean] = false
      }
    }
  )
}
