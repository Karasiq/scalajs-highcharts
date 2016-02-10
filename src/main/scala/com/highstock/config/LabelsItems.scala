/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>labels-items</code>
  */
@js.annotation.ScalaJSDefined
class LabelsItems extends js.Object {

  /**
    * Inner HTML or text for the label.
    */
  val html: js.UndefOr[String] = js.undefined

  /**
    * CSS styles for each label. To position the label, use left and top like this:
    * <pre>style: {
    * 	left: '100px',
    * 	top: '100px'
    * }</pre>
    */
  val style: js.UndefOr[js.Object] = js.undefined
}

object LabelsItems {
  /**
    * @param html Inner HTML or text for the label.
    * @param style CSS styles for each label. To position the label, use left and top like this:. <pre>style: {. 	left: '100px',. 	top: '100px'. }</pre>
    */
  def apply(html: js.UndefOr[String] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): LabelsItems = {
    val htmlOuter: js.UndefOr[String] = html
    val styleOuter: js.UndefOr[js.Object] = style
    new LabelsItems {
      override val html: js.UndefOr[String] = htmlOuter
      override val style: js.UndefOr[js.Object] = styleOuter
    }
  }
}
