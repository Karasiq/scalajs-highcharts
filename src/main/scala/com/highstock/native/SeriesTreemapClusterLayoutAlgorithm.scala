/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;treemap&gt;-cluster-layoutAlgorithm</code>
  */
class SeriesTreemapClusterLayoutAlgorithm extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>When <code>type</code> is set to <code>kmeans</code>,
    * <code>distance</code> is a maximum distance between point and cluster center
    * so that this point will be inside the cluster. The distance
    * is either a number defining pixels or a percentage
    * defining a percentage of the plot area width.</p>
    * @since 8.0.0
    */
  var distance: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>When <code>type</code> is set to the <code>grid</code>,
    * <code>gridSize</code> is a size of a grid square element either as a number
    * defining pixels, or a percentage defining a percentage
    * of the plot area width.</p>
    * @since 8.0.0
    */
  var gridSize: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>When <code>type</code> is set to <code>kmeans</code>,
    * <code>iterations</code> are the number of iterations that this algorithm will be
    * repeated to find clusters positions.</p>
    * @since 8.0.0
    */
  var iterations: js.UndefOr[Double] = js.undefined

  /**
    * <p>When <code>type</code> is set to <code>undefined</code> and there are more visible points
    * than the kmeansThreshold the <code>grid</code> algorithm is used to find
    * clusters, otherwise <code>kmeans</code>. It ensures good performance on
    * large datasets and better clusters arrangement after the zoom.</p>
    * @since 8.0.0
    */
  var kmeansThreshold: js.UndefOr[Double] = js.undefined

  /**
    * <p>Type of the algorithm used to combine points into a cluster.
    * There are three available algorithms:</p>
    * <ol>
    * <li><p><code>grid</code> - grid-based clustering technique. Points are assigned
    * to squares of set size depending on their position on the plot
    * area. Points inside the grid square are combined into a cluster.
    * The grid size can be controlled by <code>gridSize</code> property
    * (grid size changes at certain zoom levels).</p>
    * </li>
    * <li><p><code>kmeans</code> - based on K-Means clustering technique. In the
    * first step, points are divided using the grid method (distance
    * property is a grid size) to find the initial amount of clusters.
    * Next, each point is classified by computing the distance between
    * each cluster center and that point. When the closest cluster
    * distance is lower than distance property set by a user the point
    * is added to this cluster otherwise is classified as <code>noise</code>. The
    * algorithm is repeated until each cluster center not change its
    * previous position more than one pixel. This technique is more
    * accurate but also more time consuming than the <code>grid</code> algorithm,
    * especially for big datasets.</p>
    * </li>
    * <li><p><code>optimizedKmeans</code> - based on K-Means clustering technique. This
    * algorithm uses k-means algorithm only on the chart initialization
    * or when chart extremes have greater range than on initialization.
    * When a chart is redrawn the algorithm checks only clustered points
    * distance from the cluster center and rebuild it when the point is
    * spaced enough to be outside the cluster. It provides performance
    * improvement and more stable clusters position yet can be used rather
    * on small and sparse datasets.</p>
    * </li>
    * </ol>
    * <p>By default, the algorithm depends on visible quantity of points
    * and <code>kmeansThreshold</code>. When there are more visible points than the
    * <code>kmeansThreshold</code> the <code>grid</code> algorithm is used, otherwise <code>kmeans</code>.</p>
    * <p>The custom clustering algorithm can be added by assigning a callback
    * function as the type property. This function takes an array of
    * <code>processedXData</code>, <code>processedYData</code>, <code>processedXData</code> indexes and
    * <code>layoutAlgorithm</code> options as arguments and should return an object
    * with grouped data.</p>
    * <p>The algorithm should return an object like that:</p>
    * <pre>{
    *  clusterId1: [{
    *      x: 573,
    *      y: 285,
    *      index: 1 // point index in the data array
    *  }, {
    *      x: 521,
    *      y: 197,
    *      index: 2
    *  }],
    *  clusterId2: [{
    *      ...
    *  }]
    *  ...
    * }</pre>
    * 
    * <p><code>clusterId</code> (example above - unique id of a cluster or noise)
    * is an array of points belonging to a cluster. If the
    * array has only one point or fewer points than set in
    * <code>cluster.minimumClusterSize</code> it won&#39;t be combined into a cluster.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/marker-clusters/optimized-kmeans">Optimized K-Means algorithm</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/marker-clusters/kmeans">K-Means algorithm</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/marker-clusters/grid">Grid algorithm</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/marker-clusters/custom-alg">Custom algorithm</a>
    * @since 8.0.0
    */
  var `type`: js.UndefOr[String | js.Function] = js.undefined
}

object SeriesTreemapClusterLayoutAlgorithm {
  /**
    * @param distance <p>When <code>type</code> is set to <code>kmeans</code>,. <code>distance</code> is a maximum distance between point and cluster center. so that this point will be inside the cluster. The distance. is either a number defining pixels or a percentage. defining a percentage of the plot area width.</p>
    * @param gridSize <p>When <code>type</code> is set to the <code>grid</code>,. <code>gridSize</code> is a size of a grid square element either as a number. defining pixels, or a percentage defining a percentage. of the plot area width.</p>
    * @param iterations <p>When <code>type</code> is set to <code>kmeans</code>,. <code>iterations</code> are the number of iterations that this algorithm will be. repeated to find clusters positions.</p>
    * @param kmeansThreshold <p>When <code>type</code> is set to <code>undefined</code> and there are more visible points. than the kmeansThreshold the <code>grid</code> algorithm is used to find. clusters, otherwise <code>kmeans</code>. It ensures good performance on. large datasets and better clusters arrangement after the zoom.</p>
    * @param `type` <p>Type of the algorithm used to combine points into a cluster.. There are three available algorithms:</p>. <ol>. <li><p><code>grid</code> - grid-based clustering technique. Points are assigned. to squares of set size depending on their position on the plot. area. Points inside the grid square are combined into a cluster.. The grid size can be controlled by <code>gridSize</code> property. (grid size changes at certain zoom levels).</p>. </li>. <li><p><code>kmeans</code> - based on K-Means clustering technique. In the. first step, points are divided using the grid method (distance. property is a grid size) to find the initial amount of clusters.. Next, each point is classified by computing the distance between. each cluster center and that point. When the closest cluster. distance is lower than distance property set by a user the point. is added to this cluster otherwise is classified as <code>noise</code>. The. algorithm is repeated until each cluster center not change its. previous position more than one pixel. This technique is more. accurate but also more time consuming than the <code>grid</code> algorithm,. especially for big datasets.</p>. </li>. <li><p><code>optimizedKmeans</code> - based on K-Means clustering technique. This. algorithm uses k-means algorithm only on the chart initialization. or when chart extremes have greater range than on initialization.. When a chart is redrawn the algorithm checks only clustered points. distance from the cluster center and rebuild it when the point is. spaced enough to be outside the cluster. It provides performance. improvement and more stable clusters position yet can be used rather. on small and sparse datasets.</p>. </li>. </ol>. <p>By default, the algorithm depends on visible quantity of points. and <code>kmeansThreshold</code>. When there are more visible points than the. <code>kmeansThreshold</code> the <code>grid</code> algorithm is used, otherwise <code>kmeans</code>.</p>. <p>The custom clustering algorithm can be added by assigning a callback. function as the type property. This function takes an array of. <code>processedXData</code>, <code>processedYData</code>, <code>processedXData</code> indexes and. <code>layoutAlgorithm</code> options as arguments and should return an object. with grouped data.</p>. <p>The algorithm should return an object like that:</p>. <pre>{.  clusterId1: [{.      x: 573,.      y: 285,.      index: 1 // point index in the data array.  }, {.      x: 521,.      y: 197,.      index: 2.  }],.  clusterId2: [{.      ....  }].  .... }</pre>. . <p><code>clusterId</code> (example above - unique id of a cluster or noise). is an array of points belonging to a cluster. If the. array has only one point or fewer points than set in. <code>cluster.minimumClusterSize</code> it won&#39;t be combined into a cluster.</p>
    */
  def apply(distance: js.UndefOr[Double | String] = js.undefined, gridSize: js.UndefOr[Double | String] = js.undefined, iterations: js.UndefOr[Double] = js.undefined, kmeansThreshold: js.UndefOr[Double] = js.undefined, `type`: js.UndefOr[String | js.Function] = js.undefined): SeriesTreemapClusterLayoutAlgorithm = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapClusterLayoutAlgorithm {
      this.distance = distance
      this.gridSize = gridSize
      this.iterations = iterations
      this.kmeansThreshold = kmeansThreshold
      this.`type` = `type`
    })
  }
}
