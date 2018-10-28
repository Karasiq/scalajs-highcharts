/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>global</code>
  */
@js.annotation.ScalaJSDefined
class Global extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Path to the pattern image required by VML browsers in order to
    * draw radial gradients.</p>
    */
  val VMLRadialGradientURL: js.UndefOr[String] = js.undefined

  /**
    * <p><em>Canvg rendering for Android 2.x is removed as of Highcharts 5.0.
    * Use the <a href="#exporting.libURL">libURL</a> option to configure exporting.</em></p>
    * <p>The URL to the additional file to lazy load for Android 2.x devices.
    * These devices don&#39;t support SVG, so we download a helper file that
    * contains <a href="http://code.google.com/p/canvg/">canvg</a>, its dependency
    * rbcolor, and our own CanVG Renderer class. To avoid hotlinking to
    * our site, you can install canvas-tools.js on your own server and
    * change this option accordingly.</p>
    */
  val canvasToolsURL: js.UndefOr[String] = js.undefined

  /**
    * <p>This option is deprecated since v6.0.5. Instead, use
    * <a href="#time.useUTC">time.useUTC</a> that supports individual time settings
    * per chart.</p>
    */
  val useUTC: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>This option is deprecated since v6.0.5. Instead, use
    * <a href="#time.Date">time.Date</a> that supports individual time settings
    * per chart.</p>
    */
  val Date: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>This option is deprecated since v6.0.5. Instead, use
    * <a href="#time.getTimezoneOffset">time.getTimezoneOffset</a> that supports
    * individual time settings per chart.</p>
    */
  val getTimezoneOffset: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>This option is deprecated since v6.0.5. Instead, use
    * <a href="#time.timezone">time.timezone</a> that supports individual time
    * settings per chart.</p>
    */
  val timezone: js.UndefOr[String] = js.undefined

  /**
    * <p>This option is deprecated since v6.0.5. Instead, use
    * <a href="#time.timezoneOffset">time.timezoneOffset</a> that supports individual
    * time settings per chart.</p>
    */
  val timezoneOffset: js.UndefOr[Double] = js.undefined
}

object Global {
  /**
    * @param VMLRadialGradientURL <p>Path to the pattern image required by VML browsers in order to. draw radial gradients.</p>
    * @param canvasToolsURL <p><em>Canvg rendering for Android 2.x is removed as of Highcharts 5.0.. Use the <a href="#exporting.libURL">libURL</a> option to configure exporting.</em></p>. <p>The URL to the additional file to lazy load for Android 2.x devices.. These devices don&#39;t support SVG, so we download a helper file that. contains <a href="http://code.google.com/p/canvg/">canvg</a>, its dependency. rbcolor, and our own CanVG Renderer class. To avoid hotlinking to. our site, you can install canvas-tools.js on your own server and. change this option accordingly.</p>
    * @param useUTC <p>This option is deprecated since v6.0.5. Instead, use. <a href="#time.useUTC">time.useUTC</a> that supports individual time settings. per chart.</p>
    * @param Date <p>This option is deprecated since v6.0.5. Instead, use. <a href="#time.Date">time.Date</a> that supports individual time settings. per chart.</p>
    * @param getTimezoneOffset <p>This option is deprecated since v6.0.5. Instead, use. <a href="#time.getTimezoneOffset">time.getTimezoneOffset</a> that supports. individual time settings per chart.</p>
    * @param timezone <p>This option is deprecated since v6.0.5. Instead, use. <a href="#time.timezone">time.timezone</a> that supports individual time. settings per chart.</p>
    * @param timezoneOffset <p>This option is deprecated since v6.0.5. Instead, use. <a href="#time.timezoneOffset">time.timezoneOffset</a> that supports individual. time settings per chart.</p>
    */
  def apply(VMLRadialGradientURL: js.UndefOr[String] = js.undefined, canvasToolsURL: js.UndefOr[String] = js.undefined, useUTC: js.UndefOr[Boolean] = js.undefined, Date: js.UndefOr[js.Function] = js.undefined, getTimezoneOffset: js.UndefOr[js.Function] = js.undefined, timezone: js.UndefOr[String] = js.undefined, timezoneOffset: js.UndefOr[Double] = js.undefined): Global = {
    val VMLRadialGradientURLOuter: js.UndefOr[String] = VMLRadialGradientURL
    val canvasToolsURLOuter: js.UndefOr[String] = canvasToolsURL
    val useUTCOuter: js.UndefOr[Boolean] = useUTC
    val DateOuter: js.UndefOr[js.Function] = Date
    val getTimezoneOffsetOuter: js.UndefOr[js.Function] = getTimezoneOffset
    val timezoneOuter: js.UndefOr[String] = timezone
    val timezoneOffsetOuter: js.UndefOr[Double] = timezoneOffset
    com.highcharts.HighchartsGenericObject.toCleanObject(new Global {
      override val VMLRadialGradientURL: js.UndefOr[String] = VMLRadialGradientURLOuter
      override val canvasToolsURL: js.UndefOr[String] = canvasToolsURLOuter
      override val useUTC: js.UndefOr[Boolean] = useUTCOuter
      override val Date: js.UndefOr[js.Function] = DateOuter
      override val getTimezoneOffset: js.UndefOr[js.Function] = getTimezoneOffsetOuter
      override val timezone: js.UndefOr[String] = timezoneOuter
      override val timezoneOffset: js.UndefOr[Double] = timezoneOffsetOuter
    })
  }
}
