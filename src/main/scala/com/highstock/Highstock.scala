package com.highstock

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/** Highstock API object
  * @see
  *   [[http://api.highcharts.com/highstock]]
  */
@js.native
@JSImport("highcharts/highstock", JSImport.Default, "Highcharts")
object Highstock extends api.Highcharts
