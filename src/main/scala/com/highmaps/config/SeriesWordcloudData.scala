/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;wordcloud&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesWordcloudData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Point specific options for the draggable-points module. Overrides options on
    * <code>series.dragDrop</code>.</p>
    * <p>Requires the <code>draggable-points</code> module.</p>
    * @since 6.2.0
    */
  val dragDrop: js.UndefOr[CleanJsObject[SeriesWordcloudDataDragDrop]] = js.undefined

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
    * <p>The name of the point as shown in the legend, tooltip, dataLabel
    * etc.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-objects/">Point names</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether the data point is selected initially.</p>
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Individual point events</p>
    */
  val events: js.UndefOr[CleanJsObject[SeriesWordcloudDataEvents]] = js.undefined
}

object SeriesWordcloudData {
  /**
    * @param dragDrop <p>Point specific options for the draggable-points module. Overrides options on. <code>series.dragDrop</code>.</p>. <p>Requires the <code>draggable-points</code> module.</p>
    * @param className <p>An additional, individual class name for the data point&#39;s graphic. representation.</p>
    * @param color <p>Individual color for the point. By default the color is pulled from. the global <code>colors</code> array.</p>. <p>In styled mode, the <code>color</code> option doesn&#39;t take effect. Instead, use. <code>colorIndex</code>.</p>
    * @param colorIndex <p>A specific color index to use for the point, so its graphic representations. are given the class name <code>highcharts-color-{n}</code>. In styled mode this will. change the color of the graphic. In non-styled mode, the color by is set by. the <code>fill</code> attribute, so the change in class name won&#39;t have a visual effect. by default.</p>
    * @param dataLabels <p>Individual data label for each point. The options are the same as. the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @param description <p>A description of the point to add to the screen reader information. about the point. Requires the Accessibility module.</p>
    * @param id <p>An id for the point. This can be used after render time to get a. pointer to the point object through <code>chart.get()</code>.</p>
    * @param labelrank <p>The rank for this point&#39;s data label in case of collision. If two. data labels are about to overlap, only the one with the highest <code>labelrank</code>. will be drawn.</p>
    * @param name <p>The name of the point as shown in the legend, tooltip, dataLabel. etc.</p>
    * @param selected <p>Whether the data point is selected initially.</p>
    * @param events <p>Individual point events</p>
    */
  def apply(dragDrop: js.UndefOr[CleanJsObject[SeriesWordcloudDataDragDrop]] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, dataLabels: js.UndefOr[js.Any] = js.undefined, description: js.UndefOr[String] = js.undefined, id: js.UndefOr[String] = js.undefined, labelrank: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesWordcloudDataEvents]] = js.undefined): SeriesWordcloudData = {
    val dragDropOuter: js.UndefOr[CleanJsObject[SeriesWordcloudDataDragDrop]] = dragDrop
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val colorIndexOuter: js.UndefOr[Double] = colorIndex
    val dataLabelsOuter: js.Any = dataLabels
    val descriptionOuter: js.UndefOr[String] = description
    val idOuter: js.UndefOr[String] = id
    val labelrankOuter: js.UndefOr[Double] = labelrank
    val nameOuter: js.UndefOr[String] = name
    val selectedOuter: js.UndefOr[Boolean] = selected
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesWordcloudDataEvents]] = events
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesWordcloudData {
      override val dragDrop: js.UndefOr[CleanJsObject[SeriesWordcloudDataDragDrop]] = dragDropOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val colorIndex: js.UndefOr[Double] = colorIndexOuter
      override val dataLabels: js.Any = dataLabelsOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val id: js.UndefOr[String] = idOuter
      override val labelrank: js.UndefOr[Double] = labelrankOuter
      override val name: js.UndefOr[String] = nameOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val events: js.UndefOr[CleanJsObject[SeriesWordcloudDataEvents]] = eventsOuter
    })
  }
}
