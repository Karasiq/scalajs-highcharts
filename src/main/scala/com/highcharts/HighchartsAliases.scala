package com.highcharts

import com.highcharts.native.SeriesPieData

import scala.scalajs.js
import scala.scalajs.js.|

object HighchartsAliases extends AnySeriesDef {
  type SeriesCfgData[T <: js.Object] = js.UndefOr[js.Array[CleanJsObject[T] | js.Array[js.Any] | Double]]

  type CategoriesCfg = js.UndefOr[js.Array[String]]

  // Copied from com.highcharts.native.HighchartsConfig
  type AnySeries = js.Any

  type SeriesPieCfgData = js.UndefOr[js.Array[CleanJsObject[SeriesPieData] | Double]]
}
