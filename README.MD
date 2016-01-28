# scalajs-highcharts [![Dependencies](https://app.updateimpact.com/badge/692686982173822976/scalajs-highcharts.svg?config=compile)](https://app.updateimpact.com/latest/692686982173822976/scalajs-highcharts)
[Scala.JS](http://scala-js.org/) static typed facades for [Highcharts](http://www.highcharts.com) library

# Demo page
https://karasiq.github.io/scalajs-highcharts/

# How to use
Add dependency to your `build.sbt`
```scala
libraryDependencies += "com.github.karasiq" %%% "scalajs-highcharts" % "1.1.0"
```

Include the JavaScript files in the `<head>` section of your web page as shown below
```html
<script src="http://code.highcharts.com/highcharts.js"></script>
```

# Basic example
```scala
import scalajs.js, js.UndefOr
import org.scalajs.jquery.jQuery
import com.highcharts.HighchartsUtils._
import com.highcharts.HighchartsAliases._
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
  override val series: SeriesCfg = js.Array[AnySeries](
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

# Full example with backend
* [Project test server](https://github.com/Karasiq/scalajs-highcharts/tree/master/test) (see also [build.sbt configuration](https://github.com/Karasiq/scalajs-highcharts/blob/master/build.sbt#L59))

# License
The MIT License (MIT)

Copyright (c) 2016 Karasiq

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
