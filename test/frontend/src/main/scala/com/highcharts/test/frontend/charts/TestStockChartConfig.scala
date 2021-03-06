package com.highcharts.test.frontend.charts

import com.highcharts.HighchartsUtils._
import com.highstock.HighstockAliases._
import com.highstock.config._
import org.scalajs.dom.ErrorEvent
import org.scalajs.jquery.jQuery

import scala.concurrent.{Future, Promise}
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * @see [[http://www.highcharts.com/stock/demo/intraday-area]]
  */
@ScalaJSDefined
class TestStockChartConfig(sampleData: TestStockChartConfig.SampleSeriesData) extends HighstockConfig {
  override val title = Title(text = "AAPL stock price by minute")

  override val subtitle = Subtitle(text = "Using ordinal X axis")

  override val xAxis = XAxis(gridLineWidth = 0)

  override val rangeSelector = RangeSelector(
    buttons = js.Array(
      RangeSelectorButtons(`type` = "hour", count = 1, text = "1H"),
      RangeSelectorButtons(`type` = "day", count = 1, text = "1D"),
      RangeSelectorButtons(`type` = "all", count = 1, text = "All")
    ),
    selected = 1,
    inputEnabled = false
  )

  override val series: SeriesCfg = js.Array[AnySeries](SeriesArea(
    name = "AAPL",
    data = sampleData,
    gapSize = 5,
    tooltip = SeriesAreaTooltip(valueDecimals = 2),
    threshold = null,
    color = js.Dynamic.literal(
      linearGradient = js.Dynamic.literal(x1 = 0, y1 = 0, x2 = 0, y2 = 1),
      stops = js.Array(
        js.Array(0, defaultColor(0)),
        js.Array(1, mkColor(defaultColor(0)).setOpacity(0).get("rgba"))
      )
    )
  ))
}

object TestStockChartConfig {
  type SampleSeriesData = js.Array[js.Array[Double]]

  def loadSampleData(): Future[SampleSeriesData] = {
    val promise = Promise[SampleSeriesData]()
    val xhr = jQuery.getJSON("https://www.highcharts.com/samples/data/jsonp.php?filename=new-intraday.json&callback=?", (data: SampleSeriesData) ⇒ {
      org.scalajs.dom.console.log(data)
      promise.trySuccess(data)
    })
    xhr.asInstanceOf[js.Dynamic].onerror = (e: ErrorEvent) ⇒ promise.tryFailure(new Exception(e.message))
    promise.future
  }
}