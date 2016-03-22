# scalajs-highcharts [![Build Status](https://travis-ci.org/Karasiq/scalajs-highcharts.svg?branch=master)](https://travis-ci.org/Karasiq/scalajs-highcharts) [![Scala.js](http://scala-js.org/assets/badges/scalajs-0.6.7.svg)](http://scala-js.org) [![Version](http://img.shields.io/badge/version-1.1.2-blue.svg?style=flat)](https://github.com/Karasiq/scalajs-highcharts/releases) [![GitHub license](https://img.shields.io/github/license/Karasiq/scalajs-highcharts.svg)](https://opensource.org/licenses/MIT)
[Scala.JS](http://scala-js.org/) static typed facades for [Highcharts](http://www.highcharts.com) library

# Links
* [Demo page](https://karasiq.github.io/scalajs-highcharts/)
* [API Reference](https://karasiq.github.io/scalajs-highcharts/api/index.html)

# How to use
Add dependency to your `build.sbt`
```scala
libraryDependencies += "com.github.karasiq" %%% "scalajs-highcharts" % "1.1.2"
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
  override val chart: Cfg[Chart] = Chart(`type` = "bar")

  // Chart title
  override val title: Cfg[Title] = Title(text = "Demo bar chart")

  // X Axis settings
  override val xAxis: Cfg[XAxis] = XAxis(categories = js.Array("Apples", "Bananas", "Oranges"))

  // Y Axis settings
  override val yAxis: Cfg[YAxis] = YAxis(title = YAxisTitle(text = "Fruit eaten"))

  // Series
  override val series: SeriesCfg = js.Array[AnySeries](
    SeriesBar(name = "Jane", data = js.Array[Double](1, 0, 4)),
    SeriesBar(name = "John", data = js.Array[Double](5, 7, 3))
  )
})
```

# Full example
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
