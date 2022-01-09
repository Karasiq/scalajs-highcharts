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
  * @note JavaScript name: <code>labels-items</code>
  */
class LabelsItems extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Inner HTML or text for the label.</p>
    */
  var html: js.UndefOr[String] = js.undefined

  /**
    * <p>CSS styles for each label. To position the label, use left and top
    * like this:</p>
    * <pre><code class="language-js">style: {
    *     left: &#39;100px&#39;,
    *     top: &#39;100px&#39;
    * }
    * </code></pre>
    */
  var style: js.UndefOr[js.Object] = js.undefined
}

object LabelsItems {
  /**
    * @param html <p>Inner HTML or text for the label.</p>
    * @param style <p>CSS styles for each label. To position the label, use left and top. like this:</p>. <pre><code class="language-js">style: {.     left: &#39;100px&#39;,.     top: &#39;100px&#39;. }. </code></pre>
    */
  def apply(html: js.UndefOr[String] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): LabelsItems = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LabelsItems {
      this.html = html
      this.style = style
    })
  }
}
