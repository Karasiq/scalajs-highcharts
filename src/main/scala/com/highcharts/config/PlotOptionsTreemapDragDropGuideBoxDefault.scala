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
  * @note JavaScript name: <code>plotOptions-treemap-dragDrop-guideBox-default</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsTreemapDragDropGuideBoxDefault extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>CSS class name of the guide box in this state. Defaults to
    * <code>highcharts-drag-box-default</code>.</p>
    * @since 6.2.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * <p>Width of the line around the guide box.</p>
    * @since 6.2.0
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color of the border around the guide box.</p>
    * @since 6.2.0
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Guide box fill color.</p>
    * @since 6.2.0
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Guide box cursor.</p>
    * @since 6.2.0
    */
  val cursor: js.UndefOr[String] = js.undefined

  /**
    * <p>Guide box zIndex.</p>
    * @since 6.2.0
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object PlotOptionsTreemapDragDropGuideBoxDefault {
  /**
    * @param className <p>CSS class name of the guide box in this state. Defaults to. <code>highcharts-drag-box-default</code>.</p>
    * @param lineWidth <p>Width of the line around the guide box.</p>
    * @param lineColor <p>Color of the border around the guide box.</p>
    * @param color <p>Guide box fill color.</p>
    * @param cursor <p>Guide box cursor.</p>
    * @param zIndex <p>Guide box zIndex.</p>
    */
  def apply(className: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, cursor: js.UndefOr[String] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): PlotOptionsTreemapDragDropGuideBoxDefault = {
    val classNameOuter: js.UndefOr[String] = className
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val colorOuter: js.UndefOr[String | js.Object] = color
    val cursorOuter: js.UndefOr[String] = cursor
    val zIndexOuter: js.UndefOr[Double] = zIndex
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTreemapDragDropGuideBoxDefault {
      override val className: js.UndefOr[String] = classNameOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val cursor: js.UndefOr[String] = cursorOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    })
  }
}
