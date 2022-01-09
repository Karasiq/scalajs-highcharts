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
  * @note JavaScript name: <code>plotOptions-tema-dataLabels-textPath</code>
  */
class PlotOptionsTemaDataLabelsTextPath extends com.highcharts.HighchartsGenericObject {

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

object PlotOptionsTemaDataLabelsTextPath {
  /**
    * @param attributes <p>Presentation attributes for the text path.</p>
    * @param enabled <p>Enable or disable <code>textPath</code> option for link&#39;s or marker&#39;s data. labels.</p>
    */
  def apply(attributes: js.UndefOr[js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined): PlotOptionsTemaDataLabelsTextPath = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTemaDataLabelsTextPath {
      this.attributes = attributes
      this.enabled = enabled
    })
  }
}
