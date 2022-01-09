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
  * @note JavaScript name: <code>mapNavigation</code>
  */
class MapNavigation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>General options for the map navigation buttons. Individual options
    * can be given from the <a href="#mapNavigation.buttons">mapNavigation.buttons</a>
    * option set.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/mapnavigation/button-theme/">Theming the navigation buttons</a>
    */
  var buttonOptions: js.Any = js.undefined

  /**
    * <p>The individual buttons for the map navigation. This usually includes
    * the zoom in and zoom out buttons. Properties for each button is
    * inherited from
    * <a href="#mapNavigation.buttonOptions">mapNavigation.buttonOptions</a>, while
    * individual options can be overridden. But default, the <code>onclick</code>, <code>text</code>
    * and <code>y</code> options are individual.</p>
    */
  var buttons: js.Any = js.undefined

  /**
    * <p>Whether to enable navigation buttons. By default it inherits the
    * <a href="#mapNavigation.enabled">enabled</a> setting.</p>
    */
  var enableButtons: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enables zooming in on an area on double clicking in the map. By default
    * it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.</p>
    */
  var enableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to zoom in on an area when that area is double clicked.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/mapnavigation/doubleclickzoomto/">Enable double click zoom to</a>
    */
  var enableDoubleClickZoomTo: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Enables zooming by mouse wheel. By default it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.</p>
    */
  var enableMouseWheelZoom: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to enable multitouch zooming. Note that if the chart covers the
    * viewport, this prevents the user from using multitouch and touchdrag on
    * the web page, so you should make sure the user is not trapped inside the
    * chart. By default it inherits the <a href="#mapNavigation.enabled">enabled</a>
    * setting.</p>
    */
  var enableTouchZoom: js.UndefOr[Boolean] = js.undefined

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
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Sensitivity of mouse wheel or trackpad scrolling. 1 is no sensitivity,
    * while with 2, one mousewheel delta will zoom in 50%.</p>
    * @since 4.2.4
    */
  var mouseWheelSensitivity: js.UndefOr[Double] = js.undefined
}

object MapNavigation {
  /**
    * @param buttonOptions <p>General options for the map navigation buttons. Individual options. can be given from the <a href="#mapNavigation.buttons">mapNavigation.buttons</a>. option set.</p>
    * @param buttons <p>The individual buttons for the map navigation. This usually includes. the zoom in and zoom out buttons. Properties for each button is. inherited from. <a href="#mapNavigation.buttonOptions">mapNavigation.buttonOptions</a>, while. individual options can be overridden. But default, the <code>onclick</code>, <code>text</code>. and <code>y</code> options are individual.</p>
    * @param enableButtons <p>Whether to enable navigation buttons. By default it inherits the. <a href="#mapNavigation.enabled">enabled</a> setting.</p>
    * @param enableDoubleClickZoom <p>Enables zooming in on an area on double clicking in the map. By default. it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.</p>
    * @param enableDoubleClickZoomTo <p>Whether to zoom in on an area when that area is double clicked.</p>
    * @param enableMouseWheelZoom <p>Enables zooming by mouse wheel. By default it inherits the <a href="#mapNavigation.enabled">enabled</a> setting.</p>
    * @param enableTouchZoom <p>Whether to enable multitouch zooming. Note that if the chart covers the. viewport, this prevents the user from using multitouch and touchdrag on. the web page, so you should make sure the user is not trapped inside the. chart. By default it inherits the <a href="#mapNavigation.enabled">enabled</a>. setting.</p>
    * @param enabled <p>Whether to enable map navigation. The default is not to enable. navigation, as many choropleth maps are simple and don&#39;t need it.. Additionally, when touch zoom and mousewheel zoom is enabled, it breaks. the default behaviour of these interactions in the website, and the. implementer should be aware of this.</p>. <p>Individual interactions can be enabled separately, namely buttons,. multitouch zoom, double click zoom, double click zoom to element and. mousewheel zoom.</p>
    * @param mouseWheelSensitivity <p>Sensitivity of mouse wheel or trackpad scrolling. 1 is no sensitivity,. while with 2, one mousewheel delta will zoom in 50%.</p>
    */
  def apply(buttonOptions: js.UndefOr[js.Any] = js.undefined, buttons: js.UndefOr[js.Any] = js.undefined, enableButtons: js.UndefOr[Boolean] = js.undefined, enableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined, enableDoubleClickZoomTo: js.UndefOr[Boolean] = js.undefined, enableMouseWheelZoom: js.UndefOr[Boolean] = js.undefined, enableTouchZoom: js.UndefOr[Boolean] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, mouseWheelSensitivity: js.UndefOr[Double] = js.undefined): MapNavigation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new MapNavigation {
      this.buttonOptions = buttonOptions
      this.buttons = buttons
      this.enableButtons = enableButtons
      this.enableDoubleClickZoom = enableDoubleClickZoom
      this.enableDoubleClickZoomTo = enableDoubleClickZoomTo
      this.enableMouseWheelZoom = enableMouseWheelZoom
      this.enableTouchZoom = enableTouchZoom
      this.enabled = enabled
      this.mouseWheelSensitivity = mouseWheelSensitivity
    })
  }
}
