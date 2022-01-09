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
  * @note JavaScript name: <code>pane-background</code>
  */
class PaneBackground extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The background color or gradient for the pane.</p>
    * @since 2.3.0
    */
  var backgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The pane background border color.</p>
    * @since 2.3.0
    */
  var borderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The pixel border width of the pane background.</p>
    * @since 2.3.0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The class name for this background.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pane/">Panes styled by CSS</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pane/">Panes styled by CSS</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pane/">Panes styled by CSS</a>
    * @since 5.0.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>The inner radius of the pane background. Can be either numeric
    * (pixels) or a percentage string.</p>
    * @since 2.3.0
    */
  var innerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The outer radius of the circular pane background. Can be either
    * numeric (pixels) or a percentage string.</p>
    * @since 2.3.0
    */
  var outerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The shape of the pane background. When <code>solid</code>, the background
    * is circular. When <code>arc</code>, the background extends only from the min
    * to the max of the value axis.</p>
    * @since 2.3.0
    */
  var shape: js.Any = js.undefined
}

object PaneBackground {
  /**
    * @param backgroundColor <p>The background color or gradient for the pane.</p>
    * @param borderColor <p>The pane background border color.</p>
    * @param borderWidth <p>The pixel border width of the pane background.</p>
    * @param className <p>The class name for this background.</p>
    * @param innerRadius <p>The inner radius of the pane background. Can be either numeric. (pixels) or a percentage string.</p>
    * @param outerRadius <p>The outer radius of the circular pane background. Can be either. numeric (pixels) or a percentage string.</p>
    * @param shape <p>The shape of the pane background. When <code>solid</code>, the background. is circular. When <code>arc</code>, the background extends only from the min. to the max of the value axis.</p>
    */
  def apply(backgroundColor: js.UndefOr[String | js.Object] = js.undefined, borderColor: js.UndefOr[String | js.Object] = js.undefined, borderWidth: js.UndefOr[Double] = js.undefined, className: js.UndefOr[String] = js.undefined, innerRadius: js.UndefOr[Double | String] = js.undefined, outerRadius: js.UndefOr[Double | String] = js.undefined, shape: js.UndefOr[js.Any] = js.undefined): PaneBackground = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PaneBackground {
      this.backgroundColor = backgroundColor
      this.borderColor = borderColor
      this.borderWidth = borderWidth
      this.className = className
      this.innerRadius = innerRadius
      this.outerRadius = outerRadius
      this.shape = shape
    })
  }
}
