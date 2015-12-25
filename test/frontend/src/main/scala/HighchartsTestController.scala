import com.greencatsoft.angularjs.core.Scope
import com.greencatsoft.angularjs.{Controller, inject, injectable}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

@js.native
trait TestChartsScope extends Scope {
  var barChartConfig: js.Any = js.native
}

@JSExport
@injectable("testCtrl")
class HighchartsTestController extends Controller[TestChartsScope] {
  @inject
  var scope: TestChartsScope = _

  override def initialize(): Unit = {
    import com.highcharts.config._
    super.initialize()

    // Bar chart config
    scope.barChartConfig = new HighchartsConfig {
      // Chart config
      override val chart: Chart = new Chart {
        override val `type`: String = "bar"
      }

      // Chart title
      override val title: Title = new Title {
        override val text: String = "Test chart"
      }

      // Series
      override val series: js.Array[js.Object] = js.Array[js.Object](
        new SeriesBar {
          override val name: String = "Jane"
          override val data: js.Any = js.Array(1, 0, 4)
        },
        new SeriesBar {
          override val name: String = "John"
          override val data: js.Any = js.Array(5, 7, 3)
        }
      )
    }
  }
}