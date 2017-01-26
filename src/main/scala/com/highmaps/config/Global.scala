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
  * @note JavaScript name: <code>global</code>
  */
@js.annotation.ScalaJSDefined
class Global extends js.Object {

  /**
    * Path to the pattern image required by VML browsers in order to draw radial gradients.
    */
  val VMLRadialGradientURL: js.UndefOr[String] = js.undefined

  /**
    * <p><em>Canvg rendering for Android 2.x is removed as of Highcharts 5.0. Use the <a href="#exporting.libURL">libURL</a> option to configure exporting.</em></p>
    * 
    * <p>The URL to the additional file to lazy load for Android 2.x devices. These devices don't 
    *  support SVG, so we download a helper file that contains <a href="http://code.google.com/p/canvg/">canvg</a>,
    *  its dependency rbcolor, and our own CanVG Renderer class. To avoid hotlinking to our site,
    *  you can install canvas-tools.js on your own server and change this option accordingly.</p>
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

object Global {
  /**
    * @param VMLRadialGradientURL Path to the pattern image required by VML browsers in order to draw radial gradients.
    * @param canvasToolsURL <p><em>Canvg rendering for Android 2.x is removed as of Highcharts 5.0. Use the <a href="#exporting.libURL">libURL</a> option to configure exporting.</em></p>. . <p>The URL to the additional file to lazy load for Android 2.x devices. These devices don't .  support SVG, so we download a helper file that contains <a href="http://code.google.com/p/canvg/">canvg</a>,.  its dependency rbcolor, and our own CanVG Renderer class. To avoid hotlinking to our site,.  you can install canvas-tools.js on your own server and change this option accordingly.</p>
    * @param useUTC Whether to use UTC time for axis scaling, tickmark placement and time display in .  <code>Highcharts.dateFormat</code>. Advantages of using UTC is that the time.  displays equally regardless of the user agent's time zone settings. Local time.  can be used when the data is loaded in real time or when correct Daylight Saving Time.  transitions are required.
    */
  def apply(VMLRadialGradientURL: js.UndefOr[String] = js.undefined, canvasToolsURL: js.UndefOr[String] = js.undefined, useUTC: js.UndefOr[Boolean] = js.undefined): Global = {
    val VMLRadialGradientURLOuter: js.UndefOr[String] = VMLRadialGradientURL
    val canvasToolsURLOuter: js.UndefOr[String] = canvasToolsURL
    val useUTCOuter: js.UndefOr[Boolean] = useUTC
    new Global {
      override val VMLRadialGradientURL: js.UndefOr[String] = VMLRadialGradientURLOuter
      override val canvasToolsURL: js.UndefOr[String] = canvasToolsURLOuter
      override val useUTC: js.UndefOr[Boolean] = useUTCOuter
    }
  }
}
