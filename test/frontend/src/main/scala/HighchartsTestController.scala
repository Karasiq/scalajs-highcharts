import com.greencatsoft.angularjs.core.Scope
import com.greencatsoft.angularjs.{inject, injectable, Controller}

import scala.concurrent.duration._
import scala.collection.JavaConversions._
import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

@js.native
trait TestScope extends Scope {
  // TODO: Chart configs
}

@JSExport
@injectable("testCtrl")
class HighchartsTestController extends Controller[TestScope] {
  @inject
  override var scope: TestScope = _
}