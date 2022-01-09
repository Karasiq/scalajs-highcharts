/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;gantt&gt;-data</code>
  */
class SeriesGanttData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Whether the grid node belonging to this point should start as collapsed. Used
    * in axes of type treegrid.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/treegrid-axis/collapsed/">Start as collapsed</a>
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Progress indicator, how much of the task completed. If it is a number, the
    * <code>fill</code> will be applied automatically.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/demo/progress-indicator">Progress indicator</a>
    */
  var completed: js.UndefOr[Double | js.Any] = js.undefined

  /**
    * <p>The ID of the point (task) that this point depends on in Gantt charts.
    * Aliases <a href="series.xrange.data.connect">connect</a>. Can also be an object,
    * specifying further connecting <a href="series.gantt.connectors">options</a> between the
    * points. Multiple connections can be specified by providing an array.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/demo/project-management">Dependencies</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/pathfinder/demo">Different connection types</a>
    * @since 6.2.0
    */
  var dependency: js.UndefOr[String | js.Array[SeriesGanttDataDependency] | js.Any] = js.undefined

  /**
    * <p>The end time of a task.</p>
    */
  var end: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether this point is a milestone. If so, only the <code>start</code> option is handled,
    * while <code>end</code> is ignored.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/gantt/milestones">Milestones</a>
    * @since 6.2.0
    */
  var milestone: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The name of a task. If a <code>treegrid</code> y-axis is used (default in Gantt charts),
    * this will be picked up automatically, and used to calculate the y-value.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-objects/">Point names</a>
    */
  var name: js.UndefOr[String] = js.undefined

  /**
    * <p>The ID of the parent point (task) of this point in Gantt charts.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/demo/subtasks">Gantt chart with subtasks</a>
    * @since 6.2.0
    */
  var parent: js.UndefOr[String] = js.undefined

  /**
    * <p>The start time of a task.</p>
    */
  var start: js.UndefOr[Double] = js.undefined

  /**
    * <p>The Y value of a task.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/x-range">X-range</a>
    */
  var y: js.UndefOr[Double] = js.undefined

  /**
    * <p>Accessibility options for a data point.</p>
    * @since 7.1.0
    */
  var accessibility: js.Any = js.undefined

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
  var dragDrop: js.UndefOr[CleanJsObject[SeriesGanttDataDragDrop]] = js.undefined

  /**
    * <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to
    * use for a drilldown for this point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/basic/">Basic drilldown</a>
    * @since 3.0.8
    */
  var drilldown: js.UndefOr[String] = js.undefined

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
  var marker: js.UndefOr[CleanJsObject[SeriesGanttDataMarker]] = js.undefined
}

object SeriesGanttData {
  /**
    * @param collapsed <p>Whether the grid node belonging to this point should start as collapsed. Used. in axes of type treegrid.</p>
    * @param completed <p>Progress indicator, how much of the task completed. If it is a number, the. <code>fill</code> will be applied automatically.</p>
    * @param dependency <p>The ID of the point (task) that this point depends on in Gantt charts.. Aliases <a href="series.xrange.data.connect">connect</a>. Can also be an object,. specifying further connecting <a href="series.gantt.connectors">options</a> between the. points. Multiple connections can be specified by providing an array.</p>
    * @param end <p>The end time of a task.</p>
    * @param milestone <p>Whether this point is a milestone. If so, only the <code>start</code> option is handled,. while <code>end</code> is ignored.</p>
    * @param name <p>The name of a task. If a <code>treegrid</code> y-axis is used (default in Gantt charts),. this will be picked up automatically, and used to calculate the y-value.</p>
    * @param parent <p>The ID of the parent point (task) of this point in Gantt charts.</p>
    * @param start <p>The start time of a task.</p>
    * @param y <p>The Y value of a task.</p>
    * @param accessibility <p>Accessibility options for a data point.</p>
    * @param color <p>Individual color for the point. By default the color is pulled from. the global <code>colors</code> array.</p>. <p>In styled mode, the <code>color</code> option doesn&#39;t take effect. Instead, use. <code>colorIndex</code>.</p>
    * @param colorIndex <p>A specific color index to use for the point, so its graphic representations. are given the class name <code>highcharts-color-{n}</code>. In styled mode this will. change the color of the graphic. In non-styled mode, the color by is set by. the <code>fill</code> attribute, so the change in class name won&#39;t have a visual effect. by default.</p>
    * @param custom <p>A reserved subspace to store options and values for customized functionality.. Here you can add additional data for your own event callbacks and formatter. callbacks.</p>
    * @param description <p>A description of the point to add to the screen reader information. about the point.</p>
    * @param dragDrop <p>Point specific options for the draggable-points module. Overrides options on. <code>series.dragDrop</code>.</p>
    * @param drilldown <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to. use for a drilldown for this point.</p>
    * @param id <p>An id for the point. This can be used after render time to get a. pointer to the point object through <code>chart.get()</code>.</p>
    * @param labelrank <p>The rank for this point&#39;s data label in case of collision. If two. data labels are about to overlap, only the one with the highest <code>labelrank</code>. will be drawn.</p>
    * @param marker <p>Options for the point markers of line-like series.</p>
    */
  def apply(collapsed: js.UndefOr[Boolean] = js.undefined, completed: js.UndefOr[Double | js.Any] = js.undefined, dependency: js.UndefOr[String | js.Array[SeriesGanttDataDependency] | js.Any] = js.undefined, end: js.UndefOr[Double] = js.undefined, milestone: js.UndefOr[Boolean] = js.undefined, name: js.UndefOr[String] = js.undefined, parent: js.UndefOr[String] = js.undefined, start: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, accessibility: js.UndefOr[js.Any] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, custom: js.UndefOr[js.Object] = js.undefined, description: js.UndefOr[String] = js.undefined, dragDrop: js.UndefOr[CleanJsObject[SeriesGanttDataDragDrop]] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, id: js.UndefOr[String] = js.undefined, labelrank: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[CleanJsObject[SeriesGanttDataMarker]] = js.undefined): SeriesGanttData = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesGanttData {
      this.collapsed = collapsed
      this.completed = completed
      this.dependency = dependency
      this.end = end
      this.milestone = milestone
      this.name = name
      this.parent = parent
      this.start = start
      this.y = y
      this.accessibility = accessibility
      this.color = color
      this.colorIndex = colorIndex
      this.custom = custom
      this.description = description
      this.dragDrop = dragDrop
      this.drilldown = drilldown
      this.id = id
      this.labelrank = labelrank
      this.marker = marker
    })
  }
}
