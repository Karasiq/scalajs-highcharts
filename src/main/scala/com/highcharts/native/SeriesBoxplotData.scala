/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;boxplot&gt;-data</code>
  */
class SeriesBoxplotData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The dash style of the box.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a>
    * @since 8.1.0
    */
  var boxDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>The <code>high</code> value for each data point, signifying the highest value
    * in the sample set. The top whisker is drawn here.</p>
    */
  var high: js.UndefOr[Double] = js.undefined

  /**
    * <p>The <code>low</code> value for each data point, signifying the lowest value
    * in the sample set. The bottom whisker is drawn here.</p>
    */
  var low: js.UndefOr[Double] = js.undefined

  /**
    * <p>The median for each data point. This is drawn as a line through the
    * middle area of the box.</p>
    */
  var median: js.UndefOr[Double] = js.undefined

  /**
    * <p>The dash style of the median.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a>
    * @since 8.1.0
    */
  var medianDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>The lower quartile for each data point. This is the bottom of the
    * box.</p>
    */
  var q1: js.UndefOr[Double] = js.undefined

  /**
    * <p>The higher quartile for each data point. This is the top of the box.</p>
    */
  var q3: js.UndefOr[Double] = js.undefined

  /**
    * <p>The dash style of the stem.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a>
    * @since 8.1.0
    */
  var stemDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>The dash style of the whiskers.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a>
    * @since 8.1.0
    */
  var whiskerDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Accessibility options for a data point.</p>
    * @since 7.1.0
    */
  var accessibility: js.Any = js.undefined

  /**
    * <p>An additional, individual class name for the data point&#39;s graphic
    * representation.</p>
    * @since 5.0.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>Individual color for the point. By default the color is pulled from
    * the global <code>colors</code> array.</p>
    * <p>In styled mode, the <code>color</code> option doesn&#39;t take effect. Instead, use
    * <code>colorIndex</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/color/">Mark the highest point</a>
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>A specific color index to use for the point, so its graphic representations
    * are given the class name <code>highcharts-color-{n}</code>. In styled mode this will
    * change the color of the graphic. In non-styled mode, the color by is set by
    * the <code>fill</code> attribute, so the change in class name won&#39;t have a visual effect
    * by default.</p>
    * @since 5.0.0
    */
  var colorIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>A reserved subspace to store options and values for customized functionality.
    * Here you can add additional data for your own event callbacks and formatter
    * callbacks.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/custom/">Point and series with custom data</a>
    */
  var custom: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Individual data label for each point. The options are the same as
    * the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/datalabels/">Show a label for the last value</a>
    */
  var dataLabels: js.UndefOr[CleanJsObject[SeriesBoxplotDataDataLabels]] = js.undefined

  /**
    * <p>A description of the point to add to the screen reader information
    * about the point.</p>
    * @since 5.0.0
    */
  var description: js.UndefOr[String] = js.undefined

  /**
    * <p>Point specific options for the draggable-points module. Overrides options on
    * <code>series.dragDrop</code>.</p>
    * @since 6.2.0
    */
  var dragDrop: js.UndefOr[CleanJsObject[SeriesBoxplotDataDragDrop]] = js.undefined

  /**
    * <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to
    * use for a drilldown for this point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/basic/">Basic drilldown</a>
    * @since 3.0.8
    */
  var drilldown: js.UndefOr[String] = js.undefined

  /**
    * <p>The individual point events.</p>
    */
  var events: js.UndefOr[CleanJsObject[SeriesBoxplotDataEvents]] = js.undefined

  /**
    * <p>An id for the point. This can be used after render time to get a
    * pointer to the point object through <code>chart.get()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/id/">Remove an id'd point</a>
    * @since 1.2.0
    */
  var id: js.UndefOr[String] = js.undefined

  /**
    * <p>The rank for this point&#39;s data label in case of collision. If two
    * data labels are about to overlap, only the one with the highest <code>labelrank</code>
    * will be drawn.</p>
    */
  var labelrank: js.UndefOr[Double] = js.undefined

  /**
    * <p>The name of the point as shown in the legend, tooltip, dataLabels, etc.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-objects/">Point names</a>
    */
  var name: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether the data point is selected initially.</p>
    */
  var selected: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The x value of the point. For datetime axes, the X value is the timestamp
    * in milliseconds since 1970.</p>
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y value of the point.</p>
    */
  var y: js.UndefOr[Double | Null] = js.undefined
}

object SeriesBoxplotData {
  /**
    * @param boxDashStyle <p>The dash style of the box.</p>
    * @param high <p>The <code>high</code> value for each data point, signifying the highest value. in the sample set. The top whisker is drawn here.</p>
    * @param low <p>The <code>low</code> value for each data point, signifying the lowest value. in the sample set. The bottom whisker is drawn here.</p>
    * @param median <p>The median for each data point. This is drawn as a line through the. middle area of the box.</p>
    * @param medianDashStyle <p>The dash style of the median.</p>
    * @param q1 <p>The lower quartile for each data point. This is the bottom of the. box.</p>
    * @param q3 <p>The higher quartile for each data point. This is the top of the box.</p>
    * @param stemDashStyle <p>The dash style of the stem.</p>
    * @param whiskerDashStyle <p>The dash style of the whiskers.</p>
    * @param accessibility <p>Accessibility options for a data point.</p>
    * @param className <p>An additional, individual class name for the data point&#39;s graphic. representation.</p>
    * @param color <p>Individual color for the point. By default the color is pulled from. the global <code>colors</code> array.</p>. <p>In styled mode, the <code>color</code> option doesn&#39;t take effect. Instead, use. <code>colorIndex</code>.</p>
    * @param colorIndex <p>A specific color index to use for the point, so its graphic representations. are given the class name <code>highcharts-color-{n}</code>. In styled mode this will. change the color of the graphic. In non-styled mode, the color by is set by. the <code>fill</code> attribute, so the change in class name won&#39;t have a visual effect. by default.</p>
    * @param custom <p>A reserved subspace to store options and values for customized functionality.. Here you can add additional data for your own event callbacks and formatter. callbacks.</p>
    * @param dataLabels <p>Individual data label for each point. The options are the same as. the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @param description <p>A description of the point to add to the screen reader information. about the point.</p>
    * @param dragDrop <p>Point specific options for the draggable-points module. Overrides options on. <code>series.dragDrop</code>.</p>
    * @param drilldown <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to. use for a drilldown for this point.</p>
    * @param events <p>The individual point events.</p>
    * @param id <p>An id for the point. This can be used after render time to get a. pointer to the point object through <code>chart.get()</code>.</p>
    * @param labelrank <p>The rank for this point&#39;s data label in case of collision. If two. data labels are about to overlap, only the one with the highest <code>labelrank</code>. will be drawn.</p>
    * @param name <p>The name of the point as shown in the legend, tooltip, dataLabels, etc.</p>
    * @param selected <p>Whether the data point is selected initially.</p>
    * @param x <p>The x value of the point. For datetime axes, the X value is the timestamp. in milliseconds since 1970.</p>
    * @param y <p>The y value of the point.</p>
    */
  def apply(boxDashStyle: js.UndefOr[String] = js.undefined, high: js.UndefOr[Double] = js.undefined, low: js.UndefOr[Double] = js.undefined, median: js.UndefOr[Double] = js.undefined, medianDashStyle: js.UndefOr[String] = js.undefined, q1: js.UndefOr[Double] = js.undefined, q3: js.UndefOr[Double] = js.undefined, stemDashStyle: js.UndefOr[String] = js.undefined, whiskerDashStyle: js.UndefOr[String] = js.undefined, accessibility: js.UndefOr[js.Any] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, custom: js.UndefOr[js.Object] = js.undefined, dataLabels: js.UndefOr[CleanJsObject[SeriesBoxplotDataDataLabels]] = js.undefined, description: js.UndefOr[String] = js.undefined, dragDrop: js.UndefOr[CleanJsObject[SeriesBoxplotDataDragDrop]] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesBoxplotDataEvents]] = js.undefined, id: js.UndefOr[String] = js.undefined, labelrank: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double | Null] = js.undefined): SeriesBoxplotData = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBoxplotData {
      this.boxDashStyle = boxDashStyle
      this.high = high
      this.low = low
      this.median = median
      this.medianDashStyle = medianDashStyle
      this.q1 = q1
      this.q3 = q3
      this.stemDashStyle = stemDashStyle
      this.whiskerDashStyle = whiskerDashStyle
      this.accessibility = accessibility
      this.className = className
      this.color = color
      this.colorIndex = colorIndex
      this.custom = custom
      this.dataLabels = dataLabels
      this.description = description
      this.dragDrop = dragDrop
      this.drilldown = drilldown
      this.events = events
      this.id = id
      this.labelrank = labelrank
      this.name = name
      this.selected = selected
      this.x = x
      this.y = y
    })
  }
}
