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
  * @note JavaScript name: <code>zAxis-grid</code>
  */
@js.annotation.ScalaJSDefined
class ZAxisGrid extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable grid on the axis labels. Defaults to true for Gantt charts.</p>
    * @since 6.2.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Set specific options for each column (or row for horizontal axes) in the
    * grid. Each extra column/row is its own axis, and the axis options can be set
    * here.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/demo/left-axis-table">Left axis as a table</a>
    * @since 6.2.0
    */
  val columns: js.UndefOr[js.Array[js.Object]] = js.undefined

  /**
    * <p>Set border color for the label grid lines.</p>
    * @since 6.2.0
    */
  val borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Set border width of the label grid lines.</p>
    * @since 6.2.0
    */
  val borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set cell height for grid axis labels. By default this is calculated from font
    * size.</p>
    * @since 6.2.0
    */
  val cellHeight: js.UndefOr[Double] = js.undefined
}

object ZAxisGrid {
  /**
    * @param enabled <p>Enable grid on the axis labels. Defaults to true for Gantt charts.</p>
    * @param columns <p>Set specific options for each column (or row for horizontal axes) in the. grid. Each extra column/row is its own axis, and the axis options can be set. here.</p>
    * @param borderColor <p>Set border color for the label grid lines.</p>
    * @param borderWidth <p>Set border width of the label grid lines.</p>
    * @param cellHeight <p>Set cell height for grid axis labels. By default this is calculated from font. size.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, columns: js.UndefOr[js.Array[js.Object]] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, cellHeight: js.UndefOr[Double] = js.undefined): ZAxisGrid = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val columnsOuter: js.UndefOr[js.Array[js.Object]] = columns
    val borderColorOuter: js.UndefOr[String | js.Object] = borderColor
    val borderWidthOuter: js.UndefOr[Double] = borderWidth
    val cellHeightOuter: js.UndefOr[Double] = cellHeight
    com.highcharts.HighchartsGenericObject.toCleanObject(new ZAxisGrid {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val columns: js.UndefOr[js.Array[js.Object]] = columnsOuter
      override val borderColor: js.UndefOr[String | js.Object] = borderColorOuter
      override val borderWidth: js.UndefOr[Double] = borderWidthOuter
      override val cellHeight: js.UndefOr[Double] = cellHeightOuter
    })
  }
}
