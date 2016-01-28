package com.highcharts

import com.highcharts.config._

import scala.scalajs.js
import scala.scalajs.js.|

object HighchartsAliases extends AnySeriesDef {
  type SeriesCfgData[T <: js.Object] = js.UndefOr[js.Array[CleanJsObject[T] | js.Array[js.Any] | Double]]

  type CategoriesCfg = js.UndefOr[js.Array[String]]

  // Copied from com.highcharts.config.HighchartsConfig
  type AnySeries = SeriesArea | SeriesArearange | SeriesAreaspline | SeriesAreasplinerange | SeriesBar | SeriesBoxplot | SeriesBubble | SeriesColumn | SeriesColumnrange | SeriesErrorbar | SeriesFunnel | SeriesGauge | SeriesHeatmap | SeriesLine | SeriesPie | SeriesPolygon | SeriesPyramid | SeriesScatter | SeriesSolidgauge | SeriesSpline | SeriesTreemap | SeriesWaterfall

  type SeriesPieCfgData = js.UndefOr[js.Array[CleanJsObject[SeriesPieData] | Double]]
}
