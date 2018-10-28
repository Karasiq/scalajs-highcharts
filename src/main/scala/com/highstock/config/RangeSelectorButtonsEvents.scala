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
  * @note JavaScript name: <code>rangeSelector-buttons-events</code>
  */
@js.annotation.ScalaJSDefined
class RangeSelectorButtonsEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Fires when clicking on the rangeSelector button. One parameter,
    * event, is passed to the function, containing common event
    * information.</p>
    * <pre>
    * click: function(e) {
    *   console.log(this);
    * }
    * </pre>
    * 
    * <p>Return false to stop default button&#39;s click action.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/button-click/">Click event on the button</a>
    */
  val click: js.UndefOr[js.Function] = js.undefined
}

object RangeSelectorButtonsEvents {
  /**
    * @param click <p>Fires when clicking on the rangeSelector button. One parameter,. event, is passed to the function, containing common event. information.</p>. <pre>. click: function(e) {.   console.log(this);. }. </pre>. . <p>Return false to stop default button&#39;s click action.</p>
    */
  def apply(click: js.UndefOr[js.Function] = js.undefined): RangeSelectorButtonsEvents = {
    val clickOuter: js.UndefOr[js.Function] = click
    com.highcharts.HighchartsGenericObject.toCleanObject(new RangeSelectorButtonsEvents {
      override val click: js.UndefOr[js.Function] = clickOuter
    })
  }
}
