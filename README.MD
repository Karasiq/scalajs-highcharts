# scalajs-highcharts
[Scala.JS](http://scala-js.org/) static typed facades for [Highcharts](http://www.highcharts.com) library

# How to use
Add to your `build.sbt`:
```scala
libraryDependencies += "com.github.karasiq" %%% "scalajs-highcharts" % "1.0.6"
```

Use in code:
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
    override val text: UndefOr[String] = "Test chart"
  }

  // Series
  override val series: SeriesCfg = mkSeries(
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
```