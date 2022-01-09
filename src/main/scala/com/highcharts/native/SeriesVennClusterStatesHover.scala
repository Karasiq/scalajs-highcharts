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
  * @note JavaScript name: <code>series&lt;venn&gt;-cluster-states-hover</code>
  */
class SeriesVennClusterStatesHover extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The fill color of the cluster marker in hover state. When
    * <code>undefined</code>, the series&#39; or point&#39;s fillColor for normal
    * state is used.</p>
    * @since 8.0.0
    */
  var fillColor: js.Any = js.undefined
}

object SeriesVennClusterStatesHover {
  /**
    * @param fillColor <p>The fill color of the cluster marker in hover state. When. <code>undefined</code>, the series&#39; or point&#39;s fillColor for normal. state is used.</p>
    */
  def apply(fillColor: js.UndefOr[js.Any] = js.undefined): SeriesVennClusterStatesHover = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVennClusterStatesHover {
      this.fillColor = fillColor
    })
  }
}
