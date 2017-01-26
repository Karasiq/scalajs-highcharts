package com.highcharts.test.frontend.charts

import com.highcharts.HighchartsAliases._
import com.highcharts.HighchartsUtils._
import com.highcharts.config.{HighchartsConfig, _}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.|

/**
  * @see [[http://www.highcharts.com/demo/combo]]
  */
@ScalaJSDefined
class TestCombinationChartConfig extends HighchartsConfig {
  override val chart: Cfg[Chart] = Chart()

  override val title: Cfg[Title] = Title(text = "Combination chart")

  override val xAxis: CfgArray[XAxis] = js.Array(XAxis(categories = js.Array("Apples", "Oranges", "Pears", "Bananas", "Plums")))

  override val labels: Cfg[Labels] = Labels(items = js.Array(LabelsItems(html = "Total fruit consumption", style = js.Dynamic.literal(
    left = "50px",
    top = "18px",
    color = fromHighchartsTheme("black")(_.textColor)
  ))))

  override val series: SeriesCfg = js.Array[AnySeries](
    SeriesColumn(name = "Jane", data = js.Array[Double](3, 2, 1, 3, 4)),
    SeriesColumn(name = "John", data = js.Array[Double](2, 3, 5, 7, 6)),
    SeriesColumn(name = "Joe", data = js.Array[Double](4, 3, 3, 9, 0)),
    SeriesSpline(name = "Average", data = js.Array[Double](3, 2.67, 3, 6.33, 3.33),
      marker = SeriesSplineMarker(lineWidth = 2, lineColor = defaultColor(3), fillColor = "white")),
    SeriesPie(
      name = "Average",
      data = js.Array(
        SeriesPieData(name = "Jane", y = 13, color = defaultColor(0)),
        SeriesPieData(name = "John", y = 23, color = defaultColor(1)),
        SeriesPieData(name = "Joe", y = 19, color = defaultColor(2))
      ),
      center = js.Array[String | Double](100, 80),
      size = 100,
      showInLegend = false,
      dataLabels = SeriesPieDataLabels(enabled = false)
    )
  )
}
