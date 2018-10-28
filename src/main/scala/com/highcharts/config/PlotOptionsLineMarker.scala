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
  * @note JavaScript name: <code>plotOptions-line-marker</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsLineMarker extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The width of the point marker&#39;s outline.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">2px blue marker</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the point marker&#39;s outline. When <code>undefined</code>, the
    * series&#39; or point&#39;s color is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">Inherit from series color (undefined)</a>
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The threshold for how dense the point markers should be before they
    * are hidden, given that <code>enabled</code> is not defined. The number indicates
    * the horizontal distance between the two closest points in the series,
    * as multiples of the <code>marker.radius</code>. In other words, the default
    * value of 2 means points are hidden if overlapping horizontally.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabledthreshold">A higher threshold</a>
    * @since 6.0.5
    */
  val enabledThreshold: js.UndefOr[Double] = js.undefined

  /**
    * <p>The radius of the point marker.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-radius/">Bigger markers</a>
    */
  val radius: js.UndefOr[Double] = js.undefined

  /**
    * <p>States for a single point marker.</p>
    */
  val states: js.Any = js.undefined

  /**
    * <p>The fill color of the point marker. When <code>undefined</code>, the series&#39; or
    * point&#39;s color is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">White fill</a>
    */
  val fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Enable or disable the point marker. If <code>undefined</code>, the markers are
    * hidden when the data is dense, and shown for more widespread data
    * points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabled/">Disabled markers</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabled-false/">Disabled in normal state but enabled on hover</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-marker/">Enabled markers</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Image markers only. Set the image width explicitly. When using this
    * option, a <code>width</code> must also be set.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a>
    * @since 4.0.4
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * <p>A predefined shape or symbol for the marker. When undefined, the
    * symbol is pulled from options.symbols. Other possible values are
    * &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and &quot;triangle-down&quot;.</p>
    * <p>Additionally, the URL to a graphic can be given on this form:
    * &quot;url(graphic.png)&quot;. Note that for the image to be applied to exported
    * charts, its URL needs to be accessible by the export server.</p>
    * <p>Custom callbacks for symbol path generation can also be added to
    * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then
    * used by its method name, as shown in the demo.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-symbol/">Predefined, graphic and custom markers</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-symbol/">Predefined, graphic and custom markers</a>
    */
  val symbol: js.UndefOr[String] = js.undefined

  /**
    * <p>Image markers only. Set the image width explicitly. When using this
    * option, a <code>height</code> must also be set.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a>
    * @since 4.0.4
    */
  val width: js.UndefOr[Double] = js.undefined
}

object PlotOptionsLineMarker {
  /**
    * @param lineWidth <p>The width of the point marker&#39;s outline.</p>
    * @param lineColor <p>The color of the point marker&#39;s outline. When <code>undefined</code>, the. series&#39; or point&#39;s color is used.</p>
    * @param enabledThreshold <p>The threshold for how dense the point markers should be before they. are hidden, given that <code>enabled</code> is not defined. The number indicates. the horizontal distance between the two closest points in the series,. as multiples of the <code>marker.radius</code>. In other words, the default. value of 2 means points are hidden if overlapping horizontally.</p>
    * @param radius <p>The radius of the point marker.</p>
    * @param states <p>States for a single point marker.</p>
    * @param fillColor <p>The fill color of the point marker. When <code>undefined</code>, the series&#39; or. point&#39;s color is used.</p>
    * @param enabled <p>Enable or disable the point marker. If <code>undefined</code>, the markers are. hidden when the data is dense, and shown for more widespread data. points.</p>
    * @param height <p>Image markers only. Set the image width explicitly. When using this. option, a <code>width</code> must also be set.</p>
    * @param symbol <p>A predefined shape or symbol for the marker. When undefined, the. symbol is pulled from options.symbols. Other possible values are. &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and &quot;triangle-down&quot;.</p>. <p>Additionally, the URL to a graphic can be given on this form:. &quot;url(graphic.png)&quot;. Note that for the image to be applied to exported. charts, its URL needs to be accessible by the export server.</p>. <p>Custom callbacks for symbol path generation can also be added to. <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then. used by its method name, as shown in the demo.</p>
    * @param width <p>Image markers only. Set the image width explicitly. When using this. option, a <code>height</code> must also be set.</p>
    */
  def apply(lineWidth: js.UndefOr[Double] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, enabledThreshold: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[Double] = js.undefined, states: js.UndefOr[js.Any] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, height: js.UndefOr[Double] = js.undefined, symbol: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double] = js.undefined): PlotOptionsLineMarker = {
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val enabledThresholdOuter: js.UndefOr[Double] = enabledThreshold
    val radiusOuter: js.UndefOr[Double] = radius
    val statesOuter: js.Any = states
    val fillColorOuter: js.UndefOr[String | js.Object] = fillColor
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val heightOuter: js.UndefOr[Double] = height
    val symbolOuter: js.UndefOr[String] = symbol
    val widthOuter: js.UndefOr[Double] = width
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsLineMarker {
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val enabledThreshold: js.UndefOr[Double] = enabledThresholdOuter
      override val radius: js.UndefOr[Double] = radiusOuter
      override val states: js.Any = statesOuter
      override val fillColor: js.UndefOr[String | js.Object] = fillColorOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val symbol: js.UndefOr[String] = symbolOuter
      override val width: js.UndefOr[Double] = widthOuter
    })
  }
}
