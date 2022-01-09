package com.highcharts

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.{`|`, UndefOr}

import com.highcharts.HighchartsAliases.SeriesCfgData

trait HighchartsImplicits {
  type Cfg[T <: js.Object] = UndefOr[CleanJsObject[T]]

  type CfgArray[T <: js.Object] = UndefOr[js.Array[CleanJsObject[T]]]

  implicit def highchartsGenericObjectToJSAny[T](value: T)(implicit ev: T ⇒ HighchartsGenericObject): js.Any = {
    HighchartsGenericObject.toCleanObject(ev(value)).asInstanceOf[js.Any]
  }

  implicit def highchartsUnionArray[V, U1, U2](obj: js.Array[V])(implicit ev: js.`|`.Evidence[V, U1 | U2]): js.Array[U1 | U2] = {
    obj.asInstanceOf[js.Array[U1 | U2]]
  }

  implicit def highchartsUndefOrUnionArray[V, U1, U2](obj: js.Array[V])(implicit ev: js.`|`.Evidence[V, U1 | U2]): js.UndefOr[js.Array[U1 | U2]] = {
    obj.asInstanceOf[js.Array[U1 | U2]]
  }

  implicit def highchartsUnionCleanObject[V <: js.Object, U1, U2](obj: V)(implicit ev: js.`|`.Evidence[CleanJsObject[V], U1 | U2]): U1 | U2 = {
    CleanJsObject(obj).asInstanceOf[U1 | U2]
  }

  implicit def highchartsUnionCfg[V, U1, U2](obj: V)(implicit ev: js.`|`.Evidence[V, U1 | U2]): js.UndefOr[U1 | U2] = {
    ScalaJSCompat.toUndefOr(obj.asInstanceOf[U1 | U2])
  }

  implicit def highchartsCleanObject[T <: js.Object](obj: T): CleanJsObject[T] = {
    CleanJsObject(obj).asInstanceOf[CleanJsObject[T]]
  }

  implicit def highchartsUndefOrCleanObject[T <: js.Object](obj: T): js.UndefOr[CleanJsObject[T]] = {
    if (js.isUndefined(obj)) js.undefined
    else CleanJsObject(obj).asInstanceOf[js.UndefOr[CleanJsObject[T]]]
  }

  implicit def highchartsUndefOrAny[T](obj: T)(implicit ev: T ⇒ js.Any): js.UndefOr[js.Any] = {
    ev(obj).asInstanceOf[js.UndefOr[js.Any]]
  }

  implicit def highchartsPlainObject[T](obj: CleanJsObject[T]): T = {
    obj.asInstanceOf[T]
  }

  implicit def highchartsCleanData[T <: js.Object, V](
      obj: js.Array[T]
  )(implicit ev: js.`|`.Evidence[CleanJsObject[T], V]): js.UndefOr[js.Array[V]] = {
    ScalaJSCompat.toUndefOr(obj.map(o ⇒ highchartsCleanObject(o).asInstanceOf[V]))
  }

  implicit def highchartsSeriesCfgData[T, D <: js.Object](
      obj: js.Array[T]
  )(implicit ev: js.`|`.Evidence[T, CleanJsObject[D] | js.Array[js.Any] | Double]): SeriesCfgData[D] = {
    ScalaJSCompat.toUndefOr(obj.asInstanceOf[js.Array[CleanJsObject[D] | js.Array[js.Any] | Double]])
  }

  implicit def highchartsCfg[A <: js.Object](obj: A): Cfg[A] = {
    ScalaJSCompat.toUndefOr(this.highchartsCleanObject(obj))
  }

  implicit def highchartsIntNumber(value: Int): UndefOr[Double] = {
    value.toDouble
  }
}
