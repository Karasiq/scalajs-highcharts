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
  * @note JavaScript name: <code>legend-bubbleLegend</code>
  */
class LegendBubbleLegend extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of the ranges borders, can be also defined for an
    * individual range.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/similartoseries/">Similar look to the bubble series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/bordercolor/">Individual bubble border color</a>
    * @since 7.0.0
    */
  var borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the ranges borders in pixels, can be also
    * defined for an individual range.</p>
    * @since 7.0.0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>An additional class name to apply to the bubble legend&#39;
    * circle graphical elements. This option does not replace
    * default class names of the graphical element.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/bubble-legend/">Styling by CSS</a>
    * @since 7.0.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>The main color of the bubble legend. Applies to ranges, if
    * individual color is not defined.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/similartoseries/">Similar look to the bubble series</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/color/">Individual bubble color</a>
    * @since 7.0.0
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>An additional class name to apply to the bubble legend&#39;s
    * connector graphical elements. This option does not replace
    * default class names of the graphical element.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/bubble-legend/">Styling by CSS</a>
    * @since 7.0.0
    */
  var connectorClassName: js.UndefOr[String] = js.undefined

  /**
    * <p>The color of the connector, can be also defined
    * for an individual range.</p>
    * @since 7.0.0
    */
  var connectorColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The length of the connectors in pixels. If labels are
    * centered, the distance is reduced to 0.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/connectorandlabels/">Increased connector length</a>
    * @since 7.0.0
    */
  var connectorDistance: js.UndefOr[Double] = js.undefined

  /**
    * <p>The width of the connectors in pixels.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/connectorandlabels/">Increased connector width</a>
    * @since 7.0.0
    */
  var connectorWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Enable or disable the bubble legend.</p>
    * @since 7.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Options for the bubble legend labels.</p>
    * @since 7.0.0
    */
  var labels: js.Any = js.undefined

  /**
    * <p>The position of the bubble legend in the legend.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/connectorandlabels/">Bubble legend as last item in legend</a>
    * @since 7.0.0
    */
  var legendIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>Miximum bubble legend range size. If values for ranges are
    * not specified, the <code>minSize</code> and the <code>maxSize</code> are calculated
    * from bubble series.</p>
    * @since 7.0.0
    */
  var maxSize: js.UndefOr[Double] = js.undefined

  /**
    * <p>Minimum bubble legend range size. If values for ranges are
    * not specified, the <code>minSize</code> and the <code>maxSize</code> are calculated
    * from bubble series.</p>
    * @since 7.0.0
    */
  var minSize: js.UndefOr[Double] = js.undefined

  /**
    * <p>Options for specific range. One range consists of bubble,
    * label and connector.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/ranges/">Manually defined ranges</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/autoranges/">Auto calculated ranges</a>
    * @since 7.0.0
    */
  var ranges: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>Whether the bubble legend range value should be represented
    * by the area or the width of the bubble. The default, area,
    * corresponds best to the human perception of the size of each
    * bubble.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/ranges/">Size by width</a>
    * @since 7.0.0
    */
  var sizeBy: js.Any = js.undefined

  /**
    * <p>When this is true, the absolute value of z determines the
    * size of the bubble. This means that with the default
    * zThreshold of 0, a bubble of value -1 will have the same size
    * as a bubble of value 1, while a bubble of value 0 will have a
    * smaller size according to minSize.</p>
    * @since 7.0.0
    */
  var sizeByAbsoluteValue: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Define the visual z index of the bubble legend.</p>
    * @since 7.0.0
    */
  var zIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>Ranges with with lower value than zThreshold, are skipped.</p>
    * @since 7.0.0
    */
  var zThreshold: js.UndefOr[Double] = js.undefined
}

object LegendBubbleLegend {
  /**
    * @param borderColor <p>The color of the ranges borders, can be also defined for an. individual range.</p>
    * @param borderWidth <p>The width of the ranges borders in pixels, can be also. defined for an individual range.</p>
    * @param className <p>An additional class name to apply to the bubble legend&#39;. circle graphical elements. This option does not replace. default class names of the graphical element.</p>
    * @param color <p>The main color of the bubble legend. Applies to ranges, if. individual color is not defined.</p>
    * @param connectorClassName <p>An additional class name to apply to the bubble legend&#39;s. connector graphical elements. This option does not replace. default class names of the graphical element.</p>
    * @param connectorColor <p>The color of the connector, can be also defined. for an individual range.</p>
    * @param connectorDistance <p>The length of the connectors in pixels. If labels are. centered, the distance is reduced to 0.</p>
    * @param connectorWidth <p>The width of the connectors in pixels.</p>
    * @param enabled <p>Enable or disable the bubble legend.</p>
    * @param labels <p>Options for the bubble legend labels.</p>
    * @param legendIndex <p>The position of the bubble legend in the legend.</p>
    * @param maxSize <p>Miximum bubble legend range size. If values for ranges are. not specified, the <code>minSize</code> and the <code>maxSize</code> are calculated. from bubble series.</p>
    * @param minSize <p>Minimum bubble legend range size. If values for ranges are. not specified, the <code>minSize</code> and the <code>maxSize</code> are calculated. from bubble series.</p>
    * @param ranges <p>Options for specific range. One range consists of bubble,. label and connector.</p>
    * @param sizeBy <p>Whether the bubble legend range value should be represented. by the area or the width of the bubble. The default, area,. corresponds best to the human perception of the size of each. bubble.</p>
    * @param sizeByAbsoluteValue <p>When this is true, the absolute value of z determines the. size of the bubble. This means that with the default. zThreshold of 0, a bubble of value -1 will have the same size. as a bubble of value 1, while a bubble of value 0 will have a. smaller size according to minSize.</p>
    * @param zIndex <p>Define the visual z index of the bubble legend.</p>
    * @param zThreshold <p>Ranges with with lower value than zThreshold, are skipped.</p>
    */
  def apply(borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, connectorClassName: js.UndefOr[String] = js.undefined, connectorColor: js.UndefOr[String | js.Object] = js.undefined, connectorDistance: js.UndefOr[Double] = js.undefined, connectorWidth: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, labels: js.UndefOr[js.Any] = js.undefined, legendIndex: js.UndefOr[Double] = js.undefined, maxSize: js.UndefOr[Double] = js.undefined, minSize: js.UndefOr[Double] = js.undefined, ranges: js.UndefOr[js.Array[js.Any]] = js.undefined, sizeBy: js.UndefOr[js.Any] = js.undefined, sizeByAbsoluteValue: js.UndefOr[Boolean] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, zThreshold: js.UndefOr[Double] = js.undefined): LegendBubbleLegend = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LegendBubbleLegend {
      this.borderColor = borderColor
      this.borderWidth = borderWidth
      this.className = className
      this.color = color
      this.connectorClassName = connectorClassName
      this.connectorColor = connectorColor
      this.connectorDistance = connectorDistance
      this.connectorWidth = connectorWidth
      this.enabled = enabled
      this.labels = labels
      this.legendIndex = legendIndex
      this.maxSize = maxSize
      this.minSize = minSize
      this.ranges = ranges
      this.sizeBy = sizeBy
      this.sizeByAbsoluteValue = sizeByAbsoluteValue
      this.zIndex = zIndex
      this.zThreshold = zThreshold
    })
  }
}
