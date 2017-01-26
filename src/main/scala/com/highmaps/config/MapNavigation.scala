/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>mapNavigation</code>
  */
@js.annotation.ScalaJSDefined
class MapNavigation extends js.Object {

  /**
    * General options for the map navigation buttons. Individual options can be given from the <a href="#mapNavigation.buttons">mapNavigation.buttons</a> option set.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/mapnavigation/button-theme/" target="_blank">Theming the navigation buttons</a>
    */
  val buttonOptions: js.UndefOr[CleanJsObject[MapNavigationButtonOptions]] = js.undefined

  /**
    * The individual buttons for the map navigation. This usually includes the zoom in and zoom out buttons. Properties for each button is inherited from <a href="#mapNavigation.buttonOptions">mapNavigation.buttonOptions</a>, while individual options can be overridden. But default, the <code>onclick</code>, <code>text</code> and <code>y</code> options are individual.
    */
  val buttons: js.UndefOr[CleanJsObject[MapNavigationButtons]] = js.undefined

  /**
    * Whether to enable navigation buttons. By default it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.
    */
  val enableButtons: js.UndefOr[Boolean] = js.undefined

  /**
    * Enables zooming in on an area on double clicking in the map. By default it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.
    */
  val enableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to zoom in on an area when that area is double clicked.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/mapnavigation/doubleclickzoomto/" target="_blank">Enable double click zoom to</a>
    */
  val enableDoubleClickZoomTo: js.UndefOr[Boolean] = js.undefined

  /**
    * Enables zooming by mouse wheel. By default it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.
    */
  val enableMouseWheelZoom: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to enable multitouch zooming. Note that if the chart covers the viewport, this prevents the user from using multitouch and touchdrag on the web page, so you should make sure the user is not trapped inside the chart. By default it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.
    */
  val enableTouchZoom: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to enable map navigation. The default is not to enable navigation, as many choropleth maps are simple and don't need it. Additionally, when touch zoom and mousewheel zoom is enabled, it breaks the default behaviour of these interactions in the website, and the implementer should be aware of this.</p>
    * <p>Individual interactions can be enabled separately, namely buttons, multitouch zoom, double click zoom, double click zoom to element and mousewheel zoom.</p>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Sensitivity of mouse wheel or trackpad scrolling. 1 is no sensitivity, while with 2, one mousewheel delta will zoom in 50%.
    * @since 4.2.4
    */
  val mouseWheelSensitivity: js.UndefOr[Double] = js.undefined
}

object MapNavigation {
  /**
    * @param buttonOptions General options for the map navigation buttons. Individual options can be given from the <a href="#mapNavigation.buttons">mapNavigation.buttons</a> option set.
    * @param buttons The individual buttons for the map navigation. This usually includes the zoom in and zoom out buttons. Properties for each button is inherited from <a href="#mapNavigation.buttonOptions">mapNavigation.buttonOptions</a>, while individual options can be overridden. But default, the <code>onclick</code>, <code>text</code> and <code>y</code> options are individual.
    * @param enableButtons Whether to enable navigation buttons. By default it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.
    * @param enableDoubleClickZoom Enables zooming in on an area on double clicking in the map. By default it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.
    * @param enableDoubleClickZoomTo Whether to zoom in on an area when that area is double clicked.
    * @param enableMouseWheelZoom Enables zooming by mouse wheel. By default it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.
    * @param enableTouchZoom Whether to enable multitouch zooming. Note that if the chart covers the viewport, this prevents the user from using multitouch and touchdrag on the web page, so you should make sure the user is not trapped inside the chart. By default it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.
    * @param enabled <p>Whether to enable map navigation. The default is not to enable navigation, as many choropleth maps are simple and don't need it. Additionally, when touch zoom and mousewheel zoom is enabled, it breaks the default behaviour of these interactions in the website, and the implementer should be aware of this.</p>. <p>Individual interactions can be enabled separately, namely buttons, multitouch zoom, double click zoom, double click zoom to element and mousewheel zoom.</p>
    * @param mouseWheelSensitivity Sensitivity of mouse wheel or trackpad scrolling. 1 is no sensitivity, while with 2, one mousewheel delta will zoom in 50%.
    */
  def apply(buttonOptions: js.UndefOr[CleanJsObject[MapNavigationButtonOptions]] = js.undefined, buttons: js.UndefOr[CleanJsObject[MapNavigationButtons]] = js.undefined, enableButtons: js.UndefOr[Boolean] = js.undefined, enableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined, enableDoubleClickZoomTo: js.UndefOr[Boolean] = js.undefined, enableMouseWheelZoom: js.UndefOr[Boolean] = js.undefined, enableTouchZoom: js.UndefOr[Boolean] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, mouseWheelSensitivity: js.UndefOr[Double] = js.undefined): MapNavigation = {
    val buttonOptionsOuter: js.UndefOr[CleanJsObject[MapNavigationButtonOptions]] = buttonOptions
    val buttonsOuter: js.UndefOr[CleanJsObject[MapNavigationButtons]] = buttons
    val enableButtonsOuter: js.UndefOr[Boolean] = enableButtons
    val enableDoubleClickZoomOuter: js.UndefOr[Boolean] = enableDoubleClickZoom
    val enableDoubleClickZoomToOuter: js.UndefOr[Boolean] = enableDoubleClickZoomTo
    val enableMouseWheelZoomOuter: js.UndefOr[Boolean] = enableMouseWheelZoom
    val enableTouchZoomOuter: js.UndefOr[Boolean] = enableTouchZoom
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val mouseWheelSensitivityOuter: js.UndefOr[Double] = mouseWheelSensitivity
    new MapNavigation {
      override val buttonOptions: js.UndefOr[CleanJsObject[MapNavigationButtonOptions]] = buttonOptionsOuter
      override val buttons: js.UndefOr[CleanJsObject[MapNavigationButtons]] = buttonsOuter
      override val enableButtons: js.UndefOr[Boolean] = enableButtonsOuter
      override val enableDoubleClickZoom: js.UndefOr[Boolean] = enableDoubleClickZoomOuter
      override val enableDoubleClickZoomTo: js.UndefOr[Boolean] = enableDoubleClickZoomToOuter
      override val enableMouseWheelZoom: js.UndefOr[Boolean] = enableMouseWheelZoomOuter
      override val enableTouchZoom: js.UndefOr[Boolean] = enableTouchZoomOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val mouseWheelSensitivity: js.UndefOr[Double] = mouseWheelSensitivityOuter
    }
  }
}
