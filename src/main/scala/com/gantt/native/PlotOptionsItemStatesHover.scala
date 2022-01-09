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
  * @note JavaScript name: <code>plotOptions-item-states-hover</code>
  */
class PlotOptionsItemStatesHover extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>How much to brighten the point on interaction. Requires the
    * main color to be defined in hex or rgb(a) format.</p>
    * <p>In styled mode, the hover brightness is by default replaced
    * by a fill-opacity given in the <code>.highcharts-point-hover</code>
    * class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-states-hover-brightness/">Brightened by 0.5</a>
    * @since 7.1.0
    */
  var brightness: js.UndefOr[Double] = js.undefined

  /**
    * <p>Animation setting for hovering the graph in line-type series.</p>
    * @since 5.0.8
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>The border color of the point in this state.</p>
    * @since 7.1.0
    */
  var borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border width of the point in this state</p>
    * @since 7.1.0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the shape in this state.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-states-hover/">Hover options</a>
    * @since 7.1.0
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Enable separate styles for the hovered series to visualize
    * that the user hovers either the series itself or the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled/">Line</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-column/">Column</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-pie/">Pie</a>
    * @since 1.2.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Options for the halo appearing around the hovered point in
    * line-type series as well as outside the hovered slice in pie
    * charts. By default the halo is filled by the current point or
    * series color with an opacity of 0.25. The halo can be
    * disabled by setting the <code>halo</code> option to <code>null</code>.</p>
    * <p>In styled mode, the halo is styled with the
    * <code>.highcharts-halo</code> class, with colors inherited from
    * <code>.highcharts-color-{n}</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/halo/">Halo options</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/halo/">Halo options</a>
    * @since 4.0.0
    */
  var halo: js.UndefOr[Null | js.Any] = js.undefined
}

object PlotOptionsItemStatesHover {
  /**
    * @param brightness <p>How much to brighten the point on interaction. Requires the. main color to be defined in hex or rgb(a) format.</p>. <p>In styled mode, the hover brightness is by default replaced. by a fill-opacity given in the <code>.highcharts-point-hover</code>. class.</p>
    * @param animation <p>Animation setting for hovering the graph in line-type series.</p>
    * @param borderColor <p>The border color of the point in this state.</p>
    * @param borderWidth <p>The border width of the point in this state</p>
    * @param color <p>The color of the shape in this state.</p>
    * @param enabled <p>Enable separate styles for the hovered series to visualize. that the user hovers either the series itself or the legend.</p>
    * @param halo <p>Options for the halo appearing around the hovered point in. line-type series as well as outside the hovered slice in pie. charts. By default the halo is filled by the current point or. series color with an opacity of 0.25. The halo can be. disabled by setting the <code>halo</code> option to <code>null</code>.</p>. <p>In styled mode, the halo is styled with the. <code>.highcharts-halo</code> class, with colors inherited from. <code>.highcharts-color-{n}</code>.</p>
    */
  def apply(brightness: js.UndefOr[Double] = js.undefined, animation: js.UndefOr[Boolean | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, halo: js.UndefOr[Null | js.Any] = js.undefined): PlotOptionsItemStatesHover = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsItemStatesHover {
      this.brightness = brightness
      this.animation = animation
      this.borderColor = borderColor
      this.borderWidth = borderWidth
      this.color = color
      this.enabled = enabled
      this.halo = halo
    })
  }
}
