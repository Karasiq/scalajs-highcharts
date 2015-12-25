# scalajs-highcharts
[Scala.JS](http://scala-js.org/) static typed facades for [Highcharts](http://www.highcharts.com) library

# How to use
Add to your `build.sbt`:
```scala
libraryDependencies += "com.github.karasiq" %%% "scalajs-highcharts" % "1.0.5"
```

Use in code:
```scala
import scalajs.js
import org.scalajs.jquery.jQuery
import com.highcharts.HighchartsJQuery._
import com.highcharts.config._

jQuery("#container").highcharts(new HighchartsConfig {
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
})
```