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
  * @note JavaScript name: <code>global</code>
  */
@js.annotation.ScalaJSDefined
class Global extends js.Object {

  /**
    * Path to the pattern image required by VML browsers in order to draw radial gradients.
    */
  val VMLRadialGradientURL: js.UndefOr[String] = js.undefined

  /**
    * The URL to the additional file to lazy load for Android 2.x devices. These devices don't 
    *  support SVG, so we download a helper file that contains <a href="http://code.google.com/p/canvg/">canvg</a>,
    *  its dependency rbcolor, and our own CanVG Renderer class. To avoid hotlinking to our site,
    *  you can install canvas-tools.js on your own server and change this option accordingly.
    */
  val canvasToolsURL: js.UndefOr[String] = js.undefined

  /**
    * Whether to use UTC time for axis scaling, tickmark placement and time display in 
    *  <code>Highcharts.dateFormat</code>. Advantages of using UTC is that the time
    *  displays equally regardless of the user agent's time zone settings. Local time
    *  can be used when the data is loaded in real time or when correct Daylight Saving Time
    *  transitions are required.
    */
  val useUTC: js.UndefOr[Boolean] = js.undefined
}
