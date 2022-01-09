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
  * @note JavaScript name: <code>series&lt;bubble&gt;-data-marker</code>
  */
class SeriesBubbleDataMarker extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the point marker. If <code>undefined</code>, the markers
    * are hidden when the data is dense, and shown for more widespread
    * data points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabled/">Disabled markers</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabled-false/">Disabled in normal state but enabled on hover</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/plotoptions/series-marker/">Enabled markers</a>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The fill color of the point marker. When <code>undefined</code>, the series&#39;
    * or point&#39;s color is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">White fill</a>
    */
  var fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the point marker&#39;s outline. When <code>undefined</code>, the
    * series&#39; or point&#39;s color is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">Inherit from series color (undefined)</a>
    */
  var lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the point marker&#39;s outline.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">2px blue marker</a>
    */
  var lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>States for a single point marker.</p>
    */
  var states: js.Any = js.undefined

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
    */
  var symbol: js.UndefOr[String] = js.undefined
}

object SeriesBubbleDataMarker {
  /**
    * @param enabled <p>Enable or disable the point marker. If <code>undefined</code>, the markers. are hidden when the data is dense, and shown for more widespread. data points.</p>
    * @param fillColor <p>The fill color of the point marker. When <code>undefined</code>, the series&#39;. or point&#39;s color is used.</p>
    * @param lineColor <p>The color of the point marker&#39;s outline. When <code>undefined</code>, the. series&#39; or point&#39;s color is used.</p>
    * @param lineWidth <p>The width of the point marker&#39;s outline.</p>
    * @param states <p>States for a single point marker.</p>
    * @param symbol <p>A predefined shape or symbol for the marker. When undefined, the. symbol is pulled from options.symbols. Other possible values are. <code>&#39;circle&#39;</code>, <code>&#39;square&#39;</code>,<code>&#39;diamond&#39;</code>, <code>&#39;triangle&#39;</code> and. <code>&#39;triangle-down&#39;</code>.</p>. <p>Additionally, the URL to a graphic can be given on this form:. <code>&#39;url(graphic.png)&#39;</code>. Note that for the image to be applied to. exported charts, its URL needs to be accessible by the export. server.</p>. <p>Custom callbacks for symbol path generation can also be added to. <code>Highcharts.SVGRenderer.prototype.symbols</code>. The callback is then. used by its method name, as shown in the demo.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, states: js.UndefOr[js.Any] = js.undefined, symbol: js.UndefOr[String] = js.undefined): SeriesBubbleDataMarker = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBubbleDataMarker {
      this.enabled = enabled
      this.fillColor = fillColor
      this.lineColor = lineColor
      this.lineWidth = lineWidth
      this.states = states
      this.symbol = symbol
    })
  }
}
