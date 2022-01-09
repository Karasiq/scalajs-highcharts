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
  * @note JavaScript name: <code>series&lt;treemap&gt;-levels</code>
  */
class SeriesTreemapLevels extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Can set a <code>borderColor</code> on all points which lies on the same level.</p>
    * @since 4.1.0
    */
  var borderColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Set the dash style of the border of all the point which lies on the
    * level. See
    * <a href="#plotoptions.scatter.dashstyle">plotOptions.scatter.dashStyle</a>
    * for possible options.</p>
    * @since 4.1.0
    */
  var borderDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Can set the borderWidth on all points which lies on the same level.</p>
    * @since 4.1.0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Can set a color on all points which lies on the same level.</p>
    * @since 4.1.0
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>A configuration object to define how the color of a child varies from
    * the parent&#39;s color. The variation is distributed among the children
    * of node. For example when setting brightness, the brightness change
    * will range from the parent&#39;s original brightness on the first child,
    * to the amount set in the <code>to</code> setting on the last node. This allows a
    * gradient-like color scheme that sets children out from each other
    * while highlighting the grouping on treemaps and sectors on sunburst
    * charts.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst/">Sunburst with color variation</a>
    * @since 6.0.0
    */
  var colorVariation: js.Any = js.undefined

  /**
    * <p>Can set the options of dataLabels on each point which lies on the
    * level.
    * <a href="#plotOptions.treemap.dataLabels">plotOptions.treemap.dataLabels</a> for
    * possible values.</p>
    * @since 4.1.0
    */
  var dataLabels: js.UndefOr[CleanJsObject[SeriesTreemapLevelsDataLabels]] = js.undefined

  /**
    * <p>Can set the layoutAlgorithm option on a specific level.</p>
    * @since 4.1.0
    */
  var layoutAlgorithm: js.UndefOr[String] = js.undefined

  /**
    * <p>Can set the layoutStartingDirection option on a specific level.</p>
    * @since 4.1.0
    */
  var layoutStartingDirection: js.UndefOr[String] = js.undefined

  /**
    * <p>Decides which level takes effect from the options set in the levels
    * object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-levels/">Styling of both levels</a>
    * @since 4.1.0
    */
  var level: js.UndefOr[Double] = js.undefined
}

object SeriesTreemapLevels {
  /**
    * @param borderColor <p>Can set a <code>borderColor</code> on all points which lies on the same level.</p>
    * @param borderDashStyle <p>Set the dash style of the border of all the point which lies on the. level. See. <a href="#plotoptions.scatter.dashstyle">plotOptions.scatter.dashStyle</a>. for possible options.</p>
    * @param borderWidth <p>Can set the borderWidth on all points which lies on the same level.</p>
    * @param color <p>Can set a color on all points which lies on the same level.</p>
    * @param colorVariation <p>A configuration object to define how the color of a child varies from. the parent&#39;s color. The variation is distributed among the children. of node. For example when setting brightness, the brightness change. will range from the parent&#39;s original brightness on the first child,. to the amount set in the <code>to</code> setting on the last node. This allows a. gradient-like color scheme that sets children out from each other. while highlighting the grouping on treemaps and sectors on sunburst. charts.</p>
    * @param dataLabels <p>Can set the options of dataLabels on each point which lies on the. level.. <a href="#plotOptions.treemap.dataLabels">plotOptions.treemap.dataLabels</a> for. possible values.</p>
    * @param layoutAlgorithm <p>Can set the layoutAlgorithm option on a specific level.</p>
    * @param layoutStartingDirection <p>Can set the layoutStartingDirection option on a specific level.</p>
    * @param level <p>Decides which level takes effect from the options set in the levels. object.</p>
    */
  def apply(borderColor: js.UndefOr[String] = js.undefined, borderDashStyle: js.UndefOr[String] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorVariation: js.UndefOr[js.Any] = js.undefined, dataLabels: js.UndefOr[CleanJsObject[SeriesTreemapLevelsDataLabels]] = js.undefined, layoutAlgorithm: js.UndefOr[String] = js.undefined, layoutStartingDirection: js.UndefOr[String] = js.undefined, level: js.UndefOr[Double] = js.undefined): SeriesTreemapLevels = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapLevels {
      this.borderColor = borderColor
      this.borderDashStyle = borderDashStyle
      this.borderWidth = borderWidth
      this.color = color
      this.colorVariation = colorVariation
      this.dataLabels = dataLabels
      this.layoutAlgorithm = layoutAlgorithm
      this.layoutStartingDirection = layoutStartingDirection
      this.level = level
    })
  }
}
