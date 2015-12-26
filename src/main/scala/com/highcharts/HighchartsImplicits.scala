package com.highcharts

import com.highcharts.HighchartsUtils.{AnySeries, Cfg, SeriesCfg, SeriesCfgData}

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.{UndefOr, `|`}

trait HighchartsImplicits {
  /* implicit def highchartsUnionArray[A, B1, B2](obj: js.Array[A])(implicit ev: js.`|`.Evidence[A, js.`|`[B1, B2]]): js.Array[js.`|`[B1, B2]] = {
    obj.asInstanceOf[js.Array[js.`|`[B1, B2]]]
  }

  implicit def highchartsUndefOrUnionArray[A, B1, B2](obj: js.Array[A])(implicit ev: js.`|`.Evidence[A, js.`|`[B1, B2]]): UndefOr[js.Array[js.`|`[B1, B2]]] = {
    UndefOr.any2undefOrA(this.highchartsUnionArray(obj))
  }

  implicit def highchartsUnionCleanObject[A <: js.Object, B1, B2](obj: A)(implicit ev: js.`|`.Evidence[CleanJsObject[A], js.`|`[B1, B2]]): js.`|`[B1, B2] = {
    js.`|`.from(this.highchartsCleanObject(obj))
  }

  implicit def highchartsUndefOrUnion[A, B1, B2](v: A)(implicit ev: js.`|`.Evidence[A, js.`|`[B1, B2]]): UndefOr[js.`|`[B1, B2]] = {
    UndefOr.any2undefOrA(js.`|`.from(v))
  }

  implicit def highchartsUndefOrCleanObject[T <: js.Object](obj: T): UndefOr[CleanJsObject[T]] = {
    UndefOr.any2undefOrA(this.highchartsCleanObject(obj))
  } */

  implicit def highchartsCleanObject[T <: js.Object](obj: T): CleanJsObject[T] = {
    CleanJsObject(obj).asInstanceOf[CleanJsObject[T]]
  }

  implicit def highchartsPlainObject[T](obj: CleanJsObject[T]): T = {
    obj.asInstanceOf[T]
  }

  implicit def highchartsSeriesCfgData[T, D <: js.Object](obj: js.Array[T])(implicit ev: js.`|`.Evidence[T, CleanJsObject[D] | js.Array[js.Any] | Double]): SeriesCfgData[D] = {
    UndefOr.any2undefOrA(obj.asInstanceOf[js.Array[CleanJsObject[D] | js.Array[js.Any] | Double]])
  }

  implicit def highchartsCfg[A <: js.Object, B](obj: B)(implicit ev: B <:< A): Cfg[A] = {
    UndefOr.any2undefOrA(this.highchartsCleanObject(obj.asInstanceOf[A]))
  }

  implicit def highchartsSeriesArray(arr: js.Array[AnySeries]): SeriesCfg = {
    arr.asInstanceOf[SeriesCfg]
  }
}
