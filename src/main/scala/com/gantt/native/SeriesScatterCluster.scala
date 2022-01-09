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
  * @note JavaScript name: <code>series&lt;scatter&gt;-cluster</code>
  */
class SeriesScatterCluster extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>When set to <code>false</code> prevent cluster overlapping - this option
    * works only when <code>layoutAlgorithm.type = &quot;grid&quot;</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/marker-clusters/grid">Prevent overlapping</a>
    * @since 8.0.0
    */
  var allowOverlap: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Options for the cluster marker animation.</p>
    * @since 8.0.0
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Options for the cluster data labels.</p>
    * @since 8.0.0
    */
  var dataLabels: js.Any = js.undefined

  /**
    * <p>Zoom the plot area to the cluster points range when a cluster is clicked.</p>
    * @since 8.0.0
    */
  var drillToCluster: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to enable the marker-clusters module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/marker-clusters/basic">Maps marker clusters</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/marker-clusters/basic">Scatter marker clusters</a>
    * @since 8.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var events: js.Any = js.undefined

  /**
    * <p>Options for layout algorithm. Inside there
    * are options to change the type of the algorithm, gridSize,
    * distance or iterations.</p>
    * @since 8.0.0
    */
  var layoutAlgorithm: js.Any = js.undefined

  /**
    * <p>Options for the cluster marker.</p>
    * @since 8.0.0
    */
  var marker: js.Any = js.undefined

  /**
    * <p>The minimum amount of points to be combined into a cluster.
    * This value has to be greater or equal to 2.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/marker-clusters/basic">At least three points in the cluster</a>
    * @since 8.0.0
    */
  var minimumClusterSize: js.UndefOr[Double] = js.undefined

  var states: js.Any = js.undefined

  /**
    * <p>An array defining zones within marker clusters.</p>
    * <p>In styled mode, the color zones are styled with the
    * <code>.highcharts-cluster-zone-{n}</code> class, or custom
    * classed from the <code>className</code>
    * option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/marker-clusters/basic">Marker clusters zones</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/marker-clusters/custom-alg">Zones on maps</a>
    * @since 8.0.0
    */
  var zones: js.UndefOr[js.Array[js.Any]] = js.undefined
}

object SeriesScatterCluster {
  /**
    * @param allowOverlap <p>When set to <code>false</code> prevent cluster overlapping - this option. works only when <code>layoutAlgorithm.type = &quot;grid&quot;</code>.</p>
    * @param animation <p>Options for the cluster marker animation.</p>
    * @param dataLabels <p>Options for the cluster data labels.</p>
    * @param drillToCluster <p>Zoom the plot area to the cluster points range when a cluster is clicked.</p>
    * @param enabled <p>Whether to enable the marker-clusters module.</p>
    * @param layoutAlgorithm <p>Options for layout algorithm. Inside there. are options to change the type of the algorithm, gridSize,. distance or iterations.</p>
    * @param marker <p>Options for the cluster marker.</p>
    * @param minimumClusterSize <p>The minimum amount of points to be combined into a cluster.. This value has to be greater or equal to 2.</p>
    * @param zones <p>An array defining zones within marker clusters.</p>. <p>In styled mode, the color zones are styled with the. <code>.highcharts-cluster-zone-{n}</code> class, or custom. classed from the <code>className</code>. option.</p>
    */
  def apply(allowOverlap: js.UndefOr[Boolean] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Any] = js.undefined, drillToCluster: js.UndefOr[Boolean] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, layoutAlgorithm: js.UndefOr[js.Any] = js.undefined, marker: js.UndefOr[js.Any] = js.undefined, minimumClusterSize: js.UndefOr[Double] = js.undefined, states: js.UndefOr[js.Any] = js.undefined, zones: js.UndefOr[js.Array[js.Any]] = js.undefined): SeriesScatterCluster = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesScatterCluster {
      this.allowOverlap = allowOverlap
      this.animation = animation
      this.dataLabels = dataLabels
      this.drillToCluster = drillToCluster
      this.enabled = enabled
      this.events = events
      this.layoutAlgorithm = layoutAlgorithm
      this.marker = marker
      this.minimumClusterSize = minimumClusterSize
      this.states = states
      this.zones = zones
    })
  }
}
