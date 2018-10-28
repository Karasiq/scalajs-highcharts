/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;sankey&gt;-nodes</code>
  */
@js.annotation.ScalaJSDefined
class SeriesSankeyNodes extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The id of the auto-generated node, refering to the <code>from</code> or <code>to</code> setting of
    * the link.</p>
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * <p>The color of the auto generated node.</p>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color index of the auto generated node, especially for use in styled
    * mode.</p>
    */
  val colorIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>An optional column index of where to place the node. The default behaviour is
    * to place it next to the preceding node.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-node-column/">Specified node column</a>
    * @since 6.0.5
    */
  val column: js.UndefOr[Double] = js.undefined

  /**
    * <p>The name to display for the node in data labels and tooltips. Use this when
    * the name is different from the <code>id</code>. Where the id must be unique for each
    * node, this is not necessary for the name.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/sankey/">Sankey diagram with node options</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * <p>The vertical offset of a node in terms of weight. Positive values shift the
    * node downwards, negative shift it upwards.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-node-column/">Specified node offset</a>
    * @since 6.0.5
    */
  val offset: js.UndefOr[Double] = js.undefined
}

object SeriesSankeyNodes {
  /**
    * @param id <p>The id of the auto-generated node, refering to the <code>from</code> or <code>to</code> setting of. the link.</p>
    * @param color <p>The color of the auto generated node.</p>
    * @param colorIndex <p>The color index of the auto generated node, especially for use in styled. mode.</p>
    * @param column <p>An optional column index of where to place the node. The default behaviour is. to place it next to the preceding node.</p>
    * @param name <p>The name to display for the node in data labels and tooltips. Use this when. the name is different from the <code>id</code>. Where the id must be unique for each. node, this is not necessary for the name.</p>
    * @param offset <p>The vertical offset of a node in terms of weight. Positive values shift the. node downwards, negative shift it upwards.</p>
    */
  def apply(id: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, colorIndex: js.UndefOr[Double] = js.undefined, column: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, offset: js.UndefOr[Double] = js.undefined): SeriesSankeyNodes = {
    val idOuter: js.UndefOr[String] = id
    val colorOuter: js.UndefOr[String | js.Object] = color
    val colorIndexOuter: js.UndefOr[Double] = colorIndex
    val columnOuter: js.UndefOr[Double] = column
    val nameOuter: js.UndefOr[String] = name
    val offsetOuter: js.UndefOr[Double] = offset
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSankeyNodes {
      override val id: js.UndefOr[String] = idOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val colorIndex: js.UndefOr[Double] = colorIndexOuter
      override val column: js.UndefOr[Double] = columnOuter
      override val name: js.UndefOr[String] = nameOuter
      override val offset: js.UndefOr[Double] = offsetOuter
    })
  }
}
