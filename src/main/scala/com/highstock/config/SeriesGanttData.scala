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
  * @note JavaScript name: <code>series&lt;gantt&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesGanttData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Whether the grid node belonging to this point should start as collapsed. Used
    * in axes of type treegrid.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/treegrid-axis/collapsed/">Start as collapsed</a>
    */
  val collapsed: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The start time of a task.</p>
    */
  val start: js.UndefOr[Double] = js.undefined

  /**
    * <p>The end time of a task.</p>
    */
  val end: js.UndefOr[Double] = js.undefined

  /**
    * <p>The Y value of a task.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/x-range">X-range</a>
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * <p>The name of a task. If a <code>treegrid</code> y-axis is used (default in Gantt charts),
    * this will be picked up automatically, and used to calculate the y-value.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-objects/">Point names</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * <p>Progress indicator, how much of the task completed. If it is a number, the
    * <code>fill</code> will be applied automatically.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/demo/progress-indicator">Progress indicator</a>
    */
  val completed: js.UndefOr[js.Object | Double] = js.undefined

  /**
    * <p>The ID of the point (task) that this point depends on in Gantt charts.
    * Aliases <a href="series.xrange.data.connect">connect</a>. Can also be an object,
    * specifying further connecting <a href="series.gantt.pathfinder">options</a> between the
    * points. Multiple connections can be specified by providing an array.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/demo/project-management">Dependencies</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/pathfinder/demo">Different connection types</a>
    * @since 6.2.0
    */
  val dependency: js.UndefOr[String | js.Any] = js.undefined

  /**
    * <p>Whether this point is a milestone. If so, only the <code>start</code> option is handled,
    * while <code>end</code> is ignored.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/gantt/milestones">Milestones</a>
    * @since 6.2.0
    */
  val milestone: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The ID of the parent point (task) of this point in Gantt charts.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/demo/subtasks">Gantt chart with subtasks</a>
    * @since 6.2.0
    */
  val parent: js.UndefOr[String] = js.undefined

  /**
    * <p>Point specific options for the draggable-points module. Overrides options on
    * <code>series.dragDrop</code>.</p>
    * <p>Requires the <code>draggable-points</code> module.</p>
    * @since 6.2.0
    */
  val dragDrop: js.UndefOr[CleanJsObject[SeriesGanttDataDragDrop]] = js.undefined

  /**
    * <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a>
    * array to use for a drilldown for this point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/basic/">Basic drilldown</a>
    * @since 3.0.8
    */
  val drilldown: js.UndefOr[String] = js.undefined

  /**
    * <p>An additional, individual class name for the data point&#39;s graphic
    * representation.</p>
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * <p>Individual color for the point. By default the color is pulled from
    * the global <code>colors</code> array.</p>
    * <p>In styled mode, the <code>color</code> option doesn&#39;t take effect. Instead, use
    * <code>colorIndex</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/color/">Mark the highest point</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>A specific color index to use for the point, so its graphic representations
    * are given the class name <code>highcharts-color-{n}</code>. In styled mode this will
    * change the color of the graphic. In non-styled mode, the color by is set by
    * the <code>fill</code> attribute, so the change in class name won&#39;t have a visual effect
    * by default.</p>
    * @since 5.0.0
    */
  val colorIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>Individual data label for each point. The options are the same as
    * the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/datalabels/">Show a label for the last value</a>
    */
  val dataLabels: js.Any = js.undefined

  /**
    * <p>A description of the point to add to the screen reader information
    * about the point. Requires the Accessibility module.</p>
    * @since 5.0.0
    */
  val description: js.UndefOr[String] = js.undefined

  /**
    * <p>An id for the point. This can be used after render time to get a
    * pointer to the point object through <code>chart.get()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/id/">Remove an id'd point</a>
    * @since 1.2.0
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * <p>The rank for this point&#39;s data label in case of collision. If two
    * data labels are about to overlap, only the one with the highest <code>labelrank</code>
    * will be drawn.</p>
    */
  val labelrank: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether the data point is selected initially.</p>
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Individual point events</p>
    */
  val events: js.UndefOr[CleanJsObject[SeriesGanttDataEvents]] = js.undefined

  val marker: js.UndefOr[CleanJsObject[SeriesGanttDataMarker]] = js.undefined
}

object SeriesGanttData {
  /**
    * @param collapsed <p>Whether the grid node belonging to this point should start as collapsed. Used. in axes of type treegrid.</p>
    * @param start <p>The start time of a task.</p>
    * @param end <p>The end time of a task.</p>
    * @param y <p>The Y value of a task.</p>
    * @param name <p>The name of a task. If a <code>treegrid</code> y-axis is used (default in Gantt charts),. this will be picked up automatically, and used to calculate the y-value.</p>
    * @param completed <p>Progress indicator, how much of the task completed. If it is a number, the. <code>fill</code> will be applied automatically.</p>
    * @param dependency <p>The ID of the point (task) that this point depends on in Gantt charts.. Aliases <a href="series.xrange.data.connect">connect</a>. Can also be an object,. specifying further connecting <a href="series.gantt.pathfinder">options</a> between the. points. Multiple connections can be specified by providing an array.</p>
    * @param milestone <p>Whether this point is a milestone. If so, only the <code>start</code> option is handled,. while <code>end</code> is ignored.</p>
    * @param parent <p>The ID of the parent point (task) of this point in Gantt charts.</p>
    * @param dragDrop <p>Point specific options for the draggable-points module. Overrides options on. <code>series.dragDrop</code>.</p>. <p>Requires the <code>draggable-points</code> module.</p>
    * @param drilldown <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a>. array to use for a drilldown for this point.</p>
    * @param className <p>An additional, individual class name for the data point&#39;s graphic. representation.</p>
    * @param color <p>Individual color for the point. By default the color is pulled from. the global <code>colors</code> array.</p>. <p>In styled mode, the <code>color</code> option doesn&#39;t take effect. Instead, use. <code>colorIndex</code>.</p>
    * @param colorIndex <p>A specific color index to use for the point, so its graphic representations. are given the class name <code>highcharts-color-{n}</code>. In styled mode this will. change the color of the graphic. In non-styled mode, the color by is set by. the <code>fill</code> attribute, so the change in class name won&#39;t have a visual effect. by default.</p>
    * @param dataLabels <p>Individual data label for each point. The options are the same as. the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @param description <p>A description of the point to add to the screen reader information. about the point. Requires the Accessibility module.</p>
    * @param id <p>An id for the point. This can be used after render time to get a. pointer to the point object through <code>chart.get()</code>.</p>
    * @param labelrank <p>The rank for this point&#39;s data label in case of collision. If two. data labels are about to overlap, only the one with the highest <code>labelrank</code>. will be drawn.</p>
    * @param selected <p>Whether the data point is selected initially.</p>
    * @param events <p>Individual point events</p>
    */
  def apply(collapsed: js.UndefOr[Boolean] = js.undefined, start: js.UndefOr[Double] = js.undefined, end: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, completed: js.UndefOr[js.Object | Double] = js.undefined, dependency: js.UndefOr[String | js.Any] = js.undefined, milestone: js.UndefOr[Boolean] = js.undefined, parent: js.UndefOr[String] = js.undefined, dragDrop: js.UndefOr[CleanJsObject[SeriesGanttDataDragDrop]] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, dataLabels: js.UndefOr[js.Any] = js.undefined, description: js.UndefOr[String] = js.undefined, id: js.UndefOr[String] = js.undefined, labelrank: js.UndefOr[Double] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesGanttDataEvents]] = js.undefined, marker: js.UndefOr[CleanJsObject[SeriesGanttDataMarker]] = js.undefined): SeriesGanttData = {
    val collapsedOuter: js.UndefOr[Boolean] = collapsed
    val startOuter: js.UndefOr[Double] = start
    val endOuter: js.UndefOr[Double] = end
    val yOuter: js.UndefOr[Double] = y
    val nameOuter: js.UndefOr[String] = name
    val completedOuter: js.UndefOr[js.Object | Double] = completed
    val dependencyOuter: js.UndefOr[String | js.Any] = dependency
    val milestoneOuter: js.UndefOr[Boolean] = milestone
    val parentOuter: js.UndefOr[String] = parent
    val dragDropOuter: js.UndefOr[CleanJsObject[SeriesGanttDataDragDrop]] = dragDrop
    val drilldownOuter: js.UndefOr[String] = drilldown
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val colorIndexOuter: js.UndefOr[Double] = colorIndex
    val dataLabelsOuter: js.Any = dataLabels
    val descriptionOuter: js.UndefOr[String] = description
    val idOuter: js.UndefOr[String] = id
    val labelrankOuter: js.UndefOr[Double] = labelrank
    val selectedOuter: js.UndefOr[Boolean] = selected
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesGanttDataEvents]] = events
    val markerOuter: js.UndefOr[CleanJsObject[SeriesGanttDataMarker]] = marker
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesGanttData {
      override val collapsed: js.UndefOr[Boolean] = collapsedOuter
      override val start: js.UndefOr[Double] = startOuter
      override val end: js.UndefOr[Double] = endOuter
      override val y: js.UndefOr[Double] = yOuter
      override val name: js.UndefOr[String] = nameOuter
      override val completed: js.UndefOr[js.Object | Double] = completedOuter
      override val dependency: js.UndefOr[String | js.Any] = dependencyOuter
      override val milestone: js.UndefOr[Boolean] = milestoneOuter
      override val parent: js.UndefOr[String] = parentOuter
      override val dragDrop: js.UndefOr[CleanJsObject[SeriesGanttDataDragDrop]] = dragDropOuter
      override val drilldown: js.UndefOr[String] = drilldownOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val colorIndex: js.UndefOr[Double] = colorIndexOuter
      override val dataLabels: js.Any = dataLabelsOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val id: js.UndefOr[String] = idOuter
      override val labelrank: js.UndefOr[Double] = labelrankOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val events: js.UndefOr[CleanJsObject[SeriesGanttDataEvents]] = eventsOuter
      override val marker: js.UndefOr[CleanJsObject[SeriesGanttDataMarker]] = markerOuter
    })
  }
}
