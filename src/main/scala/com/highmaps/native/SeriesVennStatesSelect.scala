/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;venn&gt;-states-select</code>
  */
class SeriesVennStatesSelect extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation setting for hovering the graph in line-type series.</p>
    * @since 5.0.8
    */
  var animation: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The border color of the point in this state.</p>
    */
  var borderColor: js.UndefOr[String] = js.undefined

  /**
    * <p>The color of the shape in this state.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-states-hover/">Hover options</a>
    */
  var color: js.UndefOr[String] = js.undefined

  /**
    * <p>The border width of the point in this state</p>
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

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
    * <p>Pixel width of the graph line. By default this property is
    * undefined, and the <code>lineWidthPlus</code> property dictates how much
    * to increase the linewidth from normal state.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidth/">5px line on hover</a>
    */
  var lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The additional line width for the graph of a hovered series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/">5 pixels wider</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/">5 pixels wider</a>
    * @since 4.0.3
    */
  var lineWidthPlus: js.UndefOr[Double] = js.undefined

  /**
    * <p>In Highcharts 1.0, the appearance of all markers belonging
    * to the hovered series. For settings on the hover state of the
    * individual point, see
    * <a href="#plotOptions.series.marker.states.hover">marker.states.hover</a>.</p>
    */
  var marker: js.UndefOr[CleanJsObject[SeriesVennStatesSelectMarker]] = js.undefined
}

object SeriesVennStatesSelect {
  /**
    * @param animation <p>Animation setting for hovering the graph in line-type series.</p>
    * @param borderColor <p>The border color of the point in this state.</p>
    * @param color <p>The color of the shape in this state.</p>
    * @param borderWidth <p>The border width of the point in this state</p>
    * @param enabled <p>Enable separate styles for the hovered series to visualize. that the user hovers either the series itself or the legend.</p>
    * @param lineWidth <p>Pixel width of the graph line. By default this property is. undefined, and the <code>lineWidthPlus</code> property dictates how much. to increase the linewidth from normal state.</p>
    * @param lineWidthPlus <p>The additional line width for the graph of a hovered series.</p>
    * @param marker <p>In Highcharts 1.0, the appearance of all markers belonging. to the hovered series. For settings on the hover state of the. individual point, see. <a href="#plotOptions.series.marker.states.hover">marker.states.hover</a>.</p>
    */
  def apply(animation: js.UndefOr[Boolean] = js.undefined, borderColor: js.UndefOr[String] = js.undefined, color: js.UndefOr[String] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, lineWidthPlus: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[CleanJsObject[SeriesVennStatesSelectMarker]] = js.undefined): SeriesVennStatesSelect = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVennStatesSelect {
      this.animation = animation
      this.borderColor = borderColor
      this.color = color
      this.borderWidth = borderWidth
      this.enabled = enabled
      this.lineWidth = lineWidth
      this.lineWidthPlus = lineWidthPlus
      this.marker = marker
    })
  }
}
