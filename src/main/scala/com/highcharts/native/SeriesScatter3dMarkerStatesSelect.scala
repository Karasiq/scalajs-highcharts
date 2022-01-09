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
  * @note JavaScript name: <code>series&lt;scatter3d&gt;-marker-states-select</code>
  */
class SeriesScatter3dMarkerStatesSelect extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable visible feedback for selection.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-enabled/">Disabled select state</a>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The fill color of the point marker.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-fillcolor/">Solid red discs for selected points</a>
    */
  var fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the point marker&#39;s outline. When
    * <code>undefined</code>, the series&#39; or point&#39;s color is used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-linecolor/">Red line color for selected points</a>
    */
  var lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the point marker&#39;s outline.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-linewidth/">3px line width for selected points</a>
    */
  var lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The radius of the point marker. In hover state, it
    * defaults to the normal state&#39;s radius + 2.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-radius/">10px radius for selected points</a>
    */
  var radius: js.UndefOr[Double] = js.undefined
}

object SeriesScatter3dMarkerStatesSelect {
  /**
    * @param enabled <p>Enable or disable visible feedback for selection.</p>
    * @param fillColor <p>The fill color of the point marker.</p>
    * @param lineColor <p>The color of the point marker&#39;s outline. When. <code>undefined</code>, the series&#39; or point&#39;s color is used.</p>
    * @param lineWidth <p>The width of the point marker&#39;s outline.</p>
    * @param radius <p>The radius of the point marker. In hover state, it. defaults to the normal state&#39;s radius + 2.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[Double] = js.undefined): SeriesScatter3dMarkerStatesSelect = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesScatter3dMarkerStatesSelect {
      this.enabled = enabled
      this.fillColor = fillColor
      this.lineColor = lineColor
      this.lineWidth = lineWidth
      this.radius = radius
    })
  }
}
