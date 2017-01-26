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
  * @note JavaScript name: <code>noData</code>
  */
@js.annotation.ScalaJSDefined
class NoData extends js.Object {

  /**
    * An object of additional SVG attributes for the no-data label.
    * @since 3.0.8
    */
  val attr: js.UndefOr[js.Object] = js.undefined

  /**
    * The position of the no-data label, relative to the plot area. 
    * @since 3.0.8
    */
  val position: js.UndefOr[CleanJsObject[NoDataPosition]] = js.undefined

  /**
    * CSS styles for the no-data label. 
    * @since 3.0.8
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * Whether to insert the label as HTML, or as pseudo-HTML rendered with SVG.
    * @since 4.1.10
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined
}

object NoData {
  /**
    * @param attr An object of additional SVG attributes for the no-data label.
    * @param position The position of the no-data label, relative to the plot area. 
    * @param style CSS styles for the no-data label. 
    * @param useHTML Whether to insert the label as HTML, or as pseudo-HTML rendered with SVG.
    */
  def apply(attr: js.UndefOr[js.Object] = js.undefined, position: js.UndefOr[CleanJsObject[NoDataPosition]] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined): NoData = {
    val attrOuter: js.UndefOr[js.Object] = attr
    val positionOuter: js.UndefOr[CleanJsObject[NoDataPosition]] = position
    val styleOuter: js.UndefOr[js.Object] = style
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    new NoData {
      override val attr: js.UndefOr[js.Object] = attrOuter
      override val position: js.UndefOr[CleanJsObject[NoDataPosition]] = positionOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
    }
  }
}
