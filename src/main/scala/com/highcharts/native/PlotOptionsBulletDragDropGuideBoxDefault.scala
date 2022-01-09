/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-bullet-dragDrop-guideBox-default</code>
  */
class PlotOptionsBulletDragDropGuideBoxDefault extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>CSS class name of the guide box in this state. Defaults to
    * <code>highcharts-drag-box-default</code>.</p>
    * @since 6.2.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>Guide box fill color.</p>
    * @since 6.2.0
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Guide box cursor.</p>
    * @since 6.2.0
    */
  var cursor: js.UndefOr[String] = js.undefined

  /**
    * <p>Color of the border around the guide box.</p>
    * @since 6.2.0
    */
  var lineColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Width of the line around the guide box.</p>
    * @since 6.2.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Guide box zIndex.</p>
    * @since 6.2.0
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PlotOptionsBulletDragDropGuideBoxDefault {
  /**
    * @param className <p>CSS class name of the guide box in this state. Defaults to. <code>highcharts-drag-box-default</code>.</p>
    * @param color <p>Guide box fill color.</p>
    * @param cursor <p>Guide box cursor.</p>
    * @param lineColor <p>Color of the border around the guide box.</p>
    * @param lineWidth <p>Width of the line around the guide box.</p>
    * @param zIndex <p>Guide box zIndex.</p>
    */
  def apply(className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, cursor: js.UndefOr[String] = js.undefined, lineColor: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): PlotOptionsBulletDragDropGuideBoxDefault = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsBulletDragDropGuideBoxDefault {
      this.className = className
      this.color = color
      this.cursor = cursor
      this.lineColor = lineColor
      this.lineWidth = lineWidth
      this.zIndex = zIndex
    })
  }
}
