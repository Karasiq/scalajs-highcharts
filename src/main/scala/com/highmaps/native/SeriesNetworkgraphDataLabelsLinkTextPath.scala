/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;networkgraph&gt;-dataLabels-linkTextPath</code>
  */
class SeriesNetworkgraphDataLabelsLinkTextPath extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable <code>textPath</code> option for link&#39;s or marker&#39;s data
    * labels.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Presentation attributes for the text path.</p>
    * @since 7.1.0
    */
  var attributes: js.UndefOr[js.Object] = js.undefined
}

object SeriesNetworkgraphDataLabelsLinkTextPath {
  /**
    * @param enabled <p>Enable or disable <code>textPath</code> option for link&#39;s or marker&#39;s data. labels.</p>
    * @param attributes <p>Presentation attributes for the text path.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, attributes: js.UndefOr[js.Object] = js.undefined): SeriesNetworkgraphDataLabelsLinkTextPath = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesNetworkgraphDataLabelsLinkTextPath {
      this.enabled = enabled
      this.attributes = attributes
    })
  }
}
