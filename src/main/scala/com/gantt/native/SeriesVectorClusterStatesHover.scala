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
  * @note JavaScript name: <code>series&lt;vector&gt;-cluster-states-hover</code>
  */
class SeriesVectorClusterStatesHover extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The fill color of the cluster marker in hover state. When
    * <code>undefined</code>, the series&#39; or point&#39;s fillColor for normal
    * state is used.</p>
    * @since 8.0.0
    */
  var fillColor: js.Any = js.undefined
}

object SeriesVectorClusterStatesHover {
  /**
    * @param fillColor <p>The fill color of the cluster marker in hover state. When. <code>undefined</code>, the series&#39; or point&#39;s fillColor for normal. state is used.</p>
    */
  def apply(fillColor: js.UndefOr[js.Any] = js.undefined): SeriesVectorClusterStatesHover = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVectorClusterStatesHover {
      this.fillColor = fillColor
    })
  }
}
