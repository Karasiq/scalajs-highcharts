/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.7 by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-enabled/" target="_blank">Disabled markers</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-enabled-false/" target="_blank">disabled in normal state but enabled on hover</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * The fill color of the point marker. When <code>null</code>, the series' or point's color is used.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/" target="_blank">White fill</a>
    */
  val fillColor: js.UndefOr[String] = js.undefined

  /**
    * Image markers only. Set the image width explicitly. When using this option, a <code>width</code> must also be set.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-width-height/" target="_blank">Fixed width and height</a>
    * @since 4.0.4
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/" target="_blank">Inherit from series color (null)</a>
    */
  val lineColor: js.UndefOr[String] = js.undefined

  /**
    * The width of the point marker's outline.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/" target="_blank">2px blue marker</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The radius of the point marker.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-radius/" target="_blank">Bigger markers</a>
    */
  val radius: js.UndefOr[Double] = js.undefined

  val states: js.UndefOr[CleanJsObject[PlotOptionsSplineMarkerStates]] = js.undefined

  /**
    * <p>A predefined shape or symbol for the marker. When null, the symbol is pulled from options.symbols. Other possible values are "circle", "square", "diamond", "triangle" and "triangle-down".</p>
    * 
    * <p>Additionally, the URL to a graphic can be given on this form:  "url(graphic.png)". Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server.</p>
    * 
    * <p>Custom callbacks for symbol path generation can also be added to <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then used by its method name, as shown in the demo.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-symbol/" target="_blank">Predefined, graphic and custom markers</a>
    */
  val symbol: js.UndefOr[String] = js.undefined

  /**
    * Image markers only. Set the image width explicitly. When using this option, a <code>height</code> must also be set.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-marker-width-height/" target="_blank">Fixed width and height</a>
    * @since 4.0.4
    */
  val width: js.UndefOr[Double] = js.undefined
}
