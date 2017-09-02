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
  * @note JavaScript name: <code>series&lt;treemap&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesTreemapData extends js.Object {

  /**
    * An additional, individual class name for the data point's graphic representation.
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * The color of the point. In heat maps the point color is rarely set explicitly, as we use the color to denote the <code>value</code>. Options for this are set in the <a href="#colorAxis">colorAxis</a> configuration.
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">Styled mode</a> only. A specific color index to use for the point, so its graphic representations are given the class name <code>highcharts-color-{n}</code>.
    * @since 5.0.0
    */
  val colorIndex: js.UndefOr[Double] = js.undefined

  /**
    * Serves a purpose only if a colorAxis object is defined in the chart options. This value will decide which color the point gets from the scale of the colorAxis.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/treemap-coloraxis">Treemap with a colorAxis</a>
    * @since 4.1.0
    */
  val colorValue: js.UndefOr[Double] = js.undefined

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
  val events: js.UndefOr[CleanJsObject[SeriesTreemapDataEvents]] = js.undefined

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
    * <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>
    * 
    * <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-objects/" target="_blank">Point names</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * Only for treemap. Use this option to build a tree structure. The value should be the id of the point which is the parent. If no points has a matching id, or this option is undefined, then the parent will be set to the root.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/parent/" target="_blank">Point parent</a>, <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/treemap-with-levels/" target="_blank">Example where parent id is not matching</a>
    * @since 4.1.0
    */
  val parent: js.UndefOr[String] = js.undefined

  /**
    * Whether the data point is selected initially.
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * The value of the point, resulting in a relative area of the point in the treemap.
    */
  val value: js.UndefOr[Double] = js.undefined
}

object SeriesTreemapData {
  /**
    * @param className An additional, individual class name for the data point's graphic representation.
    * @param color The color of the point. In heat maps the point color is rarely set explicitly, as we use the color to denote the <code>value</code>. Options for this are set in the <a href="#colorAxis">colorAxis</a> configuration.
    * @param colorIndex <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">Styled mode</a> only. A specific color index to use for the point, so its graphic representations are given the class name <code>highcharts-color-{n}</code>.
    * @param colorValue Serves a purpose only if a colorAxis object is defined in the chart options. This value will decide which color the point gets from the scale of the colorAxis.
    * @param dataLabels Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @param description <p><i>Requires Accessibility module</i></p>. <p>A description of the point to add to the screen reader information about the point.</p>
    * @param drilldown The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to use for a drilldown for this point.
    * @param events Individual point events
    * @param id An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param labelrank The rank for this point's data label in case of collision. If two data labels are about to overlap, only the one with the highest <code>labelrank</code> will be drawn.
    * @param name <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>. . <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
    * @param parent Only for treemap. Use this option to build a tree structure. The value should be the id of the point which is the parent. If no points has a matching id, or this option is undefined, then the parent will be set to the root.
    * @param selected Whether the data point is selected initially.
    * @param value The value of the point, resulting in a relative area of the point in the treemap.
    */
  def apply(className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, colorValue: js.UndefOr[Double] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, description: js.UndefOr[String] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesTreemapDataEvents]] = js.undefined, id: js.UndefOr[String] = js.undefined, labelrank: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, parent: js.UndefOr[String] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, value: js.UndefOr[Double] = js.undefined): SeriesTreemapData = {
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val colorIndexOuter: js.UndefOr[Double] = colorIndex
    val colorValueOuter: js.UndefOr[Double] = colorValue
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val descriptionOuter: js.UndefOr[String] = description
    val drilldownOuter: js.UndefOr[String] = drilldown
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesTreemapDataEvents]] = events
    val idOuter: js.UndefOr[String] = id
    val labelrankOuter: js.UndefOr[Double] = labelrank
    val nameOuter: js.UndefOr[String] = name
    val parentOuter: js.UndefOr[String] = parent
    val selectedOuter: js.UndefOr[Boolean] = selected
    val valueOuter: js.UndefOr[Double] = value
    new SeriesTreemapData {
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val colorIndex: js.UndefOr[Double] = colorIndexOuter
      override val colorValue: js.UndefOr[Double] = colorValueOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val drilldown: js.UndefOr[String] = drilldownOuter
      override val events: js.UndefOr[CleanJsObject[SeriesTreemapDataEvents]] = eventsOuter
      override val id: js.UndefOr[String] = idOuter
      override val labelrank: js.UndefOr[Double] = labelrankOuter
      override val name: js.UndefOr[String] = nameOuter
      override val parent: js.UndefOr[String] = parentOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val value: js.UndefOr[Double] = valueOuter
    }
  }
}
