# scalajs-highcharts
[Scala.JS](http://scala-js.org/) static typed facades for [Highcharts](http://www.highcharts.com) library

# How to use
Add to your `build.sbt`:
```scala
libraryDependencies += "com.github.karasiq" %%% "scalajs-highcharts" % "1.0.1"
```

Use in code:
```scala
import scalajs.js
import org.scalajs.jquery.jQuery
import com.highcharts.HighchartsJQuery._
import com.highcharts.config.{Chart, Title, SeriesBar, RootObject
⇒ HighchartsConfig}

jQuery("#container").highcharts(new HighchartsConfig {
  override var chart: js.UndefOr[Chart] = new Chart {
    override var `type`: String = "bar"
  }

  override var title: js.UndefOr[Title] = new Title {
    override var text: String = "Example chart"
  }

  override var series: js.UndefOr[js.Array[js.Object]] = js.Array[js.Object](
    new SeriesBar {
      override var name: js.UndefOr[String] = "Jane"
      override var data: js.UndefOr[js.Any] = js.Array(1, 0, 4)
    },
    new SeriesBar {
      override var name: js.UndefOr[String] = "John"
      override var data: js.UndefOr[js.Any] = js.Array(5, 7, 3)
    }
  )
})
```