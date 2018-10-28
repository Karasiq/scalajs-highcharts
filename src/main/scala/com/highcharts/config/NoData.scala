/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>noData</code>
  */
@js.annotation.ScalaJSDefined
class NoData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The position of the no-data label, relative to the plot area.</p>
    * @since 3.0.8
    */
  val position: js.UndefOr[CleanJsObject[NoDataPosition]] = js.undefined

  /**
    * <p>An object of additional SVG attributes for the no-data label.</p>
    * @since 3.0.8
    */
  val attr: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Whether to insert the label as HTML, or as pseudo-HTML rendered with
    * SVG.</p>
    * @since 4.1.10
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>CSS styles for the no-data label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-line">Styled no-data text</a>
    */
  val style: js.Any = js.undefined
}

object NoData {
  /**
    * @param position <p>The position of the no-data label, relative to the plot area.</p>
    * @param attr <p>An object of additional SVG attributes for the no-data label.</p>
    * @param useHTML <p>Whether to insert the label as HTML, or as pseudo-HTML rendered with. SVG.</p>
    * @param style <p>CSS styles for the no-data label.</p>
    */
  def apply(position: js.UndefOr[CleanJsObject[NoDataPosition]] = js.undefined, attr: js.UndefOr[js.Object] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Any] = js.undefined): NoData = {
    val positionOuter: js.UndefOr[CleanJsObject[NoDataPosition]] = position
    val attrOuter: js.UndefOr[js.Object] = attr
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val styleOuter: js.Any = style
    com.highcharts.HighchartsGenericObject.toCleanObject(new NoData {
      override val position: js.UndefOr[CleanJsObject[NoDataPosition]] = positionOuter
      override val attr: js.UndefOr[js.Object] = attrOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val style: js.Any = styleOuter
    })
  }
}
