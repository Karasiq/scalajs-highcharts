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
  * @note JavaScript name: <code>plotOptions-wordcloud-states-select</code>
  */
class PlotOptionsWordcloudStatesSelect extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A specific border color for the selected point.</p>
    * @since 6.0.0
    */
  var borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>A specific color for the selected point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-states-hover/">Hover options</a>
    * @since 6.0.0
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Animation setting for hovering the graph in line-type series.</p>
    * @since 5.0.8
    */
  var animation: js.Any = js.undefined

  /**
    * <p>The border width of the point in this state</p>
    * @since 6.0.0
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
}

object PlotOptionsWordcloudStatesSelect {
  /**
    * @param borderColor <p>A specific border color for the selected point.</p>
    * @param color <p>A specific color for the selected point.</p>
    * @param animation <p>Animation setting for hovering the graph in line-type series.</p>
    * @param borderWidth <p>The border width of the point in this state</p>
    * @param enabled <p>Enable separate styles for the hovered series to visualize. that the user hovers either the series itself or the legend.</p>
    */
  def apply(borderColor: js.UndefOr[String | js.Object] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, animation: js.UndefOr[js.Any] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined): PlotOptionsWordcloudStatesSelect = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsWordcloudStatesSelect {
      this.borderColor = borderColor
      this.color = color
      this.animation = animation
      this.borderWidth = borderWidth
      this.enabled = enabled
    })
  }
}
