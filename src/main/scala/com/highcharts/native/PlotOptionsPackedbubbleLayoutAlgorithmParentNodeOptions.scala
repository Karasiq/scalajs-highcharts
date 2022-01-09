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
  * @note JavaScript name: <code>plotOptions-packedbubble-layoutAlgorithm-parentNodeOptions</code>
  */
class PlotOptionsPackedbubbleLayoutAlgorithmParentNodeOptions extends com.highcharts.HighchartsGenericObject {

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
    * @since 7.1.0
    */
  var initialPositionRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>Styling options for parentNodes markers. Similar to
    * line.marker options.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-packedbubble/parentnode-style/">Bubble size</a>
    * @since 7.1.0
    */
  var marker: js.UndefOr[CleanJsObject[PlotOptionsPackedbubbleLayoutAlgorithmParentNodeOptionsMarker]] = js.undefined

  /**
    * <p>Max number of iterations before algorithm will stop. In general,
    * algorithm should find positions sooner, but when rendering huge
    * number of nodes, it is recommended to increase this value as
    * finding perfect graph positions can require more time.</p>
    * @since 7.1.0
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

  var seriesInteraction: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Friction applied on forces to prevent nodes rushing to fast to
    * the desired positions.</p>
    * @since 7.1.0
    */
  var friction: js.UndefOr[Double] = js.undefined

  /**
    * <p>Initial layout algorithm for positioning nodes. Can be one of
    * built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where
    * positions should be set on each node (<code>this.nodes</code>) as
    * <code>node.plotX</code> and <code>node.plotY</code></p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/initial-positions/">Initial positions with callback</a>
    * @since 7.1.0
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
    * @since 7.1.0
    */
  var linkLength: js.UndefOr[Double] = js.undefined

  /**
    * <p>Type of the algorithm used when positioning nodes.</p>
    * @since 7.1.0
    */
  var `type`: js.UndefOr[String] = "reingold-fruchterman"
}

object PlotOptionsPackedbubbleLayoutAlgorithmParentNodeOptions {
  /**
    * @param gravitationalConstant <p>Gravitational const used in the barycenter force of the. algorithm.</p>
    * @param initialPositionRadius <p>When <code>initialPositions</code> are set to &#39;circle&#39;,. <code>initialPositionRadius</code> is a distance from the center of circle,. in which nodes are created.</p>
    * @param marker <p>Styling options for parentNodes markers. Similar to. line.marker options.</p>
    * @param maxIterations <p>Max number of iterations before algorithm will stop. In general,. algorithm should find positions sooner, but when rendering huge. number of nodes, it is recommended to increase this value as. finding perfect graph positions can require more time.</p>
    * @param maxSpeed <p>Verlet integration only.. Max speed that node can get in one iteration. In terms of. simulation, it&#39;s a maximum translation (in pixels) that node can. move (in both, x and y, dimensions). While <code>friction</code> is applied. on all nodes, max speed is applied only for nodes that move very. fast, for example small or disconnected ones.</p>
    * @param friction <p>Friction applied on forces to prevent nodes rushing to fast to. the desired positions.</p>
    * @param initialPositions <p>Initial layout algorithm for positioning nodes. Can be one of. built-in options (&quot;circle&quot;, &quot;random&quot;) or a function where. positions should be set on each node (<code>this.nodes</code>) as. <code>node.plotX</code> and <code>node.plotY</code></p>
    * @param integration <p>Integration type. Available options are <code>&#39;euler&#39;</code> and <code>&#39;verlet&#39;</code>.. Integration determines how forces are applied on particles. In. Euler integration, force is applied direct as. <code>newPosition += velocity;</code>.. In Verlet integration, new position is based on a previous. posittion without velocity:. <code>newPosition += previousPosition - newPosition</code>.</p>. <p>Note that different integrations give different results as forces. are different.</p>. <p>In Highcharts v7.0.x only <code>&#39;euler&#39;</code> integration was supported.</p>
    * @param linkLength <p>Ideal length (px) of the link between two nodes. When not. defined, length is calculated as:. <code>Math.pow(availableWidth * availableHeight / nodesLength, 0.4);</code></p>. <p>Note: Because of the algorithm specification, length of each link. might be not exactly as specified.</p>
    * @param `type` <p>Type of the algorithm used when positioning nodes.</p>
    */
  def apply(gravitationalConstant: js.UndefOr[Double] = js.undefined, initialPositionRadius: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[CleanJsObject[PlotOptionsPackedbubbleLayoutAlgorithmParentNodeOptionsMarker]] = js.undefined, maxIterations: js.UndefOr[Double] = js.undefined, maxSpeed: js.UndefOr[Double] = js.undefined, seriesInteraction: js.UndefOr[Boolean] = js.undefined, friction: js.UndefOr[Double] = js.undefined, initialPositions: js.UndefOr[String | js.Function] = js.undefined, integration: js.UndefOr[String] = js.undefined, linkLength: js.UndefOr[Double] = js.undefined, `type`: js.UndefOr[String] = "reingold-fruchterman"): PlotOptionsPackedbubbleLayoutAlgorithmParentNodeOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPackedbubbleLayoutAlgorithmParentNodeOptions {
      this.gravitationalConstant = gravitationalConstant
      this.initialPositionRadius = initialPositionRadius
      this.marker = marker
      this.maxIterations = maxIterations
      this.maxSpeed = maxSpeed
      this.seriesInteraction = seriesInteraction
      this.friction = friction
      this.initialPositions = initialPositions
      this.integration = integration
      this.linkLength = linkLength
      this.`type` = `type`
    })
  }
}
