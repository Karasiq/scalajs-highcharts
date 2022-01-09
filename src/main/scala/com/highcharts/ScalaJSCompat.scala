package com.highcharts

import scala.scalajs.js.{`|`, UndefOr}

object ScalaJSCompat {
  def toUndefOr[T](value: T): scalajs.js.UndefOr[T] = value
}
