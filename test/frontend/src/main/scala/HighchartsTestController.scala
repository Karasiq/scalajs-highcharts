import com.greencatsoft.angularjs.core.Scope
import com.greencatsoft.angularjs.{Controller, inject, injectable}
import com.highcharts.HighchartsUtils._
import com.highcharts.config._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js.{Any, UndefOr}

@js.native
trait TestChartsScope extends Scope {
  var barChartConfig: js.Object = js.native
}

@JSExport
@injectable("testCtrl")
class HighchartsTestController extends Controller[TestChartsScope] {
  @inject
  var scope: TestChartsScope = _

  override def initialize(): Unit = {
    // TODO: more charts
    super.initialize()

    scope.barChartConfig = cleanObject(new HighchartsNgConfig {
      override val options: Cfg[HighchartsConfig] = new HighchartsConfig {
        // Chart config
        override val chart: Cfg[Chart] = new Chart {
          override val `type`: UndefOr[String] = "bar"
        }

        // Chart title
        override val title: Cfg[Title] = new Title {
          override val text: UndefOr[String] = "Test chart"
        }
      }

      override val series: Any = mkSeries(
        new SeriesBar {
          override val name: js.UndefOr[String] = "Jane"
          override val data: js.Any = js.Array(1, 0, 4)
        },
        new SeriesBar {
          override val name: js.UndefOr[String] = "John"
          override val data: js.Any = js.Array(5, 7, 3)
        }
      )
    })

    org.scalajs.dom.console.log(scope.barChartConfig)
  }
}