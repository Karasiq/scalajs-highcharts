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
  * @note JavaScript name: <code>series&lt;sunburst&gt;-levels</code>
  */
class SeriesSunburstLevels extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Can set a <code>borderColor</code> on all points which lies on the same level.</p>
    */
  var borderColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Can set a <code>borderDashStyle</code> on all points which lies on the same
    * level.</p>
    */
  var borderDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Can set a <code>borderWidth</code> on all points which lies on the same level.</p>
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Can set a <code>color</code> on all points which lies on the same level.</p>
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Can set a <code>colorVariation</code> on all points which lies on the same
    * level.</p>
    */
  var colorVariation: js.Any = js.undefined

  /**
    * <p>Can set <code>dataLabels</code> on all points which lies on the same level.</p>
    */
  var dataLabels: js.UndefOr[CleanJsObject[SeriesSunburstLevelsDataLabels]] = js.undefined

  /**
    * <p>Decides which level takes effect from the options set in the levels
    * object.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst">Sunburst chart</a>
    */
  var level: js.UndefOr[Double] = js.undefined

  /**
    * <p>Can set a <code>levelSize</code> on all points which lies on the same level.</p>
    */
  var levelSize: js.UndefOr[js.Object] = js.undefined
}

object SeriesSunburstLevels {
  /**
    * @param borderColor <p>Can set a <code>borderColor</code> on all points which lies on the same level.</p>
    * @param borderDashStyle <p>Can set a <code>borderDashStyle</code> on all points which lies on the same. level.</p>
    * @param borderWidth <p>Can set a <code>borderWidth</code> on all points which lies on the same level.</p>
    * @param color <p>Can set a <code>color</code> on all points which lies on the same level.</p>
    * @param colorVariation <p>Can set a <code>colorVariation</code> on all points which lies on the same. level.</p>
    * @param dataLabels <p>Can set <code>dataLabels</code> on all points which lies on the same level.</p>
    * @param level <p>Decides which level takes effect from the options set in the levels. object.</p>
    * @param levelSize <p>Can set a <code>levelSize</code> on all points which lies on the same level.</p>
    */
  def apply(borderColor: js.UndefOr[String] = js.undefined, borderDashStyle: js.UndefOr[String] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorVariation: js.UndefOr[js.Any] = js.undefined, dataLabels: js.UndefOr[CleanJsObject[SeriesSunburstLevelsDataLabels]] = js.undefined, level: js.UndefOr[Double] = js.undefined, levelSize: js.UndefOr[js.Object] = js.undefined): SeriesSunburstLevels = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSunburstLevels {
      this.borderColor = borderColor
      this.borderDashStyle = borderDashStyle
      this.borderWidth = borderWidth
      this.color = color
      this.colorVariation = colorVariation
      this.dataLabels = dataLabels
      this.level = level
      this.levelSize = levelSize
    })
  }
}
