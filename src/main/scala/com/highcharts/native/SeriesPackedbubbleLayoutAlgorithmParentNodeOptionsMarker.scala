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
  * @note JavaScript name: <code>series&lt;packedbubble&gt;-layoutAlgorithm-parentNodeOptions-marker</code>
  */
class SeriesPackedbubbleLayoutAlgorithmParentNodeOptionsMarker extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The fill color of the point marker. When <code>undefined</code>, the series&#39;
    * or point&#39;s color is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">White fill</a>
    * @since 7.1.0
    */
  var fillColor: js.Any = js.undefined

  var fillOpacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the point marker&#39;s outline. When <code>undefined</code>, the
    * series&#39; or point&#39;s color is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">Inherit from series color (undefined)</a>
    * @since 7.1.0
    */
  var lineColor: js.Any = js.undefined

  /**
    * <p>The width of the point marker&#39;s outline.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">2px blue marker</a>
    * @since 7.1.0
    */
  var lineWidth: js.Any = js.undefined

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
    * @since 7.1.0
    */
  var symbol: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable the point marker. If <code>undefined</code>, the markers
    * are hidden when the data is dense, and shown for more widespread
    * data points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabled/">Disabled markers</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabled-false/">Disabled in normal state but enabled on hover</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-marker/">Enabled markers</a>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The threshold for how dense the point markers should be before
    * they are hidden, given that <code>enabled</code> is not defined. The number
    * indicates the horizontal distance between the two closest points
    * in the series, as multiples of the <code>marker.radius</code>. In other
    * words, the default value of 2 means points are hidden if
    * overlapping horizontally.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabledthreshold">A higher threshold</a>
    * @since 6.0.5
    */
  var enabledThreshold: js.UndefOr[Double] = js.undefined

  /**
    * <p>Image markers only. Set the image width explicitly. When using
    * this option, a <code>width</code> must also be set.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a>
    * @since 4.0.4
    */
  var height: js.UndefOr[Double] = js.undefined

  /**
    * <p>The radius of the point marker.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-radius/">Bigger markers</a>
    * @since 7.1.0
    */
  var radius: js.UndefOr[Double] = js.undefined

  /**
    * <p>Image markers only. Set the image width explicitly. When using
    * this option, a <code>height</code> must also be set.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a>
    * @since 4.0.4
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SeriesPackedbubbleLayoutAlgorithmParentNodeOptionsMarker {
  /**
    * @param fillColor <p>The fill color of the point marker. When <code>undefined</code>, the series&#39;. or point&#39;s color is used.</p>
    * @param lineColor <p>The color of the point marker&#39;s outline. When <code>undefined</code>, the. series&#39; or point&#39;s color is used.</p>
    * @param lineWidth <p>The width of the point marker&#39;s outline.</p>
    * @param symbol <p>A predefined shape or symbol for the marker. When undefined, the. symbol is pulled from options.symbols. Other possible values are. <code>&#39;circle&#39;</code>, <code>&#39;square&#39;</code>,<code>&#39;diamond&#39;</code>, <code>&#39;triangle&#39;</code> and. <code>&#39;triangle-down&#39;</code>.</p>. <p>Additionally, the URL to a graphic can be given on this form:. <code>&#39;url(graphic.png)&#39;</code>. Note that for the image to be applied to. exported charts, its URL needs to be accessible by the export. server.</p>. <p>Custom callbacks for symbol path generation can also be added to. <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then. used by its method name, as shown in the demo.</p>
    * @param enabled <p>Enable or disable the point marker. If <code>undefined</code>, the markers. are hidden when the data is dense, and shown for more widespread. data points.</p>
    * @param enabledThreshold <p>The threshold for how dense the point markers should be before. they are hidden, given that <code>enabled</code> is not defined. The number. indicates the horizontal distance between the two closest points. in the series, as multiples of the <code>marker.radius</code>. In other. words, the default value of 2 means points are hidden if. overlapping horizontally.</p>
    * @param height <p>Image markers only. Set the image width explicitly. When using. this option, a <code>width</code> must also be set.</p>
    * @param radius <p>The radius of the point marker.</p>
    * @param width <p>Image markers only. Set the image width explicitly. When using. this option, a <code>height</code> must also be set.</p>
    */
  def apply(fillColor: js.UndefOr[js.Any] = js.undefined, fillOpacity: js.UndefOr[Double] = js.undefined, lineColor: js.UndefOr[js.Any] = js.undefined, lineWidth: js.UndefOr[js.Any] = js.undefined, symbol: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, enabledThreshold: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): SeriesPackedbubbleLayoutAlgorithmParentNodeOptionsMarker = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPackedbubbleLayoutAlgorithmParentNodeOptionsMarker {
      this.fillColor = fillColor
      this.fillOpacity = fillOpacity
      this.lineColor = lineColor
      this.lineWidth = lineWidth
      this.symbol = symbol
      this.enabled = enabled
      this.enabledThreshold = enabledThreshold
      this.height = height
      this.radius = radius
      this.width = width
    })
  }
}