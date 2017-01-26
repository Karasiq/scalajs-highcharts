/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-spline-marker</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSplineMarker extends js.Object {

  /**
    * Enable or disable the point marker. If <code>null</code>, the markers are hidden when the data is dense, and shown for more widespread data points.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-marker/" target="_blank">Enabled markers</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * The fill color of the point marker. When <code>null</code>, the series' or point's color is used.
    */
  val fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Image markers only. Set the image width explicitly. When using this option, a <code>width</code> must also be set.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/" target="_blank">Fixed width and height</a>
    * @since 2.0.4
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The width of the point marker's outline.
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The radius of the point marker.
    */
  val radius: js.UndefOr[Double] = js.undefined

  val states: js.UndefOr[CleanJsObject[PlotOptionsSplineMarkerStates]] = js.undefined

  /**
    * <p>A predefined shape or symbol for the marker. When null, the symbol is pulled from options.symbols. Other possible values are "circle", "square", "diamond", "triangle" and "triangle-down".</p>
    * 
    * <p>Additionally, the URL to a graphic can be given on this form:  "url(graphic.png)". Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server.</p>
    * 
    * <p>Custom callbacks for symbol path generation can also be added to <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by its method name, as shown in the demo.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-symbol/" target="_blank">Predefined, graphic and custom markers</a>
    */
  val symbol: js.UndefOr[String] = js.undefined

  /**
    * Image markers only. Set the image width explicitly. When using this option, a <code>height</code> must also be set.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/" target="_blank">Fixed width and height</a>
    * @since 2.0.4
    */
  val width: js.UndefOr[Double] = js.undefined
}

object PlotOptionsSplineMarker {
  /**
    * @param enabled Enable or disable the point marker. If <code>null</code>, the markers are hidden when the data is dense, and shown for more widespread data points.
    * @param fillColor The fill color of the point marker. When <code>null</code>, the series' or point's color is used.
    * @param height Image markers only. Set the image width explicitly. When using this option, a <code>width</code> must also be set.
    * @param lineColor The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
    * @param lineWidth The width of the point marker's outline.
    * @param radius The radius of the point marker.
    * @param symbol <p>A predefined shape or symbol for the marker. When null, the symbol is pulled from options.symbols. Other possible values are "circle", "square", "diamond", "triangle" and "triangle-down".</p>. . <p>Additionally, the URL to a graphic can be given on this form:  "url(graphic.png)". Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server.</p>. . <p>Custom callbacks for symbol path generation can also be added to <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by its method name, as shown in the demo.</p>
    * @param width Image markers only. Set the image width explicitly. When using this option, a <code>height</code> must also be set.
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, height: js.UndefOr[Double] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[Double] = js.undefined, states: js.UndefOr[CleanJsObject[PlotOptionsSplineMarkerStates]] = js.undefined, symbol: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double] = js.undefined): PlotOptionsSplineMarker = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val fillColorOuter: js.UndefOr[String | js.Object] = fillColor
    val heightOuter: js.UndefOr[Double] = height
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val radiusOuter: js.UndefOr[Double] = radius
    val statesOuter: js.UndefOr[CleanJsObject[PlotOptionsSplineMarkerStates]] = states
    val symbolOuter: js.UndefOr[String] = symbol
    val widthOuter: js.UndefOr[Double] = width
    new PlotOptionsSplineMarker {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val fillColor: js.UndefOr[String | js.Object] = fillColorOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val radius: js.UndefOr[Double] = radiusOuter
      override val states: js.UndefOr[CleanJsObject[PlotOptionsSplineMarkerStates]] = statesOuter
      override val symbol: js.UndefOr[String] = symbolOuter
      override val width: js.UndefOr[Double] = widthOuter
    }
  }
}
