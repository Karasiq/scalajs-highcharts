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
  * @note JavaScript name: <code>plotOptions-treemap-levels</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsTreemapLevels extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Can set a <code>borderColor</code> on all points which lies on the same level.</p>
    * @since 4.1.0
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Set the dash style of the border of all the point which lies on the
    * level. See &lt;a href&quot;#plotoptions.scatter.dashstyle&quot;&gt;
    * plotOptions.scatter.dashStyle</a> for possible options.</p>
    * @since 4.1.0
    */
  val borderDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Can set the borderWidth on all points which lies on the same level.</p>
    * @since 4.1.0
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Can set a color on all points which lies on the same level.</p>
    * @since 4.1.0
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>A configuration object to define how the color of a child varies from the
    * parent&#39;s color. The variation is distributed among the children of node.
    * For example when setting brightness, the brightness change will range
    * from the parent&#39;s original brightness on the first child, to the amount
    * set in the <code>to</code> setting on the last node. This allows a gradient-like
    * color scheme that sets children out from each other while highlighting
    * the grouping on treemaps and sectors on sunburst charts.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst/">Sunburst with color variation</a>
    * @since 6.0.0
    */
  val colorVariation: js.UndefOr[CleanJsObject[PlotOptionsTreemapLevelsColorVariation]] = js.undefined

  /**
    * <p>Can set the options of dataLabels on each point which lies on the
    * level. <a href="#plotOptions.treemap.dataLabels">plotOptions.treemap.dataLabels</a>
    * for possible values.</p>
    * @since 4.1.0
    */
  val dataLabels: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Can set the layoutAlgorithm option on a specific level.</p>
    * @since 4.1.0
    */
  val layoutAlgorithm: js.UndefOr[String] = js.undefined

  /**
    * <p>Can set the layoutStartingDirection option on a specific level.</p>
    * @since 4.1.0
    */
  val layoutStartingDirection: js.UndefOr[String] = js.undefined

  /**
    * <p>Decides which level takes effect from the options set in the levels
    * object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-levels/">Styling of both levels</a>
    * @since 4.1.0
    */
  val level: js.UndefOr[Double] = js.undefined
}

object PlotOptionsTreemapLevels {
  /**
    * @param borderColor <p>Can set a <code>borderColor</code> on all points which lies on the same level.</p>
    * @param borderDashStyle <p>Set the dash style of the border of all the point which lies on the. level. See &lt;a href&quot;#plotoptions.scatter.dashstyle&quot;&gt;. plotOptions.scatter.dashStyle</a> for possible options.</p>
    * @param borderWidth <p>Can set the borderWidth on all points which lies on the same level.</p>
    * @param color <p>Can set a color on all points which lies on the same level.</p>
    * @param colorVariation <p>A configuration object to define how the color of a child varies from the. parent&#39;s color. The variation is distributed among the children of node.. For example when setting brightness, the brightness change will range. from the parent&#39;s original brightness on the first child, to the amount. set in the <code>to</code> setting on the last node. This allows a gradient-like. color scheme that sets children out from each other while highlighting. the grouping on treemaps and sectors on sunburst charts.</p>
    * @param dataLabels <p>Can set the options of dataLabels on each point which lies on the. level. <a href="#plotOptions.treemap.dataLabels">plotOptions.treemap.dataLabels</a>. for possible values.</p>
    * @param layoutAlgorithm <p>Can set the layoutAlgorithm option on a specific level.</p>
    * @param layoutStartingDirection <p>Can set the layoutStartingDirection option on a specific level.</p>
    * @param level <p>Decides which level takes effect from the options set in the levels. object.</p>
    */
  def apply(borderColor: js.UndefOr[String | js.Object] = js.undefined, borderDashStyle: js.UndefOr[String] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorVariation: js.UndefOr[CleanJsObject[PlotOptionsTreemapLevelsColorVariation]] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, layoutAlgorithm: js.UndefOr[String] = js.undefined, layoutStartingDirection: js.UndefOr[String] = js.undefined, level: js.UndefOr[Double] = js.undefined): PlotOptionsTreemapLevels = {
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderDashStyleOuter: js.UndefOr[String] = borderDashStyle
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val colorOuter: js.UndefOr[String | js.Object] = color
    val colorVariationOuter: js.UndefOr[CleanJsObject[PlotOptionsTreemapLevelsColorVariation]] = colorVariation
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val layoutAlgorithmOuter: js.UndefOr[String] = layoutAlgorithm
    val layoutStartingDirectionOuter: js.UndefOr[String] = layoutStartingDirection
    val levelOuter: js.UndefOr[Double] = level
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTreemapLevels {
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderDashStyle: js.UndefOr[String] = borderDashStyleOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val colorVariation: js.UndefOr[CleanJsObject[PlotOptionsTreemapLevelsColorVariation]] = colorVariationOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val layoutAlgorithm: js.UndefOr[String] = layoutAlgorithmOuter
      override val layoutStartingDirection: js.UndefOr[String] = layoutStartingDirectionOuter
      override val level: js.UndefOr[Double] = levelOuter
    })
  }
}
