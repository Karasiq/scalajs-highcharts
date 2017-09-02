/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

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
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/arearange/">Arearange example</a>
    * @since 2.3.0
    */
  val arearange: js.UndefOr[CleanJsObject[PlotOptionsArearange]] = js.undefined

  val areaspline: js.UndefOr[CleanJsObject[PlotOptionsAreaspline]] = js.undefined

  /**
    * The area spline range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
    * @since 2.3.0
    */
  val areasplinerange: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerange]] = js.undefined

  val bar: js.UndefOr[CleanJsObject[PlotOptionsBar]] = js.undefined

  /**
    * A box plot is a convenient way of depicting groups of data through their five-number summaries: the smallest observation (sample minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest observation (sample maximum). 
    * @since 3.0
    */
  val boxplot: js.UndefOr[CleanJsObject[PlotOptionsBoxplot]] = js.undefined

  /**
    * A bubble series is a three dimensional series type where each point renders an X, Y and Z value. Each points is drawn as a bubble where the position along the X and Y axes mark the X and Y values, and the size of the bubble relates to the Z value. Requires <code>highcharts-more.js</code>.
    * @since 3.0
    */
  val bubble: js.UndefOr[CleanJsObject[PlotOptionsBubble]] = js.undefined

  val column: js.UndefOr[CleanJsObject[PlotOptionsColumn]] = js.undefined

  /**
    * The column range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>. To display horizontal bars, set <a href="#chart.inverted">chart.inverted</a> to <code>true</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/columnrange/" target="_blank">Inverted column range</a>
    * @since 2.3.0
    */
  val columnrange: js.UndefOr[CleanJsObject[PlotOptionsColumnrange]] = js.undefined

  /**
    * Error bars are a graphical representation of the variability of data and are used on graphs to indicate the error, or uncertainty in a reported measurement. 
    * @since 3.0
    */
  val errorbar: js.UndefOr[CleanJsObject[PlotOptionsErrorbar]] = js.undefined

  /**
    * Funnel charts are a type of chart often used to visualize stages in a sales project, where the top are the initial stages with the most clients. It requires that the <code>modules/funnel.js</code> file is loaded.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/funnel/" target="_blank">Funnel demo</a>
    * @since 3.0
    */
  val funnel: js.UndefOr[CleanJsObject[PlotOptionsFunnel]] = js.undefined

  /**
    * General plotting options for the gauge series type. Requires <code>highcharts-more.js</code>
    * @since 2.3.0
    */
  val gauge: js.UndefOr[CleanJsObject[PlotOptionsGauge]] = js.undefined

  /**
    * <p>The heatmap series type. This series type is available both in Highcharts and Highmaps.</p>
    * 
    * <p>The colors of each heat map point is usually determined by its value and controlled by settings on the <a href="#colorAxis">colorAxis</a>.</p>
    * @since 4.0
    */
  val heatmap: js.UndefOr[CleanJsObject[PlotOptionsHeatmap]] = js.undefined

  val line: js.UndefOr[CleanJsObject[PlotOptionsLine]] = js.undefined

  /**
    * A pie chart is a circular chart divided into sectors, illustrating numerical proportion.
    * @example  <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-basic/" target="_blank">Pie chart</a>,  

<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/3d-pie/" target="_blank">3D pie</a>
    */
  val pie: js.UndefOr[CleanJsObject[PlotOptionsPie]] = js.undefined

  /**
    * A polygon series can be used to draw any freeform shape in the cartesian coordinate system. A fill is applied with the <code>color</code> option, and stroke is applied through <code>lineWidth</code> and <code>lineColor</code> options. Requires the <code>highcharts-more.js</code> file.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polygon/" target="_blank">Polygon</a>
    * @since 4.1.0
    */
  val polygon: js.UndefOr[CleanJsObject[PlotOptionsPolygon]] = js.undefined

  /**
    * A pyramid chart consists of a single pyramid with item heights corresponding to each point value. Technically it is the same as a reversed funnel chart without a neck.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pyramid/" target="_blank">Pyramid chart</a>
    * @since 3.0.10
    */
  val pyramid: js.UndefOr[CleanJsObject[PlotOptionsPyramid]] = js.undefined

  val scatter: js.UndefOr[CleanJsObject[PlotOptionsScatter]] = js.undefined

  /**
    * <p>General options for all series types.</p>
    */
  val series: js.UndefOr[CleanJsObject[PlotOptionsSeries]] = js.undefined

  /**
    * A gauge showing values using a filled arc with colors indicating the value. The solid gauge plots values against the <code>yAxis</code>, which is extended with some color options, <a href="#yAxis.minColor">minColor</a>, <a href="#yAxis.maxColor">maxColor</a> and <a href="#yAxis.stops">stops</a>, to control the color of the gauge itself.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-solid/" target="_blank">Solid gauge</a>
    * @since 4.0
    */
  val solidgauge: js.UndefOr[CleanJsObject[PlotOptionsSolidgauge]] = js.undefined

  val spline: js.UndefOr[CleanJsObject[PlotOptionsSpline]] = js.undefined

  /**
    * The size of the point shape is determined by its value relative to its siblings values.
    * Requires the module <code>heatmap.js</code> as well, if functionality such as the <a href="http://api.highcharts.com/highmaps#colorAxis">colorAxis</a> is to be used.
    * @since 4.1.0
    */
  val treemap: js.UndefOr[CleanJsObject[PlotOptionsTreemap]] = js.undefined

  /**
    * Options for the waterfall series type.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/waterfall/" target="_blank">Waterfall chart</a>.

<a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/waterfall/" target="_blank">Waterfall in styled mode</a>.
    * @since 3.0
    */
  val waterfall: js.UndefOr[CleanJsObject[PlotOptionsWaterfall]] = js.undefined
}

object PlotOptions {
  /**
    * @param arearange The area range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
    * @param areasplinerange The area spline range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>.
    * @param boxplot A box plot is a convenient way of depicting groups of data through their five-number summaries: the smallest observation (sample minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest observation (sample maximum). 
    * @param bubble A bubble series is a three dimensional series type where each point renders an X, Y and Z value. Each points is drawn as a bubble where the position along the X and Y axes mark the X and Y values, and the size of the bubble relates to the Z value. Requires <code>highcharts-more.js</code>.
    * @param columnrange The column range is a cartesian series type with higher and lower Y values along an X axis. Requires <code>highcharts-more.js</code>. To display horizontal bars, set <a href="#chart.inverted">chart.inverted</a> to <code>true</code>.
    * @param errorbar Error bars are a graphical representation of the variability of data and are used on graphs to indicate the error, or uncertainty in a reported measurement. 
    * @param funnel Funnel charts are a type of chart often used to visualize stages in a sales project, where the top are the initial stages with the most clients. It requires that the <code>modules/funnel.js</code> file is loaded.
    * @param gauge General plotting options for the gauge series type. Requires <code>highcharts-more.js</code>
    * @param heatmap <p>The heatmap series type. This series type is available both in Highcharts and Highmaps.</p>. . <p>The colors of each heat map point is usually determined by its value and controlled by settings on the <a href="#colorAxis">colorAxis</a>.</p>
    * @param pie A pie chart is a circular chart divided into sectors, illustrating numerical proportion.
    * @param polygon A polygon series can be used to draw any freeform shape in the cartesian coordinate system. A fill is applied with the <code>color</code> option, and stroke is applied through <code>lineWidth</code> and <code>lineColor</code> options. Requires the <code>highcharts-more.js</code> file.
    * @param pyramid A pyramid chart consists of a single pyramid with item heights corresponding to each point value. Technically it is the same as a reversed funnel chart without a neck.
    * @param series <p>General options for all series types.</p>
    * @param solidgauge A gauge showing values using a filled arc with colors indicating the value. The solid gauge plots values against the <code>yAxis</code>, which is extended with some color options, <a href="#yAxis.minColor">minColor</a>, <a href="#yAxis.maxColor">maxColor</a> and <a href="#yAxis.stops">stops</a>, to control the color of the gauge itself.
    * @param treemap The size of the point shape is determined by its value relative to its siblings values.. Requires the module <code>heatmap.js</code> as well, if functionality such as the <a href="http://api.highcharts.com/highmaps#colorAxis">colorAxis</a> is to be used.
    * @param waterfall Options for the waterfall series type.
    */
  def apply(area: js.UndefOr[CleanJsObject[PlotOptionsArea]] = js.undefined, arearange: js.UndefOr[CleanJsObject[PlotOptionsArearange]] = js.undefined, areaspline: js.UndefOr[CleanJsObject[PlotOptionsAreaspline]] = js.undefined, areasplinerange: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerange]] = js.undefined, bar: js.UndefOr[CleanJsObject[PlotOptionsBar]] = js.undefined, boxplot: js.UndefOr[CleanJsObject[PlotOptionsBoxplot]] = js.undefined, bubble: js.UndefOr[CleanJsObject[PlotOptionsBubble]] = js.undefined, column: js.UndefOr[CleanJsObject[PlotOptionsColumn]] = js.undefined, columnrange: js.UndefOr[CleanJsObject[PlotOptionsColumnrange]] = js.undefined, errorbar: js.UndefOr[CleanJsObject[PlotOptionsErrorbar]] = js.undefined, funnel: js.UndefOr[CleanJsObject[PlotOptionsFunnel]] = js.undefined, gauge: js.UndefOr[CleanJsObject[PlotOptionsGauge]] = js.undefined, heatmap: js.UndefOr[CleanJsObject[PlotOptionsHeatmap]] = js.undefined, line: js.UndefOr[CleanJsObject[PlotOptionsLine]] = js.undefined, pie: js.UndefOr[CleanJsObject[PlotOptionsPie]] = js.undefined, polygon: js.UndefOr[CleanJsObject[PlotOptionsPolygon]] = js.undefined, pyramid: js.UndefOr[CleanJsObject[PlotOptionsPyramid]] = js.undefined, scatter: js.UndefOr[CleanJsObject[PlotOptionsScatter]] = js.undefined, series: js.UndefOr[CleanJsObject[PlotOptionsSeries]] = js.undefined, solidgauge: js.UndefOr[CleanJsObject[PlotOptionsSolidgauge]] = js.undefined, spline: js.UndefOr[CleanJsObject[PlotOptionsSpline]] = js.undefined, treemap: js.UndefOr[CleanJsObject[PlotOptionsTreemap]] = js.undefined, waterfall: js.UndefOr[CleanJsObject[PlotOptionsWaterfall]] = js.undefined): PlotOptions = {
    val areaOuter: js.UndefOr[CleanJsObject[PlotOptionsArea]] = area
    val arearangeOuter: js.UndefOr[CleanJsObject[PlotOptionsArearange]] = arearange
    val areasplineOuter: js.UndefOr[CleanJsObject[PlotOptionsAreaspline]] = areaspline
    val areasplinerangeOuter: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerange]] = areasplinerange
    val barOuter: js.UndefOr[CleanJsObject[PlotOptionsBar]] = bar
    val boxplotOuter: js.UndefOr[CleanJsObject[PlotOptionsBoxplot]] = boxplot
    val bubbleOuter: js.UndefOr[CleanJsObject[PlotOptionsBubble]] = bubble
    val columnOuter: js.UndefOr[CleanJsObject[PlotOptionsColumn]] = column
    val columnrangeOuter: js.UndefOr[CleanJsObject[PlotOptionsColumnrange]] = columnrange
    val errorbarOuter: js.UndefOr[CleanJsObject[PlotOptionsErrorbar]] = errorbar
    val funnelOuter: js.UndefOr[CleanJsObject[PlotOptionsFunnel]] = funnel
    val gaugeOuter: js.UndefOr[CleanJsObject[PlotOptionsGauge]] = gauge
    val heatmapOuter: js.UndefOr[CleanJsObject[PlotOptionsHeatmap]] = heatmap
    val lineOuter: js.UndefOr[CleanJsObject[PlotOptionsLine]] = line
    val pieOuter: js.UndefOr[CleanJsObject[PlotOptionsPie]] = pie
    val polygonOuter: js.UndefOr[CleanJsObject[PlotOptionsPolygon]] = polygon
    val pyramidOuter: js.UndefOr[CleanJsObject[PlotOptionsPyramid]] = pyramid
    val scatterOuter: js.UndefOr[CleanJsObject[PlotOptionsScatter]] = scatter
    val seriesOuter: js.UndefOr[CleanJsObject[PlotOptionsSeries]] = series
    val solidgaugeOuter: js.UndefOr[CleanJsObject[PlotOptionsSolidgauge]] = solidgauge
    val splineOuter: js.UndefOr[CleanJsObject[PlotOptionsSpline]] = spline
    val treemapOuter: js.UndefOr[CleanJsObject[PlotOptionsTreemap]] = treemap
    val waterfallOuter: js.UndefOr[CleanJsObject[PlotOptionsWaterfall]] = waterfall
    new PlotOptions {
      override val area: js.UndefOr[CleanJsObject[PlotOptionsArea]] = areaOuter
      override val arearange: js.UndefOr[CleanJsObject[PlotOptionsArearange]] = arearangeOuter
      override val areaspline: js.UndefOr[CleanJsObject[PlotOptionsAreaspline]] = areasplineOuter
      override val areasplinerange: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerange]] = areasplinerangeOuter
      override val bar: js.UndefOr[CleanJsObject[PlotOptionsBar]] = barOuter
      override val boxplot: js.UndefOr[CleanJsObject[PlotOptionsBoxplot]] = boxplotOuter
      override val bubble: js.UndefOr[CleanJsObject[PlotOptionsBubble]] = bubbleOuter
      override val column: js.UndefOr[CleanJsObject[PlotOptionsColumn]] = columnOuter
      override val columnrange: js.UndefOr[CleanJsObject[PlotOptionsColumnrange]] = columnrangeOuter
      override val errorbar: js.UndefOr[CleanJsObject[PlotOptionsErrorbar]] = errorbarOuter
      override val funnel: js.UndefOr[CleanJsObject[PlotOptionsFunnel]] = funnelOuter
      override val gauge: js.UndefOr[CleanJsObject[PlotOptionsGauge]] = gaugeOuter
      override val heatmap: js.UndefOr[CleanJsObject[PlotOptionsHeatmap]] = heatmapOuter
      override val line: js.UndefOr[CleanJsObject[PlotOptionsLine]] = lineOuter
      override val pie: js.UndefOr[CleanJsObject[PlotOptionsPie]] = pieOuter
      override val polygon: js.UndefOr[CleanJsObject[PlotOptionsPolygon]] = polygonOuter
      override val pyramid: js.UndefOr[CleanJsObject[PlotOptionsPyramid]] = pyramidOuter
      override val scatter: js.UndefOr[CleanJsObject[PlotOptionsScatter]] = scatterOuter
      override val series: js.UndefOr[CleanJsObject[PlotOptionsSeries]] = seriesOuter
      override val solidgauge: js.UndefOr[CleanJsObject[PlotOptionsSolidgauge]] = solidgaugeOuter
      override val spline: js.UndefOr[CleanJsObject[PlotOptionsSpline]] = splineOuter
      override val treemap: js.UndefOr[CleanJsObject[PlotOptionsTreemap]] = treemapOuter
      override val waterfall: js.UndefOr[CleanJsObject[PlotOptionsWaterfall]] = waterfallOuter
    }
  }
}
