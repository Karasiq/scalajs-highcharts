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
  * @note JavaScript name: <code>series&lt;organization&gt;-levels</code>
  */
class SeriesOrganizationLevels extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Can set <code>borderColor</code> on all nodes which lay on the same level.</p>
    * @since 7.1.0
    */
  var borderColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Can set <code>borderWidth</code> on all nodes which lay on the same level.</p>
    * @since 7.1.0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Can set <code>color</code> on all nodes which lay on the same level.</p>
    * @since 7.1.0
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Can set <code>colorByPoint</code> on all nodes which lay on the same level.</p>
    * @since 7.1.0
    */
  var colorByPoint: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Can set <code>dataLabels</code> on all points which lay on the same level.</p>
    * @since 7.1.0
    */
  var dataLabels: js.UndefOr[CleanJsObject[SeriesOrganizationLevelsDataLabels]] = js.undefined

  /**
    * <p>Decides which level takes effect from the options set in the levels
    * object.</p>
    * @since 7.1.0
    */
  var level: js.UndefOr[Double] = js.undefined

  /**
    * <p>Can set <code>linkOpacity</code> on all points which lay on the same level.</p>
    * @since 7.1.0
    */
  var linkOpacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>Can set <code>states</code> on all nodes and points which lay on the same level.</p>
    * @since 7.1.0
    */
  var states: js.UndefOr[CleanJsObject[SeriesOrganizationLevelsStates]] = js.undefined
}

object SeriesOrganizationLevels {
  /**
    * @param borderColor <p>Can set <code>borderColor</code> on all nodes which lay on the same level.</p>
    * @param borderWidth <p>Can set <code>borderWidth</code> on all nodes which lay on the same level.</p>
    * @param color <p>Can set <code>color</code> on all nodes which lay on the same level.</p>
    * @param colorByPoint <p>Can set <code>colorByPoint</code> on all nodes which lay on the same level.</p>
    * @param dataLabels <p>Can set <code>dataLabels</code> on all points which lay on the same level.</p>
    * @param level <p>Decides which level takes effect from the options set in the levels. object.</p>
    * @param linkOpacity <p>Can set <code>linkOpacity</code> on all points which lay on the same level.</p>
    * @param states <p>Can set <code>states</code> on all nodes and points which lay on the same level.</p>
    */
  def apply(borderColor: js.UndefOr[String] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorByPoint: js.UndefOr[Boolean] = js.undefined, dataLabels: js.UndefOr[CleanJsObject[SeriesOrganizationLevelsDataLabels]] = js.undefined, level: js.UndefOr[Double] = js.undefined, linkOpacity: js.UndefOr[Double] = js.undefined, states: js.UndefOr[CleanJsObject[SeriesOrganizationLevelsStates]] = js.undefined): SeriesOrganizationLevels = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesOrganizationLevels {
      this.borderColor = borderColor
      this.borderWidth = borderWidth
      this.color = color
      this.colorByPoint = colorByPoint
      this.dataLabels = dataLabels
      this.level = level
      this.linkOpacity = linkOpacity
      this.states = states
    })
  }
}
