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
  * @note JavaScript name: <code>navigation-events</code>
  */
class NavigationEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A <code>closePopup</code> event. Fired when Popup should be hidden, for example
    * when clicking on an annotation again.</p>
    * @since 7.0.0
    */
  var closePopup: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Event fired when button state should change, for example after
    * adding an annotation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/gui/">Change icon in a dropddown on event</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/gui-buttons/">Change button class on event</a>
    * @since 7.0.0
    */
  var deselectButton: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Event fired on a button click.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/gui/">Change icon in a dropddown on event</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/gui-buttons/">Change button class on event</a>
    * @since 7.0.0
    */
  var selectButton: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>A <code>showPopup</code> event. Fired when selecting for example an annotation.</p>
    * @since 7.0.0
    */
  var showPopup: js.UndefOr[js.Function] = js.undefined
}

object NavigationEvents {
  /**
    * @param closePopup <p>A <code>closePopup</code> event. Fired when Popup should be hidden, for example. when clicking on an annotation again.</p>
    * @param deselectButton <p>Event fired when button state should change, for example after. adding an annotation.</p>
    * @param selectButton <p>Event fired on a button click.</p>
    * @param showPopup <p>A <code>showPopup</code> event. Fired when selecting for example an annotation.</p>
    */
  def apply(closePopup: js.UndefOr[js.Function] = js.undefined, deselectButton: js.UndefOr[js.Function] = js.undefined, selectButton: js.UndefOr[js.Function] = js.undefined, showPopup: js.UndefOr[js.Function] = js.undefined): NavigationEvents = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigationEvents {
      this.closePopup = closePopup
      this.deselectButton = deselectButton
      this.selectButton = selectButton
      this.showPopup = showPopup
    })
  }
}
