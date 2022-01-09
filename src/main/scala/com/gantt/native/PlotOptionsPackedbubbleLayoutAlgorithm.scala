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
  * @note JavaScript name: <code>plotOptions-packedbubble-layoutAlgorithm</code>
  */
class PlotOptionsPackedbubbleLayoutAlgorithm extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The distance between two bubbles, when the algorithm starts to
    * treat two bubbles as overlapping. The <code>bubblePadding</code> is also the
    * expected distance between all the bubbles on simulation end.</p>
    * @since 7.1.0
    */
  var bubblePadding: js.UndefOr[Double] = js.undefined

  /**
    * <p>In case of split series, this option allows user to drag and
    * drop points between series, for changing point related series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-packedbubble/packed-dashboard/">Example of drag'n drop bubbles for bubble kanban</a>
    * @since 7.1.0
    */
  var dragBetweenSeries: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Experimental. Enables live simulation of the algorithm
    * implementation. All nodes are animated as the forces applies on
    * them.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/network-graph/">Live simulation enabled</a>
    * @since 7.1.0
    */
  var enableSimulation: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Friction applied on forces to prevent nodes rushing to fast to
    * the desired positions.</p>
    * @since 7.1.0
    */
  var friction: js.UndefOr[Double] = js.undefined

  /**
    * <p>Gravitational const used in the barycenter force of the
    * algorithm.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/forces/">Custom forces with Euler integration</a>
    * @since 7.1.0
    */
  var gravitationalConstant: js.UndefOr[Double] = js.undefined

  /**
    * <p>When <code>initialPositions</code> are set to &#39;circle&#39;,
    * <code>initialPositionRadius</code> is a distance from the center of circle,
    * in which nodes are created.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-packedbubble/initial-radius/">Initial radius set to 200</a>
    * @since 7.1.0
    */
  var initialPositionRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>Initial layout algorithm for positioning nodes. Can be one of
    * the built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where
    * positions should be set on each node (<code>this.nodes</code>) as
    * <code>node.plotX</code> and <code>node.plotY</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/initial-positions/">Initial positions with callback</a>
    * @since 7.1.0
    */
  var initialPositions: js.UndefOr[String | js.Function] = js.undefined

  /**
    * <p>Max number of iterations before algorithm will stop. In general,
    * algorithm should find positions sooner, but when rendering huge
    * number of nodes, it is recommended to increase this value as
    * finding perfect graph positions can require more time.</p>
    * @since 7.1.0
    */
  var maxIterations: js.UndefOr[Double] = js.undefined

  /**
    * <p>Max speed that node can get in one iteration. In terms of
    * simulation, it&#39;s a maximum translation (in pixels) that a node
    * can move (in both, x and y, dimensions). While <code>friction</code> is
    * applied on all nodes, max speed is applied only for nodes that
    * move very fast, for example small or disconnected ones.</p>
    * @since 7.1.0
    */
  var maxSpeed: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether bubbles should interact with their parentNode to keep
    * them inside.</p>
    * @since 7.1.0
    */
  var parentNodeLimit: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Layout algorithm options for parent nodes.</p>
    * @since 7.1.0
    */
  var parentNodeOptions: js.UndefOr[CleanJsObject[PlotOptionsPackedbubbleLayoutAlgorithmParentNodeOptions]] = js.undefined

  /**
    * <p>Whether series should interact with each other or not. When
    * <code>parentNodeLimit</code> is set to true, thi option should be set to
    * false to avoid sticking points in wrong series parentNode.</p>
    * @since 7.1.0
    */
  var seriesInteraction: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to split series into individual groups or to mix all
    * series together.</p>
    * @since 7.1.0
    */
  var splitSeries: js.UndefOr[String] = js.undefined

  /**
    * <p>Integration type. Available options are <code>&#39;euler&#39;</code> and <code>&#39;verlet&#39;</code>.
    * Integration determines how forces are applied on particles. In
    * Euler integration, force is applied direct as
    * <code>newPosition += velocity;</code>.
    * In Verlet integration, new position is based on a previous
    * posittion without velocity:
    * <code>newPosition += previousPosition - newPosition</code>.</p>
    * <p>Note that different integrations give different results as forces
    * are different.</p>
    * <p>In Highcharts v7.0.x only <code>&#39;euler&#39;</code> integration was supported.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/integration-comparison/">Comparison of Verlet and Euler integrations</a>
    * @since 7.1.0
    */
  var integration: js.UndefOr[String] = js.undefined

  /**
    * <p>Ideal length (px) of the link between two nodes. When not
    * defined, length is calculated as:
    * <code>Math.pow(availableWidth * availableHeight / nodesLength, 0.4);</code></p>
    * <p>Note: Because of the algorithm specification, length of each link
    * might be not exactly as specified.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/styled-links/">Numerical values</a>
    * @since 7.1.0
    */
  var linkLength: js.UndefOr[Double] = js.undefined

  /**
    * <p>Type of the algorithm used when positioning nodes.</p>
    * @since 7.1.0
    */
  var `type`: js.UndefOr[String] = "reingold-fruchterman"
}

object PlotOptionsPackedbubbleLayoutAlgorithm {
  /**
    * @param bubblePadding <p>The distance between two bubbles, when the algorithm starts to. treat two bubbles as overlapping. The <code>bubblePadding</code> is also the. expected distance between all the bubbles on simulation end.</p>
    * @param dragBetweenSeries <p>In case of split series, this option allows user to drag and. drop points between series, for changing point related series.</p>
    * @param enableSimulation <p>Experimental. Enables live simulation of the algorithm. implementation. All nodes are animated as the forces applies on. them.</p>
    * @param friction <p>Friction applied on forces to prevent nodes rushing to fast to. the desired positions.</p>
    * @param gravitationalConstant <p>Gravitational const used in the barycenter force of the. algorithm.</p>
    * @param initialPositionRadius <p>When <code>initialPositions</code> are set to &#39;circle&#39;,. <code>initialPositionRadius</code> is a distance from the center of circle,. in which nodes are created.</p>
    * @param initialPositions <p>Initial layout algorithm for positioning nodes. Can be one of. the built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where. positions should be set on each node (<code>this.nodes</code>) as. <code>node.plotX</code> and <code>node.plotY</code>.</p>
    * @param maxIterations <p>Max number of iterations before algorithm will stop. In general,. algorithm should find positions sooner, but when rendering huge. number of nodes, it is recommended to increase this value as. finding perfect graph positions can require more time.</p>
    * @param maxSpeed <p>Max speed that node can get in one iteration. In terms of. simulation, it&#39;s a maximum translation (in pixels) that a node. can move (in both, x and y, dimensions). While <code>friction</code> is. applied on all nodes, max speed is applied only for nodes that. move very fast, for example small or disconnected ones.</p>
    * @param parentNodeLimit <p>Whether bubbles should interact with their parentNode to keep. them inside.</p>
    * @param parentNodeOptions <p>Layout algorithm options for parent nodes.</p>
    * @param seriesInteraction <p>Whether series should interact with each other or not. When. <code>parentNodeLimit</code> is set to true, thi option should be set to. false to avoid sticking points in wrong series parentNode.</p>
    * @param splitSeries <p>Whether to split series into individual groups or to mix all. series together.</p>
    * @param integration <p>Integration type. Available options are <code>&#39;euler&#39;</code> and <code>&#39;verlet&#39;</code>.. Integration determines how forces are applied on particles. In. Euler integration, force is applied direct as. <code>newPosition += velocity;</code>.. In Verlet integration, new position is based on a previous. posittion without velocity:. <code>newPosition += previousPosition - newPosition</code>.</p>. <p>Note that different integrations give different results as forces. are different.</p>. <p>In Highcharts v7.0.x only <code>&#39;euler&#39;</code> integration was supported.</p>
    * @param linkLength <p>Ideal length (px) of the link between two nodes. When not. defined, length is calculated as:. <code>Math.pow(availableWidth * availableHeight / nodesLength, 0.4);</code></p>. <p>Note: Because of the algorithm specification, length of each link. might be not exactly as specified.</p>
    * @param `type` <p>Type of the algorithm used when positioning nodes.</p>
    */
  def apply(bubblePadding: js.UndefOr[Double] = js.undefined, dragBetweenSeries: js.UndefOr[Boolean] = js.undefined, enableSimulation: js.UndefOr[Boolean] = js.undefined, friction: js.UndefOr[Double] = js.undefined, gravitationalConstant: js.UndefOr[Double] = js.undefined, initialPositionRadius: js.UndefOr[Double] = js.undefined, initialPositions: js.UndefOr[String | js.Function] = js.undefined, maxIterations: js.UndefOr[Double] = js.undefined, maxSpeed: js.UndefOr[Double] = js.undefined, parentNodeLimit: js.UndefOr[Boolean] = js.undefined, parentNodeOptions: js.UndefOr[CleanJsObject[PlotOptionsPackedbubbleLayoutAlgorithmParentNodeOptions]] = js.undefined, seriesInteraction: js.UndefOr[Boolean] = js.undefined, splitSeries: js.UndefOr[String] = js.undefined, integration: js.UndefOr[String] = js.undefined, linkLength: js.UndefOr[Double] = js.undefined, `type`: js.UndefOr[String] = "reingold-fruchterman"): PlotOptionsPackedbubbleLayoutAlgorithm = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPackedbubbleLayoutAlgorithm {
      this.bubblePadding = bubblePadding
      this.dragBetweenSeries = dragBetweenSeries
      this.enableSimulation = enableSimulation
      this.friction = friction
      this.gravitationalConstant = gravitationalConstant
      this.initialPositionRadius = initialPositionRadius
      this.initialPositions = initialPositions
      this.maxIterations = maxIterations
      this.maxSpeed = maxSpeed
      this.parentNodeLimit = parentNodeLimit
      this.parentNodeOptions = parentNodeOptions
      this.seriesInteraction = seriesInteraction
      this.splitSeries = splitSeries
      this.integration = integration
      this.linkLength = linkLength
      this.`type` = `type`
    })
  }
}
