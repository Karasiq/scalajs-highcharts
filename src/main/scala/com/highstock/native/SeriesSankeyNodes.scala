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
  * @note JavaScript name: <code>series&lt;sankey&gt;-nodes</code>
  */
class SeriesSankeyNodes extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of the auto generated node.</p>
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color index of the auto generated node, especially for use in styled
    * mode.</p>
    */
  var colorIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>An optional column index of where to place the node. The default behaviour is
    * to place it next to the preceding node. Note that this option name is
    * counter intuitive in inverted charts, like for example an organization chart
    * rendered top down. In this case the &quot;columns&quot; are horizontal.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-node-column/">Specified node column</a>
    * @since 6.0.5
    */
  var column: js.UndefOr[Double] = js.undefined

  /**
    * <p>Individual data label for each node. The options are the same as
    * the ones for <a href="#series.sankey.dataLabels">series.sankey.dataLabels</a>.</p>
    */
  var dataLabels: js.UndefOr[CleanJsObject[SeriesSankeyNodesDataLabels]] = js.undefined

  /**
    * <p>The id of the auto-generated node, refering to the <code>from</code> or <code>to</code> setting of
    * the link.</p>
    */
  var id: js.UndefOr[String] = js.undefined

  /**
    * <p>An optional level index of where to place the node. The default behaviour is
    * to place it next to the preceding node. Alias of <code>nodes.column</code>, but in
    * inverted sankeys and org charts, the levels are laid out as rows.</p>
    * @since 7.1.0
    */
  var level: js.UndefOr[Double] = js.undefined

  /**
    * <p>The name to display for the node in data labels and tooltips. Use this when
    * the name is different from the <code>id</code>. Where the id must be unique for each
    * node, this is not necessary for the name.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/sankey/">Sankey diagram with node options</a>
    */
  var name: js.UndefOr[String] = js.undefined

  /**
    * <p>This option is deprecated, use
    * <a href="#series.sankey.nodes.offsetHorizontal">offsetHorizontal</a> and
    * <a href="#series.sankey.nodes.offsetVertical">offsetVertical</a> instead.</p>
    * <p>In a horizontal layout, the vertical offset of a node in terms of weight.
    * Positive values shift the node downwards, negative shift it upwards. In a
    * vertical layout, like organization chart, the offset is horizontal.</p>
    * <p>If a percantage string is given, the node is offset by the percentage of the
    * node size plus <code>nodePadding</code>.</p>
    * @since 6.0.5
    */
  var offset: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The horizontal offset of a node. Positive values shift the node right,
    * negative shift it left.</p>
    * <p>If a percantage string is given, the node is offset by the percentage of the
    * node size.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-node-column/">Specified node offset</a>
    * @since 9.3.0
    */
  var offsetHorizontal: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The vertical offset of a node. Positive values shift the node down,
    * negative shift it up.</p>
    * <p>If a percantage string is given, the node is offset by the percentage of the
    * node size.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-node-column/">Specified node offset</a>
    * @since 9.3.0
    */
  var offsetVertical: js.UndefOr[Double | String] = js.undefined
}

object SeriesSankeyNodes {
  /**
    * @param color <p>The color of the auto generated node.</p>
    * @param colorIndex <p>The color index of the auto generated node, especially for use in styled. mode.</p>
    * @param column <p>An optional column index of where to place the node. The default behaviour is. to place it next to the preceding node. Note that this option name is. counter intuitive in inverted charts, like for example an organization chart. rendered top down. In this case the &quot;columns&quot; are horizontal.</p>
    * @param dataLabels <p>Individual data label for each node. The options are the same as. the ones for <a href="#series.sankey.dataLabels">series.sankey.dataLabels</a>.</p>
    * @param id <p>The id of the auto-generated node, refering to the <code>from</code> or <code>to</code> setting of. the link.</p>
    * @param level <p>An optional level index of where to place the node. The default behaviour is. to place it next to the preceding node. Alias of <code>nodes.column</code>, but in. inverted sankeys and org charts, the levels are laid out as rows.</p>
    * @param name <p>The name to display for the node in data labels and tooltips. Use this when. the name is different from the <code>id</code>. Where the id must be unique for each. node, this is not necessary for the name.</p>
    * @param offset <p>This option is deprecated, use. <a href="#series.sankey.nodes.offsetHorizontal">offsetHorizontal</a> and. <a href="#series.sankey.nodes.offsetVertical">offsetVertical</a> instead.</p>. <p>In a horizontal layout, the vertical offset of a node in terms of weight.. Positive values shift the node downwards, negative shift it upwards. In a. vertical layout, like organization chart, the offset is horizontal.</p>. <p>If a percantage string is given, the node is offset by the percentage of the. node size plus <code>nodePadding</code>.</p>
    * @param offsetHorizontal <p>The horizontal offset of a node. Positive values shift the node right,. negative shift it left.</p>. <p>If a percantage string is given, the node is offset by the percentage of the. node size.</p>
    * @param offsetVertical <p>The vertical offset of a node. Positive values shift the node down,. negative shift it up.</p>. <p>If a percantage string is given, the node is offset by the percentage of the. node size.</p>
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, column: js.UndefOr[Double] = js.undefined, dataLabels: js.UndefOr[CleanJsObject[SeriesSankeyNodesDataLabels]] = js.undefined, id: js.UndefOr[String] = js.undefined, level: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, offset: js.UndefOr[Double | String] = js.undefined, offsetHorizontal: js.UndefOr[Double | String] = js.undefined, offsetVertical: js.UndefOr[Double | String] = js.undefined): SeriesSankeyNodes = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSankeyNodes {
      this.color = color
      this.colorIndex = colorIndex
      this.column = column
      this.dataLabels = dataLabels
      this.id = id
      this.level = level
      this.name = name
      this.offset = offset
      this.offsetHorizontal = offsetHorizontal
      this.offsetVertical = offsetVertical
    })
  }
}
