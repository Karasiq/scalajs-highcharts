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
  * @note JavaScript name: <code>series&lt;networkgraph&gt;-layoutAlgorithm</code>
  */
class SeriesNetworkgraphLayoutAlgorithm extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Approximation used to calculate repulsive forces affecting nodes.
    * By default, when calculateing net force, nodes are compared
    * against each other, which gives O(N^2) complexity. Using
    * Barnes-Hut approximation, we decrease this to O(N log N), but the
    * resulting graph will have different layout. Barnes-Hut
    * approximation divides space into rectangles via quad tree, where
    * forces exerted on nodes are calculated directly for nearby cells,
    * and for all others, cells are treated as a separate node with
    * center of mass.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/barnes-hut-approximation/">A graph with Barnes-Hut approximation</a>
    * @since 7.1.0
    */
  var approximation: js.UndefOr[String] = js.undefined

  /**
    * <p>Attraction force applied on a node which is conected to another
    * node by a link. Passed are two arguments:</p>
    * <ul>
    * <li><code>d</code> - which is current distance between two nodes</li>
    * <li><code>k</code> - which is desired distance between two nodes</li>
    * </ul>
    * <p>In <code>verlet</code> integration, defaults to:
    * <code>function (d, k) { return (k - d) / d; }</code></p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/forces/">Custom forces with Euler integration</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/cuboids/">Custom forces with Verlet integration</a>
    */
  var attractiveForce: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Experimental. Enables live simulation of the algorithm
    * implementation. All nodes are animated as the forces applies on
    * them.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/network-graph/">Live simulation enabled</a>
    */
  var enableSimulation: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Friction applied on forces to prevent nodes rushing to fast to
    * the desired positions.</p>
    */
  var friction: js.UndefOr[Double] = js.undefined

  /**
    * <p>Gravitational const used in the barycenter force of the
    * algorithm.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/forces/">Custom forces with Euler integration</a>
    */
  var gravitationalConstant: js.UndefOr[Double] = js.undefined

  /**
    * <p>When <code>initialPositions</code> are set to &#39;circle&#39;,
    * <code>initialPositionRadius</code> is a distance from the center of circle,
    * in which nodes are created.</p>
    * @since 7.1.0
    */
  var initialPositionRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>Initial layout algorithm for positioning nodes. Can be one of
    * built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where
    * positions should be set on each node (<code>this.nodes</code>) as
    * <code>node.plotX</code> and <code>node.plotY</code></p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/initial-positions/">Initial positions with callback</a>
    */
  var initialPositions: js.UndefOr[String | js.Function] = js.undefined

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
    */
  var linkLength: js.UndefOr[Double] = js.undefined

  /**
    * <p>Max number of iterations before algorithm will stop. In general,
    * algorithm should find positions sooner, but when rendering huge
    * number of nodes, it is recommended to increase this value as
    * finding perfect graph positions can require more time.</p>
    */
  var maxIterations: js.UndefOr[Double] = js.undefined

  /**
    * <p>Verlet integration only.
    * Max speed that node can get in one iteration. In terms of
    * simulation, it&#39;s a maximum translation (in pixels) that node can
    * move (in both, x and y, dimensions). While <code>friction</code> is applied
    * on all nodes, max speed is applied only for nodes that move very
    * fast, for example small or disconnected ones.</p>
    * @since 7.1.0
    */
  var maxSpeed: js.UndefOr[Double] = js.undefined

  /**
    * <p>Repulsive force applied on a node. Passed are two arguments:</p>
    * <ul>
    * <li><code>d</code> - which is current distance between two nodes</li>
    * <li><code>k</code> - which is desired distance between two nodes</li>
    * </ul>
    * <p>In <code>verlet</code> integration, defaults to:
    * <code>function (d, k) { return (k - d) / d * (k &gt; d ? 1 : 0) }</code></p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/forces/">Custom forces with Euler integration</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/cuboids/">Custom forces with Verlet integration</a>
    */
  var repulsiveForce: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Barnes-Hut approximation only.
    * Deteremines when distance between cell and node is small enough
    * to caculate forces. Value of <code>theta</code> is compared directly with
    * quotient <code>s / d</code>, where <code>s</code> is the size of the cell, and <code>d</code> is
    * distance between center of cell&#39;s mass and currently compared
    * node.</p>
    * @since 7.1.0
    */
  var theta: js.UndefOr[Double] = js.undefined

  /**
    * <p>Type of the algorithm used when positioning nodes.</p>
    */
  var `type`: js.UndefOr[String] = "reingold-fruchterman"
}

object SeriesNetworkgraphLayoutAlgorithm {
  /**
    * @param approximation <p>Approximation used to calculate repulsive forces affecting nodes.. By default, when calculateing net force, nodes are compared. against each other, which gives O(N^2) complexity. Using. Barnes-Hut approximation, we decrease this to O(N log N), but the. resulting graph will have different layout. Barnes-Hut. approximation divides space into rectangles via quad tree, where. forces exerted on nodes are calculated directly for nearby cells,. and for all others, cells are treated as a separate node with. center of mass.</p>
    * @param attractiveForce <p>Attraction force applied on a node which is conected to another. node by a link. Passed are two arguments:</p>. <ul>. <li><code>d</code> - which is current distance between two nodes</li>. <li><code>k</code> - which is desired distance between two nodes</li>. </ul>. <p>In <code>verlet</code> integration, defaults to:. <code>function (d, k) { return (k - d) / d; }</code></p>
    * @param enableSimulation <p>Experimental. Enables live simulation of the algorithm. implementation. All nodes are animated as the forces applies on. them.</p>
    * @param friction <p>Friction applied on forces to prevent nodes rushing to fast to. the desired positions.</p>
    * @param gravitationalConstant <p>Gravitational const used in the barycenter force of the. algorithm.</p>
    * @param initialPositionRadius <p>When <code>initialPositions</code> are set to &#39;circle&#39;,. <code>initialPositionRadius</code> is a distance from the center of circle,. in which nodes are created.</p>
    * @param initialPositions <p>Initial layout algorithm for positioning nodes. Can be one of. built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where. positions should be set on each node (<code>this.nodes</code>) as. <code>node.plotX</code> and <code>node.plotY</code></p>
    * @param integration <p>Integration type. Available options are <code>&#39;euler&#39;</code> and <code>&#39;verlet&#39;</code>.. Integration determines how forces are applied on particles. In. Euler integration, force is applied direct as. <code>newPosition += velocity;</code>.. In Verlet integration, new position is based on a previous. posittion without velocity:. <code>newPosition += previousPosition - newPosition</code>.</p>. <p>Note that different integrations give different results as forces. are different.</p>. <p>In Highcharts v7.0.x only <code>&#39;euler&#39;</code> integration was supported.</p>
    * @param linkLength <p>Ideal length (px) of the link between two nodes. When not. defined, length is calculated as:. <code>Math.pow(availableWidth * availableHeight / nodesLength, 0.4);</code></p>. <p>Note: Because of the algorithm specification, length of each link. might be not exactly as specified.</p>
    * @param maxIterations <p>Max number of iterations before algorithm will stop. In general,. algorithm should find positions sooner, but when rendering huge. number of nodes, it is recommended to increase this value as. finding perfect graph positions can require more time.</p>
    * @param maxSpeed <p>Verlet integration only.. Max speed that node can get in one iteration. In terms of. simulation, it&#39;s a maximum translation (in pixels) that node can. move (in both, x and y, dimensions). While <code>friction</code> is applied. on all nodes, max speed is applied only for nodes that move very. fast, for example small or disconnected ones.</p>
    * @param repulsiveForce <p>Repulsive force applied on a node. Passed are two arguments:</p>. <ul>. <li><code>d</code> - which is current distance between two nodes</li>. <li><code>k</code> - which is desired distance between two nodes</li>. </ul>. <p>In <code>verlet</code> integration, defaults to:. <code>function (d, k) { return (k - d) / d * (k &gt; d ? 1 : 0) }</code></p>
    * @param theta <p>Barnes-Hut approximation only.. Deteremines when distance between cell and node is small enough. to caculate forces. Value of <code>theta</code> is compared directly with. quotient <code>s / d</code>, where <code>s</code> is the size of the cell, and <code>d</code> is. distance between center of cell&#39;s mass and currently compared. node.</p>
    * @param `type` <p>Type of the algorithm used when positioning nodes.</p>
    */
  def apply(approximation: js.UndefOr[String] = js.undefined, attractiveForce: js.UndefOr[js.Function] = js.undefined, enableSimulation: js.UndefOr[Boolean] = js.undefined, friction: js.UndefOr[Double] = js.undefined, gravitationalConstant: js.UndefOr[Double] = js.undefined, initialPositionRadius: js.UndefOr[Double] = js.undefined, initialPositions: js.UndefOr[String | js.Function] = js.undefined, integration: js.UndefOr[String] = js.undefined, linkLength: js.UndefOr[Double] = js.undefined, maxIterations: js.UndefOr[Double] = js.undefined, maxSpeed: js.UndefOr[Double] = js.undefined, repulsiveForce: js.UndefOr[js.Function] = js.undefined, theta: js.UndefOr[Double] = js.undefined, `type`: js.UndefOr[String] = "reingold-fruchterman"): SeriesNetworkgraphLayoutAlgorithm = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesNetworkgraphLayoutAlgorithm {
      this.approximation = approximation
      this.attractiveForce = attractiveForce
      this.enableSimulation = enableSimulation
      this.friction = friction
      this.gravitationalConstant = gravitationalConstant
      this.initialPositionRadius = initialPositionRadius
      this.initialPositions = initialPositions
      this.integration = integration
      this.linkLength = linkLength
      this.maxIterations = maxIterations
      this.maxSpeed = maxSpeed
      this.repulsiveForce = repulsiveForce
      this.theta = theta
      this.`type` = `type`
    })
  }
}
