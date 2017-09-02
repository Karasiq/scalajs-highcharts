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
  * @note JavaScript name: <code>series&lt;boxplot&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBoxplotData extends js.Object {

  /**
    * An additional, individual class name for the data point's graphic representation.
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * Individual color for the point. By default the color is pulled from the global <code>colors</code> array.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/color/" target="_blank">Mark the highest point</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">Styled mode</a> only. A specific color index to use for the point, so its graphic representations are given the class name <code>highcharts-color-{n}</code>.
    * @since 5.0.0
    */
  val colorIndex: js.UndefOr[Double] = js.undefined

  /**
    * Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/datalabels/" target="_blank">Show a label for the last value</a>
    */
  val dataLabels: js.UndefOr[js.Object] = js.undefined

  /**
    * <p><i>Requires Accessibility module</i></p>
    * <p>A description of the point to add to the screen reader information about the point.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/accessibility/accessible-map/">Accessible map</a>
    * @since 5.0.0
    */
  val description: js.UndefOr[String] = js.undefined

  /**
    * The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to use for a drilldown for this point.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/basic/" target="_blank">Basic drilldown</a>
    * @since 3.0.8
    */
  val drilldown: js.UndefOr[String] = js.undefined

  /**
    * Individual point events
    */
  val events: js.UndefOr[CleanJsObject[SeriesBoxplotDataEvents]] = js.undefined

  /**
    * The <code>high</code> value for each data point, signifying the highest value in the sample set. The top whisker is drawn here.
    */
  val high: js.UndefOr[Double] = js.undefined

  /**
    * An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/id/" target="_blank">Remove an id'd point</a>
    * @since 1.2.0
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The rank for this point's data label in case of collision. If two data labels are about to overlap, only the one with the highest <code>labelrank</code> will be drawn.
    */
  val labelrank: js.UndefOr[Double] = js.undefined

  /**
    * The <code>low</code> value for each data point, signifying the lowest value in the sample set. The bottom whisker is drawn here.
    */
  val low: js.UndefOr[Double] = js.undefined

  /**
    * The median for each data point. This is drawn as a line through the middle area of the box.
    */
  val median: js.UndefOr[Double] = js.undefined

  /**
    * <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>
    * 
    * <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-objects/" target="_blank">Point names</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * The lower quartile for each data point. This is the bottom of the box.
    */
  val q1: js.UndefOr[Double] = js.undefined

  /**
    * The higher quartile for each data point. This is the top of the box.
    */
  val q3: js.UndefOr[Double] = js.undefined

  /**
    * Whether the data point is selected initially.
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The y value of the point.
    */
  val y: js.UndefOr[Double] = js.undefined
}

object SeriesBoxplotData {
  /**
    * @param className An additional, individual class name for the data point's graphic representation.
    * @param color Individual color for the point. By default the color is pulled from the global <code>colors</code> array.
    * @param colorIndex <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">Styled mode</a> only. A specific color index to use for the point, so its graphic representations are given the class name <code>highcharts-color-{n}</code>.
    * @param dataLabels Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @param description <p><i>Requires Accessibility module</i></p>. <p>A description of the point to add to the screen reader information about the point.</p>
    * @param drilldown The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to use for a drilldown for this point.
    * @param events Individual point events
    * @param high The <code>high</code> value for each data point, signifying the highest value in the sample set. The top whisker is drawn here.
    * @param id An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param labelrank The rank for this point's data label in case of collision. If two data labels are about to overlap, only the one with the highest <code>labelrank</code> will be drawn.
    * @param low The <code>low</code> value for each data point, signifying the lowest value in the sample set. The bottom whisker is drawn here.
    * @param median The median for each data point. This is drawn as a line through the middle area of the box.
    * @param name <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>. . <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
    * @param q1 The lower quartile for each data point. This is the bottom of the box.
    * @param q3 The higher quartile for each data point. This is the top of the box.
    * @param selected Whether the data point is selected initially.
    * @param x The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
    * @param y The y value of the point.
    */
  def apply(className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, description: js.UndefOr[String] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesBoxplotDataEvents]] = js.undefined, high: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, labelrank: js.UndefOr[Double] = js.undefined, low: js.UndefOr[Double] = js.undefined, median: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, q1: js.UndefOr[Double] = js.undefined, q3: js.UndefOr[Double] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): SeriesBoxplotData = {
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val colorIndexOuter: js.UndefOr[Double] = colorIndex
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val descriptionOuter: js.UndefOr[String] = description
    val drilldownOuter: js.UndefOr[String] = drilldown
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesBoxplotDataEvents]] = events
    val highOuter: js.UndefOr[Double] = high
    val idOuter: js.UndefOr[String] = id
    val labelrankOuter: js.UndefOr[Double] = labelrank
    val lowOuter: js.UndefOr[Double] = low
    val medianOuter: js.UndefOr[Double] = median
    val nameOuter: js.UndefOr[String] = name
    val q1Outer: js.UndefOr[Double] = q1
    val q3Outer: js.UndefOr[Double] = q3
    val selectedOuter: js.UndefOr[Boolean] = selected
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new SeriesBoxplotData {
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val colorIndex: js.UndefOr[Double] = colorIndexOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val drilldown: js.UndefOr[String] = drilldownOuter
      override val events: js.UndefOr[CleanJsObject[SeriesBoxplotDataEvents]] = eventsOuter
      override val high: js.UndefOr[Double] = highOuter
      override val id: js.UndefOr[String] = idOuter
      override val labelrank: js.UndefOr[Double] = labelrankOuter
      override val low: js.UndefOr[Double] = lowOuter
      override val median: js.UndefOr[Double] = medianOuter
      override val name: js.UndefOr[String] = nameOuter
      override val q1: js.UndefOr[Double] = q1Outer
      override val q3: js.UndefOr[Double] = q3Outer
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
