package com.highmaps

import com.highcharts.{AnySeriesDef, CleanJsObject}

import scala.scalajs.js
import scala.scalajs.js.|

object HighmapsAliases extends AnySeriesDef {
  type SeriesCfgData[T <: js.Object] = js.UndefOr[js.Array[CleanJsObject[T] | js.Array[js.Any] | Double]]

  type AnySeries = js.Any
}
