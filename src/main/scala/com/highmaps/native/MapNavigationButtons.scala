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
  * @note JavaScript name: <code>mapNavigation-buttons</code>
  */
class MapNavigationButtons extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Options for the zoom in button. Properties for the zoom in and zoom
    * out buttons are inherited from
    * <a href="#mapNavigation.buttonOptions">mapNavigation.buttonOptions</a>, while
    * individual options can be overridden. By default, the <code>onclick</code>,
    * <code>text</code> and <code>y</code> options are individual.</p>
    */
  var zoomIn: js.UndefOr[CleanJsObject[MapNavigationButtonsZoomIn]] = js.undefined

  /**
    * <p>Options for the zoom out button. Properties for the zoom in and
    * zoom out buttons are inherited from
    * <a href="#mapNavigation.buttonOptions">mapNavigation.buttonOptions</a>, while
    * individual options can be overridden. By default, the <code>onclick</code>,
    * <code>text</code> and <code>y</code> options are individual.</p>
    */
  var zoomOut: js.UndefOr[CleanJsObject[MapNavigationButtonsZoomOut]] = js.undefined
}

object MapNavigationButtons {
  /**
    * @param zoomIn <p>Options for the zoom in button. Properties for the zoom in and zoom. out buttons are inherited from. <a href="#mapNavigation.buttonOptions">mapNavigation.buttonOptions</a>, while. individual options can be overridden. By default, the <code>onclick</code>,. <code>text</code> and <code>y</code> options are individual.</p>
    * @param zoomOut <p>Options for the zoom out button. Properties for the zoom in and. zoom out buttons are inherited from. <a href="#mapNavigation.buttonOptions">mapNavigation.buttonOptions</a>, while. individual options can be overridden. By default, the <code>onclick</code>,. <code>text</code> and <code>y</code> options are individual.</p>
    */
  def apply(zoomIn: js.UndefOr[CleanJsObject[MapNavigationButtonsZoomIn]] = js.undefined, zoomOut: js.UndefOr[CleanJsObject[MapNavigationButtonsZoomOut]] = js.undefined): MapNavigationButtons = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new MapNavigationButtons {
      this.zoomIn = zoomIn
      this.zoomOut = zoomOut
    })
  }
}
