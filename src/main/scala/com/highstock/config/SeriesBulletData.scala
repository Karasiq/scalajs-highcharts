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
  * @note JavaScript name: <code>series&lt;bullet&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBulletData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The target value of a point.</p>
    * @since 6.0.0
    */
  val target: js.UndefOr[Double] = js.undefined

  /**
    * <p>Individual target options for each point.</p>
    * @since 6.0.0
    */
  val targetOptions: js.UndefOr[CleanJsObject[SeriesBulletDataTargetOptions]] = js.undefined

  /**
    * <p>The color of the border surrounding the column or bar.</p>
    * <p>In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
    * rule.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-bordercolor/">Dark gray border</a>
    * @since 6.0.0
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the border surrounding the column or bar.</p>
    * <p>In styled mode, the stroke width can be set with the <code>.highcharts-point</code>
    * rule.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-borderwidth/">2px black border</a>
    * @since 6.0.0
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>A pixel value specifying a fixed width for the column or bar. Overrides
    * pointWidth on the series.</p>
    * @since 7.0.0
    */
  val pointWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Point specific options for the draggable-points module. Overrides options on
    * <code>series.dragDrop</code>.</p>
    * <p>Requires the <code>draggable-points</code> module.</p>
    * @since 6.2.0
    */
  val dragDrop: js.UndefOr[CleanJsObject[SeriesBulletDataDragDrop]] = js.undefined

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
    * @since 6.0.0
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
    * @since 6.0.0
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
    * @since 6.0.0
    */
  val labelrank: js.UndefOr[Double] = js.undefined

  /**
    * <p>The name of the point as shown in the legend, tooltip, dataLabel
    * etc.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-objects/">Point names</a>
    * @since 6.0.0
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether the data point is selected initially.</p>
    * @since 6.0.0
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The x value of the point. For datetime axes, the X value is the timestamp
    * in milliseconds since 1970.</p>
    * @since 6.0.0
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y value of the point.</p>
    * @since 6.0.0
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * <p>Individual point events</p>
    * @since 6.0.0
    */
  val events: js.UndefOr[CleanJsObject[SeriesBulletDataEvents]] = js.undefined
}

object SeriesBulletData {
  /**
    * @param target <p>The target value of a point.</p>
    * @param targetOptions <p>Individual target options for each point.</p>
    * @param borderColor <p>The color of the border surrounding the column or bar.</p>. <p>In styled mode, the border stroke can be set with the <code>.highcharts-point</code>. rule.</p>
    * @param borderWidth <p>The width of the border surrounding the column or bar.</p>. <p>In styled mode, the stroke width can be set with the <code>.highcharts-point</code>. rule.</p>
    * @param pointWidth <p>A pixel value specifying a fixed width for the column or bar. Overrides. pointWidth on the series.</p>
    * @param dragDrop <p>Point specific options for the draggable-points module. Overrides options on. <code>series.dragDrop</code>.</p>. <p>Requires the <code>draggable-points</code> module.</p>
    * @param drilldown <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a>. array to use for a drilldown for this point.</p>
    * @param className <p>An additional, individual class name for the data point&#39;s graphic. representation.</p>
    * @param color <p>Individual color for the point. By default the color is pulled from. the global <code>colors</code> array.</p>. <p>In styled mode, the <code>color</code> option doesn&#39;t take effect. Instead, use. <code>colorIndex</code>.</p>
    * @param colorIndex <p>A specific color index to use for the point, so its graphic representations. are given the class name <code>highcharts-color-{n}</code>. In styled mode this will. change the color of the graphic. In non-styled mode, the color by is set by. the <code>fill</code> attribute, so the change in class name won&#39;t have a visual effect. by default.</p>
    * @param dataLabels <p>Individual data label for each point. The options are the same as. the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @param description <p>A description of the point to add to the screen reader information. about the point. Requires the Accessibility module.</p>
    * @param id <p>An id for the point. This can be used after render time to get a. pointer to the point object through <code>chart.get()</code>.</p>
    * @param labelrank <p>The rank for this point&#39;s data label in case of collision. If two. data labels are about to overlap, only the one with the highest <code>labelrank</code>. will be drawn.</p>
    * @param name <p>The name of the point as shown in the legend, tooltip, dataLabel. etc.</p>
    * @param selected <p>Whether the data point is selected initially.</p>
    * @param x <p>The x value of the point. For datetime axes, the X value is the timestamp. in milliseconds since 1970.</p>
    * @param y <p>The y value of the point.</p>
    * @param events <p>Individual point events</p>
    */
  def apply(target: js.UndefOr[Double] = js.undefined, targetOptions: js.UndefOr[CleanJsObject[SeriesBulletDataTargetOptions]] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, pointWidth: js.UndefOr[Double] = js.undefined, dragDrop: js.UndefOr[CleanJsObject[SeriesBulletDataDragDrop]] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, dataLabels: js.UndefOr[js.Any] = js.undefined, description: js.UndefOr[String] = js.undefined, id: js.UndefOr[String] = js.undefined, labelrank: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesBulletDataEvents]] = js.undefined): SeriesBulletData = {
    val targetOuter: js.UndefOr[Double] = target
    val targetOptionsOuter: js.UndefOr[CleanJsObject[SeriesBulletDataTargetOptions]] = targetOptions
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val pointWidthOuter: js.UndefOr[Double] = pointWidth
    val dragDropOuter: js.UndefOr[CleanJsObject[SeriesBulletDataDragDrop]] = dragDrop
    val drilldownOuter: js.UndefOr[String] = drilldown
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val colorIndexOuter: js.UndefOr[Double] = colorIndex
    val dataLabelsOuter: js.Any = dataLabels
    val descriptionOuter: js.UndefOr[String] = description
    val idOuter: js.UndefOr[String] = id
    val labelrankOuter: js.UndefOr[Double] = labelrank
    val nameOuter: js.UndefOr[String] = name
    val selectedOuter: js.UndefOr[Boolean] = selected
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesBulletDataEvents]] = events
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBulletData {
      override val target: js.UndefOr[Double] = targetOuter
      override val targetOptions: js.UndefOr[CleanJsObject[SeriesBulletDataTargetOptions]] = targetOptionsOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val pointWidth: js.UndefOr[Double] = pointWidthOuter
      override val dragDrop: js.UndefOr[CleanJsObject[SeriesBulletDataDragDrop]] = dragDropOuter
      override val drilldown: js.UndefOr[String] = drilldownOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val colorIndex: js.UndefOr[Double] = colorIndexOuter
      override val dataLabels: js.Any = dataLabelsOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val id: js.UndefOr[String] = idOuter
      override val labelrank: js.UndefOr[Double] = labelrankOuter
      override val name: js.UndefOr[String] = nameOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val events: js.UndefOr[CleanJsObject[SeriesBulletDataEvents]] = eventsOuter
    })
  }
}