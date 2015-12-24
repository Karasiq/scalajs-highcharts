# scalajs-highcharts
[Scala.JS](http://scala-js.org/) static typed facades for [Highcharts](http://www.highcharts.com) library

# How to use
Add to your `build.sbt`:
```scala
libraryDependencies += "com.github.karasiq" %%% "scalajs-highcharts" % "1.0.0"
```

Use in code:
```scala
import org.scalajs.jquery.jQuery
import org.scalajs.jquery.jQuery
import com.highcharts.HighchartsJQuery._

jQuery("#container").highcharts(???)
```