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
  * @note JavaScript name: <code>boost-debug</code>
  */
@js.annotation.ScalaJSDefined
class BoostDebug extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Time the series rendering.</p>
    * <p>This outputs the time spent on actual rendering in the console when
    * set to true.</p>
    */
  val timeRendering: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Time the series processing.</p>
    * <p>This outputs the time spent on transforming the series data to
    * vertex buffers when set to true.</p>
    */
  val timeSeriesProcessing: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Time the the WebGL setup.</p>
    * <p>This outputs the time spent on setting up the WebGL context,
    * creating shaders, and textures.</p>
    */
  val timeSetup: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Time the building of the k-d tree.</p>
    * <p>This outputs the time spent building the k-d tree used for
    * markers etc.</p>
    * <p>Note that the k-d tree is built async, and runs post-rendering.
    * Following, it does not affect the performance of the rendering itself.</p>
    */
  val timeKDTree: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Show the number of points skipped through culling.</p>
    * <p>When set to true, the number of points skipped in series processing
    * is outputted. Points are skipped if they are closer than 1 pixel from
    * each other.</p>
    */
  val showSkipSummary: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Time the WebGL to SVG buffer copy</p>
    * <p>After rendering, the result is copied to an image which is injected
    * into the SVG.</p>
    * <p>If this property is set to true, the time it takes for the buffer copy
    * to complete is outputted.</p>
    */
  val timeBufferCopy: js.UndefOr[Boolean] = js.undefined
}

object BoostDebug {
  /**
    * @param timeRendering <p>Time the series rendering.</p>. <p>This outputs the time spent on actual rendering in the console when. set to true.</p>
    * @param timeSeriesProcessing <p>Time the series processing.</p>. <p>This outputs the time spent on transforming the series data to. vertex buffers when set to true.</p>
    * @param timeSetup <p>Time the the WebGL setup.</p>. <p>This outputs the time spent on setting up the WebGL context,. creating shaders, and textures.</p>
    * @param timeKDTree <p>Time the building of the k-d tree.</p>. <p>This outputs the time spent building the k-d tree used for. markers etc.</p>. <p>Note that the k-d tree is built async, and runs post-rendering.. Following, it does not affect the performance of the rendering itself.</p>
    * @param showSkipSummary <p>Show the number of points skipped through culling.</p>. <p>When set to true, the number of points skipped in series processing. is outputted. Points are skipped if they are closer than 1 pixel from. each other.</p>
    * @param timeBufferCopy <p>Time the WebGL to SVG buffer copy</p>. <p>After rendering, the result is copied to an image which is injected. into the SVG.</p>. <p>If this property is set to true, the time it takes for the buffer copy. to complete is outputted.</p>
    */
  def apply(timeRendering: js.UndefOr[Boolean] = js.undefined, timeSeriesProcessing: js.UndefOr[Boolean] = js.undefined, timeSetup: js.UndefOr[Boolean] = js.undefined, timeKDTree: js.UndefOr[Boolean] = js.undefined, showSkipSummary: js.UndefOr[Boolean] = js.undefined, timeBufferCopy: js.UndefOr[Boolean] = js.undefined): BoostDebug = {
    val timeRenderingOuter: js.UndefOr[Boolean] = timeRendering
    val timeSeriesProcessingOuter: js.UndefOr[Boolean] = timeSeriesProcessing
    val timeSetupOuter: js.UndefOr[Boolean] = timeSetup
    val timeKDTreeOuter: js.UndefOr[Boolean] = timeKDTree
    val showSkipSummaryOuter: js.UndefOr[Boolean] = showSkipSummary
    val timeBufferCopyOuter: js.UndefOr[Boolean] = timeBufferCopy
    com.highcharts.HighchartsGenericObject.toCleanObject(new BoostDebug {
      override val timeRendering: js.UndefOr[Boolean] = timeRenderingOuter
      override val timeSeriesProcessing: js.UndefOr[Boolean] = timeSeriesProcessingOuter
      override val timeSetup: js.UndefOr[Boolean] = timeSetupOuter
      override val timeKDTree: js.UndefOr[Boolean] = timeKDTreeOuter
      override val showSkipSummary: js.UndefOr[Boolean] = showSkipSummaryOuter
      override val timeBufferCopy: js.UndefOr[Boolean] = timeBufferCopyOuter
    })
  }
}
