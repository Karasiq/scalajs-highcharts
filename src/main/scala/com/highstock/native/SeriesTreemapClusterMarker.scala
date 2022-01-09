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
  * @note JavaScript name: <code>series&lt;treemap&gt;-cluster-marker</code>
  */
class SeriesTreemapClusterMarker extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of the point marker&#39;s outline. When <code>undefined</code>, the
    * series&#39; or point&#39;s color is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">Inherit from series color (undefined)</a>
    * @since 8.0.0
    */
  var lineColor: js.UndefOr[String] = js.undefined

  /**
    * <p>The width of the point marker&#39;s outline.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">2px blue marker</a>
    * @since 8.0.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The radius of the point marker.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-radius/">Bigger markers</a>
    * @since 8.0.0
    */
  var radius: js.UndefOr[Double] = js.undefined

  /**
    * <p>A predefined shape or symbol for the marker. When undefined, the
    * symbol is pulled from options.symbols. Other possible values are
    * <code>&#39;circle&#39;</code>, <code>&#39;square&#39;</code>,<code>&#39;diamond&#39;</code>, <code>&#39;triangle&#39;</code> and
    * <code>&#39;triangle-down&#39;</code>.</p>
    * <p>Additionally, the URL to a graphic can be given on this form:
    * <code>&#39;url(graphic.png)&#39;</code>. Note that for the image to be applied to
    * exported charts, its URL needs to be accessible by the export
    * server.</p>
    * <p>Custom callbacks for symbol path generation can also be added to
    * <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then
    * used by its method name, as shown in the demo.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-symbol/">Predefined, graphic and custom markers</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-symbol/">Predefined, graphic and custom markers</a>
    * @since 8.0.0
    */
  var symbol: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable the point marker. If <code>undefined</code>, the markers
    * are hidden when the data is dense, and shown for more widespread
    * data points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabled/">Disabled markers</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabled-false/">Disabled in normal state but enabled on hover</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-marker/">Enabled markers</a>
    * @since 8.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The fill color of the point marker. When <code>undefined</code>, the series&#39;
    * or point&#39;s color is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">White fill</a>
    * @since 8.0.0
    */
  var fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Image markers only. Set the image width explicitly. When using
    * this option, a <code>width</code> must also be set.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a>
    * @since 4.0.4
    */
  var height: js.UndefOr[Double] = js.undefined

  /**
    * <p>Image markers only. Set the image width explicitly. When using
    * this option, a <code>height</code> must also be set.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a>
    * @since 4.0.4
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SeriesTreemapClusterMarker {
  /**
    * @param lineColor <p>The color of the point marker&#39;s outline. When <code>undefined</code>, the. series&#39; or point&#39;s color is used.</p>
    * @param lineWidth <p>The width of the point marker&#39;s outline.</p>
    * @param radius <p>The radius of the point marker.</p>
    * @param symbol <p>A predefined shape or symbol for the marker. When undefined, the. symbol is pulled from options.symbols. Other possible values are. <code>&#39;circle&#39;</code>, <code>&#39;square&#39;</code>,<code>&#39;diamond&#39;</code>, <code>&#39;triangle&#39;</code> and. <code>&#39;triangle-down&#39;</code>.</p>. <p>Additionally, the URL to a graphic can be given on this form:. <code>&#39;url(graphic.png)&#39;</code>. Note that for the image to be applied to. exported charts, its URL needs to be accessible by the export. server.</p>. <p>Custom callbacks for symbol path generation can also be added to. <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then. used by its method name, as shown in the demo.</p>
    * @param enabled <p>Enable or disable the point marker. If <code>undefined</code>, the markers. are hidden when the data is dense, and shown for more widespread. data points.</p>
    * @param fillColor <p>The fill color of the point marker. When <code>undefined</code>, the series&#39;. or point&#39;s color is used.</p>
    * @param height <p>Image markers only. Set the image width explicitly. When using. this option, a <code>width</code> must also be set.</p>
    * @param width <p>Image markers only. Set the image width explicitly. When using. this option, a <code>height</code> must also be set.</p>
    */
  def apply(lineColor: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[Double] = js.undefined, symbol: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): SeriesTreemapClusterMarker = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapClusterMarker {
      this.lineColor = lineColor
      this.lineWidth = lineWidth
      this.radius = radius
      this.symbol = symbol
      this.enabled = enabled
      this.fillColor = fillColor
      this.height = height
      this.width = width
    })
  }
}