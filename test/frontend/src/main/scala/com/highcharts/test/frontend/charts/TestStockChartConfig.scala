package com.highcharts.test.frontend.charts

import com.highcharts.HighchartsUtils._
import com.highstock.HighstockAliases._
import com.highstock.config._
import org.scalajs.dom.ErrorEvent
import org.scalajs.jquery.jQuery

import scala.concurrent.{Future, Promise}
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr, |}

/**
  * @see [[http://www.highcharts.com/stock/demo/intraday-area]]
  */
@ScalaJSDefined
class TestStockChartConfig(sampleData: js.Array[js.Array[js.Any]]) extends HighstockConfig {
  override val title: Cfg[Title] = Title(text = "AAPL stock price by minute")

  override val subtitle: Cfg[Subtitle] = Subtitle(text = "Using ordinal X axis")

  override val xAxis: Cfg[XAxis] = XAxis(gridLineWidth = 0)

  override val rangeSelector: Cfg[RangeSelector] = new RangeSelector {
    override val buttons: UndefOr[js.Array[js.Any]] = js.Array(
      js.Dynamic.literal(`type` = "hour", count = 1, text = "1H"),
      js.Dynamic.literal(`type` = "day", count = 1, text = "1D"),
      js.Dynamic.literal(`type` = "all", count = 1, text = "All")
    )
    override val selected: UndefOr[Double] = 1
    override val inputEnabled: UndefOr[Boolean] = false
  }

  override val series: SeriesCfg = js.Array[AnySeries](
    new SeriesArea {
      override val name: UndefOr[String] = "AAPL"
      override val data: SeriesCfgData[SeriesAreaData] = sampleData
      override val gapSize: UndefOr[Double] = 5
      override val tooltip: Cfg[SeriesAreaTooltip] = new SeriesAreaTooltip {
        override val valueDecimals: UndefOr[Double] = 2
      }
      override val threshold: UndefOr[Double] = null
      override val color: UndefOr[String | js.Object] = js.Dynamic.literal(
        linearGradient = js.Dynamic.literal(x1 = 0, y1 = 0, x2 = 0, y2 = 1),
        stops = js.Array(
          js.Array(0, defaultColor(0)),
          js.Array(1, mkColor(defaultColor(0)).setOpacity(0).get("rgba"))
        )
      )
    }
  )
}

object TestStockChartConfig {
  def loadSampleData(): Future[js.Array[js.Array[js.Any]]] = {
    val promise = Promise[js.Array[js.Array[js.Any]]]()
    val xhr = jQuery.getJSON("https://www.highcharts.com/samples/data/jsonp.php?filename=new-intraday.json&callback=?", (data: js.Array[js.Array[js.Any]]) ⇒ {
      promise.trySuccess(data)
    })
    xhr.onerror = { e: ErrorEvent ⇒
      promise.tryFailure(new Exception(e.message))
    }
    promise.future
  }
}