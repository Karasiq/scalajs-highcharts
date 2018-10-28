package com.highcharts

import scala.language.implicitConversions
import scala.scalajs.js

trait AnySeriesDef {
  type AnySeries

  type SeriesCfg = js.UndefOr[js.Array[js.Any]]

  implicit def anySeriesArrayConvert(arr: js.Array[AnySeries]): SeriesCfg = {
    arr.map(obj ⇒ CleanJsObject(obj.asInstanceOf[js.Object])).asInstanceOf[SeriesCfg]
  }
}
