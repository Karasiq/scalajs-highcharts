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
  * @note JavaScript name: <code>series&lt;sankey&gt;-data</code>
  */
class SeriesSankeyData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color for the individual <em>link</em>. By default, the link color is the same
    * as the node it extends from. The <code>series.fillOpacity</code> option also applies to
    * the points, so when setting a specific link color, consider setting the
    * <code>fillOpacity</code> to 1.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/color/">Mark the highest point</a>
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Individual data label for each point. The options are the same as
    * the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/datalabels/">Show a label for the last value</a>
    */
  var dataLabels: js.UndefOr[js.Object | js.Array[js.Object]] = js.undefined

  /**
    * <p>The node that the link runs from.</p>
    */
  var from: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether the link goes out of the system.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-outgoing">Sankey chart with outgoing links</a>
    */
  var outgoing: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The node that the link runs to.</p>
    */
  var to: js.UndefOr[String] = js.undefined

  /**
    * <p>The weight of the link.</p>
    */
  var weight: js.UndefOr[Double | Null] = js.undefined

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
    * <p>The individual point events.</p>
    */
  var events: js.UndefOr[CleanJsObject[SeriesSankeyDataEvents]] = js.undefined

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
}

object SeriesSankeyData {
  /**
    * @param color <p>The color for the individual <em>link</em>. By default, the link color is the same. as the node it extends from. The <code>series.fillOpacity</code> option also applies to. the points, so when setting a specific link color, consider setting the. <code>fillOpacity</code> to 1.</p>
    * @param dataLabels <p>Individual data label for each point. The options are the same as. the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @param from <p>The node that the link runs from.</p>
    * @param outgoing <p>Whether the link goes out of the system.</p>
    * @param to <p>The node that the link runs to.</p>
    * @param weight <p>The weight of the link.</p>
    * @param accessibility <p>Accessibility options for a data point.</p>
    * @param className <p>An additional, individual class name for the data point&#39;s graphic. representation.</p>
    * @param colorIndex <p>A specific color index to use for the point, so its graphic representations. are given the class name <code>highcharts-color-{n}</code>. In styled mode this will. change the color of the graphic. In non-styled mode, the color by is set by. the <code>fill</code> attribute, so the change in class name won&#39;t have a visual effect. by default.</p>
    * @param custom <p>A reserved subspace to store options and values for customized functionality.. Here you can add additional data for your own event callbacks and formatter. callbacks.</p>
    * @param description <p>A description of the point to add to the screen reader information. about the point.</p>
    * @param events <p>The individual point events.</p>
    * @param id <p>An id for the point. This can be used after render time to get a. pointer to the point object through <code>chart.get()</code>.</p>
    * @param labelrank <p>The rank for this point&#39;s data label in case of collision. If two. data labels are about to overlap, only the one with the highest <code>labelrank</code>. will be drawn.</p>
    * @param name <p>The name of the point as shown in the legend, tooltip, dataLabels, etc.</p>
    * @param selected <p>Whether the data point is selected initially.</p>
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Object | js.Array[js.Object]] = js.undefined, from: js.UndefOr[String] = js.undefined, outgoing: js.UndefOr[Boolean] = js.undefined, to: js.UndefOr[String] = js.undefined, weight: js.UndefOr[Double | Null] = js.undefined, accessibility: js.UndefOr[js.Any] = js.undefined, className: js.UndefOr[String] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, custom: js.UndefOr[js.Object] = js.undefined, description: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesSankeyDataEvents]] = js.undefined, id: js.UndefOr[String] = js.undefined, labelrank: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined): SeriesSankeyData = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSankeyData {
      this.color = color
      this.dataLabels = dataLabels
      this.from = from
      this.outgoing = outgoing
      this.to = to
      this.weight = weight
      this.accessibility = accessibility
      this.className = className
      this.colorIndex = colorIndex
      this.custom = custom
      this.description = description
      this.events = events
      this.id = id
      this.labelrank = labelrank
      this.name = name
      this.selected = selected
    })
  }
}
