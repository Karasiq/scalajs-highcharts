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
  * @note JavaScript name: <code>annotations-measure-typeOptions-crosshairY</code>
  */
class AnnotationsMeasureTypeOptionsCrosshairY extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The dash or dot style of the crosshair&#39;s line. For possible
    * values, see <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.</p>
    * @since 6.0.0
    */
  var dashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable the vertical crosshair.</p>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The marker-end defines the arrowhead that will be drawn
    * at the final vertex of the given crosshair&#39;s path.</p>
    * @since 6.0.0
    */
  var markerEnd: js.UndefOr[String] = js.undefined

  /**
    * <p>The Z index of the crosshair in annotation.</p>
    * @since 6.0.0
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object AnnotationsMeasureTypeOptionsCrosshairY {
  /**
    * @param dashStyle <p>The dash or dot style of the crosshair&#39;s line. For possible. values, see <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this demonstration</a>.</p>
    * @param enabled <p>Enable or disable the vertical crosshair.</p>
    * @param markerEnd <p>The marker-end defines the arrowhead that will be drawn. at the final vertex of the given crosshair&#39;s path.</p>
    * @param zIndex <p>The Z index of the crosshair in annotation.</p>
    */
  def apply(dashStyle: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, markerEnd: js.UndefOr[String] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): AnnotationsMeasureTypeOptionsCrosshairY = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsMeasureTypeOptionsCrosshairY {
      this.dashStyle = dashStyle
      this.enabled = enabled
      this.markerEnd = markerEnd
      this.zIndex = zIndex
    })
  }
}
