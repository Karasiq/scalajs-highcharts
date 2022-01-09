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
  * @note JavaScript name: <code>plotOptions-wordcloud-rotation</code>
  */
class PlotOptionsWordcloudRotation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The smallest degree of rotation for a word.</p>
    * @since 6.0.0
    */
  var from: js.UndefOr[Double] = js.undefined

  /**
    * <p>The number of possible orientations for a word, within the range
    * of <code>rotation.from</code> and <code>rotation.to</code>. Must be a number larger
    * than 0.</p>
    * @since 6.0.0
    */
  var orientations: js.UndefOr[Double] = js.undefined

  /**
    * <p>The largest degree of rotation for a word.</p>
    * @since 6.0.0
    */
  var to: js.UndefOr[Double] = js.undefined
}

object PlotOptionsWordcloudRotation {
  /**
    * @param from <p>The smallest degree of rotation for a word.</p>
    * @param orientations <p>The number of possible orientations for a word, within the range. of <code>rotation.from</code> and <code>rotation.to</code>. Must be a number larger. than 0.</p>
    * @param to <p>The largest degree of rotation for a word.</p>
    */
  def apply(from: js.UndefOr[Double] = js.undefined, orientations: js.UndefOr[Double] = js.undefined, to: js.UndefOr[Double] = js.undefined): PlotOptionsWordcloudRotation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsWordcloudRotation {
      this.from = from
      this.orientations = orientations
      this.to = to
    })
  }
}
