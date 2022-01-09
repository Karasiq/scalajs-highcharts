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
  * @note JavaScript name: <code>legend-bubbleLegend-ranges</code>
  */
class LegendBubbleLegendRanges extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of the border for individual range.</p>
    * @since 7.0.0
    */
  var borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the bubble for individual range.</p>
    * @since 7.0.0
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the connector for individual range.</p>
    * @since 7.0.0
    */
  var connectorColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Range size value, similar to bubble Z data.</p>
    * @since 7.0.0
    */
  var value: js.UndefOr[Double] = js.undefined
}

object LegendBubbleLegendRanges {
  /**
    * @param borderColor <p>The color of the border for individual range.</p>
    * @param color <p>The color of the bubble for individual range.</p>
    * @param connectorColor <p>The color of the connector for individual range.</p>
    * @param value <p>Range size value, similar to bubble Z data.</p>
    */
  def apply(borderColor: js.UndefOr[String | js.Object] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, connectorColor: js.UndefOr[String | js.Object] = js.undefined, value: js.UndefOr[Double] = js.undefined): LegendBubbleLegendRanges = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LegendBubbleLegendRanges {
      this.borderColor = borderColor
      this.color = color
      this.connectorColor = connectorColor
      this.value = value
    })
  }
}
