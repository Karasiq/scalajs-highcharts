package com.highstock

import com.highcharts.{AnySeriesDef, CleanJsObject}
import com.highstock.config._

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.|

object HighstockAliases extends AnySeriesDef {
  type SeriesCfgData[T <: js.Object] = js.UndefOr[js.Array[CleanJsObject[T] | js.Array[js.Any] | Double]]

  // Copied from com.highstock.config.HighstockConfig
  type AnySeries = SeriesArea | SeriesArearange | SeriesAreaspline | SeriesAreasplinerange | SeriesCandlestick | SeriesColumn | SeriesColumnrange | SeriesFlags | SeriesLine | SeriesOhlc | SeriesPolygon | SeriesScatter | SeriesSpline
}
