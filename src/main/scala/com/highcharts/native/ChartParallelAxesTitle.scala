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
  * @note JavaScript name: <code>chart-parallelAxes-title</code>
  */
class ChartParallelAxesTitle extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Alignment of the text, can be <code>&quot;left&quot;</code>, <code>&quot;right&quot;</code> or <code>&quot;center&quot;</code>.
    * Default alignment depends on the
    * <a href="xAxis.title.align">title.align</a>:</p>
    * <p>Horizontal axes:</p>
    * <ul>
    * <li>for <code>align</code> = <code>&quot;low&quot;</code>, <code>textAlign</code> is set to <code>left</code></li>
    * <li>for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code></li>
    * <li>for <code>align</code> = <code>&quot;high&quot;</code>, <code>textAlign</code> is set to <code>right</code></li>
    * </ul>
    * <p>Vertical axes:</p>
    * <ul>
    * <li>for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>true</code>, <code>textAlign</code> is
    * set to <code>right</code></li>
    * <li>for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>false</code>, <code>textAlign</code> is
    * set to <code>left</code></li>
    * <li>for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code></li>
    * <li>for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>true</code> <code>textAlign</code> is
    * set to <code>left</code></li>
    * <li>for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>false</code> <code>textAlign</code> is
    * set to <code>right</code></li>
    * </ul>
    * @since 6.0.0
    */
  var textAlign: js.UndefOr[String] = js.undefined
}

object ChartParallelAxesTitle {
  /**
    * @param textAlign <p>Alignment of the text, can be <code>&quot;left&quot;</code>, <code>&quot;right&quot;</code> or <code>&quot;center&quot;</code>.. Default alignment depends on the. <a href="xAxis.title.align">title.align</a>:</p>. <p>Horizontal axes:</p>. <ul>. <li>for <code>align</code> = <code>&quot;low&quot;</code>, <code>textAlign</code> is set to <code>left</code></li>. <li>for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code></li>. <li>for <code>align</code> = <code>&quot;high&quot;</code>, <code>textAlign</code> is set to <code>right</code></li>. </ul>. <p>Vertical axes:</p>. <ul>. <li>for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>true</code>, <code>textAlign</code> is. set to <code>right</code></li>. <li>for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>false</code>, <code>textAlign</code> is. set to <code>left</code></li>. <li>for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code></li>. <li>for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>true</code> <code>textAlign</code> is. set to <code>left</code></li>. <li>for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>false</code> <code>textAlign</code> is. set to <code>right</code></li>. </ul>
    */
  def apply(textAlign: js.UndefOr[String] = js.undefined): ChartParallelAxesTitle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartParallelAxesTitle {
      this.textAlign = textAlign
    })
  }
}
