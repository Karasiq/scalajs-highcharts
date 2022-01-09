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
  * @note JavaScript name: <code>zAxis-grid</code>
  */
class ZAxisGrid extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Set border color for the label grid lines.</p>
    * @since 6.2.0
    */
  var borderColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Set border width of the label grid lines.</p>
    * @since 6.2.0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set cell height for grid axis labels. By default this is calculated from font
    * size. This option only applies to horizontal axes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/grid-axis/cellheight">Gant chart with custom cell height</a>
    * @since 6.2.0
    */
  var cellHeight: js.UndefOr[Double] = js.undefined

  /**
    * <p>Set specific options for each column (or row for horizontal axes) in the
    * grid. Each extra column/row is its own axis, and the axis options can be set
    * here.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/gantt/demo/left-axis-table">Left axis as a table</a>
    * @since 6.2.0
    */
  var columns: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>Enable grid on the axis labels. Defaults to true for Gantt charts.</p>
    * @since 6.2.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object ZAxisGrid {
  /**
    * @param borderColor <p>Set border color for the label grid lines.</p>
    * @param borderWidth <p>Set border width of the label grid lines.</p>
    * @param cellHeight <p>Set cell height for grid axis labels. By default this is calculated from font. size. This option only applies to horizontal axes.</p>
    * @param columns <p>Set specific options for each column (or row for horizontal axes) in the. grid. Each extra column/row is its own axis, and the axis options can be set. here.</p>
    * @param enabled <p>Enable grid on the axis labels. Defaults to true for Gantt charts.</p>
    */
  def apply(borderColor: js.UndefOr[String] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, cellHeight: js.UndefOr[Double] = js.undefined, columns: js.UndefOr[js.Array[js.Any]] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined): ZAxisGrid = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ZAxisGrid {
      this.borderColor = borderColor
      this.borderWidth = borderWidth
      this.cellHeight = cellHeight
      this.columns = columns
      this.enabled = enabled
    })
  }
}
