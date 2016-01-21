package com.highcharts

import com.highcharts.config._
import org.scalajs.jquery.JQuery

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.{UndefOr, `|`}

object HighchartsUtils extends HighchartsImplicits {
  /**
    * Allows calling `$("#container").highcharts({...})` function from ScalaJS
    * @example {{{
    *   import org.scalajs.jquery.jQuery
    *   import com.highcharts.HighchartsUtils._
    *
    *   jQuery("#container").highcharts(...)
    * }}}
    */
  implicit class HighchartsJQuery(val jq: JQuery) extends AnyVal {
    def highcharts[T <: js.Object](config: CleanJsObject[T]): Unit = {
      jq.asInstanceOf[js.Dynamic].highcharts(config)
    }

    def highcharts(): UndefOr[com.highcharts.api.Chart] = {
      jq.asInstanceOf[js.Dynamic].highcharts().asInstanceOf[UndefOr[com.highcharts.api.Chart]]
    }
  }

  // Heterogeneous series build helper
  implicit class SeriesBuilder(val series: js.Array[AnySeries]) extends AnyVal {
    def addSeries[T <: js.Object](series: T*)(implicit ev: `|`.Evidence[T, AnySeries]): js.Array[AnySeries] = {
      import scala.scalajs.js.JSConverters._
      (this.series ++ series.map(CleanJsObject.apply).toJSArray).asInstanceOf[js.Array[AnySeries]]
    }
  }

  def mkSeries[T <: js.Object](series: T*)(implicit ev: `|`.Evidence[T, AnySeries]): js.Array[AnySeries] = {
    js.Array[AnySeries]().addSeries[T](series:_*)
  }

  type Cfg[T <: js.Object] = UndefOr[CleanJsObject[T]]

  // Copied from com.highcharts.config.HighchartsConfig
  type AnySeries = SeriesArea | SeriesArearange | SeriesAreaspline | SeriesAreasplinerange | SeriesBar | SeriesBoxplot | SeriesBubble | SeriesColumn | SeriesColumnrange | SeriesErrorbar | SeriesFunnel | SeriesGauge | SeriesHeatmap | SeriesLine | SeriesPie | SeriesPolygon | SeriesPyramid | SeriesScatter | SeriesSolidgauge | SeriesSpline | SeriesTreemap | SeriesWaterfall

  type SeriesCfg = js.UndefOr[js.Array[CleanJsObject[AnySeries]]]

  type SeriesCfgData[T <: js.Object] = js.UndefOr[js.Array[CleanJsObject[T] | js.Array[js.Any] | Double]]

  type SeriesPieCfgData = js.UndefOr[js.Array[CleanJsObject[SeriesPieData] | Double]]

  type CategoriesCfg = js.UndefOr[js.Array[String]]
}
