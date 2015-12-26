package com.highcharts.test.frontend

import com.greencatsoft.angularjs.core.Scope
import com.greencatsoft.angularjs.{Controller, inject, injectable}
import com.highcharts.HighchartsUtils._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

@js.native
trait TestChartsScope extends Scope {
  var barChartConfig: Cfg[HighchartsNgConfig] = js.native
}

@JSExport
@injectable("testCtrl")
class HighchartsTestController extends Controller[TestChartsScope] {
  @inject
  var scope: TestChartsScope = _

  override def initialize(): Unit = {
    // TODO: more charts
    super.initialize()

    scope.barChartConfig = charts.TestBarChartConfig
    org.scalajs.dom.console.log(scope.barChartConfig.get)
  }
}