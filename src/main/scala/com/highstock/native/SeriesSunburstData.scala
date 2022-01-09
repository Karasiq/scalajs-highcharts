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
  * @note JavaScript name: <code>series&lt;sunburst&gt;-data</code>
  */
class SeriesSunburstData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Individual data label for each point. The options are the same as
    * the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/datalabels/">Show a label for the last value</a>
    */
  var dataLabels: js.UndefOr[js.Object | js.Array[js.Object]] = js.undefined

  /**
    * <p>The name decides the text for a word.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-objects/">Point names</a>
    * @since 6.0.0
    */
  var name: js.UndefOr[String] = js.undefined

  /**
    * <p>Use this option to build a tree structure. The value should be the id of the
    * point which is the parent. If no points has a matching id, or this option is
    * undefined, then the parent will be set to the root.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/parent/">Point parent</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/treemap-with-levels/">Example where parent id is not matching</a>
    * @since 6.0.0
    */
  var parent: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to display a slice offset from the center. When a sunburst point is
    * sliced, its children are also offset.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sunburst-sliced">Sliced sunburst</a>
    * @since 6.0.4
    */
  var sliced: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The value of the point, resulting in a relative area of the point
    * in the sunburst.</p>
    * @since 6.0.0
    */
  var value: js.UndefOr[Double | Null] = js.undefined

  /**
    * <p>The weighting of a word. The weight decides the relative size of a word
    * compared to the rest of the collection.</p>
    * @since 6.0.0
    */
  var weight: js.UndefOr[Double] = js.undefined

  /**
    * <p>Serves a purpose only if a <code>colorAxis</code> object is defined in the chart
    * options. This value will decide which color the point gets from the
    * scale of the colorAxis.</p>
    * @since 4.1.0
    */
  var colorValue: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the point. In heat maps the point color is rarely set
    * explicitly, as we use the color to denote the <code>value</code>. Options for
    * this are set in the <a href="#colorAxis">colorAxis</a> configuration.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/color/">Mark the highest point</a>
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Options for the point markers of line-like series.</p>
    * @since 8.1
    */
  var marker: js.Any = js.undefined

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
  var dragDrop: js.UndefOr[CleanJsObject[SeriesSunburstDataDragDrop]] = js.undefined

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
  var events: js.UndefOr[CleanJsObject[SeriesSunburstDataEvents]] = js.undefined

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
    * <p>Whether the data point is selected initially.</p>
    */
  var selected: js.UndefOr[Boolean] = js.undefined
}

object SeriesSunburstData {
  /**
    * @param dataLabels <p>Individual data label for each point. The options are the same as. the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @param name <p>The name decides the text for a word.</p>
    * @param parent <p>Use this option to build a tree structure. The value should be the id of the. point which is the parent. If no points has a matching id, or this option is. undefined, then the parent will be set to the root.</p>
    * @param sliced <p>Whether to display a slice offset from the center. When a sunburst point is. sliced, its children are also offset.</p>
    * @param value <p>The value of the point, resulting in a relative area of the point. in the sunburst.</p>
    * @param weight <p>The weighting of a word. The weight decides the relative size of a word. compared to the rest of the collection.</p>
    * @param colorValue <p>Serves a purpose only if a <code>colorAxis</code> object is defined in the chart. options. This value will decide which color the point gets from the. scale of the colorAxis.</p>
    * @param color <p>The color of the point. In heat maps the point color is rarely set. explicitly, as we use the color to denote the <code>value</code>. Options for. this are set in the <a href="#colorAxis">colorAxis</a> configuration.</p>
    * @param marker <p>Options for the point markers of line-like series.</p>
    * @param accessibility <p>Accessibility options for a data point.</p>
    * @param className <p>An additional, individual class name for the data point&#39;s graphic. representation.</p>
    * @param colorIndex <p>A specific color index to use for the point, so its graphic representations. are given the class name <code>highcharts-color-{n}</code>. In styled mode this will. change the color of the graphic. In non-styled mode, the color by is set by. the <code>fill</code> attribute, so the change in class name won&#39;t have a visual effect. by default.</p>
    * @param custom <p>A reserved subspace to store options and values for customized functionality.. Here you can add additional data for your own event callbacks and formatter. callbacks.</p>
    * @param description <p>A description of the point to add to the screen reader information. about the point.</p>
    * @param dragDrop <p>Point specific options for the draggable-points module. Overrides options on. <code>series.dragDrop</code>.</p>
    * @param drilldown <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to. use for a drilldown for this point.</p>
    * @param events <p>The individual point events.</p>
    * @param id <p>An id for the point. This can be used after render time to get a. pointer to the point object through <code>chart.get()</code>.</p>
    * @param labelrank <p>The rank for this point&#39;s data label in case of collision. If two. data labels are about to overlap, only the one with the highest <code>labelrank</code>. will be drawn.</p>
    * @param selected <p>Whether the data point is selected initially.</p>
    */
  def apply(dataLabels: js.UndefOr[js.Object | js.Array[js.Object]] = js.undefined, name: js.UndefOr[String] = js.undefined, parent: js.UndefOr[String] = js.undefined, sliced: js.UndefOr[Boolean] = js.undefined, value: js.UndefOr[Double | Null] = js.undefined, weight: js.UndefOr[Double] = js.undefined, colorValue: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, marker: js.UndefOr[js.Any] = js.undefined, accessibility: js.UndefOr[js.Any] = js.undefined, className: js.UndefOr[String] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, custom: js.UndefOr[js.Object] = js.undefined, description: js.UndefOr[String] = js.undefined, dragDrop: js.UndefOr[CleanJsObject[SeriesSunburstDataDragDrop]] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesSunburstDataEvents]] = js.undefined, id: js.UndefOr[String] = js.undefined, labelrank: js.UndefOr[Double] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined): SeriesSunburstData = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSunburstData {
      this.dataLabels = dataLabels
      this.name = name
      this.parent = parent
      this.sliced = sliced
      this.value = value
      this.weight = weight
      this.colorValue = colorValue
      this.color = color
      this.marker = marker
      this.accessibility = accessibility
      this.className = className
      this.colorIndex = colorIndex
      this.custom = custom
      this.description = description
      this.dragDrop = dragDrop
      this.drilldown = drilldown
      this.events = events
      this.id = id
      this.labelrank = labelrank
      this.selected = selected
    })
  }
}