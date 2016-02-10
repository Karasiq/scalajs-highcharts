/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptions extends js.Object {

  val area: js.UndefOr[CleanJsObject[PlotOptionsArea]] = js.undefined

  /**
    * The area range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/arearange/">Arearange example</a>
    * @since 1.2.0
    */
  val arearange: js.UndefOr[CleanJsObject[PlotOptionsArearange]] = js.undefined

  val areaspline: js.UndefOr[CleanJsObject[PlotOptionsAreaspline]] = js.undefined

  /**
    * The area spline range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
    * @since 1.2.0
    */
  val areasplinerange: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerange]] = js.undefined

  val candlestick: js.UndefOr[CleanJsObject[PlotOptionsCandlestick]] = js.undefined

  val column: js.UndefOr[CleanJsObject[PlotOptionsColumn]] = js.undefined

  /**
    * The column range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>. To display horizontal bars, set <a href="#chart.inverted">chart.inverted</a> to <code>true</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/columnrange/" target="_blank">Inverted column range</a>
    * @since 1.2.0
    */
  val columnrange: js.UndefOr[CleanJsObject[PlotOptionsColumnrange]] = js.undefined

  val flags: js.UndefOr[CleanJsObject[PlotOptionsFlags]] = js.undefined

  val line: js.UndefOr[CleanJsObject[PlotOptionsLine]] = js.undefined

  val ohlc: js.UndefOr[CleanJsObject[PlotOptionsOhlc]] = js.undefined

  /**
    * A polygon series can be used to draw any freeform shape in the cartesian coordinate system. A fill is applied with the <code>color</code> option, and stroke is applied through <code>lineWidth</code> and <code>lineColor</code> options. Requires the <code>highcharts-more.js</code> file.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/polygon/" target="_blank">Polygon</a>
    * @since 2.1.0
    */
  val polygon: js.UndefOr[CleanJsObject[PlotOptionsPolygon]] = js.undefined

  val scatter: js.UndefOr[CleanJsObject[PlotOptionsScatter]] = js.undefined

  /**
    * <p>General options for all series types.</p>
    */
  val series: js.UndefOr[CleanJsObject[PlotOptionsSeries]] = js.undefined

  val spline: js.UndefOr[CleanJsObject[PlotOptionsSpline]] = js.undefined
}

object PlotOptions {
  /**
    * @param arearange The area range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
    * @param areasplinerange The area spline range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
    * @param columnrange The column range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>. To display horizontal bars, set <a href="#chart.inverted">chart.inverted</a> to <code>true</code>.
    * @param polygon A polygon series can be used to draw any freeform shape in the cartesian coordinate system. A fill is applied with the <code>color</code> option, and stroke is applied through <code>lineWidth</code> and <code>lineColor</code> options. Requires the <code>highcharts-more.js</code> file.
    * @param series <p>General options for all series types.</p>
    */
  def apply(area: js.UndefOr[CleanJsObject[PlotOptionsArea]] = js.undefined, arearange: js.UndefOr[CleanJsObject[PlotOptionsArearange]] = js.undefined, areaspline: js.UndefOr[CleanJsObject[PlotOptionsAreaspline]] = js.undefined, areasplinerange: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerange]] = js.undefined, candlestick: js.UndefOr[CleanJsObject[PlotOptionsCandlestick]] = js.undefined, column: js.UndefOr[CleanJsObject[PlotOptionsColumn]] = js.undefined, columnrange: js.UndefOr[CleanJsObject[PlotOptionsColumnrange]] = js.undefined, flags: js.UndefOr[CleanJsObject[PlotOptionsFlags]] = js.undefined, line: js.UndefOr[CleanJsObject[PlotOptionsLine]] = js.undefined, ohlc: js.UndefOr[CleanJsObject[PlotOptionsOhlc]] = js.undefined, polygon: js.UndefOr[CleanJsObject[PlotOptionsPolygon]] = js.undefined, scatter: js.UndefOr[CleanJsObject[PlotOptionsScatter]] = js.undefined, series: js.UndefOr[CleanJsObject[PlotOptionsSeries]] = js.undefined, spline: js.UndefOr[CleanJsObject[PlotOptionsSpline]] = js.undefined): PlotOptions = {
    val areaOuter: js.UndefOr[CleanJsObject[PlotOptionsArea]] = area
    val arearangeOuter: js.UndefOr[CleanJsObject[PlotOptionsArearange]] = arearange
    val areasplineOuter: js.UndefOr[CleanJsObject[PlotOptionsAreaspline]] = areaspline
    val areasplinerangeOuter: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerange]] = areasplinerange
    val candlestickOuter: js.UndefOr[CleanJsObject[PlotOptionsCandlestick]] = candlestick
    val columnOuter: js.UndefOr[CleanJsObject[PlotOptionsColumn]] = column
    val columnrangeOuter: js.UndefOr[CleanJsObject[PlotOptionsColumnrange]] = columnrange
    val flagsOuter: js.UndefOr[CleanJsObject[PlotOptionsFlags]] = flags
    val lineOuter: js.UndefOr[CleanJsObject[PlotOptionsLine]] = line
    val ohlcOuter: js.UndefOr[CleanJsObject[PlotOptionsOhlc]] = ohlc
    val polygonOuter: js.UndefOr[CleanJsObject[PlotOptionsPolygon]] = polygon
    val scatterOuter: js.UndefOr[CleanJsObject[PlotOptionsScatter]] = scatter
    val seriesOuter: js.UndefOr[CleanJsObject[PlotOptionsSeries]] = series
    val splineOuter: js.UndefOr[CleanJsObject[PlotOptionsSpline]] = spline
    new PlotOptions {
      override val area: js.UndefOr[CleanJsObject[PlotOptionsArea]] = areaOuter
      override val arearange: js.UndefOr[CleanJsObject[PlotOptionsArearange]] = arearangeOuter
      override val areaspline: js.UndefOr[CleanJsObject[PlotOptionsAreaspline]] = areasplineOuter
      override val areasplinerange: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerange]] = areasplinerangeOuter
      override val candlestick: js.UndefOr[CleanJsObject[PlotOptionsCandlestick]] = candlestickOuter
      override val column: js.UndefOr[CleanJsObject[PlotOptionsColumn]] = columnOuter
      override val columnrange: js.UndefOr[CleanJsObject[PlotOptionsColumnrange]] = columnrangeOuter
      override val flags: js.UndefOr[CleanJsObject[PlotOptionsFlags]] = flagsOuter
      override val line: js.UndefOr[CleanJsObject[PlotOptionsLine]] = lineOuter
      override val ohlc: js.UndefOr[CleanJsObject[PlotOptionsOhlc]] = ohlcOuter
      override val polygon: js.UndefOr[CleanJsObject[PlotOptionsPolygon]] = polygonOuter
      override val scatter: js.UndefOr[CleanJsObject[PlotOptionsScatter]] = scatterOuter
      override val series: js.UndefOr[CleanJsObject[PlotOptionsSeries]] = seriesOuter
      override val spline: js.UndefOr[CleanJsObject[PlotOptionsSpline]] = splineOuter
    }
  }
}
