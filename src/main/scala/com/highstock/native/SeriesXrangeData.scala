/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;xrange&gt;-data</code>
  */
class SeriesXrangeData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Connect to a point. This option can be either a string, referring to the ID
    * of another point, or an object, or an array of either. If the option is an
    * array, each element defines a connection.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/pathfinder/demo">Different connection types</a>
    * @since 6.2.0
    */
  var connect: js.UndefOr[String | js.Array[SeriesXrangeDataConnect] | js.Any] = js.undefined

  /**
    * <p>A partial fill for each point, typically used to visualize how much of
    * a task is performed. The partial fill object can be set either on series
    * or point level.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/x-range">X-range with partial fill</a>
    */
  var partialFill: js.Any = js.undefined

  /**
    * <p>The starting X value of the range point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/x-range">X-range</a>
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The ending X value of the range point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/x-range">X-range</a>
    */
  var x2: js.UndefOr[Double] = js.undefined

  /**
    * <p>The Y value of the range point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/x-range">X-range</a>
    */
  var y: js.UndefOr[Double] = js.undefined

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
  var dataLabels: js.UndefOr[CleanJsObject[SeriesXrangeDataDataLabels]] = js.undefined

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
  var dragDrop: js.UndefOr[CleanJsObject[SeriesXrangeDataDragDrop]] = js.undefined

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
  var events: js.UndefOr[CleanJsObject[SeriesXrangeDataEvents]] = js.undefined

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
    * <p>Options for the point markers of line-like series.</p>
    */
  var marker: js.UndefOr[CleanJsObject[SeriesXrangeDataMarker]] = js.undefined

  /**
    * <p>The name of the point as shown in the legend, tooltip, dataLabels, etc.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-objects/">Point names</a>
    */
  var name: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether the data point is selected initially.</p>
    */
  var selected: js.UndefOr[Boolean] = js.undefined
}

object SeriesXrangeData {
  /**
    * @param connect <p>Connect to a point. This option can be either a string, referring to the ID. of another point, or an object, or an array of either. If the option is an. array, each element defines a connection.</p>
    * @param partialFill <p>A partial fill for each point, typically used to visualize how much of. a task is performed. The partial fill object can be set either on series. or point level.</p>
    * @param x <p>The starting X value of the range point.</p>
    * @param x2 <p>The ending X value of the range point.</p>
    * @param y <p>The Y value of the range point.</p>
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
    * @param marker <p>Options for the point markers of line-like series.</p>
    * @param name <p>The name of the point as shown in the legend, tooltip, dataLabels, etc.</p>
    * @param selected <p>Whether the data point is selected initially.</p>
    */
  def apply(connect: js.UndefOr[String | js.Array[SeriesXrangeDataConnect] | js.Any] = js.undefined, partialFill: js.UndefOr[js.Any] = js.undefined, x: js.UndefOr[Double] = js.undefined, x2: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, accessibility: js.UndefOr[js.Any] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, custom: js.UndefOr[js.Object] = js.undefined, dataLabels: js.UndefOr[CleanJsObject[SeriesXrangeDataDataLabels]] = js.undefined, description: js.UndefOr[String] = js.undefined, dragDrop: js.UndefOr[CleanJsObject[SeriesXrangeDataDragDrop]] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesXrangeDataEvents]] = js.undefined, id: js.UndefOr[String] = js.undefined, labelrank: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[CleanJsObject[SeriesXrangeDataMarker]] = js.undefined, name: js.UndefOr[String] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined): SeriesXrangeData = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesXrangeData {
      this.connect = connect
      this.partialFill = partialFill
      this.x = x
      this.x2 = x2
      this.y = y
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
      this.marker = marker
      this.name = name
      this.selected = selected
    })
  }
}
