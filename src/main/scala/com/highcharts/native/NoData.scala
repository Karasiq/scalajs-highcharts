/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>noData</code>
  */
class NoData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>An object of additional SVG attributes for the no-data label.</p>
    * @since 3.0.8
    */
  var attr: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The position of the no-data label, relative to the plot area.</p>
    * @since 3.0.8
    */
  var position: js.Any = js.undefined

  /**
    * <p>CSS styles for the no-data label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-line">Styled no-data text</a>
    */
  var style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Whether to insert the label as HTML, or as pseudo-HTML rendered with
    * SVG.</p>
    * @since 4.1.10
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
}

object NoData {
  /**
    * @param attr <p>An object of additional SVG attributes for the no-data label.</p>
    * @param position <p>The position of the no-data label, relative to the plot area.</p>
    * @param style <p>CSS styles for the no-data label.</p>
    * @param useHTML <p>Whether to insert the label as HTML, or as pseudo-HTML rendered with. SVG.</p>
    */
  def apply(attr: js.UndefOr[js.Object] = js.undefined, position: js.UndefOr[js.Any] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined): NoData = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NoData {
      this.attr = attr
      this.position = position
      this.style = style
      this.useHTML = useHTML
    })
  }
}
