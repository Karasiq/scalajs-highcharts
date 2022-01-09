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
  * @note JavaScript name: <code>rangeSelector-buttons-events</code>
  */
class RangeSelectorButtonsEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Fires when clicking on the rangeSelector button. One parameter,
    * event, is passed to the function, containing common event
    * information.</p>
    * <pre><code class="language-js">click: function(e) {
    *   console.log(this);
    * }
    * </code></pre>
    * <p>Return false to stop default button&#39;s click action.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/button-click/">Click event on the button</a>
    */
  var click: js.Any = js.undefined
}

object RangeSelectorButtonsEvents {
  /**
    * @param click <p>Fires when clicking on the rangeSelector button. One parameter,. event, is passed to the function, containing common event. information.</p>. <pre><code class="language-js">click: function(e) {.   console.log(this);. }. </code></pre>. <p>Return false to stop default button&#39;s click action.</p>
    */
  def apply(click: js.UndefOr[js.Any] = js.undefined): RangeSelectorButtonsEvents = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new RangeSelectorButtonsEvents {
      this.click = click
    })
  }
}
