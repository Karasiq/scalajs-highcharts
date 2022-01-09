/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;mapline&gt;-dataLabels-textPath</code>
  */
class SeriesMaplineDataLabelsTextPath extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Presentation attributes for the text path.</p>
    * @since 7.1.0
    */
  var attributes: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Enable or disable <code>textPath</code> option for link&#39;s or marker&#39;s data
    * labels.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object SeriesMaplineDataLabelsTextPath {
  /**
    * @param attributes <p>Presentation attributes for the text path.</p>
    * @param enabled <p>Enable or disable <code>textPath</code> option for link&#39;s or marker&#39;s data. labels.</p>
    */
  def apply(attributes: js.UndefOr[js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined): SeriesMaplineDataLabelsTextPath = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMaplineDataLabelsTextPath {
      this.attributes = attributes
      this.enabled = enabled
    })
  }
}
