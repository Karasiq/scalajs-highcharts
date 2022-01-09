/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>boost-debug</code>
  */
class BoostDebug extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Show the number of points skipped through culling.</p>
    * <p>When set to true, the number of points skipped in series processing
    * is outputted. Points are skipped if they are closer than 1 pixel from
    * each other.</p>
    */
  var showSkipSummary: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Time the WebGL to SVG buffer copy</p>
    * <p>After rendering, the result is copied to an image which is injected
    * into the SVG.</p>
    * <p>If this property is set to true, the time it takes for the buffer copy
    * to complete is outputted.</p>
    */
  var timeBufferCopy: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Time the building of the k-d tree.</p>
    * <p>This outputs the time spent building the k-d tree used for
    * markers etc.</p>
    * <p>Note that the k-d tree is built async, and runs post-rendering.
    * Following, it does not affect the performance of the rendering itself.</p>
    */
  var timeKDTree: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Time the series rendering.</p>
    * <p>This outputs the time spent on actual rendering in the console when
    * set to true.</p>
    */
  var timeRendering: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Time the series processing.</p>
    * <p>This outputs the time spent on transforming the series data to
    * vertex buffers when set to true.</p>
    */
  var timeSeriesProcessing: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Time the the WebGL setup.</p>
    * <p>This outputs the time spent on setting up the WebGL context,
    * creating shaders, and textures.</p>
    */
  var timeSetup: js.UndefOr[Boolean] = js.undefined
}

object BoostDebug {
  /**
    * @param showSkipSummary <p>Show the number of points skipped through culling.</p>. <p>When set to true, the number of points skipped in series processing. is outputted. Points are skipped if they are closer than 1 pixel from. each other.</p>
    * @param timeBufferCopy <p>Time the WebGL to SVG buffer copy</p>. <p>After rendering, the result is copied to an image which is injected. into the SVG.</p>. <p>If this property is set to true, the time it takes for the buffer copy. to complete is outputted.</p>
    * @param timeKDTree <p>Time the building of the k-d tree.</p>. <p>This outputs the time spent building the k-d tree used for. markers etc.</p>. <p>Note that the k-d tree is built async, and runs post-rendering.. Following, it does not affect the performance of the rendering itself.</p>
    * @param timeRendering <p>Time the series rendering.</p>. <p>This outputs the time spent on actual rendering in the console when. set to true.</p>
    * @param timeSeriesProcessing <p>Time the series processing.</p>. <p>This outputs the time spent on transforming the series data to. vertex buffers when set to true.</p>
    * @param timeSetup <p>Time the the WebGL setup.</p>. <p>This outputs the time spent on setting up the WebGL context,. creating shaders, and textures.</p>
    */
  def apply(showSkipSummary: js.UndefOr[Boolean] = js.undefined, timeBufferCopy: js.UndefOr[Boolean] = js.undefined, timeKDTree: js.UndefOr[Boolean] = js.undefined, timeRendering: js.UndefOr[Boolean] = js.undefined, timeSeriesProcessing: js.UndefOr[Boolean] = js.undefined, timeSetup: js.UndefOr[Boolean] = js.undefined): BoostDebug = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new BoostDebug {
      this.showSkipSummary = showSkipSummary
      this.timeBufferCopy = timeBufferCopy
      this.timeKDTree = timeKDTree
      this.timeRendering = timeRendering
      this.timeSeriesProcessing = timeSeriesProcessing
      this.timeSetup = timeSetup
    })
  }
}
