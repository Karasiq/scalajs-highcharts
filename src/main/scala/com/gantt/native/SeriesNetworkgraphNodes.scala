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
  * @note JavaScript name: <code>series&lt;networkgraph&gt;-nodes</code>
  */
class SeriesNetworkgraphNodes extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of the auto generated node.</p>
    */
  var color: js.UndefOr[String] = js.undefined

  /**
    * <p>The color index of the auto generated node, especially for use in styled
    * mode.</p>
    */
  var colorIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>Individual data label for each node. The options are the same as
    * the ones for <a href="#series.networkgraph.dataLabels">series.networkgraph.dataLabels</a>.</p>
    */
  var dataLabels: js.UndefOr[js.Object | js.Array[js.Object]] = js.undefined

  /**
    * <p>The id of the auto-generated node, refering to the <code>from</code> or <code>to</code> setting of
    * the link.</p>
    */
  var id: js.UndefOr[String] = js.undefined

  /**
    * <p>Mass of the node. By default, each node has mass equal to it&#39;s marker radius
    * . Mass is used to determine how two connected nodes should affect
    * each other:</p>
    * <p>Attractive force is multiplied by the ratio of two connected
    * nodes; if a big node has weights twice as the small one, then the small one
    * will move towards the big one twice faster than the big one to the small one
    * .</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/ragdoll/">Mass determined by marker.radius</a>
    */
  var mass: js.UndefOr[Double] = js.undefined

  /**
    * <p>The name to display for the node in data labels and tooltips. Use this when
    * the name is different from the <code>id</code>. Where the id must be unique for each
    * node, this is not necessary for the name.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/data-options/">Networkgraph diagram with node options</a>
    */
  var name: js.UndefOr[String] = js.undefined
}

object SeriesNetworkgraphNodes {
  /**
    * @param color <p>The color of the auto generated node.</p>
    * @param colorIndex <p>The color index of the auto generated node, especially for use in styled. mode.</p>
    * @param dataLabels <p>Individual data label for each node. The options are the same as. the ones for <a href="#series.networkgraph.dataLabels">series.networkgraph.dataLabels</a>.</p>
    * @param id <p>The id of the auto-generated node, refering to the <code>from</code> or <code>to</code> setting of. the link.</p>
    * @param mass <p>Mass of the node. By default, each node has mass equal to it&#39;s marker radius. . Mass is used to determine how two connected nodes should affect. each other:</p>. <p>Attractive force is multiplied by the ratio of two connected. nodes; if a big node has weights twice as the small one, then the small one. will move towards the big one twice faster than the big one to the small one. .</p>
    * @param name <p>The name to display for the node in data labels and tooltips. Use this when. the name is different from the <code>id</code>. Where the id must be unique for each. node, this is not necessary for the name.</p>
    */
  def apply(color: js.UndefOr[String] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, dataLabels: js.UndefOr[js.Object | js.Array[js.Object]] = js.undefined, id: js.UndefOr[String] = js.undefined, mass: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined): SeriesNetworkgraphNodes = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesNetworkgraphNodes {
      this.color = color
      this.colorIndex = colorIndex
      this.dataLabels = dataLabels
      this.id = id
      this.mass = mass
      this.name = name
    })
  }
}
