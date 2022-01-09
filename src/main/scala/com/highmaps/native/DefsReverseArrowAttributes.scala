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
  * @note JavaScript name: <code>defs-reverse-arrow-attributes</code>
  */
class DefsReverseArrowAttributes extends com.highcharts.HighchartsGenericObject {

  var id: js.UndefOr[String] = js.undefined

  var markerHeight: js.UndefOr[Double] = js.undefined

  var markerWidth: js.UndefOr[Double] = js.undefined

  var refX: js.UndefOr[Double] = js.undefined

  var refY: js.UndefOr[Double] = js.undefined
}

object DefsReverseArrowAttributes {
  /**
    */
  def apply(id: js.UndefOr[String] = js.undefined, markerHeight: js.UndefOr[Double] = js.undefined, markerWidth: js.UndefOr[Double] = js.undefined, refX: js.UndefOr[Double] = js.undefined, refY: js.UndefOr[Double] = js.undefined): DefsReverseArrowAttributes = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new DefsReverseArrowAttributes {
      this.id = id
      this.markerHeight = markerHeight
      this.markerWidth = markerWidth
      this.refX = refX
      this.refY = refY
    })
  }
}
