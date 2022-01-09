package com.highcharts

/**
  * Generic highcharts object
  */
trait HighchartsGenericObject extends scalajs.js.Object

object HighchartsGenericObject {
  def toCleanObject[T <: HighchartsGenericObject](obj: T): CleanJsObject[T] = {
    CleanJsObject(obj).asInstanceOf[CleanJsObject[T]]
  }
}
