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
  * @note JavaScript name: <code>global</code>
  */
class Global extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>This option is deprecated since v6.0.5. Instead, use
    * <a href="#time.Date">time.Date</a> that supports individual time settings
    * per chart.</p>
    */
  var Date: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Path to the pattern image required by VML browsers in order to
    * draw radial gradients.</p>
    * @since 2.3.0
    */
  var VMLRadialGradientURL: js.UndefOr[String] = js.undefined

  /**
    * <p><em>Canvg rendering for Android 2.x is removed as of Highcharts 5.0.
    * Use the <a href="#exporting.libURL">libURL</a> option to configure exporting.</em></p>
    * <p>The URL to the additional file to lazy load for Android 2.x devices.
    * These devices don&#39;t support SVG, so we download a helper file that
    * contains <a href="https://github.com/canvg/canvg">canvg</a>, its dependency
    * rbcolor, and our own CanVG Renderer class. To avoid hotlinking to
    * our site, you can install canvas-tools.js on your own server and
    * change this option accordingly.</p>
    */
  var canvasToolsURL: js.UndefOr[String] = js.undefined

  /**
    * <p>This option is deprecated since v6.0.5. Instead, use
    * <a href="#time.getTimezoneOffset">time.getTimezoneOffset</a> that supports
    * individual time settings per chart.</p>
    */
  var getTimezoneOffset: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>This option is deprecated since v6.0.5. Instead, use
    * <a href="#time.timezone">time.timezone</a> that supports individual time
    * settings per chart.</p>
    */
  var timezone: js.UndefOr[String] = js.undefined

  /**
    * <p>This option is deprecated since v6.0.5. Instead, use
    * <a href="#time.timezoneOffset">time.timezoneOffset</a> that supports individual
    * time settings per chart.</p>
    */
  var timezoneOffset: js.UndefOr[Double] = js.undefined

  /**
    * <p>This option is deprecated since v6.0.5. Instead, use
    * <a href="#time.useUTC">time.useUTC</a> that supports individual time settings
    * per chart.</p>
    */
  var useUTC: js.UndefOr[Boolean] = js.undefined
}

object Global {
  /**
    * @param Date <p>This option is deprecated since v6.0.5. Instead, use. <a href="#time.Date">time.Date</a> that supports individual time settings. per chart.</p>
    * @param VMLRadialGradientURL <p>Path to the pattern image required by VML browsers in order to. draw radial gradients.</p>
    * @param canvasToolsURL <p><em>Canvg rendering for Android 2.x is removed as of Highcharts 5.0.. Use the <a href="#exporting.libURL">libURL</a> option to configure exporting.</em></p>. <p>The URL to the additional file to lazy load for Android 2.x devices.. These devices don&#39;t support SVG, so we download a helper file that. contains <a href="https://github.com/canvg/canvg">canvg</a>, its dependency. rbcolor, and our own CanVG Renderer class. To avoid hotlinking to. our site, you can install canvas-tools.js on your own server and. change this option accordingly.</p>
    * @param getTimezoneOffset <p>This option is deprecated since v6.0.5. Instead, use. <a href="#time.getTimezoneOffset">time.getTimezoneOffset</a> that supports. individual time settings per chart.</p>
    * @param timezone <p>This option is deprecated since v6.0.5. Instead, use. <a href="#time.timezone">time.timezone</a> that supports individual time. settings per chart.</p>
    * @param timezoneOffset <p>This option is deprecated since v6.0.5. Instead, use. <a href="#time.timezoneOffset">time.timezoneOffset</a> that supports individual. time settings per chart.</p>
    * @param useUTC <p>This option is deprecated since v6.0.5. Instead, use. <a href="#time.useUTC">time.useUTC</a> that supports individual time settings. per chart.</p>
    */
  def apply(Date: js.UndefOr[js.Function] = js.undefined, VMLRadialGradientURL: js.UndefOr[String] = js.undefined, canvasToolsURL: js.UndefOr[String] = js.undefined, getTimezoneOffset: js.UndefOr[js.Function] = js.undefined, timezone: js.UndefOr[String] = js.undefined, timezoneOffset: js.UndefOr[Double] = js.undefined, useUTC: js.UndefOr[Boolean] = js.undefined): Global = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Global {
      this.Date = Date
      this.VMLRadialGradientURL = VMLRadialGradientURL
      this.canvasToolsURL = canvasToolsURL
      this.getTimezoneOffset = getTimezoneOffset
      this.timezone = timezone
      this.timezoneOffset = timezoneOffset
      this.useUTC = useUTC
    })
  }
}
