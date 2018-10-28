package com.highcharts

import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Generic highcharts object
  */
@ScalaJSDefined
trait HighchartsGenericObject extends scalajs.js.Object

object HighchartsGenericObject {
  def toCleanObject[T <: HighchartsGenericObject](obj: T): CleanJsObject[T] = {
    CleanJsObject(obj).asInstanceOf[CleanJsObject[T]]
  }
}
