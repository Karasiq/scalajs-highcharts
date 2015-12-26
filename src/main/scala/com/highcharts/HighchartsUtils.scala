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

  def mkSeries(obj: js.Object*): SeriesCfg = {
    import js.JSConverters._
    obj.map(CleanJsObject.apply).toJSArray.asInstanceOf[SeriesCfg]
  }

  type Cfg[T <: js.Object] = UndefOr[CleanJsObject[T]]
  type SeriesCfg = js.UndefOr[js.Array[CleanJsObject[SeriesArea]] | js.Array[CleanJsObject[SeriesArearange]] | js.Array[CleanJsObject[SeriesAreaspline]] | js.Array[CleanJsObject[SeriesAreasplinerange]] | js.Array[CleanJsObject[SeriesBar]] | js.Array[CleanJsObject[SeriesBoxplot]] | js.Array[CleanJsObject[SeriesBubble]] | js.Array[CleanJsObject[SeriesColumn]] | js.Array[CleanJsObject[SeriesColumnrange]] | js.Array[CleanJsObject[SeriesErrorbar]] | js.Array[CleanJsObject[SeriesFunnel]] | js.Array[CleanJsObject[SeriesGauge]] | js.Array[CleanJsObject[SeriesHeatmap]] | js.Array[CleanJsObject[SeriesLine]] | js.Array[CleanJsObject[SeriesPie]] | js.Array[CleanJsObject[SeriesPolygon]] | js.Array[CleanJsObject[SeriesPyramid]] | js.Array[CleanJsObject[SeriesScatter]] | js.Array[CleanJsObject[SeriesSolidgauge]] | js.Array[CleanJsObject[SeriesSpline]] | js.Array[CleanJsObject[SeriesTreemap]] | js.Array[CleanJsObject[SeriesWaterfall]]]
  type SeriesCfgData[T <: js.Object] = js.UndefOr[js.Array[CleanJsObject[T] | js.Array[js.Any] | Double]]
  type CategoriesCfg = js.UndefOr[js.Array[String]]
}
