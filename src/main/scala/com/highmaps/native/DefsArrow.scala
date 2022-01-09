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
  * @note JavaScript name: <code>defs-arrow</code>
  */
class DefsArrow extends com.highcharts.HighchartsGenericObject {

  var attributes: js.Any = js.undefined

  var children: js.UndefOr[js.Array[js.Any]] = js.undefined

  var tagName: js.UndefOr[String] = js.undefined
}

object DefsArrow {
  /**
    */
  def apply(attributes: js.UndefOr[js.Any] = js.undefined, children: js.UndefOr[js.Array[js.Any]] = js.undefined, tagName: js.UndefOr[String] = js.undefined): DefsArrow = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new DefsArrow {
      this.attributes = attributes
      this.children = children
      this.tagName = tagName
    })
  }
}
