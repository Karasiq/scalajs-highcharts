/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;funnel3d&gt;-data</code>
  */
class SeriesFunnel3dData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>By deafult sides fill is set to a gradient through this option being
    * set to <code>true</code>. Set to <code>false</code> to get solid color for the sides.</p>
    * @since 7.1.0
    */
  var gradientForSides: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Individual data label for each point. The options are the same as
    * the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/datalabels/">Show a label for the last value</a>
    * @since 7.1.0
    */
  var dataLabels: js.Any = js.undefined

  /**
    * <p>The sequential index of the data point in the legend.</p>
    * @since 7.1.0
    */
  var legendIndex: js.UndefOr[Double] = js.undefined

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
    * @since 7.1.0
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
    * @since 7.1.0
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
  var dragDrop: js.UndefOr[CleanJsObject[SeriesFunnel3dDataDragDrop]] = js.undefined

  /**
    * <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to
    * use for a drilldown for this point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/basic/">Basic drilldown</a>
    * @since 3.0.8
    */
  var drilldown: js.UndefOr[String] = js.undefined

  /**
    * <p>The individual point events.</p>
    * @since 7.1.0
    */
  var events: js.UndefOr[CleanJsObject[SeriesFunnel3dDataEvents]] = js.undefined

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
    * @since 7.1.0
    */
  var labelrank: js.UndefOr[Double] = js.undefined

  /**
    * <p>The name of the point as shown in the legend, tooltip, dataLabels, etc.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-objects/">Point names</a>
    * @since 7.1.0
    */
  var name: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether the data point is selected initially.</p>
    * @since 7.1.0
    */
  var selected: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The y value of the point.</p>
    * @since 7.1.0
    */
  var y: js.UndefOr[Double | Null] = js.undefined

  /**
    * <p>The color of the border surrounding the column or bar.</p>
    * <p>In styled mode, the border stroke can be set with the <code>.highcharts-point</code>
    * rule.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-bordercolor/">Dark gray border</a>
    * @since 7.1.0
    */
  var borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the border surrounding the column or bar.</p>
    * <p>In styled mode, the stroke width can be set with the <code>.highcharts-point</code>
    * rule.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-borderwidth/">2px black border</a>
    * @since 7.1.0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>A name for the dash style to use for the column or bar. Overrides
    * dashStyle on the series.</p>
    * <p>In styled mode, the stroke dash-array can be set with the same classes as
    * listed under <a href="#series.column.data.color">data.color</a>.</p>
    * @since 7.1.0
    */
  var dashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>A pixel value specifying a fixed width for the column or bar. Overrides
    * pointWidth on the series. The width effects the dimension that is not based
    * on the point value.</p>
    * @since 7.0.0
    */
  var pointWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The x value of the point. For datetime axes, the X value is the timestamp
    * in milliseconds since 1970.</p>
    * @since 7.1.0
    */
  var x: js.UndefOr[Double] = js.undefined
}

object SeriesFunnel3dData {
  /**
    * @param gradientForSides <p>By deafult sides fill is set to a gradient through this option being. set to <code>true</code>. Set to <code>false</code> to get solid color for the sides.</p>
    * @param dataLabels <p>Individual data label for each point. The options are the same as. the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @param legendIndex <p>The sequential index of the data point in the legend.</p>
    * @param accessibility <p>Accessibility options for a data point.</p>
    * @param className <p>An additional, individual class name for the data point&#39;s graphic. representation.</p>
    * @param color <p>Individual color for the point. By default the color is pulled from. the global <code>colors</code> array.</p>. <p>In styled mode, the <code>color</code> option doesn&#39;t take effect. Instead, use. <code>colorIndex</code>.</p>
    * @param colorIndex <p>A specific color index to use for the point, so its graphic representations. are given the class name <code>highcharts-color-{n}</code>. In styled mode this will. change the color of the graphic. In non-styled mode, the color by is set by. the <code>fill</code> attribute, so the change in class name won&#39;t have a visual effect. by default.</p>
    * @param custom <p>A reserved subspace to store options and values for customized functionality.. Here you can add additional data for your own event callbacks and formatter. callbacks.</p>
    * @param description <p>A description of the point to add to the screen reader information. about the point.</p>
    * @param dragDrop <p>Point specific options for the draggable-points module. Overrides options on. <code>series.dragDrop</code>.</p>
    * @param drilldown <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to. use for a drilldown for this point.</p>
    * @param events <p>The individual point events.</p>
    * @param id <p>An id for the point. This can be used after render time to get a. pointer to the point object through <code>chart.get()</code>.</p>
    * @param labelrank <p>The rank for this point&#39;s data label in case of collision. If two. data labels are about to overlap, only the one with the highest <code>labelrank</code>. will be drawn.</p>
    * @param name <p>The name of the point as shown in the legend, tooltip, dataLabels, etc.</p>
    * @param selected <p>Whether the data point is selected initially.</p>
    * @param y <p>The y value of the point.</p>
    * @param borderColor <p>The color of the border surrounding the column or bar.</p>. <p>In styled mode, the border stroke can be set with the <code>.highcharts-point</code>. rule.</p>
    * @param borderWidth <p>The width of the border surrounding the column or bar.</p>. <p>In styled mode, the stroke width can be set with the <code>.highcharts-point</code>. rule.</p>
    * @param dashStyle <p>A name for the dash style to use for the column or bar. Overrides. dashStyle on the series.</p>. <p>In styled mode, the stroke dash-array can be set with the same classes as. listed under <a href="#series.column.data.color">data.color</a>.</p>
    * @param pointWidth <p>A pixel value specifying a fixed width for the column or bar. Overrides. pointWidth on the series. The width effects the dimension that is not based. on the point value.</p>
    * @param x <p>The x value of the point. For datetime axes, the X value is the timestamp. in milliseconds since 1970.</p>
    */
  def apply(gradientForSides: js.UndefOr[Boolean] = js.undefined, dataLabels: js.UndefOr[js.Any] = js.undefined, legendIndex: js.UndefOr[Double] = js.undefined, accessibility: js.UndefOr[js.Any] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, custom: js.UndefOr[js.Object] = js.undefined, description: js.UndefOr[String] = js.undefined, dragDrop: js.UndefOr[CleanJsObject[SeriesFunnel3dDataDragDrop]] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesFunnel3dDataEvents]] = js.undefined, id: js.UndefOr[String] = js.undefined, labelrank: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, y: js.UndefOr[Double | Null] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, pointWidth: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined): SeriesFunnel3dData = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesFunnel3dData {
      this.gradientForSides = gradientForSides
      this.dataLabels = dataLabels
      this.legendIndex = legendIndex
      this.accessibility = accessibility
      this.className = className
      this.color = color
      this.colorIndex = colorIndex
      this.custom = custom
      this.description = description
      this.dragDrop = dragDrop
      this.drilldown = drilldown
      this.events = events
      this.id = id
      this.labelrank = labelrank
      this.name = name
      this.selected = selected
      this.y = y
      this.borderColor = borderColor
      this.borderWidth = borderWidth
      this.dashStyle = dashStyle
      this.pointWidth = pointWidth
      this.x = x
    })
  }
}
