# scalajs-highcharts
[Scala.JS](http://scala-js.org/) static typed facades for [Highcharts](http://www.highcharts.com) library

# How to use
Add to your `build.sbt`:
```scala
libraryDependencies += "com.github.karasiq" %%% "scalajs-highcharts" % "1.0.4"
```

Use in code:
```scala
import scalajs.js
import org.scalajs.jquery.jQuery
import com.highcharts.HighchartsJQuery._
import com.highcharts.config.{Chart, Title, SeriesBar, RootObject
⇒ HighchartsConfig}

jQuery("#container").highcharts(new HighchartsConfig {
  override val chart: js.UndefOr[Chart] = new Chart {
    override val `type`: String = "bar"
  }

  override val title: js.UndefOr[Title] = new Title {
    override val text: String = "Example chart"
  }

  override val series: js.UndefOr[js.Array[js.Object]] = js.Array[js.Object](
    new SeriesBar {
      override val name: js.UndefOr[String] = "Jane"
      override val data: js.UndefOr[js.Any] = js.Array(1, 0, 4)
    },
    new SeriesBar {
      override val name: js.UndefOr[String] = "John"
      override val data: js.UndefOr[js.Any] = js.Array(5, 7, 3)
    }
  )
})
```