/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.5 by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js

/**
  * @note JavaScript name: <code>drilldown-drillUpButton</code>
  */
@js.annotation.ScalaJSDefined
class DrilldownDrillUpButton extends js.Object {

  /**
    * Positioning options for the button within the <code>relativeTo</code> box. Available properties are <code>x</code>, <code>y</code>, <code>align</code> and <code>verticalAlign</code>.
    * @since 3.0.8
    */
  val position: js.Object = js.undefined.asInstanceOf[js.Object]

  /**
    * What box to align the button to. Can be either "plotBox" or "spacingBox".
    * @since 3.0.8
    */
  val relativeTo: String = "plotBox"

  /**
    * A collection of attributes for the button. The object takes SVG attributes like  <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the border radius. The theme also supports <code>style</code>, a collection of CSS properties for the text. Equivalent attributes for the hover state are given in <code>theme.states.hover</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/drilldown/drillupbutton/" target="_blank">Button theming</a>
    * @since 3.0.8
    */
  val theme: js.Object = js.undefined.asInstanceOf[js.Object]
}
