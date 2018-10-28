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
  * @note JavaScript name: <code>mapNavigation</code>
  */
@js.annotation.ScalaJSDefined
class MapNavigation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>General options for the map navigation buttons. Individual options
    * can be given from the <a href="#mapNavigation.buttons">mapNavigation.buttons</a>
    * option set.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/mapnavigation/button-theme/">Theming the navigation buttons</a>
    */
  val buttonOptions: js.Any = js.undefined

  val buttons: js.Any = js.undefined

  /**
    * <p>Sensitivity of mouse wheel or trackpad scrolling. 1 is no sensitivity,
    * while with 2, one mousewheel delta will zoom in 50%.</p>
    * @since 4.2.4
    */
  val mouseWheelSensitivity: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to enable navigation buttons. By default it inherits the
    * <a href="#mapNavigation.enabled">enabled</a> setting.</p>
    */
  val enableButtons: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to enable map navigation. The default is not to enable
    * navigation, as many choropleth maps are simple and don&#39;t need it.
    * Additionally, when touch zoom and mousewheel zoom is enabled, it breaks
    * the default behaviour of these interactions in the website, and the
    * implementer should be aware of this.</p>
    * <p>Individual interactions can be enabled separately, namely buttons,
    * multitouch zoom, double click zoom, double click zoom to element and
    * mousewheel zoom.</p>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enables zooming in on an area on double clicking in the map. By default
    * it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.</p>
    */
  val enableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to zoom in on an area when that area is double clicked.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/mapnavigation/doubleclickzoomto/">Enable double click zoom to</a>
    */
  val enableDoubleClickZoomTo: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enables zooming by mouse wheel. By default it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.</p>
    */
  val enableMouseWheelZoom: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to enable multitouch zooming. Note that if the chart covers the
    * viewport, this prevents the user from using multitouch and touchdrag on
    * the web page, so you should make sure the user is not trapped inside the
    * chart. By default it inherits the <a href="#mapNavigation.enabled">enabled</a>
    * setting.</p>
    */
  val enableTouchZoom: js.UndefOr[Boolean] = js.undefined
}

object MapNavigation {
  /**
    * @param buttonOptions <p>General options for the map navigation buttons. Individual options. can be given from the <a href="#mapNavigation.buttons">mapNavigation.buttons</a>. option set.</p>
    * @param mouseWheelSensitivity <p>Sensitivity of mouse wheel or trackpad scrolling. 1 is no sensitivity,. while with 2, one mousewheel delta will zoom in 50%.</p>
    * @param enableButtons <p>Whether to enable navigation buttons. By default it inherits the. <a href="#mapNavigation.enabled">enabled</a> setting.</p>
    * @param enabled <p>Whether to enable map navigation. The default is not to enable. navigation, as many choropleth maps are simple and don&#39;t need it.. Additionally, when touch zoom and mousewheel zoom is enabled, it breaks. the default behaviour of these interactions in the website, and the. implementer should be aware of this.</p>. <p>Individual interactions can be enabled separately, namely buttons,. multitouch zoom, double click zoom, double click zoom to element and. mousewheel zoom.</p>
    * @param enableDoubleClickZoom <p>Enables zooming in on an area on double clicking in the map. By default. it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.</p>
    * @param enableDoubleClickZoomTo <p>Whether to zoom in on an area when that area is double clicked.</p>
    * @param enableMouseWheelZoom <p>Enables zooming by mouse wheel. By default it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.</p>
    * @param enableTouchZoom <p>Whether to enable multitouch zooming. Note that if the chart covers the. viewport, this prevents the user from using multitouch and touchdrag on. the web page, so you should make sure the user is not trapped inside the. chart. By default it inherits the <a href="#mapNavigation.enabled">enabled</a>. setting.</p>
    */
  def apply(buttonOptions: js.UndefOr[js.Any] = js.undefined, buttons: js.UndefOr[js.Any] = js.undefined, mouseWheelSensitivity: js.UndefOr[Double] = js.undefined, enableButtons: js.UndefOr[Boolean] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, enableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined, enableDoubleClickZoomTo: js.UndefOr[Boolean] = js.undefined, enableMouseWheelZoom: js.UndefOr[Boolean] = js.undefined, enableTouchZoom: js.UndefOr[Boolean] = js.undefined): MapNavigation = {
    val buttonOptionsOuter: js.Any = buttonOptions
    val buttonsOuter: js.Any = buttons
    val mouseWheelSensitivityOuter: js.UndefOr[Double] = mouseWheelSensitivity
    val enableButtonsOuter: js.UndefOr[Boolean] = enableButtons
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val enableDoubleClickZoomOuter: js.UndefOr[Boolean] = enableDoubleClickZoom
    val enableDoubleClickZoomToOuter: js.UndefOr[Boolean] = enableDoubleClickZoomTo
    val enableMouseWheelZoomOuter: js.UndefOr[Boolean] = enableMouseWheelZoom
    val enableTouchZoomOuter: js.UndefOr[Boolean] = enableTouchZoom
    com.highcharts.HighchartsGenericObject.toCleanObject(new MapNavigation {
      override val buttonOptions: js.Any = buttonOptionsOuter
      override val buttons: js.Any = buttonsOuter
      override val mouseWheelSensitivity: js.UndefOr[Double] = mouseWheelSensitivityOuter
      override val enableButtons: js.UndefOr[Boolean] = enableButtonsOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val enableDoubleClickZoom: js.UndefOr[Boolean] = enableDoubleClickZoomOuter
      override val enableDoubleClickZoomTo: js.UndefOr[Boolean] = enableDoubleClickZoomToOuter
      override val enableMouseWheelZoom: js.UndefOr[Boolean] = enableMouseWheelZoomOuter
      override val enableTouchZoom: js.UndefOr[Boolean] = enableTouchZoomOuter
    })
  }
}
