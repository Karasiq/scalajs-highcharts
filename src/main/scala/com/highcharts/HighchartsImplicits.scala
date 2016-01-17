package com.highcharts

import com.highcharts.HighchartsUtils.{AnySeries, Cfg, SeriesCfg, SeriesCfgData}

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.{UndefOr, `|`}

trait HighchartsImplicits {
  implicit def highchartsCleanObject[T <: js.Object](obj: T): CleanJsObject[T] = {
    CleanJsObject(obj).asInstanceOf[CleanJsObject[T]]
  }

  implicit def highchartsPlainObject[T](obj: CleanJsObject[T]): T = {
    obj.asInstanceOf[T]
  }

  implicit def highchartsSeriesCfgData[T, D <: js.Object](obj: js.Array[T])(implicit ev: js.`|`.Evidence[T, CleanJsObject[D] | js.Array[js.Any] | Double]): SeriesCfgData[D] = {
    UndefOr.any2undefOrA(obj.asInstanceOf[js.Array[CleanJsObject[D] | js.Array[js.Any] | Double]])
  }

  implicit def highchartsCfg[A <: js.Object](obj: A): Cfg[A] = {
    UndefOr.any2undefOrA(this.highchartsCleanObject(obj))
  }

  implicit def highchartsSeriesArray(arr: js.Array[AnySeries]): SeriesCfg = {
    arr.asInstanceOf[SeriesCfg]
  }
}
