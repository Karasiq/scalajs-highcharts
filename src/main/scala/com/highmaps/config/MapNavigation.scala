/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/mapnavigation/button-theme/" target="_blank">Theming the navigation buttons</a>
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/mapnavigation/doubleclickzoomto/" target="_blank">Enable double click zoom to</a>
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
}
