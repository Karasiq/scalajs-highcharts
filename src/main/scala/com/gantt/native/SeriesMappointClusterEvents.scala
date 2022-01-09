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
  * @note JavaScript name: <code>series&lt;mappoint&gt;-cluster-events</code>
  */
class SeriesMappointClusterEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Fires when the cluster point is clicked and <code>drillToCluster</code> is enabled.
    * One parameter, <code>event</code>, is passed to the function. The default action
    * is to zoom to the cluster points range. This can be prevented
    * by calling <code>event.preventDefault()</code>.</p>
    * @since 8.0.0
    */
  var drillToCluster: js.Any = js.undefined
}

object SeriesMappointClusterEvents {
  /**
    * @param drillToCluster <p>Fires when the cluster point is clicked and <code>drillToCluster</code> is enabled.. One parameter, <code>event</code>, is passed to the function. The default action. is to zoom to the cluster points range. This can be prevented. by calling <code>event.preventDefault()</code>.</p>
    */
  def apply(drillToCluster: js.UndefOr[js.Any] = js.undefined): SeriesMappointClusterEvents = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMappointClusterEvents {
      this.drillToCluster = drillToCluster
    })
  }
}
