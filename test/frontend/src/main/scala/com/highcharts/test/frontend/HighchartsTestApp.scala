package com.highcharts.test.frontend

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._
import com.highcharts.test.frontend.charts.{Test3dPieChartConfig, TestBarChartConfig, TestCombinationChartConfig, TestStockChartConfig}
import org.scalajs.dom
import org.scalajs.jquery._

import scala.scalajs.concurrent.JSExecutionContext.Implicits.queue
import scala.scalajs.js
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import scalatags.JsDom.all._

@JSExport
object HighchartsTestApp extends JSApp {
  private def renderChart(chartConfig: CleanJsObject[js.Object]): dom.Element = {
    dom.console.log(chartConfig)
    val container = div().render
    jQuery(container).highcharts(chartConfig)
    container
  }

  private def fixChartSizes(): Unit = {
    jQuery("div[data-highcharts-chart]").each { (v: js.Any, e: dom.Element) ⇒
      jQuery(e).highcharts().foreach(_.reflow()).asInstanceOf[js.Any]
    }
  }

  @JSExport
  override def main(): Unit = {
    jQuery(() ⇒ {
      // Create charts
      val barChart = renderChart(new TestBarChartConfig)
      val pieChart = renderChart(new Test3dPieChartConfig)
      val comboChart = renderChart(new TestCombinationChartConfig)
      val stockChart = div().render

      // Create navigation elements
      val tabs = new NavigationBar("highcharts-test",
        NavigationTab("Bar chart", "bar", "briefcase", barChart, active = true),
        NavigationTab("Pie chart", "pie", "adjust", pieChart),
        NavigationTab("Combination chart", "combo", "tasks", comboChart),
        NavigationTab("Stock chart", "stock", "usd", stockChart)
      )

      // Bootstrap container
      val container = div(id := "main-container", `class` := "container")(
        div(`class` := "row", div(`class` := "col-md-12")(
          tabs.content
        ))
      ).render

      // Render page
      val body = dom.document.body
      body.appendChild(tabs.navbar("Scala.js Highcharts Test").render)
      body.appendChild(container)

      TestStockChartConfig.loadSampleData().foreach { data ⇒
        jQuery(stockChart).highstock(new TestStockChartConfig(data))
      }

      // Size fix
      jQuery(dom.document).on("shown.bs.tab", "a[data-toggle=\"tab\"]", (_: JQueryEventObject) ⇒ fixChartSizes())
      fixChartSizes()
    })
  }
}