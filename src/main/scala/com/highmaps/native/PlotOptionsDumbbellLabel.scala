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
  * @note JavaScript name: <code>plotOptions-dumbbell-label</code>
  */
class PlotOptionsDumbbellLabel extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>An array of boxes to avoid when laying out the labels. Each
    * item has a <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code> property.</p>
    * @since 6.0.0
    */
  var boxesToAvoid: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>Allow labels to be placed distant to the graph if necessary,
    * and draw a connector line to the graph. Setting this option
    * to true may decrease the performance significantly, since the
    * algorithm with systematically search for open spaces in the
    * whole plot area. Visually, it may also result in a more
    * cluttered chart, though more of the series will be labeled.</p>
    * @since 6.0.0
    */
  var connectorAllowed: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>If the label is closer than this to a neighbour graph, draw a
    * connector.</p>
    * @since 6.0.0
    */
  var connectorNeighbourDistance: js.UndefOr[Double] = js.undefined

  /**
    * <p>Enable the series label per series.</p>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A format string for the label, with support for a subset of
    * HTML. Variables are enclosed by curly brackets. Available
    * variables are <code>name</code>, <code>options.xxx</code>, <code>color</code> and other
    * members from the <code>series</code> object. Use this option also to set
    * a static text for the label.</p>
    * @since 8.1.0
    */
  var format: js.UndefOr[String] = js.undefined

  /**
    * <p>Callback function to format each of the series&#39; labels. The
    * <code>this</code> keyword refers to the series object. By default the
    * <code>formatter</code> is undefined and the <code>series.name</code> is rendered.</p>
    * @since 8.1.0
    */
  var formatter: js.Any = js.undefined

  /**
    * <p>For area-like series, allow the font size to vary so that
    * small areas get a smaller font size. The default applies this
    * effect to area-like series but not line-like series.</p>
    * @since 6.0.0
    */
  var maxFontSize: js.UndefOr[Double | Null] = js.undefined

  /**
    * <p>For area-like series, allow the font size to vary so that
    * small areas get a smaller font size. The default applies this
    * effect to area-like series but not line-like series.</p>
    * @since 6.0.0
    */
  var minFontSize: js.UndefOr[Double | Null] = js.undefined

  /**
    * <p>Draw the label on the area of an area series. By default it
    * is drawn on the area. Set it to <code>false</code> to draw it next to
    * the graph instead.</p>
    * @since 6.0.0
    */
  var onArea: js.UndefOr[Boolean | Null] = js.undefined

  /**
    * <p>Styles for the series label. The color defaults to the series
    * color, or a contrast color if <code>onArea</code>.</p>
    * @since 6.0.0
    */
  var style: js.UndefOr[js.Object] = js.undefined
}

object PlotOptionsDumbbellLabel {
  /**
    * @param boxesToAvoid <p>An array of boxes to avoid when laying out the labels. Each. item has a <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code> property.</p>
    * @param connectorAllowed <p>Allow labels to be placed distant to the graph if necessary,. and draw a connector line to the graph. Setting this option. to true may decrease the performance significantly, since the. algorithm with systematically search for open spaces in the. whole plot area. Visually, it may also result in a more. cluttered chart, though more of the series will be labeled.</p>
    * @param connectorNeighbourDistance <p>If the label is closer than this to a neighbour graph, draw a. connector.</p>
    * @param enabled <p>Enable the series label per series.</p>
    * @param format <p>A format string for the label, with support for a subset of. HTML. Variables are enclosed by curly brackets. Available. variables are <code>name</code>, <code>options.xxx</code>, <code>color</code> and other. members from the <code>series</code> object. Use this option also to set. a static text for the label.</p>
    * @param formatter <p>Callback function to format each of the series&#39; labels. The. <code>this</code> keyword refers to the series object. By default the. <code>formatter</code> is undefined and the <code>series.name</code> is rendered.</p>
    * @param maxFontSize <p>For area-like series, allow the font size to vary so that. small areas get a smaller font size. The default applies this. effect to area-like series but not line-like series.</p>
    * @param minFontSize <p>For area-like series, allow the font size to vary so that. small areas get a smaller font size. The default applies this. effect to area-like series but not line-like series.</p>
    * @param onArea <p>Draw the label on the area of an area series. By default it. is drawn on the area. Set it to <code>false</code> to draw it next to. the graph instead.</p>
    * @param style <p>Styles for the series label. The color defaults to the series. color, or a contrast color if <code>onArea</code>.</p>
    */
  def apply(boxesToAvoid: js.UndefOr[js.Array[js.Any]] = js.undefined, connectorAllowed: js.UndefOr[Boolean] = js.undefined, connectorNeighbourDistance: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, format: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Any] = js.undefined, maxFontSize: js.UndefOr[Double | Null] = js.undefined, minFontSize: js.UndefOr[Double | Null] = js.undefined, onArea: js.UndefOr[Boolean | Null] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): PlotOptionsDumbbellLabel = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsDumbbellLabel {
      this.boxesToAvoid = boxesToAvoid
      this.connectorAllowed = connectorAllowed
      this.connectorNeighbourDistance = connectorNeighbourDistance
      this.enabled = enabled
      this.format = format
      this.formatter = formatter
      this.maxFontSize = maxFontSize
      this.minFontSize = minFontSize
      this.onArea = onArea
      this.style = style
    })
  }
}
