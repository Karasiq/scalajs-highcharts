package com.highcharts

import com.highcharts.HighchartsAliases.SeriesCfgData

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.{UndefOr, `|`}

trait HighchartsImplicits {
  type Cfg[T <: js.Object] = UndefOr[CleanJsObject[T]]

  type CfgArray[T <: js.Object] = UndefOr[js.Array[CleanJsObject[T]]]

  implicit def highchartsUnionCleanObject[V <: js.Object, U1, U2](obj: V)(implicit ev: js.`|`.Evidence[CleanJsObject[V], U1 | U2]): U1 | U2 = {
    CleanJsObject(obj).asInstanceOf[U1 | U2]
  }

  implicit def highchartsUnionCfg[V, U1, U2](obj: V)(implicit ev: js.`|`.Evidence[V, U1 | U2]): js.UndefOr[U1 | U2] = {
    UndefOr.any2undefOrA(obj.asInstanceOf[U1 | U2])
  }

  implicit def highchartsCleanObject[T <: js.Object](obj: T): CleanJsObject[T] = {
    CleanJsObject(obj).asInstanceOf[CleanJsObject[T]]
  }

  implicit def highchartsPlainObject[T](obj: CleanJsObject[T]): T = {
    obj.asInstanceOf[T]
  }

  implicit def highchartsCleanData[T <: js.Object, V](obj: js.Array[T])(implicit ev: js.`|`.Evidence[CleanJsObject[T], V]): js.UndefOr[js.Array[V]] = {
    UndefOr.any2undefOrA(obj.map(o ⇒ highchartsCleanObject(o).asInstanceOf[V]))
  }

  implicit def highchartsSeriesCfgData[T, D <: js.Object](obj: js.Array[T])(implicit ev: js.`|`.Evidence[T, CleanJsObject[D] | js.Array[js.Any] | Double]): SeriesCfgData[D] = {
    UndefOr.any2undefOrA(obj.asInstanceOf[js.Array[CleanJsObject[D] | js.Array[js.Any] | Double]])
  }

  implicit def highchartsCfg[A <: js.Object](obj: A): Cfg[A] = {
    UndefOr.any2undefOrA(this.highchartsCleanObject(obj))
  }

  implicit def highchartsIntNumber(value: Int): UndefOr[Double] = {
    value.toDouble
  }
}
