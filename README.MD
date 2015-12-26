# scalajs-highcharts
[Scala.JS](http://scala-js.org/) static typed facades for [Highcharts](http://www.highcharts.com) library

# How to use
Add dependency to your `build.sbt`
```scala
libraryDependencies += "com.github.karasiq" %%% "scalajs-highcharts" % "1.0.7"
```

Include the JavaScript files in the `<head>` section of your web page as shown below
```html
<script src="http://code.highcharts.com/highcharts.js"></script>
```

# Example
```scala
import scalajs.js, js.UndefOr
import org.scalajs.jquery.jQuery
import com.highcharts.HighchartsUtils._
import com.highcharts.config._

jQuery("#container").highcharts(new HighchartsConfig {
  // Chart config
  override val chart: Cfg[Chart] = new Chart {
    override val `type`: UndefOr[String] = "bar"
  }

  // Chart title
  override val title: Cfg[Title] = new Title {
    override val text: UndefOr[String] = "Demo bar chart"
  }

  // X Axis settings
  override val xAxis: Cfg[XAxis] = new XAxis {
    override val categories: CategoriesCfg = js.Array("Apples", "Bananas", "Oranges")
  }

  // Y Axis settings
  override val yAxis: Cfg[YAxis] = new YAxis {
    override val title: Cfg[YAxisTitle] = new YAxisTitle {
      override val text: UndefOr[String] = "Fruit eaten"
    }
  }

  // Series
  override val series: SeriesCfg = mkSeries(
    new SeriesBar {
      override val name: js.UndefOr[String] = "Jane"
      override val data: SeriesCfgData[SeriesBarData] = js.Array[Double](1, 0, 4)
    },
    new SeriesBar {
      override val name: js.UndefOr[String] = "John"
      override val data: SeriesCfgData[SeriesBarData] = js.Array[Double](5, 7, 3)
    }
  )
})
```
