/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-mapbubble-marker</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMapbubbleMarker extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of the point marker&#39;s outline. When <code>undefined</code>, the
    * series&#39; or point&#39;s color is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">Inherit from series color (undefined)</a>
    */
  val lineColor: js.Any = js.undefined

  /**
    * <p>The width of the point marker&#39;s outline.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">2px blue marker</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The fill opacity of the bubble markers.</p>
    */
  val fillOpacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>States for a single point marker.</p>
    */
  val states: js.Any = js.undefined

  /**
    * <p>A predefined shape or symbol for the marker. Possible values are
    * &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and &quot;triangle-down&quot;.</p>
    * <p>Additionally, the URL to a graphic can be given on the form
    * <code>url(graphic.png)</code>. Note that for the image to be applied to exported
    * charts, its URL needs to be accessible by the export server.</p>
    * <p>Custom callbacks for symbol path generation can also be added to
    * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then
    * used by its method name, as shown in the demo.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-symbol/">Bubble chart with various symbols</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-symbol/">General chart with predefined, graphic and custom markers</a>
    * @since 5.0.11
    */
  val symbol: js.UndefOr[String] = js.undefined

  /**
    * <p>The fill color of the point marker. When <code>undefined</code>, the series&#39; or
    * point&#39;s color is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">White fill</a>
    */
  val fillColor: js.UndefOr[String | js.Object] = js.undefined
}

object PlotOptionsMapbubbleMarker {
  /**
    * @param lineColor <p>The color of the point marker&#39;s outline. When <code>undefined</code>, the. series&#39; or point&#39;s color is used.</p>
    * @param lineWidth <p>The width of the point marker&#39;s outline.</p>
    * @param fillOpacity <p>The fill opacity of the bubble markers.</p>
    * @param states <p>States for a single point marker.</p>
    * @param symbol <p>A predefined shape or symbol for the marker. Possible values are. &quot;circle&quot;, &quot;square&quot;, &quot;diamond&quot;, &quot;triangle&quot; and &quot;triangle-down&quot;.</p>. <p>Additionally, the URL to a graphic can be given on the form. <code>url(graphic.png)</code>. Note that for the image to be applied to exported. charts, its URL needs to be accessible by the export server.</p>. <p>Custom callbacks for symbol path generation can also be added to. <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then. used by its method name, as shown in the demo.</p>
    * @param fillColor <p>The fill color of the point marker. When <code>undefined</code>, the series&#39; or. point&#39;s color is used.</p>
    */
  def apply(lineColor: js.UndefOr[js.Any] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, fillOpacity: js.UndefOr[Double] = js.undefined, states: js.UndefOr[js.Any] = js.undefined, symbol: js.UndefOr[String] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined): PlotOptionsMapbubbleMarker = {
    val lineColorOuter: js.Any = lineColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val fillOpacityOuter: js.UndefOr[Double] = fillOpacity
    val statesOuter: js.Any = states
    val symbolOuter: js.UndefOr[String] = symbol
    val fillColorOuter: js.UndefOr[String | js.Object] = fillColor
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMapbubbleMarker {
      override val lineColor: js.Any = lineColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val fillOpacity: js.UndefOr[Double] = fillOpacityOuter
      override val states: js.Any = statesOuter
      override val symbol: js.UndefOr[String] = symbolOuter
      override val fillColor: js.UndefOr[String | js.Object] = fillColorOuter
    })
  }
}
