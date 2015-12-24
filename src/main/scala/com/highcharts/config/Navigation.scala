/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.1 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class Navigation extends js.Object {
  
  /**
   * A collection of options for buttons appearing in the exporting module.
   */
  var buttonOptions: UndefOr[NavigationButtonOptions] = js.undefined
  
  /**
   * CSS styles for the hover state of the individual items within the popup menu appearing by  default when the export icon is clicked. The menu items are rendered in HTML. Defaults to 
   * <pre>menuItemHoverStyle: {
   * 	background: '#4572A5',
   * 	color: '#FFFFFF'
   * }</pre>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/menuitemhoverstyle/" target="_blank">Bold text on hover</a>
   * @since 2.0
   */
  var menuItemHoverStyle: UndefOr[js.Object] = js.undefined
  
  /**
   * CSS styles for the individual items within the popup menu appearing by  default when the export icon is clicked. The menu items are rendered in HTML. Defaults to 
   * <pre>menuItemStyle: {
   * 	padding: '0 5px',
   * 	background: NONE,
   * 	color: '#303030'
   * }</pre>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/menuitemstyle/" target="_blank">Add a grey stripe to the left</a>
   * @since 2.0
   */
  var menuItemStyle: UndefOr[js.Object] = js.undefined
  
  /**
   * CSS styles for the popup menu appearing by default when the export icon is clicked. This menu is rendered in HTML. Defaults to 
   * <pre>menuStyle: {
   * 	border: '1px solid #A0A0A0',
   * 	background: '#FFFFFF'
   * }</pre>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/navigation/menustyle/" target="_blank">Light gray menu background</a>
   * @since 2.0
   */
  var menuStyle: UndefOr[js.Object] = js.undefined
}
