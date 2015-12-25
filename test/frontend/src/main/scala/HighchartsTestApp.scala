import com.greencatsoft.angularjs.Angular

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

@JSExport
object HighchartsTestApp extends JSApp {
  @JSExport
  override def main(): Unit = {
    val module = Angular.module("scalaJsHighchartsTest", Seq("angularUtils.directives.dirPagination", "highcharts-ng", "angularMoment"))
    module.controller[HighchartsTestController]
  }
}

